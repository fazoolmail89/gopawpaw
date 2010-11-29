package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDsrMstrId entity provides the base persistence definition of the
 * DsrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDsrMstrId implements java.io.Serializable {

	// Fields

	private String dsrDomain;
	private String dsrSite;
	private String dsrReqNbr;

	// Constructors

	/** default constructor */
	public AbstractDsrMstrId() {
	}

	/** minimal constructor */
	public AbstractDsrMstrId(String dsrDomain, String dsrReqNbr) {
		this.dsrDomain = dsrDomain;
		this.dsrReqNbr = dsrReqNbr;
	}

	/** full constructor */
	public AbstractDsrMstrId(String dsrDomain, String dsrSite, String dsrReqNbr) {
		this.dsrDomain = dsrDomain;
		this.dsrSite = dsrSite;
		this.dsrReqNbr = dsrReqNbr;
	}

	// Property accessors

	public String getDsrDomain() {
		return this.dsrDomain;
	}

	public void setDsrDomain(String dsrDomain) {
		this.dsrDomain = dsrDomain;
	}

	public String getDsrSite() {
		return this.dsrSite;
	}

	public void setDsrSite(String dsrSite) {
		this.dsrSite = dsrSite;
	}

	public String getDsrReqNbr() {
		return this.dsrReqNbr;
	}

	public void setDsrReqNbr(String dsrReqNbr) {
		this.dsrReqNbr = dsrReqNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDsrMstrId))
			return false;
		AbstractDsrMstrId castOther = (AbstractDsrMstrId) other;

		return ((this.getDsrDomain() == castOther.getDsrDomain()) || (this
				.getDsrDomain() != null
				&& castOther.getDsrDomain() != null && this.getDsrDomain()
				.equals(castOther.getDsrDomain())))
				&& ((this.getDsrSite() == castOther.getDsrSite()) || (this
						.getDsrSite() != null
						&& castOther.getDsrSite() != null && this.getDsrSite()
						.equals(castOther.getDsrSite())))
				&& ((this.getDsrReqNbr() == castOther.getDsrReqNbr()) || (this
						.getDsrReqNbr() != null
						&& castOther.getDsrReqNbr() != null && this
						.getDsrReqNbr().equals(castOther.getDsrReqNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDsrDomain() == null ? 0 : this.getDsrDomain().hashCode());
		result = 37 * result
				+ (getDsrSite() == null ? 0 : this.getDsrSite().hashCode());
		result = 37 * result
				+ (getDsrReqNbr() == null ? 0 : this.getDsrReqNbr().hashCode());
		return result;
	}

}