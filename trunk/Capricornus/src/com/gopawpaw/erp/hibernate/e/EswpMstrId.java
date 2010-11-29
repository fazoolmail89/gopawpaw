package com.gopawpaw.erp.hibernate.e;

/**
 * EswpMstrId entity. @author MyEclipse Persistence Tools
 */
public class EswpMstrId extends AbstractEswpMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpMstrId() {
	}

	/** full constructor */
	public EswpMstrId(String eswpProfileType, String eswpCollection,
			Double oidEscatMstr) {
		super(eswpProfileType, eswpCollection, oidEscatMstr);
	}

}
