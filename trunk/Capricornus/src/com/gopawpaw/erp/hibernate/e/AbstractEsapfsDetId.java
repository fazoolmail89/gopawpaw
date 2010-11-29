package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsapfsDetId entity provides the base persistence definition of the
 * EsapfsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfsDetId implements java.io.Serializable {

	// Fields

	private Double oidEsapMstr;
	private String esapfsSetName;

	// Constructors

	/** default constructor */
	public AbstractEsapfsDetId() {
	}

	/** full constructor */
	public AbstractEsapfsDetId(Double oidEsapMstr, String esapfsSetName) {
		this.oidEsapMstr = oidEsapMstr;
		this.esapfsSetName = esapfsSetName;
	}

	// Property accessors

	public Double getOidEsapMstr() {
		return this.oidEsapMstr;
	}

	public void setOidEsapMstr(Double oidEsapMstr) {
		this.oidEsapMstr = oidEsapMstr;
	}

	public String getEsapfsSetName() {
		return this.esapfsSetName;
	}

	public void setEsapfsSetName(String esapfsSetName) {
		this.esapfsSetName = esapfsSetName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsapfsDetId))
			return false;
		AbstractEsapfsDetId castOther = (AbstractEsapfsDetId) other;

		return ((this.getOidEsapMstr() == castOther.getOidEsapMstr()) || (this
				.getOidEsapMstr() != null
				&& castOther.getOidEsapMstr() != null && this.getOidEsapMstr()
				.equals(castOther.getOidEsapMstr())))
				&& ((this.getEsapfsSetName() == castOther.getEsapfsSetName()) || (this
						.getEsapfsSetName() != null
						&& castOther.getEsapfsSetName() != null && this
						.getEsapfsSetName()
						.equals(castOther.getEsapfsSetName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsapMstr() == null ? 0 : this.getOidEsapMstr()
						.hashCode());
		result = 37
				* result
				+ (getEsapfsSetName() == null ? 0 : this.getEsapfsSetName()
						.hashCode());
		return result;
	}

}