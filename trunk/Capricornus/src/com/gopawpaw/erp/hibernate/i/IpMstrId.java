package com.gopawpaw.erp.hibernate.i;

/**
 * IpMstrId entity. @author MyEclipse Persistence Tools
 */
public class IpMstrId extends AbstractIpMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IpMstrId() {
	}

	/** minimal constructor */
	public IpMstrId(String ipDomain) {
		super(ipDomain);
	}

	/** full constructor */
	public IpMstrId(String ipDomain, String ipPart, String ipRouting,
			Integer ipOp) {
		super(ipDomain, ipPart, ipRouting, ipOp);
	}

}
