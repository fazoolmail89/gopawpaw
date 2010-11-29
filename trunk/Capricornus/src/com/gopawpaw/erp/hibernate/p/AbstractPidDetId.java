package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPidDetId entity provides the base persistence definition of the
 * PidDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPidDetId implements java.io.Serializable {

	// Fields

	private String pidDomain;
	private String pidListId;
	private Double pidQty;

	// Constructors

	/** default constructor */
	public AbstractPidDetId() {
	}

	/** minimal constructor */
	public AbstractPidDetId(String pidDomain) {
		this.pidDomain = pidDomain;
	}

	/** full constructor */
	public AbstractPidDetId(String pidDomain, String pidListId, Double pidQty) {
		this.pidDomain = pidDomain;
		this.pidListId = pidListId;
		this.pidQty = pidQty;
	}

	// Property accessors

	public String getPidDomain() {
		return this.pidDomain;
	}

	public void setPidDomain(String pidDomain) {
		this.pidDomain = pidDomain;
	}

	public String getPidListId() {
		return this.pidListId;
	}

	public void setPidListId(String pidListId) {
		this.pidListId = pidListId;
	}

	public Double getPidQty() {
		return this.pidQty;
	}

	public void setPidQty(Double pidQty) {
		this.pidQty = pidQty;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPidDetId))
			return false;
		AbstractPidDetId castOther = (AbstractPidDetId) other;

		return ((this.getPidDomain() == castOther.getPidDomain()) || (this
				.getPidDomain() != null
				&& castOther.getPidDomain() != null && this.getPidDomain()
				.equals(castOther.getPidDomain())))
				&& ((this.getPidListId() == castOther.getPidListId()) || (this
						.getPidListId() != null
						&& castOther.getPidListId() != null && this
						.getPidListId().equals(castOther.getPidListId())))
				&& ((this.getPidQty() == castOther.getPidQty()) || (this
						.getPidQty() != null
						&& castOther.getPidQty() != null && this.getPidQty()
						.equals(castOther.getPidQty())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPidDomain() == null ? 0 : this.getPidDomain().hashCode());
		result = 37 * result
				+ (getPidListId() == null ? 0 : this.getPidListId().hashCode());
		result = 37 * result
				+ (getPidQty() == null ? 0 : this.getPidQty().hashCode());
		return result;
	}

}