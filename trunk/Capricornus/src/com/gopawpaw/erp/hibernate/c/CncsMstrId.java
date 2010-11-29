package com.gopawpaw.erp.hibernate.c;

/**
 * CncsMstrId entity. @author MyEclipse Persistence Tools
 */
public class CncsMstrId extends AbstractCncsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CncsMstrId() {
	}

	/** full constructor */
	public CncsMstrId(String cncsDomain, String cncsShipto, String cncsPart) {
		super(cncsDomain, cncsShipto, cncsPart);
	}

}
