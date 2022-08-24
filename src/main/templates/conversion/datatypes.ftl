<#compress>
<#if !(previousdatatype?has_content) | !(previousmethodlist?has_content) | currentdatatypelist[0] != previousdatatype[0] | currentmethodlist[0]!=previousmethodlist[0]><#if previousdatatype?has_content>));</#if>
	<#assign currentMethodName = currentmethodlist[0]?trim>
	<#assign currentdatatypeinlist = currentdatatypelist[0]>
	<#assign dataTypes = ["Boolean", "Datetime", "Integer"]>
		<#foreach dataType in dataTypes>
			<#if currentMethodName?contains(dataType) ><#assign currentdatatypeinlist = currentdatatypeinlist+"type"><#assign currentMethodName = currentMethodName?replace(dataType,"")></#if>
		</#foreach>
	${declarationName}obj.${currentMethodName}(HapiFHIRHelpers.create${currentdatatypeinlist}(${declarationName?lower_case}.${pojo.getGetterSignature(property)}()
<#else>
	, ${declarationName?lower_case}.${pojo.getGetterSignature(property)}() 
</#if>
<#assign previousdatatype =  m.datatype?split(",")>
</#compress>