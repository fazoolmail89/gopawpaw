package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDprtDetId entity provides the base persistence definition of the
 * DprtDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDprtDetId implements java.io.Serializable {

	// Fields

	private String dprtMethod;
	private Integer dprtYear;
	private Integer dprtMnth;

	// Constructors

	/** default constructor */
	public AbstractDprtDetId() {
	}

	/** full constructor */
	public AbstractDprtDetId(String dprtMethod, Integer dprtYear,
			Integer dprtMnth) {
		this.dprtMethod = dprtMethod;
		this.dprtYear = dprtYear;
		this.dprtMnth = dprtMnth;
	}

	// Property accessors

	public String getDprtMethod() {
		return this.dprtMethod;
	}

	public void setDprtMethod(String dprtMethod) {
		this.dprtMethod = dprtMethod;
	}

	public Integer getDprtYear() {
		return this.dprtYear;
	}

	public void setDprtYear(Integer dprtYear) {
		this.dprtYear = dprtYear;
	}

	public Integer getDprtMnth() {
		return this.dprtMnth;
	}

	public void setDprtMnth(Integer dprtMnth) {
		this.dprtMnth = dprtMnth;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDprtDetId))
			return false;
		AbstractDprtDetId castOther = (AbstractDprtDetId) other;

		return ((this.getDprtMethod() == castOther.getDprtMethod()) || (this
				.getDprtMethod() != null
				&& castOther.getDprtMethod() != null && this.getDprtMethod()
				.equals(castOther.getDprtMethod())))
				&& ((this.getDprtYear() == castOther.getDprtYear()) || (this
						.getDprtYear() != null
						&& castOther.getDprtYear() != null && this
						.getDprtYear().equals(castOther.getDprtYear())))
				&& ((this.getDprtMnth() == castOther.getDprtMnth()) || (this
						.getDprtMnth() != null
						&& castOther.getDprtMnth() != null && this
						.getDprtMnth().equals(castOther.getDprtMnth())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDprtMethod() == null ? 0 : this.getDprtMethod()
						.hashCode());
		result = 37 * result
				+ (getDprtYear() == null ? 0 : this.getDprtYear().hashCode());
		result = 37 * result
				+ (getDprtMnth() == null ? 0 : this.getDprtMnth().hashCode());
		return result;
	}

}