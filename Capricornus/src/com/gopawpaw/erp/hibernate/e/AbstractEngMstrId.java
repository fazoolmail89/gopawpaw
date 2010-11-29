package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEngMstrId entity provides the base persistence definition of the
 * EngMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEngMstrId implements java.io.Serializable {

	// Fields

	private String engDomain;
	private String engAddr;

	// Constructors

	/** default constructor */
	public AbstractEngMstrId() {
	}

	/** minimal constructor */
	public AbstractEngMstrId(String engDomain) {
		this.engDomain = engDomain;
	}

	/** full constructor */
	public AbstractEngMstrId(String engDomain, String engAddr) {
		this.engDomain = engDomain;
		this.engAddr = engAddr;
	}

	// Property accessors

	public String getEngDomain() {
		return this.engDomain;
	}

	public void setEngDomain(String engDomain) {
		this.engDomain = engDomain;
	}

	public String getEngAddr() {
		return this.engAddr;
	}

	public void setEngAddr(String engAddr) {
		this.engAddr = engAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEngMstrId))
			return false;
		AbstractEngMstrId castOther = (AbstractEngMstrId) other;

		return ((this.getEngDomain() == castOther.getEngDomain()) || (this
				.getEngDomain() != null
				&& castOther.getEngDomain() != null && this.getEngDomain()
				.equals(castOther.getEngDomain())))
				&& ((this.getEngAddr() == castOther.getEngAddr()) || (this
						.getEngAddr() != null
						&& castOther.getEngAddr() != null && this.getEngAddr()
						.equals(castOther.getEngAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEngDomain() == null ? 0 : this.getEngDomain().hashCode());
		result = 37 * result
				+ (getEngAddr() == null ? 0 : this.getEngAddr().hashCode());
		return result;
	}

}