package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAtgMstrId entity provides the base persistence definition of the
 * AtgMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtgMstrId implements java.io.Serializable {

	// Fields

	private String atgGroupType;
	private String atgGroupName;

	// Constructors

	/** default constructor */
	public AbstractAtgMstrId() {
	}

	/** full constructor */
	public AbstractAtgMstrId(String atgGroupType, String atgGroupName) {
		this.atgGroupType = atgGroupType;
		this.atgGroupName = atgGroupName;
	}

	// Property accessors

	public String getAtgGroupType() {
		return this.atgGroupType;
	}

	public void setAtgGroupType(String atgGroupType) {
		this.atgGroupType = atgGroupType;
	}

	public String getAtgGroupName() {
		return this.atgGroupName;
	}

	public void setAtgGroupName(String atgGroupName) {
		this.atgGroupName = atgGroupName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtgMstrId))
			return false;
		AbstractAtgMstrId castOther = (AbstractAtgMstrId) other;

		return ((this.getAtgGroupType() == castOther.getAtgGroupType()) || (this
				.getAtgGroupType() != null
				&& castOther.getAtgGroupType() != null && this
				.getAtgGroupType().equals(castOther.getAtgGroupType())))
				&& ((this.getAtgGroupName() == castOther.getAtgGroupName()) || (this
						.getAtgGroupName() != null
						&& castOther.getAtgGroupName() != null && this
						.getAtgGroupName().equals(castOther.getAtgGroupName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAtgGroupType() == null ? 0 : this.getAtgGroupType()
						.hashCode());
		result = 37
				* result
				+ (getAtgGroupName() == null ? 0 : this.getAtgGroupName()
						.hashCode());
		return result;
	}

}