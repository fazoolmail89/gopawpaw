package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAlmMstrId entity provides the base persistence definition of the
 * AlmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAlmMstrId implements java.io.Serializable {

	// Fields

	private String almDomain;
	private String almLotGrp;
	private String almSite;

	// Constructors

	/** default constructor */
	public AbstractAlmMstrId() {
	}

	/** minimal constructor */
	public AbstractAlmMstrId(String almDomain, String almLotGrp) {
		this.almDomain = almDomain;
		this.almLotGrp = almLotGrp;
	}

	/** full constructor */
	public AbstractAlmMstrId(String almDomain, String almLotGrp, String almSite) {
		this.almDomain = almDomain;
		this.almLotGrp = almLotGrp;
		this.almSite = almSite;
	}

	// Property accessors

	public String getAlmDomain() {
		return this.almDomain;
	}

	public void setAlmDomain(String almDomain) {
		this.almDomain = almDomain;
	}

	public String getAlmLotGrp() {
		return this.almLotGrp;
	}

	public void setAlmLotGrp(String almLotGrp) {
		this.almLotGrp = almLotGrp;
	}

	public String getAlmSite() {
		return this.almSite;
	}

	public void setAlmSite(String almSite) {
		this.almSite = almSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAlmMstrId))
			return false;
		AbstractAlmMstrId castOther = (AbstractAlmMstrId) other;

		return ((this.getAlmDomain() == castOther.getAlmDomain()) || (this
				.getAlmDomain() != null
				&& castOther.getAlmDomain() != null && this.getAlmDomain()
				.equals(castOther.getAlmDomain())))
				&& ((this.getAlmLotGrp() == castOther.getAlmLotGrp()) || (this
						.getAlmLotGrp() != null
						&& castOther.getAlmLotGrp() != null && this
						.getAlmLotGrp().equals(castOther.getAlmLotGrp())))
				&& ((this.getAlmSite() == castOther.getAlmSite()) || (this
						.getAlmSite() != null
						&& castOther.getAlmSite() != null && this.getAlmSite()
						.equals(castOther.getAlmSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAlmDomain() == null ? 0 : this.getAlmDomain().hashCode());
		result = 37 * result
				+ (getAlmLotGrp() == null ? 0 : this.getAlmLotGrp().hashCode());
		result = 37 * result
				+ (getAlmSite() == null ? 0 : this.getAlmSite().hashCode());
		return result;
	}

}