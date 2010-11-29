package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFamtdDetId entity provides the base persistence definition of the
 * FamtdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtdDetId implements java.io.Serializable {

	// Fields

	private String famtdDomain;
	private String famtdFamtId;
	private Integer famtdYear;
	private Integer famtdPeriod;

	// Constructors

	/** default constructor */
	public AbstractFamtdDetId() {
	}

	/** full constructor */
	public AbstractFamtdDetId(String famtdDomain, String famtdFamtId,
			Integer famtdYear, Integer famtdPeriod) {
		this.famtdDomain = famtdDomain;
		this.famtdFamtId = famtdFamtId;
		this.famtdYear = famtdYear;
		this.famtdPeriod = famtdPeriod;
	}

	// Property accessors

	public String getFamtdDomain() {
		return this.famtdDomain;
	}

	public void setFamtdDomain(String famtdDomain) {
		this.famtdDomain = famtdDomain;
	}

	public String getFamtdFamtId() {
		return this.famtdFamtId;
	}

	public void setFamtdFamtId(String famtdFamtId) {
		this.famtdFamtId = famtdFamtId;
	}

	public Integer getFamtdYear() {
		return this.famtdYear;
	}

	public void setFamtdYear(Integer famtdYear) {
		this.famtdYear = famtdYear;
	}

	public Integer getFamtdPeriod() {
		return this.famtdPeriod;
	}

	public void setFamtdPeriod(Integer famtdPeriod) {
		this.famtdPeriod = famtdPeriod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFamtdDetId))
			return false;
		AbstractFamtdDetId castOther = (AbstractFamtdDetId) other;

		return ((this.getFamtdDomain() == castOther.getFamtdDomain()) || (this
				.getFamtdDomain() != null
				&& castOther.getFamtdDomain() != null && this.getFamtdDomain()
				.equals(castOther.getFamtdDomain())))
				&& ((this.getFamtdFamtId() == castOther.getFamtdFamtId()) || (this
						.getFamtdFamtId() != null
						&& castOther.getFamtdFamtId() != null && this
						.getFamtdFamtId().equals(castOther.getFamtdFamtId())))
				&& ((this.getFamtdYear() == castOther.getFamtdYear()) || (this
						.getFamtdYear() != null
						&& castOther.getFamtdYear() != null && this
						.getFamtdYear().equals(castOther.getFamtdYear())))
				&& ((this.getFamtdPeriod() == castOther.getFamtdPeriod()) || (this
						.getFamtdPeriod() != null
						&& castOther.getFamtdPeriod() != null && this
						.getFamtdPeriod().equals(castOther.getFamtdPeriod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFamtdDomain() == null ? 0 : this.getFamtdDomain()
						.hashCode());
		result = 37
				* result
				+ (getFamtdFamtId() == null ? 0 : this.getFamtdFamtId()
						.hashCode());
		result = 37 * result
				+ (getFamtdYear() == null ? 0 : this.getFamtdYear().hashCode());
		result = 37
				* result
				+ (getFamtdPeriod() == null ? 0 : this.getFamtdPeriod()
						.hashCode());
		return result;
	}

}