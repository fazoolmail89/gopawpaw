package com.gopawpaw.erp.hibernate.w;

/**
 * WcMstrId entity. @author MyEclipse Persistence Tools
 */
public class WcMstrId extends AbstractWcMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WcMstrId() {
	}

	/** minimal constructor */
	public WcMstrId(String wcDomain, String wcWkctr) {
		super(wcDomain, wcWkctr);
	}

	/** full constructor */
	public WcMstrId(String wcDomain, String wcWkctr, String wcMch) {
		super(wcDomain, wcWkctr, wcMch);
	}

}
