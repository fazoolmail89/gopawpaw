package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbsrDetId entity provides the base persistence definition of the
 * AbsrDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsrDetId implements java.io.Serializable {

	// Fields

	private String absrDomain;
	private String absrShipfrom;
	private String absrId;
	private Integer absrType;
	private String absrNbr;
	private Integer absrLine;
	private String absrRlseId;
	private Date absrDate;
	private String absrTime;
	private String absrInterval;
	private String absrReference;

	// Constructors

	/** default constructor */
	public AbstractAbsrDetId() {
	}

	/** minimal constructor */
	public AbstractAbsrDetId(String absrDomain) {
		this.absrDomain = absrDomain;
	}

	/** full constructor */
	public AbstractAbsrDetId(String absrDomain, String absrShipfrom,
			String absrId, Integer absrType, String absrNbr, Integer absrLine,
			String absrRlseId, Date absrDate, String absrTime,
			String absrInterval, String absrReference) {
		this.absrDomain = absrDomain;
		this.absrShipfrom = absrShipfrom;
		this.absrId = absrId;
		this.absrType = absrType;
		this.absrNbr = absrNbr;
		this.absrLine = absrLine;
		this.absrRlseId = absrRlseId;
		this.absrDate = absrDate;
		this.absrTime = absrTime;
		this.absrInterval = absrInterval;
		this.absrReference = absrReference;
	}

	// Property accessors

	public String getAbsrDomain() {
		return this.absrDomain;
	}

	public void setAbsrDomain(String absrDomain) {
		this.absrDomain = absrDomain;
	}

	public String getAbsrShipfrom() {
		return this.absrShipfrom;
	}

	public void setAbsrShipfrom(String absrShipfrom) {
		this.absrShipfrom = absrShipfrom;
	}

	public String getAbsrId() {
		return this.absrId;
	}

	public void setAbsrId(String absrId) {
		this.absrId = absrId;
	}

	public Integer getAbsrType() {
		return this.absrType;
	}

	public void setAbsrType(Integer absrType) {
		this.absrType = absrType;
	}

	public String getAbsrNbr() {
		return this.absrNbr;
	}

	public void setAbsrNbr(String absrNbr) {
		this.absrNbr = absrNbr;
	}

	public Integer getAbsrLine() {
		return this.absrLine;
	}

	public void setAbsrLine(Integer absrLine) {
		this.absrLine = absrLine;
	}

	public String getAbsrRlseId() {
		return this.absrRlseId;
	}

	public void setAbsrRlseId(String absrRlseId) {
		this.absrRlseId = absrRlseId;
	}

	public Date getAbsrDate() {
		return this.absrDate;
	}

	public void setAbsrDate(Date absrDate) {
		this.absrDate = absrDate;
	}

	public String getAbsrTime() {
		return this.absrTime;
	}

	public void setAbsrTime(String absrTime) {
		this.absrTime = absrTime;
	}

	public String getAbsrInterval() {
		return this.absrInterval;
	}

	public void setAbsrInterval(String absrInterval) {
		this.absrInterval = absrInterval;
	}

	public String getAbsrReference() {
		return this.absrReference;
	}

	public void setAbsrReference(String absrReference) {
		this.absrReference = absrReference;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbsrDetId))
			return false;
		AbstractAbsrDetId castOther = (AbstractAbsrDetId) other;

		return ((this.getAbsrDomain() == castOther.getAbsrDomain()) || (this
				.getAbsrDomain() != null
				&& castOther.getAbsrDomain() != null && this.getAbsrDomain()
				.equals(castOther.getAbsrDomain())))
				&& ((this.getAbsrShipfrom() == castOther.getAbsrShipfrom()) || (this
						.getAbsrShipfrom() != null
						&& castOther.getAbsrShipfrom() != null && this
						.getAbsrShipfrom().equals(castOther.getAbsrShipfrom())))
				&& ((this.getAbsrId() == castOther.getAbsrId()) || (this
						.getAbsrId() != null
						&& castOther.getAbsrId() != null && this.getAbsrId()
						.equals(castOther.getAbsrId())))
				&& ((this.getAbsrType() == castOther.getAbsrType()) || (this
						.getAbsrType() != null
						&& castOther.getAbsrType() != null && this
						.getAbsrType().equals(castOther.getAbsrType())))
				&& ((this.getAbsrNbr() == castOther.getAbsrNbr()) || (this
						.getAbsrNbr() != null
						&& castOther.getAbsrNbr() != null && this.getAbsrNbr()
						.equals(castOther.getAbsrNbr())))
				&& ((this.getAbsrLine() == castOther.getAbsrLine()) || (this
						.getAbsrLine() != null
						&& castOther.getAbsrLine() != null && this
						.getAbsrLine().equals(castOther.getAbsrLine())))
				&& ((this.getAbsrRlseId() == castOther.getAbsrRlseId()) || (this
						.getAbsrRlseId() != null
						&& castOther.getAbsrRlseId() != null && this
						.getAbsrRlseId().equals(castOther.getAbsrRlseId())))
				&& ((this.getAbsrDate() == castOther.getAbsrDate()) || (this
						.getAbsrDate() != null
						&& castOther.getAbsrDate() != null && this
						.getAbsrDate().equals(castOther.getAbsrDate())))
				&& ((this.getAbsrTime() == castOther.getAbsrTime()) || (this
						.getAbsrTime() != null
						&& castOther.getAbsrTime() != null && this
						.getAbsrTime().equals(castOther.getAbsrTime())))
				&& ((this.getAbsrInterval() == castOther.getAbsrInterval()) || (this
						.getAbsrInterval() != null
						&& castOther.getAbsrInterval() != null && this
						.getAbsrInterval().equals(castOther.getAbsrInterval())))
				&& ((this.getAbsrReference() == castOther.getAbsrReference()) || (this
						.getAbsrReference() != null
						&& castOther.getAbsrReference() != null && this
						.getAbsrReference()
						.equals(castOther.getAbsrReference())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAbsrDomain() == null ? 0 : this.getAbsrDomain()
						.hashCode());
		result = 37
				* result
				+ (getAbsrShipfrom() == null ? 0 : this.getAbsrShipfrom()
						.hashCode());
		result = 37 * result
				+ (getAbsrId() == null ? 0 : this.getAbsrId().hashCode());
		result = 37 * result
				+ (getAbsrType() == null ? 0 : this.getAbsrType().hashCode());
		result = 37 * result
				+ (getAbsrNbr() == null ? 0 : this.getAbsrNbr().hashCode());
		result = 37 * result
				+ (getAbsrLine() == null ? 0 : this.getAbsrLine().hashCode());
		result = 37
				* result
				+ (getAbsrRlseId() == null ? 0 : this.getAbsrRlseId()
						.hashCode());
		result = 37 * result
				+ (getAbsrDate() == null ? 0 : this.getAbsrDate().hashCode());
		result = 37 * result
				+ (getAbsrTime() == null ? 0 : this.getAbsrTime().hashCode());
		result = 37
				* result
				+ (getAbsrInterval() == null ? 0 : this.getAbsrInterval()
						.hashCode());
		result = 37
				* result
				+ (getAbsrReference() == null ? 0 : this.getAbsrReference()
						.hashCode());
		return result;
	}

}