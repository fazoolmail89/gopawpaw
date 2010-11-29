package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDfMstrId entity provides the base persistence definition of the
 * DfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDfMstrId implements java.io.Serializable {

	// Fields

	private String dfDomain;
	private String dfType;
	private String dfFormat;

	// Constructors

	/** default constructor */
	public AbstractDfMstrId() {
	}

	/** full constructor */
	public AbstractDfMstrId(String dfDomain, String dfType, String dfFormat) {
		this.dfDomain = dfDomain;
		this.dfType = dfType;
		this.dfFormat = dfFormat;
	}

	// Property accessors

	public String getDfDomain() {
		return this.dfDomain;
	}

	public void setDfDomain(String dfDomain) {
		this.dfDomain = dfDomain;
	}

	public String getDfType() {
		return this.dfType;
	}

	public void setDfType(String dfType) {
		this.dfType = dfType;
	}

	public String getDfFormat() {
		return this.dfFormat;
	}

	public void setDfFormat(String dfFormat) {
		this.dfFormat = dfFormat;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDfMstrId))
			return false;
		AbstractDfMstrId castOther = (AbstractDfMstrId) other;

		return ((this.getDfDomain() == castOther.getDfDomain()) || (this
				.getDfDomain() != null
				&& castOther.getDfDomain() != null && this.getDfDomain()
				.equals(castOther.getDfDomain())))
				&& ((this.getDfType() == castOther.getDfType()) || (this
						.getDfType() != null
						&& castOther.getDfType() != null && this.getDfType()
						.equals(castOther.getDfType())))
				&& ((this.getDfFormat() == castOther.getDfFormat()) || (this
						.getDfFormat() != null
						&& castOther.getDfFormat() != null && this
						.getDfFormat().equals(castOther.getDfFormat())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDfDomain() == null ? 0 : this.getDfDomain().hashCode());
		result = 37 * result
				+ (getDfType() == null ? 0 : this.getDfType().hashCode());
		result = 37 * result
				+ (getDfFormat() == null ? 0 : this.getDfFormat().hashCode());
		return result;
	}

}