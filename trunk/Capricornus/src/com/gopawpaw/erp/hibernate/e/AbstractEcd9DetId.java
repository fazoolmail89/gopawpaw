package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcd9DetId entity provides the base persistence definition of the
 * Ecd9DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd9DetId implements java.io.Serializable {

	// Fields

	private String ecd9Domain;
	private String ecd9Nbr;
	private String ecd9Group;

	// Constructors

	/** default constructor */
	public AbstractEcd9DetId() {
	}

	/** minimal constructor */
	public AbstractEcd9DetId(String ecd9Domain) {
		this.ecd9Domain = ecd9Domain;
	}

	/** full constructor */
	public AbstractEcd9DetId(String ecd9Domain, String ecd9Nbr, String ecd9Group) {
		this.ecd9Domain = ecd9Domain;
		this.ecd9Nbr = ecd9Nbr;
		this.ecd9Group = ecd9Group;
	}

	// Property accessors

	public String getEcd9Domain() {
		return this.ecd9Domain;
	}

	public void setEcd9Domain(String ecd9Domain) {
		this.ecd9Domain = ecd9Domain;
	}

	public String getEcd9Nbr() {
		return this.ecd9Nbr;
	}

	public void setEcd9Nbr(String ecd9Nbr) {
		this.ecd9Nbr = ecd9Nbr;
	}

	public String getEcd9Group() {
		return this.ecd9Group;
	}

	public void setEcd9Group(String ecd9Group) {
		this.ecd9Group = ecd9Group;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcd9DetId))
			return false;
		AbstractEcd9DetId castOther = (AbstractEcd9DetId) other;

		return ((this.getEcd9Domain() == castOther.getEcd9Domain()) || (this
				.getEcd9Domain() != null
				&& castOther.getEcd9Domain() != null && this.getEcd9Domain()
				.equals(castOther.getEcd9Domain())))
				&& ((this.getEcd9Nbr() == castOther.getEcd9Nbr()) || (this
						.getEcd9Nbr() != null
						&& castOther.getEcd9Nbr() != null && this.getEcd9Nbr()
						.equals(castOther.getEcd9Nbr())))
				&& ((this.getEcd9Group() == castOther.getEcd9Group()) || (this
						.getEcd9Group() != null
						&& castOther.getEcd9Group() != null && this
						.getEcd9Group().equals(castOther.getEcd9Group())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEcd9Domain() == null ? 0 : this.getEcd9Domain()
						.hashCode());
		result = 37 * result
				+ (getEcd9Nbr() == null ? 0 : this.getEcd9Nbr().hashCode());
		result = 37 * result
				+ (getEcd9Group() == null ? 0 : this.getEcd9Group().hashCode());
		return result;
	}

}