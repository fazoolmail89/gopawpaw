package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBlCtrlId entity provides the base persistence definition of the
 * BlCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBlCtrlId implements java.io.Serializable {

	// Fields

	private String blDomain;
	private String blMasterId;

	// Constructors

	/** default constructor */
	public AbstractBlCtrlId() {
	}

	/** minimal constructor */
	public AbstractBlCtrlId(String blDomain) {
		this.blDomain = blDomain;
	}

	/** full constructor */
	public AbstractBlCtrlId(String blDomain, String blMasterId) {
		this.blDomain = blDomain;
		this.blMasterId = blMasterId;
	}

	// Property accessors

	public String getBlDomain() {
		return this.blDomain;
	}

	public void setBlDomain(String blDomain) {
		this.blDomain = blDomain;
	}

	public String getBlMasterId() {
		return this.blMasterId;
	}

	public void setBlMasterId(String blMasterId) {
		this.blMasterId = blMasterId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBlCtrlId))
			return false;
		AbstractBlCtrlId castOther = (AbstractBlCtrlId) other;

		return ((this.getBlDomain() == castOther.getBlDomain()) || (this
				.getBlDomain() != null
				&& castOther.getBlDomain() != null && this.getBlDomain()
				.equals(castOther.getBlDomain())))
				&& ((this.getBlMasterId() == castOther.getBlMasterId()) || (this
						.getBlMasterId() != null
						&& castOther.getBlMasterId() != null && this
						.getBlMasterId().equals(castOther.getBlMasterId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBlDomain() == null ? 0 : this.getBlDomain().hashCode());
		result = 37
				* result
				+ (getBlMasterId() == null ? 0 : this.getBlMasterId()
						.hashCode());
		return result;
	}

}