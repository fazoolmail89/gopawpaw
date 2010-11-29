package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRcsxRefId entity provides the base persistence definition of the
 * RcsxRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcsxRefId implements java.io.Serializable {

	// Fields

	private String rcsxDomain;
	private String rcsxShipfrom;
	private String rcsxShipto;
	private String rcsxShippedRlseId;
	private String rcsxShippedCustJob;
	private String rcsxShippedCustSeq;
	private String rcsxShippedPart;
	private Date rcsxShippedDate;
	private String rcsxShippedTime;
	private String rcsxShippedCustRef;
	private String rcsxShippedDock;
	private String rcsxShippedLineFeed;

	// Constructors

	/** default constructor */
	public AbstractRcsxRefId() {
	}

	/** minimal constructor */
	public AbstractRcsxRefId(String rcsxDomain) {
		this.rcsxDomain = rcsxDomain;
	}

	/** full constructor */
	public AbstractRcsxRefId(String rcsxDomain, String rcsxShipfrom,
			String rcsxShipto, String rcsxShippedRlseId,
			String rcsxShippedCustJob, String rcsxShippedCustSeq,
			String rcsxShippedPart, Date rcsxShippedDate,
			String rcsxShippedTime, String rcsxShippedCustRef,
			String rcsxShippedDock, String rcsxShippedLineFeed) {
		this.rcsxDomain = rcsxDomain;
		this.rcsxShipfrom = rcsxShipfrom;
		this.rcsxShipto = rcsxShipto;
		this.rcsxShippedRlseId = rcsxShippedRlseId;
		this.rcsxShippedCustJob = rcsxShippedCustJob;
		this.rcsxShippedCustSeq = rcsxShippedCustSeq;
		this.rcsxShippedPart = rcsxShippedPart;
		this.rcsxShippedDate = rcsxShippedDate;
		this.rcsxShippedTime = rcsxShippedTime;
		this.rcsxShippedCustRef = rcsxShippedCustRef;
		this.rcsxShippedDock = rcsxShippedDock;
		this.rcsxShippedLineFeed = rcsxShippedLineFeed;
	}

	// Property accessors

	public String getRcsxDomain() {
		return this.rcsxDomain;
	}

	public void setRcsxDomain(String rcsxDomain) {
		this.rcsxDomain = rcsxDomain;
	}

	public String getRcsxShipfrom() {
		return this.rcsxShipfrom;
	}

	public void setRcsxShipfrom(String rcsxShipfrom) {
		this.rcsxShipfrom = rcsxShipfrom;
	}

	public String getRcsxShipto() {
		return this.rcsxShipto;
	}

	public void setRcsxShipto(String rcsxShipto) {
		this.rcsxShipto = rcsxShipto;
	}

	public String getRcsxShippedRlseId() {
		return this.rcsxShippedRlseId;
	}

	public void setRcsxShippedRlseId(String rcsxShippedRlseId) {
		this.rcsxShippedRlseId = rcsxShippedRlseId;
	}

	public String getRcsxShippedCustJob() {
		return this.rcsxShippedCustJob;
	}

	public void setRcsxShippedCustJob(String rcsxShippedCustJob) {
		this.rcsxShippedCustJob = rcsxShippedCustJob;
	}

	public String getRcsxShippedCustSeq() {
		return this.rcsxShippedCustSeq;
	}

	public void setRcsxShippedCustSeq(String rcsxShippedCustSeq) {
		this.rcsxShippedCustSeq = rcsxShippedCustSeq;
	}

	public String getRcsxShippedPart() {
		return this.rcsxShippedPart;
	}

	public void setRcsxShippedPart(String rcsxShippedPart) {
		this.rcsxShippedPart = rcsxShippedPart;
	}

	public Date getRcsxShippedDate() {
		return this.rcsxShippedDate;
	}

	public void setRcsxShippedDate(Date rcsxShippedDate) {
		this.rcsxShippedDate = rcsxShippedDate;
	}

	public String getRcsxShippedTime() {
		return this.rcsxShippedTime;
	}

	public void setRcsxShippedTime(String rcsxShippedTime) {
		this.rcsxShippedTime = rcsxShippedTime;
	}

	public String getRcsxShippedCustRef() {
		return this.rcsxShippedCustRef;
	}

	public void setRcsxShippedCustRef(String rcsxShippedCustRef) {
		this.rcsxShippedCustRef = rcsxShippedCustRef;
	}

	public String getRcsxShippedDock() {
		return this.rcsxShippedDock;
	}

	public void setRcsxShippedDock(String rcsxShippedDock) {
		this.rcsxShippedDock = rcsxShippedDock;
	}

	public String getRcsxShippedLineFeed() {
		return this.rcsxShippedLineFeed;
	}

	public void setRcsxShippedLineFeed(String rcsxShippedLineFeed) {
		this.rcsxShippedLineFeed = rcsxShippedLineFeed;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRcsxRefId))
			return false;
		AbstractRcsxRefId castOther = (AbstractRcsxRefId) other;

		return ((this.getRcsxDomain() == castOther.getRcsxDomain()) || (this
				.getRcsxDomain() != null
				&& castOther.getRcsxDomain() != null && this.getRcsxDomain()
				.equals(castOther.getRcsxDomain())))
				&& ((this.getRcsxShipfrom() == castOther.getRcsxShipfrom()) || (this
						.getRcsxShipfrom() != null
						&& castOther.getRcsxShipfrom() != null && this
						.getRcsxShipfrom().equals(castOther.getRcsxShipfrom())))
				&& ((this.getRcsxShipto() == castOther.getRcsxShipto()) || (this
						.getRcsxShipto() != null
						&& castOther.getRcsxShipto() != null && this
						.getRcsxShipto().equals(castOther.getRcsxShipto())))
				&& ((this.getRcsxShippedRlseId() == castOther
						.getRcsxShippedRlseId()) || (this
						.getRcsxShippedRlseId() != null
						&& castOther.getRcsxShippedRlseId() != null && this
						.getRcsxShippedRlseId().equals(
								castOther.getRcsxShippedRlseId())))
				&& ((this.getRcsxShippedCustJob() == castOther
						.getRcsxShippedCustJob()) || (this
						.getRcsxShippedCustJob() != null
						&& castOther.getRcsxShippedCustJob() != null && this
						.getRcsxShippedCustJob().equals(
								castOther.getRcsxShippedCustJob())))
				&& ((this.getRcsxShippedCustSeq() == castOther
						.getRcsxShippedCustSeq()) || (this
						.getRcsxShippedCustSeq() != null
						&& castOther.getRcsxShippedCustSeq() != null && this
						.getRcsxShippedCustSeq().equals(
								castOther.getRcsxShippedCustSeq())))
				&& ((this.getRcsxShippedPart() == castOther
						.getRcsxShippedPart()) || (this.getRcsxShippedPart() != null
						&& castOther.getRcsxShippedPart() != null && this
						.getRcsxShippedPart().equals(
								castOther.getRcsxShippedPart())))
				&& ((this.getRcsxShippedDate() == castOther
						.getRcsxShippedDate()) || (this.getRcsxShippedDate() != null
						&& castOther.getRcsxShippedDate() != null && this
						.getRcsxShippedDate().equals(
								castOther.getRcsxShippedDate())))
				&& ((this.getRcsxShippedTime() == castOther
						.getRcsxShippedTime()) || (this.getRcsxShippedTime() != null
						&& castOther.getRcsxShippedTime() != null && this
						.getRcsxShippedTime().equals(
								castOther.getRcsxShippedTime())))
				&& ((this.getRcsxShippedCustRef() == castOther
						.getRcsxShippedCustRef()) || (this
						.getRcsxShippedCustRef() != null
						&& castOther.getRcsxShippedCustRef() != null && this
						.getRcsxShippedCustRef().equals(
								castOther.getRcsxShippedCustRef())))
				&& ((this.getRcsxShippedDock() == castOther
						.getRcsxShippedDock()) || (this.getRcsxShippedDock() != null
						&& castOther.getRcsxShippedDock() != null && this
						.getRcsxShippedDock().equals(
								castOther.getRcsxShippedDock())))
				&& ((this.getRcsxShippedLineFeed() == castOther
						.getRcsxShippedLineFeed()) || (this
						.getRcsxShippedLineFeed() != null
						&& castOther.getRcsxShippedLineFeed() != null && this
						.getRcsxShippedLineFeed().equals(
								castOther.getRcsxShippedLineFeed())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRcsxDomain() == null ? 0 : this.getRcsxDomain()
						.hashCode());
		result = 37
				* result
				+ (getRcsxShipfrom() == null ? 0 : this.getRcsxShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getRcsxShipto() == null ? 0 : this.getRcsxShipto()
						.hashCode());
		result = 37
				* result
				+ (getRcsxShippedRlseId() == null ? 0 : this
						.getRcsxShippedRlseId().hashCode());
		result = 37
				* result
				+ (getRcsxShippedCustJob() == null ? 0 : this
						.getRcsxShippedCustJob().hashCode());
		result = 37
				* result
				+ (getRcsxShippedCustSeq() == null ? 0 : this
						.getRcsxShippedCustSeq().hashCode());
		result = 37
				* result
				+ (getRcsxShippedPart() == null ? 0 : this.getRcsxShippedPart()
						.hashCode());
		result = 37
				* result
				+ (getRcsxShippedDate() == null ? 0 : this.getRcsxShippedDate()
						.hashCode());
		result = 37
				* result
				+ (getRcsxShippedTime() == null ? 0 : this.getRcsxShippedTime()
						.hashCode());
		result = 37
				* result
				+ (getRcsxShippedCustRef() == null ? 0 : this
						.getRcsxShippedCustRef().hashCode());
		result = 37
				* result
				+ (getRcsxShippedDock() == null ? 0 : this.getRcsxShippedDock()
						.hashCode());
		result = 37
				* result
				+ (getRcsxShippedLineFeed() == null ? 0 : this
						.getRcsxShippedLineFeed().hashCode());
		return result;
	}

}