package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSmMstrId entity provides the base persistence definition of the
 * SmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSmMstrId implements java.io.Serializable {

	// Fields

	private String smDomain;
	private String smPart;
	private String smSupSite;
	private String smMktgSite;
	private Date smStart;
	private String smType;

	// Constructors

	/** default constructor */
	public AbstractSmMstrId() {
	}

	/** minimal constructor */
	public AbstractSmMstrId(String smDomain) {
		this.smDomain = smDomain;
	}

	/** full constructor */
	public AbstractSmMstrId(String smDomain, String smPart, String smSupSite,
			String smMktgSite, Date smStart, String smType) {
		this.smDomain = smDomain;
		this.smPart = smPart;
		this.smSupSite = smSupSite;
		this.smMktgSite = smMktgSite;
		this.smStart = smStart;
		this.smType = smType;
	}

	// Property accessors

	public String getSmDomain() {
		return this.smDomain;
	}

	public void setSmDomain(String smDomain) {
		this.smDomain = smDomain;
	}

	public String getSmPart() {
		return this.smPart;
	}

	public void setSmPart(String smPart) {
		this.smPart = smPart;
	}

	public String getSmSupSite() {
		return this.smSupSite;
	}

	public void setSmSupSite(String smSupSite) {
		this.smSupSite = smSupSite;
	}

	public String getSmMktgSite() {
		return this.smMktgSite;
	}

	public void setSmMktgSite(String smMktgSite) {
		this.smMktgSite = smMktgSite;
	}

	public Date getSmStart() {
		return this.smStart;
	}

	public void setSmStart(Date smStart) {
		this.smStart = smStart;
	}

	public String getSmType() {
		return this.smType;
	}

	public void setSmType(String smType) {
		this.smType = smType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSmMstrId))
			return false;
		AbstractSmMstrId castOther = (AbstractSmMstrId) other;

		return ((this.getSmDomain() == castOther.getSmDomain()) || (this
				.getSmDomain() != null
				&& castOther.getSmDomain() != null && this.getSmDomain()
				.equals(castOther.getSmDomain())))
				&& ((this.getSmPart() == castOther.getSmPart()) || (this
						.getSmPart() != null
						&& castOther.getSmPart() != null && this.getSmPart()
						.equals(castOther.getSmPart())))
				&& ((this.getSmSupSite() == castOther.getSmSupSite()) || (this
						.getSmSupSite() != null
						&& castOther.getSmSupSite() != null && this
						.getSmSupSite().equals(castOther.getSmSupSite())))
				&& ((this.getSmMktgSite() == castOther.getSmMktgSite()) || (this
						.getSmMktgSite() != null
						&& castOther.getSmMktgSite() != null && this
						.getSmMktgSite().equals(castOther.getSmMktgSite())))
				&& ((this.getSmStart() == castOther.getSmStart()) || (this
						.getSmStart() != null
						&& castOther.getSmStart() != null && this.getSmStart()
						.equals(castOther.getSmStart())))
				&& ((this.getSmType() == castOther.getSmType()) || (this
						.getSmType() != null
						&& castOther.getSmType() != null && this.getSmType()
						.equals(castOther.getSmType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSmDomain() == null ? 0 : this.getSmDomain().hashCode());
		result = 37 * result
				+ (getSmPart() == null ? 0 : this.getSmPart().hashCode());
		result = 37 * result
				+ (getSmSupSite() == null ? 0 : this.getSmSupSite().hashCode());
		result = 37
				* result
				+ (getSmMktgSite() == null ? 0 : this.getSmMktgSite()
						.hashCode());
		result = 37 * result
				+ (getSmStart() == null ? 0 : this.getSmStart().hashCode());
		result = 37 * result
				+ (getSmType() == null ? 0 : this.getSmType().hashCode());
		return result;
	}

}