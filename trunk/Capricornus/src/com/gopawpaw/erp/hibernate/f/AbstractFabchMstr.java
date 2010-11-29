package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFabchMstr entity provides the base persistence definition of the
 * FabchMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabchMstr implements java.io.Serializable {

	// Fields

	private FabchMstrId id;
	private Double fabchCtrl;
	private Date fabchCreatedt;
	private String fabchModUserid;
	private Date fabchModDate;
	private String fabchUser1;
	private String fabchUser2;
	private String fabchChr01;
	private Double fabchDec01;
	private Boolean fabchLog01;
	private Date fabchDte01;
	private Integer fabchInt01;
	private String fabchQadc01;
	private Double fabchQadd01;
	private Boolean fabchQadl01;
	private Integer fabchQadi01;
	private Date fabchQadt01;
	private Double oidFabchMstr;

	// Constructors

	/** default constructor */
	public AbstractFabchMstr() {
	}

	/** minimal constructor */
	public AbstractFabchMstr(FabchMstrId id, Double fabchCtrl,
			String fabchModUserid, Date fabchModDate, String fabchUser1,
			String fabchUser2, String fabchChr01, Double fabchDec01,
			Boolean fabchLog01, Integer fabchInt01, String fabchQadc01,
			Double fabchQadd01, Boolean fabchQadl01, Integer fabchQadi01,
			Double oidFabchMstr) {
		this.id = id;
		this.fabchCtrl = fabchCtrl;
		this.fabchModUserid = fabchModUserid;
		this.fabchModDate = fabchModDate;
		this.fabchUser1 = fabchUser1;
		this.fabchUser2 = fabchUser2;
		this.fabchChr01 = fabchChr01;
		this.fabchDec01 = fabchDec01;
		this.fabchLog01 = fabchLog01;
		this.fabchInt01 = fabchInt01;
		this.fabchQadc01 = fabchQadc01;
		this.fabchQadd01 = fabchQadd01;
		this.fabchQadl01 = fabchQadl01;
		this.fabchQadi01 = fabchQadi01;
		this.oidFabchMstr = oidFabchMstr;
	}

	/** full constructor */
	public AbstractFabchMstr(FabchMstrId id, Double fabchCtrl,
			Date fabchCreatedt, String fabchModUserid, Date fabchModDate,
			String fabchUser1, String fabchUser2, String fabchChr01,
			Double fabchDec01, Boolean fabchLog01, Date fabchDte01,
			Integer fabchInt01, String fabchQadc01, Double fabchQadd01,
			Boolean fabchQadl01, Integer fabchQadi01, Date fabchQadt01,
			Double oidFabchMstr) {
		this.id = id;
		this.fabchCtrl = fabchCtrl;
		this.fabchCreatedt = fabchCreatedt;
		this.fabchModUserid = fabchModUserid;
		this.fabchModDate = fabchModDate;
		this.fabchUser1 = fabchUser1;
		this.fabchUser2 = fabchUser2;
		this.fabchChr01 = fabchChr01;
		this.fabchDec01 = fabchDec01;
		this.fabchLog01 = fabchLog01;
		this.fabchDte01 = fabchDte01;
		this.fabchInt01 = fabchInt01;
		this.fabchQadc01 = fabchQadc01;
		this.fabchQadd01 = fabchQadd01;
		this.fabchQadl01 = fabchQadl01;
		this.fabchQadi01 = fabchQadi01;
		this.fabchQadt01 = fabchQadt01;
		this.oidFabchMstr = oidFabchMstr;
	}

	// Property accessors

	public FabchMstrId getId() {
		return this.id;
	}

	public void setId(FabchMstrId id) {
		this.id = id;
	}

	public Double getFabchCtrl() {
		return this.fabchCtrl;
	}

	public void setFabchCtrl(Double fabchCtrl) {
		this.fabchCtrl = fabchCtrl;
	}

	public Date getFabchCreatedt() {
		return this.fabchCreatedt;
	}

	public void setFabchCreatedt(Date fabchCreatedt) {
		this.fabchCreatedt = fabchCreatedt;
	}

	public String getFabchModUserid() {
		return this.fabchModUserid;
	}

	public void setFabchModUserid(String fabchModUserid) {
		this.fabchModUserid = fabchModUserid;
	}

	public Date getFabchModDate() {
		return this.fabchModDate;
	}

	public void setFabchModDate(Date fabchModDate) {
		this.fabchModDate = fabchModDate;
	}

	public String getFabchUser1() {
		return this.fabchUser1;
	}

	public void setFabchUser1(String fabchUser1) {
		this.fabchUser1 = fabchUser1;
	}

	public String getFabchUser2() {
		return this.fabchUser2;
	}

	public void setFabchUser2(String fabchUser2) {
		this.fabchUser2 = fabchUser2;
	}

	public String getFabchChr01() {
		return this.fabchChr01;
	}

	public void setFabchChr01(String fabchChr01) {
		this.fabchChr01 = fabchChr01;
	}

	public Double getFabchDec01() {
		return this.fabchDec01;
	}

	public void setFabchDec01(Double fabchDec01) {
		this.fabchDec01 = fabchDec01;
	}

	public Boolean getFabchLog01() {
		return this.fabchLog01;
	}

	public void setFabchLog01(Boolean fabchLog01) {
		this.fabchLog01 = fabchLog01;
	}

	public Date getFabchDte01() {
		return this.fabchDte01;
	}

	public void setFabchDte01(Date fabchDte01) {
		this.fabchDte01 = fabchDte01;
	}

	public Integer getFabchInt01() {
		return this.fabchInt01;
	}

	public void setFabchInt01(Integer fabchInt01) {
		this.fabchInt01 = fabchInt01;
	}

	public String getFabchQadc01() {
		return this.fabchQadc01;
	}

	public void setFabchQadc01(String fabchQadc01) {
		this.fabchQadc01 = fabchQadc01;
	}

	public Double getFabchQadd01() {
		return this.fabchQadd01;
	}

	public void setFabchQadd01(Double fabchQadd01) {
		this.fabchQadd01 = fabchQadd01;
	}

	public Boolean getFabchQadl01() {
		return this.fabchQadl01;
	}

	public void setFabchQadl01(Boolean fabchQadl01) {
		this.fabchQadl01 = fabchQadl01;
	}

	public Integer getFabchQadi01() {
		return this.fabchQadi01;
	}

	public void setFabchQadi01(Integer fabchQadi01) {
		this.fabchQadi01 = fabchQadi01;
	}

	public Date getFabchQadt01() {
		return this.fabchQadt01;
	}

	public void setFabchQadt01(Date fabchQadt01) {
		this.fabchQadt01 = fabchQadt01;
	}

	public Double getOidFabchMstr() {
		return this.oidFabchMstr;
	}

	public void setOidFabchMstr(Double oidFabchMstr) {
		this.oidFabchMstr = oidFabchMstr;
	}

}