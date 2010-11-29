package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSadhHistId entity provides the base persistence definition of the
 * SadhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSadhHistId implements java.io.Serializable {

	// Fields

	private String sadhDomain;
	private Integer sadhTrnbr;

	// Constructors

	/** default constructor */
	public AbstractSadhHistId() {
	}

	/** minimal constructor */
	public AbstractSadhHistId(String sadhDomain) {
		this.sadhDomain = sadhDomain;
	}

	/** full constructor */
	public AbstractSadhHistId(String sadhDomain, Integer sadhTrnbr) {
		this.sadhDomain = sadhDomain;
		this.sadhTrnbr = sadhTrnbr;
	}

	// Property accessors

	public String getSadhDomain() {
		return this.sadhDomain;
	}

	public void setSadhDomain(String sadhDomain) {
		this.sadhDomain = sadhDomain;
	}

	public Integer getSadhTrnbr() {
		return this.sadhTrnbr;
	}

	public void setSadhTrnbr(Integer sadhTrnbr) {
		this.sadhTrnbr = sadhTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSadhHistId))
			return false;
		AbstractSadhHistId castOther = (AbstractSadhHistId) other;

		return ((this.getSadhDomain() == castOther.getSadhDomain()) || (this
				.getSadhDomain() != null
				&& castOther.getSadhDomain() != null && this.getSadhDomain()
				.equals(castOther.getSadhDomain())))
				&& ((this.getSadhTrnbr() == castOther.getSadhTrnbr()) || (this
						.getSadhTrnbr() != null
						&& castOther.getSadhTrnbr() != null && this
						.getSadhTrnbr().equals(castOther.getSadhTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSadhDomain() == null ? 0 : this.getSadhDomain()
						.hashCode());
		result = 37 * result
				+ (getSadhTrnbr() == null ? 0 : this.getSadhTrnbr().hashCode());
		return result;
	}

}