package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMpsMstrId entity provides the base persistence definition of the
 * MpsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMpsMstrId implements java.io.Serializable {

	// Fields

	private String mpsDomain;
	private String mpsPart;
	private String mpsSite;
	private String mpsLine;
	private Date mpsDueDate;

	// Constructors

	/** default constructor */
	public AbstractMpsMstrId() {
	}

	/** minimal constructor */
	public AbstractMpsMstrId(String mpsDomain) {
		this.mpsDomain = mpsDomain;
	}

	/** full constructor */
	public AbstractMpsMstrId(String mpsDomain, String mpsPart, String mpsSite,
			String mpsLine, Date mpsDueDate) {
		this.mpsDomain = mpsDomain;
		this.mpsPart = mpsPart;
		this.mpsSite = mpsSite;
		this.mpsLine = mpsLine;
		this.mpsDueDate = mpsDueDate;
	}

	// Property accessors

	public String getMpsDomain() {
		return this.mpsDomain;
	}

	public void setMpsDomain(String mpsDomain) {
		this.mpsDomain = mpsDomain;
	}

	public String getMpsPart() {
		return this.mpsPart;
	}

	public void setMpsPart(String mpsPart) {
		this.mpsPart = mpsPart;
	}

	public String getMpsSite() {
		return this.mpsSite;
	}

	public void setMpsSite(String mpsSite) {
		this.mpsSite = mpsSite;
	}

	public String getMpsLine() {
		return this.mpsLine;
	}

	public void setMpsLine(String mpsLine) {
		this.mpsLine = mpsLine;
	}

	public Date getMpsDueDate() {
		return this.mpsDueDate;
	}

	public void setMpsDueDate(Date mpsDueDate) {
		this.mpsDueDate = mpsDueDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMpsMstrId))
			return false;
		AbstractMpsMstrId castOther = (AbstractMpsMstrId) other;

		return ((this.getMpsDomain() == castOther.getMpsDomain()) || (this
				.getMpsDomain() != null
				&& castOther.getMpsDomain() != null && this.getMpsDomain()
				.equals(castOther.getMpsDomain())))
				&& ((this.getMpsPart() == castOther.getMpsPart()) || (this
						.getMpsPart() != null
						&& castOther.getMpsPart() != null && this.getMpsPart()
						.equals(castOther.getMpsPart())))
				&& ((this.getMpsSite() == castOther.getMpsSite()) || (this
						.getMpsSite() != null
						&& castOther.getMpsSite() != null && this.getMpsSite()
						.equals(castOther.getMpsSite())))
				&& ((this.getMpsLine() == castOther.getMpsLine()) || (this
						.getMpsLine() != null
						&& castOther.getMpsLine() != null && this.getMpsLine()
						.equals(castOther.getMpsLine())))
				&& ((this.getMpsDueDate() == castOther.getMpsDueDate()) || (this
						.getMpsDueDate() != null
						&& castOther.getMpsDueDate() != null && this
						.getMpsDueDate().equals(castOther.getMpsDueDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMpsDomain() == null ? 0 : this.getMpsDomain().hashCode());
		result = 37 * result
				+ (getMpsPart() == null ? 0 : this.getMpsPart().hashCode());
		result = 37 * result
				+ (getMpsSite() == null ? 0 : this.getMpsSite().hashCode());
		result = 37 * result
				+ (getMpsLine() == null ? 0 : this.getMpsLine().hashCode());
		result = 37
				* result
				+ (getMpsDueDate() == null ? 0 : this.getMpsDueDate()
						.hashCode());
		return result;
	}

}