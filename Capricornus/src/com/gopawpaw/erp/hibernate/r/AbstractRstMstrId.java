package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRstMstrId entity provides the base persistence definition of the
 * RstMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRstMstrId implements java.io.Serializable {

	// Fields

	private String rstDomain;
	private String rstApprCode;

	// Constructors

	/** default constructor */
	public AbstractRstMstrId() {
	}

	/** full constructor */
	public AbstractRstMstrId(String rstDomain, String rstApprCode) {
		this.rstDomain = rstDomain;
		this.rstApprCode = rstApprCode;
	}

	// Property accessors

	public String getRstDomain() {
		return this.rstDomain;
	}

	public void setRstDomain(String rstDomain) {
		this.rstDomain = rstDomain;
	}

	public String getRstApprCode() {
		return this.rstApprCode;
	}

	public void setRstApprCode(String rstApprCode) {
		this.rstApprCode = rstApprCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRstMstrId))
			return false;
		AbstractRstMstrId castOther = (AbstractRstMstrId) other;

		return ((this.getRstDomain() == castOther.getRstDomain()) || (this
				.getRstDomain() != null
				&& castOther.getRstDomain() != null && this.getRstDomain()
				.equals(castOther.getRstDomain())))
				&& ((this.getRstApprCode() == castOther.getRstApprCode()) || (this
						.getRstApprCode() != null
						&& castOther.getRstApprCode() != null && this
						.getRstApprCode().equals(castOther.getRstApprCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRstDomain() == null ? 0 : this.getRstDomain().hashCode());
		result = 37
				* result
				+ (getRstApprCode() == null ? 0 : this.getRstApprCode()
						.hashCode());
		return result;
	}

}