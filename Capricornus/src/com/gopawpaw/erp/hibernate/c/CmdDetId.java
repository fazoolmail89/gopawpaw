package com.gopawpaw.erp.hibernate.c;

/**
 * CmdDetId entity. @author MyEclipse Persistence Tools
 */
public class CmdDetId extends AbstractCmdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmdDetId() {
	}

	/** full constructor */
	public CmdDetId(String cmdDomain, Integer cmdTransNbr, String cmdFile,
			String cmdField, String cmdKeyVal) {
		super(cmdDomain, cmdTransNbr, cmdFile, cmdField, cmdKeyVal);
	}

}
