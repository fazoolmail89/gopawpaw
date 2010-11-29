package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TxrMstr entity. @author MyEclipse Persistence Tools
 */
public class TxrMstr extends AbstractTxrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TxrMstr() {
	}

	/** minimal constructor */
	public TxrMstr(TxrMstrId id, Boolean txrActive, Integer txrApPageNum,
			Integer txrArPageNum, String txrCoSeqid, String txrCrSeqid,
			Boolean txrEcReport, String txrInvSeqid, Date txrModDate,
			String txrModUserid, String txrVoSeqid, String txrUser1,
			String txrUser2, Double txrUserd01, Integer txrUseri01,
			Boolean txrUserl01, String txrQadc01, String txrQadc02,
			Double txrQadd01, Integer txrQadi01, Boolean txrQadl01,
			Double oidTxrMstr) {
		super(id, txrActive, txrApPageNum, txrArPageNum, txrCoSeqid,
				txrCrSeqid, txrEcReport, txrInvSeqid, txrModDate, txrModUserid,
				txrVoSeqid, txrUser1, txrUser2, txrUserd01, txrUseri01,
				txrUserl01, txrQadc01, txrQadc02, txrQadd01, txrQadi01,
				txrQadl01, oidTxrMstr);
	}

	/** full constructor */
	public TxrMstr(TxrMstrId id, Boolean txrActive, Integer txrApPageNum,
			Integer txrArPageNum, String txrCoSeqid, String txrCrSeqid,
			Boolean txrEcReport, String txrInvSeqid, Date txrModDate,
			String txrModUserid, String txrVoSeqid, String txrUser1,
			String txrUser2, Double txrUserd01, Integer txrUseri01,
			Boolean txrUserl01, Date txrUsert01, String txrQadc01,
			String txrQadc02, Double txrQadd01, Integer txrQadi01,
			Boolean txrQadl01, Date txrQadt01, Double oidTxrMstr) {
		super(id, txrActive, txrApPageNum, txrArPageNum, txrCoSeqid,
				txrCrSeqid, txrEcReport, txrInvSeqid, txrModDate, txrModUserid,
				txrVoSeqid, txrUser1, txrUser2, txrUserd01, txrUseri01,
				txrUserl01, txrUsert01, txrQadc01, txrQadc02, txrQadd01,
				txrQadi01, txrQadl01, txrQadt01, oidTxrMstr);
	}

}
