package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlrmMstrId entity provides the base persistence definition of the
 * WlrmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlrmMstrId implements java.io.Serializable {

	// Fields

	private String wlrmDomain;
	private String wlrmRouting;
	private Date wlrmStart;

	// Constructors

	/** default constructor */
	public AbstractWlrmMstrId() {
	}

	/** minimal constructor */
	public AbstractWlrmMstrId(String wlrmDomain) {
		this.wlrmDomain = wlrmDomain;
	}

	/** full constructor */
	public AbstractWlrmMstrId(String wlrmDomain, String wlrmRouting,
			Date wlrmStart) {
		this.wlrmDomain = wlrmDomain;
		this.wlrmRouting = wlrmRouting;
		this.wlrmStart = wlrmStart;
	}

	// Property accessors

	public String getWlrmDomain() {
		return this.wlrmDomain;
	}

	public void setWlrmDomain(String wlrmDomain) {
		this.wlrmDomain = wlrmDomain;
	}

	public String getWlrmRouting() {
		return this.wlrmRouting;
	}

	public void setWlrmRouting(String wlrmRouting) {
		this.wlrmRouting = wlrmRouting;
	}

	public Date getWlrmStart() {
		return this.wlrmStart;
	}

	public void setWlrmStart(Date wlrmStart) {
		this.wlrmStart = wlrmStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWlrmMstrId))
			return false;
		AbstractWlrmMstrId castOther = (AbstractWlrmMstrId) other;

		return ((this.getWlrmDomain() == castOther.getWlrmDomain()) || (this
				.getWlrmDomain() != null
				&& castOther.getWlrmDomain() != null && this.getWlrmDomain()
				.equals(castOther.getWlrmDomain())))
				&& ((this.getWlrmRouting() == castOther.getWlrmRouting()) || (this
						.getWlrmRouting() != null
						&& castOther.getWlrmRouting() != null && this
						.getWlrmRouting().equals(castOther.getWlrmRouting())))
				&& ((this.getWlrmStart() == castOther.getWlrmStart()) || (this
						.getWlrmStart() != null
						&& castOther.getWlrmStart() != null && this
						.getWlrmStart().equals(castOther.getWlrmStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getWlrmDomain() == null ? 0 : this.getWlrmDomain()
						.hashCode());
		result = 37
				* result
				+ (getWlrmRouting() == null ? 0 : this.getWlrmRouting()
						.hashCode());
		result = 37 * result
				+ (getWlrmStart() == null ? 0 : this.getWlrmStart().hashCode());
		return result;
	}

}