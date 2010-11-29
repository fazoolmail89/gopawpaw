package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsMstrId entity provides the base persistence definition of the
 * CsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsMstrId implements java.io.Serializable {

	// Fields

	private String csDomain;
	private String csSet;

	// Constructors

	/** default constructor */
	public AbstractCsMstrId() {
	}

	/** minimal constructor */
	public AbstractCsMstrId(String csDomain) {
		this.csDomain = csDomain;
	}

	/** full constructor */
	public AbstractCsMstrId(String csDomain, String csSet) {
		this.csDomain = csDomain;
		this.csSet = csSet;
	}

	// Property accessors

	public String getCsDomain() {
		return this.csDomain;
	}

	public void setCsDomain(String csDomain) {
		this.csDomain = csDomain;
	}

	public String getCsSet() {
		return this.csSet;
	}

	public void setCsSet(String csSet) {
		this.csSet = csSet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCsMstrId))
			return false;
		AbstractCsMstrId castOther = (AbstractCsMstrId) other;

		return ((this.getCsDomain() == castOther.getCsDomain()) || (this
				.getCsDomain() != null
				&& castOther.getCsDomain() != null && this.getCsDomain()
				.equals(castOther.getCsDomain())))
				&& ((this.getCsSet() == castOther.getCsSet()) || (this
						.getCsSet() != null
						&& castOther.getCsSet() != null && this.getCsSet()
						.equals(castOther.getCsSet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCsDomain() == null ? 0 : this.getCsDomain().hashCode());
		result = 37 * result
				+ (getCsSet() == null ? 0 : this.getCsSet().hashCode());
		return result;
	}

}