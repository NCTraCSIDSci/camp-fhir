<li >


    <a data-toggle="tab">
        <xsl:attribute name="href">
            <xsl:value-of select="concat('#',hibernate-mapping/class/@name)"/>
        </xsl:attribute>

        <xsl:value-of select="hibernate-mapping/class/@name"/>

    </button>
</li>