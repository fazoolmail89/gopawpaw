package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGricDetId entity provides the base persistence definition of the
 * GricDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGricDetId implements java.io.Serializable {

	// Fields

	private String gricDomain;
	private Integer gricRunId;
	private Integer gricCol;

	// Constructors

	/** default constructor */
	public AbstractGricDetId() {
	}

	/** minimal constructor */
	public AbstractGricDetId(String gricDomain) {
		this.gricDomain = gricDomain;
	}

	/** full constructor */
	public AbstractGricDetId(String gricDomain, Integer gricRunId,
			Integer gricCol) {
		this.gricDomain = gricDomain;
		this.gricRunId = gricRunId;
		this.gricCol = gricCol;
	}

	// Property accessors

	public String getGricDomain() {
		return this.gricDomain;
	}

	public void setGricDomain(String gricDomain) {
		this.gricDomain = gricDomain;
	}

	public Integer getGricRunId() {
		return this.gricRunId;
	}

	public void setGricRunId(Integer gricRunId) {
		this.gricRunId = gricRunId;
	}

	public Integer getGricCol() {
		return this.gricCol;
	}

	public void setGricCol(Integer gricCol) {
		this.gricCol = gricCol;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGricDetId))
			return false;
		AbstractGricDetId castOther = (AbstractGricDetId) other;

		return ((this.getGricDomain() == castOther.getGricDomain()) || (this
				.getGricDomain() != null
				&& castOther.getGricDomain() != null && this.getGricDomain()
				.equals(castOther.getGricDomain())))
				&& ((this.getGricRunId() == castOther.getGricRunId()) || (this
						.getGricRunId() != null
						&& castOther.getGricRunId() != null && this
						.getGricRunId().equals(castOther.getGricRunId())))
				&& ((this.getGricCol() == castOther.getGricCol()) || (this
						.getGricCol() != null
						&& castOther.getGricCol() != null && this.getGricCol()
						.equals(castOther.getGricCol())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGricDomain() == null ? 0 : this.getGricDomain()
						.hashCode());
		result = 37 * result
				+ (getGricRunId() == null ? 0 : this.getGricRunId().hashCode());
		result = 37 * result
				+ (getGricCol() == null ? 0 : this.getGricCol().hashCode());
		return result;
	}

}