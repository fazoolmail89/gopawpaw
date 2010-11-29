package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgMstrId entity provides the base persistence definition of the
 * SgMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgMstrId implements java.io.Serializable {

	// Fields

	private String sgDomain;
	private String sgGrp;

	// Constructors

	/** default constructor */
	public AbstractSgMstrId() {
	}

	/** full constructor */
	public AbstractSgMstrId(String sgDomain, String sgGrp) {
		this.sgDomain = sgDomain;
		this.sgGrp = sgGrp;
	}

	// Property accessors

	public String getSgDomain() {
		return this.sgDomain;
	}

	public void setSgDomain(String sgDomain) {
		this.sgDomain = sgDomain;
	}

	public String getSgGrp() {
		return this.sgGrp;
	}

	public void setSgGrp(String sgGrp) {
		this.sgGrp = sgGrp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSgMstrId))
			return false;
		AbstractSgMstrId castOther = (AbstractSgMstrId) other;

		return ((this.getSgDomain() == castOther.getSgDomain()) || (this
				.getSgDomain() != null
				&& castOther.getSgDomain() != null && this.getSgDomain()
				.equals(castOther.getSgDomain())))
				&& ((this.getSgGrp() == castOther.getSgGrp()) || (this
						.getSgGrp() != null
						&& castOther.getSgGrp() != null && this.getSgGrp()
						.equals(castOther.getSgGrp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSgDomain() == null ? 0 : this.getSgDomain().hashCode());
		result = 37 * result
				+ (getSgGrp() == null ? 0 : this.getSgGrp().hashCode());
		return result;
	}

}