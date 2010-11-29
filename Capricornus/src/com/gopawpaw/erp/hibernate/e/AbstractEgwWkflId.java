package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEgwWkflId entity provides the base persistence definition of the
 * EgwWkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgwWkflId implements java.io.Serializable {

	// Fields

	private String egwDomain;
	private String egwUserid;
	private String egwEngCode;

	// Constructors

	/** default constructor */
	public AbstractEgwWkflId() {
	}

	/** minimal constructor */
	public AbstractEgwWkflId(String egwDomain) {
		this.egwDomain = egwDomain;
	}

	/** full constructor */
	public AbstractEgwWkflId(String egwDomain, String egwUserid,
			String egwEngCode) {
		this.egwDomain = egwDomain;
		this.egwUserid = egwUserid;
		this.egwEngCode = egwEngCode;
	}

	// Property accessors

	public String getEgwDomain() {
		return this.egwDomain;
	}

	public void setEgwDomain(String egwDomain) {
		this.egwDomain = egwDomain;
	}

	public String getEgwUserid() {
		return this.egwUserid;
	}

	public void setEgwUserid(String egwUserid) {
		this.egwUserid = egwUserid;
	}

	public String getEgwEngCode() {
		return this.egwEngCode;
	}

	public void setEgwEngCode(String egwEngCode) {
		this.egwEngCode = egwEngCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEgwWkflId))
			return false;
		AbstractEgwWkflId castOther = (AbstractEgwWkflId) other;

		return ((this.getEgwDomain() == castOther.getEgwDomain()) || (this
				.getEgwDomain() != null
				&& castOther.getEgwDomain() != null && this.getEgwDomain()
				.equals(castOther.getEgwDomain())))
				&& ((this.getEgwUserid() == castOther.getEgwUserid()) || (this
						.getEgwUserid() != null
						&& castOther.getEgwUserid() != null && this
						.getEgwUserid().equals(castOther.getEgwUserid())))
				&& ((this.getEgwEngCode() == castOther.getEgwEngCode()) || (this
						.getEgwEngCode() != null
						&& castOther.getEgwEngCode() != null && this
						.getEgwEngCode().equals(castOther.getEgwEngCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEgwDomain() == null ? 0 : this.getEgwDomain().hashCode());
		result = 37 * result
				+ (getEgwUserid() == null ? 0 : this.getEgwUserid().hashCode());
		result = 37
				* result
				+ (getEgwEngCode() == null ? 0 : this.getEgwEngCode()
						.hashCode());
		return result;
	}

}