package com.gopawpaw.erp.hibernate.e;

/**
 * EctMstrId entity. @author MyEclipse Persistence Tools
 */
public class EctMstrId extends AbstractEctMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EctMstrId() {
	}

	/** minimal constructor */
	public EctMstrId(String ectDomain) {
		super(ectDomain);
	}

	/** full constructor */
	public EctMstrId(String ectDomain, String ectType, String ectDsgnGrp) {
		super(ectDomain, ectType, ectDsgnGrp);
	}

}
