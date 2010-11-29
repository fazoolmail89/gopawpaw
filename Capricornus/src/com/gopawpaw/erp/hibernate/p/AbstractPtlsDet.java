package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPtlsDet entity provides the base persistence definition of the
 * PtlsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtlsDet implements java.io.Serializable {

	// Fields

	private PtlsDetId id;
	private Double ptlsAssay;
	private Integer ptlsCmtindx;
	private Date ptlsExpire;
	private String ptlsGrade;
	private String ptlsStatus;
	private String ptlsUser1;
	private String ptlsUser2;
	private String ptlsChr01;
	private String ptlsChr02;
	private String ptlsChr03;
	private String ptlsChr04;
	private String ptlsChr05;
	private Double ptlsDec01;
	private Double ptlsDec02;
	private Double oidPtlsDet;

	// Constructors

	/** default constructor */
	public AbstractPtlsDet() {
	}

	/** minimal constructor */
	public AbstractPtlsDet(PtlsDetId id, Double oidPtlsDet) {
		this.id = id;
		this.oidPtlsDet = oidPtlsDet;
	}

	/** full constructor */
	public AbstractPtlsDet(PtlsDetId id, Double ptlsAssay, Integer ptlsCmtindx,
			Date ptlsExpire, String ptlsGrade, String ptlsStatus,
			String ptlsUser1, String ptlsUser2, String ptlsChr01,
			String ptlsChr02, String ptlsChr03, String ptlsChr04,
			String ptlsChr05, Double ptlsDec01, Double ptlsDec02,
			Double oidPtlsDet) {
		this.id = id;
		this.ptlsAssay = ptlsAssay;
		this.ptlsCmtindx = ptlsCmtindx;
		this.ptlsExpire = ptlsExpire;
		this.ptlsGrade = ptlsGrade;
		this.ptlsStatus = ptlsStatus;
		this.ptlsUser1 = ptlsUser1;
		this.ptlsUser2 = ptlsUser2;
		this.ptlsChr01 = ptlsChr01;
		this.ptlsChr02 = ptlsChr02;
		this.ptlsChr03 = ptlsChr03;
		this.ptlsChr04 = ptlsChr04;
		this.ptlsChr05 = ptlsChr05;
		this.ptlsDec01 = ptlsDec01;
		this.ptlsDec02 = ptlsDec02;
		this.oidPtlsDet = oidPtlsDet;
	}

	// Property accessors

	public PtlsDetId getId() {
		return this.id;
	}

	public void setId(PtlsDetId id) {
		this.id = id;
	}

	public Double getPtlsAssay() {
		return this.ptlsAssay;
	}

	public void setPtlsAssay(Double ptlsAssay) {
		this.ptlsAssay = ptlsAssay;
	}

	public Integer getPtlsCmtindx() {
		return this.ptlsCmtindx;
	}

	public void setPtlsCmtindx(Integer ptlsCmtindx) {
		this.ptlsCmtindx = ptlsCmtindx;
	}

	public Date getPtlsExpire() {
		return this.ptlsExpire;
	}

	public void setPtlsExpire(Date ptlsExpire) {
		this.ptlsExpire = ptlsExpire;
	}

	public String getPtlsGrade() {
		return this.ptlsGrade;
	}

	public void setPtlsGrade(String ptlsGrade) {
		this.ptlsGrade = ptlsGrade;
	}

	public String getPtlsStatus() {
		return this.ptlsStatus;
	}

	public void setPtlsStatus(String ptlsStatus) {
		this.ptlsStatus = ptlsStatus;
	}

	public String getPtlsUser1() {
		return this.ptlsUser1;
	}

	public void setPtlsUser1(String ptlsUser1) {
		this.ptlsUser1 = ptlsUser1;
	}

	public String getPtlsUser2() {
		return this.ptlsUser2;
	}

	public void setPtlsUser2(String ptlsUser2) {
		this.ptlsUser2 = ptlsUser2;
	}

	public String getPtlsChr01() {
		return this.ptlsChr01;
	}

	public void setPtlsChr01(String ptlsChr01) {
		this.ptlsChr01 = ptlsChr01;
	}

	public String getPtlsChr02() {
		return this.ptlsChr02;
	}

	public void setPtlsChr02(String ptlsChr02) {
		this.ptlsChr02 = ptlsChr02;
	}

	public String getPtlsChr03() {
		return this.ptlsChr03;
	}

	public void setPtlsChr03(String ptlsChr03) {
		this.ptlsChr03 = ptlsChr03;
	}

	public String getPtlsChr04() {
		return this.ptlsChr04;
	}

	public void setPtlsChr04(String ptlsChr04) {
		this.ptlsChr04 = ptlsChr04;
	}

	public String getPtlsChr05() {
		return this.ptlsChr05;
	}

	public void setPtlsChr05(String ptlsChr05) {
		this.ptlsChr05 = ptlsChr05;
	}

	public Double getPtlsDec01() {
		return this.ptlsDec01;
	}

	public void setPtlsDec01(Double ptlsDec01) {
		this.ptlsDec01 = ptlsDec01;
	}

	public Double getPtlsDec02() {
		return this.ptlsDec02;
	}

	public void setPtlsDec02(Double ptlsDec02) {
		this.ptlsDec02 = ptlsDec02;
	}

	public Double getOidPtlsDet() {
		return this.oidPtlsDet;
	}

	public void setOidPtlsDet(Double oidPtlsDet) {
		this.oidPtlsDet = oidPtlsDet;
	}

}