package com.gopawpaw.erp.hibernate.i;

/**
 * IfsMstrId entity. @author MyEclipse Persistence Tools
 */
public class IfsMstrId extends AbstractIfsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IfsMstrId() {
	}

	/** minimal constructor */
	public IfsMstrId(String ifsDomain) {
		super(ifsDomain);
	}

	/** full constructor */
	public IfsMstrId(Integer ifsSessId, String ifsAppId, String ifsDomain) {
		super(ifsSessId, ifsAppId, ifsDomain);
	}

}
