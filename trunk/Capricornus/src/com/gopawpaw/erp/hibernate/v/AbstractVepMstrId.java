package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVepMstrId entity provides the base persistence definition of the
 * VepMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVepMstrId implements java.io.Serializable {

	// Fields

	private String vepDomain;
	private String vepVendor;
	private String vepVendorSource;
	private Date vepTranDate;
	private Integer vepTranId;
	private String vepSite;

	// Constructors

	/** default constructor */
	public AbstractVepMstrId() {
	}

	/** minimal constructor */
	public AbstractVepMstrId(String vepDomain, String vepVendor,
			String vepVendorSource, Date vepTranDate, Integer vepTranId) {
		this.vepDomain = vepDomain;
		this.vepVendor = vepVendor;
		this.vepVendorSource = vepVendorSource;
		this.vepTranDate = vepTranDate;
		this.vepTranId = vepTranId;
	}

	/** full constructor */
	public AbstractVepMstrId(String vepDomain, String vepVendor,
			String vepVendorSource, Date vepTranDate, Integer vepTranId,
			String vepSite) {
		this.vepDomain = vepDomain;
		this.vepVendor = vepVendor;
		this.vepVendorSource = vepVendorSource;
		this.vepTranDate = vepTranDate;
		this.vepTranId = vepTranId;
		this.vepSite = vepSite;
	}

	// Property accessors

	public String getVepDomain() {
		return this.vepDomain;
	}

	public void setVepDomain(String vepDomain) {
		this.vepDomain = vepDomain;
	}

	public String getVepVendor() {
		return this.vepVendor;
	}

	public void setVepVendor(String vepVendor) {
		this.vepVendor = vepVendor;
	}

	public String getVepVendorSource() {
		return this.vepVendorSource;
	}

	public void setVepVendorSource(String vepVendorSource) {
		this.vepVendorSource = vepVendorSource;
	}

	public Date getVepTranDate() {
		return this.vepTranDate;
	}

	public void setVepTranDate(Date vepTranDate) {
		this.vepTranDate = vepTranDate;
	}

	public Integer getVepTranId() {
		return this.vepTranId;
	}

	public void setVepTranId(Integer vepTranId) {
		this.vepTranId = vepTranId;
	}

	public String getVepSite() {
		return this.vepSite;
	}

	public void setVepSite(String vepSite) {
		this.vepSite = vepSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVepMstrId))
			return false;
		AbstractVepMstrId castOther = (AbstractVepMstrId) other;

		return ((this.getVepDomain() == castOther.getVepDomain()) || (this
				.getVepDomain() != null
				&& castOther.getVepDomain() != null && this.getVepDomain()
				.equals(castOther.getVepDomain())))
				&& ((this.getVepVendor() == castOther.getVepVendor()) || (this
						.getVepVendor() != null
						&& castOther.getVepVendor() != null && this
						.getVepVendor().equals(castOther.getVepVendor())))
				&& ((this.getVepVendorSource() == castOther
						.getVepVendorSource()) || (this.getVepVendorSource() != null
						&& castOther.getVepVendorSource() != null && this
						.getVepVendorSource().equals(
								castOther.getVepVendorSource())))
				&& ((this.getVepTranDate() == castOther.getVepTranDate()) || (this
						.getVepTranDate() != null
						&& castOther.getVepTranDate() != null && this
						.getVepTranDate().equals(castOther.getVepTranDate())))
				&& ((this.getVepTranId() == castOther.getVepTranId()) || (this
						.getVepTranId() != null
						&& castOther.getVepTranId() != null && this
						.getVepTranId().equals(castOther.getVepTranId())))
				&& ((this.getVepSite() == castOther.getVepSite()) || (this
						.getVepSite() != null
						&& castOther.getVepSite() != null && this.getVepSite()
						.equals(castOther.getVepSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVepDomain() == null ? 0 : this.getVepDomain().hashCode());
		result = 37 * result
				+ (getVepVendor() == null ? 0 : this.getVepVendor().hashCode());
		result = 37
				* result
				+ (getVepVendorSource() == null ? 0 : this.getVepVendorSource()
						.hashCode());
		result = 37
				* result
				+ (getVepTranDate() == null ? 0 : this.getVepTranDate()
						.hashCode());
		result = 37 * result
				+ (getVepTranId() == null ? 0 : this.getVepTranId().hashCode());
		result = 37 * result
				+ (getVepSite() == null ? 0 : this.getVepSite().hashCode());
		return result;
	}

}