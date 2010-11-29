package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFktMstrId entity provides the base persistence definition of the
 * FktMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFktMstrId implements java.io.Serializable {

	// Fields

	private String fktDomain;
	private String fktSerial;

	// Constructors

	/** default constructor */
	public AbstractFktMstrId() {
	}

	/** minimal constructor */
	public AbstractFktMstrId(String fktDomain) {
		this.fktDomain = fktDomain;
	}

	/** full constructor */
	public AbstractFktMstrId(String fktDomain, String fktSerial) {
		this.fktDomain = fktDomain;
		this.fktSerial = fktSerial;
	}

	// Property accessors

	public String getFktDomain() {
		return this.fktDomain;
	}

	public void setFktDomain(String fktDomain) {
		this.fktDomain = fktDomain;
	}

	public String getFktSerial() {
		return this.fktSerial;
	}

	public void setFktSerial(String fktSerial) {
		this.fktSerial = fktSerial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFktMstrId))
			return false;
		AbstractFktMstrId castOther = (AbstractFktMstrId) other;

		return ((this.getFktDomain() == castOther.getFktDomain()) || (this
				.getFktDomain() != null
				&& castOther.getFktDomain() != null && this.getFktDomain()
				.equals(castOther.getFktDomain())))
				&& ((this.getFktSerial() == castOther.getFktSerial()) || (this
						.getFktSerial() != null
						&& castOther.getFktSerial() != null && this
						.getFktSerial().equals(castOther.getFktSerial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFktDomain() == null ? 0 : this.getFktDomain().hashCode());
		result = 37 * result
				+ (getFktSerial() == null ? 0 : this.getFktSerial().hashCode());
		return result;
	}

}