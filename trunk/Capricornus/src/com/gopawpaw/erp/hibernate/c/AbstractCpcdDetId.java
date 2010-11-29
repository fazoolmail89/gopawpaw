package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCpcdDetId entity provides the base persistence definition of the
 * CpcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCpcdDetId implements java.io.Serializable {

	// Fields

	private String cpcdDomain;
	private String cpcdCust;
	private Integer cpcdYear;
	private String cpcdType;
	private Integer cpcdPer;

	// Constructors

	/** default constructor */
	public AbstractCpcdDetId() {
	}

	/** minimal constructor */
	public AbstractCpcdDetId(String cpcdDomain) {
		this.cpcdDomain = cpcdDomain;
	}

	/** full constructor */
	public AbstractCpcdDetId(String cpcdDomain, String cpcdCust,
			Integer cpcdYear, String cpcdType, Integer cpcdPer) {
		this.cpcdDomain = cpcdDomain;
		this.cpcdCust = cpcdCust;
		this.cpcdYear = cpcdYear;
		this.cpcdType = cpcdType;
		this.cpcdPer = cpcdPer;
	}

	// Property accessors

	public String getCpcdDomain() {
		return this.cpcdDomain;
	}

	public void setCpcdDomain(String cpcdDomain) {
		this.cpcdDomain = cpcdDomain;
	}

	public String getCpcdCust() {
		return this.cpcdCust;
	}

	public void setCpcdCust(String cpcdCust) {
		this.cpcdCust = cpcdCust;
	}

	public Integer getCpcdYear() {
		return this.cpcdYear;
	}

	public void setCpcdYear(Integer cpcdYear) {
		this.cpcdYear = cpcdYear;
	}

	public String getCpcdType() {
		return this.cpcdType;
	}

	public void setCpcdType(String cpcdType) {
		this.cpcdType = cpcdType;
	}

	public Integer getCpcdPer() {
		return this.cpcdPer;
	}

	public void setCpcdPer(Integer cpcdPer) {
		this.cpcdPer = cpcdPer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCpcdDetId))
			return false;
		AbstractCpcdDetId castOther = (AbstractCpcdDetId) other;

		return ((this.getCpcdDomain() == castOther.getCpcdDomain()) || (this
				.getCpcdDomain() != null
				&& castOther.getCpcdDomain() != null && this.getCpcdDomain()
				.equals(castOther.getCpcdDomain())))
				&& ((this.getCpcdCust() == castOther.getCpcdCust()) || (this
						.getCpcdCust() != null
						&& castOther.getCpcdCust() != null && this
						.getCpcdCust().equals(castOther.getCpcdCust())))
				&& ((this.getCpcdYear() == castOther.getCpcdYear()) || (this
						.getCpcdYear() != null
						&& castOther.getCpcdYear() != null && this
						.getCpcdYear().equals(castOther.getCpcdYear())))
				&& ((this.getCpcdType() == castOther.getCpcdType()) || (this
						.getCpcdType() != null
						&& castOther.getCpcdType() != null && this
						.getCpcdType().equals(castOther.getCpcdType())))
				&& ((this.getCpcdPer() == castOther.getCpcdPer()) || (this
						.getCpcdPer() != null
						&& castOther.getCpcdPer() != null && this.getCpcdPer()
						.equals(castOther.getCpcdPer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCpcdDomain() == null ? 0 : this.getCpcdDomain()
						.hashCode());
		result = 37 * result
				+ (getCpcdCust() == null ? 0 : this.getCpcdCust().hashCode());
		result = 37 * result
				+ (getCpcdYear() == null ? 0 : this.getCpcdYear().hashCode());
		result = 37 * result
				+ (getCpcdType() == null ? 0 : this.getCpcdType().hashCode());
		result = 37 * result
				+ (getCpcdPer() == null ? 0 : this.getCpcdPer().hashCode());
		return result;
	}

}