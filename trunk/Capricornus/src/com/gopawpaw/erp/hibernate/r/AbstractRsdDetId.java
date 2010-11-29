package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRsdDetId entity provides the base persistence definition of the
 * RsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsdDetId implements java.io.Serializable {

	// Fields

	private String rsdDomain;
	private String rsdRsc;
	private String rsdSite;
	private String rsdRef;

	// Constructors

	/** default constructor */
	public AbstractRsdDetId() {
	}

	/** minimal constructor */
	public AbstractRsdDetId(String rsdDomain, String rsdRsc) {
		this.rsdDomain = rsdDomain;
		this.rsdRsc = rsdRsc;
	}

	/** full constructor */
	public AbstractRsdDetId(String rsdDomain, String rsdRsc, String rsdSite,
			String rsdRef) {
		this.rsdDomain = rsdDomain;
		this.rsdRsc = rsdRsc;
		this.rsdSite = rsdSite;
		this.rsdRef = rsdRef;
	}

	// Property accessors

	public String getRsdDomain() {
		return this.rsdDomain;
	}

	public void setRsdDomain(String rsdDomain) {
		this.rsdDomain = rsdDomain;
	}

	public String getRsdRsc() {
		return this.rsdRsc;
	}

	public void setRsdRsc(String rsdRsc) {
		this.rsdRsc = rsdRsc;
	}

	public String getRsdSite() {
		return this.rsdSite;
	}

	public void setRsdSite(String rsdSite) {
		this.rsdSite = rsdSite;
	}

	public String getRsdRef() {
		return this.rsdRef;
	}

	public void setRsdRef(String rsdRef) {
		this.rsdRef = rsdRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRsdDetId))
			return false;
		AbstractRsdDetId castOther = (AbstractRsdDetId) other;

		return ((this.getRsdDomain() == castOther.getRsdDomain()) || (this
				.getRsdDomain() != null
				&& castOther.getRsdDomain() != null && this.getRsdDomain()
				.equals(castOther.getRsdDomain())))
				&& ((this.getRsdRsc() == castOther.getRsdRsc()) || (this
						.getRsdRsc() != null
						&& castOther.getRsdRsc() != null && this.getRsdRsc()
						.equals(castOther.getRsdRsc())))
				&& ((this.getRsdSite() == castOther.getRsdSite()) || (this
						.getRsdSite() != null
						&& castOther.getRsdSite() != null && this.getRsdSite()
						.equals(castOther.getRsdSite())))
				&& ((this.getRsdRef() == castOther.getRsdRef()) || (this
						.getRsdRef() != null
						&& castOther.getRsdRef() != null && this.getRsdRef()
						.equals(castOther.getRsdRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRsdDomain() == null ? 0 : this.getRsdDomain().hashCode());
		result = 37 * result
				+ (getRsdRsc() == null ? 0 : this.getRsdRsc().hashCode());
		result = 37 * result
				+ (getRsdSite() == null ? 0 : this.getRsdSite().hashCode());
		result = 37 * result
				+ (getRsdRef() == null ? 0 : this.getRsdRef().hashCode());
		return result;
	}

}