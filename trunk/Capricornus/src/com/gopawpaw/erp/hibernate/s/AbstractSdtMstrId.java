package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSdtMstrId entity provides the base persistence definition of the
 * SdtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSdtMstrId implements java.io.Serializable {

	// Fields

	private String sdtDomain;
	private String sdtCode;

	// Constructors

	/** default constructor */
	public AbstractSdtMstrId() {
	}

	/** full constructor */
	public AbstractSdtMstrId(String sdtDomain, String sdtCode) {
		this.sdtDomain = sdtDomain;
		this.sdtCode = sdtCode;
	}

	// Property accessors

	public String getSdtDomain() {
		return this.sdtDomain;
	}

	public void setSdtDomain(String sdtDomain) {
		this.sdtDomain = sdtDomain;
	}

	public String getSdtCode() {
		return this.sdtCode;
	}

	public void setSdtCode(String sdtCode) {
		this.sdtCode = sdtCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSdtMstrId))
			return false;
		AbstractSdtMstrId castOther = (AbstractSdtMstrId) other;

		return ((this.getSdtDomain() == castOther.getSdtDomain()) || (this
				.getSdtDomain() != null
				&& castOther.getSdtDomain() != null && this.getSdtDomain()
				.equals(castOther.getSdtDomain())))
				&& ((this.getSdtCode() == castOther.getSdtCode()) || (this
						.getSdtCode() != null
						&& castOther.getSdtCode() != null && this.getSdtCode()
						.equals(castOther.getSdtCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSdtDomain() == null ? 0 : this.getSdtDomain().hashCode());
		result = 37 * result
				+ (getSdtCode() == null ? 0 : this.getSdtCode().hashCode());
		return result;
	}

}