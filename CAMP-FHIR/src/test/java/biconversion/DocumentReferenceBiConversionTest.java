package test.java.biconversion;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.exception.SQLGrammarException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.DocumentReference;
import org.hl7.fhir.r4.model.ResourceType;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import ca.uhn.fhir.context.FhirContext;
import main.java.com.campfhir.service.bidirectionalconversion.DocumentReferenceBidirectionalConversion;
import main.java.com.campfhir.dao.ResourceDao;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DocumentReferenceBiConversionTest {
	private static FhirContext ctx;
	public static ResourceDao resourceDao;
	private static String DocumentReferencejson;
	private static Bundle resource;

	private static DocumentReferenceBidirectionalConversion conversion = new DocumentReferenceBidirectionalConversion();
	private static List<main.java.com.campfhir.model.DocumentReference> dbDocumentReferences = new ArrayList<main.java.com.campfhir.model.DocumentReference>();
	private static List<org.hl7.fhir.r4.model.DocumentReference> fhirDocumentReferenceList = new ArrayList<org.hl7.fhir.r4.model.DocumentReference>();
    private SimpleDateFormat databaseDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException, SQLGrammarException, FHIRException,
			InterruptedException, org.apache.commons.cli.ParseException {
		ctx = FhirContext.forR4();
		DocumentReferencejson = new String(Files.readAllBytes(Paths.get("./TESTING_DATA/DocumentReference.json")), StandardCharsets.UTF_8);
		resource = (Bundle) ctx.newJsonParser().setPrettyPrint(true).parseResource(DocumentReferencejson);
		if (resource instanceof Bundle) {
			for (BundleEntryComponent entry : resource.getEntry()) {
				if (entry.getResource().getResourceType() == ResourceType.Condition) {
					fhirDocumentReferenceList.add(DocumentReference.class.cast(entry.getResource()));
					dbDocumentReferences.add(conversion.DocumentReferences(DocumentReference.class.cast(entry.getResource())));
				}
			}
		}
	}
	
	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals("DocumentReference", fhirDocumentReference.getResourceType().toString());
		}
	}

	@Test
	void testResourceId() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getId()), fhirDocumentReference.getIdElement().getIdPart());
			i++;
		}
	}
	
	@Test
	void testMasterIdentifierUse() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if (fhirDocumentReference.getMasterIdentifier().hasUse()) {
				Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdUse()),
						fhirDocumentReference.getMasterIdentifier().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testMasterIdentifierSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdSys()),
					fhirDocumentReference.getMasterIdentifier().getSystem());
			i++;
		}
	}

	@Test
	void testMasterIdentifierValue() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdVl()),
					fhirDocumentReference.getMasterIdentifier().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testMasterIdentifierPeriodStart() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if (fhirDocumentReference.getMasterIdentifier().getPeriod().hasStart()) {
				Assert.assertEquals(dbDocumentReferences.get(i).getDocRfrncMasterIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirDocumentReference.getMasterIdentifier().getPeriod().getStart()));

			}
			i++;
		}
	}

	@Test
	void testMasterIdentifierPeriodEnd() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if (fhirDocumentReference.getMasterIdentifier().getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdPrdEnd()), databaseDateFormat.format(fhirDocumentReference.getMasterIdentifier().getPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testMasterIdentifierAssigner() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdAssigner()),
					fhirDocumentReference.getMasterIdentifier().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testMasterIdentifierTypeCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdTypCdgCd()),
					fhirDocumentReference.getMasterIdentifier().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testMasterIdentifierTypeSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdTypCdgSys()),
					fhirDocumentReference.getMasterIdentifier().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testMasterIdentifierTypeVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdTypCdgVrsn()),
					fhirDocumentReference.getMasterIdentifier().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testMasterIdentifierTypeDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdTypCdgDsply()),
					fhirDocumentReference.getMasterIdentifier().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testMasterIdentifierTypeUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdTypCdgUsrSltd()), fhirDocumentReference.getMasterIdentifier()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testMasterIdentifierTypeText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncMasterIdTypTxt()),
					fhirDocumentReference.getMasterIdentifier().getType().getText());
			i++;
		}
	}
	

	@Test
	void testIdentifierUse() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if (fhirDocumentReference.getIdentifier().get(0).hasUse()) {
				Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdUse()),
						fhirDocumentReference.getIdentifierFirstRep().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testIdentifierSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdSys()),
					fhirDocumentReference.getIdentifierFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierValue() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdVl()),
					fhirDocumentReference.getIdentifierFirstRep().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierPeriodStart() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if (fhirDocumentReference.getIdentifier().get(0).getPeriod().hasStart()) {
				Assert.assertEquals(dbDocumentReferences.get(i).getDocRfrncIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirDocumentReference.getIdentifierFirstRep().getPeriod().getStart()));

			}
			i++;
		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if (fhirDocumentReference.getIdentifier().get(0).getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdPrdEnd()), databaseDateFormat.format(fhirDocumentReference.getIdentifierFirstRep().getPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testIdentifierAssigner() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdAssigner()),
					fhirDocumentReference.getIdentifierFirstRep().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testIdentifierTypeCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdTypCdgCd()),
					fhirDocumentReference.getIdentifierFirstRep().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testIdentifierTypeSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdTypCdgSys()),
					fhirDocumentReference.getIdentifierFirstRep().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierTypeVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdTypCdgVrsn()),
					fhirDocumentReference.getIdentifierFirstRep().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testIdentifierTypeDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdTypCdgDsply()),
					fhirDocumentReference.getIdentifierFirstRep().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testIdentifierTypeUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdTypCdgUsrSltd()), fhirDocumentReference.getIdentifierFirstRep()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierTypeText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncIdTypTxt()),
					fhirDocumentReference.getIdentifierFirstRep().getType().getText());
			i++;
		}
	}

	@Test
	void testStatus() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSts()),
					fhirDocumentReference.getStatus().toCode());
			i++;
		}
	}

	@Test
	void testDocStatus() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncDocSts()),
					fhirDocumentReference.getDocStatus().toCode());
			i++;
		}
	}

	@Test
	void testTypeCodingSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncTypCdgSys()),
					fhirDocumentReference.getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testTypeCodingVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncTypCdgVrsn()),
					fhirDocumentReference.getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testTypeCodingCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncTypCdgCd()),
					fhirDocumentReference.getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testTypeCodingDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncTypCdgDsply()),
					fhirDocumentReference.getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testTypeCodingUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncTypCdgUsrSltd()),
					fhirDocumentReference.getType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testTypeText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncTypTxt()),
					fhirDocumentReference.getType().getText());
			i++;
		}
	}

	@Test
	void testCategoryCodingSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCtgryCdgSys()),
					fhirDocumentReference.getCategoryFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testCategoryCodingVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCtgryCdgVrsn()),
					fhirDocumentReference.getCategoryFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testCategoryCodingCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCtgryCdgCd()),
					fhirDocumentReference.getCategoryFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testCategoryCodingDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCtgryCdgDsply()),
					fhirDocumentReference.getCategoryFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testCategoryCodingUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCtgryCdgUsrSltd()),
					fhirDocumentReference.getCategoryFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testCategoryText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCtgryTxt()),
					fhirDocumentReference.getCategoryFirstRep().getText());
			i++;
		}
	}

	@Test
	void testSubject() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSbjct()),
					fhirDocumentReference.getSubject().getReference());
			i++;
		}
	}

	@Test
	void testDate() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if(fhirDocumentReference.hasDate()) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncDt()),
					databaseDateFormat.format(fhirDocumentReference.getDate()));
			}
			i++;
		}
	}

	@Test
	void testAuthor() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncAthr()),
					fhirDocumentReference.getAuthorFirstRep().getReference());
			i++;
		}
	}

	@Test
	void testAuthenticator() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncAuthenticator()),
					fhirDocumentReference.getAuthenticator().getReference());
			i++;
		}
	}

	@Test
	void testCustodian() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCustodian()),
					fhirDocumentReference.getCustodian().getReference());
			i++;
		}
	}

	@Test
	void testRelatesToCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncRelatesToCd()),
					fhirDocumentReference.getRelatesToFirstRep().getCode().toCode());
			i++;
		}
	}

	@Test
	void testRelatesToTarget() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncRelatesToTrgt()),
					fhirDocumentReference.getRelatesToFirstRep().getTarget().getReference());
			i++;
		}
	}
	
	@Test
	void testDescription() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncDscrptn()),
					fhirDocumentReference.getDescription());
			i++;
		}
	}

	@Test
	void testSecurityLabelCodingSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSecurityLblCdgSys()),
					fhirDocumentReference.getSecurityLabelFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testSecurityLabelCodingVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSecurityLblCdgVrsn()),
					fhirDocumentReference.getSecurityLabelFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testSecurityLabelCodingCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSecurityLblCdgCd()),
					fhirDocumentReference.getSecurityLabelFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testSecurityLabelCodingDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSecurityLblCdgDsply()),
					fhirDocumentReference.getSecurityLabelFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testSecurityLabelCodingUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSecurityLblCdgUsrSltd()),
					fhirDocumentReference.getSecurityLabelFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testSecurityLabelText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncSecurityLblTxt()),
					fhirDocumentReference.getSecurityLabelFirstRep().getText());
			i++;
		}
	}

	@Test
	void testContentAttatchmentContentType() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntCntntTyp()),
					fhirDocumentReference.getContentFirstRep().getAttachment().getContentType());
			i++;
		}
	}


	@Test
	void testContentAttatchmentLanguage() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntLnguage()),
					fhirDocumentReference.getContentFirstRep().getAttachment().getLanguage());
			i++;
		}
	}


	@Test
	void testContentAttatchmentData() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntData()),
					new String(fhirDocumentReference.getContentFirstRep().getAttachment().getData()));
			i++;
		}
	}


	@Test
	void testContentAttatchmentUrl() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntUrl()),
					fhirDocumentReference.getContentFirstRep().getAttachment().getUrl());
			i++;
		}
	}


	@Test
	void testContentAttatchmentSize() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntSz()),
					fhirDocumentReference.getContentFirstRep().getAttachment().getSizeElement().asStringValue());
			i++;
		}
	}


	@Test
	void testContentAttatchmentHash() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntHash()),
					new String(fhirDocumentReference.getContentFirstRep().getAttachment().getHash()));
			i++;
		}
	}


	@Test
	void testContentAttatchmentTitle() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntTtl()),
					fhirDocumentReference.getContentFirstRep().getAttachment().getTitle());
			i++;
		}
	}


	@Test
	void testContentAttatchmentCreation() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			if(fhirDocumentReference.getContentFirstRep().getAttachment().hasCreation())
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntAttchmntCreation()),
				databaseDateFormat.format(fhirDocumentReference.getContentFirstRep().getAttachment().getCreation()));
			i++;
		}
	}

	@Test
	void testContentFormatCodingSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntFrmatSys()),
					fhirDocumentReference.getContentFirstRep().getFormat().getSystem());
			i++;
		}
	}

	@Test
	void testContentFormatCodingVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntFrmatVrsn()),
					fhirDocumentReference.getContentFirstRep().getFormat().getVersion());
			i++;
		}
	}

	@Test
	void testContentFormatCodingCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntFrmatCd()),
					fhirDocumentReference.getContentFirstRep().getFormat().getCode());
			i++;
		}
	}

	@Test
	void testContentFormatCodingDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntFrmatDsply()),
					fhirDocumentReference.getContentFirstRep().getFormat().getDisplay());
			i++;
		}
	}

	@Test
	void testContentFormatCodingUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntntFrmatUsrSltd()),
					fhirDocumentReference.getContentFirstRep().getFormat().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testContextEncounter() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtEnc()),
					fhirDocumentReference.getContext().getEncounterFirstRep().getReference());
			i++;
		}
	}

	@Test
	void testContextEventCodingSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtEvntCdgSys()),
					fhirDocumentReference.getContext().getEventFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testContextEventCodingVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtEvntCdgVrsn()),
					fhirDocumentReference.getContext().getEventFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testContextEventCodingCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtEvntCdgCd()),
					fhirDocumentReference.getContext().getEventFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testContextEventCodingDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtEvntCdgDsply()),
					fhirDocumentReference.getContext().getEventFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testContextEventCodingUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtEvntCdgUsrSltd()),
					fhirDocumentReference.getContext().getEventFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testContextEventText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtEvntTxt()),
					fhirDocumentReference.getContext().getEventFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testContextPeriodStart() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPrdStrt()),
					databaseDateFormat.format(fhirDocumentReference.getContext().getPeriod().getStart()));
			i++;
		}
	}
	
	@Test
	void testContextPeriodEnd() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPrdEnd()),
					databaseDateFormat.format(fhirDocumentReference.getContext().getPeriod().getEnd()));
			i++;
		}
	}

	@Test
	void testContextFacilityTypeCodingSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtFacilityTypCdgSys()),
					fhirDocumentReference.getContext().getFacilityType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testContextFacilityTypeCodingVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtFacilityTypCdgVrsn()),
					fhirDocumentReference.getContext().getFacilityType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testContextFacilityTypeCodingCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtFacilityTypCdgCd()),
					fhirDocumentReference.getContext().getFacilityType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testContextFacilityTypeCodingDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtFacilityTypCdgDsply()),
					fhirDocumentReference.getContext().getFacilityType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testContextFacilityTypeCodingUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtFacilityTypCdgUsrSltd()),
					fhirDocumentReference.getContext().getFacilityType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testContextFacilityTypeText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtFacilityTypTxt()),
					fhirDocumentReference.getContext().getFacilityType().getText());
			i++;
		}
	}


	@Test
	void testContextPracticeSettingCodingSystem() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPracticeSttingCdgSys()),
					fhirDocumentReference.getContext().getPracticeSetting().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testContextPracticeSettingCodingVersion() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPracticeSttingCdgVrsn()),
					fhirDocumentReference.getContext().getPracticeSetting().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testContextPracticeSettingCodingCode() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPracticeSttingCdgCd()),
					fhirDocumentReference.getContext().getPracticeSetting().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testContextPracticeSettingCodingDisplay() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPracticeSttingCdgDsply()),
					fhirDocumentReference.getContext().getPracticeSetting().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testContextPracticeSettingCodingUserSelected() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPracticeSttingCdgUsrSltd()),
					fhirDocumentReference.getContext().getPracticeSetting().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testContextPracticeSettingText() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtPracticeSttingTxt()),
					fhirDocumentReference.getContext().getPracticeSetting().getText());
			i++;
		}
	}

	@Test
	void testContextSourcePatientInfo() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtSrcPntInfo()),
					fhirDocumentReference.getContext().getSourcePatientInfo().getReference());
			i++;
		}
	}

	@Test
	void testContextRelated() {
		int i = 0;
		for (DocumentReference fhirDocumentReference : fhirDocumentReferenceList) {
			Assert.assertEquals(cleanString(dbDocumentReferences.get(i).getDocRfrncCntxtRlted()),
					fhirDocumentReference.getContext().getRelatedFirstRep().getReference());
			i++;
		}
	}
	

	String cleanString(String originalString) {
		String newString = "";
		if (originalString != null) {
			newString = originalString.replaceAll("[\\[\\]\"]", "").split(",")[0];
			if (newString.equals("NULL")) {
				return null;
			} else {
				return newString;
			}

		} else {
			return originalString;
		}
	}
}

