package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGltrHistId entity provides the base persistence definition of the
 * GltrHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltrHistId implements java.io.Serializable {

	// Fields

	private String gltrDomain;
	private String gltrRef;
	private Boolean gltrRflag;
	private Integer gltrLine;

	// Constructors

	/** default constructor */
	public AbstractGltrHistId() {
	}

	/** minimal constructor */
	public AbstractGltrHistId(String gltrDomain) {
		this.gltrDomain = gltrDomain;
	}

	/** full constructor */
	public AbstractGltrHistId(String gltrDomain, String gltrRef,
			Boolean gltrRflag, Integer gltrLine) {
		this.gltrDomain = gltrDomain;
		this.gltrRef = gltrRef;
		this.gltrRflag = gltrRflag;
		this.gltrLine = gltrLine;
	}

	// Property accessors

	public String getGltrDomain() {
		return this.gltrDomain;
	}

	public void setGltrDomain(String gltrDomain) {
		this.gltrDomain = gltrDomain;
	}

	public String getGltrRef() {
		return this.gltrRef;
	}

	public void setGltrRef(String gltrRef) {
		this.gltrRef = gltrRef;
	}

	public Boolean getGltrRflag() {
		return this.gltrRflag;
	}

	public void setGltrRflag(Boolean gltrRflag) {
		this.gltrRflag = gltrRflag;
	}

	public Integer getGltrLine() {
		return this.gltrLine;
	}

	public void setGltrLine(Integer gltrLine) {
		this.gltrLine = gltrLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGltrHistId))
			return false;
		AbstractGltrHistId castOther = (AbstractGltrHistId) other;

		return ((this.getGltrDomain() == castOther.getGltrDomain()) || (this
				.getGltrDomain() != null
				&& castOther.getGltrDomain() != null && this.getGltrDomain()
				.equals(castOther.getGltrDomain())))
				&& ((this.getGltrRef() == castOther.getGltrRef()) || (this
						.getGltrRef() != null
						&& castOther.getGltrRef() != null && this.getGltrRef()
						.equals(castOther.getGltrRef())))
				&& ((this.getGltrRflag() == castOther.getGltrRflag()) || (this
						.getGltrRflag() != null
						&& castOther.getGltrRflag() != null && this
						.getGltrRflag().equals(castOther.getGltrRflag())))
				&& ((this.getGltrLine() == castOther.getGltrLine()) || (this
						.getGltrLine() != null
						&& castOther.getGltrLine() != null && this
						.getGltrLine().equals(castOther.getGltrLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGltrDomain() == null ? 0 : this.getGltrDomain()
						.hashCode());
		result = 37 * result
				+ (getGltrRef() == null ? 0 : this.getGltrRef().hashCode());
		result = 37 * result
				+ (getGltrRflag() == null ? 0 : this.getGltrRflag().hashCode());
		result = 37 * result
				+ (getGltrLine() == null ? 0 : this.getGltrLine().hashCode());
		return result;
	}

}