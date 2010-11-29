package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShmMstrId entity. @author MyEclipse Persistence Tools
 */
public class ShmMstrId extends AbstractShmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShmMstrId() {
	}

	/** minimal constructor */
	public ShmMstrId(String shmDomain) {
		super(shmDomain);
	}

	/** full constructor */
	public ShmMstrId(String shmDomain, String shmCode, String shmSrcSite,
			String shmRecSite, Date shmStart) {
		super(shmDomain, shmCode, shmSrcSite, shmRecSite, shmStart);
	}

}
