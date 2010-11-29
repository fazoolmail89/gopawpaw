package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFfMstrId entity provides the base persistence definition of the
 * FfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFfMstrId implements java.io.Serializable {

	// Fields

	private String ffDomain;
	private String ffId;
	private String ffUser;
	private Integer ffYear;
	private Integer ffMethod;
	private String ffPart;
	private String ffSite;
	private String ffCust;

	// Constructors

	/** default constructor */
	public AbstractFfMstrId() {
	}

	/** minimal constructor */
	public AbstractFfMstrId(String ffDomain) {
		this.ffDomain = ffDomain;
	}

	/** full constructor */
	public AbstractFfMstrId(String ffDomain, String ffId, String ffUser,
			Integer ffYear, Integer ffMethod, String ffPart, String ffSite,
			String ffCust) {
		this.ffDomain = ffDomain;
		this.ffId = ffId;
		this.ffUser = ffUser;
		this.ffYear = ffYear;
		this.ffMethod = ffMethod;
		this.ffPart = ffPart;
		this.ffSite = ffSite;
		this.ffCust = ffCust;
	}

	// Property accessors

	public String getFfDomain() {
		return this.ffDomain;
	}

	public void setFfDomain(String ffDomain) {
		this.ffDomain = ffDomain;
	}

	public String getFfId() {
		return this.ffId;
	}

	public void setFfId(String ffId) {
		this.ffId = ffId;
	}

	public String getFfUser() {
		return this.ffUser;
	}

	public void setFfUser(String ffUser) {
		this.ffUser = ffUser;
	}

	public Integer getFfYear() {
		return this.ffYear;
	}

	public void setFfYear(Integer ffYear) {
		this.ffYear = ffYear;
	}

	public Integer getFfMethod() {
		return this.ffMethod;
	}

	public void setFfMethod(Integer ffMethod) {
		this.ffMethod = ffMethod;
	}

	public String getFfPart() {
		return this.ffPart;
	}

	public void setFfPart(String ffPart) {
		this.ffPart = ffPart;
	}

	public String getFfSite() {
		return this.ffSite;
	}

	public void setFfSite(String ffSite) {
		this.ffSite = ffSite;
	}

	public String getFfCust() {
		return this.ffCust;
	}

	public void setFfCust(String ffCust) {
		this.ffCust = ffCust;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFfMstrId))
			return false;
		AbstractFfMstrId castOther = (AbstractFfMstrId) other;

		return ((this.getFfDomain() == castOther.getFfDomain()) || (this
				.getFfDomain() != null
				&& castOther.getFfDomain() != null && this.getFfDomain()
				.equals(castOther.getFfDomain())))
				&& ((this.getFfId() == castOther.getFfId()) || (this.getFfId() != null
						&& castOther.getFfId() != null && this.getFfId()
						.equals(castOther.getFfId())))
				&& ((this.getFfUser() == castOther.getFfUser()) || (this
						.getFfUser() != null
						&& castOther.getFfUser() != null && this.getFfUser()
						.equals(castOther.getFfUser())))
				&& ((this.getFfYear() == castOther.getFfYear()) || (this
						.getFfYear() != null
						&& castOther.getFfYear() != null && this.getFfYear()
						.equals(castOther.getFfYear())))
				&& ((this.getFfMethod() == castOther.getFfMethod()) || (this
						.getFfMethod() != null
						&& castOther.getFfMethod() != null && this
						.getFfMethod().equals(castOther.getFfMethod())))
				&& ((this.getFfPart() == castOther.getFfPart()) || (this
						.getFfPart() != null
						&& castOther.getFfPart() != null && this.getFfPart()
						.equals(castOther.getFfPart())))
				&& ((this.getFfSite() == castOther.getFfSite()) || (this
						.getFfSite() != null
						&& castOther.getFfSite() != null && this.getFfSite()
						.equals(castOther.getFfSite())))
				&& ((this.getFfCust() == castOther.getFfCust()) || (this
						.getFfCust() != null
						&& castOther.getFfCust() != null && this.getFfCust()
						.equals(castOther.getFfCust())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFfDomain() == null ? 0 : this.getFfDomain().hashCode());
		result = 37 * result
				+ (getFfId() == null ? 0 : this.getFfId().hashCode());
		result = 37 * result
				+ (getFfUser() == null ? 0 : this.getFfUser().hashCode());
		result = 37 * result
				+ (getFfYear() == null ? 0 : this.getFfYear().hashCode());
		result = 37 * result
				+ (getFfMethod() == null ? 0 : this.getFfMethod().hashCode());
		result = 37 * result
				+ (getFfPart() == null ? 0 : this.getFfPart().hashCode());
		result = 37 * result
				+ (getFfSite() == null ? 0 : this.getFfSite().hashCode());
		result = 37 * result
				+ (getFfCust() == null ? 0 : this.getFfCust().hashCode());
		return result;
	}

}