package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPldDetId entity provides the base persistence definition of the
 * PldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPldDetId implements java.io.Serializable {

	// Fields

	private String pldDomain;
	private String pldProdline;
	private String pldSite;
	private String pldLoc;

	// Constructors

	/** default constructor */
	public AbstractPldDetId() {
	}

	/** minimal constructor */
	public AbstractPldDetId(String pldDomain, String pldProdline) {
		this.pldDomain = pldDomain;
		this.pldProdline = pldProdline;
	}

	/** full constructor */
	public AbstractPldDetId(String pldDomain, String pldProdline,
			String pldSite, String pldLoc) {
		this.pldDomain = pldDomain;
		this.pldProdline = pldProdline;
		this.pldSite = pldSite;
		this.pldLoc = pldLoc;
	}

	// Property accessors

	public String getPldDomain() {
		return this.pldDomain;
	}

	public void setPldDomain(String pldDomain) {
		this.pldDomain = pldDomain;
	}

	public String getPldProdline() {
		return this.pldProdline;
	}

	public void setPldProdline(String pldProdline) {
		this.pldProdline = pldProdline;
	}

	public String getPldSite() {
		return this.pldSite;
	}

	public void setPldSite(String pldSite) {
		this.pldSite = pldSite;
	}

	public String getPldLoc() {
		return this.pldLoc;
	}

	public void setPldLoc(String pldLoc) {
		this.pldLoc = pldLoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPldDetId))
			return false;
		AbstractPldDetId castOther = (AbstractPldDetId) other;

		return ((this.getPldDomain() == castOther.getPldDomain()) || (this
				.getPldDomain() != null
				&& castOther.getPldDomain() != null && this.getPldDomain()
				.equals(castOther.getPldDomain())))
				&& ((this.getPldProdline() == castOther.getPldProdline()) || (this
						.getPldProdline() != null
						&& castOther.getPldProdline() != null && this
						.getPldProdline().equals(castOther.getPldProdline())))
				&& ((this.getPldSite() == castOther.getPldSite()) || (this
						.getPldSite() != null
						&& castOther.getPldSite() != null && this.getPldSite()
						.equals(castOther.getPldSite())))
				&& ((this.getPldLoc() == castOther.getPldLoc()) || (this
						.getPldLoc() != null
						&& castOther.getPldLoc() != null && this.getPldLoc()
						.equals(castOther.getPldLoc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPldDomain() == null ? 0 : this.getPldDomain().hashCode());
		result = 37
				* result
				+ (getPldProdline() == null ? 0 : this.getPldProdline()
						.hashCode());
		result = 37 * result
				+ (getPldSite() == null ? 0 : this.getPldSite().hashCode());
		result = 37 * result
				+ (getPldLoc() == null ? 0 : this.getPldLoc().hashCode());
		return result;
	}

}