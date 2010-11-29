package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUddDetId entity provides the base persistence definition of the
 * UddDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUddDetId implements java.io.Serializable {

	// Fields

	private String uddUserid;
	private String uddDomain;

	// Constructors

	/** default constructor */
	public AbstractUddDetId() {
	}

	/** full constructor */
	public AbstractUddDetId(String uddUserid, String uddDomain) {
		this.uddUserid = uddUserid;
		this.uddDomain = uddDomain;
	}

	// Property accessors

	public String getUddUserid() {
		return this.uddUserid;
	}

	public void setUddUserid(String uddUserid) {
		this.uddUserid = uddUserid;
	}

	public String getUddDomain() {
		return this.uddDomain;
	}

	public void setUddDomain(String uddDomain) {
		this.uddDomain = uddDomain;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUddDetId))
			return false;
		AbstractUddDetId castOther = (AbstractUddDetId) other;

		return ((this.getUddUserid() == castOther.getUddUserid()) || (this
				.getUddUserid() != null
				&& castOther.getUddUserid() != null && this.getUddUserid()
				.equals(castOther.getUddUserid())))
				&& ((this.getUddDomain() == castOther.getUddDomain()) || (this
						.getUddDomain() != null
						&& castOther.getUddDomain() != null && this
						.getUddDomain().equals(castOther.getUddDomain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUddUserid() == null ? 0 : this.getUddUserid().hashCode());
		result = 37 * result
				+ (getUddDomain() == null ? 0 : this.getUddDomain().hashCode());
		return result;
	}

}