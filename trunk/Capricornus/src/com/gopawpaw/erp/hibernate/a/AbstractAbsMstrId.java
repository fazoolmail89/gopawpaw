package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAbsMstrId entity provides the base persistence definition of the
 * AbsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsMstrId implements java.io.Serializable {

	// Fields

	private String absDomain;
	private String absShipfrom;
	private String absId;

	// Constructors

	/** default constructor */
	public AbstractAbsMstrId() {
	}

	/** minimal constructor */
	public AbstractAbsMstrId(String absDomain) {
		this.absDomain = absDomain;
	}

	/** full constructor */
	public AbstractAbsMstrId(String absDomain, String absShipfrom, String absId) {
		this.absDomain = absDomain;
		this.absShipfrom = absShipfrom;
		this.absId = absId;
	}

	// Property accessors

	public String getAbsDomain() {
		return this.absDomain;
	}

	public void setAbsDomain(String absDomain) {
		this.absDomain = absDomain;
	}

	public String getAbsShipfrom() {
		return this.absShipfrom;
	}

	public void setAbsShipfrom(String absShipfrom) {
		this.absShipfrom = absShipfrom;
	}

	public String getAbsId() {
		return this.absId;
	}

	public void setAbsId(String absId) {
		this.absId = absId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbsMstrId))
			return false;
		AbstractAbsMstrId castOther = (AbstractAbsMstrId) other;

		return ((this.getAbsDomain() == castOther.getAbsDomain()) || (this
				.getAbsDomain() != null
				&& castOther.getAbsDomain() != null && this.getAbsDomain()
				.equals(castOther.getAbsDomain())))
				&& ((this.getAbsShipfrom() == castOther.getAbsShipfrom()) || (this
						.getAbsShipfrom() != null
						&& castOther.getAbsShipfrom() != null && this
						.getAbsShipfrom().equals(castOther.getAbsShipfrom())))
				&& ((this.getAbsId() == castOther.getAbsId()) || (this
						.getAbsId() != null
						&& castOther.getAbsId() != null && this.getAbsId()
						.equals(castOther.getAbsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAbsDomain() == null ? 0 : this.getAbsDomain().hashCode());
		result = 37
				* result
				+ (getAbsShipfrom() == null ? 0 : this.getAbsShipfrom()
						.hashCode());
		result = 37 * result
				+ (getAbsId() == null ? 0 : this.getAbsId().hashCode());
		return result;
	}

}