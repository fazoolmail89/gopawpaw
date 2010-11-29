package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEswpmpRefId entity provides the base persistence definition of the
 * EswpmpRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpmpRefId implements java.io.Serializable {

	// Fields

	private Double oidEswpMstr;
	private String eswpmpExec;

	// Constructors

	/** default constructor */
	public AbstractEswpmpRefId() {
	}

	/** full constructor */
	public AbstractEswpmpRefId(Double oidEswpMstr, String eswpmpExec) {
		this.oidEswpMstr = oidEswpMstr;
		this.eswpmpExec = eswpmpExec;
	}

	// Property accessors

	public Double getOidEswpMstr() {
		return this.oidEswpMstr;
	}

	public void setOidEswpMstr(Double oidEswpMstr) {
		this.oidEswpMstr = oidEswpMstr;
	}

	public String getEswpmpExec() {
		return this.eswpmpExec;
	}

	public void setEswpmpExec(String eswpmpExec) {
		this.eswpmpExec = eswpmpExec;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEswpmpRefId))
			return false;
		AbstractEswpmpRefId castOther = (AbstractEswpmpRefId) other;

		return ((this.getOidEswpMstr() == castOther.getOidEswpMstr()) || (this
				.getOidEswpMstr() != null
				&& castOther.getOidEswpMstr() != null && this.getOidEswpMstr()
				.equals(castOther.getOidEswpMstr())))
				&& ((this.getEswpmpExec() == castOther.getEswpmpExec()) || (this
						.getEswpmpExec() != null
						&& castOther.getEswpmpExec() != null && this
						.getEswpmpExec().equals(castOther.getEswpmpExec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEswpMstr() == null ? 0 : this.getOidEswpMstr()
						.hashCode());
		result = 37
				* result
				+ (getEswpmpExec() == null ? 0 : this.getEswpmpExec()
						.hashCode());
		return result;
	}

}