package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcxRefId entity provides the base persistence definition of the
 * EcxRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcxRefId implements java.io.Serializable {

	// Fields

	private String ecxDomain;
	private String ecxOrderType;
	private String ecxNbr;
	private String ecxLine;
	private String ecxSite;
	private String ecxLineSite;

	// Constructors

	/** default constructor */
	public AbstractEcxRefId() {
	}

	/** full constructor */
	public AbstractEcxRefId(String ecxDomain, String ecxOrderType,
			String ecxNbr, String ecxLine, String ecxSite, String ecxLineSite) {
		this.ecxDomain = ecxDomain;
		this.ecxOrderType = ecxOrderType;
		this.ecxNbr = ecxNbr;
		this.ecxLine = ecxLine;
		this.ecxSite = ecxSite;
		this.ecxLineSite = ecxLineSite;
	}

	// Property accessors

	public String getEcxDomain() {
		return this.ecxDomain;
	}

	public void setEcxDomain(String ecxDomain) {
		this.ecxDomain = ecxDomain;
	}

	public String getEcxOrderType() {
		return this.ecxOrderType;
	}

	public void setEcxOrderType(String ecxOrderType) {
		this.ecxOrderType = ecxOrderType;
	}

	public String getEcxNbr() {
		return this.ecxNbr;
	}

	public void setEcxNbr(String ecxNbr) {
		this.ecxNbr = ecxNbr;
	}

	public String getEcxLine() {
		return this.ecxLine;
	}

	public void setEcxLine(String ecxLine) {
		this.ecxLine = ecxLine;
	}

	public String getEcxSite() {
		return this.ecxSite;
	}

	public void setEcxSite(String ecxSite) {
		this.ecxSite = ecxSite;
	}

	public String getEcxLineSite() {
		return this.ecxLineSite;
	}

	public void setEcxLineSite(String ecxLineSite) {
		this.ecxLineSite = ecxLineSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcxRefId))
			return false;
		AbstractEcxRefId castOther = (AbstractEcxRefId) other;

		return ((this.getEcxDomain() == castOther.getEcxDomain()) || (this
				.getEcxDomain() != null
				&& castOther.getEcxDomain() != null && this.getEcxDomain()
				.equals(castOther.getEcxDomain())))
				&& ((this.getEcxOrderType() == castOther.getEcxOrderType()) || (this
						.getEcxOrderType() != null
						&& castOther.getEcxOrderType() != null && this
						.getEcxOrderType().equals(castOther.getEcxOrderType())))
				&& ((this.getEcxNbr() == castOther.getEcxNbr()) || (this
						.getEcxNbr() != null
						&& castOther.getEcxNbr() != null && this.getEcxNbr()
						.equals(castOther.getEcxNbr())))
				&& ((this.getEcxLine() == castOther.getEcxLine()) || (this
						.getEcxLine() != null
						&& castOther.getEcxLine() != null && this.getEcxLine()
						.equals(castOther.getEcxLine())))
				&& ((this.getEcxSite() == castOther.getEcxSite()) || (this
						.getEcxSite() != null
						&& castOther.getEcxSite() != null && this.getEcxSite()
						.equals(castOther.getEcxSite())))
				&& ((this.getEcxLineSite() == castOther.getEcxLineSite()) || (this
						.getEcxLineSite() != null
						&& castOther.getEcxLineSite() != null && this
						.getEcxLineSite().equals(castOther.getEcxLineSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEcxDomain() == null ? 0 : this.getEcxDomain().hashCode());
		result = 37
				* result
				+ (getEcxOrderType() == null ? 0 : this.getEcxOrderType()
						.hashCode());
		result = 37 * result
				+ (getEcxNbr() == null ? 0 : this.getEcxNbr().hashCode());
		result = 37 * result
				+ (getEcxLine() == null ? 0 : this.getEcxLine().hashCode());
		result = 37 * result
				+ (getEcxSite() == null ? 0 : this.getEcxSite().hashCode());
		result = 37
				* result
				+ (getEcxLineSite() == null ? 0 : this.getEcxLineSite()
						.hashCode());
		return result;
	}

}