package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLnfDetId entity provides the base persistence definition of the
 * LnfDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLnfDetId implements java.io.Serializable {

	// Fields

	private String lnfDomain;
	private String lnfSite;
	private String lnfProductionLine;
	private String lnfPart;

	// Constructors

	/** default constructor */
	public AbstractLnfDetId() {
	}

	/** full constructor */
	public AbstractLnfDetId(String lnfDomain, String lnfSite,
			String lnfProductionLine, String lnfPart) {
		this.lnfDomain = lnfDomain;
		this.lnfSite = lnfSite;
		this.lnfProductionLine = lnfProductionLine;
		this.lnfPart = lnfPart;
	}

	// Property accessors

	public String getLnfDomain() {
		return this.lnfDomain;
	}

	public void setLnfDomain(String lnfDomain) {
		this.lnfDomain = lnfDomain;
	}

	public String getLnfSite() {
		return this.lnfSite;
	}

	public void setLnfSite(String lnfSite) {
		this.lnfSite = lnfSite;
	}

	public String getLnfProductionLine() {
		return this.lnfProductionLine;
	}

	public void setLnfProductionLine(String lnfProductionLine) {
		this.lnfProductionLine = lnfProductionLine;
	}

	public String getLnfPart() {
		return this.lnfPart;
	}

	public void setLnfPart(String lnfPart) {
		this.lnfPart = lnfPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLnfDetId))
			return false;
		AbstractLnfDetId castOther = (AbstractLnfDetId) other;

		return ((this.getLnfDomain() == castOther.getLnfDomain()) || (this
				.getLnfDomain() != null
				&& castOther.getLnfDomain() != null && this.getLnfDomain()
				.equals(castOther.getLnfDomain())))
				&& ((this.getLnfSite() == castOther.getLnfSite()) || (this
						.getLnfSite() != null
						&& castOther.getLnfSite() != null && this.getLnfSite()
						.equals(castOther.getLnfSite())))
				&& ((this.getLnfProductionLine() == castOther
						.getLnfProductionLine()) || (this
						.getLnfProductionLine() != null
						&& castOther.getLnfProductionLine() != null && this
						.getLnfProductionLine().equals(
								castOther.getLnfProductionLine())))
				&& ((this.getLnfPart() == castOther.getLnfPart()) || (this
						.getLnfPart() != null
						&& castOther.getLnfPart() != null && this.getLnfPart()
						.equals(castOther.getLnfPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLnfDomain() == null ? 0 : this.getLnfDomain().hashCode());
		result = 37 * result
				+ (getLnfSite() == null ? 0 : this.getLnfSite().hashCode());
		result = 37
				* result
				+ (getLnfProductionLine() == null ? 0 : this
						.getLnfProductionLine().hashCode());
		result = 37 * result
				+ (getLnfPart() == null ? 0 : this.getLnfPart().hashCode());
		return result;
	}

}