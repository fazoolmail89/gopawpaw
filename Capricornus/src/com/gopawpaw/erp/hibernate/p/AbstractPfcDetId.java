package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPfcDetId entity provides the base persistence definition of the
 * PfcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPfcDetId implements java.io.Serializable {

	// Fields

	private String pfcDomain;
	private String pfcPart;
	private String pfcSite;
	private String pfcPegPart;
	private Date pfcDate;

	// Constructors

	/** default constructor */
	public AbstractPfcDetId() {
	}

	/** minimal constructor */
	public AbstractPfcDetId(String pfcDomain, String pfcPart) {
		this.pfcDomain = pfcDomain;
		this.pfcPart = pfcPart;
	}

	/** full constructor */
	public AbstractPfcDetId(String pfcDomain, String pfcPart, String pfcSite,
			String pfcPegPart, Date pfcDate) {
		this.pfcDomain = pfcDomain;
		this.pfcPart = pfcPart;
		this.pfcSite = pfcSite;
		this.pfcPegPart = pfcPegPart;
		this.pfcDate = pfcDate;
	}

	// Property accessors

	public String getPfcDomain() {
		return this.pfcDomain;
	}

	public void setPfcDomain(String pfcDomain) {
		this.pfcDomain = pfcDomain;
	}

	public String getPfcPart() {
		return this.pfcPart;
	}

	public void setPfcPart(String pfcPart) {
		this.pfcPart = pfcPart;
	}

	public String getPfcSite() {
		return this.pfcSite;
	}

	public void setPfcSite(String pfcSite) {
		this.pfcSite = pfcSite;
	}

	public String getPfcPegPart() {
		return this.pfcPegPart;
	}

	public void setPfcPegPart(String pfcPegPart) {
		this.pfcPegPart = pfcPegPart;
	}

	public Date getPfcDate() {
		return this.pfcDate;
	}

	public void setPfcDate(Date pfcDate) {
		this.pfcDate = pfcDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPfcDetId))
			return false;
		AbstractPfcDetId castOther = (AbstractPfcDetId) other;

		return ((this.getPfcDomain() == castOther.getPfcDomain()) || (this
				.getPfcDomain() != null
				&& castOther.getPfcDomain() != null && this.getPfcDomain()
				.equals(castOther.getPfcDomain())))
				&& ((this.getPfcPart() == castOther.getPfcPart()) || (this
						.getPfcPart() != null
						&& castOther.getPfcPart() != null && this.getPfcPart()
						.equals(castOther.getPfcPart())))
				&& ((this.getPfcSite() == castOther.getPfcSite()) || (this
						.getPfcSite() != null
						&& castOther.getPfcSite() != null && this.getPfcSite()
						.equals(castOther.getPfcSite())))
				&& ((this.getPfcPegPart() == castOther.getPfcPegPart()) || (this
						.getPfcPegPart() != null
						&& castOther.getPfcPegPart() != null && this
						.getPfcPegPart().equals(castOther.getPfcPegPart())))
				&& ((this.getPfcDate() == castOther.getPfcDate()) || (this
						.getPfcDate() != null
						&& castOther.getPfcDate() != null && this.getPfcDate()
						.equals(castOther.getPfcDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPfcDomain() == null ? 0 : this.getPfcDomain().hashCode());
		result = 37 * result
				+ (getPfcPart() == null ? 0 : this.getPfcPart().hashCode());
		result = 37 * result
				+ (getPfcSite() == null ? 0 : this.getPfcSite().hashCode());
		result = 37
				* result
				+ (getPfcPegPart() == null ? 0 : this.getPfcPegPart()
						.hashCode());
		result = 37 * result
				+ (getPfcDate() == null ? 0 : this.getPfcDate().hashCode());
		return result;
	}

}