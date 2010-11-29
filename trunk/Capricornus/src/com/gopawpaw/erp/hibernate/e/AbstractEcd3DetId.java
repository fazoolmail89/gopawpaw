package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcd3DetId entity provides the base persistence definition of the
 * Ecd3DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd3DetId implements java.io.Serializable {

	// Fields

	private String ecd3Domain;
	private String ecd3Nbr;
	private Integer ecd3Cmtindx;

	// Constructors

	/** default constructor */
	public AbstractEcd3DetId() {
	}

	/** minimal constructor */
	public AbstractEcd3DetId(String ecd3Domain) {
		this.ecd3Domain = ecd3Domain;
	}

	/** full constructor */
	public AbstractEcd3DetId(String ecd3Domain, String ecd3Nbr,
			Integer ecd3Cmtindx) {
		this.ecd3Domain = ecd3Domain;
		this.ecd3Nbr = ecd3Nbr;
		this.ecd3Cmtindx = ecd3Cmtindx;
	}

	// Property accessors

	public String getEcd3Domain() {
		return this.ecd3Domain;
	}

	public void setEcd3Domain(String ecd3Domain) {
		this.ecd3Domain = ecd3Domain;
	}

	public String getEcd3Nbr() {
		return this.ecd3Nbr;
	}

	public void setEcd3Nbr(String ecd3Nbr) {
		this.ecd3Nbr = ecd3Nbr;
	}

	public Integer getEcd3Cmtindx() {
		return this.ecd3Cmtindx;
	}

	public void setEcd3Cmtindx(Integer ecd3Cmtindx) {
		this.ecd3Cmtindx = ecd3Cmtindx;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcd3DetId))
			return false;
		AbstractEcd3DetId castOther = (AbstractEcd3DetId) other;

		return ((this.getEcd3Domain() == castOther.getEcd3Domain()) || (this
				.getEcd3Domain() != null
				&& castOther.getEcd3Domain() != null && this.getEcd3Domain()
				.equals(castOther.getEcd3Domain())))
				&& ((this.getEcd3Nbr() == castOther.getEcd3Nbr()) || (this
						.getEcd3Nbr() != null
						&& castOther.getEcd3Nbr() != null && this.getEcd3Nbr()
						.equals(castOther.getEcd3Nbr())))
				&& ((this.getEcd3Cmtindx() == castOther.getEcd3Cmtindx()) || (this
						.getEcd3Cmtindx() != null
						&& castOther.getEcd3Cmtindx() != null && this
						.getEcd3Cmtindx().equals(castOther.getEcd3Cmtindx())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEcd3Domain() == null ? 0 : this.getEcd3Domain()
						.hashCode());
		result = 37 * result
				+ (getEcd3Nbr() == null ? 0 : this.getEcd3Nbr().hashCode());
		result = 37
				* result
				+ (getEcd3Cmtindx() == null ? 0 : this.getEcd3Cmtindx()
						.hashCode());
		return result;
	}

}