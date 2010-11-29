package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BdpDet entity. @author MyEclipse Persistence Tools
 */
public class BdpDet extends AbstractBdpDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BdpDet() {
	}

	/** minimal constructor */
	public BdpDet(BdpDetId id, String bdpCharacter, Double bdpDecimal,
			Integer bdpInteger, Boolean bdpLogical, String bdpUser1,
			String bdpUser2, String bdpQadc01, String bdpQadc02,
			Double bdpQadd01, Integer bdpQadi01, Boolean bdpQadl01,
			Boolean bdpSplit, Double bdpUserd01, Integer bdpUseri01,
			Boolean bdpUserl01, Date bdpModDate, String bdpModUserid,
			Double oidBdpDet) {
		super(id, bdpCharacter, bdpDecimal, bdpInteger, bdpLogical, bdpUser1,
				bdpUser2, bdpQadc01, bdpQadc02, bdpQadd01, bdpQadi01,
				bdpQadl01, bdpSplit, bdpUserd01, bdpUseri01, bdpUserl01,
				bdpModDate, bdpModUserid, oidBdpDet);
	}

	/** full constructor */
	public BdpDet(BdpDetId id, String bdpCharacter, Date bdpDate,
			Double bdpDecimal, Integer bdpInteger, Boolean bdpLogical,
			String bdpUser1, String bdpUser2, String bdpQadc01,
			String bdpQadc02, Double bdpQadd01, Integer bdpQadi01,
			Boolean bdpQadl01, Date bdpQadt01, Boolean bdpSplit,
			Double bdpUserd01, Integer bdpUseri01, Boolean bdpUserl01,
			Date bdpUsert01, Date bdpModDate, String bdpModUserid,
			Double oidBdpDet) {
		super(id, bdpCharacter, bdpDate, bdpDecimal, bdpInteger, bdpLogical,
				bdpUser1, bdpUser2, bdpQadc01, bdpQadc02, bdpQadd01, bdpQadi01,
				bdpQadl01, bdpQadt01, bdpSplit, bdpUserd01, bdpUseri01,
				bdpUserl01, bdpUsert01, bdpModDate, bdpModUserid, oidBdpDet);
	}

}
