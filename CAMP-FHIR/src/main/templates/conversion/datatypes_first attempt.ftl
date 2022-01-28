<#list currentmethodlist as method>
	<#-- If the previos method list exists and it has a method at the same index that the current list has one then check if it is the same method if it is then skip that method -->
	<#if previousmethodlist?? && previousmethodlist?has_content && previousmethodlist[method?index]?? && previousmethodlist[method?index]?has_content>		
		<#if previousmethodlist[method?index] == method>
			
		<#else>
			<#if method?index == 0 & currentmethodlist?size != 1>
				 ${currentvariablename}
			<#else>
				<#if method?index != currentmethodlist?size -1 >
					${pojo.importType("org.hl7.fhir.r4.model." +currentdatatypelist[method?index]?trim)} set${currentdatatypelist[method?index]?trim} = new ${pojo.importType("org.hl7.fhir.r4.model." +currentdatatypelist[method?index]?trim)}();
				 	<#assign thisloopsvariable = "set" + currentdatatypelist[method?index]?trim>
				<#-- ${currentdatatypelist[method?index]!"This was missing"}-->
				 <#else>
				${thisloopsvariable!""}.${method?trim}(
				<#if currentmethodlist?size - 1 == method?index>
					${declarationName?lower_case}.${pojo.getGetterSignature(property)}()
				</#if>
				);
				</#if>
			</#if>
		</#if>
	<#else>
		<#-- here <#if method?index == 0 & currentmethodlist?size != 1>${currentvariablename}<#else>.${method?trim}(<#if currentmethodlist?size - 1 == method?index>${declarationName?lower_case}.${pojo.getGetterSignature(property)}()</#if>);</#if>-->
		<#if method?index == 0 & currentmethodlist?size != 1>
				 ${currentvariablename}
			<#else>
				<#if method?index != currentmethodlist?size -1 >
					${pojo.importType("org.hl7.fhir.r4.model." +currentdatatypelist[method?index]?trim)} set${currentdatatypelist[method?index]?trim} = new ${pojo.importType("org.hl7.fhir.r4.model." +currentdatatypelist[method?index]?trim)}();
				 	<#assign thisloopsvariable = "set" + currentdatatypelist[method?index]?trim>
				<#-- ${currentdatatypelist[method?index]!"This was missing"}-->
				 <#else>
				${thisloopsvariable!""}.${method?trim}(
				<#if currentmethodlist?size - 1 == method?index>
					${declarationName?lower_case}.${pojo.getGetterSignature(property)}()
				</#if>
				);
				</#if>
			</#if>
	</#if>
</#list>