package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSahHistId entity provides the base persistence definition of the
 * SahHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSahHistId implements java.io.Serializable {

	// Fields

	private String sahDomain;
	private Integer sahTrnbr;

	// Constructors

	/** default constructor */
	public AbstractSahHistId() {
	}

	/** minimal constructor */
	public AbstractSahHistId(String sahDomain) {
		this.sahDomain = sahDomain;
	}

	/** full constructor */
	public AbstractSahHistId(String sahDomain, Integer sahTrnbr) {
		this.sahDomain = sahDomain;
		this.sahTrnbr = sahTrnbr;
	}

	// Property accessors

	public String getSahDomain() {
		return this.sahDomain;
	}

	public void setSahDomain(String sahDomain) {
		this.sahDomain = sahDomain;
	}

	public Integer getSahTrnbr() {
		return this.sahTrnbr;
	}

	public void setSahTrnbr(Integer sahTrnbr) {
		this.sahTrnbr = sahTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSahHistId))
			return false;
		AbstractSahHistId castOther = (AbstractSahHistId) other;

		return ((this.getSahDomain() == castOther.getSahDomain()) || (this
				.getSahDomain() != null
				&& castOther.getSahDomain() != null && this.getSahDomain()
				.equals(castOther.getSahDomain())))
				&& ((this.getSahTrnbr() == castOther.getSahTrnbr()) || (this
						.getSahTrnbr() != null
						&& castOther.getSahTrnbr() != null && this
						.getSahTrnbr().equals(castOther.getSahTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSahDomain() == null ? 0 : this.getSahDomain().hashCode());
		result = 37 * result
				+ (getSahTrnbr() == null ? 0 : this.getSahTrnbr().hashCode());
		return result;
	}

}