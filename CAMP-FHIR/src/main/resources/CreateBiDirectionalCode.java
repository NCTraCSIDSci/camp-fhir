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

class CreateBiDirectionalCode
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
       	CreateBiDirectionalCode.abbreviations = getAbbreviations();
       	
       	//looping through each model in hapi fhir model package 
       	while (iter.hasNext()) {
       		
       		Class cls = (Class) iter.next();
       		//get class name and make it lower case for later use
            String className = cls.getName().split("\\.")[cls.getName().split("\\.").length -1].toLowerCase();

            //open conversion code file writer and one to write sql files
         	FileWriter conversionWriter = createFileToWrite("C:\\Users\\pikovach\\camp-fhir\\CAMP-FHIR\\src\\main\\java\\com\\campfhir\\service\\bidirectionalconversion\\"+cls.getName().split("\\.")[cls.getName().split("\\.").length -1] + "BidirectionalConversion.java");

         	//get all add methods with one parameters, with a return type of the fhir model class that we are in
         	//if(className.equals("patient")) {
         	if(!className.equals("examplescenario") & !className.equals("structuremap") & !className.equals("graphdefinition") & !className.equals("implementationguide") & !className.equals("metadataresource")) {
         		//writing head of conversion file
         		 conversionWriter.write("package main.java.com.campfhir.service.bidirectionalconversion;");
                 conversionWriter.write(System.lineSeparator());
                 conversionWriter.write("import java.text.ParseException;");
                 conversionWriter.write(System.lineSeparator());
                 conversionWriter.write("import main.java.com.campfhir.model." +cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+";");
                 conversionWriter.write(System.lineSeparator());
                 conversionWriter.write("public class "+cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+"BidirectionalConversion ");
                 conversionWriter.write(System.lineSeparator());
                 conversionWriter.write("{");
                 conversionWriter.write(System.lineSeparator()); 
                 conversionWriter.write("\tpublic "+cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+" " +cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+"s("+"org.hl7.fhir.r4.model."+cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+" "+className+ ") throws ParseException");
                 conversionWriter.write(System.lineSeparator());
                 conversionWriter.write("\t{");
                 conversionWriter.write(System.lineSeparator());
                 conversionWriter.write("\t\t"+" main.java.com.campfhir.model."+cls.getName().split("\\.")[cls.getName().split("\\.").length -1] + " " + className.charAt(0) + " = new " + " main.java.com.campfhir.model."+cls.getName().split("\\.")[cls.getName().split("\\.").length -1]+ "();");
     			 conversionWriter.write(System.lineSeparator());
     			 conversionWriter.write(System.lineSeparator());
     			 conversionWriter.write("\t\t/******************** "+ "id" +" ********************************************************************************/");
     			 conversionWriter.write(System.lineSeparator());
 		         conversionWriter.write("\t\t" + className + ".setId("+className.charAt(0) + ".getId()" +");");
     			 conversionWriter.write(System.lineSeparator());
 		         conversionWriter.write(System.lineSeparator());
                 
                 //writing head of sql file

                 recurseThroughClasses(cls, "", null ,conversionWriter, reflections);
                 
                 //writing end of sql file and conversion files
      
                 conversionWriter.write("\t\treturn " +className.charAt(0)+";");
         		 conversionWriter.write(System.lineSeparator());
         		 conversionWriter.write("	}");
         		 conversionWriter.write(System.lineSeparator());
         		 conversionWriter.write("}");
         		 conversionWriter.write(System.lineSeparator());
         		 conversionWriter.close();               
         	}
       	}    
     //  	}
    }
    



	public static void recurseThroughClasses(Class<?> cls, String hibernateFieldName, Method parentMethod, FileWriter conversionWriter, Reflections reflections ) throws IOException {
        String className = cls.getName().split("\\.")[cls.getName().split("\\.").length -1].replaceAll(".*\\$", "").replace(hibernateFieldName, "");
        Class<?> EnumFactoryClazz = null;
       // hibernateFieldName = hibernateFieldName == "" ? className : className.endsWith("Component") ? hibernateFieldName+"_"+ className.replace("Component", "") : hibernateFieldName+"_"+ className;
        hibernateFieldName = hibernateFieldName == "" ? className : hibernateFieldName+ "_" +  parentMethod.getName().replaceFirst("set", "").replaceFirst("add", "").replaceFirst("get", "").replaceFirst("FirstRep","");
    	Set<Method> allGetters =  generateGetters(cls);
    	Iterator<Method> methodIterator = allGetters.iterator();
 		while (methodIterator.hasNext()) {
 			Method currentMethod = (Method) methodIterator.next();

 			Class<?> returncls = currentMethod.getReturnType();
 			Class<?>[] parametersArray = currentMethod.getParameterTypes();
 			Class<?> parameterClass = parametersArray.length != 0 ? parametersArray[0] : null;
 			//check if the return type is the same as parent class or if the return type is a primitive type, or if the return type is IBaseCoding if either is true then set this boolean to true to kill recursion
 			//if there is a parameter in the fhir model package then set this to false as to not kill the recursion yet. If there are no parameters set to true to kill the recursion as long as the above is also true
 			boolean parameterIsNotAModelThatNeedsToBeRecursed = parameterClass != null ? !parameterClass.getPackageName().equals("org.hl7.fhir.r4.model") : true;
			String returnType = currentMethod.getParameters().length != 0 ? currentMethod.getParameters()[0].getType().getName() : currentMethod.getReturnType().getName();
			boolean isEnumType = returnType.contains("$");
			returnType = returnType.contains("$") ? returnType.endsWith("Component") ? returnType.replace("$", ".") : returnType.replace("$", ".") : returnType;
			//System.out.println(returnType);
			//this if statement sets the XmethodNAme if the field is a X typed field. it gets reset to DO NOT MATCH if it is no longer an X type method
 			boolean returnClassIsParentClassORreturnTypeIsPrimitiveType = returncls == cls  | org.hl7.fhir.r4.model.PrimitiveType.class.isAssignableFrom(returncls) | returncls == org.hl7.fhir.instance.model.api.IBaseCoding.class | returnType.contains("java.") | Arrays.asList("byte", "short", "int", "long", "float", "double", "boolean", "char").contains(returnType);
 			boolean enumType = true;
 			if((returnClassIsParentClassORreturnTypeIsPrimitiveType & parameterIsNotAModelThatNeedsToBeRecursed) | returnType.equals("org.hl7.fhir.r4.model.Reference")) {
 				//System.out.println(returnType);
 				//end of recursion, print to file
 				// if statement skips method if it begins with the same name as the parent class
 				String parentMethodReturnTypeName = parentMethod == null ? "Coding" : parentMethod.getReturnType().getName();
 				if(parentMethod == null ? true : !currentMethod.getName().replaceFirst("FirstRep", "").replaceFirst("AsSingleString", "").startsWith(parentMethod.getName().replaceFirst("FirstRep", "").replaceFirst("AsSingleString", ""))) {
 					//if statement skips version and display getters if they arent for coding or codeable concepts or assigned from top resource
// 					if((currentMethod.getName().equals("getVersion") | currentMethod.getName().equals("getDisplay")) & (parentMethodReturnTypeName.contains("Coding")| parentMethodReturnTypeName.contains("CodeableConcept")) ) {
 					if((currentMethod.getName().equals("getVersion") | currentMethod.getName().equals("getDisplay")) & !(parentMethodReturnTypeName.contains("Coding")| parentMethodReturnTypeName.contains("CodeableConcept")) ) {
	
 					} else {
 						writeMethodToFiles( currentMethod, cls,hibernateFieldName, parentMethod, conversionWriter);
 					}
 				}
 				
 			} else {
 				//print method before entering into recursion (this is the top level adder/setter, that the inner methods will chain off of)
 				//this is used to declare new classes to chain off of so it should either be the first parameter type or the return type of the method
 				//this if statement is used if there is an X type Method within the class that needs to be expanded
 				
	 				//if enum typpe then replace the binary representation of class with one that we can declare and change to the enum factory instead of direct class call
	 				//String newMethodNameToChainOffOf = hibernateFieldName.toLowerCase().replace("_", "")+currentMethod.getName().replace("set","").replace("add","").toLowerCase();
	 				if(!returnType.equals("org.hl7.fhir.r4.model.Type")) {
	 					//System.out.println("newhibernateFieldName: "+hibernateFieldName);
	 					
		 				String newMethodNameToChainOffOf = hibernateFieldName.toLowerCase().replace("_", "").replaceAll(".*\\$", ".")+currentMethod.getName().replaceFirst("set","").replaceFirst("add","").replaceFirst("get","").replaceFirst("FirstRep", "").replaceFirst("AsSingleString", "").toLowerCase();
		 				//System.out.println("newMethodNameToChainOffOf: "+newMethodNameToChainOffOf);
		 				
	 					
		 			//	conversionWriter.write("\t\t"+returnType  + " "+newMethodNameToChainOffOf+" =  new " + returnType+ "();"); // currentMethod, cls, hibernateFieldName, parentMethod, conversionWriter, sqlWriter);
		 				if(returnType.equals("[B")) {
		 					//conversionWriter.write("\t\t" +java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".set" + replaceTermsWithAbbreviations(hibernateFieldName.replace("_","") +currentMethod.getName().replace("set","").replace("add","").replace("get", "").replaceFirst("FirstRep", "").replaceFirst("AsSingleString", "").replace("_",""))+ "(String.valueOf("+hibernateFieldName.toLowerCase().replace("_", "")  + "." + currentMethod.getName() + "("+ ")));" );
		 				//	conversionWriter.write("\t\t\t"+hibernateGetterName + "(String.valueOf("+newMethodNameToChainOffOf + "." + methodName + "("+ ")));" );
		 					writeMethodToFiles( currentMethod, cls,hibernateFieldName, parentMethod, conversionWriter);
		 				} else  {
		 					conversionWriter.write("\t\t/******************** "+ newMethodNameToChainOffOf+" ********************************************************************************/");
			 				conversionWriter.write(System.lineSeparator());
			 				conversionWriter.write("\t\t"+returnType  + " "+newMethodNameToChainOffOf.replace("_", "")+" = " + hibernateFieldName.toLowerCase().replace("_", "") + "." + currentMethod.getName() + "();"); // currentMethod, cls, hibernateFieldName, parentMethod, conversionWriter, sqlWriter);
			 				conversionWriter.write(System.lineSeparator());
		 				}
		 				
		 				
		 	 			//if enum factory then add fromCode to the code otherwise use the default
		 			    try {
							Class.forName(returncls.getName()+"EnumFactory").toString();
						} catch (ClassNotFoundException e) {
							enumType = false;
						} 
		 		        if (enumType) {
		 	 				conversionWriter.write("\t\t" +java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".set" + replaceTermsWithAbbreviations(hibernateFieldName.replace("_","") +currentMethod.getName().replace("set","").replace("add","").replace("get", "").replaceFirst("FirstRep", "").replaceFirst("AsSingleString", "").replace("_","")).replace("Base64Binary", "Base64binary").replace("Trminal","trminal").replace("Target", "Tar")+"("+newMethodNameToChainOffOf+".toCode()"+");\n"); // currentMethod, cls, hibernateFieldName, parentMethod, conversionWriter, sqlWriter);
		 	 			}
		 				conversionWriter.write(System.lineSeparator());
	 				}
 				
	 				//if the parameter is a model that needs to be recursed then send the parameter class
	 				if (!enumType )  {	 	 				
	 				if(!parameterIsNotAModelThatNeedsToBeRecursed) {
			 			if(!parameterClass.getName().equals("org.hl7.fhir.r4.model.Reference") & !parameterClass.getName().startsWith("org.hl7.fhir.utilities")) { 
			 				if((parameterClass.getName().contains(".Age") |parameterClass.getName().contains(".Count")|parameterClass.getName().contains(".Duration"))) {
		 						org.hl7.fhir.r4.model.Quantity quant = new org.hl7.fhir.r4.model.Quantity();
			 					recurseThroughClasses(quant.getClass(), hibernateFieldName, currentMethod,  conversionWriter, reflections); 
			 				} else {
			 					recurseThroughClasses(parameterClass, hibernateFieldName , currentMethod, conversionWriter, reflections); }
			 				}
		 				}
		 				//otherwise send the return type into the 
		 				else {// if(returncls != null && returncls.getPackageName().equals("org.hl7.fhir.r4.model") && !returncls.getName().equals("org.hl7.fhir.r4.model.Type")) {
//			 				if(!returncls.getName().equals("org.hl7.fhir.r4.model.Reference")  & !returncls.getName().startsWith("org.hl7.fhir.utilities")) { 
//			 					recurseThroughClasses(returncls, hibernateFieldName, currentMethod,  conversionWriter, reflections);
//			 				}
		 					if((returncls.getName().contains(".Age") |returncls.getName().contains(".Count")|returncls.getName().contains(".Duration"))) {
		 						org.hl7.fhir.r4.model.Quantity quant = new org.hl7.fhir.r4.model.Quantity();
			 					recurseThroughClasses(quant.getClass(), hibernateFieldName, currentMethod,  conversionWriter, reflections); 
			 				} else {
			 					recurseThroughClasses(returncls, hibernateFieldName, currentMethod,  conversionWriter,  reflections); 
			 				}
			 			}
	 				}
 			}
 		 }
 		
    }
    
    public static void writeMethodToFiles(Method currentMethod, Class parentClass , String hibernateFieldName, Method  parentMethod, FileWriter conversionWriter) throws IOException {
    		//carries over the methodName if the current method deals with an X typed field
    		String methodName =   currentMethod.getName();
    		
			//System.out.println(currentMethod.toString());
			String classname = parentClass.getName().split("\\.")[parentClass.getName().split("\\.").length -1];
			String newhibernateFieldName= hibernateFieldName+"_" +currentMethod.getName().replace("set","").replace("add","").replace("get", "").replaceFirst("FirstRep", "").replaceFirst("AsSingleString", "");
			newhibernateFieldName = replaceTermsWithAbbreviations(newhibernateFieldName);
			String newMethodNameToChainOffOf = hibernateFieldName.toLowerCase().replace("_", "").replaceAll(".*\\$", ".");
			//String parameterType =  currentMethod.getParameters().length > 0 ? currentMethod.getParameters()[0].getType().getName().toString() : "";
		//	String parameterType =  XmethodName.equals("DO NOT MATCH") ? currentMethod.getParameters().length > 0 ? currentMethod.getParameters()[0].getType().getName().toString() : "" : currentMethod.getReturnType().getName() ;
			//String parameterType = currentMethod.getParameters().length > 0 ? currentMethod.getParameters()[0].getType().getName().toString() : "" ;
			String parameterType = currentMethod.getReturnType().getName();

			String hibernateGetterName = java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".set" + newhibernateFieldName.replace("_", "").replace("Base64Binary", "Base64binary").replace("Trminal","trminal").replace("Target", "Tar");
			hibernateGetterName = replaceTermsWithAbbreviations(hibernateGetterName);
			
			conversionWriter.write("\t\t/******************** "+ newhibernateFieldName+" ********************************************************************************/");
    		conversionWriter.write(System.lineSeparator());
    		conversionWriter.write("\t\tif("+newMethodNameToChainOffOf+"."+methodName.replaceFirst("get", "has").replaceFirst("AsSingleString", "").replaceFirst("FirstRep", "")+"()) {");
    		conversionWriter.write(System.lineSeparator());

//    		if(parameterType.equals("java.util.Date"))  {
//    			conversionWriter.write("\t\t\tjava.text.SimpleDateFormat "+ newhibernateFieldName+ "sdf = new java.text.SimpleDateFormat(\"yyyy-M-dd\");");
//    			conversionWriter.write(System.lineSeparator());
//    			conversionWriter.write("\t\t\tjava.util.Date "+ newhibernateFieldName+"date = "+ newhibernateFieldName+"sdf.parse(" + hibernateGetterName + ");");
//    			conversionWriter.write(System.lineSeparator());
//    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." +  methodName + "("+ newhibernateFieldName+"date);" );
//    		} else if(parameterType.equals("boolean")) {	
//    			conversionWriter.write("\t\t\t"+hibernateGetterName+"(String.valueOf("+newMethodNameToChainOffOf + "." + methodName+ "("+")));" );	
//    		} else if(parameterType.equals("int")) {
//    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "(Integer.parseInt("+hibernateGetterName + "));" );
//    		} else if(parameterType.equals("[B")) {
//    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "Element(new org.hl7.fhir.r4.model.Base64BinaryType("+hibernateGetterName+"));" );
//    		}
//    		else if(parameterType.equals( "java.math.BigDecimal") | parameterType.equals("double") | parameterType.equals("long")) {
//    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "(Double.parseDouble(("+hibernateGetterName+")));" );
//    		} else if(parameterType.equals("org.hl7.fhir.r4.model.Duration") ) {
//    			conversionWriter.write("\t\t\torg.hl7.fhir.r4.model.Duration " + methodName+"dur = new org.hl7.fhir.r4.model.Duration();");
//    			conversionWriter.write(System.lineSeparator());
//    			conversionWriter.write("\t\t\t"+newMethodNameToChainOffOf + "." + methodName + "((org.hl7.fhir.r4.model.Duration)"+ methodName+"dur.setValue(Double.parseDouble(" +hibernateGetterName+")));" );
//
//    		} else  {
//    			if(parameterType.contains("org.hl7.fhir.r4.model.")) {
//    				conversionWriter.write("\t\t\t"+hibernateGetterName + "(" +newMethodNameToChainOffOf + "." + methodName + "());" );

//    			} else  {
    				conversionWriter.write("\t\t\t"+hibernateGetterName + "(String.valueOf("+newMethodNameToChainOffOf + "." + methodName + "("+ ")));" );
//    			}

    		//}
 			conversionWriter.write(System.lineSeparator());
			conversionWriter.write("\t\t}");
 			conversionWriter.write(System.lineSeparator());
 			if(newhibernateFieldName.length() > 64) {
 				System.out.println(newhibernateFieldName);
 			}
    }
    
    public static Set<Method> generateGetters(Class<?> cls) { 
    	Set<Method> getters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"), ReflectionUtils.withParametersCount(0));
     	Set<Method> removeListGetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"), ReflectionUtils.withParametersCount(0), ReflectionUtils.withReturnType(java.util.List.class));
     	Set<Method> removeGetElementGetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"), ReflectionUtils.withParametersCount(0), ReflectionUtils.withPattern(".*[.]{1}get.*Element\\(.*"));
     	Set<Method> removedGetTargetGetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"), ReflectionUtils.withParametersCount(0), ReflectionUtils.withPattern(".*[.]{1}get.*Target\\(.*"));
     	Set<Method> removedGetResourceTypeGetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getResourceType"), ReflectionUtils.withParametersCount(0));
     	
//     	Set<Method> removedGetVersionGetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getVersion"), ReflectionUtils.withParametersCount(0));
//     	Set<Method> removedGetDisplayGetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getDisplay"), ReflectionUtils.withParametersCount(0));
//    	getters.removeAll(removedGetVersionGetters);
//     	getters.removeAll(removedGetDisplayGetters);

     	getters.removeAll(removeListGetters);
     	getters.removeAll(removeGetElementGetters);
     	getters.removeAll(removedGetTargetGetters);
     	getters.removeAll(removedGetResourceTypeGetters);
     	
     	//remove edgeCases that otherwise endlessly recurse
     	if(cls.getName().equals("org.hl7.fhir.r4.model.RequestGroup$RequestGroupActionComponent")) {
        	Set<Method> removeGetAction = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getAction"));
        	getters.removeAll(removeGetAction);
	    } else if (cls.getName().equals("org.hl7.fhir.r4.model.SubstanceSpecification$SubstanceSpecificationNameComponent")) {
        	Set<Method> removeGetSynonym = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getSynonym"));
        	Set<Method> removeGetTranslation = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getTranslation"));
        	getters.removeAll(removeGetSynonym);
        	getters.removeAll(removeGetTranslation);
		} else if (cls.getName().equals("org.hl7.fhir.r4.model.MedicinalProductPackaged$MedicinalProductPackagedPackageItemComponent")) {
     		Set<Method> removeGetPackageItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getPackageItem"));
     		getters.removeAll(removeGetPackageItem);
		} else if (cls.getName().equals("org.hl7.fhir.r4.model.Contract$TermComponent")) {
			Set<Method> removeGetGroup = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getGroup"));
			getters.removeAll(removeGetGroup);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.Composition$SectionComponent")) {
			Set<Method> removeGetSection = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getSection"));
			getters.removeAll(removeGetSection);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.MedicinalProductAuthorization$MedicinalProductAuthorizationProcedureComponent")) {
			Set<Method> removeGetApplication = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getApplication"));
			getters.removeAll(removeGetApplication);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.Consent$provisionComponent")) {
			Set<Method> removeGetProvision = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getProvision"));
			getters.removeAll(removeGetProvision);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.QuestionnaireResponse$QuestionnaireResponseItemComponent")) {
			Set<Method> removeGetItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getItem"));
			getters.removeAll(removeGetItem);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.QuestionnaireResponse$QuestionnaireResponseItemAnswerComponent")) {
			Set<Method> removeGetItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getItem"));
			getters.removeAll(removeGetItem);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.CodeSystem$ConceptDefinitionComponent")) {
			Set<Method> removeGetConcept = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getConcept"));
			getters.removeAll(removeGetConcept);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.ValueSet$ValueSetExpansionContainsComponent")) {
			Set<Method> removeGetContains = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getContains"));
			getters.removeAll(removeGetContains);
		}  else if (cls.getName().equals("org.hl7.fhir.r4.model.PlanDefinition$PlanDefinitionActionComponent")) {
			Set<Method> removeGetAction = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getAction"));
			getters.removeAll(removeGetAction);
	    }  else if (cls.getName().equals("org.hl7.fhir.r4.model.OperationDefinition$OperationDefinitionParameterComponent")) {
			Set<Method> removeGetPart = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getPart"));
			getters.removeAll(removeGetPart);
	    }  else if (cls.getName().equals("org.hl7.fhir.r4.model.Questionnaire$QuestionnaireItemComponent")) {
			Set<Method> removeGetItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("getItem"));
			getters.removeAll(removeGetItem);
	    }
     	
     	return getters;

    }

    
    // does the abbreviation replacement
	private static String replaceTermsWithAbbreviations(String originalstring) {
		String newString = originalstring;
		for (Map.Entry<String,String> entry : CreateBiDirectionalCode.abbreviations.entrySet())  {
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
