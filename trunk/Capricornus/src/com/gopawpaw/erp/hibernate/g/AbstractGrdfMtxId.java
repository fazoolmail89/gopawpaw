package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrdfMtxId entity provides the base persistence definition of the
 * GrdfMtxId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrdfMtxId implements java.io.Serializable {

	// Fields

	private String grdfDomain;
	private Integer grdfRunId;
	private Integer grdfRow;
	private Integer grdfCol;

	// Constructors

	/** default constructor */
	public AbstractGrdfMtxId() {
	}

	/** minimal constructor */
	public AbstractGrdfMtxId(String grdfDomain) {
		this.grdfDomain = grdfDomain;
	}

	/** full constructor */
	public AbstractGrdfMtxId(String grdfDomain, Integer grdfRunId,
			Integer grdfRow, Integer grdfCol) {
		this.grdfDomain = grdfDomain;
		this.grdfRunId = grdfRunId;
		this.grdfRow = grdfRow;
		this.grdfCol = grdfCol;
	}

	// Property accessors

	public String getGrdfDomain() {
		return this.grdfDomain;
	}

	public void setGrdfDomain(String grdfDomain) {
		this.grdfDomain = grdfDomain;
	}

	public Integer getGrdfRunId() {
		return this.grdfRunId;
	}

	public void setGrdfRunId(Integer grdfRunId) {
		this.grdfRunId = grdfRunId;
	}

	public Integer getGrdfRow() {
		return this.grdfRow;
	}

	public void setGrdfRow(Integer grdfRow) {
		this.grdfRow = grdfRow;
	}

	public Integer getGrdfCol() {
		return this.grdfCol;
	}

	public void setGrdfCol(Integer grdfCol) {
		this.grdfCol = grdfCol;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrdfMtxId))
			return false;
		AbstractGrdfMtxId castOther = (AbstractGrdfMtxId) other;

		return ((this.getGrdfDomain() == castOther.getGrdfDomain()) || (this
				.getGrdfDomain() != null
				&& castOther.getGrdfDomain() != null && this.getGrdfDomain()
				.equals(castOther.getGrdfDomain())))
				&& ((this.getGrdfRunId() == castOther.getGrdfRunId()) || (this
						.getGrdfRunId() != null
						&& castOther.getGrdfRunId() != null && this
						.getGrdfRunId().equals(castOther.getGrdfRunId())))
				&& ((this.getGrdfRow() == castOther.getGrdfRow()) || (this
						.getGrdfRow() != null
						&& castOther.getGrdfRow() != null && this.getGrdfRow()
						.equals(castOther.getGrdfRow())))
				&& ((this.getGrdfCol() == castOther.getGrdfCol()) || (this
						.getGrdfCol() != null
						&& castOther.getGrdfCol() != null && this.getGrdfCol()
						.equals(castOther.getGrdfCol())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrdfDomain() == null ? 0 : this.getGrdfDomain()
						.hashCode());
		result = 37 * result
				+ (getGrdfRunId() == null ? 0 : this.getGrdfRunId().hashCode());
		result = 37 * result
				+ (getGrdfRow() == null ? 0 : this.getGrdfRow().hashCode());
		result = 37 * result
				+ (getGrdfCol() == null ? 0 : this.getGrdfCol().hashCode());
		return result;
	}

}