package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFrzdDetId entity provides the base persistence definition of the
 * FrzdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrzdDetId implements java.io.Serializable {

	// Fields

	private String frzdDomain;
	private String frzdFrList;
	private String frzdSite;
	private String frzdZone;
	private String frzdPostSt;
	private Date frzdStart;

	// Constructors

	/** default constructor */
	public AbstractFrzdDetId() {
	}

	/** minimal constructor */
	public AbstractFrzdDetId(String frzdDomain, String frzdFrList,
			String frzdZone, String frzdPostSt) {
		this.frzdDomain = frzdDomain;
		this.frzdFrList = frzdFrList;
		this.frzdZone = frzdZone;
		this.frzdPostSt = frzdPostSt;
	}

	/** full constructor */
	public AbstractFrzdDetId(String frzdDomain, String frzdFrList,
			String frzdSite, String frzdZone, String frzdPostSt, Date frzdStart) {
		this.frzdDomain = frzdDomain;
		this.frzdFrList = frzdFrList;
		this.frzdSite = frzdSite;
		this.frzdZone = frzdZone;
		this.frzdPostSt = frzdPostSt;
		this.frzdStart = frzdStart;
	}

	// Property accessors

	public String getFrzdDomain() {
		return this.frzdDomain;
	}

	public void setFrzdDomain(String frzdDomain) {
		this.frzdDomain = frzdDomain;
	}

	public String getFrzdFrList() {
		return this.frzdFrList;
	}

	public void setFrzdFrList(String frzdFrList) {
		this.frzdFrList = frzdFrList;
	}

	public String getFrzdSite() {
		return this.frzdSite;
	}

	public void setFrzdSite(String frzdSite) {
		this.frzdSite = frzdSite;
	}

	public String getFrzdZone() {
		return this.frzdZone;
	}

	public void setFrzdZone(String frzdZone) {
		this.frzdZone = frzdZone;
	}

	public String getFrzdPostSt() {
		return this.frzdPostSt;
	}

	public void setFrzdPostSt(String frzdPostSt) {
		this.frzdPostSt = frzdPostSt;
	}

	public Date getFrzdStart() {
		return this.frzdStart;
	}

	public void setFrzdStart(Date frzdStart) {
		this.frzdStart = frzdStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFrzdDetId))
			return false;
		AbstractFrzdDetId castOther = (AbstractFrzdDetId) other;

		return ((this.getFrzdDomain() == castOther.getFrzdDomain()) || (this
				.getFrzdDomain() != null
				&& castOther.getFrzdDomain() != null && this.getFrzdDomain()
				.equals(castOther.getFrzdDomain())))
				&& ((this.getFrzdFrList() == castOther.getFrzdFrList()) || (this
						.getFrzdFrList() != null
						&& castOther.getFrzdFrList() != null && this
						.getFrzdFrList().equals(castOther.getFrzdFrList())))
				&& ((this.getFrzdSite() == castOther.getFrzdSite()) || (this
						.getFrzdSite() != null
						&& castOther.getFrzdSite() != null && this
						.getFrzdSite().equals(castOther.getFrzdSite())))
				&& ((this.getFrzdZone() == castOther.getFrzdZone()) || (this
						.getFrzdZone() != null
						&& castOther.getFrzdZone() != null && this
						.getFrzdZone().equals(castOther.getFrzdZone())))
				&& ((this.getFrzdPostSt() == castOther.getFrzdPostSt()) || (this
						.getFrzdPostSt() != null
						&& castOther.getFrzdPostSt() != null && this
						.getFrzdPostSt().equals(castOther.getFrzdPostSt())))
				&& ((this.getFrzdStart() == castOther.getFrzdStart()) || (this
						.getFrzdStart() != null
						&& castOther.getFrzdStart() != null && this
						.getFrzdStart().equals(castOther.getFrzdStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFrzdDomain() == null ? 0 : this.getFrzdDomain()
						.hashCode());
		result = 37
				* result
				+ (getFrzdFrList() == null ? 0 : this.getFrzdFrList()
						.hashCode());
		result = 37 * result
				+ (getFrzdSite() == null ? 0 : this.getFrzdSite().hashCode());
		result = 37 * result
				+ (getFrzdZone() == null ? 0 : this.getFrzdZone().hashCode());
		result = 37
				* result
				+ (getFrzdPostSt() == null ? 0 : this.getFrzdPostSt()
						.hashCode());
		result = 37 * result
				+ (getFrzdStart() == null ? 0 : this.getFrzdStart().hashCode());
		return result;
	}

}