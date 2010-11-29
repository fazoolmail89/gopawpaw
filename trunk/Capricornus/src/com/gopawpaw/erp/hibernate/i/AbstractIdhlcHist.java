package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIdhlcHist entity provides the base persistence definition of the
 * IdhlcHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIdhlcHist implements java.io.Serializable {

	// Fields

	private IdhlcHistId id;
	private String idhlcTrl;
	private String idhlcChargeCategory;
	private String idhlcPart;
	private Double idhlcPrice;
	private String idhlcChargeType;
	private Double idhlcQtyInv;
	private String idhlcUm;
	private String idhlcDesc;
	private String idhlcDesc1;
	private String idhlcDesc2;
	private String idhlcFrClass;
	private Double idhlcFrWt;
	private String idhlcFrWtUm;
	private String idhlcProdline;
	private Boolean idhlcTaxable;
	private String idhlcTaxc;
	private String idhlcTaxEnv;
	private String idhlcTaxUsage;
	private String idhlcAcct;
	private String idhlcSub;
	private String idhlcCc;
	private String idhlcProject;
	private String idhlcModUserid;
	private Date idhlcModDate;
	private String idhlcUserc01;
	private String idhlcUserc02;
	private String idhlcQadc01;
	private String idhlcQadc02;
	private Double oidIdhlcHist;

	// Constructors

	/** default constructor */
	public AbstractIdhlcHist() {
	}

	/** minimal constructor */
	public AbstractIdhlcHist(IdhlcHistId id, String idhlcTrl,
			String idhlcChargeCategory, String idhlcPart, Double idhlcPrice,
			String idhlcChargeType, Double idhlcQtyInv, String idhlcUm,
			String idhlcDesc, String idhlcDesc1, String idhlcDesc2,
			String idhlcFrClass, Double idhlcFrWt, String idhlcFrWtUm,
			String idhlcProdline, Boolean idhlcTaxable, String idhlcTaxc,
			String idhlcTaxEnv, String idhlcTaxUsage, String idhlcAcct,
			String idhlcSub, String idhlcCc, String idhlcProject,
			String idhlcModUserid, String idhlcUserc01, String idhlcUserc02,
			String idhlcQadc01, String idhlcQadc02, Double oidIdhlcHist) {
		this.id = id;
		this.idhlcTrl = idhlcTrl;
		this.idhlcChargeCategory = idhlcChargeCategory;
		this.idhlcPart = idhlcPart;
		this.idhlcPrice = idhlcPrice;
		this.idhlcChargeType = idhlcChargeType;
		this.idhlcQtyInv = idhlcQtyInv;
		this.idhlcUm = idhlcUm;
		this.idhlcDesc = idhlcDesc;
		this.idhlcDesc1 = idhlcDesc1;
		this.idhlcDesc2 = idhlcDesc2;
		this.idhlcFrClass = idhlcFrClass;
		this.idhlcFrWt = idhlcFrWt;
		this.idhlcFrWtUm = idhlcFrWtUm;
		this.idhlcProdline = idhlcProdline;
		this.idhlcTaxable = idhlcTaxable;
		this.idhlcTaxc = idhlcTaxc;
		this.idhlcTaxEnv = idhlcTaxEnv;
		this.idhlcTaxUsage = idhlcTaxUsage;
		this.idhlcAcct = idhlcAcct;
		this.idhlcSub = idhlcSub;
		this.idhlcCc = idhlcCc;
		this.idhlcProject = idhlcProject;
		this.idhlcModUserid = idhlcModUserid;
		this.idhlcUserc01 = idhlcUserc01;
		this.idhlcUserc02 = idhlcUserc02;
		this.idhlcQadc01 = idhlcQadc01;
		this.idhlcQadc02 = idhlcQadc02;
		this.oidIdhlcHist = oidIdhlcHist;
	}

	/** full constructor */
	public AbstractIdhlcHist(IdhlcHistId id, String idhlcTrl,
			String idhlcChargeCategory, String idhlcPart, Double idhlcPrice,
			String idhlcChargeType, Double idhlcQtyInv, String idhlcUm,
			String idhlcDesc, String idhlcDesc1, String idhlcDesc2,
			String idhlcFrClass, Double idhlcFrWt, String idhlcFrWtUm,
			String idhlcProdline, Boolean idhlcTaxable, String idhlcTaxc,
			String idhlcTaxEnv, String idhlcTaxUsage, String idhlcAcct,
			String idhlcSub, String idhlcCc, String idhlcProject,
			String idhlcModUserid, Date idhlcModDate, String idhlcUserc01,
			String idhlcUserc02, String idhlcQadc01, String idhlcQadc02,
			Double oidIdhlcHist) {
		this.id = id;
		this.idhlcTrl = idhlcTrl;
		this.idhlcChargeCategory = idhlcChargeCategory;
		this.idhlcPart = idhlcPart;
		this.idhlcPrice = idhlcPrice;
		this.idhlcChargeType = idhlcChargeType;
		this.idhlcQtyInv = idhlcQtyInv;
		this.idhlcUm = idhlcUm;
		this.idhlcDesc = idhlcDesc;
		this.idhlcDesc1 = idhlcDesc1;
		this.idhlcDesc2 = idhlcDesc2;
		this.idhlcFrClass = idhlcFrClass;
		this.idhlcFrWt = idhlcFrWt;
		this.idhlcFrWtUm = idhlcFrWtUm;
		this.idhlcProdline = idhlcProdline;
		this.idhlcTaxable = idhlcTaxable;
		this.idhlcTaxc = idhlcTaxc;
		this.idhlcTaxEnv = idhlcTaxEnv;
		this.idhlcTaxUsage = idhlcTaxUsage;
		this.idhlcAcct = idhlcAcct;
		this.idhlcSub = idhlcSub;
		this.idhlcCc = idhlcCc;
		this.idhlcProject = idhlcProject;
		this.idhlcModUserid = idhlcModUserid;
		this.idhlcModDate = idhlcModDate;
		this.idhlcUserc01 = idhlcUserc01;
		this.idhlcUserc02 = idhlcUserc02;
		this.idhlcQadc01 = idhlcQadc01;
		this.idhlcQadc02 = idhlcQadc02;
		this.oidIdhlcHist = oidIdhlcHist;
	}

	// Property accessors

	public IdhlcHistId getId() {
		return this.id;
	}

	public void setId(IdhlcHistId id) {
		this.id = id;
	}

	public String getIdhlcTrl() {
		return this.idhlcTrl;
	}

	public void setIdhlcTrl(String idhlcTrl) {
		this.idhlcTrl = idhlcTrl;
	}

	public String getIdhlcChargeCategory() {
		return this.idhlcChargeCategory;
	}

	public void setIdhlcChargeCategory(String idhlcChargeCategory) {
		this.idhlcChargeCategory = idhlcChargeCategory;
	}

	public String getIdhlcPart() {
		return this.idhlcPart;
	}

	public void setIdhlcPart(String idhlcPart) {
		this.idhlcPart = idhlcPart;
	}

	public Double getIdhlcPrice() {
		return this.idhlcPrice;
	}

	public void setIdhlcPrice(Double idhlcPrice) {
		this.idhlcPrice = idhlcPrice;
	}

	public String getIdhlcChargeType() {
		return this.idhlcChargeType;
	}

	public void setIdhlcChargeType(String idhlcChargeType) {
		this.idhlcChargeType = idhlcChargeType;
	}

	public Double getIdhlcQtyInv() {
		return this.idhlcQtyInv;
	}

	public void setIdhlcQtyInv(Double idhlcQtyInv) {
		this.idhlcQtyInv = idhlcQtyInv;
	}

	public String getIdhlcUm() {
		return this.idhlcUm;
	}

	public void setIdhlcUm(String idhlcUm) {
		this.idhlcUm = idhlcUm;
	}

	public String getIdhlcDesc() {
		return this.idhlcDesc;
	}

	public void setIdhlcDesc(String idhlcDesc) {
		this.idhlcDesc = idhlcDesc;
	}

	public String getIdhlcDesc1() {
		return this.idhlcDesc1;
	}

	public void setIdhlcDesc1(String idhlcDesc1) {
		this.idhlcDesc1 = idhlcDesc1;
	}

	public String getIdhlcDesc2() {
		return this.idhlcDesc2;
	}

	public void setIdhlcDesc2(String idhlcDesc2) {
		this.idhlcDesc2 = idhlcDesc2;
	}

	public String getIdhlcFrClass() {
		return this.idhlcFrClass;
	}

	public void setIdhlcFrClass(String idhlcFrClass) {
		this.idhlcFrClass = idhlcFrClass;
	}

	public Double getIdhlcFrWt() {
		return this.idhlcFrWt;
	}

	public void setIdhlcFrWt(Double idhlcFrWt) {
		this.idhlcFrWt = idhlcFrWt;
	}

	public String getIdhlcFrWtUm() {
		return this.idhlcFrWtUm;
	}

	public void setIdhlcFrWtUm(String idhlcFrWtUm) {
		this.idhlcFrWtUm = idhlcFrWtUm;
	}

	public String getIdhlcProdline() {
		return this.idhlcProdline;
	}

	public void setIdhlcProdline(String idhlcProdline) {
		this.idhlcProdline = idhlcProdline;
	}

	public Boolean getIdhlcTaxable() {
		return this.idhlcTaxable;
	}

	public void setIdhlcTaxable(Boolean idhlcTaxable) {
		this.idhlcTaxable = idhlcTaxable;
	}

	public String getIdhlcTaxc() {
		return this.idhlcTaxc;
	}

	public void setIdhlcTaxc(String idhlcTaxc) {
		this.idhlcTaxc = idhlcTaxc;
	}

	public String getIdhlcTaxEnv() {
		return this.idhlcTaxEnv;
	}

	public void setIdhlcTaxEnv(String idhlcTaxEnv) {
		this.idhlcTaxEnv = idhlcTaxEnv;
	}

	public String getIdhlcTaxUsage() {
		return this.idhlcTaxUsage;
	}

	public void setIdhlcTaxUsage(String idhlcTaxUsage) {
		this.idhlcTaxUsage = idhlcTaxUsage;
	}

	public String getIdhlcAcct() {
		return this.idhlcAcct;
	}

	public void setIdhlcAcct(String idhlcAcct) {
		this.idhlcAcct = idhlcAcct;
	}

	public String getIdhlcSub() {
		return this.idhlcSub;
	}

	public void setIdhlcSub(String idhlcSub) {
		this.idhlcSub = idhlcSub;
	}

	public String getIdhlcCc() {
		return this.idhlcCc;
	}

	public void setIdhlcCc(String idhlcCc) {
		this.idhlcCc = idhlcCc;
	}

	public String getIdhlcProject() {
		return this.idhlcProject;
	}

	public void setIdhlcProject(String idhlcProject) {
		this.idhlcProject = idhlcProject;
	}

	public String getIdhlcModUserid() {
		return this.idhlcModUserid;
	}

	public void setIdhlcModUserid(String idhlcModUserid) {
		this.idhlcModUserid = idhlcModUserid;
	}

	public Date getIdhlcModDate() {
		return this.idhlcModDate;
	}

	public void setIdhlcModDate(Date idhlcModDate) {
		this.idhlcModDate = idhlcModDate;
	}

	public String getIdhlcUserc01() {
		return this.idhlcUserc01;
	}

	public void setIdhlcUserc01(String idhlcUserc01) {
		this.idhlcUserc01 = idhlcUserc01;
	}

	public String getIdhlcUserc02() {
		return this.idhlcUserc02;
	}

	public void setIdhlcUserc02(String idhlcUserc02) {
		this.idhlcUserc02 = idhlcUserc02;
	}

	public String getIdhlcQadc01() {
		return this.idhlcQadc01;
	}

	public void setIdhlcQadc01(String idhlcQadc01) {
		this.idhlcQadc01 = idhlcQadc01;
	}

	public String getIdhlcQadc02() {
		return this.idhlcQadc02;
	}

	public void setIdhlcQadc02(String idhlcQadc02) {
		this.idhlcQadc02 = idhlcQadc02;
	}

	public Double getOidIdhlcHist() {
		return this.oidIdhlcHist;
	}

	public void setOidIdhlcHist(Double oidIdhlcHist) {
		this.oidIdhlcHist = oidIdhlcHist;
	}

}