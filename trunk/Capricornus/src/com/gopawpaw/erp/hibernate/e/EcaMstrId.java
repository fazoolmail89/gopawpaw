package com.gopawpaw.erp.hibernate.e;

/**
 * EcaMstrId entity. @author MyEclipse Persistence Tools
 */
public class EcaMstrId extends AbstractEcaMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcaMstrId() {
	}

	/** minimal constructor */
	public EcaMstrId(String ecaDomain) {
		super(ecaDomain);
	}

	/** full constructor */
	public EcaMstrId(String ecaDomain, String ecaCode, String ecaGroup) {
		super(ecaDomain, ecaCode, ecaGroup);
	}

}
