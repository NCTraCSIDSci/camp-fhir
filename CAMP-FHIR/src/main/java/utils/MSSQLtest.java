package main.java.utils;
 
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent;
import org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
 

public class MSSQLtest {
 
    public static void main(String[] args) throws SQLException, ClassNotFoundException, UnsupportedEncodingException {
 
    	int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=s.nextInt();
		
		System.out.println(n);
    	
//        Connection conn = null;
//		
//        byte[] name = Base64.getEncoder().encode("Duplicate order entered. Consult already completed.".getBytes());
//        byte[] decodedString = Base64.getDecoder().decode(new String(name).getBytes("UTF-8"));
//        
//        System.out.println(name);
        //System.out.println(new String(decodedString));
    }  }      
//        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        Class.forName("net.sourceforge.jtds.jdbc.Driver");
//        
//        try {
// 
//            String dbURL = "jdbc:sqlserver://172.27.153.23:1433;databaseName=TRACS_CUSTOM;integratedSecurity=true;";
//            String user = "u168465";
//            String pass = "IMissBones1!";
//             
//            conn = DriverManager.getConnection(dbURL);
//            if (conn != null) 
//            {
//            	String query = "SELECT [DOC_SUBJECT_REFERENCE]" + 
//            			"      ,[DOC_ID] " + 
//            			"      ,[DOC_DATE] " + 
//            			"      ,[DOC_START_DATE] " + 
//            			"      ,[DOC_END_DATE] " + 
//            			"      ,[DOC_TYPE_CODE] " + 
//            			"      ,[DOC_TYPE_SYSTEM] " + 
//            			"      ,[DOC_TYPE_DISPLAY] " + 
//            			"      ,[DOC_TYPE] " + 
//            			"      ,[DOC_CATEGORY] " + 
//            			"      ,[DOC_STATUS] " + 
//            			"      ,[DOC_CONTENT_TYPE] " + 
//            			"      ,[DOC_CONTENT_DATA] " + 
//            			"  FROM [UNCH\\u92311].[V_CLARITY_FHIR_DOC_REFERENCE_TESTING]";
//            	
//            	org.hl7.fhir.r4.model.DocumentReference dr = new org.hl7.fhir.r4.model.DocumentReference();
//            	
//                try (Statement stmt = conn.createStatement()) 
//                {
//                  ResultSet rs = stmt.executeQuery(query);
//                  
//                  SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");	
//                  while (rs.next()) 
//                  {
//                	Reference sr = new Reference();
//					dr.setSubject(sr.setDisplay(rs.getString("DOC_SUBJECT_REFERENCE")));
//                  	//System.out.println(rs.getString("DOC_SUBJECT_REFERENCE")); 
//					
//					dr.setId(rs.getString("DOC_ID"));
//                  	//System.out.println(rs.getString("DOC_ID")); 
//                  	
//					
//					
//			        if(rs.getString("DOC_DATE") != null)
//			        {
//			            try 
//			            {
//			                Date date1 = new Date();
//			                date1 = sdf2.parse(rs.getString("DOC_DATE"));
//			                dr.setDate(date1);
//			            } 
//			            catch (ParseException e) 
//			            {
//			                e.printStackTrace();
//			            }
//			        }
//					//System.out.println(rs.getString("DOC_DATE"));
//			        
//			        if(rs.getString("DOC_START_DATE") != null)
//			        {
//			            try 
//			            {
//			                DocumentReferenceContextComponent drcc = new DocumentReferenceContextComponent();
//			                Date sd = new Date();
//			                sd = sdf2.parse(rs.getString("DOC_START_DATE"));
//			                
//			                Date ed = new Date();
//			                ed = sdf2.parse(rs.getString("DOC_END_DATE"));
//			                   
//			                Period period = new Period();
//							period.setEnd(sd);
//							period.setStart(ed);
//
//							drcc.setPeriod(period);
//							dr.setContext(drcc);
//			            } 
//			            catch (ParseException e) 
//			            {
//			                e.printStackTrace();
//			            }
//			        }
////                  	System.out.println(rs.getString("DOC_START_DATE")); 
////                  	System.out.println(rs.getString("DOC_END_DATE"));
//			        
//			        CodeableConcept type = new CodeableConcept();
//			        List<Coding> theCoding = new ArrayList<Coding>();
//			        
//			        Coding t = new Coding();
//			        t.setCode(rs.getString("DOC_TYPE_CODE"));
//			        t.setSystem(rs.getString("DOC_TYPE_SYSTEM"));
//			        t.setDisplay(rs.getString("DOC_TYPE_DISPLAY"));
//			        System.out.println(rs.getString("DOC_TYPE_DISPLAY"));
//					
//					type.setCoding(theCoding );
//					
//					dr.setType(type);
//
////                  	System.out.println(rs.getString("DOC_TYPE_CODE")); 
////                  	System.out.println(rs.getString("DOC_TYPE_SYSTEM")); 
////                  	System.out.println(rs.getString("DOC_TYPE_DISPLAY")); 
//
//                  	//System.out.println(rs.getString("DOC_TYPE")); 
//                  	//System.out.println(rs.getString("DOC_CATEGORY")); 
//                  	//System.out.println(rs.getString("DOC_STATUS"));
//                  	//System.out.println(rs.getString("DOC_CONTENT_TYPE")); 
//			        String encoded = DatatypeConverter.printBase64Binary(rs.getString("DOC_CONTENT_DATA").getBytes());
//			        
//			        List<DocumentReferenceContentComponent> content = new ArrayList<DocumentReferenceContentComponent>();
//			        DocumentReferenceContentComponent e = new DocumentReferenceContentComponent();
//			        
//			        
//			        
//			        
//					content.add(e);
//			        
//			        dr.setContent(content);
//                  }
//            }   
//         }
// 
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (conn != null && !conn.isClosed()) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//        
//    }
//}