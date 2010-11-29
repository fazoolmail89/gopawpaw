package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFcDetId entity provides the base persistence definition of the
 * FcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcDetId implements java.io.Serializable {

	// Fields

	private String fcDomain;
	private String fcPart;
	private String fcSite;
	private Date fcStart;

	// Constructors

	/** default constructor */
	public AbstractFcDetId() {
	}

	/** minimal constructor */
	public AbstractFcDetId(String fcDomain, String fcPart) {
		this.fcDomain = fcDomain;
		this.fcPart = fcPart;
	}

	/** full constructor */
	public AbstractFcDetId(String fcDomain, String fcPart, String fcSite,
			Date fcStart) {
		this.fcDomain = fcDomain;
		this.fcPart = fcPart;
		this.fcSite = fcSite;
		this.fcStart = fcStart;
	}

	// Property accessors

	public String getFcDomain() {
		return this.fcDomain;
	}

	public void setFcDomain(String fcDomain) {
		this.fcDomain = fcDomain;
	}

	public String getFcPart() {
		return this.fcPart;
	}

	public void setFcPart(String fcPart) {
		this.fcPart = fcPart;
	}

	public String getFcSite() {
		return this.fcSite;
	}

	public void setFcSite(String fcSite) {
		this.fcSite = fcSite;
	}

	public Date getFcStart() {
		return this.fcStart;
	}

	public void setFcStart(Date fcStart) {
		this.fcStart = fcStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFcDetId))
			return false;
		AbstractFcDetId castOther = (AbstractFcDetId) other;

		return ((this.getFcDomain() == castOther.getFcDomain()) || (this
				.getFcDomain() != null
				&& castOther.getFcDomain() != null && this.getFcDomain()
				.equals(castOther.getFcDomain())))
				&& ((this.getFcPart() == castOther.getFcPart()) || (this
						.getFcPart() != null
						&& castOther.getFcPart() != null && this.getFcPart()
						.equals(castOther.getFcPart())))
				&& ((this.getFcSite() == castOther.getFcSite()) || (this
						.getFcSite() != null
						&& castOther.getFcSite() != null && this.getFcSite()
						.equals(castOther.getFcSite())))
				&& ((this.getFcStart() == castOther.getFcStart()) || (this
						.getFcStart() != null
						&& castOther.getFcStart() != null && this.getFcStart()
						.equals(castOther.getFcStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFcDomain() == null ? 0 : this.getFcDomain().hashCode());
		result = 37 * result
				+ (getFcPart() == null ? 0 : this.getFcPart().hashCode());
		result = 37 * result
				+ (getFcSite() == null ? 0 : this.getFcSite().hashCode());
		result = 37 * result
				+ (getFcStart() == null ? 0 : this.getFcStart().hashCode());
		return result;
	}

}