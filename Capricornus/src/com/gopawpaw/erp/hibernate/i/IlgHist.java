package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IlgHist entity. @author MyEclipse Persistence Tools
 */
public class IlgHist extends AbstractIlgHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IlgHist() {
	}

	/** minimal constructor */
	public IlgHist(IlgHistId id, Double oidIlgHist) {
		super(id, oidIlgHist);
	}

	/** full constructor */
	public IlgHist(IlgHistId id, String ilgAccessCode, String ilgSrcComp,
			String ilgAppId, String ilgSrcTask, String ilgAppVer,
			String ilgArchiveId, Integer ilgCtrlTot1, Double ilgCtrlTot2,
			Double ilgCtrlTot3, Date ilgDateAck, Date ilgDateMap,
			Date ilgDateProc, Date ilgDateRcvd, String ilgDestAppVer,
			String ilgDestAppId, String ilgDestDocRev, String ilgDestDocStd,
			String ilgDestDocTyp, String ilgDestProc, String ilgDocLng,
			String ilgDocRev, String ilgDocStd, String ilgDocTyp,
			String ilgEmailUserid, String ilgEmailNotlvl, String ilgMapLogFile,
			String ilgErrStat, String ilgExtDocKey, String ilgMfgproSite,
			String ilgMfgproKey, Integer ilgGrpId, String ilgMapSpec,
			Date ilgModDate, String ilgModUserid, Integer ilgOrigDocId,
			String ilgAckLvlReqd, Boolean ilgAckSent, String ilgPrcgStage,
			Integer ilgSessId, String ilgSrcProc, String ilgSrcUserid,
			String ilgTimeAck, String ilgTimeMap, String ilgTimeProc,
			String ilgTimeRcvd, String ilgTradptrId, String ilgUnitWrkTyp,
			Boolean ilgMapDocNow, Boolean ilgUseImQueue, String ilgCodePg,
			String ilgDateForm, String ilgNumForm, String ilgUser1,
			String ilgUser2, Double ilgDec01, Double ilgDec02,
			Integer ilgInt01, Integer ilgInt02, Boolean ilgLog01,
			Boolean ilgLog02, Date ilgDte01, Date ilgDte02, String ilgQadc01,
			String ilgQadc02, String ilgQadc03, String ilgQadc04,
			Double ilgQadd01, Double ilgQadd02, Integer ilgQadi01,
			Integer ilgQadi02, Boolean ilgQadl01, Boolean ilgQadl02,
			Date ilgQadt01, Date ilgQadt02, Integer ilgGrpSeq,
			Date ilgDateCreate, String ilgTimeCreate, String ilgTimezone,
			String ilgMapperProc, String ilgDestMthd, String ilgProcessTyp,
			Double oidIlgHist) {
		super(id, ilgAccessCode, ilgSrcComp, ilgAppId, ilgSrcTask, ilgAppVer,
				ilgArchiveId, ilgCtrlTot1, ilgCtrlTot2, ilgCtrlTot3,
				ilgDateAck, ilgDateMap, ilgDateProc, ilgDateRcvd,
				ilgDestAppVer, ilgDestAppId, ilgDestDocRev, ilgDestDocStd,
				ilgDestDocTyp, ilgDestProc, ilgDocLng, ilgDocRev, ilgDocStd,
				ilgDocTyp, ilgEmailUserid, ilgEmailNotlvl, ilgMapLogFile,
				ilgErrStat, ilgExtDocKey, ilgMfgproSite, ilgMfgproKey,
				ilgGrpId, ilgMapSpec, ilgModDate, ilgModUserid, ilgOrigDocId,
				ilgAckLvlReqd, ilgAckSent, ilgPrcgStage, ilgSessId, ilgSrcProc,
				ilgSrcUserid, ilgTimeAck, ilgTimeMap, ilgTimeProc, ilgTimeRcvd,
				ilgTradptrId, ilgUnitWrkTyp, ilgMapDocNow, ilgUseImQueue,
				ilgCodePg, ilgDateForm, ilgNumForm, ilgUser1, ilgUser2,
				ilgDec01, ilgDec02, ilgInt01, ilgInt02, ilgLog01, ilgLog02,
				ilgDte01, ilgDte02, ilgQadc01, ilgQadc02, ilgQadc03, ilgQadc04,
				ilgQadd01, ilgQadd02, ilgQadi01, ilgQadi02, ilgQadl01,
				ilgQadl02, ilgQadt01, ilgQadt02, ilgGrpSeq, ilgDateCreate,
				ilgTimeCreate, ilgTimezone, ilgMapperProc, ilgDestMthd,
				ilgProcessTyp, oidIlgHist);
	}

}
