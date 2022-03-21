<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt">


    <xsl:template match="/">

        <div class="tab-pane">

            <xsl:attribute name="id">
                <xsl:value-of select="hibernate-mapping/class/@name"/>
            </xsl:attribute>


            <!-- <form method="post" action="\saveXML"> -->

            <!-- 
                <h2>
                    <xsl:value-of select="hibernate-mapping/class/@name"/>
 Table Information:</h2> -->
            <label>
                <xsl:attribute name="for">
                    <xsl:value-of select="concat(hibernate-mapping/class/@name,'tableNameToChangeTo')"/>
                </xsl:attribute>
                    Change Table Name:
            </label>

            <input type="text" class="form-control" name="tableName">
                <xsl:attribute name="id">
                    <xsl:value-of select="concat(hibernate-mapping/class/@table,'tableNameToChangeTo')"/>
                </xsl:attribute>
                <xsl:attribute name="value">
                    <xsl:value-of select="hibernate-mapping/class/@table"/>
                </xsl:attribute>
                <xsl:attribute name="name">
                    <xsl:value-of select="concat(hibernate-mapping/class/@table,'tableNameToChangeTo')"/>
                </xsl:attribute>
            </input>
            <label>
                <xsl:attribute name="for">
                    <xsl:value-of select="concat(hibernate-mapping/class/@name,'SearchInput')"/>
                </xsl:attribute>
                Filter Table:                
            </label>
            <input type="text" class="form-control" onkeyup="myFunction(this.id)" placeholder="Search for element..">
                <xsl:attribute name="id">
                    <xsl:value-of select="concat(hibernate-mapping/class/@name,'SearchInput')"/>
                </xsl:attribute>
            </input>

            <div style="max-height: 600px;
  overflow: auto;
  ;">
                <table class="table table-striped table-sm">
                    <xsl:attribute name="id">
                        <xsl:value-of select="concat(hibernate-mapping/class/@name,'Table')"/>
                    </xsl:attribute>
                    <thead>
                        <tr>
                            <th style="position: sticky; top: 0; z-index: 1; background:#FFF;">CAMPFHIR Column Name</th>
                            <th style="position: sticky; top: 0; z-index: 1; background:#FFF;">Alias</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:for-each select="hibernate-mapping/class/property/column">
                            <tr >
                                <td style="width: 50%;">
                                    <xsl:value-of select="@name"/>
                                </td>
                                <td style="width: 50%;">
                                    <input type="text" style="width: 100%;" name="tableName">

                                        <xsl:attribute name="id">
                                            <xsl:value-of select="@name"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="name">
                                            <xsl:value-of select="@name"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="value">
                                            <xsl:value-of select="@name"/>
                                        </xsl:attribute>
                                    </input>
                                </td>
                            </tr>
                        </xsl:for-each>
                    </tbody>

                </table>
            </div>
            <br/>
            <!-- </form> -->
        </div>
    </xsl:template>
</xsl:stylesheet>