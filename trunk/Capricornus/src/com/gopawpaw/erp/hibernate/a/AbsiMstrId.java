package com.gopawpaw.erp.hibernate.a;

/**
 * AbsiMstrId entity. @author MyEclipse Persistence Tools
 */
public class AbsiMstrId extends AbstractAbsiMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsiMstrId() {
	}

	/** full constructor */
	public AbsiMstrId(String absiDomain, String absiShipfrom, String absiAbsId) {
		super(absiDomain, absiShipfrom, absiAbsId);
	}

}
