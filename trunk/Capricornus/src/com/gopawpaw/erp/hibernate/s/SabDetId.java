package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SabDetId entity. @author MyEclipse Persistence Tools
 */
public class SabDetId extends AbstractSabDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SabDetId() {
	}

	/** full constructor */
	public SabDetId(String sabDomain, String sabNbr, String sabPrefix,
			Integer sabLine, Date sabBilledDate, String sabBilledTime) {
		super(sabDomain, sabNbr, sabPrefix, sabLine, sabBilledDate,
				sabBilledTime);
	}

}
