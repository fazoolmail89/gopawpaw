package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCalDetId entity provides the base persistence definition of the
 * CalDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCalDetId implements java.io.Serializable {

	// Fields

	private String calDomain;
	private String calSite;
	private String calWkctr;
	private String calMch;
	private String calRef;
	private Date calStart;

	// Constructors

	/** default constructor */
	public AbstractCalDetId() {
	}

	/** minimal constructor */
	public AbstractCalDetId(String calDomain) {
		this.calDomain = calDomain;
	}

	/** full constructor */
	public AbstractCalDetId(String calDomain, String calSite, String calWkctr,
			String calMch, String calRef, Date calStart) {
		this.calDomain = calDomain;
		this.calSite = calSite;
		this.calWkctr = calWkctr;
		this.calMch = calMch;
		this.calRef = calRef;
		this.calStart = calStart;
	}

	// Property accessors

	public String getCalDomain() {
		return this.calDomain;
	}

	public void setCalDomain(String calDomain) {
		this.calDomain = calDomain;
	}

	public String getCalSite() {
		return this.calSite;
	}

	public void setCalSite(String calSite) {
		this.calSite = calSite;
	}

	public String getCalWkctr() {
		return this.calWkctr;
	}

	public void setCalWkctr(String calWkctr) {
		this.calWkctr = calWkctr;
	}

	public String getCalMch() {
		return this.calMch;
	}

	public void setCalMch(String calMch) {
		this.calMch = calMch;
	}

	public String getCalRef() {
		return this.calRef;
	}

	public void setCalRef(String calRef) {
		this.calRef = calRef;
	}

	public Date getCalStart() {
		return this.calStart;
	}

	public void setCalStart(Date calStart) {
		this.calStart = calStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCalDetId))
			return false;
		AbstractCalDetId castOther = (AbstractCalDetId) other;

		return ((this.getCalDomain() == castOther.getCalDomain()) || (this
				.getCalDomain() != null
				&& castOther.getCalDomain() != null && this.getCalDomain()
				.equals(castOther.getCalDomain())))
				&& ((this.getCalSite() == castOther.getCalSite()) || (this
						.getCalSite() != null
						&& castOther.getCalSite() != null && this.getCalSite()
						.equals(castOther.getCalSite())))
				&& ((this.getCalWkctr() == castOther.getCalWkctr()) || (this
						.getCalWkctr() != null
						&& castOther.getCalWkctr() != null && this
						.getCalWkctr().equals(castOther.getCalWkctr())))
				&& ((this.getCalMch() == castOther.getCalMch()) || (this
						.getCalMch() != null
						&& castOther.getCalMch() != null && this.getCalMch()
						.equals(castOther.getCalMch())))
				&& ((this.getCalRef() == castOther.getCalRef()) || (this
						.getCalRef() != null
						&& castOther.getCalRef() != null && this.getCalRef()
						.equals(castOther.getCalRef())))
				&& ((this.getCalStart() == castOther.getCalStart()) || (this
						.getCalStart() != null
						&& castOther.getCalStart() != null && this
						.getCalStart().equals(castOther.getCalStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCalDomain() == null ? 0 : this.getCalDomain().hashCode());
		result = 37 * result
				+ (getCalSite() == null ? 0 : this.getCalSite().hashCode());
		result = 37 * result
				+ (getCalWkctr() == null ? 0 : this.getCalWkctr().hashCode());
		result = 37 * result
				+ (getCalMch() == null ? 0 : this.getCalMch().hashCode());
		result = 37 * result
				+ (getCalRef() == null ? 0 : this.getCalRef().hashCode());
		result = 37 * result
				+ (getCalStart() == null ? 0 : this.getCalStart().hashCode());
		return result;
	}

}