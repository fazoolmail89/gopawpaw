package com.gopawpaw.erp.hibernate.b;

/**
 * BkpdDetId entity. @author MyEclipse Persistence Tools
 */
public class BkpdDetId extends AbstractBkpdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkpdDetId() {
	}

	/** full constructor */
	public BkpdDetId(String bkpdDomain, String bkpdBank, String bkpdPayMethod,
			String bkpdModule, Integer bkpdSeq, String bkpdAddr,
			String bkpdCurr, Integer bkpdPaymentNbr) {
		super(bkpdDomain, bkpdBank, bkpdPayMethod, bkpdModule, bkpdSeq,
				bkpdAddr, bkpdCurr, bkpdPaymentNbr);
	}

}
