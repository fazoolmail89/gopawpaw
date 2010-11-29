package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlrdDetId entity provides the base persistence definition of the
 * WlrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlrdDetId implements java.io.Serializable {

	// Fields

	private String wlrdDomain;
	private String wlrdRouting;
	private Date wlrdStart;
	private Integer wlrdOp;

	// Constructors

	/** default constructor */
	public AbstractWlrdDetId() {
	}

	/** minimal constructor */
	public AbstractWlrdDetId(String wlrdDomain) {
		this.wlrdDomain = wlrdDomain;
	}

	/** full constructor */
	public AbstractWlrdDetId(String wlrdDomain, String wlrdRouting,
			Date wlrdStart, Integer wlrdOp) {
		this.wlrdDomain = wlrdDomain;
		this.wlrdRouting = wlrdRouting;
		this.wlrdStart = wlrdStart;
		this.wlrdOp = wlrdOp;
	}

	// Property accessors

	public String getWlrdDomain() {
		return this.wlrdDomain;
	}

	public void setWlrdDomain(String wlrdDomain) {
		this.wlrdDomain = wlrdDomain;
	}

	public String getWlrdRouting() {
		return this.wlrdRouting;
	}

	public void setWlrdRouting(String wlrdRouting) {
		this.wlrdRouting = wlrdRouting;
	}

	public Date getWlrdStart() {
		return this.wlrdStart;
	}

	public void setWlrdStart(Date wlrdStart) {
		this.wlrdStart = wlrdStart;
	}

	public Integer getWlrdOp() {
		return this.wlrdOp;
	}

	public void setWlrdOp(Integer wlrdOp) {
		this.wlrdOp = wlrdOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWlrdDetId))
			return false;
		AbstractWlrdDetId castOther = (AbstractWlrdDetId) other;

		return ((this.getWlrdDomain() == castOther.getWlrdDomain()) || (this
				.getWlrdDomain() != null
				&& castOther.getWlrdDomain() != null && this.getWlrdDomain()
				.equals(castOther.getWlrdDomain())))
				&& ((this.getWlrdRouting() == castOther.getWlrdRouting()) || (this
						.getWlrdRouting() != null
						&& castOther.getWlrdRouting() != null && this
						.getWlrdRouting().equals(castOther.getWlrdRouting())))
				&& ((this.getWlrdStart() == castOther.getWlrdStart()) || (this
						.getWlrdStart() != null
						&& castOther.getWlrdStart() != null && this
						.getWlrdStart().equals(castOther.getWlrdStart())))
				&& ((this.getWlrdOp() == castOther.getWlrdOp()) || (this
						.getWlrdOp() != null
						&& castOther.getWlrdOp() != null && this.getWlrdOp()
						.equals(castOther.getWlrdOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getWlrdDomain() == null ? 0 : this.getWlrdDomain()
						.hashCode());
		result = 37
				* result
				+ (getWlrdRouting() == null ? 0 : this.getWlrdRouting()
						.hashCode());
		result = 37 * result
				+ (getWlrdStart() == null ? 0 : this.getWlrdStart().hashCode());
		result = 37 * result
				+ (getWlrdOp() == null ? 0 : this.getWlrdOp().hashCode());
		return result;
	}

}