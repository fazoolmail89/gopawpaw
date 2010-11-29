package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFndDetId entity provides the base persistence definition of the
 * FndDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFndDetId implements java.io.Serializable {

	// Fields

	private String fndDomain;
	private String fndNbr;
	private String fndCaNbr;

	// Constructors

	/** default constructor */
	public AbstractFndDetId() {
	}

	/** minimal constructor */
	public AbstractFndDetId(String fndDomain) {
		this.fndDomain = fndDomain;
	}

	/** full constructor */
	public AbstractFndDetId(String fndDomain, String fndNbr, String fndCaNbr) {
		this.fndDomain = fndDomain;
		this.fndNbr = fndNbr;
		this.fndCaNbr = fndCaNbr;
	}

	// Property accessors

	public String getFndDomain() {
		return this.fndDomain;
	}

	public void setFndDomain(String fndDomain) {
		this.fndDomain = fndDomain;
	}

	public String getFndNbr() {
		return this.fndNbr;
	}

	public void setFndNbr(String fndNbr) {
		this.fndNbr = fndNbr;
	}

	public String getFndCaNbr() {
		return this.fndCaNbr;
	}

	public void setFndCaNbr(String fndCaNbr) {
		this.fndCaNbr = fndCaNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFndDetId))
			return false;
		AbstractFndDetId castOther = (AbstractFndDetId) other;

		return ((this.getFndDomain() == castOther.getFndDomain()) || (this
				.getFndDomain() != null
				&& castOther.getFndDomain() != null && this.getFndDomain()
				.equals(castOther.getFndDomain())))
				&& ((this.getFndNbr() == castOther.getFndNbr()) || (this
						.getFndNbr() != null
						&& castOther.getFndNbr() != null && this.getFndNbr()
						.equals(castOther.getFndNbr())))
				&& ((this.getFndCaNbr() == castOther.getFndCaNbr()) || (this
						.getFndCaNbr() != null
						&& castOther.getFndCaNbr() != null && this
						.getFndCaNbr().equals(castOther.getFndCaNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFndDomain() == null ? 0 : this.getFndDomain().hashCode());
		result = 37 * result
				+ (getFndNbr() == null ? 0 : this.getFndNbr().hashCode());
		result = 37 * result
				+ (getFndCaNbr() == null ? 0 : this.getFndCaNbr().hashCode());
		return result;
	}

}