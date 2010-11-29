package com.gopawpaw.erp.hibernate.a;

/**
 * AtwpMstrId entity. @author MyEclipse Persistence Tools
 */
public class AtwpMstrId extends AbstractAtwpMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtwpMstrId() {
	}

	/** full constructor */
	public AtwpMstrId(String atwpProfileType, String atwpCollection,
			Double oidAttMstr) {
		super(atwpProfileType, atwpCollection, oidAttMstr);
	}

}
