package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCsbdDet entity provides the base persistence definition of the
 * CsbdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsbdDet implements java.io.Serializable {

	// Fields

	private CsbdDetId id;
	private String csbdEdi;
	private String csbdBranch;
	private String csbdBkAcct;
	private Date csbdEndDate;
	private Date csbdBegDate;
	private String csbdUserid;
	private Date csbdModDate;
	private String csbdUser1;
	private String csbdUser2;
	private String csbdChr01;
	private String csbdChr02;
	private String csbdChr03;
	private String csbdChr04;
	private String csbdChr05;
	private Double csbdDec01;
	private Double csbdDec02;
	private Date csbdDte01;
	private Date csbdDte02;
	private Boolean csbdLog01;
	private Boolean csbdLog02;
	private String csbdQad01;
	private String csbdQad02;
	private Double csbdQad03;
	private Double csbdQad04;
	private Date csbdQad05;
	private Date csbdQad06;
	private Boolean csbdQad07;
	private Boolean csbdQad08;
	private String csbdValidation;
	private Double oidCsbdDet;

	// Constructors

	/** default constructor */
	public AbstractCsbdDet() {
	}

	/** minimal constructor */
	public AbstractCsbdDet(CsbdDetId id, String csbdEdi, String csbdBranch,
			String csbdBkAcct, String csbdUserid, String csbdUser1,
			String csbdUser2, String csbdChr01, String csbdChr02,
			String csbdChr03, String csbdChr04, String csbdChr05,
			Double csbdDec01, Double csbdDec02, String csbdQad01,
			String csbdQad02, Double csbdQad03, Double csbdQad04,
			String csbdValidation, Double oidCsbdDet) {
		this.id = id;
		this.csbdEdi = csbdEdi;
		this.csbdBranch = csbdBranch;
		this.csbdBkAcct = csbdBkAcct;
		this.csbdUserid = csbdUserid;
		this.csbdUser1 = csbdUser1;
		this.csbdUser2 = csbdUser2;
		this.csbdChr01 = csbdChr01;
		this.csbdChr02 = csbdChr02;
		this.csbdChr03 = csbdChr03;
		this.csbdChr04 = csbdChr04;
		this.csbdChr05 = csbdChr05;
		this.csbdDec01 = csbdDec01;
		this.csbdDec02 = csbdDec02;
		this.csbdQad01 = csbdQad01;
		this.csbdQad02 = csbdQad02;
		this.csbdQad03 = csbdQad03;
		this.csbdQad04 = csbdQad04;
		this.csbdValidation = csbdValidation;
		this.oidCsbdDet = oidCsbdDet;
	}

	/** full constructor */
	public AbstractCsbdDet(CsbdDetId id, String csbdEdi, String csbdBranch,
			String csbdBkAcct, Date csbdEndDate, Date csbdBegDate,
			String csbdUserid, Date csbdModDate, String csbdUser1,
			String csbdUser2, String csbdChr01, String csbdChr02,
			String csbdChr03, String csbdChr04, String csbdChr05,
			Double csbdDec01, Double csbdDec02, Date csbdDte01, Date csbdDte02,
			Boolean csbdLog01, Boolean csbdLog02, String csbdQad01,
			String csbdQad02, Double csbdQad03, Double csbdQad04,
			Date csbdQad05, Date csbdQad06, Boolean csbdQad07,
			Boolean csbdQad08, String csbdValidation, Double oidCsbdDet) {
		this.id = id;
		this.csbdEdi = csbdEdi;
		this.csbdBranch = csbdBranch;
		this.csbdBkAcct = csbdBkAcct;
		this.csbdEndDate = csbdEndDate;
		this.csbdBegDate = csbdBegDate;
		this.csbdUserid = csbdUserid;
		this.csbdModDate = csbdModDate;
		this.csbdUser1 = csbdUser1;
		this.csbdUser2 = csbdUser2;
		this.csbdChr01 = csbdChr01;
		this.csbdChr02 = csbdChr02;
		this.csbdChr03 = csbdChr03;
		this.csbdChr04 = csbdChr04;
		this.csbdChr05 = csbdChr05;
		this.csbdDec01 = csbdDec01;
		this.csbdDec02 = csbdDec02;
		this.csbdDte01 = csbdDte01;
		this.csbdDte02 = csbdDte02;
		this.csbdLog01 = csbdLog01;
		this.csbdLog02 = csbdLog02;
		this.csbdQad01 = csbdQad01;
		this.csbdQad02 = csbdQad02;
		this.csbdQad03 = csbdQad03;
		this.csbdQad04 = csbdQad04;
		this.csbdQad05 = csbdQad05;
		this.csbdQad06 = csbdQad06;
		this.csbdQad07 = csbdQad07;
		this.csbdQad08 = csbdQad08;
		this.csbdValidation = csbdValidation;
		this.oidCsbdDet = oidCsbdDet;
	}

	// Property accessors

	public CsbdDetId getId() {
		return this.id;
	}

	public void setId(CsbdDetId id) {
		this.id = id;
	}

	public String getCsbdEdi() {
		return this.csbdEdi;
	}

	public void setCsbdEdi(String csbdEdi) {
		this.csbdEdi = csbdEdi;
	}

	public String getCsbdBranch() {
		return this.csbdBranch;
	}

	public void setCsbdBranch(String csbdBranch) {
		this.csbdBranch = csbdBranch;
	}

	public String getCsbdBkAcct() {
		return this.csbdBkAcct;
	}

	public void setCsbdBkAcct(String csbdBkAcct) {
		this.csbdBkAcct = csbdBkAcct;
	}

	public Date getCsbdEndDate() {
		return this.csbdEndDate;
	}

	public void setCsbdEndDate(Date csbdEndDate) {
		this.csbdEndDate = csbdEndDate;
	}

	public Date getCsbdBegDate() {
		return this.csbdBegDate;
	}

	public void setCsbdBegDate(Date csbdBegDate) {
		this.csbdBegDate = csbdBegDate;
	}

	public String getCsbdUserid() {
		return this.csbdUserid;
	}

	public void setCsbdUserid(String csbdUserid) {
		this.csbdUserid = csbdUserid;
	}

	public Date getCsbdModDate() {
		return this.csbdModDate;
	}

	public void setCsbdModDate(Date csbdModDate) {
		this.csbdModDate = csbdModDate;
	}

	public String getCsbdUser1() {
		return this.csbdUser1;
	}

	public void setCsbdUser1(String csbdUser1) {
		this.csbdUser1 = csbdUser1;
	}

	public String getCsbdUser2() {
		return this.csbdUser2;
	}

	public void setCsbdUser2(String csbdUser2) {
		this.csbdUser2 = csbdUser2;
	}

	public String getCsbdChr01() {
		return this.csbdChr01;
	}

	public void setCsbdChr01(String csbdChr01) {
		this.csbdChr01 = csbdChr01;
	}

	public String getCsbdChr02() {
		return this.csbdChr02;
	}

	public void setCsbdChr02(String csbdChr02) {
		this.csbdChr02 = csbdChr02;
	}

	public String getCsbdChr03() {
		return this.csbdChr03;
	}

	public void setCsbdChr03(String csbdChr03) {
		this.csbdChr03 = csbdChr03;
	}

	public String getCsbdChr04() {
		return this.csbdChr04;
	}

	public void setCsbdChr04(String csbdChr04) {
		this.csbdChr04 = csbdChr04;
	}

	public String getCsbdChr05() {
		return this.csbdChr05;
	}

	public void setCsbdChr05(String csbdChr05) {
		this.csbdChr05 = csbdChr05;
	}

	public Double getCsbdDec01() {
		return this.csbdDec01;
	}

	public void setCsbdDec01(Double csbdDec01) {
		this.csbdDec01 = csbdDec01;
	}

	public Double getCsbdDec02() {
		return this.csbdDec02;
	}

	public void setCsbdDec02(Double csbdDec02) {
		this.csbdDec02 = csbdDec02;
	}

	public Date getCsbdDte01() {
		return this.csbdDte01;
	}

	public void setCsbdDte01(Date csbdDte01) {
		this.csbdDte01 = csbdDte01;
	}

	public Date getCsbdDte02() {
		return this.csbdDte02;
	}

	public void setCsbdDte02(Date csbdDte02) {
		this.csbdDte02 = csbdDte02;
	}

	public Boolean getCsbdLog01() {
		return this.csbdLog01;
	}

	public void setCsbdLog01(Boolean csbdLog01) {
		this.csbdLog01 = csbdLog01;
	}

	public Boolean getCsbdLog02() {
		return this.csbdLog02;
	}

	public void setCsbdLog02(Boolean csbdLog02) {
		this.csbdLog02 = csbdLog02;
	}

	public String getCsbdQad01() {
		return this.csbdQad01;
	}

	public void setCsbdQad01(String csbdQad01) {
		this.csbdQad01 = csbdQad01;
	}

	public String getCsbdQad02() {
		return this.csbdQad02;
	}

	public void setCsbdQad02(String csbdQad02) {
		this.csbdQad02 = csbdQad02;
	}

	public Double getCsbdQad03() {
		return this.csbdQad03;
	}

	public void setCsbdQad03(Double csbdQad03) {
		this.csbdQad03 = csbdQad03;
	}

	public Double getCsbdQad04() {
		return this.csbdQad04;
	}

	public void setCsbdQad04(Double csbdQad04) {
		this.csbdQad04 = csbdQad04;
	}

	public Date getCsbdQad05() {
		return this.csbdQad05;
	}

	public void setCsbdQad05(Date csbdQad05) {
		this.csbdQad05 = csbdQad05;
	}

	public Date getCsbdQad06() {
		return this.csbdQad06;
	}

	public void setCsbdQad06(Date csbdQad06) {
		this.csbdQad06 = csbdQad06;
	}

	public Boolean getCsbdQad07() {
		return this.csbdQad07;
	}

	public void setCsbdQad07(Boolean csbdQad07) {
		this.csbdQad07 = csbdQad07;
	}

	public Boolean getCsbdQad08() {
		return this.csbdQad08;
	}

	public void setCsbdQad08(Boolean csbdQad08) {
		this.csbdQad08 = csbdQad08;
	}

	public String getCsbdValidation() {
		return this.csbdValidation;
	}

	public void setCsbdValidation(String csbdValidation) {
		this.csbdValidation = csbdValidation;
	}

	public Double getOidCsbdDet() {
		return this.oidCsbdDet;
	}

	public void setOidCsbdDet(Double oidCsbdDet) {
		this.oidCsbdDet = oidCsbdDet;
	}

}