package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCctrHist entity provides the base persistence definition of the
 * CctrHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCctrHist implements java.io.Serializable {

	// Fields

	private CctrHistId id;
	private String cctrNbr;
	private String cctrInvNbr;
	private String cctrCcNbr;
	private Date cctrTxDate;
	private String cctrAuthNbr;
	private Double cctrAmt;
	private Date cctrAuthExpireDate;
	private String cctrAvsCode;
	private String cctrStatus;
	private String cctrErrMsg;
	private String cctrMerchTxn;
	private String cctrCustTxn;
	private String cctrAuxMsg;
	private String cctrActionCode;
	private String cctrRefCode;
	private Boolean cctrInternalTx;
	private String cctrTxType;
	private String cctrAuthCode;
	private String cctrTxTime;
	private String cctrModUserid;
	private Date cctrModDate;
	private String cctrUser1;
	private String cctrUser2;
	private String cctrQadc01;
	private Integer cctrQadi01;
	private Double cctrQadd01;
	private Boolean cctrQadl01;
	private Date cctrQadt01;
	private Double oidCctrHist;

	// Constructors

	/** default constructor */
	public AbstractCctrHist() {
	}

	/** minimal constructor */
	public AbstractCctrHist(CctrHistId id, String cctrNbr, String cctrInvNbr,
			String cctrCcNbr, Date cctrTxDate, String cctrAuthNbr,
			Double cctrAmt, Date cctrAuthExpireDate, String cctrAvsCode,
			String cctrStatus, String cctrErrMsg, String cctrMerchTxn,
			String cctrCustTxn, String cctrAuxMsg, String cctrActionCode,
			String cctrRefCode, Boolean cctrInternalTx, String cctrTxType,
			String cctrAuthCode, String cctrTxTime, String cctrModUserid,
			Date cctrModDate, Double oidCctrHist) {
		this.id = id;
		this.cctrNbr = cctrNbr;
		this.cctrInvNbr = cctrInvNbr;
		this.cctrCcNbr = cctrCcNbr;
		this.cctrTxDate = cctrTxDate;
		this.cctrAuthNbr = cctrAuthNbr;
		this.cctrAmt = cctrAmt;
		this.cctrAuthExpireDate = cctrAuthExpireDate;
		this.cctrAvsCode = cctrAvsCode;
		this.cctrStatus = cctrStatus;
		this.cctrErrMsg = cctrErrMsg;
		this.cctrMerchTxn = cctrMerchTxn;
		this.cctrCustTxn = cctrCustTxn;
		this.cctrAuxMsg = cctrAuxMsg;
		this.cctrActionCode = cctrActionCode;
		this.cctrRefCode = cctrRefCode;
		this.cctrInternalTx = cctrInternalTx;
		this.cctrTxType = cctrTxType;
		this.cctrAuthCode = cctrAuthCode;
		this.cctrTxTime = cctrTxTime;
		this.cctrModUserid = cctrModUserid;
		this.cctrModDate = cctrModDate;
		this.oidCctrHist = oidCctrHist;
	}

	/** full constructor */
	public AbstractCctrHist(CctrHistId id, String cctrNbr, String cctrInvNbr,
			String cctrCcNbr, Date cctrTxDate, String cctrAuthNbr,
			Double cctrAmt, Date cctrAuthExpireDate, String cctrAvsCode,
			String cctrStatus, String cctrErrMsg, String cctrMerchTxn,
			String cctrCustTxn, String cctrAuxMsg, String cctrActionCode,
			String cctrRefCode, Boolean cctrInternalTx, String cctrTxType,
			String cctrAuthCode, String cctrTxTime, String cctrModUserid,
			Date cctrModDate, String cctrUser1, String cctrUser2,
			String cctrQadc01, Integer cctrQadi01, Double cctrQadd01,
			Boolean cctrQadl01, Date cctrQadt01, Double oidCctrHist) {
		this.id = id;
		this.cctrNbr = cctrNbr;
		this.cctrInvNbr = cctrInvNbr;
		this.cctrCcNbr = cctrCcNbr;
		this.cctrTxDate = cctrTxDate;
		this.cctrAuthNbr = cctrAuthNbr;
		this.cctrAmt = cctrAmt;
		this.cctrAuthExpireDate = cctrAuthExpireDate;
		this.cctrAvsCode = cctrAvsCode;
		this.cctrStatus = cctrStatus;
		this.cctrErrMsg = cctrErrMsg;
		this.cctrMerchTxn = cctrMerchTxn;
		this.cctrCustTxn = cctrCustTxn;
		this.cctrAuxMsg = cctrAuxMsg;
		this.cctrActionCode = cctrActionCode;
		this.cctrRefCode = cctrRefCode;
		this.cctrInternalTx = cctrInternalTx;
		this.cctrTxType = cctrTxType;
		this.cctrAuthCode = cctrAuthCode;
		this.cctrTxTime = cctrTxTime;
		this.cctrModUserid = cctrModUserid;
		this.cctrModDate = cctrModDate;
		this.cctrUser1 = cctrUser1;
		this.cctrUser2 = cctrUser2;
		this.cctrQadc01 = cctrQadc01;
		this.cctrQadi01 = cctrQadi01;
		this.cctrQadd01 = cctrQadd01;
		this.cctrQadl01 = cctrQadl01;
		this.cctrQadt01 = cctrQadt01;
		this.oidCctrHist = oidCctrHist;
	}

	// Property accessors

	public CctrHistId getId() {
		return this.id;
	}

	public void setId(CctrHistId id) {
		this.id = id;
	}

	public String getCctrNbr() {
		return this.cctrNbr;
	}

	public void setCctrNbr(String cctrNbr) {
		this.cctrNbr = cctrNbr;
	}

	public String getCctrInvNbr() {
		return this.cctrInvNbr;
	}

	public void setCctrInvNbr(String cctrInvNbr) {
		this.cctrInvNbr = cctrInvNbr;
	}

	public String getCctrCcNbr() {
		return this.cctrCcNbr;
	}

	public void setCctrCcNbr(String cctrCcNbr) {
		this.cctrCcNbr = cctrCcNbr;
	}

	public Date getCctrTxDate() {
		return this.cctrTxDate;
	}

	public void setCctrTxDate(Date cctrTxDate) {
		this.cctrTxDate = cctrTxDate;
	}

	public String getCctrAuthNbr() {
		return this.cctrAuthNbr;
	}

	public void setCctrAuthNbr(String cctrAuthNbr) {
		this.cctrAuthNbr = cctrAuthNbr;
	}

	public Double getCctrAmt() {
		return this.cctrAmt;
	}

	public void setCctrAmt(Double cctrAmt) {
		this.cctrAmt = cctrAmt;
	}

	public Date getCctrAuthExpireDate() {
		return this.cctrAuthExpireDate;
	}

	public void setCctrAuthExpireDate(Date cctrAuthExpireDate) {
		this.cctrAuthExpireDate = cctrAuthExpireDate;
	}

	public String getCctrAvsCode() {
		return this.cctrAvsCode;
	}

	public void setCctrAvsCode(String cctrAvsCode) {
		this.cctrAvsCode = cctrAvsCode;
	}

	public String getCctrStatus() {
		return this.cctrStatus;
	}

	public void setCctrStatus(String cctrStatus) {
		this.cctrStatus = cctrStatus;
	}

	public String getCctrErrMsg() {
		return this.cctrErrMsg;
	}

	public void setCctrErrMsg(String cctrErrMsg) {
		this.cctrErrMsg = cctrErrMsg;
	}

	public String getCctrMerchTxn() {
		return this.cctrMerchTxn;
	}

	public void setCctrMerchTxn(String cctrMerchTxn) {
		this.cctrMerchTxn = cctrMerchTxn;
	}

	public String getCctrCustTxn() {
		return this.cctrCustTxn;
	}

	public void setCctrCustTxn(String cctrCustTxn) {
		this.cctrCustTxn = cctrCustTxn;
	}

	public String getCctrAuxMsg() {
		return this.cctrAuxMsg;
	}

	public void setCctrAuxMsg(String cctrAuxMsg) {
		this.cctrAuxMsg = cctrAuxMsg;
	}

	public String getCctrActionCode() {
		return this.cctrActionCode;
	}

	public void setCctrActionCode(String cctrActionCode) {
		this.cctrActionCode = cctrActionCode;
	}

	public String getCctrRefCode() {
		return this.cctrRefCode;
	}

	public void setCctrRefCode(String cctrRefCode) {
		this.cctrRefCode = cctrRefCode;
	}

	public Boolean getCctrInternalTx() {
		return this.cctrInternalTx;
	}

	public void setCctrInternalTx(Boolean cctrInternalTx) {
		this.cctrInternalTx = cctrInternalTx;
	}

	public String getCctrTxType() {
		return this.cctrTxType;
	}

	public void setCctrTxType(String cctrTxType) {
		this.cctrTxType = cctrTxType;
	}

	public String getCctrAuthCode() {
		return this.cctrAuthCode;
	}

	public void setCctrAuthCode(String cctrAuthCode) {
		this.cctrAuthCode = cctrAuthCode;
	}

	public String getCctrTxTime() {
		return this.cctrTxTime;
	}

	public void setCctrTxTime(String cctrTxTime) {
		this.cctrTxTime = cctrTxTime;
	}

	public String getCctrModUserid() {
		return this.cctrModUserid;
	}

	public void setCctrModUserid(String cctrModUserid) {
		this.cctrModUserid = cctrModUserid;
	}

	public Date getCctrModDate() {
		return this.cctrModDate;
	}

	public void setCctrModDate(Date cctrModDate) {
		this.cctrModDate = cctrModDate;
	}

	public String getCctrUser1() {
		return this.cctrUser1;
	}

	public void setCctrUser1(String cctrUser1) {
		this.cctrUser1 = cctrUser1;
	}

	public String getCctrUser2() {
		return this.cctrUser2;
	}

	public void setCctrUser2(String cctrUser2) {
		this.cctrUser2 = cctrUser2;
	}

	public String getCctrQadc01() {
		return this.cctrQadc01;
	}

	public void setCctrQadc01(String cctrQadc01) {
		this.cctrQadc01 = cctrQadc01;
	}

	public Integer getCctrQadi01() {
		return this.cctrQadi01;
	}

	public void setCctrQadi01(Integer cctrQadi01) {
		this.cctrQadi01 = cctrQadi01;
	}

	public Double getCctrQadd01() {
		return this.cctrQadd01;
	}

	public void setCctrQadd01(Double cctrQadd01) {
		this.cctrQadd01 = cctrQadd01;
	}

	public Boolean getCctrQadl01() {
		return this.cctrQadl01;
	}

	public void setCctrQadl01(Boolean cctrQadl01) {
		this.cctrQadl01 = cctrQadl01;
	}

	public Date getCctrQadt01() {
		return this.cctrQadt01;
	}

	public void setCctrQadt01(Date cctrQadt01) {
		this.cctrQadt01 = cctrQadt01;
	}

	public Double getOidCctrHist() {
		return this.oidCctrHist;
	}

	public void setOidCctrHist(Double oidCctrHist) {
		this.oidCctrHist = oidCctrHist;
	}

}