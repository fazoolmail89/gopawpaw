package com.gopawpaw.erp.hibernate.g;

/**
 * GriMstrId entity. @author MyEclipse Persistence Tools
 */
public class GriMstrId extends AbstractGriMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GriMstrId() {
	}

	/** minimal constructor */
	public GriMstrId(String griDomain) {
		super(griDomain);
	}

	/** full constructor */
	public GriMstrId(String griDomain, String griReport, Integer griRunId) {
		super(griDomain, griReport, griRunId);
	}

}
