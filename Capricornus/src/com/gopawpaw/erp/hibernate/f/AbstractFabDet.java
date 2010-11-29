package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFabDet entity provides the base persistence definition of the FabDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabDet implements java.io.Serializable {

	// Fields

	private FabDetId id;
	private String fabFamtId;
	private Double fabLife;
	private Date fabDate;
	private Double fabAmt;
	private Date fabOvrdt;
	private Double fabOvramt;
	private Double fabSalvamt;
	private Integer fabUplife;
	private Integer fabUpper;
	private String fabUm;
	private String fabFamtrId;
	private Double fabUpcost;
	private String fabCstAdjper;
	private String fabModUserid;
	private Date fabModDate;
	private String fabUser1;
	private String fabUser2;
	private String fabChr01;
	private Double fabDec01;
	private Boolean fabLog01;
	private Date fabDte01;
	private Integer fabInt01;
	private String fabQadc01;
	private Integer fabInt02;
	private Double fabDec02;
	private Double fabQadd01;
	private Boolean fabQadl01;
	private Integer fabQadi01;
	private Date fabQadt01;
	private String fabQadc02;
	private Double fabQadd02;
	private Integer fabQadi02;
	private Boolean fabQadl02;
	private Date fabQadt02;
	private String fabQadc03;
	private Double oidFabDet;

	// Constructors

	/** default constructor */
	public AbstractFabDet() {
	}

	/** minimal constructor */
	public AbstractFabDet(FabDetId id, String fabFamtId, Double fabLife,
			Date fabDate, Double fabAmt, Double fabOvramt, Double fabSalvamt,
			Integer fabUplife, Integer fabUpper, String fabUm,
			String fabFamtrId, Double fabUpcost, String fabCstAdjper,
			String fabModUserid, Date fabModDate, String fabUser1,
			String fabUser2, String fabChr01, Double fabDec01,
			Boolean fabLog01, Integer fabInt01, String fabQadc01,
			Integer fabInt02, Double fabDec02, Double fabQadd01,
			Boolean fabQadl01, Integer fabQadi01, String fabQadc02,
			Double fabQadd02, Integer fabQadi02, Boolean fabQadl02,
			String fabQadc03, Double oidFabDet) {
		this.id = id;
		this.fabFamtId = fabFamtId;
		this.fabLife = fabLife;
		this.fabDate = fabDate;
		this.fabAmt = fabAmt;
		this.fabOvramt = fabOvramt;
		this.fabSalvamt = fabSalvamt;
		this.fabUplife = fabUplife;
		this.fabUpper = fabUpper;
		this.fabUm = fabUm;
		this.fabFamtrId = fabFamtrId;
		this.fabUpcost = fabUpcost;
		this.fabCstAdjper = fabCstAdjper;
		this.fabModUserid = fabModUserid;
		this.fabModDate = fabModDate;
		this.fabUser1 = fabUser1;
		this.fabUser2 = fabUser2;
		this.fabChr01 = fabChr01;
		this.fabDec01 = fabDec01;
		this.fabLog01 = fabLog01;
		this.fabInt01 = fabInt01;
		this.fabQadc01 = fabQadc01;
		this.fabInt02 = fabInt02;
		this.fabDec02 = fabDec02;
		this.fabQadd01 = fabQadd01;
		this.fabQadl01 = fabQadl01;
		this.fabQadi01 = fabQadi01;
		this.fabQadc02 = fabQadc02;
		this.fabQadd02 = fabQadd02;
		this.fabQadi02 = fabQadi02;
		this.fabQadl02 = fabQadl02;
		this.fabQadc03 = fabQadc03;
		this.oidFabDet = oidFabDet;
	}

	/** full constructor */
	public AbstractFabDet(FabDetId id, String fabFamtId, Double fabLife,
			Date fabDate, Double fabAmt, Date fabOvrdt, Double fabOvramt,
			Double fabSalvamt, Integer fabUplife, Integer fabUpper,
			String fabUm, String fabFamtrId, Double fabUpcost,
			String fabCstAdjper, String fabModUserid, Date fabModDate,
			String fabUser1, String fabUser2, String fabChr01, Double fabDec01,
			Boolean fabLog01, Date fabDte01, Integer fabInt01,
			String fabQadc01, Integer fabInt02, Double fabDec02,
			Double fabQadd01, Boolean fabQadl01, Integer fabQadi01,
			Date fabQadt01, String fabQadc02, Double fabQadd02,
			Integer fabQadi02, Boolean fabQadl02, Date fabQadt02,
			String fabQadc03, Double oidFabDet) {
		this.id = id;
		this.fabFamtId = fabFamtId;
		this.fabLife = fabLife;
		this.fabDate = fabDate;
		this.fabAmt = fabAmt;
		this.fabOvrdt = fabOvrdt;
		this.fabOvramt = fabOvramt;
		this.fabSalvamt = fabSalvamt;
		this.fabUplife = fabUplife;
		this.fabUpper = fabUpper;
		this.fabUm = fabUm;
		this.fabFamtrId = fabFamtrId;
		this.fabUpcost = fabUpcost;
		this.fabCstAdjper = fabCstAdjper;
		this.fabModUserid = fabModUserid;
		this.fabModDate = fabModDate;
		this.fabUser1 = fabUser1;
		this.fabUser2 = fabUser2;
		this.fabChr01 = fabChr01;
		this.fabDec01 = fabDec01;
		this.fabLog01 = fabLog01;
		this.fabDte01 = fabDte01;
		this.fabInt01 = fabInt01;
		this.fabQadc01 = fabQadc01;
		this.fabInt02 = fabInt02;
		this.fabDec02 = fabDec02;
		this.fabQadd01 = fabQadd01;
		this.fabQadl01 = fabQadl01;
		this.fabQadi01 = fabQadi01;
		this.fabQadt01 = fabQadt01;
		this.fabQadc02 = fabQadc02;
		this.fabQadd02 = fabQadd02;
		this.fabQadi02 = fabQadi02;
		this.fabQadl02 = fabQadl02;
		this.fabQadt02 = fabQadt02;
		this.fabQadc03 = fabQadc03;
		this.oidFabDet = oidFabDet;
	}

	// Property accessors

	public FabDetId getId() {
		return this.id;
	}

	public void setId(FabDetId id) {
		this.id = id;
	}

	public String getFabFamtId() {
		return this.fabFamtId;
	}

	public void setFabFamtId(String fabFamtId) {
		this.fabFamtId = fabFamtId;
	}

	public Double getFabLife() {
		return this.fabLife;
	}

	public void setFabLife(Double fabLife) {
		this.fabLife = fabLife;
	}

	public Date getFabDate() {
		return this.fabDate;
	}

	public void setFabDate(Date fabDate) {
		this.fabDate = fabDate;
	}

	public Double getFabAmt() {
		return this.fabAmt;
	}

	public void setFabAmt(Double fabAmt) {
		this.fabAmt = fabAmt;
	}

	public Date getFabOvrdt() {
		return this.fabOvrdt;
	}

	public void setFabOvrdt(Date fabOvrdt) {
		this.fabOvrdt = fabOvrdt;
	}

	public Double getFabOvramt() {
		return this.fabOvramt;
	}

	public void setFabOvramt(Double fabOvramt) {
		this.fabOvramt = fabOvramt;
	}

	public Double getFabSalvamt() {
		return this.fabSalvamt;
	}

	public void setFabSalvamt(Double fabSalvamt) {
		this.fabSalvamt = fabSalvamt;
	}

	public Integer getFabUplife() {
		return this.fabUplife;
	}

	public void setFabUplife(Integer fabUplife) {
		this.fabUplife = fabUplife;
	}

	public Integer getFabUpper() {
		return this.fabUpper;
	}

	public void setFabUpper(Integer fabUpper) {
		this.fabUpper = fabUpper;
	}

	public String getFabUm() {
		return this.fabUm;
	}

	public void setFabUm(String fabUm) {
		this.fabUm = fabUm;
	}

	public String getFabFamtrId() {
		return this.fabFamtrId;
	}

	public void setFabFamtrId(String fabFamtrId) {
		this.fabFamtrId = fabFamtrId;
	}

	public Double getFabUpcost() {
		return this.fabUpcost;
	}

	public void setFabUpcost(Double fabUpcost) {
		this.fabUpcost = fabUpcost;
	}

	public String getFabCstAdjper() {
		return this.fabCstAdjper;
	}

	public void setFabCstAdjper(String fabCstAdjper) {
		this.fabCstAdjper = fabCstAdjper;
	}

	public String getFabModUserid() {
		return this.fabModUserid;
	}

	public void setFabModUserid(String fabModUserid) {
		this.fabModUserid = fabModUserid;
	}

	public Date getFabModDate() {
		return this.fabModDate;
	}

	public void setFabModDate(Date fabModDate) {
		this.fabModDate = fabModDate;
	}

	public String getFabUser1() {
		return this.fabUser1;
	}

	public void setFabUser1(String fabUser1) {
		this.fabUser1 = fabUser1;
	}

	public String getFabUser2() {
		return this.fabUser2;
	}

	public void setFabUser2(String fabUser2) {
		this.fabUser2 = fabUser2;
	}

	public String getFabChr01() {
		return this.fabChr01;
	}

	public void setFabChr01(String fabChr01) {
		this.fabChr01 = fabChr01;
	}

	public Double getFabDec01() {
		return this.fabDec01;
	}

	public void setFabDec01(Double fabDec01) {
		this.fabDec01 = fabDec01;
	}

	public Boolean getFabLog01() {
		return this.fabLog01;
	}

	public void setFabLog01(Boolean fabLog01) {
		this.fabLog01 = fabLog01;
	}

	public Date getFabDte01() {
		return this.fabDte01;
	}

	public void setFabDte01(Date fabDte01) {
		this.fabDte01 = fabDte01;
	}

	public Integer getFabInt01() {
		return this.fabInt01;
	}

	public void setFabInt01(Integer fabInt01) {
		this.fabInt01 = fabInt01;
	}

	public String getFabQadc01() {
		return this.fabQadc01;
	}

	public void setFabQadc01(String fabQadc01) {
		this.fabQadc01 = fabQadc01;
	}

	public Integer getFabInt02() {
		return this.fabInt02;
	}

	public void setFabInt02(Integer fabInt02) {
		this.fabInt02 = fabInt02;
	}

	public Double getFabDec02() {
		return this.fabDec02;
	}

	public void setFabDec02(Double fabDec02) {
		this.fabDec02 = fabDec02;
	}

	public Double getFabQadd01() {
		return this.fabQadd01;
	}

	public void setFabQadd01(Double fabQadd01) {
		this.fabQadd01 = fabQadd01;
	}

	public Boolean getFabQadl01() {
		return this.fabQadl01;
	}

	public void setFabQadl01(Boolean fabQadl01) {
		this.fabQadl01 = fabQadl01;
	}

	public Integer getFabQadi01() {
		return this.fabQadi01;
	}

	public void setFabQadi01(Integer fabQadi01) {
		this.fabQadi01 = fabQadi01;
	}

	public Date getFabQadt01() {
		return this.fabQadt01;
	}

	public void setFabQadt01(Date fabQadt01) {
		this.fabQadt01 = fabQadt01;
	}

	public String getFabQadc02() {
		return this.fabQadc02;
	}

	public void setFabQadc02(String fabQadc02) {
		this.fabQadc02 = fabQadc02;
	}

	public Double getFabQadd02() {
		return this.fabQadd02;
	}

	public void setFabQadd02(Double fabQadd02) {
		this.fabQadd02 = fabQadd02;
	}

	public Integer getFabQadi02() {
		return this.fabQadi02;
	}

	public void setFabQadi02(Integer fabQadi02) {
		this.fabQadi02 = fabQadi02;
	}

	public Boolean getFabQadl02() {
		return this.fabQadl02;
	}

	public void setFabQadl02(Boolean fabQadl02) {
		this.fabQadl02 = fabQadl02;
	}

	public Date getFabQadt02() {
		return this.fabQadt02;
	}

	public void setFabQadt02(Date fabQadt02) {
		this.fabQadt02 = fabQadt02;
	}

	public String getFabQadc03() {
		return this.fabQadc03;
	}

	public void setFabQadc03(String fabQadc03) {
		this.fabQadc03 = fabQadc03;
	}

	public Double getOidFabDet() {
		return this.oidFabDet;
	}

	public void setOidFabDet(Double oidFabDet) {
		this.oidFabDet = oidFabDet;
	}

}