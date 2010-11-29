package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPjdDetId entity provides the base persistence definition of the
 * PjdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjdDetId implements java.io.Serializable {

	// Fields

	private String pjdDomain;
	private String pjdNbr;
	private Integer pjdSubNbr;

	// Constructors

	/** default constructor */
	public AbstractPjdDetId() {
	}

	/** full constructor */
	public AbstractPjdDetId(String pjdDomain, String pjdNbr, Integer pjdSubNbr) {
		this.pjdDomain = pjdDomain;
		this.pjdNbr = pjdNbr;
		this.pjdSubNbr = pjdSubNbr;
	}

	// Property accessors

	public String getPjdDomain() {
		return this.pjdDomain;
	}

	public void setPjdDomain(String pjdDomain) {
		this.pjdDomain = pjdDomain;
	}

	public String getPjdNbr() {
		return this.pjdNbr;
	}

	public void setPjdNbr(String pjdNbr) {
		this.pjdNbr = pjdNbr;
	}

	public Integer getPjdSubNbr() {
		return this.pjdSubNbr;
	}

	public void setPjdSubNbr(Integer pjdSubNbr) {
		this.pjdSubNbr = pjdSubNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPjdDetId))
			return false;
		AbstractPjdDetId castOther = (AbstractPjdDetId) other;

		return ((this.getPjdDomain() == castOther.getPjdDomain()) || (this
				.getPjdDomain() != null
				&& castOther.getPjdDomain() != null && this.getPjdDomain()
				.equals(castOther.getPjdDomain())))
				&& ((this.getPjdNbr() == castOther.getPjdNbr()) || (this
						.getPjdNbr() != null
						&& castOther.getPjdNbr() != null && this.getPjdNbr()
						.equals(castOther.getPjdNbr())))
				&& ((this.getPjdSubNbr() == castOther.getPjdSubNbr()) || (this
						.getPjdSubNbr() != null
						&& castOther.getPjdSubNbr() != null && this
						.getPjdSubNbr().equals(castOther.getPjdSubNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPjdDomain() == null ? 0 : this.getPjdDomain().hashCode());
		result = 37 * result
				+ (getPjdNbr() == null ? 0 : this.getPjdNbr().hashCode());
		result = 37 * result
				+ (getPjdSubNbr() == null ? 0 : this.getPjdSubNbr().hashCode());
		return result;
	}

}