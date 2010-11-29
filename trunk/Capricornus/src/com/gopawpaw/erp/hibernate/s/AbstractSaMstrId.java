package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSaMstrId entity provides the base persistence definition of the
 * SaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSaMstrId implements java.io.Serializable {

	// Fields

	private String saDomain;
	private String saNbr;
	private String saPrefix;

	// Constructors

	/** default constructor */
	public AbstractSaMstrId() {
	}

	/** minimal constructor */
	public AbstractSaMstrId(String saDomain, String saNbr) {
		this.saDomain = saDomain;
		this.saNbr = saNbr;
	}

	/** full constructor */
	public AbstractSaMstrId(String saDomain, String saNbr, String saPrefix) {
		this.saDomain = saDomain;
		this.saNbr = saNbr;
		this.saPrefix = saPrefix;
	}

	// Property accessors

	public String getSaDomain() {
		return this.saDomain;
	}

	public void setSaDomain(String saDomain) {
		this.saDomain = saDomain;
	}

	public String getSaNbr() {
		return this.saNbr;
	}

	public void setSaNbr(String saNbr) {
		this.saNbr = saNbr;
	}

	public String getSaPrefix() {
		return this.saPrefix;
	}

	public void setSaPrefix(String saPrefix) {
		this.saPrefix = saPrefix;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSaMstrId))
			return false;
		AbstractSaMstrId castOther = (AbstractSaMstrId) other;

		return ((this.getSaDomain() == castOther.getSaDomain()) || (this
				.getSaDomain() != null
				&& castOther.getSaDomain() != null && this.getSaDomain()
				.equals(castOther.getSaDomain())))
				&& ((this.getSaNbr() == castOther.getSaNbr()) || (this
						.getSaNbr() != null
						&& castOther.getSaNbr() != null && this.getSaNbr()
						.equals(castOther.getSaNbr())))
				&& ((this.getSaPrefix() == castOther.getSaPrefix()) || (this
						.getSaPrefix() != null
						&& castOther.getSaPrefix() != null && this
						.getSaPrefix().equals(castOther.getSaPrefix())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSaDomain() == null ? 0 : this.getSaDomain().hashCode());
		result = 37 * result
				+ (getSaNbr() == null ? 0 : this.getSaNbr().hashCode());
		result = 37 * result
				+ (getSaPrefix() == null ? 0 : this.getSaPrefix().hashCode());
		return result;
	}

}