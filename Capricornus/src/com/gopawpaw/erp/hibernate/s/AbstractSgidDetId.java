package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgidDetId entity provides the base persistence definition of the
 * SgidDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgidDetId implements java.io.Serializable {

	// Fields

	private String sgidDomain;
	private String sgidGrp;
	private String sgidInvMov;

	// Constructors

	/** default constructor */
	public AbstractSgidDetId() {
	}

	/** full constructor */
	public AbstractSgidDetId(String sgidDomain, String sgidGrp,
			String sgidInvMov) {
		this.sgidDomain = sgidDomain;
		this.sgidGrp = sgidGrp;
		this.sgidInvMov = sgidInvMov;
	}

	// Property accessors

	public String getSgidDomain() {
		return this.sgidDomain;
	}

	public void setSgidDomain(String sgidDomain) {
		this.sgidDomain = sgidDomain;
	}

	public String getSgidGrp() {
		return this.sgidGrp;
	}

	public void setSgidGrp(String sgidGrp) {
		this.sgidGrp = sgidGrp;
	}

	public String getSgidInvMov() {
		return this.sgidInvMov;
	}

	public void setSgidInvMov(String sgidInvMov) {
		this.sgidInvMov = sgidInvMov;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSgidDetId))
			return false;
		AbstractSgidDetId castOther = (AbstractSgidDetId) other;

		return ((this.getSgidDomain() == castOther.getSgidDomain()) || (this
				.getSgidDomain() != null
				&& castOther.getSgidDomain() != null && this.getSgidDomain()
				.equals(castOther.getSgidDomain())))
				&& ((this.getSgidGrp() == castOther.getSgidGrp()) || (this
						.getSgidGrp() != null
						&& castOther.getSgidGrp() != null && this.getSgidGrp()
						.equals(castOther.getSgidGrp())))
				&& ((this.getSgidInvMov() == castOther.getSgidInvMov()) || (this
						.getSgidInvMov() != null
						&& castOther.getSgidInvMov() != null && this
						.getSgidInvMov().equals(castOther.getSgidInvMov())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSgidDomain() == null ? 0 : this.getSgidDomain()
						.hashCode());
		result = 37 * result
				+ (getSgidGrp() == null ? 0 : this.getSgidGrp().hashCode());
		result = 37
				* result
				+ (getSgidInvMov() == null ? 0 : this.getSgidInvMov()
						.hashCode());
		return result;
	}

}