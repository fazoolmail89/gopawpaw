package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEscdDetId entity provides the base persistence definition of the
 * EscdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscdDetId implements java.io.Serializable {

	// Fields

	private Double oidEscdDet;
	private Double oidEsigMstr;
	private Double oidEscatMstr;
	private Double oidTopErecord;
	private Double oidEsapMstr;
	private Date escdDate;
	private Integer escdTime;
	private String escdTimezone;
	private Date escdModDate;
	private String escdModUserid;
	private String escdUser1;
	private String escdUser2;
	private String escdQadc01;
	private String escdQadc02;

	// Constructors

	/** default constructor */
	public AbstractEscdDetId() {
	}

	/** full constructor */
	public AbstractEscdDetId(Double oidEscdDet, Double oidEsigMstr,
			Double oidEscatMstr, Double oidTopErecord, Double oidEsapMstr,
			Date escdDate, Integer escdTime, String escdTimezone,
			Date escdModDate, String escdModUserid, String escdUser1,
			String escdUser2, String escdQadc01, String escdQadc02) {
		this.oidEscdDet = oidEscdDet;
		this.oidEsigMstr = oidEsigMstr;
		this.oidEscatMstr = oidEscatMstr;
		this.oidTopErecord = oidTopErecord;
		this.oidEsapMstr = oidEsapMstr;
		this.escdDate = escdDate;
		this.escdTime = escdTime;
		this.escdTimezone = escdTimezone;
		this.escdModDate = escdModDate;
		this.escdModUserid = escdModUserid;
		this.escdUser1 = escdUser1;
		this.escdUser2 = escdUser2;
		this.escdQadc01 = escdQadc01;
		this.escdQadc02 = escdQadc02;
	}

	// Property accessors

	public Double getOidEscdDet() {
		return this.oidEscdDet;
	}

	public void setOidEscdDet(Double oidEscdDet) {
		this.oidEscdDet = oidEscdDet;
	}

	public Double getOidEsigMstr() {
		return this.oidEsigMstr;
	}

	public void setOidEsigMstr(Double oidEsigMstr) {
		this.oidEsigMstr = oidEsigMstr;
	}

	public Double getOidEscatMstr() {
		return this.oidEscatMstr;
	}

	public void setOidEscatMstr(Double oidEscatMstr) {
		this.oidEscatMstr = oidEscatMstr;
	}

	public Double getOidTopErecord() {
		return this.oidTopErecord;
	}

	public void setOidTopErecord(Double oidTopErecord) {
		this.oidTopErecord = oidTopErecord;
	}

	public Double getOidEsapMstr() {
		return this.oidEsapMstr;
	}

	public void setOidEsapMstr(Double oidEsapMstr) {
		this.oidEsapMstr = oidEsapMstr;
	}

	public Date getEscdDate() {
		return this.escdDate;
	}

	public void setEscdDate(Date escdDate) {
		this.escdDate = escdDate;
	}

	public Integer getEscdTime() {
		return this.escdTime;
	}

	public void setEscdTime(Integer escdTime) {
		this.escdTime = escdTime;
	}

	public String getEscdTimezone() {
		return this.escdTimezone;
	}

	public void setEscdTimezone(String escdTimezone) {
		this.escdTimezone = escdTimezone;
	}

	public Date getEscdModDate() {
		return this.escdModDate;
	}

	public void setEscdModDate(Date escdModDate) {
		this.escdModDate = escdModDate;
	}

	public String getEscdModUserid() {
		return this.escdModUserid;
	}

	public void setEscdModUserid(String escdModUserid) {
		this.escdModUserid = escdModUserid;
	}

	public String getEscdUser1() {
		return this.escdUser1;
	}

	public void setEscdUser1(String escdUser1) {
		this.escdUser1 = escdUser1;
	}

	public String getEscdUser2() {
		return this.escdUser2;
	}

	public void setEscdUser2(String escdUser2) {
		this.escdUser2 = escdUser2;
	}

	public String getEscdQadc01() {
		return this.escdQadc01;
	}

	public void setEscdQadc01(String escdQadc01) {
		this.escdQadc01 = escdQadc01;
	}

	public String getEscdQadc02() {
		return this.escdQadc02;
	}

	public void setEscdQadc02(String escdQadc02) {
		this.escdQadc02 = escdQadc02;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEscdDetId))
			return false;
		AbstractEscdDetId castOther = (AbstractEscdDetId) other;

		return ((this.getOidEscdDet() == castOther.getOidEscdDet()) || (this
				.getOidEscdDet() != null
				&& castOther.getOidEscdDet() != null && this.getOidEscdDet()
				.equals(castOther.getOidEscdDet())))
				&& ((this.getOidEsigMstr() == castOther.getOidEsigMstr()) || (this
						.getOidEsigMstr() != null
						&& castOther.getOidEsigMstr() != null && this
						.getOidEsigMstr().equals(castOther.getOidEsigMstr())))
				&& ((this.getOidEscatMstr() == castOther.getOidEscatMstr()) || (this
						.getOidEscatMstr() != null
						&& castOther.getOidEscatMstr() != null && this
						.getOidEscatMstr().equals(castOther.getOidEscatMstr())))
				&& ((this.getOidTopErecord() == castOther.getOidTopErecord()) || (this
						.getOidTopErecord() != null
						&& castOther.getOidTopErecord() != null && this
						.getOidTopErecord()
						.equals(castOther.getOidTopErecord())))
				&& ((this.getOidEsapMstr() == castOther.getOidEsapMstr()) || (this
						.getOidEsapMstr() != null
						&& castOther.getOidEsapMstr() != null && this
						.getOidEsapMstr().equals(castOther.getOidEsapMstr())))
				&& ((this.getEscdDate() == castOther.getEscdDate()) || (this
						.getEscdDate() != null
						&& castOther.getEscdDate() != null && this
						.getEscdDate().equals(castOther.getEscdDate())))
				&& ((this.getEscdTime() == castOther.getEscdTime()) || (this
						.getEscdTime() != null
						&& castOther.getEscdTime() != null && this
						.getEscdTime().equals(castOther.getEscdTime())))
				&& ((this.getEscdTimezone() == castOther.getEscdTimezone()) || (this
						.getEscdTimezone() != null
						&& castOther.getEscdTimezone() != null && this
						.getEscdTimezone().equals(castOther.getEscdTimezone())))
				&& ((this.getEscdModDate() == castOther.getEscdModDate()) || (this
						.getEscdModDate() != null
						&& castOther.getEscdModDate() != null && this
						.getEscdModDate().equals(castOther.getEscdModDate())))
				&& ((this.getEscdModUserid() == castOther.getEscdModUserid()) || (this
						.getEscdModUserid() != null
						&& castOther.getEscdModUserid() != null && this
						.getEscdModUserid()
						.equals(castOther.getEscdModUserid())))
				&& ((this.getEscdUser1() == castOther.getEscdUser1()) || (this
						.getEscdUser1() != null
						&& castOther.getEscdUser1() != null && this
						.getEscdUser1().equals(castOther.getEscdUser1())))
				&& ((this.getEscdUser2() == castOther.getEscdUser2()) || (this
						.getEscdUser2() != null
						&& castOther.getEscdUser2() != null && this
						.getEscdUser2().equals(castOther.getEscdUser2())))
				&& ((this.getEscdQadc01() == castOther.getEscdQadc01()) || (this
						.getEscdQadc01() != null
						&& castOther.getEscdQadc01() != null && this
						.getEscdQadc01().equals(castOther.getEscdQadc01())))
				&& ((this.getEscdQadc02() == castOther.getEscdQadc02()) || (this
						.getEscdQadc02() != null
						&& castOther.getEscdQadc02() != null && this
						.getEscdQadc02().equals(castOther.getEscdQadc02())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEscdDet() == null ? 0 : this.getOidEscdDet()
						.hashCode());
		result = 37
				* result
				+ (getOidEsigMstr() == null ? 0 : this.getOidEsigMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidEscatMstr() == null ? 0 : this.getOidEscatMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidTopErecord() == null ? 0 : this.getOidTopErecord()
						.hashCode());
		result = 37
				* result
				+ (getOidEsapMstr() == null ? 0 : this.getOidEsapMstr()
						.hashCode());
		result = 37 * result
				+ (getEscdDate() == null ? 0 : this.getEscdDate().hashCode());
		result = 37 * result
				+ (getEscdTime() == null ? 0 : this.getEscdTime().hashCode());
		result = 37
				* result
				+ (getEscdTimezone() == null ? 0 : this.getEscdTimezone()
						.hashCode());
		result = 37
				* result
				+ (getEscdModDate() == null ? 0 : this.getEscdModDate()
						.hashCode());
		result = 37
				* result
				+ (getEscdModUserid() == null ? 0 : this.getEscdModUserid()
						.hashCode());
		result = 37 * result
				+ (getEscdUser1() == null ? 0 : this.getEscdUser1().hashCode());
		result = 37 * result
				+ (getEscdUser2() == null ? 0 : this.getEscdUser2().hashCode());
		result = 37
				* result
				+ (getEscdQadc01() == null ? 0 : this.getEscdQadc01()
						.hashCode());
		result = 37
				* result
				+ (getEscdQadc02() == null ? 0 : this.getEscdQadc02()
						.hashCode());
		return result;
	}

}