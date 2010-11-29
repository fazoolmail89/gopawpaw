package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractStxMstrId entity provides the base persistence definition of the
 * StxMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStxMstrId implements java.io.Serializable {

	// Fields

	private String stxDomain;
	private String stxTranType;
	private String stxKey;
	private String stxTaxCode;

	// Constructors

	/** default constructor */
	public AbstractStxMstrId() {
	}

	/** full constructor */
	public AbstractStxMstrId(String stxDomain, String stxTranType,
			String stxKey, String stxTaxCode) {
		this.stxDomain = stxDomain;
		this.stxTranType = stxTranType;
		this.stxKey = stxKey;
		this.stxTaxCode = stxTaxCode;
	}

	// Property accessors

	public String getStxDomain() {
		return this.stxDomain;
	}

	public void setStxDomain(String stxDomain) {
		this.stxDomain = stxDomain;
	}

	public String getStxTranType() {
		return this.stxTranType;
	}

	public void setStxTranType(String stxTranType) {
		this.stxTranType = stxTranType;
	}

	public String getStxKey() {
		return this.stxKey;
	}

	public void setStxKey(String stxKey) {
		this.stxKey = stxKey;
	}

	public String getStxTaxCode() {
		return this.stxTaxCode;
	}

	public void setStxTaxCode(String stxTaxCode) {
		this.stxTaxCode = stxTaxCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractStxMstrId))
			return false;
		AbstractStxMstrId castOther = (AbstractStxMstrId) other;

		return ((this.getStxDomain() == castOther.getStxDomain()) || (this
				.getStxDomain() != null
				&& castOther.getStxDomain() != null && this.getStxDomain()
				.equals(castOther.getStxDomain())))
				&& ((this.getStxTranType() == castOther.getStxTranType()) || (this
						.getStxTranType() != null
						&& castOther.getStxTranType() != null && this
						.getStxTranType().equals(castOther.getStxTranType())))
				&& ((this.getStxKey() == castOther.getStxKey()) || (this
						.getStxKey() != null
						&& castOther.getStxKey() != null && this.getStxKey()
						.equals(castOther.getStxKey())))
				&& ((this.getStxTaxCode() == castOther.getStxTaxCode()) || (this
						.getStxTaxCode() != null
						&& castOther.getStxTaxCode() != null && this
						.getStxTaxCode().equals(castOther.getStxTaxCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStxDomain() == null ? 0 : this.getStxDomain().hashCode());
		result = 37
				* result
				+ (getStxTranType() == null ? 0 : this.getStxTranType()
						.hashCode());
		result = 37 * result
				+ (getStxKey() == null ? 0 : this.getStxKey().hashCode());
		result = 37
				* result
				+ (getStxTaxCode() == null ? 0 : this.getStxTaxCode()
						.hashCode());
		return result;
	}

}