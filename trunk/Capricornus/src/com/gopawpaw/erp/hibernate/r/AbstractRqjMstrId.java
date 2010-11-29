package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqjMstrId entity provides the base persistence definition of the
 * RqjMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqjMstrId implements java.io.Serializable {

	// Fields

	private String rqjDomain;
	private String rqjJob;

	// Constructors

	/** default constructor */
	public AbstractRqjMstrId() {
	}

	/** minimal constructor */
	public AbstractRqjMstrId(String rqjDomain) {
		this.rqjDomain = rqjDomain;
	}

	/** full constructor */
	public AbstractRqjMstrId(String rqjDomain, String rqjJob) {
		this.rqjDomain = rqjDomain;
		this.rqjJob = rqjJob;
	}

	// Property accessors

	public String getRqjDomain() {
		return this.rqjDomain;
	}

	public void setRqjDomain(String rqjDomain) {
		this.rqjDomain = rqjDomain;
	}

	public String getRqjJob() {
		return this.rqjJob;
	}

	public void setRqjJob(String rqjJob) {
		this.rqjJob = rqjJob;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqjMstrId))
			return false;
		AbstractRqjMstrId castOther = (AbstractRqjMstrId) other;

		return ((this.getRqjDomain() == castOther.getRqjDomain()) || (this
				.getRqjDomain() != null
				&& castOther.getRqjDomain() != null && this.getRqjDomain()
				.equals(castOther.getRqjDomain())))
				&& ((this.getRqjJob() == castOther.getRqjJob()) || (this
						.getRqjJob() != null
						&& castOther.getRqjJob() != null && this.getRqjJob()
						.equals(castOther.getRqjJob())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqjDomain() == null ? 0 : this.getRqjDomain().hashCode());
		result = 37 * result
				+ (getRqjJob() == null ? 0 : this.getRqjJob().hashCode());
		return result;
	}

}