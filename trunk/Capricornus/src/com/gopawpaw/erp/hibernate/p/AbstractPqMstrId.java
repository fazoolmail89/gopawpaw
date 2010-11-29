package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPqMstrId entity provides the base persistence definition of the
 * PqMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPqMstrId implements java.io.Serializable {

	// Fields

	private String pqDomain;
	private String pqProdLine;
	private String pqSite;
	private String pqRsc;
	private String pqRef;
	private Date pqStart;

	// Constructors

	/** default constructor */
	public AbstractPqMstrId() {
	}

	/** minimal constructor */
	public AbstractPqMstrId(String pqDomain, String pqRsc) {
		this.pqDomain = pqDomain;
		this.pqRsc = pqRsc;
	}

	/** full constructor */
	public AbstractPqMstrId(String pqDomain, String pqProdLine, String pqSite,
			String pqRsc, String pqRef, Date pqStart) {
		this.pqDomain = pqDomain;
		this.pqProdLine = pqProdLine;
		this.pqSite = pqSite;
		this.pqRsc = pqRsc;
		this.pqRef = pqRef;
		this.pqStart = pqStart;
	}

	// Property accessors

	public String getPqDomain() {
		return this.pqDomain;
	}

	public void setPqDomain(String pqDomain) {
		this.pqDomain = pqDomain;
	}

	public String getPqProdLine() {
		return this.pqProdLine;
	}

	public void setPqProdLine(String pqProdLine) {
		this.pqProdLine = pqProdLine;
	}

	public String getPqSite() {
		return this.pqSite;
	}

	public void setPqSite(String pqSite) {
		this.pqSite = pqSite;
	}

	public String getPqRsc() {
		return this.pqRsc;
	}

	public void setPqRsc(String pqRsc) {
		this.pqRsc = pqRsc;
	}

	public String getPqRef() {
		return this.pqRef;
	}

	public void setPqRef(String pqRef) {
		this.pqRef = pqRef;
	}

	public Date getPqStart() {
		return this.pqStart;
	}

	public void setPqStart(Date pqStart) {
		this.pqStart = pqStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPqMstrId))
			return false;
		AbstractPqMstrId castOther = (AbstractPqMstrId) other;

		return ((this.getPqDomain() == castOther.getPqDomain()) || (this
				.getPqDomain() != null
				&& castOther.getPqDomain() != null && this.getPqDomain()
				.equals(castOther.getPqDomain())))
				&& ((this.getPqProdLine() == castOther.getPqProdLine()) || (this
						.getPqProdLine() != null
						&& castOther.getPqProdLine() != null && this
						.getPqProdLine().equals(castOther.getPqProdLine())))
				&& ((this.getPqSite() == castOther.getPqSite()) || (this
						.getPqSite() != null
						&& castOther.getPqSite() != null && this.getPqSite()
						.equals(castOther.getPqSite())))
				&& ((this.getPqRsc() == castOther.getPqRsc()) || (this
						.getPqRsc() != null
						&& castOther.getPqRsc() != null && this.getPqRsc()
						.equals(castOther.getPqRsc())))
				&& ((this.getPqRef() == castOther.getPqRef()) || (this
						.getPqRef() != null
						&& castOther.getPqRef() != null && this.getPqRef()
						.equals(castOther.getPqRef())))
				&& ((this.getPqStart() == castOther.getPqStart()) || (this
						.getPqStart() != null
						&& castOther.getPqStart() != null && this.getPqStart()
						.equals(castOther.getPqStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPqDomain() == null ? 0 : this.getPqDomain().hashCode());
		result = 37
				* result
				+ (getPqProdLine() == null ? 0 : this.getPqProdLine()
						.hashCode());
		result = 37 * result
				+ (getPqSite() == null ? 0 : this.getPqSite().hashCode());
		result = 37 * result
				+ (getPqRsc() == null ? 0 : this.getPqRsc().hashCode());
		result = 37 * result
				+ (getPqRef() == null ? 0 : this.getPqRef().hashCode());
		result = 37 * result
				+ (getPqStart() == null ? 0 : this.getPqStart().hashCode());
		return result;
	}

}