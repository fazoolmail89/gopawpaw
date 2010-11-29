package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCrMstrId entity provides the base persistence definition of the
 * CrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCrMstrId implements java.io.Serializable {

	// Fields

	private String crDomain;
	private String crCode;
	private String crType;
	private String crCodeBeg;
	private String crCodeEnd;

	// Constructors

	/** default constructor */
	public AbstractCrMstrId() {
	}

	/** full constructor */
	public AbstractCrMstrId(String crDomain, String crCode, String crType,
			String crCodeBeg, String crCodeEnd) {
		this.crDomain = crDomain;
		this.crCode = crCode;
		this.crType = crType;
		this.crCodeBeg = crCodeBeg;
		this.crCodeEnd = crCodeEnd;
	}

	// Property accessors

	public String getCrDomain() {
		return this.crDomain;
	}

	public void setCrDomain(String crDomain) {
		this.crDomain = crDomain;
	}

	public String getCrCode() {
		return this.crCode;
	}

	public void setCrCode(String crCode) {
		this.crCode = crCode;
	}

	public String getCrType() {
		return this.crType;
	}

	public void setCrType(String crType) {
		this.crType = crType;
	}

	public String getCrCodeBeg() {
		return this.crCodeBeg;
	}

	public void setCrCodeBeg(String crCodeBeg) {
		this.crCodeBeg = crCodeBeg;
	}

	public String getCrCodeEnd() {
		return this.crCodeEnd;
	}

	public void setCrCodeEnd(String crCodeEnd) {
		this.crCodeEnd = crCodeEnd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCrMstrId))
			return false;
		AbstractCrMstrId castOther = (AbstractCrMstrId) other;

		return ((this.getCrDomain() == castOther.getCrDomain()) || (this
				.getCrDomain() != null
				&& castOther.getCrDomain() != null && this.getCrDomain()
				.equals(castOther.getCrDomain())))
				&& ((this.getCrCode() == castOther.getCrCode()) || (this
						.getCrCode() != null
						&& castOther.getCrCode() != null && this.getCrCode()
						.equals(castOther.getCrCode())))
				&& ((this.getCrType() == castOther.getCrType()) || (this
						.getCrType() != null
						&& castOther.getCrType() != null && this.getCrType()
						.equals(castOther.getCrType())))
				&& ((this.getCrCodeBeg() == castOther.getCrCodeBeg()) || (this
						.getCrCodeBeg() != null
						&& castOther.getCrCodeBeg() != null && this
						.getCrCodeBeg().equals(castOther.getCrCodeBeg())))
				&& ((this.getCrCodeEnd() == castOther.getCrCodeEnd()) || (this
						.getCrCodeEnd() != null
						&& castOther.getCrCodeEnd() != null && this
						.getCrCodeEnd().equals(castOther.getCrCodeEnd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCrDomain() == null ? 0 : this.getCrDomain().hashCode());
		result = 37 * result
				+ (getCrCode() == null ? 0 : this.getCrCode().hashCode());
		result = 37 * result
				+ (getCrType() == null ? 0 : this.getCrType().hashCode());
		result = 37 * result
				+ (getCrCodeBeg() == null ? 0 : this.getCrCodeBeg().hashCode());
		result = 37 * result
				+ (getCrCodeEnd() == null ? 0 : this.getCrCodeEnd().hashCode());
		return result;
	}

}