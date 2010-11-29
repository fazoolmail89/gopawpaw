package com.gopawpaw.erp.hibernate.s;

/**
 * SbidDetId entity. @author MyEclipse Persistence Tools
 */
public class SbidDetId extends AbstractSbidDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbidDetId() {
	}

	/** minimal constructor */
	public SbidDetId(String sbidDomain, String sbidBill, String sbidNbr) {
		super(sbidDomain, sbidBill, sbidNbr);
	}

	/** full constructor */
	public SbidDetId(String sbidDomain, String sbidBill, String sbidNbr,
			Integer sbidLine) {
		super(sbidDomain, sbidBill, sbidNbr, sbidLine);
	}

}
