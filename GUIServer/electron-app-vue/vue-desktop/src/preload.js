import { contextBridge, ipcRenderer } from 'electron'

// Expose ipcRenderer to the client
contextBridge.exposeInMainWorld('ipcRenderer', {
  send: (channel, data) => {
    let validChannels = [
      'readXMLFile',
      'writeXMLFile',
      'readConfigFile',
      'writeConfigFile',
      'showOpenDialog',
      'campfhir',
    ]
    if (validChannels.includes(channel)) {
      ipcRenderer.send(channel, data)
    }
  },
  receive: (channel, func) => {
    let validChannels = [
      'readXMLFile',
      'writeXMLFile',
      'readConfigFile',
      'writeConfigFile',
      'showOpenDialog',
      'campfhir',
    ]
    if (validChannels.includes(channel)) {
      // Deliberately strip event as it includes `sender`
      ipcRenderer.on(channel, (event, ...args) => func(...args))
    }
  },
  // From render to main and back again.
  invoke: (channel, args) => {
    let validChannels = [
      'readXMLFile',
      'writeXMLFile',
      'readConfigFile',
      'writeConfigFile',
      'showOpenDialog',
      'campfhir',
    ]
    if (validChannels.includes(channel)) {
      return ipcRenderer.invoke(channel, args)
    }
  },
  on: (channel, func) => {
    let validChannels = ['campfhir', 'campfhir-message']
    if (validChannels.includes(channel)) {
      // Deliberately strip event as it includes `sender`
      ipcRenderer.on(channel, (event, ...args) => func(...args))
    }
  },
  removeAllListeners: (channel, func) => {
    let validChannels = ['campfhir', 'campfhir-message']
    if (validChannels.includes(channel)) {
      // Deliberately strip event as it includes `sender`
      ipcRenderer.removeAllListeners(channel, (event, ...args) => func(...args))
    }
  },
})
