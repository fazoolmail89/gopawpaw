package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractExrRateId entity provides the base persistence definition of the
 * ExrRateId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExrRateId implements java.io.Serializable {

	// Fields

	private String exrDomain;
	private String exrCurr1;
	private String exrCurr2;
	private String exrRatetype;
	private Date exrStartDate;

	// Constructors

	/** default constructor */
	public AbstractExrRateId() {
	}

	/** full constructor */
	public AbstractExrRateId(String exrDomain, String exrCurr1,
			String exrCurr2, String exrRatetype, Date exrStartDate) {
		this.exrDomain = exrDomain;
		this.exrCurr1 = exrCurr1;
		this.exrCurr2 = exrCurr2;
		this.exrRatetype = exrRatetype;
		this.exrStartDate = exrStartDate;
	}

	// Property accessors

	public String getExrDomain() {
		return this.exrDomain;
	}

	public void setExrDomain(String exrDomain) {
		this.exrDomain = exrDomain;
	}

	public String getExrCurr1() {
		return this.exrCurr1;
	}

	public void setExrCurr1(String exrCurr1) {
		this.exrCurr1 = exrCurr1;
	}

	public String getExrCurr2() {
		return this.exrCurr2;
	}

	public void setExrCurr2(String exrCurr2) {
		this.exrCurr2 = exrCurr2;
	}

	public String getExrRatetype() {
		return this.exrRatetype;
	}

	public void setExrRatetype(String exrRatetype) {
		this.exrRatetype = exrRatetype;
	}

	public Date getExrStartDate() {
		return this.exrStartDate;
	}

	public void setExrStartDate(Date exrStartDate) {
		this.exrStartDate = exrStartDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractExrRateId))
			return false;
		AbstractExrRateId castOther = (AbstractExrRateId) other;

		return ((this.getExrDomain() == castOther.getExrDomain()) || (this
				.getExrDomain() != null
				&& castOther.getExrDomain() != null && this.getExrDomain()
				.equals(castOther.getExrDomain())))
				&& ((this.getExrCurr1() == castOther.getExrCurr1()) || (this
						.getExrCurr1() != null
						&& castOther.getExrCurr1() != null && this
						.getExrCurr1().equals(castOther.getExrCurr1())))
				&& ((this.getExrCurr2() == castOther.getExrCurr2()) || (this
						.getExrCurr2() != null
						&& castOther.getExrCurr2() != null && this
						.getExrCurr2().equals(castOther.getExrCurr2())))
				&& ((this.getExrRatetype() == castOther.getExrRatetype()) || (this
						.getExrRatetype() != null
						&& castOther.getExrRatetype() != null && this
						.getExrRatetype().equals(castOther.getExrRatetype())))
				&& ((this.getExrStartDate() == castOther.getExrStartDate()) || (this
						.getExrStartDate() != null
						&& castOther.getExrStartDate() != null && this
						.getExrStartDate().equals(castOther.getExrStartDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getExrDomain() == null ? 0 : this.getExrDomain().hashCode());
		result = 37 * result
				+ (getExrCurr1() == null ? 0 : this.getExrCurr1().hashCode());
		result = 37 * result
				+ (getExrCurr2() == null ? 0 : this.getExrCurr2().hashCode());
		result = 37
				* result
				+ (getExrRatetype() == null ? 0 : this.getExrRatetype()
						.hashCode());
		result = 37
				* result
				+ (getExrStartDate() == null ? 0 : this.getExrStartDate()
						.hashCode());
		return result;
	}

}