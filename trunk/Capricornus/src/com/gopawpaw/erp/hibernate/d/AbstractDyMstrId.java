package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDyMstrId entity provides the base persistence definition of the
 * DyMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDyMstrId implements java.io.Serializable {

	// Fields

	private String dyDomain;
	private String dyDyCode;

	// Constructors

	/** default constructor */
	public AbstractDyMstrId() {
	}

	/** full constructor */
	public AbstractDyMstrId(String dyDomain, String dyDyCode) {
		this.dyDomain = dyDomain;
		this.dyDyCode = dyDyCode;
	}

	// Property accessors

	public String getDyDomain() {
		return this.dyDomain;
	}

	public void setDyDomain(String dyDomain) {
		this.dyDomain = dyDomain;
	}

	public String getDyDyCode() {
		return this.dyDyCode;
	}

	public void setDyDyCode(String dyDyCode) {
		this.dyDyCode = dyDyCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDyMstrId))
			return false;
		AbstractDyMstrId castOther = (AbstractDyMstrId) other;

		return ((this.getDyDomain() == castOther.getDyDomain()) || (this
				.getDyDomain() != null
				&& castOther.getDyDomain() != null && this.getDyDomain()
				.equals(castOther.getDyDomain())))
				&& ((this.getDyDyCode() == castOther.getDyDyCode()) || (this
						.getDyDyCode() != null
						&& castOther.getDyDyCode() != null && this
						.getDyDyCode().equals(castOther.getDyDyCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDyDomain() == null ? 0 : this.getDyDomain().hashCode());
		result = 37 * result
				+ (getDyDyCode() == null ? 0 : this.getDyDyCode().hashCode());
		return result;
	}

}