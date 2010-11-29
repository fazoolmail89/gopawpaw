package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPjMstrId entity provides the base persistence definition of the
 * PjMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjMstrId implements java.io.Serializable {

	// Fields

	private String pjDomain;
	private String pjProject;

	// Constructors

	/** default constructor */
	public AbstractPjMstrId() {
	}

	/** minimal constructor */
	public AbstractPjMstrId(String pjDomain) {
		this.pjDomain = pjDomain;
	}

	/** full constructor */
	public AbstractPjMstrId(String pjDomain, String pjProject) {
		this.pjDomain = pjDomain;
		this.pjProject = pjProject;
	}

	// Property accessors

	public String getPjDomain() {
		return this.pjDomain;
	}

	public void setPjDomain(String pjDomain) {
		this.pjDomain = pjDomain;
	}

	public String getPjProject() {
		return this.pjProject;
	}

	public void setPjProject(String pjProject) {
		this.pjProject = pjProject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPjMstrId))
			return false;
		AbstractPjMstrId castOther = (AbstractPjMstrId) other;

		return ((this.getPjDomain() == castOther.getPjDomain()) || (this
				.getPjDomain() != null
				&& castOther.getPjDomain() != null && this.getPjDomain()
				.equals(castOther.getPjDomain())))
				&& ((this.getPjProject() == castOther.getPjProject()) || (this
						.getPjProject() != null
						&& castOther.getPjProject() != null && this
						.getPjProject().equals(castOther.getPjProject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPjDomain() == null ? 0 : this.getPjDomain().hashCode());
		result = 37 * result
				+ (getPjProject() == null ? 0 : this.getPjProject().hashCode());
		return result;
	}

}