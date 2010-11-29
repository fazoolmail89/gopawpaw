package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrldDetId entity provides the base persistence definition of the
 * TrldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrldDetId implements java.io.Serializable {

	// Fields

	private String trldDomain;
	private String trldCode;
	private String trldTaxType;

	// Constructors

	/** default constructor */
	public AbstractTrldDetId() {
	}

	/** minimal constructor */
	public AbstractTrldDetId(String trldDomain) {
		this.trldDomain = trldDomain;
	}

	/** full constructor */
	public AbstractTrldDetId(String trldDomain, String trldCode,
			String trldTaxType) {
		this.trldDomain = trldDomain;
		this.trldCode = trldCode;
		this.trldTaxType = trldTaxType;
	}

	// Property accessors

	public String getTrldDomain() {
		return this.trldDomain;
	}

	public void setTrldDomain(String trldDomain) {
		this.trldDomain = trldDomain;
	}

	public String getTrldCode() {
		return this.trldCode;
	}

	public void setTrldCode(String trldCode) {
		this.trldCode = trldCode;
	}

	public String getTrldTaxType() {
		return this.trldTaxType;
	}

	public void setTrldTaxType(String trldTaxType) {
		this.trldTaxType = trldTaxType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTrldDetId))
			return false;
		AbstractTrldDetId castOther = (AbstractTrldDetId) other;

		return ((this.getTrldDomain() == castOther.getTrldDomain()) || (this
				.getTrldDomain() != null
				&& castOther.getTrldDomain() != null && this.getTrldDomain()
				.equals(castOther.getTrldDomain())))
				&& ((this.getTrldCode() == castOther.getTrldCode()) || (this
						.getTrldCode() != null
						&& castOther.getTrldCode() != null && this
						.getTrldCode().equals(castOther.getTrldCode())))
				&& ((this.getTrldTaxType() == castOther.getTrldTaxType()) || (this
						.getTrldTaxType() != null
						&& castOther.getTrldTaxType() != null && this
						.getTrldTaxType().equals(castOther.getTrldTaxType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTrldDomain() == null ? 0 : this.getTrldDomain()
						.hashCode());
		result = 37 * result
				+ (getTrldCode() == null ? 0 : this.getTrldCode().hashCode());
		result = 37
				* result
				+ (getTrldTaxType() == null ? 0 : this.getTrldTaxType()
						.hashCode());
		return result;
	}

}