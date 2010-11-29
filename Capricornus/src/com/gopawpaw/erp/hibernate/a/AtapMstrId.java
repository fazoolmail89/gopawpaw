package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtapMstrId entity. @author MyEclipse Persistence Tools
 */
public class AtapMstrId extends AbstractAtapMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtapMstrId() {
	}

	/** full constructor */
	public AtapMstrId(Double oidAttMstr, Date atapBeginDate) {
		super(oidAttMstr, atapBeginDate);
	}

}
