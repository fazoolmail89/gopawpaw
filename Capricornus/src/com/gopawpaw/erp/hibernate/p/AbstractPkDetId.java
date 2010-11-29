package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPkDetId entity provides the base persistence definition of the
 * PkDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPkDetId implements java.io.Serializable {

	// Fields

	private String pkDomain;
	private String pkUser;
	private String pkPart;
	private String pkReference;
	private Date pkStart;
	private Date pkEnd;

	// Constructors

	/** default constructor */
	public AbstractPkDetId() {
	}

	/** minimal constructor */
	public AbstractPkDetId(String pkDomain, String pkPart) {
		this.pkDomain = pkDomain;
		this.pkPart = pkPart;
	}

	/** full constructor */
	public AbstractPkDetId(String pkDomain, String pkUser, String pkPart,
			String pkReference, Date pkStart, Date pkEnd) {
		this.pkDomain = pkDomain;
		this.pkUser = pkUser;
		this.pkPart = pkPart;
		this.pkReference = pkReference;
		this.pkStart = pkStart;
		this.pkEnd = pkEnd;
	}

	// Property accessors

	public String getPkDomain() {
		return this.pkDomain;
	}

	public void setPkDomain(String pkDomain) {
		this.pkDomain = pkDomain;
	}

	public String getPkUser() {
		return this.pkUser;
	}

	public void setPkUser(String pkUser) {
		this.pkUser = pkUser;
	}

	public String getPkPart() {
		return this.pkPart;
	}

	public void setPkPart(String pkPart) {
		this.pkPart = pkPart;
	}

	public String getPkReference() {
		return this.pkReference;
	}

	public void setPkReference(String pkReference) {
		this.pkReference = pkReference;
	}

	public Date getPkStart() {
		return this.pkStart;
	}

	public void setPkStart(Date pkStart) {
		this.pkStart = pkStart;
	}

	public Date getPkEnd() {
		return this.pkEnd;
	}

	public void setPkEnd(Date pkEnd) {
		this.pkEnd = pkEnd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPkDetId))
			return false;
		AbstractPkDetId castOther = (AbstractPkDetId) other;

		return ((this.getPkDomain() == castOther.getPkDomain()) || (this
				.getPkDomain() != null
				&& castOther.getPkDomain() != null && this.getPkDomain()
				.equals(castOther.getPkDomain())))
				&& ((this.getPkUser() == castOther.getPkUser()) || (this
						.getPkUser() != null
						&& castOther.getPkUser() != null && this.getPkUser()
						.equals(castOther.getPkUser())))
				&& ((this.getPkPart() == castOther.getPkPart()) || (this
						.getPkPart() != null
						&& castOther.getPkPart() != null && this.getPkPart()
						.equals(castOther.getPkPart())))
				&& ((this.getPkReference() == castOther.getPkReference()) || (this
						.getPkReference() != null
						&& castOther.getPkReference() != null && this
						.getPkReference().equals(castOther.getPkReference())))
				&& ((this.getPkStart() == castOther.getPkStart()) || (this
						.getPkStart() != null
						&& castOther.getPkStart() != null && this.getPkStart()
						.equals(castOther.getPkStart())))
				&& ((this.getPkEnd() == castOther.getPkEnd()) || (this
						.getPkEnd() != null
						&& castOther.getPkEnd() != null && this.getPkEnd()
						.equals(castOther.getPkEnd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPkDomain() == null ? 0 : this.getPkDomain().hashCode());
		result = 37 * result
				+ (getPkUser() == null ? 0 : this.getPkUser().hashCode());
		result = 37 * result
				+ (getPkPart() == null ? 0 : this.getPkPart().hashCode());
		result = 37
				* result
				+ (getPkReference() == null ? 0 : this.getPkReference()
						.hashCode());
		result = 37 * result
				+ (getPkStart() == null ? 0 : this.getPkStart().hashCode());
		result = 37 * result
				+ (getPkEnd() == null ? 0 : this.getPkEnd().hashCode());
		return result;
	}

}