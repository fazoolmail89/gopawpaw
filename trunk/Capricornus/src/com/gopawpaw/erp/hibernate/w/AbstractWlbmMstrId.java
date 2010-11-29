package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWlbmMstrId entity provides the base persistence definition of the
 * WlbmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWlbmMstrId implements java.io.Serializable {

	// Fields

	private String wlbmDomain;
	private String wlbmBomCode;
	private Date wlbmStart;

	// Constructors

	/** default constructor */
	public AbstractWlbmMstrId() {
	}

	/** minimal constructor */
	public AbstractWlbmMstrId(String wlbmDomain) {
		this.wlbmDomain = wlbmDomain;
	}

	/** full constructor */
	public AbstractWlbmMstrId(String wlbmDomain, String wlbmBomCode,
			Date wlbmStart) {
		this.wlbmDomain = wlbmDomain;
		this.wlbmBomCode = wlbmBomCode;
		this.wlbmStart = wlbmStart;
	}

	// Property accessors

	public String getWlbmDomain() {
		return this.wlbmDomain;
	}

	public void setWlbmDomain(String wlbmDomain) {
		this.wlbmDomain = wlbmDomain;
	}

	public String getWlbmBomCode() {
		return this.wlbmBomCode;
	}

	public void setWlbmBomCode(String wlbmBomCode) {
		this.wlbmBomCode = wlbmBomCode;
	}

	public Date getWlbmStart() {
		return this.wlbmStart;
	}

	public void setWlbmStart(Date wlbmStart) {
		this.wlbmStart = wlbmStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWlbmMstrId))
			return false;
		AbstractWlbmMstrId castOther = (AbstractWlbmMstrId) other;

		return ((this.getWlbmDomain() == castOther.getWlbmDomain()) || (this
				.getWlbmDomain() != null
				&& castOther.getWlbmDomain() != null && this.getWlbmDomain()
				.equals(castOther.getWlbmDomain())))
				&& ((this.getWlbmBomCode() == castOther.getWlbmBomCode()) || (this
						.getWlbmBomCode() != null
						&& castOther.getWlbmBomCode() != null && this
						.getWlbmBomCode().equals(castOther.getWlbmBomCode())))
				&& ((this.getWlbmStart() == castOther.getWlbmStart()) || (this
						.getWlbmStart() != null
						&& castOther.getWlbmStart() != null && this
						.getWlbmStart().equals(castOther.getWlbmStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getWlbmDomain() == null ? 0 : this.getWlbmDomain()
						.hashCode());
		result = 37
				* result
				+ (getWlbmBomCode() == null ? 0 : this.getWlbmBomCode()
						.hashCode());
		result = 37 * result
				+ (getWlbmStart() == null ? 0 : this.getWlbmStart().hashCode());
		return result;
	}

}