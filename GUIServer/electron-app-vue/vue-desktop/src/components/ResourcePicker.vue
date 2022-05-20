<template>
  <v-card>
    <v-toolbar flat dense>
      <v-toolbar-title color="#FFFFFF">Pick a Resource:</v-toolbar-title>
    </v-toolbar>

    <v-row>
      <v-col>
        <v-card-text>
          <v-row>
            <v-col>
              <v-text-field
                v-model="searchTerm"
                label="Search FHIR Resources"
                @input="openTreeWhenSearching"
                flat
                hide-details
                dense
                clearable
                clear-icon="mdi-close-circle-outline"
              ></v-text-field>
            </v-col>
          </v-row>
          <v-row>
            <v-col>
              <v-treeview
                ref="tree"
                :value="resourcesSelected"
                @input="
                  (value) => {
                    $emit('resourcesSelected', value)
                  }
                "
                :items="fhirResources"
                :search="searchTerm"
                :filter="filter"
                :open.sync="open"
                selected-color="indigo"
                open-on-click
                selectable
                return-object
                dense
              >
              </v-treeview>
            </v-col>
          </v-row>
        </v-card-text>
      </v-col>

      <v-divider vertical></v-divider>

      <v-col cols="12" md="6">
        <v-card-text>
          <div
            v-if="resourcesSelected.length === 0"
            key="title"
            class="text-h6 font-weight-light grey--text pa-4 text-center"
          >
            Select a FHIR Resources
          </div>

          <!-- <v-scroll-x-transition group hide-on-leave>
            <v-chip
              v-for="(selection, i) in resourcesSelected"
              :key="i"
              color="grey"
              dark
              small
              class="ma-1"
            >
              <v-icon left small> mdi-beer </v-icon>
              {{ selection.name }}
            </v-chip>
          </v-scroll-x-transition> -->

          <!-- <v-list-item-action>
                  <v-checkbox :input-value="active"></v-checkbox>
                </v-list-item-action> -->

          <v-row
            :style="
              i != resourcesSelected.length - 1
                ? 'border-color: lightgrey;border-top: solid lightgrey 0.001em;border-left: solid lightgrey 0.001em;border-right: solid lightgrey 0.001em;'
                : 'border: solid lightgrey 0.001em;'
            "
            v-for="(selection, i) in resourcesSelected"
            :key="i"
          >
            <v-col align="start">{{ selection.name }}</v-col>
            <v-col
              ><v-btn x-small @click="openXMLEditor(selection.name)"
                >Edit Table/Field Mappings</v-btn
              ></v-col
            ></v-row
          >
          <!--  <v-list-item-subtitle
                    >Auto-update apps at any time. Data charges may
                    apply</v-list-item-subtitle
                  >-->
        </v-card-text>
      </v-col>
      <XMLEditor
        v-if="dialog"
        v-bind:dialog="dialog"
        v-bind:resourceName="resourceName"
        v-on:closedialog="dialog = false"
      />
    </v-row>

    <v-divider></v-divider>

    <v-card-actions>
      <v-btn text @click="resourcesSelected = []"> Clear All </v-btn>
    </v-card-actions>
  </v-card>
</template>
<script>
import XMLEditor from './XMLEditor.vue'

export default {
  props: ['resourcesSelected'],
  components: {
    XMLEditor,
  },
  data: () => ({
    isLoading: false,
    //resourcesSelected: [],
    searchTerm: null,
    allOpened: false,
    open: [
      {
        id: 1,
        name: 'All FHIR Resources',
      },
    ],
    lastOpen: [
      {
        id: 1,
        name: 'All FHIR Resources',
      },
    ],
    timerId: null,
    dialog: false,
    resourceName: '',
  }),
  methods: {
    openXMLEditor(resourceName) {
      this.dialog = true
      this.resourceName = resourceName
    },
    openTreeWhenSearching: function (val) {
      // clearTimeout(this.timerId)

      // // delay new call 500ms
      // this.timerId = setTimeout(() => {
      if (val) {
        if (!this.allOpened) {
          this.lastOpen = this.open
          this.allOpened = true
          this.$refs.tree.updateAll(true)
        }
      } else {
        this.$refs.tree.updateAll(false)
        this.allOpened = false
        this.open = this.lastOpen
      }
      // }, 500)
    },
  },
  computed: {
    filter() {
      // return (item, search, textKey) => item[textKey].indexOf(search) > -1 //this is for case-sensitve search
      return undefined
    },
    fhirResources() {
      return [
        {
          id: 1,
          name: 'All FHIR Resources',
          children: [
            {
              id: 2,
              name: 'Foundation',

              children: [
                {
                  id: 3,
                  name: 'Conformance Resources',
                  disabled: true,
                  children: [
                    { id: 4, name: 'StructureDefinition', disabled: true },
                    { id: 5, name: 'ImplementationGuide', disabled: true },
                    { id: 6, name: 'SearchParameter', disabled: true },
                    { id: 7, name: 'MessageDefinition', disabled: true },
                    { id: 8, name: 'OperationDefinition', disabled: true },
                    { id: 9, name: 'CompartmentDefinition', disabled: true },
                    { id: 10, name: 'GraphDefinition', disabled: true },
                    { id: 11, name: 'ExampleScenario', disabled: true },
                  ],
                },

                {
                  id: 12,
                  name: 'Terminology Resources',
                  disabled: true,
                  children: [
                    { id: 13, name: 'CodeSystem', disabled: true },
                    { id: 14, name: 'ValueSet', disabled: true },
                    { id: 15, name: 'ConceptMap', disabled: true },
                    { id: 16, name: 'NamingSystem', disabled: true },
                    { id: 17, name: 'TerminologyCapabilities', disabled: true },
                  ],
                },
                {
                  id: 18,
                  name: 'Security Resources',
                  disabled: true,
                  children: [
                    { id: 19, name: 'Provenance', disabled: true },
                    { id: 20, name: 'AuditEvent', disabled: true },
                    { id: 21, name: 'Permission', disabled: true },
                    { id: 22, name: 'Consent', disabled: true },
                  ],
                },
                {
                  id: 23,
                  name: 'Documents Resources',
                  children: [
                    { id: 24, name: 'Composition', disabled: true },

                    { id: 25, name: 'DocumentManifest', disabled: true },
                    { id: 26, name: 'DocumentReference' },
                  ],
                },
                {
                  id: 27,
                  name: 'Other Resources',
                  disabled: true,
                  children: [
                    { id: 28, name: 'Basic', disabled: true },
                    { id: 29, name: 'Binary', disabled: true },
                    { id: 30, name: 'Bundle', disabled: true },
                    { id: 31, name: 'Linkage', disabled: true },
                    { id: 32, name: 'MessageHeader', disabled: true },
                    { id: 33, name: 'OperationOutcome', disabled: true },
                    { id: 34, name: 'Parameters', disabled: true },
                    { id: 35, name: 'Subscription', disabled: true },
                    { id: 36, name: 'SubscriptionStatus', disabled: true },
                    { id: 37, name: 'SubscriptionTopic', disabled: true },
                  ],
                },
              ],
            },
            {
              id: 38,
              name: 'Base',
              children: [
                {
                  id: 39,
                  name: 'Individuals Resources',
                  children: [
                    { id: 40, name: 'Patient' },
                    { id: 41, name: 'Practitioner' },
                    { id: 42, name: 'PractitionerRole', disabled: true },
                    { id: 43, name: 'RelatedPerson', disabled: true },
                    { id: 44, name: 'Person', disabled: true },
                    { id: 45, name: 'Group', disabled: true },
                  ],
                },
                {
                  id: 46,
                  name: 'Entities Resources',
                  disabled: true,
                  children: [
                    { id: 47, name: 'Organization', disabled: true },
                    { id: 48, name: 'OrganizationAffiliation', disabled: true },
                    { id: 49, name: 'HealthcareService', disabled: true },
                    { id: 50, name: 'Endpoint', disabled: true },
                    { id: 51, name: 'Location', disabled: true },
                    { id: 52, name: 'Substance', disabled: true },
                    {
                      id: 53,
                      name: 'BiologicallyDerivedProduct',
                      disabled: true,
                    },
                    { id: 54, name: 'Device', disabled: true },
                    { id: 55, name: 'DeviceMetric', disabled: true },
                    { id: 56, name: 'NutritionProduct', disabled: true },
                  ],
                },
                {
                  id: 57,
                  name: 'Workflow Resources',
                  disabled: true,
                  children: [
                    { id: 58, name: 'Task', disabled: true },
                    { id: 59, name: 'Transport', disabled: true },
                    { id: 60, name: 'Appointment', disabled: true },
                    { id: 61, name: 'AppointmentResponse', disabled: true },
                    { id: 62, name: 'Schedule', disabled: true },
                    { id: 63, name: 'Slot', disabled: true },
                    { id: 64, name: 'VerificationResult', disabled: true },
                  ],
                },
                {
                  id: 65,
                  name: 'Management Resources',
                  children: [
                    { id: 66, name: 'Encounter' },
                    { id: 67, name: 'EpisodeOfCare', disabled: true },
                    { id: 68, name: 'Flag', disabled: true },
                    { id: 69, name: 'List', disabled: true },
                    { id: 70, name: 'Library', disabled: true },
                  ],
                },
              ],
            },
            {
              id: 71,
              name: 'Clinical',
              children: [
                {
                  id: 72,
                  name: 'Summary Resources',
                  disabled: true,
                  children: [
                    { id: 73, name: 'AllergyIntolerance', disabled: true },
                    { id: 74, name: 'AdverseEvent', disabled: true },
                    { id: 75, name: 'Condition' },
                    { id: 76, name: 'Procedure' },
                    { id: 77, name: 'FamilyMemberHistory', disabled: true },
                    { id: 78, name: 'ClinicalImpression', disabled: true },
                    { id: 79, name: 'DetectedIssue', disabled: true },
                  ],
                },
                {
                  id: 80,
                  name: 'Diagnostics Resources',
                  children: [
                    { id: 81, name: 'Observation' },
                    { id: 83, name: 'DiagnosticReport', disabled: true },
                    { id: 84, name: 'Specimen', disabled: true },
                    { id: 85, name: 'BodyStructure', disabled: true },
                    { id: 86, name: 'ImagingSelection', disabled: true },
                    { id: 87, name: 'ImagingStudy', disabled: true },
                    {
                      id: 88,
                      name: 'QuestionnaireResponse',
                      disabled: true,
                    },
                    { id: 89, name: 'MolecularSequence', disabled: true },
                  ],
                },
                {
                  id: 90,
                  name: 'Medications Resources',
                  children: [
                    { id: 91, name: 'MedicationRequest' },
                    {
                      id: 92,
                      name: 'MedicationAdministration',
                      disabled: true,
                    },
                    { id: 93, name: 'MedicationDispense', disabled: true },
                    { id: 94, name: 'MedicationUsage', disabled: true },
                    { id: 95, name: 'Medication', disabled: true },
                    { id: 96, name: 'MedicationKnowledge', disabled: true },
                    { id: 97, name: 'Immunization', disabled: true },
                    {
                      id: 98,
                      name: 'ImmunizationEvaluation',
                      disabled: true,
                    },
                    {
                      id: 99,
                      name: 'ImmunizationRecommendation',
                      disabled: true,
                    },
                  ],
                },
                {
                  id: 100,
                  name: 'Care Provision Resources',
                  disabled: true,
                  children: [
                    { id: 101, name: 'CarePlan', disabled: true },
                    { id: 102, name: 'CareTeam', disabled: true },
                    { id: 103, name: 'Goal', disabled: true },
                    { id: 104, name: 'ServiceRequest', disabled: true },
                    { id: 105, name: 'NutritionOrder', disabled: true },
                    { id: 106, name: 'NutritionIntake', disabled: true },
                    { id: 107, name: 'VisionPrescription', disabled: true },
                    { id: 108, name: 'RiskAssessment', disabled: true },
                    { id: 109, name: 'RequestGroup', disabled: true },
                  ],
                },
                {
                  id: 110,
                  name: 'Request & Response Resources',
                  disabled: true,
                  children: [
                    { id: 111, name: 'Communication', disabled: true },
                    { id: 112, name: 'CommunicationRequest', disabled: true },
                    { id: 113, name: 'DeviceRequest', disabled: true },
                    { id: 114, name: 'DeviceDispense', disabled: true },
                    { id: 115, name: 'DeviceUsage', disabled: true },
                    { id: 116, name: 'GuidanceResponse', disabled: true },
                    { id: 117, name: 'SupplyRequest', disabled: true },
                    { id: 118, name: 'SupplyDelivery', disabled: true },
                    { id: 119, name: 'InventoryReport', disabled: true },
                  ],
                },
              ],
            },
            {
              id: 120,
              name: 'Financial',
              disabled: true,
              children: [
                {
                  id: 121,
                  name: 'Support Resources',
                  disabled: true,
                  children: [
                    { id: 122, name: 'Coverage', disabled: true },
                    {
                      id: 123,
                      name: 'CoverageEligibilityRequest',
                      disabled: true,
                    },
                    {
                      id: 124,
                      name: 'CoverageEligibilityResponse',
                      disabled: true,
                    },
                    { id: 125, name: 'EnrollmentRequest', disabled: true },
                    { id: 126, name: 'EnrollmentResponse', disabled: true },
                  ],
                },
                {
                  id: 127,
                  name: 'Billing Resources',
                  disabled: true,
                  children: [
                    { id: 128, name: 'Claim', disabled: true },
                    { id: 129, name: 'ClaimResponse', disabled: true },
                    { id: 130, name: 'Invoice', disabled: true },
                  ],
                },
                {
                  id: 131,
                  name: 'Payment Resources',
                  disabled: true,
                  children: [
                    { id: 132, name: 'PaymentNotice', disabled: true },
                    { id: 133, name: 'PaymentReconciliation', disabled: true },
                  ],
                },
                {
                  id: 134,
                  name: 'General Resources',
                  disabled: true,
                  children: [
                    { id: 135, name: 'Account', disabled: true },
                    { id: 136, name: 'ChargeItem', disabled: true },
                    { id: 137, name: 'ChargeItemDefinition', disabled: true },
                    { id: 138, name: 'Contract', disabled: true },
                    { id: 139, name: 'ExplanationOfBenefit', disabled: true },
                    { id: 140, name: 'InsurancePlan', disabled: true },
                  ],
                },
              ],
            },
            {
              id: 141,
              name: 'Specialized',
              disabled: true,
              children: [
                {
                  id: 142,
                  name: 'Public Health & Research Resources',
                  disabled: true,
                  children: [
                    { id: 143, name: 'ResearchStudy', disabled: true },
                    { id: 144, name: 'ResearchSubject', disabled: true },
                  ],
                },
                {
                  id: 145,
                  name: 'Definitional Artifacts Resources',
                  disabled: true,
                  children: [
                    { id: 146, name: 'ActivityDefinition', disabled: true },
                    { id: 147, name: 'ConditionDefinition', disabled: true },
                    { id: 148, name: 'DeviceDefinition', disabled: true },
                    { id: 149, name: 'EventDefinition', disabled: true },
                    { id: 150, name: 'ObservationDefinition', disabled: true },
                    { id: 151, name: 'PlanDefinition', disabled: true },
                    { id: 152, name: 'Questionnaire', disabled: true },
                    { id: 153, name: 'SpecimenDefinition', disabled: true },
                  ],
                },
                {
                  id: 154,
                  name: 'Evidence-Based Medicine Resources',
                  disabled: true,
                  children: [
                    { id: 155, name: 'ArtifactAssessment', disabled: true },
                    { id: 156, name: 'Citation', disabled: true },
                    { id: 157, name: 'Evidence', disabled: true },
                    { id: 158, name: 'EvidenceReport', disabled: true },
                    { id: 159, name: 'EvidenceVariable', disabled: true },
                  ],
                },
                {
                  id: 160,
                  name: 'Quality Reporting & Testing Resources',
                  disabled: true,
                  children: [
                    { id: 161, name: 'Measure', disabled: true },
                    { id: 162, name: 'MeasureReport', disabled: true },
                    { id: 163, name: 'TestScript', disabled: true },
                    { id: 164, name: 'TestReport', disabled: true },
                  ],
                },
                {
                  id: 165,
                  name: 'Medication Definition Resources',
                  disabled: true,
                  children: [
                    {
                      id: 166,
                      name: 'MedicinalProductDefinition',
                      disabled: true,
                    },
                    {
                      id: 167,
                      name: 'PackagedProductDefinition',
                      disabled: true,
                    },
                    {
                      id: 168,
                      name: 'AdministrableProductDefinition',
                      disabled: true,
                    },
                    {
                      id: 169,
                      name: 'ManufacturedItemDefinition',
                      disabled: true,
                    },
                    { id: 170, name: 'Ingredient', disabled: true },
                    { id: 171, name: 'ClinicalUseDefinition', disabled: true },
                    { id: 172, name: 'RegulatedAuthorization', disabled: true },
                    { id: 173, name: 'SubstanceDefinition', disabled: true },
                    { id: 174, name: 'SubstanceNucleicAcid', disabled: true },
                    { id: 175, name: 'SubstancePolymer', disabled: true },
                    { id: 176, name: 'SubstanceProtein', disabled: true },
                    {
                      id: 178,
                      name: 'SubstanceReferenceInformation',
                      disabled: true,
                    },
                    {
                      id: 179,
                      name: 'SubstanceSourceMaterial',
                      disabled: true,
                    },
                  ],
                },
              ],
            },
          ],
        },
      ]
    },
    shouldShowTree() {
      return this.resources.length > 0 && !this.isLoading
    },
  },

  watch: {},
}
</script>
