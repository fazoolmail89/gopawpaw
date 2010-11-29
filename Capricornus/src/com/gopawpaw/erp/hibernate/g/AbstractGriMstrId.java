package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGriMstrId entity provides the base persistence definition of the
 * GriMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGriMstrId implements java.io.Serializable {

	// Fields

	private String griDomain;
	private String griReport;
	private Integer griRunId;

	// Constructors

	/** default constructor */
	public AbstractGriMstrId() {
	}

	/** minimal constructor */
	public AbstractGriMstrId(String griDomain) {
		this.griDomain = griDomain;
	}

	/** full constructor */
	public AbstractGriMstrId(String griDomain, String griReport,
			Integer griRunId) {
		this.griDomain = griDomain;
		this.griReport = griReport;
		this.griRunId = griRunId;
	}

	// Property accessors

	public String getGriDomain() {
		return this.griDomain;
	}

	public void setGriDomain(String griDomain) {
		this.griDomain = griDomain;
	}

	public String getGriReport() {
		return this.griReport;
	}

	public void setGriReport(String griReport) {
		this.griReport = griReport;
	}

	public Integer getGriRunId() {
		return this.griRunId;
	}

	public void setGriRunId(Integer griRunId) {
		this.griRunId = griRunId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGriMstrId))
			return false;
		AbstractGriMstrId castOther = (AbstractGriMstrId) other;

		return ((this.getGriDomain() == castOther.getGriDomain()) || (this
				.getGriDomain() != null
				&& castOther.getGriDomain() != null && this.getGriDomain()
				.equals(castOther.getGriDomain())))
				&& ((this.getGriReport() == castOther.getGriReport()) || (this
						.getGriReport() != null
						&& castOther.getGriReport() != null && this
						.getGriReport().equals(castOther.getGriReport())))
				&& ((this.getGriRunId() == castOther.getGriRunId()) || (this
						.getGriRunId() != null
						&& castOther.getGriRunId() != null && this
						.getGriRunId().equals(castOther.getGriRunId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGriDomain() == null ? 0 : this.getGriDomain().hashCode());
		result = 37 * result
				+ (getGriReport() == null ? 0 : this.getGriReport().hashCode());
		result = 37 * result
				+ (getGriRunId() == null ? 0 : this.getGriRunId().hashCode());
		return result;
	}

}