package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsrecDetId entity provides the base persistence definition of the
 * EsrecDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsrecDetId implements java.io.Serializable {

	// Fields

	private Double oidEsrecDet;
	private Double oidErecord;
	private Double oidEsigMstr;
	private Double oidEscdDet;
	private String esrecTableName;
	private Integer esrecRecordOrder;
	private Date esrecModDate;
	private String esrecModUserid;
	private String esrecUser1;
	private String esrecUser2;
	private String esrecQadc01;
	private String esrecQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsrecDetId() {
	}

	/** full constructor */
	public AbstractEsrecDetId(Double oidEsrecDet, Double oidErecord,
			Double oidEsigMstr, Double oidEscdDet, String esrecTableName,
			Integer esrecRecordOrder, Date esrecModDate, String esrecModUserid,
			String esrecUser1, String esrecUser2, String esrecQadc01,
			String esrecQadc02) {
		this.oidEsrecDet = oidEsrecDet;
		this.oidErecord = oidErecord;
		this.oidEsigMstr = oidEsigMstr;
		this.oidEscdDet = oidEscdDet;
		this.esrecTableName = esrecTableName;
		this.esrecRecordOrder = esrecRecordOrder;
		this.esrecModDate = esrecModDate;
		this.esrecModUserid = esrecModUserid;
		this.esrecUser1 = esrecUser1;
		this.esrecUser2 = esrecUser2;
		this.esrecQadc01 = esrecQadc01;
		this.esrecQadc02 = esrecQadc02;
	}

	// Property accessors

	public Double getOidEsrecDet() {
		return this.oidEsrecDet;
	}

	public void setOidEsrecDet(Double oidEsrecDet) {
		this.oidEsrecDet = oidEsrecDet;
	}

	public Double getOidErecord() {
		return this.oidErecord;
	}

	public void setOidErecord(Double oidErecord) {
		this.oidErecord = oidErecord;
	}

	public Double getOidEsigMstr() {
		return this.oidEsigMstr;
	}

	public void setOidEsigMstr(Double oidEsigMstr) {
		this.oidEsigMstr = oidEsigMstr;
	}

	public Double getOidEscdDet() {
		return this.oidEscdDet;
	}

	public void setOidEscdDet(Double oidEscdDet) {
		this.oidEscdDet = oidEscdDet;
	}

	public String getEsrecTableName() {
		return this.esrecTableName;
	}

	public void setEsrecTableName(String esrecTableName) {
		this.esrecTableName = esrecTableName;
	}

	public Integer getEsrecRecordOrder() {
		return this.esrecRecordOrder;
	}

	public void setEsrecRecordOrder(Integer esrecRecordOrder) {
		this.esrecRecordOrder = esrecRecordOrder;
	}

	public Date getEsrecModDate() {
		return this.esrecModDate;
	}

	public void setEsrecModDate(Date esrecModDate) {
		this.esrecModDate = esrecModDate;
	}

	public String getEsrecModUserid() {
		return this.esrecModUserid;
	}

	public void setEsrecModUserid(String esrecModUserid) {
		this.esrecModUserid = esrecModUserid;
	}

	public String getEsrecUser1() {
		return this.esrecUser1;
	}

	public void setEsrecUser1(String esrecUser1) {
		this.esrecUser1 = esrecUser1;
	}

	public String getEsrecUser2() {
		return this.esrecUser2;
	}

	public void setEsrecUser2(String esrecUser2) {
		this.esrecUser2 = esrecUser2;
	}

	public String getEsrecQadc01() {
		return this.esrecQadc01;
	}

	public void setEsrecQadc01(String esrecQadc01) {
		this.esrecQadc01 = esrecQadc01;
	}

	public String getEsrecQadc02() {
		return this.esrecQadc02;
	}

	public void setEsrecQadc02(String esrecQadc02) {
		this.esrecQadc02 = esrecQadc02;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsrecDetId))
			return false;
		AbstractEsrecDetId castOther = (AbstractEsrecDetId) other;

		return ((this.getOidEsrecDet() == castOther.getOidEsrecDet()) || (this
				.getOidEsrecDet() != null
				&& castOther.getOidEsrecDet() != null && this.getOidEsrecDet()
				.equals(castOther.getOidEsrecDet())))
				&& ((this.getOidErecord() == castOther.getOidErecord()) || (this
						.getOidErecord() != null
						&& castOther.getOidErecord() != null && this
						.getOidErecord().equals(castOther.getOidErecord())))
				&& ((this.getOidEsigMstr() == castOther.getOidEsigMstr()) || (this
						.getOidEsigMstr() != null
						&& castOther.getOidEsigMstr() != null && this
						.getOidEsigMstr().equals(castOther.getOidEsigMstr())))
				&& ((this.getOidEscdDet() == castOther.getOidEscdDet()) || (this
						.getOidEscdDet() != null
						&& castOther.getOidEscdDet() != null && this
						.getOidEscdDet().equals(castOther.getOidEscdDet())))
				&& ((this.getEsrecTableName() == castOther.getEsrecTableName()) || (this
						.getEsrecTableName() != null
						&& castOther.getEsrecTableName() != null && this
						.getEsrecTableName().equals(
								castOther.getEsrecTableName())))
				&& ((this.getEsrecRecordOrder() == castOther
						.getEsrecRecordOrder()) || (this.getEsrecRecordOrder() != null
						&& castOther.getEsrecRecordOrder() != null && this
						.getEsrecRecordOrder().equals(
								castOther.getEsrecRecordOrder())))
				&& ((this.getEsrecModDate() == castOther.getEsrecModDate()) || (this
						.getEsrecModDate() != null
						&& castOther.getEsrecModDate() != null && this
						.getEsrecModDate().equals(castOther.getEsrecModDate())))
				&& ((this.getEsrecModUserid() == castOther.getEsrecModUserid()) || (this
						.getEsrecModUserid() != null
						&& castOther.getEsrecModUserid() != null && this
						.getEsrecModUserid().equals(
								castOther.getEsrecModUserid())))
				&& ((this.getEsrecUser1() == castOther.getEsrecUser1()) || (this
						.getEsrecUser1() != null
						&& castOther.getEsrecUser1() != null && this
						.getEsrecUser1().equals(castOther.getEsrecUser1())))
				&& ((this.getEsrecUser2() == castOther.getEsrecUser2()) || (this
						.getEsrecUser2() != null
						&& castOther.getEsrecUser2() != null && this
						.getEsrecUser2().equals(castOther.getEsrecUser2())))
				&& ((this.getEsrecQadc01() == castOther.getEsrecQadc01()) || (this
						.getEsrecQadc01() != null
						&& castOther.getEsrecQadc01() != null && this
						.getEsrecQadc01().equals(castOther.getEsrecQadc01())))
				&& ((this.getEsrecQadc02() == castOther.getEsrecQadc02()) || (this
						.getEsrecQadc02() != null
						&& castOther.getEsrecQadc02() != null && this
						.getEsrecQadc02().equals(castOther.getEsrecQadc02())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsrecDet() == null ? 0 : this.getOidEsrecDet()
						.hashCode());
		result = 37
				* result
				+ (getOidErecord() == null ? 0 : this.getOidErecord()
						.hashCode());
		result = 37
				* result
				+ (getOidEsigMstr() == null ? 0 : this.getOidEsigMstr()
						.hashCode());
		result = 37
				* result
				+ (getOidEscdDet() == null ? 0 : this.getOidEscdDet()
						.hashCode());
		result = 37
				* result
				+ (getEsrecTableName() == null ? 0 : this.getEsrecTableName()
						.hashCode());
		result = 37
				* result
				+ (getEsrecRecordOrder() == null ? 0 : this
						.getEsrecRecordOrder().hashCode());
		result = 37
				* result
				+ (getEsrecModDate() == null ? 0 : this.getEsrecModDate()
						.hashCode());
		result = 37
				* result
				+ (getEsrecModUserid() == null ? 0 : this.getEsrecModUserid()
						.hashCode());
		result = 37
				* result
				+ (getEsrecUser1() == null ? 0 : this.getEsrecUser1()
						.hashCode());
		result = 37
				* result
				+ (getEsrecUser2() == null ? 0 : this.getEsrecUser2()
						.hashCode());
		result = 37
				* result
				+ (getEsrecQadc01() == null ? 0 : this.getEsrecQadc01()
						.hashCode());
		result = 37
				* result
				+ (getEsrecQadc02() == null ? 0 : this.getEsrecQadc02()
						.hashCode());
		return result;
	}

}