package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqrMstrId entity provides the base persistence definition of the
 * RqrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqrMstrId implements java.io.Serializable {

	// Fields

	private String rqrDomain;
	private String rqrUserid;
	private String rqrRole;

	// Constructors

	/** default constructor */
	public AbstractRqrMstrId() {
	}

	/** minimal constructor */
	public AbstractRqrMstrId(String rqrDomain) {
		this.rqrDomain = rqrDomain;
	}

	/** full constructor */
	public AbstractRqrMstrId(String rqrDomain, String rqrUserid, String rqrRole) {
		this.rqrDomain = rqrDomain;
		this.rqrUserid = rqrUserid;
		this.rqrRole = rqrRole;
	}

	// Property accessors

	public String getRqrDomain() {
		return this.rqrDomain;
	}

	public void setRqrDomain(String rqrDomain) {
		this.rqrDomain = rqrDomain;
	}

	public String getRqrUserid() {
		return this.rqrUserid;
	}

	public void setRqrUserid(String rqrUserid) {
		this.rqrUserid = rqrUserid;
	}

	public String getRqrRole() {
		return this.rqrRole;
	}

	public void setRqrRole(String rqrRole) {
		this.rqrRole = rqrRole;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqrMstrId))
			return false;
		AbstractRqrMstrId castOther = (AbstractRqrMstrId) other;

		return ((this.getRqrDomain() == castOther.getRqrDomain()) || (this
				.getRqrDomain() != null
				&& castOther.getRqrDomain() != null && this.getRqrDomain()
				.equals(castOther.getRqrDomain())))
				&& ((this.getRqrUserid() == castOther.getRqrUserid()) || (this
						.getRqrUserid() != null
						&& castOther.getRqrUserid() != null && this
						.getRqrUserid().equals(castOther.getRqrUserid())))
				&& ((this.getRqrRole() == castOther.getRqrRole()) || (this
						.getRqrRole() != null
						&& castOther.getRqrRole() != null && this.getRqrRole()
						.equals(castOther.getRqrRole())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqrDomain() == null ? 0 : this.getRqrDomain().hashCode());
		result = 37 * result
				+ (getRqrUserid() == null ? 0 : this.getRqrUserid().hashCode());
		result = 37 * result
				+ (getRqrRole() == null ? 0 : this.getRqrRole().hashCode());
		return result;
	}

}