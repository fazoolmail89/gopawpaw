package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RcsdDet entity. @author MyEclipse Persistence Tools
 */
public class RcsdDet extends AbstractRcsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RcsdDet() {
	}

	/** minimal constructor */
	public RcsdDet(RcsdDetId id, String rcsdModelyr, String rcsdCustref,
			Double oidRcsdDet) {
		super(id, rcsdModelyr, rcsdCustref, oidRcsdDet);
	}

	/** full constructor */
	public RcsdDet(RcsdDetId id, String rcsdCustPart, Double rcsdDiscrQty,
			Double rcsdCumQty, String rcsdOrder, Integer rcsdLine,
			String rcsdStatus, Date rcsdCustBuildDate,
			String rcsdDerivedRlseId, String rcsdCustPo, Boolean rcsdPicked,
			Boolean rcsdXReferenced, Boolean rcsdDeleted, String rcsdModUserid,
			Date rcsdModDate, String rcsdModPgm, String rcsdUser1,
			String rcsdUser2, String rcsdQadc01, String rcsdQadc02,
			Double rcsdQadd01, Double rcsdQadd02, Integer rcsdQadi01,
			Integer rcsdQadi02, Boolean rcsdQadl01, Boolean rcsdQadl02,
			Date rcsdQadt01, Date rcsdQadt02, String rcsdModelyr,
			String rcsdCustref, Double oidRcsdDet) {
		super(id, rcsdCustPart, rcsdDiscrQty, rcsdCumQty, rcsdOrder, rcsdLine,
				rcsdStatus, rcsdCustBuildDate, rcsdDerivedRlseId, rcsdCustPo,
				rcsdPicked, rcsdXReferenced, rcsdDeleted, rcsdModUserid,
				rcsdModDate, rcsdModPgm, rcsdUser1, rcsdUser2, rcsdQadc01,
				rcsdQadc02, rcsdQadd01, rcsdQadd02, rcsdQadi01, rcsdQadi02,
				rcsdQadl01, rcsdQadl02, rcsdQadt01, rcsdQadt02, rcsdModelyr,
				rcsdCustref, oidRcsdDet);
	}

}
