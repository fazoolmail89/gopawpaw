package com.gopawpaw.erp.hibernate.a;

/**
 * ArsdDetId entity. @author MyEclipse Persistence Tools
 */
public class ArsdDetId extends AbstractArsdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArsdDetId() {
	}

	/** full constructor */
	public ArsdDetId(String arsdDomain, String arsdBatch, Integer arsdLine,
			String arsdNbr) {
		super(arsdDomain, arsdBatch, arsdLine, arsdNbr);
	}

}
