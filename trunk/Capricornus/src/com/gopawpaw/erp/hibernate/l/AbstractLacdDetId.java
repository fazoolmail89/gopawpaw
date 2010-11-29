package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLacdDetId entity provides the base persistence definition of the
 * LacdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLacdDetId implements java.io.Serializable {

	// Fields

	private String lacdDomain;
	private String lacdInternalRef;
	private String lacdShipfrom;
	private String lacdLcCharge;
	private String lacdInternalRefType;

	// Constructors

	/** default constructor */
	public AbstractLacdDetId() {
	}

	/** full constructor */
	public AbstractLacdDetId(String lacdDomain, String lacdInternalRef,
			String lacdShipfrom, String lacdLcCharge, String lacdInternalRefType) {
		this.lacdDomain = lacdDomain;
		this.lacdInternalRef = lacdInternalRef;
		this.lacdShipfrom = lacdShipfrom;
		this.lacdLcCharge = lacdLcCharge;
		this.lacdInternalRefType = lacdInternalRefType;
	}

	// Property accessors

	public String getLacdDomain() {
		return this.lacdDomain;
	}

	public void setLacdDomain(String lacdDomain) {
		this.lacdDomain = lacdDomain;
	}

	public String getLacdInternalRef() {
		return this.lacdInternalRef;
	}

	public void setLacdInternalRef(String lacdInternalRef) {
		this.lacdInternalRef = lacdInternalRef;
	}

	public String getLacdShipfrom() {
		return this.lacdShipfrom;
	}

	public void setLacdShipfrom(String lacdShipfrom) {
		this.lacdShipfrom = lacdShipfrom;
	}

	public String getLacdLcCharge() {
		return this.lacdLcCharge;
	}

	public void setLacdLcCharge(String lacdLcCharge) {
		this.lacdLcCharge = lacdLcCharge;
	}

	public String getLacdInternalRefType() {
		return this.lacdInternalRefType;
	}

	public void setLacdInternalRefType(String lacdInternalRefType) {
		this.lacdInternalRefType = lacdInternalRefType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLacdDetId))
			return false;
		AbstractLacdDetId castOther = (AbstractLacdDetId) other;

		return ((this.getLacdDomain() == castOther.getLacdDomain()) || (this
				.getLacdDomain() != null
				&& castOther.getLacdDomain() != null && this.getLacdDomain()
				.equals(castOther.getLacdDomain())))
				&& ((this.getLacdInternalRef() == castOther
						.getLacdInternalRef()) || (this.getLacdInternalRef() != null
						&& castOther.getLacdInternalRef() != null && this
						.getLacdInternalRef().equals(
								castOther.getLacdInternalRef())))
				&& ((this.getLacdShipfrom() == castOther.getLacdShipfrom()) || (this
						.getLacdShipfrom() != null
						&& castOther.getLacdShipfrom() != null && this
						.getLacdShipfrom().equals(castOther.getLacdShipfrom())))
				&& ((this.getLacdLcCharge() == castOther.getLacdLcCharge()) || (this
						.getLacdLcCharge() != null
						&& castOther.getLacdLcCharge() != null && this
						.getLacdLcCharge().equals(castOther.getLacdLcCharge())))
				&& ((this.getLacdInternalRefType() == castOther
						.getLacdInternalRefType()) || (this
						.getLacdInternalRefType() != null
						&& castOther.getLacdInternalRefType() != null && this
						.getLacdInternalRefType().equals(
								castOther.getLacdInternalRefType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLacdDomain() == null ? 0 : this.getLacdDomain()
						.hashCode());
		result = 37
				* result
				+ (getLacdInternalRef() == null ? 0 : this.getLacdInternalRef()
						.hashCode());
		result = 37
				* result
				+ (getLacdShipfrom() == null ? 0 : this.getLacdShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getLacdLcCharge() == null ? 0 : this.getLacdLcCharge()
						.hashCode());
		result = 37
				* result
				+ (getLacdInternalRefType() == null ? 0 : this
						.getLacdInternalRefType().hashCode());
		return result;
	}

}