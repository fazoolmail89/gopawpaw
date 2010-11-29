package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EspMstr entity. @author MyEclipse Persistence Tools
 */
public class EspMstr extends AbstractEspMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EspMstr() {
	}

	/** minimal constructor */
	public EspMstr(EspMstrId id, Double oidEspMstr) {
		super(id, oidEspMstr);
	}

	/** full constructor */
	public EspMstr(EspMstrId id, String espAccessCode, String espAppVer,
			String espDelErrDet, String espDestProc, String espDocLng,
			String espEmailUserid, String espEmailNotlvl, String espDesc,
			Boolean espExMapFlg, Boolean espSendFlg, Boolean espPublFlg,
			String espMapperProc, String espMapSpec, Date espModDate,
			String espModUserid, String espMsgAckLvl, String espMsgClntOrd,
			String espMsgPriority, String espMsgRouting, String espMsgTtl,
			Integer espPauseSev, String espAckLvlReqd, String espSrcComp,
			String espSrcAppId, String espSrcTask, String espSrcAppVer,
			String espSrcDocRev, String espSrcDocStd, String espSrcDocTyp,
			String espSrcProc, String espSrcUserid, Boolean espUseExQueue,
			String espAckDocRev, String espAckDocStd, String espAckDocTyp,
			String espCodePg, String espDateForm, String espNumForm,
			String espUser1, String espUser2, Double espDec01, Double espDec02,
			Integer espInt01, Integer espInt02, Boolean espLog01,
			Boolean espLog02, Date espDte01, Date espDte02, String espQadc01,
			String espQadc02, String espQadc03, String espQadc04,
			Double espQadd01, Double espQadd02, Integer espQadi01,
			Integer espQadi02, Boolean espQadl01, Boolean espQadl02,
			Date espQadt01, Date espQadt02, String espMsgSync,
			String espMsgSecur, String espMsgPersist, String espQueuePub,
			String espMapParm, String espMapParmVal, Boolean espEolDelim,
			String espDtdName, Integer espDelim, String espDestMthd,
			String espProcessTyp, String espXml, Double oidEspMstr) {
		super(id, espAccessCode, espAppVer, espDelErrDet, espDestProc,
				espDocLng, espEmailUserid, espEmailNotlvl, espDesc,
				espExMapFlg, espSendFlg, espPublFlg, espMapperProc, espMapSpec,
				espModDate, espModUserid, espMsgAckLvl, espMsgClntOrd,
				espMsgPriority, espMsgRouting, espMsgTtl, espPauseSev,
				espAckLvlReqd, espSrcComp, espSrcAppId, espSrcTask,
				espSrcAppVer, espSrcDocRev, espSrcDocStd, espSrcDocTyp,
				espSrcProc, espSrcUserid, espUseExQueue, espAckDocRev,
				espAckDocStd, espAckDocTyp, espCodePg, espDateForm, espNumForm,
				espUser1, espUser2, espDec01, espDec02, espInt01, espInt02,
				espLog01, espLog02, espDte01, espDte02, espQadc01, espQadc02,
				espQadc03, espQadc04, espQadd01, espQadd02, espQadi01,
				espQadi02, espQadl01, espQadl02, espQadt01, espQadt02,
				espMsgSync, espMsgSecur, espMsgPersist, espQueuePub,
				espMapParm, espMapParmVal, espEolDelim, espDtdName, espDelim,
				espDestMthd, espProcessTyp, espXml, oidEspMstr);
	}

}
