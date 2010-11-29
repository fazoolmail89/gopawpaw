package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGritWkfId entity provides the base persistence definition of the
 * GritWkfId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGritWkfId implements java.io.Serializable {

	// Fields

	private String gritDomain;
	private String gritRunid;
	private String gritGlCode;

	// Constructors

	/** default constructor */
	public AbstractGritWkfId() {
	}

	/** minimal constructor */
	public AbstractGritWkfId(String gritDomain) {
		this.gritDomain = gritDomain;
	}

	/** full constructor */
	public AbstractGritWkfId(String gritDomain, String gritRunid,
			String gritGlCode) {
		this.gritDomain = gritDomain;
		this.gritRunid = gritRunid;
		this.gritGlCode = gritGlCode;
	}

	// Property accessors

	public String getGritDomain() {
		return this.gritDomain;
	}

	public void setGritDomain(String gritDomain) {
		this.gritDomain = gritDomain;
	}

	public String getGritRunid() {
		return this.gritRunid;
	}

	public void setGritRunid(String gritRunid) {
		this.gritRunid = gritRunid;
	}

	public String getGritGlCode() {
		return this.gritGlCode;
	}

	public void setGritGlCode(String gritGlCode) {
		this.gritGlCode = gritGlCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGritWkfId))
			return false;
		AbstractGritWkfId castOther = (AbstractGritWkfId) other;

		return ((this.getGritDomain() == castOther.getGritDomain()) || (this
				.getGritDomain() != null
				&& castOther.getGritDomain() != null && this.getGritDomain()
				.equals(castOther.getGritDomain())))
				&& ((this.getGritRunid() == castOther.getGritRunid()) || (this
						.getGritRunid() != null
						&& castOther.getGritRunid() != null && this
						.getGritRunid().equals(castOther.getGritRunid())))
				&& ((this.getGritGlCode() == castOther.getGritGlCode()) || (this
						.getGritGlCode() != null
						&& castOther.getGritGlCode() != null && this
						.getGritGlCode().equals(castOther.getGritGlCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGritDomain() == null ? 0 : this.getGritDomain()
						.hashCode());
		result = 37 * result
				+ (getGritRunid() == null ? 0 : this.getGritRunid().hashCode());
		result = 37
				* result
				+ (getGritGlCode() == null ? 0 : this.getGritGlCode()
						.hashCode());
		return result;
	}

}