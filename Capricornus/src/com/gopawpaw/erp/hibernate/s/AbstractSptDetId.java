package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSptDetId entity provides the base persistence definition of the
 * SptDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSptDetId implements java.io.Serializable {

	// Fields

	private String sptDomain;
	private String sptSite;
	private String sptSim;
	private String sptPart;
	private String sptElement;

	// Constructors

	/** default constructor */
	public AbstractSptDetId() {
	}

	/** minimal constructor */
	public AbstractSptDetId(String sptDomain) {
		this.sptDomain = sptDomain;
	}

	/** full constructor */
	public AbstractSptDetId(String sptDomain, String sptSite, String sptSim,
			String sptPart, String sptElement) {
		this.sptDomain = sptDomain;
		this.sptSite = sptSite;
		this.sptSim = sptSim;
		this.sptPart = sptPart;
		this.sptElement = sptElement;
	}

	// Property accessors

	public String getSptDomain() {
		return this.sptDomain;
	}

	public void setSptDomain(String sptDomain) {
		this.sptDomain = sptDomain;
	}

	public String getSptSite() {
		return this.sptSite;
	}

	public void setSptSite(String sptSite) {
		this.sptSite = sptSite;
	}

	public String getSptSim() {
		return this.sptSim;
	}

	public void setSptSim(String sptSim) {
		this.sptSim = sptSim;
	}

	public String getSptPart() {
		return this.sptPart;
	}

	public void setSptPart(String sptPart) {
		this.sptPart = sptPart;
	}

	public String getSptElement() {
		return this.sptElement;
	}

	public void setSptElement(String sptElement) {
		this.sptElement = sptElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSptDetId))
			return false;
		AbstractSptDetId castOther = (AbstractSptDetId) other;

		return ((this.getSptDomain() == castOther.getSptDomain()) || (this
				.getSptDomain() != null
				&& castOther.getSptDomain() != null && this.getSptDomain()
				.equals(castOther.getSptDomain())))
				&& ((this.getSptSite() == castOther.getSptSite()) || (this
						.getSptSite() != null
						&& castOther.getSptSite() != null && this.getSptSite()
						.equals(castOther.getSptSite())))
				&& ((this.getSptSim() == castOther.getSptSim()) || (this
						.getSptSim() != null
						&& castOther.getSptSim() != null && this.getSptSim()
						.equals(castOther.getSptSim())))
				&& ((this.getSptPart() == castOther.getSptPart()) || (this
						.getSptPart() != null
						&& castOther.getSptPart() != null && this.getSptPart()
						.equals(castOther.getSptPart())))
				&& ((this.getSptElement() == castOther.getSptElement()) || (this
						.getSptElement() != null
						&& castOther.getSptElement() != null && this
						.getSptElement().equals(castOther.getSptElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSptDomain() == null ? 0 : this.getSptDomain().hashCode());
		result = 37 * result
				+ (getSptSite() == null ? 0 : this.getSptSite().hashCode());
		result = 37 * result
				+ (getSptSim() == null ? 0 : this.getSptSim().hashCode());
		result = 37 * result
				+ (getSptPart() == null ? 0 : this.getSptPart().hashCode());
		result = 37
				* result
				+ (getSptElement() == null ? 0 : this.getSptElement()
						.hashCode());
		return result;
	}

}