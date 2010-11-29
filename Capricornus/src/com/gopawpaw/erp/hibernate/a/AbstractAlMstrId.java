package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAlMstrId entity provides the base persistence definition of the
 * AlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAlMstrId implements java.io.Serializable {

	// Fields

	private String alDomain;
	private String alCode;

	// Constructors

	/** default constructor */
	public AbstractAlMstrId() {
	}

	/** minimal constructor */
	public AbstractAlMstrId(String alDomain) {
		this.alDomain = alDomain;
	}

	/** full constructor */
	public AbstractAlMstrId(String alDomain, String alCode) {
		this.alDomain = alDomain;
		this.alCode = alCode;
	}

	// Property accessors

	public String getAlDomain() {
		return this.alDomain;
	}

	public void setAlDomain(String alDomain) {
		this.alDomain = alDomain;
	}

	public String getAlCode() {
		return this.alCode;
	}

	public void setAlCode(String alCode) {
		this.alCode = alCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAlMstrId))
			return false;
		AbstractAlMstrId castOther = (AbstractAlMstrId) other;

		return ((this.getAlDomain() == castOther.getAlDomain()) || (this
				.getAlDomain() != null
				&& castOther.getAlDomain() != null && this.getAlDomain()
				.equals(castOther.getAlDomain())))
				&& ((this.getAlCode() == castOther.getAlCode()) || (this
						.getAlCode() != null
						&& castOther.getAlCode() != null && this.getAlCode()
						.equals(castOther.getAlCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAlDomain() == null ? 0 : this.getAlDomain().hashCode());
		result = 37 * result
				+ (getAlCode() == null ? 0 : this.getAlCode().hashCode());
		return result;
	}

}