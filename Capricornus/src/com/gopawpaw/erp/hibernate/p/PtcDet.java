package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PtcDet entity. @author MyEclipse Persistence Tools
 */
public class PtcDet extends AbstractPtcDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtcDet() {
	}

	/** minimal constructor */
	public PtcDet(PtcDetId id, Boolean ptcCharge, String ptcChargeType,
			String ptcContainerDesc, String ptcContainerType,
			String ptcContainerRef, String ptcModUserid, String ptcUserc01,
			String ptcUserc02, String ptcQadc01, String ptcQadc02,
			Double oidPtcDet) {
		super(id, ptcCharge, ptcChargeType, ptcContainerDesc, ptcContainerType,
				ptcContainerRef, ptcModUserid, ptcUserc01, ptcUserc02,
				ptcQadc01, ptcQadc02, oidPtcDet);
	}

	/** full constructor */
	public PtcDet(PtcDetId id, Boolean ptcCharge, String ptcChargeType,
			String ptcContainerDesc, String ptcContainerType,
			String ptcContainerRef, String ptcModUserid, Date ptcModDate,
			String ptcUserc01, String ptcUserc02, String ptcQadc01,
			String ptcQadc02, Double oidPtcDet) {
		super(id, ptcCharge, ptcChargeType, ptcContainerDesc, ptcContainerType,
				ptcContainerRef, ptcModUserid, ptcModDate, ptcUserc01,
				ptcUserc02, ptcQadc01, ptcQadc02, oidPtcDet);
	}

}
