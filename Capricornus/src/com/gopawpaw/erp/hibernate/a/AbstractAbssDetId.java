package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbssDetId entity provides the base persistence definition of the
 * AbssDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbssDetId implements java.io.Serializable {

	// Fields

	private String abssDomain;
	private String abssAbsId;
	private String abssShipfrom;
	private String abssShipto;
	private String abssRlseId;
	private String abssCustJob;
	private String abssCustSeq;
	private String abssPart;
	private Date abssDate;
	private String abssTime;
	private String abssCustRef;
	private String abssDock;
	private String abssLineFeed;

	// Constructors

	/** default constructor */
	public AbstractAbssDetId() {
	}

	/** minimal constructor */
	public AbstractAbssDetId(String abssDomain) {
		this.abssDomain = abssDomain;
	}

	/** full constructor */
	public AbstractAbssDetId(String abssDomain, String abssAbsId,
			String abssShipfrom, String abssShipto, String abssRlseId,
			String abssCustJob, String abssCustSeq, String abssPart,
			Date abssDate, String abssTime, String abssCustRef,
			String abssDock, String abssLineFeed) {
		this.abssDomain = abssDomain;
		this.abssAbsId = abssAbsId;
		this.abssShipfrom = abssShipfrom;
		this.abssShipto = abssShipto;
		this.abssRlseId = abssRlseId;
		this.abssCustJob = abssCustJob;
		this.abssCustSeq = abssCustSeq;
		this.abssPart = abssPart;
		this.abssDate = abssDate;
		this.abssTime = abssTime;
		this.abssCustRef = abssCustRef;
		this.abssDock = abssDock;
		this.abssLineFeed = abssLineFeed;
	}

	// Property accessors

	public String getAbssDomain() {
		return this.abssDomain;
	}

	public void setAbssDomain(String abssDomain) {
		this.abssDomain = abssDomain;
	}

	public String getAbssAbsId() {
		return this.abssAbsId;
	}

	public void setAbssAbsId(String abssAbsId) {
		this.abssAbsId = abssAbsId;
	}

	public String getAbssShipfrom() {
		return this.abssShipfrom;
	}

	public void setAbssShipfrom(String abssShipfrom) {
		this.abssShipfrom = abssShipfrom;
	}

	public String getAbssShipto() {
		return this.abssShipto;
	}

	public void setAbssShipto(String abssShipto) {
		this.abssShipto = abssShipto;
	}

	public String getAbssRlseId() {
		return this.abssRlseId;
	}

	public void setAbssRlseId(String abssRlseId) {
		this.abssRlseId = abssRlseId;
	}

	public String getAbssCustJob() {
		return this.abssCustJob;
	}

	public void setAbssCustJob(String abssCustJob) {
		this.abssCustJob = abssCustJob;
	}

	public String getAbssCustSeq() {
		return this.abssCustSeq;
	}

	public void setAbssCustSeq(String abssCustSeq) {
		this.abssCustSeq = abssCustSeq;
	}

	public String getAbssPart() {
		return this.abssPart;
	}

	public void setAbssPart(String abssPart) {
		this.abssPart = abssPart;
	}

	public Date getAbssDate() {
		return this.abssDate;
	}

	public void setAbssDate(Date abssDate) {
		this.abssDate = abssDate;
	}

	public String getAbssTime() {
		return this.abssTime;
	}

	public void setAbssTime(String abssTime) {
		this.abssTime = abssTime;
	}

	public String getAbssCustRef() {
		return this.abssCustRef;
	}

	public void setAbssCustRef(String abssCustRef) {
		this.abssCustRef = abssCustRef;
	}

	public String getAbssDock() {
		return this.abssDock;
	}

	public void setAbssDock(String abssDock) {
		this.abssDock = abssDock;
	}

	public String getAbssLineFeed() {
		return this.abssLineFeed;
	}

	public void setAbssLineFeed(String abssLineFeed) {
		this.abssLineFeed = abssLineFeed;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAbssDetId))
			return false;
		AbstractAbssDetId castOther = (AbstractAbssDetId) other;

		return ((this.getAbssDomain() == castOther.getAbssDomain()) || (this
				.getAbssDomain() != null
				&& castOther.getAbssDomain() != null && this.getAbssDomain()
				.equals(castOther.getAbssDomain())))
				&& ((this.getAbssAbsId() == castOther.getAbssAbsId()) || (this
						.getAbssAbsId() != null
						&& castOther.getAbssAbsId() != null && this
						.getAbssAbsId().equals(castOther.getAbssAbsId())))
				&& ((this.getAbssShipfrom() == castOther.getAbssShipfrom()) || (this
						.getAbssShipfrom() != null
						&& castOther.getAbssShipfrom() != null && this
						.getAbssShipfrom().equals(castOther.getAbssShipfrom())))
				&& ((this.getAbssShipto() == castOther.getAbssShipto()) || (this
						.getAbssShipto() != null
						&& castOther.getAbssShipto() != null && this
						.getAbssShipto().equals(castOther.getAbssShipto())))
				&& ((this.getAbssRlseId() == castOther.getAbssRlseId()) || (this
						.getAbssRlseId() != null
						&& castOther.getAbssRlseId() != null && this
						.getAbssRlseId().equals(castOther.getAbssRlseId())))
				&& ((this.getAbssCustJob() == castOther.getAbssCustJob()) || (this
						.getAbssCustJob() != null
						&& castOther.getAbssCustJob() != null && this
						.getAbssCustJob().equals(castOther.getAbssCustJob())))
				&& ((this.getAbssCustSeq() == castOther.getAbssCustSeq()) || (this
						.getAbssCustSeq() != null
						&& castOther.getAbssCustSeq() != null && this
						.getAbssCustSeq().equals(castOther.getAbssCustSeq())))
				&& ((this.getAbssPart() == castOther.getAbssPart()) || (this
						.getAbssPart() != null
						&& castOther.getAbssPart() != null && this
						.getAbssPart().equals(castOther.getAbssPart())))
				&& ((this.getAbssDate() == castOther.getAbssDate()) || (this
						.getAbssDate() != null
						&& castOther.getAbssDate() != null && this
						.getAbssDate().equals(castOther.getAbssDate())))
				&& ((this.getAbssTime() == castOther.getAbssTime()) || (this
						.getAbssTime() != null
						&& castOther.getAbssTime() != null && this
						.getAbssTime().equals(castOther.getAbssTime())))
				&& ((this.getAbssCustRef() == castOther.getAbssCustRef()) || (this
						.getAbssCustRef() != null
						&& castOther.getAbssCustRef() != null && this
						.getAbssCustRef().equals(castOther.getAbssCustRef())))
				&& ((this.getAbssDock() == castOther.getAbssDock()) || (this
						.getAbssDock() != null
						&& castOther.getAbssDock() != null && this
						.getAbssDock().equals(castOther.getAbssDock())))
				&& ((this.getAbssLineFeed() == castOther.getAbssLineFeed()) || (this
						.getAbssLineFeed() != null
						&& castOther.getAbssLineFeed() != null && this
						.getAbssLineFeed().equals(castOther.getAbssLineFeed())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAbssDomain() == null ? 0 : this.getAbssDomain()
						.hashCode());
		result = 37 * result
				+ (getAbssAbsId() == null ? 0 : this.getAbssAbsId().hashCode());
		result = 37
				* result
				+ (getAbssShipfrom() == null ? 0 : this.getAbssShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getAbssShipto() == null ? 0 : this.getAbssShipto()
						.hashCode());
		result = 37
				* result
				+ (getAbssRlseId() == null ? 0 : this.getAbssRlseId()
						.hashCode());
		result = 37
				* result
				+ (getAbssCustJob() == null ? 0 : this.getAbssCustJob()
						.hashCode());
		result = 37
				* result
				+ (getAbssCustSeq() == null ? 0 : this.getAbssCustSeq()
						.hashCode());
		result = 37 * result
				+ (getAbssPart() == null ? 0 : this.getAbssPart().hashCode());
		result = 37 * result
				+ (getAbssDate() == null ? 0 : this.getAbssDate().hashCode());
		result = 37 * result
				+ (getAbssTime() == null ? 0 : this.getAbssTime().hashCode());
		result = 37
				* result
				+ (getAbssCustRef() == null ? 0 : this.getAbssCustRef()
						.hashCode());
		result = 37 * result
				+ (getAbssDock() == null ? 0 : this.getAbssDock().hashCode());
		result = 37
				* result
				+ (getAbssLineFeed() == null ? 0 : this.getAbssLineFeed()
						.hashCode());
		return result;
	}

}