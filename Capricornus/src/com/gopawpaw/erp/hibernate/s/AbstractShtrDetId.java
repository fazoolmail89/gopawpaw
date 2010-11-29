package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShtrDetId entity provides the base persistence definition of the
 * ShtrDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShtrDetId implements java.io.Serializable {

	// Fields

	private String shtrDomain;
	private String shtrNbr;
	private String shtrShipId;
	private String shtrCd;

	// Constructors

	/** default constructor */
	public AbstractShtrDetId() {
	}

	/** minimal constructor */
	public AbstractShtrDetId(String shtrDomain, String shtrNbr) {
		this.shtrDomain = shtrDomain;
		this.shtrNbr = shtrNbr;
	}

	/** full constructor */
	public AbstractShtrDetId(String shtrDomain, String shtrNbr,
			String shtrShipId, String shtrCd) {
		this.shtrDomain = shtrDomain;
		this.shtrNbr = shtrNbr;
		this.shtrShipId = shtrShipId;
		this.shtrCd = shtrCd;
	}

	// Property accessors

	public String getShtrDomain() {
		return this.shtrDomain;
	}

	public void setShtrDomain(String shtrDomain) {
		this.shtrDomain = shtrDomain;
	}

	public String getShtrNbr() {
		return this.shtrNbr;
	}

	public void setShtrNbr(String shtrNbr) {
		this.shtrNbr = shtrNbr;
	}

	public String getShtrShipId() {
		return this.shtrShipId;
	}

	public void setShtrShipId(String shtrShipId) {
		this.shtrShipId = shtrShipId;
	}

	public String getShtrCd() {
		return this.shtrCd;
	}

	public void setShtrCd(String shtrCd) {
		this.shtrCd = shtrCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShtrDetId))
			return false;
		AbstractShtrDetId castOther = (AbstractShtrDetId) other;

		return ((this.getShtrDomain() == castOther.getShtrDomain()) || (this
				.getShtrDomain() != null
				&& castOther.getShtrDomain() != null && this.getShtrDomain()
				.equals(castOther.getShtrDomain())))
				&& ((this.getShtrNbr() == castOther.getShtrNbr()) || (this
						.getShtrNbr() != null
						&& castOther.getShtrNbr() != null && this.getShtrNbr()
						.equals(castOther.getShtrNbr())))
				&& ((this.getShtrShipId() == castOther.getShtrShipId()) || (this
						.getShtrShipId() != null
						&& castOther.getShtrShipId() != null && this
						.getShtrShipId().equals(castOther.getShtrShipId())))
				&& ((this.getShtrCd() == castOther.getShtrCd()) || (this
						.getShtrCd() != null
						&& castOther.getShtrCd() != null && this.getShtrCd()
						.equals(castOther.getShtrCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getShtrDomain() == null ? 0 : this.getShtrDomain()
						.hashCode());
		result = 37 * result
				+ (getShtrNbr() == null ? 0 : this.getShtrNbr().hashCode());
		result = 37
				* result
				+ (getShtrShipId() == null ? 0 : this.getShtrShipId()
						.hashCode());
		result = 37 * result
				+ (getShtrCd() == null ? 0 : this.getShtrCd().hashCode());
		return result;
	}

}