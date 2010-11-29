package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSrWkflId entity provides the base persistence definition of the
 * SrWkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSrWkflId implements java.io.Serializable {

	// Fields

	private String srDomain;
	private String srUserid;
	private String srLineid;
	private String srSite;
	private String srLoc;
	private String srLotser;
	private String srRef;

	// Constructors

	/** default constructor */
	public AbstractSrWkflId() {
	}

	/** minimal constructor */
	public AbstractSrWkflId(String srDomain) {
		this.srDomain = srDomain;
	}

	/** full constructor */
	public AbstractSrWkflId(String srDomain, String srUserid, String srLineid,
			String srSite, String srLoc, String srLotser, String srRef) {
		this.srDomain = srDomain;
		this.srUserid = srUserid;
		this.srLineid = srLineid;
		this.srSite = srSite;
		this.srLoc = srLoc;
		this.srLotser = srLotser;
		this.srRef = srRef;
	}

	// Property accessors

	public String getSrDomain() {
		return this.srDomain;
	}

	public void setSrDomain(String srDomain) {
		this.srDomain = srDomain;
	}

	public String getSrUserid() {
		return this.srUserid;
	}

	public void setSrUserid(String srUserid) {
		this.srUserid = srUserid;
	}

	public String getSrLineid() {
		return this.srLineid;
	}

	public void setSrLineid(String srLineid) {
		this.srLineid = srLineid;
	}

	public String getSrSite() {
		return this.srSite;
	}

	public void setSrSite(String srSite) {
		this.srSite = srSite;
	}

	public String getSrLoc() {
		return this.srLoc;
	}

	public void setSrLoc(String srLoc) {
		this.srLoc = srLoc;
	}

	public String getSrLotser() {
		return this.srLotser;
	}

	public void setSrLotser(String srLotser) {
		this.srLotser = srLotser;
	}

	public String getSrRef() {
		return this.srRef;
	}

	public void setSrRef(String srRef) {
		this.srRef = srRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSrWkflId))
			return false;
		AbstractSrWkflId castOther = (AbstractSrWkflId) other;

		return ((this.getSrDomain() == castOther.getSrDomain()) || (this
				.getSrDomain() != null
				&& castOther.getSrDomain() != null && this.getSrDomain()
				.equals(castOther.getSrDomain())))
				&& ((this.getSrUserid() == castOther.getSrUserid()) || (this
						.getSrUserid() != null
						&& castOther.getSrUserid() != null && this
						.getSrUserid().equals(castOther.getSrUserid())))
				&& ((this.getSrLineid() == castOther.getSrLineid()) || (this
						.getSrLineid() != null
						&& castOther.getSrLineid() != null && this
						.getSrLineid().equals(castOther.getSrLineid())))
				&& ((this.getSrSite() == castOther.getSrSite()) || (this
						.getSrSite() != null
						&& castOther.getSrSite() != null && this.getSrSite()
						.equals(castOther.getSrSite())))
				&& ((this.getSrLoc() == castOther.getSrLoc()) || (this
						.getSrLoc() != null
						&& castOther.getSrLoc() != null && this.getSrLoc()
						.equals(castOther.getSrLoc())))
				&& ((this.getSrLotser() == castOther.getSrLotser()) || (this
						.getSrLotser() != null
						&& castOther.getSrLotser() != null && this
						.getSrLotser().equals(castOther.getSrLotser())))
				&& ((this.getSrRef() == castOther.getSrRef()) || (this
						.getSrRef() != null
						&& castOther.getSrRef() != null && this.getSrRef()
						.equals(castOther.getSrRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSrDomain() == null ? 0 : this.getSrDomain().hashCode());
		result = 37 * result
				+ (getSrUserid() == null ? 0 : this.getSrUserid().hashCode());
		result = 37 * result
				+ (getSrLineid() == null ? 0 : this.getSrLineid().hashCode());
		result = 37 * result
				+ (getSrSite() == null ? 0 : this.getSrSite().hashCode());
		result = 37 * result
				+ (getSrLoc() == null ? 0 : this.getSrLoc().hashCode());
		result = 37 * result
				+ (getSrLotser() == null ? 0 : this.getSrLotser().hashCode());
		result = 37 * result
				+ (getSrRef() == null ? 0 : this.getSrRef().hashCode());
		return result;
	}

}