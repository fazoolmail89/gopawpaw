package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFtMstrId entity provides the base persistence definition of the
 * FtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFtMstrId implements java.io.Serializable {

	// Fields

	private String ftDomain;
	private String ftTerms;

	// Constructors

	/** default constructor */
	public AbstractFtMstrId() {
	}

	/** full constructor */
	public AbstractFtMstrId(String ftDomain, String ftTerms) {
		this.ftDomain = ftDomain;
		this.ftTerms = ftTerms;
	}

	// Property accessors

	public String getFtDomain() {
		return this.ftDomain;
	}

	public void setFtDomain(String ftDomain) {
		this.ftDomain = ftDomain;
	}

	public String getFtTerms() {
		return this.ftTerms;
	}

	public void setFtTerms(String ftTerms) {
		this.ftTerms = ftTerms;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFtMstrId))
			return false;
		AbstractFtMstrId castOther = (AbstractFtMstrId) other;

		return ((this.getFtDomain() == castOther.getFtDomain()) || (this
				.getFtDomain() != null
				&& castOther.getFtDomain() != null && this.getFtDomain()
				.equals(castOther.getFtDomain())))
				&& ((this.getFtTerms() == castOther.getFtTerms()) || (this
						.getFtTerms() != null
						&& castOther.getFtTerms() != null && this.getFtTerms()
						.equals(castOther.getFtTerms())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFtDomain() == null ? 0 : this.getFtDomain().hashCode());
		result = 37 * result
				+ (getFtTerms() == null ? 0 : this.getFtTerms().hashCode());
		return result;
	}

}