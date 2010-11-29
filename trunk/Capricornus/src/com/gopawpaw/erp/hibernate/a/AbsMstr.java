package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbsMstr entity. @author MyEclipse Persistence Tools
 */
public class AbsMstr extends AbstractAbsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsMstr() {
	}

	/** minimal constructor */
	public AbsMstr(AbsMstrId id, String absInvMov, String absNrId,
			String absFormat, String absConsShip, String absLang,
			Boolean absCanceled, Integer absTrlCmtindx, String absDesc,
			String absMasterShipfrom, Double oidAbsMstr) {
		super(id, absInvMov, absNrId, absFormat, absConsShip, absLang,
				absCanceled, absTrlCmtindx, absDesc, absMasterShipfrom,
				oidAbsMstr);
	}

	/** full constructor */
	public AbsMstr(AbsMstrId id, String absParId, String absShipto,
			String absType, String absStatus, String absTimezone,
			Date absShpDate, Integer absShpTime, Date absArrDate,
			Integer absArrTime, Date absCrtDate, Integer absCrtTime,
			Date absAprDate, Integer absAprTime, String absAprUserid,
			Double absGwt, Double absNwt, Double absVol, String absWtUm,
			String absVolUm, String absDimUm, String absFrClass,
			Double absEstFcst, Double absActFcst, String absFrCurr,
			String absDocData, String absDataset, String absOrder,
			String absLine, String absInvNbr, String absItem, String absLotser,
			String absRef, Double absQty, Double absShipQty, Double absCumQty,
			String absSite, String absLoc, String absCustRef,
			Integer absCmtindx, String absChr01, String absChr02,
			String absChr03, String absChr04, String absChr05, String absChr06,
			String absChr07, String absChr08, String absChr09, String absChr10,
			Double absDec01, Double absDec02, Double absDec03, Double absDec04,
			Double absDec05, Double absDec06, Double absDec07, Double absDec08,
			Double absDec09, Double absDec10, String absQad01, String absQad02,
			String absQad03, String absQad04, String absQad05, String absQad06,
			String absQad07, String absQad08, String absQad09, String absQad10,
			String absUser1, String absUser2, String absMasterId,
			String absInvMov, String absNrId, String absFormat,
			String absConsShip, String absQadc01, String absLang,
			Boolean absCanceled, Double absQadd01, Integer absTrlCmtindx,
			Date absEffDate, Date absCancelDate, String absPreshipNrId,
			String absPreshipId, String absFaLot, Date absAsnCrtDate,
			Integer absAsnCrtTime, Integer absExportBatch, Date absExportDate,
			Integer absExportTime, String absChargeType, Double absPrice,
			String absDesc, String absMasterShipfrom, Double oidAbsMstr) {
		super(id, absParId, absShipto, absType, absStatus, absTimezone,
				absShpDate, absShpTime, absArrDate, absArrTime, absCrtDate,
				absCrtTime, absAprDate, absAprTime, absAprUserid, absGwt,
				absNwt, absVol, absWtUm, absVolUm, absDimUm, absFrClass,
				absEstFcst, absActFcst, absFrCurr, absDocData, absDataset,
				absOrder, absLine, absInvNbr, absItem, absLotser, absRef,
				absQty, absShipQty, absCumQty, absSite, absLoc, absCustRef,
				absCmtindx, absChr01, absChr02, absChr03, absChr04, absChr05,
				absChr06, absChr07, absChr08, absChr09, absChr10, absDec01,
				absDec02, absDec03, absDec04, absDec05, absDec06, absDec07,
				absDec08, absDec09, absDec10, absQad01, absQad02, absQad03,
				absQad04, absQad05, absQad06, absQad07, absQad08, absQad09,
				absQad10, absUser1, absUser2, absMasterId, absInvMov, absNrId,
				absFormat, absConsShip, absQadc01, absLang, absCanceled,
				absQadd01, absTrlCmtindx, absEffDate, absCancelDate,
				absPreshipNrId, absPreshipId, absFaLot, absAsnCrtDate,
				absAsnCrtTime, absExportBatch, absExportDate, absExportTime,
				absChargeType, absPrice, absDesc, absMasterShipfrom, oidAbsMstr);
	}

}
