//package main.java.com.campfhir.service.conversion;
//import java.text.ParseException;
//import main.java.com.campfhir.model.SubstanceSpecification;
//public class SubstanceSpecificationConversion 
//{
//	public org.hl7.fhir.r4.model.SubstanceSpecification SubstanceSpecifications(SubstanceSpecification s) throws ParseException
//	{
//		org.hl7.fhir.r4.model.SubstanceSpecification substancespecification = new org.hl7.fhir.r4.model.SubstanceSpecification();
//
//		/******************** id ********************************************************************************/
//		substancespecification.setId(s.getId());
//
//		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnCdCdCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnCdCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getCode().size() < i0+1) { substancespecification.addCode(); }
//				String[] arrayi1 = s.getSbstncSpcfctnCdCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getCode().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getCode().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getCode().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnCdCdCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnCdCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getCode().size() < i0+1) { substancespecification.addCode(); }
//				String[] arrayi1 = s.getSbstncSpcfctnCdCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getCode().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getCode().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getCode().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnCdCdCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnCdCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getCode().size() < i0+1) { substancespecification.addCode(); }
//				String[] arrayi1 = s.getSbstncSpcfctnCdCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getCode().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getCode().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getCode().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Cd_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnCdCdCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnCdCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getCode().size() < i0+1) { substancespecification.addCode(); }
//				String[] arrayi1 = s.getSbstncSpcfctnCdCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getCode().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getCode().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getCode().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Cd_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnCdCdCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnCdCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getCode().size() < i0+1) { substancespecification.addCode(); }
//				String[] arrayi1 = s.getSbstncSpcfctnCdCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getCode().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getCode().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getCode().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Cd_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnCdCdTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnCdCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getCode().size() < i0+1) { substancespecification.addCode(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getCode().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Comment ********************************************************************************/
//		if(s.getSbstncSpcfctnCdComment() != null ) {
//
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Src ********************************************************************************/
//		if(s.getSbstncSpcfctnCdSrc() != null ) {
//
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnCdStsCdgCd() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnCdStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStatus().getCoding().size() < i1+1) { substancespecification.getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnCdStsCdgDsply() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnCdStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStatus().getCoding().size() < i1+1) { substancespecification.getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnCdStsCdgSys() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnCdStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStatus().getCoding().size() < i1+1) { substancespecification.getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Sts_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnCdStsCdgUsrSltd() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnCdStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStatus().getCoding().size() < i1+1) { substancespecification.getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Sts_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnCdStsCdgVrsn() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnCdStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStatus().getCoding().size() < i1+1) { substancespecification.getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_Sts_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnCdStsTxt() != null ) {
//
//			}
//
//		}
//		/******************** SbstncSpcfctn_Cd_StsDt ********************************************************************************/
//		if(s.getSbstncSpcfctnCdStsDt() != null ) {
//
//			}
//
//		}
//		/******************** SbstncSpcfctn_Comment ********************************************************************************/
//		if(s.getSbstncSpcfctnComment() != null ) {
//
//			if(s.getSbstncSpcfctnComment().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnComment()==null) {} else {
//			substancespecification.setComment(s.getSbstncSpcfctnComment().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Dscrptn ********************************************************************************/
//		if(s.getSbstncSpcfctnDscrptn() != null ) {
//
//			if(s.getSbstncSpcfctnDscrptn().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnDscrptn()==null) {} else {
//			substancespecification.setDescription(s.getSbstncSpcfctnDscrptn().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Domain_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnDomainCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnDomainCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getDomain().getCoding().size() < i0+1) { substancespecification.getDomain().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getDomain().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Domain_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnDomainCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnDomainCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getDomain().getCoding().size() < i0+1) { substancespecification.getDomain().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getDomain().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Domain_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnDomainCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnDomainCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getDomain().getCoding().size() < i0+1) { substancespecification.getDomain().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getDomain().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Domain_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnDomainCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnDomainCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getDomain().getCoding().size() < i0+1) { substancespecification.getDomain().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getDomain().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Domain_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnDomainCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnDomainCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getDomain().getCoding().size() < i0+1) { substancespecification.getDomain().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getDomain().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Domain_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnDomainTxt() != null ) {
//
//			if(s.getSbstncSpcfctnDomainTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnDomainTxt()==null) {} else {
//			substancespecification.getDomain().setText(s.getSbstncSpcfctnDomainTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Id_Assigner ********************************************************************************/
//		if(s.getSbstncSpcfctnIdAssigner() != null ) {
//
//			if(s.getSbstncSpcfctnIdAssigner().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdAssigner()==null) {} else {
//			substancespecification.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnIdAssigner().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Id_Prd_End ********************************************************************************/
//		if(s.getSbstncSpcfctnIdPrdEnd() != null ) {
//
//			if(s.getSbstncSpcfctnIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdPrdEnd()==null) {} else {
//			substancespecification.getIdentifier().getPeriod().setEnd(s.getSbstncSpcfctnIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSbstncSpcfctnIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Id_Prd_Strt ********************************************************************************/
//		if(s.getSbstncSpcfctnIdPrdStrt() != null ) {
//
//			if(s.getSbstncSpcfctnIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdPrdStrt()==null) {} else {
//			substancespecification.getIdentifier().getPeriod().setStart(s.getSbstncSpcfctnIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSbstncSpcfctnIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Id_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnIdSys() != null ) {
//
//			if(s.getSbstncSpcfctnIdSys().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdSys()==null) {} else {
//			substancespecification.getIdentifier().setSystem(s.getSbstncSpcfctnIdSys().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Id_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnIdTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getIdentifier().getType().getCoding().size() < i0+1) { substancespecification.getIdentifier().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Id_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnIdTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getIdentifier().getType().getCoding().size() < i0+1) { substancespecification.getIdentifier().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Id_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnIdTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getIdentifier().getType().getCoding().size() < i0+1) { substancespecification.getIdentifier().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnIdTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getIdentifier().getType().getCoding().size() < i0+1) { substancespecification.getIdentifier().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnIdTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getIdentifier().getType().getCoding().size() < i0+1) { substancespecification.getIdentifier().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Id_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnIdTypTxt() != null ) {
//
//			if(s.getSbstncSpcfctnIdTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdTypTxt()==null) {} else {
//			substancespecification.getIdentifier().getType().setText(s.getSbstncSpcfctnIdTypTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Id_Use ********************************************************************************/
//		if(s.getSbstncSpcfctnIdUse() != null ) {
//
//			if(s.getSbstncSpcfctnIdUse().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdUse()==null) {} else {
//			substancespecification.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(s.getSbstncSpcfctnIdUse().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Id_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnIdVl() != null ) {
//
//			if(s.getSbstncSpcfctnIdVl().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnIdVl()==null) {} else {
//			substancespecification.getIdentifier().setValue(s.getSbstncSpcfctnIdVl().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Moiety_AmntQnty_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyAmntQntyCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getAmountQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_AmntQnty_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyAmntQntyCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getAmountQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_AmntQnty_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyAmntQntySys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getAmountQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_AmntQnty_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyAmntQntyUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getAmountQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_AmntQnty_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyAmntQntyVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getAmountQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_AmntStrgTyp ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyAmntStrgTyp() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).setAmount(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Assigner ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdAssigner() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Prd_End ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdPrdEnd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Prd_Strt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdPrdStrt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdTypTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Use ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdUse() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Id_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyIdVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_MoleclrFrmula ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyMoleclrFrmula() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyMoleclrFrmula().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).setMolecularFormula(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Nm ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyNm() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getOpticalActivity().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getOpticalActivity().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getOpticalActivity().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getOpticalActivity().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyOpticalActvtyCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyOpticalActvtyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getOpticalActivity().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getOpticalActivity().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_OpticalActvty_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyOpticalActvtyTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyOpticalActvtyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getOpticalActivity().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyRoleCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getRole().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getRole().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getRole().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyRoleCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getRole().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getRole().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getRole().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyRoleCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getRole().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getRole().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getRole().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Role_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyRoleCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getRole().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getRole().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getRole().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Role_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyRoleCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getRole().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getRole().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getRole().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Role_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyRoleTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getRole().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyStereochemistryCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyStereochemistryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyStereochemistryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getStereochemistry().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyStereochemistryCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyStereochemistryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyStereochemistryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getStereochemistry().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyStereochemistryCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyStereochemistryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyStereochemistryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getStereochemistry().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyStereochemistryCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyStereochemistryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyStereochemistryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getStereochemistry().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyStereochemistryCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyStereochemistryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoietyStereochemistryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().size() < i1+1) { substancespecification.getMoiety().get(i0).getStereochemistry().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMoiety().get(i0).getStereochemistry().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Moiety_Stereochemistry_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoietyStereochemistryTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoietyStereochemistryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMoiety().size() < i0+1) { substancespecification.addMoiety(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMoiety().get(i0).getStereochemistry().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtAmntCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtAmntCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMolecularWeight().get(i0).getAmount().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtAmntCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtAmntCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMolecularWeight().get(i0).getAmount().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtAmntSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtAmntSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMolecularWeight().get(i0).getAmount().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtAmntUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtAmntUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMolecularWeight().get(i0).getAmount().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Amnt_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtAmntVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMolecularWeight().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtMthdCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getMethod().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Mthd_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtMthdTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMolecularWeight().get(i0).getMethod().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				String[] arrayi1 = s.getSbstncSpcfctnMoleclrWghtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getMolecularWeight().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getMolecularWeight().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getMolecularWeight().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_MoleclrWght_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnMoleclrWghtTypTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnMoleclrWghtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getMolecularWeight().size() < i0+1) { substancespecification.addMolecularWeight(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getMolecularWeight().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmDomainCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmDomainCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmDomainCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getDomain().size() < i1+1) { substancespecification.getName().get(i0).addDomain(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmDomainCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getDomain().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getDomain().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getDomain().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnNmDomainCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmDomainCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmDomainCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getDomain().size() < i1+1) { substancespecification.getName().get(i0).addDomain(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmDomainCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getDomain().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getDomain().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getDomain().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnNmDomainCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmDomainCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmDomainCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getDomain().size() < i1+1) { substancespecification.getName().get(i0).addDomain(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmDomainCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getDomain().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getDomain().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getDomain().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Domain_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmDomainCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmDomainCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmDomainCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getDomain().size() < i1+1) { substancespecification.getName().get(i0).addDomain(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmDomainCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getDomain().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getDomain().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getDomain().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Domain_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnNmDomainCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmDomainCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmDomainCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getDomain().size() < i1+1) { substancespecification.getName().get(i0).addDomain(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmDomainCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getDomain().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getDomain().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getDomain().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Domain_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmDomainTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmDomainTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmDomainTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getDomain().size() < i1+1) { substancespecification.getName().get(i0).addDomain(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getDomain().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmJrsdctnCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getJurisdiction().size() < i1+1) { substancespecification.getName().get(i0).addJurisdiction(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getJurisdiction().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnNmJrsdctnCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getJurisdiction().size() < i1+1) { substancespecification.getName().get(i0).addJurisdiction(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getJurisdiction().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnNmJrsdctnCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getJurisdiction().size() < i1+1) { substancespecification.getName().get(i0).addJurisdiction(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getJurisdiction().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmJrsdctnCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getJurisdiction().size() < i1+1) { substancespecification.getName().get(i0).addJurisdiction(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getJurisdiction().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Jrsdctn_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnNmJrsdctnCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getJurisdiction().size() < i1+1) { substancespecification.getName().get(i0).addJurisdiction(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getJurisdiction().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getJurisdiction().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Jrsdctn_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmJrsdctnTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getJurisdiction().size() < i1+1) { substancespecification.getName().get(i0).addJurisdiction(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getJurisdiction().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmLnguageCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getLanguage().size() < i1+1) { substancespecification.getName().get(i0).addLanguage(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getLanguage().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnNmLnguageCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getLanguage().size() < i1+1) { substancespecification.getName().get(i0).addLanguage(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getLanguage().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnNmLnguageCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getLanguage().size() < i1+1) { substancespecification.getName().get(i0).addLanguage(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getLanguage().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmLnguageCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getLanguage().size() < i1+1) { substancespecification.getName().get(i0).addLanguage(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getLanguage().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Lnguage_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnNmLnguageCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getLanguage().size() < i1+1) { substancespecification.getName().get(i0).addLanguage(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().size() < i2+1) { substancespecification.getName().get(i0).getLanguage().get(i1).addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getLanguage().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Lnguage_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmLnguageTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getLanguage().size() < i1+1) { substancespecification.getName().get(i0).addLanguage(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getLanguage().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Nm ********************************************************************************/
//		if(s.getSbstncSpcfctnNmNm() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getName().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialAthrityCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialAthrityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialAthrityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialAthrityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialAthrityCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialAthrityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialAthrityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialAthrityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialAthrityCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialAthrityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialAthrityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialAthrityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialAthrityCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialAthrityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialAthrityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialAthrityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Athrity_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialAthrityCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialAthrityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialAthrityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialAthrityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Athrity_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialAthrityTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialAthrityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialAthrityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getAuthority().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Dt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialDt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).setDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialStsCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialStsCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialStsCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialStsCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Sts_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialStsCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					String[] arrayi2 = s.getSbstncSpcfctnNmOfficialStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().size() < i2+1) { substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Official_Sts_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmOfficialStsTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmOfficialStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmOfficialStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getOfficial().size() < i1+1) { substancespecification.getName().get(i0).addOfficial(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getOfficial().get(i1).getStatus().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Preferred ********************************************************************************/
//		if(s.getSbstncSpcfctnNmPreferred() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmPreferred().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getName().get(i0).setPreferred(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Src ********************************************************************************/
//		if(s.getSbstncSpcfctnNmSrc() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmSrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
//				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {substancespecification.getName().get(i0).addSource(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmStsCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getStatus().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnNmStsCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getStatus().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnNmStsCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getStatus().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Sts_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmStsCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getStatus().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Sts_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnNmStsCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getStatus().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getStatus().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Sts_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmStsTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getName().get(i0).getStatus().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnNmTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnNmTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnNmTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnNmTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				String[] arrayi1 = s.getSbstncSpcfctnNmTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getName().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getName().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getName().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Nm_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnNmTypTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnNmTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getName().size() < i0+1) { substancespecification.addName(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getName().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_NclicAcid ********************************************************************************/
//		if(s.getSbstncSpcfctnNclicAcid() != null ) {
//
//			if(s.getSbstncSpcfctnNclicAcid().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnNclicAcid()==null) {} else {
//			substancespecification.setNucleicAcid(new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnNclicAcid().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Plymr ********************************************************************************/
//		if(s.getSbstncSpcfctnPlymr() != null ) {
//
//			if(s.getSbstncSpcfctnPlymr().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnPlymr()==null) {} else {
//			substancespecification.setPolymer(new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnPlymr().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Prpty_AmntQnty_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyAmntQntyCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getAmountQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_AmntQnty_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyAmntQntyCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getAmountQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_AmntQnty_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyAmntQntySys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getAmountQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_AmntQnty_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyAmntQntyUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getAmountQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_AmntQnty_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyAmntQntyVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getAmountQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_AmntStrgTyp ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyAmntStrgTyp() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).setAmount(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCtgryCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCategory().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCategory().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCtgryCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCategory().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCategory().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCtgryCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCategory().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCategory().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCtgryCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCategory().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCategory().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Ctgry_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCtgryCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCategory().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCategory().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Ctgry_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCtgryTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCdCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCdCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCdCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCdCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Cd_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCdCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getCode().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getCode().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Cd_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyCdTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				String[] arrayi1 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyDefiningSbstncCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).getDefiningSubstanceCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_DefiningSbstncRfrnc ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyDefiningSbstncRfrnc() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyDefiningSbstncRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).setDefiningSubstance(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Prpty_Prmtrs ********************************************************************************/
//		if(s.getSbstncSpcfctnPrptyPrmtrs() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnPrptyPrmtrs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getProperty().size() < i0+1) { substancespecification.addProperty(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getProperty().get(i0).setParameters(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Protein ********************************************************************************/
//		if(s.getSbstncSpcfctnProtein() != null ) {
//
//			if(s.getSbstncSpcfctnProtein().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnProtein()==null) {} else {
//			substancespecification.setProtein(new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnProtein().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_RfrncInfo ********************************************************************************/
//		if(s.getSbstncSpcfctnRfrncInfo() != null ) {
//
//			if(s.getSbstncSpcfctnRfrncInfo().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnRfrncInfo()==null) {} else {
//			substancespecification.setReferenceInformation(new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnRfrncInfo().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntQntyCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntQntyCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntQntySys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntQntyUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntQnty_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntQntyVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngHiCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngHiCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngHiSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngHiUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Hi_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngHiVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngLwCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngLwCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngLwSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngLwUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRng_Lw_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRngLwVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioDnmntrVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioNmrtrVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntRtioLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountRatioLowLimit().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntStrgTyp ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntStrgTyp() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountStringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipAmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getAmountType().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getAmountType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getAmountType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipAmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getAmountType().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getAmountType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getAmountType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipAmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getAmountType().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getAmountType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getAmountType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipAmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getAmountType().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getAmountType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getAmountType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipAmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getAmountType().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getAmountType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getAmountType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_AmntTyp_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipAmntTypTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipAmntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getAmountType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_IsDefining ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipIsDefining() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipIsDefining().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).setIsDefining(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipRltnshipCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getRelationship().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getRelationship().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getRelationship().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipRltnshipCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getRelationship().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getRelationship().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getRelationship().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipRltnshipCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getRelationship().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getRelationship().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getRelationship().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipRltnshipCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getRelationship().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getRelationship().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getRelationship().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_Rltnship_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipRltnshipCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getRelationship().get(i0).getRelationship().getCoding().size() < i1+1) { substancespecification.getRelationship().get(i0).getRelationship().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getRelationship().get(i0).getRelationship().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_Rltnship_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipRltnshipTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnRltnshipRltnshipTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getRelationship().size() < i0+1) { substancespecification.addRelationship(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getRelationship().get(i0).getRelationship().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_Src ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSrc() != null ) {
//
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getSubstanceCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getSubstanceCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getSubstanceCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getSubstanceCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn() != null ) {
//
//				String[] arrayi1 = s.getSbstncSpcfctnRltnshipSbstncCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getSubstanceCodeableConcept().getCoding().size() < i1+1) { substancespecification.getSubstanceCodeableConcept().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getSubstanceCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSbstncCdbleCncptTxt() != null ) {
//
//			}
//
//		}
//		/******************** SbstncSpcfctn_Rltnship_SbstncRfrnc ********************************************************************************/
//		if(s.getSbstncSpcfctnRltnshipSbstncRfrnc() != null ) {
//
//			}
//
//		}
//		/******************** SbstncSpcfctn_Src ********************************************************************************/
//		if(s.getSbstncSpcfctnSrc() != null ) {
//
//				for( String currListStrSplit : s.getSbstncSpcfctnSrc().replace("[","").replace("]","").replace("\"","").split(",")){
//			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
//			substancespecification.addSource(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
//			}				}
//
//		}
//		/******************** SbstncSpcfctn_SrcMtrl ********************************************************************************/
//		if(s.getSbstncSpcfctnSrcMtrl() != null ) {
//
//			if(s.getSbstncSpcfctnSrcMtrl().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnSrcMtrl()==null) {} else {
//			substancespecification.setSourceMaterial(new org.hl7.fhir.r4.model.Reference(s.getSbstncSpcfctnSrcMtrl().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Sts_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStsCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStatus().getCoding().size() < i0+1) { substancespecification.getStatus().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Sts_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStsCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStatus().getCoding().size() < i0+1) { substancespecification.getStatus().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Sts_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStsCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStatus().getCoding().size() < i0+1) { substancespecification.getStatus().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Sts_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStsCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStatus().getCoding().size() < i0+1) { substancespecification.getStatus().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Sts_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStsCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStatus().getCoding().size() < i0+1) { substancespecification.getStatus().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Sts_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStsTxt() != null ) {
//
//			if(s.getSbstncSpcfctnStsTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStsTxt()==null) {} else {
//			substancespecification.getStatus().setText(s.getSbstncSpcfctnStsTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeHalfLifeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getHalfLife().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeHalfLifeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getHalfLife().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeHalfLifeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getHalfLife().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeHalfLifeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getHalfLife().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_HalfLife_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeHalfLifeVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeHalfLifeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getHalfLife().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Assigner ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdAssigner() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_End ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdPrdEnd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdPrdStrt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdTypTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Use ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdUse() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Id_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeIdVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getAmount().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getAmount().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getAmount().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getAmount().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getMethod().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeMoleclrWghtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getMolecularWeight().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeNmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeNmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getName().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeNmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeNmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getName().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeNmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeNmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getName().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeNmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getName().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeNmCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeNmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeNmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getName().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getName().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Nm_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeNmTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeNmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getName().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getSubstitution().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getSubstitution().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getSubstitution().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getSubstitution().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().size() < i1+1) { substancespecification.getStructure().getIsotope().get(i0).getSubstitution().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getSubstitution().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Isotope_Substitution_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrIsotopeSubstitutionTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrIsotopeSubstitutionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getIsotope().size() < i0+1) { substancespecification.getStructure().addIsotope(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getIsotope().get(i0).getSubstitution().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrFrmula ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrFrmula() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrFrmula().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrFrmula()==null) {} else {
//			substancespecification.getStructure().setMolecularFormula(s.getSbstncSpcfctnStrctrMoleclrFrmula().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrFrmulaByMoiety ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrFrmulaByMoiety() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrFrmulaByMoiety().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrFrmulaByMoiety()==null) {} else {
//			substancespecification.getStructure().setMolecularFormulaByMoiety(s.getSbstncSpcfctnStrctrMoleclrFrmulaByMoiety().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCd() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCd().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrWghtAmntCd()==null) {} else {
//			substancespecification.getStructure().getMolecularWeight().getAmount().setCode(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCd().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Cmprtr ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr()==null) {} else {
//			substancespecification.getStructure().getMolecularWeight().getAmount().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSbstncSpcfctnStrctrMoleclrWghtAmntCmprtr().replace("[","").replace("]","").replace("\"","")));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntSys() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntSys().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrWghtAmntSys()==null) {} else {
//			substancespecification.getStructure().getMolecularWeight().getAmount().setSystem(s.getSbstncSpcfctnStrctrMoleclrWghtAmntSys().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Unt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntUnt() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntUnt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrWghtAmntUnt()==null) {} else {
//			substancespecification.getStructure().getMolecularWeight().getAmount().setUnit(s.getSbstncSpcfctnStrctrMoleclrWghtAmntUnt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Vl ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntVl() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrWghtAmntVl().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrWghtAmntVl()==null) {} else {
//			substancespecification.getStructure().getMolecularWeight().getAmount().setValue((new java.math.BigDecimal((s.getSbstncSpcfctnStrctrMoleclrWghtAmntVl().replace("[","").replace("]","").replace("\"","")))));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getMethod().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getMethod().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getMethod().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getMethod().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getMethod().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getMethod().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdTxt() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrWghtMthdTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrWghtMthdTxt()==null) {} else {
//			substancespecification.getStructure().getMolecularWeight().getMethod().setText(s.getSbstncSpcfctnStrctrMoleclrWghtMthdTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getType().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getType().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getType().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getType().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrMoleclrWghtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getMolecularWeight().getType().getCoding().size() < i0+1) { substancespecification.getStructure().getMolecularWeight().getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getMolecularWeight().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_MoleclrWght_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrMoleclrWghtTypTxt() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrMoleclrWghtTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrMoleclrWghtTypTxt()==null) {} else {
//			substancespecification.getStructure().getMolecularWeight().getType().setText(s.getSbstncSpcfctnStrctrMoleclrWghtTypTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrOpticalActvtyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getOpticalActivity().getCoding().size() < i0+1) { substancespecification.getStructure().getOpticalActivity().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getOpticalActivity().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrOpticalActvtyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getOpticalActivity().getCoding().size() < i0+1) { substancespecification.getStructure().getOpticalActivity().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getOpticalActivity().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrOpticalActvtyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getOpticalActivity().getCoding().size() < i0+1) { substancespecification.getStructure().getOpticalActivity().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getOpticalActivity().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrOpticalActvtyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getOpticalActivity().getCoding().size() < i0+1) { substancespecification.getStructure().getOpticalActivity().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getOpticalActivity().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrOpticalActvtyCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrOpticalActvtyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getOpticalActivity().getCoding().size() < i0+1) { substancespecification.getStructure().getOpticalActivity().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getOpticalActivity().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_OpticalActvty_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrOpticalActvtyTxt() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrOpticalActvtyTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrOpticalActvtyTxt()==null) {} else {
//			substancespecification.getStructure().getOpticalActivity().setText(s.getSbstncSpcfctnStrctrOpticalActvtyTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_CntntTyp ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Creation ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntCreation() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Data ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntData() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Hash ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntHash() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Lnguage ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntLnguage() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Sz ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntSz() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Ttl ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntTtl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Attchmnt_Url ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationAttchmntUrl() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Representation ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationRepresentation() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationRepresentation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).setRepresentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrRepresentationTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getStructure().getRepresentation().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrRepresentationTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getStructure().getRepresentation().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrRepresentationTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getStructure().getRepresentation().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrRepresentationTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getStructure().getRepresentation().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				String[] arrayi1 = s.getSbstncSpcfctnStrctrRepresentationTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().size() < i1+1) { substancespecification.getStructure().getRepresentation().get(i0).getType().addCoding(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Representation_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrRepresentationTypTxt() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrRepresentationTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getRepresentation().size() < i0+1) { substancespecification.getStructure().addRepresentation(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getRepresentation().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Src ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrSrc() != null ) {
//
//				for( String currListStrSplit : s.getSbstncSpcfctnStrctrSrc().replace("[","").replace("]","").replace("\"","").split(",")){
//			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
//			substancespecification.getStructure().addSource(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
//			}				}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrStereochemistryCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrStereochemistryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getStereochemistry().getCoding().size() < i0+1) { substancespecification.getStructure().getStereochemistry().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getStereochemistry().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrStereochemistryCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrStereochemistryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getStereochemistry().getCoding().size() < i0+1) { substancespecification.getStructure().getStereochemistry().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getStereochemistry().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrStereochemistryCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrStereochemistryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getStereochemistry().getCoding().size() < i0+1) { substancespecification.getStructure().getStereochemistry().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getStereochemistry().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrStereochemistryCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrStereochemistryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getStereochemistry().getCoding().size() < i0+1) { substancespecification.getStructure().getStereochemistry().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getStereochemistry().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrStereochemistryCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnStrctrStereochemistryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getStructure().getStereochemistry().getCoding().size() < i0+1) { substancespecification.getStructure().getStereochemistry().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getStructure().getStereochemistry().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Strctr_Stereochemistry_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnStrctrStereochemistryTxt() != null ) {
//
//			if(s.getSbstncSpcfctnStrctrStereochemistryTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnStrctrStereochemistryTxt()==null) {} else {
//			substancespecification.getStructure().getStereochemistry().setText(s.getSbstncSpcfctnStrctrStereochemistryTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** SbstncSpcfctn_Typ_Cdg_Cd ********************************************************************************/
//		if(s.getSbstncSpcfctnTypCdgCd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getType().getCoding().size() < i0+1) { substancespecification.getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Typ_Cdg_Dsply ********************************************************************************/
//		if(s.getSbstncSpcfctnTypCdgDsply() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getType().getCoding().size() < i0+1) { substancespecification.getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Typ_Cdg_Sys ********************************************************************************/
//		if(s.getSbstncSpcfctnTypCdgSys() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getType().getCoding().size() < i0+1) { substancespecification.getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Typ_Cdg_UsrSltd ********************************************************************************/
//		if(s.getSbstncSpcfctnTypCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getType().getCoding().size() < i0+1) { substancespecification.getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Typ_Cdg_Vrsn ********************************************************************************/
//		if(s.getSbstncSpcfctnTypCdgVrsn() != null ) {
//
//			String[] arrayi0 = s.getSbstncSpcfctnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(substancespecification.getType().getCoding().size() < i0+1) { substancespecification.getType().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancespecification.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** SbstncSpcfctn_Typ_Txt ********************************************************************************/
//		if(s.getSbstncSpcfctnTypTxt() != null ) {
//
//			if(s.getSbstncSpcfctnTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSpcfctnTypTxt()==null) {} else {
//			substancespecification.getType().setText(s.getSbstncSpcfctnTypTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		return substancespecification;
//	}
//}
