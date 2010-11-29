package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSroMstrId entity provides the base persistence definition of the
 * SroMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSroMstrId implements java.io.Serializable {

	// Fields

	private String sroDomain;
	private String sroNbr;

	// Constructors

	/** default constructor */
	public AbstractSroMstrId() {
	}

	/** minimal constructor */
	public AbstractSroMstrId(String sroDomain) {
		this.sroDomain = sroDomain;
	}

	/** full constructor */
	public AbstractSroMstrId(String sroDomain, String sroNbr) {
		this.sroDomain = sroDomain;
		this.sroNbr = sroNbr;
	}

	// Property accessors

	public String getSroDomain() {
		return this.sroDomain;
	}

	public void setSroDomain(String sroDomain) {
		this.sroDomain = sroDomain;
	}

	public String getSroNbr() {
		return this.sroNbr;
	}

	public void setSroNbr(String sroNbr) {
		this.sroNbr = sroNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSroMstrId))
			return false;
		AbstractSroMstrId castOther = (AbstractSroMstrId) other;

		return ((this.getSroDomain() == castOther.getSroDomain()) || (this
				.getSroDomain() != null
				&& castOther.getSroDomain() != null && this.getSroDomain()
				.equals(castOther.getSroDomain())))
				&& ((this.getSroNbr() == castOther.getSroNbr()) || (this
						.getSroNbr() != null
						&& castOther.getSroNbr() != null && this.getSroNbr()
						.equals(castOther.getSroNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSroDomain() == null ? 0 : this.getSroDomain().hashCode());
		result = 37 * result
				+ (getSroNbr() == null ? 0 : this.getSroNbr().hashCode());
		return result;
	}

}