package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsapmpRefId entity provides the base persistence definition of the
 * EsapmpRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapmpRefId implements java.io.Serializable {

	// Fields

	private Double oidEsapMstr;
	private String esapmpExec;

	// Constructors

	/** default constructor */
	public AbstractEsapmpRefId() {
	}

	/** full constructor */
	public AbstractEsapmpRefId(Double oidEsapMstr, String esapmpExec) {
		this.oidEsapMstr = oidEsapMstr;
		this.esapmpExec = esapmpExec;
	}

	// Property accessors

	public Double getOidEsapMstr() {
		return this.oidEsapMstr;
	}

	public void setOidEsapMstr(Double oidEsapMstr) {
		this.oidEsapMstr = oidEsapMstr;
	}

	public String getEsapmpExec() {
		return this.esapmpExec;
	}

	public void setEsapmpExec(String esapmpExec) {
		this.esapmpExec = esapmpExec;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEsapmpRefId))
			return false;
		AbstractEsapmpRefId castOther = (AbstractEsapmpRefId) other;

		return ((this.getOidEsapMstr() == castOther.getOidEsapMstr()) || (this
				.getOidEsapMstr() != null
				&& castOther.getOidEsapMstr() != null && this.getOidEsapMstr()
				.equals(castOther.getOidEsapMstr())))
				&& ((this.getEsapmpExec() == castOther.getEsapmpExec()) || (this
						.getEsapmpExec() != null
						&& castOther.getEsapmpExec() != null && this
						.getEsapmpExec().equals(castOther.getEsapmpExec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEsapMstr() == null ? 0 : this.getOidEsapMstr()
						.hashCode());
		result = 37
				* result
				+ (getEsapmpExec() == null ? 0 : this.getEsapmpExec()
						.hashCode());
		return result;
	}

}