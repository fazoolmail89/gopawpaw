package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPtrDetId entity provides the base persistence definition of the
 * PtrDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtrDetId implements java.io.Serializable {

	// Fields

	private String ptrDomain;
	private String ptrPart;
	private String ptrSite;
	private String ptrRouting;
	private String ptrBomCode;
	private Date ptrStart;

	// Constructors

	/** default constructor */
	public AbstractPtrDetId() {
	}

	/** minimal constructor */
	public AbstractPtrDetId(String ptrDomain, String ptrPart) {
		this.ptrDomain = ptrDomain;
		this.ptrPart = ptrPart;
	}

	/** full constructor */
	public AbstractPtrDetId(String ptrDomain, String ptrPart, String ptrSite,
			String ptrRouting, String ptrBomCode, Date ptrStart) {
		this.ptrDomain = ptrDomain;
		this.ptrPart = ptrPart;
		this.ptrSite = ptrSite;
		this.ptrRouting = ptrRouting;
		this.ptrBomCode = ptrBomCode;
		this.ptrStart = ptrStart;
	}

	// Property accessors

	public String getPtrDomain() {
		return this.ptrDomain;
	}

	public void setPtrDomain(String ptrDomain) {
		this.ptrDomain = ptrDomain;
	}

	public String getPtrPart() {
		return this.ptrPart;
	}

	public void setPtrPart(String ptrPart) {
		this.ptrPart = ptrPart;
	}

	public String getPtrSite() {
		return this.ptrSite;
	}

	public void setPtrSite(String ptrSite) {
		this.ptrSite = ptrSite;
	}

	public String getPtrRouting() {
		return this.ptrRouting;
	}

	public void setPtrRouting(String ptrRouting) {
		this.ptrRouting = ptrRouting;
	}

	public String getPtrBomCode() {
		return this.ptrBomCode;
	}

	public void setPtrBomCode(String ptrBomCode) {
		this.ptrBomCode = ptrBomCode;
	}

	public Date getPtrStart() {
		return this.ptrStart;
	}

	public void setPtrStart(Date ptrStart) {
		this.ptrStart = ptrStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtrDetId))
			return false;
		AbstractPtrDetId castOther = (AbstractPtrDetId) other;

		return ((this.getPtrDomain() == castOther.getPtrDomain()) || (this
				.getPtrDomain() != null
				&& castOther.getPtrDomain() != null && this.getPtrDomain()
				.equals(castOther.getPtrDomain())))
				&& ((this.getPtrPart() == castOther.getPtrPart()) || (this
						.getPtrPart() != null
						&& castOther.getPtrPart() != null && this.getPtrPart()
						.equals(castOther.getPtrPart())))
				&& ((this.getPtrSite() == castOther.getPtrSite()) || (this
						.getPtrSite() != null
						&& castOther.getPtrSite() != null && this.getPtrSite()
						.equals(castOther.getPtrSite())))
				&& ((this.getPtrRouting() == castOther.getPtrRouting()) || (this
						.getPtrRouting() != null
						&& castOther.getPtrRouting() != null && this
						.getPtrRouting().equals(castOther.getPtrRouting())))
				&& ((this.getPtrBomCode() == castOther.getPtrBomCode()) || (this
						.getPtrBomCode() != null
						&& castOther.getPtrBomCode() != null && this
						.getPtrBomCode().equals(castOther.getPtrBomCode())))
				&& ((this.getPtrStart() == castOther.getPtrStart()) || (this
						.getPtrStart() != null
						&& castOther.getPtrStart() != null && this
						.getPtrStart().equals(castOther.getPtrStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtrDomain() == null ? 0 : this.getPtrDomain().hashCode());
		result = 37 * result
				+ (getPtrPart() == null ? 0 : this.getPtrPart().hashCode());
		result = 37 * result
				+ (getPtrSite() == null ? 0 : this.getPtrSite().hashCode());
		result = 37
				* result
				+ (getPtrRouting() == null ? 0 : this.getPtrRouting()
						.hashCode());
		result = 37
				* result
				+ (getPtrBomCode() == null ? 0 : this.getPtrBomCode()
						.hashCode());
		result = 37 * result
				+ (getPtrStart() == null ? 0 : this.getPtrStart().hashCode());
		return result;
	}

}