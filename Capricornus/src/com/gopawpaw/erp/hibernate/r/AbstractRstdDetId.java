package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRstdDetId entity provides the base persistence definition of the
 * RstdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRstdDetId implements java.io.Serializable {

	// Fields

	private String rstdDomain;
	private String rstdApprCode;
	private String rstdGroup;

	// Constructors

	/** default constructor */
	public AbstractRstdDetId() {
	}

	/** full constructor */
	public AbstractRstdDetId(String rstdDomain, String rstdApprCode,
			String rstdGroup) {
		this.rstdDomain = rstdDomain;
		this.rstdApprCode = rstdApprCode;
		this.rstdGroup = rstdGroup;
	}

	// Property accessors

	public String getRstdDomain() {
		return this.rstdDomain;
	}

	public void setRstdDomain(String rstdDomain) {
		this.rstdDomain = rstdDomain;
	}

	public String getRstdApprCode() {
		return this.rstdApprCode;
	}

	public void setRstdApprCode(String rstdApprCode) {
		this.rstdApprCode = rstdApprCode;
	}

	public String getRstdGroup() {
		return this.rstdGroup;
	}

	public void setRstdGroup(String rstdGroup) {
		this.rstdGroup = rstdGroup;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRstdDetId))
			return false;
		AbstractRstdDetId castOther = (AbstractRstdDetId) other;

		return ((this.getRstdDomain() == castOther.getRstdDomain()) || (this
				.getRstdDomain() != null
				&& castOther.getRstdDomain() != null && this.getRstdDomain()
				.equals(castOther.getRstdDomain())))
				&& ((this.getRstdApprCode() == castOther.getRstdApprCode()) || (this
						.getRstdApprCode() != null
						&& castOther.getRstdApprCode() != null && this
						.getRstdApprCode().equals(castOther.getRstdApprCode())))
				&& ((this.getRstdGroup() == castOther.getRstdGroup()) || (this
						.getRstdGroup() != null
						&& castOther.getRstdGroup() != null && this
						.getRstdGroup().equals(castOther.getRstdGroup())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRstdDomain() == null ? 0 : this.getRstdDomain()
						.hashCode());
		result = 37
				* result
				+ (getRstdApprCode() == null ? 0 : this.getRstdApprCode()
						.hashCode());
		result = 37 * result
				+ (getRstdGroup() == null ? 0 : this.getRstdGroup().hashCode());
		return result;
	}

}