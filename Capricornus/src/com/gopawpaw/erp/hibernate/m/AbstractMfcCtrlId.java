package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMfcCtrlId entity provides the base persistence definition of the
 * MfcCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMfcCtrlId implements java.io.Serializable {

	// Fields

	private String mfcDomain;
	private String mfcField;

	// Constructors

	/** default constructor */
	public AbstractMfcCtrlId() {
	}

	/** minimal constructor */
	public AbstractMfcCtrlId(String mfcDomain) {
		this.mfcDomain = mfcDomain;
	}

	/** full constructor */
	public AbstractMfcCtrlId(String mfcDomain, String mfcField) {
		this.mfcDomain = mfcDomain;
		this.mfcField = mfcField;
	}

	// Property accessors

	public String getMfcDomain() {
		return this.mfcDomain;
	}

	public void setMfcDomain(String mfcDomain) {
		this.mfcDomain = mfcDomain;
	}

	public String getMfcField() {
		return this.mfcField;
	}

	public void setMfcField(String mfcField) {
		this.mfcField = mfcField;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMfcCtrlId))
			return false;
		AbstractMfcCtrlId castOther = (AbstractMfcCtrlId) other;

		return ((this.getMfcDomain() == castOther.getMfcDomain()) || (this
				.getMfcDomain() != null
				&& castOther.getMfcDomain() != null && this.getMfcDomain()
				.equals(castOther.getMfcDomain())))
				&& ((this.getMfcField() == castOther.getMfcField()) || (this
						.getMfcField() != null
						&& castOther.getMfcField() != null && this
						.getMfcField().equals(castOther.getMfcField())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMfcDomain() == null ? 0 : this.getMfcDomain().hashCode());
		result = 37 * result
				+ (getMfcField() == null ? 0 : this.getMfcField().hashCode());
		return result;
	}

}