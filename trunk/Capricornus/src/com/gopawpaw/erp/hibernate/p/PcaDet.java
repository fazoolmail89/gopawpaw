package com.gopawpaw.erp.hibernate.p;

import java.sql.Timestamp;

/**
 * PcaDet entity. @author MyEclipse Persistence Tools
 */
public class PcaDet extends AbstractPcaDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcaDet() {
	}

	/** minimal constructor */
	public PcaDet(PcaDetId id) {
		super(id);
	}

	/** full constructor */
	public PcaDet(PcaDetId id, Boolean pcaVisible, Boolean pcaEnable,
			Timestamp pcaMdate) {
		super(id, pcaVisible, pcaEnable, pcaMdate);
	}

}
