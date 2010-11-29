package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VepdDet entity. @author MyEclipse Persistence Tools
 */
public class VepdDet extends AbstractVepdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VepdDet() {
	}

	/** minimal constructor */
	public VepdDet(VepdDetId id, Double oidVepdDet) {
		super(id, oidVepdDet);
	}

	/** full constructor */
	public VepdDet(VepdDetId id, String vepdCategory, Date vepdVepTranDate,
			Integer vepdVepTranId, Integer vepdSeqNbr, String vepdEvent,
			String vepdWeightCode, Integer vepdCmtindx, Double vepdEventQty,
			String vepdReasonCode, String vepdDocNbr,
			Boolean vepdTempMissedFlag, String vepdModUserid, Date vepdModDate,
			String vepdUser1, String vepdUser2, String vepdUser3,
			String vepdUser4, String vepdQadc01, String vepdQadc02,
			String vepdQadc03, String vepdQadc04, Double vepdQadd01,
			Double vepdQadd02, Boolean vepdQadl01, Boolean vepdQadl02,
			Date vepdQadt01, Date vepdQadt02, Integer vepdQadi01,
			Integer vepdQadi02, Double oidVepdDet) {
		super(id, vepdCategory, vepdVepTranDate, vepdVepTranId, vepdSeqNbr,
				vepdEvent, vepdWeightCode, vepdCmtindx, vepdEventQty,
				vepdReasonCode, vepdDocNbr, vepdTempMissedFlag, vepdModUserid,
				vepdModDate, vepdUser1, vepdUser2, vepdUser3, vepdUser4,
				vepdQadc01, vepdQadc02, vepdQadc03, vepdQadc04, vepdQadd01,
				vepdQadd02, vepdQadl01, vepdQadl02, vepdQadt01, vepdQadt02,
				vepdQadi01, vepdQadi02, oidVepdDet);
	}

}
