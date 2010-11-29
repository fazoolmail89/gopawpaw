package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcd1DetId entity provides the base persistence definition of the
 * Ecd1DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd1DetId implements java.io.Serializable {

	// Fields

	private String ecd1Domain;
	private String ecd1Nbr;
	private String ecd1Par;
	private String ecd1Comp;
	private String ecd1Ref;

	// Constructors

	/** default constructor */
	public AbstractEcd1DetId() {
	}

	/** minimal constructor */
	public AbstractEcd1DetId(String ecd1Domain, String ecd1Par, String ecd1Comp) {
		this.ecd1Domain = ecd1Domain;
		this.ecd1Par = ecd1Par;
		this.ecd1Comp = ecd1Comp;
	}

	/** full constructor */
	public AbstractEcd1DetId(String ecd1Domain, String ecd1Nbr, String ecd1Par,
			String ecd1Comp, String ecd1Ref) {
		this.ecd1Domain = ecd1Domain;
		this.ecd1Nbr = ecd1Nbr;
		this.ecd1Par = ecd1Par;
		this.ecd1Comp = ecd1Comp;
		this.ecd1Ref = ecd1Ref;
	}

	// Property accessors

	public String getEcd1Domain() {
		return this.ecd1Domain;
	}

	public void setEcd1Domain(String ecd1Domain) {
		this.ecd1Domain = ecd1Domain;
	}

	public String getEcd1Nbr() {
		return this.ecd1Nbr;
	}

	public void setEcd1Nbr(String ecd1Nbr) {
		this.ecd1Nbr = ecd1Nbr;
	}

	public String getEcd1Par() {
		return this.ecd1Par;
	}

	public void setEcd1Par(String ecd1Par) {
		this.ecd1Par = ecd1Par;
	}

	public String getEcd1Comp() {
		return this.ecd1Comp;
	}

	public void setEcd1Comp(String ecd1Comp) {
		this.ecd1Comp = ecd1Comp;
	}

	public String getEcd1Ref() {
		return this.ecd1Ref;
	}

	public void setEcd1Ref(String ecd1Ref) {
		this.ecd1Ref = ecd1Ref;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcd1DetId))
			return false;
		AbstractEcd1DetId castOther = (AbstractEcd1DetId) other;

		return ((this.getEcd1Domain() == castOther.getEcd1Domain()) || (this
				.getEcd1Domain() != null
				&& castOther.getEcd1Domain() != null && this.getEcd1Domain()
				.equals(castOther.getEcd1Domain())))
				&& ((this.getEcd1Nbr() == castOther.getEcd1Nbr()) || (this
						.getEcd1Nbr() != null
						&& castOther.getEcd1Nbr() != null && this.getEcd1Nbr()
						.equals(castOther.getEcd1Nbr())))
				&& ((this.getEcd1Par() == castOther.getEcd1Par()) || (this
						.getEcd1Par() != null
						&& castOther.getEcd1Par() != null && this.getEcd1Par()
						.equals(castOther.getEcd1Par())))
				&& ((this.getEcd1Comp() == castOther.getEcd1Comp()) || (this
						.getEcd1Comp() != null
						&& castOther.getEcd1Comp() != null && this
						.getEcd1Comp().equals(castOther.getEcd1Comp())))
				&& ((this.getEcd1Ref() == castOther.getEcd1Ref()) || (this
						.getEcd1Ref() != null
						&& castOther.getEcd1Ref() != null && this.getEcd1Ref()
						.equals(castOther.getEcd1Ref())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEcd1Domain() == null ? 0 : this.getEcd1Domain()
						.hashCode());
		result = 37 * result
				+ (getEcd1Nbr() == null ? 0 : this.getEcd1Nbr().hashCode());
		result = 37 * result
				+ (getEcd1Par() == null ? 0 : this.getEcd1Par().hashCode());
		result = 37 * result
				+ (getEcd1Comp() == null ? 0 : this.getEcd1Comp().hashCode());
		result = 37 * result
				+ (getEcd1Ref() == null ? 0 : this.getEcd1Ref().hashCode());
		return result;
	}

}