package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EgaMstrId entity. @author MyEclipse Persistence Tools
 */
public class EgaMstrId extends AbstractEgaMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgaMstrId() {
	}

	/** minimal constructor */
	public EgaMstrId(String egaDomain) {
		super(egaDomain);
	}

	/** full constructor */
	public EgaMstrId(String egaDomain, String egaEngCode, Date egaWeek,
			String egaEshSchedule) {
		super(egaDomain, egaEngCode, egaWeek, egaEshSchedule);
	}

}
