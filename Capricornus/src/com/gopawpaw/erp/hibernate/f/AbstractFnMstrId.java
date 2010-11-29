package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFnMstrId entity provides the base persistence definition of the
 * FnMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFnMstrId implements java.io.Serializable {

	// Fields

	private String fnDomain;
	private String fnNbr;

	// Constructors

	/** default constructor */
	public AbstractFnMstrId() {
	}

	/** minimal constructor */
	public AbstractFnMstrId(String fnDomain) {
		this.fnDomain = fnDomain;
	}

	/** full constructor */
	public AbstractFnMstrId(String fnDomain, String fnNbr) {
		this.fnDomain = fnDomain;
		this.fnNbr = fnNbr;
	}

	// Property accessors

	public String getFnDomain() {
		return this.fnDomain;
	}

	public void setFnDomain(String fnDomain) {
		this.fnDomain = fnDomain;
	}

	public String getFnNbr() {
		return this.fnNbr;
	}

	public void setFnNbr(String fnNbr) {
		this.fnNbr = fnNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFnMstrId))
			return false;
		AbstractFnMstrId castOther = (AbstractFnMstrId) other;

		return ((this.getFnDomain() == castOther.getFnDomain()) || (this
				.getFnDomain() != null
				&& castOther.getFnDomain() != null && this.getFnDomain()
				.equals(castOther.getFnDomain())))
				&& ((this.getFnNbr() == castOther.getFnNbr()) || (this
						.getFnNbr() != null
						&& castOther.getFnNbr() != null && this.getFnNbr()
						.equals(castOther.getFnNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFnDomain() == null ? 0 : this.getFnDomain().hashCode());
		result = 37 * result
				+ (getFnNbr() == null ? 0 : this.getFnNbr().hashCode());
		return result;
	}

}