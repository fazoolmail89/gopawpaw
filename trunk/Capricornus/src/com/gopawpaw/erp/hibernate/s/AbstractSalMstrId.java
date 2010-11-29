package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSalMstrId entity provides the base persistence definition of the
 * SalMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSalMstrId implements java.io.Serializable {

	// Fields

	private String salDomain;
	private String salFile;
	private String salPrefix;
	private String salNbr;
	private Integer salLine;
	private String salType;
	private String salFisSort;
	private String salCaIntType;
	private String salFscCode;
	private Date salStart;

	// Constructors

	/** default constructor */
	public AbstractSalMstrId() {
	}

	/** minimal constructor */
	public AbstractSalMstrId(String salDomain) {
		this.salDomain = salDomain;
	}

	/** full constructor */
	public AbstractSalMstrId(String salDomain, String salFile,
			String salPrefix, String salNbr, Integer salLine, String salType,
			String salFisSort, String salCaIntType, String salFscCode,
			Date salStart) {
		this.salDomain = salDomain;
		this.salFile = salFile;
		this.salPrefix = salPrefix;
		this.salNbr = salNbr;
		this.salLine = salLine;
		this.salType = salType;
		this.salFisSort = salFisSort;
		this.salCaIntType = salCaIntType;
		this.salFscCode = salFscCode;
		this.salStart = salStart;
	}

	// Property accessors

	public String getSalDomain() {
		return this.salDomain;
	}

	public void setSalDomain(String salDomain) {
		this.salDomain = salDomain;
	}

	public String getSalFile() {
		return this.salFile;
	}

	public void setSalFile(String salFile) {
		this.salFile = salFile;
	}

	public String getSalPrefix() {
		return this.salPrefix;
	}

	public void setSalPrefix(String salPrefix) {
		this.salPrefix = salPrefix;
	}

	public String getSalNbr() {
		return this.salNbr;
	}

	public void setSalNbr(String salNbr) {
		this.salNbr = salNbr;
	}

	public Integer getSalLine() {
		return this.salLine;
	}

	public void setSalLine(Integer salLine) {
		this.salLine = salLine;
	}

	public String getSalType() {
		return this.salType;
	}

	public void setSalType(String salType) {
		this.salType = salType;
	}

	public String getSalFisSort() {
		return this.salFisSort;
	}

	public void setSalFisSort(String salFisSort) {
		this.salFisSort = salFisSort;
	}

	public String getSalCaIntType() {
		return this.salCaIntType;
	}

	public void setSalCaIntType(String salCaIntType) {
		this.salCaIntType = salCaIntType;
	}

	public String getSalFscCode() {
		return this.salFscCode;
	}

	public void setSalFscCode(String salFscCode) {
		this.salFscCode = salFscCode;
	}

	public Date getSalStart() {
		return this.salStart;
	}

	public void setSalStart(Date salStart) {
		this.salStart = salStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSalMstrId))
			return false;
		AbstractSalMstrId castOther = (AbstractSalMstrId) other;

		return ((this.getSalDomain() == castOther.getSalDomain()) || (this
				.getSalDomain() != null
				&& castOther.getSalDomain() != null && this.getSalDomain()
				.equals(castOther.getSalDomain())))
				&& ((this.getSalFile() == castOther.getSalFile()) || (this
						.getSalFile() != null
						&& castOther.getSalFile() != null && this.getSalFile()
						.equals(castOther.getSalFile())))
				&& ((this.getSalPrefix() == castOther.getSalPrefix()) || (this
						.getSalPrefix() != null
						&& castOther.getSalPrefix() != null && this
						.getSalPrefix().equals(castOther.getSalPrefix())))
				&& ((this.getSalNbr() == castOther.getSalNbr()) || (this
						.getSalNbr() != null
						&& castOther.getSalNbr() != null && this.getSalNbr()
						.equals(castOther.getSalNbr())))
				&& ((this.getSalLine() == castOther.getSalLine()) || (this
						.getSalLine() != null
						&& castOther.getSalLine() != null && this.getSalLine()
						.equals(castOther.getSalLine())))
				&& ((this.getSalType() == castOther.getSalType()) || (this
						.getSalType() != null
						&& castOther.getSalType() != null && this.getSalType()
						.equals(castOther.getSalType())))
				&& ((this.getSalFisSort() == castOther.getSalFisSort()) || (this
						.getSalFisSort() != null
						&& castOther.getSalFisSort() != null && this
						.getSalFisSort().equals(castOther.getSalFisSort())))
				&& ((this.getSalCaIntType() == castOther.getSalCaIntType()) || (this
						.getSalCaIntType() != null
						&& castOther.getSalCaIntType() != null && this
						.getSalCaIntType().equals(castOther.getSalCaIntType())))
				&& ((this.getSalFscCode() == castOther.getSalFscCode()) || (this
						.getSalFscCode() != null
						&& castOther.getSalFscCode() != null && this
						.getSalFscCode().equals(castOther.getSalFscCode())))
				&& ((this.getSalStart() == castOther.getSalStart()) || (this
						.getSalStart() != null
						&& castOther.getSalStart() != null && this
						.getSalStart().equals(castOther.getSalStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSalDomain() == null ? 0 : this.getSalDomain().hashCode());
		result = 37 * result
				+ (getSalFile() == null ? 0 : this.getSalFile().hashCode());
		result = 37 * result
				+ (getSalPrefix() == null ? 0 : this.getSalPrefix().hashCode());
		result = 37 * result
				+ (getSalNbr() == null ? 0 : this.getSalNbr().hashCode());
		result = 37 * result
				+ (getSalLine() == null ? 0 : this.getSalLine().hashCode());
		result = 37 * result
				+ (getSalType() == null ? 0 : this.getSalType().hashCode());
		result = 37
				* result
				+ (getSalFisSort() == null ? 0 : this.getSalFisSort()
						.hashCode());
		result = 37
				* result
				+ (getSalCaIntType() == null ? 0 : this.getSalCaIntType()
						.hashCode());
		result = 37
				* result
				+ (getSalFscCode() == null ? 0 : this.getSalFscCode()
						.hashCode());
		result = 37 * result
				+ (getSalStart() == null ? 0 : this.getSalStart().hashCode());
		return result;
	}

}