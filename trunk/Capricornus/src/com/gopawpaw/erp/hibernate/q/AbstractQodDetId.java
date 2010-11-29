package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQodDetId entity provides the base persistence definition of the
 * QodDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQodDetId implements java.io.Serializable {

	// Fields

	private String qodDomain;
	private String qodNbr;
	private Integer qodLine;

	// Constructors

	/** default constructor */
	public AbstractQodDetId() {
	}

	/** minimal constructor */
	public AbstractQodDetId(String qodDomain, String qodNbr) {
		this.qodDomain = qodDomain;
		this.qodNbr = qodNbr;
	}

	/** full constructor */
	public AbstractQodDetId(String qodDomain, String qodNbr, Integer qodLine) {
		this.qodDomain = qodDomain;
		this.qodNbr = qodNbr;
		this.qodLine = qodLine;
	}

	// Property accessors

	public String getQodDomain() {
		return this.qodDomain;
	}

	public void setQodDomain(String qodDomain) {
		this.qodDomain = qodDomain;
	}

	public String getQodNbr() {
		return this.qodNbr;
	}

	public void setQodNbr(String qodNbr) {
		this.qodNbr = qodNbr;
	}

	public Integer getQodLine() {
		return this.qodLine;
	}

	public void setQodLine(Integer qodLine) {
		this.qodLine = qodLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQodDetId))
			return false;
		AbstractQodDetId castOther = (AbstractQodDetId) other;

		return ((this.getQodDomain() == castOther.getQodDomain()) || (this
				.getQodDomain() != null
				&& castOther.getQodDomain() != null && this.getQodDomain()
				.equals(castOther.getQodDomain())))
				&& ((this.getQodNbr() == castOther.getQodNbr()) || (this
						.getQodNbr() != null
						&& castOther.getQodNbr() != null && this.getQodNbr()
						.equals(castOther.getQodNbr())))
				&& ((this.getQodLine() == castOther.getQodLine()) || (this
						.getQodLine() != null
						&& castOther.getQodLine() != null && this.getQodLine()
						.equals(castOther.getQodLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQodDomain() == null ? 0 : this.getQodDomain().hashCode());
		result = 37 * result
				+ (getQodNbr() == null ? 0 : this.getQodNbr().hashCode());
		result = 37 * result
				+ (getQodLine() == null ? 0 : this.getQodLine().hashCode());
		return result;
	}

}