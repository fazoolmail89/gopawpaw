package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcMstrId entity provides the base persistence definition of the
 * AcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcMstrId implements java.io.Serializable {

	// Fields

	private String acDomain;
	private String acCode;

	// Constructors

	/** default constructor */
	public AbstractAcMstrId() {
	}

	/** minimal constructor */
	public AbstractAcMstrId(String acDomain) {
		this.acDomain = acDomain;
	}

	/** full constructor */
	public AbstractAcMstrId(String acDomain, String acCode) {
		this.acDomain = acDomain;
		this.acCode = acCode;
	}

	// Property accessors

	public String getAcDomain() {
		return this.acDomain;
	}

	public void setAcDomain(String acDomain) {
		this.acDomain = acDomain;
	}

	public String getAcCode() {
		return this.acCode;
	}

	public void setAcCode(String acCode) {
		this.acCode = acCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAcMstrId))
			return false;
		AbstractAcMstrId castOther = (AbstractAcMstrId) other;

		return ((this.getAcDomain() == castOther.getAcDomain()) || (this
				.getAcDomain() != null
				&& castOther.getAcDomain() != null && this.getAcDomain()
				.equals(castOther.getAcDomain())))
				&& ((this.getAcCode() == castOther.getAcCode()) || (this
						.getAcCode() != null
						&& castOther.getAcCode() != null && this.getAcCode()
						.equals(castOther.getAcCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAcDomain() == null ? 0 : this.getAcDomain().hashCode());
		result = 37 * result
				+ (getAcCode() == null ? 0 : this.getAcCode().hashCode());
		return result;
	}

}