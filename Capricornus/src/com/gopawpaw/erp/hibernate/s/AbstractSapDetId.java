package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSapDetId entity provides the base persistence definition of the
 * SapDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSapDetId implements java.io.Serializable {

	// Fields

	private String sapDomain;
	private String sapNbr;
	private String sapPrefix;
	private Integer sapLine;
	private Date sapSchedDate;

	// Constructors

	/** default constructor */
	public AbstractSapDetId() {
	}

	/** minimal constructor */
	public AbstractSapDetId(String sapDomain) {
		this.sapDomain = sapDomain;
	}

	/** full constructor */
	public AbstractSapDetId(String sapDomain, String sapNbr, String sapPrefix,
			Integer sapLine, Date sapSchedDate) {
		this.sapDomain = sapDomain;
		this.sapNbr = sapNbr;
		this.sapPrefix = sapPrefix;
		this.sapLine = sapLine;
		this.sapSchedDate = sapSchedDate;
	}

	// Property accessors

	public String getSapDomain() {
		return this.sapDomain;
	}

	public void setSapDomain(String sapDomain) {
		this.sapDomain = sapDomain;
	}

	public String getSapNbr() {
		return this.sapNbr;
	}

	public void setSapNbr(String sapNbr) {
		this.sapNbr = sapNbr;
	}

	public String getSapPrefix() {
		return this.sapPrefix;
	}

	public void setSapPrefix(String sapPrefix) {
		this.sapPrefix = sapPrefix;
	}

	public Integer getSapLine() {
		return this.sapLine;
	}

	public void setSapLine(Integer sapLine) {
		this.sapLine = sapLine;
	}

	public Date getSapSchedDate() {
		return this.sapSchedDate;
	}

	public void setSapSchedDate(Date sapSchedDate) {
		this.sapSchedDate = sapSchedDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSapDetId))
			return false;
		AbstractSapDetId castOther = (AbstractSapDetId) other;

		return ((this.getSapDomain() == castOther.getSapDomain()) || (this
				.getSapDomain() != null
				&& castOther.getSapDomain() != null && this.getSapDomain()
				.equals(castOther.getSapDomain())))
				&& ((this.getSapNbr() == castOther.getSapNbr()) || (this
						.getSapNbr() != null
						&& castOther.getSapNbr() != null && this.getSapNbr()
						.equals(castOther.getSapNbr())))
				&& ((this.getSapPrefix() == castOther.getSapPrefix()) || (this
						.getSapPrefix() != null
						&& castOther.getSapPrefix() != null && this
						.getSapPrefix().equals(castOther.getSapPrefix())))
				&& ((this.getSapLine() == castOther.getSapLine()) || (this
						.getSapLine() != null
						&& castOther.getSapLine() != null && this.getSapLine()
						.equals(castOther.getSapLine())))
				&& ((this.getSapSchedDate() == castOther.getSapSchedDate()) || (this
						.getSapSchedDate() != null
						&& castOther.getSapSchedDate() != null && this
						.getSapSchedDate().equals(castOther.getSapSchedDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSapDomain() == null ? 0 : this.getSapDomain().hashCode());
		result = 37 * result
				+ (getSapNbr() == null ? 0 : this.getSapNbr().hashCode());
		result = 37 * result
				+ (getSapPrefix() == null ? 0 : this.getSapPrefix().hashCode());
		result = 37 * result
				+ (getSapLine() == null ? 0 : this.getSapLine().hashCode());
		result = 37
				* result
				+ (getSapSchedDate() == null ? 0 : this.getSapSchedDate()
						.hashCode());
		return result;
	}

}