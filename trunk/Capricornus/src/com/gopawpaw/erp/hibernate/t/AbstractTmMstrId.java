package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTmMstrId entity provides the base persistence definition of the
 * TmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTmMstrId implements java.io.Serializable {

	// Fields

	private String tmDomain;
	private String tmCode;

	// Constructors

	/** default constructor */
	public AbstractTmMstrId() {
	}

	/** minimal constructor */
	public AbstractTmMstrId(String tmDomain) {
		this.tmDomain = tmDomain;
	}

	/** full constructor */
	public AbstractTmMstrId(String tmDomain, String tmCode) {
		this.tmDomain = tmDomain;
		this.tmCode = tmCode;
	}

	// Property accessors

	public String getTmDomain() {
		return this.tmDomain;
	}

	public void setTmDomain(String tmDomain) {
		this.tmDomain = tmDomain;
	}

	public String getTmCode() {
		return this.tmCode;
	}

	public void setTmCode(String tmCode) {
		this.tmCode = tmCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTmMstrId))
			return false;
		AbstractTmMstrId castOther = (AbstractTmMstrId) other;

		return ((this.getTmDomain() == castOther.getTmDomain()) || (this
				.getTmDomain() != null
				&& castOther.getTmDomain() != null && this.getTmDomain()
				.equals(castOther.getTmDomain())))
				&& ((this.getTmCode() == castOther.getTmCode()) || (this
						.getTmCode() != null
						&& castOther.getTmCode() != null && this.getTmCode()
						.equals(castOther.getTmCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTmDomain() == null ? 0 : this.getTmDomain().hashCode());
		result = 37 * result
				+ (getTmCode() == null ? 0 : this.getTmCode().hashCode());
		return result;
	}

}