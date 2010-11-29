package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDsdDetId entity provides the base persistence definition of the
 * DsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDsdDetId implements java.io.Serializable {

	// Fields

	private String dsdDomain;
	private String dsdSite;
	private String dsdReqNbr;
	private String dsdShipsite;

	// Constructors

	/** default constructor */
	public AbstractDsdDetId() {
	}

	/** minimal constructor */
	public AbstractDsdDetId(String dsdDomain, String dsdReqNbr) {
		this.dsdDomain = dsdDomain;
		this.dsdReqNbr = dsdReqNbr;
	}

	/** full constructor */
	public AbstractDsdDetId(String dsdDomain, String dsdSite, String dsdReqNbr,
			String dsdShipsite) {
		this.dsdDomain = dsdDomain;
		this.dsdSite = dsdSite;
		this.dsdReqNbr = dsdReqNbr;
		this.dsdShipsite = dsdShipsite;
	}

	// Property accessors

	public String getDsdDomain() {
		return this.dsdDomain;
	}

	public void setDsdDomain(String dsdDomain) {
		this.dsdDomain = dsdDomain;
	}

	public String getDsdSite() {
		return this.dsdSite;
	}

	public void setDsdSite(String dsdSite) {
		this.dsdSite = dsdSite;
	}

	public String getDsdReqNbr() {
		return this.dsdReqNbr;
	}

	public void setDsdReqNbr(String dsdReqNbr) {
		this.dsdReqNbr = dsdReqNbr;
	}

	public String getDsdShipsite() {
		return this.dsdShipsite;
	}

	public void setDsdShipsite(String dsdShipsite) {
		this.dsdShipsite = dsdShipsite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDsdDetId))
			return false;
		AbstractDsdDetId castOther = (AbstractDsdDetId) other;

		return ((this.getDsdDomain() == castOther.getDsdDomain()) || (this
				.getDsdDomain() != null
				&& castOther.getDsdDomain() != null && this.getDsdDomain()
				.equals(castOther.getDsdDomain())))
				&& ((this.getDsdSite() == castOther.getDsdSite()) || (this
						.getDsdSite() != null
						&& castOther.getDsdSite() != null && this.getDsdSite()
						.equals(castOther.getDsdSite())))
				&& ((this.getDsdReqNbr() == castOther.getDsdReqNbr()) || (this
						.getDsdReqNbr() != null
						&& castOther.getDsdReqNbr() != null && this
						.getDsdReqNbr().equals(castOther.getDsdReqNbr())))
				&& ((this.getDsdShipsite() == castOther.getDsdShipsite()) || (this
						.getDsdShipsite() != null
						&& castOther.getDsdShipsite() != null && this
						.getDsdShipsite().equals(castOther.getDsdShipsite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDsdDomain() == null ? 0 : this.getDsdDomain().hashCode());
		result = 37 * result
				+ (getDsdSite() == null ? 0 : this.getDsdSite().hashCode());
		result = 37 * result
				+ (getDsdReqNbr() == null ? 0 : this.getDsdReqNbr().hashCode());
		result = 37
				* result
				+ (getDsdShipsite() == null ? 0 : this.getDsdShipsite()
						.hashCode());
		return result;
	}

}