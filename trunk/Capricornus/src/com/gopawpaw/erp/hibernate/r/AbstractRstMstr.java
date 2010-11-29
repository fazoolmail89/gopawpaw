package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRstMstr entity provides the base persistence definition of the
 * RstMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRstMstr implements java.io.Serializable {

	// Fields

	private RstMstrId id;
	private String rstDesc;
	private String rstNotify1;
	private String rstNotify2;
	private Date rstModDate;
	private String rstUserid;
	private String rstUser1;
	private String rstUser2;
	private String rstSvrtyList;
	private String rstNotify1Mail;
	private String rstNotify2Mail;
	private String rstQadc01;
	private Double oidRstMstr;

	// Constructors

	/** default constructor */
	public AbstractRstMstr() {
	}

	/** minimal constructor */
	public AbstractRstMstr(RstMstrId id, String rstDesc, String rstNotify1,
			String rstNotify2, String rstUserid, String rstUser1,
			String rstUser2, String rstSvrtyList, String rstNotify1Mail,
			String rstNotify2Mail, Double oidRstMstr) {
		this.id = id;
		this.rstDesc = rstDesc;
		this.rstNotify1 = rstNotify1;
		this.rstNotify2 = rstNotify2;
		this.rstUserid = rstUserid;
		this.rstUser1 = rstUser1;
		this.rstUser2 = rstUser2;
		this.rstSvrtyList = rstSvrtyList;
		this.rstNotify1Mail = rstNotify1Mail;
		this.rstNotify2Mail = rstNotify2Mail;
		this.oidRstMstr = oidRstMstr;
	}

	/** full constructor */
	public AbstractRstMstr(RstMstrId id, String rstDesc, String rstNotify1,
			String rstNotify2, Date rstModDate, String rstUserid,
			String rstUser1, String rstUser2, String rstSvrtyList,
			String rstNotify1Mail, String rstNotify2Mail, String rstQadc01,
			Double oidRstMstr) {
		this.id = id;
		this.rstDesc = rstDesc;
		this.rstNotify1 = rstNotify1;
		this.rstNotify2 = rstNotify2;
		this.rstModDate = rstModDate;
		this.rstUserid = rstUserid;
		this.rstUser1 = rstUser1;
		this.rstUser2 = rstUser2;
		this.rstSvrtyList = rstSvrtyList;
		this.rstNotify1Mail = rstNotify1Mail;
		this.rstNotify2Mail = rstNotify2Mail;
		this.rstQadc01 = rstQadc01;
		this.oidRstMstr = oidRstMstr;
	}

	// Property accessors

	public RstMstrId getId() {
		return this.id;
	}

	public void setId(RstMstrId id) {
		this.id = id;
	}

	public String getRstDesc() {
		return this.rstDesc;
	}

	public void setRstDesc(String rstDesc) {
		this.rstDesc = rstDesc;
	}

	public String getRstNotify1() {
		return this.rstNotify1;
	}

	public void setRstNotify1(String rstNotify1) {
		this.rstNotify1 = rstNotify1;
	}

	public String getRstNotify2() {
		return this.rstNotify2;
	}

	public void setRstNotify2(String rstNotify2) {
		this.rstNotify2 = rstNotify2;
	}

	public Date getRstModDate() {
		return this.rstModDate;
	}

	public void setRstModDate(Date rstModDate) {
		this.rstModDate = rstModDate;
	}

	public String getRstUserid() {
		return this.rstUserid;
	}

	public void setRstUserid(String rstUserid) {
		this.rstUserid = rstUserid;
	}

	public String getRstUser1() {
		return this.rstUser1;
	}

	public void setRstUser1(String rstUser1) {
		this.rstUser1 = rstUser1;
	}

	public String getRstUser2() {
		return this.rstUser2;
	}

	public void setRstUser2(String rstUser2) {
		this.rstUser2 = rstUser2;
	}

	public String getRstSvrtyList() {
		return this.rstSvrtyList;
	}

	public void setRstSvrtyList(String rstSvrtyList) {
		this.rstSvrtyList = rstSvrtyList;
	}

	public String getRstNotify1Mail() {
		return this.rstNotify1Mail;
	}

	public void setRstNotify1Mail(String rstNotify1Mail) {
		this.rstNotify1Mail = rstNotify1Mail;
	}

	public String getRstNotify2Mail() {
		return this.rstNotify2Mail;
	}

	public void setRstNotify2Mail(String rstNotify2Mail) {
		this.rstNotify2Mail = rstNotify2Mail;
	}

	public String getRstQadc01() {
		return this.rstQadc01;
	}

	public void setRstQadc01(String rstQadc01) {
		this.rstQadc01 = rstQadc01;
	}

	public Double getOidRstMstr() {
		return this.oidRstMstr;
	}

	public void setOidRstMstr(Double oidRstMstr) {
		this.oidRstMstr = oidRstMstr;
	}

}