package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCctrHistId entity provides the base persistence definition of the
 * CctrHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCctrHistId implements java.io.Serializable {

	// Fields

	private String cctrDomain;
	private Integer cctrTrnbr;

	// Constructors

	/** default constructor */
	public AbstractCctrHistId() {
	}

	/** full constructor */
	public AbstractCctrHistId(String cctrDomain, Integer cctrTrnbr) {
		this.cctrDomain = cctrDomain;
		this.cctrTrnbr = cctrTrnbr;
	}

	// Property accessors

	public String getCctrDomain() {
		return this.cctrDomain;
	}

	public void setCctrDomain(String cctrDomain) {
		this.cctrDomain = cctrDomain;
	}

	public Integer getCctrTrnbr() {
		return this.cctrTrnbr;
	}

	public void setCctrTrnbr(Integer cctrTrnbr) {
		this.cctrTrnbr = cctrTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCctrHistId))
			return false;
		AbstractCctrHistId castOther = (AbstractCctrHistId) other;

		return ((this.getCctrDomain() == castOther.getCctrDomain()) || (this
				.getCctrDomain() != null
				&& castOther.getCctrDomain() != null && this.getCctrDomain()
				.equals(castOther.getCctrDomain())))
				&& ((this.getCctrTrnbr() == castOther.getCctrTrnbr()) || (this
						.getCctrTrnbr() != null
						&& castOther.getCctrTrnbr() != null && this
						.getCctrTrnbr().equals(castOther.getCctrTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCctrDomain() == null ? 0 : this.getCctrDomain()
						.hashCode());
		result = 37 * result
				+ (getCctrTrnbr() == null ? 0 : this.getCctrTrnbr().hashCode());
		return result;
	}

}