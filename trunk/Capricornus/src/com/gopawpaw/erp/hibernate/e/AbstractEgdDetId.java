package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEgdDetId entity provides the base persistence definition of the
 * EgdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgdDetId implements java.io.Serializable {

	// Fields

	private String egdDomain;
	private String egdEngCode;
	private Date egdStartEff;

	// Constructors

	/** default constructor */
	public AbstractEgdDetId() {
	}

	/** minimal constructor */
	public AbstractEgdDetId(String egdDomain) {
		this.egdDomain = egdDomain;
	}

	/** full constructor */
	public AbstractEgdDetId(String egdDomain, String egdEngCode,
			Date egdStartEff) {
		this.egdDomain = egdDomain;
		this.egdEngCode = egdEngCode;
		this.egdStartEff = egdStartEff;
	}

	// Property accessors

	public String getEgdDomain() {
		return this.egdDomain;
	}

	public void setEgdDomain(String egdDomain) {
		this.egdDomain = egdDomain;
	}

	public String getEgdEngCode() {
		return this.egdEngCode;
	}

	public void setEgdEngCode(String egdEngCode) {
		this.egdEngCode = egdEngCode;
	}

	public Date getEgdStartEff() {
		return this.egdStartEff;
	}

	public void setEgdStartEff(Date egdStartEff) {
		this.egdStartEff = egdStartEff;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEgdDetId))
			return false;
		AbstractEgdDetId castOther = (AbstractEgdDetId) other;

		return ((this.getEgdDomain() == castOther.getEgdDomain()) || (this
				.getEgdDomain() != null
				&& castOther.getEgdDomain() != null && this.getEgdDomain()
				.equals(castOther.getEgdDomain())))
				&& ((this.getEgdEngCode() == castOther.getEgdEngCode()) || (this
						.getEgdEngCode() != null
						&& castOther.getEgdEngCode() != null && this
						.getEgdEngCode().equals(castOther.getEgdEngCode())))
				&& ((this.getEgdStartEff() == castOther.getEgdStartEff()) || (this
						.getEgdStartEff() != null
						&& castOther.getEgdStartEff() != null && this
						.getEgdStartEff().equals(castOther.getEgdStartEff())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEgdDomain() == null ? 0 : this.getEgdDomain().hashCode());
		result = 37
				* result
				+ (getEgdEngCode() == null ? 0 : this.getEgdEngCode()
						.hashCode());
		result = 37
				* result
				+ (getEgdStartEff() == null ? 0 : this.getEgdStartEff()
						.hashCode());
		return result;
	}

}