package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCmhHistId entity provides the base persistence definition of the
 * CmhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmhHistId implements java.io.Serializable {

	// Fields

	private String cmhDomain;
	private Integer cmhYear;
	private String cmhCust;

	// Constructors

	/** default constructor */
	public AbstractCmhHistId() {
	}

	/** minimal constructor */
	public AbstractCmhHistId(String cmhDomain) {
		this.cmhDomain = cmhDomain;
	}

	/** full constructor */
	public AbstractCmhHistId(String cmhDomain, Integer cmhYear, String cmhCust) {
		this.cmhDomain = cmhDomain;
		this.cmhYear = cmhYear;
		this.cmhCust = cmhCust;
	}

	// Property accessors

	public String getCmhDomain() {
		return this.cmhDomain;
	}

	public void setCmhDomain(String cmhDomain) {
		this.cmhDomain = cmhDomain;
	}

	public Integer getCmhYear() {
		return this.cmhYear;
	}

	public void setCmhYear(Integer cmhYear) {
		this.cmhYear = cmhYear;
	}

	public String getCmhCust() {
		return this.cmhCust;
	}

	public void setCmhCust(String cmhCust) {
		this.cmhCust = cmhCust;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCmhHistId))
			return false;
		AbstractCmhHistId castOther = (AbstractCmhHistId) other;

		return ((this.getCmhDomain() == castOther.getCmhDomain()) || (this
				.getCmhDomain() != null
				&& castOther.getCmhDomain() != null && this.getCmhDomain()
				.equals(castOther.getCmhDomain())))
				&& ((this.getCmhYear() == castOther.getCmhYear()) || (this
						.getCmhYear() != null
						&& castOther.getCmhYear() != null && this.getCmhYear()
						.equals(castOther.getCmhYear())))
				&& ((this.getCmhCust() == castOther.getCmhCust()) || (this
						.getCmhCust() != null
						&& castOther.getCmhCust() != null && this.getCmhCust()
						.equals(castOther.getCmhCust())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCmhDomain() == null ? 0 : this.getCmhDomain().hashCode());
		result = 37 * result
				+ (getCmhYear() == null ? 0 : this.getCmhYear().hashCode());
		result = 37 * result
				+ (getCmhCust() == null ? 0 : this.getCmhCust().hashCode());
		return result;
	}

}