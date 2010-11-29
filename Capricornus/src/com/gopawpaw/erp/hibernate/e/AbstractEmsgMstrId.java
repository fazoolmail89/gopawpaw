package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEmsgMstrId entity provides the base persistence definition of the
 * EmsgMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmsgMstrId implements java.io.Serializable {

	// Fields

	private String emsgDomain;
	private Integer emsgTrnbr;

	// Constructors

	/** default constructor */
	public AbstractEmsgMstrId() {
	}

	/** minimal constructor */
	public AbstractEmsgMstrId(String emsgDomain) {
		this.emsgDomain = emsgDomain;
	}

	/** full constructor */
	public AbstractEmsgMstrId(String emsgDomain, Integer emsgTrnbr) {
		this.emsgDomain = emsgDomain;
		this.emsgTrnbr = emsgTrnbr;
	}

	// Property accessors

	public String getEmsgDomain() {
		return this.emsgDomain;
	}

	public void setEmsgDomain(String emsgDomain) {
		this.emsgDomain = emsgDomain;
	}

	public Integer getEmsgTrnbr() {
		return this.emsgTrnbr;
	}

	public void setEmsgTrnbr(Integer emsgTrnbr) {
		this.emsgTrnbr = emsgTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEmsgMstrId))
			return false;
		AbstractEmsgMstrId castOther = (AbstractEmsgMstrId) other;

		return ((this.getEmsgDomain() == castOther.getEmsgDomain()) || (this
				.getEmsgDomain() != null
				&& castOther.getEmsgDomain() != null && this.getEmsgDomain()
				.equals(castOther.getEmsgDomain())))
				&& ((this.getEmsgTrnbr() == castOther.getEmsgTrnbr()) || (this
						.getEmsgTrnbr() != null
						&& castOther.getEmsgTrnbr() != null && this
						.getEmsgTrnbr().equals(castOther.getEmsgTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmsgDomain() == null ? 0 : this.getEmsgDomain()
						.hashCode());
		result = 37 * result
				+ (getEmsgTrnbr() == null ? 0 : this.getEmsgTrnbr().hashCode());
		return result;
	}

}