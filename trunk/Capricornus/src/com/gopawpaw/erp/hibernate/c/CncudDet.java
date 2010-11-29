package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CncudDet entity. @author MyEclipse Persistence Tools
 */
public class CncudDet extends AbstractCncudDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CncudDet() {
	}

	/** minimal constructor */
	public CncudDet(CncudDetId id, Double cncudUsageQty, String cncudUsageUm,
			Double cncudUsageUmConv, Integer cncudShipTrnbr,
			Boolean cncudSelfbill, Double cncudQtyShip, String cncudStockUm,
			Double cncudPrice, Double cncudShipValue, String cncudCurr,
			String cncudAsnShipper, Date cncudShipDate, String cncudCurrentLoc,
			String cncudCustDock, String cncudLineFeed, String cncudModUserid,
			Date cncudModDate, String cncudUser1, String cncudUser2,
			String cncudQadc01, String cncudQadc02,
			Boolean cncudIntConsignment, Double oidCncudDet) {
		super(id, cncudUsageQty, cncudUsageUm, cncudUsageUmConv,
				cncudShipTrnbr, cncudSelfbill, cncudQtyShip, cncudStockUm,
				cncudPrice, cncudShipValue, cncudCurr, cncudAsnShipper,
				cncudShipDate, cncudCurrentLoc, cncudCustDock, cncudLineFeed,
				cncudModUserid, cncudModDate, cncudUser1, cncudUser2,
				cncudQadc01, cncudQadc02, cncudIntConsignment, oidCncudDet);
	}

	/** full constructor */
	public CncudDet(CncudDetId id, Double cncudUsageQty, String cncudUsageUm,
			Double cncudUsageUmConv, Integer cncudShipTrnbr,
			Boolean cncudSelfbill, Double cncudQtyShip, String cncudStockUm,
			Double cncudPrice, Double cncudShipValue, String cncudCurr,
			String cncudAsnShipper, Date cncudShipDate, String cncudCurrentLoc,
			String cncudCustDock, String cncudLineFeed, Date cncudAgedDate,
			Date cncudOrigAgedDate, String cncudModUserid, Date cncudModDate,
			String cncudUser1, String cncudUser2, String cncudQadc01,
			String cncudQadc02, Boolean cncudIntConsignment, Double oidCncudDet) {
		super(id, cncudUsageQty, cncudUsageUm, cncudUsageUmConv,
				cncudShipTrnbr, cncudSelfbill, cncudQtyShip, cncudStockUm,
				cncudPrice, cncudShipValue, cncudCurr, cncudAsnShipper,
				cncudShipDate, cncudCurrentLoc, cncudCustDock, cncudLineFeed,
				cncudAgedDate, cncudOrigAgedDate, cncudModUserid, cncudModDate,
				cncudUser1, cncudUser2, cncudQadc01, cncudQadc02,
				cncudIntConsignment, oidCncudDet);
	}

}
