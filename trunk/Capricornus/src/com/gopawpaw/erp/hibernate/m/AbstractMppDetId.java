package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMppDetId entity provides the base persistence definition of the
 * MppDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMppDetId implements java.io.Serializable {

	// Fields

	private String mppDomain;
	private String mppProgram;
	private Integer mppSequence;
	private Integer mppLine;

	// Constructors

	/** default constructor */
	public AbstractMppDetId() {
	}

	/** minimal constructor */
	public AbstractMppDetId(String mppDomain) {
		this.mppDomain = mppDomain;
	}

	/** full constructor */
	public AbstractMppDetId(String mppDomain, String mppProgram,
			Integer mppSequence, Integer mppLine) {
		this.mppDomain = mppDomain;
		this.mppProgram = mppProgram;
		this.mppSequence = mppSequence;
		this.mppLine = mppLine;
	}

	// Property accessors

	public String getMppDomain() {
		return this.mppDomain;
	}

	public void setMppDomain(String mppDomain) {
		this.mppDomain = mppDomain;
	}

	public String getMppProgram() {
		return this.mppProgram;
	}

	public void setMppProgram(String mppProgram) {
		this.mppProgram = mppProgram;
	}

	public Integer getMppSequence() {
		return this.mppSequence;
	}

	public void setMppSequence(Integer mppSequence) {
		this.mppSequence = mppSequence;
	}

	public Integer getMppLine() {
		return this.mppLine;
	}

	public void setMppLine(Integer mppLine) {
		this.mppLine = mppLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMppDetId))
			return false;
		AbstractMppDetId castOther = (AbstractMppDetId) other;

		return ((this.getMppDomain() == castOther.getMppDomain()) || (this
				.getMppDomain() != null
				&& castOther.getMppDomain() != null && this.getMppDomain()
				.equals(castOther.getMppDomain())))
				&& ((this.getMppProgram() == castOther.getMppProgram()) || (this
						.getMppProgram() != null
						&& castOther.getMppProgram() != null && this
						.getMppProgram().equals(castOther.getMppProgram())))
				&& ((this.getMppSequence() == castOther.getMppSequence()) || (this
						.getMppSequence() != null
						&& castOther.getMppSequence() != null && this
						.getMppSequence().equals(castOther.getMppSequence())))
				&& ((this.getMppLine() == castOther.getMppLine()) || (this
						.getMppLine() != null
						&& castOther.getMppLine() != null && this.getMppLine()
						.equals(castOther.getMppLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMppDomain() == null ? 0 : this.getMppDomain().hashCode());
		result = 37
				* result
				+ (getMppProgram() == null ? 0 : this.getMppProgram()
						.hashCode());
		result = 37
				* result
				+ (getMppSequence() == null ? 0 : this.getMppSequence()
						.hashCode());
		result = 37 * result
				+ (getMppLine() == null ? 0 : this.getMppLine().hashCode());
		return result;
	}

}