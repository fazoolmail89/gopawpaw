package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSalhHistId entity provides the base persistence definition of the
 * SalhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSalhHistId implements java.io.Serializable {

	// Fields

	private String salhDomain;
	private Integer salhTrnbr;

	// Constructors

	/** default constructor */
	public AbstractSalhHistId() {
	}

	/** minimal constructor */
	public AbstractSalhHistId(String salhDomain) {
		this.salhDomain = salhDomain;
	}

	/** full constructor */
	public AbstractSalhHistId(String salhDomain, Integer salhTrnbr) {
		this.salhDomain = salhDomain;
		this.salhTrnbr = salhTrnbr;
	}

	// Property accessors

	public String getSalhDomain() {
		return this.salhDomain;
	}

	public void setSalhDomain(String salhDomain) {
		this.salhDomain = salhDomain;
	}

	public Integer getSalhTrnbr() {
		return this.salhTrnbr;
	}

	public void setSalhTrnbr(Integer salhTrnbr) {
		this.salhTrnbr = salhTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSalhHistId))
			return false;
		AbstractSalhHistId castOther = (AbstractSalhHistId) other;

		return ((this.getSalhDomain() == castOther.getSalhDomain()) || (this
				.getSalhDomain() != null
				&& castOther.getSalhDomain() != null && this.getSalhDomain()
				.equals(castOther.getSalhDomain())))
				&& ((this.getSalhTrnbr() == castOther.getSalhTrnbr()) || (this
						.getSalhTrnbr() != null
						&& castOther.getSalhTrnbr() != null && this
						.getSalhTrnbr().equals(castOther.getSalhTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSalhDomain() == null ? 0 : this.getSalhDomain()
						.hashCode());
		result = 37 * result
				+ (getSalhTrnbr() == null ? 0 : this.getSalhTrnbr().hashCode());
		return result;
	}

}