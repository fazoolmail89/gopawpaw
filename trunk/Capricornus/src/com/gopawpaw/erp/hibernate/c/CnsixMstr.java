package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CnsixMstr entity. @author MyEclipse Persistence Tools
 */
public class CnsixMstr extends AbstractCnsixMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CnsixMstr() {
	}

	/** minimal constructor */
	public CnsixMstr(CnsixMstrId id, Integer cnsixReceiptTrnbr,
			String cnsixReceiver, String cnsixPoNbr, Integer cnsixPodLine,
			String cnsixSite, String cnsixPart, String cnsixAsnShipper,
			Double cnsixQtyConsigned, String cnsixLotser, String cnsixRef,
			String cnsixModUserid, Date cnsixModDate, String cnsixUser1,
			String cnsixUser2, String cnsixQadc01, String cnsixQadc02,
			Boolean cnsixIntConsignment, Double oidCnsixMstr) {
		super(id, cnsixReceiptTrnbr, cnsixReceiver, cnsixPoNbr, cnsixPodLine,
				cnsixSite, cnsixPart, cnsixAsnShipper, cnsixQtyConsigned,
				cnsixLotser, cnsixRef, cnsixModUserid, cnsixModDate,
				cnsixUser1, cnsixUser2, cnsixQadc01, cnsixQadc02,
				cnsixIntConsignment, oidCnsixMstr);
	}

	/** full constructor */
	public CnsixMstr(CnsixMstrId id, Integer cnsixReceiptTrnbr,
			String cnsixReceiver, String cnsixPoNbr, Integer cnsixPodLine,
			String cnsixSite, String cnsixPart, String cnsixAsnShipper,
			Double cnsixQtyConsigned, String cnsixLotser, String cnsixRef,
			Date cnsixAgedDate, Date cnsixOrigAgedDate, String cnsixModUserid,
			Date cnsixModDate, String cnsixUser1, String cnsixUser2,
			String cnsixQadc01, String cnsixQadc02,
			Boolean cnsixIntConsignment, Double oidCnsixMstr) {
		super(id, cnsixReceiptTrnbr, cnsixReceiver, cnsixPoNbr, cnsixPodLine,
				cnsixSite, cnsixPart, cnsixAsnShipper, cnsixQtyConsigned,
				cnsixLotser, cnsixRef, cnsixAgedDate, cnsixOrigAgedDate,
				cnsixModUserid, cnsixModDate, cnsixUser1, cnsixUser2,
				cnsixQadc01, cnsixQadc02, cnsixIntConsignment, oidCnsixMstr);
	}

}
