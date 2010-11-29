package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtcDetId entity provides the base persistence definition of the
 * PtcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtcDetId implements java.io.Serializable {

	// Fields

	private String ptcDomain;
	private String ptcPart;

	// Constructors

	/** default constructor */
	public AbstractPtcDetId() {
	}

	/** full constructor */
	public AbstractPtcDetId(String ptcDomain, String ptcPart) {
		this.ptcDomain = ptcDomain;
		this.ptcPart = ptcPart;
	}

	// Property accessors

	public String getPtcDomain() {
		return this.ptcDomain;
	}

	public void setPtcDomain(String ptcDomain) {
		this.ptcDomain = ptcDomain;
	}

	public String getPtcPart() {
		return this.ptcPart;
	}

	public void setPtcPart(String ptcPart) {
		this.ptcPart = ptcPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtcDetId))
			return false;
		AbstractPtcDetId castOther = (AbstractPtcDetId) other;

		return ((this.getPtcDomain() == castOther.getPtcDomain()) || (this
				.getPtcDomain() != null
				&& castOther.getPtcDomain() != null && this.getPtcDomain()
				.equals(castOther.getPtcDomain())))
				&& ((this.getPtcPart() == castOther.getPtcPart()) || (this
						.getPtcPart() != null
						&& castOther.getPtcPart() != null && this.getPtcPart()
						.equals(castOther.getPtcPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtcDomain() == null ? 0 : this.getPtcDomain().hashCode());
		result = 37 * result
				+ (getPtcPart() == null ? 0 : this.getPtcPart().hashCode());
		return result;
	}

}