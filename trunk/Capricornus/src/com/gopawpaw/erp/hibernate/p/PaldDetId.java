package com.gopawpaw.erp.hibernate.p;

/**
 * PaldDetId entity. @author MyEclipse Persistence Tools
 */
public class PaldDetId extends AbstractPaldDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PaldDetId() {
	}

	/** minimal constructor */
	public PaldDetId(String paldDomain) {
		super(paldDomain);
	}

	/** full constructor */
	public PaldDetId(String paldDomain, String paldPallet, String paldPart) {
		super(paldDomain, paldPallet, paldPart);
	}

}
