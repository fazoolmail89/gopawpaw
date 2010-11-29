package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPclMstrId entity provides the base persistence definition of the
 * PclMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPclMstrId implements java.io.Serializable {

	// Fields

	private String pclDomain;
	private String pclGroup;
	private String pclType;

	// Constructors

	/** default constructor */
	public AbstractPclMstrId() {
	}

	/** full constructor */
	public AbstractPclMstrId(String pclDomain, String pclGroup, String pclType) {
		this.pclDomain = pclDomain;
		this.pclGroup = pclGroup;
		this.pclType = pclType;
	}

	// Property accessors

	public String getPclDomain() {
		return this.pclDomain;
	}

	public void setPclDomain(String pclDomain) {
		this.pclDomain = pclDomain;
	}

	public String getPclGroup() {
		return this.pclGroup;
	}

	public void setPclGroup(String pclGroup) {
		this.pclGroup = pclGroup;
	}

	public String getPclType() {
		return this.pclType;
	}

	public void setPclType(String pclType) {
		this.pclType = pclType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPclMstrId))
			return false;
		AbstractPclMstrId castOther = (AbstractPclMstrId) other;

		return ((this.getPclDomain() == castOther.getPclDomain()) || (this
				.getPclDomain() != null
				&& castOther.getPclDomain() != null && this.getPclDomain()
				.equals(castOther.getPclDomain())))
				&& ((this.getPclGroup() == castOther.getPclGroup()) || (this
						.getPclGroup() != null
						&& castOther.getPclGroup() != null && this
						.getPclGroup().equals(castOther.getPclGroup())))
				&& ((this.getPclType() == castOther.getPclType()) || (this
						.getPclType() != null
						&& castOther.getPclType() != null && this.getPclType()
						.equals(castOther.getPclType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPclDomain() == null ? 0 : this.getPclDomain().hashCode());
		result = 37 * result
				+ (getPclGroup() == null ? 0 : this.getPclGroup().hashCode());
		result = 37 * result
				+ (getPclType() == null ? 0 : this.getPclType().hashCode());
		return result;
	}

}