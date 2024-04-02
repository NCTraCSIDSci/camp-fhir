# CAMP FHIR

## What is CAMP FHIR?


CAMP FHIR is a lightweight application inteded to transform clinical data stored in a relational database (RDBMS) to [HL7's Fast Healthcare Interoperability Resources](http://hl7.org/fhir/index.html). Once your clinical data are in FHIR, they can be used for a variety of downstream applications. 

CAMP FHIR reads input data from custom views that we've built to align relational clinical data to the FHIR R4 specification. So long as you can put your data in these views, you can use CAMP FHIR to transform those data to FHIR. If your source data is in the PCORnet 4.1 Common Data Model, you're in luck: you should be able to use the view creation scripts in this repo with few or no changes. 

CAMP FHIR was created and is maintained by the NC TraCS Institute, home of the NIH CTSA at University of North Carolina at Chapel Hill. CAMP FHIR is open source, but if you use it for a project, we kindly request that users of this service provide proper attribution for any products (e.g., manuscripts, podium presentations, software) derived from work related to CAMP FHIR. Attribution should include acknowledgement of the funder (National Institutes of Health, National Center for Advancing Translational Sciences, Biomedical Data Translator Program [awards OT3TR002020 and OT2TR002514] and Center for Translational Science Program [award UL1TR002489]), UNC Hospitals and Health Care System, and all team members who contributed to the work.

## How do I use CAMP FHIR?
There are three basic steps to transform clinical data using CAMP FHIR, along with a few prerequisites. (More detailed documentation is available in the docs directory--this is just an overview.)

### Prerequisites:
1. Your clinical data is stored in an RDBMS (with the ability to create Views/Tables). Our release includes a H2 Database that includes a synthetic OMOP Patient and OMOP Condition Domain for testing purposes if desired. 
2. Java (Java 18+ suggested). Link for latest release of OpenJDK release against which CAMPFHIR has been tested is available  [here](https://jdk.java.net/19/) if needed.
3. Download and unpack the latest release from our Github release page [here](https://github.com/NCTraCSIDSci/camp-fhir/releases/). There are two options for download. One is a eclipse-based user interface for users (CAMPFHIR-GUI.zip). The other is everything needed for running CAMPFHIR from command-line (CAMPFHIR-COMMANDLINE.zip).


### High-level steps:
1. Run our mapping table creation scripts or your own script, based off of ours. ([example](https://github.com/NCTraCSIDSci/camp-fhir/tree/master/scripts/Postgres)) to map your local codes to FHIR codes. The mapping table included in our demo H2 Database in our release has mapping tables for OMOP 5.4. that maps a limited number of codesets from OMOP 5.4 Common Data Model to FHIR codesets. If your source data model is different, you can fill in this table to suit your needs, so long as you keep the structure consistent with what's in the script. We also have provided mapping table scripts for PCORNET 4.1 CDM if needed.
2. Run our view creation script (or your own script, based off of ours) to create views of your clinical data that CAMP FHIR expects as inputs. (The views included in the demo dataset will work to transform source data in the OMOP 5.4 Common Data Model. If your source data model is different, you can alter our scripts to suit your needs: it will work so long as the views you create have the same columns / column names as the ones in [this](https://github.com/NCTraCSIDSci/camp-fhir/tree/master/scripts/Postgres) repo.) We also have provided view creation scripts for PCORNET 4.1 CDM if needed.
3. Run the CAMP FHIR to transform the desired domain(s)\. This can be achieved two different ways\:
    - Run CAMP FHIR from command\-line simply by setting your configuration file (config.json) and running the command java \-jar CAMPFHIR\.jar\.
    - Run CAMP FHIR using our new graphical user interface which provides a visual and user friendly alternative to running CAMP FHIR from command\-line\. The GUI focuses on allowing users to create a script that runs CAMPFHIR once the inputs are filled\. The user has access to all of the available resources and has the option to activate database resource mapping through the GUI\. 

For additional information and questions please see our wiki page [here](https://github.com/NCTraCSIDSci/camp-fhir/wiki)
