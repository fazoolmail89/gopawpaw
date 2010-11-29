package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDsDetId entity provides the base persistence definition of the
 * DsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDsDetId implements java.io.Serializable {

	// Fields

	private String dsDomain;
	private String dsReqNbr;
	private String dsSite;
	private String dsShipsite;

	// Constructors

	/** default constructor */
	public AbstractDsDetId() {
	}

	/** minimal constructor */
	public AbstractDsDetId(String dsDomain, String dsReqNbr) {
		this.dsDomain = dsDomain;
		this.dsReqNbr = dsReqNbr;
	}

	/** full constructor */
	public AbstractDsDetId(String dsDomain, String dsReqNbr, String dsSite,
			String dsShipsite) {
		this.dsDomain = dsDomain;
		this.dsReqNbr = dsReqNbr;
		this.dsSite = dsSite;
		this.dsShipsite = dsShipsite;
	}

	// Property accessors

	public String getDsDomain() {
		return this.dsDomain;
	}

	public void setDsDomain(String dsDomain) {
		this.dsDomain = dsDomain;
	}

	public String getDsReqNbr() {
		return this.dsReqNbr;
	}

	public void setDsReqNbr(String dsReqNbr) {
		this.dsReqNbr = dsReqNbr;
	}

	public String getDsSite() {
		return this.dsSite;
	}

	public void setDsSite(String dsSite) {
		this.dsSite = dsSite;
	}

	public String getDsShipsite() {
		return this.dsShipsite;
	}

	public void setDsShipsite(String dsShipsite) {
		this.dsShipsite = dsShipsite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDsDetId))
			return false;
		AbstractDsDetId castOther = (AbstractDsDetId) other;

		return ((this.getDsDomain() == castOther.getDsDomain()) || (this
				.getDsDomain() != null
				&& castOther.getDsDomain() != null && this.getDsDomain()
				.equals(castOther.getDsDomain())))
				&& ((this.getDsReqNbr() == castOther.getDsReqNbr()) || (this
						.getDsReqNbr() != null
						&& castOther.getDsReqNbr() != null && this
						.getDsReqNbr().equals(castOther.getDsReqNbr())))
				&& ((this.getDsSite() == castOther.getDsSite()) || (this
						.getDsSite() != null
						&& castOther.getDsSite() != null && this.getDsSite()
						.equals(castOther.getDsSite())))
				&& ((this.getDsShipsite() == castOther.getDsShipsite()) || (this
						.getDsShipsite() != null
						&& castOther.getDsShipsite() != null && this
						.getDsShipsite().equals(castOther.getDsShipsite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDsDomain() == null ? 0 : this.getDsDomain().hashCode());
		result = 37 * result
				+ (getDsReqNbr() == null ? 0 : this.getDsReqNbr().hashCode());
		result = 37 * result
				+ (getDsSite() == null ? 0 : this.getDsSite().hashCode());
		result = 37
				* result
				+ (getDsShipsite() == null ? 0 : this.getDsShipsite()
						.hashCode());
		return result;
	}

}