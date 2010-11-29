package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AprMstr entity. @author MyEclipse Persistence Tools
 */
public class AprMstr extends AbstractAprMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AprMstr() {
	}

	/** minimal constructor */
	public AprMstr(AprMstrId id, Double oidAprMstr) {
		super(id, oidAprMstr);
	}

	/** full constructor */
	public AprMstr(AprMstrId id, String aprAccessCode, String aprSrcComp,
			String aprDesc, String aprName, String aprSrcTask,
			String aprAppVer, String aprDelErrDet, String aprDocLng,
			String aprEmailUserid, String aprEmailNotlvl, String aprExDestProc,
			Boolean aprExInitConn, Boolean aprExMapFlg, Boolean aprSendFlg,
			Boolean aprPublFlg, String aprImDestProc, Boolean aprImInitConn,
			Boolean aprCimProc, Boolean aprImMapFlg, Boolean aprProcFlag,
			Boolean aprRcvFlg, String aprMapperProc, Date aprModDate,
			String aprModUserid, String aprMsgAckLvl, String aprMsgClntOrd,
			String aprMsgPriority, String aprMsgRouting, String aprMsgTtl,
			Integer aprPauseSev, String aprAckDocRev, String aprAckDocStd,
			String aprAckDocTyp, String aprAckLvlReqd, String aprSrcUserid,
			String aprImIpAddr, String aprExIpAddr, Integer aprImPortNbr,
			Integer aprExPortNbr, String aprAdapterProc, String aprAdapterEnv,
			String aprCodePg, String aprDateForm, String aprNumForm,
			String aprMapSpec, String aprUser1, String aprUser2,
			Double aprDec01, Double aprDec02, Boolean aprLog01,
			Integer aprInt01, Boolean aprLog02, Integer aprInt02,
			Date aprDte01, Date aprDte02, String aprQadc01, String aprQadc02,
			String aprQadc03, String aprQadc04, Double aprQadd01,
			Double aprQadd02, Integer aprQadi01, Integer aprQadi02,
			Boolean aprQadl01, Boolean aprQadl02, Date aprQadt01,
			Date aprQadt02, String aprMsgSecur, String aprMsgPersist,
			String aprQueuePub, String aprMapParm, String aprMapParmVal,
			Boolean aprEolDelim, String aprMsgSync, String aprImDocStd,
			String aprAdaptCmd, Boolean aprAdaptStart, String aprImXml,
			String aprExXml, String aprDtdDirUrl, Integer aprExDelim,
			Integer aprImDelim, String aprImArchDir, String aprExArchDir,
			String aprImDestMthd, String aprImPrcTyp, String aprExDestMthd,
			String aprExPrcTyp, Double oidAprMstr) {
		super(id, aprAccessCode, aprSrcComp, aprDesc, aprName, aprSrcTask,
				aprAppVer, aprDelErrDet, aprDocLng, aprEmailUserid,
				aprEmailNotlvl, aprExDestProc, aprExInitConn, aprExMapFlg,
				aprSendFlg, aprPublFlg, aprImDestProc, aprImInitConn,
				aprCimProc, aprImMapFlg, aprProcFlag, aprRcvFlg, aprMapperProc,
				aprModDate, aprModUserid, aprMsgAckLvl, aprMsgClntOrd,
				aprMsgPriority, aprMsgRouting, aprMsgTtl, aprPauseSev,
				aprAckDocRev, aprAckDocStd, aprAckDocTyp, aprAckLvlReqd,
				aprSrcUserid, aprImIpAddr, aprExIpAddr, aprImPortNbr,
				aprExPortNbr, aprAdapterProc, aprAdapterEnv, aprCodePg,
				aprDateForm, aprNumForm, aprMapSpec, aprUser1, aprUser2,
				aprDec01, aprDec02, aprLog01, aprInt01, aprLog02, aprInt02,
				aprDte01, aprDte02, aprQadc01, aprQadc02, aprQadc03, aprQadc04,
				aprQadd01, aprQadd02, aprQadi01, aprQadi02, aprQadl01,
				aprQadl02, aprQadt01, aprQadt02, aprMsgSecur, aprMsgPersist,
				aprQueuePub, aprMapParm, aprMapParmVal, aprEolDelim,
				aprMsgSync, aprImDocStd, aprAdaptCmd, aprAdaptStart, aprImXml,
				aprExXml, aprDtdDirUrl, aprExDelim, aprImDelim, aprImArchDir,
				aprExArchDir, aprImDestMthd, aprImPrcTyp, aprExDestMthd,
				aprExPrcTyp, oidAprMstr);
	}

}
