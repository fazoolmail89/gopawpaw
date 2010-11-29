package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDptMstr entity provides the base persistence definition of the
 * DptMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDptMstr implements java.io.Serializable {

	// Fields

	private DptMstrId id;
	private String dptDesc;
	private String dptBvarAcc;
	private String dptBvarCc;
	private String dptBvrrAcc;
	private String dptBvrrCc;
	private String dptQadc03;
	private String dptQadc04;
	private String dptQadc07;
	private String dptQadc08;
	private String dptLvrrAcc;
	private String dptLvrrCc;
	private String dptQadc01;
	private String dptQadc02;
	private String dptLbrAcct;
	private String dptLbrCc;
	private String dptBdnAcct;
	private String dptBdnCc;
	private String dptLvarAcc;
	private String dptLvarCc;
	private String dptQadc05;
	private String dptQadc06;
	private Integer dptLbrCap;
	private String dptCopAcct;
	private String dptCopCc;
	private String dptUser1;
	private String dptUser2;
	private String dptChr01;
	private String dptChr02;
	private String dptChr03;
	private String dptChr04;
	private String dptChr05;
	private Date dptDte01;
	private Date dptDte02;
	private Double dptDec01;
	private Double dptDec02;
	private Boolean dptLog01;
	private String dptUserid;
	private Date dptModDate;
	private String dptBdnSub;
	private String dptBvarSub;
	private String dptBvrrSub;
	private String dptCopSub;
	private String dptLbrSub;
	private String dptLvarSub;
	private String dptLvrrSub;
	private Double oidDptMstr;

	// Constructors

	/** default constructor */
	public AbstractDptMstr() {
	}

	/** minimal constructor */
	public AbstractDptMstr(DptMstrId id, Double oidDptMstr) {
		this.id = id;
		this.oidDptMstr = oidDptMstr;
	}

	/** full constructor */
	public AbstractDptMstr(DptMstrId id, String dptDesc, String dptBvarAcc,
			String dptBvarCc, String dptBvrrAcc, String dptBvrrCc,
			String dptQadc03, String dptQadc04, String dptQadc07,
			String dptQadc08, String dptLvrrAcc, String dptLvrrCc,
			String dptQadc01, String dptQadc02, String dptLbrAcct,
			String dptLbrCc, String dptBdnAcct, String dptBdnCc,
			String dptLvarAcc, String dptLvarCc, String dptQadc05,
			String dptQadc06, Integer dptLbrCap, String dptCopAcct,
			String dptCopCc, String dptUser1, String dptUser2, String dptChr01,
			String dptChr02, String dptChr03, String dptChr04, String dptChr05,
			Date dptDte01, Date dptDte02, Double dptDec01, Double dptDec02,
			Boolean dptLog01, String dptUserid, Date dptModDate,
			String dptBdnSub, String dptBvarSub, String dptBvrrSub,
			String dptCopSub, String dptLbrSub, String dptLvarSub,
			String dptLvrrSub, Double oidDptMstr) {
		this.id = id;
		this.dptDesc = dptDesc;
		this.dptBvarAcc = dptBvarAcc;
		this.dptBvarCc = dptBvarCc;
		this.dptBvrrAcc = dptBvrrAcc;
		this.dptBvrrCc = dptBvrrCc;
		this.dptQadc03 = dptQadc03;
		this.dptQadc04 = dptQadc04;
		this.dptQadc07 = dptQadc07;
		this.dptQadc08 = dptQadc08;
		this.dptLvrrAcc = dptLvrrAcc;
		this.dptLvrrCc = dptLvrrCc;
		this.dptQadc01 = dptQadc01;
		this.dptQadc02 = dptQadc02;
		this.dptLbrAcct = dptLbrAcct;
		this.dptLbrCc = dptLbrCc;
		this.dptBdnAcct = dptBdnAcct;
		this.dptBdnCc = dptBdnCc;
		this.dptLvarAcc = dptLvarAcc;
		this.dptLvarCc = dptLvarCc;
		this.dptQadc05 = dptQadc05;
		this.dptQadc06 = dptQadc06;
		this.dptLbrCap = dptLbrCap;
		this.dptCopAcct = dptCopAcct;
		this.dptCopCc = dptCopCc;
		this.dptUser1 = dptUser1;
		this.dptUser2 = dptUser2;
		this.dptChr01 = dptChr01;
		this.dptChr02 = dptChr02;
		this.dptChr03 = dptChr03;
		this.dptChr04 = dptChr04;
		this.dptChr05 = dptChr05;
		this.dptDte01 = dptDte01;
		this.dptDte02 = dptDte02;
		this.dptDec01 = dptDec01;
		this.dptDec02 = dptDec02;
		this.dptLog01 = dptLog01;
		this.dptUserid = dptUserid;
		this.dptModDate = dptModDate;
		this.dptBdnSub = dptBdnSub;
		this.dptBvarSub = dptBvarSub;
		this.dptBvrrSub = dptBvrrSub;
		this.dptCopSub = dptCopSub;
		this.dptLbrSub = dptLbrSub;
		this.dptLvarSub = dptLvarSub;
		this.dptLvrrSub = dptLvrrSub;
		this.oidDptMstr = oidDptMstr;
	}

	// Property accessors

	public DptMstrId getId() {
		return this.id;
	}

	public void setId(DptMstrId id) {
		this.id = id;
	}

	public String getDptDesc() {
		return this.dptDesc;
	}

	public void setDptDesc(String dptDesc) {
		this.dptDesc = dptDesc;
	}

	public String getDptBvarAcc() {
		return this.dptBvarAcc;
	}

	public void setDptBvarAcc(String dptBvarAcc) {
		this.dptBvarAcc = dptBvarAcc;
	}

	public String getDptBvarCc() {
		return this.dptBvarCc;
	}

	public void setDptBvarCc(String dptBvarCc) {
		this.dptBvarCc = dptBvarCc;
	}

	public String getDptBvrrAcc() {
		return this.dptBvrrAcc;
	}

	public void setDptBvrrAcc(String dptBvrrAcc) {
		this.dptBvrrAcc = dptBvrrAcc;
	}

	public String getDptBvrrCc() {
		return this.dptBvrrCc;
	}

	public void setDptBvrrCc(String dptBvrrCc) {
		this.dptBvrrCc = dptBvrrCc;
	}

	public String getDptQadc03() {
		return this.dptQadc03;
	}

	public void setDptQadc03(String dptQadc03) {
		this.dptQadc03 = dptQadc03;
	}

	public String getDptQadc04() {
		return this.dptQadc04;
	}

	public void setDptQadc04(String dptQadc04) {
		this.dptQadc04 = dptQadc04;
	}

	public String getDptQadc07() {
		return this.dptQadc07;
	}

	public void setDptQadc07(String dptQadc07) {
		this.dptQadc07 = dptQadc07;
	}

	public String getDptQadc08() {
		return this.dptQadc08;
	}

	public void setDptQadc08(String dptQadc08) {
		this.dptQadc08 = dptQadc08;
	}

	public String getDptLvrrAcc() {
		return this.dptLvrrAcc;
	}

	public void setDptLvrrAcc(String dptLvrrAcc) {
		this.dptLvrrAcc = dptLvrrAcc;
	}

	public String getDptLvrrCc() {
		return this.dptLvrrCc;
	}

	public void setDptLvrrCc(String dptLvrrCc) {
		this.dptLvrrCc = dptLvrrCc;
	}

	public String getDptQadc01() {
		return this.dptQadc01;
	}

	public void setDptQadc01(String dptQadc01) {
		this.dptQadc01 = dptQadc01;
	}

	public String getDptQadc02() {
		return this.dptQadc02;
	}

	public void setDptQadc02(String dptQadc02) {
		this.dptQadc02 = dptQadc02;
	}

	public String getDptLbrAcct() {
		return this.dptLbrAcct;
	}

	public void setDptLbrAcct(String dptLbrAcct) {
		this.dptLbrAcct = dptLbrAcct;
	}

	public String getDptLbrCc() {
		return this.dptLbrCc;
	}

	public void setDptLbrCc(String dptLbrCc) {
		this.dptLbrCc = dptLbrCc;
	}

	public String getDptBdnAcct() {
		return this.dptBdnAcct;
	}

	public void setDptBdnAcct(String dptBdnAcct) {
		this.dptBdnAcct = dptBdnAcct;
	}

	public String getDptBdnCc() {
		return this.dptBdnCc;
	}

	public void setDptBdnCc(String dptBdnCc) {
		this.dptBdnCc = dptBdnCc;
	}

	public String getDptLvarAcc() {
		return this.dptLvarAcc;
	}

	public void setDptLvarAcc(String dptLvarAcc) {
		this.dptLvarAcc = dptLvarAcc;
	}

	public String getDptLvarCc() {
		return this.dptLvarCc;
	}

	public void setDptLvarCc(String dptLvarCc) {
		this.dptLvarCc = dptLvarCc;
	}

	public String getDptQadc05() {
		return this.dptQadc05;
	}

	public void setDptQadc05(String dptQadc05) {
		this.dptQadc05 = dptQadc05;
	}

	public String getDptQadc06() {
		return this.dptQadc06;
	}

	public void setDptQadc06(String dptQadc06) {
		this.dptQadc06 = dptQadc06;
	}

	public Integer getDptLbrCap() {
		return this.dptLbrCap;
	}

	public void setDptLbrCap(Integer dptLbrCap) {
		this.dptLbrCap = dptLbrCap;
	}

	public String getDptCopAcct() {
		return this.dptCopAcct;
	}

	public void setDptCopAcct(String dptCopAcct) {
		this.dptCopAcct = dptCopAcct;
	}

	public String getDptCopCc() {
		return this.dptCopCc;
	}

	public void setDptCopCc(String dptCopCc) {
		this.dptCopCc = dptCopCc;
	}

	public String getDptUser1() {
		return this.dptUser1;
	}

	public void setDptUser1(String dptUser1) {
		this.dptUser1 = dptUser1;
	}

	public String getDptUser2() {
		return this.dptUser2;
	}

	public void setDptUser2(String dptUser2) {
		this.dptUser2 = dptUser2;
	}

	public String getDptChr01() {
		return this.dptChr01;
	}

	public void setDptChr01(String dptChr01) {
		this.dptChr01 = dptChr01;
	}

	public String getDptChr02() {
		return this.dptChr02;
	}

	public void setDptChr02(String dptChr02) {
		this.dptChr02 = dptChr02;
	}

	public String getDptChr03() {
		return this.dptChr03;
	}

	public void setDptChr03(String dptChr03) {
		this.dptChr03 = dptChr03;
	}

	public String getDptChr04() {
		return this.dptChr04;
	}

	public void setDptChr04(String dptChr04) {
		this.dptChr04 = dptChr04;
	}

	public String getDptChr05() {
		return this.dptChr05;
	}

	public void setDptChr05(String dptChr05) {
		this.dptChr05 = dptChr05;
	}

	public Date getDptDte01() {
		return this.dptDte01;
	}

	public void setDptDte01(Date dptDte01) {
		this.dptDte01 = dptDte01;
	}

	public Date getDptDte02() {
		return this.dptDte02;
	}

	public void setDptDte02(Date dptDte02) {
		this.dptDte02 = dptDte02;
	}

	public Double getDptDec01() {
		return this.dptDec01;
	}

	public void setDptDec01(Double dptDec01) {
		this.dptDec01 = dptDec01;
	}

	public Double getDptDec02() {
		return this.dptDec02;
	}

	public void setDptDec02(Double dptDec02) {
		this.dptDec02 = dptDec02;
	}

	public Boolean getDptLog01() {
		return this.dptLog01;
	}

	public void setDptLog01(Boolean dptLog01) {
		this.dptLog01 = dptLog01;
	}

	public String getDptUserid() {
		return this.dptUserid;
	}

	public void setDptUserid(String dptUserid) {
		this.dptUserid = dptUserid;
	}

	public Date getDptModDate() {
		return this.dptModDate;
	}

	public void setDptModDate(Date dptModDate) {
		this.dptModDate = dptModDate;
	}

	public String getDptBdnSub() {
		return this.dptBdnSub;
	}

	public void setDptBdnSub(String dptBdnSub) {
		this.dptBdnSub = dptBdnSub;
	}

	public String getDptBvarSub() {
		return this.dptBvarSub;
	}

	public void setDptBvarSub(String dptBvarSub) {
		this.dptBvarSub = dptBvarSub;
	}

	public String getDptBvrrSub() {
		return this.dptBvrrSub;
	}

	public void setDptBvrrSub(String dptBvrrSub) {
		this.dptBvrrSub = dptBvrrSub;
	}

	public String getDptCopSub() {
		return this.dptCopSub;
	}

	public void setDptCopSub(String dptCopSub) {
		this.dptCopSub = dptCopSub;
	}

	public String getDptLbrSub() {
		return this.dptLbrSub;
	}

	public void setDptLbrSub(String dptLbrSub) {
		this.dptLbrSub = dptLbrSub;
	}

	public String getDptLvarSub() {
		return this.dptLvarSub;
	}

	public void setDptLvarSub(String dptLvarSub) {
		this.dptLvarSub = dptLvarSub;
	}

	public String getDptLvrrSub() {
		return this.dptLvrrSub;
	}

	public void setDptLvrrSub(String dptLvrrSub) {
		this.dptLvrrSub = dptLvrrSub;
	}

	public Double getOidDptMstr() {
		return this.oidDptMstr;
	}

	public void setOidDptMstr(Double oidDptMstr) {
		this.oidDptMstr = oidDptMstr;
	}

}