package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFrMstrId entity provides the base persistence definition of the
 * FrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrMstrId implements java.io.Serializable {

	// Fields

	private String frDomain;
	private String frList;
	private String frSite;
	private String frCurr;

	// Constructors

	/** default constructor */
	public AbstractFrMstrId() {
	}

	/** minimal constructor */
	public AbstractFrMstrId(String frDomain) {
		this.frDomain = frDomain;
	}

	/** full constructor */
	public AbstractFrMstrId(String frDomain, String frList, String frSite,
			String frCurr) {
		this.frDomain = frDomain;
		this.frList = frList;
		this.frSite = frSite;
		this.frCurr = frCurr;
	}

	// Property accessors

	public String getFrDomain() {
		return this.frDomain;
	}

	public void setFrDomain(String frDomain) {
		this.frDomain = frDomain;
	}

	public String getFrList() {
		return this.frList;
	}

	public void setFrList(String frList) {
		this.frList = frList;
	}

	public String getFrSite() {
		return this.frSite;
	}

	public void setFrSite(String frSite) {
		this.frSite = frSite;
	}

	public String getFrCurr() {
		return this.frCurr;
	}

	public void setFrCurr(String frCurr) {
		this.frCurr = frCurr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFrMstrId))
			return false;
		AbstractFrMstrId castOther = (AbstractFrMstrId) other;

		return ((this.getFrDomain() == castOther.getFrDomain()) || (this
				.getFrDomain() != null
				&& castOther.getFrDomain() != null && this.getFrDomain()
				.equals(castOther.getFrDomain())))
				&& ((this.getFrList() == castOther.getFrList()) || (this
						.getFrList() != null
						&& castOther.getFrList() != null && this.getFrList()
						.equals(castOther.getFrList())))
				&& ((this.getFrSite() == castOther.getFrSite()) || (this
						.getFrSite() != null
						&& castOther.getFrSite() != null && this.getFrSite()
						.equals(castOther.getFrSite())))
				&& ((this.getFrCurr() == castOther.getFrCurr()) || (this
						.getFrCurr() != null
						&& castOther.getFrCurr() != null && this.getFrCurr()
						.equals(castOther.getFrCurr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFrDomain() == null ? 0 : this.getFrDomain().hashCode());
		result = 37 * result
				+ (getFrList() == null ? 0 : this.getFrList().hashCode());
		result = 37 * result
				+ (getFrSite() == null ? 0 : this.getFrSite().hashCode());
		result = 37 * result
				+ (getFrCurr() == null ? 0 : this.getFrCurr().hashCode());
		return result;
	}

}