package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPtaDetId entity provides the base persistence definition of the
 * PtaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtaDetId implements java.io.Serializable {

	// Fields

	private String ptaDomain;
	private String ptaItem;
	private String ptaAssocType;
	private String ptaUm;
	private String ptaAssocItem;
	private String ptaCurr;
	private Date ptaStart;

	// Constructors

	/** default constructor */
	public AbstractPtaDetId() {
	}

	/** minimal constructor */
	public AbstractPtaDetId(String ptaDomain) {
		this.ptaDomain = ptaDomain;
	}

	/** full constructor */
	public AbstractPtaDetId(String ptaDomain, String ptaItem,
			String ptaAssocType, String ptaUm, String ptaAssocItem,
			String ptaCurr, Date ptaStart) {
		this.ptaDomain = ptaDomain;
		this.ptaItem = ptaItem;
		this.ptaAssocType = ptaAssocType;
		this.ptaUm = ptaUm;
		this.ptaAssocItem = ptaAssocItem;
		this.ptaCurr = ptaCurr;
		this.ptaStart = ptaStart;
	}

	// Property accessors

	public String getPtaDomain() {
		return this.ptaDomain;
	}

	public void setPtaDomain(String ptaDomain) {
		this.ptaDomain = ptaDomain;
	}

	public String getPtaItem() {
		return this.ptaItem;
	}

	public void setPtaItem(String ptaItem) {
		this.ptaItem = ptaItem;
	}

	public String getPtaAssocType() {
		return this.ptaAssocType;
	}

	public void setPtaAssocType(String ptaAssocType) {
		this.ptaAssocType = ptaAssocType;
	}

	public String getPtaUm() {
		return this.ptaUm;
	}

	public void setPtaUm(String ptaUm) {
		this.ptaUm = ptaUm;
	}

	public String getPtaAssocItem() {
		return this.ptaAssocItem;
	}

	public void setPtaAssocItem(String ptaAssocItem) {
		this.ptaAssocItem = ptaAssocItem;
	}

	public String getPtaCurr() {
		return this.ptaCurr;
	}

	public void setPtaCurr(String ptaCurr) {
		this.ptaCurr = ptaCurr;
	}

	public Date getPtaStart() {
		return this.ptaStart;
	}

	public void setPtaStart(Date ptaStart) {
		this.ptaStart = ptaStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtaDetId))
			return false;
		AbstractPtaDetId castOther = (AbstractPtaDetId) other;

		return ((this.getPtaDomain() == castOther.getPtaDomain()) || (this
				.getPtaDomain() != null
				&& castOther.getPtaDomain() != null && this.getPtaDomain()
				.equals(castOther.getPtaDomain())))
				&& ((this.getPtaItem() == castOther.getPtaItem()) || (this
						.getPtaItem() != null
						&& castOther.getPtaItem() != null && this.getPtaItem()
						.equals(castOther.getPtaItem())))
				&& ((this.getPtaAssocType() == castOther.getPtaAssocType()) || (this
						.getPtaAssocType() != null
						&& castOther.getPtaAssocType() != null && this
						.getPtaAssocType().equals(castOther.getPtaAssocType())))
				&& ((this.getPtaUm() == castOther.getPtaUm()) || (this
						.getPtaUm() != null
						&& castOther.getPtaUm() != null && this.getPtaUm()
						.equals(castOther.getPtaUm())))
				&& ((this.getPtaAssocItem() == castOther.getPtaAssocItem()) || (this
						.getPtaAssocItem() != null
						&& castOther.getPtaAssocItem() != null && this
						.getPtaAssocItem().equals(castOther.getPtaAssocItem())))
				&& ((this.getPtaCurr() == castOther.getPtaCurr()) || (this
						.getPtaCurr() != null
						&& castOther.getPtaCurr() != null && this.getPtaCurr()
						.equals(castOther.getPtaCurr())))
				&& ((this.getPtaStart() == castOther.getPtaStart()) || (this
						.getPtaStart() != null
						&& castOther.getPtaStart() != null && this
						.getPtaStart().equals(castOther.getPtaStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtaDomain() == null ? 0 : this.getPtaDomain().hashCode());
		result = 37 * result
				+ (getPtaItem() == null ? 0 : this.getPtaItem().hashCode());
		result = 37
				* result
				+ (getPtaAssocType() == null ? 0 : this.getPtaAssocType()
						.hashCode());
		result = 37 * result
				+ (getPtaUm() == null ? 0 : this.getPtaUm().hashCode());
		result = 37
				* result
				+ (getPtaAssocItem() == null ? 0 : this.getPtaAssocItem()
						.hashCode());
		result = 37 * result
				+ (getPtaCurr() == null ? 0 : this.getPtaCurr().hashCode());
		result = 37 * result
				+ (getPtaStart() == null ? 0 : this.getPtaStart().hashCode());
		return result;
	}

}