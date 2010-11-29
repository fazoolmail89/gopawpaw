package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVerMstrId entity provides the base persistence definition of the
 * VerMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVerMstrId implements java.io.Serializable {

	// Fields

	private String verDomain;
	private String verVendor;
	private String verVendorSource;
	private String verSite;
	private String verPart;
	private String verCommCode;

	// Constructors

	/** default constructor */
	public AbstractVerMstrId() {
	}

	/** full constructor */
	public AbstractVerMstrId(String verDomain, String verVendor,
			String verVendorSource, String verSite, String verPart,
			String verCommCode) {
		this.verDomain = verDomain;
		this.verVendor = verVendor;
		this.verVendorSource = verVendorSource;
		this.verSite = verSite;
		this.verPart = verPart;
		this.verCommCode = verCommCode;
	}

	// Property accessors

	public String getVerDomain() {
		return this.verDomain;
	}

	public void setVerDomain(String verDomain) {
		this.verDomain = verDomain;
	}

	public String getVerVendor() {
		return this.verVendor;
	}

	public void setVerVendor(String verVendor) {
		this.verVendor = verVendor;
	}

	public String getVerVendorSource() {
		return this.verVendorSource;
	}

	public void setVerVendorSource(String verVendorSource) {
		this.verVendorSource = verVendorSource;
	}

	public String getVerSite() {
		return this.verSite;
	}

	public void setVerSite(String verSite) {
		this.verSite = verSite;
	}

	public String getVerPart() {
		return this.verPart;
	}

	public void setVerPart(String verPart) {
		this.verPart = verPart;
	}

	public String getVerCommCode() {
		return this.verCommCode;
	}

	public void setVerCommCode(String verCommCode) {
		this.verCommCode = verCommCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVerMstrId))
			return false;
		AbstractVerMstrId castOther = (AbstractVerMstrId) other;

		return ((this.getVerDomain() == castOther.getVerDomain()) || (this
				.getVerDomain() != null
				&& castOther.getVerDomain() != null && this.getVerDomain()
				.equals(castOther.getVerDomain())))
				&& ((this.getVerVendor() == castOther.getVerVendor()) || (this
						.getVerVendor() != null
						&& castOther.getVerVendor() != null && this
						.getVerVendor().equals(castOther.getVerVendor())))
				&& ((this.getVerVendorSource() == castOther
						.getVerVendorSource()) || (this.getVerVendorSource() != null
						&& castOther.getVerVendorSource() != null && this
						.getVerVendorSource().equals(
								castOther.getVerVendorSource())))
				&& ((this.getVerSite() == castOther.getVerSite()) || (this
						.getVerSite() != null
						&& castOther.getVerSite() != null && this.getVerSite()
						.equals(castOther.getVerSite())))
				&& ((this.getVerPart() == castOther.getVerPart()) || (this
						.getVerPart() != null
						&& castOther.getVerPart() != null && this.getVerPart()
						.equals(castOther.getVerPart())))
				&& ((this.getVerCommCode() == castOther.getVerCommCode()) || (this
						.getVerCommCode() != null
						&& castOther.getVerCommCode() != null && this
						.getVerCommCode().equals(castOther.getVerCommCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVerDomain() == null ? 0 : this.getVerDomain().hashCode());
		result = 37 * result
				+ (getVerVendor() == null ? 0 : this.getVerVendor().hashCode());
		result = 37
				* result
				+ (getVerVendorSource() == null ? 0 : this.getVerVendorSource()
						.hashCode());
		result = 37 * result
				+ (getVerSite() == null ? 0 : this.getVerSite().hashCode());
		result = 37 * result
				+ (getVerPart() == null ? 0 : this.getVerPart().hashCode());
		result = 37
				* result
				+ (getVerCommCode() == null ? 0 : this.getVerCommCode()
						.hashCode());
		return result;
	}

}