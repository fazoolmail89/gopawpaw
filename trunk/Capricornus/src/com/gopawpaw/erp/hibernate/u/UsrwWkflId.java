package com.gopawpaw.erp.hibernate.u;

/**
 * UsrwWkflId entity. @author MyEclipse Persistence Tools
 */
public class UsrwWkflId extends AbstractUsrwWkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrwWkflId() {
	}

	/** minimal constructor */
	public UsrwWkflId(String usrwDomain) {
		super(usrwDomain);
	}

	/** full constructor */
	public UsrwWkflId(String usrwDomain, String usrwKey1, String usrwKey2) {
		super(usrwDomain, usrwKey1, usrwKey2);
	}

}
