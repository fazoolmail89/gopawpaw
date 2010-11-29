package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVdfMstrId entity provides the base persistence definition of the
 * VdfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVdfMstrId implements java.io.Serializable {

	// Fields

	private String vdfDomain;
	private String vdfAddr;

	// Constructors

	/** default constructor */
	public AbstractVdfMstrId() {
	}

	/** full constructor */
	public AbstractVdfMstrId(String vdfDomain, String vdfAddr) {
		this.vdfDomain = vdfDomain;
		this.vdfAddr = vdfAddr;
	}

	// Property accessors

	public String getVdfDomain() {
		return this.vdfDomain;
	}

	public void setVdfDomain(String vdfDomain) {
		this.vdfDomain = vdfDomain;
	}

	public String getVdfAddr() {
		return this.vdfAddr;
	}

	public void setVdfAddr(String vdfAddr) {
		this.vdfAddr = vdfAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVdfMstrId))
			return false;
		AbstractVdfMstrId castOther = (AbstractVdfMstrId) other;

		return ((this.getVdfDomain() == castOther.getVdfDomain()) || (this
				.getVdfDomain() != null
				&& castOther.getVdfDomain() != null && this.getVdfDomain()
				.equals(castOther.getVdfDomain())))
				&& ((this.getVdfAddr() == castOther.getVdfAddr()) || (this
						.getVdfAddr() != null
						&& castOther.getVdfAddr() != null && this.getVdfAddr()
						.equals(castOther.getVdfAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVdfDomain() == null ? 0 : this.getVdfDomain().hashCode());
		result = 37 * result
				+ (getVdfAddr() == null ? 0 : this.getVdfAddr().hashCode());
		return result;
	}

}