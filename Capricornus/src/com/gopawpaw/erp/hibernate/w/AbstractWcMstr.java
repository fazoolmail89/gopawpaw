package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWcMstr entity provides the base persistence definition of the WcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWcMstr implements java.io.Serializable {

	// Fields

	private WcMstrId id;
	private String wcDesc;
	private String wcDept;
	private Double wcQad01;
	private Double wcMchWkctr;
	private Integer wcMchOp;
	private Double wcMenMch;
	private Double wcLbrRate;
	private Double wcBdnRate;
	private Double wcBdnPct;
	private Double wcMchBdn;
	private Double wcQueue;
	private Double wcWait;
	private String wcWkLoc;
	private Double wcPctUtil;
	private Double wcPctEff;
	private Double wcQad02;
	private String wcUser1;
	private String wcUser2;
	private Double wcSetupMen;
	private Double wcSetupRte;
	private String wcUserid;
	private Date wcModDate;
	private Double wcBdnSurate;
	private Double wcBdnSupct;
	private Double wcMchSubdn;
	private String wcFsmType;
	private String wcQadc01;
	private String wcQadc02;
	private String wcQadc03;
	private Double wcQade01;
	private Double wcQade02;
	private Boolean wcQadl01;
	private String wcChr01;
	private String wcChr02;
	private String wcChr03;
	private Double wcDec01;
	private Double wcDec02;
	private Boolean wcLog01;
	private Double oidWcMstr;

	// Constructors

	/** default constructor */
	public AbstractWcMstr() {
	}

	/** minimal constructor */
	public AbstractWcMstr(WcMstrId id, Double oidWcMstr) {
		this.id = id;
		this.oidWcMstr = oidWcMstr;
	}

	/** full constructor */
	public AbstractWcMstr(WcMstrId id, String wcDesc, String wcDept,
			Double wcQad01, Double wcMchWkctr, Integer wcMchOp,
			Double wcMenMch, Double wcLbrRate, Double wcBdnRate,
			Double wcBdnPct, Double wcMchBdn, Double wcQueue, Double wcWait,
			String wcWkLoc, Double wcPctUtil, Double wcPctEff, Double wcQad02,
			String wcUser1, String wcUser2, Double wcSetupMen,
			Double wcSetupRte, String wcUserid, Date wcModDate,
			Double wcBdnSurate, Double wcBdnSupct, Double wcMchSubdn,
			String wcFsmType, String wcQadc01, String wcQadc02,
			String wcQadc03, Double wcQade01, Double wcQade02,
			Boolean wcQadl01, String wcChr01, String wcChr02, String wcChr03,
			Double wcDec01, Double wcDec02, Boolean wcLog01, Double oidWcMstr) {
		this.id = id;
		this.wcDesc = wcDesc;
		this.wcDept = wcDept;
		this.wcQad01 = wcQad01;
		this.wcMchWkctr = wcMchWkctr;
		this.wcMchOp = wcMchOp;
		this.wcMenMch = wcMenMch;
		this.wcLbrRate = wcLbrRate;
		this.wcBdnRate = wcBdnRate;
		this.wcBdnPct = wcBdnPct;
		this.wcMchBdn = wcMchBdn;
		this.wcQueue = wcQueue;
		this.wcWait = wcWait;
		this.wcWkLoc = wcWkLoc;
		this.wcPctUtil = wcPctUtil;
		this.wcPctEff = wcPctEff;
		this.wcQad02 = wcQad02;
		this.wcUser1 = wcUser1;
		this.wcUser2 = wcUser2;
		this.wcSetupMen = wcSetupMen;
		this.wcSetupRte = wcSetupRte;
		this.wcUserid = wcUserid;
		this.wcModDate = wcModDate;
		this.wcBdnSurate = wcBdnSurate;
		this.wcBdnSupct = wcBdnSupct;
		this.wcMchSubdn = wcMchSubdn;
		this.wcFsmType = wcFsmType;
		this.wcQadc01 = wcQadc01;
		this.wcQadc02 = wcQadc02;
		this.wcQadc03 = wcQadc03;
		this.wcQade01 = wcQade01;
		this.wcQade02 = wcQade02;
		this.wcQadl01 = wcQadl01;
		this.wcChr01 = wcChr01;
		this.wcChr02 = wcChr02;
		this.wcChr03 = wcChr03;
		this.wcDec01 = wcDec01;
		this.wcDec02 = wcDec02;
		this.wcLog01 = wcLog01;
		this.oidWcMstr = oidWcMstr;
	}

	// Property accessors

	public WcMstrId getId() {
		return this.id;
	}

	public void setId(WcMstrId id) {
		this.id = id;
	}

	public String getWcDesc() {
		return this.wcDesc;
	}

	public void setWcDesc(String wcDesc) {
		this.wcDesc = wcDesc;
	}

	public String getWcDept() {
		return this.wcDept;
	}

	public void setWcDept(String wcDept) {
		this.wcDept = wcDept;
	}

	public Double getWcQad01() {
		return this.wcQad01;
	}

	public void setWcQad01(Double wcQad01) {
		this.wcQad01 = wcQad01;
	}

	public Double getWcMchWkctr() {
		return this.wcMchWkctr;
	}

	public void setWcMchWkctr(Double wcMchWkctr) {
		this.wcMchWkctr = wcMchWkctr;
	}

	public Integer getWcMchOp() {
		return this.wcMchOp;
	}

	public void setWcMchOp(Integer wcMchOp) {
		this.wcMchOp = wcMchOp;
	}

	public Double getWcMenMch() {
		return this.wcMenMch;
	}

	public void setWcMenMch(Double wcMenMch) {
		this.wcMenMch = wcMenMch;
	}

	public Double getWcLbrRate() {
		return this.wcLbrRate;
	}

	public void setWcLbrRate(Double wcLbrRate) {
		this.wcLbrRate = wcLbrRate;
	}

	public Double getWcBdnRate() {
		return this.wcBdnRate;
	}

	public void setWcBdnRate(Double wcBdnRate) {
		this.wcBdnRate = wcBdnRate;
	}

	public Double getWcBdnPct() {
		return this.wcBdnPct;
	}

	public void setWcBdnPct(Double wcBdnPct) {
		this.wcBdnPct = wcBdnPct;
	}

	public Double getWcMchBdn() {
		return this.wcMchBdn;
	}

	public void setWcMchBdn(Double wcMchBdn) {
		this.wcMchBdn = wcMchBdn;
	}

	public Double getWcQueue() {
		return this.wcQueue;
	}

	public void setWcQueue(Double wcQueue) {
		this.wcQueue = wcQueue;
	}

	public Double getWcWait() {
		return this.wcWait;
	}

	public void setWcWait(Double wcWait) {
		this.wcWait = wcWait;
	}

	public String getWcWkLoc() {
		return this.wcWkLoc;
	}

	public void setWcWkLoc(String wcWkLoc) {
		this.wcWkLoc = wcWkLoc;
	}

	public Double getWcPctUtil() {
		return this.wcPctUtil;
	}

	public void setWcPctUtil(Double wcPctUtil) {
		this.wcPctUtil = wcPctUtil;
	}

	public Double getWcPctEff() {
		return this.wcPctEff;
	}

	public void setWcPctEff(Double wcPctEff) {
		this.wcPctEff = wcPctEff;
	}

	public Double getWcQad02() {
		return this.wcQad02;
	}

	public void setWcQad02(Double wcQad02) {
		this.wcQad02 = wcQad02;
	}

	public String getWcUser1() {
		return this.wcUser1;
	}

	public void setWcUser1(String wcUser1) {
		this.wcUser1 = wcUser1;
	}

	public String getWcUser2() {
		return this.wcUser2;
	}

	public void setWcUser2(String wcUser2) {
		this.wcUser2 = wcUser2;
	}

	public Double getWcSetupMen() {
		return this.wcSetupMen;
	}

	public void setWcSetupMen(Double wcSetupMen) {
		this.wcSetupMen = wcSetupMen;
	}

	public Double getWcSetupRte() {
		return this.wcSetupRte;
	}

	public void setWcSetupRte(Double wcSetupRte) {
		this.wcSetupRte = wcSetupRte;
	}

	public String getWcUserid() {
		return this.wcUserid;
	}

	public void setWcUserid(String wcUserid) {
		this.wcUserid = wcUserid;
	}

	public Date getWcModDate() {
		return this.wcModDate;
	}

	public void setWcModDate(Date wcModDate) {
		this.wcModDate = wcModDate;
	}

	public Double getWcBdnSurate() {
		return this.wcBdnSurate;
	}

	public void setWcBdnSurate(Double wcBdnSurate) {
		this.wcBdnSurate = wcBdnSurate;
	}

	public Double getWcBdnSupct() {
		return this.wcBdnSupct;
	}

	public void setWcBdnSupct(Double wcBdnSupct) {
		this.wcBdnSupct = wcBdnSupct;
	}

	public Double getWcMchSubdn() {
		return this.wcMchSubdn;
	}

	public void setWcMchSubdn(Double wcMchSubdn) {
		this.wcMchSubdn = wcMchSubdn;
	}

	public String getWcFsmType() {
		return this.wcFsmType;
	}

	public void setWcFsmType(String wcFsmType) {
		this.wcFsmType = wcFsmType;
	}

	public String getWcQadc01() {
		return this.wcQadc01;
	}

	public void setWcQadc01(String wcQadc01) {
		this.wcQadc01 = wcQadc01;
	}

	public String getWcQadc02() {
		return this.wcQadc02;
	}

	public void setWcQadc02(String wcQadc02) {
		this.wcQadc02 = wcQadc02;
	}

	public String getWcQadc03() {
		return this.wcQadc03;
	}

	public void setWcQadc03(String wcQadc03) {
		this.wcQadc03 = wcQadc03;
	}

	public Double getWcQade01() {
		return this.wcQade01;
	}

	public void setWcQade01(Double wcQade01) {
		this.wcQade01 = wcQade01;
	}

	public Double getWcQade02() {
		return this.wcQade02;
	}

	public void setWcQade02(Double wcQade02) {
		this.wcQade02 = wcQade02;
	}

	public Boolean getWcQadl01() {
		return this.wcQadl01;
	}

	public void setWcQadl01(Boolean wcQadl01) {
		this.wcQadl01 = wcQadl01;
	}

	public String getWcChr01() {
		return this.wcChr01;
	}

	public void setWcChr01(String wcChr01) {
		this.wcChr01 = wcChr01;
	}

	public String getWcChr02() {
		return this.wcChr02;
	}

	public void setWcChr02(String wcChr02) {
		this.wcChr02 = wcChr02;
	}

	public String getWcChr03() {
		return this.wcChr03;
	}

	public void setWcChr03(String wcChr03) {
		this.wcChr03 = wcChr03;
	}

	public Double getWcDec01() {
		return this.wcDec01;
	}

	public void setWcDec01(Double wcDec01) {
		this.wcDec01 = wcDec01;
	}

	public Double getWcDec02() {
		return this.wcDec02;
	}

	public void setWcDec02(Double wcDec02) {
		this.wcDec02 = wcDec02;
	}

	public Boolean getWcLog01() {
		return this.wcLog01;
	}

	public void setWcLog01(Boolean wcLog01) {
		this.wcLog01 = wcLog01;
	}

	public Double getOidWcMstr() {
		return this.oidWcMstr;
	}

	public void setOidWcMstr(Double oidWcMstr) {
		this.oidWcMstr = oidWcMstr;
	}

}