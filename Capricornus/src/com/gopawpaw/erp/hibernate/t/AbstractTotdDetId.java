package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTotdDetId entity provides the base persistence definition of the
 * TotdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTotdDetId implements java.io.Serializable {

	// Fields

	private String totdDomain;
	private String totdTermsCode;
	private String totdLcCharge;

	// Constructors

	/** default constructor */
	public AbstractTotdDetId() {
	}

	/** full constructor */
	public AbstractTotdDetId(String totdDomain, String totdTermsCode,
			String totdLcCharge) {
		this.totdDomain = totdDomain;
		this.totdTermsCode = totdTermsCode;
		this.totdLcCharge = totdLcCharge;
	}

	// Property accessors

	public String getTotdDomain() {
		return this.totdDomain;
	}

	public void setTotdDomain(String totdDomain) {
		this.totdDomain = totdDomain;
	}

	public String getTotdTermsCode() {
		return this.totdTermsCode;
	}

	public void setTotdTermsCode(String totdTermsCode) {
		this.totdTermsCode = totdTermsCode;
	}

	public String getTotdLcCharge() {
		return this.totdLcCharge;
	}

	public void setTotdLcCharge(String totdLcCharge) {
		this.totdLcCharge = totdLcCharge;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTotdDetId))
			return false;
		AbstractTotdDetId castOther = (AbstractTotdDetId) other;

		return ((this.getTotdDomain() == castOther.getTotdDomain()) || (this
				.getTotdDomain() != null
				&& castOther.getTotdDomain() != null && this.getTotdDomain()
				.equals(castOther.getTotdDomain())))
				&& ((this.getTotdTermsCode() == castOther.getTotdTermsCode()) || (this
						.getTotdTermsCode() != null
						&& castOther.getTotdTermsCode() != null && this
						.getTotdTermsCode()
						.equals(castOther.getTotdTermsCode())))
				&& ((this.getTotdLcCharge() == castOther.getTotdLcCharge()) || (this
						.getTotdLcCharge() != null
						&& castOther.getTotdLcCharge() != null && this
						.getTotdLcCharge().equals(castOther.getTotdLcCharge())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTotdDomain() == null ? 0 : this.getTotdDomain()
						.hashCode());
		result = 37
				* result
				+ (getTotdTermsCode() == null ? 0 : this.getTotdTermsCode()
						.hashCode());
		result = 37
				* result
				+ (getTotdLcCharge() == null ? 0 : this.getTotdLcCharge()
						.hashCode());
		return result;
	}

}