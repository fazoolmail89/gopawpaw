package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIsMstrId entity provides the base persistence definition of the
 * IsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsMstrId implements java.io.Serializable {

	// Fields

	private String isDomain;
	private String isStatus;
	private Boolean isNettable;

	// Constructors

	/** default constructor */
	public AbstractIsMstrId() {
	}

	/** minimal constructor */
	public AbstractIsMstrId(String isDomain) {
		this.isDomain = isDomain;
	}

	/** full constructor */
	public AbstractIsMstrId(String isDomain, String isStatus, Boolean isNettable) {
		this.isDomain = isDomain;
		this.isStatus = isStatus;
		this.isNettable = isNettable;
	}

	// Property accessors

	public String getIsDomain() {
		return this.isDomain;
	}

	public void setIsDomain(String isDomain) {
		this.isDomain = isDomain;
	}

	public String getIsStatus() {
		return this.isStatus;
	}

	public void setIsStatus(String isStatus) {
		this.isStatus = isStatus;
	}

	public Boolean getIsNettable() {
		return this.isNettable;
	}

	public void setIsNettable(Boolean isNettable) {
		this.isNettable = isNettable;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIsMstrId))
			return false;
		AbstractIsMstrId castOther = (AbstractIsMstrId) other;

		return ((this.getIsDomain() == castOther.getIsDomain()) || (this
				.getIsDomain() != null
				&& castOther.getIsDomain() != null && this.getIsDomain()
				.equals(castOther.getIsDomain())))
				&& ((this.getIsStatus() == castOther.getIsStatus()) || (this
						.getIsStatus() != null
						&& castOther.getIsStatus() != null && this
						.getIsStatus().equals(castOther.getIsStatus())))
				&& ((this.getIsNettable() == castOther.getIsNettable()) || (this
						.getIsNettable() != null
						&& castOther.getIsNettable() != null && this
						.getIsNettable().equals(castOther.getIsNettable())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIsDomain() == null ? 0 : this.getIsDomain().hashCode());
		result = 37 * result
				+ (getIsStatus() == null ? 0 : this.getIsStatus().hashCode());
		result = 37
				* result
				+ (getIsNettable() == null ? 0 : this.getIsNettable()
						.hashCode());
		return result;
	}

}