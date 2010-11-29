package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLsMstrId entity provides the base persistence definition of the
 * LsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLsMstrId implements java.io.Serializable {

	// Fields

	private String lsDomain;
	private String lsAddr;
	private String lsType;

	// Constructors

	/** default constructor */
	public AbstractLsMstrId() {
	}

	/** minimal constructor */
	public AbstractLsMstrId(String lsDomain, String lsType) {
		this.lsDomain = lsDomain;
		this.lsType = lsType;
	}

	/** full constructor */
	public AbstractLsMstrId(String lsDomain, String lsAddr, String lsType) {
		this.lsDomain = lsDomain;
		this.lsAddr = lsAddr;
		this.lsType = lsType;
	}

	// Property accessors

	public String getLsDomain() {
		return this.lsDomain;
	}

	public void setLsDomain(String lsDomain) {
		this.lsDomain = lsDomain;
	}

	public String getLsAddr() {
		return this.lsAddr;
	}

	public void setLsAddr(String lsAddr) {
		this.lsAddr = lsAddr;
	}

	public String getLsType() {
		return this.lsType;
	}

	public void setLsType(String lsType) {
		this.lsType = lsType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLsMstrId))
			return false;
		AbstractLsMstrId castOther = (AbstractLsMstrId) other;

		return ((this.getLsDomain() == castOther.getLsDomain()) || (this
				.getLsDomain() != null
				&& castOther.getLsDomain() != null && this.getLsDomain()
				.equals(castOther.getLsDomain())))
				&& ((this.getLsAddr() == castOther.getLsAddr()) || (this
						.getLsAddr() != null
						&& castOther.getLsAddr() != null && this.getLsAddr()
						.equals(castOther.getLsAddr())))
				&& ((this.getLsType() == castOther.getLsType()) || (this
						.getLsType() != null
						&& castOther.getLsType() != null && this.getLsType()
						.equals(castOther.getLsType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLsDomain() == null ? 0 : this.getLsDomain().hashCode());
		result = 37 * result
				+ (getLsAddr() == null ? 0 : this.getLsAddr().hashCode());
		result = 37 * result
				+ (getLsType() == null ? 0 : this.getLsType().hashCode());
		return result;
	}

}