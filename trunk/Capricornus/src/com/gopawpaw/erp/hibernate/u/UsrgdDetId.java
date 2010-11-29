package com.gopawpaw.erp.hibernate.u;

/**
 * UsrgdDetId entity. @author MyEclipse Persistence Tools
 */
public class UsrgdDetId extends AbstractUsrgdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrgdDetId() {
	}

	/** full constructor */
	public UsrgdDetId(Double oidUsrgMstr, String usrgdDomain, String usrgdUserid) {
		super(oidUsrgMstr, usrgdDomain, usrgdUserid);
	}

}
