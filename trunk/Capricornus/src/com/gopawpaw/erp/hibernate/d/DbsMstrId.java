package com.gopawpaw.erp.hibernate.d;

/**
 * DbsMstrId entity. @author MyEclipse Persistence Tools
 */
public class DbsMstrId extends AbstractDbsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DbsMstrId() {
	}

	/** full constructor */
	public DbsMstrId(Double dbsMajor, String dbsMinor) {
		super(dbsMajor, dbsMinor);
	}

}
