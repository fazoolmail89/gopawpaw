package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPpPlanId entity provides the base persistence definition of the
 * PpPlanId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPpPlanId implements java.io.Serializable {

	// Fields

	private String ppDomain;
	private String ppSite;
	private String ppProdLine;
	private Integer ppYear;

	// Constructors

	/** default constructor */
	public AbstractPpPlanId() {
	}

	/** minimal constructor */
	public AbstractPpPlanId(String ppDomain, String ppProdLine, Integer ppYear) {
		this.ppDomain = ppDomain;
		this.ppProdLine = ppProdLine;
		this.ppYear = ppYear;
	}

	/** full constructor */
	public AbstractPpPlanId(String ppDomain, String ppSite, String ppProdLine,
			Integer ppYear) {
		this.ppDomain = ppDomain;
		this.ppSite = ppSite;
		this.ppProdLine = ppProdLine;
		this.ppYear = ppYear;
	}

	// Property accessors

	public String getPpDomain() {
		return this.ppDomain;
	}

	public void setPpDomain(String ppDomain) {
		this.ppDomain = ppDomain;
	}

	public String getPpSite() {
		return this.ppSite;
	}

	public void setPpSite(String ppSite) {
		this.ppSite = ppSite;
	}

	public String getPpProdLine() {
		return this.ppProdLine;
	}

	public void setPpProdLine(String ppProdLine) {
		this.ppProdLine = ppProdLine;
	}

	public Integer getPpYear() {
		return this.ppYear;
	}

	public void setPpYear(Integer ppYear) {
		this.ppYear = ppYear;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPpPlanId))
			return false;
		AbstractPpPlanId castOther = (AbstractPpPlanId) other;

		return ((this.getPpDomain() == castOther.getPpDomain()) || (this
				.getPpDomain() != null
				&& castOther.getPpDomain() != null && this.getPpDomain()
				.equals(castOther.getPpDomain())))
				&& ((this.getPpSite() == castOther.getPpSite()) || (this
						.getPpSite() != null
						&& castOther.getPpSite() != null && this.getPpSite()
						.equals(castOther.getPpSite())))
				&& ((this.getPpProdLine() == castOther.getPpProdLine()) || (this
						.getPpProdLine() != null
						&& castOther.getPpProdLine() != null && this
						.getPpProdLine().equals(castOther.getPpProdLine())))
				&& ((this.getPpYear() == castOther.getPpYear()) || (this
						.getPpYear() != null
						&& castOther.getPpYear() != null && this.getPpYear()
						.equals(castOther.getPpYear())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPpDomain() == null ? 0 : this.getPpDomain().hashCode());
		result = 37 * result
				+ (getPpSite() == null ? 0 : this.getPpSite().hashCode());
		result = 37
				* result
				+ (getPpProdLine() == null ? 0 : this.getPpProdLine()
						.hashCode());
		result = 37 * result
				+ (getPpYear() == null ? 0 : this.getPpYear().hashCode());
		return result;
	}

}