package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCpcMstrId entity provides the base persistence definition of the
 * CpcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCpcMstrId implements java.io.Serializable {

	// Fields

	private String cpcDomain;
	private String cpcCust;
	private Integer cpcYear;
	private String cpcType;

	// Constructors

	/** default constructor */
	public AbstractCpcMstrId() {
	}

	/** minimal constructor */
	public AbstractCpcMstrId(String cpcDomain) {
		this.cpcDomain = cpcDomain;
	}

	/** full constructor */
	public AbstractCpcMstrId(String cpcDomain, String cpcCust, Integer cpcYear,
			String cpcType) {
		this.cpcDomain = cpcDomain;
		this.cpcCust = cpcCust;
		this.cpcYear = cpcYear;
		this.cpcType = cpcType;
	}

	// Property accessors

	public String getCpcDomain() {
		return this.cpcDomain;
	}

	public void setCpcDomain(String cpcDomain) {
		this.cpcDomain = cpcDomain;
	}

	public String getCpcCust() {
		return this.cpcCust;
	}

	public void setCpcCust(String cpcCust) {
		this.cpcCust = cpcCust;
	}

	public Integer getCpcYear() {
		return this.cpcYear;
	}

	public void setCpcYear(Integer cpcYear) {
		this.cpcYear = cpcYear;
	}

	public String getCpcType() {
		return this.cpcType;
	}

	public void setCpcType(String cpcType) {
		this.cpcType = cpcType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCpcMstrId))
			return false;
		AbstractCpcMstrId castOther = (AbstractCpcMstrId) other;

		return ((this.getCpcDomain() == castOther.getCpcDomain()) || (this
				.getCpcDomain() != null
				&& castOther.getCpcDomain() != null && this.getCpcDomain()
				.equals(castOther.getCpcDomain())))
				&& ((this.getCpcCust() == castOther.getCpcCust()) || (this
						.getCpcCust() != null
						&& castOther.getCpcCust() != null && this.getCpcCust()
						.equals(castOther.getCpcCust())))
				&& ((this.getCpcYear() == castOther.getCpcYear()) || (this
						.getCpcYear() != null
						&& castOther.getCpcYear() != null && this.getCpcYear()
						.equals(castOther.getCpcYear())))
				&& ((this.getCpcType() == castOther.getCpcType()) || (this
						.getCpcType() != null
						&& castOther.getCpcType() != null && this.getCpcType()
						.equals(castOther.getCpcType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCpcDomain() == null ? 0 : this.getCpcDomain().hashCode());
		result = 37 * result
				+ (getCpcCust() == null ? 0 : this.getCpcCust().hashCode());
		result = 37 * result
				+ (getCpcYear() == null ? 0 : this.getCpcYear().hashCode());
		result = 37 * result
				+ (getCpcType() == null ? 0 : this.getCpcType().hashCode());
		return result;
	}

}