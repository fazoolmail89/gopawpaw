package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlsdDetId entity provides the base persistence definition of the
 * FlsdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlsdDetId implements java.io.Serializable {

	// Fields

	private String flsdDomain;
	private String flsdSite;
	private String flsdProductionLine;
	private Date flsdDueDate;
	private Integer flsdSeq;

	// Constructors

	/** default constructor */
	public AbstractFlsdDetId() {
	}

	/** minimal constructor */
	public AbstractFlsdDetId(String flsdDomain, String flsdSite,
			String flsdProductionLine, Integer flsdSeq) {
		this.flsdDomain = flsdDomain;
		this.flsdSite = flsdSite;
		this.flsdProductionLine = flsdProductionLine;
		this.flsdSeq = flsdSeq;
	}

	/** full constructor */
	public AbstractFlsdDetId(String flsdDomain, String flsdSite,
			String flsdProductionLine, Date flsdDueDate, Integer flsdSeq) {
		this.flsdDomain = flsdDomain;
		this.flsdSite = flsdSite;
		this.flsdProductionLine = flsdProductionLine;
		this.flsdDueDate = flsdDueDate;
		this.flsdSeq = flsdSeq;
	}

	// Property accessors

	public String getFlsdDomain() {
		return this.flsdDomain;
	}

	public void setFlsdDomain(String flsdDomain) {
		this.flsdDomain = flsdDomain;
	}

	public String getFlsdSite() {
		return this.flsdSite;
	}

	public void setFlsdSite(String flsdSite) {
		this.flsdSite = flsdSite;
	}

	public String getFlsdProductionLine() {
		return this.flsdProductionLine;
	}

	public void setFlsdProductionLine(String flsdProductionLine) {
		this.flsdProductionLine = flsdProductionLine;
	}

	public Date getFlsdDueDate() {
		return this.flsdDueDate;
	}

	public void setFlsdDueDate(Date flsdDueDate) {
		this.flsdDueDate = flsdDueDate;
	}

	public Integer getFlsdSeq() {
		return this.flsdSeq;
	}

	public void setFlsdSeq(Integer flsdSeq) {
		this.flsdSeq = flsdSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFlsdDetId))
			return false;
		AbstractFlsdDetId castOther = (AbstractFlsdDetId) other;

		return ((this.getFlsdDomain() == castOther.getFlsdDomain()) || (this
				.getFlsdDomain() != null
				&& castOther.getFlsdDomain() != null && this.getFlsdDomain()
				.equals(castOther.getFlsdDomain())))
				&& ((this.getFlsdSite() == castOther.getFlsdSite()) || (this
						.getFlsdSite() != null
						&& castOther.getFlsdSite() != null && this
						.getFlsdSite().equals(castOther.getFlsdSite())))
				&& ((this.getFlsdProductionLine() == castOther
						.getFlsdProductionLine()) || (this
						.getFlsdProductionLine() != null
						&& castOther.getFlsdProductionLine() != null && this
						.getFlsdProductionLine().equals(
								castOther.getFlsdProductionLine())))
				&& ((this.getFlsdDueDate() == castOther.getFlsdDueDate()) || (this
						.getFlsdDueDate() != null
						&& castOther.getFlsdDueDate() != null && this
						.getFlsdDueDate().equals(castOther.getFlsdDueDate())))
				&& ((this.getFlsdSeq() == castOther.getFlsdSeq()) || (this
						.getFlsdSeq() != null
						&& castOther.getFlsdSeq() != null && this.getFlsdSeq()
						.equals(castOther.getFlsdSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFlsdDomain() == null ? 0 : this.getFlsdDomain()
						.hashCode());
		result = 37 * result
				+ (getFlsdSite() == null ? 0 : this.getFlsdSite().hashCode());
		result = 37
				* result
				+ (getFlsdProductionLine() == null ? 0 : this
						.getFlsdProductionLine().hashCode());
		result = 37
				* result
				+ (getFlsdDueDate() == null ? 0 : this.getFlsdDueDate()
						.hashCode());
		result = 37 * result
				+ (getFlsdSeq() == null ? 0 : this.getFlsdSeq().hashCode());
		return result;
	}

}