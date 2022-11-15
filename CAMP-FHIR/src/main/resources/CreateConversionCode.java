package main.resources;

import static org.reflections.scanners.Scanners.SubTypes;

import org.hl7.fhir.r4.model.DomainResource;
import org.reflections.ReflectionUtils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
 //       	if(className.equals("activitydefinition")) {
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
	
	                 recurseThroughClasses(cls, "", null ,conversionWriter, sqlWriter, "");
	                 
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
        //	}    
       	}
    }
    



	public static void recurseThroughClasses(Class<?> cls, String hibernateFieldName, Method parentMethod, FileWriter conversionWriter, FileWriter sqlWriter, String parentMethodChain) throws IOException {
	      String className = cls.getName().split("\\.")[cls.getName().split("\\.").length -1].replaceAll(".*\\$", "").replace(hibernateFieldName, "");
	      
	       // hibernateFieldName = hibernateFieldName == "" ? className : className.endsWith("Component") ? hibernateFieldName+"_"+ className.replace("Component", "") : hibernateFieldName+"_"+ className;
	      	
	        hibernateFieldName = hibernateFieldName == "" ? className : hibernateFieldName+ "_" +  parentMethod.getName().replaceFirst("set", "").replaceFirst("add", "").replaceFirst("get", "") ;
	    	Set<Method> allSetters =  generateSetters(cls);
	    	//System.out.println(allSetters);
	    	Iterator<Method> methodIterator = allSetters.iterator();
	    	String XmethodName = "DO NOT MATCH";
	 		while (methodIterator.hasNext()) {
	 			Method currentMethod = (Method) methodIterator.next();
	 			//System.out.println(currentMethod.getName());	 			
	 			Class<?> returncls = currentMethod.getReturnType();
	 			Class<?>[] parametersArray = currentMethod.getParameterTypes();
	 			Class<?> parameterClass = parametersArray.length != 0 ? parametersArray[0] : null;
	 			String parameterClassName = parametersArray.length != 0 ? parameterClass.getName() : "";
	 			Type parameterType = parametersArray.length != 0 ? currentMethod.getGenericParameterTypes()[0] : null;
	 			if(parentMethod == null) {
	 				parentMethodChain = "";
	 			}
	 			
	 			boolean isCurrentClassAList = false;
	 			if(parameterClassName.equals("java.util.List")) {
	 				System.out.println("cls.getName(): "+ cls.getName());
	 				System.out.println("currentMethod.getName(): "+ currentMethod.getName());
	 				System.out.println("currentMethod.getParameterTypes()[0].getTypeName(): "+ currentMethod.getParameterTypes()[0].getTypeName());
					System.out.println( "currentMethod.getGenericParameterTypes()[0].getTypeName(): "+ currentMethod.getGenericParameterTypes()[0]);
					System.out.println( "currentMethod.getString(): "+ currentMethod.toString());
			
					if(currentMethod.getGenericParameterTypes()[0].getTypeName().equals("java.util.List")) {
						
			        	Set<Method> removeAddAction = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(currentMethod.getName().replaceFirst("set", "get")));
			        	Set<Method> removeFirstRep =  ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(currentMethod.getName().replaceFirst("set", "get")), ReflectionUtils.withPattern(".*[.]{1}get.*FirstRep\\(.*"));
			        	removeAddAction.removeAll(removeFirstRep);
			        	Method newMethod = removeAddAction.iterator().next();
			        	//parameterType =newMethod.getReturnType(); //removeFirstRep.iterator().next().getReturnType()
			        	parameterType =removeFirstRep.iterator().next().getReturnType();
			        	parameterClass = (Class<?>) parameterType;
             		   	isCurrentClassAList = true;
             		  
					} else  {
		 				ParameterizedType pt = (ParameterizedType) parameterType;
		                for (Type arg : pt.getActualTypeArguments())
		                {
		                   if(arg.toString().contains("Enumeration")) {
		                	   ParameterizedType ptarg = (ParameterizedType) arg;
		                	   for (Type EnumerationArg : ptarg.getActualTypeArguments())
		                       {
		                		   
		                		   parameterClass = (Class<?>) EnumerationArg;
		                		   isCurrentClassAList = true;
		                       }
		                   } else  {
		                	   parameterClass = (Class<?>) arg;
		                	   isCurrentClassAList = true;
		                	   
		                   }
		                   
		                }
					}
	 			}

	 			//check if the return type is the same as parent class or if the return type is a primitive type, or if the return type is IBaseCoding if either is true then set this boolean to true to kill recursion
	 			//if there is a parameter in the fhir model package then set this to false as to not kill the recursion yet. If there are no parameters set to true to kill the recursion as long as the above is also true
	 			//boolean parameterIsNotAModelThatNeedsToBeRecursed = parameterClass != null ? !parameterClass.getPackageName().equals("org.hl7.fhir.r4.model") : true;
	 			boolean parameterIsNotAModelThatNeedsToBeRecursed = parameterClass != null ? parameterClass.getPackageName().equals("org.hl7.fhir.r4.model") ? parameterClass.getName().endsWith("Type") ? true : false : true  : true; //parameterClass.getName().equals("org.hl7.fhir.r4.model.Reference")
	 			parameterIsNotAModelThatNeedsToBeRecursed = parameterClass != null ? parameterClass.getName().equals("org.hl7.fhir.r4.model.Reference") ? true : parameterIsNotAModelThatNeedsToBeRecursed : parameterIsNotAModelThatNeedsToBeRecursed;
	 			String returnType = currentMethod.getParameters().length != 0 ? currentMethod.getParameters()[0].getType().getName() : currentMethod.getReturnType().getName();
				returnType = returnType.contains("$") ? returnType.endsWith("Component") ? returnType.replace("$", ".") : returnType.replace("$", ".").concat("EnumFactory") : returnType;
				//this if statement sets the XmethodNAme if the field is a X typed field. it gets reset to DO NOT MATCH if it is no longer an X type method
	 			boolean returnClassIsParentClassORreturnTypeIsPrimitiveType = returncls == cls  | org.hl7.fhir.r4.model.PrimitiveType.class.isAssignableFrom(returncls) | returncls == org.hl7.fhir.instance.model.api.IBaseCoding.class | returnType.contains("java.") | Arrays.asList("byte", "short", "int", "long", "float", "double", "boolean", "char").contains(returnType);

				if(returnType.equals("org.hl7.fhir.r4.model.Type") | currentMethod.getName().startsWith(XmethodName)) {
	 				//set current method name to set instead of get and move forward  
	 				if(returnType.equals("org.hl7.fhir.r4.model.Type")) {
						XmethodName = currentMethod.getName().startsWith("set") ? currentMethod.getName().replaceFirst("set", "get") : currentMethod.getName();
						
	 				}
				
	 			} else {
	 				XmethodName = "DO NOT MATCH";
	 			}
 			if((returnClassIsParentClassORreturnTypeIsPrimitiveType & parameterIsNotAModelThatNeedsToBeRecursed) | returnType.equals("org.hl7.fhir.r4.model.Reference")) {	//end of recursion, print to file

 				writeMethodToFiles( currentMethod, cls,hibernateFieldName, XmethodName, parentMethod, conversionWriter, sqlWriter,isCurrentClassAList,  parentMethodChain);
				

 			} else {
 				//print method before entering into recursion (this is the top level adder/setter, that the inner methods will chain off of)
 				//this is used to declare new classes to chain off of so it should either be the first parameter type or the return type of the method
 				//this if statement is used if there is an X type Method within the class that needs to be expanded
 				
// 				
	 				if(returnType.contains("EnumFactory")) { //java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".get" + newhibernateFieldName.replace("_", "") + "()"
			 				writeMethodToFiles( currentMethod, cls,hibernateFieldName, XmethodName, parentMethod, conversionWriter, sqlWriter,isCurrentClassAList,  parentMethodChain);
	
	 	 			}
 					
 					parentMethodChain = parentMethodChain + "." +  (currentMethod.getName().startsWith("set") ?  currentMethod.getName().replaceFirst("set", "get") : currentMethod.getName()) +  "()";
 					if(isCurrentClassAList) {
	                	   parentMethodChain = parentMethodChain + ".get(0)";
					}
 				
 					
	 				//if the parameter is a model that needs to be recursed then send the parameter class
	 				if(!parameterIsNotAModelThatNeedsToBeRecursed) {
		 				if(!parameterClass.getName().equals("org.hl7.fhir.r4.model.Reference")) {
		 					if((parameterClass.getName().contains(".Age") |parameterClass.getName().contains(".Count")|parameterClass.getName().contains(".Duration"))) {
		 						org.hl7.fhir.r4.model.Quantity quant = new org.hl7.fhir.r4.model.Quantity();
			 					recurseThroughClasses(quant.getClass(), hibernateFieldName, currentMethod,  conversionWriter,  sqlWriter, parentMethodChain);
			 					
		 					} else {
//		 						System.out.println(currentMethod.getName() + cls.getName());
			 					recurseThroughClasses(parameterClass, hibernateFieldName , currentMethod, conversionWriter,  sqlWriter, parentMethodChain); 
			 					
		 					}
		 				}
	 				}
	 				//otherwise send the return type into the 
	 				else {// if(returncls != null && returncls.getPackageName().equals("org.hl7.fhir.r4.model") && !returncls.getName().equals("org.hl7.fhir.r4.model.Type")) {
		 				if(!returncls.getName().equals("org.hl7.fhir.r4.model.Reference")) { 
		 					if((returncls.getName().contains(".Age") |returncls.getName().contains(".Count")|returncls.getName().contains(".Duration"))) {
		 						org.hl7.fhir.r4.model.Quantity quant = new org.hl7.fhir.r4.model.Quantity();
			 					recurseThroughClasses(quant.getClass(), hibernateFieldName, currentMethod,  conversionWriter,  sqlWriter,parentMethodChain); 
			 					
		 					} else {
			 					recurseThroughClasses(returncls, hibernateFieldName, currentMethod,  conversionWriter,  sqlWriter, parentMethodChain); 
			 				}
			 			}
		 			}
	 				parentMethodChain = parentMethodChain.replace("." + (currentMethod.getName().startsWith("set") ? currentMethod.getName().replaceFirst("set", "get") : currentMethod.getName()) + "()", "");
	 				if(isCurrentClassAList) {
	                	   parentMethodChain = parentMethodChain.substring(0, parentMethodChain.length()-7);
					}
 			}
 			
 		 }
 		
    }
    
    public static void writeMethodToFiles(Method currentMethod, Class parentClass , String hibernateFieldName, String XmethodName, Method  parentMethod, FileWriter conversionWriter, FileWriter sqlWriter, boolean isCurrentClassAList, String parentMethodChain) throws IOException {
    		//carries over the methodName if the current method deals with an X typed field
    	
    		String methodName =  !XmethodName.equals("DO NOT MATCH") ? XmethodName.startsWith("get") ? XmethodName.replaceFirst("get", "set") : XmethodName : currentMethod.getName();
    		if(isCurrentClassAList) {
    			methodName = methodName.startsWith("set") ?  methodName.replaceFirst("set", "add") : methodName;
    			Set<Method> getListAddMethodObject = ReflectionUtils.getMethods(parentClass,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withParametersCount(1), ReflectionUtils.withPrefix(methodName));
    			Set<Method> removeElementSetters = ReflectionUtils.getMethods(parentClass,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(methodName), ReflectionUtils.withPattern(".*[.]{1}add.*Element\\(.*"));
    			Set<Method> removeTargetSetters = ReflectionUtils.getMethods(parentClass,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(methodName), ReflectionUtils.withPattern(".*[.]{1}add.*Target\\(.*"));

    			getListAddMethodObject.removeAll(removeElementSetters);
    			getListAddMethodObject.removeAll(removeTargetSetters);

    			Method newMethod = getListAddMethodObject.iterator().next();
	        	currentMethod = newMethod;
    			
    		}
			//System.out.println(currentMethod.toString());
			String newhibernateFieldName= hibernateFieldName+"_" +currentMethod.getName().replaceFirst("set","").replaceFirst("add","").replaceFirst("get", "");
			newhibernateFieldName = replaceTermsWithAbbreviations(newhibernateFieldName);
			String newMethodNameToChainOffOf  = "";
			newMethodNameToChainOffOf = hibernateFieldName.toLowerCase().replaceFirst("_[^_]+$", "").replace("_", "").replaceAll(".*\\$", ".");
			//String parameterType =  currentMethod.getParameters().length > 0 ? currentMethod.getParameters()[0].getType().getName().toString() : "";
			String parameterType =  XmethodName.equals("DO NOT MATCH") ? currentMethod.getParameters().length > 0 ? currentMethod.getParameters()[0].getType().getName().toString() : "" : currentMethod.getReturnType().getName() ;
			if(parameterType.equals("java.util.List")) {
				
				if(currentMethod.getGenericParameterTypes()[0].getTypeName().equals("java.util.List")) {
		        	Set<Method> removeAddAction = ReflectionUtils.getMethods(parentClass,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(currentMethod.getName().replaceFirst("set", "get")));
		        	Method newMethod = removeAddAction.iterator().next();
		        	parameterType =  ((Class<?>) newMethod.getReturnType()).getName();

				} else  {
 				ParameterizedType pt = (ParameterizedType)  currentMethod.getGenericParameterTypes()[0];
                for (Type arg : pt.getActualTypeArguments())
	                {
	                   if(arg.toString().contains("Enumeration")) {
	                	   ParameterizedType ptarg = (ParameterizedType) arg;
	                	   for (Type EnumerationArg : ptarg.getActualTypeArguments())
	                       {
	                		   
	                		   parameterType = ((Class<?>) EnumerationArg).getName();
	                		   isCurrentClassAList = true;
	                       }
	                   } else  {
	                	   parameterType = ((Class<?>) arg).getName();;
	                	   isCurrentClassAList = true;
	                	   
	                   }
	                   
	                }
				}
 			}
			String hibernateGetterName = java.lang.Character.toLowerCase(hibernateFieldName.charAt(0)) + ".get" + newhibernateFieldName.replace("_", "").replace("Base64Binary", "Base64binary").replace("US", "Us")  + "()";
			hibernateGetterName = replaceTermsWithAbbreviations(hibernateGetterName);
//			String fullGetter = hibernateGetterName + ".replace(\"[\",\"\").replace(\"]\",\"\").equals(\"NULL\") ? null : " + hibernateGetterName +".replace(\"[\",\"\")"+ ".replace(\"]\",\"\")";
			String fullGetter = hibernateGetterName + ".replace(\"[\",\"\").replace(\"]\",\"\").replace(\"\\\"\",\"\")";

			if(parameterType.equals("java.util.Date"))  {
				fullGetter = hibernateGetterName + ".replace(\"[\",\"\").replace(\"]\",\"\").equals(\"NULL\") | "+hibernateGetterName+"==null ? null : " + "ca.uhn.fhir.util.DateUtils.parseDate("+ hibernateGetterName+".replace(\"[\",\"\")"+ ".replace(\"]\",\"\").replace(\"\\\"\",\"\")"+")";
			} else if(parameterType.equals("boolean")) {	
				fullGetter = "Boolean.parseBoolean("+fullGetter+")";	
			} else if(parameterType.equals("int")) {
				fullGetter = "Integer.parseInt("+fullGetter + ")";
			} else if(parameterType.equals("[B")) {
				fullGetter = hibernateGetterName+".getBytes()" ;
			} else if( parameterType.equals("double") | parameterType.equals("long")) {
				fullGetter = "(Double.parseDouble(("+fullGetter+")))" ;
			} else if (parameterType.equals( "java.math.BigDecimal") ) {
				fullGetter = "(new java.math.BigDecimal(("+fullGetter+")))" ;
			} else if(parameterType.equals("org.hl7.fhir.r4.model.Duration") ) {
				fullGetter = "(new org.hl7.fhir.r4.model.Duration().setValue(Double.parseDouble(" +fullGetter+")))" ;
			} else if(parameterType.equals("org.hl7.fhir.r4.model.Reference") ) {
				fullGetter = "new "+parameterType +"(" +fullGetter+ ")" ;
			} else if (parameterType.contains("org.hl7.fhir.r4.model.")) {
				if(parameterType.contains("$")) {
					fullGetter = "new "+parameterType.replace("$", ".") +"EnumFactory().fromCode(" +fullGetter+ ")" ;
				} else  {
					if(parameterType.equals("org.hl7.fhir.r4.model.StringType") & isCurrentClassAList) {
						//fullGetter = "new "+parameterType +"(" +fullGetter+ ")" ;
					} else {
						fullGetter = "new "+parameterType +"(" +fullGetter+ ")" ;
					}
				}
			}
			if(!parentClass.getName().equals(parameterType)) {
				conversionWriter.write("\t\t/******************** "+ newhibernateFieldName+" ********************************************************************************/");
	    		conversionWriter.write(System.lineSeparator());
	    		conversionWriter.write("\t\tif("+hibernateGetterName+" != null ) {"); //| !"+ hibernateGetterName+".equals(\"NULL\")
	    		conversionWriter.write(System.lineSeparator());
	    		conversionWriter.write(System.lineSeparator() );
	    		List<String> arrayOfLists = Arrays.asList((parentMethodChain+"."+ methodName).split("\\.get\\(0\\)")); 
//	    		conversionWriter.write(Integer.toString(arrayOfLists.size()));
//	    		conversionWriter.write(arrayOfLists.toString() + "\n");
    			String arrayDefinition = hibernateGetterName;
    			String interativeGetterString = Arrays.asList(hibernateFieldName.split("_")).get(0).toLowerCase();
	    		for(int i = 0 ; i < arrayOfLists.size()-1;i++) {
	    			    arrayDefinition = arrayDefinition+(i>0 ? "[i"+(i-1)+"].replace(\"[\",\"\").replace(\"]\",\"\").replace(\"\\\"\",\"\")": ".replaceFirst(\"^\\\\[\",\"\").replaceFirst(\"\\\\]$\",\"\")")+".split(\",(?![^\\\\[\\\\\\\"]*[\\\\]\\\\\\\"])\")"; //also excludes " from regex capture //.replaceFirst(\"^\\\\[\",\"\").replaceFirst(\"\\\\]$\",\"\")"
	    			    StringBuilder builder = new StringBuilder();
		    			String replaceLastGetWithAdd = arrayOfLists.get(i);
		    			String toReplace = "get";
		    			String replacement = "add";

		    			int start = replaceLastGetWithAdd.lastIndexOf(toReplace);

		    			if(start != -1) {
			    			builder.append(replaceLastGetWithAdd.substring(0, start));
			    			builder.append(replacement);
			    			builder.append(replaceLastGetWithAdd.substring(start + toReplace.length()));
		    				String arrayName  = "arrayi" + i;
		    				conversionWriter.write("\t\t\t" + "\t".repeat(i)+ "String[] " + arrayName + " = " + arrayDefinition+ ";\n");
			    			conversionWriter.write("\t\t\t"+ "\t".repeat(i)+"for(int i"+i+" = 0; i"+i+" < "+arrayName+".length; i"+i+"++) {" + System.lineSeparator() );
			    			
			    			conversionWriter.write("\t\t\t"+ "\t".repeat(i+1)+"if("+ interativeGetterString + arrayOfLists.get(i)+".size() < i"+i+"+1) { "+interativeGetterString+ builder+"; }\n");
			    			if(i == arrayOfLists.size()-2) {
			    				if(isCurrentClassAList) { 
				    				conversionWriter.write("\t\t\t"+ "\t".repeat(i+1)+"for( String currListStrSplit : "+arrayName+"[i"+i+"].replace(\"[\",\"\").replace(\"]\",\"\").replace(\"\\\"\",\"\").split(\",\"))" + "{"  + System.lineSeparator() );
				    				
	
			    				}
			    				String ifConditional = "if(" + (isCurrentClassAList ? "currListStrSplit" :  arrayName+"[i"+i+"]")+ ".replace(\"[\",\"\").replace(\"]\",\"\").replace(\"\\\"\",\"\").equals(\"NULL\") | " + (isCurrentClassAList ? "currListStrSplit" :  arrayName+"[i"+i+"]")+ "==null) {} else {";
			    				conversionWriter.write("\t\t\t"+ "\t".repeat(i+1)+ifConditional+interativeGetterString + arrayOfLists.get(i) + ".get(i"+i+")" + arrayOfLists.get(i+1) + "("+(isCurrentClassAList ? fullGetter.replace(hibernateGetterName,"currListStrSplit") : fullGetter.replace(hibernateGetterName,arrayName+"[i"+i+"].replace(\"[\",\"\").replace(\"]\",\"\").replace(\"\\\"\",\"\")"))+"); }"  + System.lineSeparator() );
			    				if(isCurrentClassAList) { 
				    				conversionWriter.write("\t\t\t"+ "\t".repeat(i+1)+"}"  + System.lineSeparator() );
	
			    				}
			    			} else  {
			    				interativeGetterString = interativeGetterString + arrayOfLists.get(i) + ".get(i"+i+")" ;
			    			}
		    			}

		    			
	    		
	    		}
	    		for(int i = arrayOfLists.size() -1; i > 0;i--) {
	    			String replaceLastGetWithAdd = arrayOfLists.get(i);
	    			String toReplace = "get";
	    			String replacement = "add";
	    			int start = replaceLastGetWithAdd.lastIndexOf(toReplace);
    				conversionWriter.write("\t\t\t"+ "\t".repeat(i-1)+ "}" + System.lineSeparator() );
	    		}
	    	
	    		if(arrayOfLists.size()==1) {
	    			if(isCurrentClassAList) { 
	    				conversionWriter.write("\t\t\t"+ "\t"+"for( String currListStrSplit : "+hibernateGetterName + ".replace(\"[\",\"\").replace(\"]\",\"\").replace(\"\\\"\",\"\").split(\",\"))" + "{"  + System.lineSeparator() );
    				}
    				String ifConditional = "if(" + (isCurrentClassAList ? "currListStrSplit" : hibernateGetterName)+".replace(\"[\",\"\").replace(\"]\",\"\").equals(\"NULL\") | " + (isCurrentClassAList ? "currListStrSplit" : hibernateGetterName)+"==null) {} else {";
    				conversionWriter.write("\t\t\t"+ ifConditional + "\n");
	    			conversionWriter.write("\t\t\t"+Arrays.asList(hibernateFieldName.split("_")).get(0).toLowerCase() + parentMethodChain + "." + methodName + "("+(isCurrentClassAList ? fullGetter.replace(hibernateGetterName, "currListStrSplit") : fullGetter)+");\n");
    				conversionWriter.write("\t\t\t"+"}");
    				if(isCurrentClassAList) { 
	    				conversionWriter.write("\t\t\t"+ "\t"+"}"  + System.lineSeparator() );

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
    }
    
    
    public static Set<Method> generateSetters(Class<?> cls) {

     	
     	Set<Method> allSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParametersCount(1));
     	//get all setters and remove those that have lists as parameters and those that have element and target in the name 
     	Set<Method> removeElementSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withPattern(".*[.]{1}set.*Element\\(.*"));
     	Set<Method> removeTargetSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParametersCount(1), ReflectionUtils.withPattern(".*[.]{1}set.*Target\\(.*"));
     	
     	
     	//get multitypemethods ([x] methods)
     	Set<Method> getMultiTypeMethods = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("set"), ReflectionUtils.withParameters(org.hl7.fhir.r4.model.Type.class));
     	     	
     	for (Method method : getMultiTypeMethods) {
     	    String nameOfMethod = "get" + method.getName().replaceFirst("set", "").replaceFirst("add", "");
         	Set<Method> getTypesForMethods = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(nameOfMethod), ReflectionUtils.withParametersCount(0));
         	Set<Method> removegetTypeSetters = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix(nameOfMethod), ReflectionUtils.withParametersCount(0), ReflectionUtils.withReturnType(org.hl7.fhir.r4.model.Type.class));
         	getTypesForMethods.removeAll(removegetTypeSetters);

         	allSetters.addAll(getTypesForMethods);
     	}
     	
     	
        if(cls.getName().equals("org.hl7.fhir.r4.model.RequestGroup$RequestGroupActionComponent")) {
        	Set<Method> removeAddAction = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setAction"));
         	allSetters.removeAll(removeAddAction);
        } else if (cls.getName().equals("org.hl7.fhir.r4.model.SubstanceSpecification$SubstanceSpecificationNameComponent")) {
        	Set<Method> removeAddSynonym = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setSynonym"));
        	Set<Method> removeAddTranslation = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setTranslation"));
         	allSetters.removeAll(removeAddSynonym);
         	allSetters.removeAll(removeAddTranslation);
    	} else if (cls.getName().equals("org.hl7.fhir.r4.model.MedicinalProductPackaged$MedicinalProductPackagedPackageItemComponent")) {
     		Set<Method> removeAddPackageItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setPackageItem"));
     		allSetters.removeAll(removeAddPackageItem);
    	} else if (cls.getName().equals("org.hl7.fhir.r4.model.Contract$TermComponent")) {
    		Set<Method> removeAddGroup = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setGroup"));
     		allSetters.removeAll(removeAddGroup);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.Composition$SectionComponent")) {
    		Set<Method> removeAddSection = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setSection"));
    		allSetters.removeAll(removeAddSection);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.MedicinalProductAuthorization$MedicinalProductAuthorizationProcedureComponent")) {
    		Set<Method> removeAddApplication = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setApplication"));
    		allSetters.removeAll(removeAddApplication);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.Consent$provisionComponent")) {
    		Set<Method> removeAddProvision = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setProvision"));
    		allSetters.removeAll(removeAddProvision);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.QuestionnaireResponse$QuestionnaireResponseItemComponent")) {
    		Set<Method> removeAddItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setItem"));
    		allSetters.removeAll(removeAddItem);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.QuestionnaireResponse$QuestionnaireResponseItemAnswerComponent")) {
    		Set<Method> removeAddItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setItem"));
    		allSetters.removeAll(removeAddItem);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.CodeSystem$ConceptDefinitionComponent")) {
    		Set<Method> removeAddConcept = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setConcept"));
    		allSetters.removeAll(removeAddConcept);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.ValueSet$ValueSetExpansionContainsComponent")) {
    		Set<Method> removeAddContains = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setContains"));
    		allSetters.removeAll(removeAddContains);
    	}  else if (cls.getName().equals("org.hl7.fhir.r4.model.PlanDefinition$PlanDefinitionActionComponent")) {
    		Set<Method> removeAddAction = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setAction"));
    		allSetters.removeAll(removeAddAction);
        }  else if (cls.getName().equals("org.hl7.fhir.r4.model.OperationDefinition$OperationDefinitionParameterComponent")) {
    		Set<Method> removeAddPart = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setPart"));
    		allSetters.removeAll(removeAddPart);
        }  else if (cls.getName().equals("org.hl7.fhir.r4.model.Questionnaire$QuestionnaireItemComponent")) {
    		Set<Method> removeAddItem = ReflectionUtils.getMethods(cls,ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("setItem"));
    		allSetters.removeAll(removeAddItem);
        }

     	allSetters.removeAll(getMultiTypeMethods);
     	allSetters.removeAll(removeElementSetters);
     	allSetters.removeAll(removeTargetSetters);
     	
     	allSetters.addAll(getMultiTypeMethods);
     	
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

