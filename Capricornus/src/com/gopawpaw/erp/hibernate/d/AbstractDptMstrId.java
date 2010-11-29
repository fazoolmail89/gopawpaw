package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDptMstrId entity provides the base persistence definition of the
 * DptMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDptMstrId implements java.io.Serializable {

	// Fields

	private String dptDomain;
	private String dptDept;

	// Constructors

	/** default constructor */
	public AbstractDptMstrId() {
	}

	/** full constructor */
	public AbstractDptMstrId(String dptDomain, String dptDept) {
		this.dptDomain = dptDomain;
		this.dptDept = dptDept;
	}

	// Property accessors

	public String getDptDomain() {
		return this.dptDomain;
	}

	public void setDptDomain(String dptDomain) {
		this.dptDomain = dptDomain;
	}

	public String getDptDept() {
		return this.dptDept;
	}

	public void setDptDept(String dptDept) {
		this.dptDept = dptDept;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDptMstrId))
			return false;
		AbstractDptMstrId castOther = (AbstractDptMstrId) other;

		return ((this.getDptDomain() == castOther.getDptDomain()) || (this
				.getDptDomain() != null
				&& castOther.getDptDomain() != null && this.getDptDomain()
				.equals(castOther.getDptDomain())))
				&& ((this.getDptDept() == castOther.getDptDept()) || (this
						.getDptDept() != null
						&& castOther.getDptDept() != null && this.getDptDept()
						.equals(castOther.getDptDept())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDptDomain() == null ? 0 : this.getDptDomain().hashCode());
		result = 37 * result
				+ (getDptDept() == null ? 0 : this.getDptDept().hashCode());
		return result;
	}

}