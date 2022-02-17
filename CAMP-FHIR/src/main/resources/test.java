package main.resources;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;


import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.Procedure;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.Address.AddressUseEnumFactory;
import org.hl7.fhir.r4.model.Address;
import  org.hl7.fhir.r4.model.Base;
import org.hl7.fhir.r4.model.Base64BinaryType;
import org.hl7.fhir.r4.model.Condition;
import org.hl7.fhir.r4.model.Device;
import org.hl7.fhir.r4.model.DocumentReference;
import org.hl7.fhir.r4.model.Duration;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.MedicationRequest;
import org.hl7.fhir.r4.model.Observation;

class test
{
    public static void main(String args[]) throws Exception
    {
        // Creating object whose property is to be checked
    	Observation obj = new Observation();
    	//Patient obj = new Patient();
        // Creating class object from the object using
        // getclass method  org.hl7.fhir.r4.model.Address$AddressType
        Class cls = obj.getClass();
        String className = cls.getName().split("\\.")[cls.getName().split("\\.").length -1].toLowerCase();
        System.out.println("The name of class is " +
        		className);

        // Getting the constructor of the class through the
        // object of the class
        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +
                            constructor.getName());
        try {
            File conversionfile = new File(cls.getName().split("\\.")[cls.getName().split("\\.").length -1] + "Conversion.java");
            if (conversionfile.createNewFile()) {
              System.out.println("File created: " + conversionfile.getName());
             
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        FileWriter conversionWriter = new FileWriter(cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+ "Conversion.java");
       // conversionWriter.write();
        try {
            File sqlfile = new File(cls.getName().split("\\.")[cls.getName().split("\\.").length -1] + ".sql");
            if (sqlfile.createNewFile()) {
             // System.out.println("File created: " + sqlfile.getName());
             
            } else {
             // System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        FileWriter sqlWriter = new FileWriter(cls.getName().split("\\.")[cls.getName().split("\\.").length -1] +".sql");
  
        System.out.println("The public methods of class are : ");
  
        conversionWriter.write("package main.java.com.campfhir.service.conversion;");
        conversionWriter.write(System.lineSeparator());
        conversionWriter.write("import java.text.ParseException;");
        conversionWriter.write(System.lineSeparator());
        conversionWriter.write("import main.java.com.campfhir.model." +cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+";");
        conversionWriter.write(System.lineSeparator());
        conversionWriter.write("public class "+cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+"Conversion ");
        conversionWriter.write(System.lineSeparator());
        conversionWriter.write("{");
        conversionWriter.write(System.lineSeparator());
        conversionWriter.write("\tpublic org.hl7.fhir.r4.model."+cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+" " +cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+"s("+cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+" "+className.charAt(0)+ ") throws ParseException");
        conversionWriter.write(System.lineSeparator());
        conversionWriter.write("\t{");
        conversionWriter.write(System.lineSeparator());
       
           
          
        
        // Getting methods of the class through the object
        // of the class by using getMethods
    
  
//        // Printing method names
//        for (Method method:methods) {
//        	if(method.getName().contains("set")) {
//        		System.out.println(method.getName());
//        	}
//        }
        
//        AddressUseEnumFactory addressusefactory = new Address.AddressUseEnumFactory(); 
//		address.setUse(addressusefactory.fromCode(addressUseString));
        sqlWriter.write("CREATE TABLE `" + className + "` (\r\n" );
           
		
        ArrayList<FHIRobject> list=new ArrayList<FHIRobject>();      
        writeMethod(cls, className, list, 1);
        ArrayList<String> methodStack =new ArrayList<String>();   
        String currentObjectToChainOff = "";
        methodStack.add(className);
        for(int i=0;i<list.size()-1;i++) {
        	FHIRobject currentfhirobj = list.get(i);
        	FHIRobject nextfhirobj = list.get(i+1);
        	FHIRobject prevfhirobj = null;
        	if(i!=0 ) {
        		prevfhirobj = list.get(i-1);
        	}
//        	methodStack.forEach(name ->{
//                System.out.println(name);
//            });
    		currentObjectToChainOff = methodStack.get(currentfhirobj.Level -1);

        	if(i==0) {
        		conversionWriter.write("\t\t"+cls.getName() + " " + className + " = new " + cls.getName()+ "();");
    			conversionWriter.write(System.lineSeparator());

        	}
        	
    		//currentfhirobj.printClass();
       
        	if(nextfhirobj.Level > currentfhirobj.Level ) {
        		//conversionWriter.write("SKIP THIS ONE BELOW");

        		if(currentfhirobj.Param == null) {
        			
        			conversionWriter.write(System.lineSeparator());
        			conversionWriter.write("\t\t"+currentfhirobj.ReturnType + " " + currentObjectToChainOff + currentfhirobj.MethodName.toLowerCase() +" = " + currentObjectToChainOff +"." + currentfhirobj.MethodName+ "();");
        			conversionWriter.write(System.lineSeparator());
        			conversionWriter.write(System.lineSeparator());
        			methodStack.add(currentObjectToChainOff + currentfhirobj.MethodName.toLowerCase());
        		} else {
        			if(currentfhirobj.Param.contains("$") && !(currentfhirobj.Param.endsWith("Component"))) {
            		//	currentfhirobj.printClass();
            			conversionWriter.write(System.lineSeparator());
            			conversionWriter.write("\t\t"+currentfhirobj.Param.replace("$",".") + "EnumFactory " + currentObjectToChainOff +  currentfhirobj.MethodName.toLowerCase() + "EnumFactory" +" = new " + currentfhirobj.Param.replace("$",".") +"EnumFactory();");
            			conversionWriter.write(System.lineSeparator());
            			conversionWriter.write(System.lineSeparator());
            			methodStack.add(currentObjectToChainOff + currentfhirobj.MethodName.toLowerCase() + "EnumFactory");     			
        			} else {
            			
            			conversionWriter.write(System.lineSeparator());
            			conversionWriter.write("\t\t"+ currentfhirobj.Param.replace("$",".") + " " + currentObjectToChainOff +  currentfhirobj.MethodName.toLowerCase() + " = new " + currentfhirobj.Param.replace("$",".") +"();");
            			conversionWriter.write(System.lineSeparator());
            			conversionWriter.write("\t\t"+ currentObjectToChainOff +"." + currentfhirobj.MethodName+ "("+ currentObjectToChainOff + currentfhirobj.MethodName.toLowerCase() +");");
	        			conversionWriter.write(System.lineSeparator());
	        			conversionWriter.write(System.lineSeparator());
	        			methodStack.add(currentObjectToChainOff + currentfhirobj.MethodName.toLowerCase()  );
        			}
        		}
        		//currentObjectToChainOff = currentfhirobj.MethodName.toLowerCase();
        		//currentfhirobj.printClass();
        	} else if (nextfhirobj.Level < currentfhirobj.Level)	{
        		conversionWriter.write("\t\t/******************** "+ currentfhirobj.HibernateName +" ********************************************************************************/");
        		conversionWriter.write(System.lineSeparator());
        		conversionWriter.write("\t\tif("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "() != null) {");
        		conversionWriter.write(System.lineSeparator());
        		if(currentObjectToChainOff.contains("EnumFactory")) {
					conversionWriter.write("\t\t\t"+methodStack.get(currentfhirobj.Level -2) +"." + prevfhirobj.MethodName + "(" + currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
        			conversionWriter.write(System.lineSeparator());

        		} else {
        			//conversionWriter.write(currentfhirobj.Param);
        			if(currentfhirobj.Param != null) {
    					writeToFile(currentfhirobj.Param,  currentfhirobj,  currentObjectToChainOff,  className,  conversionWriter);
    				} else {
    					writeToFile(currentfhirobj.ReturnType,  currentfhirobj,  currentObjectToChainOff,  className,  conversionWriter);

    				}
//            		if(currentfhirobj.Param == "java.util.Date") {
//            			
//            			conversionWriter.write("\t\t\tjava.text.SimpleDateFormat "+ currentfhirobj.HibernateName.replace("_", "")+ "sdf = new java.text.SimpleDateFormat(\"yyyy-M-dd\");");
//            			conversionWriter.write(System.lineSeparator());
//            			conversionWriter.write("\t\t\tjava.util.Date "+ currentfhirobj.HibernateName.replace("_", "")+"date = "+ currentfhirobj.HibernateName.replace("_", "")+"sdf.parse("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "());");
//            			conversionWriter.write(System.lineSeparator());
//            			conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+ currentfhirobj.HibernateName.replace("_", "")+"date);" );
//            		} else if(currentfhirobj.Param == "boolean") {
//        				
//        				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Boolean.parseBoolean("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//        			} else if(currentfhirobj.Param == "org.hl7.fhir.r4.model.Reference") {
//        				
//        				conversionWriter.write("\t\t\torg.hl7.fhir.r4.model.Reference " + currentfhirobj.HibernateName.replace("_", "")+"ref = new org.hl7.fhir.r4.model.Reference();");
//        				conversionWriter.write(System.lineSeparator());
//        				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+ currentfhirobj.HibernateName.replace("_", "")+"ref.setReference(" +""+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//        			} else if(currentfhirobj.Param == "int") {
//        				
//        				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Integer.parseInt("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//        			} else if(currentfhirobj.Param != null && currentfhirobj.Param.contains("byte")) {
//        				
//        				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "Element(new org.hl7.fhir.r4.model.Base64BinaryType("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//        			} else if(currentfhirobj.Param == "org.hl7.fhir.r4.model.Type") {
//        				
//        				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(new org.hl7.fhir.r4.model.StringType("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//        			} else if(currentfhirobj.Param == "java.math.BigDecimal" | currentfhirobj.Param == "double" | currentfhirobj.Param == "long") {
//        				
//        				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Double.parseDouble(("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "())));" );
//        			} else {
//        				//conversionWriter.write(currentfhirobj.Param);
//        				
//        				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "());" );
//        			}
        		}
        		conversionWriter.write(System.lineSeparator());
        		conversionWriter.write("\t\t}");
				conversionWriter.write(System.lineSeparator());
        		sqlWriter.write(currentfhirobj.HibernateName + " TEXT,\r\n");
        		while(methodStack.size() > nextfhirobj.Level) {
        			methodStack.remove(methodStack.size() -1) ;
        		}
        	} else {
        		//		deviceaddudicarrier.setCarrierAIDCElement(new Base64BinaryType("+className.charAt(0) + ".getDeviceUdiCarrierCarrierAidc()));
        		//		deviceaddnote.setAuthor(new StringType("+className.charAt(0) + ".getDeviceNoteAuthor()));
    			//conversionWriter.write(currentfhirobj.Param);
        		conversionWriter.write("\t\t/******************** "+ currentfhirobj.HibernateName +" ********************************************************************************/"); 
        		conversionWriter.write(System.lineSeparator());
        		conversionWriter.write("\t\tif("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "() != null) {");
				conversionWriter.write(System.lineSeparator());
				if(currentfhirobj.Param != null) {
					writeToFile( currentfhirobj.Param,  currentfhirobj,  currentObjectToChainOff,  className,  conversionWriter);
				} else {
					writeToFile( currentfhirobj.ReturnType,  currentfhirobj,  currentObjectToChainOff,  className,  conversionWriter);

				}

//				if(currentfhirobj.Param == "java.util.Date") {
//        			
//        			conversionWriter.write("\t\t\tjava.text.SimpleDateFormat "+ currentfhirobj.HibernateName.replace("_", "")+ "sdf = new java.text.SimpleDateFormat(\"yyyy-M-dd\");");
//        			conversionWriter.write(System.lineSeparator());
//        			conversionWriter.write("\t\t\tjava.util.Date "+ currentfhirobj.HibernateName.replace("_", "")+"date = "+ currentfhirobj.HibernateName.replace("_", "")+"sdf.parse("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "());");
//        			conversionWriter.write(System.lineSeparator());
//        			conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+ currentfhirobj.HibernateName.replace("_", "")+"date);" );
//        		} else if(currentfhirobj.Param == "boolean") {
//    				
//    				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Boolean.parseBoolean("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//    			} else if(currentfhirobj.Param == "org.hl7.fhir.r4.model.Reference") {
//    				
//    				conversionWriter.write("\t\t\torg.hl7.fhir.r4.model.Reference " + currentfhirobj.HibernateName.replace("_", "")+"ref = new org.hl7.fhir.r4.model.Reference();");
//    				conversionWriter.write(System.lineSeparator());
//    				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+ currentfhirobj.HibernateName.replace("_", "")+"ref.setReference(" +""+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//    			} else if(currentfhirobj.Param == "int") {
//    				
//    				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Integer.parseInt("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//    			} else if(currentfhirobj.Param != null && currentfhirobj.Param.contains("byte")) {
//    				
//    				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "Element(new org.hl7.fhir.r4.model.Base64BinaryType("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//    			} else if(currentfhirobj.Param == "org.hl7.fhir.r4.model.Type") {
//    				
//    				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(new org.hl7.fhir.r4.model.StringType("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
//    			} else if(currentfhirobj.Param == "java.math.BigDecimal" | currentfhirobj.Param == "double" | currentfhirobj.Param == "long") {
//    				
//    				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Double.parseDouble(("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "())));" );
//    			} else {
//    				//conversionWriter.write(currentfhirobj.Param);
//    				//currentfhirobj.printClass()
//    				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "());" );
//    			}
				conversionWriter.write(System.lineSeparator());
        		conversionWriter.write("\t\t}");
				conversionWriter.write(System.lineSeparator());

        		sqlWriter.write(currentfhirobj.HibernateName + " TEXT,\r\n");
        		//currentfhirobj.printClass();
        		
        		
        	}
        	
        
        }
        sqlWriter.write(");");
        sqlWriter.close();
        conversionWriter.write("\t\treturn " +className+";");
		conversionWriter.write(System.lineSeparator());
		conversionWriter.write("	}");
		conversionWriter.write(System.lineSeparator());
		conversionWriter.write("}");
		conversionWriter.write(System.lineSeparator());
		conversionWriter.close();
//        Field[] fields = cls.getFields();
//        for (Field field:fields) {
//        	
//            System.out.println(field.getName());
//        	
//        }
        // creates object of desired method by providing the
        // method name and parameter class as arguments to
        // the getDeclaredMethod
//        Method methodcall1 = cls.getDeclaredMethod(method.getName(),
//                                                 int.class);
  
        // invokes the method at runtime
      //  methodcall1.invoke(obj, 19);
  
        // creates object of the desired field by providing
        // the name of field as argument to the 
        // getDeclaredField method
//        Field field = cls.getDeclaredField("Id");
//  
//        // allows the object to access the field irrespective
//        // of the access specifier used with the field
//        field.setAccessible(true);
//  
//        // takes object and the new value to be assigned
//        // to the field as arguments
//        field.set(obj, "123");
    	
    	
//    	Patient b = new Patient();
//		Patient p = (Patient) b;
//		Class<? extends Object> c = p.getClass();
//		System.out.println("-" + c.getName());
//	
//		Method[] f = c.getMethods();
//		
//	  for (Method i : f) 
//	  {
//	  	  if ((i.getName().startsWith("get")  )  && i.getParameterTypes().length == 0) 
//	  	  {
//	  			Method method = c.getDeclaredMethod(i.getName());
//	  			Object test = method.invoke(p);
//	   			
//	  			if(test != null)
//	  			{
//		  	  	System.out.println("--" + i.getName() + "-" + test.getClass().getTypeName());
//	   				
//	  				Method[] n = test.getClass().getMethods();
//	  			  for (Method r : n) 
//	  			  {
//	  				 if ((i.getName().startsWith("get")  )  &&  r.getParameterTypes().length == 0) 
//	  		  	  {
////	   		  	  	
////	  		  			Method m = c.getDeclaredMethod(r.getName());
////	  		  			Object t = m.invoke(p);	   		  	  	
//	   		  	  	
////	  		  			Method m = z.getDeclaredMethod(r.getName());
////	  		  			Object t = m.invoke(newObject);
//	  		  	  	System.out.println("---" + r.getName());
//	  		  	  	Method[] y = r.getClass().getMethods();
//	  	  			  for (Method q : y) 
//	  	  			  {
//	  	  				 if ((i.getName().startsWith("get")  )  &&  q.getParameterTypes().length == 0) 
//	  	  		  	  {
//	  	  		  	  	System.out.println("----" + q.getName());
//	  	  		  	  }
//	  	  			  }
////	  		  			if(t != null)
////	  		  			{
////	  		  				Method[] k = t.getClass().getMethods();
//////	  		  			}
//	  		  	  }
//	  			  }
////	  				//recurseIntoChildren(n);
////	   				
//	  			}
//	   	  	
//	  	  }
//	  }


    }
    
    private static void writeToFile(String returnOrParamString, FHIRobject currentfhirobj, String currentObjectToChainOff, String className, FileWriter conversionWriter) throws IOException {
	    	if(returnOrParamString == "java.util.Date") {
				
				conversionWriter.write("\t\t\tjava.text.SimpleDateFormat "+ currentfhirobj.HibernateName.replace("_", "")+ "sdf = new java.text.SimpleDateFormat(\"yyyy-M-dd\");");
				conversionWriter.write(System.lineSeparator());
				conversionWriter.write("\t\t\tjava.util.Date "+ currentfhirobj.HibernateName.replace("_", "")+"date = "+ currentfhirobj.HibernateName.replace("_", "")+"sdf.parse("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "());");
				conversionWriter.write(System.lineSeparator());
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+ currentfhirobj.HibernateName.replace("_", "")+"date);" );
			} else if(returnOrParamString == "boolean") {
				
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Boolean.parseBoolean("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
			} else if(returnOrParamString == "org.hl7.fhir.r4.model.Reference") {
				
				conversionWriter.write("\t\t\torg.hl7.fhir.r4.model.Reference " + currentfhirobj.HibernateName.replace("_", "")+"ref = new org.hl7.fhir.r4.model.Reference();");
				conversionWriter.write(System.lineSeparator());
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+ currentfhirobj.HibernateName.replace("_", "")+"ref.setReference(" +""+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
			} else if(returnOrParamString == "int") {
				
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Integer.parseInt("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
			} else if(returnOrParamString != null && returnOrParamString.contains("byte")) {
				
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "Element(new org.hl7.fhir.r4.model.Base64BinaryType("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
			} else if(returnOrParamString == "org.hl7.fhir.r4.model.Type") {
				
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(new org.hl7.fhir.r4.model.StringType("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "()));" );
			} else if(returnOrParamString == "java.math.BigDecimal" | returnOrParamString == "double" | returnOrParamString == "long") {
				
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "(Double.parseDouble(("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "())));" );
			} else if(returnOrParamString == "org.hl7.fhir.r4.model.Duration" ) {
				conversionWriter.write("\t\t\torg.hl7.fhir.r4.model.Duration " + currentfhirobj.HibernateName.replace("_", "")+"dur = new org.hl7.fhir.r4.model.Duration();");
				conversionWriter.write(System.lineSeparator());
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "((org.hl7.fhir.r4.model.Duration)"+ currentfhirobj.HibernateName.replace("_", "")+"dur.setValue(Double.parseDouble(" +""+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "())));" );
			
				
			} else {
				//conversionWriter.write(currentfhirobj.Param);
				
				conversionWriter.write("\t\t\t"+currentObjectToChainOff + "." + currentfhirobj.MethodName + "("+className.charAt(0) + ".get" + currentfhirobj.HibernateName.replace("_", "") + "());" );
			}
		
    }
    
	private static void writeMethod(Class cls, String className, ArrayList list, int Level) throws ParseException {
	    Method[] methods = cls.getMethods();
	    String previosMethodName = "";
	    String currentMethodName = "";
	    Arrays.sort(methods,  		
                (o1, o2) -> o1.getGenericParameterTypes().length > o2.getGenericParameterTypes().length ? +1 : o1.getGenericParameterTypes().length < o2.getGenericParameterTypes().length ? -1 : 0);
	    
	    Arrays.sort(methods,  
                (o1, o2) -> o1.getName().compareTo(o2.getName()));
	    
        Arrays.sort(methods,  
                (o1, o2) -> o1.getName().replace("set","").replace("add", "").compareTo(o2.getName().replace("set","").replace("add", "")));
       //loop through all the methods in the class
        
        for(int i=0;i<methods.length-1;i++) {
	    	Method method = methods[i];
	    	currentMethodName = method.getName().replace("set","").replace("add", "").replace("Element", "").replace("Target", "").replace("from", "");
	    	//if the current method is the same as the prvious one (without the add,set,etc.) then skip over it
//	    	if(currentMethodName == "Property") {
//	    		
//	    		System.out.println(method);
//	    	}
			if(!(currentMethodName.trim().equalsIgnoreCase(previosMethodName.trim()) )) {
				//if it contains set, fromCode, or add then do the logic
				//&& !(method.getName().contains("Property")) removed bc there are property methods we need
				//if(!method.getName().contains("get") && !method.getName().contains("has"))
				if((method.getName().startsWith("set") | method.getName().contains("fromCode") | method.getName().startsWith("add"))   && !(method.getName().contains("Child"))  && !(method.getName().contains("Element"))) {
					previosMethodName = currentMethodName;
					//if the declaring class is the same as the current class, dont continue add method to the list of methods
		    		if(method.getDeclaringClass() == cls )
		    		{	
		    			FHIRobject fhirObj = new FHIRobject();
		    			fhirObj.Level = Level;
		    			if((className.substring(0, 1).toUpperCase() + className.substring(1) +"_" + currentMethodName).length() > 62) {
		    				fhirObj.HibernateName = (className.substring(0, 1).toUpperCase() + className.substring(1) +"_" + currentMethodName).replace("Encounter", "Enc").replace("UserSelected", "US").replace("Medicationrequest", "MR").replace("DosageInstruction", "DR");

		    			} else {
		    				fhirObj.HibernateName = className.substring(0, 1).toUpperCase() + className.substring(1) +"_" + currentMethodName;
		    			}
		    			fhirObj.Name = currentMethodName;
		    			fhirObj.MethodName = method.getName();
		    			

			            Type pvec[] = method.getGenericParameterTypes();
			            //loop through and print out all the parameters in the method
			            Type elementType = null;
			            boolean skipPropertyFunciton = false;
			            for (int j = 0; j < pvec.length; j++) {
			            	if( pvec[j].getTypeName().contains("Base")) {
			            		skipPropertyFunciton = true;
			            	}
			            	if (pvec[j]  instanceof ParameterizedType) {
			            	    elementType = ((ParameterizedType) pvec[j] ).getActualTypeArguments()[0];
			            	    fhirObj.Param = elementType.getTypeName();
//			                    System.out.println( "      " +"Param" + j + ": "+ pvec[j] );
//			                    System.out.println( "      " +"ListType" + j + ": "+ elementType);
			            	} else {
			            		elementType = pvec[0];
			            		fhirObj.Param = elementType.getTypeName();
			                   // System.out.println("      " +"Param" + j + ": " + pvec[j]);
			            	}
			            }		
			            fhirObj.ReturnType = method.getReturnType().getName().replace("$", ".");
		    			fhirObj.MethodDeclaringClass = method.getReturnType().getName().replace("$", ".");	
		    			if(!skipPropertyFunciton) {
		    				list.add(fhirObj);
		    			}
		    			//fhirObj.printClass();
						//if the return type is base or reference or it has target in the name, print out the method information (done above) but dont recurse since it leads to an infinite loop
			            if( method.getReturnType() != Base.class && method.getReturnType() != org.hl7.fhir.r4.model.Reference.class && !(method.getName().contains("Target"))) 
			            {
			            	if(pvec.length > 0 && cls == method.getReturnType()) {
			            		if(((Class) elementType).getMethods().length>0) {
			            			if(((Class) elementType).getPackage() != null && ((Class) elementType).getPackage().getName().contains("org.hl7.fhir.r4.model")) {				            			
			            				if(elementType != org.hl7.fhir.r4.model.Reference.class) {
			            					
			            					writeMethod((Class) elementType, className+"_"+currentMethodName, list, Level+ 1);
			            				}
			            			} 		
			            		} 
			            	} else {				            		
			            		if(method.getReturnType().getMethods().length>0) {
			            			if( method.getReturnType().getPackage()!= null && method.getReturnType().getPackage().getName().contains("org.hl7.fhir.r4.model")) {
			            				writeMethod(method.getReturnType(), className+"_"+currentMethodName, list, Level+ 1);
			            			} 
			            		} 
			            	}        
			            }  		           
		    		}
		    	}
			} else {
				previosMethodName = currentMethodName;		
			}			
	    }
	}
}