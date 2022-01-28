package main.templateoutput.Conversions;
// Generated on ${date} 

<#assign classbody>
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>/**
 *  object for conversion model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ${declarationName}Conversion 
{
	public ${pojo.importType("org.hl7.fhir.r4.model.Patient")} ${declarationName}s(${pojo.importType("main.templateoutput.Model." + declarationName)} ${declarationName?lower_case}) 
	{
			${pojo.importType("org.hl7.fhir.r4.model.Patient")}  ${declarationName}obj = new ${pojo.importType("org.hl7.fhir.r4.model.Patient")}(); 

		<#foreach property in pojo.getAllPropertiesIterator()><#if pojo.hasMetaAttribute(property, "resource-type")> 
				<#--${c2j.getMetaAsString(property, "resource-type","\n")} -->
				<#assign test = c2j.getMetaAsString(property, "resource-type","\n")>
				<#assign m = test?eval_json>
				<#assign currentmethodlist =  m.methodName?split(",")>
				<#assign currentdatatypelist =  m.datatype?split(",")>
				<#assign currentvariablename = declarationName + "obj" +currentmethodlist[0]?replace(")", "")?replace("(", "")>
				<#--  <#if previousmethodlist??>
					<#if currentmethodlist[0] != previousmethodlist[0]>
						${pojo.importType("org.hl7.fhir.r4.model." +currentdatatypelist[0])} ${currentvariablename} = ${declarationName}obj.${currentmethodlist[0]}();
					</#if>
				<#else>${pojo.importType("org.hl7.fhir.r4.model." +currentdatatypelist[0])} ${currentvariablename} = ${declarationName}obj.${currentmethodlist[0]}();
				</#if>-->
				<#include "datatypes.ftl"/> /** ${c2j.getMetaAsString(property, "resource-type","\n")} **/
				<#--<#list m.datatype?split(",") as mthdtype><#if mthdtype?index == method?index>${mthdtype}</#if></#list> <#if method?index == 0 & currentmethodlist?size != 1>${currentvariablename}<#else>.${method?trim}(<#if currentmethodlist?size - 1 == method?index>${declarationName?lower_case}.${pojo.getGetterSignature(property)}()</#if>)</#if>	-->
				<#assign previousmethodlist =  m.methodName?split(",")>
			</#if>      
		</#foreach>));
	}
}
</#assign>

${pojo.generateImports()}
${classbody}