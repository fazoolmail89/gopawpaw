package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFpciMstrId entity provides the base persistence definition of the
 * FpciMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpciMstrId implements java.io.Serializable {

	// Fields

	private String fpciDomain;
	private String fpciIndex;
	private Integer fpciYear;

	// Constructors

	/** default constructor */
	public AbstractFpciMstrId() {
	}

	/** minimal constructor */
	public AbstractFpciMstrId(String fpciDomain) {
		this.fpciDomain = fpciDomain;
	}

	/** full constructor */
	public AbstractFpciMstrId(String fpciDomain, String fpciIndex,
			Integer fpciYear) {
		this.fpciDomain = fpciDomain;
		this.fpciIndex = fpciIndex;
		this.fpciYear = fpciYear;
	}

	// Property accessors

	public String getFpciDomain() {
		return this.fpciDomain;
	}

	public void setFpciDomain(String fpciDomain) {
		this.fpciDomain = fpciDomain;
	}

	public String getFpciIndex() {
		return this.fpciIndex;
	}

	public void setFpciIndex(String fpciIndex) {
		this.fpciIndex = fpciIndex;
	}

	public Integer getFpciYear() {
		return this.fpciYear;
	}

	public void setFpciYear(Integer fpciYear) {
		this.fpciYear = fpciYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFpciMstrId))
			return false;
		AbstractFpciMstrId castOther = (AbstractFpciMstrId) other;

		return ((this.getFpciDomain() == castOther.getFpciDomain()) || (this
				.getFpciDomain() != null
				&& castOther.getFpciDomain() != null && this.getFpciDomain()
				.equals(castOther.getFpciDomain())))
				&& ((this.getFpciIndex() == castOther.getFpciIndex()) || (this
						.getFpciIndex() != null
						&& castOther.getFpciIndex() != null && this
						.getFpciIndex().equals(castOther.getFpciIndex())))
				&& ((this.getFpciYear() == castOther.getFpciYear()) || (this
						.getFpciYear() != null
						&& castOther.getFpciYear() != null && this
						.getFpciYear().equals(castOther.getFpciYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFpciDomain() == null ? 0 : this.getFpciDomain()
						.hashCode());
		result = 37 * result
				+ (getFpciIndex() == null ? 0 : this.getFpciIndex().hashCode());
		result = 37 * result
				+ (getFpciYear() == null ? 0 : this.getFpciYear().hashCode());
		return result;
	}

}