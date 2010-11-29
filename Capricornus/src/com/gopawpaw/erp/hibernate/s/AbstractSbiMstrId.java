package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSbiMstrId entity provides the base persistence definition of the
 * SbiMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbiMstrId implements java.io.Serializable {

	// Fields

	private String sbiDomain;
	private String sbiBill;
	private String sbiNbr;

	// Constructors

	/** default constructor */
	public AbstractSbiMstrId() {
	}

	/** full constructor */
	public AbstractSbiMstrId(String sbiDomain, String sbiBill, String sbiNbr) {
		this.sbiDomain = sbiDomain;
		this.sbiBill = sbiBill;
		this.sbiNbr = sbiNbr;
	}

	// Property accessors

	public String getSbiDomain() {
		return this.sbiDomain;
	}

	public void setSbiDomain(String sbiDomain) {
		this.sbiDomain = sbiDomain;
	}

	public String getSbiBill() {
		return this.sbiBill;
	}

	public void setSbiBill(String sbiBill) {
		this.sbiBill = sbiBill;
	}

	public String getSbiNbr() {
		return this.sbiNbr;
	}

	public void setSbiNbr(String sbiNbr) {
		this.sbiNbr = sbiNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSbiMstrId))
			return false;
		AbstractSbiMstrId castOther = (AbstractSbiMstrId) other;

		return ((this.getSbiDomain() == castOther.getSbiDomain()) || (this
				.getSbiDomain() != null
				&& castOther.getSbiDomain() != null && this.getSbiDomain()
				.equals(castOther.getSbiDomain())))
				&& ((this.getSbiBill() == castOther.getSbiBill()) || (this
						.getSbiBill() != null
						&& castOther.getSbiBill() != null && this.getSbiBill()
						.equals(castOther.getSbiBill())))
				&& ((this.getSbiNbr() == castOther.getSbiNbr()) || (this
						.getSbiNbr() != null
						&& castOther.getSbiNbr() != null && this.getSbiNbr()
						.equals(castOther.getSbiNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSbiDomain() == null ? 0 : this.getSbiDomain().hashCode());
		result = 37 * result
				+ (getSbiBill() == null ? 0 : this.getSbiBill().hashCode());
		result = 37 * result
				+ (getSbiNbr() == null ? 0 : this.getSbiNbr().hashCode());
		return result;
	}

}