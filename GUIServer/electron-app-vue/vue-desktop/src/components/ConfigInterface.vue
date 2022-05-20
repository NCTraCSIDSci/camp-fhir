<template>
  <v-container>
    <v-row class="text-center" no-gutters>
      <v-col cols="12">
        <v-select
          v-model="SQLDialect"
          :items="SQLDialectOptions"
          label="Dialects of SQL"
          hide-details
        ></v-select>
      </v-col>
    </v-row>
    <v-row class="text-center" no-gutters>
      <v-col cols="12">
        <v-text-field v-model="DriverClass" label="Driver Class" hide-details>
        </v-text-field>
      </v-col>
    </v-row>
    <v-row class="text-center" no-gutters>
      <v-col cols="12">
        <v-text-field
          v-model="DatabaseConnectionURL"
          label="Database Connection URL"
          hide-details
        ></v-text-field>
      </v-col>
    </v-row>
    <v-row class="text-center" no-gutters>
      <v-col cols="12">
        <v-text-field
          v-model="DatabaseUsername"
          label="Database Username"
          hide-details
        ></v-text-field>
      </v-col>
    </v-row>
    <v-row class="text-center" no-gutters>
      <v-col cols="12">
        <v-text-field
          v-model="DatabasePassword"
          label="Database Password"
          :type="showDatabasePassword ? 'text' : 'password'"
          :append-icon="showDatabasePassword ? 'mdi-eye' : 'mdi-eye-off'"
          @click:append="showDatabasePassword = !showDatabasePassword"
          hide-details
        ></v-text-field>
      </v-col>
    </v-row>
    <v-row class="text-center" no-gutters>
      <v-col cols="12">
        <v-text-field
          v-model="OutputFolder"
          @click="pickFolder()"
          label="Output Folder"
          hide-details
        ></v-text-field>
      </v-col>
    </v-row>
    <v-row class="text-center" no-gutters>
      <v-col cols="12">
        <v-text-field
          v-model="Partition"
          label="Partition (number of records per file)"
          hide-details
        ></v-text-field>
      </v-col>
    </v-row>
    <v-row class="text-center">
      <v-col cols="12">
        <resource-picker
          v-bind:resourcesSelected="resourcesSelected"
          v-on:resourcesSelected="resourcesSelected = $event"
        />
      </v-col>
    </v-row>
    <v-row class="text-end">
      <v-col cols="12">
        <v-btn @click="createConfig" class="mr-2">Run CAMP-FHIR</v-btn>
        <v-btn @click="campfhirOutputDialog = true" v-if="campfhirOutput != ''"
          >Open Output</v-btn
        >
      </v-col>
    </v-row>
    <v-dialog v-model="campfhirOutputDialog" scrollable width="95%"
      ><v-card height="90vh">
        <v-card-title>CAMP-FHIR Output</v-card-title>
        <v-card-text>
          <pre> {{ campfhirOutput }} </pre>
        </v-card-text>
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn color="red" text @click="campfhirOutputDialog = false">
            close
          </v-btn>
        </v-card-actions></v-card
      >
    </v-dialog>
  </v-container>
</template>

<script>
import ResourcePicker from './ResourcePicker.vue'
export default {
  name: 'ConfigInterface',

  data: () => ({
    SQLDialect: '',
    SQLDialectOptions: [
      'org.hibernate.dialect.Oracle12cDialect',
      'Oracle9i',
      'Oracle10g',
      'MySQL',
      'MySQL with InnoDB',
      'MySQL with MyISAM',
      'DB2',
      'DB2 AS/400',
      'DB2 OS390',
      'Microsoft SQL Server',
      'Sybase',
      'org.hibernate.dialect.PostgreSQL9Dialect',
      'SAP DB',
      'Informix',
      'HypersonicSQL',
      'Ingres',
      'Progress',
      'Mckoi SQL',
      'Interbase',
      'Pointbase',
      'Frontbase',
      'Fiirebir',
    ],
    DriverClass: '',
    DatabaseConnectionURL: '',
    DatabaseUsername: '',
    DatabasePassword: '',
    OutputFolder: '',
    Partition: '',
    resourcesSelected: [],
    showDatabasePassword: false,
    campfhirOutputDialog: false,
    campfhirOutput: '',
  }),
  mounted() {
    this.readConfig()
  },
  computed: {
    resourcesSelectedString() {
      return String(this.resourcesSelected.map((x) => x.name))
    },
  },
  components: {
    ResourcePicker,
  },

  methods: {
    async readConfig() {
      let filedata = await window.ipcRenderer.invoke('readConfigFile')
      if (filedata != '') {
        let configJson = JSON.parse(filedata)
        this.SQLDialect = configJson.sqldialects
        this.DriverClass = configJson.driverclass
        this.DatabaseConnectionURL = configJson.dburl
        this.DatabaseUsername = configJson.dbusername
        this.DatabasePassword = configJson.dbpassword
        this.OutputFolder = configJson.outputfolder
        this.Partition = configJson.partition
      }
      //this.resourcesSelectedString = configJson.resource
    },
    async createConfig() {
      const configJson = {
        sqldialects: this.SQLDialect,
        driverclass: this.DriverClass,
        dburl: this.DatabaseConnectionURL,
        dbusername: this.DatabaseUsername,
        dbpassword: this.DatabasePassword,
        outputfolder: this.OutputFolder,
        partition: this.Partition,
        resourceconfiguration: '',
        resource: this.resourcesSelectedString,
        custommapping: 'false',
      }
      let filedata = await window.ipcRenderer.invoke(
        'writeConfigFile',
        configJson
      )
      //writeFile should return undefined on successful write otherwise alert the error
      if (filedata == undefined) {
        this.runCAMPFHIR()
      } else {
        alert(filedata)
      }
    },
    async runCAMPFHIR() {
      this.campfhirOutput = ''
      this.campfhirOutputDialog = true
      // let filedata = await window.ipcRenderer.invoke('runCAMPFHIR', {})

      window.ipcRenderer.on('campfhir-message', (event) => {
        this.campfhirOutput = this.campfhirOutput + event
        if (event.includes('CAMPFHIR Finished with the exit code: ')) {
          //do nothing
          window.ipcRenderer.removeAllListeners('campfhir-message')
          window.ipcRenderer.removeAllListeners('campfhir')
        }
        // console.log(arg) // prints "pong"
      })
      window.ipcRenderer.send('campfhir', {})
      //  console.log(filedata)
    },
    async pickFolder() {
      let folderdata = await window.ipcRenderer.invoke('showOpenDialog', {})
      if (folderdata.canceled === false) {
        console.log('Selected file paths: ', folderdata.filePaths[0])
        this.OutputFolder = folderdata.filePaths[0]
      }
    },
  },
}
</script>

<style scoped></style>
