package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFauopDetId entity provides the base persistence definition of the
 * FauopDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFauopDetId implements java.io.Serializable {

	// Fields

	private String fauopDomain;
	private String fauopFaId;
	private String fauopFabkId;
	private String fauopYrper;

	// Constructors

	/** default constructor */
	public AbstractFauopDetId() {
	}

	/** full constructor */
	public AbstractFauopDetId(String fauopDomain, String fauopFaId,
			String fauopFabkId, String fauopYrper) {
		this.fauopDomain = fauopDomain;
		this.fauopFaId = fauopFaId;
		this.fauopFabkId = fauopFabkId;
		this.fauopYrper = fauopYrper;
	}

	// Property accessors

	public String getFauopDomain() {
		return this.fauopDomain;
	}

	public void setFauopDomain(String fauopDomain) {
		this.fauopDomain = fauopDomain;
	}

	public String getFauopFaId() {
		return this.fauopFaId;
	}

	public void setFauopFaId(String fauopFaId) {
		this.fauopFaId = fauopFaId;
	}

	public String getFauopFabkId() {
		return this.fauopFabkId;
	}

	public void setFauopFabkId(String fauopFabkId) {
		this.fauopFabkId = fauopFabkId;
	}

	public String getFauopYrper() {
		return this.fauopYrper;
	}

	public void setFauopYrper(String fauopYrper) {
		this.fauopYrper = fauopYrper;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFauopDetId))
			return false;
		AbstractFauopDetId castOther = (AbstractFauopDetId) other;

		return ((this.getFauopDomain() == castOther.getFauopDomain()) || (this
				.getFauopDomain() != null
				&& castOther.getFauopDomain() != null && this.getFauopDomain()
				.equals(castOther.getFauopDomain())))
				&& ((this.getFauopFaId() == castOther.getFauopFaId()) || (this
						.getFauopFaId() != null
						&& castOther.getFauopFaId() != null && this
						.getFauopFaId().equals(castOther.getFauopFaId())))
				&& ((this.getFauopFabkId() == castOther.getFauopFabkId()) || (this
						.getFauopFabkId() != null
						&& castOther.getFauopFabkId() != null && this
						.getFauopFabkId().equals(castOther.getFauopFabkId())))
				&& ((this.getFauopYrper() == castOther.getFauopYrper()) || (this
						.getFauopYrper() != null
						&& castOther.getFauopYrper() != null && this
						.getFauopYrper().equals(castOther.getFauopYrper())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFauopDomain() == null ? 0 : this.getFauopDomain()
						.hashCode());
		result = 37 * result
				+ (getFauopFaId() == null ? 0 : this.getFauopFaId().hashCode());
		result = 37
				* result
				+ (getFauopFabkId() == null ? 0 : this.getFauopFabkId()
						.hashCode());
		result = 37
				* result
				+ (getFauopYrper() == null ? 0 : this.getFauopYrper()
						.hashCode());
		return result;
	}

}