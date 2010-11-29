package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCcMstrId entity provides the base persistence definition of the
 * CcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCcMstrId implements java.io.Serializable {

	// Fields

	private String ccDomain;
	private String ccCtr;
	private Boolean ccActive;

	// Constructors

	/** default constructor */
	public AbstractCcMstrId() {
	}

	/** minimal constructor */
	public AbstractCcMstrId(String ccDomain) {
		this.ccDomain = ccDomain;
	}

	/** full constructor */
	public AbstractCcMstrId(String ccDomain, String ccCtr, Boolean ccActive) {
		this.ccDomain = ccDomain;
		this.ccCtr = ccCtr;
		this.ccActive = ccActive;
	}

	// Property accessors

	public String getCcDomain() {
		return this.ccDomain;
	}

	public void setCcDomain(String ccDomain) {
		this.ccDomain = ccDomain;
	}

	public String getCcCtr() {
		return this.ccCtr;
	}

	public void setCcCtr(String ccCtr) {
		this.ccCtr = ccCtr;
	}

	public Boolean getCcActive() {
		return this.ccActive;
	}

	public void setCcActive(Boolean ccActive) {
		this.ccActive = ccActive;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCcMstrId))
			return false;
		AbstractCcMstrId castOther = (AbstractCcMstrId) other;

		return ((this.getCcDomain() == castOther.getCcDomain()) || (this
				.getCcDomain() != null
				&& castOther.getCcDomain() != null && this.getCcDomain()
				.equals(castOther.getCcDomain())))
				&& ((this.getCcCtr() == castOther.getCcCtr()) || (this
						.getCcCtr() != null
						&& castOther.getCcCtr() != null && this.getCcCtr()
						.equals(castOther.getCcCtr())))
				&& ((this.getCcActive() == castOther.getCcActive()) || (this
						.getCcActive() != null
						&& castOther.getCcActive() != null && this
						.getCcActive().equals(castOther.getCcActive())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCcDomain() == null ? 0 : this.getCcDomain().hashCode());
		result = 37 * result
				+ (getCcCtr() == null ? 0 : this.getCcCtr().hashCode());
		result = 37 * result
				+ (getCcActive() == null ? 0 : this.getCcActive().hashCode());
		return result;
	}

}