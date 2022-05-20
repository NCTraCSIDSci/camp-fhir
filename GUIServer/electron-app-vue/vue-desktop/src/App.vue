<template>
  <v-app>
    <v-app-bar app color="#4B9CD3"
      ><v-icon color="#ffffff" class="mr-2" large>mdi-campfire</v-icon>
      <div style="color: #ffffff; font-size: 25px">CAMP-FHIR</div></v-app-bar
    >

    <v-main>
      <ConfigInterface />
    </v-main>
  </v-app>
</template>

<script>
import ConfigInterface from './components/ConfigInterface'

export default {
  name: 'App',

  components: {
    ConfigInterface,
  },

  data: () => ({}),
}
</script>
