﻿<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output encoding="utf-8" indent="no" method="text"/>
	<xsl:param name="package"/>
	<xsl:template match="/bean_info">
		
/**
 *  Autogenerated class
 */
package <xsl:value-of select="$package"/>.beans;

import java.io.Serializable;
import java.util.*;
import org.c3s.db.beans.DbBean;
import org.c3s.data.annotations.DataSource;
import org.c3s.data.annotations.DataTarget;
import org.c3s.reflection.annotation.*;

<xsl:variable name="class_name">DB<xsl:value-of select="bean/@name"/>Bean</xsl:variable>
public class <xsl:value-of select="$class_name"/> implements DbBean, Serializable {

	private static final long serialVersionUID = 1L;

<xsl:call-template name="set_get">
	<xsl:with-param name="class_name" select="$class_name"/>
</xsl:call-template>

<xsl:call-template name="autoinc"/>
}
	</xsl:template>
	
	<xsl:template name="set_get">
	<xsl:param name="class_name"/>
	<xsl:for-each select="bean/column/metadata">
	<xsl:variable name="varname"><xsl:call-template name="to_lower_case"><xsl:with-param name="str" select="substring(@name, 1, 1)"/></xsl:call-template><xsl:value-of select="substring(@name, 2)"></xsl:value-of> </xsl:variable>
	
	@DataSource({"<xsl:value-of select="@label"/>", "<xsl:value-of select="$varname"/>"})
	@DataTarget("<xsl:value-of select="@base_name"/>")
	<xsl:choose>
		<xsl:when test="../annotation">
			<xsl:for-each select="../annotation"><xsl:value-of select="text()"/><xsl:text>
</xsl:text></xsl:for-each>
		</xsl:when>
		<xsl:otherwise>@XMLSimple("<xsl:value-of select="$varname"/>")</xsl:otherwise>
	</xsl:choose>
	private <xsl:value-of select="@type"/><xsl:text> </xsl:text><xsl:value-of select="$varname"/>;
	
	public <xsl:value-of select="@type"/> get<xsl:value-of select="@name"/>() {
		return <xsl:value-of select="$varname"/>;
	}
	
	public <xsl:value-of select="$class_name"/> set<xsl:value-of select="@name"/>(<xsl:value-of select="@type"/> value) {
		this.<xsl:value-of select="$varname"/> = value;
		return this;
	}
	</xsl:for-each>
	
	<xsl:for-each select="bean/method">
	<xsl:if test="annotation">
		<xsl:for-each select="annotation">
			<xsl:value-of select="text()"><xsl:text>
</xsl:text>
			</xsl:value-of>
		</xsl:for-each>
	</xsl:if>
	public <xsl:value-of select="@type"/><xsl:text> </xsl:text><xsl:value-of select="@name"/>(<xsl:for-each select="parameter"><xsl:if test="position() != 1">, </xsl:if><xsl:value-of select="@type"/><xsl:text> </xsl:text><xsl:value-of select="@name"/></xsl:for-each>) {
		<xsl:value-of select="body" disable-output-escaping="yes"/>
	} 
	</xsl:for-each>
	
	</xsl:template>	
	
	<xsl:template name="autoinc">
	@Override
	public void setAutoincrementField(Object value) {
		<xsl:for-each select="bean/column/metadata[@autoincrement='true']">
		set<xsl:value-of select="@name"/>(new <xsl:value-of select="@type"/>(value.toString()));
		</xsl:for-each>
	}	
	</xsl:template>
	
	<xsl:template name="to_lower_case">
		<xsl:param name="str"/>
		<xsl:value-of select="translate($str,'QWERTYUIOPASDFGHJKLZXCVBNM', 'qwertyuiopasdfghjklzxcvbnm')"/>
	</xsl:template>
	
</xsl:stylesheet>
