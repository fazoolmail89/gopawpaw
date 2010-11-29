package com.gopawpaw.erp.hibernate.r;

/**
 * RqdaDetId entity. @author MyEclipse Persistence Tools
 */
public class RqdaDetId extends AbstractRqdaDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqdaDetId() {
	}

	/** minimal constructor */
	public RqdaDetId(String rqdaDomain) {
		super(rqdaDomain);
	}

	/** full constructor */
	public RqdaDetId(String rqdaDomain, String rqdaNbr, String rqdaAprUserid) {
		super(rqdaDomain, rqdaNbr, rqdaAprUserid);
	}

}
