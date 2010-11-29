package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SchdDet entity. @author MyEclipse Persistence Tools
 */
public class SchdDet extends AbstractSchdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SchdDet() {
	}

	/** minimal constructor */
	public SchdDet(SchdDetId id, String schdReferenceType, Double oidSchdDet) {
		super(id, schdReferenceType, oidSchdDet);
	}

	/** full constructor */
	public SchdDet(SchdDetId id, Double schdUpdQty, Double schdDiscrQty,
			String schdFcQual, Double schdCumQty, Integer schdCmtindx,
			String schdChr01, String schdChr02, String schdChr03,
			String schdChr04, String schdChr05, String schdChr06,
			String schdChr07, String schdChr08, String schdChr09,
			String schdChr10, Double schdDec01, Double schdDec02,
			Double schdDec03, Double schdDec04, Double schdDec05,
			Double schdDec06, Double schdDec07, Double schdDec08,
			Double schdDec09, Double schdDec10, Date schdDte01, Date schdDte02,
			Boolean schdLog01, Boolean schdLog02, String schdUser1,
			String schdUser2, Double schdShipQty, Double schdAllQty,
			Date schdPerDate, String schdReferenceType, Double oidSchdDet) {
		super(id, schdUpdQty, schdDiscrQty, schdFcQual, schdCumQty,
				schdCmtindx, schdChr01, schdChr02, schdChr03, schdChr04,
				schdChr05, schdChr06, schdChr07, schdChr08, schdChr09,
				schdChr10, schdDec01, schdDec02, schdDec03, schdDec04,
				schdDec05, schdDec06, schdDec07, schdDec08, schdDec09,
				schdDec10, schdDte01, schdDte02, schdLog01, schdLog02,
				schdUser1, schdUser2, schdShipQty, schdAllQty, schdPerDate,
				schdReferenceType, oidSchdDet);
	}

}
