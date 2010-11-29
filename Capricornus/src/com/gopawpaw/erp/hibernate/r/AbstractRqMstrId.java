package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqMstrId entity provides the base persistence definition of the
 * RqMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqMstrId implements java.io.Serializable {

	// Fields

	private String rqDomain;
	private String rqPart;
	private String rqSite;
	private String rqRsc;
	private String rqRef;
	private Date rqStart;

	// Constructors

	/** default constructor */
	public AbstractRqMstrId() {
	}

	/** minimal constructor */
	public AbstractRqMstrId(String rqDomain, String rqPart, String rqRsc) {
		this.rqDomain = rqDomain;
		this.rqPart = rqPart;
		this.rqRsc = rqRsc;
	}

	/** full constructor */
	public AbstractRqMstrId(String rqDomain, String rqPart, String rqSite,
			String rqRsc, String rqRef, Date rqStart) {
		this.rqDomain = rqDomain;
		this.rqPart = rqPart;
		this.rqSite = rqSite;
		this.rqRsc = rqRsc;
		this.rqRef = rqRef;
		this.rqStart = rqStart;
	}

	// Property accessors

	public String getRqDomain() {
		return this.rqDomain;
	}

	public void setRqDomain(String rqDomain) {
		this.rqDomain = rqDomain;
	}

	public String getRqPart() {
		return this.rqPart;
	}

	public void setRqPart(String rqPart) {
		this.rqPart = rqPart;
	}

	public String getRqSite() {
		return this.rqSite;
	}

	public void setRqSite(String rqSite) {
		this.rqSite = rqSite;
	}

	public String getRqRsc() {
		return this.rqRsc;
	}

	public void setRqRsc(String rqRsc) {
		this.rqRsc = rqRsc;
	}

	public String getRqRef() {
		return this.rqRef;
	}

	public void setRqRef(String rqRef) {
		this.rqRef = rqRef;
	}

	public Date getRqStart() {
		return this.rqStart;
	}

	public void setRqStart(Date rqStart) {
		this.rqStart = rqStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqMstrId))
			return false;
		AbstractRqMstrId castOther = (AbstractRqMstrId) other;

		return ((this.getRqDomain() == castOther.getRqDomain()) || (this
				.getRqDomain() != null
				&& castOther.getRqDomain() != null && this.getRqDomain()
				.equals(castOther.getRqDomain())))
				&& ((this.getRqPart() == castOther.getRqPart()) || (this
						.getRqPart() != null
						&& castOther.getRqPart() != null && this.getRqPart()
						.equals(castOther.getRqPart())))
				&& ((this.getRqSite() == castOther.getRqSite()) || (this
						.getRqSite() != null
						&& castOther.getRqSite() != null && this.getRqSite()
						.equals(castOther.getRqSite())))
				&& ((this.getRqRsc() == castOther.getRqRsc()) || (this
						.getRqRsc() != null
						&& castOther.getRqRsc() != null && this.getRqRsc()
						.equals(castOther.getRqRsc())))
				&& ((this.getRqRef() == castOther.getRqRef()) || (this
						.getRqRef() != null
						&& castOther.getRqRef() != null && this.getRqRef()
						.equals(castOther.getRqRef())))
				&& ((this.getRqStart() == castOther.getRqStart()) || (this
						.getRqStart() != null
						&& castOther.getRqStart() != null && this.getRqStart()
						.equals(castOther.getRqStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqDomain() == null ? 0 : this.getRqDomain().hashCode());
		result = 37 * result
				+ (getRqPart() == null ? 0 : this.getRqPart().hashCode());
		result = 37 * result
				+ (getRqSite() == null ? 0 : this.getRqSite().hashCode());
		result = 37 * result
				+ (getRqRsc() == null ? 0 : this.getRqRsc().hashCode());
		result = 37 * result
				+ (getRqRef() == null ? 0 : this.getRqRef().hashCode());
		result = 37 * result
				+ (getRqStart() == null ? 0 : this.getRqStart().hashCode());
		return result;
	}

}