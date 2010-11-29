package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrcsDetId entity provides the base persistence definition of the
 * TrcsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrcsDetId implements java.io.Serializable {

	// Fields

	private String trcsDomain;
	private Integer trcsTrnbr;
	private String trcsSet;

	// Constructors

	/** default constructor */
	public AbstractTrcsDetId() {
	}

	/** minimal constructor */
	public AbstractTrcsDetId(String trcsDomain) {
		this.trcsDomain = trcsDomain;
	}

	/** full constructor */
	public AbstractTrcsDetId(String trcsDomain, Integer trcsTrnbr,
			String trcsSet) {
		this.trcsDomain = trcsDomain;
		this.trcsTrnbr = trcsTrnbr;
		this.trcsSet = trcsSet;
	}

	// Property accessors

	public String getTrcsDomain() {
		return this.trcsDomain;
	}

	public void setTrcsDomain(String trcsDomain) {
		this.trcsDomain = trcsDomain;
	}

	public Integer getTrcsTrnbr() {
		return this.trcsTrnbr;
	}

	public void setTrcsTrnbr(Integer trcsTrnbr) {
		this.trcsTrnbr = trcsTrnbr;
	}

	public String getTrcsSet() {
		return this.trcsSet;
	}

	public void setTrcsSet(String trcsSet) {
		this.trcsSet = trcsSet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTrcsDetId))
			return false;
		AbstractTrcsDetId castOther = (AbstractTrcsDetId) other;

		return ((this.getTrcsDomain() == castOther.getTrcsDomain()) || (this
				.getTrcsDomain() != null
				&& castOther.getTrcsDomain() != null && this.getTrcsDomain()
				.equals(castOther.getTrcsDomain())))
				&& ((this.getTrcsTrnbr() == castOther.getTrcsTrnbr()) || (this
						.getTrcsTrnbr() != null
						&& castOther.getTrcsTrnbr() != null && this
						.getTrcsTrnbr().equals(castOther.getTrcsTrnbr())))
				&& ((this.getTrcsSet() == castOther.getTrcsSet()) || (this
						.getTrcsSet() != null
						&& castOther.getTrcsSet() != null && this.getTrcsSet()
						.equals(castOther.getTrcsSet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTrcsDomain() == null ? 0 : this.getTrcsDomain()
						.hashCode());
		result = 37 * result
				+ (getTrcsTrnbr() == null ? 0 : this.getTrcsTrnbr().hashCode());
		result = 37 * result
				+ (getTrcsSet() == null ? 0 : this.getTrcsSet().hashCode());
		return result;
	}

}