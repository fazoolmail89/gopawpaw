package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAnsDetId entity provides the base persistence definition of the
 * AnsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnsDetId implements java.io.Serializable {

	// Fields

	private String ansDomain;
	private String ansType;
	private String ansCode;
	private String ansField;
	private String ansSelLow;

	// Constructors

	/** default constructor */
	public AbstractAnsDetId() {
	}

	/** minimal constructor */
	public AbstractAnsDetId(String ansDomain) {
		this.ansDomain = ansDomain;
	}

	/** full constructor */
	public AbstractAnsDetId(String ansDomain, String ansType, String ansCode,
			String ansField, String ansSelLow) {
		this.ansDomain = ansDomain;
		this.ansType = ansType;
		this.ansCode = ansCode;
		this.ansField = ansField;
		this.ansSelLow = ansSelLow;
	}

	// Property accessors

	public String getAnsDomain() {
		return this.ansDomain;
	}

	public void setAnsDomain(String ansDomain) {
		this.ansDomain = ansDomain;
	}

	public String getAnsType() {
		return this.ansType;
	}

	public void setAnsType(String ansType) {
		this.ansType = ansType;
	}

	public String getAnsCode() {
		return this.ansCode;
	}

	public void setAnsCode(String ansCode) {
		this.ansCode = ansCode;
	}

	public String getAnsField() {
		return this.ansField;
	}

	public void setAnsField(String ansField) {
		this.ansField = ansField;
	}

	public String getAnsSelLow() {
		return this.ansSelLow;
	}

	public void setAnsSelLow(String ansSelLow) {
		this.ansSelLow = ansSelLow;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAnsDetId))
			return false;
		AbstractAnsDetId castOther = (AbstractAnsDetId) other;

		return ((this.getAnsDomain() == castOther.getAnsDomain()) || (this
				.getAnsDomain() != null
				&& castOther.getAnsDomain() != null && this.getAnsDomain()
				.equals(castOther.getAnsDomain())))
				&& ((this.getAnsType() == castOther.getAnsType()) || (this
						.getAnsType() != null
						&& castOther.getAnsType() != null && this.getAnsType()
						.equals(castOther.getAnsType())))
				&& ((this.getAnsCode() == castOther.getAnsCode()) || (this
						.getAnsCode() != null
						&& castOther.getAnsCode() != null && this.getAnsCode()
						.equals(castOther.getAnsCode())))
				&& ((this.getAnsField() == castOther.getAnsField()) || (this
						.getAnsField() != null
						&& castOther.getAnsField() != null && this
						.getAnsField().equals(castOther.getAnsField())))
				&& ((this.getAnsSelLow() == castOther.getAnsSelLow()) || (this
						.getAnsSelLow() != null
						&& castOther.getAnsSelLow() != null && this
						.getAnsSelLow().equals(castOther.getAnsSelLow())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAnsDomain() == null ? 0 : this.getAnsDomain().hashCode());
		result = 37 * result
				+ (getAnsType() == null ? 0 : this.getAnsType().hashCode());
		result = 37 * result
				+ (getAnsCode() == null ? 0 : this.getAnsCode().hashCode());
		result = 37 * result
				+ (getAnsField() == null ? 0 : this.getAnsField().hashCode());
		result = 37 * result
				+ (getAnsSelLow() == null ? 0 : this.getAnsSelLow().hashCode());
		return result;
	}

}