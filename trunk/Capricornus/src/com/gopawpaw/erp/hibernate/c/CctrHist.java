package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CctrHist entity. @author MyEclipse Persistence Tools
 */
public class CctrHist extends AbstractCctrHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CctrHist() {
	}

	/** minimal constructor */
	public CctrHist(CctrHistId id, String cctrNbr, String cctrInvNbr,
			String cctrCcNbr, Date cctrTxDate, String cctrAuthNbr,
			Double cctrAmt, Date cctrAuthExpireDate, String cctrAvsCode,
			String cctrStatus, String cctrErrMsg, String cctrMerchTxn,
			String cctrCustTxn, String cctrAuxMsg, String cctrActionCode,
			String cctrRefCode, Boolean cctrInternalTx, String cctrTxType,
			String cctrAuthCode, String cctrTxTime, String cctrModUserid,
			Date cctrModDate, Double oidCctrHist) {
		super(id, cctrNbr, cctrInvNbr, cctrCcNbr, cctrTxDate, cctrAuthNbr,
				cctrAmt, cctrAuthExpireDate, cctrAvsCode, cctrStatus,
				cctrErrMsg, cctrMerchTxn, cctrCustTxn, cctrAuxMsg,
				cctrActionCode, cctrRefCode, cctrInternalTx, cctrTxType,
				cctrAuthCode, cctrTxTime, cctrModUserid, cctrModDate,
				oidCctrHist);
	}

	/** full constructor */
	public CctrHist(CctrHistId id, String cctrNbr, String cctrInvNbr,
			String cctrCcNbr, Date cctrTxDate, String cctrAuthNbr,
			Double cctrAmt, Date cctrAuthExpireDate, String cctrAvsCode,
			String cctrStatus, String cctrErrMsg, String cctrMerchTxn,
			String cctrCustTxn, String cctrAuxMsg, String cctrActionCode,
			String cctrRefCode, Boolean cctrInternalTx, String cctrTxType,
			String cctrAuthCode, String cctrTxTime, String cctrModUserid,
			Date cctrModDate, String cctrUser1, String cctrUser2,
			String cctrQadc01, Integer cctrQadi01, Double cctrQadd01,
			Boolean cctrQadl01, Date cctrQadt01, Double oidCctrHist) {
		super(id, cctrNbr, cctrInvNbr, cctrCcNbr, cctrTxDate, cctrAuthNbr,
				cctrAmt, cctrAuthExpireDate, cctrAvsCode, cctrStatus,
				cctrErrMsg, cctrMerchTxn, cctrCustTxn, cctrAuxMsg,
				cctrActionCode, cctrRefCode, cctrInternalTx, cctrTxType,
				cctrAuthCode, cctrTxTime, cctrModUserid, cctrModDate,
				cctrUser1, cctrUser2, cctrQadc01, cctrQadi01, cctrQadd01,
				cctrQadl01, cctrQadt01, oidCctrHist);
	}

}
