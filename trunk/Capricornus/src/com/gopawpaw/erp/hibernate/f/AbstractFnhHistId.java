package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFnhHistId entity provides the base persistence definition of the
 * FnhHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFnhHistId implements java.io.Serializable {

	// Fields

	private String fnhDomain;
	private String fnhNbr;
	private Date fnhEffDate;
	private Integer fnhSequence;

	// Constructors

	/** default constructor */
	public AbstractFnhHistId() {
	}

	/** minimal constructor */
	public AbstractFnhHistId(String fnhDomain) {
		this.fnhDomain = fnhDomain;
	}

	/** full constructor */
	public AbstractFnhHistId(String fnhDomain, String fnhNbr, Date fnhEffDate,
			Integer fnhSequence) {
		this.fnhDomain = fnhDomain;
		this.fnhNbr = fnhNbr;
		this.fnhEffDate = fnhEffDate;
		this.fnhSequence = fnhSequence;
	}

	// Property accessors

	public String getFnhDomain() {
		return this.fnhDomain;
	}

	public void setFnhDomain(String fnhDomain) {
		this.fnhDomain = fnhDomain;
	}

	public String getFnhNbr() {
		return this.fnhNbr;
	}

	public void setFnhNbr(String fnhNbr) {
		this.fnhNbr = fnhNbr;
	}

	public Date getFnhEffDate() {
		return this.fnhEffDate;
	}

	public void setFnhEffDate(Date fnhEffDate) {
		this.fnhEffDate = fnhEffDate;
	}

	public Integer getFnhSequence() {
		return this.fnhSequence;
	}

	public void setFnhSequence(Integer fnhSequence) {
		this.fnhSequence = fnhSequence;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFnhHistId))
			return false;
		AbstractFnhHistId castOther = (AbstractFnhHistId) other;

		return ((this.getFnhDomain() == castOther.getFnhDomain()) || (this
				.getFnhDomain() != null
				&& castOther.getFnhDomain() != null && this.getFnhDomain()
				.equals(castOther.getFnhDomain())))
				&& ((this.getFnhNbr() == castOther.getFnhNbr()) || (this
						.getFnhNbr() != null
						&& castOther.getFnhNbr() != null && this.getFnhNbr()
						.equals(castOther.getFnhNbr())))
				&& ((this.getFnhEffDate() == castOther.getFnhEffDate()) || (this
						.getFnhEffDate() != null
						&& castOther.getFnhEffDate() != null && this
						.getFnhEffDate().equals(castOther.getFnhEffDate())))
				&& ((this.getFnhSequence() == castOther.getFnhSequence()) || (this
						.getFnhSequence() != null
						&& castOther.getFnhSequence() != null && this
						.getFnhSequence().equals(castOther.getFnhSequence())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFnhDomain() == null ? 0 : this.getFnhDomain().hashCode());
		result = 37 * result
				+ (getFnhNbr() == null ? 0 : this.getFnhNbr().hashCode());
		result = 37
				* result
				+ (getFnhEffDate() == null ? 0 : this.getFnhEffDate()
						.hashCode());
		result = 37
				* result
				+ (getFnhSequence() == null ? 0 : this.getFnhSequence()
						.hashCode());
		return result;
	}

}