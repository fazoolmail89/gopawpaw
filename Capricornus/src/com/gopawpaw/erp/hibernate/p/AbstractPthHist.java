package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPthHist entity provides the base persistence definition of the
 * PthHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPthHist implements java.io.Serializable {

	// Fields

	private PthHistId id;
	private Double pthTotQty;
	private Double pthTotSale;
	private Double pthTotCost;
	private String pthUser1;
	private String pthUser2;
	private String pthType;
	private String pthChr01;
	private String pthChr02;
	private String pthChr03;
	private String pthChr04;
	private String pthChr05;
	private Date pthDte01;
	private Date pthDte02;
	private Double pthDec01;
	private Double pthDec02;
	private Boolean pthLog01;
	private String pthFor;
	private Double oidPthHist;

	// Constructors

	/** default constructor */
	public AbstractPthHist() {
	}

	/** minimal constructor */
	public AbstractPthHist(PthHistId id, String pthFor, Double oidPthHist) {
		this.id = id;
		this.pthFor = pthFor;
		this.oidPthHist = oidPthHist;
	}

	/** full constructor */
	public AbstractPthHist(PthHistId id, Double pthTotQty, Double pthTotSale,
			Double pthTotCost, String pthUser1, String pthUser2,
			String pthType, String pthChr01, String pthChr02, String pthChr03,
			String pthChr04, String pthChr05, Date pthDte01, Date pthDte02,
			Double pthDec01, Double pthDec02, Boolean pthLog01, String pthFor,
			Double oidPthHist) {
		this.id = id;
		this.pthTotQty = pthTotQty;
		this.pthTotSale = pthTotSale;
		this.pthTotCost = pthTotCost;
		this.pthUser1 = pthUser1;
		this.pthUser2 = pthUser2;
		this.pthType = pthType;
		this.pthChr01 = pthChr01;
		this.pthChr02 = pthChr02;
		this.pthChr03 = pthChr03;
		this.pthChr04 = pthChr04;
		this.pthChr05 = pthChr05;
		this.pthDte01 = pthDte01;
		this.pthDte02 = pthDte02;
		this.pthDec01 = pthDec01;
		this.pthDec02 = pthDec02;
		this.pthLog01 = pthLog01;
		this.pthFor = pthFor;
		this.oidPthHist = oidPthHist;
	}

	// Property accessors

	public PthHistId getId() {
		return this.id;
	}

	public void setId(PthHistId id) {
		this.id = id;
	}

	public Double getPthTotQty() {
		return this.pthTotQty;
	}

	public void setPthTotQty(Double pthTotQty) {
		this.pthTotQty = pthTotQty;
	}

	public Double getPthTotSale() {
		return this.pthTotSale;
	}

	public void setPthTotSale(Double pthTotSale) {
		this.pthTotSale = pthTotSale;
	}

	public Double getPthTotCost() {
		return this.pthTotCost;
	}

	public void setPthTotCost(Double pthTotCost) {
		this.pthTotCost = pthTotCost;
	}

	public String getPthUser1() {
		return this.pthUser1;
	}

	public void setPthUser1(String pthUser1) {
		this.pthUser1 = pthUser1;
	}

	public String getPthUser2() {
		return this.pthUser2;
	}

	public void setPthUser2(String pthUser2) {
		this.pthUser2 = pthUser2;
	}

	public String getPthType() {
		return this.pthType;
	}

	public void setPthType(String pthType) {
		this.pthType = pthType;
	}

	public String getPthChr01() {
		return this.pthChr01;
	}

	public void setPthChr01(String pthChr01) {
		this.pthChr01 = pthChr01;
	}

	public String getPthChr02() {
		return this.pthChr02;
	}

	public void setPthChr02(String pthChr02) {
		this.pthChr02 = pthChr02;
	}

	public String getPthChr03() {
		return this.pthChr03;
	}

	public void setPthChr03(String pthChr03) {
		this.pthChr03 = pthChr03;
	}

	public String getPthChr04() {
		return this.pthChr04;
	}

	public void setPthChr04(String pthChr04) {
		this.pthChr04 = pthChr04;
	}

	public String getPthChr05() {
		return this.pthChr05;
	}

	public void setPthChr05(String pthChr05) {
		this.pthChr05 = pthChr05;
	}

	public Date getPthDte01() {
		return this.pthDte01;
	}

	public void setPthDte01(Date pthDte01) {
		this.pthDte01 = pthDte01;
	}

	public Date getPthDte02() {
		return this.pthDte02;
	}

	public void setPthDte02(Date pthDte02) {
		this.pthDte02 = pthDte02;
	}

	public Double getPthDec01() {
		return this.pthDec01;
	}

	public void setPthDec01(Double pthDec01) {
		this.pthDec01 = pthDec01;
	}

	public Double getPthDec02() {
		return this.pthDec02;
	}

	public void setPthDec02(Double pthDec02) {
		this.pthDec02 = pthDec02;
	}

	public Boolean getPthLog01() {
		return this.pthLog01;
	}

	public void setPthLog01(Boolean pthLog01) {
		this.pthLog01 = pthLog01;
	}

	public String getPthFor() {
		return this.pthFor;
	}

	public void setPthFor(String pthFor) {
		this.pthFor = pthFor;
	}

	public Double getOidPthHist() {
		return this.oidPthHist;
	}

	public void setOidPthHist(Double oidPthHist) {
		this.oidPthHist = oidPthHist;
	}

}