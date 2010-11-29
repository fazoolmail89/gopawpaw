package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSimDetId entity provides the base persistence definition of the
 * SimDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSimDetId implements java.io.Serializable {

	// Fields

	private String simDomain;
	private String simSite;
	private String simInvMov;

	// Constructors

	/** default constructor */
	public AbstractSimDetId() {
	}

	/** full constructor */
	public AbstractSimDetId(String simDomain, String simSite, String simInvMov) {
		this.simDomain = simDomain;
		this.simSite = simSite;
		this.simInvMov = simInvMov;
	}

	// Property accessors

	public String getSimDomain() {
		return this.simDomain;
	}

	public void setSimDomain(String simDomain) {
		this.simDomain = simDomain;
	}

	public String getSimSite() {
		return this.simSite;
	}

	public void setSimSite(String simSite) {
		this.simSite = simSite;
	}

	public String getSimInvMov() {
		return this.simInvMov;
	}

	public void setSimInvMov(String simInvMov) {
		this.simInvMov = simInvMov;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSimDetId))
			return false;
		AbstractSimDetId castOther = (AbstractSimDetId) other;

		return ((this.getSimDomain() == castOther.getSimDomain()) || (this
				.getSimDomain() != null
				&& castOther.getSimDomain() != null && this.getSimDomain()
				.equals(castOther.getSimDomain())))
				&& ((this.getSimSite() == castOther.getSimSite()) || (this
						.getSimSite() != null
						&& castOther.getSimSite() != null && this.getSimSite()
						.equals(castOther.getSimSite())))
				&& ((this.getSimInvMov() == castOther.getSimInvMov()) || (this
						.getSimInvMov() != null
						&& castOther.getSimInvMov() != null && this
						.getSimInvMov().equals(castOther.getSimInvMov())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSimDomain() == null ? 0 : this.getSimDomain().hashCode());
		result = 37 * result
				+ (getSimSite() == null ? 0 : this.getSimSite().hashCode());
		result = 37 * result
				+ (getSimInvMov() == null ? 0 : this.getSimInvMov().hashCode());
		return result;
	}

}