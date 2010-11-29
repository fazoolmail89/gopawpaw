package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UspwHist entity. @author MyEclipse Persistence Tools
 */
public class UspwHist extends AbstractUspwHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UspwHist() {
	}

	/** full constructor */
	public UspwHist(UspwHistId id, String uspwUsrPasswd, String uspwModUserid,
			Date uspwModDate, String uspwTimezone, String uspwUser1,
			String uspwUser2, String uspwQadc01, String uspwQadc02,
			Double oidUspwHist) {
		super(id, uspwUsrPasswd, uspwModUserid, uspwModDate, uspwTimezone,
				uspwUser1, uspwUser2, uspwQadc01, uspwQadc02, oidUspwHist);
	}

}
