package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMuMstrId entity provides the base persistence definition of the
 * MuMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMuMstrId implements java.io.Serializable {

	// Fields

	private String muDomain;
	private String muMemberCurr;
	private Date muStartDate;

	// Constructors

	/** default constructor */
	public AbstractMuMstrId() {
	}

	/** full constructor */
	public AbstractMuMstrId(String muDomain, String muMemberCurr,
			Date muStartDate) {
		this.muDomain = muDomain;
		this.muMemberCurr = muMemberCurr;
		this.muStartDate = muStartDate;
	}

	// Property accessors

	public String getMuDomain() {
		return this.muDomain;
	}

	public void setMuDomain(String muDomain) {
		this.muDomain = muDomain;
	}

	public String getMuMemberCurr() {
		return this.muMemberCurr;
	}

	public void setMuMemberCurr(String muMemberCurr) {
		this.muMemberCurr = muMemberCurr;
	}

	public Date getMuStartDate() {
		return this.muStartDate;
	}

	public void setMuStartDate(Date muStartDate) {
		this.muStartDate = muStartDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMuMstrId))
			return false;
		AbstractMuMstrId castOther = (AbstractMuMstrId) other;

		return ((this.getMuDomain() == castOther.getMuDomain()) || (this
				.getMuDomain() != null
				&& castOther.getMuDomain() != null && this.getMuDomain()
				.equals(castOther.getMuDomain())))
				&& ((this.getMuMemberCurr() == castOther.getMuMemberCurr()) || (this
						.getMuMemberCurr() != null
						&& castOther.getMuMemberCurr() != null && this
						.getMuMemberCurr().equals(castOther.getMuMemberCurr())))
				&& ((this.getMuStartDate() == castOther.getMuStartDate()) || (this
						.getMuStartDate() != null
						&& castOther.getMuStartDate() != null && this
						.getMuStartDate().equals(castOther.getMuStartDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMuDomain() == null ? 0 : this.getMuDomain().hashCode());
		result = 37
				* result
				+ (getMuMemberCurr() == null ? 0 : this.getMuMemberCurr()
						.hashCode());
		result = 37
				* result
				+ (getMuStartDate() == null ? 0 : this.getMuStartDate()
						.hashCode());
		return result;
	}

}