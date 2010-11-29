package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIroDetId entity provides the base persistence definition of the
 * IroDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIroDetId implements java.io.Serializable {

	// Fields

	private String iroDomain;
	private String iroPart;
	private String iroSite;
	private String iroCostSet;
	private String iroRouting;
	private Integer iroOp;

	// Constructors

	/** default constructor */
	public AbstractIroDetId() {
	}

	/** full constructor */
	public AbstractIroDetId(String iroDomain, String iroPart, String iroSite,
			String iroCostSet, String iroRouting, Integer iroOp) {
		this.iroDomain = iroDomain;
		this.iroPart = iroPart;
		this.iroSite = iroSite;
		this.iroCostSet = iroCostSet;
		this.iroRouting = iroRouting;
		this.iroOp = iroOp;
	}

	// Property accessors

	public String getIroDomain() {
		return this.iroDomain;
	}

	public void setIroDomain(String iroDomain) {
		this.iroDomain = iroDomain;
	}

	public String getIroPart() {
		return this.iroPart;
	}

	public void setIroPart(String iroPart) {
		this.iroPart = iroPart;
	}

	public String getIroSite() {
		return this.iroSite;
	}

	public void setIroSite(String iroSite) {
		this.iroSite = iroSite;
	}

	public String getIroCostSet() {
		return this.iroCostSet;
	}

	public void setIroCostSet(String iroCostSet) {
		this.iroCostSet = iroCostSet;
	}

	public String getIroRouting() {
		return this.iroRouting;
	}

	public void setIroRouting(String iroRouting) {
		this.iroRouting = iroRouting;
	}

	public Integer getIroOp() {
		return this.iroOp;
	}

	public void setIroOp(Integer iroOp) {
		this.iroOp = iroOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIroDetId))
			return false;
		AbstractIroDetId castOther = (AbstractIroDetId) other;

		return ((this.getIroDomain() == castOther.getIroDomain()) || (this
				.getIroDomain() != null
				&& castOther.getIroDomain() != null && this.getIroDomain()
				.equals(castOther.getIroDomain())))
				&& ((this.getIroPart() == castOther.getIroPart()) || (this
						.getIroPart() != null
						&& castOther.getIroPart() != null && this.getIroPart()
						.equals(castOther.getIroPart())))
				&& ((this.getIroSite() == castOther.getIroSite()) || (this
						.getIroSite() != null
						&& castOther.getIroSite() != null && this.getIroSite()
						.equals(castOther.getIroSite())))
				&& ((this.getIroCostSet() == castOther.getIroCostSet()) || (this
						.getIroCostSet() != null
						&& castOther.getIroCostSet() != null && this
						.getIroCostSet().equals(castOther.getIroCostSet())))
				&& ((this.getIroRouting() == castOther.getIroRouting()) || (this
						.getIroRouting() != null
						&& castOther.getIroRouting() != null && this
						.getIroRouting().equals(castOther.getIroRouting())))
				&& ((this.getIroOp() == castOther.getIroOp()) || (this
						.getIroOp() != null
						&& castOther.getIroOp() != null && this.getIroOp()
						.equals(castOther.getIroOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIroDomain() == null ? 0 : this.getIroDomain().hashCode());
		result = 37 * result
				+ (getIroPart() == null ? 0 : this.getIroPart().hashCode());
		result = 37 * result
				+ (getIroSite() == null ? 0 : this.getIroSite().hashCode());
		result = 37
				* result
				+ (getIroCostSet() == null ? 0 : this.getIroCostSet()
						.hashCode());
		result = 37
				* result
				+ (getIroRouting() == null ? 0 : this.getIroRouting()
						.hashCode());
		result = 37 * result
				+ (getIroOp() == null ? 0 : this.getIroOp().hashCode());
		return result;
	}

}