package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVesMstrId entity provides the base persistence definition of the
 * VesMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVesMstrId implements java.io.Serializable {

	// Fields

	private String vesDomain;
	private String vesVendor;
	private String vesVendorSource;
	private Date vesFromDate;
	private Date vesToDate;
	private String vesSite;
	private String vesPart;
	private String vesRecType;
	private String vesType;
	private String vesSubType;

	// Constructors

	/** default constructor */
	public AbstractVesMstrId() {
	}

	/** full constructor */
	public AbstractVesMstrId(String vesDomain, String vesVendor,
			String vesVendorSource, Date vesFromDate, Date vesToDate,
			String vesSite, String vesPart, String vesRecType, String vesType,
			String vesSubType) {
		this.vesDomain = vesDomain;
		this.vesVendor = vesVendor;
		this.vesVendorSource = vesVendorSource;
		this.vesFromDate = vesFromDate;
		this.vesToDate = vesToDate;
		this.vesSite = vesSite;
		this.vesPart = vesPart;
		this.vesRecType = vesRecType;
		this.vesType = vesType;
		this.vesSubType = vesSubType;
	}

	// Property accessors

	public String getVesDomain() {
		return this.vesDomain;
	}

	public void setVesDomain(String vesDomain) {
		this.vesDomain = vesDomain;
	}

	public String getVesVendor() {
		return this.vesVendor;
	}

	public void setVesVendor(String vesVendor) {
		this.vesVendor = vesVendor;
	}

	public String getVesVendorSource() {
		return this.vesVendorSource;
	}

	public void setVesVendorSource(String vesVendorSource) {
		this.vesVendorSource = vesVendorSource;
	}

	public Date getVesFromDate() {
		return this.vesFromDate;
	}

	public void setVesFromDate(Date vesFromDate) {
		this.vesFromDate = vesFromDate;
	}

	public Date getVesToDate() {
		return this.vesToDate;
	}

	public void setVesToDate(Date vesToDate) {
		this.vesToDate = vesToDate;
	}

	public String getVesSite() {
		return this.vesSite;
	}

	public void setVesSite(String vesSite) {
		this.vesSite = vesSite;
	}

	public String getVesPart() {
		return this.vesPart;
	}

	public void setVesPart(String vesPart) {
		this.vesPart = vesPart;
	}

	public String getVesRecType() {
		return this.vesRecType;
	}

	public void setVesRecType(String vesRecType) {
		this.vesRecType = vesRecType;
	}

	public String getVesType() {
		return this.vesType;
	}

	public void setVesType(String vesType) {
		this.vesType = vesType;
	}

	public String getVesSubType() {
		return this.vesSubType;
	}

	public void setVesSubType(String vesSubType) {
		this.vesSubType = vesSubType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVesMstrId))
			return false;
		AbstractVesMstrId castOther = (AbstractVesMstrId) other;

		return ((this.getVesDomain() == castOther.getVesDomain()) || (this
				.getVesDomain() != null
				&& castOther.getVesDomain() != null && this.getVesDomain()
				.equals(castOther.getVesDomain())))
				&& ((this.getVesVendor() == castOther.getVesVendor()) || (this
						.getVesVendor() != null
						&& castOther.getVesVendor() != null && this
						.getVesVendor().equals(castOther.getVesVendor())))
				&& ((this.getVesVendorSource() == castOther
						.getVesVendorSource()) || (this.getVesVendorSource() != null
						&& castOther.getVesVendorSource() != null && this
						.getVesVendorSource().equals(
								castOther.getVesVendorSource())))
				&& ((this.getVesFromDate() == castOther.getVesFromDate()) || (this
						.getVesFromDate() != null
						&& castOther.getVesFromDate() != null && this
						.getVesFromDate().equals(castOther.getVesFromDate())))
				&& ((this.getVesToDate() == castOther.getVesToDate()) || (this
						.getVesToDate() != null
						&& castOther.getVesToDate() != null && this
						.getVesToDate().equals(castOther.getVesToDate())))
				&& ((this.getVesSite() == castOther.getVesSite()) || (this
						.getVesSite() != null
						&& castOther.getVesSite() != null && this.getVesSite()
						.equals(castOther.getVesSite())))
				&& ((this.getVesPart() == castOther.getVesPart()) || (this
						.getVesPart() != null
						&& castOther.getVesPart() != null && this.getVesPart()
						.equals(castOther.getVesPart())))
				&& ((this.getVesRecType() == castOther.getVesRecType()) || (this
						.getVesRecType() != null
						&& castOther.getVesRecType() != null && this
						.getVesRecType().equals(castOther.getVesRecType())))
				&& ((this.getVesType() == castOther.getVesType()) || (this
						.getVesType() != null
						&& castOther.getVesType() != null && this.getVesType()
						.equals(castOther.getVesType())))
				&& ((this.getVesSubType() == castOther.getVesSubType()) || (this
						.getVesSubType() != null
						&& castOther.getVesSubType() != null && this
						.getVesSubType().equals(castOther.getVesSubType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVesDomain() == null ? 0 : this.getVesDomain().hashCode());
		result = 37 * result
				+ (getVesVendor() == null ? 0 : this.getVesVendor().hashCode());
		result = 37
				* result
				+ (getVesVendorSource() == null ? 0 : this.getVesVendorSource()
						.hashCode());
		result = 37
				* result
				+ (getVesFromDate() == null ? 0 : this.getVesFromDate()
						.hashCode());
		result = 37 * result
				+ (getVesToDate() == null ? 0 : this.getVesToDate().hashCode());
		result = 37 * result
				+ (getVesSite() == null ? 0 : this.getVesSite().hashCode());
		result = 37 * result
				+ (getVesPart() == null ? 0 : this.getVesPart().hashCode());
		result = 37
				* result
				+ (getVesRecType() == null ? 0 : this.getVesRecType()
						.hashCode());
		result = 37 * result
				+ (getVesType() == null ? 0 : this.getVesType().hashCode());
		result = 37
				* result
				+ (getVesSubType() == null ? 0 : this.getVesSubType()
						.hashCode());
		return result;
	}

}