package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqmDetId entity provides the base persistence definition of the
 * RqmDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqmDetId implements java.io.Serializable {

	// Fields

	private String rqmReference;
	private String rqmCat;
	private String rqmValue;
	private Integer rqmType;
	private String rqmNbr;
	private Integer rqmLine;
	private String rqmRlseId;
	private Date rqmDate;
	private String rqmTime;
	private String rqmInterval;
	private String rqmUser1;
	private String rqmUser2;
	private String rqmQadc01;
	private String rqmDomain;
	private Double oidRqmDet;

	// Constructors

	/** default constructor */
	public AbstractRqmDetId() {
	}

	/** minimal constructor */
	public AbstractRqmDetId(String rqmDomain, Double oidRqmDet) {
		this.rqmDomain = rqmDomain;
		this.oidRqmDet = oidRqmDet;
	}

	/** full constructor */
	public AbstractRqmDetId(String rqmReference, String rqmCat,
			String rqmValue, Integer rqmType, String rqmNbr, Integer rqmLine,
			String rqmRlseId, Date rqmDate, String rqmTime, String rqmInterval,
			String rqmUser1, String rqmUser2, String rqmQadc01,
			String rqmDomain, Double oidRqmDet) {
		this.rqmReference = rqmReference;
		this.rqmCat = rqmCat;
		this.rqmValue = rqmValue;
		this.rqmType = rqmType;
		this.rqmNbr = rqmNbr;
		this.rqmLine = rqmLine;
		this.rqmRlseId = rqmRlseId;
		this.rqmDate = rqmDate;
		this.rqmTime = rqmTime;
		this.rqmInterval = rqmInterval;
		this.rqmUser1 = rqmUser1;
		this.rqmUser2 = rqmUser2;
		this.rqmQadc01 = rqmQadc01;
		this.rqmDomain = rqmDomain;
		this.oidRqmDet = oidRqmDet;
	}

	// Property accessors

	public String getRqmReference() {
		return this.rqmReference;
	}

	public void setRqmReference(String rqmReference) {
		this.rqmReference = rqmReference;
	}

	public String getRqmCat() {
		return this.rqmCat;
	}

	public void setRqmCat(String rqmCat) {
		this.rqmCat = rqmCat;
	}

	public String getRqmValue() {
		return this.rqmValue;
	}

	public void setRqmValue(String rqmValue) {
		this.rqmValue = rqmValue;
	}

	public Integer getRqmType() {
		return this.rqmType;
	}

	public void setRqmType(Integer rqmType) {
		this.rqmType = rqmType;
	}

	public String getRqmNbr() {
		return this.rqmNbr;
	}

	public void setRqmNbr(String rqmNbr) {
		this.rqmNbr = rqmNbr;
	}

	public Integer getRqmLine() {
		return this.rqmLine;
	}

	public void setRqmLine(Integer rqmLine) {
		this.rqmLine = rqmLine;
	}

	public String getRqmRlseId() {
		return this.rqmRlseId;
	}

	public void setRqmRlseId(String rqmRlseId) {
		this.rqmRlseId = rqmRlseId;
	}

	public Date getRqmDate() {
		return this.rqmDate;
	}

	public void setRqmDate(Date rqmDate) {
		this.rqmDate = rqmDate;
	}

	public String getRqmTime() {
		return this.rqmTime;
	}

	public void setRqmTime(String rqmTime) {
		this.rqmTime = rqmTime;
	}

	public String getRqmInterval() {
		return this.rqmInterval;
	}

	public void setRqmInterval(String rqmInterval) {
		this.rqmInterval = rqmInterval;
	}

	public String getRqmUser1() {
		return this.rqmUser1;
	}

	public void setRqmUser1(String rqmUser1) {
		this.rqmUser1 = rqmUser1;
	}

	public String getRqmUser2() {
		return this.rqmUser2;
	}

	public void setRqmUser2(String rqmUser2) {
		this.rqmUser2 = rqmUser2;
	}

	public String getRqmQadc01() {
		return this.rqmQadc01;
	}

	public void setRqmQadc01(String rqmQadc01) {
		this.rqmQadc01 = rqmQadc01;
	}

	public String getRqmDomain() {
		return this.rqmDomain;
	}

	public void setRqmDomain(String rqmDomain) {
		this.rqmDomain = rqmDomain;
	}

	public Double getOidRqmDet() {
		return this.oidRqmDet;
	}

	public void setOidRqmDet(Double oidRqmDet) {
		this.oidRqmDet = oidRqmDet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqmDetId))
			return false;
		AbstractRqmDetId castOther = (AbstractRqmDetId) other;

		return ((this.getRqmReference() == castOther.getRqmReference()) || (this
				.getRqmReference() != null
				&& castOther.getRqmReference() != null && this
				.getRqmReference().equals(castOther.getRqmReference())))
				&& ((this.getRqmCat() == castOther.getRqmCat()) || (this
						.getRqmCat() != null
						&& castOther.getRqmCat() != null && this.getRqmCat()
						.equals(castOther.getRqmCat())))
				&& ((this.getRqmValue() == castOther.getRqmValue()) || (this
						.getRqmValue() != null
						&& castOther.getRqmValue() != null && this
						.getRqmValue().equals(castOther.getRqmValue())))
				&& ((this.getRqmType() == castOther.getRqmType()) || (this
						.getRqmType() != null
						&& castOther.getRqmType() != null && this.getRqmType()
						.equals(castOther.getRqmType())))
				&& ((this.getRqmNbr() == castOther.getRqmNbr()) || (this
						.getRqmNbr() != null
						&& castOther.getRqmNbr() != null && this.getRqmNbr()
						.equals(castOther.getRqmNbr())))
				&& ((this.getRqmLine() == castOther.getRqmLine()) || (this
						.getRqmLine() != null
						&& castOther.getRqmLine() != null && this.getRqmLine()
						.equals(castOther.getRqmLine())))
				&& ((this.getRqmRlseId() == castOther.getRqmRlseId()) || (this
						.getRqmRlseId() != null
						&& castOther.getRqmRlseId() != null && this
						.getRqmRlseId().equals(castOther.getRqmRlseId())))
				&& ((this.getRqmDate() == castOther.getRqmDate()) || (this
						.getRqmDate() != null
						&& castOther.getRqmDate() != null && this.getRqmDate()
						.equals(castOther.getRqmDate())))
				&& ((this.getRqmTime() == castOther.getRqmTime()) || (this
						.getRqmTime() != null
						&& castOther.getRqmTime() != null && this.getRqmTime()
						.equals(castOther.getRqmTime())))
				&& ((this.getRqmInterval() == castOther.getRqmInterval()) || (this
						.getRqmInterval() != null
						&& castOther.getRqmInterval() != null && this
						.getRqmInterval().equals(castOther.getRqmInterval())))
				&& ((this.getRqmUser1() == castOther.getRqmUser1()) || (this
						.getRqmUser1() != null
						&& castOther.getRqmUser1() != null && this
						.getRqmUser1().equals(castOther.getRqmUser1())))
				&& ((this.getRqmUser2() == castOther.getRqmUser2()) || (this
						.getRqmUser2() != null
						&& castOther.getRqmUser2() != null && this
						.getRqmUser2().equals(castOther.getRqmUser2())))
				&& ((this.getRqmQadc01() == castOther.getRqmQadc01()) || (this
						.getRqmQadc01() != null
						&& castOther.getRqmQadc01() != null && this
						.getRqmQadc01().equals(castOther.getRqmQadc01())))
				&& ((this.getRqmDomain() == castOther.getRqmDomain()) || (this
						.getRqmDomain() != null
						&& castOther.getRqmDomain() != null && this
						.getRqmDomain().equals(castOther.getRqmDomain())))
				&& ((this.getOidRqmDet() == castOther.getOidRqmDet()) || (this
						.getOidRqmDet() != null
						&& castOther.getOidRqmDet() != null && this
						.getOidRqmDet().equals(castOther.getOidRqmDet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRqmReference() == null ? 0 : this.getRqmReference()
						.hashCode());
		result = 37 * result
				+ (getRqmCat() == null ? 0 : this.getRqmCat().hashCode());
		result = 37 * result
				+ (getRqmValue() == null ? 0 : this.getRqmValue().hashCode());
		result = 37 * result
				+ (getRqmType() == null ? 0 : this.getRqmType().hashCode());
		result = 37 * result
				+ (getRqmNbr() == null ? 0 : this.getRqmNbr().hashCode());
		result = 37 * result
				+ (getRqmLine() == null ? 0 : this.getRqmLine().hashCode());
		result = 37 * result
				+ (getRqmRlseId() == null ? 0 : this.getRqmRlseId().hashCode());
		result = 37 * result
				+ (getRqmDate() == null ? 0 : this.getRqmDate().hashCode());
		result = 37 * result
				+ (getRqmTime() == null ? 0 : this.getRqmTime().hashCode());
		result = 37
				* result
				+ (getRqmInterval() == null ? 0 : this.getRqmInterval()
						.hashCode());
		result = 37 * result
				+ (getRqmUser1() == null ? 0 : this.getRqmUser1().hashCode());
		result = 37 * result
				+ (getRqmUser2() == null ? 0 : this.getRqmUser2().hashCode());
		result = 37 * result
				+ (getRqmQadc01() == null ? 0 : this.getRqmQadc01().hashCode());
		result = 37 * result
				+ (getRqmDomain() == null ? 0 : this.getRqmDomain().hashCode());
		result = 37 * result
				+ (getOidRqmDet() == null ? 0 : this.getOidRqmDet().hashCode());
		return result;
	}

}