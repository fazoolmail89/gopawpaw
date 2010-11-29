package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractItsMstrId entity provides the base persistence definition of the
 * ItsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItsMstrId implements java.io.Serializable {

	// Fields

	private String itsDomain;
	private String itsPart;
	private String itsSite;

	// Constructors

	/** default constructor */
	public AbstractItsMstrId() {
	}

	/** minimal constructor */
	public AbstractItsMstrId(String itsDomain) {
		this.itsDomain = itsDomain;
	}

	/** full constructor */
	public AbstractItsMstrId(String itsDomain, String itsPart, String itsSite) {
		this.itsDomain = itsDomain;
		this.itsPart = itsPart;
		this.itsSite = itsSite;
	}

	// Property accessors

	public String getItsDomain() {
		return this.itsDomain;
	}

	public void setItsDomain(String itsDomain) {
		this.itsDomain = itsDomain;
	}

	public String getItsPart() {
		return this.itsPart;
	}

	public void setItsPart(String itsPart) {
		this.itsPart = itsPart;
	}

	public String getItsSite() {
		return this.itsSite;
	}

	public void setItsSite(String itsSite) {
		this.itsSite = itsSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractItsMstrId))
			return false;
		AbstractItsMstrId castOther = (AbstractItsMstrId) other;

		return ((this.getItsDomain() == castOther.getItsDomain()) || (this
				.getItsDomain() != null
				&& castOther.getItsDomain() != null && this.getItsDomain()
				.equals(castOther.getItsDomain())))
				&& ((this.getItsPart() == castOther.getItsPart()) || (this
						.getItsPart() != null
						&& castOther.getItsPart() != null && this.getItsPart()
						.equals(castOther.getItsPart())))
				&& ((this.getItsSite() == castOther.getItsSite()) || (this
						.getItsSite() != null
						&& castOther.getItsSite() != null && this.getItsSite()
						.equals(castOther.getItsSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getItsDomain() == null ? 0 : this.getItsDomain().hashCode());
		result = 37 * result
				+ (getItsPart() == null ? 0 : this.getItsPart().hashCode());
		result = 37 * result
				+ (getItsSite() == null ? 0 : this.getItsSite().hashCode());
		return result;
	}

}