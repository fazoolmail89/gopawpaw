package com.gopawpaw.erp.hibernate.r;

/**
 * RsnRefId entity. @author MyEclipse Persistence Tools
 */
public class RsnRefId extends AbstractRsnRefId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsnRefId() {
	}

	/** minimal constructor */
	public RsnRefId(String rsnDomain) {
		super(rsnDomain);
	}

	/** full constructor */
	public RsnRefId(String rsnDomain, String rsnCode, String rsnType) {
		super(rsnDomain, rsnCode, rsnType);
	}

}
