package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.HealthcareService;
public class HealthcareServiceBidirectionalConversion 
{
	public HealthcareService HealthcareServices(org.hl7.fhir.r4.model.HealthcareService healthcareservice) throws ParseException
	{
		 main.java.com.campfhir.model.HealthcareService h = new  main.java.com.campfhir.model.HealthcareService();

		/******************** id ********************************************************************************/
		healthcareservice.setId(h.getId());

		/******************** HlthcrSrv_Nm ********************************************************************************/
		if(healthcareservice.hasName()) {
			h.setHlthcrSrvNm(String.valueOf(healthcareservice.getName()));
		}
		/******************** HlthcrSrv_Comment ********************************************************************************/
		if(healthcareservice.hasComment()) {
			h.setHlthcrSrvComment(String.valueOf(healthcareservice.getComment()));
		}
		/******************** healthcareservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicetype = healthcareservice.getTypeFirstRep();

		/******************** HlthcrSrv_Typ_Txt ********************************************************************************/
		if(healthcareservicetype.hasText()) {
			h.setHlthcrSrvTypTxt(String.valueOf(healthcareservicetype.getText()));
		}
		/******************** healthcareservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicetypecoding = healthcareservicetype.getCodingFirstRep();

		/******************** HlthcrSrv_Typ_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicetypecoding.hasVersion()) {
			h.setHlthcrSrvTypCdgVrsn(String.valueOf(healthcareservicetypecoding.getVersion()));
		}
		/******************** HlthcrSrv_Typ_Cdg_Dsply ********************************************************************************/
		if(healthcareservicetypecoding.hasDisplay()) {
			h.setHlthcrSrvTypCdgDsply(String.valueOf(healthcareservicetypecoding.getDisplay()));
		}
		/******************** HlthcrSrv_Typ_Cdg_Cd ********************************************************************************/
		if(healthcareservicetypecoding.hasCode()) {
			h.setHlthcrSrvTypCdgCd(String.valueOf(healthcareservicetypecoding.getCode()));
		}
		/******************** HlthcrSrv_Typ_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicetypecoding.hasUserSelected()) {
			h.setHlthcrSrvTypCdgUsrSltd(String.valueOf(healthcareservicetypecoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Typ_Cdg_Sys ********************************************************************************/
		if(healthcareservicetypecoding.hasSystem()) {
			h.setHlthcrSrvTypCdgSys(String.valueOf(healthcareservicetypecoding.getSystem()));
		}
		/******************** HlthcrSrv_ProvidedBy ********************************************************************************/
		if(healthcareservice.hasProvidedBy()) {
			h.setHlthcrSrvProvidedBy(String.valueOf(healthcareservice.getProvidedBy()));
		}
		/******************** healthcareserviceprogram ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceprogram = healthcareservice.getProgramFirstRep();

		/******************** HlthcrSrv_Prgrm_Txt ********************************************************************************/
		if(healthcareserviceprogram.hasText()) {
			h.setHlthcrSrvPrgrmTxt(String.valueOf(healthcareserviceprogram.getText()));
		}
		/******************** healthcareserviceprogramcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceprogramcoding = healthcareserviceprogram.getCodingFirstRep();

		/******************** HlthcrSrv_Prgrm_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceprogramcoding.hasVersion()) {
			h.setHlthcrSrvPrgrmCdgVrsn(String.valueOf(healthcareserviceprogramcoding.getVersion()));
		}
		/******************** HlthcrSrv_Prgrm_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceprogramcoding.hasDisplay()) {
			h.setHlthcrSrvPrgrmCdgDsply(String.valueOf(healthcareserviceprogramcoding.getDisplay()));
		}
		/******************** HlthcrSrv_Prgrm_Cdg_Cd ********************************************************************************/
		if(healthcareserviceprogramcoding.hasCode()) {
			h.setHlthcrSrvPrgrmCdgCd(String.valueOf(healthcareserviceprogramcoding.getCode()));
		}
		/******************** HlthcrSrv_Prgrm_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceprogramcoding.hasUserSelected()) {
			h.setHlthcrSrvPrgrmCdgUsrSltd(String.valueOf(healthcareserviceprogramcoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Prgrm_Cdg_Sys ********************************************************************************/
		if(healthcareserviceprogramcoding.hasSystem()) {
			h.setHlthcrSrvPrgrmCdgSys(String.valueOf(healthcareserviceprogramcoding.getSystem()));
		}
		/******************** HlthcrSrv_ExtraDtls ********************************************************************************/
		if(healthcareservice.hasExtraDetails()) {
			h.setHlthcrSrvExtraDtls(String.valueOf(healthcareservice.getExtraDetails()));
		}
		/******************** HlthcrSrv_Active ********************************************************************************/
		if(healthcareservice.hasActive()) {
			h.setHlthcrSrvActive(String.valueOf(healthcareservice.getActive()));
		}
		/******************** healthcareservicephoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment healthcareservicephoto = healthcareservice.getPhoto();

		/******************** HlthcrSrv_Photo_Sz ********************************************************************************/
		if(healthcareservicephoto.hasSize()) {
			h.setHlthcrSrvPhotoSz(String.valueOf(healthcareservicephoto.getSize()));
		}
		/******************** HlthcrSrv_Photo_Lnguage ********************************************************************************/
		if(healthcareservicephoto.hasLanguage()) {
			h.setHlthcrSrvPhotoLnguage(String.valueOf(healthcareservicephoto.getLanguage()));
		}
		/******************** HlthcrSrv_Photo_CntntTyp ********************************************************************************/
		if(healthcareservicephoto.hasContentType()) {
			h.setHlthcrSrvPhotoCntntTyp(String.valueOf(healthcareservicephoto.getContentType()));
		}
		/******************** HlthcrSrv_Photo_Ttl ********************************************************************************/
		if(healthcareservicephoto.hasTitle()) {
			h.setHlthcrSrvPhotoTtl(String.valueOf(healthcareservicephoto.getTitle()));
		}
		/******************** HlthcrSrv_Photo_Url ********************************************************************************/
		if(healthcareservicephoto.hasUrl()) {
			h.setHlthcrSrvPhotoUrl(String.valueOf(healthcareservicephoto.getUrl()));
		}
		/******************** HlthcrSrv_Photo_Data ********************************************************************************/
		if(healthcareservicephoto.hasData()) {
			h.setHlthcrSrvPhotoData(String.valueOf(healthcareservicephoto.getData()));
		}

		/******************** HlthcrSrv_Photo_Hash ********************************************************************************/
		if(healthcareservicephoto.hasHash()) {
			h.setHlthcrSrvPhotoHash(String.valueOf(healthcareservicephoto.getHash()));
		}

		/******************** HlthcrSrv_Photo_Creation ********************************************************************************/
		if(healthcareservicephoto.hasCreation()) {
			h.setHlthcrSrvPhotoCreation(String.valueOf(healthcareservicephoto.getCreation()));
		}
		/******************** healthcareservicetelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint healthcareservicetelecom = healthcareservice.getTelecomFirstRep();

		/******************** HlthcrSrv_Tlcm_Vl ********************************************************************************/
		if(healthcareservicetelecom.hasValue()) {
			h.setHlthcrSrvTlcmVl(String.valueOf(healthcareservicetelecom.getValue()));
		}
		/******************** healthcareservicetelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareservicetelecomperiod = healthcareservicetelecom.getPeriod();

		/******************** HlthcrSrv_Tlcm_Prd_Strt ********************************************************************************/
		if(healthcareservicetelecomperiod.hasStart()) {
			h.setHlthcrSrvTlcmPrdStrt(String.valueOf(healthcareservicetelecomperiod.getStart()));
		}
		/******************** HlthcrSrv_Tlcm_Prd_End ********************************************************************************/
		if(healthcareservicetelecomperiod.hasEnd()) {
			h.setHlthcrSrvTlcmPrdEnd(String.valueOf(healthcareservicetelecomperiod.getEnd()));
		}
		/******************** healthcareservicetelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem healthcareservicetelecomsystem = healthcareservicetelecom.getSystem();
		h.setHlthcrSrvTlcmSys(healthcareservicetelecomsystem.toCode());

		/******************** healthcareservicetelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse healthcareservicetelecomuse = healthcareservicetelecom.getUse();
		h.setHlthcrSrvTlcmUse(healthcareservicetelecomuse.toCode());

		/******************** HlthcrSrv_Tlcm_Rnk ********************************************************************************/
		if(healthcareservicetelecom.hasRank()) {
			h.setHlthcrSrvTlcmRnk(String.valueOf(healthcareservicetelecom.getRank()));
		}
		/******************** HlthcrSrv_Lctn ********************************************************************************/
		if(healthcareservice.hasLocation()) {
			h.setHlthcrSrvLctn(String.valueOf(healthcareservice.getLocationFirstRep()));
		}
		/******************** healthcareservicespecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicespecialty = healthcareservice.getSpecialtyFirstRep();

		/******************** HlthcrSrv_Spclty_Txt ********************************************************************************/
		if(healthcareservicespecialty.hasText()) {
			h.setHlthcrSrvSpcltyTxt(String.valueOf(healthcareservicespecialty.getText()));
		}
		/******************** healthcareservicespecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicespecialtycoding = healthcareservicespecialty.getCodingFirstRep();

		/******************** HlthcrSrv_Spclty_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicespecialtycoding.hasVersion()) {
			h.setHlthcrSrvSpcltyCdgVrsn(String.valueOf(healthcareservicespecialtycoding.getVersion()));
		}
		/******************** HlthcrSrv_Spclty_Cdg_Dsply ********************************************************************************/
		if(healthcareservicespecialtycoding.hasDisplay()) {
			h.setHlthcrSrvSpcltyCdgDsply(String.valueOf(healthcareservicespecialtycoding.getDisplay()));
		}
		/******************** HlthcrSrv_Spclty_Cdg_Cd ********************************************************************************/
		if(healthcareservicespecialtycoding.hasCode()) {
			h.setHlthcrSrvSpcltyCdgCd(String.valueOf(healthcareservicespecialtycoding.getCode()));
		}
		/******************** HlthcrSrv_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicespecialtycoding.hasUserSelected()) {
			h.setHlthcrSrvSpcltyCdgUsrSltd(String.valueOf(healthcareservicespecialtycoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Spclty_Cdg_Sys ********************************************************************************/
		if(healthcareservicespecialtycoding.hasSystem()) {
			h.setHlthcrSrvSpcltyCdgSys(String.valueOf(healthcareservicespecialtycoding.getSystem()));
		}
		/******************** healthcareservicecommunication ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicecommunication = healthcareservice.getCommunicationFirstRep();

		/******************** HlthcrSrv_Cmmnctn_Txt ********************************************************************************/
		if(healthcareservicecommunication.hasText()) {
			h.setHlthcrSrvCmmnctnTxt(String.valueOf(healthcareservicecommunication.getText()));
		}
		/******************** healthcareservicecommunicationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicecommunicationcoding = healthcareservicecommunication.getCodingFirstRep();

		/******************** HlthcrSrv_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicecommunicationcoding.hasVersion()) {
			h.setHlthcrSrvCmmnctnCdgVrsn(String.valueOf(healthcareservicecommunicationcoding.getVersion()));
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(healthcareservicecommunicationcoding.hasDisplay()) {
			h.setHlthcrSrvCmmnctnCdgDsply(String.valueOf(healthcareservicecommunicationcoding.getDisplay()));
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(healthcareservicecommunicationcoding.hasCode()) {
			h.setHlthcrSrvCmmnctnCdgCd(String.valueOf(healthcareservicecommunicationcoding.getCode()));
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicecommunicationcoding.hasUserSelected()) {
			h.setHlthcrSrvCmmnctnCdgUsrSltd(String.valueOf(healthcareservicecommunicationcoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(healthcareservicecommunicationcoding.hasSystem()) {
			h.setHlthcrSrvCmmnctnCdgSys(String.valueOf(healthcareservicecommunicationcoding.getSystem()));
		}
		/******************** healthcareserviceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier healthcareserviceidentifier = healthcareservice.getIdentifierFirstRep();

		/******************** HlthcrSrv_Id_Vl ********************************************************************************/
		if(healthcareserviceidentifier.hasValue()) {
			h.setHlthcrSrvIdVl(String.valueOf(healthcareserviceidentifier.getValue()));
		}
		/******************** healthcareserviceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceidentifiertype = healthcareserviceidentifier.getType();

		/******************** HlthcrSrv_Id_Typ_Txt ********************************************************************************/
		if(healthcareserviceidentifiertype.hasText()) {
			h.setHlthcrSrvIdTypTxt(String.valueOf(healthcareserviceidentifiertype.getText()));
		}
		/******************** healthcareserviceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceidentifiertypecoding = healthcareserviceidentifiertype.getCodingFirstRep();

		/******************** HlthcrSrv_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceidentifiertypecoding.hasVersion()) {
			h.setHlthcrSrvIdTypCdgVrsn(String.valueOf(healthcareserviceidentifiertypecoding.getVersion()));
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceidentifiertypecoding.hasDisplay()) {
			h.setHlthcrSrvIdTypCdgDsply(String.valueOf(healthcareserviceidentifiertypecoding.getDisplay()));
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Cd ********************************************************************************/
		if(healthcareserviceidentifiertypecoding.hasCode()) {
			h.setHlthcrSrvIdTypCdgCd(String.valueOf(healthcareserviceidentifiertypecoding.getCode()));
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceidentifiertypecoding.hasUserSelected()) {
			h.setHlthcrSrvIdTypCdgUsrSltd(String.valueOf(healthcareserviceidentifiertypecoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Id_Typ_Cdg_Sys ********************************************************************************/
		if(healthcareserviceidentifiertypecoding.hasSystem()) {
			h.setHlthcrSrvIdTypCdgSys(String.valueOf(healthcareserviceidentifiertypecoding.getSystem()));
		}
		/******************** healthcareserviceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareserviceidentifierperiod = healthcareserviceidentifier.getPeriod();

		/******************** HlthcrSrv_Id_Prd_Strt ********************************************************************************/
		if(healthcareserviceidentifierperiod.hasStart()) {
			h.setHlthcrSrvIdPrdStrt(String.valueOf(healthcareserviceidentifierperiod.getStart()));
		}
		/******************** HlthcrSrv_Id_Prd_End ********************************************************************************/
		if(healthcareserviceidentifierperiod.hasEnd()) {
			h.setHlthcrSrvIdPrdEnd(String.valueOf(healthcareserviceidentifierperiod.getEnd()));
		}
		/******************** HlthcrSrv_Id_Assigner ********************************************************************************/
		if(healthcareserviceidentifier.hasAssigner()) {
			h.setHlthcrSrvIdAssigner(String.valueOf(healthcareserviceidentifier.getAssigner()));
		}
		/******************** HlthcrSrv_Id_Sys ********************************************************************************/
		if(healthcareserviceidentifier.hasSystem()) {
			h.setHlthcrSrvIdSys(String.valueOf(healthcareserviceidentifier.getSystem()));
		}
		/******************** healthcareserviceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse healthcareserviceidentifieruse = healthcareserviceidentifier.getUse();
		h.setHlthcrSrvIdUse(healthcareserviceidentifieruse.toCode());

		/******************** HlthcrSrv_Endpoint ********************************************************************************/
		if(healthcareservice.hasEndpoint()) {
			h.setHlthcrSrvEndpoint(String.valueOf(healthcareservice.getEndpointFirstRep()));
		}
		/******************** healthcareservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicecategory = healthcareservice.getCategoryFirstRep();

		/******************** HlthcrSrv_Ctgry_Txt ********************************************************************************/
		if(healthcareservicecategory.hasText()) {
			h.setHlthcrSrvCtgryTxt(String.valueOf(healthcareservicecategory.getText()));
		}
		/******************** healthcareservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicecategorycoding = healthcareservicecategory.getCodingFirstRep();

		/******************** HlthcrSrv_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicecategorycoding.hasVersion()) {
			h.setHlthcrSrvCtgryCdgVrsn(String.valueOf(healthcareservicecategorycoding.getVersion()));
		}
		/******************** HlthcrSrv_Ctgry_Cdg_Dsply ********************************************************************************/
		if(healthcareservicecategorycoding.hasDisplay()) {
			h.setHlthcrSrvCtgryCdgDsply(String.valueOf(healthcareservicecategorycoding.getDisplay()));
		}
		/******************** HlthcrSrv_Ctgry_Cdg_Cd ********************************************************************************/
		if(healthcareservicecategorycoding.hasCode()) {
			h.setHlthcrSrvCtgryCdgCd(String.valueOf(healthcareservicecategorycoding.getCode()));
		}
		/******************** HlthcrSrv_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicecategorycoding.hasUserSelected()) {
			h.setHlthcrSrvCtgryCdgUsrSltd(String.valueOf(healthcareservicecategorycoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Ctgry_Cdg_Sys ********************************************************************************/
		if(healthcareservicecategorycoding.hasSystem()) {
			h.setHlthcrSrvCtgryCdgSys(String.valueOf(healthcareservicecategorycoding.getSystem()));
		}
		/******************** HlthcrSrv_AvailabilityExceptions ********************************************************************************/
		if(healthcareservice.hasAvailabilityExceptions()) {
			h.setHlthcrSrvAvailabilityExceptions(String.valueOf(healthcareservice.getAvailabilityExceptions()));
		}
		/******************** healthcareservicenotavailable ********************************************************************************/
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceNotAvailableComponent healthcareservicenotavailable = healthcareservice.getNotAvailableFirstRep();

		/******************** HlthcrSrv_NotAvailable_Dscrptn ********************************************************************************/
		if(healthcareservicenotavailable.hasDescription()) {
			h.setHlthcrSrvNotAvailableDscrptn(String.valueOf(healthcareservicenotavailable.getDescription()));
		}
		/******************** healthcareservicenotavailableduring ********************************************************************************/
		org.hl7.fhir.r4.model.Period healthcareservicenotavailableduring = healthcareservicenotavailable.getDuring();

		/******************** HlthcrSrv_NotAvailable_During_Strt ********************************************************************************/
		if(healthcareservicenotavailableduring.hasStart()) {
			h.setHlthcrSrvNotAvailableDuringStrt(String.valueOf(healthcareservicenotavailableduring.getStart()));
		}
		/******************** HlthcrSrv_NotAvailable_During_End ********************************************************************************/
		if(healthcareservicenotavailableduring.hasEnd()) {
			h.setHlthcrSrvNotAvailableDuringEnd(String.valueOf(healthcareservicenotavailableduring.getEnd()));
		}
		/******************** healthcareserviceavailabletime ********************************************************************************/
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceAvailableTimeComponent healthcareserviceavailabletime = healthcareservice.getAvailableTimeFirstRep();

		/******************** HlthcrSrv_AvailableTime_AvailableEndTime ********************************************************************************/
		if(healthcareserviceavailabletime.hasAvailableEndTime()) {
			h.setHlthcrSrvAvailableTimeAvailableEndTime(String.valueOf(healthcareserviceavailabletime.getAvailableEndTime()));
		}
		/******************** HlthcrSrv_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(healthcareserviceavailabletime.hasAvailableStartTime()) {
			h.setHlthcrSrvAvailableTimeAvailableStrtTime(String.valueOf(healthcareserviceavailabletime.getAvailableStartTime()));
		}
		/******************** HlthcrSrv_AvailableTime_AllDay ********************************************************************************/
		if(healthcareserviceavailabletime.hasAllDay()) {
			h.setHlthcrSrvAvailableTimeAllDay(String.valueOf(healthcareserviceavailabletime.getAllDay()));
		}
		/******************** HlthcrSrv_CvgArea ********************************************************************************/
		if(healthcareservice.hasCoverageArea()) {
			h.setHlthcrSrvCvgArea(String.valueOf(healthcareservice.getCoverageAreaFirstRep()));
		}
		/******************** healthcareservicecharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicecharacteristic = healthcareservice.getCharacteristicFirstRep();

		/******************** HlthcrSrv_Crctrstc_Txt ********************************************************************************/
		if(healthcareservicecharacteristic.hasText()) {
			h.setHlthcrSrvCrctrstcTxt(String.valueOf(healthcareservicecharacteristic.getText()));
		}
		/******************** healthcareservicecharacteristiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicecharacteristiccoding = healthcareservicecharacteristic.getCodingFirstRep();

		/******************** HlthcrSrv_Crctrstc_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicecharacteristiccoding.hasVersion()) {
			h.setHlthcrSrvCrctrstcCdgVrsn(String.valueOf(healthcareservicecharacteristiccoding.getVersion()));
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Dsply ********************************************************************************/
		if(healthcareservicecharacteristiccoding.hasDisplay()) {
			h.setHlthcrSrvCrctrstcCdgDsply(String.valueOf(healthcareservicecharacteristiccoding.getDisplay()));
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Cd ********************************************************************************/
		if(healthcareservicecharacteristiccoding.hasCode()) {
			h.setHlthcrSrvCrctrstcCdgCd(String.valueOf(healthcareservicecharacteristiccoding.getCode()));
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicecharacteristiccoding.hasUserSelected()) {
			h.setHlthcrSrvCrctrstcCdgUsrSltd(String.valueOf(healthcareservicecharacteristiccoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Crctrstc_Cdg_Sys ********************************************************************************/
		if(healthcareservicecharacteristiccoding.hasSystem()) {
			h.setHlthcrSrvCrctrstcCdgSys(String.valueOf(healthcareservicecharacteristiccoding.getSystem()));
		}
		/******************** healthcareserviceeligibility ********************************************************************************/
		org.hl7.fhir.r4.model.HealthcareService.HealthcareServiceEligibilityComponent healthcareserviceeligibility = healthcareservice.getEligibilityFirstRep();

		/******************** HlthcrSrv_Elgblty_Comment ********************************************************************************/
		if(healthcareserviceeligibility.hasComment()) {
			h.setHlthcrSrvElgbltyComment(String.valueOf(healthcareserviceeligibility.getComment()));
		}
		/******************** healthcareserviceeligibilitycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceeligibilitycode = healthcareserviceeligibility.getCode();

		/******************** HlthcrSrv_Elgblty_Cd_Txt ********************************************************************************/
		if(healthcareserviceeligibilitycode.hasText()) {
			h.setHlthcrSrvElgbltyCdTxt(String.valueOf(healthcareserviceeligibilitycode.getText()));
		}
		/******************** healthcareserviceeligibilitycodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceeligibilitycodecoding = healthcareserviceeligibilitycode.getCodingFirstRep();

		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceeligibilitycodecoding.hasVersion()) {
			h.setHlthcrSrvElgbltyCdCdgVrsn(String.valueOf(healthcareserviceeligibilitycodecoding.getVersion()));
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceeligibilitycodecoding.hasDisplay()) {
			h.setHlthcrSrvElgbltyCdCdgDsply(String.valueOf(healthcareserviceeligibilitycodecoding.getDisplay()));
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Cd ********************************************************************************/
		if(healthcareserviceeligibilitycodecoding.hasCode()) {
			h.setHlthcrSrvElgbltyCdCdgCd(String.valueOf(healthcareserviceeligibilitycodecoding.getCode()));
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceeligibilitycodecoding.hasUserSelected()) {
			h.setHlthcrSrvElgbltyCdCdgUsrSltd(String.valueOf(healthcareserviceeligibilitycodecoding.getUserSelected()));
		}
		/******************** HlthcrSrv_Elgblty_Cd_Cdg_Sys ********************************************************************************/
		if(healthcareserviceeligibilitycodecoding.hasSystem()) {
			h.setHlthcrSrvElgbltyCdCdgSys(String.valueOf(healthcareserviceeligibilitycodecoding.getSystem()));
		}
		/******************** healthcareservicereferralmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareservicereferralmethod = healthcareservice.getReferralMethodFirstRep();

		/******************** HlthcrSrv_ReferralMthd_Txt ********************************************************************************/
		if(healthcareservicereferralmethod.hasText()) {
			h.setHlthcrSrvReferralMthdTxt(String.valueOf(healthcareservicereferralmethod.getText()));
		}
		/******************** healthcareservicereferralmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareservicereferralmethodcoding = healthcareservicereferralmethod.getCodingFirstRep();

		/******************** HlthcrSrv_ReferralMthd_Cdg_Vrsn ********************************************************************************/
		if(healthcareservicereferralmethodcoding.hasVersion()) {
			h.setHlthcrSrvReferralMthdCdgVrsn(String.valueOf(healthcareservicereferralmethodcoding.getVersion()));
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Dsply ********************************************************************************/
		if(healthcareservicereferralmethodcoding.hasDisplay()) {
			h.setHlthcrSrvReferralMthdCdgDsply(String.valueOf(healthcareservicereferralmethodcoding.getDisplay()));
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Cd ********************************************************************************/
		if(healthcareservicereferralmethodcoding.hasCode()) {
			h.setHlthcrSrvReferralMthdCdgCd(String.valueOf(healthcareservicereferralmethodcoding.getCode()));
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_UsrSltd ********************************************************************************/
		if(healthcareservicereferralmethodcoding.hasUserSelected()) {
			h.setHlthcrSrvReferralMthdCdgUsrSltd(String.valueOf(healthcareservicereferralmethodcoding.getUserSelected()));
		}
		/******************** HlthcrSrv_ReferralMthd_Cdg_Sys ********************************************************************************/
		if(healthcareservicereferralmethodcoding.hasSystem()) {
			h.setHlthcrSrvReferralMthdCdgSys(String.valueOf(healthcareservicereferralmethodcoding.getSystem()));
		}
		/******************** HlthcrSrv_AppmntRequired ********************************************************************************/
		if(healthcareservice.hasAppointmentRequired()) {
			h.setHlthcrSrvAppmntRequired(String.valueOf(healthcareservice.getAppointmentRequired()));
		}
		/******************** healthcareserviceserviceprovisioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept healthcareserviceserviceprovisioncode = healthcareservice.getServiceProvisionCodeFirstRep();

		/******************** HlthcrSrv_SrvProvisionCd_Txt ********************************************************************************/
		if(healthcareserviceserviceprovisioncode.hasText()) {
			h.setHlthcrSrvSrvProvisionCdTxt(String.valueOf(healthcareserviceserviceprovisioncode.getText()));
		}
		/******************** healthcareserviceserviceprovisioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding healthcareserviceserviceprovisioncodecoding = healthcareserviceserviceprovisioncode.getCodingFirstRep();

		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Vrsn ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecoding.hasVersion()) {
			h.setHlthcrSrvSrvProvisionCdCdgVrsn(String.valueOf(healthcareserviceserviceprovisioncodecoding.getVersion()));
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Dsply ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecoding.hasDisplay()) {
			h.setHlthcrSrvSrvProvisionCdCdgDsply(String.valueOf(healthcareserviceserviceprovisioncodecoding.getDisplay()));
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Cd ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecoding.hasCode()) {
			h.setHlthcrSrvSrvProvisionCdCdgCd(String.valueOf(healthcareserviceserviceprovisioncodecoding.getCode()));
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_UsrSltd ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecoding.hasUserSelected()) {
			h.setHlthcrSrvSrvProvisionCdCdgUsrSltd(String.valueOf(healthcareserviceserviceprovisioncodecoding.getUserSelected()));
		}
		/******************** HlthcrSrv_SrvProvisionCd_Cdg_Sys ********************************************************************************/
		if(healthcareserviceserviceprovisioncodecoding.hasSystem()) {
			h.setHlthcrSrvSrvProvisionCdCdgSys(String.valueOf(healthcareserviceserviceprovisioncodecoding.getSystem()));
		}
		return h;
	}
}
