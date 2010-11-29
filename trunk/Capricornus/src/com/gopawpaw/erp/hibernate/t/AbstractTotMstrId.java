package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTotMstrId entity provides the base persistence definition of the
 * TotMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTotMstrId implements java.io.Serializable {

	// Fields

	private String totDomain;
	private String totTermsCode;

	// Constructors

	/** default constructor */
	public AbstractTotMstrId() {
	}

	/** full constructor */
	public AbstractTotMstrId(String totDomain, String totTermsCode) {
		this.totDomain = totDomain;
		this.totTermsCode = totTermsCode;
	}

	// Property accessors

	public String getTotDomain() {
		return this.totDomain;
	}

	public void setTotDomain(String totDomain) {
		this.totDomain = totDomain;
	}

	public String getTotTermsCode() {
		return this.totTermsCode;
	}

	public void setTotTermsCode(String totTermsCode) {
		this.totTermsCode = totTermsCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTotMstrId))
			return false;
		AbstractTotMstrId castOther = (AbstractTotMstrId) other;

		return ((this.getTotDomain() == castOther.getTotDomain()) || (this
				.getTotDomain() != null
				&& castOther.getTotDomain() != null && this.getTotDomain()
				.equals(castOther.getTotDomain())))
				&& ((this.getTotTermsCode() == castOther.getTotTermsCode()) || (this
						.getTotTermsCode() != null
						&& castOther.getTotTermsCode() != null && this
						.getTotTermsCode().equals(castOther.getTotTermsCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTotDomain() == null ? 0 : this.getTotDomain().hashCode());
		result = 37
				* result
				+ (getTotTermsCode() == null ? 0 : this.getTotTermsCode()
						.hashCode());
		return result;
	}

}