# CAMP FHIR

## What is CAMP FHIR?


CAMP FHIR is a lightweight application inteded to transform clinical data stored in a relational database (RDBMS) to [HL7's Fast Healthcare Interoperability Resources](http://hl7.org/fhir/index.html). Once your clinical data are in FHIR, they can be used for a variety of downstream applications. 

CAMP FHIR reads input data from custom views that we've built to align relational clinical data to the FHIR R4 specification. So long as you can put your data in these views, you can use CAMP FHIR to transform those data to FHIR. If your source data is in the PCORnet 4.1 Common Data Model, you're in luck: you should be able to use the view creation scripts in this repo with few or no changes. 

CAMP FHIR was created and is maintained by the NC TraCS Institute, home of the NIH CTSA at University of North Carolina at Chapel Hill. CAMP FHIR is open source, but if you use it for a project, we kindly request that users of this service provide proper attribution for any products (e.g., manuscripts, podium presentations, software) derived from work related to CAMP FHIR. Attribution should include acknowledgement of the funder (National Institutes of Health, National Center for Advancing Translational Sciences, Biomedical Data Translator Program [awards OT3TR002020 and OT2TR002514] and Center for Translational Science Program [award UL1TR002489]), UNC Hospitals and Health Care System, and all team members who contributed to the work.

## How do I use CAMP FHIR?
There are three basic steps to transform clinical data using CAMP FHIR, along with a few prerequisities. (More detailed documentation is available in the docs directory--this is just an overview.)

### Prerequisites:
1. Your clinical data is stored in an RDBMS. (Our SQL scripts assume you're using Oracle, but you can translate our scripts to work with whatever RDBMS you're using.)
2. You have the ability to create views in that database.
3. You have cloned this repo to an environment with the ability to connect to/read from that database.

### High-level steps:
1. Run our mapping table creation script (or your own script, based off of ours) to map your local codes to FHIR codes. The mapping table creation script in this repo will already map codesets in the PCORnet 4.1 Common Data Model to FHIR codesets. If your source data model is different, you can fill in this table to suit your needs, so long as you keep the structure consistent with what's in the script.
2. Run our view creation script (or your own script, based off of ours) to create views of your clinical data that CAMP FHIR expects as inputs. (The view creation scripts in this repo will work to transform source data in the PCORnet 4.1 Common Data Model. If your source data model is different, you can alter our scripts to suit your needs: it will work so long as the views you create have the same columns / column names as the ones in this repo.)
3. Run the CAMP FHIR to transform the desired domain(s)\. This can be achieved two different ways\:
    - Run CAMP FHIR from command\-line simply by setting your configuration file and running the command java \-jar CAMPFHIR\.jar\.
    - Run CAMP FHIR using our new graphical user interface which provides a visual and user friendly alternative to running CAMP FHIR from command\-line\. The GUI focuses on allowing users to create a script that runs CAMPFHIR once the inputs are filled\. The user has access to all of the available resources and has the option to activate database resource mapping through the GUI\. 
![ss](https://user-images.githubusercontent.com/958978/156379971-0c756651-8f50-4841-91db-76c9dd840b8e.png)
