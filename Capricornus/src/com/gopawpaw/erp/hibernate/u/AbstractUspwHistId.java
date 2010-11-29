package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUspwHistId entity provides the base persistence definition of the
 * UspwHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUspwHistId implements java.io.Serializable {

	// Fields

	private String uspwUserid;
	private Date uspwDate;
	private Integer uspwTime;

	// Constructors

	/** default constructor */
	public AbstractUspwHistId() {
	}

	/** full constructor */
	public AbstractUspwHistId(String uspwUserid, Date uspwDate, Integer uspwTime) {
		this.uspwUserid = uspwUserid;
		this.uspwDate = uspwDate;
		this.uspwTime = uspwTime;
	}

	// Property accessors

	public String getUspwUserid() {
		return this.uspwUserid;
	}

	public void setUspwUserid(String uspwUserid) {
		this.uspwUserid = uspwUserid;
	}

	public Date getUspwDate() {
		return this.uspwDate;
	}

	public void setUspwDate(Date uspwDate) {
		this.uspwDate = uspwDate;
	}

	public Integer getUspwTime() {
		return this.uspwTime;
	}

	public void setUspwTime(Integer uspwTime) {
		this.uspwTime = uspwTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUspwHistId))
			return false;
		AbstractUspwHistId castOther = (AbstractUspwHistId) other;

		return ((this.getUspwUserid() == castOther.getUspwUserid()) || (this
				.getUspwUserid() != null
				&& castOther.getUspwUserid() != null && this.getUspwUserid()
				.equals(castOther.getUspwUserid())))
				&& ((this.getUspwDate() == castOther.getUspwDate()) || (this
						.getUspwDate() != null
						&& castOther.getUspwDate() != null && this
						.getUspwDate().equals(castOther.getUspwDate())))
				&& ((this.getUspwTime() == castOther.getUspwTime()) || (this
						.getUspwTime() != null
						&& castOther.getUspwTime() != null && this
						.getUspwTime().equals(castOther.getUspwTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getUspwUserid() == null ? 0 : this.getUspwUserid()
						.hashCode());
		result = 37 * result
				+ (getUspwDate() == null ? 0 : this.getUspwDate().hashCode());
		result = 37 * result
				+ (getUspwTime() == null ? 0 : this.getUspwTime().hashCode());
		return result;
	}

}