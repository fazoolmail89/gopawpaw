package com.gopawpaw.erp.hibernate.r;

/**
 * RqcdDetId entity. @author MyEclipse Persistence Tools
 */
public class RqcdDetId extends AbstractRqcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqcdDetId() {
	}

	/** minimal constructor */
	public RqcdDetId(String rqcdDomain) {
		super(rqcdDomain);
	}

	/** full constructor */
	public RqcdDetId(String rqcdDomain, String rqcdCategory,
			String rqcdAcctFrom, String rqcdSubFrom) {
		super(rqcdDomain, rqcdCategory, rqcdAcctFrom, rqcdSubFrom);
	}

}
