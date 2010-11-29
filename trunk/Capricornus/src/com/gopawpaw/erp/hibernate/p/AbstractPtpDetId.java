package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtpDetId entity provides the base persistence definition of the
 * PtpDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtpDetId implements java.io.Serializable {

	// Fields

	private String ptpDomain;
	private String ptpPart;
	private String ptpSite;

	// Constructors

	/** default constructor */
	public AbstractPtpDetId() {
	}

	/** minimal constructor */
	public AbstractPtpDetId(String ptpDomain, String ptpPart) {
		this.ptpDomain = ptpDomain;
		this.ptpPart = ptpPart;
	}

	/** full constructor */
	public AbstractPtpDetId(String ptpDomain, String ptpPart, String ptpSite) {
		this.ptpDomain = ptpDomain;
		this.ptpPart = ptpPart;
		this.ptpSite = ptpSite;
	}

	// Property accessors

	public String getPtpDomain() {
		return this.ptpDomain;
	}

	public void setPtpDomain(String ptpDomain) {
		this.ptpDomain = ptpDomain;
	}

	public String getPtpPart() {
		return this.ptpPart;
	}

	public void setPtpPart(String ptpPart) {
		this.ptpPart = ptpPart;
	}

	public String getPtpSite() {
		return this.ptpSite;
	}

	public void setPtpSite(String ptpSite) {
		this.ptpSite = ptpSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtpDetId))
			return false;
		AbstractPtpDetId castOther = (AbstractPtpDetId) other;

		return ((this.getPtpDomain() == castOther.getPtpDomain()) || (this
				.getPtpDomain() != null
				&& castOther.getPtpDomain() != null && this.getPtpDomain()
				.equals(castOther.getPtpDomain())))
				&& ((this.getPtpPart() == castOther.getPtpPart()) || (this
						.getPtpPart() != null
						&& castOther.getPtpPart() != null && this.getPtpPart()
						.equals(castOther.getPtpPart())))
				&& ((this.getPtpSite() == castOther.getPtpSite()) || (this
						.getPtpSite() != null
						&& castOther.getPtpSite() != null && this.getPtpSite()
						.equals(castOther.getPtpSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtpDomain() == null ? 0 : this.getPtpDomain().hashCode());
		result = 37 * result
				+ (getPtpPart() == null ? 0 : this.getPtpPart().hashCode());
		result = 37 * result
				+ (getPtpSite() == null ? 0 : this.getPtpSite().hashCode());
		return result;
	}

}