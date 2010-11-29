package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSiMstrId entity provides the base persistence definition of the
 * SiMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSiMstrId implements java.io.Serializable {

	// Fields

	private String siDomain;
	private String siSite;

	// Constructors

	/** default constructor */
	public AbstractSiMstrId() {
	}

	/** minimal constructor */
	public AbstractSiMstrId(String siDomain) {
		this.siDomain = siDomain;
	}

	/** full constructor */
	public AbstractSiMstrId(String siDomain, String siSite) {
		this.siDomain = siDomain;
		this.siSite = siSite;
	}

	// Property accessors

	public String getSiDomain() {
		return this.siDomain;
	}

	public void setSiDomain(String siDomain) {
		this.siDomain = siDomain;
	}

	public String getSiSite() {
		return this.siSite;
	}

	public void setSiSite(String siSite) {
		this.siSite = siSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSiMstrId))
			return false;
		AbstractSiMstrId castOther = (AbstractSiMstrId) other;

		return ((this.getSiDomain() == castOther.getSiDomain()) || (this
				.getSiDomain() != null
				&& castOther.getSiDomain() != null && this.getSiDomain()
				.equals(castOther.getSiDomain())))
				&& ((this.getSiSite() == castOther.getSiSite()) || (this
						.getSiSite() != null
						&& castOther.getSiSite() != null && this.getSiSite()
						.equals(castOther.getSiSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSiDomain() == null ? 0 : this.getSiDomain().hashCode());
		result = 37 * result
				+ (getSiSite() == null ? 0 : this.getSiSite().hashCode());
		return result;
	}

}