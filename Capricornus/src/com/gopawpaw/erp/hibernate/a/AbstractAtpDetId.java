package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtpDetId entity provides the base persistence definition of the
 * AtpDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtpDetId implements java.io.Serializable {

	// Fields

	private String atpDomain;
	private String atpPart;
	private String atpSite;
	private Date atpDate;
	private Integer atpIdNum;

	// Constructors

	/** default constructor */
	public AbstractAtpDetId() {
	}

	/** minimal constructor */
	public AbstractAtpDetId(String atpDomain, String atpPart) {
		this.atpDomain = atpDomain;
		this.atpPart = atpPart;
	}

	/** full constructor */
	public AbstractAtpDetId(String atpDomain, String atpPart, String atpSite,
			Date atpDate, Integer atpIdNum) {
		this.atpDomain = atpDomain;
		this.atpPart = atpPart;
		this.atpSite = atpSite;
		this.atpDate = atpDate;
		this.atpIdNum = atpIdNum;
	}

	// Property accessors

	public String getAtpDomain() {
		return this.atpDomain;
	}

	public void setAtpDomain(String atpDomain) {
		this.atpDomain = atpDomain;
	}

	public String getAtpPart() {
		return this.atpPart;
	}

	public void setAtpPart(String atpPart) {
		this.atpPart = atpPart;
	}

	public String getAtpSite() {
		return this.atpSite;
	}

	public void setAtpSite(String atpSite) {
		this.atpSite = atpSite;
	}

	public Date getAtpDate() {
		return this.atpDate;
	}

	public void setAtpDate(Date atpDate) {
		this.atpDate = atpDate;
	}

	public Integer getAtpIdNum() {
		return this.atpIdNum;
	}

	public void setAtpIdNum(Integer atpIdNum) {
		this.atpIdNum = atpIdNum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtpDetId))
			return false;
		AbstractAtpDetId castOther = (AbstractAtpDetId) other;

		return ((this.getAtpDomain() == castOther.getAtpDomain()) || (this
				.getAtpDomain() != null
				&& castOther.getAtpDomain() != null && this.getAtpDomain()
				.equals(castOther.getAtpDomain())))
				&& ((this.getAtpPart() == castOther.getAtpPart()) || (this
						.getAtpPart() != null
						&& castOther.getAtpPart() != null && this.getAtpPart()
						.equals(castOther.getAtpPart())))
				&& ((this.getAtpSite() == castOther.getAtpSite()) || (this
						.getAtpSite() != null
						&& castOther.getAtpSite() != null && this.getAtpSite()
						.equals(castOther.getAtpSite())))
				&& ((this.getAtpDate() == castOther.getAtpDate()) || (this
						.getAtpDate() != null
						&& castOther.getAtpDate() != null && this.getAtpDate()
						.equals(castOther.getAtpDate())))
				&& ((this.getAtpIdNum() == castOther.getAtpIdNum()) || (this
						.getAtpIdNum() != null
						&& castOther.getAtpIdNum() != null && this
						.getAtpIdNum().equals(castOther.getAtpIdNum())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAtpDomain() == null ? 0 : this.getAtpDomain().hashCode());
		result = 37 * result
				+ (getAtpPart() == null ? 0 : this.getAtpPart().hashCode());
		result = 37 * result
				+ (getAtpSite() == null ? 0 : this.getAtpSite().hashCode());
		result = 37 * result
				+ (getAtpDate() == null ? 0 : this.getAtpDate().hashCode());
		result = 37 * result
				+ (getAtpIdNum() == null ? 0 : this.getAtpIdNum().hashCode());
		return result;
	}

}