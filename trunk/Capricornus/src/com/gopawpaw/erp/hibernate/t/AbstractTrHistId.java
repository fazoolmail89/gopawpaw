package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrHistId entity provides the base persistence definition of the
 * TrHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrHistId implements java.io.Serializable {

	// Fields

	private String trDomain;
	private Integer trTrnbr;

	// Constructors

	/** default constructor */
	public AbstractTrHistId() {
	}

	/** minimal constructor */
	public AbstractTrHistId(String trDomain) {
		this.trDomain = trDomain;
	}

	/** full constructor */
	public AbstractTrHistId(String trDomain, Integer trTrnbr) {
		this.trDomain = trDomain;
		this.trTrnbr = trTrnbr;
	}

	// Property accessors

	public String getTrDomain() {
		return this.trDomain;
	}

	public void setTrDomain(String trDomain) {
		this.trDomain = trDomain;
	}

	public Integer getTrTrnbr() {
		return this.trTrnbr;
	}

	public void setTrTrnbr(Integer trTrnbr) {
		this.trTrnbr = trTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTrHistId))
			return false;
		AbstractTrHistId castOther = (AbstractTrHistId) other;

		return ((this.getTrDomain() == castOther.getTrDomain()) || (this
				.getTrDomain() != null
				&& castOther.getTrDomain() != null && this.getTrDomain()
				.equals(castOther.getTrDomain())))
				&& ((this.getTrTrnbr() == castOther.getTrTrnbr()) || (this
						.getTrTrnbr() != null
						&& castOther.getTrTrnbr() != null && this.getTrTrnbr()
						.equals(castOther.getTrTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTrDomain() == null ? 0 : this.getTrDomain().hashCode());
		result = 37 * result
				+ (getTrTrnbr() == null ? 0 : this.getTrTrnbr().hashCode());
		return result;
	}

}