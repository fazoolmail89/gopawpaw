package com.gopawpaw.erp.hibernate.b;

/**
 * AbstractBkfmMstrId entity provides the base persistence definition of the
 * BkfmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkfmMstrId implements java.io.Serializable {

	// Fields

	private String bkfmValidation;
	private Integer bkfmSequence;

	// Constructors

	/** default constructor */
	public AbstractBkfmMstrId() {
	}

	/** full constructor */
	public AbstractBkfmMstrId(String bkfmValidation, Integer bkfmSequence) {
		this.bkfmValidation = bkfmValidation;
		this.bkfmSequence = bkfmSequence;
	}

	// Property accessors

	public String getBkfmValidation() {
		return this.bkfmValidation;
	}

	public void setBkfmValidation(String bkfmValidation) {
		this.bkfmValidation = bkfmValidation;
	}

	public Integer getBkfmSequence() {
		return this.bkfmSequence;
	}

	public void setBkfmSequence(Integer bkfmSequence) {
		this.bkfmSequence = bkfmSequence;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBkfmMstrId))
			return false;
		AbstractBkfmMstrId castOther = (AbstractBkfmMstrId) other;

		return ((this.getBkfmValidation() == castOther.getBkfmValidation()) || (this
				.getBkfmValidation() != null
				&& castOther.getBkfmValidation() != null && this
				.getBkfmValidation().equals(castOther.getBkfmValidation())))
				&& ((this.getBkfmSequence() == castOther.getBkfmSequence()) || (this
						.getBkfmSequence() != null
						&& castOther.getBkfmSequence() != null && this
						.getBkfmSequence().equals(castOther.getBkfmSequence())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getBkfmValidation() == null ? 0 : this.getBkfmValidation()
						.hashCode());
		result = 37
				* result
				+ (getBkfmSequence() == null ? 0 : this.getBkfmSequence()
						.hashCode());
		return result;
	}

}