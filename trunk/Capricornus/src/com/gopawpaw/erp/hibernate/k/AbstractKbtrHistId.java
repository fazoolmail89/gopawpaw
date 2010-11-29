package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKbtrHistId entity provides the base persistence definition of the
 * KbtrHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbtrHistId implements java.io.Serializable {

	// Fields

	private String kbtrDomain;
	private Integer kbtrTransNbr;

	// Constructors

	/** default constructor */
	public AbstractKbtrHistId() {
	}

	/** full constructor */
	public AbstractKbtrHistId(String kbtrDomain, Integer kbtrTransNbr) {
		this.kbtrDomain = kbtrDomain;
		this.kbtrTransNbr = kbtrTransNbr;
	}

	// Property accessors

	public String getKbtrDomain() {
		return this.kbtrDomain;
	}

	public void setKbtrDomain(String kbtrDomain) {
		this.kbtrDomain = kbtrDomain;
	}

	public Integer getKbtrTransNbr() {
		return this.kbtrTransNbr;
	}

	public void setKbtrTransNbr(Integer kbtrTransNbr) {
		this.kbtrTransNbr = kbtrTransNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKbtrHistId))
			return false;
		AbstractKbtrHistId castOther = (AbstractKbtrHistId) other;

		return ((this.getKbtrDomain() == castOther.getKbtrDomain()) || (this
				.getKbtrDomain() != null
				&& castOther.getKbtrDomain() != null && this.getKbtrDomain()
				.equals(castOther.getKbtrDomain())))
				&& ((this.getKbtrTransNbr() == castOther.getKbtrTransNbr()) || (this
						.getKbtrTransNbr() != null
						&& castOther.getKbtrTransNbr() != null && this
						.getKbtrTransNbr().equals(castOther.getKbtrTransNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKbtrDomain() == null ? 0 : this.getKbtrDomain()
						.hashCode());
		result = 37
				* result
				+ (getKbtrTransNbr() == null ? 0 : this.getKbtrTransNbr()
						.hashCode());
		return result;
	}

}