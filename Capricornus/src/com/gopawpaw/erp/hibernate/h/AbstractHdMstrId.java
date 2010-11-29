package com.gopawpaw.erp.hibernate.h;

import java.util.Date;

/**
 * AbstractHdMstrId entity provides the base persistence definition of the
 * HdMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHdMstrId implements java.io.Serializable {

	// Fields

	private String hdDomain;
	private String hdSite;
	private Date hdDate;

	// Constructors

	/** default constructor */
	public AbstractHdMstrId() {
	}

	/** minimal constructor */
	public AbstractHdMstrId(String hdDomain, Date hdDate) {
		this.hdDomain = hdDomain;
		this.hdDate = hdDate;
	}

	/** full constructor */
	public AbstractHdMstrId(String hdDomain, String hdSite, Date hdDate) {
		this.hdDomain = hdDomain;
		this.hdSite = hdSite;
		this.hdDate = hdDate;
	}

	// Property accessors

	public String getHdDomain() {
		return this.hdDomain;
	}

	public void setHdDomain(String hdDomain) {
		this.hdDomain = hdDomain;
	}

	public String getHdSite() {
		return this.hdSite;
	}

	public void setHdSite(String hdSite) {
		this.hdSite = hdSite;
	}

	public Date getHdDate() {
		return this.hdDate;
	}

	public void setHdDate(Date hdDate) {
		this.hdDate = hdDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHdMstrId))
			return false;
		AbstractHdMstrId castOther = (AbstractHdMstrId) other;

		return ((this.getHdDomain() == castOther.getHdDomain()) || (this
				.getHdDomain() != null
				&& castOther.getHdDomain() != null && this.getHdDomain()
				.equals(castOther.getHdDomain())))
				&& ((this.getHdSite() == castOther.getHdSite()) || (this
						.getHdSite() != null
						&& castOther.getHdSite() != null && this.getHdSite()
						.equals(castOther.getHdSite())))
				&& ((this.getHdDate() == castOther.getHdDate()) || (this
						.getHdDate() != null
						&& castOther.getHdDate() != null && this.getHdDate()
						.equals(castOther.getHdDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getHdDomain() == null ? 0 : this.getHdDomain().hashCode());
		result = 37 * result
				+ (getHdSite() == null ? 0 : this.getHdSite().hashCode());
		result = 37 * result
				+ (getHdDate() == null ? 0 : this.getHdDate().hashCode());
		return result;
	}

}