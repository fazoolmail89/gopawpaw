package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractComMstrId entity provides the base persistence definition of the
 * ComMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComMstrId implements java.io.Serializable {

	// Fields

	private String comDomain;
	private String comCommCode;

	// Constructors

	/** default constructor */
	public AbstractComMstrId() {
	}

	/** full constructor */
	public AbstractComMstrId(String comDomain, String comCommCode) {
		this.comDomain = comDomain;
		this.comCommCode = comCommCode;
	}

	// Property accessors

	public String getComDomain() {
		return this.comDomain;
	}

	public void setComDomain(String comDomain) {
		this.comDomain = comDomain;
	}

	public String getComCommCode() {
		return this.comCommCode;
	}

	public void setComCommCode(String comCommCode) {
		this.comCommCode = comCommCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractComMstrId))
			return false;
		AbstractComMstrId castOther = (AbstractComMstrId) other;

		return ((this.getComDomain() == castOther.getComDomain()) || (this
				.getComDomain() != null
				&& castOther.getComDomain() != null && this.getComDomain()
				.equals(castOther.getComDomain())))
				&& ((this.getComCommCode() == castOther.getComCommCode()) || (this
						.getComCommCode() != null
						&& castOther.getComCommCode() != null && this
						.getComCommCode().equals(castOther.getComCommCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getComDomain() == null ? 0 : this.getComDomain().hashCode());
		result = 37
				* result
				+ (getComCommCode() == null ? 0 : this.getComCommCode()
						.hashCode());
		return result;
	}

}