package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLnMstrId entity provides the base persistence definition of the
 * LnMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLnMstrId implements java.io.Serializable {

	// Fields

	private String lnDomain;
	private String lnLine;
	private String lnSite;

	// Constructors

	/** default constructor */
	public AbstractLnMstrId() {
	}

	/** minimal constructor */
	public AbstractLnMstrId(String lnDomain) {
		this.lnDomain = lnDomain;
	}

	/** full constructor */
	public AbstractLnMstrId(String lnDomain, String lnLine, String lnSite) {
		this.lnDomain = lnDomain;
		this.lnLine = lnLine;
		this.lnSite = lnSite;
	}

	// Property accessors

	public String getLnDomain() {
		return this.lnDomain;
	}

	public void setLnDomain(String lnDomain) {
		this.lnDomain = lnDomain;
	}

	public String getLnLine() {
		return this.lnLine;
	}

	public void setLnLine(String lnLine) {
		this.lnLine = lnLine;
	}

	public String getLnSite() {
		return this.lnSite;
	}

	public void setLnSite(String lnSite) {
		this.lnSite = lnSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLnMstrId))
			return false;
		AbstractLnMstrId castOther = (AbstractLnMstrId) other;

		return ((this.getLnDomain() == castOther.getLnDomain()) || (this
				.getLnDomain() != null
				&& castOther.getLnDomain() != null && this.getLnDomain()
				.equals(castOther.getLnDomain())))
				&& ((this.getLnLine() == castOther.getLnLine()) || (this
						.getLnLine() != null
						&& castOther.getLnLine() != null && this.getLnLine()
						.equals(castOther.getLnLine())))
				&& ((this.getLnSite() == castOther.getLnSite()) || (this
						.getLnSite() != null
						&& castOther.getLnSite() != null && this.getLnSite()
						.equals(castOther.getLnSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLnDomain() == null ? 0 : this.getLnDomain().hashCode());
		result = 37 * result
				+ (getLnLine() == null ? 0 : this.getLnLine().hashCode());
		result = 37 * result
				+ (getLnSite() == null ? 0 : this.getLnSite().hashCode());
		return result;
	}

}