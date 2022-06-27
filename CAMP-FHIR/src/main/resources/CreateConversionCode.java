package main.resources;

import static org.reflections.scanners.Scanners.SubTypes;

import org.hl7.fhir.r4.model.DomainResource;
import org.reflections.ReflectionUtils;
import org.reflections.ReflectionUtils.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.reflections.Reflections;

class CreateConversionCode
{
	public static LinkedHashMap<String, String> abbreviations;
    public static void main(String args[]) throws Exception
    {
        // Creating object whose property is to be checked
       	Reflections reflections = new Reflections("org.hl7.fhir.r4.model");
       	//get all subtypes of Domain Resources to loop over
   		Set<Class<?>> subTypes = reflections.get(SubTypes.of(DomainResource.class).asClass());

   		//create iterator to go through each model class
       	Iterator iter = subTypes.iterator();
       	
       	//get abbreviations from csv for later use
       	CreateConversionCode.abbreviations = getAbbreviations();
       	
       	//looping through each model in hapi fhir model package 
       	while (iter.hasNext()) {
       		
       		Class cls = (Class) iter.next();
       		//get class name and make it lower case for later use
            String className = cls.getName().split("\\.")[cls.getName().split("\\.").length -1].toLowerCase();

            //open conversion code file writer and one to write sql files
         	FileWriter conversionWriter = createFileToWrite("C:\\Users\\pikovach\\camp-fhir\\CAMP-FHIR\\src\\main\\java\\com\\campfhir\\service\\conversion\\"+cls.getName().split("\\.")[cls.getName().split("\\.").length -1] + "Conversion.java");
         	FileWriter sqlWriter = createFileToWrite("C:\\Users\\pikovach\\camp-fhir\\CAMP-FHIR\\src\\main\\resources\\SQL\\ResourceSQL\\"+cls.getName().split("\\.")[cls.getName().split("\\.").length -1] + ".sql");

         	//            Set<Method> getters = ReflectionUtils.getAllMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"));
         	//get all add methods with one parameters, with a return type of the fhir model class that we are in
         	if(!className.equals("examplescenario") & !className.equals("structuremap") & !className.equals("graphdefinition") & !className.equals("implementationguide") & !className.equals("metadataresource")) {
         		//writing head of conversion file
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
                 conversionWriter.write("\t\t"+cls.getName() + " " + className + " = new " + cls.getName()+ "();");
     			 conversionWriter.write(System.lineSeparator());
     			 conversionWriter.write(System.lineSeparator());
     			 conversionWriter.write("\t\t/******************** "+ "id" +" ********************************************************************************/");
     			 conversionWriter.write(System.lineSeparator());
 		         conversionWriter.write("\t\t" + className + ".setId("+className.charAt(0) + ".getId()" +");");
     			 conversionWriter.write(System.lineSeparator());
 		         conversionWriter.write(System.lineSeparator());
                 
                 //writing head of sql file
                 sqlWriter.write("drop table if exists `" + cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+ "`;\r\nCREATE TABLE `" + cls.getName().split("\\.")[cls.getName().split("\\.").length -1] + "` (\r\n id varchar(64),\r\n" );

                 recurseThroughClasses(cls, "", null ,conversionWriter, sqlWriter);
                 
                 //writing end of sql file and conversion files
                 sqlWriter.write("PRIMARY KEY(id)) ENGINE=MyISAM\r\n"
                 		+ "    ROW_FORMAT=COMPRESSED \r\n"
                 		+ "    KEY_BLOCK_SIZE=8;");
                 sqlWriter.close();
                 conversionWriter.write("\t\treturn " +className+";");
         		 conversionWriter.write(System.lineSeparator());
         		 conversionWriter.write("	}");
         		 conversionWriter.write(System.lineSeparator());
         		 conversionWriter.write("}");
         		 conversionWriter.write(System.lineSeparator());
         		 conversionWriter.close();               
         	}
       	}    
    }
    



	public static void recurseThroughClasses(Class<?> cls, String hibernateFieldName, Method parentMethod, FileWriter conversionWriter, FileWriter sqlWriter) throws IOException {
        String className = cls.getName().split("\\.")[cls.getName().split("\\.").length -1].replaceAll(".*\\$", "").replace(hibernateFieldName, "");
  
       // hibernateFieldName = hibernateFieldName == "" ? className : className.endsWith("Component") ? hibernateFieldName+"_"+ className.replace("Component", "") : hibernateFieldName+"_"+ className;
        hibernateFieldName = hibernateFieldName == "" ? className : hibernateFieldName+ "_" +  parentMethod.getName().replaceFirst("set", "").replaceFirst("add", "").replaceFirst("get", "") ;
    	Set<Method> allSetters =  generateSetters(cls);
    	//System.out.println(allSetters);
    	Iterator<Method> methodIterator = allSetters.iterator();
    	String XmethodName = "DO NOT MATCH";
 		while (methodIterator.hasNext()) {
 			Method currentMethod = (Method) methodIterator.next();

 			Class<?> returncls = currentMethod.getReturnType();
 			Class<?>[] parametersArray = currentMethod.getParameterTypes();
 			Class<?> parameterClass = parametersArray.length != 0 ? parametersArray[0] : null;
 			//check if the return type is the same as parent class or if the return type is a primitive type, or if the return type is IBaseCoding if either is true then set this boolean to true to kill recursion
 			//if there is a parameter in the fhir model package then set this to false as to not kill the recursion yet. If there are no parameters set to true to kill the recursion as long as the above is also true
 			boolean parameterIsNotAModelThatNeedsToBeRecursed = parameterClass != null ? !parameterClass.getPackageName().equals("org.hl7.fhir.r4.model") : true;
			String returnType = currentMethod.getParameters().length != 0 ? currentMethod.getParameters()[0].getType().getName() : currentMethod.getReturnType().getName();
			returnType = returnType.contains("$") ? returnType.endsWith("Component") ? returnType.replace("$", ".") : returnType.replace("$", ".").concat("EnumFactory") : returnType;
			//System.out.println(returnType);
			//this if statement sets the XmethodNAme if the field is a X typed field. it gets reset to DO NOT MATCH if it is no longer an X type method
 			boolean returnClassIsParentClassORreturnTypeIsPrimitiveType = returncls == cls  | org.hl7.fhir.r4.model.PrimitiveType.class.isAssignableFrom(returncls) | returncls == org.hl7.fhir.instance.model.api.IBaseCoding.class | returnType.contains("java.") | Arrays.asList("byte", "short", "int", "long", "float", "double", "boolean", "char").contains(returnType);

			if(returnType.equals("org.hl7.fhir.r4.model.Type") | currentMethod.getName().startsWith(XmethodName)) {
 				// & !currentMethod.getName().startsWith(XmethodName)
 				//set current method name to set instead of get and move forward to see if 
 				//System.out.println("NOT PRINTING :" + currentMethod.getName() );
 				if(returnType.equals("org.hl7.fhir.r4.model.Type")) {
					XmethodName = currentMethod.getName();

 				}
			
 			} else {
 				XmethodName = "DO NOT MATCH";
 			}
 			if((returnClassIsParentClassORreturnTypeIsPrimitiveType & parameterIsNotAModelThatNeedsToBeRecursed) | returnType.equals("org.hl7.fhir.r4.model.Reference")) {
 				//System.out.println(returnType);
 				//end of recursion, print to file
 				writeMethodToFiles( currentMethod, cls,hibernateFieldName, XmethodName, parentMethod, conversionWriter, sqlWriter);
 				
 			} else {
 				//print method before entering into recursion (this is the top level adder/setter, that the inner methods will chain off of)
 				//this is used to declare new classes to chain off of so it should either be the first parameter type or the return type of the method
 				//this if statement is used if there is an X type Method within the class that needs to be expanded
 				if(returnType.contains("boolean") | returnType.contains("java.util.Date")) {
 					System.out.println(returnType +   ", " + returnClassIsParentClassORreturnTypeIsPrimitiveType +  ", " + parameterIsNotAModelThatNeedsToBeRecursed);
 					System.out.println("returncls == cls   " + (returncls == cls)  );
 					System.out.println("org.hl7.fhir.r4.model.PrimitiveType.class.isAssignableFrom(returncls) "+ org.hl7.fhir.r4.model.PrimitiveType.class.isAssignableFrom(returncls));
 					System.out.println("returncls == org.hl7.fhir.instance.model.api.IBaseCoding.class " + (returncls == org.hl7.fhir.instance.model.api.IBaseCoding.class));
 					System.out.println("returnType.contains(\"java.lang\"); " + returnType.contains("java.lang"));
 					System.out.println("Arrays.asList(\"byte\", \"short\", \"int\", \"long\", \"float\", \"double\", \"boolean\", \"char\").contains(returnType)" + Arrays.asList("byte", "short", "int", "long", "float", "double", "boolean", "char").contains(returnType));
 					System.out.println("parameterClass != null " + parameterClass != null);
 					System.out.println("!parameterClass.getPackageName().equals(org.hl7.fhir.r4.model) " + !parameterClass.getPackageName().equals("org.hl7.fhir.r4.model") );

 				}
	 				//if enum typpe then replace the binary representation of class with one that we can declare and change to the enum factory instead of direct class call
	 				//String newMethodNameToChainOffOf = hibernateFieldName.toLowerCase().replace("_", "")+currentMethod.getName().replace("set","").replace("add","").toLowerCase();
	 				if(!returnType.equals("org.hl7.fhir.r4.model.Type")) {
	 					//System.out.println("newhibernateFieldName: "+hibernateFieldName);
		 				String newMethodNameToChainOffOf = hibernateFieldName.toLowerCase().replace("_", "").replaceAll(".*\\$", ".")+currentMethod.getName().replaceFirst("set","").replaceFirst("add","").replaceFirst("get","").toLowerCase();
		 				//System.out.println("newMethodNameToChainOffOf: "+newMethodNameToChainOffOf);
	 					conversionWriter.write("\t\t/******************** "+ newMethodNameToChainOffOf+" ********************************************************************************/");

		 				conversionWriter.write(System.lineSeparator());
		 				conversionWriter.write("\t\t"+returnType  + " "+newMethodNameToChainOffOf.replace("_", "")+" =  new " + returnType+ "();"); // currentMethod, cls, hibernateFieldName, parentMethod, conversionWriter, sqlWriter);
		 	 			conversionWriter.write(System.lineSeparator());
		 	 			//if enum factory then add fromCode to the code otherwise use the default 
		 	 			if(returnType.contains("EnumFactory")) { //java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".get" + newhibernateFieldName.replace("_", "") + "()"
		 	 				conversionWriter.write("\t\t" + hibernateFieldName.toLowerCase().replace("_", "") + "." + currentMethod.getName() + "("+newMethodNameToChainOffOf+".fromCode(" +java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".get" + replaceTermsWithAbbreviations(hibernateFieldName.replace("_","") +currentMethod.getName().replaceFirst("set","").replaceFirst("add","").replaceFirst("get", "").replace("_","")) +"())"+");\n"); // currentMethod, cls, hibernateFieldName, parentMethod, conversionWriter, sqlWriter);
		 	 				sqlWriter.write(replaceTermsWithAbbreviations(hibernateFieldName+"_"+currentMethod.getName().replace("set","").replace("add","").replace("get", "")) + " TEXT,\r\n");
		 	 			} else {
		 	 				conversionWriter.write("\t\t" + hibernateFieldName.toLowerCase().replace("_", "") + "." + (!XmethodName.equals("DO NOT MATCH") ? XmethodName.replaceFirst("get", "set").replace("Base64Binary", "Base64binary").replace("_", "") : currentMethod.getName().replace("Base64Binary", "Base64binary") ) + "("+newMethodNameToChainOffOf.replace("_", "")+");\n"); // currentMethod, cls, hibernateFieldName, parentMethod, conversionWriter, sqlWriter);
		 	 			}
		 				conversionWriter.write(System.lineSeparator());
	 				}
 				
	 				//if the parameter is a model that needs to be recursed then send the parameter class
	 				
	 				if(!parameterIsNotAModelThatNeedsToBeRecursed) {
		 				if(!parameterClass.getName().equals("org.hl7.fhir.r4.model.Reference")) {
		 					if((parameterClass.getName().contains(".Age") |parameterClass.getName().contains(".Count")|parameterClass.getName().contains(".Duration"))) {
		 						org.hl7.fhir.r4.model.Quantity quant = new org.hl7.fhir.r4.model.Quantity();
			 					recurseThroughClasses(quant.getClass(), hibernateFieldName, currentMethod,  conversionWriter,  sqlWriter); 
			 				} else {
			 					recurseThroughClasses(parameterClass, hibernateFieldName , currentMethod, conversionWriter,  sqlWriter); 
			 				}
		 				}
	 				}
	 				//otherwise send the return type into the 
	 				else {// if(returncls != null && returncls.getPackageName().equals("org.hl7.fhir.r4.model") && !returncls.getName().equals("org.hl7.fhir.r4.model.Type")) {
		 				if(!returncls.getName().equals("org.hl7.fhir.r4.model.Reference")) { 
		 					if((returncls.getName().contains(".Age") |returncls.getName().contains(".Count")|returncls.getName().contains(".Duration"))) {
		 						org.hl7.fhir.r4.model.Quantity quant = new org.hl7.fhir.r4.model.Quantity();
			 					recurseThroughClasses(quant.getClass(), hibernateFieldName, currentMethod,  conversionWriter,  sqlWriter); 
			 				} else {
			 					recurseThroughClasses(returncls, hibernateFieldName, currentMethod,  conversionWriter,  sqlWriter); 
			 				}
			 			}
		 			}
 			}
 		 }
 		
    }
    
    public static void writeMethodToFiles(Method currentMethod, Class parentClass , String hibernateFieldName, String XmethodName, Method  parentMethod, FileWriter conversionWriter, FileWriter sqlWriter) throws IOException {
    		//carries over the methodName if the current method deals with an X typed field
    		String methodName =  !XmethodName.equals("DO NOT MATCH") ? XmethodName.replaceFirst("get", "set") : currentMethod.getName();
    		
			//System.out.println(currentMethod.toString());
			String classname = parentClass.getName().split("\\.")[parentClass.getName().split("\\.").length -1];
			String newhibernateFieldName= hibernateFieldName+"_" +currentMethod.getName().replace("set","").replace("add","").replace("get", "");
			newhibernateFieldName = replaceTermsWithAbbreviations(newhibernateFieldName);
			String newMethodNameToChainOffOf = hibernateFieldName.toLowerCase().replace("_", "").replaceAll(".*\\$", ".");
			//String parameterType =  currentMethod.getParameters().length > 0 ? currentMethod.getParameters()[0].getType().getName().toString() : "";
			String parameterType =  XmethodName.equals("DO NOT MATCH") ? currentMethod.getParameters().length > 0 ? currentMethod.getParameters()[0].getType().getName().toString() : "" : currentMethod.getReturnType().getName() ;

			String hibernateGetterName = java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".get" + newhibernateFieldName.replace("_", "").replace("Base64Binary", "Base64binary").replace("US", "Us")  + "()";
			hibernateGetterName = replaceTermsWithAbbreviations(hibernateGetterName);
			
			conversionWriter.write("\t\t/******************** "+ newhibernateFieldName+" ********************************************************************************/");
    		conversionWriter.write(System.lineSeparator());
    		conversionWriter.write("\t\tif("+hibernateGetterName+" != null) {");
    		conversionWriter.write(System.lineSeparator());

    		if(parameterType.equals("java.util.Date"))  {
    			conversionWriter.write("\t\t\tjava.text.SimpleDateFormat "+ newhibernateFieldName+ "sdf = new java.text.SimpleDateFormat(\"yyyy-M-dd\");");
    			conversionWriter.write(System.lineSeparator());
    			conversionWriter.write("\t\t\tjava.util.Date "+ newhibernateFieldName+"date = "+ newhibernateFieldName+"sdf.parse(" + hibernateGetterName + ");");
    			conversionWriter.write(System.lineSeparator());
    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." +  methodName + "("+ newhibernateFieldName+"date);" );
    		} else if(parameterType.equals("boolean")) {	
    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName+ "(Boolean.parseBoolean("+hibernateGetterName+"));" );	
    		} else if(parameterType.equals("int")) {
    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "(Integer.parseInt("+hibernateGetterName + "));" );
    		} else if(parameterType.equals("[B")) {
    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "Element(new org.hl7.fhir.r4.model.Base64BinaryType("+hibernateGetterName+"));" );
    		}
    		else if( parameterType.equals("double") | parameterType.equals("long")) {
    			
    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "(Double.parseDouble(("+hibernateGetterName+")));" );
    		} else if (parameterType.equals( "java.math.BigDecimal") ) {
    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "(new java.math.BigDecimal(("+hibernateGetterName+")));" );
    		}else if(parameterType.equals("org.hl7.fhir.r4.model.Duration") ) {
    			conversionWriter.write("\t\t\torg.hl7.fhir.r4.model.Duration " + methodName+"dur = new org.hl7.fhir.r4.model.Duration();");
    			conversionWriter.write(System.lineSeparator());
    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "((org.hl7.fhir.r4.model.Duration)"+ methodName+"dur.setValue(Double.parseDouble(" +hibernateGetterName+")));" );

    		} else  {
    			if(parameterType.contains("org.hl7.fhir.r4.model.")) {
    				conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "( new "+parameterType +"(" +hibernateGetterName+ "));" );

    			} else  {
    				conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "("+hibernateGetterName+ ");" );
    			}

    		}
 			conversionWriter.write(System.lineSeparator());
			conversionWriter.write("\t\t}");
 			conversionWriter.write(System.lineSeparator());
 			if(newhibernateFieldName.length() > 64) {
 				System.out.println(newhibernateFieldName);
 			}
    		sqlWriter.write(newhibernateFieldName + " TEXT,\r\n");
    }
    
    public static Set<Method> generateSetters(Class<?> cls) {
 
    	// add all the add methods with no parameters
    	// Set<Method> adders = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("add"), ReflectionUtils.withParametersCount(0));
    	//add all the add methods with one parameters and remove list, element and target setters
    	Set<Method> adders = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("add"), ReflectionUtils.withParametersCount(1));
    	Set<Method> removeAddListSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("add"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withParameters(java.util.List.class));
     	Set<Method> removeAddElementSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("add"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withPattern(".*[.]{1}set.*Element\\(.*"));
     	Set<Method> removeAddTargetSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("add"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withPattern(".*[.]{1}set.*Target\\(.*"));
     	Set<Method> removeAddBaseReturnTypeSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("add"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withReturnType(org.hl7.fhir.r4.model.Base.class));

     	//remove edgeCases that otherwise endlessly recurse
     	if(cls.getName().equals("org.hl7.fhir.r4.model.RequestGroup$RequestGroupActionComponent")) {
        	Set<Method> removeAddAction = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addAction"));
         	adders.removeAll(removeAddAction);
	    } else if (cls.getName().equals("org.hl7.fhir.r4.model.SubstanceSpecification$SubstanceSpecificationNameComponent")) {
        	Set<Method> removeAddSynonym = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addSynonym"));
        	Set<Method> removeAddTranslation = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addTranslation"));
         	adders.removeAll(removeAddSynonym);
         	adders.removeAll(removeAddTranslation);
		} else if (cls.getName().equals("org.hl7.fhir.r4.model.MedicinalProductPackaged$MedicinalProductPackagedPackageItemComponent")) {
     		Set<Method> removeAddPackageItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addPackageItem"));
     		adders.removeAll(removeAddPackageItem);
		} else if (cls.getName().equals("org.hl7.fhir.r4.model.Contract$TermComponent")) {
			Set<Method> removeAddGroup = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addGroup"));
     		adders.removeAll(removeAddGroup);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.Composition$SectionComponent")) {
			Set<Method> removeAddSection = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addSection"));
			adders.removeAll(removeAddSection);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.MedicinalProductAuthorization$MedicinalProductAuthorizationProcedureComponent")) {
			Set<Method> removeAddApplication = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addApplication"));
			adders.removeAll(removeAddApplication);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.Consent$provisionComponent")) {
			Set<Method> removeAddProvision = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addProvision"));
			adders.removeAll(removeAddProvision);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.QuestionnaireResponse$QuestionnaireResponseItemComponent")) {
			Set<Method> removeAddItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addItem"));
			adders.removeAll(removeAddItem);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.QuestionnaireResponse$QuestionnaireResponseItemAnswerComponent")) {
			Set<Method> removeAddItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addItem"));
			adders.removeAll(removeAddItem);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.CodeSystem$ConceptDefinitionComponent")) {
			Set<Method> removeAddConcept = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addConcept"));
			adders.removeAll(removeAddConcept);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.ValueSet$ValueSetExpansionContainsComponent")) {
			Set<Method> removeAddContains = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addContains"));
			adders.removeAll(removeAddContains);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.PlanDefinition$PlanDefinitionActionComponent")) {
			Set<Method> removeAddAction = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addAction"));
			adders.removeAll(removeAddAction);
	    }  else if (cls.getName().equals("org.hl7.fhir.r4.model.OperationDefinition$OperationDefinitionParameterComponent")) {
			Set<Method> removeAddPart = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addPart"));
			adders.removeAll(removeAddPart);
	    }  else if (cls.getName().equals("org.hl7.fhir.r4.model.Questionnaire$QuestionnaireItemComponent")) {
			Set<Method> removeAddItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("addItem"));
			adders.removeAll(removeAddItem);
	    }
     
     	adders.removeAll(removeAddListSetters);
     	adders.removeAll(removeAddElementSetters);
     	adders.removeAll(removeAddTargetSetters);
     	adders.removeAll(removeAddBaseReturnTypeSetters);

    	//added this into conversion code instead
		//    	//add fromCode Methods so that it gets incorporated from the enumerationclasses
		//    	Set<Method> fromCodeAdd = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("fromCode"), ReflectionUtils.withParametersCount(1));
		//    	adders.addAll(fromCodeAdd);
    	
     	//get all setters and remove those that have lists as parameters and those that have element and target in the name 
     	Set<Method> removeListSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withParameters(java.util.List.class));
     	Set<Method> removeElementSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withPattern(".*[.]{1}set.*Element\\(.*"));
     	Set<Method> removeTargetSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withPattern(".*[.]{1}set.*Target\\(.*"));
     	
     	//get methods that are getters and end in Type so that we know what to set X typed methods
     	//Set<Method> getMultiTypeMethods = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"), ReflectionUtils.withParametersCount(0), ReflectionUtils.withPattern(".*[.]{1}get.*Type\\(.*"));

  
     	
     	Set<Method> allSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParametersCount(1));
       	//get multitypemethods ([x] methods)
     	Set<Method> getMultiTypeMethods = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParameters(org.hl7.fhir.r4.model.Type.class));
     	//     	Set<Method> getResourceTypeMethod = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getResourceType"));
     	
     	for (Method method : getMultiTypeMethods) {
     	    String nameOfMethod = "get" + method.getName().replaceFirst("set", "").replaceFirst("add", "");
         	Set<Method> getTypesForMethods = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(nameOfMethod), ReflectionUtils.withParametersCount(0));
         	Set<Method> removegetElementSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(nameOfMethod), ReflectionUtils.withParametersCount(0), ReflectionUtils.withPattern(".*[.]{1}set.*Element\\(.*"));
         	Set<Method> removegetTargetSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(nameOfMethod), ReflectionUtils.withParametersCount(0), ReflectionUtils.withPattern(".*[.]{1}set.*Target\\(.*"));
         	allSetters.removeAll(removegetElementSetters);
         	allSetters.removeAll(removegetTargetSetters);
         	allSetters.addAll(getTypesForMethods);
     	}
     	
     	

     	
     	allSetters.removeAll(getMultiTypeMethods);
     	allSetters.removeAll(removeListSetters);
     	allSetters.removeAll(removeElementSetters);
     	allSetters.removeAll(removeTargetSetters);
     	
     	allSetters.addAll(getMultiTypeMethods);
     	allSetters.addAll(adders);
     	
     	//sort the methods by name
     	Set<Method> allSettersSorted = new TreeSet<>((o1, o2) -> o1.getName().replaceFirst("add", "").replaceFirst("set", "").replaceFirst("get", "").compareTo(o2.getName().replaceFirst("add", "").replaceFirst("set", "").replaceFirst("get", "")));
        allSettersSorted.addAll(allSetters);
     	
        
     	return allSettersSorted;
    }
    
    // does the abbreviation replacement
	private static String replaceTermsWithAbbreviations(String originalstring) {
		String newString = originalstring;
		for (Map.Entry<String,String> entry : CreateConversionCode.abbreviations.entrySet())  {
			newString = newString.replace(entry.getKey(), entry.getValue());
		}
		return newString;
	}
    
    private static LinkedHashMap<String, String> getAbbreviations() throws IOException {
    	//reading abbreviations into a linkedhashmap so that they maintain insertion order (ordered by most common words first)
        BufferedReader br = new BufferedReader(new FileReader("C://Users/pikovach/camp-fhir/CAMP-FHIR/src/main/resources/Abrreviations.csv"));
        String line =  null;
        LinkedHashMap<String,String> map = new LinkedHashMap<String, String>();
        line=br.readLine();
        while((line=br.readLine())!=null){
        	 String[] str = line.split("\\|");
             map.put(str[0], str[1]);
        }
        return map;
	}

    
    //creates a file object to write to
    public static FileWriter createFileToWrite(String filePath)  {
		   try {
		       File conversionfile = new File(filePath);
		       if (conversionfile.createNewFile()) {
		         System.out.println("File created: " + conversionfile.getName());
			   } else {
			     //System.out.println("File already exists.");
			   }
		   } catch (IOException e) {
			   System.out.println("An error occurred.");
		       e.printStackTrace();
		   }
		   FileWriter conversionWriter = null;
			try {
				conversionWriter = new FileWriter(filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		   return conversionWriter;
    }
}
