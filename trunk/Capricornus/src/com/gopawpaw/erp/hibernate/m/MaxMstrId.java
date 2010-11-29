package com.gopawpaw.erp.hibernate.m;

/**
 * MaxMstrId entity. @author MyEclipse Persistence Tools
 */
public class MaxMstrId extends AbstractMaxMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MaxMstrId() {
	}

	/** full constructor */
	public MaxMstrId(String maxField, String maxBook, String maxQad01,
			String maxClass) {
		super(maxField, maxBook, maxQad01, maxClass);
	}

}
