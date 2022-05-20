'use strict'

import { app, protocol, BrowserWindow } from 'electron'
import { createProtocol } from 'vue-cli-plugin-electron-builder/lib'
import installExtension, { VUEJS_DEVTOOLS } from 'electron-devtools-installer'
import { ipcMain } from 'electron'
import { dialog, getCurrentWindow } from 'electron'
import fs from 'fs/promises'
import path from 'path'
import xml2js from 'xml2js'

ipcMain.handle('readXMLFile', async (event, data) => {
  let fileData = await fs.readFile(
    path.join('XML', `${data.resourceName}.hbm.xml`), //
    'utf8'
  )
  let jsonData = xml2js.parseStringPromise(fileData)
  //   , function (err, result) {
  //   if (err) console.log(err)
  //   // here we log the results of our xml string conversion
  //   console.log(result)
  // })
  return jsonData
})

ipcMain.handle('writeXMLFile', async (event, data) => {
  var builder = new xml2js.Builder()
  var xml = builder.buildObject(data.fileData)
  let fileData = await fs.writeFile(
    path.join('XML', `${data.resourceName}.hbm.xml`),
    xml,
    'utf8'
  )
  return fileData
})

ipcMain.handle('readConfigFile', async (event, data) => {
  let fileData = await fs.readFile(
    path.join(`config.json`), //
    'utf8'
  )
  return fileData
})

ipcMain.handle('writeConfigFile', async (event, data) => {
  // console.log(JSON.stringify(data))
  let fileData = await fs.writeFile(
    path.join(`config.json`),
    JSON.stringify(data),
    'utf8'
  )
  return fileData
})

ipcMain.handle('showOpenDialog', async (event, data) => {
  let result = await dialog.showOpenDialog(getCurrentWindow, {
    properties: ['openDirectory', 'createDirectory'],
  })
  return result
})

ipcMain.on('campfhir', async (event, data) => {
  var spawn = require('child_process').spawn
  var jar = spawn('java', ['-jar', path.join(`CAMPFHIR.jar`)])

  jar.stdout.on('data', function (data) {
    event.reply('campfhir-message', data.toString())
  })

  jar.stderr.on('data', function (data) {
    event.reply('campfhir-message', data.toString())
  })

  jar.on('exit', function (code) {
    event.reply(
      'campfhir-message',
      'CAMPFHIR Finished with the exit code: ' + code.toString()
    )
  })
})

const isDevelopment = process.env.NODE_ENV !== 'production'

// Scheme must be registered before the app is ready
protocol.registerSchemesAsPrivileged([
  { scheme: 'app', privileges: { secure: true, standard: true } },
])

async function createWindow() {
  // Create the browser window.
  const win = new BrowserWindow({
    width: 800,
    height: 600,

    webPreferences: {
      // Use pluginOptions.nodeIntegration, leave this alone
      // See nklayman.github.io/vue-cli-plugin-electron-builder/guide/security.html#node-integration for more info
      nodeIntegration: process.env.ELECTRON_NODE_INTEGRATION,
      contextIsolation: !process.env.ELECTRON_NODE_INTEGRATION,
      enableRemoteModule: true,
      preload: path.join(__dirname, 'preload.js'),
    },
  })
  win.maximize()

  if (process.env.WEBPACK_DEV_SERVER_URL) {
    // Load the url of the dev server if in development mode
    await win.loadURL(process.env.WEBPACK_DEV_SERVER_URL)
    if (!process.env.IS_TEST) win.webContents.openDevTools()
  } else {
    createProtocol('app')
    // Load the index.html when not in development
    win.loadURL('app://./index.html')
  }
}

// Quit when all windows are closed.
app.on('window-all-closed', () => {
  // On macOS it is common for applications and their menu bar
  // to stay active until the user quits explicitly with Cmd + Q
  if (process.platform !== 'darwin') {
    app.quit()
  }
})

app.on('activate', () => {
  // On macOS it's common to re-create a window in the app when the
  // dock icon is clicked and there are no other windows open.
  if (BrowserWindow.getAllWindows().length === 0) createWindow()
})

// This method will be called when Electron has finished
// initialization and is ready to create browser windows.
// Some APIs can only be used after this event occurs.
app.on('ready', async () => {
  if (isDevelopment && !process.env.IS_TEST) {
    // Install Vue Devtools
    try {
      await installExtension(VUEJS_DEVTOOLS)
    } catch (e) {
      console.error('Vue Devtools failed to install:', e.toString())
    }
  }
  createWindow()
})

// Exit cleanly on request from parent process in development mode.
if (isDevelopment) {
  if (process.platform === 'win32') {
    process.on('message', (data) => {
      if (data === 'graceful-exit') {
        app.quit()
      }
    })
  } else {
    process.on('SIGTERM', () => {
      app.quit()
    })
  }
}
