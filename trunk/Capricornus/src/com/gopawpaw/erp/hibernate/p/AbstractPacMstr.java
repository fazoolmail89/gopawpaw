package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPacMstr entity provides the base persistence definition of the
 * PacMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPacMstr implements java.io.Serializable {

	// Fields

	private PacMstrId id;
	private String pacDesc;
	private String pacSite;
	private String pacPl;
	private String pacPurAcct;
	private String pacPurCc;
	private String pacAmt;
	private String pacAprBy;
	private String pacReqBy;
	private String pacUser1;
	private String pacUser2;
	private String pacUserid;
	private Date pacModDate;
	private String pacQadc01;
	private String pacPurSub;
	private Double oidPacMstr;

	// Constructors

	/** default constructor */
	public AbstractPacMstr() {
	}

	/** minimal constructor */
	public AbstractPacMstr(PacMstrId id, Double oidPacMstr) {
		this.id = id;
		this.oidPacMstr = oidPacMstr;
	}

	/** full constructor */
	public AbstractPacMstr(PacMstrId id, String pacDesc, String pacSite,
			String pacPl, String pacPurAcct, String pacPurCc, String pacAmt,
			String pacAprBy, String pacReqBy, String pacUser1, String pacUser2,
			String pacUserid, Date pacModDate, String pacQadc01,
			String pacPurSub, Double oidPacMstr) {
		this.id = id;
		this.pacDesc = pacDesc;
		this.pacSite = pacSite;
		this.pacPl = pacPl;
		this.pacPurAcct = pacPurAcct;
		this.pacPurCc = pacPurCc;
		this.pacAmt = pacAmt;
		this.pacAprBy = pacAprBy;
		this.pacReqBy = pacReqBy;
		this.pacUser1 = pacUser1;
		this.pacUser2 = pacUser2;
		this.pacUserid = pacUserid;
		this.pacModDate = pacModDate;
		this.pacQadc01 = pacQadc01;
		this.pacPurSub = pacPurSub;
		this.oidPacMstr = oidPacMstr;
	}

	// Property accessors

	public PacMstrId getId() {
		return this.id;
	}

	public void setId(PacMstrId id) {
		this.id = id;
	}

	public String getPacDesc() {
		return this.pacDesc;
	}

	public void setPacDesc(String pacDesc) {
		this.pacDesc = pacDesc;
	}

	public String getPacSite() {
		return this.pacSite;
	}

	public void setPacSite(String pacSite) {
		this.pacSite = pacSite;
	}

	public String getPacPl() {
		return this.pacPl;
	}

	public void setPacPl(String pacPl) {
		this.pacPl = pacPl;
	}

	public String getPacPurAcct() {
		return this.pacPurAcct;
	}

	public void setPacPurAcct(String pacPurAcct) {
		this.pacPurAcct = pacPurAcct;
	}

	public String getPacPurCc() {
		return this.pacPurCc;
	}

	public void setPacPurCc(String pacPurCc) {
		this.pacPurCc = pacPurCc;
	}

	public String getPacAmt() {
		return this.pacAmt;
	}

	public void setPacAmt(String pacAmt) {
		this.pacAmt = pacAmt;
	}

	public String getPacAprBy() {
		return this.pacAprBy;
	}

	public void setPacAprBy(String pacAprBy) {
		this.pacAprBy = pacAprBy;
	}

	public String getPacReqBy() {
		return this.pacReqBy;
	}

	public void setPacReqBy(String pacReqBy) {
		this.pacReqBy = pacReqBy;
	}

	public String getPacUser1() {
		return this.pacUser1;
	}

	public void setPacUser1(String pacUser1) {
		this.pacUser1 = pacUser1;
	}

	public String getPacUser2() {
		return this.pacUser2;
	}

	public void setPacUser2(String pacUser2) {
		this.pacUser2 = pacUser2;
	}

	public String getPacUserid() {
		return this.pacUserid;
	}

	public void setPacUserid(String pacUserid) {
		this.pacUserid = pacUserid;
	}

	public Date getPacModDate() {
		return this.pacModDate;
	}

	public void setPacModDate(Date pacModDate) {
		this.pacModDate = pacModDate;
	}

	public String getPacQadc01() {
		return this.pacQadc01;
	}

	public void setPacQadc01(String pacQadc01) {
		this.pacQadc01 = pacQadc01;
	}

	public String getPacPurSub() {
		return this.pacPurSub;
	}

	public void setPacPurSub(String pacPurSub) {
		this.pacPurSub = pacPurSub;
	}

	public Double getOidPacMstr() {
		return this.oidPacMstr;
	}

	public void setOidPacMstr(Double oidPacMstr) {
		this.oidPacMstr = oidPacMstr;
	}

}