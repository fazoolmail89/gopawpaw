package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRndMstrId entity provides the base persistence definition of the
 * RndMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRndMstrId implements java.io.Serializable {

	// Fields

	private String rndDomain;
	private String rndRndMthd;

	// Constructors

	/** default constructor */
	public AbstractRndMstrId() {
	}

	/** minimal constructor */
	public AbstractRndMstrId(String rndDomain) {
		this.rndDomain = rndDomain;
	}

	/** full constructor */
	public AbstractRndMstrId(String rndDomain, String rndRndMthd) {
		this.rndDomain = rndDomain;
		this.rndRndMthd = rndRndMthd;
	}

	// Property accessors

	public String getRndDomain() {
		return this.rndDomain;
	}

	public void setRndDomain(String rndDomain) {
		this.rndDomain = rndDomain;
	}

	public String getRndRndMthd() {
		return this.rndRndMthd;
	}

	public void setRndRndMthd(String rndRndMthd) {
		this.rndRndMthd = rndRndMthd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRndMstrId))
			return false;
		AbstractRndMstrId castOther = (AbstractRndMstrId) other;

		return ((this.getRndDomain() == castOther.getRndDomain()) || (this
				.getRndDomain() != null
				&& castOther.getRndDomain() != null && this.getRndDomain()
				.equals(castOther.getRndDomain())))
				&& ((this.getRndRndMthd() == castOther.getRndRndMthd()) || (this
						.getRndRndMthd() != null
						&& castOther.getRndRndMthd() != null && this
						.getRndRndMthd().equals(castOther.getRndRndMthd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRndDomain() == null ? 0 : this.getRndDomain().hashCode());
		result = 37
				* result
				+ (getRndRndMthd() == null ? 0 : this.getRndRndMthd()
						.hashCode());
		return result;
	}

}