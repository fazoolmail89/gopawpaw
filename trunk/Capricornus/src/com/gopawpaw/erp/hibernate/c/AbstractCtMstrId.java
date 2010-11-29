package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCtMstrId entity provides the base persistence definition of the
 * CtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCtMstrId implements java.io.Serializable {

	// Fields

	private String ctDomain;
	private String ctCode;

	// Constructors

	/** default constructor */
	public AbstractCtMstrId() {
	}

	/** minimal constructor */
	public AbstractCtMstrId(String ctDomain) {
		this.ctDomain = ctDomain;
	}

	/** full constructor */
	public AbstractCtMstrId(String ctDomain, String ctCode) {
		this.ctDomain = ctDomain;
		this.ctCode = ctCode;
	}

	// Property accessors

	public String getCtDomain() {
		return this.ctDomain;
	}

	public void setCtDomain(String ctDomain) {
		this.ctDomain = ctDomain;
	}

	public String getCtCode() {
		return this.ctCode;
	}

	public void setCtCode(String ctCode) {
		this.ctCode = ctCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCtMstrId))
			return false;
		AbstractCtMstrId castOther = (AbstractCtMstrId) other;

		return ((this.getCtDomain() == castOther.getCtDomain()) || (this
				.getCtDomain() != null
				&& castOther.getCtDomain() != null && this.getCtDomain()
				.equals(castOther.getCtDomain())))
				&& ((this.getCtCode() == castOther.getCtCode()) || (this
						.getCtCode() != null
						&& castOther.getCtCode() != null && this.getCtCode()
						.equals(castOther.getCtCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCtDomain() == null ? 0 : this.getCtDomain().hashCode());
		result = 37 * result
				+ (getCtCode() == null ? 0 : this.getCtCode().hashCode());
		return result;
	}

}