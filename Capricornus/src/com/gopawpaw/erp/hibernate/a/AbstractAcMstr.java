package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAcMstr entity provides the base persistence definition of the AcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcMstr implements java.io.Serializable {

	// Fields

	private AcMstrId id;
	private String acXctr;
	private Integer acFpos;
	private String acType;
	private String acDesc;
	private String acXretAcc;
	private String acXretCc;
	private String acCurr;
	private String acQad03;
	private Boolean acActive;
	private String acFxIndex;
	private String acUser1;
	private String acUser2;
	private String acQad02;
	private Date acQad01;
	private String acStatAcc;
	private String acStatCc;
	private String acChr01;
	private String acChr02;
	private String acChr03;
	private String acChr04;
	private Date acDte01;
	private Date acDte02;
	private Boolean acLog01;
	private Boolean acLog02;
	private Boolean acModlOnly;
	private String acMatchSeq;
	private Double oidAcMstr;

	// Constructors

	/** default constructor */
	public AbstractAcMstr() {
	}

	/** minimal constructor */
	public AbstractAcMstr(AcMstrId id, String acMatchSeq, Double oidAcMstr) {
		this.id = id;
		this.acMatchSeq = acMatchSeq;
		this.oidAcMstr = oidAcMstr;
	}

	/** full constructor */
	public AbstractAcMstr(AcMstrId id, String acXctr, Integer acFpos,
			String acType, String acDesc, String acXretAcc, String acXretCc,
			String acCurr, String acQad03, Boolean acActive, String acFxIndex,
			String acUser1, String acUser2, String acQad02, Date acQad01,
			String acStatAcc, String acStatCc, String acChr01, String acChr02,
			String acChr03, String acChr04, Date acDte01, Date acDte02,
			Boolean acLog01, Boolean acLog02, Boolean acModlOnly,
			String acMatchSeq, Double oidAcMstr) {
		this.id = id;
		this.acXctr = acXctr;
		this.acFpos = acFpos;
		this.acType = acType;
		this.acDesc = acDesc;
		this.acXretAcc = acXretAcc;
		this.acXretCc = acXretCc;
		this.acCurr = acCurr;
		this.acQad03 = acQad03;
		this.acActive = acActive;
		this.acFxIndex = acFxIndex;
		this.acUser1 = acUser1;
		this.acUser2 = acUser2;
		this.acQad02 = acQad02;
		this.acQad01 = acQad01;
		this.acStatAcc = acStatAcc;
		this.acStatCc = acStatCc;
		this.acChr01 = acChr01;
		this.acChr02 = acChr02;
		this.acChr03 = acChr03;
		this.acChr04 = acChr04;
		this.acDte01 = acDte01;
		this.acDte02 = acDte02;
		this.acLog01 = acLog01;
		this.acLog02 = acLog02;
		this.acModlOnly = acModlOnly;
		this.acMatchSeq = acMatchSeq;
		this.oidAcMstr = oidAcMstr;
	}

	// Property accessors

	public AcMstrId getId() {
		return this.id;
	}

	public void setId(AcMstrId id) {
		this.id = id;
	}

	public String getAcXctr() {
		return this.acXctr;
	}

	public void setAcXctr(String acXctr) {
		this.acXctr = acXctr;
	}

	public Integer getAcFpos() {
		return this.acFpos;
	}

	public void setAcFpos(Integer acFpos) {
		this.acFpos = acFpos;
	}

	public String getAcType() {
		return this.acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public String getAcDesc() {
		return this.acDesc;
	}

	public void setAcDesc(String acDesc) {
		this.acDesc = acDesc;
	}

	public String getAcXretAcc() {
		return this.acXretAcc;
	}

	public void setAcXretAcc(String acXretAcc) {
		this.acXretAcc = acXretAcc;
	}

	public String getAcXretCc() {
		return this.acXretCc;
	}

	public void setAcXretCc(String acXretCc) {
		this.acXretCc = acXretCc;
	}

	public String getAcCurr() {
		return this.acCurr;
	}

	public void setAcCurr(String acCurr) {
		this.acCurr = acCurr;
	}

	public String getAcQad03() {
		return this.acQad03;
	}

	public void setAcQad03(String acQad03) {
		this.acQad03 = acQad03;
	}

	public Boolean getAcActive() {
		return this.acActive;
	}

	public void setAcActive(Boolean acActive) {
		this.acActive = acActive;
	}

	public String getAcFxIndex() {
		return this.acFxIndex;
	}

	public void setAcFxIndex(String acFxIndex) {
		this.acFxIndex = acFxIndex;
	}

	public String getAcUser1() {
		return this.acUser1;
	}

	public void setAcUser1(String acUser1) {
		this.acUser1 = acUser1;
	}

	public String getAcUser2() {
		return this.acUser2;
	}

	public void setAcUser2(String acUser2) {
		this.acUser2 = acUser2;
	}

	public String getAcQad02() {
		return this.acQad02;
	}

	public void setAcQad02(String acQad02) {
		this.acQad02 = acQad02;
	}

	public Date getAcQad01() {
		return this.acQad01;
	}

	public void setAcQad01(Date acQad01) {
		this.acQad01 = acQad01;
	}

	public String getAcStatAcc() {
		return this.acStatAcc;
	}

	public void setAcStatAcc(String acStatAcc) {
		this.acStatAcc = acStatAcc;
	}

	public String getAcStatCc() {
		return this.acStatCc;
	}

	public void setAcStatCc(String acStatCc) {
		this.acStatCc = acStatCc;
	}

	public String getAcChr01() {
		return this.acChr01;
	}

	public void setAcChr01(String acChr01) {
		this.acChr01 = acChr01;
	}

	public String getAcChr02() {
		return this.acChr02;
	}

	public void setAcChr02(String acChr02) {
		this.acChr02 = acChr02;
	}

	public String getAcChr03() {
		return this.acChr03;
	}

	public void setAcChr03(String acChr03) {
		this.acChr03 = acChr03;
	}

	public String getAcChr04() {
		return this.acChr04;
	}

	public void setAcChr04(String acChr04) {
		this.acChr04 = acChr04;
	}

	public Date getAcDte01() {
		return this.acDte01;
	}

	public void setAcDte01(Date acDte01) {
		this.acDte01 = acDte01;
	}

	public Date getAcDte02() {
		return this.acDte02;
	}

	public void setAcDte02(Date acDte02) {
		this.acDte02 = acDte02;
	}

	public Boolean getAcLog01() {
		return this.acLog01;
	}

	public void setAcLog01(Boolean acLog01) {
		this.acLog01 = acLog01;
	}

	public Boolean getAcLog02() {
		return this.acLog02;
	}

	public void setAcLog02(Boolean acLog02) {
		this.acLog02 = acLog02;
	}

	public Boolean getAcModlOnly() {
		return this.acModlOnly;
	}

	public void setAcModlOnly(Boolean acModlOnly) {
		this.acModlOnly = acModlOnly;
	}

	public String getAcMatchSeq() {
		return this.acMatchSeq;
	}

	public void setAcMatchSeq(String acMatchSeq) {
		this.acMatchSeq = acMatchSeq;
	}

	public Double getOidAcMstr() {
		return this.oidAcMstr;
	}

	public void setOidAcMstr(Double oidAcMstr) {
		this.oidAcMstr = oidAcMstr;
	}

}