package com.gopawpaw.erp.hibernate.u;

/**
 * UmMstrId entity. @author MyEclipse Persistence Tools
 */
public class UmMstrId extends AbstractUmMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UmMstrId() {
	}

	/** minimal constructor */
	public UmMstrId(String umDomain) {
		super(umDomain);
	}

	/** full constructor */
	public UmMstrId(String umDomain, String umUm, String umAltUm, String umPart) {
		super(umDomain, umUm, umAltUm, umPart);
	}

}
