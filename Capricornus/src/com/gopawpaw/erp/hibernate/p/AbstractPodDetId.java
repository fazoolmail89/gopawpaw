package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPodDetId entity provides the base persistence definition of the
 * PodDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPodDetId implements java.io.Serializable {

	// Fields

	private String podDomain;
	private String podNbr;
	private Integer podLine;

	// Constructors

	/** default constructor */
	public AbstractPodDetId() {
	}

	/** minimal constructor */
	public AbstractPodDetId(String podDomain, String podNbr) {
		this.podDomain = podDomain;
		this.podNbr = podNbr;
	}

	/** full constructor */
	public AbstractPodDetId(String podDomain, String podNbr, Integer podLine) {
		this.podDomain = podDomain;
		this.podNbr = podNbr;
		this.podLine = podLine;
	}

	// Property accessors

	public String getPodDomain() {
		return this.podDomain;
	}

	public void setPodDomain(String podDomain) {
		this.podDomain = podDomain;
	}

	public String getPodNbr() {
		return this.podNbr;
	}

	public void setPodNbr(String podNbr) {
		this.podNbr = podNbr;
	}

	public Integer getPodLine() {
		return this.podLine;
	}

	public void setPodLine(Integer podLine) {
		this.podLine = podLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPodDetId))
			return false;
		AbstractPodDetId castOther = (AbstractPodDetId) other;

		return ((this.getPodDomain() == castOther.getPodDomain()) || (this
				.getPodDomain() != null
				&& castOther.getPodDomain() != null && this.getPodDomain()
				.equals(castOther.getPodDomain())))
				&& ((this.getPodNbr() == castOther.getPodNbr()) || (this
						.getPodNbr() != null
						&& castOther.getPodNbr() != null && this.getPodNbr()
						.equals(castOther.getPodNbr())))
				&& ((this.getPodLine() == castOther.getPodLine()) || (this
						.getPodLine() != null
						&& castOther.getPodLine() != null && this.getPodLine()
						.equals(castOther.getPodLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPodDomain() == null ? 0 : this.getPodDomain().hashCode());
		result = 37 * result
				+ (getPodNbr() == null ? 0 : this.getPodNbr().hashCode());
		result = 37 * result
				+ (getPodLine() == null ? 0 : this.getPodLine().hashCode());
		return result;
	}

}