package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFpstMstrId entity provides the base persistence definition of the
 * FpstMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpstMstrId implements java.io.Serializable {

	// Fields

	private String fpstDomain;
	private String fpstStatus;

	// Constructors

	/** default constructor */
	public AbstractFpstMstrId() {
	}

	/** minimal constructor */
	public AbstractFpstMstrId(String fpstDomain) {
		this.fpstDomain = fpstDomain;
	}

	/** full constructor */
	public AbstractFpstMstrId(String fpstDomain, String fpstStatus) {
		this.fpstDomain = fpstDomain;
		this.fpstStatus = fpstStatus;
	}

	// Property accessors

	public String getFpstDomain() {
		return this.fpstDomain;
	}

	public void setFpstDomain(String fpstDomain) {
		this.fpstDomain = fpstDomain;
	}

	public String getFpstStatus() {
		return this.fpstStatus;
	}

	public void setFpstStatus(String fpstStatus) {
		this.fpstStatus = fpstStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFpstMstrId))
			return false;
		AbstractFpstMstrId castOther = (AbstractFpstMstrId) other;

		return ((this.getFpstDomain() == castOther.getFpstDomain()) || (this
				.getFpstDomain() != null
				&& castOther.getFpstDomain() != null && this.getFpstDomain()
				.equals(castOther.getFpstDomain())))
				&& ((this.getFpstStatus() == castOther.getFpstStatus()) || (this
						.getFpstStatus() != null
						&& castOther.getFpstStatus() != null && this
						.getFpstStatus().equals(castOther.getFpstStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFpstDomain() == null ? 0 : this.getFpstDomain()
						.hashCode());
		result = 37
				* result
				+ (getFpstStatus() == null ? 0 : this.getFpstStatus()
						.hashCode());
		return result;
	}

}