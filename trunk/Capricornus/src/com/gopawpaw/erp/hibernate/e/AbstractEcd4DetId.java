package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcd4DetId entity provides the base persistence definition of the
 * Ecd4DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd4DetId implements java.io.Serializable {

	// Fields

	private String ecd4Domain;
	private String ecd4Part;
	private String ecd4Routing;
	private Integer ecd4Op;
	private String ecd4Nbr;
	private String ecd4Sequence;

	// Constructors

	/** default constructor */
	public AbstractEcd4DetId() {
	}

	/** full constructor */
	public AbstractEcd4DetId(String ecd4Domain, String ecd4Part,
			String ecd4Routing, Integer ecd4Op, String ecd4Nbr,
			String ecd4Sequence) {
		this.ecd4Domain = ecd4Domain;
		this.ecd4Part = ecd4Part;
		this.ecd4Routing = ecd4Routing;
		this.ecd4Op = ecd4Op;
		this.ecd4Nbr = ecd4Nbr;
		this.ecd4Sequence = ecd4Sequence;
	}

	// Property accessors

	public String getEcd4Domain() {
		return this.ecd4Domain;
	}

	public void setEcd4Domain(String ecd4Domain) {
		this.ecd4Domain = ecd4Domain;
	}

	public String getEcd4Part() {
		return this.ecd4Part;
	}

	public void setEcd4Part(String ecd4Part) {
		this.ecd4Part = ecd4Part;
	}

	public String getEcd4Routing() {
		return this.ecd4Routing;
	}

	public void setEcd4Routing(String ecd4Routing) {
		this.ecd4Routing = ecd4Routing;
	}

	public Integer getEcd4Op() {
		return this.ecd4Op;
	}

	public void setEcd4Op(Integer ecd4Op) {
		this.ecd4Op = ecd4Op;
	}

	public String getEcd4Nbr() {
		return this.ecd4Nbr;
	}

	public void setEcd4Nbr(String ecd4Nbr) {
		this.ecd4Nbr = ecd4Nbr;
	}

	public String getEcd4Sequence() {
		return this.ecd4Sequence;
	}

	public void setEcd4Sequence(String ecd4Sequence) {
		this.ecd4Sequence = ecd4Sequence;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcd4DetId))
			return false;
		AbstractEcd4DetId castOther = (AbstractEcd4DetId) other;

		return ((this.getEcd4Domain() == castOther.getEcd4Domain()) || (this
				.getEcd4Domain() != null
				&& castOther.getEcd4Domain() != null && this.getEcd4Domain()
				.equals(castOther.getEcd4Domain())))
				&& ((this.getEcd4Part() == castOther.getEcd4Part()) || (this
						.getEcd4Part() != null
						&& castOther.getEcd4Part() != null && this
						.getEcd4Part().equals(castOther.getEcd4Part())))
				&& ((this.getEcd4Routing() == castOther.getEcd4Routing()) || (this
						.getEcd4Routing() != null
						&& castOther.getEcd4Routing() != null && this
						.getEcd4Routing().equals(castOther.getEcd4Routing())))
				&& ((this.getEcd4Op() == castOther.getEcd4Op()) || (this
						.getEcd4Op() != null
						&& castOther.getEcd4Op() != null && this.getEcd4Op()
						.equals(castOther.getEcd4Op())))
				&& ((this.getEcd4Nbr() == castOther.getEcd4Nbr()) || (this
						.getEcd4Nbr() != null
						&& castOther.getEcd4Nbr() != null && this.getEcd4Nbr()
						.equals(castOther.getEcd4Nbr())))
				&& ((this.getEcd4Sequence() == castOther.getEcd4Sequence()) || (this
						.getEcd4Sequence() != null
						&& castOther.getEcd4Sequence() != null && this
						.getEcd4Sequence().equals(castOther.getEcd4Sequence())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEcd4Domain() == null ? 0 : this.getEcd4Domain()
						.hashCode());
		result = 37 * result
				+ (getEcd4Part() == null ? 0 : this.getEcd4Part().hashCode());
		result = 37
				* result
				+ (getEcd4Routing() == null ? 0 : this.getEcd4Routing()
						.hashCode());
		result = 37 * result
				+ (getEcd4Op() == null ? 0 : this.getEcd4Op().hashCode());
		result = 37 * result
				+ (getEcd4Nbr() == null ? 0 : this.getEcd4Nbr().hashCode());
		result = 37
				* result
				+ (getEcd4Sequence() == null ? 0 : this.getEcd4Sequence()
						.hashCode());
		return result;
	}

}