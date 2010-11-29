package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CnsudDet entity. @author MyEclipse Persistence Tools
 */
public class CnsudDet extends AbstractCnsudDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CnsudDet() {
	}

	/** minimal constructor */
	public CnsudDet(CnsudDetId id, Double cnsudQtyUsed,
			Integer cnsudReceiptTrnbr, String cnsudReceiver,
			String cnsudAsnShipper, String cnsudModUserid, Date cnsudModDate,
			String cnsudUser1, String cnsudUser2, String cnsudQadc01,
			String cnsudQadc02, Boolean cnsudIntConsignment, Double oidCnsudDet) {
		super(id, cnsudQtyUsed, cnsudReceiptTrnbr, cnsudReceiver,
				cnsudAsnShipper, cnsudModUserid, cnsudModDate, cnsudUser1,
				cnsudUser2, cnsudQadc01, cnsudQadc02, cnsudIntConsignment,
				oidCnsudDet);
	}

	/** full constructor */
	public CnsudDet(CnsudDetId id, Double cnsudQtyUsed,
			Integer cnsudReceiptTrnbr, String cnsudReceiver,
			String cnsudAsnShipper, Date cnsudAgedDate, Date cnsudOrigAgedDate,
			String cnsudModUserid, Date cnsudModDate, String cnsudUser1,
			String cnsudUser2, String cnsudQadc01, String cnsudQadc02,
			Boolean cnsudIntConsignment, Double oidCnsudDet) {
		super(id, cnsudQtyUsed, cnsudReceiptTrnbr, cnsudReceiver,
				cnsudAsnShipper, cnsudAgedDate, cnsudOrigAgedDate,
				cnsudModUserid, cnsudModDate, cnsudUser1, cnsudUser2,
				cnsudQadc01, cnsudQadc02, cnsudIntConsignment, oidCnsudDet);
	}

}
