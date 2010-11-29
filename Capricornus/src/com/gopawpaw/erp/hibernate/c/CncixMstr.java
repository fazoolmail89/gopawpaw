package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CncixMstr entity. @author MyEclipse Persistence Tools
 */
public class CncixMstr extends AbstractCncixMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CncixMstr() {
	}

	/** minimal constructor */
	public CncixMstr(CncixMstrId id, Integer cncixShipTrnbr,
			Boolean cncixSelfbill, String cncixSoNbr, Integer cncixSodLine,
			String cncixSite, String cncixShipto, String cncixCust,
			String cncixPart, String cncixCustpart, Double cncixQtyShip,
			String cncixStockUm, Double cncixPrice, Double cncixShipValue,
			String cncixCurr, String cncixAsnShipper, String cncixAuth,
			String cncixPo, Date cncixShipDate, Double cncixQtyStock,
			String cncixCurrentLoc, String cncixLotser, String cncixRef,
			String cncixCustJob, String cncixCustSeq, String cncixCustRef,
			String cncixCustDock, String cncixLineFeed, String cncixModelyr,
			Boolean cncixIntransit, String cncixModUserid, Date cncixModDate,
			String cncixUser1, String cncixUser2, String cncixQadc01,
			String cncixQadc02, Boolean cncixIntConsignment, Double oidCncixMstr) {
		super(id, cncixShipTrnbr, cncixSelfbill, cncixSoNbr, cncixSodLine,
				cncixSite, cncixShipto, cncixCust, cncixPart, cncixCustpart,
				cncixQtyShip, cncixStockUm, cncixPrice, cncixShipValue,
				cncixCurr, cncixAsnShipper, cncixAuth, cncixPo, cncixShipDate,
				cncixQtyStock, cncixCurrentLoc, cncixLotser, cncixRef,
				cncixCustJob, cncixCustSeq, cncixCustRef, cncixCustDock,
				cncixLineFeed, cncixModelyr, cncixIntransit, cncixModUserid,
				cncixModDate, cncixUser1, cncixUser2, cncixQadc01, cncixQadc02,
				cncixIntConsignment, oidCncixMstr);
	}

	/** full constructor */
	public CncixMstr(CncixMstrId id, Integer cncixShipTrnbr,
			Boolean cncixSelfbill, String cncixSoNbr, Integer cncixSodLine,
			String cncixSite, String cncixShipto, String cncixCust,
			String cncixPart, String cncixCustpart, Double cncixQtyShip,
			String cncixStockUm, Double cncixPrice, Double cncixShipValue,
			String cncixCurr, String cncixAsnShipper, String cncixAuth,
			String cncixPo, Date cncixShipDate, Double cncixQtyStock,
			String cncixCurrentLoc, String cncixLotser, String cncixRef,
			String cncixCustJob, String cncixCustSeq, String cncixCustRef,
			String cncixCustDock, String cncixLineFeed, String cncixModelyr,
			Date cncixAgedDate, Date cncixOrigAgedDate, Boolean cncixIntransit,
			String cncixModUserid, Date cncixModDate, String cncixUser1,
			String cncixUser2, String cncixQadc01, String cncixQadc02,
			Boolean cncixIntConsignment, Double oidCncixMstr) {
		super(id, cncixShipTrnbr, cncixSelfbill, cncixSoNbr, cncixSodLine,
				cncixSite, cncixShipto, cncixCust, cncixPart, cncixCustpart,
				cncixQtyShip, cncixStockUm, cncixPrice, cncixShipValue,
				cncixCurr, cncixAsnShipper, cncixAuth, cncixPo, cncixShipDate,
				cncixQtyStock, cncixCurrentLoc, cncixLotser, cncixRef,
				cncixCustJob, cncixCustSeq, cncixCustRef, cncixCustDock,
				cncixLineFeed, cncixModelyr, cncixAgedDate, cncixOrigAgedDate,
				cncixIntransit, cncixModUserid, cncixModDate, cncixUser1,
				cncixUser2, cncixQadc01, cncixQadc02, cncixIntConsignment,
				oidCncixMstr);
	}

}
