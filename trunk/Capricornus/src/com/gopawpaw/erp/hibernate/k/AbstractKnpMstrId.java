package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnpMstrId entity provides the base persistence definition of the
 * KnpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnpMstrId implements java.io.Serializable {

	// Fields

	private String knpDomain;
	private String knpSite;
	private String knpProcessId;

	// Constructors

	/** default constructor */
	public AbstractKnpMstrId() {
	}

	/** full constructor */
	public AbstractKnpMstrId(String knpDomain, String knpSite,
			String knpProcessId) {
		this.knpDomain = knpDomain;
		this.knpSite = knpSite;
		this.knpProcessId = knpProcessId;
	}

	// Property accessors

	public String getKnpDomain() {
		return this.knpDomain;
	}

	public void setKnpDomain(String knpDomain) {
		this.knpDomain = knpDomain;
	}

	public String getKnpSite() {
		return this.knpSite;
	}

	public void setKnpSite(String knpSite) {
		this.knpSite = knpSite;
	}

	public String getKnpProcessId() {
		return this.knpProcessId;
	}

	public void setKnpProcessId(String knpProcessId) {
		this.knpProcessId = knpProcessId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKnpMstrId))
			return false;
		AbstractKnpMstrId castOther = (AbstractKnpMstrId) other;

		return ((this.getKnpDomain() == castOther.getKnpDomain()) || (this
				.getKnpDomain() != null
				&& castOther.getKnpDomain() != null && this.getKnpDomain()
				.equals(castOther.getKnpDomain())))
				&& ((this.getKnpSite() == castOther.getKnpSite()) || (this
						.getKnpSite() != null
						&& castOther.getKnpSite() != null && this.getKnpSite()
						.equals(castOther.getKnpSite())))
				&& ((this.getKnpProcessId() == castOther.getKnpProcessId()) || (this
						.getKnpProcessId() != null
						&& castOther.getKnpProcessId() != null && this
						.getKnpProcessId().equals(castOther.getKnpProcessId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getKnpDomain() == null ? 0 : this.getKnpDomain().hashCode());
		result = 37 * result
				+ (getKnpSite() == null ? 0 : this.getKnpSite().hashCode());
		result = 37
				* result
				+ (getKnpProcessId() == null ? 0 : this.getKnpProcessId()
						.hashCode());
		return result;
	}

}