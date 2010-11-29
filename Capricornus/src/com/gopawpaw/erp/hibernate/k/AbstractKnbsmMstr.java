package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbsmMstr entity provides the base persistence definition of the
 * KnbsmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbsmMstr implements java.io.Serializable {

	// Fields

	private KnbsmMstrId id;
	private String knbsmDesc;
	private Double knbsmKeyid;
	private String knbsmInvLoc;
	private String knbsmInvLocType;
	private String knbsmDestFax;
	private String knbsmDestFax2;
	private String knbsmDestEmail;
	private Date knbsmModDate;
	private String knbsmModUserid;
	private String knbsmUser1;
	private String knbsmUser2;
	private String knbsmQadc01;
	private String knbsmQadc02;
	private Integer knbsmCmtindx;
	private Double oidKnbsmMstr;

	// Constructors

	/** default constructor */
	public AbstractKnbsmMstr() {
	}

	/** minimal constructor */
	public AbstractKnbsmMstr(KnbsmMstrId id, Double knbsmKeyid,
			String knbsmInvLoc, String knbsmInvLocType, String knbsmDestFax,
			String knbsmDestFax2, String knbsmDestEmail, Date knbsmModDate,
			String knbsmModUserid, String knbsmUser1, String knbsmUser2,
			String knbsmQadc01, String knbsmQadc02, Integer knbsmCmtindx,
			Double oidKnbsmMstr) {
		this.id = id;
		this.knbsmKeyid = knbsmKeyid;
		this.knbsmInvLoc = knbsmInvLoc;
		this.knbsmInvLocType = knbsmInvLocType;
		this.knbsmDestFax = knbsmDestFax;
		this.knbsmDestFax2 = knbsmDestFax2;
		this.knbsmDestEmail = knbsmDestEmail;
		this.knbsmModDate = knbsmModDate;
		this.knbsmModUserid = knbsmModUserid;
		this.knbsmUser1 = knbsmUser1;
		this.knbsmUser2 = knbsmUser2;
		this.knbsmQadc01 = knbsmQadc01;
		this.knbsmQadc02 = knbsmQadc02;
		this.knbsmCmtindx = knbsmCmtindx;
		this.oidKnbsmMstr = oidKnbsmMstr;
	}

	/** full constructor */
	public AbstractKnbsmMstr(KnbsmMstrId id, String knbsmDesc,
			Double knbsmKeyid, String knbsmInvLoc, String knbsmInvLocType,
			String knbsmDestFax, String knbsmDestFax2, String knbsmDestEmail,
			Date knbsmModDate, String knbsmModUserid, String knbsmUser1,
			String knbsmUser2, String knbsmQadc01, String knbsmQadc02,
			Integer knbsmCmtindx, Double oidKnbsmMstr) {
		this.id = id;
		this.knbsmDesc = knbsmDesc;
		this.knbsmKeyid = knbsmKeyid;
		this.knbsmInvLoc = knbsmInvLoc;
		this.knbsmInvLocType = knbsmInvLocType;
		this.knbsmDestFax = knbsmDestFax;
		this.knbsmDestFax2 = knbsmDestFax2;
		this.knbsmDestEmail = knbsmDestEmail;
		this.knbsmModDate = knbsmModDate;
		this.knbsmModUserid = knbsmModUserid;
		this.knbsmUser1 = knbsmUser1;
		this.knbsmUser2 = knbsmUser2;
		this.knbsmQadc01 = knbsmQadc01;
		this.knbsmQadc02 = knbsmQadc02;
		this.knbsmCmtindx = knbsmCmtindx;
		this.oidKnbsmMstr = oidKnbsmMstr;
	}

	// Property accessors

	public KnbsmMstrId getId() {
		return this.id;
	}

	public void setId(KnbsmMstrId id) {
		this.id = id;
	}

	public String getKnbsmDesc() {
		return this.knbsmDesc;
	}

	public void setKnbsmDesc(String knbsmDesc) {
		this.knbsmDesc = knbsmDesc;
	}

	public Double getKnbsmKeyid() {
		return this.knbsmKeyid;
	}

	public void setKnbsmKeyid(Double knbsmKeyid) {
		this.knbsmKeyid = knbsmKeyid;
	}

	public String getKnbsmInvLoc() {
		return this.knbsmInvLoc;
	}

	public void setKnbsmInvLoc(String knbsmInvLoc) {
		this.knbsmInvLoc = knbsmInvLoc;
	}

	public String getKnbsmInvLocType() {
		return this.knbsmInvLocType;
	}

	public void setKnbsmInvLocType(String knbsmInvLocType) {
		this.knbsmInvLocType = knbsmInvLocType;
	}

	public String getKnbsmDestFax() {
		return this.knbsmDestFax;
	}

	public void setKnbsmDestFax(String knbsmDestFax) {
		this.knbsmDestFax = knbsmDestFax;
	}

	public String getKnbsmDestFax2() {
		return this.knbsmDestFax2;
	}

	public void setKnbsmDestFax2(String knbsmDestFax2) {
		this.knbsmDestFax2 = knbsmDestFax2;
	}

	public String getKnbsmDestEmail() {
		return this.knbsmDestEmail;
	}

	public void setKnbsmDestEmail(String knbsmDestEmail) {
		this.knbsmDestEmail = knbsmDestEmail;
	}

	public Date getKnbsmModDate() {
		return this.knbsmModDate;
	}

	public void setKnbsmModDate(Date knbsmModDate) {
		this.knbsmModDate = knbsmModDate;
	}

	public String getKnbsmModUserid() {
		return this.knbsmModUserid;
	}

	public void setKnbsmModUserid(String knbsmModUserid) {
		this.knbsmModUserid = knbsmModUserid;
	}

	public String getKnbsmUser1() {
		return this.knbsmUser1;
	}

	public void setKnbsmUser1(String knbsmUser1) {
		this.knbsmUser1 = knbsmUser1;
	}

	public String getKnbsmUser2() {
		return this.knbsmUser2;
	}

	public void setKnbsmUser2(String knbsmUser2) {
		this.knbsmUser2 = knbsmUser2;
	}

	public String getKnbsmQadc01() {
		return this.knbsmQadc01;
	}

	public void setKnbsmQadc01(String knbsmQadc01) {
		this.knbsmQadc01 = knbsmQadc01;
	}

	public String getKnbsmQadc02() {
		return this.knbsmQadc02;
	}

	public void setKnbsmQadc02(String knbsmQadc02) {
		this.knbsmQadc02 = knbsmQadc02;
	}

	public Integer getKnbsmCmtindx() {
		return this.knbsmCmtindx;
	}

	public void setKnbsmCmtindx(Integer knbsmCmtindx) {
		this.knbsmCmtindx = knbsmCmtindx;
	}

	public Double getOidKnbsmMstr() {
		return this.oidKnbsmMstr;
	}

	public void setOidKnbsmMstr(Double oidKnbsmMstr) {
		this.oidKnbsmMstr = oidKnbsmMstr;
	}

}