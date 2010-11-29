package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEssMstrId entity provides the base persistence definition of the
 * EssMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEssMstrId implements java.io.Serializable {

	// Fields

	private String essDomain;
	private String essStatus;

	// Constructors

	/** default constructor */
	public AbstractEssMstrId() {
	}

	/** minimal constructor */
	public AbstractEssMstrId(String essDomain) {
		this.essDomain = essDomain;
	}

	/** full constructor */
	public AbstractEssMstrId(String essDomain, String essStatus) {
		this.essDomain = essDomain;
		this.essStatus = essStatus;
	}

	// Property accessors

	public String getEssDomain() {
		return this.essDomain;
	}

	public void setEssDomain(String essDomain) {
		this.essDomain = essDomain;
	}

	public String getEssStatus() {
		return this.essStatus;
	}

	public void setEssStatus(String essStatus) {
		this.essStatus = essStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEssMstrId))
			return false;
		AbstractEssMstrId castOther = (AbstractEssMstrId) other;

		return ((this.getEssDomain() == castOther.getEssDomain()) || (this
				.getEssDomain() != null
				&& castOther.getEssDomain() != null && this.getEssDomain()
				.equals(castOther.getEssDomain())))
				&& ((this.getEssStatus() == castOther.getEssStatus()) || (this
						.getEssStatus() != null
						&& castOther.getEssStatus() != null && this
						.getEssStatus().equals(castOther.getEssStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEssDomain() == null ? 0 : this.getEssDomain().hashCode());
		result = 37 * result
				+ (getEssStatus() == null ? 0 : this.getEssStatus().hashCode());
		return result;
	}

}