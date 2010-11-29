package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFpdCostId entity provides the base persistence definition of the
 * FpdCostId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpdCostId implements java.io.Serializable {

	// Fields

	private String fpdDomain;
	private String fpdSim;
	private String fpdSite;
	private String fpdPart;

	// Constructors

	/** default constructor */
	public AbstractFpdCostId() {
	}

	/** minimal constructor */
	public AbstractFpdCostId(String fpdDomain) {
		this.fpdDomain = fpdDomain;
	}

	/** full constructor */
	public AbstractFpdCostId(String fpdDomain, String fpdSim, String fpdSite,
			String fpdPart) {
		this.fpdDomain = fpdDomain;
		this.fpdSim = fpdSim;
		this.fpdSite = fpdSite;
		this.fpdPart = fpdPart;
	}

	// Property accessors

	public String getFpdDomain() {
		return this.fpdDomain;
	}

	public void setFpdDomain(String fpdDomain) {
		this.fpdDomain = fpdDomain;
	}

	public String getFpdSim() {
		return this.fpdSim;
	}

	public void setFpdSim(String fpdSim) {
		this.fpdSim = fpdSim;
	}

	public String getFpdSite() {
		return this.fpdSite;
	}

	public void setFpdSite(String fpdSite) {
		this.fpdSite = fpdSite;
	}

	public String getFpdPart() {
		return this.fpdPart;
	}

	public void setFpdPart(String fpdPart) {
		this.fpdPart = fpdPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFpdCostId))
			return false;
		AbstractFpdCostId castOther = (AbstractFpdCostId) other;

		return ((this.getFpdDomain() == castOther.getFpdDomain()) || (this
				.getFpdDomain() != null
				&& castOther.getFpdDomain() != null && this.getFpdDomain()
				.equals(castOther.getFpdDomain())))
				&& ((this.getFpdSim() == castOther.getFpdSim()) || (this
						.getFpdSim() != null
						&& castOther.getFpdSim() != null && this.getFpdSim()
						.equals(castOther.getFpdSim())))
				&& ((this.getFpdSite() == castOther.getFpdSite()) || (this
						.getFpdSite() != null
						&& castOther.getFpdSite() != null && this.getFpdSite()
						.equals(castOther.getFpdSite())))
				&& ((this.getFpdPart() == castOther.getFpdPart()) || (this
						.getFpdPart() != null
						&& castOther.getFpdPart() != null && this.getFpdPart()
						.equals(castOther.getFpdPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFpdDomain() == null ? 0 : this.getFpdDomain().hashCode());
		result = 37 * result
				+ (getFpdSim() == null ? 0 : this.getFpdSim().hashCode());
		result = 37 * result
				+ (getFpdSite() == null ? 0 : this.getFpdSite().hashCode());
		result = 37 * result
				+ (getFpdPart() == null ? 0 : this.getFpdPart().hashCode());
		return result;
	}

}