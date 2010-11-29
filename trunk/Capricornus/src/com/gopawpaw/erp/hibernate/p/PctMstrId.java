package com.gopawpaw.erp.hibernate.p;

/**
 * PctMstrId entity. @author MyEclipse Persistence Tools
 */
public class PctMstrId extends AbstractPctMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PctMstrId() {
	}

	/** full constructor */
	public PctMstrId(String pctDomain, String pctType, String pctDsgnGrp) {
		super(pctDomain, pctType, pctDsgnGrp);
	}

}
