package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SwcDet entity. @author MyEclipse Persistence Tools
 */
public class SwcDet extends AbstractSwcDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SwcDet() {
	}

	/** minimal constructor */
	public SwcDet(SwcDetId id, Double oidSwcDet) {
		super(id, oidSwcDet);
	}

	/** full constructor */
	public SwcDet(SwcDetId id, Double swcSetRate, Double swcRunRate,
			String swcCat, String swcUser1, String swcUser2, Double swcBdnPct,
			Double swcMchWkctr, Integer swcMchOp, Double swcMenMch,
			Double swcLbrRate, Double swcBdnRate, Double swcMchBdn,
			Double swcPctUtil, Double swcPctEff, Double swcSetupMen,
			Double swcSetupRte, Double swcBdnSurate, Double swcBdnSupct,
			Double swcMchSubdn, Date swcModDate, String swcUserid,
			String swcQadc01, Double oidSwcDet) {
		super(id, swcSetRate, swcRunRate, swcCat, swcUser1, swcUser2,
				swcBdnPct, swcMchWkctr, swcMchOp, swcMenMch, swcLbrRate,
				swcBdnRate, swcMchBdn, swcPctUtil, swcPctEff, swcSetupMen,
				swcSetupRte, swcBdnSurate, swcBdnSupct, swcMchSubdn,
				swcModDate, swcUserid, swcQadc01, oidSwcDet);
	}

}
