package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VefCtrl entity. @author MyEclipse Persistence Tools
 */
public class VefCtrl extends AbstractVefCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VefCtrl() {
	}

	/** minimal constructor */
	public VefCtrl(Integer vefQadi03, Double oidVefCtrl) {
		super(vefQadi03, oidVefCtrl);
	}

	/** full constructor */
	public VefCtrl(Integer vefQadi03, String vefAsnLeadtime,
			Integer vefDaysEarly, Integer vefDaysLate, Boolean vefUseShippct,
			Double vefOvershipPct, Double vefUndershipPct,
			Boolean vefUseShipqty, Integer vefOvershipQty,
			Integer vefUndershipQty, Boolean vefUseShippctCost,
			Double vefOvershipPctCost, Boolean vefUseShipqtyCost,
			Double vefOvershipQtyCost, Double vefPoints, Integer vefPpFactor,
			Boolean vefPpCounter, String vefFirstLevelTitle,
			String vefSecondLevelTitle, String vefThirdLevelTitle,
			String vefFourthLevelTitle, String vefFifthLevelTitle,
			Integer vefFirstLevelMax, Integer vefSecondLevelMax,
			Integer vefThirdLevelMax, Integer vefFourthLevelMax,
			Integer vefFifthLevelMax, String vefEarlyRcpt, String vefLateRcpt,
			String vefOverShip, String vefUnderShip, String vefMissedShip,
			String vefDupAsn, String vefLateAsn, String vefAsnData,
			String vefPoReceipts, String vefDoReceipts, String vefRtsReceipts,
			String vefMatlQuality, Boolean vefUsingSupPerf,
			Boolean vefEnablePoRtn, Boolean vefEnableInvXfer,
			Boolean vefSameDayReceipts, Date vefMissShipAsOfDate,
			Date vefMissShipRunDate, Boolean vefPoOnlyFlag,
			Boolean vefDoOnlyFlag, String vefModUserid, Date vefModDate,
			String vefUser1, String vefUser2, String vefUser3, String vefUser4,
			String vefQadc01, String vefQadc02, String vefQadc03,
			String vefQadc04, Double vefQadd01, Double vefQadd02,
			Boolean vefQadl01, Boolean vefQadl02, Date vefQadt01,
			Date vefQadt02, Integer vefQadi01, Integer vefQadi02,
			Double oidVefCtrl) {
		super(vefQadi03, vefAsnLeadtime, vefDaysEarly, vefDaysLate,
				vefUseShippct, vefOvershipPct, vefUndershipPct, vefUseShipqty,
				vefOvershipQty, vefUndershipQty, vefUseShippctCost,
				vefOvershipPctCost, vefUseShipqtyCost, vefOvershipQtyCost,
				vefPoints, vefPpFactor, vefPpCounter, vefFirstLevelTitle,
				vefSecondLevelTitle, vefThirdLevelTitle, vefFourthLevelTitle,
				vefFifthLevelTitle, vefFirstLevelMax, vefSecondLevelMax,
				vefThirdLevelMax, vefFourthLevelMax, vefFifthLevelMax,
				vefEarlyRcpt, vefLateRcpt, vefOverShip, vefUnderShip,
				vefMissedShip, vefDupAsn, vefLateAsn, vefAsnData,
				vefPoReceipts, vefDoReceipts, vefRtsReceipts, vefMatlQuality,
				vefUsingSupPerf, vefEnablePoRtn, vefEnableInvXfer,
				vefSameDayReceipts, vefMissShipAsOfDate, vefMissShipRunDate,
				vefPoOnlyFlag, vefDoOnlyFlag, vefModUserid, vefModDate,
				vefUser1, vefUser2, vefUser3, vefUser4, vefQadc01, vefQadc02,
				vefQadc03, vefQadc04, vefQadd01, vefQadd02, vefQadl01,
				vefQadl02, vefQadt01, vefQadt02, vefQadi01, vefQadi02,
				oidVefCtrl);
	}

}
