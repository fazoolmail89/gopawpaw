package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShdDetId entity provides the base persistence definition of the
 * ShdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShdDetId implements java.io.Serializable {

	// Fields

	private String shdDomain;
	private String shdCode;
	private String shdSrcSite;
	private String shdRecSite;
	private Date shdDeparts;

	// Constructors

	/** default constructor */
	public AbstractShdDetId() {
	}

	/** minimal constructor */
	public AbstractShdDetId(String shdDomain) {
		this.shdDomain = shdDomain;
	}

	/** full constructor */
	public AbstractShdDetId(String shdDomain, String shdCode,
			String shdSrcSite, String shdRecSite, Date shdDeparts) {
		this.shdDomain = shdDomain;
		this.shdCode = shdCode;
		this.shdSrcSite = shdSrcSite;
		this.shdRecSite = shdRecSite;
		this.shdDeparts = shdDeparts;
	}

	// Property accessors

	public String getShdDomain() {
		return this.shdDomain;
	}

	public void setShdDomain(String shdDomain) {
		this.shdDomain = shdDomain;
	}

	public String getShdCode() {
		return this.shdCode;
	}

	public void setShdCode(String shdCode) {
		this.shdCode = shdCode;
	}

	public String getShdSrcSite() {
		return this.shdSrcSite;
	}

	public void setShdSrcSite(String shdSrcSite) {
		this.shdSrcSite = shdSrcSite;
	}

	public String getShdRecSite() {
		return this.shdRecSite;
	}

	public void setShdRecSite(String shdRecSite) {
		this.shdRecSite = shdRecSite;
	}

	public Date getShdDeparts() {
		return this.shdDeparts;
	}

	public void setShdDeparts(Date shdDeparts) {
		this.shdDeparts = shdDeparts;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShdDetId))
			return false;
		AbstractShdDetId castOther = (AbstractShdDetId) other;

		return ((this.getShdDomain() == castOther.getShdDomain()) || (this
				.getShdDomain() != null
				&& castOther.getShdDomain() != null && this.getShdDomain()
				.equals(castOther.getShdDomain())))
				&& ((this.getShdCode() == castOther.getShdCode()) || (this
						.getShdCode() != null
						&& castOther.getShdCode() != null && this.getShdCode()
						.equals(castOther.getShdCode())))
				&& ((this.getShdSrcSite() == castOther.getShdSrcSite()) || (this
						.getShdSrcSite() != null
						&& castOther.getShdSrcSite() != null && this
						.getShdSrcSite().equals(castOther.getShdSrcSite())))
				&& ((this.getShdRecSite() == castOther.getShdRecSite()) || (this
						.getShdRecSite() != null
						&& castOther.getShdRecSite() != null && this
						.getShdRecSite().equals(castOther.getShdRecSite())))
				&& ((this.getShdDeparts() == castOther.getShdDeparts()) || (this
						.getShdDeparts() != null
						&& castOther.getShdDeparts() != null && this
						.getShdDeparts().equals(castOther.getShdDeparts())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getShdDomain() == null ? 0 : this.getShdDomain().hashCode());
		result = 37 * result
				+ (getShdCode() == null ? 0 : this.getShdCode().hashCode());
		result = 37
				* result
				+ (getShdSrcSite() == null ? 0 : this.getShdSrcSite()
						.hashCode());
		result = 37
				* result
				+ (getShdRecSite() == null ? 0 : this.getShdRecSite()
						.hashCode());
		result = 37
				* result
				+ (getShdDeparts() == null ? 0 : this.getShdDeparts()
						.hashCode());
		return result;
	}

}