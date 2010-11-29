package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAprMstrId entity provides the base persistence definition of the
 * AprMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAprMstrId implements java.io.Serializable {

	// Fields

	private String aprDomain;
	private String aprAppId;

	// Constructors

	/** default constructor */
	public AbstractAprMstrId() {
	}

	/** minimal constructor */
	public AbstractAprMstrId(String aprDomain) {
		this.aprDomain = aprDomain;
	}

	/** full constructor */
	public AbstractAprMstrId(String aprDomain, String aprAppId) {
		this.aprDomain = aprDomain;
		this.aprAppId = aprAppId;
	}

	// Property accessors

	public String getAprDomain() {
		return this.aprDomain;
	}

	public void setAprDomain(String aprDomain) {
		this.aprDomain = aprDomain;
	}

	public String getAprAppId() {
		return this.aprAppId;
	}

	public void setAprAppId(String aprAppId) {
		this.aprAppId = aprAppId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAprMstrId))
			return false;
		AbstractAprMstrId castOther = (AbstractAprMstrId) other;

		return ((this.getAprDomain() == castOther.getAprDomain()) || (this
				.getAprDomain() != null
				&& castOther.getAprDomain() != null && this.getAprDomain()
				.equals(castOther.getAprDomain())))
				&& ((this.getAprAppId() == castOther.getAprAppId()) || (this
						.getAprAppId() != null
						&& castOther.getAprAppId() != null && this
						.getAprAppId().equals(castOther.getAprAppId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAprDomain() == null ? 0 : this.getAprDomain().hashCode());
		result = 37 * result
				+ (getAprAppId() == null ? 0 : this.getAprAppId().hashCode());
		return result;
	}

}