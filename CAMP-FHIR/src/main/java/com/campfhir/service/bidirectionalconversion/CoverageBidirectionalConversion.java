package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Coverage;
public class CoverageBidirectionalConversion 
{
	public Coverage Coverages(org.hl7.fhir.r4.model.Coverage coverage) throws ParseException
	{
		 main.java.com.campfhir.model.Coverage c = new  main.java.com.campfhir.model.Coverage();

		/******************** id ********************************************************************************/
		c.setId(coverage.getIdElement().getIdPart());

		/******************** coveragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragetype = coverage.getType();

		/******************** Cvg_Typ_Txt ********************************************************************************/
		if(coveragetype.hasText()) {

			c.addCvgTypTxt(String.valueOf(coveragetype.getText()));
		} else {
			c.addCvgTypTxt("NULL");
		}


		/******************** coveragetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coveragetypecodinglist = coveragetype.getCoding();
		for(int coveragetypecodingi = 0; coveragetypecodingi<coveragetypecodinglist.size();coveragetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coveragetypecoding = coveragetypecodinglist.get(coveragetypecodingi);

		/******************** Cvg_Typ_Cdg_Dsply ********************************************************************************/
		if(coveragetypecodingi == 0) {c.addCvgTypCdgDsply("[");}
		if(coveragetypecoding.hasDisplay()) {

			c.addCvgTypCdgDsply(String.valueOf(coveragetypecoding.getDisplay()));
		} else {
			c.addCvgTypCdgDsply("NULL");
		}

		if(coveragetypecodingi == coveragetypecodinglist.size()-1) {c.addCvgTypCdgDsply("]");}


		/******************** Cvg_Typ_Cdg_Vrsn ********************************************************************************/
		if(coveragetypecodingi == 0) {c.addCvgTypCdgVrsn("[");}
		if(coveragetypecoding.hasVersion()) {

			c.addCvgTypCdgVrsn(String.valueOf(coveragetypecoding.getVersion()));
		} else {
			c.addCvgTypCdgVrsn("NULL");
		}

		if(coveragetypecodingi == coveragetypecodinglist.size()-1) {c.addCvgTypCdgVrsn("]");}


		/******************** Cvg_Typ_Cdg_Cd ********************************************************************************/
		if(coveragetypecodingi == 0) {c.addCvgTypCdgCd("[");}
		if(coveragetypecoding.hasCode()) {

			c.addCvgTypCdgCd(String.valueOf(coveragetypecoding.getCode()));
		} else {
			c.addCvgTypCdgCd("NULL");
		}

		if(coveragetypecodingi == coveragetypecodinglist.size()-1) {c.addCvgTypCdgCd("]");}


		/******************** Cvg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coveragetypecodingi == 0) {c.addCvgTypCdgUsrSltd("[");}
		if(coveragetypecoding.hasUserSelected()) {

			c.addCvgTypCdgUsrSltd(String.valueOf(coveragetypecoding.getUserSelected()));
		} else {
			c.addCvgTypCdgUsrSltd("NULL");
		}

		if(coveragetypecodingi == coveragetypecodinglist.size()-1) {c.addCvgTypCdgUsrSltd("]");}


		/******************** Cvg_Typ_Cdg_Sys ********************************************************************************/
		if(coveragetypecodingi == 0) {c.addCvgTypCdgSys("[");}
		if(coveragetypecoding.hasSystem()) {

			c.addCvgTypCdgSys(String.valueOf(coveragetypecoding.getSystem()));
		} else {
			c.addCvgTypCdgSys("NULL");
		}

		if(coveragetypecodingi == coveragetypecodinglist.size()-1) {c.addCvgTypCdgSys("]");}


		 };
		/******************** coveragestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Coverage.CoverageStatus coveragestatus = coverage.getStatus();
		if(coveragestatus!=null) {
			c.addCvgSts(coveragestatus.toCode());
		} else {
			c.addCvgSts("NULL");
		}

		/******************** coverageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageperiod = coverage.getPeriod();

		/******************** Cvg_Prd_Strt ********************************************************************************/
		if(coverageperiod.hasStart()) {

			c.addCvgPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageperiod.getStart())+"\"");
		} else {
			c.addCvgPrdStrt("NULL");
		}


		/******************** Cvg_Prd_End ********************************************************************************/
		if(coverageperiod.hasEnd()) {

			c.addCvgPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageperiod.getEnd())+"\"");
		} else {
			c.addCvgPrdEnd("NULL");
		}


		/******************** coverageidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> coverageidentifierlist = coverage.getIdentifier();
		for(int coverageidentifieri = 0; coverageidentifieri<coverageidentifierlist.size();coverageidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  coverageidentifier = coverageidentifierlist.get(coverageidentifieri);

		/******************** Cvg_Id_Vl ********************************************************************************/
		if(coverageidentifieri == 0) {c.addCvgIdVl("[");}
		if(coverageidentifier.hasValue()) {

			c.addCvgIdVl(String.valueOf(coverageidentifier.getValue()));
		} else {
			c.addCvgIdVl("NULL");
		}

		if(coverageidentifieri == coverageidentifierlist.size()-1) {c.addCvgIdVl("]");}


		/******************** coverageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageidentifiertype = coverageidentifier.getType();

		/******************** Cvg_Id_Typ_Txt ********************************************************************************/
		if(coverageidentifieri == 0) {c.addCvgIdTypTxt("[");}
		if(coverageidentifiertype.hasText()) {

			c.addCvgIdTypTxt(String.valueOf(coverageidentifiertype.getText()));
		} else {
			c.addCvgIdTypTxt("NULL");
		}

		if(coverageidentifieri == coverageidentifierlist.size()-1) {c.addCvgIdTypTxt("]");}


		/******************** coverageidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageidentifiertypecodinglist = coverageidentifiertype.getCoding();
		for(int coverageidentifiertypecodingi = 0; coverageidentifiertypecodingi<coverageidentifiertypecodinglist.size();coverageidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageidentifiertypecoding = coverageidentifiertypecodinglist.get(coverageidentifiertypecodingi);

		/******************** Cvg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageidentifiertypecodingi == 0) {c.addCvgIdTypCdgDsply("[[");}
		if(coverageidentifiertypecoding.hasDisplay()) {

			c.addCvgIdTypCdgDsply(String.valueOf(coverageidentifiertypecoding.getDisplay()));
		} else {
			c.addCvgIdTypCdgDsply("NULL");
		}

		if(coverageidentifiertypecodingi == coverageidentifiertypecodinglist.size()-1) {c.addCvgIdTypCdgDsply("]]");}


		/******************** Cvg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageidentifiertypecodingi == 0) {c.addCvgIdTypCdgVrsn("[[");}
		if(coverageidentifiertypecoding.hasVersion()) {

			c.addCvgIdTypCdgVrsn(String.valueOf(coverageidentifiertypecoding.getVersion()));
		} else {
			c.addCvgIdTypCdgVrsn("NULL");
		}

		if(coverageidentifiertypecodingi == coverageidentifiertypecodinglist.size()-1) {c.addCvgIdTypCdgVrsn("]]");}


		/******************** Cvg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(coverageidentifiertypecodingi == 0) {c.addCvgIdTypCdgCd("[[");}
		if(coverageidentifiertypecoding.hasCode()) {

			c.addCvgIdTypCdgCd(String.valueOf(coverageidentifiertypecoding.getCode()));
		} else {
			c.addCvgIdTypCdgCd("NULL");
		}

		if(coverageidentifiertypecodingi == coverageidentifiertypecodinglist.size()-1) {c.addCvgIdTypCdgCd("]]");}


		/******************** Cvg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageidentifiertypecodingi == 0) {c.addCvgIdTypCdgUsrSltd("[[");}
		if(coverageidentifiertypecoding.hasUserSelected()) {

			c.addCvgIdTypCdgUsrSltd(String.valueOf(coverageidentifiertypecoding.getUserSelected()));
		} else {
			c.addCvgIdTypCdgUsrSltd("NULL");
		}

		if(coverageidentifiertypecodingi == coverageidentifiertypecodinglist.size()-1) {c.addCvgIdTypCdgUsrSltd("]]");}


		/******************** Cvg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(coverageidentifiertypecodingi == 0) {c.addCvgIdTypCdgSys("[[");}
		if(coverageidentifiertypecoding.hasSystem()) {

			c.addCvgIdTypCdgSys(String.valueOf(coverageidentifiertypecoding.getSystem()));
		} else {
			c.addCvgIdTypCdgSys("NULL");
		}

		if(coverageidentifiertypecodingi == coverageidentifiertypecodinglist.size()-1) {c.addCvgIdTypCdgSys("]]");}


		 };
		/******************** coverageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageidentifierperiod = coverageidentifier.getPeriod();

		/******************** Cvg_Id_Prd_Strt ********************************************************************************/
		if(coverageidentifieri == 0) {c.addCvgIdPrdStrt("[");}
		if(coverageidentifierperiod.hasStart()) {

			c.addCvgIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageidentifierperiod.getStart())+"\"");
		} else {
			c.addCvgIdPrdStrt("NULL");
		}

		if(coverageidentifieri == coverageidentifierlist.size()-1) {c.addCvgIdPrdStrt("]");}


		/******************** Cvg_Id_Prd_End ********************************************************************************/
		if(coverageidentifieri == 0) {c.addCvgIdPrdEnd("[");}
		if(coverageidentifierperiod.hasEnd()) {

			c.addCvgIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coverageidentifierperiod.getEnd())+"\"");
		} else {
			c.addCvgIdPrdEnd("NULL");
		}

		if(coverageidentifieri == coverageidentifierlist.size()-1) {c.addCvgIdPrdEnd("]");}


		/******************** coverageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse coverageidentifieruse = coverageidentifier.getUse();
		if(coverageidentifieruse!=null) {
		if(coverageidentifieri == 0) {

		c.addCvgIdUse("[");		}
			c.addCvgIdUse(coverageidentifieruse.toCode());
		if(coverageidentifieri == coverageidentifierlist.size()-1) {

		c.addCvgIdUse("]");		}

		} else {
			c.addCvgIdUse("NULL");
		}

		/******************** Cvg_Id_Assigner ********************************************************************************/
		if(coverageidentifieri == 0) {c.addCvgIdAssigner("[");}
		if(coverageidentifier.hasAssigner()) {

			if(coverageidentifier.getAssigner().getReference() != null) {
			c.addCvgIdAssigner(coverageidentifier.getAssigner().getReference());
			}
		} else {
			c.addCvgIdAssigner("NULL");
		}

		if(coverageidentifieri == coverageidentifierlist.size()-1) {c.addCvgIdAssigner("]");}


		/******************** Cvg_Id_Sys ********************************************************************************/
		if(coverageidentifieri == 0) {c.addCvgIdSys("[");}
		if(coverageidentifier.hasSystem()) {

			c.addCvgIdSys(String.valueOf(coverageidentifier.getSystem()));
		} else {
			c.addCvgIdSys("NULL");
		}

		if(coverageidentifieri == coverageidentifierlist.size()-1) {c.addCvgIdSys("]");}


		 };
		/******************** coveragecosttobeneficiary ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent> coveragecosttobeneficiarylist = coverage.getCostToBeneficiary();
		for(int coveragecosttobeneficiaryi = 0; coveragecosttobeneficiaryi<coveragecosttobeneficiarylist.size();coveragecosttobeneficiaryi++ ) {
		org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent  coveragecosttobeneficiary = coveragecosttobeneficiarylist.get(coveragecosttobeneficiaryi);

		/******************** coveragecosttobeneficiaryexception ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coverage.ExemptionComponent> coveragecosttobeneficiaryexceptionlist = coveragecosttobeneficiary.getException();
		for(int coveragecosttobeneficiaryexceptioni = 0; coveragecosttobeneficiaryexceptioni<coveragecosttobeneficiaryexceptionlist.size();coveragecosttobeneficiaryexceptioni++ ) {
		org.hl7.fhir.r4.model.Coverage.ExemptionComponent  coveragecosttobeneficiaryexception = coveragecosttobeneficiaryexceptionlist.get(coveragecosttobeneficiaryexceptioni);

		/******************** coveragecosttobeneficiaryexceptiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragecosttobeneficiaryexceptiontype = coveragecosttobeneficiaryexception.getType();

		/******************** Cvg_CstToBeneficiary_Exception_Typ_Txt ********************************************************************************/
		if(coveragecosttobeneficiaryexceptioni == 0) {c.addCvgCstToBeneficiaryExceptionTypTxt("[[");}
		if(coveragecosttobeneficiaryexceptiontype.hasText()) {

			c.addCvgCstToBeneficiaryExceptionTypTxt(String.valueOf(coveragecosttobeneficiaryexceptiontype.getText()));
		} else {
			c.addCvgCstToBeneficiaryExceptionTypTxt("NULL");
		}

		if(coveragecosttobeneficiaryexceptioni == coveragecosttobeneficiaryexceptionlist.size()-1) {c.addCvgCstToBeneficiaryExceptionTypTxt("]]");}


		/******************** coveragecosttobeneficiaryexceptiontypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coveragecosttobeneficiaryexceptiontypecodinglist = coveragecosttobeneficiaryexceptiontype.getCoding();
		for(int coveragecosttobeneficiaryexceptiontypecodingi = 0; coveragecosttobeneficiaryexceptiontypecodingi<coveragecosttobeneficiaryexceptiontypecodinglist.size();coveragecosttobeneficiaryexceptiontypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coveragecosttobeneficiaryexceptiontypecoding = coveragecosttobeneficiaryexceptiontypecodinglist.get(coveragecosttobeneficiaryexceptiontypecodingi);

		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Dsply ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecodingi == 0) {c.addCvgCstToBeneficiaryExceptionTypCdgDsply("[[[");}
		if(coveragecosttobeneficiaryexceptiontypecoding.hasDisplay()) {

			c.addCvgCstToBeneficiaryExceptionTypCdgDsply(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getDisplay()));
		} else {
			c.addCvgCstToBeneficiaryExceptionTypCdgDsply("NULL");
		}

		if(coveragecosttobeneficiaryexceptiontypecodingi == coveragecosttobeneficiaryexceptiontypecodinglist.size()-1) {c.addCvgCstToBeneficiaryExceptionTypCdgDsply("]]]");}


		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Vrsn ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecodingi == 0) {c.addCvgCstToBeneficiaryExceptionTypCdgVrsn("[[[");}
		if(coveragecosttobeneficiaryexceptiontypecoding.hasVersion()) {

			c.addCvgCstToBeneficiaryExceptionTypCdgVrsn(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getVersion()));
		} else {
			c.addCvgCstToBeneficiaryExceptionTypCdgVrsn("NULL");
		}

		if(coveragecosttobeneficiaryexceptiontypecodingi == coveragecosttobeneficiaryexceptiontypecodinglist.size()-1) {c.addCvgCstToBeneficiaryExceptionTypCdgVrsn("]]]");}


		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Cd ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecodingi == 0) {c.addCvgCstToBeneficiaryExceptionTypCdgCd("[[[");}
		if(coveragecosttobeneficiaryexceptiontypecoding.hasCode()) {

			c.addCvgCstToBeneficiaryExceptionTypCdgCd(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getCode()));
		} else {
			c.addCvgCstToBeneficiaryExceptionTypCdgCd("NULL");
		}

		if(coveragecosttobeneficiaryexceptiontypecodingi == coveragecosttobeneficiaryexceptiontypecodinglist.size()-1) {c.addCvgCstToBeneficiaryExceptionTypCdgCd("]]]");}


		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecodingi == 0) {c.addCvgCstToBeneficiaryExceptionTypCdgUsrSltd("[[[");}
		if(coveragecosttobeneficiaryexceptiontypecoding.hasUserSelected()) {

			c.addCvgCstToBeneficiaryExceptionTypCdgUsrSltd(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getUserSelected()));
		} else {
			c.addCvgCstToBeneficiaryExceptionTypCdgUsrSltd("NULL");
		}

		if(coveragecosttobeneficiaryexceptiontypecodingi == coveragecosttobeneficiaryexceptiontypecodinglist.size()-1) {c.addCvgCstToBeneficiaryExceptionTypCdgUsrSltd("]]]");}


		/******************** Cvg_CstToBeneficiary_Exception_Typ_Cdg_Sys ********************************************************************************/
		if(coveragecosttobeneficiaryexceptiontypecodingi == 0) {c.addCvgCstToBeneficiaryExceptionTypCdgSys("[[[");}
		if(coveragecosttobeneficiaryexceptiontypecoding.hasSystem()) {

			c.addCvgCstToBeneficiaryExceptionTypCdgSys(String.valueOf(coveragecosttobeneficiaryexceptiontypecoding.getSystem()));
		} else {
			c.addCvgCstToBeneficiaryExceptionTypCdgSys("NULL");
		}

		if(coveragecosttobeneficiaryexceptiontypecodingi == coveragecosttobeneficiaryexceptiontypecodinglist.size()-1) {c.addCvgCstToBeneficiaryExceptionTypCdgSys("]]]");}


		 };
		/******************** coveragecosttobeneficiaryexceptionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coveragecosttobeneficiaryexceptionperiod = coveragecosttobeneficiaryexception.getPeriod();

		/******************** Cvg_CstToBeneficiary_Exception_Prd_Strt ********************************************************************************/
		if(coveragecosttobeneficiaryexceptioni == 0) {c.addCvgCstToBeneficiaryExceptionPrdStrt("[[");}
		if(coveragecosttobeneficiaryexceptionperiod.hasStart()) {

			c.addCvgCstToBeneficiaryExceptionPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(coveragecosttobeneficiaryexceptionperiod.getStart())+"\"");
		} else {
			c.addCvgCstToBeneficiaryExceptionPrdStrt("NULL");
		}

		if(coveragecosttobeneficiaryexceptioni == coveragecosttobeneficiaryexceptionlist.size()-1) {c.addCvgCstToBeneficiaryExceptionPrdStrt("]]");}


		/******************** Cvg_CstToBeneficiary_Exception_Prd_End ********************************************************************************/
		if(coveragecosttobeneficiaryexceptioni == 0) {c.addCvgCstToBeneficiaryExceptionPrdEnd("[[");}
		if(coveragecosttobeneficiaryexceptionperiod.hasEnd()) {

			c.addCvgCstToBeneficiaryExceptionPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(coveragecosttobeneficiaryexceptionperiod.getEnd())+"\"");
		} else {
			c.addCvgCstToBeneficiaryExceptionPrdEnd("NULL");
		}

		if(coveragecosttobeneficiaryexceptioni == coveragecosttobeneficiaryexceptionlist.size()-1) {c.addCvgCstToBeneficiaryExceptionPrdEnd("]]");}


		 };
		/******************** coveragecosttobeneficiarytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragecosttobeneficiarytype = coveragecosttobeneficiary.getType();

		/******************** Cvg_CstToBeneficiary_Typ_Txt ********************************************************************************/
		if(coveragecosttobeneficiarytype.hasText()) {

			c.addCvgCstToBeneficiaryTypTxt(String.valueOf(coveragecosttobeneficiarytype.getText()));
		} else {
			c.addCvgCstToBeneficiaryTypTxt("NULL");
		}


		/******************** coveragecosttobeneficiarytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coveragecosttobeneficiarytypecodinglist = coveragecosttobeneficiarytype.getCoding();
		for(int coveragecosttobeneficiarytypecodingi = 0; coveragecosttobeneficiarytypecodingi<coveragecosttobeneficiarytypecodinglist.size();coveragecosttobeneficiarytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coveragecosttobeneficiarytypecoding = coveragecosttobeneficiarytypecodinglist.get(coveragecosttobeneficiarytypecodingi);

		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Dsply ********************************************************************************/
		if(coveragecosttobeneficiarytypecodingi == 0) {c.addCvgCstToBeneficiaryTypCdgDsply("[[");}
		if(coveragecosttobeneficiarytypecoding.hasDisplay()) {

			c.addCvgCstToBeneficiaryTypCdgDsply(String.valueOf(coveragecosttobeneficiarytypecoding.getDisplay()));
		} else {
			c.addCvgCstToBeneficiaryTypCdgDsply("NULL");
		}

		if(coveragecosttobeneficiarytypecodingi == coveragecosttobeneficiarytypecodinglist.size()-1) {c.addCvgCstToBeneficiaryTypCdgDsply("]]");}


		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Vrsn ********************************************************************************/
		if(coveragecosttobeneficiarytypecodingi == 0) {c.addCvgCstToBeneficiaryTypCdgVrsn("[[");}
		if(coveragecosttobeneficiarytypecoding.hasVersion()) {

			c.addCvgCstToBeneficiaryTypCdgVrsn(String.valueOf(coveragecosttobeneficiarytypecoding.getVersion()));
		} else {
			c.addCvgCstToBeneficiaryTypCdgVrsn("NULL");
		}

		if(coveragecosttobeneficiarytypecodingi == coveragecosttobeneficiarytypecodinglist.size()-1) {c.addCvgCstToBeneficiaryTypCdgVrsn("]]");}


		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Cd ********************************************************************************/
		if(coveragecosttobeneficiarytypecodingi == 0) {c.addCvgCstToBeneficiaryTypCdgCd("[[");}
		if(coveragecosttobeneficiarytypecoding.hasCode()) {

			c.addCvgCstToBeneficiaryTypCdgCd(String.valueOf(coveragecosttobeneficiarytypecoding.getCode()));
		} else {
			c.addCvgCstToBeneficiaryTypCdgCd("NULL");
		}

		if(coveragecosttobeneficiarytypecodingi == coveragecosttobeneficiarytypecodinglist.size()-1) {c.addCvgCstToBeneficiaryTypCdgCd("]]");}


		/******************** Cvg_CstToBeneficiary_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coveragecosttobeneficiarytypecodingi == 0) {c.addCvgCstToBeneficiaryTypCdgUsrSltd("[[");}
		if(coveragecosttobeneficiarytypecoding.hasUserSelected()) {

			c.addCvgCstToBeneficiaryTypCdgUsrSltd(String.valueOf(coveragecosttobeneficiarytypecoding.getUserSelected()));
		} else {
			c.addCvgCstToBeneficiaryTypCdgUsrSltd("NULL");
		}

		if(coveragecosttobeneficiarytypecodingi == coveragecosttobeneficiarytypecodinglist.size()-1) {c.addCvgCstToBeneficiaryTypCdgUsrSltd("]]");}


		/******************** Cvg_CstToBeneficiary_Typ_Cdg_Sys ********************************************************************************/
		if(coveragecosttobeneficiarytypecodingi == 0) {c.addCvgCstToBeneficiaryTypCdgSys("[[");}
		if(coveragecosttobeneficiarytypecoding.hasSystem()) {

			c.addCvgCstToBeneficiaryTypCdgSys(String.valueOf(coveragecosttobeneficiarytypecoding.getSystem()));
		} else {
			c.addCvgCstToBeneficiaryTypCdgSys("NULL");
		}

		if(coveragecosttobeneficiarytypecodingi == coveragecosttobeneficiarytypecodinglist.size()-1) {c.addCvgCstToBeneficiaryTypCdgSys("]]");}


		 };
		/******************** coveragecosttobeneficiaryvaluemoney ********************************************************************************/
		org.hl7.fhir.r4.model.Money coveragecosttobeneficiaryvaluemoney = coveragecosttobeneficiary.getValueMoney();

		/******************** Cvg_CstToBeneficiary_VlMoney_Vl ********************************************************************************/
		if(coveragecosttobeneficiaryvaluemoney.hasValue()) {

			c.addCvgCstToBeneficiaryVlMoneyVl(String.valueOf(coveragecosttobeneficiaryvaluemoney.getValue()));
		} else {
			c.addCvgCstToBeneficiaryVlMoneyVl("NULL");
		}


		/******************** Cvg_CstToBeneficiary_VlMoney_Crncy ********************************************************************************/
		if(coveragecosttobeneficiaryvaluemoney.hasCurrency()) {

			c.addCvgCstToBeneficiaryVlMoneyCrncy(String.valueOf(coveragecosttobeneficiaryvaluemoney.getCurrency()));
		} else {
			c.addCvgCstToBeneficiaryVlMoneyCrncy("NULL");
		}


		/******************** coveragecosttobeneficiaryvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity coveragecosttobeneficiaryvaluequantity = coveragecosttobeneficiary.getValueQuantity();

		/******************** Cvg_CstToBeneficiary_VlQnty_Vl ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasValue()) {

			c.addCvgCstToBeneficiaryVlQntyVl(String.valueOf(coveragecosttobeneficiaryvaluequantity.getValue()));
		} else {
			c.addCvgCstToBeneficiaryVlQntyVl("NULL");
		}


		/******************** coveragecosttobeneficiaryvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator coveragecosttobeneficiaryvaluequantitycomparator = coveragecosttobeneficiaryvaluequantity.getComparator();
		if(coveragecosttobeneficiaryvaluequantitycomparator!=null) {
			c.addCvgCstToBeneficiaryVlQntyCmprtr(coveragecosttobeneficiaryvaluequantitycomparator.toCode());
		} else {
			c.addCvgCstToBeneficiaryVlQntyCmprtr("NULL");
		}

		/******************** Cvg_CstToBeneficiary_VlQnty_Cd ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasCode()) {

			c.addCvgCstToBeneficiaryVlQntyCd(String.valueOf(coveragecosttobeneficiaryvaluequantity.getCode()));
		} else {
			c.addCvgCstToBeneficiaryVlQntyCd("NULL");
		}


		/******************** Cvg_CstToBeneficiary_VlQnty_Unt ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasUnit()) {

			c.addCvgCstToBeneficiaryVlQntyUnt(String.valueOf(coveragecosttobeneficiaryvaluequantity.getUnit()));
		} else {
			c.addCvgCstToBeneficiaryVlQntyUnt("NULL");
		}


		/******************** Cvg_CstToBeneficiary_VlQnty_Sys ********************************************************************************/
		if(coveragecosttobeneficiaryvaluequantity.hasSystem()) {

			c.addCvgCstToBeneficiaryVlQntySys(String.valueOf(coveragecosttobeneficiaryvaluequantity.getSystem()));
		} else {
			c.addCvgCstToBeneficiaryVlQntySys("NULL");
		}


		 };
		/******************** Cvg_PolicyHolder ********************************************************************************/
		if(coverage.hasPolicyHolder()) {

			if(coverage.getPolicyHolder().getReference() != null) {
			c.addCvgPolicyHolder(coverage.getPolicyHolder().getReference());
			}
		} else {
			c.addCvgPolicyHolder("NULL");
		}


		/******************** Cvg_SubscriberId ********************************************************************************/
		if(coverage.hasSubscriberId()) {

			c.addCvgSubscriberId(String.valueOf(coverage.getSubscriberId()));
		} else {
			c.addCvgSubscriberId("NULL");
		}


		/******************** Cvg_Payor ********************************************************************************/
		if(coverage.hasPayor()) {

			String  array = "[";
			for(int incr=0; incr<coverage.getPayor().size(); incr++) {
				array = array + coverage.getPayor().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCvgPayor(array);

		} else {
			c.addCvgPayor("NULL");
		}


		/******************** Cvg_Beneficiary ********************************************************************************/
		if(coverage.hasBeneficiary()) {

			if(coverage.getBeneficiary().getReference() != null) {
			c.addCvgBeneficiary(coverage.getBeneficiary().getReference());
			}
		} else {
			c.addCvgBeneficiary("NULL");
		}


		/******************** coveragerelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coveragerelationship = coverage.getRelationship();

		/******************** Cvg_Rltnship_Txt ********************************************************************************/
		if(coveragerelationship.hasText()) {

			c.addCvgRltnshipTxt(String.valueOf(coveragerelationship.getText()));
		} else {
			c.addCvgRltnshipTxt("NULL");
		}


		/******************** coveragerelationshipcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coveragerelationshipcodinglist = coveragerelationship.getCoding();
		for(int coveragerelationshipcodingi = 0; coveragerelationshipcodingi<coveragerelationshipcodinglist.size();coveragerelationshipcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coveragerelationshipcoding = coveragerelationshipcodinglist.get(coveragerelationshipcodingi);

		/******************** Cvg_Rltnship_Cdg_Dsply ********************************************************************************/
		if(coveragerelationshipcodingi == 0) {c.addCvgRltnshipCdgDsply("[");}
		if(coveragerelationshipcoding.hasDisplay()) {

			c.addCvgRltnshipCdgDsply(String.valueOf(coveragerelationshipcoding.getDisplay()));
		} else {
			c.addCvgRltnshipCdgDsply("NULL");
		}

		if(coveragerelationshipcodingi == coveragerelationshipcodinglist.size()-1) {c.addCvgRltnshipCdgDsply("]");}


		/******************** Cvg_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(coveragerelationshipcodingi == 0) {c.addCvgRltnshipCdgVrsn("[");}
		if(coveragerelationshipcoding.hasVersion()) {

			c.addCvgRltnshipCdgVrsn(String.valueOf(coveragerelationshipcoding.getVersion()));
		} else {
			c.addCvgRltnshipCdgVrsn("NULL");
		}

		if(coveragerelationshipcodingi == coveragerelationshipcodinglist.size()-1) {c.addCvgRltnshipCdgVrsn("]");}


		/******************** Cvg_Rltnship_Cdg_Cd ********************************************************************************/
		if(coveragerelationshipcodingi == 0) {c.addCvgRltnshipCdgCd("[");}
		if(coveragerelationshipcoding.hasCode()) {

			c.addCvgRltnshipCdgCd(String.valueOf(coveragerelationshipcoding.getCode()));
		} else {
			c.addCvgRltnshipCdgCd("NULL");
		}

		if(coveragerelationshipcodingi == coveragerelationshipcodinglist.size()-1) {c.addCvgRltnshipCdgCd("]");}


		/******************** Cvg_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(coveragerelationshipcodingi == 0) {c.addCvgRltnshipCdgUsrSltd("[");}
		if(coveragerelationshipcoding.hasUserSelected()) {

			c.addCvgRltnshipCdgUsrSltd(String.valueOf(coveragerelationshipcoding.getUserSelected()));
		} else {
			c.addCvgRltnshipCdgUsrSltd("NULL");
		}

		if(coveragerelationshipcodingi == coveragerelationshipcodinglist.size()-1) {c.addCvgRltnshipCdgUsrSltd("]");}


		/******************** Cvg_Rltnship_Cdg_Sys ********************************************************************************/
		if(coveragerelationshipcodingi == 0) {c.addCvgRltnshipCdgSys("[");}
		if(coveragerelationshipcoding.hasSystem()) {

			c.addCvgRltnshipCdgSys(String.valueOf(coveragerelationshipcoding.getSystem()));
		} else {
			c.addCvgRltnshipCdgSys("NULL");
		}

		if(coveragerelationshipcodingi == coveragerelationshipcodinglist.size()-1) {c.addCvgRltnshipCdgSys("]");}


		 };
		/******************** Cvg_Subscriber ********************************************************************************/
		if(coverage.hasSubscriber()) {

			if(coverage.getSubscriber().getReference() != null) {
			c.addCvgSubscriber(coverage.getSubscriber().getReference());
			}
		} else {
			c.addCvgSubscriber("NULL");
		}


		/******************** Cvg_Dependent ********************************************************************************/
		if(coverage.hasDependent()) {

			c.addCvgDependent(String.valueOf(coverage.getDependent()));
		} else {
			c.addCvgDependent("NULL");
		}


		/******************** Cvg_Ordr ********************************************************************************/
		if(coverage.hasOrder()) {

			c.addCvgOrdr(String.valueOf(coverage.getOrder()));
		} else {
			c.addCvgOrdr("NULL");
		}


		/******************** Cvg_Network ********************************************************************************/
		if(coverage.hasNetwork()) {

			c.addCvgNetwork(String.valueOf(coverage.getNetwork()));
		} else {
			c.addCvgNetwork("NULL");
		}


		/******************** Cvg_Subrogation ********************************************************************************/
		if(coverage.hasSubrogation()) {

			c.addCvgSubrogation(String.valueOf(coverage.getSubrogation()));
		} else {
			c.addCvgSubrogation("NULL");
		}


		/******************** Cvg_Cnct ********************************************************************************/
		if(coverage.hasContract()) {

			String  array = "[";
			for(int incr=0; incr<coverage.getContract().size(); incr++) {
				array = array + coverage.getContract().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCvgCnct(array);

		} else {
			c.addCvgCnct("NULL");
		}


		/******************** coverageclass_ ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coverage.ClassComponent> coverageclasslist = coverage.getClass_();
		for(int coverageclassi = 0; coverageclassi<coverageclasslist.size();coverageclassi++ ) {
		org.hl7.fhir.r4.model.Coverage.ClassComponent  coverageclass = coverageclasslist.get(coverageclassi);

		/******************** Cvg_Cls__Nm ********************************************************************************/
		if(coverageclassi == 0) {c.addCvgClsNm("[");}
		if(coverageclass.hasName()) {

			c.addCvgClsNm(String.valueOf(coverageclass.getName()));
		} else {
			c.addCvgClsNm("NULL");
		}

		if(coverageclassi == coverageclasslist.size()-1) {c.addCvgClsNm("]");}


		/******************** Cvg_Cls__Vl ********************************************************************************/
		if(coverageclassi == 0) {c.addCvgClsVl("[");}
		if(coverageclass.hasValue()) {

			c.addCvgClsVl(String.valueOf(coverageclass.getValue()));
		} else {
			c.addCvgClsVl("NULL");
		}

		if(coverageclassi == coverageclasslist.size()-1) {c.addCvgClsVl("]");}


		/******************** coverageclasstype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageclasstype = coverageclass.getType();

		/******************** Cvg_Cls__Typ_Txt ********************************************************************************/
		if(coverageclassi == 0) {c.addCvgClsTypTxt("[");}
		if(coverageclasstype.hasText()) {

			c.addCvgClsTypTxt(String.valueOf(coverageclasstype.getText()));
		} else {
			c.addCvgClsTypTxt("NULL");
		}

		if(coverageclassi == coverageclasslist.size()-1) {c.addCvgClsTypTxt("]");}


		/******************** coverageclasstypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> coverageclasstypecodinglist = coverageclasstype.getCoding();
		for(int coverageclasstypecodingi = 0; coverageclasstypecodingi<coverageclasstypecodinglist.size();coverageclasstypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  coverageclasstypecoding = coverageclasstypecodinglist.get(coverageclasstypecodingi);

		/******************** Cvg_Cls__Typ_Cdg_Dsply ********************************************************************************/
		if(coverageclasstypecodingi == 0) {c.addCvgClsTypCdgDsply("[[");}
		if(coverageclasstypecoding.hasDisplay()) {

			c.addCvgClsTypCdgDsply(String.valueOf(coverageclasstypecoding.getDisplay()));
		} else {
			c.addCvgClsTypCdgDsply("NULL");
		}

		if(coverageclasstypecodingi == coverageclasstypecodinglist.size()-1) {c.addCvgClsTypCdgDsply("]]");}


		/******************** Cvg_Cls__Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageclasstypecodingi == 0) {c.addCvgClsTypCdgVrsn("[[");}
		if(coverageclasstypecoding.hasVersion()) {

			c.addCvgClsTypCdgVrsn(String.valueOf(coverageclasstypecoding.getVersion()));
		} else {
			c.addCvgClsTypCdgVrsn("NULL");
		}

		if(coverageclasstypecodingi == coverageclasstypecodinglist.size()-1) {c.addCvgClsTypCdgVrsn("]]");}


		/******************** Cvg_Cls__Typ_Cdg_Cd ********************************************************************************/
		if(coverageclasstypecodingi == 0) {c.addCvgClsTypCdgCd("[[");}
		if(coverageclasstypecoding.hasCode()) {

			c.addCvgClsTypCdgCd(String.valueOf(coverageclasstypecoding.getCode()));
		} else {
			c.addCvgClsTypCdgCd("NULL");
		}

		if(coverageclasstypecodingi == coverageclasstypecodinglist.size()-1) {c.addCvgClsTypCdgCd("]]");}


		/******************** Cvg_Cls__Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageclasstypecodingi == 0) {c.addCvgClsTypCdgUsrSltd("[[");}
		if(coverageclasstypecoding.hasUserSelected()) {

			c.addCvgClsTypCdgUsrSltd(String.valueOf(coverageclasstypecoding.getUserSelected()));
		} else {
			c.addCvgClsTypCdgUsrSltd("NULL");
		}

		if(coverageclasstypecodingi == coverageclasstypecodinglist.size()-1) {c.addCvgClsTypCdgUsrSltd("]]");}


		/******************** Cvg_Cls__Typ_Cdg_Sys ********************************************************************************/
		if(coverageclasstypecodingi == 0) {c.addCvgClsTypCdgSys("[[");}
		if(coverageclasstypecoding.hasSystem()) {

			c.addCvgClsTypCdgSys(String.valueOf(coverageclasstypecoding.getSystem()));
		} else {
			c.addCvgClsTypCdgSys("NULL");
		}

		if(coverageclasstypecodingi == coverageclasstypecodinglist.size()-1) {c.addCvgClsTypCdgSys("]]");}


		 };
		 };
		return c;
	}
}
