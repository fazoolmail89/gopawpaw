package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractArMstrId entity provides the base persistence definition of the
 * ArMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArMstrId implements java.io.Serializable {

	// Fields

	private String arDomain;
	private String arNbr;

	// Constructors

	/** default constructor */
	public AbstractArMstrId() {
	}

	/** minimal constructor */
	public AbstractArMstrId(String arDomain) {
		this.arDomain = arDomain;
	}

	/** full constructor */
	public AbstractArMstrId(String arDomain, String arNbr) {
		this.arDomain = arDomain;
		this.arNbr = arNbr;
	}

	// Property accessors

	public String getArDomain() {
		return this.arDomain;
	}

	public void setArDomain(String arDomain) {
		this.arDomain = arDomain;
	}

	public String getArNbr() {
		return this.arNbr;
	}

	public void setArNbr(String arNbr) {
		this.arNbr = arNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractArMstrId))
			return false;
		AbstractArMstrId castOther = (AbstractArMstrId) other;

		return ((this.getArDomain() == castOther.getArDomain()) || (this
				.getArDomain() != null
				&& castOther.getArDomain() != null && this.getArDomain()
				.equals(castOther.getArDomain())))
				&& ((this.getArNbr() == castOther.getArNbr()) || (this
						.getArNbr() != null
						&& castOther.getArNbr() != null && this.getArNbr()
						.equals(castOther.getArNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getArDomain() == null ? 0 : this.getArDomain().hashCode());
		result = 37 * result
				+ (getArNbr() == null ? 0 : this.getArNbr().hashCode());
		return result;
	}

}