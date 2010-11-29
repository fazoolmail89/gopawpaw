package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVeeMstrId entity provides the base persistence definition of the
 * VeeMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVeeMstrId implements java.io.Serializable {

	// Fields

	private String veeDomain;
	private String veeEvent;

	// Constructors

	/** default constructor */
	public AbstractVeeMstrId() {
	}

	/** full constructor */
	public AbstractVeeMstrId(String veeDomain, String veeEvent) {
		this.veeDomain = veeDomain;
		this.veeEvent = veeEvent;
	}

	// Property accessors

	public String getVeeDomain() {
		return this.veeDomain;
	}

	public void setVeeDomain(String veeDomain) {
		this.veeDomain = veeDomain;
	}

	public String getVeeEvent() {
		return this.veeEvent;
	}

	public void setVeeEvent(String veeEvent) {
		this.veeEvent = veeEvent;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVeeMstrId))
			return false;
		AbstractVeeMstrId castOther = (AbstractVeeMstrId) other;

		return ((this.getVeeDomain() == castOther.getVeeDomain()) || (this
				.getVeeDomain() != null
				&& castOther.getVeeDomain() != null && this.getVeeDomain()
				.equals(castOther.getVeeDomain())))
				&& ((this.getVeeEvent() == castOther.getVeeEvent()) || (this
						.getVeeEvent() != null
						&& castOther.getVeeEvent() != null && this
						.getVeeEvent().equals(castOther.getVeeEvent())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVeeDomain() == null ? 0 : this.getVeeDomain().hashCode());
		result = 37 * result
				+ (getVeeEvent() == null ? 0 : this.getVeeEvent().hashCode());
		return result;
	}

}