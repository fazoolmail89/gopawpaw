package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFisMstrId entity provides the base persistence definition of the
 * FisMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFisMstrId implements java.io.Serializable {

	// Fields

	private String fisDomain;
	private String fisSort;
	private String fisRowType;

	// Constructors

	/** default constructor */
	public AbstractFisMstrId() {
	}

	/** minimal constructor */
	public AbstractFisMstrId(String fisDomain) {
		this.fisDomain = fisDomain;
	}

	/** full constructor */
	public AbstractFisMstrId(String fisDomain, String fisSort, String fisRowType) {
		this.fisDomain = fisDomain;
		this.fisSort = fisSort;
		this.fisRowType = fisRowType;
	}

	// Property accessors

	public String getFisDomain() {
		return this.fisDomain;
	}

	public void setFisDomain(String fisDomain) {
		this.fisDomain = fisDomain;
	}

	public String getFisSort() {
		return this.fisSort;
	}

	public void setFisSort(String fisSort) {
		this.fisSort = fisSort;
	}

	public String getFisRowType() {
		return this.fisRowType;
	}

	public void setFisRowType(String fisRowType) {
		this.fisRowType = fisRowType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFisMstrId))
			return false;
		AbstractFisMstrId castOther = (AbstractFisMstrId) other;

		return ((this.getFisDomain() == castOther.getFisDomain()) || (this
				.getFisDomain() != null
				&& castOther.getFisDomain() != null && this.getFisDomain()
				.equals(castOther.getFisDomain())))
				&& ((this.getFisSort() == castOther.getFisSort()) || (this
						.getFisSort() != null
						&& castOther.getFisSort() != null && this.getFisSort()
						.equals(castOther.getFisSort())))
				&& ((this.getFisRowType() == castOther.getFisRowType()) || (this
						.getFisRowType() != null
						&& castOther.getFisRowType() != null && this
						.getFisRowType().equals(castOther.getFisRowType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFisDomain() == null ? 0 : this.getFisDomain().hashCode());
		result = 37 * result
				+ (getFisSort() == null ? 0 : this.getFisSort().hashCode());
		result = 37
				* result
				+ (getFisRowType() == null ? 0 : this.getFisRowType()
						.hashCode());
		return result;
	}

}