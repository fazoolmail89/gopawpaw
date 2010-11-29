package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSbMstrId entity provides the base persistence definition of the
 * SbMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbMstrId implements java.io.Serializable {

	// Fields

	private String sbDomain;
	private String sbSub;
	private Boolean sbActive;

	// Constructors

	/** default constructor */
	public AbstractSbMstrId() {
	}

	/** minimal constructor */
	public AbstractSbMstrId(String sbDomain) {
		this.sbDomain = sbDomain;
	}

	/** full constructor */
	public AbstractSbMstrId(String sbDomain, String sbSub, Boolean sbActive) {
		this.sbDomain = sbDomain;
		this.sbSub = sbSub;
		this.sbActive = sbActive;
	}

	// Property accessors

	public String getSbDomain() {
		return this.sbDomain;
	}

	public void setSbDomain(String sbDomain) {
		this.sbDomain = sbDomain;
	}

	public String getSbSub() {
		return this.sbSub;
	}

	public void setSbSub(String sbSub) {
		this.sbSub = sbSub;
	}

	public Boolean getSbActive() {
		return this.sbActive;
	}

	public void setSbActive(Boolean sbActive) {
		this.sbActive = sbActive;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSbMstrId))
			return false;
		AbstractSbMstrId castOther = (AbstractSbMstrId) other;

		return ((this.getSbDomain() == castOther.getSbDomain()) || (this
				.getSbDomain() != null
				&& castOther.getSbDomain() != null && this.getSbDomain()
				.equals(castOther.getSbDomain())))
				&& ((this.getSbSub() == castOther.getSbSub()) || (this
						.getSbSub() != null
						&& castOther.getSbSub() != null && this.getSbSub()
						.equals(castOther.getSbSub())))
				&& ((this.getSbActive() == castOther.getSbActive()) || (this
						.getSbActive() != null
						&& castOther.getSbActive() != null && this
						.getSbActive().equals(castOther.getSbActive())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSbDomain() == null ? 0 : this.getSbDomain().hashCode());
		result = 37 * result
				+ (getSbSub() == null ? 0 : this.getSbSub().hashCode());
		result = 37 * result
				+ (getSbActive() == null ? 0 : this.getSbActive().hashCode());
		return result;
	}

}