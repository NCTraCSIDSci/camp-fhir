<#if column.isFormula()>
<formula>${column.getFormula()}</formula>
<#else>
<meta attribute="resource-type">${column.comment}</meta>
<column name="${column.quotedName}" ${c2h.columnAttributes(column)}<#if column.comment?exists && column.comment?trim?length!=0>>

<comment>${column.comment}</comment>
</column><#else>/>
</#if>
</#if>