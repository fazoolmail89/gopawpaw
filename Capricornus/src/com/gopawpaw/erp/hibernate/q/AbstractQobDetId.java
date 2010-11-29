package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQobDetId entity provides the base persistence definition of the
 * QobDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQobDetId implements java.io.Serializable {

	// Fields

	private String qobDomain;
	private String qobNbr;
	private Integer qobLine;
	private String qobFeature;
	private String qobPart;

	// Constructors

	/** default constructor */
	public AbstractQobDetId() {
	}

	/** minimal constructor */
	public AbstractQobDetId(String qobDomain) {
		this.qobDomain = qobDomain;
	}

	/** full constructor */
	public AbstractQobDetId(String qobDomain, String qobNbr, Integer qobLine,
			String qobFeature, String qobPart) {
		this.qobDomain = qobDomain;
		this.qobNbr = qobNbr;
		this.qobLine = qobLine;
		this.qobFeature = qobFeature;
		this.qobPart = qobPart;
	}

	// Property accessors

	public String getQobDomain() {
		return this.qobDomain;
	}

	public void setQobDomain(String qobDomain) {
		this.qobDomain = qobDomain;
	}

	public String getQobNbr() {
		return this.qobNbr;
	}

	public void setQobNbr(String qobNbr) {
		this.qobNbr = qobNbr;
	}

	public Integer getQobLine() {
		return this.qobLine;
	}

	public void setQobLine(Integer qobLine) {
		this.qobLine = qobLine;
	}

	public String getQobFeature() {
		return this.qobFeature;
	}

	public void setQobFeature(String qobFeature) {
		this.qobFeature = qobFeature;
	}

	public String getQobPart() {
		return this.qobPart;
	}

	public void setQobPart(String qobPart) {
		this.qobPart = qobPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQobDetId))
			return false;
		AbstractQobDetId castOther = (AbstractQobDetId) other;

		return ((this.getQobDomain() == castOther.getQobDomain()) || (this
				.getQobDomain() != null
				&& castOther.getQobDomain() != null && this.getQobDomain()
				.equals(castOther.getQobDomain())))
				&& ((this.getQobNbr() == castOther.getQobNbr()) || (this
						.getQobNbr() != null
						&& castOther.getQobNbr() != null && this.getQobNbr()
						.equals(castOther.getQobNbr())))
				&& ((this.getQobLine() == castOther.getQobLine()) || (this
						.getQobLine() != null
						&& castOther.getQobLine() != null && this.getQobLine()
						.equals(castOther.getQobLine())))
				&& ((this.getQobFeature() == castOther.getQobFeature()) || (this
						.getQobFeature() != null
						&& castOther.getQobFeature() != null && this
						.getQobFeature().equals(castOther.getQobFeature())))
				&& ((this.getQobPart() == castOther.getQobPart()) || (this
						.getQobPart() != null
						&& castOther.getQobPart() != null && this.getQobPart()
						.equals(castOther.getQobPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQobDomain() == null ? 0 : this.getQobDomain().hashCode());
		result = 37 * result
				+ (getQobNbr() == null ? 0 : this.getQobNbr().hashCode());
		result = 37 * result
				+ (getQobLine() == null ? 0 : this.getQobLine().hashCode());
		result = 37
				* result
				+ (getQobFeature() == null ? 0 : this.getQobFeature()
						.hashCode());
		result = 37 * result
				+ (getQobPart() == null ? 0 : this.getQobPart().hashCode());
		return result;
	}

}