package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVtMstrId entity provides the base persistence definition of the
 * VtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVtMstrId implements java.io.Serializable {

	// Fields

	private String vtClass;
	private Date vtStart;

	// Constructors

	/** default constructor */
	public AbstractVtMstrId() {
	}

	/** full constructor */
	public AbstractVtMstrId(String vtClass, Date vtStart) {
		this.vtClass = vtClass;
		this.vtStart = vtStart;
	}

	// Property accessors

	public String getVtClass() {
		return this.vtClass;
	}

	public void setVtClass(String vtClass) {
		this.vtClass = vtClass;
	}

	public Date getVtStart() {
		return this.vtStart;
	}

	public void setVtStart(Date vtStart) {
		this.vtStart = vtStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVtMstrId))
			return false;
		AbstractVtMstrId castOther = (AbstractVtMstrId) other;

		return ((this.getVtClass() == castOther.getVtClass()) || (this
				.getVtClass() != null
				&& castOther.getVtClass() != null && this.getVtClass().equals(
				castOther.getVtClass())))
				&& ((this.getVtStart() == castOther.getVtStart()) || (this
						.getVtStart() != null
						&& castOther.getVtStart() != null && this.getVtStart()
						.equals(castOther.getVtStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVtClass() == null ? 0 : this.getVtClass().hashCode());
		result = 37 * result
				+ (getVtStart() == null ? 0 : this.getVtStart().hashCode());
		return result;
	}

}