<?xml version="1.0" encoding="UTF-8"?>
<!-- transform.xslt -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="order">
        <transformedOrder>
            <product><xsl:value-of select="item"/></product>
            <quantity><xsl:value-of select="quantity"/></quantity>
        </transformedOrder>
    </xsl:template>
</xsl:stylesheet>