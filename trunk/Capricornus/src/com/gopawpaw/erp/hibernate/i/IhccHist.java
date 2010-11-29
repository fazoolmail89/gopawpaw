package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IhccHist entity. @author MyEclipse Persistence Tools
 */
public class IhccHist extends AbstractIhccHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IhccHist() {
	}

	/** minimal constructor */
	public IhccHist(IhccHistId id, String ihccNbr, String ihccCcNbrTail,
			Date ihccCcExpireDate, String ihccCardType, Date ihccAuthDate,
			String ihccAuthNbr, Double ihccAuthAmt, Date ihccAuthExpireDate,
			String ihccBillingName, String ihccBillingAddr1,
			String ihccBillingAddr2, String ihccBillingAddr3,
			String ihccBillingCity, String ihccBillingZip,
			String ihccBillingState, String ihccBillingCountry,
			String ihccModUserid, Date ihccModDate, Double oidIhccHist) {
		super(id, ihccNbr, ihccCcNbrTail, ihccCcExpireDate, ihccCardType,
				ihccAuthDate, ihccAuthNbr, ihccAuthAmt, ihccAuthExpireDate,
				ihccBillingName, ihccBillingAddr1, ihccBillingAddr2,
				ihccBillingAddr3, ihccBillingCity, ihccBillingZip,
				ihccBillingState, ihccBillingCountry, ihccModUserid,
				ihccModDate, oidIhccHist);
	}

	/** full constructor */
	public IhccHist(IhccHistId id, String ihccNbr, String ihccCcNbrTail,
			Date ihccCcExpireDate, String ihccCardType, Date ihccAuthDate,
			String ihccAuthNbr, Double ihccAuthAmt, Date ihccAuthExpireDate,
			String ihccBillingName, String ihccBillingAddr1,
			String ihccBillingAddr2, String ihccBillingAddr3,
			String ihccBillingCity, String ihccBillingZip,
			String ihccBillingState, String ihccBillingCountry,
			String ihccBillingCtry, String ihccModUserid, Date ihccModDate,
			String ihccUser1, String ihccUser2, String ihccQadc01,
			Integer ihccQadi01, Double ihccQadd01, Boolean ihccQadl01,
			Date ihccQadt01, Double oidIhccHist) {
		super(id, ihccNbr, ihccCcNbrTail, ihccCcExpireDate, ihccCardType,
				ihccAuthDate, ihccAuthNbr, ihccAuthAmt, ihccAuthExpireDate,
				ihccBillingName, ihccBillingAddr1, ihccBillingAddr2,
				ihccBillingAddr3, ihccBillingCity, ihccBillingZip,
				ihccBillingState, ihccBillingCountry, ihccBillingCtry,
				ihccModUserid, ihccModDate, ihccUser1, ihccUser2, ihccQadc01,
				ihccQadi01, ihccQadd01, ihccQadl01, ihccQadt01, oidIhccHist);
	}

}
