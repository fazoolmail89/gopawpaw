package com.gopawpaw.erp.hibernate.f;

/**
 * FlscMstrId entity. @author MyEclipse Persistence Tools
 */
public class FlscMstrId extends AbstractFlscMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlscMstrId() {
	}

	/** full constructor */
	public FlscMstrId(String flscDomain, String flscScheduleCode) {
		super(flscDomain, flscScheduleCode);
	}

}
