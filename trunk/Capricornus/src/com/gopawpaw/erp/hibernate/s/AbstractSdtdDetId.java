package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSdtdDetId entity provides the base persistence definition of the
 * SdtdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSdtdDetId implements java.io.Serializable {

	// Fields

	private String sdtdDomain;
	private String sdtdCode;
	private String sdtdTime;

	// Constructors

	/** default constructor */
	public AbstractSdtdDetId() {
	}

	/** full constructor */
	public AbstractSdtdDetId(String sdtdDomain, String sdtdCode, String sdtdTime) {
		this.sdtdDomain = sdtdDomain;
		this.sdtdCode = sdtdCode;
		this.sdtdTime = sdtdTime;
	}

	// Property accessors

	public String getSdtdDomain() {
		return this.sdtdDomain;
	}

	public void setSdtdDomain(String sdtdDomain) {
		this.sdtdDomain = sdtdDomain;
	}

	public String getSdtdCode() {
		return this.sdtdCode;
	}

	public void setSdtdCode(String sdtdCode) {
		this.sdtdCode = sdtdCode;
	}

	public String getSdtdTime() {
		return this.sdtdTime;
	}

	public void setSdtdTime(String sdtdTime) {
		this.sdtdTime = sdtdTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSdtdDetId))
			return false;
		AbstractSdtdDetId castOther = (AbstractSdtdDetId) other;

		return ((this.getSdtdDomain() == castOther.getSdtdDomain()) || (this
				.getSdtdDomain() != null
				&& castOther.getSdtdDomain() != null && this.getSdtdDomain()
				.equals(castOther.getSdtdDomain())))
				&& ((this.getSdtdCode() == castOther.getSdtdCode()) || (this
						.getSdtdCode() != null
						&& castOther.getSdtdCode() != null && this
						.getSdtdCode().equals(castOther.getSdtdCode())))
				&& ((this.getSdtdTime() == castOther.getSdtdTime()) || (this
						.getSdtdTime() != null
						&& castOther.getSdtdTime() != null && this
						.getSdtdTime().equals(castOther.getSdtdTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSdtdDomain() == null ? 0 : this.getSdtdDomain()
						.hashCode());
		result = 37 * result
				+ (getSdtdCode() == null ? 0 : this.getSdtdCode().hashCode());
		result = 37 * result
				+ (getSdtdTime() == null ? 0 : this.getSdtdTime().hashCode());
		return result;
	}

}