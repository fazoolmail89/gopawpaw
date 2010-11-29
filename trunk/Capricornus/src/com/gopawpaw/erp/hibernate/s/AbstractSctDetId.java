package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSctDetId entity provides the base persistence definition of the
 * SctDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSctDetId implements java.io.Serializable {

	// Fields

	private String sctDomain;
	private String sctSim;
	private String sctPart;
	private String sctSite;

	// Constructors

	/** default constructor */
	public AbstractSctDetId() {
	}

	/** minimal constructor */
	public AbstractSctDetId(String sctDomain) {
		this.sctDomain = sctDomain;
	}

	/** full constructor */
	public AbstractSctDetId(String sctDomain, String sctSim, String sctPart,
			String sctSite) {
		this.sctDomain = sctDomain;
		this.sctSim = sctSim;
		this.sctPart = sctPart;
		this.sctSite = sctSite;
	}

	// Property accessors

	public String getSctDomain() {
		return this.sctDomain;
	}

	public void setSctDomain(String sctDomain) {
		this.sctDomain = sctDomain;
	}

	public String getSctSim() {
		return this.sctSim;
	}

	public void setSctSim(String sctSim) {
		this.sctSim = sctSim;
	}

	public String getSctPart() {
		return this.sctPart;
	}

	public void setSctPart(String sctPart) {
		this.sctPart = sctPart;
	}

	public String getSctSite() {
		return this.sctSite;
	}

	public void setSctSite(String sctSite) {
		this.sctSite = sctSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSctDetId))
			return false;
		AbstractSctDetId castOther = (AbstractSctDetId) other;

		return ((this.getSctDomain() == castOther.getSctDomain()) || (this
				.getSctDomain() != null
				&& castOther.getSctDomain() != null && this.getSctDomain()
				.equals(castOther.getSctDomain())))
				&& ((this.getSctSim() == castOther.getSctSim()) || (this
						.getSctSim() != null
						&& castOther.getSctSim() != null && this.getSctSim()
						.equals(castOther.getSctSim())))
				&& ((this.getSctPart() == castOther.getSctPart()) || (this
						.getSctPart() != null
						&& castOther.getSctPart() != null && this.getSctPart()
						.equals(castOther.getSctPart())))
				&& ((this.getSctSite() == castOther.getSctSite()) || (this
						.getSctSite() != null
						&& castOther.getSctSite() != null && this.getSctSite()
						.equals(castOther.getSctSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSctDomain() == null ? 0 : this.getSctDomain().hashCode());
		result = 37 * result
				+ (getSctSim() == null ? 0 : this.getSctSim().hashCode());
		result = 37 * result
				+ (getSctPart() == null ? 0 : this.getSctPart().hashCode());
		result = 37 * result
				+ (getSctSite() == null ? 0 : this.getSctSite().hashCode());
		return result;
	}

}