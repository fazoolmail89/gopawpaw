package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIhHistId entity provides the base persistence definition of the
 * IhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIhHistId implements java.io.Serializable {

	// Fields

	private String ihDomain;
	private String ihInvNbr;
	private String ihNbr;

	// Constructors

	/** default constructor */
	public AbstractIhHistId() {
	}

	/** minimal constructor */
	public AbstractIhHistId(String ihDomain, String ihNbr) {
		this.ihDomain = ihDomain;
		this.ihNbr = ihNbr;
	}

	/** full constructor */
	public AbstractIhHistId(String ihDomain, String ihInvNbr, String ihNbr) {
		this.ihDomain = ihDomain;
		this.ihInvNbr = ihInvNbr;
		this.ihNbr = ihNbr;
	}

	// Property accessors

	public String getIhDomain() {
		return this.ihDomain;
	}

	public void setIhDomain(String ihDomain) {
		this.ihDomain = ihDomain;
	}

	public String getIhInvNbr() {
		return this.ihInvNbr;
	}

	public void setIhInvNbr(String ihInvNbr) {
		this.ihInvNbr = ihInvNbr;
	}

	public String getIhNbr() {
		return this.ihNbr;
	}

	public void setIhNbr(String ihNbr) {
		this.ihNbr = ihNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIhHistId))
			return false;
		AbstractIhHistId castOther = (AbstractIhHistId) other;

		return ((this.getIhDomain() == castOther.getIhDomain()) || (this
				.getIhDomain() != null
				&& castOther.getIhDomain() != null && this.getIhDomain()
				.equals(castOther.getIhDomain())))
				&& ((this.getIhInvNbr() == castOther.getIhInvNbr()) || (this
						.getIhInvNbr() != null
						&& castOther.getIhInvNbr() != null && this
						.getIhInvNbr().equals(castOther.getIhInvNbr())))
				&& ((this.getIhNbr() == castOther.getIhNbr()) || (this
						.getIhNbr() != null
						&& castOther.getIhNbr() != null && this.getIhNbr()
						.equals(castOther.getIhNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIhDomain() == null ? 0 : this.getIhDomain().hashCode());
		result = 37 * result
				+ (getIhInvNbr() == null ? 0 : this.getIhInvNbr().hashCode());
		result = 37 * result
				+ (getIhNbr() == null ? 0 : this.getIhNbr().hashCode());
		return result;
	}

}