package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSvMstrId entity provides the base persistence definition of the
 * SvMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSvMstrId implements java.io.Serializable {

	// Fields

	private String svDomain;
	private String svCode;
	private String svType;

	// Constructors

	/** default constructor */
	public AbstractSvMstrId() {
	}

	/** minimal constructor */
	public AbstractSvMstrId(String svDomain) {
		this.svDomain = svDomain;
	}

	/** full constructor */
	public AbstractSvMstrId(String svDomain, String svCode, String svType) {
		this.svDomain = svDomain;
		this.svCode = svCode;
		this.svType = svType;
	}

	// Property accessors

	public String getSvDomain() {
		return this.svDomain;
	}

	public void setSvDomain(String svDomain) {
		this.svDomain = svDomain;
	}

	public String getSvCode() {
		return this.svCode;
	}

	public void setSvCode(String svCode) {
		this.svCode = svCode;
	}

	public String getSvType() {
		return this.svType;
	}

	public void setSvType(String svType) {
		this.svType = svType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSvMstrId))
			return false;
		AbstractSvMstrId castOther = (AbstractSvMstrId) other;

		return ((this.getSvDomain() == castOther.getSvDomain()) || (this
				.getSvDomain() != null
				&& castOther.getSvDomain() != null && this.getSvDomain()
				.equals(castOther.getSvDomain())))
				&& ((this.getSvCode() == castOther.getSvCode()) || (this
						.getSvCode() != null
						&& castOther.getSvCode() != null && this.getSvCode()
						.equals(castOther.getSvCode())))
				&& ((this.getSvType() == castOther.getSvType()) || (this
						.getSvType() != null
						&& castOther.getSvType() != null && this.getSvType()
						.equals(castOther.getSvType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSvDomain() == null ? 0 : this.getSvDomain().hashCode());
		result = 37 * result
				+ (getSvCode() == null ? 0 : this.getSvCode().hashCode());
		result = 37 * result
				+ (getSvType() == null ? 0 : this.getSvType().hashCode());
		return result;
	}

}