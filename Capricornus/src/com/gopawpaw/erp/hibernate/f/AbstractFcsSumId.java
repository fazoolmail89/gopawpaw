package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFcsSumId entity provides the base persistence definition of the
 * FcsSumId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcsSumId implements java.io.Serializable {

	// Fields

	private String fcsDomain;
	private String fcsPart;
	private String fcsSite;
	private Integer fcsYear;

	// Constructors

	/** default constructor */
	public AbstractFcsSumId() {
	}

	/** minimal constructor */
	public AbstractFcsSumId(String fcsDomain, String fcsPart, Integer fcsYear) {
		this.fcsDomain = fcsDomain;
		this.fcsPart = fcsPart;
		this.fcsYear = fcsYear;
	}

	/** full constructor */
	public AbstractFcsSumId(String fcsDomain, String fcsPart, String fcsSite,
			Integer fcsYear) {
		this.fcsDomain = fcsDomain;
		this.fcsPart = fcsPart;
		this.fcsSite = fcsSite;
		this.fcsYear = fcsYear;
	}

	// Property accessors

	public String getFcsDomain() {
		return this.fcsDomain;
	}

	public void setFcsDomain(String fcsDomain) {
		this.fcsDomain = fcsDomain;
	}

	public String getFcsPart() {
		return this.fcsPart;
	}

	public void setFcsPart(String fcsPart) {
		this.fcsPart = fcsPart;
	}

	public String getFcsSite() {
		return this.fcsSite;
	}

	public void setFcsSite(String fcsSite) {
		this.fcsSite = fcsSite;
	}

	public Integer getFcsYear() {
		return this.fcsYear;
	}

	public void setFcsYear(Integer fcsYear) {
		this.fcsYear = fcsYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFcsSumId))
			return false;
		AbstractFcsSumId castOther = (AbstractFcsSumId) other;

		return ((this.getFcsDomain() == castOther.getFcsDomain()) || (this
				.getFcsDomain() != null
				&& castOther.getFcsDomain() != null && this.getFcsDomain()
				.equals(castOther.getFcsDomain())))
				&& ((this.getFcsPart() == castOther.getFcsPart()) || (this
						.getFcsPart() != null
						&& castOther.getFcsPart() != null && this.getFcsPart()
						.equals(castOther.getFcsPart())))
				&& ((this.getFcsSite() == castOther.getFcsSite()) || (this
						.getFcsSite() != null
						&& castOther.getFcsSite() != null && this.getFcsSite()
						.equals(castOther.getFcsSite())))
				&& ((this.getFcsYear() == castOther.getFcsYear()) || (this
						.getFcsYear() != null
						&& castOther.getFcsYear() != null && this.getFcsYear()
						.equals(castOther.getFcsYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFcsDomain() == null ? 0 : this.getFcsDomain().hashCode());
		result = 37 * result
				+ (getFcsPart() == null ? 0 : this.getFcsPart().hashCode());
		result = 37 * result
				+ (getFcsSite() == null ? 0 : this.getFcsSite().hashCode());
		result = 37 * result
				+ (getFcsYear() == null ? 0 : this.getFcsYear().hashCode());
		return result;
	}

}