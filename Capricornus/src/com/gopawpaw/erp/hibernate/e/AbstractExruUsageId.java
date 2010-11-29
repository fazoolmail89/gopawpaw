package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractExruUsageId entity provides the base persistence definition of the
 * ExruUsageId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExruUsageId implements java.io.Serializable {

	// Fields

	private Integer exruSeq;
	private Integer exruStep;

	// Constructors

	/** default constructor */
	public AbstractExruUsageId() {
	}

	/** full constructor */
	public AbstractExruUsageId(Integer exruSeq, Integer exruStep) {
		this.exruSeq = exruSeq;
		this.exruStep = exruStep;
	}

	// Property accessors

	public Integer getExruSeq() {
		return this.exruSeq;
	}

	public void setExruSeq(Integer exruSeq) {
		this.exruSeq = exruSeq;
	}

	public Integer getExruStep() {
		return this.exruStep;
	}

	public void setExruStep(Integer exruStep) {
		this.exruStep = exruStep;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractExruUsageId))
			return false;
		AbstractExruUsageId castOther = (AbstractExruUsageId) other;

		return ((this.getExruSeq() == castOther.getExruSeq()) || (this
				.getExruSeq() != null
				&& castOther.getExruSeq() != null && this.getExruSeq().equals(
				castOther.getExruSeq())))
				&& ((this.getExruStep() == castOther.getExruStep()) || (this
						.getExruStep() != null
						&& castOther.getExruStep() != null && this
						.getExruStep().equals(castOther.getExruStep())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getExruSeq() == null ? 0 : this.getExruSeq().hashCode());
		result = 37 * result
				+ (getExruStep() == null ? 0 : this.getExruStep().hashCode());
		return result;
	}

}