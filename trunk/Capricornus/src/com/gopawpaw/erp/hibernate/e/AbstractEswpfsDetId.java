package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEswpfsDetId entity provides the base persistence definition of the
 * EswpfsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpfsDetId implements java.io.Serializable {

	// Fields

	private Double oidEswpMstr;
	private String eswpfsSetName;

	// Constructors

	/** default constructor */
	public AbstractEswpfsDetId() {
	}

	/** full constructor */
	public AbstractEswpfsDetId(Double oidEswpMstr, String eswpfsSetName) {
		this.oidEswpMstr = oidEswpMstr;
		this.eswpfsSetName = eswpfsSetName;
	}

	// Property accessors

	public Double getOidEswpMstr() {
		return this.oidEswpMstr;
	}

	public void setOidEswpMstr(Double oidEswpMstr) {
		this.oidEswpMstr = oidEswpMstr;
	}

	public String getEswpfsSetName() {
		return this.eswpfsSetName;
	}

	public void setEswpfsSetName(String eswpfsSetName) {
		this.eswpfsSetName = eswpfsSetName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEswpfsDetId))
			return false;
		AbstractEswpfsDetId castOther = (AbstractEswpfsDetId) other;

		return ((this.getOidEswpMstr() == castOther.getOidEswpMstr()) || (this
				.getOidEswpMstr() != null
				&& castOther.getOidEswpMstr() != null && this.getOidEswpMstr()
				.equals(castOther.getOidEswpMstr())))
				&& ((this.getEswpfsSetName() == castOther.getEswpfsSetName()) || (this
						.getEswpfsSetName() != null
						&& castOther.getEswpfsSetName() != null && this
						.getEswpfsSetName()
						.equals(castOther.getEswpfsSetName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidEswpMstr() == null ? 0 : this.getOidEswpMstr()
						.hashCode());
		result = 37
				* result
				+ (getEswpfsSetName() == null ? 0 : this.getEswpfsSetName()
						.hashCode());
		return result;
	}

}