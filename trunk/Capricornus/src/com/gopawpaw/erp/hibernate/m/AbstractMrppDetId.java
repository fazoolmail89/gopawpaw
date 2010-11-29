package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMrppDetId entity provides the base persistence definition of the
 * MrppDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMrppDetId implements java.io.Serializable {

	// Fields

	private String mrppDomain;
	private Integer mrppDemandMrpKeyid;
	private Integer mrppSupplyMrpKeyid;

	// Constructors

	/** default constructor */
	public AbstractMrppDetId() {
	}

	/** full constructor */
	public AbstractMrppDetId(String mrppDomain, Integer mrppDemandMrpKeyid,
			Integer mrppSupplyMrpKeyid) {
		this.mrppDomain = mrppDomain;
		this.mrppDemandMrpKeyid = mrppDemandMrpKeyid;
		this.mrppSupplyMrpKeyid = mrppSupplyMrpKeyid;
	}

	// Property accessors

	public String getMrppDomain() {
		return this.mrppDomain;
	}

	public void setMrppDomain(String mrppDomain) {
		this.mrppDomain = mrppDomain;
	}

	public Integer getMrppDemandMrpKeyid() {
		return this.mrppDemandMrpKeyid;
	}

	public void setMrppDemandMrpKeyid(Integer mrppDemandMrpKeyid) {
		this.mrppDemandMrpKeyid = mrppDemandMrpKeyid;
	}

	public Integer getMrppSupplyMrpKeyid() {
		return this.mrppSupplyMrpKeyid;
	}

	public void setMrppSupplyMrpKeyid(Integer mrppSupplyMrpKeyid) {
		this.mrppSupplyMrpKeyid = mrppSupplyMrpKeyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMrppDetId))
			return false;
		AbstractMrppDetId castOther = (AbstractMrppDetId) other;

		return ((this.getMrppDomain() == castOther.getMrppDomain()) || (this
				.getMrppDomain() != null
				&& castOther.getMrppDomain() != null && this.getMrppDomain()
				.equals(castOther.getMrppDomain())))
				&& ((this.getMrppDemandMrpKeyid() == castOther
						.getMrppDemandMrpKeyid()) || (this
						.getMrppDemandMrpKeyid() != null
						&& castOther.getMrppDemandMrpKeyid() != null && this
						.getMrppDemandMrpKeyid().equals(
								castOther.getMrppDemandMrpKeyid())))
				&& ((this.getMrppSupplyMrpKeyid() == castOther
						.getMrppSupplyMrpKeyid()) || (this
						.getMrppSupplyMrpKeyid() != null
						&& castOther.getMrppSupplyMrpKeyid() != null && this
						.getMrppSupplyMrpKeyid().equals(
								castOther.getMrppSupplyMrpKeyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getMrppDomain() == null ? 0 : this.getMrppDomain()
						.hashCode());
		result = 37
				* result
				+ (getMrppDemandMrpKeyid() == null ? 0 : this
						.getMrppDemandMrpKeyid().hashCode());
		result = 37
				* result
				+ (getMrppSupplyMrpKeyid() == null ? 0 : this
						.getMrppSupplyMrpKeyid().hashCode());
		return result;
	}

}