package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEuMstrId entity provides the base persistence definition of the
 * EuMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEuMstrId implements java.io.Serializable {

	// Fields

	private String euDomain;
	private String euAddr;

	// Constructors

	/** default constructor */
	public AbstractEuMstrId() {
	}

	/** minimal constructor */
	public AbstractEuMstrId(String euDomain) {
		this.euDomain = euDomain;
	}

	/** full constructor */
	public AbstractEuMstrId(String euDomain, String euAddr) {
		this.euDomain = euDomain;
		this.euAddr = euAddr;
	}

	// Property accessors

	public String getEuDomain() {
		return this.euDomain;
	}

	public void setEuDomain(String euDomain) {
		this.euDomain = euDomain;
	}

	public String getEuAddr() {
		return this.euAddr;
	}

	public void setEuAddr(String euAddr) {
		this.euAddr = euAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEuMstrId))
			return false;
		AbstractEuMstrId castOther = (AbstractEuMstrId) other;

		return ((this.getEuDomain() == castOther.getEuDomain()) || (this
				.getEuDomain() != null
				&& castOther.getEuDomain() != null && this.getEuDomain()
				.equals(castOther.getEuDomain())))
				&& ((this.getEuAddr() == castOther.getEuAddr()) || (this
						.getEuAddr() != null
						&& castOther.getEuAddr() != null && this.getEuAddr()
						.equals(castOther.getEuAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEuDomain() == null ? 0 : this.getEuDomain().hashCode());
		result = 37 * result
				+ (getEuAddr() == null ? 0 : this.getEuAddr().hashCode());
		return result;
	}

}