package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDssMstrId entity provides the base persistence definition of the
 * DssMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDssMstrId implements java.io.Serializable {

	// Fields

	private String dssDomain;
	private String dssNbr;
	private String dssShipsite;

	// Constructors

	/** default constructor */
	public AbstractDssMstrId() {
	}

	/** minimal constructor */
	public AbstractDssMstrId(String dssDomain, String dssNbr) {
		this.dssDomain = dssDomain;
		this.dssNbr = dssNbr;
	}

	/** full constructor */
	public AbstractDssMstrId(String dssDomain, String dssNbr, String dssShipsite) {
		this.dssDomain = dssDomain;
		this.dssNbr = dssNbr;
		this.dssShipsite = dssShipsite;
	}

	// Property accessors

	public String getDssDomain() {
		return this.dssDomain;
	}

	public void setDssDomain(String dssDomain) {
		this.dssDomain = dssDomain;
	}

	public String getDssNbr() {
		return this.dssNbr;
	}

	public void setDssNbr(String dssNbr) {
		this.dssNbr = dssNbr;
	}

	public String getDssShipsite() {
		return this.dssShipsite;
	}

	public void setDssShipsite(String dssShipsite) {
		this.dssShipsite = dssShipsite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDssMstrId))
			return false;
		AbstractDssMstrId castOther = (AbstractDssMstrId) other;

		return ((this.getDssDomain() == castOther.getDssDomain()) || (this
				.getDssDomain() != null
				&& castOther.getDssDomain() != null && this.getDssDomain()
				.equals(castOther.getDssDomain())))
				&& ((this.getDssNbr() == castOther.getDssNbr()) || (this
						.getDssNbr() != null
						&& castOther.getDssNbr() != null && this.getDssNbr()
						.equals(castOther.getDssNbr())))
				&& ((this.getDssShipsite() == castOther.getDssShipsite()) || (this
						.getDssShipsite() != null
						&& castOther.getDssShipsite() != null && this
						.getDssShipsite().equals(castOther.getDssShipsite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDssDomain() == null ? 0 : this.getDssDomain().hashCode());
		result = 37 * result
				+ (getDssNbr() == null ? 0 : this.getDssNbr().hashCode());
		result = 37
				* result
				+ (getDssShipsite() == null ? 0 : this.getDssShipsite()
						.hashCode());
		return result;
	}

}