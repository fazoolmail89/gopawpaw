package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLndDet entity provides the base persistence definition of the LndDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLndDet implements java.io.Serializable {

	// Fields

	private LndDetId id;
	private Double lndRate;
	private Date lndExpire;
	private String lndUser1;
	private String lndUser2;
	private Double lndSequence;
	private String lndBom;
	private String lndProdUm;
	private String lndSetup;
	private String lndRun;
	private String lndTool;
	private Integer lndCmtindx;
	private Integer lndRunSize;
	private Integer lndSetSize;
	private String lndChr01;
	private String lndChr02;
	private String lndChr03;
	private String lndChr04;
	private String lndChr05;
	private Double lndDec01;
	private Double lndDec02;
	private Double lndDec03;
	private Boolean lndLog01;
	private Boolean lndQadl01;
	private String lndRunSeq1;
	private String lndRunSeq2;
	private Double oidLndDet;

	// Constructors

	/** default constructor */
	public AbstractLndDet() {
	}

	/** minimal constructor */
	public AbstractLndDet(LndDetId id, String lndRunSeq1, String lndRunSeq2,
			Double oidLndDet) {
		this.id = id;
		this.lndRunSeq1 = lndRunSeq1;
		this.lndRunSeq2 = lndRunSeq2;
		this.oidLndDet = oidLndDet;
	}

	/** full constructor */
	public AbstractLndDet(LndDetId id, Double lndRate, Date lndExpire,
			String lndUser1, String lndUser2, Double lndSequence,
			String lndBom, String lndProdUm, String lndSetup, String lndRun,
			String lndTool, Integer lndCmtindx, Integer lndRunSize,
			Integer lndSetSize, String lndChr01, String lndChr02,
			String lndChr03, String lndChr04, String lndChr05, Double lndDec01,
			Double lndDec02, Double lndDec03, Boolean lndLog01,
			Boolean lndQadl01, String lndRunSeq1, String lndRunSeq2,
			Double oidLndDet) {
		this.id = id;
		this.lndRate = lndRate;
		this.lndExpire = lndExpire;
		this.lndUser1 = lndUser1;
		this.lndUser2 = lndUser2;
		this.lndSequence = lndSequence;
		this.lndBom = lndBom;
		this.lndProdUm = lndProdUm;
		this.lndSetup = lndSetup;
		this.lndRun = lndRun;
		this.lndTool = lndTool;
		this.lndCmtindx = lndCmtindx;
		this.lndRunSize = lndRunSize;
		this.lndSetSize = lndSetSize;
		this.lndChr01 = lndChr01;
		this.lndChr02 = lndChr02;
		this.lndChr03 = lndChr03;
		this.lndChr04 = lndChr04;
		this.lndChr05 = lndChr05;
		this.lndDec01 = lndDec01;
		this.lndDec02 = lndDec02;
		this.lndDec03 = lndDec03;
		this.lndLog01 = lndLog01;
		this.lndQadl01 = lndQadl01;
		this.lndRunSeq1 = lndRunSeq1;
		this.lndRunSeq2 = lndRunSeq2;
		this.oidLndDet = oidLndDet;
	}

	// Property accessors

	public LndDetId getId() {
		return this.id;
	}

	public void setId(LndDetId id) {
		this.id = id;
	}

	public Double getLndRate() {
		return this.lndRate;
	}

	public void setLndRate(Double lndRate) {
		this.lndRate = lndRate;
	}

	public Date getLndExpire() {
		return this.lndExpire;
	}

	public void setLndExpire(Date lndExpire) {
		this.lndExpire = lndExpire;
	}

	public String getLndUser1() {
		return this.lndUser1;
	}

	public void setLndUser1(String lndUser1) {
		this.lndUser1 = lndUser1;
	}

	public String getLndUser2() {
		return this.lndUser2;
	}

	public void setLndUser2(String lndUser2) {
		this.lndUser2 = lndUser2;
	}

	public Double getLndSequence() {
		return this.lndSequence;
	}

	public void setLndSequence(Double lndSequence) {
		this.lndSequence = lndSequence;
	}

	public String getLndBom() {
		return this.lndBom;
	}

	public void setLndBom(String lndBom) {
		this.lndBom = lndBom;
	}

	public String getLndProdUm() {
		return this.lndProdUm;
	}

	public void setLndProdUm(String lndProdUm) {
		this.lndProdUm = lndProdUm;
	}

	public String getLndSetup() {
		return this.lndSetup;
	}

	public void setLndSetup(String lndSetup) {
		this.lndSetup = lndSetup;
	}

	public String getLndRun() {
		return this.lndRun;
	}

	public void setLndRun(String lndRun) {
		this.lndRun = lndRun;
	}

	public String getLndTool() {
		return this.lndTool;
	}

	public void setLndTool(String lndTool) {
		this.lndTool = lndTool;
	}

	public Integer getLndCmtindx() {
		return this.lndCmtindx;
	}

	public void setLndCmtindx(Integer lndCmtindx) {
		this.lndCmtindx = lndCmtindx;
	}

	public Integer getLndRunSize() {
		return this.lndRunSize;
	}

	public void setLndRunSize(Integer lndRunSize) {
		this.lndRunSize = lndRunSize;
	}

	public Integer getLndSetSize() {
		return this.lndSetSize;
	}

	public void setLndSetSize(Integer lndSetSize) {
		this.lndSetSize = lndSetSize;
	}

	public String getLndChr01() {
		return this.lndChr01;
	}

	public void setLndChr01(String lndChr01) {
		this.lndChr01 = lndChr01;
	}

	public String getLndChr02() {
		return this.lndChr02;
	}

	public void setLndChr02(String lndChr02) {
		this.lndChr02 = lndChr02;
	}

	public String getLndChr03() {
		return this.lndChr03;
	}

	public void setLndChr03(String lndChr03) {
		this.lndChr03 = lndChr03;
	}

	public String getLndChr04() {
		return this.lndChr04;
	}

	public void setLndChr04(String lndChr04) {
		this.lndChr04 = lndChr04;
	}

	public String getLndChr05() {
		return this.lndChr05;
	}

	public void setLndChr05(String lndChr05) {
		this.lndChr05 = lndChr05;
	}

	public Double getLndDec01() {
		return this.lndDec01;
	}

	public void setLndDec01(Double lndDec01) {
		this.lndDec01 = lndDec01;
	}

	public Double getLndDec02() {
		return this.lndDec02;
	}

	public void setLndDec02(Double lndDec02) {
		this.lndDec02 = lndDec02;
	}

	public Double getLndDec03() {
		return this.lndDec03;
	}

	public void setLndDec03(Double lndDec03) {
		this.lndDec03 = lndDec03;
	}

	public Boolean getLndLog01() {
		return this.lndLog01;
	}

	public void setLndLog01(Boolean lndLog01) {
		this.lndLog01 = lndLog01;
	}

	public Boolean getLndQadl01() {
		return this.lndQadl01;
	}

	public void setLndQadl01(Boolean lndQadl01) {
		this.lndQadl01 = lndQadl01;
	}

	public String getLndRunSeq1() {
		return this.lndRunSeq1;
	}

	public void setLndRunSeq1(String lndRunSeq1) {
		this.lndRunSeq1 = lndRunSeq1;
	}

	public String getLndRunSeq2() {
		return this.lndRunSeq2;
	}

	public void setLndRunSeq2(String lndRunSeq2) {
		this.lndRunSeq2 = lndRunSeq2;
	}

	public Double getOidLndDet() {
		return this.oidLndDet;
	}

	public void setOidLndDet(Double oidLndDet) {
		this.oidLndDet = oidLndDet;
	}

}