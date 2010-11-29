package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * InsdDet entity. @author MyEclipse Persistence Tools
 */
public class InsdDet extends AbstractInsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public InsdDet() {
	}

	/** minimal constructor */
	public InsdDet(InsdDetId id, Double insdQtyInv, Double insdPrice,
			Double insdListPr, Date insdModDate, String insdModUserid,
			Double oidInsdDet) {
		super(id, insdQtyInv, insdPrice, insdListPr, insdModDate,
				insdModUserid, oidInsdDet);
	}

	/** full constructor */
	public InsdDet(InsdDetId id, Date insdSchedDate, Double insdQtyInv,
			Double insdPrice, Double insdListPr, Date insdModDate,
			String insdModUserid, String insdUser1, String insdUser2,
			String insdQadc01, Double insdQadd01, Integer insdQadi01,
			Boolean insdQadl01, Date insdQadt01, Double oidInsdDet) {
		super(id, insdSchedDate, insdQtyInv, insdPrice, insdListPr,
				insdModDate, insdModUserid, insdUser1, insdUser2, insdQadc01,
				insdQadd01, insdQadi01, insdQadl01, insdQadt01, oidInsdDet);
	}

}
