package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSchdDetId entity provides the base persistence definition of the
 * SchdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSchdDetId implements java.io.Serializable {

	// Fields

	private String schdDomain;
	private Integer schdType;
	private String schdNbr;
	private Integer schdLine;
	private String schdRlseId;
	private Date schdDate;
	private String schdTime;
	private String schdInterval;
	private String schdReference;

	// Constructors

	/** default constructor */
	public AbstractSchdDetId() {
	}

	/** minimal constructor */
	public AbstractSchdDetId(String schdDomain) {
		this.schdDomain = schdDomain;
	}

	/** full constructor */
	public AbstractSchdDetId(String schdDomain, Integer schdType,
			String schdNbr, Integer schdLine, String schdRlseId, Date schdDate,
			String schdTime, String schdInterval, String schdReference) {
		this.schdDomain = schdDomain;
		this.schdType = schdType;
		this.schdNbr = schdNbr;
		this.schdLine = schdLine;
		this.schdRlseId = schdRlseId;
		this.schdDate = schdDate;
		this.schdTime = schdTime;
		this.schdInterval = schdInterval;
		this.schdReference = schdReference;
	}

	// Property accessors

	public String getSchdDomain() {
		return this.schdDomain;
	}

	public void setSchdDomain(String schdDomain) {
		this.schdDomain = schdDomain;
	}

	public Integer getSchdType() {
		return this.schdType;
	}

	public void setSchdType(Integer schdType) {
		this.schdType = schdType;
	}

	public String getSchdNbr() {
		return this.schdNbr;
	}

	public void setSchdNbr(String schdNbr) {
		this.schdNbr = schdNbr;
	}

	public Integer getSchdLine() {
		return this.schdLine;
	}

	public void setSchdLine(Integer schdLine) {
		this.schdLine = schdLine;
	}

	public String getSchdRlseId() {
		return this.schdRlseId;
	}

	public void setSchdRlseId(String schdRlseId) {
		this.schdRlseId = schdRlseId;
	}

	public Date getSchdDate() {
		return this.schdDate;
	}

	public void setSchdDate(Date schdDate) {
		this.schdDate = schdDate;
	}

	public String getSchdTime() {
		return this.schdTime;
	}

	public void setSchdTime(String schdTime) {
		this.schdTime = schdTime;
	}

	public String getSchdInterval() {
		return this.schdInterval;
	}

	public void setSchdInterval(String schdInterval) {
		this.schdInterval = schdInterval;
	}

	public String getSchdReference() {
		return this.schdReference;
	}

	public void setSchdReference(String schdReference) {
		this.schdReference = schdReference;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSchdDetId))
			return false;
		AbstractSchdDetId castOther = (AbstractSchdDetId) other;

		return ((this.getSchdDomain() == castOther.getSchdDomain()) || (this
				.getSchdDomain() != null
				&& castOther.getSchdDomain() != null && this.getSchdDomain()
				.equals(castOther.getSchdDomain())))
				&& ((this.getSchdType() == castOther.getSchdType()) || (this
						.getSchdType() != null
						&& castOther.getSchdType() != null && this
						.getSchdType().equals(castOther.getSchdType())))
				&& ((this.getSchdNbr() == castOther.getSchdNbr()) || (this
						.getSchdNbr() != null
						&& castOther.getSchdNbr() != null && this.getSchdNbr()
						.equals(castOther.getSchdNbr())))
				&& ((this.getSchdLine() == castOther.getSchdLine()) || (this
						.getSchdLine() != null
						&& castOther.getSchdLine() != null && this
						.getSchdLine().equals(castOther.getSchdLine())))
				&& ((this.getSchdRlseId() == castOther.getSchdRlseId()) || (this
						.getSchdRlseId() != null
						&& castOther.getSchdRlseId() != null && this
						.getSchdRlseId().equals(castOther.getSchdRlseId())))
				&& ((this.getSchdDate() == castOther.getSchdDate()) || (this
						.getSchdDate() != null
						&& castOther.getSchdDate() != null && this
						.getSchdDate().equals(castOther.getSchdDate())))
				&& ((this.getSchdTime() == castOther.getSchdTime()) || (this
						.getSchdTime() != null
						&& castOther.getSchdTime() != null && this
						.getSchdTime().equals(castOther.getSchdTime())))
				&& ((this.getSchdInterval() == castOther.getSchdInterval()) || (this
						.getSchdInterval() != null
						&& castOther.getSchdInterval() != null && this
						.getSchdInterval().equals(castOther.getSchdInterval())))
				&& ((this.getSchdReference() == castOther.getSchdReference()) || (this
						.getSchdReference() != null
						&& castOther.getSchdReference() != null && this
						.getSchdReference()
						.equals(castOther.getSchdReference())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSchdDomain() == null ? 0 : this.getSchdDomain()
						.hashCode());
		result = 37 * result
				+ (getSchdType() == null ? 0 : this.getSchdType().hashCode());
		result = 37 * result
				+ (getSchdNbr() == null ? 0 : this.getSchdNbr().hashCode());
		result = 37 * result
				+ (getSchdLine() == null ? 0 : this.getSchdLine().hashCode());
		result = 37
				* result
				+ (getSchdRlseId() == null ? 0 : this.getSchdRlseId()
						.hashCode());
		result = 37 * result
				+ (getSchdDate() == null ? 0 : this.getSchdDate().hashCode());
		result = 37 * result
				+ (getSchdTime() == null ? 0 : this.getSchdTime().hashCode());
		result = 37
				* result
				+ (getSchdInterval() == null ? 0 : this.getSchdInterval()
						.hashCode());
		result = 37
				* result
				+ (getSchdReference() == null ? 0 : this.getSchdReference()
						.hashCode());
		return result;
	}

}