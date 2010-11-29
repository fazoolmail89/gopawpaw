package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUslhHistId entity provides the base persistence definition of the
 * UslhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUslhHistId implements java.io.Serializable {

	// Fields

	private String uslhUserid;
	private Date uslhDate;
	private Integer uslhTime;
	private Boolean uslhPasswdValid;
	private String uslhStatusCode;
	private String uslhModUserid;
	private String uslhUser1;
	private String uslhUser2;
	private String uslhQadc01;
	private String uslhQadc02;
	private String uslhTimezone;
	private Double oidUslhHist;
	private Date uslhModDate;
	private String uslhDomain;
	private Integer uslhAccessType;

	// Constructors

	/** default constructor */
	public AbstractUslhHistId() {
	}

	/** full constructor */
	public AbstractUslhHistId(String uslhUserid, Date uslhDate,
			Integer uslhTime, Boolean uslhPasswdValid, String uslhStatusCode,
			String uslhModUserid, String uslhUser1, String uslhUser2,
			String uslhQadc01, String uslhQadc02, String uslhTimezone,
			Double oidUslhHist, Date uslhModDate, String uslhDomain,
			Integer uslhAccessType) {
		this.uslhUserid = uslhUserid;
		this.uslhDate = uslhDate;
		this.uslhTime = uslhTime;
		this.uslhPasswdValid = uslhPasswdValid;
		this.uslhStatusCode = uslhStatusCode;
		this.uslhModUserid = uslhModUserid;
		this.uslhUser1 = uslhUser1;
		this.uslhUser2 = uslhUser2;
		this.uslhQadc01 = uslhQadc01;
		this.uslhQadc02 = uslhQadc02;
		this.uslhTimezone = uslhTimezone;
		this.oidUslhHist = oidUslhHist;
		this.uslhModDate = uslhModDate;
		this.uslhDomain = uslhDomain;
		this.uslhAccessType = uslhAccessType;
	}

	// Property accessors

	public String getUslhUserid() {
		return this.uslhUserid;
	}

	public void setUslhUserid(String uslhUserid) {
		this.uslhUserid = uslhUserid;
	}

	public Date getUslhDate() {
		return this.uslhDate;
	}

	public void setUslhDate(Date uslhDate) {
		this.uslhDate = uslhDate;
	}

	public Integer getUslhTime() {
		return this.uslhTime;
	}

	public void setUslhTime(Integer uslhTime) {
		this.uslhTime = uslhTime;
	}

	public Boolean getUslhPasswdValid() {
		return this.uslhPasswdValid;
	}

	public void setUslhPasswdValid(Boolean uslhPasswdValid) {
		this.uslhPasswdValid = uslhPasswdValid;
	}

	public String getUslhStatusCode() {
		return this.uslhStatusCode;
	}

	public void setUslhStatusCode(String uslhStatusCode) {
		this.uslhStatusCode = uslhStatusCode;
	}

	public String getUslhModUserid() {
		return this.uslhModUserid;
	}

	public void setUslhModUserid(String uslhModUserid) {
		this.uslhModUserid = uslhModUserid;
	}

	public String getUslhUser1() {
		return this.uslhUser1;
	}

	public void setUslhUser1(String uslhUser1) {
		this.uslhUser1 = uslhUser1;
	}

	public String getUslhUser2() {
		return this.uslhUser2;
	}

	public void setUslhUser2(String uslhUser2) {
		this.uslhUser2 = uslhUser2;
	}

	public String getUslhQadc01() {
		return this.uslhQadc01;
	}

	public void setUslhQadc01(String uslhQadc01) {
		this.uslhQadc01 = uslhQadc01;
	}

	public String getUslhQadc02() {
		return this.uslhQadc02;
	}

	public void setUslhQadc02(String uslhQadc02) {
		this.uslhQadc02 = uslhQadc02;
	}

	public String getUslhTimezone() {
		return this.uslhTimezone;
	}

	public void setUslhTimezone(String uslhTimezone) {
		this.uslhTimezone = uslhTimezone;
	}

	public Double getOidUslhHist() {
		return this.oidUslhHist;
	}

	public void setOidUslhHist(Double oidUslhHist) {
		this.oidUslhHist = oidUslhHist;
	}

	public Date getUslhModDate() {
		return this.uslhModDate;
	}

	public void setUslhModDate(Date uslhModDate) {
		this.uslhModDate = uslhModDate;
	}

	public String getUslhDomain() {
		return this.uslhDomain;
	}

	public void setUslhDomain(String uslhDomain) {
		this.uslhDomain = uslhDomain;
	}

	public Integer getUslhAccessType() {
		return this.uslhAccessType;
	}

	public void setUslhAccessType(Integer uslhAccessType) {
		this.uslhAccessType = uslhAccessType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUslhHistId))
			return false;
		AbstractUslhHistId castOther = (AbstractUslhHistId) other;

		return ((this.getUslhUserid() == castOther.getUslhUserid()) || (this
				.getUslhUserid() != null
				&& castOther.getUslhUserid() != null && this.getUslhUserid()
				.equals(castOther.getUslhUserid())))
				&& ((this.getUslhDate() == castOther.getUslhDate()) || (this
						.getUslhDate() != null
						&& castOther.getUslhDate() != null && this
						.getUslhDate().equals(castOther.getUslhDate())))
				&& ((this.getUslhTime() == castOther.getUslhTime()) || (this
						.getUslhTime() != null
						&& castOther.getUslhTime() != null && this
						.getUslhTime().equals(castOther.getUslhTime())))
				&& ((this.getUslhPasswdValid() == castOther
						.getUslhPasswdValid()) || (this.getUslhPasswdValid() != null
						&& castOther.getUslhPasswdValid() != null && this
						.getUslhPasswdValid().equals(
								castOther.getUslhPasswdValid())))
				&& ((this.getUslhStatusCode() == castOther.getUslhStatusCode()) || (this
						.getUslhStatusCode() != null
						&& castOther.getUslhStatusCode() != null && this
						.getUslhStatusCode().equals(
								castOther.getUslhStatusCode())))
				&& ((this.getUslhModUserid() == castOther.getUslhModUserid()) || (this
						.getUslhModUserid() != null
						&& castOther.getUslhModUserid() != null && this
						.getUslhModUserid()
						.equals(castOther.getUslhModUserid())))
				&& ((this.getUslhUser1() == castOther.getUslhUser1()) || (this
						.getUslhUser1() != null
						&& castOther.getUslhUser1() != null && this
						.getUslhUser1().equals(castOther.getUslhUser1())))
				&& ((this.getUslhUser2() == castOther.getUslhUser2()) || (this
						.getUslhUser2() != null
						&& castOther.getUslhUser2() != null && this
						.getUslhUser2().equals(castOther.getUslhUser2())))
				&& ((this.getUslhQadc01() == castOther.getUslhQadc01()) || (this
						.getUslhQadc01() != null
						&& castOther.getUslhQadc01() != null && this
						.getUslhQadc01().equals(castOther.getUslhQadc01())))
				&& ((this.getUslhQadc02() == castOther.getUslhQadc02()) || (this
						.getUslhQadc02() != null
						&& castOther.getUslhQadc02() != null && this
						.getUslhQadc02().equals(castOther.getUslhQadc02())))
				&& ((this.getUslhTimezone() == castOther.getUslhTimezone()) || (this
						.getUslhTimezone() != null
						&& castOther.getUslhTimezone() != null && this
						.getUslhTimezone().equals(castOther.getUslhTimezone())))
				&& ((this.getOidUslhHist() == castOther.getOidUslhHist()) || (this
						.getOidUslhHist() != null
						&& castOther.getOidUslhHist() != null && this
						.getOidUslhHist().equals(castOther.getOidUslhHist())))
				&& ((this.getUslhModDate() == castOther.getUslhModDate()) || (this
						.getUslhModDate() != null
						&& castOther.getUslhModDate() != null && this
						.getUslhModDate().equals(castOther.getUslhModDate())))
				&& ((this.getUslhDomain() == castOther.getUslhDomain()) || (this
						.getUslhDomain() != null
						&& castOther.getUslhDomain() != null && this
						.getUslhDomain().equals(castOther.getUslhDomain())))
				&& ((this.getUslhAccessType() == castOther.getUslhAccessType()) || (this
						.getUslhAccessType() != null
						&& castOther.getUslhAccessType() != null && this
						.getUslhAccessType().equals(
								castOther.getUslhAccessType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getUslhUserid() == null ? 0 : this.getUslhUserid()
						.hashCode());
		result = 37 * result
				+ (getUslhDate() == null ? 0 : this.getUslhDate().hashCode());
		result = 37 * result
				+ (getUslhTime() == null ? 0 : this.getUslhTime().hashCode());
		result = 37
				* result
				+ (getUslhPasswdValid() == null ? 0 : this.getUslhPasswdValid()
						.hashCode());
		result = 37
				* result
				+ (getUslhStatusCode() == null ? 0 : this.getUslhStatusCode()
						.hashCode());
		result = 37
				* result
				+ (getUslhModUserid() == null ? 0 : this.getUslhModUserid()
						.hashCode());
		result = 37 * result
				+ (getUslhUser1() == null ? 0 : this.getUslhUser1().hashCode());
		result = 37 * result
				+ (getUslhUser2() == null ? 0 : this.getUslhUser2().hashCode());
		result = 37
				* result
				+ (getUslhQadc01() == null ? 0 : this.getUslhQadc01()
						.hashCode());
		result = 37
				* result
				+ (getUslhQadc02() == null ? 0 : this.getUslhQadc02()
						.hashCode());
		result = 37
				* result
				+ (getUslhTimezone() == null ? 0 : this.getUslhTimezone()
						.hashCode());
		result = 37
				* result
				+ (getOidUslhHist() == null ? 0 : this.getOidUslhHist()
						.hashCode());
		result = 37
				* result
				+ (getUslhModDate() == null ? 0 : this.getUslhModDate()
						.hashCode());
		result = 37
				* result
				+ (getUslhDomain() == null ? 0 : this.getUslhDomain()
						.hashCode());
		result = 37
				* result
				+ (getUslhAccessType() == null ? 0 : this.getUslhAccessType()
						.hashCode());
		return result;
	}

}