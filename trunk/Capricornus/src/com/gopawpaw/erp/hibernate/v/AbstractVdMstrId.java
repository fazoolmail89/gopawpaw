package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVdMstrId entity provides the base persistence definition of the
 * VdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVdMstrId implements java.io.Serializable {

	// Fields

	private String vdDomain;
	private String vdAddr;

	// Constructors

	/** default constructor */
	public AbstractVdMstrId() {
	}

	/** minimal constructor */
	public AbstractVdMstrId(String vdDomain) {
		this.vdDomain = vdDomain;
	}

	/** full constructor */
	public AbstractVdMstrId(String vdDomain, String vdAddr) {
		this.vdDomain = vdDomain;
		this.vdAddr = vdAddr;
	}

	// Property accessors

	public String getVdDomain() {
		return this.vdDomain;
	}

	public void setVdDomain(String vdDomain) {
		this.vdDomain = vdDomain;
	}

	public String getVdAddr() {
		return this.vdAddr;
	}

	public void setVdAddr(String vdAddr) {
		this.vdAddr = vdAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVdMstrId))
			return false;
		AbstractVdMstrId castOther = (AbstractVdMstrId) other;

		return ((this.getVdDomain() == castOther.getVdDomain()) || (this
				.getVdDomain() != null
				&& castOther.getVdDomain() != null && this.getVdDomain()
				.equals(castOther.getVdDomain())))
				&& ((this.getVdAddr() == castOther.getVdAddr()) || (this
						.getVdAddr() != null
						&& castOther.getVdAddr() != null && this.getVdAddr()
						.equals(castOther.getVdAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVdDomain() == null ? 0 : this.getVdDomain().hashCode());
		result = 37 * result
				+ (getVdAddr() == null ? 0 : this.getVdAddr().hashCode());
		return result;
	}

}