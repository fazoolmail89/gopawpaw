package com.gopawpaw.erp.hibernate.d;

/**
 * DbkMstrId entity. @author MyEclipse Persistence Tools
 */
public class DbkMstrId extends AbstractDbkMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DbkMstrId() {
	}

	/** full constructor */
	public DbkMstrId(String dbkBook, String dbkEntity) {
		super(dbkBook, dbkEntity);
	}

}
