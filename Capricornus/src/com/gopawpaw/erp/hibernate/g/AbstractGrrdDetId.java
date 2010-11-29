package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrrdDetId entity provides the base persistence definition of the
 * GrrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrrdDetId implements java.io.Serializable {

	// Fields

	private String grrdDomain;
	private String grrdRowGroup;
	private Integer grrdRow;

	// Constructors

	/** default constructor */
	public AbstractGrrdDetId() {
	}

	/** minimal constructor */
	public AbstractGrrdDetId(String grrdDomain) {
		this.grrdDomain = grrdDomain;
	}

	/** full constructor */
	public AbstractGrrdDetId(String grrdDomain, String grrdRowGroup,
			Integer grrdRow) {
		this.grrdDomain = grrdDomain;
		this.grrdRowGroup = grrdRowGroup;
		this.grrdRow = grrdRow;
	}

	// Property accessors

	public String getGrrdDomain() {
		return this.grrdDomain;
	}

	public void setGrrdDomain(String grrdDomain) {
		this.grrdDomain = grrdDomain;
	}

	public String getGrrdRowGroup() {
		return this.grrdRowGroup;
	}

	public void setGrrdRowGroup(String grrdRowGroup) {
		this.grrdRowGroup = grrdRowGroup;
	}

	public Integer getGrrdRow() {
		return this.grrdRow;
	}

	public void setGrrdRow(Integer grrdRow) {
		this.grrdRow = grrdRow;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrrdDetId))
			return false;
		AbstractGrrdDetId castOther = (AbstractGrrdDetId) other;

		return ((this.getGrrdDomain() == castOther.getGrrdDomain()) || (this
				.getGrrdDomain() != null
				&& castOther.getGrrdDomain() != null && this.getGrrdDomain()
				.equals(castOther.getGrrdDomain())))
				&& ((this.getGrrdRowGroup() == castOther.getGrrdRowGroup()) || (this
						.getGrrdRowGroup() != null
						&& castOther.getGrrdRowGroup() != null && this
						.getGrrdRowGroup().equals(castOther.getGrrdRowGroup())))
				&& ((this.getGrrdRow() == castOther.getGrrdRow()) || (this
						.getGrrdRow() != null
						&& castOther.getGrrdRow() != null && this.getGrrdRow()
						.equals(castOther.getGrrdRow())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrrdDomain() == null ? 0 : this.getGrrdDomain()
						.hashCode());
		result = 37
				* result
				+ (getGrrdRowGroup() == null ? 0 : this.getGrrdRowGroup()
						.hashCode());
		result = 37 * result
				+ (getGrrdRow() == null ? 0 : this.getGrrdRow().hashCode());
		return result;
	}

}