package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqmMstrId entity provides the base persistence definition of the
 * RqmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqmMstrId implements java.io.Serializable {

	// Fields

	private String rqmDomain;
	private String rqmNbr;

	// Constructors

	/** default constructor */
	public AbstractRqmMstrId() {
	}

	/** full constructor */
	public AbstractRqmMstrId(String rqmDomain, String rqmNbr) {
		this.rqmDomain = rqmDomain;
		this.rqmNbr = rqmNbr;
	}

	// Property accessors

	public String getRqmDomain() {
		return this.rqmDomain;
	}

	public void setRqmDomain(String rqmDomain) {
		this.rqmDomain = rqmDomain;
	}

	public String getRqmNbr() {
		return this.rqmNbr;
	}

	public void setRqmNbr(String rqmNbr) {
		this.rqmNbr = rqmNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqmMstrId))
			return false;
		AbstractRqmMstrId castOther = (AbstractRqmMstrId) other;

		return ((this.getRqmDomain() == castOther.getRqmDomain()) || (this
				.getRqmDomain() != null
				&& castOther.getRqmDomain() != null && this.getRqmDomain()
				.equals(castOther.getRqmDomain())))
				&& ((this.getRqmNbr() == castOther.getRqmNbr()) || (this
						.getRqmNbr() != null
						&& castOther.getRqmNbr() != null && this.getRqmNbr()
						.equals(castOther.getRqmNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqmDomain() == null ? 0 : this.getRqmDomain().hashCode());
		result = 37 * result
				+ (getRqmNbr() == null ? 0 : this.getRqmNbr().hashCode());
		return result;
	}

}