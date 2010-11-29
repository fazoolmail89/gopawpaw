package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRccMstrId entity provides the base persistence definition of the
 * RccMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRccMstrId implements java.io.Serializable {

	// Fields

	private String rccDomain;
	private String rccAddr;

	// Constructors

	/** default constructor */
	public AbstractRccMstrId() {
	}

	/** minimal constructor */
	public AbstractRccMstrId(String rccDomain) {
		this.rccDomain = rccDomain;
	}

	/** full constructor */
	public AbstractRccMstrId(String rccDomain, String rccAddr) {
		this.rccDomain = rccDomain;
		this.rccAddr = rccAddr;
	}

	// Property accessors

	public String getRccDomain() {
		return this.rccDomain;
	}

	public void setRccDomain(String rccDomain) {
		this.rccDomain = rccDomain;
	}

	public String getRccAddr() {
		return this.rccAddr;
	}

	public void setRccAddr(String rccAddr) {
		this.rccAddr = rccAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRccMstrId))
			return false;
		AbstractRccMstrId castOther = (AbstractRccMstrId) other;

		return ((this.getRccDomain() == castOther.getRccDomain()) || (this
				.getRccDomain() != null
				&& castOther.getRccDomain() != null && this.getRccDomain()
				.equals(castOther.getRccDomain())))
				&& ((this.getRccAddr() == castOther.getRccAddr()) || (this
						.getRccAddr() != null
						&& castOther.getRccAddr() != null && this.getRccAddr()
						.equals(castOther.getRccAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRccDomain() == null ? 0 : this.getRccDomain().hashCode());
		result = 37 * result
				+ (getRccAddr() == null ? 0 : this.getRccAddr().hashCode());
		return result;
	}

}