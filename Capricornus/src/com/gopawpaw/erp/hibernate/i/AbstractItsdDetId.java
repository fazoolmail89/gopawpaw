package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractItsdDetId entity provides the base persistence definition of the
 * ItsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItsdDetId implements java.io.Serializable {

	// Fields

	private String itsdDomain;
	private String itsdPart;
	private String itsdSite;
	private Date itsdDate;
	private String itsdType;

	// Constructors

	/** default constructor */
	public AbstractItsdDetId() {
	}

	/** minimal constructor */
	public AbstractItsdDetId(String itsdDomain) {
		this.itsdDomain = itsdDomain;
	}

	/** full constructor */
	public AbstractItsdDetId(String itsdDomain, String itsdPart,
			String itsdSite, Date itsdDate, String itsdType) {
		this.itsdDomain = itsdDomain;
		this.itsdPart = itsdPart;
		this.itsdSite = itsdSite;
		this.itsdDate = itsdDate;
		this.itsdType = itsdType;
	}

	// Property accessors

	public String getItsdDomain() {
		return this.itsdDomain;
	}

	public void setItsdDomain(String itsdDomain) {
		this.itsdDomain = itsdDomain;
	}

	public String getItsdPart() {
		return this.itsdPart;
	}

	public void setItsdPart(String itsdPart) {
		this.itsdPart = itsdPart;
	}

	public String getItsdSite() {
		return this.itsdSite;
	}

	public void setItsdSite(String itsdSite) {
		this.itsdSite = itsdSite;
	}

	public Date getItsdDate() {
		return this.itsdDate;
	}

	public void setItsdDate(Date itsdDate) {
		this.itsdDate = itsdDate;
	}

	public String getItsdType() {
		return this.itsdType;
	}

	public void setItsdType(String itsdType) {
		this.itsdType = itsdType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractItsdDetId))
			return false;
		AbstractItsdDetId castOther = (AbstractItsdDetId) other;

		return ((this.getItsdDomain() == castOther.getItsdDomain()) || (this
				.getItsdDomain() != null
				&& castOther.getItsdDomain() != null && this.getItsdDomain()
				.equals(castOther.getItsdDomain())))
				&& ((this.getItsdPart() == castOther.getItsdPart()) || (this
						.getItsdPart() != null
						&& castOther.getItsdPart() != null && this
						.getItsdPart().equals(castOther.getItsdPart())))
				&& ((this.getItsdSite() == castOther.getItsdSite()) || (this
						.getItsdSite() != null
						&& castOther.getItsdSite() != null && this
						.getItsdSite().equals(castOther.getItsdSite())))
				&& ((this.getItsdDate() == castOther.getItsdDate()) || (this
						.getItsdDate() != null
						&& castOther.getItsdDate() != null && this
						.getItsdDate().equals(castOther.getItsdDate())))
				&& ((this.getItsdType() == castOther.getItsdType()) || (this
						.getItsdType() != null
						&& castOther.getItsdType() != null && this
						.getItsdType().equals(castOther.getItsdType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getItsdDomain() == null ? 0 : this.getItsdDomain()
						.hashCode());
		result = 37 * result
				+ (getItsdPart() == null ? 0 : this.getItsdPart().hashCode());
		result = 37 * result
				+ (getItsdSite() == null ? 0 : this.getItsdSite().hashCode());
		result = 37 * result
				+ (getItsdDate() == null ? 0 : this.getItsdDate().hashCode());
		result = 37 * result
				+ (getItsdType() == null ? 0 : this.getItsdType().hashCode());
		return result;
	}

}