package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSbcMstrId entity provides the base persistence definition of the
 * SbcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbcMstrId implements java.io.Serializable {

	// Fields

	private String sbcDomain;
	private String sbcCode;

	// Constructors

	/** default constructor */
	public AbstractSbcMstrId() {
	}

	/** minimal constructor */
	public AbstractSbcMstrId(String sbcDomain) {
		this.sbcDomain = sbcDomain;
	}

	/** full constructor */
	public AbstractSbcMstrId(String sbcDomain, String sbcCode) {
		this.sbcDomain = sbcDomain;
		this.sbcCode = sbcCode;
	}

	// Property accessors

	public String getSbcDomain() {
		return this.sbcDomain;
	}

	public void setSbcDomain(String sbcDomain) {
		this.sbcDomain = sbcDomain;
	}

	public String getSbcCode() {
		return this.sbcCode;
	}

	public void setSbcCode(String sbcCode) {
		this.sbcCode = sbcCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSbcMstrId))
			return false;
		AbstractSbcMstrId castOther = (AbstractSbcMstrId) other;

		return ((this.getSbcDomain() == castOther.getSbcDomain()) || (this
				.getSbcDomain() != null
				&& castOther.getSbcDomain() != null && this.getSbcDomain()
				.equals(castOther.getSbcDomain())))
				&& ((this.getSbcCode() == castOther.getSbcCode()) || (this
						.getSbcCode() != null
						&& castOther.getSbcCode() != null && this.getSbcCode()
						.equals(castOther.getSbcCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSbcDomain() == null ? 0 : this.getSbcDomain().hashCode());
		result = 37 * result
				+ (getSbcCode() == null ? 0 : this.getSbcCode().hashCode());
		return result;
	}

}