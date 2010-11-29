package com.gopawpaw.erp.hibernate.m;

/**
 * MonMstrId entity. @author MyEclipse Persistence Tools
 */
public class MonMstrId extends AbstractMonMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MonMstrId() {
	}

	/** full constructor */
	public MonMstrId(String monUserid, String monSid, String monProduct) {
		super(monUserid, monSid, monProduct);
	}

}
