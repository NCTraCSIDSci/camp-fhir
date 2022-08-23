<#-- // Property accessors -->
<#foreach property in pojo.getAllPropertiesIterator()>
<#if pojo.getMetaAttribAsBool(property, "gen-property", true)>
 <#if pojo.hasFieldJavaDoc(property)>    
    /**       
     * ${pojo.getFieldJavaDoc(property, 4)}
     */
</#if>
    <#include "GetPropertyAnnotation.ftl"/>
    ${pojo.getPropertyGetModifiers(property)} ${pojo.getJavaTypeName(property, jdk5)} ${pojo.getGetterSignature(property)}() {
        return this.${c2j.keyWordCheck(property.name)};
    }
    
    ${pojo.getPropertySetModifiers(property)} void set${pojo.getPropertyName(property)}(${pojo.getJavaTypeName(property, jdk5)} ${c2j.keyWordCheck(property.name)}) {
        this.${c2j.keyWordCheck(property.name)} = ${c2j.keyWordCheck(property.name)};
    }
    
    ${pojo.getPropertySetModifiers(property)} void add${pojo.getPropertyName(property)}(${pojo.getJavaTypeName(property, jdk5)} ${c2j.keyWordCheck(property.name)}) {
      <#-- 	if(${c2j.keyWordCheck(property.name)}.equals("[") | ${c2j.keyWordCheck(property.name)}.equals("]")) {
    	   this.${c2j.keyWordCheck(property.name)} = this.${c2j.keyWordCheck(property.name)}+ ${c2j.keyWordCheck(property.name)};

    	}-->
    	if( ${c2j.keyWordCheck(property.name)} != null ) {
	    	if( this.${c2j.keyWordCheck(property.name)} == null ) {
	        	this.${c2j.keyWordCheck(property.name)} = ${c2j.keyWordCheck(property.name)};
	        } else if(this.${c2j.keyWordCheck(property.name)}.substring(this.${c2j.keyWordCheck(property.name)}.length() - 1).equals("]") & ${c2j.keyWordCheck(property.name)}.equals("[")) {
	        	this.${c2j.keyWordCheck(property.name)} = this.${c2j.keyWordCheck(property.name)}+ "," + ${c2j.keyWordCheck(property.name)};
	        } else if(${c2j.keyWordCheck(property.name)}.equals("[") | ${c2j.keyWordCheck(property.name)}.equals("]") | this.${c2j.keyWordCheck(property.name)}.substring(this.${c2j.keyWordCheck(property.name)}.length() - 1).equals("[")) {
	        	this.${c2j.keyWordCheck(property.name)} = this.${c2j.keyWordCheck(property.name)}+${c2j.keyWordCheck(property.name)};
	        } else  {
	            this.${c2j.keyWordCheck(property.name)} = this.${c2j.keyWordCheck(property.name)}+ "," +${c2j.keyWordCheck(property.name)};
	        }
        }
    }
    
   <#--   ${pojo.getPropertyGetModifiers(property)} ${pojo.getJavaTypeName(property, jdk5)} ${pojo.getGetterSignature(property)}ResourceType() {
        return this.${c2j.asParameterList(pojo.getPropertyClosureForFullConstructor(), jdk5, pojo)};
        ${c2j.asArgumentList(pojo.getPropertyClosureForSuperclassFullConstructor())}
    } -->
    
    
</#if>
</#foreach>
