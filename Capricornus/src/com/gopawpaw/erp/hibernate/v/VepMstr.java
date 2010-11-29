package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VepMstr entity. @author MyEclipse Persistence Tools
 */
public class VepMstr extends AbstractVepMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VepMstr() {
	}

	/** minimal constructor */
	public VepMstr(VepMstrId id, Double oidVepMstr) {
		super(id, oidVepMstr);
	}

	/** full constructor */
	public VepMstr(VepMstrId id, String vepOrderSource, String vepNbr,
			String vepReqNbr, Integer vepLine, String vepReceiver,
			String vepAbsId, String vepPart, String vepUm, String vepCommCode,
			String vepAcct, String vepCc, String vepBuyer, Date vepPerDate,
			String vepLotser, String vepType, String vepRcpType,
			String vepFsmType, Double vepPurCost, Double vepDiscPct,
			Date vepRcpDate, Integer vepRcpTime, Double vepQtyOrd,
			Double vepOpenQty, Double vepRcvdQty, String vepLoc, String vepRef,
			Date vepAsnArrDate, Integer vepAsnArrTime, Date vepAsnShipDate,
			Integer vepAsnShipTime, Double vepAsnShipQty,
			Date vepAsnCreateDate, Integer vepAsnCreateTime,
			Boolean vepTempMissedFlag, Boolean vepPodSched, String vepDb,
			String vepSubType, String vepModUserid, Date vepModDate,
			String vepUser1, String vepUser2, String vepUser3, String vepUser4,
			String vepQadc01, String vepQadc02, String vepQadc03,
			String vepQadc04, Double vepQadd01, Double vepQadd02,
			Boolean vepQadl01, Boolean vepQadl02, Date vepQadt01,
			Date vepQadt02, Integer vepQadi01, Integer vepQadi02,
			String vepSub, Double oidVepMstr) {
		super(id, vepOrderSource, vepNbr, vepReqNbr, vepLine, vepReceiver,
				vepAbsId, vepPart, vepUm, vepCommCode, vepAcct, vepCc,
				vepBuyer, vepPerDate, vepLotser, vepType, vepRcpType,
				vepFsmType, vepPurCost, vepDiscPct, vepRcpDate, vepRcpTime,
				vepQtyOrd, vepOpenQty, vepRcvdQty, vepLoc, vepRef,
				vepAsnArrDate, vepAsnArrTime, vepAsnShipDate, vepAsnShipTime,
				vepAsnShipQty, vepAsnCreateDate, vepAsnCreateTime,
				vepTempMissedFlag, vepPodSched, vepDb, vepSubType,
				vepModUserid, vepModDate, vepUser1, vepUser2, vepUser3,
				vepUser4, vepQadc01, vepQadc02, vepQadc03, vepQadc04,
				vepQadd01, vepQadd02, vepQadl01, vepQadl02, vepQadt01,
				vepQadt02, vepQadi01, vepQadi02, vepSub, oidVepMstr);
	}

}
