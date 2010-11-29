package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFcdMstrId entity provides the base persistence definition of the
 * FcdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcdMstrId implements java.io.Serializable {

	// Fields

	private String fcdDomain;
	private String fcdSvCode;
	private String fcdCaIntType;
	private String fcdFscCode;
	private String fcdEuType;

	// Constructors

	/** default constructor */
	public AbstractFcdMstrId() {
	}

	/** minimal constructor */
	public AbstractFcdMstrId(String fcdDomain) {
		this.fcdDomain = fcdDomain;
	}

	/** full constructor */
	public AbstractFcdMstrId(String fcdDomain, String fcdSvCode,
			String fcdCaIntType, String fcdFscCode, String fcdEuType) {
		this.fcdDomain = fcdDomain;
		this.fcdSvCode = fcdSvCode;
		this.fcdCaIntType = fcdCaIntType;
		this.fcdFscCode = fcdFscCode;
		this.fcdEuType = fcdEuType;
	}

	// Property accessors

	public String getFcdDomain() {
		return this.fcdDomain;
	}

	public void setFcdDomain(String fcdDomain) {
		this.fcdDomain = fcdDomain;
	}

	public String getFcdSvCode() {
		return this.fcdSvCode;
	}

	public void setFcdSvCode(String fcdSvCode) {
		this.fcdSvCode = fcdSvCode;
	}

	public String getFcdCaIntType() {
		return this.fcdCaIntType;
	}

	public void setFcdCaIntType(String fcdCaIntType) {
		this.fcdCaIntType = fcdCaIntType;
	}

	public String getFcdFscCode() {
		return this.fcdFscCode;
	}

	public void setFcdFscCode(String fcdFscCode) {
		this.fcdFscCode = fcdFscCode;
	}

	public String getFcdEuType() {
		return this.fcdEuType;
	}

	public void setFcdEuType(String fcdEuType) {
		this.fcdEuType = fcdEuType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFcdMstrId))
			return false;
		AbstractFcdMstrId castOther = (AbstractFcdMstrId) other;

		return ((this.getFcdDomain() == castOther.getFcdDomain()) || (this
				.getFcdDomain() != null
				&& castOther.getFcdDomain() != null && this.getFcdDomain()
				.equals(castOther.getFcdDomain())))
				&& ((this.getFcdSvCode() == castOther.getFcdSvCode()) || (this
						.getFcdSvCode() != null
						&& castOther.getFcdSvCode() != null && this
						.getFcdSvCode().equals(castOther.getFcdSvCode())))
				&& ((this.getFcdCaIntType() == castOther.getFcdCaIntType()) || (this
						.getFcdCaIntType() != null
						&& castOther.getFcdCaIntType() != null && this
						.getFcdCaIntType().equals(castOther.getFcdCaIntType())))
				&& ((this.getFcdFscCode() == castOther.getFcdFscCode()) || (this
						.getFcdFscCode() != null
						&& castOther.getFcdFscCode() != null && this
						.getFcdFscCode().equals(castOther.getFcdFscCode())))
				&& ((this.getFcdEuType() == castOther.getFcdEuType()) || (this
						.getFcdEuType() != null
						&& castOther.getFcdEuType() != null && this
						.getFcdEuType().equals(castOther.getFcdEuType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFcdDomain() == null ? 0 : this.getFcdDomain().hashCode());
		result = 37 * result
				+ (getFcdSvCode() == null ? 0 : this.getFcdSvCode().hashCode());
		result = 37
				* result
				+ (getFcdCaIntType() == null ? 0 : this.getFcdCaIntType()
						.hashCode());
		result = 37
				* result
				+ (getFcdFscCode() == null ? 0 : this.getFcdFscCode()
						.hashCode());
		result = 37 * result
				+ (getFcdEuType() == null ? 0 : this.getFcdEuType().hashCode());
		return result;
	}

}