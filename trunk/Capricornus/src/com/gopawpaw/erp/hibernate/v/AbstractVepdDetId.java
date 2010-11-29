package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVepdDetId entity provides the base persistence definition of the
 * VepdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVepdDetId implements java.io.Serializable {

	// Fields

	private String vepdDomain;
	private Integer vepdTranId;
	private Date vepdTranDate;
	private String vepdVendor;
	private String vepdVendorSource;
	private String vepdSite;

	// Constructors

	/** default constructor */
	public AbstractVepdDetId() {
	}

	/** full constructor */
	public AbstractVepdDetId(String vepdDomain, Integer vepdTranId,
			Date vepdTranDate, String vepdVendor, String vepdVendorSource,
			String vepdSite) {
		this.vepdDomain = vepdDomain;
		this.vepdTranId = vepdTranId;
		this.vepdTranDate = vepdTranDate;
		this.vepdVendor = vepdVendor;
		this.vepdVendorSource = vepdVendorSource;
		this.vepdSite = vepdSite;
	}

	// Property accessors

	public String getVepdDomain() {
		return this.vepdDomain;
	}

	public void setVepdDomain(String vepdDomain) {
		this.vepdDomain = vepdDomain;
	}

	public Integer getVepdTranId() {
		return this.vepdTranId;
	}

	public void setVepdTranId(Integer vepdTranId) {
		this.vepdTranId = vepdTranId;
	}

	public Date getVepdTranDate() {
		return this.vepdTranDate;
	}

	public void setVepdTranDate(Date vepdTranDate) {
		this.vepdTranDate = vepdTranDate;
	}

	public String getVepdVendor() {
		return this.vepdVendor;
	}

	public void setVepdVendor(String vepdVendor) {
		this.vepdVendor = vepdVendor;
	}

	public String getVepdVendorSource() {
		return this.vepdVendorSource;
	}

	public void setVepdVendorSource(String vepdVendorSource) {
		this.vepdVendorSource = vepdVendorSource;
	}

	public String getVepdSite() {
		return this.vepdSite;
	}

	public void setVepdSite(String vepdSite) {
		this.vepdSite = vepdSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVepdDetId))
			return false;
		AbstractVepdDetId castOther = (AbstractVepdDetId) other;

		return ((this.getVepdDomain() == castOther.getVepdDomain()) || (this
				.getVepdDomain() != null
				&& castOther.getVepdDomain() != null && this.getVepdDomain()
				.equals(castOther.getVepdDomain())))
				&& ((this.getVepdTranId() == castOther.getVepdTranId()) || (this
						.getVepdTranId() != null
						&& castOther.getVepdTranId() != null && this
						.getVepdTranId().equals(castOther.getVepdTranId())))
				&& ((this.getVepdTranDate() == castOther.getVepdTranDate()) || (this
						.getVepdTranDate() != null
						&& castOther.getVepdTranDate() != null && this
						.getVepdTranDate().equals(castOther.getVepdTranDate())))
				&& ((this.getVepdVendor() == castOther.getVepdVendor()) || (this
						.getVepdVendor() != null
						&& castOther.getVepdVendor() != null && this
						.getVepdVendor().equals(castOther.getVepdVendor())))
				&& ((this.getVepdVendorSource() == castOther
						.getVepdVendorSource()) || (this.getVepdVendorSource() != null
						&& castOther.getVepdVendorSource() != null && this
						.getVepdVendorSource().equals(
								castOther.getVepdVendorSource())))
				&& ((this.getVepdSite() == castOther.getVepdSite()) || (this
						.getVepdSite() != null
						&& castOther.getVepdSite() != null && this
						.getVepdSite().equals(castOther.getVepdSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getVepdDomain() == null ? 0 : this.getVepdDomain()
						.hashCode());
		result = 37
				* result
				+ (getVepdTranId() == null ? 0 : this.getVepdTranId()
						.hashCode());
		result = 37
				* result
				+ (getVepdTranDate() == null ? 0 : this.getVepdTranDate()
						.hashCode());
		result = 37
				* result
				+ (getVepdVendor() == null ? 0 : this.getVepdVendor()
						.hashCode());
		result = 37
				* result
				+ (getVepdVendorSource() == null ? 0 : this
						.getVepdVendorSource().hashCode());
		result = 37 * result
				+ (getVepdSite() == null ? 0 : this.getVepdSite().hashCode());
		return result;
	}

}