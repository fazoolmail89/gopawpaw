package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEgtMstrId entity provides the base persistence definition of the
 * EgtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgtMstrId implements java.io.Serializable {

	// Fields

	private String egtDomain;
	private Integer egtTrnbr;

	// Constructors

	/** default constructor */
	public AbstractEgtMstrId() {
	}

	/** minimal constructor */
	public AbstractEgtMstrId(String egtDomain) {
		this.egtDomain = egtDomain;
	}

	/** full constructor */
	public AbstractEgtMstrId(String egtDomain, Integer egtTrnbr) {
		this.egtDomain = egtDomain;
		this.egtTrnbr = egtTrnbr;
	}

	// Property accessors

	public String getEgtDomain() {
		return this.egtDomain;
	}

	public void setEgtDomain(String egtDomain) {
		this.egtDomain = egtDomain;
	}

	public Integer getEgtTrnbr() {
		return this.egtTrnbr;
	}

	public void setEgtTrnbr(Integer egtTrnbr) {
		this.egtTrnbr = egtTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEgtMstrId))
			return false;
		AbstractEgtMstrId castOther = (AbstractEgtMstrId) other;

		return ((this.getEgtDomain() == castOther.getEgtDomain()) || (this
				.getEgtDomain() != null
				&& castOther.getEgtDomain() != null && this.getEgtDomain()
				.equals(castOther.getEgtDomain())))
				&& ((this.getEgtTrnbr() == castOther.getEgtTrnbr()) || (this
						.getEgtTrnbr() != null
						&& castOther.getEgtTrnbr() != null && this
						.getEgtTrnbr().equals(castOther.getEgtTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEgtDomain() == null ? 0 : this.getEgtDomain().hashCode());
		result = 37 * result
				+ (getEgtTrnbr() == null ? 0 : this.getEgtTrnbr().hashCode());
		return result;
	}

}