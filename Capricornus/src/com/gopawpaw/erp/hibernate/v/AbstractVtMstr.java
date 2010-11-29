package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVtMstr entity provides the base persistence definition of the VtMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVtMstr implements java.io.Serializable {

	// Fields

	private VtMstrId id;
	private Date vtEnd;
	private Double vtTaxPct;
	private String vtApAcct;
	private String vtApCc;
	private String vtArAcct;
	private String vtArCc;
	private String vtProject;
	private String vtUser1;
	private String vtUser2;
	private String vtDesc;
	private String vtQadc01;
	private Double oidVtMstr;

	// Constructors

	/** default constructor */
	public AbstractVtMstr() {
	}

	/** minimal constructor */
	public AbstractVtMstr(VtMstrId id, Double oidVtMstr) {
		this.id = id;
		this.oidVtMstr = oidVtMstr;
	}

	/** full constructor */
	public AbstractVtMstr(VtMstrId id, Date vtEnd, Double vtTaxPct,
			String vtApAcct, String vtApCc, String vtArAcct, String vtArCc,
			String vtProject, String vtUser1, String vtUser2, String vtDesc,
			String vtQadc01, Double oidVtMstr) {
		this.id = id;
		this.vtEnd = vtEnd;
		this.vtTaxPct = vtTaxPct;
		this.vtApAcct = vtApAcct;
		this.vtApCc = vtApCc;
		this.vtArAcct = vtArAcct;
		this.vtArCc = vtArCc;
		this.vtProject = vtProject;
		this.vtUser1 = vtUser1;
		this.vtUser2 = vtUser2;
		this.vtDesc = vtDesc;
		this.vtQadc01 = vtQadc01;
		this.oidVtMstr = oidVtMstr;
	}

	// Property accessors

	public VtMstrId getId() {
		return this.id;
	}

	public void setId(VtMstrId id) {
		this.id = id;
	}

	public Date getVtEnd() {
		return this.vtEnd;
	}

	public void setVtEnd(Date vtEnd) {
		this.vtEnd = vtEnd;
	}

	public Double getVtTaxPct() {
		return this.vtTaxPct;
	}

	public void setVtTaxPct(Double vtTaxPct) {
		this.vtTaxPct = vtTaxPct;
	}

	public String getVtApAcct() {
		return this.vtApAcct;
	}

	public void setVtApAcct(String vtApAcct) {
		this.vtApAcct = vtApAcct;
	}

	public String getVtApCc() {
		return this.vtApCc;
	}

	public void setVtApCc(String vtApCc) {
		this.vtApCc = vtApCc;
	}

	public String getVtArAcct() {
		return this.vtArAcct;
	}

	public void setVtArAcct(String vtArAcct) {
		this.vtArAcct = vtArAcct;
	}

	public String getVtArCc() {
		return this.vtArCc;
	}

	public void setVtArCc(String vtArCc) {
		this.vtArCc = vtArCc;
	}

	public String getVtProject() {
		return this.vtProject;
	}

	public void setVtProject(String vtProject) {
		this.vtProject = vtProject;
	}

	public String getVtUser1() {
		return this.vtUser1;
	}

	public void setVtUser1(String vtUser1) {
		this.vtUser1 = vtUser1;
	}

	public String getVtUser2() {
		return this.vtUser2;
	}

	public void setVtUser2(String vtUser2) {
		this.vtUser2 = vtUser2;
	}

	public String getVtDesc() {
		return this.vtDesc;
	}

	public void setVtDesc(String vtDesc) {
		this.vtDesc = vtDesc;
	}

	public String getVtQadc01() {
		return this.vtQadc01;
	}

	public void setVtQadc01(String vtQadc01) {
		this.vtQadc01 = vtQadc01;
	}

	public Double getOidVtMstr() {
		return this.oidVtMstr;
	}

	public void setOidVtMstr(Double oidVtMstr) {
		this.oidVtMstr = oidVtMstr;
	}

}