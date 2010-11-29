package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRsuMstrId entity provides the base persistence definition of the
 * RsuMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRsuMstrId implements java.io.Serializable {

	// Fields

	private String rsuDomain;
	private Integer rsuIndex;

	// Constructors

	/** default constructor */
	public AbstractRsuMstrId() {
	}

	/** full constructor */
	public AbstractRsuMstrId(String rsuDomain, Integer rsuIndex) {
		this.rsuDomain = rsuDomain;
		this.rsuIndex = rsuIndex;
	}

	// Property accessors

	public String getRsuDomain() {
		return this.rsuDomain;
	}

	public void setRsuDomain(String rsuDomain) {
		this.rsuDomain = rsuDomain;
	}

	public Integer getRsuIndex() {
		return this.rsuIndex;
	}

	public void setRsuIndex(Integer rsuIndex) {
		this.rsuIndex = rsuIndex;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRsuMstrId))
			return false;
		AbstractRsuMstrId castOther = (AbstractRsuMstrId) other;

		return ((this.getRsuDomain() == castOther.getRsuDomain()) || (this
				.getRsuDomain() != null
				&& castOther.getRsuDomain() != null && this.getRsuDomain()
				.equals(castOther.getRsuDomain())))
				&& ((this.getRsuIndex() == castOther.getRsuIndex()) || (this
						.getRsuIndex() != null
						&& castOther.getRsuIndex() != null && this
						.getRsuIndex().equals(castOther.getRsuIndex())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRsuDomain() == null ? 0 : this.getRsuDomain().hashCode());
		result = 37 * result
				+ (getRsuIndex() == null ? 0 : this.getRsuIndex().hashCode());
		return result;
	}

}