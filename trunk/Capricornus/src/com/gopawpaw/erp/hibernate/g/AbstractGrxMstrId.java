package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrxMstrId entity provides the base persistence definition of the
 * GrxMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrxMstrId implements java.io.Serializable {

	// Fields

	private String grxDomain;
	private String grxReport;

	// Constructors

	/** default constructor */
	public AbstractGrxMstrId() {
	}

	/** minimal constructor */
	public AbstractGrxMstrId(String grxDomain) {
		this.grxDomain = grxDomain;
	}

	/** full constructor */
	public AbstractGrxMstrId(String grxDomain, String grxReport) {
		this.grxDomain = grxDomain;
		this.grxReport = grxReport;
	}

	// Property accessors

	public String getGrxDomain() {
		return this.grxDomain;
	}

	public void setGrxDomain(String grxDomain) {
		this.grxDomain = grxDomain;
	}

	public String getGrxReport() {
		return this.grxReport;
	}

	public void setGrxReport(String grxReport) {
		this.grxReport = grxReport;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrxMstrId))
			return false;
		AbstractGrxMstrId castOther = (AbstractGrxMstrId) other;

		return ((this.getGrxDomain() == castOther.getGrxDomain()) || (this
				.getGrxDomain() != null
				&& castOther.getGrxDomain() != null && this.getGrxDomain()
				.equals(castOther.getGrxDomain())))
				&& ((this.getGrxReport() == castOther.getGrxReport()) || (this
						.getGrxReport() != null
						&& castOther.getGrxReport() != null && this
						.getGrxReport().equals(castOther.getGrxReport())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGrxDomain() == null ? 0 : this.getGrxDomain().hashCode());
		result = 37 * result
				+ (getGrxReport() == null ? 0 : this.getGrxReport().hashCode());
		return result;
	}

}