package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnpMstr entity. @author MyEclipse Persistence Tools
 */
public class KnpMstr extends AbstractKnpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnpMstr() {
	}

	/** minimal constructor */
	public KnpMstr(KnpMstrId id, Double knpKeyid, Double knpTimeAvail,
			String knpProcessFunction, String knpProductionLine, String knpLoc,
			String knpPlannerId, String knpLevelMixSeq, String knpTaktTimeCalc,
			Integer knpEpeiDisp, Double knpChgOverAvail,
			Double knpCoPerInterval, Double knpCycleTime, Double knpMoveTime,
			Double knpEpeInterval, Double knpTaktTime, Double knpPitchInterval,
			Double knpPitchQuantity, String knpPitchUm, Date knpModDate,
			String knpModUserid, String knpUser1, String knpUser2,
			String knpQadc01, String knpQadc02, Double knpMinEpeInterval,
			Double knpResources, Double knpLoadLimit,
			Integer knpLeadTimeMethod, Integer knpCmtindx, Double oidKnpMstr) {
		super(id, knpKeyid, knpTimeAvail, knpProcessFunction,
				knpProductionLine, knpLoc, knpPlannerId, knpLevelMixSeq,
				knpTaktTimeCalc, knpEpeiDisp, knpChgOverAvail,
				knpCoPerInterval, knpCycleTime, knpMoveTime, knpEpeInterval,
				knpTaktTime, knpPitchInterval, knpPitchQuantity, knpPitchUm,
				knpModDate, knpModUserid, knpUser1, knpUser2, knpQadc01,
				knpQadc02, knpMinEpeInterval, knpResources, knpLoadLimit,
				knpLeadTimeMethod, knpCmtindx, oidKnpMstr);
	}

	/** full constructor */
	public KnpMstr(KnpMstrId id, String knpDesc, Double knpKeyid,
			Double knpTimeAvail, Double knpPctUptime,
			String knpProcessFunction, String knpProductionLine, String knpLoc,
			String knpPlannerId, String knpLevelMixSeq, String knpTaktTimeCalc,
			Integer knpEpeiDisp, Double knpChgOverAvail,
			Double knpCoPerInterval, Double knpCycleTime, Double knpMoveTime,
			Double knpEpeInterval, Double knpTaktTime, Double knpPitchInterval,
			Double knpPitchQuantity, String knpPitchUm, Date knpModDate,
			String knpModUserid, String knpUser1, String knpUser2,
			String knpQadc01, String knpQadc02, Double knpMinEpeInterval,
			Double knpResources, Double knpLoadLimit,
			Integer knpLeadTimeMethod, Integer knpCmtindx, Double oidKnpMstr) {
		super(id, knpDesc, knpKeyid, knpTimeAvail, knpPctUptime,
				knpProcessFunction, knpProductionLine, knpLoc, knpPlannerId,
				knpLevelMixSeq, knpTaktTimeCalc, knpEpeiDisp, knpChgOverAvail,
				knpCoPerInterval, knpCycleTime, knpMoveTime, knpEpeInterval,
				knpTaktTime, knpPitchInterval, knpPitchQuantity, knpPitchUm,
				knpModDate, knpModUserid, knpUser1, knpUser2, knpQadc01,
				knpQadc02, knpMinEpeInterval, knpResources, knpLoadLimit,
				knpLeadTimeMethod, knpCmtindx, oidKnpMstr);
	}

}
