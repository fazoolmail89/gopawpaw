package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * ElgHist entity. @author MyEclipse Persistence Tools
 */
public class ElgHist extends AbstractElgHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ElgHist() {
	}

	/** minimal constructor */
	public ElgHist(ElgHistId id, Double oidElgHist) {
		super(id, oidElgHist);
	}

	/** full constructor */
	public ElgHist(ElgHistId id, String elgAccessCode, String elgAppId,
			String elgAppVer, String elgArchiveId, Integer elgCtrlTot1,
			Double elgCtrlTot2, Double elgCtrlTot3, Date elgDateAck,
			Date elgDateMap, Date elgDatePubl, Date elgDateSent,
			String elgDestProc, String elgDocLng, String elgDocRev,
			String elgDocStd, String elgDocTyp, String elgEmailUserid,
			String elgEmailNotlvl, String elgErrStat, String elgExtDocKey,
			String elgMfgproSite, String elgMfgproKey, String elgMapLogFile,
			String elgMapSpec, Date elgModDate, String elgModUserid,
			Integer elgOrigDocId, Boolean elgAckRcvd, String elgAckLvlReqd,
			String elgAckStat, String elgPrcgStage, Integer elgSessId,
			String elgSrcComp, String elgSrcTask, String elgSrcAppId,
			String elgSrcAppVer, String elgSrcDocRev, String elgSrcDocStd,
			String elgSrcDocTyp, String elgSrcProc, String elgSrcUserid,
			String elgTimeAck, String elgTimeMap, String elgTimeSent,
			String elgTimePubl, String elgTradptrId, Boolean elgUseExQueue,
			Boolean elgMapDocNow, String elgUnitWrkTyp, Integer elgGrpId,
			String elgCodePg, String elgDateForm, String elgNumForm,
			String elgUser1, String elgUser2, Double elgDec01, Double elgDec02,
			Integer elgInt01, Integer elgInt02, Boolean elgLog01,
			Boolean elgLog02, Date elgDte01, Date elgDte02, String elgQadc01,
			String elgQadc02, String elgQadc03, String elgQadc04,
			Double elgQadd01, Double elgQadd02, Integer elgQadi01,
			Integer elgQadi02, Boolean elgQadl01, Boolean elgQadl02,
			Date elgQadt01, Date elgQadt02, Integer elgGrpSeq,
			Boolean elgResend, String elgMapperProc, String elgDestMthd,
			String elgProcessTyp, Double oidElgHist) {
		super(id, elgAccessCode, elgAppId, elgAppVer, elgArchiveId,
				elgCtrlTot1, elgCtrlTot2, elgCtrlTot3, elgDateAck, elgDateMap,
				elgDatePubl, elgDateSent, elgDestProc, elgDocLng, elgDocRev,
				elgDocStd, elgDocTyp, elgEmailUserid, elgEmailNotlvl,
				elgErrStat, elgExtDocKey, elgMfgproSite, elgMfgproKey,
				elgMapLogFile, elgMapSpec, elgModDate, elgModUserid,
				elgOrigDocId, elgAckRcvd, elgAckLvlReqd, elgAckStat,
				elgPrcgStage, elgSessId, elgSrcComp, elgSrcTask, elgSrcAppId,
				elgSrcAppVer, elgSrcDocRev, elgSrcDocStd, elgSrcDocTyp,
				elgSrcProc, elgSrcUserid, elgTimeAck, elgTimeMap, elgTimeSent,
				elgTimePubl, elgTradptrId, elgUseExQueue, elgMapDocNow,
				elgUnitWrkTyp, elgGrpId, elgCodePg, elgDateForm, elgNumForm,
				elgUser1, elgUser2, elgDec01, elgDec02, elgInt01, elgInt02,
				elgLog01, elgLog02, elgDte01, elgDte02, elgQadc01, elgQadc02,
				elgQadc03, elgQadc04, elgQadd01, elgQadd02, elgQadi01,
				elgQadi02, elgQadl01, elgQadl02, elgQadt01, elgQadt02,
				elgGrpSeq, elgResend, elgMapperProc, elgDestMthd,
				elgProcessTyp, oidElgHist);
	}

}
