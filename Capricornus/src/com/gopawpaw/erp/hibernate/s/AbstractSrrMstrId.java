package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSrrMstrId entity provides the base persistence definition of the
 * SrrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSrrMstrId implements java.io.Serializable {

	// Fields

	private String srrDomain;
	private String srrNbr;

	// Constructors

	/** default constructor */
	public AbstractSrrMstrId() {
	}

	/** minimal constructor */
	public AbstractSrrMstrId(String srrDomain) {
		this.srrDomain = srrDomain;
	}

	/** full constructor */
	public AbstractSrrMstrId(String srrDomain, String srrNbr) {
		this.srrDomain = srrDomain;
		this.srrNbr = srrNbr;
	}

	// Property accessors

	public String getSrrDomain() {
		return this.srrDomain;
	}

	public void setSrrDomain(String srrDomain) {
		this.srrDomain = srrDomain;
	}

	public String getSrrNbr() {
		return this.srrNbr;
	}

	public void setSrrNbr(String srrNbr) {
		this.srrNbr = srrNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSrrMstrId))
			return false;
		AbstractSrrMstrId castOther = (AbstractSrrMstrId) other;

		return ((this.getSrrDomain() == castOther.getSrrDomain()) || (this
				.getSrrDomain() != null
				&& castOther.getSrrDomain() != null && this.getSrrDomain()
				.equals(castOther.getSrrDomain())))
				&& ((this.getSrrNbr() == castOther.getSrrNbr()) || (this
						.getSrrNbr() != null
						&& castOther.getSrrNbr() != null && this.getSrrNbr()
						.equals(castOther.getSrrNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSrrDomain() == null ? 0 : this.getSrrDomain().hashCode());
		result = 37 * result
				+ (getSrrNbr() == null ? 0 : this.getSrrNbr().hashCode());
		return result;
	}

}