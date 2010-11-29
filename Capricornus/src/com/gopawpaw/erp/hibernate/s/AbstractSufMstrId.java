package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSufMstrId entity provides the base persistence definition of the
 * SufMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSufMstrId implements java.io.Serializable {

	// Fields

	private String sufDomain;
	private Integer sufLevel;
	private Integer sufFldSeq;

	// Constructors

	/** default constructor */
	public AbstractSufMstrId() {
	}

	/** full constructor */
	public AbstractSufMstrId(String sufDomain, Integer sufLevel,
			Integer sufFldSeq) {
		this.sufDomain = sufDomain;
		this.sufLevel = sufLevel;
		this.sufFldSeq = sufFldSeq;
	}

	// Property accessors

	public String getSufDomain() {
		return this.sufDomain;
	}

	public void setSufDomain(String sufDomain) {
		this.sufDomain = sufDomain;
	}

	public Integer getSufLevel() {
		return this.sufLevel;
	}

	public void setSufLevel(Integer sufLevel) {
		this.sufLevel = sufLevel;
	}

	public Integer getSufFldSeq() {
		return this.sufFldSeq;
	}

	public void setSufFldSeq(Integer sufFldSeq) {
		this.sufFldSeq = sufFldSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSufMstrId))
			return false;
		AbstractSufMstrId castOther = (AbstractSufMstrId) other;

		return ((this.getSufDomain() == castOther.getSufDomain()) || (this
				.getSufDomain() != null
				&& castOther.getSufDomain() != null && this.getSufDomain()
				.equals(castOther.getSufDomain())))
				&& ((this.getSufLevel() == castOther.getSufLevel()) || (this
						.getSufLevel() != null
						&& castOther.getSufLevel() != null && this
						.getSufLevel().equals(castOther.getSufLevel())))
				&& ((this.getSufFldSeq() == castOther.getSufFldSeq()) || (this
						.getSufFldSeq() != null
						&& castOther.getSufFldSeq() != null && this
						.getSufFldSeq().equals(castOther.getSufFldSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSufDomain() == null ? 0 : this.getSufDomain().hashCode());
		result = 37 * result
				+ (getSufLevel() == null ? 0 : this.getSufLevel().hashCode());
		result = 37 * result
				+ (getSufFldSeq() == null ? 0 : this.getSufFldSeq().hashCode());
		return result;
	}

}