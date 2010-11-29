package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGltwWkflId entity provides the base persistence definition of the
 * GltwWkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltwWkflId implements java.io.Serializable {

	// Fields

	private String gltwDomain;
	private String gltwRef;
	private Integer gltwLine;
	private Boolean gltwRflag;

	// Constructors

	/** default constructor */
	public AbstractGltwWkflId() {
	}

	/** minimal constructor */
	public AbstractGltwWkflId(String gltwDomain) {
		this.gltwDomain = gltwDomain;
	}

	/** full constructor */
	public AbstractGltwWkflId(String gltwDomain, String gltwRef,
			Integer gltwLine, Boolean gltwRflag) {
		this.gltwDomain = gltwDomain;
		this.gltwRef = gltwRef;
		this.gltwLine = gltwLine;
		this.gltwRflag = gltwRflag;
	}

	// Property accessors

	public String getGltwDomain() {
		return this.gltwDomain;
	}

	public void setGltwDomain(String gltwDomain) {
		this.gltwDomain = gltwDomain;
	}

	public String getGltwRef() {
		return this.gltwRef;
	}

	public void setGltwRef(String gltwRef) {
		this.gltwRef = gltwRef;
	}

	public Integer getGltwLine() {
		return this.gltwLine;
	}

	public void setGltwLine(Integer gltwLine) {
		this.gltwLine = gltwLine;
	}

	public Boolean getGltwRflag() {
		return this.gltwRflag;
	}

	public void setGltwRflag(Boolean gltwRflag) {
		this.gltwRflag = gltwRflag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGltwWkflId))
			return false;
		AbstractGltwWkflId castOther = (AbstractGltwWkflId) other;

		return ((this.getGltwDomain() == castOther.getGltwDomain()) || (this
				.getGltwDomain() != null
				&& castOther.getGltwDomain() != null && this.getGltwDomain()
				.equals(castOther.getGltwDomain())))
				&& ((this.getGltwRef() == castOther.getGltwRef()) || (this
						.getGltwRef() != null
						&& castOther.getGltwRef() != null && this.getGltwRef()
						.equals(castOther.getGltwRef())))
				&& ((this.getGltwLine() == castOther.getGltwLine()) || (this
						.getGltwLine() != null
						&& castOther.getGltwLine() != null && this
						.getGltwLine().equals(castOther.getGltwLine())))
				&& ((this.getGltwRflag() == castOther.getGltwRflag()) || (this
						.getGltwRflag() != null
						&& castOther.getGltwRflag() != null && this
						.getGltwRflag().equals(castOther.getGltwRflag())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGltwDomain() == null ? 0 : this.getGltwDomain()
						.hashCode());
		result = 37 * result
				+ (getGltwRef() == null ? 0 : this.getGltwRef().hashCode());
		result = 37 * result
				+ (getGltwLine() == null ? 0 : this.getGltwLine().hashCode());
		result = 37 * result
				+ (getGltwRflag() == null ? 0 : this.getGltwRflag().hashCode());
		return result;
	}

}