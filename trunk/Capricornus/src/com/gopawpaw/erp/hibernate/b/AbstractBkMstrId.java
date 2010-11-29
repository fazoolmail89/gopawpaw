package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBkMstrId entity provides the base persistence definition of the
 * BkMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkMstrId implements java.io.Serializable {

	// Fields

	private String bkDomain;
	private String bkCode;

	// Constructors

	/** default constructor */
	public AbstractBkMstrId() {
	}

	/** minimal constructor */
	public AbstractBkMstrId(String bkDomain) {
		this.bkDomain = bkDomain;
	}

	/** full constructor */
	public AbstractBkMstrId(String bkDomain, String bkCode) {
		this.bkDomain = bkDomain;
		this.bkCode = bkCode;
	}

	// Property accessors

	public String getBkDomain() {
		return this.bkDomain;
	}

	public void setBkDomain(String bkDomain) {
		this.bkDomain = bkDomain;
	}

	public String getBkCode() {
		return this.bkCode;
	}

	public void setBkCode(String bkCode) {
		this.bkCode = bkCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBkMstrId))
			return false;
		AbstractBkMstrId castOther = (AbstractBkMstrId) other;

		return ((this.getBkDomain() == castOther.getBkDomain()) || (this
				.getBkDomain() != null
				&& castOther.getBkDomain() != null && this.getBkDomain()
				.equals(castOther.getBkDomain())))
				&& ((this.getBkCode() == castOther.getBkCode()) || (this
						.getBkCode() != null
						&& castOther.getBkCode() != null && this.getBkCode()
						.equals(castOther.getBkCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBkDomain() == null ? 0 : this.getBkDomain().hashCode());
		result = 37 * result
				+ (getBkCode() == null ? 0 : this.getBkCode().hashCode());
		return result;
	}

}