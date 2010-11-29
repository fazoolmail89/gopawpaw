package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPouMstrId entity provides the base persistence definition of the
 * PouMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPouMstrId implements java.io.Serializable {

	// Fields

	private String pouDomain;
	private String pouCode;

	// Constructors

	/** default constructor */
	public AbstractPouMstrId() {
	}

	/** full constructor */
	public AbstractPouMstrId(String pouDomain, String pouCode) {
		this.pouDomain = pouDomain;
		this.pouCode = pouCode;
	}

	// Property accessors

	public String getPouDomain() {
		return this.pouDomain;
	}

	public void setPouDomain(String pouDomain) {
		this.pouDomain = pouDomain;
	}

	public String getPouCode() {
		return this.pouCode;
	}

	public void setPouCode(String pouCode) {
		this.pouCode = pouCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPouMstrId))
			return false;
		AbstractPouMstrId castOther = (AbstractPouMstrId) other;

		return ((this.getPouDomain() == castOther.getPouDomain()) || (this
				.getPouDomain() != null
				&& castOther.getPouDomain() != null && this.getPouDomain()
				.equals(castOther.getPouDomain())))
				&& ((this.getPouCode() == castOther.getPouCode()) || (this
						.getPouCode() != null
						&& castOther.getPouCode() != null && this.getPouCode()
						.equals(castOther.getPouCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPouDomain() == null ? 0 : this.getPouDomain().hashCode());
		result = 37 * result
				+ (getPouCode() == null ? 0 : this.getPouCode().hashCode());
		return result;
	}

}