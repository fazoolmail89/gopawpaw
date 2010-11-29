package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractApmrMstrId entity provides the base persistence definition of the
 * ApmrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractApmrMstrId implements java.io.Serializable {

	// Fields

	private String apmrDomain;
	private Integer apmrSeq;

	// Constructors

	/** default constructor */
	public AbstractApmrMstrId() {
	}

	/** minimal constructor */
	public AbstractApmrMstrId(String apmrDomain) {
		this.apmrDomain = apmrDomain;
	}

	/** full constructor */
	public AbstractApmrMstrId(String apmrDomain, Integer apmrSeq) {
		this.apmrDomain = apmrDomain;
		this.apmrSeq = apmrSeq;
	}

	// Property accessors

	public String getApmrDomain() {
		return this.apmrDomain;
	}

	public void setApmrDomain(String apmrDomain) {
		this.apmrDomain = apmrDomain;
	}

	public Integer getApmrSeq() {
		return this.apmrSeq;
	}

	public void setApmrSeq(Integer apmrSeq) {
		this.apmrSeq = apmrSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractApmrMstrId))
			return false;
		AbstractApmrMstrId castOther = (AbstractApmrMstrId) other;

		return ((this.getApmrDomain() == castOther.getApmrDomain()) || (this
				.getApmrDomain() != null
				&& castOther.getApmrDomain() != null && this.getApmrDomain()
				.equals(castOther.getApmrDomain())))
				&& ((this.getApmrSeq() == castOther.getApmrSeq()) || (this
						.getApmrSeq() != null
						&& castOther.getApmrSeq() != null && this.getApmrSeq()
						.equals(castOther.getApmrSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getApmrDomain() == null ? 0 : this.getApmrDomain()
						.hashCode());
		result = 37 * result
				+ (getApmrSeq() == null ? 0 : this.getApmrSeq().hashCode());
		return result;
	}

}