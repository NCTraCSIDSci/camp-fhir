<template>
  <v-dialog v-model="dialog" scrollable persistent>
    <v-card height="90vh">
      <v-card-title class="text-h8"> Edit Table/Field Mappings </v-card-title>
      <!-- 
      <v-card-text>
        {{ resourceName }}
        {{ data }}
      </v-card-text> -->
      <v-card-text>
        <v-row no-gutters
          ><v-col class="pb-0">
            <v-text-field
              v-model="tableName"
              label="Change Table Name"
              single-line
              hide-details
              dense
            ></v-text-field> </v-col
        ></v-row>
        <v-row
          ><v-col class="pt-0">
            <v-text-field
              v-model="search"
              append-icon="mdi-magnify"
              label="Search"
              class="mt-0"
              single-line
              hide-details
              clearable
            ></v-text-field> </v-col
        ></v-row>
        <v-row>
          <v-col>
            <v-data-table
              :headers="headers"
              :items="columnData"
              :items-per-page="8"
              :search="search"
              :custom-filter="filter"
              item-key="name"
              class="elevation-1"
            >
              <!--  -->
              <!-- :search="search"
            :hide-default-header="hideHeaders"
            :show-select="showSelect"
            :loading="isLoading"
            hide-default-footer -->
              <template v-slot:top> </template>
              <template v-slot:body="{ items }">
                <tbody>
                  <tr v-for="item in items" :key="item.name">
                    <!--  $options.originaldata[index]['column'][0]['$']['name'] -->
                    <td>
                      {{ item['$']['name'] }}
                    </td>
                    <td>
                      <v-text-field
                        v-model="item['column'][0]['$']['name']"
                      ></v-text-field>
                    </td>
                  </tr>
                </tbody>
              </template>
            </v-data-table>
          </v-col>
        </v-row>
      </v-card-text>

      <v-card-actions>
        <v-row no-gutters justify="end">
          <v-btn color="red darken-1" text @click="$emit('closedialog')">
            Discard
          </v-btn>

          <v-btn color="green darken-1" text @click="saveFile()">
            Save Changes
          </v-btn>
        </v-row>
      </v-card-actions>
    </v-card>
  </v-dialog>
</template>

<script>
// import lodash from 'lodash'
// import { ipcRenderer } from 'electron'
export default {
  name: 'XMLEditor',
  props: ['dialog', 'resourceName'],
  data: () => ({
    columnData: [],
    search: '',
    tableName: '',
    fullXMLData: null,
  }),
  computed: {
    headers() {
      return [
        {
          text: 'CAMP_FHIR Column Name',
          align: 'start',
          value: '$.name',
        },
        {
          text: 'View Column Name',
          value: '$.name',
        },
      ]
    },
    // childDialog: {
    //   // getter
    //   get: function () {
    //     return this.dialog
    //   },
    //   // setter
    //   set: function (newValue) {
    //     return newValue
    //   },
    // },
  },
  fulldata: [],
  async mounted() {
    const data = {
      resourceName: this.resourceName,
    }
    let filedata = await window.ipcRenderer.invoke('readXMLFile', data)
    // console.log(filedata['hibernate-mapping']['class'][0]['$']['table'])
    // console.log(
    //   filedata['hibernate-mapping']['class'][0]['property'][0]['column'][0][
    //     '$'
    //   ]['name']
    // )
    this.tableName = filedata['hibernate-mapping']['class'][0]['$']['table']
    this.columnData = filedata['hibernate-mapping']['class'][0]['property']
    this.fullXMLData = filedata
  },

  methods: {
    async saveFile() {
      this.fullXMLData['hibernate-mapping']['class'][0]['$']['table'] =
        this.tableName
      this.fullXMLData['hibernate-mapping']['class'][0]['property'] =
        this.columnData
      const data = {
        fileData: this.fullXMLData,
        resourceName: this.resourceName,
      }
      let filedata = await window.ipcRenderer.invoke('writeXMLFile', data)
      // console.log(filedata)
      //writeFile should return undefined on successful write otherwise alert the error
      if (filedata == undefined) {
        this.$emit('closedialog')
      } else {
        alert(filedata)
      }
    },
    filter(value, search) {
      // if (!this.search) return true

      // return (
      //   value
      //     .toString()
      //     .toLowerCase()
      //     .indexOf(this.search.toLowerCase().replace('_', '')) !== -1
      // )
      return (
        value != null &&
        search != null &&
        typeof value === 'string' &&
        value
          .toString()
          .toLocaleLowerCase()
          .indexOf(search.toLocaleLowerCase().replace('_', '')) !== -1
      )
    },
  },
}
</script>
