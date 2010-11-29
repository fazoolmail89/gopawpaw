package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPjshHistId entity provides the base persistence definition of the
 * PjshHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjshHistId implements java.io.Serializable {

	// Fields

	private String pjshDomain;
	private Integer pjshTrnbr;

	// Constructors

	/** default constructor */
	public AbstractPjshHistId() {
	}

	/** full constructor */
	public AbstractPjshHistId(String pjshDomain, Integer pjshTrnbr) {
		this.pjshDomain = pjshDomain;
		this.pjshTrnbr = pjshTrnbr;
	}

	// Property accessors

	public String getPjshDomain() {
		return this.pjshDomain;
	}

	public void setPjshDomain(String pjshDomain) {
		this.pjshDomain = pjshDomain;
	}

	public Integer getPjshTrnbr() {
		return this.pjshTrnbr;
	}

	public void setPjshTrnbr(Integer pjshTrnbr) {
		this.pjshTrnbr = pjshTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPjshHistId))
			return false;
		AbstractPjshHistId castOther = (AbstractPjshHistId) other;

		return ((this.getPjshDomain() == castOther.getPjshDomain()) || (this
				.getPjshDomain() != null
				&& castOther.getPjshDomain() != null && this.getPjshDomain()
				.equals(castOther.getPjshDomain())))
				&& ((this.getPjshTrnbr() == castOther.getPjshTrnbr()) || (this
						.getPjshTrnbr() != null
						&& castOther.getPjshTrnbr() != null && this
						.getPjshTrnbr().equals(castOther.getPjshTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPjshDomain() == null ? 0 : this.getPjshDomain()
						.hashCode());
		result = 37 * result
				+ (getPjshTrnbr() == null ? 0 : this.getPjshTrnbr().hashCode());
		return result;
	}

}