package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DocumentManifest;
public class DocumentManifestConversion 
{
	public org.hl7.fhir.r4.model.DocumentManifest DocumentManifests(DocumentManifest d) throws ParseException
	{
		org.hl7.fhir.r4.model.DocumentManifest documentmanifest = new org.hl7.fhir.r4.model.DocumentManifest();

		/******************** id ********************************************************************************/
		documentmanifest.setId(d.getId());

		/******************** DocManifest_Athr ********************************************************************************/
		if(d.getDocManifestAthr() != null ) {

				for( String currListStrSplit : d.getDocManifestAthr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			documentmanifest.addAuthor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DocManifest_Cntnt ********************************************************************************/
		if(d.getDocManifestCntnt() != null ) {

				for( String currListStrSplit : d.getDocManifestCntnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			documentmanifest.addContent(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DocManifest_Created ********************************************************************************/
		if(d.getDocManifestCreated() != null ) {

			if(d.getDocManifestCreated().replace("[","").replace("]","").equals("NULL") | d.getDocManifestCreated()==null) {} else {
			documentmanifest.setCreated(d.getDocManifestCreated().replace("[","").replace("]","").equals("NULL") | d.getDocManifestCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDocManifestCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocManifest_Dscrptn ********************************************************************************/
		if(d.getDocManifestDscrptn() != null ) {

			if(d.getDocManifestDscrptn().replace("[","").replace("]","").equals("NULL") | d.getDocManifestDscrptn()==null) {} else {
			documentmanifest.setDescription(d.getDocManifestDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocManifest_Id_Assigner ********************************************************************************/
		if(d.getDocManifestIdAssigner() != null ) {

			String[] arrayi0 = d.getDocManifestIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Id_Prd_End ********************************************************************************/
		if(d.getDocManifestIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDocManifestIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Id_Prd_Strt ********************************************************************************/
		if(d.getDocManifestIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDocManifestIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Id_Sys ********************************************************************************/
		if(d.getDocManifestIdSys() != null ) {

			String[] arrayi0 = d.getDocManifestIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocManifestIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				String[] arrayi1 = d.getDocManifestIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentmanifest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocManifestIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				String[] arrayi1 = d.getDocManifestIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentmanifest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocManifestIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				String[] arrayi1 = d.getDocManifestIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentmanifest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocManifestIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				String[] arrayi1 = d.getDocManifestIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentmanifest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DocManifest_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocManifestIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				String[] arrayi1 = d.getDocManifestIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentmanifest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Id_Typ_Txt ********************************************************************************/
		if(d.getDocManifestIdTypTxt() != null ) {

			String[] arrayi0 = d.getDocManifestIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Id_Use ********************************************************************************/
		if(d.getDocManifestIdUse() != null ) {

			String[] arrayi0 = d.getDocManifestIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Id_Vl ********************************************************************************/
		if(d.getDocManifestIdVl() != null ) {

			String[] arrayi0 = d.getDocManifestIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getIdentifier().size() < i0+1) { documentmanifest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_MasterId_Assigner ********************************************************************************/
		if(d.getDocManifestMasterIdAssigner() != null ) {

			if(d.getDocManifestMasterIdAssigner().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdAssigner()==null) {} else {
			documentmanifest.getMasterIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(d.getDocManifestMasterIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocManifest_MasterId_Prd_End ********************************************************************************/
		if(d.getDocManifestMasterIdPrdEnd() != null ) {

			if(d.getDocManifestMasterIdPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdPrdEnd()==null) {} else {
			documentmanifest.getMasterIdentifier().getPeriod().setEnd(d.getDocManifestMasterIdPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDocManifestMasterIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocManifest_MasterId_Prd_Strt ********************************************************************************/
		if(d.getDocManifestMasterIdPrdStrt() != null ) {

			if(d.getDocManifestMasterIdPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdPrdStrt()==null) {} else {
			documentmanifest.getMasterIdentifier().getPeriod().setStart(d.getDocManifestMasterIdPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDocManifestMasterIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocManifest_MasterId_Sys ********************************************************************************/
		if(d.getDocManifestMasterIdSys() != null ) {

			if(d.getDocManifestMasterIdSys().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdSys()==null) {} else {
			documentmanifest.getMasterIdentifier().setSystem(d.getDocManifestMasterIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocManifest_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocManifestMasterIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentmanifest.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getMasterIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocManifestMasterIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentmanifest.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getMasterIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocManifestMasterIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentmanifest.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getMasterIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocManifestMasterIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentmanifest.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getMasterIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestMasterIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocManifestMasterIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentmanifest.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getMasterIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_MasterId_Typ_Txt ********************************************************************************/
		if(d.getDocManifestMasterIdTypTxt() != null ) {

			if(d.getDocManifestMasterIdTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdTypTxt()==null) {} else {
			documentmanifest.getMasterIdentifier().getType().setText(d.getDocManifestMasterIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocManifest_MasterId_Use ********************************************************************************/
		if(d.getDocManifestMasterIdUse() != null ) {

			if(d.getDocManifestMasterIdUse().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdUse()==null) {} else {
			documentmanifest.getMasterIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(d.getDocManifestMasterIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocManifest_MasterId_Vl ********************************************************************************/
		if(d.getDocManifestMasterIdVl() != null ) {

			if(d.getDocManifestMasterIdVl().replace("[","").replace("]","").equals("NULL") | d.getDocManifestMasterIdVl()==null) {} else {
			documentmanifest.getMasterIdentifier().setValue(d.getDocManifestMasterIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocManifest_Recipient ********************************************************************************/
		if(d.getDocManifestRecipient() != null ) {

				for( String currListStrSplit : d.getDocManifestRecipient().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			documentmanifest.addRecipient(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DocManifest_Rlted_Id_Assigner ********************************************************************************/
		if(d.getDocManifestRltedIdAssigner() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Rlted_Id_Prd_End ********************************************************************************/
		if(d.getDocManifestRltedIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Rlted_Id_Prd_Strt ********************************************************************************/
		if(d.getDocManifestRltedIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Rlted_Id_Sys ********************************************************************************/
		if(d.getDocManifestRltedIdSys() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				String[] arrayi1 = d.getDocManifestRltedIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { documentmanifest.getRelated().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				String[] arrayi1 = d.getDocManifestRltedIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { documentmanifest.getRelated().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				String[] arrayi1 = d.getDocManifestRltedIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { documentmanifest.getRelated().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				String[] arrayi1 = d.getDocManifestRltedIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { documentmanifest.getRelated().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DocManifest_Rlted_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestRltedIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				String[] arrayi1 = d.getDocManifestRltedIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { documentmanifest.getRelated().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocManifest_Rlted_Id_Typ_Txt ********************************************************************************/
		if(d.getDocManifestRltedIdTypTxt() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Rlted_Id_Use ********************************************************************************/
		if(d.getDocManifestRltedIdUse() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Rlted_Id_Vl ********************************************************************************/
		if(d.getDocManifestRltedIdVl() != null ) {

			String[] arrayi0 = d.getDocManifestRltedIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Rlted_Ref ********************************************************************************/
		if(d.getDocManifestRltedRef() != null ) {

			String[] arrayi0 = d.getDocManifestRltedRef().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getRelated().size() < i0+1) { documentmanifest.addRelated(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getRelated().get(i0).setRef(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Src ********************************************************************************/
		if(d.getDocManifestSrc() != null ) {

			if(d.getDocManifestSrc().replace("[","").replace("]","").equals("NULL") | d.getDocManifestSrc()==null) {} else {
			documentmanifest.setSource(d.getDocManifestSrc().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocManifest_Sts ********************************************************************************/
		if(d.getDocManifestSts() != null ) {

			if(d.getDocManifestSts().replace("[","").replace("]","").equals("NULL") | d.getDocManifestSts()==null) {} else {
			documentmanifest.setStatus(new org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory().fromCode(d.getDocManifestSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocManifest_Sbjct ********************************************************************************/
		if(d.getDocManifestSbjct() != null ) {

			if(d.getDocManifestSbjct().replace("[","").replace("]","").equals("NULL") | d.getDocManifestSbjct()==null) {} else {
			documentmanifest.setSubject(new org.hl7.fhir.r4.model.Reference(d.getDocManifestSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocManifest_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocManifestTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocManifestTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getType().getCoding().size() < i0+1) { documentmanifest.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocManifestTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocManifestTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getType().getCoding().size() < i0+1) { documentmanifest.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocManifestTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocManifestTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getType().getCoding().size() < i0+1) { documentmanifest.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocManifestTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocManifestTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getType().getCoding().size() < i0+1) { documentmanifest.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocManifest_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocManifestTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocManifestTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentmanifest.getType().getCoding().size() < i0+1) { documentmanifest.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentmanifest.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocManifest_Typ_Txt ********************************************************************************/
		if(d.getDocManifestTypTxt() != null ) {

			if(d.getDocManifestTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDocManifestTypTxt()==null) {} else {
			documentmanifest.getType().setText(d.getDocManifestTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return documentmanifest;
	}
}
