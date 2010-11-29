package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDeclMstrId entity provides the base persistence definition of the
 * DeclMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDeclMstrId implements java.io.Serializable {

	// Fields

	private String declDomain;
	private String declAddr;

	// Constructors

	/** default constructor */
	public AbstractDeclMstrId() {
	}

	/** full constructor */
	public AbstractDeclMstrId(String declDomain, String declAddr) {
		this.declDomain = declDomain;
		this.declAddr = declAddr;
	}

	// Property accessors

	public String getDeclDomain() {
		return this.declDomain;
	}

	public void setDeclDomain(String declDomain) {
		this.declDomain = declDomain;
	}

	public String getDeclAddr() {
		return this.declAddr;
	}

	public void setDeclAddr(String declAddr) {
		this.declAddr = declAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDeclMstrId))
			return false;
		AbstractDeclMstrId castOther = (AbstractDeclMstrId) other;

		return ((this.getDeclDomain() == castOther.getDeclDomain()) || (this
				.getDeclDomain() != null
				&& castOther.getDeclDomain() != null && this.getDeclDomain()
				.equals(castOther.getDeclDomain())))
				&& ((this.getDeclAddr() == castOther.getDeclAddr()) || (this
						.getDeclAddr() != null
						&& castOther.getDeclAddr() != null && this
						.getDeclAddr().equals(castOther.getDeclAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDeclDomain() == null ? 0 : this.getDeclDomain()
						.hashCode());
		result = 37 * result
				+ (getDeclAddr() == null ? 0 : this.getDeclAddr().hashCode());
		return result;
	}

}