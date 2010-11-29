package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEcmMstrId entity provides the base persistence definition of the
 * EcmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcmMstrId implements java.io.Serializable {

	// Fields

	private String ecmDomain;
	private String ecmNbr;

	// Constructors

	/** default constructor */
	public AbstractEcmMstrId() {
	}

	/** minimal constructor */
	public AbstractEcmMstrId(String ecmDomain) {
		this.ecmDomain = ecmDomain;
	}

	/** full constructor */
	public AbstractEcmMstrId(String ecmDomain, String ecmNbr) {
		this.ecmDomain = ecmDomain;
		this.ecmNbr = ecmNbr;
	}

	// Property accessors

	public String getEcmDomain() {
		return this.ecmDomain;
	}

	public void setEcmDomain(String ecmDomain) {
		this.ecmDomain = ecmDomain;
	}

	public String getEcmNbr() {
		return this.ecmNbr;
	}

	public void setEcmNbr(String ecmNbr) {
		this.ecmNbr = ecmNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcmMstrId))
			return false;
		AbstractEcmMstrId castOther = (AbstractEcmMstrId) other;

		return ((this.getEcmDomain() == castOther.getEcmDomain()) || (this
				.getEcmDomain() != null
				&& castOther.getEcmDomain() != null && this.getEcmDomain()
				.equals(castOther.getEcmDomain())))
				&& ((this.getEcmNbr() == castOther.getEcmNbr()) || (this
						.getEcmNbr() != null
						&& castOther.getEcmNbr() != null && this.getEcmNbr()
						.equals(castOther.getEcmNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEcmDomain() == null ? 0 : this.getEcmDomain().hashCode());
		result = 37 * result
				+ (getEcmNbr() == null ? 0 : this.getEcmNbr().hashCode());
		return result;
	}

}