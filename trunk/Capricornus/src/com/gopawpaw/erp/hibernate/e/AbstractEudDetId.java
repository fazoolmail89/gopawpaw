package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEudDetId entity provides the base persistence definition of the
 * EudDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEudDetId implements java.io.Serializable {

	// Fields

	private String eudDomain;
	private Integer eudTrnbr;

	// Constructors

	/** default constructor */
	public AbstractEudDetId() {
	}

	/** minimal constructor */
	public AbstractEudDetId(String eudDomain) {
		this.eudDomain = eudDomain;
	}

	/** full constructor */
	public AbstractEudDetId(String eudDomain, Integer eudTrnbr) {
		this.eudDomain = eudDomain;
		this.eudTrnbr = eudTrnbr;
	}

	// Property accessors

	public String getEudDomain() {
		return this.eudDomain;
	}

	public void setEudDomain(String eudDomain) {
		this.eudDomain = eudDomain;
	}

	public Integer getEudTrnbr() {
		return this.eudTrnbr;
	}

	public void setEudTrnbr(Integer eudTrnbr) {
		this.eudTrnbr = eudTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEudDetId))
			return false;
		AbstractEudDetId castOther = (AbstractEudDetId) other;

		return ((this.getEudDomain() == castOther.getEudDomain()) || (this
				.getEudDomain() != null
				&& castOther.getEudDomain() != null && this.getEudDomain()
				.equals(castOther.getEudDomain())))
				&& ((this.getEudTrnbr() == castOther.getEudTrnbr()) || (this
						.getEudTrnbr() != null
						&& castOther.getEudTrnbr() != null && this
						.getEudTrnbr().equals(castOther.getEudTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEudDomain() == null ? 0 : this.getEudDomain().hashCode());
		result = 37 * result
				+ (getEudTrnbr() == null ? 0 : this.getEudTrnbr().hashCode());
		return result;
	}

}