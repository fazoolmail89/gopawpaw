package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnpdDet entity. @author MyEclipse Persistence Tools
 */
public class KnpdDet extends AbstractKnpdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnpdDet() {
	}

	/** minimal constructor */
	public KnpdDet(KnpdDetId id, Double knpdKnpKeyid, Double knpdKnbiKeyid,
			Double knpdEpeInterval, Boolean knpdEpeiAutoCalc,
			Double knpdYieldPct, Double knpdCycleTime, Double knpdEquipTime,
			Double knpdLeadTime, Double knpdSetupTime, Double knpdMoveTime,
			Double knpdWorkContent, Double knpdReqOperators,
			Integer knpdOpStart, Integer knpdOpEnd, Integer knpdMfgSeq,
			Date knpdModDate, String knpdModUserid, String knpdUser1,
			String knpdUser2, String knpdQadc01, String knpdQadc02,
			Double knpdMinEpeInterval, Double oidKnpdDet) {
		super(id, knpdKnpKeyid, knpdKnbiKeyid, knpdEpeInterval,
				knpdEpeiAutoCalc, knpdYieldPct, knpdCycleTime, knpdEquipTime,
				knpdLeadTime, knpdSetupTime, knpdMoveTime, knpdWorkContent,
				knpdReqOperators, knpdOpStart, knpdOpEnd, knpdMfgSeq,
				knpdModDate, knpdModUserid, knpdUser1, knpdUser2, knpdQadc01,
				knpdQadc02, knpdMinEpeInterval, oidKnpdDet);
	}

	/** full constructor */
	public KnpdDet(KnpdDetId id, Double knpdKnpKeyid, Double knpdKnbiKeyid,
			Double knpdEpeInterval, Boolean knpdEpeiAutoCalc,
			Double knpdMixPct, Double knpdYieldPct, Double knpdCycleTime,
			Double knpdEquipTime, Double knpdLeadTime, Double knpdSetupTime,
			Double knpdMoveTime, Double knpdWorkContent,
			Double knpdReqOperators, Integer knpdOpStart, Integer knpdOpEnd,
			Integer knpdMfgSeq, Date knpdModDate, String knpdModUserid,
			String knpdUser1, String knpdUser2, String knpdQadc01,
			String knpdQadc02, Double knpdMinEpeInterval, Double oidKnpdDet) {
		super(id, knpdKnpKeyid, knpdKnbiKeyid, knpdEpeInterval,
				knpdEpeiAutoCalc, knpdMixPct, knpdYieldPct, knpdCycleTime,
				knpdEquipTime, knpdLeadTime, knpdSetupTime, knpdMoveTime,
				knpdWorkContent, knpdReqOperators, knpdOpStart, knpdOpEnd,
				knpdMfgSeq, knpdModDate, knpdModUserid, knpdUser1, knpdUser2,
				knpdQadc01, knpdQadc02, knpdMinEpeInterval, oidKnpdDet);
	}

}
