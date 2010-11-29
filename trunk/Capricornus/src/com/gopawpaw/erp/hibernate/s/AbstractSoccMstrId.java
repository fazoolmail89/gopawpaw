package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSoccMstrId entity provides the base persistence definition of the
 * SoccMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSoccMstrId implements java.io.Serializable {

	// Fields

	private String soccDomain;
	private String soccNbr;
	private String soccCcNbr;

	// Constructors

	/** default constructor */
	public AbstractSoccMstrId() {
	}

	/** full constructor */
	public AbstractSoccMstrId(String soccDomain, String soccNbr,
			String soccCcNbr) {
		this.soccDomain = soccDomain;
		this.soccNbr = soccNbr;
		this.soccCcNbr = soccCcNbr;
	}

	// Property accessors

	public String getSoccDomain() {
		return this.soccDomain;
	}

	public void setSoccDomain(String soccDomain) {
		this.soccDomain = soccDomain;
	}

	public String getSoccNbr() {
		return this.soccNbr;
	}

	public void setSoccNbr(String soccNbr) {
		this.soccNbr = soccNbr;
	}

	public String getSoccCcNbr() {
		return this.soccCcNbr;
	}

	public void setSoccCcNbr(String soccCcNbr) {
		this.soccCcNbr = soccCcNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSoccMstrId))
			return false;
		AbstractSoccMstrId castOther = (AbstractSoccMstrId) other;

		return ((this.getSoccDomain() == castOther.getSoccDomain()) || (this
				.getSoccDomain() != null
				&& castOther.getSoccDomain() != null && this.getSoccDomain()
				.equals(castOther.getSoccDomain())))
				&& ((this.getSoccNbr() == castOther.getSoccNbr()) || (this
						.getSoccNbr() != null
						&& castOther.getSoccNbr() != null && this.getSoccNbr()
						.equals(castOther.getSoccNbr())))
				&& ((this.getSoccCcNbr() == castOther.getSoccCcNbr()) || (this
						.getSoccCcNbr() != null
						&& castOther.getSoccCcNbr() != null && this
						.getSoccCcNbr().equals(castOther.getSoccCcNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSoccDomain() == null ? 0 : this.getSoccDomain()
						.hashCode());
		result = 37 * result
				+ (getSoccNbr() == null ? 0 : this.getSoccNbr().hashCode());
		result = 37 * result
				+ (getSoccCcNbr() == null ? 0 : this.getSoccCcNbr().hashCode());
		return result;
	}

}