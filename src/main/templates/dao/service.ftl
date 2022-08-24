//${pojo.getPackageDeclaration()}
package main.templateoutput.Service;

// Generated on ${date} 

<#assign classbody>
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>/**
 *  object for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paul Kovach
 */

public class ${declarationName}Service {

	private static ${pojo.importType("main.java.com.campfhir.dao.${declarationName}Dao")} ${declarationName}Dao;
	private static ${pojo.importType("main.java.com.campfhir.service.conversion.${declarationName}Conversion")} ${declarationName}Conversion;

	public ${declarationName}Service() 
	{
		${declarationName}Dao = new ${pojo.importType("main.java.com.campfhir.dao.${declarationName}Dao")}();
		${declarationName}Conversion = new ${pojo.importType("main.java.com.campfhir.service.conversion.${declarationName}Conversion")}();
	}

	public void persist(${pojo.importType("main.java.com.campfhir.model.${declarationName}")} entity) throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		 ${declarationName}Dao.openCurrentSessionwithTransaction();
		 ${declarationName}Dao.persist(entity);
		 ${declarationName}Dao.closeCurrentSessionwithTransaction();
	}

	public void update(${pojo.importType("main.java.com.campfhir.model.${declarationName}")} entity) throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		 ${declarationName}Dao.openCurrentSessionwithTransaction();
		 ${declarationName}Dao.update(entity);
		 ${declarationName}Dao.closeCurrentSessionwithTransaction();
	}

	public ${pojo.importType("main.java.com.campfhir.model.${declarationName}")} findById(String id) throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		${declarationName}Dao.openCurrentSession();
		${pojo.importType("main.java.com.campfhir.model.${declarationName}")} resource = ${declarationName}Dao.findById(id);
		${declarationName}Dao.closeCurrentSession();
		return resource;
	}
	
	public ${pojo.importType("java.util.List")}<${pojo.importType("main.java.com.campfhir.model.${declarationName}")}> findByPatientId(String id) throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		${declarationName}Dao.openCurrentSession();
		${pojo.importType("java.util.List")}<${pojo.importType("main.java.com.campfhir.model.${declarationName}")}> resource =  ${declarationName}Dao.findByPatientId(id);
		${declarationName}Dao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		${declarationName}Dao.openCurrentSessionwithTransaction();
		${pojo.importType("main.java.com.campfhir.model.${declarationName}")} resource =  ${declarationName}Dao.findById(id);
		${declarationName}Dao.delete(resource);
		${declarationName}Dao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")}, ${pojo.importType("java.text.ParseException")} 
	{
		${pojo.importType("org.hibernate.Session")} session =  ${declarationName}Dao.openCurrentSession();
		${pojo.importType("org.hibernate.ScrollableResults")} resources =  ${declarationName}Dao.findAll();
		
	     int i = 0;
	     System.out.println("start");
	     ${pojo.importType("org.hl7.fhir.r4.model.Bundle")} bundle = new ${pojo.importType("org.hl7.fhir.r4.model.Bundle")}().setType(${pojo.importType("org.hl7.fhir.r4.model.Bundle.BundleType")}.COLLECTION);
	     

	     while ( resources.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				session.clear();
				
		    	writeFile(path, i, bundle);
			    bundle = new ${pojo.importType("org.hl7.fhir.r4.model.Bundle")}().setType(${pojo.importType("org.hl7.fhir.r4.model.Bundle.BundleType")}.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/${declarationName}.html")  			   
			   .setResource(${declarationName}Conversion.${declarationName}s((${pojo.importType("main.java.com.campfhir.model.${declarationName}")}) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ${declarationName}Dao.closeCurrentSession();
	}
	
	public ${pojo.importType("java.util.List")}<${pojo.importType("main.java.com.campfhir.model.${declarationName}")}> findPatientAll() throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")}, ${pojo.importType("java.text.ParseException")}, ${pojo.importType("org.hl7.fhir.exceptions.FHIRException")} 
	{
		${pojo.importType("org.hibernate.ScrollableResults")} resources =  ${declarationName}Dao.findAll();
		${pojo.importType("java.util.List")}<${pojo.importType("main.java.com.campfhir.model.${declarationName}")}> e = new ${pojo.importType("java.util.ArrayList")}<>();  

		while ( resources.next() ) 
		{		
			e.add((${pojo.importType("main.java.com.campfhir.model.${declarationName}")}) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		 ${declarationName}Dao.openCurrentSessionwithTransaction();
		 ${declarationName}Dao.deleteAll();
		 ${declarationName}Dao.closeCurrentSessionwithTransaction();
	}

	public ${pojo.importType("main.java.com.campfhir.dao.${declarationName}Dao")}  ${declarationName}Dao() 
	{
		return  ${declarationName}Dao;
	}
	
	public static void writeFile(String path, int domain, ${pojo.importType("org.hl7.fhir.r4.model.Bundle")} bundle)
	{			
	    
		
		try 
		{
			${pojo.importType("java.io.BufferedWriter")} writer = new ${pojo.importType("java.io.BufferedWriter")}(new ${pojo.importType("java.io.OutputStreamWriter")}(new ${pojo.importType("java.io.FileOutputStream")}(path+"/"+domain+".json", true), ${pojo.importType("java.nio.charset.StandardCharsets")}.UTF_8));
			
			String file = ${pojo.importType("ca.uhn.fhir.context.FhirContext")}.forR4().newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);			
			
		    writer.write(file);
		    writer.close();

		} 
		catch (${pojo.importType("java.io.IOException")} e) 
		{
			e.printStackTrace();
		}

	    
	}
}
</#assign>

${pojo.generateImports()}
${classbody}
