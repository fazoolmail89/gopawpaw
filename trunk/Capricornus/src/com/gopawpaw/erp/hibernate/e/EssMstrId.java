package com.gopawpaw.erp.hibernate.e;

/**
 * EssMstrId entity. @author MyEclipse Persistence Tools
 */
public class EssMstrId extends AbstractEssMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EssMstrId() {
	}

	/** minimal constructor */
	public EssMstrId(String essDomain) {
		super(essDomain);
	}

	/** full constructor */
	public EssMstrId(String essDomain, String essStatus) {
		super(essDomain, essStatus);
	}

}
