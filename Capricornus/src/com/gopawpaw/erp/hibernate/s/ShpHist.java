package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShpHist entity. @author MyEclipse Persistence Tools
 */
public class ShpHist extends AbstractShpHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShpHist() {
	}

	/** minimal constructor */
	public ShpHist(ShpHistId id, String shpNbr, Integer shpLine,
			String shpShipfrom, String shpPart, String shpCustPart,
			Double shpOpenQty, Double shpExtPrice, String shpCust,
			Double shpShipQty, Double shpShipPrice, String shpAbsId,
			Boolean shpInclude, Date shpModDate, String shpModUserid,
			String shpShipto, String shpShipTime, String shpRelId,
			Integer shpCmtindx, String shpOrderCategory,
			String shpCustomerSource, String shpShipUm, Double shpShipUmConv,
			String shpCurrency, String shpOrdUm, Double shpOrdUmConv,
			String shpSchedTime, String shpDoReq, String shpQadc01,
			String shpQadc02, String shpUser1, String shpUser2,
			Double shpQtyPct, Double oidShpHist) {
		super(id, shpNbr, shpLine, shpShipfrom, shpPart, shpCustPart,
				shpOpenQty, shpExtPrice, shpCust, shpShipQty, shpShipPrice,
				shpAbsId, shpInclude, shpModDate, shpModUserid, shpShipto,
				shpShipTime, shpRelId, shpCmtindx, shpOrderCategory,
				shpCustomerSource, shpShipUm, shpShipUmConv, shpCurrency,
				shpOrdUm, shpOrdUmConv, shpSchedTime, shpDoReq, shpQadc01,
				shpQadc02, shpUser1, shpUser2, shpQtyPct, oidShpHist);
	}

	/** full constructor */
	public ShpHist(ShpHistId id, String shpNbr, Integer shpLine,
			String shpShipfrom, String shpPart, String shpCustPart,
			Double shpOpenQty, Double shpExtPrice, Date shpDueDate,
			Date shpReqDate, Date shpPerfDate, Date shpShipDate,
			String shpCust, Double shpShipQty, Double shpShipPrice,
			String shpAbsId, Boolean shpInclude, Date shpModDate,
			String shpModUserid, String shpShipto, String shpShipTime,
			String shpRelId, Integer shpCmtindx, String shpOrderCategory,
			String shpCustomerSource, String shpShipUm, Double shpShipUmConv,
			String shpCurrency, String shpOrdUm, Double shpOrdUmConv,
			String shpSchedTime, String shpDoReq, String shpQadc01,
			String shpQadc02, String shpUser1, String shpUser2,
			Double shpQtyPct, Double oidShpHist) {
		super(id, shpNbr, shpLine, shpShipfrom, shpPart, shpCustPart,
				shpOpenQty, shpExtPrice, shpDueDate, shpReqDate, shpPerfDate,
				shpShipDate, shpCust, shpShipQty, shpShipPrice, shpAbsId,
				shpInclude, shpModDate, shpModUserid, shpShipto, shpShipTime,
				shpRelId, shpCmtindx, shpOrderCategory, shpCustomerSource,
				shpShipUm, shpShipUmConv, shpCurrency, shpOrdUm, shpOrdUmConv,
				shpSchedTime, shpDoReq, shpQadc01, shpQadc02, shpUser1,
				shpUser2, shpQtyPct, oidShpHist);
	}

}
