package com.gopawpaw.erp.hibernate.s;

/**
 * ScaMstrId entity. @author MyEclipse Persistence Tools
 */
public class ScaMstrId extends AbstractScaMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScaMstrId() {
	}

	/** minimal constructor */
	public ScaMstrId(String scaDomain) {
		super(scaDomain);
	}

	/** full constructor */
	public ScaMstrId(String scaDomain, String scaService, String scaPart) {
		super(scaDomain, scaService, scaPart);
	}

}
