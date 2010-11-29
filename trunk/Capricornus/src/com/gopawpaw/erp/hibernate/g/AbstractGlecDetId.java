package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlecDetId entity provides the base persistence definition of the
 * GlecDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlecDetId implements java.io.Serializable {

	// Fields

	private String glecDomain;
	private String glecConsRef;
	private Boolean glecConsRflag;
	private Integer glecConsLine;
	private String glecSubDomain;
	private String glecSubRef;
	private Boolean glecSubRflag;
	private Integer glecSubLine;

	// Constructors

	/** default constructor */
	public AbstractGlecDetId() {
	}

	/** minimal constructor */
	public AbstractGlecDetId(String glecDomain, String glecConsRef,
			Integer glecConsLine, String glecSubDomain, String glecSubRef,
			Integer glecSubLine) {
		this.glecDomain = glecDomain;
		this.glecConsRef = glecConsRef;
		this.glecConsLine = glecConsLine;
		this.glecSubDomain = glecSubDomain;
		this.glecSubRef = glecSubRef;
		this.glecSubLine = glecSubLine;
	}

	/** full constructor */
	public AbstractGlecDetId(String glecDomain, String glecConsRef,
			Boolean glecConsRflag, Integer glecConsLine, String glecSubDomain,
			String glecSubRef, Boolean glecSubRflag, Integer glecSubLine) {
		this.glecDomain = glecDomain;
		this.glecConsRef = glecConsRef;
		this.glecConsRflag = glecConsRflag;
		this.glecConsLine = glecConsLine;
		this.glecSubDomain = glecSubDomain;
		this.glecSubRef = glecSubRef;
		this.glecSubRflag = glecSubRflag;
		this.glecSubLine = glecSubLine;
	}

	// Property accessors

	public String getGlecDomain() {
		return this.glecDomain;
	}

	public void setGlecDomain(String glecDomain) {
		this.glecDomain = glecDomain;
	}

	public String getGlecConsRef() {
		return this.glecConsRef;
	}

	public void setGlecConsRef(String glecConsRef) {
		this.glecConsRef = glecConsRef;
	}

	public Boolean getGlecConsRflag() {
		return this.glecConsRflag;
	}

	public void setGlecConsRflag(Boolean glecConsRflag) {
		this.glecConsRflag = glecConsRflag;
	}

	public Integer getGlecConsLine() {
		return this.glecConsLine;
	}

	public void setGlecConsLine(Integer glecConsLine) {
		this.glecConsLine = glecConsLine;
	}

	public String getGlecSubDomain() {
		return this.glecSubDomain;
	}

	public void setGlecSubDomain(String glecSubDomain) {
		this.glecSubDomain = glecSubDomain;
	}

	public String getGlecSubRef() {
		return this.glecSubRef;
	}

	public void setGlecSubRef(String glecSubRef) {
		this.glecSubRef = glecSubRef;
	}

	public Boolean getGlecSubRflag() {
		return this.glecSubRflag;
	}

	public void setGlecSubRflag(Boolean glecSubRflag) {
		this.glecSubRflag = glecSubRflag;
	}

	public Integer getGlecSubLine() {
		return this.glecSubLine;
	}

	public void setGlecSubLine(Integer glecSubLine) {
		this.glecSubLine = glecSubLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGlecDetId))
			return false;
		AbstractGlecDetId castOther = (AbstractGlecDetId) other;

		return ((this.getGlecDomain() == castOther.getGlecDomain()) || (this
				.getGlecDomain() != null
				&& castOther.getGlecDomain() != null && this.getGlecDomain()
				.equals(castOther.getGlecDomain())))
				&& ((this.getGlecConsRef() == castOther.getGlecConsRef()) || (this
						.getGlecConsRef() != null
						&& castOther.getGlecConsRef() != null && this
						.getGlecConsRef().equals(castOther.getGlecConsRef())))
				&& ((this.getGlecConsRflag() == castOther.getGlecConsRflag()) || (this
						.getGlecConsRflag() != null
						&& castOther.getGlecConsRflag() != null && this
						.getGlecConsRflag()
						.equals(castOther.getGlecConsRflag())))
				&& ((this.getGlecConsLine() == castOther.getGlecConsLine()) || (this
						.getGlecConsLine() != null
						&& castOther.getGlecConsLine() != null && this
						.getGlecConsLine().equals(castOther.getGlecConsLine())))
				&& ((this.getGlecSubDomain() == castOther.getGlecSubDomain()) || (this
						.getGlecSubDomain() != null
						&& castOther.getGlecSubDomain() != null && this
						.getGlecSubDomain()
						.equals(castOther.getGlecSubDomain())))
				&& ((this.getGlecSubRef() == castOther.getGlecSubRef()) || (this
						.getGlecSubRef() != null
						&& castOther.getGlecSubRef() != null && this
						.getGlecSubRef().equals(castOther.getGlecSubRef())))
				&& ((this.getGlecSubRflag() == castOther.getGlecSubRflag()) || (this
						.getGlecSubRflag() != null
						&& castOther.getGlecSubRflag() != null && this
						.getGlecSubRflag().equals(castOther.getGlecSubRflag())))
				&& ((this.getGlecSubLine() == castOther.getGlecSubLine()) || (this
						.getGlecSubLine() != null
						&& castOther.getGlecSubLine() != null && this
						.getGlecSubLine().equals(castOther.getGlecSubLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGlecDomain() == null ? 0 : this.getGlecDomain()
						.hashCode());
		result = 37
				* result
				+ (getGlecConsRef() == null ? 0 : this.getGlecConsRef()
						.hashCode());
		result = 37
				* result
				+ (getGlecConsRflag() == null ? 0 : this.getGlecConsRflag()
						.hashCode());
		result = 37
				* result
				+ (getGlecConsLine() == null ? 0 : this.getGlecConsLine()
						.hashCode());
		result = 37
				* result
				+ (getGlecSubDomain() == null ? 0 : this.getGlecSubDomain()
						.hashCode());
		result = 37
				* result
				+ (getGlecSubRef() == null ? 0 : this.getGlecSubRef()
						.hashCode());
		result = 37
				* result
				+ (getGlecSubRflag() == null ? 0 : this.getGlecSubRflag()
						.hashCode());
		result = 37
				* result
				+ (getGlecSubLine() == null ? 0 : this.getGlecSubLine()
						.hashCode());
		return result;
	}

}