package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSfbDetId entity provides the base persistence definition of the
 * SfbDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSfbDetId implements java.io.Serializable {

	// Fields

	private String sfbDomain;
	private String sfbNbr;
	private Integer sfbSoLine;
	private Integer sfbPtType;
	private String sfbFisSort;
	private Integer sfbLine;

	// Constructors

	/** default constructor */
	public AbstractSfbDetId() {
	}

	/** minimal constructor */
	public AbstractSfbDetId(String sfbDomain) {
		this.sfbDomain = sfbDomain;
	}

	/** full constructor */
	public AbstractSfbDetId(String sfbDomain, String sfbNbr, Integer sfbSoLine,
			Integer sfbPtType, String sfbFisSort, Integer sfbLine) {
		this.sfbDomain = sfbDomain;
		this.sfbNbr = sfbNbr;
		this.sfbSoLine = sfbSoLine;
		this.sfbPtType = sfbPtType;
		this.sfbFisSort = sfbFisSort;
		this.sfbLine = sfbLine;
	}

	// Property accessors

	public String getSfbDomain() {
		return this.sfbDomain;
	}

	public void setSfbDomain(String sfbDomain) {
		this.sfbDomain = sfbDomain;
	}

	public String getSfbNbr() {
		return this.sfbNbr;
	}

	public void setSfbNbr(String sfbNbr) {
		this.sfbNbr = sfbNbr;
	}

	public Integer getSfbSoLine() {
		return this.sfbSoLine;
	}

	public void setSfbSoLine(Integer sfbSoLine) {
		this.sfbSoLine = sfbSoLine;
	}

	public Integer getSfbPtType() {
		return this.sfbPtType;
	}

	public void setSfbPtType(Integer sfbPtType) {
		this.sfbPtType = sfbPtType;
	}

	public String getSfbFisSort() {
		return this.sfbFisSort;
	}

	public void setSfbFisSort(String sfbFisSort) {
		this.sfbFisSort = sfbFisSort;
	}

	public Integer getSfbLine() {
		return this.sfbLine;
	}

	public void setSfbLine(Integer sfbLine) {
		this.sfbLine = sfbLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSfbDetId))
			return false;
		AbstractSfbDetId castOther = (AbstractSfbDetId) other;

		return ((this.getSfbDomain() == castOther.getSfbDomain()) || (this
				.getSfbDomain() != null
				&& castOther.getSfbDomain() != null && this.getSfbDomain()
				.equals(castOther.getSfbDomain())))
				&& ((this.getSfbNbr() == castOther.getSfbNbr()) || (this
						.getSfbNbr() != null
						&& castOther.getSfbNbr() != null && this.getSfbNbr()
						.equals(castOther.getSfbNbr())))
				&& ((this.getSfbSoLine() == castOther.getSfbSoLine()) || (this
						.getSfbSoLine() != null
						&& castOther.getSfbSoLine() != null && this
						.getSfbSoLine().equals(castOther.getSfbSoLine())))
				&& ((this.getSfbPtType() == castOther.getSfbPtType()) || (this
						.getSfbPtType() != null
						&& castOther.getSfbPtType() != null && this
						.getSfbPtType().equals(castOther.getSfbPtType())))
				&& ((this.getSfbFisSort() == castOther.getSfbFisSort()) || (this
						.getSfbFisSort() != null
						&& castOther.getSfbFisSort() != null && this
						.getSfbFisSort().equals(castOther.getSfbFisSort())))
				&& ((this.getSfbLine() == castOther.getSfbLine()) || (this
						.getSfbLine() != null
						&& castOther.getSfbLine() != null && this.getSfbLine()
						.equals(castOther.getSfbLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSfbDomain() == null ? 0 : this.getSfbDomain().hashCode());
		result = 37 * result
				+ (getSfbNbr() == null ? 0 : this.getSfbNbr().hashCode());
		result = 37 * result
				+ (getSfbSoLine() == null ? 0 : this.getSfbSoLine().hashCode());
		result = 37 * result
				+ (getSfbPtType() == null ? 0 : this.getSfbPtType().hashCode());
		result = 37
				* result
				+ (getSfbFisSort() == null ? 0 : this.getSfbFisSort()
						.hashCode());
		result = 37 * result
				+ (getSfbLine() == null ? 0 : this.getSfbLine().hashCode());
		return result;
	}

}