package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RcsxRef entity. @author MyEclipse Persistence Tools
 */
public class RcsxRef extends AbstractRcsxRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RcsxRef() {
	}

	/** minimal constructor */
	public RcsxRef(RcsxRefId id, Double oidRcsxRef) {
		super(id, oidRcsxRef);
	}

	/** full constructor */
	public RcsxRef(RcsxRefId id, Boolean rcsxPicked, Boolean rcsxShipped,
			String rcsxRlseId, String rcsxCustJob, String rcsxCustSeq,
			String rcsxPart, Date rcsxDate, String rcsxTime,
			String rcsxCustRef, String rcsxDock, String rcsxLineFeed,
			String rcsxModUserid, Date rcsxModDate, String rcsxModPgm,
			String rcsxUser1, String rcsxUser2, String rcsxQadc01,
			String rcsxQadc02, Double rcsxQadd01, Double rcsxQadd02,
			Integer rcsxQadi01, Integer rcsxQadi02, Boolean rcsxQadl01,
			Boolean rcsxQadl02, Date rcsxQadt01, Date rcsxQadt02,
			Double oidRcsxRef) {
		super(id, rcsxPicked, rcsxShipped, rcsxRlseId, rcsxCustJob,
				rcsxCustSeq, rcsxPart, rcsxDate, rcsxTime, rcsxCustRef,
				rcsxDock, rcsxLineFeed, rcsxModUserid, rcsxModDate, rcsxModPgm,
				rcsxUser1, rcsxUser2, rcsxQadc01, rcsxQadc02, rcsxQadd01,
				rcsxQadd02, rcsxQadi01, rcsxQadi02, rcsxQadl01, rcsxQadl02,
				rcsxQadt01, rcsxQadt02, oidRcsxRef);
	}

}
