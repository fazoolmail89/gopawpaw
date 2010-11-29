package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRsMstrId entity provides the base persistence definition of the
 * RsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsMstrId implements java.io.Serializable {

	// Fields

	private String rsDomain;
	private String rsRsc;
	private String rsSite;

	// Constructors

	/** default constructor */
	public AbstractRsMstrId() {
	}

	/** minimal constructor */
	public AbstractRsMstrId(String rsDomain, String rsRsc) {
		this.rsDomain = rsDomain;
		this.rsRsc = rsRsc;
	}

	/** full constructor */
	public AbstractRsMstrId(String rsDomain, String rsRsc, String rsSite) {
		this.rsDomain = rsDomain;
		this.rsRsc = rsRsc;
		this.rsSite = rsSite;
	}

	// Property accessors

	public String getRsDomain() {
		return this.rsDomain;
	}

	public void setRsDomain(String rsDomain) {
		this.rsDomain = rsDomain;
	}

	public String getRsRsc() {
		return this.rsRsc;
	}

	public void setRsRsc(String rsRsc) {
		this.rsRsc = rsRsc;
	}

	public String getRsSite() {
		return this.rsSite;
	}

	public void setRsSite(String rsSite) {
		this.rsSite = rsSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRsMstrId))
			return false;
		AbstractRsMstrId castOther = (AbstractRsMstrId) other;

		return ((this.getRsDomain() == castOther.getRsDomain()) || (this
				.getRsDomain() != null
				&& castOther.getRsDomain() != null && this.getRsDomain()
				.equals(castOther.getRsDomain())))
				&& ((this.getRsRsc() == castOther.getRsRsc()) || (this
						.getRsRsc() != null
						&& castOther.getRsRsc() != null && this.getRsRsc()
						.equals(castOther.getRsRsc())))
				&& ((this.getRsSite() == castOther.getRsSite()) || (this
						.getRsSite() != null
						&& castOther.getRsSite() != null && this.getRsSite()
						.equals(castOther.getRsSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRsDomain() == null ? 0 : this.getRsDomain().hashCode());
		result = 37 * result
				+ (getRsRsc() == null ? 0 : this.getRsRsc().hashCode());
		result = 37 * result
				+ (getRsSite() == null ? 0 : this.getRsSite().hashCode());
		return result;
	}

}