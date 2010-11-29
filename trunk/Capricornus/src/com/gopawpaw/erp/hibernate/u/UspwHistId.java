package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UspwHistId entity. @author MyEclipse Persistence Tools
 */
public class UspwHistId extends AbstractUspwHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UspwHistId() {
	}

	/** full constructor */
	public UspwHistId(String uspwUserid, Date uspwDate, Integer uspwTime) {
		super(uspwUserid, uspwDate, uspwTime);
	}

}
