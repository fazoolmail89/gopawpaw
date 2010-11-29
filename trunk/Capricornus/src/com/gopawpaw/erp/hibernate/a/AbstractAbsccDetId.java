package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbsccDetId entity provides the base persistence definition of the
 * AbsccDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsccDetId implements java.io.Serializable {

	// Fields

	private String absccDomain;
	private String absccAbsId;
	private String absccAbsShipfrom;

	// Constructors

	/** default constructor */
	public AbstractAbsccDetId() {
	}

	/** full constructor */
	public AbstractAbsccDetId(String absccDomain, String absccAbsId,
			String absccAbsShipfrom) {
		this.absccDomain = absccDomain;
		this.absccAbsId = absccAbsId;
		this.absccAbsShipfrom = absccAbsShipfrom;
	}

	// Property accessors

	public String getAbsccDomain() {
		return this.absccDomain;
	}

	public void setAbsccDomain(String absccDomain) {
		this.absccDomain = absccDomain;
	}

	public String getAbsccAbsId() {
		return this.absccAbsId;
	}

	public void setAbsccAbsId(String absccAbsId) {
		this.absccAbsId = absccAbsId;
	}

	public String getAbsccAbsShipfrom() {
		return this.absccAbsShipfrom;
	}

	public void setAbsccAbsShipfrom(String absccAbsShipfrom) {
		this.absccAbsShipfrom = absccAbsShipfrom;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbsccDetId))
			return false;
		AbstractAbsccDetId castOther = (AbstractAbsccDetId) other;

		return ((this.getAbsccDomain() == castOther.getAbsccDomain()) || (this
				.getAbsccDomain() != null
				&& castOther.getAbsccDomain() != null && this.getAbsccDomain()
				.equals(castOther.getAbsccDomain())))
				&& ((this.getAbsccAbsId() == castOther.getAbsccAbsId()) || (this
						.getAbsccAbsId() != null
						&& castOther.getAbsccAbsId() != null && this
						.getAbsccAbsId().equals(castOther.getAbsccAbsId())))
				&& ((this.getAbsccAbsShipfrom() == castOther
						.getAbsccAbsShipfrom()) || (this.getAbsccAbsShipfrom() != null
						&& castOther.getAbsccAbsShipfrom() != null && this
						.getAbsccAbsShipfrom().equals(
								castOther.getAbsccAbsShipfrom())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAbsccDomain() == null ? 0 : this.getAbsccDomain()
						.hashCode());
		result = 37
				* result
				+ (getAbsccAbsId() == null ? 0 : this.getAbsccAbsId()
						.hashCode());
		result = 37
				* result
				+ (getAbsccAbsShipfrom() == null ? 0 : this
						.getAbsccAbsShipfrom().hashCode());
		return result;
	}

}