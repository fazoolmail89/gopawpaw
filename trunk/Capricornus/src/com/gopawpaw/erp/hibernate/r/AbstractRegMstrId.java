package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRegMstrId entity provides the base persistence definition of the
 * RegMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRegMstrId implements java.io.Serializable {

	// Fields

	private String regDomain;
	private String regCode;

	// Constructors

	/** default constructor */
	public AbstractRegMstrId() {
	}

	/** minimal constructor */
	public AbstractRegMstrId(String regDomain) {
		this.regDomain = regDomain;
	}

	/** full constructor */
	public AbstractRegMstrId(String regDomain, String regCode) {
		this.regDomain = regDomain;
		this.regCode = regCode;
	}

	// Property accessors

	public String getRegDomain() {
		return this.regDomain;
	}

	public void setRegDomain(String regDomain) {
		this.regDomain = regDomain;
	}

	public String getRegCode() {
		return this.regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRegMstrId))
			return false;
		AbstractRegMstrId castOther = (AbstractRegMstrId) other;

		return ((this.getRegDomain() == castOther.getRegDomain()) || (this
				.getRegDomain() != null
				&& castOther.getRegDomain() != null && this.getRegDomain()
				.equals(castOther.getRegDomain())))
				&& ((this.getRegCode() == castOther.getRegCode()) || (this
						.getRegCode() != null
						&& castOther.getRegCode() != null && this.getRegCode()
						.equals(castOther.getRegCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRegDomain() == null ? 0 : this.getRegDomain().hashCode());
		result = 37 * result
				+ (getRegCode() == null ? 0 : this.getRegCode().hashCode());
		return result;
	}

}