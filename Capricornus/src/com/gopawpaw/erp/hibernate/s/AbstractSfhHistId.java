package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSfhHistId entity provides the base persistence definition of the
 * SfhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSfhHistId implements java.io.Serializable {

	// Fields

	private String sfhDomain;
	private Integer sfhTrnbr;

	// Constructors

	/** default constructor */
	public AbstractSfhHistId() {
	}

	/** minimal constructor */
	public AbstractSfhHistId(String sfhDomain) {
		this.sfhDomain = sfhDomain;
	}

	/** full constructor */
	public AbstractSfhHistId(String sfhDomain, Integer sfhTrnbr) {
		this.sfhDomain = sfhDomain;
		this.sfhTrnbr = sfhTrnbr;
	}

	// Property accessors

	public String getSfhDomain() {
		return this.sfhDomain;
	}

	public void setSfhDomain(String sfhDomain) {
		this.sfhDomain = sfhDomain;
	}

	public Integer getSfhTrnbr() {
		return this.sfhTrnbr;
	}

	public void setSfhTrnbr(Integer sfhTrnbr) {
		this.sfhTrnbr = sfhTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSfhHistId))
			return false;
		AbstractSfhHistId castOther = (AbstractSfhHistId) other;

		return ((this.getSfhDomain() == castOther.getSfhDomain()) || (this
				.getSfhDomain() != null
				&& castOther.getSfhDomain() != null && this.getSfhDomain()
				.equals(castOther.getSfhDomain())))
				&& ((this.getSfhTrnbr() == castOther.getSfhTrnbr()) || (this
						.getSfhTrnbr() != null
						&& castOther.getSfhTrnbr() != null && this
						.getSfhTrnbr().equals(castOther.getSfhTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSfhDomain() == null ? 0 : this.getSfhDomain().hashCode());
		result = 37 * result
				+ (getSfhTrnbr() == null ? 0 : this.getSfhTrnbr().hashCode());
		return result;
	}

}