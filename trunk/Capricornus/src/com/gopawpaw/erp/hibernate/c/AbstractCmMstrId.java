package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCmMstrId entity provides the base persistence definition of the
 * CmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmMstrId implements java.io.Serializable {

	// Fields

	private String cmDomain;
	private String cmAddr;

	// Constructors

	/** default constructor */
	public AbstractCmMstrId() {
	}

	/** full constructor */
	public AbstractCmMstrId(String cmDomain, String cmAddr) {
		this.cmDomain = cmDomain;
		this.cmAddr = cmAddr;
	}

	// Property accessors

	public String getCmDomain() {
		return this.cmDomain;
	}

	public void setCmDomain(String cmDomain) {
		this.cmDomain = cmDomain;
	}

	public String getCmAddr() {
		return this.cmAddr;
	}

	public void setCmAddr(String cmAddr) {
		this.cmAddr = cmAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCmMstrId))
			return false;
		AbstractCmMstrId castOther = (AbstractCmMstrId) other;

		return ((this.getCmDomain() == castOther.getCmDomain()) || (this
				.getCmDomain() != null
				&& castOther.getCmDomain() != null && this.getCmDomain()
				.equals(castOther.getCmDomain())))
				&& ((this.getCmAddr() == castOther.getCmAddr()) || (this
						.getCmAddr() != null
						&& castOther.getCmAddr() != null && this.getCmAddr()
						.equals(castOther.getCmAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCmDomain() == null ? 0 : this.getCmDomain().hashCode());
		result = 37 * result
				+ (getCmAddr() == null ? 0 : this.getCmAddr().hashCode());
		return result;
	}

}