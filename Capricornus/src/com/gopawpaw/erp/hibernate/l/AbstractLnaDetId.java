package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLnaDetId entity provides the base persistence definition of the
 * LnaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLnaDetId implements java.io.Serializable {

	// Fields

	private String lnaDomain;
	private String lnaSite;
	private String lnaLine;
	private String lnaPart;

	// Constructors

	/** default constructor */
	public AbstractLnaDetId() {
	}

	/** full constructor */
	public AbstractLnaDetId(String lnaDomain, String lnaSite, String lnaLine,
			String lnaPart) {
		this.lnaDomain = lnaDomain;
		this.lnaSite = lnaSite;
		this.lnaLine = lnaLine;
		this.lnaPart = lnaPart;
	}

	// Property accessors

	public String getLnaDomain() {
		return this.lnaDomain;
	}

	public void setLnaDomain(String lnaDomain) {
		this.lnaDomain = lnaDomain;
	}

	public String getLnaSite() {
		return this.lnaSite;
	}

	public void setLnaSite(String lnaSite) {
		this.lnaSite = lnaSite;
	}

	public String getLnaLine() {
		return this.lnaLine;
	}

	public void setLnaLine(String lnaLine) {
		this.lnaLine = lnaLine;
	}

	public String getLnaPart() {
		return this.lnaPart;
	}

	public void setLnaPart(String lnaPart) {
		this.lnaPart = lnaPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLnaDetId))
			return false;
		AbstractLnaDetId castOther = (AbstractLnaDetId) other;

		return ((this.getLnaDomain() == castOther.getLnaDomain()) || (this
				.getLnaDomain() != null
				&& castOther.getLnaDomain() != null && this.getLnaDomain()
				.equals(castOther.getLnaDomain())))
				&& ((this.getLnaSite() == castOther.getLnaSite()) || (this
						.getLnaSite() != null
						&& castOther.getLnaSite() != null && this.getLnaSite()
						.equals(castOther.getLnaSite())))
				&& ((this.getLnaLine() == castOther.getLnaLine()) || (this
						.getLnaLine() != null
						&& castOther.getLnaLine() != null && this.getLnaLine()
						.equals(castOther.getLnaLine())))
				&& ((this.getLnaPart() == castOther.getLnaPart()) || (this
						.getLnaPart() != null
						&& castOther.getLnaPart() != null && this.getLnaPart()
						.equals(castOther.getLnaPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLnaDomain() == null ? 0 : this.getLnaDomain().hashCode());
		result = 37 * result
				+ (getLnaSite() == null ? 0 : this.getLnaSite().hashCode());
		result = 37 * result
				+ (getLnaLine() == null ? 0 : this.getLnaLine().hashCode());
		result = 37 * result
				+ (getLnaPart() == null ? 0 : this.getLnaPart().hashCode());
		return result;
	}

}