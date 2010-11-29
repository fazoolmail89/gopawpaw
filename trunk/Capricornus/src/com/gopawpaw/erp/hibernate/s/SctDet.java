package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SctDet entity. @author MyEclipse Persistence Tools
 */
public class SctDet extends AbstractSctDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SctDet() {
	}

	/** minimal constructor */
	public SctDet(SctDetId id, Double sctNrv, Boolean sctCostChanged,
			Double oidSctDet) {
		super(id, sctNrv, sctCostChanged, oidSctDet);
	}

	/** full constructor */
	public SctDet(SctDetId id, Double sctCstTot, Double sctMtlTl,
			Double sctLbrTl, Double sctBdnTl, Double sctOvhTl, Double sctSubTl,
			Double sctMtlLl, Double sctLbrLl, Double sctBdnLl, Double sctOvhLl,
			Double sctSubLl, Date sctCstDate, String sctUser1, String sctUser2,
			String sctSerial, Boolean sctRollup, String sctRollupId,
			Double sctNrv, String sctQadc01, Boolean sctCostChanged,
			Double oidSctDet) {
		super(id, sctCstTot, sctMtlTl, sctLbrTl, sctBdnTl, sctOvhTl, sctSubTl,
				sctMtlLl, sctLbrLl, sctBdnLl, sctOvhLl, sctSubLl, sctCstDate,
				sctUser1, sctUser2, sctSerial, sctRollup, sctRollupId, sctNrv,
				sctQadc01, sctCostChanged, oidSctDet);
	}

}
