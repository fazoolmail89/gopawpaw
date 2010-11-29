package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqlMstrId entity provides the base persistence definition of the
 * RqlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqlMstrId implements java.io.Serializable {

	// Fields

	private String rqlDomain;
	private Integer rqlLevel;

	// Constructors

	/** default constructor */
	public AbstractRqlMstrId() {
	}

	/** full constructor */
	public AbstractRqlMstrId(String rqlDomain, Integer rqlLevel) {
		this.rqlDomain = rqlDomain;
		this.rqlLevel = rqlLevel;
	}

	// Property accessors

	public String getRqlDomain() {
		return this.rqlDomain;
	}

	public void setRqlDomain(String rqlDomain) {
		this.rqlDomain = rqlDomain;
	}

	public Integer getRqlLevel() {
		return this.rqlLevel;
	}

	public void setRqlLevel(Integer rqlLevel) {
		this.rqlLevel = rqlLevel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqlMstrId))
			return false;
		AbstractRqlMstrId castOther = (AbstractRqlMstrId) other;

		return ((this.getRqlDomain() == castOther.getRqlDomain()) || (this
				.getRqlDomain() != null
				&& castOther.getRqlDomain() != null && this.getRqlDomain()
				.equals(castOther.getRqlDomain())))
				&& ((this.getRqlLevel() == castOther.getRqlLevel()) || (this
						.getRqlLevel() != null
						&& castOther.getRqlLevel() != null && this
						.getRqlLevel().equals(castOther.getRqlLevel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqlDomain() == null ? 0 : this.getRqlDomain().hashCode());
		result = 37 * result
				+ (getRqlLevel() == null ? 0 : this.getRqlLevel().hashCode());
		return result;
	}

}