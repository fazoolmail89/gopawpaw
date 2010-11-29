package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFacdDetId entity provides the base persistence definition of the
 * FacdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFacdDetId implements java.io.Serializable {

	// Fields

	private String facdDomain;
	private String facdFaclsId;
	private String facdAcctype;

	// Constructors

	/** default constructor */
	public AbstractFacdDetId() {
	}

	/** full constructor */
	public AbstractFacdDetId(String facdDomain, String facdFaclsId,
			String facdAcctype) {
		this.facdDomain = facdDomain;
		this.facdFaclsId = facdFaclsId;
		this.facdAcctype = facdAcctype;
	}

	// Property accessors

	public String getFacdDomain() {
		return this.facdDomain;
	}

	public void setFacdDomain(String facdDomain) {
		this.facdDomain = facdDomain;
	}

	public String getFacdFaclsId() {
		return this.facdFaclsId;
	}

	public void setFacdFaclsId(String facdFaclsId) {
		this.facdFaclsId = facdFaclsId;
	}

	public String getFacdAcctype() {
		return this.facdAcctype;
	}

	public void setFacdAcctype(String facdAcctype) {
		this.facdAcctype = facdAcctype;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFacdDetId))
			return false;
		AbstractFacdDetId castOther = (AbstractFacdDetId) other;

		return ((this.getFacdDomain() == castOther.getFacdDomain()) || (this
				.getFacdDomain() != null
				&& castOther.getFacdDomain() != null && this.getFacdDomain()
				.equals(castOther.getFacdDomain())))
				&& ((this.getFacdFaclsId() == castOther.getFacdFaclsId()) || (this
						.getFacdFaclsId() != null
						&& castOther.getFacdFaclsId() != null && this
						.getFacdFaclsId().equals(castOther.getFacdFaclsId())))
				&& ((this.getFacdAcctype() == castOther.getFacdAcctype()) || (this
						.getFacdAcctype() != null
						&& castOther.getFacdAcctype() != null && this
						.getFacdAcctype().equals(castOther.getFacdAcctype())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFacdDomain() == null ? 0 : this.getFacdDomain()
						.hashCode());
		result = 37
				* result
				+ (getFacdFaclsId() == null ? 0 : this.getFacdFaclsId()
						.hashCode());
		result = 37
				* result
				+ (getFacdAcctype() == null ? 0 : this.getFacdAcctype()
						.hashCode());
		return result;
	}

}