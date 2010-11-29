package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVesdDetId entity provides the base persistence definition of the
 * VesdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVesdDetId implements java.io.Serializable {

	// Fields

	private String vesdDomain;
	private String vesdVendor;
	private String vesdVendorSource;
	private Date vesdVesFromDate;
	private Date vesdVesToDate;
	private String vesdSite;
	private String vesdPart;
	private String vesdRecType;
	private String vesdType;
	private String vesdSubType;
	private String vesdCategory;
	private Integer vesdTranId;

	// Constructors

	/** default constructor */
	public AbstractVesdDetId() {
	}

	/** full constructor */
	public AbstractVesdDetId(String vesdDomain, String vesdVendor,
			String vesdVendorSource, Date vesdVesFromDate, Date vesdVesToDate,
			String vesdSite, String vesdPart, String vesdRecType,
			String vesdType, String vesdSubType, String vesdCategory,
			Integer vesdTranId) {
		this.vesdDomain = vesdDomain;
		this.vesdVendor = vesdVendor;
		this.vesdVendorSource = vesdVendorSource;
		this.vesdVesFromDate = vesdVesFromDate;
		this.vesdVesToDate = vesdVesToDate;
		this.vesdSite = vesdSite;
		this.vesdPart = vesdPart;
		this.vesdRecType = vesdRecType;
		this.vesdType = vesdType;
		this.vesdSubType = vesdSubType;
		this.vesdCategory = vesdCategory;
		this.vesdTranId = vesdTranId;
	}

	// Property accessors

	public String getVesdDomain() {
		return this.vesdDomain;
	}

	public void setVesdDomain(String vesdDomain) {
		this.vesdDomain = vesdDomain;
	}

	public String getVesdVendor() {
		return this.vesdVendor;
	}

	public void setVesdVendor(String vesdVendor) {
		this.vesdVendor = vesdVendor;
	}

	public String getVesdVendorSource() {
		return this.vesdVendorSource;
	}

	public void setVesdVendorSource(String vesdVendorSource) {
		this.vesdVendorSource = vesdVendorSource;
	}

	public Date getVesdVesFromDate() {
		return this.vesdVesFromDate;
	}

	public void setVesdVesFromDate(Date vesdVesFromDate) {
		this.vesdVesFromDate = vesdVesFromDate;
	}

	public Date getVesdVesToDate() {
		return this.vesdVesToDate;
	}

	public void setVesdVesToDate(Date vesdVesToDate) {
		this.vesdVesToDate = vesdVesToDate;
	}

	public String getVesdSite() {
		return this.vesdSite;
	}

	public void setVesdSite(String vesdSite) {
		this.vesdSite = vesdSite;
	}

	public String getVesdPart() {
		return this.vesdPart;
	}

	public void setVesdPart(String vesdPart) {
		this.vesdPart = vesdPart;
	}

	public String getVesdRecType() {
		return this.vesdRecType;
	}

	public void setVesdRecType(String vesdRecType) {
		this.vesdRecType = vesdRecType;
	}

	public String getVesdType() {
		return this.vesdType;
	}

	public void setVesdType(String vesdType) {
		this.vesdType = vesdType;
	}

	public String getVesdSubType() {
		return this.vesdSubType;
	}

	public void setVesdSubType(String vesdSubType) {
		this.vesdSubType = vesdSubType;
	}

	public String getVesdCategory() {
		return this.vesdCategory;
	}

	public void setVesdCategory(String vesdCategory) {
		this.vesdCategory = vesdCategory;
	}

	public Integer getVesdTranId() {
		return this.vesdTranId;
	}

	public void setVesdTranId(Integer vesdTranId) {
		this.vesdTranId = vesdTranId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVesdDetId))
			return false;
		AbstractVesdDetId castOther = (AbstractVesdDetId) other;

		return ((this.getVesdDomain() == castOther.getVesdDomain()) || (this
				.getVesdDomain() != null
				&& castOther.getVesdDomain() != null && this.getVesdDomain()
				.equals(castOther.getVesdDomain())))
				&& ((this.getVesdVendor() == castOther.getVesdVendor()) || (this
						.getVesdVendor() != null
						&& castOther.getVesdVendor() != null && this
						.getVesdVendor().equals(castOther.getVesdVendor())))
				&& ((this.getVesdVendorSource() == castOther
						.getVesdVendorSource()) || (this.getVesdVendorSource() != null
						&& castOther.getVesdVendorSource() != null && this
						.getVesdVendorSource().equals(
								castOther.getVesdVendorSource())))
				&& ((this.getVesdVesFromDate() == castOther
						.getVesdVesFromDate()) || (this.getVesdVesFromDate() != null
						&& castOther.getVesdVesFromDate() != null && this
						.getVesdVesFromDate().equals(
								castOther.getVesdVesFromDate())))
				&& ((this.getVesdVesToDate() == castOther.getVesdVesToDate()) || (this
						.getVesdVesToDate() != null
						&& castOther.getVesdVesToDate() != null && this
						.getVesdVesToDate()
						.equals(castOther.getVesdVesToDate())))
				&& ((this.getVesdSite() == castOther.getVesdSite()) || (this
						.getVesdSite() != null
						&& castOther.getVesdSite() != null && this
						.getVesdSite().equals(castOther.getVesdSite())))
				&& ((this.getVesdPart() == castOther.getVesdPart()) || (this
						.getVesdPart() != null
						&& castOther.getVesdPart() != null && this
						.getVesdPart().equals(castOther.getVesdPart())))
				&& ((this.getVesdRecType() == castOther.getVesdRecType()) || (this
						.getVesdRecType() != null
						&& castOther.getVesdRecType() != null && this
						.getVesdRecType().equals(castOther.getVesdRecType())))
				&& ((this.getVesdType() == castOther.getVesdType()) || (this
						.getVesdType() != null
						&& castOther.getVesdType() != null && this
						.getVesdType().equals(castOther.getVesdType())))
				&& ((this.getVesdSubType() == castOther.getVesdSubType()) || (this
						.getVesdSubType() != null
						&& castOther.getVesdSubType() != null && this
						.getVesdSubType().equals(castOther.getVesdSubType())))
				&& ((this.getVesdCategory() == castOther.getVesdCategory()) || (this
						.getVesdCategory() != null
						&& castOther.getVesdCategory() != null && this
						.getVesdCategory().equals(castOther.getVesdCategory())))
				&& ((this.getVesdTranId() == castOther.getVesdTranId()) || (this
						.getVesdTranId() != null
						&& castOther.getVesdTranId() != null && this
						.getVesdTranId().equals(castOther.getVesdTranId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getVesdDomain() == null ? 0 : this.getVesdDomain()
						.hashCode());
		result = 37
				* result
				+ (getVesdVendor() == null ? 0 : this.getVesdVendor()
						.hashCode());
		result = 37
				* result
				+ (getVesdVendorSource() == null ? 0 : this
						.getVesdVendorSource().hashCode());
		result = 37
				* result
				+ (getVesdVesFromDate() == null ? 0 : this.getVesdVesFromDate()
						.hashCode());
		result = 37
				* result
				+ (getVesdVesToDate() == null ? 0 : this.getVesdVesToDate()
						.hashCode());
		result = 37 * result
				+ (getVesdSite() == null ? 0 : this.getVesdSite().hashCode());
		result = 37 * result
				+ (getVesdPart() == null ? 0 : this.getVesdPart().hashCode());
		result = 37
				* result
				+ (getVesdRecType() == null ? 0 : this.getVesdRecType()
						.hashCode());
		result = 37 * result
				+ (getVesdType() == null ? 0 : this.getVesdType().hashCode());
		result = 37
				* result
				+ (getVesdSubType() == null ? 0 : this.getVesdSubType()
						.hashCode());
		result = 37
				* result
				+ (getVesdCategory() == null ? 0 : this.getVesdCategory()
						.hashCode());
		result = 37
				* result
				+ (getVesdTranId() == null ? 0 : this.getVesdTranId()
						.hashCode());
		return result;
	}

}