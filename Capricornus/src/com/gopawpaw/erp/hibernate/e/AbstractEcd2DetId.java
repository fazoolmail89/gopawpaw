package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcd2DetId entity provides the base persistence definition of the
 * Ecd2DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd2DetId implements java.io.Serializable {

	// Fields

	private String ecd2Domain;
	private String ecd2Nbr;
	private String ecd2Routing;
	private Integer ecd2Op;

	// Constructors

	/** default constructor */
	public AbstractEcd2DetId() {
	}

	/** minimal constructor */
	public AbstractEcd2DetId(String ecd2Domain, String ecd2Routing,
			Integer ecd2Op) {
		this.ecd2Domain = ecd2Domain;
		this.ecd2Routing = ecd2Routing;
		this.ecd2Op = ecd2Op;
	}

	/** full constructor */
	public AbstractEcd2DetId(String ecd2Domain, String ecd2Nbr,
			String ecd2Routing, Integer ecd2Op) {
		this.ecd2Domain = ecd2Domain;
		this.ecd2Nbr = ecd2Nbr;
		this.ecd2Routing = ecd2Routing;
		this.ecd2Op = ecd2Op;
	}

	// Property accessors

	public String getEcd2Domain() {
		return this.ecd2Domain;
	}

	public void setEcd2Domain(String ecd2Domain) {
		this.ecd2Domain = ecd2Domain;
	}

	public String getEcd2Nbr() {
		return this.ecd2Nbr;
	}

	public void setEcd2Nbr(String ecd2Nbr) {
		this.ecd2Nbr = ecd2Nbr;
	}

	public String getEcd2Routing() {
		return this.ecd2Routing;
	}

	public void setEcd2Routing(String ecd2Routing) {
		this.ecd2Routing = ecd2Routing;
	}

	public Integer getEcd2Op() {
		return this.ecd2Op;
	}

	public void setEcd2Op(Integer ecd2Op) {
		this.ecd2Op = ecd2Op;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcd2DetId))
			return false;
		AbstractEcd2DetId castOther = (AbstractEcd2DetId) other;

		return ((this.getEcd2Domain() == castOther.getEcd2Domain()) || (this
				.getEcd2Domain() != null
				&& castOther.getEcd2Domain() != null && this.getEcd2Domain()
				.equals(castOther.getEcd2Domain())))
				&& ((this.getEcd2Nbr() == castOther.getEcd2Nbr()) || (this
						.getEcd2Nbr() != null
						&& castOther.getEcd2Nbr() != null && this.getEcd2Nbr()
						.equals(castOther.getEcd2Nbr())))
				&& ((this.getEcd2Routing() == castOther.getEcd2Routing()) || (this
						.getEcd2Routing() != null
						&& castOther.getEcd2Routing() != null && this
						.getEcd2Routing().equals(castOther.getEcd2Routing())))
				&& ((this.getEcd2Op() == castOther.getEcd2Op()) || (this
						.getEcd2Op() != null
						&& castOther.getEcd2Op() != null && this.getEcd2Op()
						.equals(castOther.getEcd2Op())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEcd2Domain() == null ? 0 : this.getEcd2Domain()
						.hashCode());
		result = 37 * result
				+ (getEcd2Nbr() == null ? 0 : this.getEcd2Nbr().hashCode());
		result = 37
				* result
				+ (getEcd2Routing() == null ? 0 : this.getEcd2Routing()
						.hashCode());
		result = 37 * result
				+ (getEcd2Op() == null ? 0 : this.getEcd2Op().hashCode());
		return result;
	}

}