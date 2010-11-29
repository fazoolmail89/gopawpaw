package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGralDetId entity provides the base persistence definition of the
 * GralDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGralDetId implements java.io.Serializable {

	// Fields

	private String gralDomain;
	private String gralAnCode;
	private String gralLinkCode;
	private Double gralSeq;

	// Constructors

	/** default constructor */
	public AbstractGralDetId() {
	}

	/** minimal constructor */
	public AbstractGralDetId(String gralDomain) {
		this.gralDomain = gralDomain;
	}

	/** full constructor */
	public AbstractGralDetId(String gralDomain, String gralAnCode,
			String gralLinkCode, Double gralSeq) {
		this.gralDomain = gralDomain;
		this.gralAnCode = gralAnCode;
		this.gralLinkCode = gralLinkCode;
		this.gralSeq = gralSeq;
	}

	// Property accessors

	public String getGralDomain() {
		return this.gralDomain;
	}

	public void setGralDomain(String gralDomain) {
		this.gralDomain = gralDomain;
	}

	public String getGralAnCode() {
		return this.gralAnCode;
	}

	public void setGralAnCode(String gralAnCode) {
		this.gralAnCode = gralAnCode;
	}

	public String getGralLinkCode() {
		return this.gralLinkCode;
	}

	public void setGralLinkCode(String gralLinkCode) {
		this.gralLinkCode = gralLinkCode;
	}

	public Double getGralSeq() {
		return this.gralSeq;
	}

	public void setGralSeq(Double gralSeq) {
		this.gralSeq = gralSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGralDetId))
			return false;
		AbstractGralDetId castOther = (AbstractGralDetId) other;

		return ((this.getGralDomain() == castOther.getGralDomain()) || (this
				.getGralDomain() != null
				&& castOther.getGralDomain() != null && this.getGralDomain()
				.equals(castOther.getGralDomain())))
				&& ((this.getGralAnCode() == castOther.getGralAnCode()) || (this
						.getGralAnCode() != null
						&& castOther.getGralAnCode() != null && this
						.getGralAnCode().equals(castOther.getGralAnCode())))
				&& ((this.getGralLinkCode() == castOther.getGralLinkCode()) || (this
						.getGralLinkCode() != null
						&& castOther.getGralLinkCode() != null && this
						.getGralLinkCode().equals(castOther.getGralLinkCode())))
				&& ((this.getGralSeq() == castOther.getGralSeq()) || (this
						.getGralSeq() != null
						&& castOther.getGralSeq() != null && this.getGralSeq()
						.equals(castOther.getGralSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGralDomain() == null ? 0 : this.getGralDomain()
						.hashCode());
		result = 37
				* result
				+ (getGralAnCode() == null ? 0 : this.getGralAnCode()
						.hashCode());
		result = 37
				* result
				+ (getGralLinkCode() == null ? 0 : this.getGralLinkCode()
						.hashCode());
		result = 37 * result
				+ (getGralSeq() == null ? 0 : this.getGralSeq().hashCode());
		return result;
	}

}