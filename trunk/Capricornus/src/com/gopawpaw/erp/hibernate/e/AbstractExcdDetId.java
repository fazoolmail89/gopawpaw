package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractExcdDetId entity provides the base persistence definition of the
 * ExcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExcdDetId implements java.io.Serializable {

	// Fields

	private String excdDomain;
	private String excdCurr;
	private String excdCurr2;
	private String excdAcc;
	private Integer excdYear;
	private Integer excdPer;

	// Constructors

	/** default constructor */
	public AbstractExcdDetId() {
	}

	/** minimal constructor */
	public AbstractExcdDetId(String excdDomain) {
		this.excdDomain = excdDomain;
	}

	/** full constructor */
	public AbstractExcdDetId(String excdDomain, String excdCurr,
			String excdCurr2, String excdAcc, Integer excdYear, Integer excdPer) {
		this.excdDomain = excdDomain;
		this.excdCurr = excdCurr;
		this.excdCurr2 = excdCurr2;
		this.excdAcc = excdAcc;
		this.excdYear = excdYear;
		this.excdPer = excdPer;
	}

	// Property accessors

	public String getExcdDomain() {
		return this.excdDomain;
	}

	public void setExcdDomain(String excdDomain) {
		this.excdDomain = excdDomain;
	}

	public String getExcdCurr() {
		return this.excdCurr;
	}

	public void setExcdCurr(String excdCurr) {
		this.excdCurr = excdCurr;
	}

	public String getExcdCurr2() {
		return this.excdCurr2;
	}

	public void setExcdCurr2(String excdCurr2) {
		this.excdCurr2 = excdCurr2;
	}

	public String getExcdAcc() {
		return this.excdAcc;
	}

	public void setExcdAcc(String excdAcc) {
		this.excdAcc = excdAcc;
	}

	public Integer getExcdYear() {
		return this.excdYear;
	}

	public void setExcdYear(Integer excdYear) {
		this.excdYear = excdYear;
	}

	public Integer getExcdPer() {
		return this.excdPer;
	}

	public void setExcdPer(Integer excdPer) {
		this.excdPer = excdPer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractExcdDetId))
			return false;
		AbstractExcdDetId castOther = (AbstractExcdDetId) other;

		return ((this.getExcdDomain() == castOther.getExcdDomain()) || (this
				.getExcdDomain() != null
				&& castOther.getExcdDomain() != null && this.getExcdDomain()
				.equals(castOther.getExcdDomain())))
				&& ((this.getExcdCurr() == castOther.getExcdCurr()) || (this
						.getExcdCurr() != null
						&& castOther.getExcdCurr() != null && this
						.getExcdCurr().equals(castOther.getExcdCurr())))
				&& ((this.getExcdCurr2() == castOther.getExcdCurr2()) || (this
						.getExcdCurr2() != null
						&& castOther.getExcdCurr2() != null && this
						.getExcdCurr2().equals(castOther.getExcdCurr2())))
				&& ((this.getExcdAcc() == castOther.getExcdAcc()) || (this
						.getExcdAcc() != null
						&& castOther.getExcdAcc() != null && this.getExcdAcc()
						.equals(castOther.getExcdAcc())))
				&& ((this.getExcdYear() == castOther.getExcdYear()) || (this
						.getExcdYear() != null
						&& castOther.getExcdYear() != null && this
						.getExcdYear().equals(castOther.getExcdYear())))
				&& ((this.getExcdPer() == castOther.getExcdPer()) || (this
						.getExcdPer() != null
						&& castOther.getExcdPer() != null && this.getExcdPer()
						.equals(castOther.getExcdPer())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getExcdDomain() == null ? 0 : this.getExcdDomain()
						.hashCode());
		result = 37 * result
				+ (getExcdCurr() == null ? 0 : this.getExcdCurr().hashCode());
		result = 37 * result
				+ (getExcdCurr2() == null ? 0 : this.getExcdCurr2().hashCode());
		result = 37 * result
				+ (getExcdAcc() == null ? 0 : this.getExcdAcc().hashCode());
		result = 37 * result
				+ (getExcdYear() == null ? 0 : this.getExcdYear().hashCode());
		result = 37 * result
				+ (getExcdPer() == null ? 0 : this.getExcdPer().hashCode());
		return result;
	}

}