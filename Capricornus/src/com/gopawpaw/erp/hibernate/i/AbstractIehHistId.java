package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIehHistId entity provides the base persistence definition of the
 * IehHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIehHistId implements java.io.Serializable {

	// Fields

	private String iehDomain;
	private Integer iehTransId;

	// Constructors

	/** default constructor */
	public AbstractIehHistId() {
	}

	/** minimal constructor */
	public AbstractIehHistId(String iehDomain) {
		this.iehDomain = iehDomain;
	}

	/** full constructor */
	public AbstractIehHistId(String iehDomain, Integer iehTransId) {
		this.iehDomain = iehDomain;
		this.iehTransId = iehTransId;
	}

	// Property accessors

	public String getIehDomain() {
		return this.iehDomain;
	}

	public void setIehDomain(String iehDomain) {
		this.iehDomain = iehDomain;
	}

	public Integer getIehTransId() {
		return this.iehTransId;
	}

	public void setIehTransId(Integer iehTransId) {
		this.iehTransId = iehTransId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIehHistId))
			return false;
		AbstractIehHistId castOther = (AbstractIehHistId) other;

		return ((this.getIehDomain() == castOther.getIehDomain()) || (this
				.getIehDomain() != null
				&& castOther.getIehDomain() != null && this.getIehDomain()
				.equals(castOther.getIehDomain())))
				&& ((this.getIehTransId() == castOther.getIehTransId()) || (this
						.getIehTransId() != null
						&& castOther.getIehTransId() != null && this
						.getIehTransId().equals(castOther.getIehTransId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIehDomain() == null ? 0 : this.getIehDomain().hashCode());
		result = 37
				* result
				+ (getIehTransId() == null ? 0 : this.getIehTransId()
						.hashCode());
		return result;
	}

}