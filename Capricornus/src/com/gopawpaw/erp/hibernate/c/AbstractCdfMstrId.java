package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCdfMstrId entity provides the base persistence definition of the
 * CdfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCdfMstrId implements java.io.Serializable {

	// Fields

	private String cdfDomain;
	private String cdfCaCategory;
	private String cdfCaIntType;
	private String cdfModel;
	private String cdfGroup;
	private String cdfStatusType;

	// Constructors

	/** default constructor */
	public AbstractCdfMstrId() {
	}

	/** minimal constructor */
	public AbstractCdfMstrId(String cdfDomain) {
		this.cdfDomain = cdfDomain;
	}

	/** full constructor */
	public AbstractCdfMstrId(String cdfDomain, String cdfCaCategory,
			String cdfCaIntType, String cdfModel, String cdfGroup,
			String cdfStatusType) {
		this.cdfDomain = cdfDomain;
		this.cdfCaCategory = cdfCaCategory;
		this.cdfCaIntType = cdfCaIntType;
		this.cdfModel = cdfModel;
		this.cdfGroup = cdfGroup;
		this.cdfStatusType = cdfStatusType;
	}

	// Property accessors

	public String getCdfDomain() {
		return this.cdfDomain;
	}

	public void setCdfDomain(String cdfDomain) {
		this.cdfDomain = cdfDomain;
	}

	public String getCdfCaCategory() {
		return this.cdfCaCategory;
	}

	public void setCdfCaCategory(String cdfCaCategory) {
		this.cdfCaCategory = cdfCaCategory;
	}

	public String getCdfCaIntType() {
		return this.cdfCaIntType;
	}

	public void setCdfCaIntType(String cdfCaIntType) {
		this.cdfCaIntType = cdfCaIntType;
	}

	public String getCdfModel() {
		return this.cdfModel;
	}

	public void setCdfModel(String cdfModel) {
		this.cdfModel = cdfModel;
	}

	public String getCdfGroup() {
		return this.cdfGroup;
	}

	public void setCdfGroup(String cdfGroup) {
		this.cdfGroup = cdfGroup;
	}

	public String getCdfStatusType() {
		return this.cdfStatusType;
	}

	public void setCdfStatusType(String cdfStatusType) {
		this.cdfStatusType = cdfStatusType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCdfMstrId))
			return false;
		AbstractCdfMstrId castOther = (AbstractCdfMstrId) other;

		return ((this.getCdfDomain() == castOther.getCdfDomain()) || (this
				.getCdfDomain() != null
				&& castOther.getCdfDomain() != null && this.getCdfDomain()
				.equals(castOther.getCdfDomain())))
				&& ((this.getCdfCaCategory() == castOther.getCdfCaCategory()) || (this
						.getCdfCaCategory() != null
						&& castOther.getCdfCaCategory() != null && this
						.getCdfCaCategory()
						.equals(castOther.getCdfCaCategory())))
				&& ((this.getCdfCaIntType() == castOther.getCdfCaIntType()) || (this
						.getCdfCaIntType() != null
						&& castOther.getCdfCaIntType() != null && this
						.getCdfCaIntType().equals(castOther.getCdfCaIntType())))
				&& ((this.getCdfModel() == castOther.getCdfModel()) || (this
						.getCdfModel() != null
						&& castOther.getCdfModel() != null && this
						.getCdfModel().equals(castOther.getCdfModel())))
				&& ((this.getCdfGroup() == castOther.getCdfGroup()) || (this
						.getCdfGroup() != null
						&& castOther.getCdfGroup() != null && this
						.getCdfGroup().equals(castOther.getCdfGroup())))
				&& ((this.getCdfStatusType() == castOther.getCdfStatusType()) || (this
						.getCdfStatusType() != null
						&& castOther.getCdfStatusType() != null && this
						.getCdfStatusType()
						.equals(castOther.getCdfStatusType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCdfDomain() == null ? 0 : this.getCdfDomain().hashCode());
		result = 37
				* result
				+ (getCdfCaCategory() == null ? 0 : this.getCdfCaCategory()
						.hashCode());
		result = 37
				* result
				+ (getCdfCaIntType() == null ? 0 : this.getCdfCaIntType()
						.hashCode());
		result = 37 * result
				+ (getCdfModel() == null ? 0 : this.getCdfModel().hashCode());
		result = 37 * result
				+ (getCdfGroup() == null ? 0 : this.getCdfGroup().hashCode());
		result = 37
				* result
				+ (getCdfStatusType() == null ? 0 : this.getCdfStatusType()
						.hashCode());
		return result;
	}

}