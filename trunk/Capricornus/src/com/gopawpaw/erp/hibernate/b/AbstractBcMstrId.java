package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBcMstrId entity provides the base persistence definition of the
 * BcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBcMstrId implements java.io.Serializable {

	// Fields

	private String bcDomain;
	private String bcBatch;

	// Constructors

	/** default constructor */
	public AbstractBcMstrId() {
	}

	/** minimal constructor */
	public AbstractBcMstrId(String bcDomain) {
		this.bcDomain = bcDomain;
	}

	/** full constructor */
	public AbstractBcMstrId(String bcDomain, String bcBatch) {
		this.bcDomain = bcDomain;
		this.bcBatch = bcBatch;
	}

	// Property accessors

	public String getBcDomain() {
		return this.bcDomain;
	}

	public void setBcDomain(String bcDomain) {
		this.bcDomain = bcDomain;
	}

	public String getBcBatch() {
		return this.bcBatch;
	}

	public void setBcBatch(String bcBatch) {
		this.bcBatch = bcBatch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBcMstrId))
			return false;
		AbstractBcMstrId castOther = (AbstractBcMstrId) other;

		return ((this.getBcDomain() == castOther.getBcDomain()) || (this
				.getBcDomain() != null
				&& castOther.getBcDomain() != null && this.getBcDomain()
				.equals(castOther.getBcDomain())))
				&& ((this.getBcBatch() == castOther.getBcBatch()) || (this
						.getBcBatch() != null
						&& castOther.getBcBatch() != null && this.getBcBatch()
						.equals(castOther.getBcBatch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBcDomain() == null ? 0 : this.getBcDomain().hashCode());
		result = 37 * result
				+ (getBcBatch() == null ? 0 : this.getBcBatch().hashCode());
		return result;
	}

}