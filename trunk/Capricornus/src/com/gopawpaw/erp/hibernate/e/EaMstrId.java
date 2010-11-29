package com.gopawpaw.erp.hibernate.e;

/**
 * EaMstrId entity. @author MyEclipse Persistence Tools
 */
public class EaMstrId extends AbstractEaMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EaMstrId() {
	}

	/** full constructor */
	public EaMstrId(String eaDomain, String eaEarn) {
		super(eaDomain, eaEarn);
	}

}
