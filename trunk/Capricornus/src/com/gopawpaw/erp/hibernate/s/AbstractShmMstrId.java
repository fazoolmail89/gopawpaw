package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShmMstrId entity provides the base persistence definition of the
 * ShmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShmMstrId implements java.io.Serializable {

	// Fields

	private String shmDomain;
	private String shmCode;
	private String shmSrcSite;
	private String shmRecSite;
	private Date shmStart;

	// Constructors

	/** default constructor */
	public AbstractShmMstrId() {
	}

	/** minimal constructor */
	public AbstractShmMstrId(String shmDomain) {
		this.shmDomain = shmDomain;
	}

	/** full constructor */
	public AbstractShmMstrId(String shmDomain, String shmCode,
			String shmSrcSite, String shmRecSite, Date shmStart) {
		this.shmDomain = shmDomain;
		this.shmCode = shmCode;
		this.shmSrcSite = shmSrcSite;
		this.shmRecSite = shmRecSite;
		this.shmStart = shmStart;
	}

	// Property accessors

	public String getShmDomain() {
		return this.shmDomain;
	}

	public void setShmDomain(String shmDomain) {
		this.shmDomain = shmDomain;
	}

	public String getShmCode() {
		return this.shmCode;
	}

	public void setShmCode(String shmCode) {
		this.shmCode = shmCode;
	}

	public String getShmSrcSite() {
		return this.shmSrcSite;
	}

	public void setShmSrcSite(String shmSrcSite) {
		this.shmSrcSite = shmSrcSite;
	}

	public String getShmRecSite() {
		return this.shmRecSite;
	}

	public void setShmRecSite(String shmRecSite) {
		this.shmRecSite = shmRecSite;
	}

	public Date getShmStart() {
		return this.shmStart;
	}

	public void setShmStart(Date shmStart) {
		this.shmStart = shmStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShmMstrId))
			return false;
		AbstractShmMstrId castOther = (AbstractShmMstrId) other;

		return ((this.getShmDomain() == castOther.getShmDomain()) || (this
				.getShmDomain() != null
				&& castOther.getShmDomain() != null && this.getShmDomain()
				.equals(castOther.getShmDomain())))
				&& ((this.getShmCode() == castOther.getShmCode()) || (this
						.getShmCode() != null
						&& castOther.getShmCode() != null && this.getShmCode()
						.equals(castOther.getShmCode())))
				&& ((this.getShmSrcSite() == castOther.getShmSrcSite()) || (this
						.getShmSrcSite() != null
						&& castOther.getShmSrcSite() != null && this
						.getShmSrcSite().equals(castOther.getShmSrcSite())))
				&& ((this.getShmRecSite() == castOther.getShmRecSite()) || (this
						.getShmRecSite() != null
						&& castOther.getShmRecSite() != null && this
						.getShmRecSite().equals(castOther.getShmRecSite())))
				&& ((this.getShmStart() == castOther.getShmStart()) || (this
						.getShmStart() != null
						&& castOther.getShmStart() != null && this
						.getShmStart().equals(castOther.getShmStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getShmDomain() == null ? 0 : this.getShmDomain().hashCode());
		result = 37 * result
				+ (getShmCode() == null ? 0 : this.getShmCode().hashCode());
		result = 37
				* result
				+ (getShmSrcSite() == null ? 0 : this.getShmSrcSite()
						.hashCode());
		result = 37
				* result
				+ (getShmRecSite() == null ? 0 : this.getShmRecSite()
						.hashCode());
		result = 37 * result
				+ (getShmStart() == null ? 0 : this.getShmStart().hashCode());
		return result;
	}

}