package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RscCtrl entity. @author MyEclipse Persistence Tools
 */
public class RscCtrl extends AbstractRscCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RscCtrl() {
	}

	/** minimal constructor */
	public RscCtrl(Double oidRscCtrl) {
		super(oidRscCtrl);
	}

	/** full constructor */
	public RscCtrl(Boolean rscActive, Boolean rscGenShip,
			Boolean rscAutoUpdate, Boolean rscZeroReq, Integer rscFirmDays,
			Integer rscShipDays, Integer rscShipWeeks, Integer rscShipMonths,
			Integer rscFabDays, Integer rscRawDays, String rscUser1,
			String rscUser2, String rscQadc01, String rscQadc02,
			Double rscQadd01, Double rscQadd02, Integer rscQadi01,
			Integer rscQadi02, Boolean rscQadl01, Boolean rscQadl02,
			Boolean rscQadl03, Boolean rscQadl04, Date rscQadt01,
			Integer rscQadi03, Double oidRscCtrl) {
		super(rscActive, rscGenShip, rscAutoUpdate, rscZeroReq, rscFirmDays,
				rscShipDays, rscShipWeeks, rscShipMonths, rscFabDays,
				rscRawDays, rscUser1, rscUser2, rscQadc01, rscQadc02,
				rscQadd01, rscQadd02, rscQadi01, rscQadi02, rscQadl01,
				rscQadl02, rscQadl03, rscQadl04, rscQadt01, rscQadi03,
				oidRscCtrl);
	}

}
