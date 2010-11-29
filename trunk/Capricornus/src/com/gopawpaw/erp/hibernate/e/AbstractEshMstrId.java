package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEshMstrId entity provides the base persistence definition of the
 * EshMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEshMstrId implements java.io.Serializable {

	// Fields

	private String eshDomain;
	private String eshSchedule;
	private Date eshStartEff;

	// Constructors

	/** default constructor */
	public AbstractEshMstrId() {
	}

	/** minimal constructor */
	public AbstractEshMstrId(String eshDomain) {
		this.eshDomain = eshDomain;
	}

	/** full constructor */
	public AbstractEshMstrId(String eshDomain, String eshSchedule,
			Date eshStartEff) {
		this.eshDomain = eshDomain;
		this.eshSchedule = eshSchedule;
		this.eshStartEff = eshStartEff;
	}

	// Property accessors

	public String getEshDomain() {
		return this.eshDomain;
	}

	public void setEshDomain(String eshDomain) {
		this.eshDomain = eshDomain;
	}

	public String getEshSchedule() {
		return this.eshSchedule;
	}

	public void setEshSchedule(String eshSchedule) {
		this.eshSchedule = eshSchedule;
	}

	public Date getEshStartEff() {
		return this.eshStartEff;
	}

	public void setEshStartEff(Date eshStartEff) {
		this.eshStartEff = eshStartEff;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEshMstrId))
			return false;
		AbstractEshMstrId castOther = (AbstractEshMstrId) other;

		return ((this.getEshDomain() == castOther.getEshDomain()) || (this
				.getEshDomain() != null
				&& castOther.getEshDomain() != null && this.getEshDomain()
				.equals(castOther.getEshDomain())))
				&& ((this.getEshSchedule() == castOther.getEshSchedule()) || (this
						.getEshSchedule() != null
						&& castOther.getEshSchedule() != null && this
						.getEshSchedule().equals(castOther.getEshSchedule())))
				&& ((this.getEshStartEff() == castOther.getEshStartEff()) || (this
						.getEshStartEff() != null
						&& castOther.getEshStartEff() != null && this
						.getEshStartEff().equals(castOther.getEshStartEff())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEshDomain() == null ? 0 : this.getEshDomain().hashCode());
		result = 37
				* result
				+ (getEshSchedule() == null ? 0 : this.getEshSchedule()
						.hashCode());
		result = 37
				* result
				+ (getEshStartEff() == null ? 0 : this.getEshStartEff()
						.hashCode());
		return result;
	}

}