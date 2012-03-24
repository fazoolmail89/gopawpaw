package com.gopawpaw.frame.hibernate.p;

import java.sql.Timestamp;

/**
 * AbstractPcaDet entity provides the base persistence definition of the PcaDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcaDet implements java.io.Serializable {

	// Fields

	private PcaDetId id;
	private Boolean pcaVisible;
	private Boolean pcaEnable;
	private Timestamp pcaMdate;

	// Constructors

	/** default constructor */
	public AbstractPcaDet() {
	}

	/** minimal constructor */
	public AbstractPcaDet(PcaDetId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractPcaDet(PcaDetId id, Boolean pcaVisible, Boolean pcaEnable,
			Timestamp pcaMdate) {
		this.id = id;
		this.pcaVisible = pcaVisible;
		this.pcaEnable = pcaEnable;
		this.pcaMdate = pcaMdate;
	}

	// Property accessors

	public PcaDetId getId() {
		return this.id;
	}

	public void setId(PcaDetId id) {
		this.id = id;
	}

	public Boolean getPcaVisible() {
		return this.pcaVisible;
	}

	public void setPcaVisible(Boolean pcaVisible) {
		this.pcaVisible = pcaVisible;
	}

	public Boolean getPcaEnable() {
		return this.pcaEnable;
	}

	public void setPcaEnable(Boolean pcaEnable) {
		this.pcaEnable = pcaEnable;
	}

	public Timestamp getPcaMdate() {
		return this.pcaMdate;
	}

	public void setPcaMdate(Timestamp pcaMdate) {
		this.pcaMdate = pcaMdate;
	}

}