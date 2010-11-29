package com.gopawpaw.erp.hibernate.p;

/**
 * PjsMstrId entity. @author MyEclipse Persistence Tools
 */
public class PjsMstrId extends AbstractPjsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PjsMstrId() {
	}

	/** full constructor */
	public PjsMstrId(String pjsDomain, String pjsNbr, Integer pjsLine) {
		super(pjsDomain, pjsNbr, pjsLine);
	}

}
