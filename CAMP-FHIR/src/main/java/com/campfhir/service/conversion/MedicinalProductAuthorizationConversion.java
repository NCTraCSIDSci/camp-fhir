package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductAuthorization;
public class MedicinalProductAuthorizationConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductAuthorization MedicinalProductAuthorizations(MedicinalProductAuthorization m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductAuthorization medicinalproductauthorization = new org.hl7.fhir.r4.model.MedicinalProductAuthorization();

		/******************** id ********************************************************************************/
		medicinalproductauthorization.setId(m.getId());

		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getCountry().size() < i0+1) { medicinalproductauthorization.addCountry(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getCountry().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getCountry().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getCountry().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getCountry().size() < i0+1) { medicinalproductauthorization.addCountry(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getCountry().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getCountry().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getCountry().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getCountry().size() < i0+1) { medicinalproductauthorization.addCountry(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getCountry().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getCountry().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getCountry().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getCountry().size() < i0+1) { medicinalproductauthorization.addCountry(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getCountry().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getCountry().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getCountry().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getCountry().size() < i0+1) { medicinalproductauthorization.addCountry(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getCountry().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getCountry().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getCountry().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getCountry().size() < i0+1) { medicinalproductauthorization.addCountry(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getCountry().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnDataExclusivityPrdEnd() != null ) {

			if(m.getMdcnlPrdctAthztnDataExclusivityPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnDataExclusivityPrdEnd()==null) {} else {
			medicinalproductauthorization.getDataExclusivityPeriod().setEnd(m.getMdcnlPrdctAthztnDataExclusivityPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnDataExclusivityPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnDataExclusivityPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnDataExclusivityPrdStrt() != null ) {

			if(m.getMdcnlPrdctAthztnDataExclusivityPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnDataExclusivityPrdStrt()==null) {} else {
			medicinalproductauthorization.getDataExclusivityPeriod().setStart(m.getMdcnlPrdctAthztnDataExclusivityPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnDataExclusivityPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnDataExclusivityPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_DtOfFirstAthztn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnDtOfFirstAthztn() != null ) {

			if(m.getMdcnlPrdctAthztnDtOfFirstAthztn().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnDtOfFirstAthztn()==null) {} else {
			medicinalproductauthorization.setDateOfFirstAuthorization(m.getMdcnlPrdctAthztnDtOfFirstAthztn().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnDtOfFirstAthztn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnDtOfFirstAthztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Holder ********************************************************************************/
		if(m.getMdcnlPrdctAthztnHolder() != null ) {

			if(m.getMdcnlPrdctAthztnHolder().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnHolder()==null) {} else {
			medicinalproductauthorization.setHolder(new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnHolder().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductauthorization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductauthorization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductauthorization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductauthorization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductauthorization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getIdentifier().size() < i0+1) { medicinalproductauthorization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_InternationalBirthDt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnInternationalBirthDt() != null ) {

			if(m.getMdcnlPrdctAthztnInternationalBirthDt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnInternationalBirthDt()==null) {} else {
			medicinalproductauthorization.setInternationalBirthDate(m.getMdcnlPrdctAthztnInternationalBirthDt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnInternationalBirthDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnInternationalBirthDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdiction().size() < i0+1) { medicinalproductauthorization.addJurisdiction(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdiction().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdiction().size() < i0+1) { medicinalproductauthorization.addJurisdiction(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdiction().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdiction().size() < i0+1) { medicinalproductauthorization.addJurisdiction(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdiction().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdiction().size() < i0+1) { medicinalproductauthorization.addJurisdiction(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdiction().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdiction().size() < i0+1) { medicinalproductauthorization.addJurisdiction(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdiction().get(i0).getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdiction().size() < i0+1) { medicinalproductauthorization.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getCountry().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getIdentifier().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addJurisdiction(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addJurisdiction(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addJurisdiction(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addJurisdiction(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addJurisdiction(); }
					String[] arrayi2 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).addJurisdiction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getJurisdiction().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				String[] arrayi1 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().size() < i1+1) { medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getLegalStatusOfSupply().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getValidityPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getJurisdictionalAuthorization().size() < i0+1) { medicinalproductauthorization.addJurisdictionalAuthorization(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getJurisdictionalAuthorization().get(i0).getValidityPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnLegalBasisCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getLegalBasis().getCoding().size() < i0+1) { medicinalproductauthorization.getLegalBasis().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getLegalBasis().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnLegalBasisCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getLegalBasis().getCoding().size() < i0+1) { medicinalproductauthorization.getLegalBasis().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getLegalBasis().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnLegalBasisCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getLegalBasis().getCoding().size() < i0+1) { medicinalproductauthorization.getLegalBasis().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getLegalBasis().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnLegalBasisCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getLegalBasis().getCoding().size() < i0+1) { medicinalproductauthorization.getLegalBasis().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getLegalBasis().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnLegalBasisCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getLegalBasis().getCoding().size() < i0+1) { medicinalproductauthorization.getLegalBasis().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getLegalBasis().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisTxt() != null ) {

			if(m.getMdcnlPrdctAthztnLegalBasisTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnLegalBasisTxt()==null) {} else {
			medicinalproductauthorization.getLegalBasis().setText(m.getMdcnlPrdctAthztnLegalBasisTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_DtDtTimeTyp ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrDtDtTimeTyp() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrDtDtTimeTyp().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrDtDtTimeTyp()==null) {} else {
			medicinalproductauthorization.getProcedure().setDate(new org.hl7.fhir.r4.model.DateTimeType(m.getMdcnlPrdctAthztnPrcdrDtDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrDtPrdEnd() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrDtPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrDtPrdEnd()==null) {} else {
			medicinalproductauthorization.getProcedure().getDatePeriod().setEnd(m.getMdcnlPrdctAthztnPrcdrDtPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrDtPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnPrcdrDtPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrDtPrdStrt() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrDtPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrDtPrdStrt()==null) {} else {
			medicinalproductauthorization.getProcedure().getDatePeriod().setStart(m.getMdcnlPrdctAthztnPrcdrDtPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrDtPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnPrcdrDtPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdAssigner() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrIdAssigner().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdAssigner()==null) {} else {
			medicinalproductauthorization.getProcedure().getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnPrcdrIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdPrdEnd() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrIdPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdPrdEnd()==null) {} else {
			medicinalproductauthorization.getProcedure().getIdentifier().getPeriod().setEnd(m.getMdcnlPrdctAthztnPrcdrIdPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnPrcdrIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdPrdStrt() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrIdPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdPrdStrt()==null) {} else {
			medicinalproductauthorization.getProcedure().getIdentifier().getPeriod().setStart(m.getMdcnlPrdctAthztnPrcdrIdPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnPrcdrIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdSys() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrIdSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdSys()==null) {} else {
			medicinalproductauthorization.getProcedure().getIdentifier().setSystem(m.getMdcnlPrdctAthztnPrcdrIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypTxt() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrIdTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdTypTxt()==null) {} else {
			medicinalproductauthorization.getProcedure().getIdentifier().getType().setText(m.getMdcnlPrdctAthztnPrcdrIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdUse() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrIdUse().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdUse()==null) {} else {
			medicinalproductauthorization.getProcedure().getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(m.getMdcnlPrdctAthztnPrcdrIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdVl() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrIdVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrIdVl()==null) {} else {
			medicinalproductauthorization.getProcedure().getIdentifier().setValue(m.getMdcnlPrdctAthztnPrcdrIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnPrcdrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getProcedure().getType().getCoding().size() < i0+1) { medicinalproductauthorization.getProcedure().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getProcedure().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypTxt() != null ) {

			if(m.getMdcnlPrdctAthztnPrcdrTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnPrcdrTypTxt()==null) {} else {
			medicinalproductauthorization.getProcedure().getType().setText(m.getMdcnlPrdctAthztnPrcdrTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctAthztn_Regulator ********************************************************************************/
		if(m.getMdcnlPrdctAthztnRegulator() != null ) {

			if(m.getMdcnlPrdctAthztnRegulator().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnRegulator()==null) {} else {
			medicinalproductauthorization.setRegulator(new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnRegulator().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_RestoreDt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnRestoreDt() != null ) {

			if(m.getMdcnlPrdctAthztnRestoreDt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnRestoreDt()==null) {} else {
			medicinalproductauthorization.setRestoreDate(m.getMdcnlPrdctAthztnRestoreDt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnRestoreDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnRestoreDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getStatus().getCoding().size() < i0+1) { medicinalproductauthorization.getStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getStatus().getCoding().size() < i0+1) { medicinalproductauthorization.getStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getStatus().getCoding().size() < i0+1) { medicinalproductauthorization.getStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getStatus().getCoding().size() < i0+1) { medicinalproductauthorization.getStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAthztnStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductauthorization.getStatus().getCoding().size() < i0+1) { medicinalproductauthorization.getStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductauthorization.getStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctAthztn_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsTxt() != null ) {

			if(m.getMdcnlPrdctAthztnStsTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnStsTxt()==null) {} else {
			medicinalproductauthorization.getStatus().setText(m.getMdcnlPrdctAthztnStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctAthztn_StsDt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsDt() != null ) {

			if(m.getMdcnlPrdctAthztnStsDt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnStsDt()==null) {} else {
			medicinalproductauthorization.setStatusDate(m.getMdcnlPrdctAthztnStsDt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnStsDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnStsDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctAthztnSbjct() != null ) {

			if(m.getMdcnlPrdctAthztnSbjct().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnSbjct()==null) {} else {
			medicinalproductauthorization.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_ValidityPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnValidityPrdEnd() != null ) {

			if(m.getMdcnlPrdctAthztnValidityPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnValidityPrdEnd()==null) {} else {
			medicinalproductauthorization.getValidityPeriod().setEnd(m.getMdcnlPrdctAthztnValidityPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnValidityPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnValidityPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctAthztn_ValidityPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnValidityPrdStrt() != null ) {

			if(m.getMdcnlPrdctAthztnValidityPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnValidityPrdStrt()==null) {} else {
			medicinalproductauthorization.getValidityPeriod().setStart(m.getMdcnlPrdctAthztnValidityPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAthztnValidityPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctAthztnValidityPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return medicinalproductauthorization;
	}
}
