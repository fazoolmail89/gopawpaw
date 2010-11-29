package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAtakDetId entity provides the base persistence definition of the
 * AtakDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtakDetId implements java.io.Serializable {

	// Fields

	private Double oidAtapMstr;
	private String atakFieldName;

	// Constructors

	/** default constructor */
	public AbstractAtakDetId() {
	}

	/** full constructor */
	public AbstractAtakDetId(Double oidAtapMstr, String atakFieldName) {
		this.oidAtapMstr = oidAtapMstr;
		this.atakFieldName = atakFieldName;
	}

	// Property accessors

	public Double getOidAtapMstr() {
		return this.oidAtapMstr;
	}

	public void setOidAtapMstr(Double oidAtapMstr) {
		this.oidAtapMstr = oidAtapMstr;
	}

	public String getAtakFieldName() {
		return this.atakFieldName;
	}

	public void setAtakFieldName(String atakFieldName) {
		this.atakFieldName = atakFieldName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAtakDetId))
			return false;
		AbstractAtakDetId castOther = (AbstractAtakDetId) other;

		return ((this.getOidAtapMstr() == castOther.getOidAtapMstr()) || (this
				.getOidAtapMstr() != null
				&& castOther.getOidAtapMstr() != null && this.getOidAtapMstr()
				.equals(castOther.getOidAtapMstr())))
				&& ((this.getAtakFieldName() == castOther.getAtakFieldName()) || (this
						.getAtakFieldName() != null
						&& castOther.getAtakFieldName() != null && this
						.getAtakFieldName()
						.equals(castOther.getAtakFieldName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidAtapMstr() == null ? 0 : this.getOidAtapMstr()
						.hashCode());
		result = 37
				* result
				+ (getAtakFieldName() == null ? 0 : this.getAtakFieldName()
						.hashCode());
		return result;
	}

}