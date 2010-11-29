package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqhHistId entity provides the base persistence definition of the
 * RqhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqhHistId implements java.io.Serializable {

	// Fields

	private String rqhDomain;
	private String rqhNbr;
	private Date rqhDate;
	private Integer rqhTime;
	private Integer rqhSeqNbr;

	// Constructors

	/** default constructor */
	public AbstractRqhHistId() {
	}

	/** minimal constructor */
	public AbstractRqhHistId(String rqhDomain) {
		this.rqhDomain = rqhDomain;
	}

	/** full constructor */
	public AbstractRqhHistId(String rqhDomain, String rqhNbr, Date rqhDate,
			Integer rqhTime, Integer rqhSeqNbr) {
		this.rqhDomain = rqhDomain;
		this.rqhNbr = rqhNbr;
		this.rqhDate = rqhDate;
		this.rqhTime = rqhTime;
		this.rqhSeqNbr = rqhSeqNbr;
	}

	// Property accessors

	public String getRqhDomain() {
		return this.rqhDomain;
	}

	public void setRqhDomain(String rqhDomain) {
		this.rqhDomain = rqhDomain;
	}

	public String getRqhNbr() {
		return this.rqhNbr;
	}

	public void setRqhNbr(String rqhNbr) {
		this.rqhNbr = rqhNbr;
	}

	public Date getRqhDate() {
		return this.rqhDate;
	}

	public void setRqhDate(Date rqhDate) {
		this.rqhDate = rqhDate;
	}

	public Integer getRqhTime() {
		return this.rqhTime;
	}

	public void setRqhTime(Integer rqhTime) {
		this.rqhTime = rqhTime;
	}

	public Integer getRqhSeqNbr() {
		return this.rqhSeqNbr;
	}

	public void setRqhSeqNbr(Integer rqhSeqNbr) {
		this.rqhSeqNbr = rqhSeqNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqhHistId))
			return false;
		AbstractRqhHistId castOther = (AbstractRqhHistId) other;

		return ((this.getRqhDomain() == castOther.getRqhDomain()) || (this
				.getRqhDomain() != null
				&& castOther.getRqhDomain() != null && this.getRqhDomain()
				.equals(castOther.getRqhDomain())))
				&& ((this.getRqhNbr() == castOther.getRqhNbr()) || (this
						.getRqhNbr() != null
						&& castOther.getRqhNbr() != null && this.getRqhNbr()
						.equals(castOther.getRqhNbr())))
				&& ((this.getRqhDate() == castOther.getRqhDate()) || (this
						.getRqhDate() != null
						&& castOther.getRqhDate() != null && this.getRqhDate()
						.equals(castOther.getRqhDate())))
				&& ((this.getRqhTime() == castOther.getRqhTime()) || (this
						.getRqhTime() != null
						&& castOther.getRqhTime() != null && this.getRqhTime()
						.equals(castOther.getRqhTime())))
				&& ((this.getRqhSeqNbr() == castOther.getRqhSeqNbr()) || (this
						.getRqhSeqNbr() != null
						&& castOther.getRqhSeqNbr() != null && this
						.getRqhSeqNbr().equals(castOther.getRqhSeqNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqhDomain() == null ? 0 : this.getRqhDomain().hashCode());
		result = 37 * result
				+ (getRqhNbr() == null ? 0 : this.getRqhNbr().hashCode());
		result = 37 * result
				+ (getRqhDate() == null ? 0 : this.getRqhDate().hashCode());
		result = 37 * result
				+ (getRqhTime() == null ? 0 : this.getRqhTime().hashCode());
		result = 37 * result
				+ (getRqhSeqNbr() == null ? 0 : this.getRqhSeqNbr().hashCode());
		return result;
	}

}