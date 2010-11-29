package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDalMstrId entity provides the base persistence definition of the
 * DalMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDalMstrId implements java.io.Serializable {

	// Fields

	private String dalDomain;
	private String dalListId;

	// Constructors

	/** default constructor */
	public AbstractDalMstrId() {
	}

	/** minimal constructor */
	public AbstractDalMstrId(String dalDomain) {
		this.dalDomain = dalDomain;
	}

	/** full constructor */
	public AbstractDalMstrId(String dalDomain, String dalListId) {
		this.dalDomain = dalDomain;
		this.dalListId = dalListId;
	}

	// Property accessors

	public String getDalDomain() {
		return this.dalDomain;
	}

	public void setDalDomain(String dalDomain) {
		this.dalDomain = dalDomain;
	}

	public String getDalListId() {
		return this.dalListId;
	}

	public void setDalListId(String dalListId) {
		this.dalListId = dalListId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDalMstrId))
			return false;
		AbstractDalMstrId castOther = (AbstractDalMstrId) other;

		return ((this.getDalDomain() == castOther.getDalDomain()) || (this
				.getDalDomain() != null
				&& castOther.getDalDomain() != null && this.getDalDomain()
				.equals(castOther.getDalDomain())))
				&& ((this.getDalListId() == castOther.getDalListId()) || (this
						.getDalListId() != null
						&& castOther.getDalListId() != null && this
						.getDalListId().equals(castOther.getDalListId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDalDomain() == null ? 0 : this.getDalDomain().hashCode());
		result = 37 * result
				+ (getDalListId() == null ? 0 : this.getDalListId().hashCode());
		return result;
	}

}