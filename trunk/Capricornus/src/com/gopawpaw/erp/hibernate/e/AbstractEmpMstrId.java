package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEmpMstrId entity provides the base persistence definition of the
 * EmpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmpMstrId implements java.io.Serializable {

	// Fields

	private String empDomain;
	private String empAddr;

	// Constructors

	/** default constructor */
	public AbstractEmpMstrId() {
	}

	/** full constructor */
	public AbstractEmpMstrId(String empDomain, String empAddr) {
		this.empDomain = empDomain;
		this.empAddr = empAddr;
	}

	// Property accessors

	public String getEmpDomain() {
		return this.empDomain;
	}

	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}

	public String getEmpAddr() {
		return this.empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEmpMstrId))
			return false;
		AbstractEmpMstrId castOther = (AbstractEmpMstrId) other;

		return ((this.getEmpDomain() == castOther.getEmpDomain()) || (this
				.getEmpDomain() != null
				&& castOther.getEmpDomain() != null && this.getEmpDomain()
				.equals(castOther.getEmpDomain())))
				&& ((this.getEmpAddr() == castOther.getEmpAddr()) || (this
						.getEmpAddr() != null
						&& castOther.getEmpAddr() != null && this.getEmpAddr()
						.equals(castOther.getEmpAddr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmpDomain() == null ? 0 : this.getEmpDomain().hashCode());
		result = 37 * result
				+ (getEmpAddr() == null ? 0 : this.getEmpAddr().hashCode());
		return result;
	}

}