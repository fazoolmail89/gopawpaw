package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * Ecd5DetId entity. @author MyEclipse Persistence Tools
 */
public class Ecd5DetId extends AbstractEcd5DetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd5DetId() {
	}

	/** minimal constructor */
	public Ecd5DetId(String ecd5Domain, String ecd5Part, String ecd5BomCode) {
		super(ecd5Domain, ecd5Part, ecd5BomCode);
	}

	/** full constructor */
	public Ecd5DetId(String ecd5Domain, String ecd5Part, String ecd5Site,
			String ecd5Routing, String ecd5BomCode, Date ecd5Start) {
		super(ecd5Domain, ecd5Part, ecd5Site, ecd5Routing, ecd5BomCode,
				ecd5Start);
	}

}
