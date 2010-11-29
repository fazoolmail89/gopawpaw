package com.gopawpaw.erp.hibernate.f;

/**
 * FfMstrId entity. @author MyEclipse Persistence Tools
 */
public class FfMstrId extends AbstractFfMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FfMstrId() {
	}

	/** minimal constructor */
	public FfMstrId(String ffDomain) {
		super(ffDomain);
	}

	/** full constructor */
	public FfMstrId(String ffDomain, String ffId, String ffUser,
			Integer ffYear, Integer ffMethod, String ffPart, String ffSite,
			String ffCust) {
		super(ffDomain, ffId, ffUser, ffYear, ffMethod, ffPart, ffSite, ffCust);
	}

}
