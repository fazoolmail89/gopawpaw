package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFccMstrId entity provides the base persistence definition of the
 * FccMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFccMstrId implements java.io.Serializable {

	// Fields

	private String fccDomain;
	private String fccType;
	private String fccFcgCode;
	private String fccCaIntType;
	private String fccFscCode;
	private String fccSvCode;
	private String fccPtProdLine;
	private String fccPtSvcGroup;

	// Constructors

	/** default constructor */
	public AbstractFccMstrId() {
	}

	/** minimal constructor */
	public AbstractFccMstrId(String fccDomain) {
		this.fccDomain = fccDomain;
	}

	/** full constructor */
	public AbstractFccMstrId(String fccDomain, String fccType,
			String fccFcgCode, String fccCaIntType, String fccFscCode,
			String fccSvCode, String fccPtProdLine, String fccPtSvcGroup) {
		this.fccDomain = fccDomain;
		this.fccType = fccType;
		this.fccFcgCode = fccFcgCode;
		this.fccCaIntType = fccCaIntType;
		this.fccFscCode = fccFscCode;
		this.fccSvCode = fccSvCode;
		this.fccPtProdLine = fccPtProdLine;
		this.fccPtSvcGroup = fccPtSvcGroup;
	}

	// Property accessors

	public String getFccDomain() {
		return this.fccDomain;
	}

	public void setFccDomain(String fccDomain) {
		this.fccDomain = fccDomain;
	}

	public String getFccType() {
		return this.fccType;
	}

	public void setFccType(String fccType) {
		this.fccType = fccType;
	}

	public String getFccFcgCode() {
		return this.fccFcgCode;
	}

	public void setFccFcgCode(String fccFcgCode) {
		this.fccFcgCode = fccFcgCode;
	}

	public String getFccCaIntType() {
		return this.fccCaIntType;
	}

	public void setFccCaIntType(String fccCaIntType) {
		this.fccCaIntType = fccCaIntType;
	}

	public String getFccFscCode() {
		return this.fccFscCode;
	}

	public void setFccFscCode(String fccFscCode) {
		this.fccFscCode = fccFscCode;
	}

	public String getFccSvCode() {
		return this.fccSvCode;
	}

	public void setFccSvCode(String fccSvCode) {
		this.fccSvCode = fccSvCode;
	}

	public String getFccPtProdLine() {
		return this.fccPtProdLine;
	}

	public void setFccPtProdLine(String fccPtProdLine) {
		this.fccPtProdLine = fccPtProdLine;
	}

	public String getFccPtSvcGroup() {
		return this.fccPtSvcGroup;
	}

	public void setFccPtSvcGroup(String fccPtSvcGroup) {
		this.fccPtSvcGroup = fccPtSvcGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFccMstrId))
			return false;
		AbstractFccMstrId castOther = (AbstractFccMstrId) other;

		return ((this.getFccDomain() == castOther.getFccDomain()) || (this
				.getFccDomain() != null
				&& castOther.getFccDomain() != null && this.getFccDomain()
				.equals(castOther.getFccDomain())))
				&& ((this.getFccType() == castOther.getFccType()) || (this
						.getFccType() != null
						&& castOther.getFccType() != null && this.getFccType()
						.equals(castOther.getFccType())))
				&& ((this.getFccFcgCode() == castOther.getFccFcgCode()) || (this
						.getFccFcgCode() != null
						&& castOther.getFccFcgCode() != null && this
						.getFccFcgCode().equals(castOther.getFccFcgCode())))
				&& ((this.getFccCaIntType() == castOther.getFccCaIntType()) || (this
						.getFccCaIntType() != null
						&& castOther.getFccCaIntType() != null && this
						.getFccCaIntType().equals(castOther.getFccCaIntType())))
				&& ((this.getFccFscCode() == castOther.getFccFscCode()) || (this
						.getFccFscCode() != null
						&& castOther.getFccFscCode() != null && this
						.getFccFscCode().equals(castOther.getFccFscCode())))
				&& ((this.getFccSvCode() == castOther.getFccSvCode()) || (this
						.getFccSvCode() != null
						&& castOther.getFccSvCode() != null && this
						.getFccSvCode().equals(castOther.getFccSvCode())))
				&& ((this.getFccPtProdLine() == castOther.getFccPtProdLine()) || (this
						.getFccPtProdLine() != null
						&& castOther.getFccPtProdLine() != null && this
						.getFccPtProdLine()
						.equals(castOther.getFccPtProdLine())))
				&& ((this.getFccPtSvcGroup() == castOther.getFccPtSvcGroup()) || (this
						.getFccPtSvcGroup() != null
						&& castOther.getFccPtSvcGroup() != null && this
						.getFccPtSvcGroup()
						.equals(castOther.getFccPtSvcGroup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFccDomain() == null ? 0 : this.getFccDomain().hashCode());
		result = 37 * result
				+ (getFccType() == null ? 0 : this.getFccType().hashCode());
		result = 37
				* result
				+ (getFccFcgCode() == null ? 0 : this.getFccFcgCode()
						.hashCode());
		result = 37
				* result
				+ (getFccCaIntType() == null ? 0 : this.getFccCaIntType()
						.hashCode());
		result = 37
				* result
				+ (getFccFscCode() == null ? 0 : this.getFccFscCode()
						.hashCode());
		result = 37 * result
				+ (getFccSvCode() == null ? 0 : this.getFccSvCode().hashCode());
		result = 37
				* result
				+ (getFccPtProdLine() == null ? 0 : this.getFccPtProdLine()
						.hashCode());
		result = 37
				* result
				+ (getFccPtSvcGroup() == null ? 0 : this.getFccPtSvcGroup()
						.hashCode());
		return result;
	}

}