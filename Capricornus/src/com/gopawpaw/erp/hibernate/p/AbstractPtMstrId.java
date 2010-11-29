package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtMstrId entity provides the base persistence definition of the
 * PtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtMstrId implements java.io.Serializable {

	// Fields

	private String ptDomain;
	private String ptPart;

	// Constructors

	/** default constructor */
	public AbstractPtMstrId() {
	}

	/** full constructor */
	public AbstractPtMstrId(String ptDomain, String ptPart) {
		this.ptDomain = ptDomain;
		this.ptPart = ptPart;
	}

	// Property accessors

	public String getPtDomain() {
		return this.ptDomain;
	}

	public void setPtDomain(String ptDomain) {
		this.ptDomain = ptDomain;
	}

	public String getPtPart() {
		return this.ptPart;
	}

	public void setPtPart(String ptPart) {
		this.ptPart = ptPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtMstrId))
			return false;
		AbstractPtMstrId castOther = (AbstractPtMstrId) other;

		return ((this.getPtDomain() == castOther.getPtDomain()) || (this
				.getPtDomain() != null
				&& castOther.getPtDomain() != null && this.getPtDomain()
				.equals(castOther.getPtDomain())))
				&& ((this.getPtPart() == castOther.getPtPart()) || (this
						.getPtPart() != null
						&& castOther.getPtPart() != null && this.getPtPart()
						.equals(castOther.getPtPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtDomain() == null ? 0 : this.getPtDomain().hashCode());
		result = 37 * result
				+ (getPtPart() == null ? 0 : this.getPtPart().hashCode());
		return result;
	}

}