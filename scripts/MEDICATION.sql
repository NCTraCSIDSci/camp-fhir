-- Generates a RDBMS view of the 'Procedure' FHIR resource
-- This relies on data in PCORNET CDM format and a populated PCORNET_FHIR_MAPPING table


create view TEST_VIEW_MEDICATION as
select distinct
--NESTcc Request
-- This appears to be the name of the drug, might need to be split in order to fit the FHIR spec.
-- this might split to form, amount, ingredient, etc.
rx.RXNORM_CUI as MED_ID,
--NESTcc Request
null as MED_CODE,
null as MED_STATUS,
--NESTcc Request
null as MED_MANUFACTURER_REF,
--NESTcc Request
null as MED_FORM,
null as MED_AMOUNT,
null as MED_INGREDIENT,
null as MED_INGREDIENT_ITEM_X,
null as MED_INGREDIENT_ITEMCODEABLECONCEPT,
null as MED_INGREDIENT_ITEMREFERENCE_REF,
null as MED_INGREDIENT_ISACTIVE,
null as MED_INGREDIENT_STRENGTH,
null as MED_BATCH,
null as MED_BATCH_LOTNUMBER,
null as MED_BATCH_EXPIRATIONDATE
from PRESCRIBING rx

UNION

select
--NESTcc Request
null as MED_ID,
--NESTcc Request
ma.MEDADMIN_CODE as MED_CODE,
null as MED_STATUS,
--NESTcc Request
null as MED_MANUFACTURER_REF,
--NESTcc Request
null as MED_FORM,
null as MED_AMOUNT,
null as MED_INGREDIENT,
null as MED_INGREDIENT_ITEM_X,
null as MED_INGREDIENT_ITEMCODEABLECONCEPT,
null as MED_INGREDIENT_ITEMREFERENCE_REF,
null as MED_INGREDIENT_ISACTIVE,
null as MED_INGREDIENT_STRENGTH,
null as MED_BATCH,
null as MED_BATCH_LOTNUMBER,
null as MED_BATCH_EXPIRATIONDATE
from MED_ADMIN ma

UNION

select
--NESTcc Request
null as MED_ID,
--NESTcc Request
'NDC CODE: ' || ds.NDC as MED_CODE,
null as MED_STATUS,
--NESTcc Request
null as MED_MANUFACTURER_REF,
--NESTcc Request
null as MED_FORM,
null as MED_AMOUNT,
null as MED_INGREDIENT,
null as MED_INGREDIENT_ITEM_X,
null as MED_INGREDIENT_ITEMCODEABLECONCEPT,
null as MED_INGREDIENT_ITEMREFERENCE_REF,
null as MED_INGREDIENT_ISACTIVE,
null as MED_INGREDIENT_STRENGTH,
null as MED_BATCH,
null as MED_BATCH_LOTNUMBER,
null as MED_BATCH_EXPIRATIONDATE
from DISPENSING ds
/
