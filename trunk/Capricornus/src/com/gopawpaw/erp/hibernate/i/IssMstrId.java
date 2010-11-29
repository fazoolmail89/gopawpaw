package com.gopawpaw.erp.hibernate.i;

/**
 * IssMstrId entity. @author MyEclipse Persistence Tools
 */
public class IssMstrId extends AbstractIssMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IssMstrId() {
	}

	/** minimal constructor */
	public IssMstrId(String issDomain) {
		super(issDomain);
	}

	/** full constructor */
	public IssMstrId(String issDomain, String issEuNbr, String issPar,
			String issParSer, Integer issParRef, String issComp,
			String issCompSer, Integer issCompRef) {
		super(issDomain, issEuNbr, issPar, issParSer, issParRef, issComp,
				issCompSer, issCompRef);
	}

}
