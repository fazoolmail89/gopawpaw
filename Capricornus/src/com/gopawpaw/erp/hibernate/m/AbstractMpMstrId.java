package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMpMstrId entity provides the base persistence definition of the
 * MpMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMpMstrId implements java.io.Serializable {

	// Fields

	private String mpDomain;
	private String mpNbr;

	// Constructors

	/** default constructor */
	public AbstractMpMstrId() {
	}

	/** minimal constructor */
	public AbstractMpMstrId(String mpDomain) {
		this.mpDomain = mpDomain;
	}

	/** full constructor */
	public AbstractMpMstrId(String mpDomain, String mpNbr) {
		this.mpDomain = mpDomain;
		this.mpNbr = mpNbr;
	}

	// Property accessors

	public String getMpDomain() {
		return this.mpDomain;
	}

	public void setMpDomain(String mpDomain) {
		this.mpDomain = mpDomain;
	}

	public String getMpNbr() {
		return this.mpNbr;
	}

	public void setMpNbr(String mpNbr) {
		this.mpNbr = mpNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMpMstrId))
			return false;
		AbstractMpMstrId castOther = (AbstractMpMstrId) other;

		return ((this.getMpDomain() == castOther.getMpDomain()) || (this
				.getMpDomain() != null
				&& castOther.getMpDomain() != null && this.getMpDomain()
				.equals(castOther.getMpDomain())))
				&& ((this.getMpNbr() == castOther.getMpNbr()) || (this
						.getMpNbr() != null
						&& castOther.getMpNbr() != null && this.getMpNbr()
						.equals(castOther.getMpNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMpDomain() == null ? 0 : this.getMpDomain().hashCode());
		result = 37 * result
				+ (getMpNbr() == null ? 0 : this.getMpNbr().hashCode());
		return result;
	}

}