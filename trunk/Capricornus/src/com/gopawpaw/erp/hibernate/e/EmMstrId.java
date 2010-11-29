package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EmMstrId entity. @author MyEclipse Persistence Tools
 */
public class EmMstrId extends AbstractEmMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmMstrId() {
	}

	/** full constructor */
	public EmMstrId(String emSystemId, String emOpsys, Date emStart) {
		super(emSystemId, emOpsys, emStart);
	}

}
