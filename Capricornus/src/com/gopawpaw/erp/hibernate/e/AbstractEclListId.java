package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEclListId entity provides the base persistence definition of the
 * EclListId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEclListId implements java.io.Serializable {

	// Fields

	private String eclDomain;
	private String eclType;
	private String eclGroup;
	private String eclId;

	// Constructors

	/** default constructor */
	public AbstractEclListId() {
	}

	/** minimal constructor */
	public AbstractEclListId(String eclDomain) {
		this.eclDomain = eclDomain;
	}

	/** full constructor */
	public AbstractEclListId(String eclDomain, String eclType, String eclGroup,
			String eclId) {
		this.eclDomain = eclDomain;
		this.eclType = eclType;
		this.eclGroup = eclGroup;
		this.eclId = eclId;
	}

	// Property accessors

	public String getEclDomain() {
		return this.eclDomain;
	}

	public void setEclDomain(String eclDomain) {
		this.eclDomain = eclDomain;
	}

	public String getEclType() {
		return this.eclType;
	}

	public void setEclType(String eclType) {
		this.eclType = eclType;
	}

	public String getEclGroup() {
		return this.eclGroup;
	}

	public void setEclGroup(String eclGroup) {
		this.eclGroup = eclGroup;
	}

	public String getEclId() {
		return this.eclId;
	}

	public void setEclId(String eclId) {
		this.eclId = eclId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEclListId))
			return false;
		AbstractEclListId castOther = (AbstractEclListId) other;

		return ((this.getEclDomain() == castOther.getEclDomain()) || (this
				.getEclDomain() != null
				&& castOther.getEclDomain() != null && this.getEclDomain()
				.equals(castOther.getEclDomain())))
				&& ((this.getEclType() == castOther.getEclType()) || (this
						.getEclType() != null
						&& castOther.getEclType() != null && this.getEclType()
						.equals(castOther.getEclType())))
				&& ((this.getEclGroup() == castOther.getEclGroup()) || (this
						.getEclGroup() != null
						&& castOther.getEclGroup() != null && this
						.getEclGroup().equals(castOther.getEclGroup())))
				&& ((this.getEclId() == castOther.getEclId()) || (this
						.getEclId() != null
						&& castOther.getEclId() != null && this.getEclId()
						.equals(castOther.getEclId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEclDomain() == null ? 0 : this.getEclDomain().hashCode());
		result = 37 * result
				+ (getEclType() == null ? 0 : this.getEclType().hashCode());
		result = 37 * result
				+ (getEclGroup() == null ? 0 : this.getEclGroup().hashCode());
		result = 37 * result
				+ (getEclId() == null ? 0 : this.getEclId().hashCode());
		return result;
	}

}