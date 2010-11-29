package com.gopawpaw.erp.hibernate.i;

/**
 * InsdDetId entity. @author MyEclipse Persistence Tools
 */
public class InsdDetId extends AbstractInsdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public InsdDetId() {
	}

	/** full constructor */
	public InsdDetId(String insdDomain, String insdPrjNbr, Integer insdSubNbr,
			String insdSchedNbr, Integer insdPjsLine) {
		super(insdDomain, insdPrjNbr, insdSubNbr, insdSchedNbr, insdPjsLine);
	}

}
