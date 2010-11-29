package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCostCalId entity provides the base persistence definition of the
 * CostCalId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCostCalId implements java.io.Serializable {

	// Fields

	private String costDomain;
	private Date costStart;
	private String costSite;

	// Constructors

	/** default constructor */
	public AbstractCostCalId() {
	}

	/** minimal constructor */
	public AbstractCostCalId(String costDomain) {
		this.costDomain = costDomain;
	}

	/** full constructor */
	public AbstractCostCalId(String costDomain, Date costStart, String costSite) {
		this.costDomain = costDomain;
		this.costStart = costStart;
		this.costSite = costSite;
	}

	// Property accessors

	public String getCostDomain() {
		return this.costDomain;
	}

	public void setCostDomain(String costDomain) {
		this.costDomain = costDomain;
	}

	public Date getCostStart() {
		return this.costStart;
	}

	public void setCostStart(Date costStart) {
		this.costStart = costStart;
	}

	public String getCostSite() {
		return this.costSite;
	}

	public void setCostSite(String costSite) {
		this.costSite = costSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCostCalId))
			return false;
		AbstractCostCalId castOther = (AbstractCostCalId) other;

		return ((this.getCostDomain() == castOther.getCostDomain()) || (this
				.getCostDomain() != null
				&& castOther.getCostDomain() != null && this.getCostDomain()
				.equals(castOther.getCostDomain())))
				&& ((this.getCostStart() == castOther.getCostStart()) || (this
						.getCostStart() != null
						&& castOther.getCostStart() != null && this
						.getCostStart().equals(castOther.getCostStart())))
				&& ((this.getCostSite() == castOther.getCostSite()) || (this
						.getCostSite() != null
						&& castOther.getCostSite() != null && this
						.getCostSite().equals(castOther.getCostSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCostDomain() == null ? 0 : this.getCostDomain()
						.hashCode());
		result = 37 * result
				+ (getCostStart() == null ? 0 : this.getCostStart().hashCode());
		result = 37 * result
				+ (getCostSite() == null ? 0 : this.getCostSite().hashCode());
		return result;
	}

}