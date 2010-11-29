package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEctMstrId entity provides the base persistence definition of the
 * EctMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEctMstrId implements java.io.Serializable {

	// Fields

	private String ectDomain;
	private String ectType;
	private String ectDsgnGrp;

	// Constructors

	/** default constructor */
	public AbstractEctMstrId() {
	}

	/** minimal constructor */
	public AbstractEctMstrId(String ectDomain) {
		this.ectDomain = ectDomain;
	}

	/** full constructor */
	public AbstractEctMstrId(String ectDomain, String ectType, String ectDsgnGrp) {
		this.ectDomain = ectDomain;
		this.ectType = ectType;
		this.ectDsgnGrp = ectDsgnGrp;
	}

	// Property accessors

	public String getEctDomain() {
		return this.ectDomain;
	}

	public void setEctDomain(String ectDomain) {
		this.ectDomain = ectDomain;
	}

	public String getEctType() {
		return this.ectType;
	}

	public void setEctType(String ectType) {
		this.ectType = ectType;
	}

	public String getEctDsgnGrp() {
		return this.ectDsgnGrp;
	}

	public void setEctDsgnGrp(String ectDsgnGrp) {
		this.ectDsgnGrp = ectDsgnGrp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEctMstrId))
			return false;
		AbstractEctMstrId castOther = (AbstractEctMstrId) other;

		return ((this.getEctDomain() == castOther.getEctDomain()) || (this
				.getEctDomain() != null
				&& castOther.getEctDomain() != null && this.getEctDomain()
				.equals(castOther.getEctDomain())))
				&& ((this.getEctType() == castOther.getEctType()) || (this
						.getEctType() != null
						&& castOther.getEctType() != null && this.getEctType()
						.equals(castOther.getEctType())))
				&& ((this.getEctDsgnGrp() == castOther.getEctDsgnGrp()) || (this
						.getEctDsgnGrp() != null
						&& castOther.getEctDsgnGrp() != null && this
						.getEctDsgnGrp().equals(castOther.getEctDsgnGrp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEctDomain() == null ? 0 : this.getEctDomain().hashCode());
		result = 37 * result
				+ (getEctType() == null ? 0 : this.getEctType().hashCode());
		result = 37
				* result
				+ (getEctDsgnGrp() == null ? 0 : this.getEctDsgnGrp()
						.hashCode());
		return result;
	}

}