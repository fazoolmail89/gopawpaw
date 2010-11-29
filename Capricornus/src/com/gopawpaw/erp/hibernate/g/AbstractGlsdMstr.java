package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGlsdMstr entity provides the base persistence definition of the
 * GlsdMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlsdMstr implements java.io.Serializable {

	// Fields

	private GlsdMstrId id;
	private String glsdSrcDesc;
	private String glsdModUserid;
	private Date glsdModDate;
	private String glsdUser1;
	private String glsdUser2;
	private String glsdQadc01;
	private String glsdQadc02;
	private String glsdExec;
	private Double oidGlsdMstr;

	// Constructors

	/** default constructor */
	public AbstractGlsdMstr() {
	}

	/** full constructor */
	public AbstractGlsdMstr(GlsdMstrId id, String glsdSrcDesc,
			String glsdModUserid, Date glsdModDate, String glsdUser1,
			String glsdUser2, String glsdQadc01, String glsdQadc02,
			String glsdExec, Double oidGlsdMstr) {
		this.id = id;
		this.glsdSrcDesc = glsdSrcDesc;
		this.glsdModUserid = glsdModUserid;
		this.glsdModDate = glsdModDate;
		this.glsdUser1 = glsdUser1;
		this.glsdUser2 = glsdUser2;
		this.glsdQadc01 = glsdQadc01;
		this.glsdQadc02 = glsdQadc02;
		this.glsdExec = glsdExec;
		this.oidGlsdMstr = oidGlsdMstr;
	}

	// Property accessors

	public GlsdMstrId getId() {
		return this.id;
	}

	public void setId(GlsdMstrId id) {
		this.id = id;
	}

	public String getGlsdSrcDesc() {
		return this.glsdSrcDesc;
	}

	public void setGlsdSrcDesc(String glsdSrcDesc) {
		this.glsdSrcDesc = glsdSrcDesc;
	}

	public String getGlsdModUserid() {
		return this.glsdModUserid;
	}

	public void setGlsdModUserid(String glsdModUserid) {
		this.glsdModUserid = glsdModUserid;
	}

	public Date getGlsdModDate() {
		return this.glsdModDate;
	}

	public void setGlsdModDate(Date glsdModDate) {
		this.glsdModDate = glsdModDate;
	}

	public String getGlsdUser1() {
		return this.glsdUser1;
	}

	public void setGlsdUser1(String glsdUser1) {
		this.glsdUser1 = glsdUser1;
	}

	public String getGlsdUser2() {
		return this.glsdUser2;
	}

	public void setGlsdUser2(String glsdUser2) {
		this.glsdUser2 = glsdUser2;
	}

	public String getGlsdQadc01() {
		return this.glsdQadc01;
	}

	public void setGlsdQadc01(String glsdQadc01) {
		this.glsdQadc01 = glsdQadc01;
	}

	public String getGlsdQadc02() {
		return this.glsdQadc02;
	}

	public void setGlsdQadc02(String glsdQadc02) {
		this.glsdQadc02 = glsdQadc02;
	}

	public String getGlsdExec() {
		return this.glsdExec;
	}

	public void setGlsdExec(String glsdExec) {
		this.glsdExec = glsdExec;
	}

	public Double getOidGlsdMstr() {
		return this.oidGlsdMstr;
	}

	public void setOidGlsdMstr(Double oidGlsdMstr) {
		this.oidGlsdMstr = oidGlsdMstr;
	}

}