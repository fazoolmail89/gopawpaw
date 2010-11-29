package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtdcdDetId entity provides the base persistence definition of the
 * AtdcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtdcdDetId implements java.io.Serializable {

	// Fields

	private String atdcdType;
	private Date atdcdBeginDate;

	// Constructors

	/** default constructor */
	public AbstractAtdcdDetId() {
	}

	/** full constructor */
	public AbstractAtdcdDetId(String atdcdType, Date atdcdBeginDate) {
		this.atdcdType = atdcdType;
		this.atdcdBeginDate = atdcdBeginDate;
	}

	// Property accessors

	public String getAtdcdType() {
		return this.atdcdType;
	}

	public void setAtdcdType(String atdcdType) {
		this.atdcdType = atdcdType;
	}

	public Date getAtdcdBeginDate() {
		return this.atdcdBeginDate;
	}

	public void setAtdcdBeginDate(Date atdcdBeginDate) {
		this.atdcdBeginDate = atdcdBeginDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtdcdDetId))
			return false;
		AbstractAtdcdDetId castOther = (AbstractAtdcdDetId) other;

		return ((this.getAtdcdType() == castOther.getAtdcdType()) || (this
				.getAtdcdType() != null
				&& castOther.getAtdcdType() != null && this.getAtdcdType()
				.equals(castOther.getAtdcdType())))
				&& ((this.getAtdcdBeginDate() == castOther.getAtdcdBeginDate()) || (this
						.getAtdcdBeginDate() != null
						&& castOther.getAtdcdBeginDate() != null && this
						.getAtdcdBeginDate().equals(
								castOther.getAtdcdBeginDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAtdcdType() == null ? 0 : this.getAtdcdType().hashCode());
		result = 37
				* result
				+ (getAtdcdBeginDate() == null ? 0 : this.getAtdcdBeginDate()
						.hashCode());
		return result;
	}

}