package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCkMstrId entity provides the base persistence definition of the
 * CkMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCkMstrId implements java.io.Serializable {

	// Fields

	private String ckDomain;
	private String ckRef;

	// Constructors

	/** default constructor */
	public AbstractCkMstrId() {
	}

	/** minimal constructor */
	public AbstractCkMstrId(String ckDomain) {
		this.ckDomain = ckDomain;
	}

	/** full constructor */
	public AbstractCkMstrId(String ckDomain, String ckRef) {
		this.ckDomain = ckDomain;
		this.ckRef = ckRef;
	}

	// Property accessors

	public String getCkDomain() {
		return this.ckDomain;
	}

	public void setCkDomain(String ckDomain) {
		this.ckDomain = ckDomain;
	}

	public String getCkRef() {
		return this.ckRef;
	}

	public void setCkRef(String ckRef) {
		this.ckRef = ckRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCkMstrId))
			return false;
		AbstractCkMstrId castOther = (AbstractCkMstrId) other;

		return ((this.getCkDomain() == castOther.getCkDomain()) || (this
				.getCkDomain() != null
				&& castOther.getCkDomain() != null && this.getCkDomain()
				.equals(castOther.getCkDomain())))
				&& ((this.getCkRef() == castOther.getCkRef()) || (this
						.getCkRef() != null
						&& castOther.getCkRef() != null && this.getCkRef()
						.equals(castOther.getCkRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCkDomain() == null ? 0 : this.getCkDomain().hashCode());
		result = 37 * result
				+ (getCkRef() == null ? 0 : this.getCkRef().hashCode());
		return result;
	}

}