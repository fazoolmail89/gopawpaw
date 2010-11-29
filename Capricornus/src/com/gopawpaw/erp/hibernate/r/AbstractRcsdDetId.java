package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRcsdDetId entity provides the base persistence definition of the
 * RcsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRcsdDetId implements java.io.Serializable {

	// Fields

	private String rcsdDomain;
	private String rcsdShipfrom;
	private String rcsdShipto;
	private String rcsdRlseId;
	private String rcsdCustJob;
	private String rcsdCustSeq;
	private String rcsdPart;
	private Date rcsdDate;
	private String rcsdTime;
	private String rcsdCustRef;
	private String rcsdDock;
	private String rcsdLineFeed;

	// Constructors

	/** default constructor */
	public AbstractRcsdDetId() {
	}

	/** minimal constructor */
	public AbstractRcsdDetId(String rcsdDomain) {
		this.rcsdDomain = rcsdDomain;
	}

	/** full constructor */
	public AbstractRcsdDetId(String rcsdDomain, String rcsdShipfrom,
			String rcsdShipto, String rcsdRlseId, String rcsdCustJob,
			String rcsdCustSeq, String rcsdPart, Date rcsdDate,
			String rcsdTime, String rcsdCustRef, String rcsdDock,
			String rcsdLineFeed) {
		this.rcsdDomain = rcsdDomain;
		this.rcsdShipfrom = rcsdShipfrom;
		this.rcsdShipto = rcsdShipto;
		this.rcsdRlseId = rcsdRlseId;
		this.rcsdCustJob = rcsdCustJob;
		this.rcsdCustSeq = rcsdCustSeq;
		this.rcsdPart = rcsdPart;
		this.rcsdDate = rcsdDate;
		this.rcsdTime = rcsdTime;
		this.rcsdCustRef = rcsdCustRef;
		this.rcsdDock = rcsdDock;
		this.rcsdLineFeed = rcsdLineFeed;
	}

	// Property accessors

	public String getRcsdDomain() {
		return this.rcsdDomain;
	}

	public void setRcsdDomain(String rcsdDomain) {
		this.rcsdDomain = rcsdDomain;
	}

	public String getRcsdShipfrom() {
		return this.rcsdShipfrom;
	}

	public void setRcsdShipfrom(String rcsdShipfrom) {
		this.rcsdShipfrom = rcsdShipfrom;
	}

	public String getRcsdShipto() {
		return this.rcsdShipto;
	}

	public void setRcsdShipto(String rcsdShipto) {
		this.rcsdShipto = rcsdShipto;
	}

	public String getRcsdRlseId() {
		return this.rcsdRlseId;
	}

	public void setRcsdRlseId(String rcsdRlseId) {
		this.rcsdRlseId = rcsdRlseId;
	}

	public String getRcsdCustJob() {
		return this.rcsdCustJob;
	}

	public void setRcsdCustJob(String rcsdCustJob) {
		this.rcsdCustJob = rcsdCustJob;
	}

	public String getRcsdCustSeq() {
		return this.rcsdCustSeq;
	}

	public void setRcsdCustSeq(String rcsdCustSeq) {
		this.rcsdCustSeq = rcsdCustSeq;
	}

	public String getRcsdPart() {
		return this.rcsdPart;
	}

	public void setRcsdPart(String rcsdPart) {
		this.rcsdPart = rcsdPart;
	}

	public Date getRcsdDate() {
		return this.rcsdDate;
	}

	public void setRcsdDate(Date rcsdDate) {
		this.rcsdDate = rcsdDate;
	}

	public String getRcsdTime() {
		return this.rcsdTime;
	}

	public void setRcsdTime(String rcsdTime) {
		this.rcsdTime = rcsdTime;
	}

	public String getRcsdCustRef() {
		return this.rcsdCustRef;
	}

	public void setRcsdCustRef(String rcsdCustRef) {
		this.rcsdCustRef = rcsdCustRef;
	}

	public String getRcsdDock() {
		return this.rcsdDock;
	}

	public void setRcsdDock(String rcsdDock) {
		this.rcsdDock = rcsdDock;
	}

	public String getRcsdLineFeed() {
		return this.rcsdLineFeed;
	}

	public void setRcsdLineFeed(String rcsdLineFeed) {
		this.rcsdLineFeed = rcsdLineFeed;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRcsdDetId))
			return false;
		AbstractRcsdDetId castOther = (AbstractRcsdDetId) other;

		return ((this.getRcsdDomain() == castOther.getRcsdDomain()) || (this
				.getRcsdDomain() != null
				&& castOther.getRcsdDomain() != null && this.getRcsdDomain()
				.equals(castOther.getRcsdDomain())))
				&& ((this.getRcsdShipfrom() == castOther.getRcsdShipfrom()) || (this
						.getRcsdShipfrom() != null
						&& castOther.getRcsdShipfrom() != null && this
						.getRcsdShipfrom().equals(castOther.getRcsdShipfrom())))
				&& ((this.getRcsdShipto() == castOther.getRcsdShipto()) || (this
						.getRcsdShipto() != null
						&& castOther.getRcsdShipto() != null && this
						.getRcsdShipto().equals(castOther.getRcsdShipto())))
				&& ((this.getRcsdRlseId() == castOther.getRcsdRlseId()) || (this
						.getRcsdRlseId() != null
						&& castOther.getRcsdRlseId() != null && this
						.getRcsdRlseId().equals(castOther.getRcsdRlseId())))
				&& ((this.getRcsdCustJob() == castOther.getRcsdCustJob()) || (this
						.getRcsdCustJob() != null
						&& castOther.getRcsdCustJob() != null && this
						.getRcsdCustJob().equals(castOther.getRcsdCustJob())))
				&& ((this.getRcsdCustSeq() == castOther.getRcsdCustSeq()) || (this
						.getRcsdCustSeq() != null
						&& castOther.getRcsdCustSeq() != null && this
						.getRcsdCustSeq().equals(castOther.getRcsdCustSeq())))
				&& ((this.getRcsdPart() == castOther.getRcsdPart()) || (this
						.getRcsdPart() != null
						&& castOther.getRcsdPart() != null && this
						.getRcsdPart().equals(castOther.getRcsdPart())))
				&& ((this.getRcsdDate() == castOther.getRcsdDate()) || (this
						.getRcsdDate() != null
						&& castOther.getRcsdDate() != null && this
						.getRcsdDate().equals(castOther.getRcsdDate())))
				&& ((this.getRcsdTime() == castOther.getRcsdTime()) || (this
						.getRcsdTime() != null
						&& castOther.getRcsdTime() != null && this
						.getRcsdTime().equals(castOther.getRcsdTime())))
				&& ((this.getRcsdCustRef() == castOther.getRcsdCustRef()) || (this
						.getRcsdCustRef() != null
						&& castOther.getRcsdCustRef() != null && this
						.getRcsdCustRef().equals(castOther.getRcsdCustRef())))
				&& ((this.getRcsdDock() == castOther.getRcsdDock()) || (this
						.getRcsdDock() != null
						&& castOther.getRcsdDock() != null && this
						.getRcsdDock().equals(castOther.getRcsdDock())))
				&& ((this.getRcsdLineFeed() == castOther.getRcsdLineFeed()) || (this
						.getRcsdLineFeed() != null
						&& castOther.getRcsdLineFeed() != null && this
						.getRcsdLineFeed().equals(castOther.getRcsdLineFeed())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRcsdDomain() == null ? 0 : this.getRcsdDomain()
						.hashCode());
		result = 37
				* result
				+ (getRcsdShipfrom() == null ? 0 : this.getRcsdShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getRcsdShipto() == null ? 0 : this.getRcsdShipto()
						.hashCode());
		result = 37
				* result
				+ (getRcsdRlseId() == null ? 0 : this.getRcsdRlseId()
						.hashCode());
		result = 37
				* result
				+ (getRcsdCustJob() == null ? 0 : this.getRcsdCustJob()
						.hashCode());
		result = 37
				* result
				+ (getRcsdCustSeq() == null ? 0 : this.getRcsdCustSeq()
						.hashCode());
		result = 37 * result
				+ (getRcsdPart() == null ? 0 : this.getRcsdPart().hashCode());
		result = 37 * result
				+ (getRcsdDate() == null ? 0 : this.getRcsdDate().hashCode());
		result = 37 * result
				+ (getRcsdTime() == null ? 0 : this.getRcsdTime().hashCode());
		result = 37
				* result
				+ (getRcsdCustRef() == null ? 0 : this.getRcsdCustRef()
						.hashCode());
		result = 37 * result
				+ (getRcsdDock() == null ? 0 : this.getRcsdDock().hashCode());
		result = 37
				* result
				+ (getRcsdLineFeed() == null ? 0 : this.getRcsdLineFeed()
						.hashCode());
		return result;
	}

}