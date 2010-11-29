package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUsrgdDetId entity provides the base persistence definition of the
 * UsrgdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrgdDetId implements java.io.Serializable {

	// Fields

	private Double oidUsrgMstr;
	private String usrgdDomain;
	private String usrgdUserid;

	// Constructors

	/** default constructor */
	public AbstractUsrgdDetId() {
	}

	/** full constructor */
	public AbstractUsrgdDetId(Double oidUsrgMstr, String usrgdDomain,
			String usrgdUserid) {
		this.oidUsrgMstr = oidUsrgMstr;
		this.usrgdDomain = usrgdDomain;
		this.usrgdUserid = usrgdUserid;
	}

	// Property accessors

	public Double getOidUsrgMstr() {
		return this.oidUsrgMstr;
	}

	public void setOidUsrgMstr(Double oidUsrgMstr) {
		this.oidUsrgMstr = oidUsrgMstr;
	}

	public String getUsrgdDomain() {
		return this.usrgdDomain;
	}

	public void setUsrgdDomain(String usrgdDomain) {
		this.usrgdDomain = usrgdDomain;
	}

	public String getUsrgdUserid() {
		return this.usrgdUserid;
	}

	public void setUsrgdUserid(String usrgdUserid) {
		this.usrgdUserid = usrgdUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUsrgdDetId))
			return false;
		AbstractUsrgdDetId castOther = (AbstractUsrgdDetId) other;

		return ((this.getOidUsrgMstr() == castOther.getOidUsrgMstr()) || (this
				.getOidUsrgMstr() != null
				&& castOther.getOidUsrgMstr() != null && this.getOidUsrgMstr()
				.equals(castOther.getOidUsrgMstr())))
				&& ((this.getUsrgdDomain() == castOther.getUsrgdDomain()) || (this
						.getUsrgdDomain() != null
						&& castOther.getUsrgdDomain() != null && this
						.getUsrgdDomain().equals(castOther.getUsrgdDomain())))
				&& ((this.getUsrgdUserid() == castOther.getUsrgdUserid()) || (this
						.getUsrgdUserid() != null
						&& castOther.getUsrgdUserid() != null && this
						.getUsrgdUserid().equals(castOther.getUsrgdUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOidUsrgMstr() == null ? 0 : this.getOidUsrgMstr()
						.hashCode());
		result = 37
				* result
				+ (getUsrgdDomain() == null ? 0 : this.getUsrgdDomain()
						.hashCode());
		result = 37
				* result
				+ (getUsrgdUserid() == null ? 0 : this.getUsrgdUserid()
						.hashCode());
		return result;
	}

}