package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IspMstr entity. @author MyEclipse Persistence Tools
 */
public class IspMstr extends AbstractIspMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IspMstr() {
	}

	/** minimal constructor */
	public IspMstr(IspMstrId id, Double oidIspMstr) {
		super(id, oidIspMstr);
	}

	/** full constructor */
	public IspMstr(IspMstrId id, String ispAccessCode, String ispSrcComp,
			String ispSrcTask, String ispAppVer, String ispDelErrDet,
			String ispDestAppId, String ispDestAppVer, String ispDestDocRev,
			String ispDestDocStd, String ispDestDocTyp, String ispDestProc,
			Boolean ispCimProc, String ispDocLng, String ispEmailUserid,
			String ispEmailNotlvl, Boolean ispImMapFlg, Boolean ispProcFlg,
			Boolean ispRcvFlg, String ispDesc, String ispMapperProc,
			String ispMapSpec, Date ispModDate, String ispModUserid,
			Integer ispPauseSev, String ispAckDocRev, String ispAckDocStd,
			String ispAckDocTyp, String ispAckLvlReqd, String ispSrcProc,
			String ispSrcUserid, Boolean ispUseImQueue, String ispCodePg,
			String ispDateForm, String ispNumForm, String ispUser1,
			String ispUser2, Double ispDec01, Double ispDec02,
			Integer ispInt01, Integer ispInt02, Boolean ispLog01,
			Boolean ispLog02, Date ispDte01, Date ispDte02, String ispQadc01,
			String ispQadc02, String ispQadc03, String ispQadc04,
			Double ispQadd01, Double ispQadd02, Integer ispQadi01,
			Integer ispQadi02, Boolean ispQadl01, Boolean ispQadl02,
			Date ispQadt01, Date ispQadt02, String ispMapParm,
			String ispMapParmVal, Integer ispDelim, String ispDestMthd,
			String ispProcessTyp, String ispXml, Double oidIspMstr) {
		super(id, ispAccessCode, ispSrcComp, ispSrcTask, ispAppVer,
				ispDelErrDet, ispDestAppId, ispDestAppVer, ispDestDocRev,
				ispDestDocStd, ispDestDocTyp, ispDestProc, ispCimProc,
				ispDocLng, ispEmailUserid, ispEmailNotlvl, ispImMapFlg,
				ispProcFlg, ispRcvFlg, ispDesc, ispMapperProc, ispMapSpec,
				ispModDate, ispModUserid, ispPauseSev, ispAckDocRev,
				ispAckDocStd, ispAckDocTyp, ispAckLvlReqd, ispSrcProc,
				ispSrcUserid, ispUseImQueue, ispCodePg, ispDateForm,
				ispNumForm, ispUser1, ispUser2, ispDec01, ispDec02, ispInt01,
				ispInt02, ispLog01, ispLog02, ispDte01, ispDte02, ispQadc01,
				ispQadc02, ispQadc03, ispQadc04, ispQadd01, ispQadd02,
				ispQadi01, ispQadi02, ispQadl01, ispQadl02, ispQadt01,
				ispQadt02, ispMapParm, ispMapParmVal, ispDelim, ispDestMthd,
				ispProcessTyp, ispXml, oidIspMstr);
	}

}
