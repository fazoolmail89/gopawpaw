package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtapMstrId entity provides the base persistence definition of the
 * AtapMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtapMstrId implements java.io.Serializable {

	// Fields

	private Double oidAttMstr;
	private Date atapBeginDate;

	// Constructors

	/** default constructor */
	public AbstractAtapMstrId() {
	}

	/** full constructor */
	public AbstractAtapMstrId(Double oidAttMstr, Date atapBeginDate) {
		this.oidAttMstr = oidAttMstr;
		this.atapBeginDate = atapBeginDate;
	}

	// Property accessors

	public Double getOidAttMstr() {
		return this.oidAttMstr;
	}

	public void setOidAttMstr(Double oidAttMstr) {
		this.oidAttMstr = oidAttMstr;
	}

	public Date getAtapBeginDate() {
		return this.atapBeginDate;
	}

	public void setAtapBeginDate(Date atapBeginDate) {
		this.atapBeginDate = atapBeginDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtapMstrId))
			return false;
		AbstractAtapMstrId castOther = (AbstractAtapMstrId) other;

		return ((this.getOidAttMstr() == castOther.getOidAttMstr()) || (this
				.getOidAttMstr() != null
				&& castOther.getOidAttMstr() != null && this.getOidAttMstr()
				.equals(castOther.getOidAttMstr())))
				&& ((this.getAtapBeginDate() == castOther.getAtapBeginDate()) || (this
						.getAtapBeginDate() != null
						&& castOther.getAtapBeginDate() != null && this
						.getAtapBeginDate()
						.equals(castOther.getAtapBeginDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidAttMstr() == null ? 0 : this.getOidAttMstr()
						.hashCode());
		result = 37
				* result
				+ (getAtapBeginDate() == null ? 0 : this.getAtapBeginDate()
						.hashCode());
		return result;
	}

}