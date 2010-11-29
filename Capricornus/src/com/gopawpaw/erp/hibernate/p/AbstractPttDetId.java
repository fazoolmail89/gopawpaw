package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPttDetId entity provides the base persistence definition of the
 * PttDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPttDetId implements java.io.Serializable {

	// Fields

	private String pttDomain;
	private String pttPart;
	private String pttTaxType;

	// Constructors

	/** default constructor */
	public AbstractPttDetId() {
	}

	/** minimal constructor */
	public AbstractPttDetId(String pttDomain, String pttPart) {
		this.pttDomain = pttDomain;
		this.pttPart = pttPart;
	}

	/** full constructor */
	public AbstractPttDetId(String pttDomain, String pttPart, String pttTaxType) {
		this.pttDomain = pttDomain;
		this.pttPart = pttPart;
		this.pttTaxType = pttTaxType;
	}

	// Property accessors

	public String getPttDomain() {
		return this.pttDomain;
	}

	public void setPttDomain(String pttDomain) {
		this.pttDomain = pttDomain;
	}

	public String getPttPart() {
		return this.pttPart;
	}

	public void setPttPart(String pttPart) {
		this.pttPart = pttPart;
	}

	public String getPttTaxType() {
		return this.pttTaxType;
	}

	public void setPttTaxType(String pttTaxType) {
		this.pttTaxType = pttTaxType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPttDetId))
			return false;
		AbstractPttDetId castOther = (AbstractPttDetId) other;

		return ((this.getPttDomain() == castOther.getPttDomain()) || (this
				.getPttDomain() != null
				&& castOther.getPttDomain() != null && this.getPttDomain()
				.equals(castOther.getPttDomain())))
				&& ((this.getPttPart() == castOther.getPttPart()) || (this
						.getPttPart() != null
						&& castOther.getPttPart() != null && this.getPttPart()
						.equals(castOther.getPttPart())))
				&& ((this.getPttTaxType() == castOther.getPttTaxType()) || (this
						.getPttTaxType() != null
						&& castOther.getPttTaxType() != null && this
						.getPttTaxType().equals(castOther.getPttTaxType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPttDomain() == null ? 0 : this.getPttDomain().hashCode());
		result = 37 * result
				+ (getPttPart() == null ? 0 : this.getPttPart().hashCode());
		result = 37
				* result
				+ (getPttTaxType() == null ? 0 : this.getPttTaxType()
						.hashCode());
		return result;
	}

}