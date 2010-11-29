package com.gopawpaw.erp.hibernate.s;

/**
 * SobDetId entity. @author MyEclipse Persistence Tools
 */
public class SobDetId extends AbstractSobDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SobDetId() {
	}

	/** minimal constructor */
	public SobDetId(String sobDomain, String sobParent) {
		super(sobDomain, sobParent);
	}

	/** full constructor */
	public SobDetId(String sobDomain, String sobNbr, Integer sobLine,
			String sobParent, String sobFeature, String sobPart) {
		super(sobDomain, sobNbr, sobLine, sobParent, sobFeature, sobPart);
	}

}
