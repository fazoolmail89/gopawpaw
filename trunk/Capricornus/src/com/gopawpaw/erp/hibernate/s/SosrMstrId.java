package com.gopawpaw.erp.hibernate.s;

/**
 * SosrMstrId entity. @author MyEclipse Persistence Tools
 */
public class SosrMstrId extends AbstractSosrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SosrMstrId() {
	}

	/** full constructor */
	public SosrMstrId(String sosrDomain, String sosrNbr, Integer sosrLine,
			String sosrShipfrom, String sosrAbsId) {
		super(sosrDomain, sosrNbr, sosrLine, sosrShipfrom, sosrAbsId);
	}

}
