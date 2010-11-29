package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKbppMstrId entity provides the base persistence definition of the
 * KbppMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbppMstrId implements java.io.Serializable {

	// Fields

	private String kbppDomain;
	private String kbppPeriod;

	// Constructors

	/** default constructor */
	public AbstractKbppMstrId() {
	}

	/** full constructor */
	public AbstractKbppMstrId(String kbppDomain, String kbppPeriod) {
		this.kbppDomain = kbppDomain;
		this.kbppPeriod = kbppPeriod;
	}

	// Property accessors

	public String getKbppDomain() {
		return this.kbppDomain;
	}

	public void setKbppDomain(String kbppDomain) {
		this.kbppDomain = kbppDomain;
	}

	public String getKbppPeriod() {
		return this.kbppPeriod;
	}

	public void setKbppPeriod(String kbppPeriod) {
		this.kbppPeriod = kbppPeriod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKbppMstrId))
			return false;
		AbstractKbppMstrId castOther = (AbstractKbppMstrId) other;

		return ((this.getKbppDomain() == castOther.getKbppDomain()) || (this
				.getKbppDomain() != null
				&& castOther.getKbppDomain() != null && this.getKbppDomain()
				.equals(castOther.getKbppDomain())))
				&& ((this.getKbppPeriod() == castOther.getKbppPeriod()) || (this
						.getKbppPeriod() != null
						&& castOther.getKbppPeriod() != null && this
						.getKbppPeriod().equals(castOther.getKbppPeriod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKbppDomain() == null ? 0 : this.getKbppDomain()
						.hashCode());
		result = 37
				* result
				+ (getKbppPeriod() == null ? 0 : this.getKbppPeriod()
						.hashCode());
		return result;
	}

}