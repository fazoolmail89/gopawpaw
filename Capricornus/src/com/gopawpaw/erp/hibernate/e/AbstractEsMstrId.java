package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsMstrId entity provides the base persistence definition of the
 * EsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsMstrId implements java.io.Serializable {

	// Fields

	private String esDomain;
	private String esNbr;
	private String esPrefix;
	private Integer esItmLine;
	private String esCaStatus;
	private String esCaIntType;
	private String esCaType;
	private String esCaSeverity;
	private String esCaProblem;
	private Integer esSeq;

	// Constructors

	/** default constructor */
	public AbstractEsMstrId() {
	}

	/** minimal constructor */
	public AbstractEsMstrId(String esDomain) {
		this.esDomain = esDomain;
	}

	/** full constructor */
	public AbstractEsMstrId(String esDomain, String esNbr, String esPrefix,
			Integer esItmLine, String esCaStatus, String esCaIntType,
			String esCaType, String esCaSeverity, String esCaProblem,
			Integer esSeq) {
		this.esDomain = esDomain;
		this.esNbr = esNbr;
		this.esPrefix = esPrefix;
		this.esItmLine = esItmLine;
		this.esCaStatus = esCaStatus;
		this.esCaIntType = esCaIntType;
		this.esCaType = esCaType;
		this.esCaSeverity = esCaSeverity;
		this.esCaProblem = esCaProblem;
		this.esSeq = esSeq;
	}

	// Property accessors

	public String getEsDomain() {
		return this.esDomain;
	}

	public void setEsDomain(String esDomain) {
		this.esDomain = esDomain;
	}

	public String getEsNbr() {
		return this.esNbr;
	}

	public void setEsNbr(String esNbr) {
		this.esNbr = esNbr;
	}

	public String getEsPrefix() {
		return this.esPrefix;
	}

	public void setEsPrefix(String esPrefix) {
		this.esPrefix = esPrefix;
	}

	public Integer getEsItmLine() {
		return this.esItmLine;
	}

	public void setEsItmLine(Integer esItmLine) {
		this.esItmLine = esItmLine;
	}

	public String getEsCaStatus() {
		return this.esCaStatus;
	}

	public void setEsCaStatus(String esCaStatus) {
		this.esCaStatus = esCaStatus;
	}

	public String getEsCaIntType() {
		return this.esCaIntType;
	}

	public void setEsCaIntType(String esCaIntType) {
		this.esCaIntType = esCaIntType;
	}

	public String getEsCaType() {
		return this.esCaType;
	}

	public void setEsCaType(String esCaType) {
		this.esCaType = esCaType;
	}

	public String getEsCaSeverity() {
		return this.esCaSeverity;
	}

	public void setEsCaSeverity(String esCaSeverity) {
		this.esCaSeverity = esCaSeverity;
	}

	public String getEsCaProblem() {
		return this.esCaProblem;
	}

	public void setEsCaProblem(String esCaProblem) {
		this.esCaProblem = esCaProblem;
	}

	public Integer getEsSeq() {
		return this.esSeq;
	}

	public void setEsSeq(Integer esSeq) {
		this.esSeq = esSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsMstrId))
			return false;
		AbstractEsMstrId castOther = (AbstractEsMstrId) other;

		return ((this.getEsDomain() == castOther.getEsDomain()) || (this
				.getEsDomain() != null
				&& castOther.getEsDomain() != null && this.getEsDomain()
				.equals(castOther.getEsDomain())))
				&& ((this.getEsNbr() == castOther.getEsNbr()) || (this
						.getEsNbr() != null
						&& castOther.getEsNbr() != null && this.getEsNbr()
						.equals(castOther.getEsNbr())))
				&& ((this.getEsPrefix() == castOther.getEsPrefix()) || (this
						.getEsPrefix() != null
						&& castOther.getEsPrefix() != null && this
						.getEsPrefix().equals(castOther.getEsPrefix())))
				&& ((this.getEsItmLine() == castOther.getEsItmLine()) || (this
						.getEsItmLine() != null
						&& castOther.getEsItmLine() != null && this
						.getEsItmLine().equals(castOther.getEsItmLine())))
				&& ((this.getEsCaStatus() == castOther.getEsCaStatus()) || (this
						.getEsCaStatus() != null
						&& castOther.getEsCaStatus() != null && this
						.getEsCaStatus().equals(castOther.getEsCaStatus())))
				&& ((this.getEsCaIntType() == castOther.getEsCaIntType()) || (this
						.getEsCaIntType() != null
						&& castOther.getEsCaIntType() != null && this
						.getEsCaIntType().equals(castOther.getEsCaIntType())))
				&& ((this.getEsCaType() == castOther.getEsCaType()) || (this
						.getEsCaType() != null
						&& castOther.getEsCaType() != null && this
						.getEsCaType().equals(castOther.getEsCaType())))
				&& ((this.getEsCaSeverity() == castOther.getEsCaSeverity()) || (this
						.getEsCaSeverity() != null
						&& castOther.getEsCaSeverity() != null && this
						.getEsCaSeverity().equals(castOther.getEsCaSeverity())))
				&& ((this.getEsCaProblem() == castOther.getEsCaProblem()) || (this
						.getEsCaProblem() != null
						&& castOther.getEsCaProblem() != null && this
						.getEsCaProblem().equals(castOther.getEsCaProblem())))
				&& ((this.getEsSeq() == castOther.getEsSeq()) || (this
						.getEsSeq() != null
						&& castOther.getEsSeq() != null && this.getEsSeq()
						.equals(castOther.getEsSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEsDomain() == null ? 0 : this.getEsDomain().hashCode());
		result = 37 * result
				+ (getEsNbr() == null ? 0 : this.getEsNbr().hashCode());
		result = 37 * result
				+ (getEsPrefix() == null ? 0 : this.getEsPrefix().hashCode());
		result = 37 * result
				+ (getEsItmLine() == null ? 0 : this.getEsItmLine().hashCode());
		result = 37
				* result
				+ (getEsCaStatus() == null ? 0 : this.getEsCaStatus()
						.hashCode());
		result = 37
				* result
				+ (getEsCaIntType() == null ? 0 : this.getEsCaIntType()
						.hashCode());
		result = 37 * result
				+ (getEsCaType() == null ? 0 : this.getEsCaType().hashCode());
		result = 37
				* result
				+ (getEsCaSeverity() == null ? 0 : this.getEsCaSeverity()
						.hashCode());
		result = 37
				* result
				+ (getEsCaProblem() == null ? 0 : this.getEsCaProblem()
						.hashCode());
		result = 37 * result
				+ (getEsSeq() == null ? 0 : this.getEsSeq().hashCode());
		return result;
	}

}