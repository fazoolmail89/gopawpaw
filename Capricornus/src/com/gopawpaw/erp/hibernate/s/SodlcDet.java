package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SodlcDet entity. @author MyEclipse Persistence Tools
 */
public class SodlcDet extends AbstractSodlcDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SodlcDet() {
	}

	/** minimal constructor */
	public SodlcDet(SodlcDetId id, String sodlcTrlCode, Double sodlcLcAmt,
			String sodlcChargeType, String sodlcRef, Boolean sodlcOneTime,
			Integer sodlcTimesCharged, String sodlcOwnedBy,
			String sodlcAbsShipfrom, Double sodlcExtPrice, String sodlcAcct,
			String sodlcCc, Boolean sodlcTaxable, String sodlcTaxc,
			String sodlcSub, String sodlcProject, String sodlcModUserid,
			String sodlcUserc01, String sodlcUserc02, String sodlcQadc01,
			String sodlcQadc02, Double oidSodlcDet) {
		super(id, sodlcTrlCode, sodlcLcAmt, sodlcChargeType, sodlcRef,
				sodlcOneTime, sodlcTimesCharged, sodlcOwnedBy,
				sodlcAbsShipfrom, sodlcExtPrice, sodlcAcct, sodlcCc,
				sodlcTaxable, sodlcTaxc, sodlcSub, sodlcProject,
				sodlcModUserid, sodlcUserc01, sodlcUserc02, sodlcQadc01,
				sodlcQadc02, oidSodlcDet);
	}

	/** full constructor */
	public SodlcDet(SodlcDetId id, String sodlcTrlCode, Double sodlcLcAmt,
			String sodlcChargeType, String sodlcRef, Boolean sodlcOneTime,
			Integer sodlcTimesCharged, String sodlcOwnedBy,
			String sodlcAbsShipfrom, Double sodlcExtPrice, String sodlcAcct,
			String sodlcCc, Boolean sodlcTaxable, String sodlcTaxc,
			String sodlcSub, String sodlcProject, String sodlcModUserid,
			Date sodlcModDate, String sodlcUserc01, String sodlcUserc02,
			String sodlcQadc01, String sodlcQadc02, Double oidSodlcDet) {
		super(id, sodlcTrlCode, sodlcLcAmt, sodlcChargeType, sodlcRef,
				sodlcOneTime, sodlcTimesCharged, sodlcOwnedBy,
				sodlcAbsShipfrom, sodlcExtPrice, sodlcAcct, sodlcCc,
				sodlcTaxable, sodlcTaxc, sodlcSub, sodlcProject,
				sodlcModUserid, sodlcModDate, sodlcUserc01, sodlcUserc02,
				sodlcQadc01, sodlcQadc02, oidSodlcDet);
	}

}
