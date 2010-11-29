package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSpMstrId entity provides the base persistence definition of the
 * SpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSpMstrId implements java.io.Serializable {

	// Fields

	private String spDomain;
	private String spAddr;

	// Constructors

	/** default constructor */
	public AbstractSpMstrId() {
	}

	/** minimal constructor */
	public AbstractSpMstrId(String spDomain) {
		this.spDomain = spDomain;
	}

	/** full constructor */
	public AbstractSpMstrId(String spDomain, String spAddr) {
		this.spDomain = spDomain;
		this.spAddr = spAddr;
	}

	// Property accessors

	public String getSpDomain() {
		return this.spDomain;
	}

	public void setSpDomain(String spDomain) {
		this.spDomain = spDomain;
	}

	public String getSpAddr() {
		return this.spAddr;
	}

	public void setSpAddr(String spAddr) {
		this.spAddr = spAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSpMstrId))
			return false;
		AbstractSpMstrId castOther = (AbstractSpMstrId) other;

		return ((this.getSpDomain() == castOther.getSpDomain()) || (this
				.getSpDomain() != null
				&& castOther.getSpDomain() != null && this.getSpDomain()
				.equals(castOther.getSpDomain())))
				&& ((this.getSpAddr() == castOther.getSpAddr()) || (this
						.getSpAddr() != null
						&& castOther.getSpAddr() != null && this.getSpAddr()
						.equals(castOther.getSpAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSpDomain() == null ? 0 : this.getSpDomain().hashCode());
		result = 37 * result
				+ (getSpAddr() == null ? 0 : this.getSpAddr().hashCode());
		return result;
	}

}