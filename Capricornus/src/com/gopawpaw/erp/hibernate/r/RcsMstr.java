package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RcsMstr entity. @author MyEclipse Persistence Tools
 */
public class RcsMstr extends AbstractRcsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RcsMstr() {
	}

	/** minimal constructor */
	public RcsMstr(RcsMstrId id, Double oidRcsMstr) {
		super(id, oidRcsMstr);
	}

	/** full constructor */
	public RcsMstr(RcsMstrId id, Date rcsCrDate, String rcsCrTime,
			Boolean rcsCumulative, Boolean rcsDateType, Date rcsActiveStart,
			Date rcsActiveEnd, Boolean rcsActive, Date rcsActiveDate,
			Boolean rcsPackingOrder, Integer rcsSeqPerContainer,
			Boolean rcsCheckSeqTol, Integer rcsMaxTol, String rcsModUserid,
			Date rcsModDate, String rcsModPgm, String rcsUser1,
			String rcsUser2, String rcsQadc01, String rcsQadc02,
			Double rcsQadd01, Double rcsQadd02, Integer rcsQadi01,
			Integer rcsQadi02, Boolean rcsQadl01, Boolean rcsQadl02,
			Date rcsQadt01, Date rcsQadt02, Double oidRcsMstr) {
		super(id, rcsCrDate, rcsCrTime, rcsCumulative, rcsDateType,
				rcsActiveStart, rcsActiveEnd, rcsActive, rcsActiveDate,
				rcsPackingOrder, rcsSeqPerContainer, rcsCheckSeqTol, rcsMaxTol,
				rcsModUserid, rcsModDate, rcsModPgm, rcsUser1, rcsUser2,
				rcsQadc01, rcsQadc02, rcsQadd01, rcsQadd02, rcsQadi01,
				rcsQadi02, rcsQadl01, rcsQadl02, rcsQadt01, rcsQadt02,
				oidRcsMstr);
	}

}
