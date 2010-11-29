package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractChgMstrId entity provides the base persistence definition of the
 * ChgMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractChgMstrId implements java.io.Serializable {

	// Fields

	private String chgDomain;
	private String chgSite;
	private String chgLine;
	private String chgFrom;
	private String chgTo;

	// Constructors

	/** default constructor */
	public AbstractChgMstrId() {
	}

	/** minimal constructor */
	public AbstractChgMstrId(String chgDomain) {
		this.chgDomain = chgDomain;
	}

	/** full constructor */
	public AbstractChgMstrId(String chgDomain, String chgSite, String chgLine,
			String chgFrom, String chgTo) {
		this.chgDomain = chgDomain;
		this.chgSite = chgSite;
		this.chgLine = chgLine;
		this.chgFrom = chgFrom;
		this.chgTo = chgTo;
	}

	// Property accessors

	public String getChgDomain() {
		return this.chgDomain;
	}

	public void setChgDomain(String chgDomain) {
		this.chgDomain = chgDomain;
	}

	public String getChgSite() {
		return this.chgSite;
	}

	public void setChgSite(String chgSite) {
		this.chgSite = chgSite;
	}

	public String getChgLine() {
		return this.chgLine;
	}

	public void setChgLine(String chgLine) {
		this.chgLine = chgLine;
	}

	public String getChgFrom() {
		return this.chgFrom;
	}

	public void setChgFrom(String chgFrom) {
		this.chgFrom = chgFrom;
	}

	public String getChgTo() {
		return this.chgTo;
	}

	public void setChgTo(String chgTo) {
		this.chgTo = chgTo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractChgMstrId))
			return false;
		AbstractChgMstrId castOther = (AbstractChgMstrId) other;

		return ((this.getChgDomain() == castOther.getChgDomain()) || (this
				.getChgDomain() != null
				&& castOther.getChgDomain() != null && this.getChgDomain()
				.equals(castOther.getChgDomain())))
				&& ((this.getChgSite() == castOther.getChgSite()) || (this
						.getChgSite() != null
						&& castOther.getChgSite() != null && this.getChgSite()
						.equals(castOther.getChgSite())))
				&& ((this.getChgLine() == castOther.getChgLine()) || (this
						.getChgLine() != null
						&& castOther.getChgLine() != null && this.getChgLine()
						.equals(castOther.getChgLine())))
				&& ((this.getChgFrom() == castOther.getChgFrom()) || (this
						.getChgFrom() != null
						&& castOther.getChgFrom() != null && this.getChgFrom()
						.equals(castOther.getChgFrom())))
				&& ((this.getChgTo() == castOther.getChgTo()) || (this
						.getChgTo() != null
						&& castOther.getChgTo() != null && this.getChgTo()
						.equals(castOther.getChgTo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getChgDomain() == null ? 0 : this.getChgDomain().hashCode());
		result = 37 * result
				+ (getChgSite() == null ? 0 : this.getChgSite().hashCode());
		result = 37 * result
				+ (getChgLine() == null ? 0 : this.getChgLine().hashCode());
		result = 37 * result
				+ (getChgFrom() == null ? 0 : this.getChgFrom().hashCode());
		result = 37 * result
				+ (getChgTo() == null ? 0 : this.getChgTo().hashCode());
		return result;
	}

}