package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSufdDetId entity provides the base persistence definition of the
 * SufdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSufdDetId implements java.io.Serializable {

	// Fields

	private String sufdDomain;
	private String sufdShipfrom;
	private String sufdShipto;
	private Integer sufdLevel;
	private Integer sufdFldSeq;

	// Constructors

	/** default constructor */
	public AbstractSufdDetId() {
	}

	/** full constructor */
	public AbstractSufdDetId(String sufdDomain, String sufdShipfrom,
			String sufdShipto, Integer sufdLevel, Integer sufdFldSeq) {
		this.sufdDomain = sufdDomain;
		this.sufdShipfrom = sufdShipfrom;
		this.sufdShipto = sufdShipto;
		this.sufdLevel = sufdLevel;
		this.sufdFldSeq = sufdFldSeq;
	}

	// Property accessors

	public String getSufdDomain() {
		return this.sufdDomain;
	}

	public void setSufdDomain(String sufdDomain) {
		this.sufdDomain = sufdDomain;
	}

	public String getSufdShipfrom() {
		return this.sufdShipfrom;
	}

	public void setSufdShipfrom(String sufdShipfrom) {
		this.sufdShipfrom = sufdShipfrom;
	}

	public String getSufdShipto() {
		return this.sufdShipto;
	}

	public void setSufdShipto(String sufdShipto) {
		this.sufdShipto = sufdShipto;
	}

	public Integer getSufdLevel() {
		return this.sufdLevel;
	}

	public void setSufdLevel(Integer sufdLevel) {
		this.sufdLevel = sufdLevel;
	}

	public Integer getSufdFldSeq() {
		return this.sufdFldSeq;
	}

	public void setSufdFldSeq(Integer sufdFldSeq) {
		this.sufdFldSeq = sufdFldSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSufdDetId))
			return false;
		AbstractSufdDetId castOther = (AbstractSufdDetId) other;

		return ((this.getSufdDomain() == castOther.getSufdDomain()) || (this
				.getSufdDomain() != null
				&& castOther.getSufdDomain() != null && this.getSufdDomain()
				.equals(castOther.getSufdDomain())))
				&& ((this.getSufdShipfrom() == castOther.getSufdShipfrom()) || (this
						.getSufdShipfrom() != null
						&& castOther.getSufdShipfrom() != null && this
						.getSufdShipfrom().equals(castOther.getSufdShipfrom())))
				&& ((this.getSufdShipto() == castOther.getSufdShipto()) || (this
						.getSufdShipto() != null
						&& castOther.getSufdShipto() != null && this
						.getSufdShipto().equals(castOther.getSufdShipto())))
				&& ((this.getSufdLevel() == castOther.getSufdLevel()) || (this
						.getSufdLevel() != null
						&& castOther.getSufdLevel() != null && this
						.getSufdLevel().equals(castOther.getSufdLevel())))
				&& ((this.getSufdFldSeq() == castOther.getSufdFldSeq()) || (this
						.getSufdFldSeq() != null
						&& castOther.getSufdFldSeq() != null && this
						.getSufdFldSeq().equals(castOther.getSufdFldSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSufdDomain() == null ? 0 : this.getSufdDomain()
						.hashCode());
		result = 37
				* result
				+ (getSufdShipfrom() == null ? 0 : this.getSufdShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getSufdShipto() == null ? 0 : this.getSufdShipto()
						.hashCode());
		result = 37 * result
				+ (getSufdLevel() == null ? 0 : this.getSufdLevel().hashCode());
		result = 37
				* result
				+ (getSufdFldSeq() == null ? 0 : this.getSufdFldSeq()
						.hashCode());
		return result;
	}

}