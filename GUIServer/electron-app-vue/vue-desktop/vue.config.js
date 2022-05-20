module.exports = {
  transpileDependencies: ['vuetify'],
  pluginOptions: {
    electronBuilder: {
      preload: { preload: 'src/preload.js' },

      builderOptions: {
        files: ['**/*'],
        extraFiles: [
          {
            from: './public/XML',
            to: './XML',
          },
          {
            from: './public/config.json',
            to: './config.json',
          },
          {
            from: './public/CAMPFHIR.jar',
            to: './CAMPFHIR.jar',
          },
        ],
      },
    },
  },
}
