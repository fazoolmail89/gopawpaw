package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PliMstr entity. @author MyEclipse Persistence Tools
 */
public class PliMstr extends AbstractPliMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PliMstr() {
	}

	/** minimal constructor */
	public PliMstr(PliMstrId id, String pliInternalRefType,
			String pliInternalRef, String pliSupplier, String pliInvoice,
			Double pliInvoiceAmt, String pliCurr, Date pliInvoiceDate,
			String pliVoRef, Double pliExRate, Double pliExRate2,
			String pliExRatetype, Integer pliExruSeq, Boolean pliTaxable,
			String pliTaxc, String pliTaxEnv, Boolean pliTaxIn,
			String pliTaxUsage, Date pliModDate, String pliModUserid,
			String pliUser1, String pliUser2, String pliQadc01,
			String pliQadc02, Double oidPliMstr) {
		super(id, pliInternalRefType, pliInternalRef, pliSupplier, pliInvoice,
				pliInvoiceAmt, pliCurr, pliInvoiceDate, pliVoRef, pliExRate,
				pliExRate2, pliExRatetype, pliExruSeq, pliTaxable, pliTaxc,
				pliTaxEnv, pliTaxIn, pliTaxUsage, pliModDate, pliModUserid,
				pliUser1, pliUser2, pliQadc01, pliQadc02, oidPliMstr);
	}

	/** full constructor */
	public PliMstr(PliMstrId id, String pliInternalRefType,
			String pliInternalRef, String pliSupplier, String pliInvoice,
			Double pliInvoiceAmt, String pliCurr, Date pliInvoiceDate,
			String pliVoRef, Double pliExRate, Double pliExRate2,
			String pliExRatetype, Integer pliExruSeq, Boolean pliTaxable,
			String pliTaxc, String pliTaxEnv, Boolean pliTaxIn,
			String pliTaxUsage, Date pliTaxDate, Date pliModDate,
			String pliModUserid, String pliUser1, String pliUser2,
			String pliQadc01, String pliQadc02, Double oidPliMstr) {
		super(id, pliInternalRefType, pliInternalRef, pliSupplier, pliInvoice,
				pliInvoiceAmt, pliCurr, pliInvoiceDate, pliVoRef, pliExRate,
				pliExRate2, pliExRatetype, pliExruSeq, pliTaxable, pliTaxc,
				pliTaxEnv, pliTaxIn, pliTaxUsage, pliTaxDate, pliModDate,
				pliModUserid, pliUser1, pliUser2, pliQadc01, pliQadc02,
				oidPliMstr);
	}

}
