package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqdDetId entity provides the base persistence definition of the
 * RqdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqdDetId implements java.io.Serializable {

	// Fields

	private String rqdDomain;
	private String rqdNbr;
	private Integer rqdLine;

	// Constructors

	/** default constructor */
	public AbstractRqdDetId() {
	}

	/** minimal constructor */
	public AbstractRqdDetId(String rqdDomain) {
		this.rqdDomain = rqdDomain;
	}

	/** full constructor */
	public AbstractRqdDetId(String rqdDomain, String rqdNbr, Integer rqdLine) {
		this.rqdDomain = rqdDomain;
		this.rqdNbr = rqdNbr;
		this.rqdLine = rqdLine;
	}

	// Property accessors

	public String getRqdDomain() {
		return this.rqdDomain;
	}

	public void setRqdDomain(String rqdDomain) {
		this.rqdDomain = rqdDomain;
	}

	public String getRqdNbr() {
		return this.rqdNbr;
	}

	public void setRqdNbr(String rqdNbr) {
		this.rqdNbr = rqdNbr;
	}

	public Integer getRqdLine() {
		return this.rqdLine;
	}

	public void setRqdLine(Integer rqdLine) {
		this.rqdLine = rqdLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqdDetId))
			return false;
		AbstractRqdDetId castOther = (AbstractRqdDetId) other;

		return ((this.getRqdDomain() == castOther.getRqdDomain()) || (this
				.getRqdDomain() != null
				&& castOther.getRqdDomain() != null && this.getRqdDomain()
				.equals(castOther.getRqdDomain())))
				&& ((this.getRqdNbr() == castOther.getRqdNbr()) || (this
						.getRqdNbr() != null
						&& castOther.getRqdNbr() != null && this.getRqdNbr()
						.equals(castOther.getRqdNbr())))
				&& ((this.getRqdLine() == castOther.getRqdLine()) || (this
						.getRqdLine() != null
						&& castOther.getRqdLine() != null && this.getRqdLine()
						.equals(castOther.getRqdLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqdDomain() == null ? 0 : this.getRqdDomain().hashCode());
		result = 37 * result
				+ (getRqdNbr() == null ? 0 : this.getRqdNbr().hashCode());
		result = 37 * result
				+ (getRqdLine() == null ? 0 : this.getRqdLine().hashCode());
		return result;
	}

}