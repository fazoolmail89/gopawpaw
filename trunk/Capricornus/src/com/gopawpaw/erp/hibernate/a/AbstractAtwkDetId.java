package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAtwkDetId entity provides the base persistence definition of the
 * AtwkDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtwkDetId implements java.io.Serializable {

	// Fields

	private Double oidAtwpMstr;
	private String atwkFieldName;

	// Constructors

	/** default constructor */
	public AbstractAtwkDetId() {
	}

	/** full constructor */
	public AbstractAtwkDetId(Double oidAtwpMstr, String atwkFieldName) {
		this.oidAtwpMstr = oidAtwpMstr;
		this.atwkFieldName = atwkFieldName;
	}

	// Property accessors

	public Double getOidAtwpMstr() {
		return this.oidAtwpMstr;
	}

	public void setOidAtwpMstr(Double oidAtwpMstr) {
		this.oidAtwpMstr = oidAtwpMstr;
	}

	public String getAtwkFieldName() {
		return this.atwkFieldName;
	}

	public void setAtwkFieldName(String atwkFieldName) {
		this.atwkFieldName = atwkFieldName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtwkDetId))
			return false;
		AbstractAtwkDetId castOther = (AbstractAtwkDetId) other;

		return ((this.getOidAtwpMstr() == castOther.getOidAtwpMstr()) || (this
				.getOidAtwpMstr() != null
				&& castOther.getOidAtwpMstr() != null && this.getOidAtwpMstr()
				.equals(castOther.getOidAtwpMstr())))
				&& ((this.getAtwkFieldName() == castOther.getAtwkFieldName()) || (this
						.getAtwkFieldName() != null
						&& castOther.getAtwkFieldName() != null && this
						.getAtwkFieldName()
						.equals(castOther.getAtwkFieldName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidAtwpMstr() == null ? 0 : this.getOidAtwpMstr()
						.hashCode());
		result = 37
				* result
				+ (getAtwkFieldName() == null ? 0 : this.getAtwkFieldName()
						.hashCode());
		return result;
	}

}