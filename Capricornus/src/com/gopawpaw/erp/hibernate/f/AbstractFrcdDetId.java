package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFrcdDetId entity provides the base persistence definition of the
 * FrcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrcdDetId implements java.io.Serializable {

	// Fields

	private String frcdDomain;
	private String frcdFrList;
	private String frcdSite;
	private String frcdCurr;
	private String frcdZone;
	private String frcdClass;
	private Double frcdMaxWt;
	private Date frcdStart;

	// Constructors

	/** default constructor */
	public AbstractFrcdDetId() {
	}

	/** minimal constructor */
	public AbstractFrcdDetId(String frcdDomain, String frcdFrList,
			String frcdZone) {
		this.frcdDomain = frcdDomain;
		this.frcdFrList = frcdFrList;
		this.frcdZone = frcdZone;
	}

	/** full constructor */
	public AbstractFrcdDetId(String frcdDomain, String frcdFrList,
			String frcdSite, String frcdCurr, String frcdZone,
			String frcdClass, Double frcdMaxWt, Date frcdStart) {
		this.frcdDomain = frcdDomain;
		this.frcdFrList = frcdFrList;
		this.frcdSite = frcdSite;
		this.frcdCurr = frcdCurr;
		this.frcdZone = frcdZone;
		this.frcdClass = frcdClass;
		this.frcdMaxWt = frcdMaxWt;
		this.frcdStart = frcdStart;
	}

	// Property accessors

	public String getFrcdDomain() {
		return this.frcdDomain;
	}

	public void setFrcdDomain(String frcdDomain) {
		this.frcdDomain = frcdDomain;
	}

	public String getFrcdFrList() {
		return this.frcdFrList;
	}

	public void setFrcdFrList(String frcdFrList) {
		this.frcdFrList = frcdFrList;
	}

	public String getFrcdSite() {
		return this.frcdSite;
	}

	public void setFrcdSite(String frcdSite) {
		this.frcdSite = frcdSite;
	}

	public String getFrcdCurr() {
		return this.frcdCurr;
	}

	public void setFrcdCurr(String frcdCurr) {
		this.frcdCurr = frcdCurr;
	}

	public String getFrcdZone() {
		return this.frcdZone;
	}

	public void setFrcdZone(String frcdZone) {
		this.frcdZone = frcdZone;
	}

	public String getFrcdClass() {
		return this.frcdClass;
	}

	public void setFrcdClass(String frcdClass) {
		this.frcdClass = frcdClass;
	}

	public Double getFrcdMaxWt() {
		return this.frcdMaxWt;
	}

	public void setFrcdMaxWt(Double frcdMaxWt) {
		this.frcdMaxWt = frcdMaxWt;
	}

	public Date getFrcdStart() {
		return this.frcdStart;
	}

	public void setFrcdStart(Date frcdStart) {
		this.frcdStart = frcdStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFrcdDetId))
			return false;
		AbstractFrcdDetId castOther = (AbstractFrcdDetId) other;

		return ((this.getFrcdDomain() == castOther.getFrcdDomain()) || (this
				.getFrcdDomain() != null
				&& castOther.getFrcdDomain() != null && this.getFrcdDomain()
				.equals(castOther.getFrcdDomain())))
				&& ((this.getFrcdFrList() == castOther.getFrcdFrList()) || (this
						.getFrcdFrList() != null
						&& castOther.getFrcdFrList() != null && this
						.getFrcdFrList().equals(castOther.getFrcdFrList())))
				&& ((this.getFrcdSite() == castOther.getFrcdSite()) || (this
						.getFrcdSite() != null
						&& castOther.getFrcdSite() != null && this
						.getFrcdSite().equals(castOther.getFrcdSite())))
				&& ((this.getFrcdCurr() == castOther.getFrcdCurr()) || (this
						.getFrcdCurr() != null
						&& castOther.getFrcdCurr() != null && this
						.getFrcdCurr().equals(castOther.getFrcdCurr())))
				&& ((this.getFrcdZone() == castOther.getFrcdZone()) || (this
						.getFrcdZone() != null
						&& castOther.getFrcdZone() != null && this
						.getFrcdZone().equals(castOther.getFrcdZone())))
				&& ((this.getFrcdClass() == castOther.getFrcdClass()) || (this
						.getFrcdClass() != null
						&& castOther.getFrcdClass() != null && this
						.getFrcdClass().equals(castOther.getFrcdClass())))
				&& ((this.getFrcdMaxWt() == castOther.getFrcdMaxWt()) || (this
						.getFrcdMaxWt() != null
						&& castOther.getFrcdMaxWt() != null && this
						.getFrcdMaxWt().equals(castOther.getFrcdMaxWt())))
				&& ((this.getFrcdStart() == castOther.getFrcdStart()) || (this
						.getFrcdStart() != null
						&& castOther.getFrcdStart() != null && this
						.getFrcdStart().equals(castOther.getFrcdStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFrcdDomain() == null ? 0 : this.getFrcdDomain()
						.hashCode());
		result = 37
				* result
				+ (getFrcdFrList() == null ? 0 : this.getFrcdFrList()
						.hashCode());
		result = 37 * result
				+ (getFrcdSite() == null ? 0 : this.getFrcdSite().hashCode());
		result = 37 * result
				+ (getFrcdCurr() == null ? 0 : this.getFrcdCurr().hashCode());
		result = 37 * result
				+ (getFrcdZone() == null ? 0 : this.getFrcdZone().hashCode());
		result = 37 * result
				+ (getFrcdClass() == null ? 0 : this.getFrcdClass().hashCode());
		result = 37 * result
				+ (getFrcdMaxWt() == null ? 0 : this.getFrcdMaxWt().hashCode());
		result = 37 * result
				+ (getFrcdStart() == null ? 0 : this.getFrcdStart().hashCode());
		return result;
	}

}