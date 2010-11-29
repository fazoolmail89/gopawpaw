package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDaldDetId entity provides the base persistence definition of the
 * DaldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDaldDetId implements java.io.Serializable {

	// Fields

	private String daldDomain;
	private String daldListId;
	private String daldAppId;
	private Date daldEffDtIn;

	// Constructors

	/** default constructor */
	public AbstractDaldDetId() {
	}

	/** minimal constructor */
	public AbstractDaldDetId(String daldDomain) {
		this.daldDomain = daldDomain;
	}

	/** full constructor */
	public AbstractDaldDetId(String daldDomain, String daldListId,
			String daldAppId, Date daldEffDtIn) {
		this.daldDomain = daldDomain;
		this.daldListId = daldListId;
		this.daldAppId = daldAppId;
		this.daldEffDtIn = daldEffDtIn;
	}

	// Property accessors

	public String getDaldDomain() {
		return this.daldDomain;
	}

	public void setDaldDomain(String daldDomain) {
		this.daldDomain = daldDomain;
	}

	public String getDaldListId() {
		return this.daldListId;
	}

	public void setDaldListId(String daldListId) {
		this.daldListId = daldListId;
	}

	public String getDaldAppId() {
		return this.daldAppId;
	}

	public void setDaldAppId(String daldAppId) {
		this.daldAppId = daldAppId;
	}

	public Date getDaldEffDtIn() {
		return this.daldEffDtIn;
	}

	public void setDaldEffDtIn(Date daldEffDtIn) {
		this.daldEffDtIn = daldEffDtIn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDaldDetId))
			return false;
		AbstractDaldDetId castOther = (AbstractDaldDetId) other;

		return ((this.getDaldDomain() == castOther.getDaldDomain()) || (this
				.getDaldDomain() != null
				&& castOther.getDaldDomain() != null && this.getDaldDomain()
				.equals(castOther.getDaldDomain())))
				&& ((this.getDaldListId() == castOther.getDaldListId()) || (this
						.getDaldListId() != null
						&& castOther.getDaldListId() != null && this
						.getDaldListId().equals(castOther.getDaldListId())))
				&& ((this.getDaldAppId() == castOther.getDaldAppId()) || (this
						.getDaldAppId() != null
						&& castOther.getDaldAppId() != null && this
						.getDaldAppId().equals(castOther.getDaldAppId())))
				&& ((this.getDaldEffDtIn() == castOther.getDaldEffDtIn()) || (this
						.getDaldEffDtIn() != null
						&& castOther.getDaldEffDtIn() != null && this
						.getDaldEffDtIn().equals(castOther.getDaldEffDtIn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDaldDomain() == null ? 0 : this.getDaldDomain()
						.hashCode());
		result = 37
				* result
				+ (getDaldListId() == null ? 0 : this.getDaldListId()
						.hashCode());
		result = 37 * result
				+ (getDaldAppId() == null ? 0 : this.getDaldAppId().hashCode());
		result = 37
				* result
				+ (getDaldEffDtIn() == null ? 0 : this.getDaldEffDtIn()
						.hashCode());
		return result;
	}

}