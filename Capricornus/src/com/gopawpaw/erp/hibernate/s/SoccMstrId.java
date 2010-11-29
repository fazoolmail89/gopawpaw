package com.gopawpaw.erp.hibernate.s;

/**
 * SoccMstrId entity. @author MyEclipse Persistence Tools
 */
public class SoccMstrId extends AbstractSoccMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SoccMstrId() {
	}

	/** full constructor */
	public SoccMstrId(String soccDomain, String soccNbr, String soccCcNbr) {
		super(soccDomain, soccNbr, soccCcNbr);
	}

}
