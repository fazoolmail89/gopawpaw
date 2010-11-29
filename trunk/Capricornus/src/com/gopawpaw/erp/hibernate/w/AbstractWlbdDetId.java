package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlbdDetId entity provides the base persistence definition of the
 * WlbdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlbdDetId implements java.io.Serializable {

	// Fields

	private String wlbdDomain;
	private String wlbdBomCode;
	private Date wlbdStart;
	private String wlbdComp;

	// Constructors

	/** default constructor */
	public AbstractWlbdDetId() {
	}

	/** minimal constructor */
	public AbstractWlbdDetId(String wlbdDomain) {
		this.wlbdDomain = wlbdDomain;
	}

	/** full constructor */
	public AbstractWlbdDetId(String wlbdDomain, String wlbdBomCode,
			Date wlbdStart, String wlbdComp) {
		this.wlbdDomain = wlbdDomain;
		this.wlbdBomCode = wlbdBomCode;
		this.wlbdStart = wlbdStart;
		this.wlbdComp = wlbdComp;
	}

	// Property accessors

	public String getWlbdDomain() {
		return this.wlbdDomain;
	}

	public void setWlbdDomain(String wlbdDomain) {
		this.wlbdDomain = wlbdDomain;
	}

	public String getWlbdBomCode() {
		return this.wlbdBomCode;
	}

	public void setWlbdBomCode(String wlbdBomCode) {
		this.wlbdBomCode = wlbdBomCode;
	}

	public Date getWlbdStart() {
		return this.wlbdStart;
	}

	public void setWlbdStart(Date wlbdStart) {
		this.wlbdStart = wlbdStart;
	}

	public String getWlbdComp() {
		return this.wlbdComp;
	}

	public void setWlbdComp(String wlbdComp) {
		this.wlbdComp = wlbdComp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWlbdDetId))
			return false;
		AbstractWlbdDetId castOther = (AbstractWlbdDetId) other;

		return ((this.getWlbdDomain() == castOther.getWlbdDomain()) || (this
				.getWlbdDomain() != null
				&& castOther.getWlbdDomain() != null && this.getWlbdDomain()
				.equals(castOther.getWlbdDomain())))
				&& ((this.getWlbdBomCode() == castOther.getWlbdBomCode()) || (this
						.getWlbdBomCode() != null
						&& castOther.getWlbdBomCode() != null && this
						.getWlbdBomCode().equals(castOther.getWlbdBomCode())))
				&& ((this.getWlbdStart() == castOther.getWlbdStart()) || (this
						.getWlbdStart() != null
						&& castOther.getWlbdStart() != null && this
						.getWlbdStart().equals(castOther.getWlbdStart())))
				&& ((this.getWlbdComp() == castOther.getWlbdComp()) || (this
						.getWlbdComp() != null
						&& castOther.getWlbdComp() != null && this
						.getWlbdComp().equals(castOther.getWlbdComp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getWlbdDomain() == null ? 0 : this.getWlbdDomain()
						.hashCode());
		result = 37
				* result
				+ (getWlbdBomCode() == null ? 0 : this.getWlbdBomCode()
						.hashCode());
		result = 37 * result
				+ (getWlbdStart() == null ? 0 : this.getWlbdStart().hashCode());
		result = 37 * result
				+ (getWlbdComp() == null ? 0 : this.getWlbdComp().hashCode());
		return result;
	}

}