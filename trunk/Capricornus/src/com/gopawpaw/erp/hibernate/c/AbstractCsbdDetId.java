package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCsbdDetId entity provides the base persistence definition of the
 * CsbdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCsbdDetId implements java.io.Serializable {

	// Fields

	private String csbdDomain;
	private String csbdAddr;
	private String csbdBank;
	private String csbdType;

	// Constructors

	/** default constructor */
	public AbstractCsbdDetId() {
	}

	/** full constructor */
	public AbstractCsbdDetId(String csbdDomain, String csbdAddr,
			String csbdBank, String csbdType) {
		this.csbdDomain = csbdDomain;
		this.csbdAddr = csbdAddr;
		this.csbdBank = csbdBank;
		this.csbdType = csbdType;
	}

	// Property accessors

	public String getCsbdDomain() {
		return this.csbdDomain;
	}

	public void setCsbdDomain(String csbdDomain) {
		this.csbdDomain = csbdDomain;
	}

	public String getCsbdAddr() {
		return this.csbdAddr;
	}

	public void setCsbdAddr(String csbdAddr) {
		this.csbdAddr = csbdAddr;
	}

	public String getCsbdBank() {
		return this.csbdBank;
	}

	public void setCsbdBank(String csbdBank) {
		this.csbdBank = csbdBank;
	}

	public String getCsbdType() {
		return this.csbdType;
	}

	public void setCsbdType(String csbdType) {
		this.csbdType = csbdType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCsbdDetId))
			return false;
		AbstractCsbdDetId castOther = (AbstractCsbdDetId) other;

		return ((this.getCsbdDomain() == castOther.getCsbdDomain()) || (this
				.getCsbdDomain() != null
				&& castOther.getCsbdDomain() != null && this.getCsbdDomain()
				.equals(castOther.getCsbdDomain())))
				&& ((this.getCsbdAddr() == castOther.getCsbdAddr()) || (this
						.getCsbdAddr() != null
						&& castOther.getCsbdAddr() != null && this
						.getCsbdAddr().equals(castOther.getCsbdAddr())))
				&& ((this.getCsbdBank() == castOther.getCsbdBank()) || (this
						.getCsbdBank() != null
						&& castOther.getCsbdBank() != null && this
						.getCsbdBank().equals(castOther.getCsbdBank())))
				&& ((this.getCsbdType() == castOther.getCsbdType()) || (this
						.getCsbdType() != null
						&& castOther.getCsbdType() != null && this
						.getCsbdType().equals(castOther.getCsbdType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCsbdDomain() == null ? 0 : this.getCsbdDomain()
						.hashCode());
		result = 37 * result
				+ (getCsbdAddr() == null ? 0 : this.getCsbdAddr().hashCode());
		result = 37 * result
				+ (getCsbdBank() == null ? 0 : this.getCsbdBank().hashCode());
		result = 37 * result
				+ (getCsbdType() == null ? 0 : this.getCsbdType().hashCode());
		return result;
	}

}