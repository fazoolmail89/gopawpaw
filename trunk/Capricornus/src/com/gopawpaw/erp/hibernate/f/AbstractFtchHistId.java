package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFtchHistId entity provides the base persistence definition of the
 * FtchHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFtchHistId implements java.io.Serializable {

	// Fields

	private String ftchDomain;
	private Integer ftchTrnbr;

	// Constructors

	/** default constructor */
	public AbstractFtchHistId() {
	}

	/** minimal constructor */
	public AbstractFtchHistId(String ftchDomain) {
		this.ftchDomain = ftchDomain;
	}

	/** full constructor */
	public AbstractFtchHistId(String ftchDomain, Integer ftchTrnbr) {
		this.ftchDomain = ftchDomain;
		this.ftchTrnbr = ftchTrnbr;
	}

	// Property accessors

	public String getFtchDomain() {
		return this.ftchDomain;
	}

	public void setFtchDomain(String ftchDomain) {
		this.ftchDomain = ftchDomain;
	}

	public Integer getFtchTrnbr() {
		return this.ftchTrnbr;
	}

	public void setFtchTrnbr(Integer ftchTrnbr) {
		this.ftchTrnbr = ftchTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFtchHistId))
			return false;
		AbstractFtchHistId castOther = (AbstractFtchHistId) other;

		return ((this.getFtchDomain() == castOther.getFtchDomain()) || (this
				.getFtchDomain() != null
				&& castOther.getFtchDomain() != null && this.getFtchDomain()
				.equals(castOther.getFtchDomain())))
				&& ((this.getFtchTrnbr() == castOther.getFtchTrnbr()) || (this
						.getFtchTrnbr() != null
						&& castOther.getFtchTrnbr() != null && this
						.getFtchTrnbr().equals(castOther.getFtchTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFtchDomain() == null ? 0 : this.getFtchDomain()
						.hashCode());
		result = 37 * result
				+ (getFtchTrnbr() == null ? 0 : this.getFtchTrnbr().hashCode());
		return result;
	}

}