package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAtdMstrId entity provides the base persistence definition of the
 * AtdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtdMstrId implements java.io.Serializable {

	// Fields

	private String atdDomain;
	private String atdCode;

	// Constructors

	/** default constructor */
	public AbstractAtdMstrId() {
	}

	/** full constructor */
	public AbstractAtdMstrId(String atdDomain, String atdCode) {
		this.atdDomain = atdDomain;
		this.atdCode = atdCode;
	}

	// Property accessors

	public String getAtdDomain() {
		return this.atdDomain;
	}

	public void setAtdDomain(String atdDomain) {
		this.atdDomain = atdDomain;
	}

	public String getAtdCode() {
		return this.atdCode;
	}

	public void setAtdCode(String atdCode) {
		this.atdCode = atdCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtdMstrId))
			return false;
		AbstractAtdMstrId castOther = (AbstractAtdMstrId) other;

		return ((this.getAtdDomain() == castOther.getAtdDomain()) || (this
				.getAtdDomain() != null
				&& castOther.getAtdDomain() != null && this.getAtdDomain()
				.equals(castOther.getAtdDomain())))
				&& ((this.getAtdCode() == castOther.getAtdCode()) || (this
						.getAtdCode() != null
						&& castOther.getAtdCode() != null && this.getAtdCode()
						.equals(castOther.getAtdCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAtdDomain() == null ? 0 : this.getAtdDomain().hashCode());
		result = 37 * result
				+ (getAtdCode() == null ? 0 : this.getAtdCode().hashCode());
		return result;
	}

}