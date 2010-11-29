package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSodDetId entity provides the base persistence definition of the
 * SodDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSodDetId implements java.io.Serializable {

	// Fields

	private String sodDomain;
	private String sodNbr;
	private Integer sodLine;

	// Constructors

	/** default constructor */
	public AbstractSodDetId() {
	}

	/** minimal constructor */
	public AbstractSodDetId(String sodDomain, String sodNbr) {
		this.sodDomain = sodDomain;
		this.sodNbr = sodNbr;
	}

	/** full constructor */
	public AbstractSodDetId(String sodDomain, String sodNbr, Integer sodLine) {
		this.sodDomain = sodDomain;
		this.sodNbr = sodNbr;
		this.sodLine = sodLine;
	}

	// Property accessors

	public String getSodDomain() {
		return this.sodDomain;
	}

	public void setSodDomain(String sodDomain) {
		this.sodDomain = sodDomain;
	}

	public String getSodNbr() {
		return this.sodNbr;
	}

	public void setSodNbr(String sodNbr) {
		this.sodNbr = sodNbr;
	}

	public Integer getSodLine() {
		return this.sodLine;
	}

	public void setSodLine(Integer sodLine) {
		this.sodLine = sodLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSodDetId))
			return false;
		AbstractSodDetId castOther = (AbstractSodDetId) other;

		return ((this.getSodDomain() == castOther.getSodDomain()) || (this
				.getSodDomain() != null
				&& castOther.getSodDomain() != null && this.getSodDomain()
				.equals(castOther.getSodDomain())))
				&& ((this.getSodNbr() == castOther.getSodNbr()) || (this
						.getSodNbr() != null
						&& castOther.getSodNbr() != null && this.getSodNbr()
						.equals(castOther.getSodNbr())))
				&& ((this.getSodLine() == castOther.getSodLine()) || (this
						.getSodLine() != null
						&& castOther.getSodLine() != null && this.getSodLine()
						.equals(castOther.getSodLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSodDomain() == null ? 0 : this.getSodDomain().hashCode());
		result = 37 * result
				+ (getSodNbr() == null ? 0 : this.getSodNbr().hashCode());
		result = 37 * result
				+ (getSodLine() == null ? 0 : this.getSodLine().hashCode());
		return result;
	}

}