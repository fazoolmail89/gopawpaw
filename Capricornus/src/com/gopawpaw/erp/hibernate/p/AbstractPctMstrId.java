package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPctMstrId entity provides the base persistence definition of the
 * PctMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPctMstrId implements java.io.Serializable {

	// Fields

	private String pctDomain;
	private String pctType;
	private String pctDsgnGrp;

	// Constructors

	/** default constructor */
	public AbstractPctMstrId() {
	}

	/** full constructor */
	public AbstractPctMstrId(String pctDomain, String pctType, String pctDsgnGrp) {
		this.pctDomain = pctDomain;
		this.pctType = pctType;
		this.pctDsgnGrp = pctDsgnGrp;
	}

	// Property accessors

	public String getPctDomain() {
		return this.pctDomain;
	}

	public void setPctDomain(String pctDomain) {
		this.pctDomain = pctDomain;
	}

	public String getPctType() {
		return this.pctType;
	}

	public void setPctType(String pctType) {
		this.pctType = pctType;
	}

	public String getPctDsgnGrp() {
		return this.pctDsgnGrp;
	}

	public void setPctDsgnGrp(String pctDsgnGrp) {
		this.pctDsgnGrp = pctDsgnGrp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPctMstrId))
			return false;
		AbstractPctMstrId castOther = (AbstractPctMstrId) other;

		return ((this.getPctDomain() == castOther.getPctDomain()) || (this
				.getPctDomain() != null
				&& castOther.getPctDomain() != null && this.getPctDomain()
				.equals(castOther.getPctDomain())))
				&& ((this.getPctType() == castOther.getPctType()) || (this
						.getPctType() != null
						&& castOther.getPctType() != null && this.getPctType()
						.equals(castOther.getPctType())))
				&& ((this.getPctDsgnGrp() == castOther.getPctDsgnGrp()) || (this
						.getPctDsgnGrp() != null
						&& castOther.getPctDsgnGrp() != null && this
						.getPctDsgnGrp().equals(castOther.getPctDsgnGrp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPctDomain() == null ? 0 : this.getPctDomain().hashCode());
		result = 37 * result
				+ (getPctType() == null ? 0 : this.getPctType().hashCode());
		result = 37
				* result
				+ (getPctDsgnGrp() == null ? 0 : this.getPctDsgnGrp()
						.hashCode());
		return result;
	}

}