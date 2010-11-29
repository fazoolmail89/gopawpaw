package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVexMstrId entity provides the base persistence definition of the
 * VexMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVexMstrId implements java.io.Serializable {

	// Fields

	private String vexDomain;
	private String vexSite;
	private String vexVendor;
	private String vexVendorSource;

	// Constructors

	/** default constructor */
	public AbstractVexMstrId() {
	}

	/** full constructor */
	public AbstractVexMstrId(String vexDomain, String vexSite,
			String vexVendor, String vexVendorSource) {
		this.vexDomain = vexDomain;
		this.vexSite = vexSite;
		this.vexVendor = vexVendor;
		this.vexVendorSource = vexVendorSource;
	}

	// Property accessors

	public String getVexDomain() {
		return this.vexDomain;
	}

	public void setVexDomain(String vexDomain) {
		this.vexDomain = vexDomain;
	}

	public String getVexSite() {
		return this.vexSite;
	}

	public void setVexSite(String vexSite) {
		this.vexSite = vexSite;
	}

	public String getVexVendor() {
		return this.vexVendor;
	}

	public void setVexVendor(String vexVendor) {
		this.vexVendor = vexVendor;
	}

	public String getVexVendorSource() {
		return this.vexVendorSource;
	}

	public void setVexVendorSource(String vexVendorSource) {
		this.vexVendorSource = vexVendorSource;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVexMstrId))
			return false;
		AbstractVexMstrId castOther = (AbstractVexMstrId) other;

		return ((this.getVexDomain() == castOther.getVexDomain()) || (this
				.getVexDomain() != null
				&& castOther.getVexDomain() != null && this.getVexDomain()
				.equals(castOther.getVexDomain())))
				&& ((this.getVexSite() == castOther.getVexSite()) || (this
						.getVexSite() != null
						&& castOther.getVexSite() != null && this.getVexSite()
						.equals(castOther.getVexSite())))
				&& ((this.getVexVendor() == castOther.getVexVendor()) || (this
						.getVexVendor() != null
						&& castOther.getVexVendor() != null && this
						.getVexVendor().equals(castOther.getVexVendor())))
				&& ((this.getVexVendorSource() == castOther
						.getVexVendorSource()) || (this.getVexVendorSource() != null
						&& castOther.getVexVendorSource() != null && this
						.getVexVendorSource().equals(
								castOther.getVexVendorSource())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVexDomain() == null ? 0 : this.getVexDomain().hashCode());
		result = 37 * result
				+ (getVexSite() == null ? 0 : this.getVexSite().hashCode());
		result = 37 * result
				+ (getVexVendor() == null ? 0 : this.getVexVendor().hashCode());
		result = 37
				* result
				+ (getVexVendorSource() == null ? 0 : this.getVexVendorSource()
						.hashCode());
		return result;
	}

}