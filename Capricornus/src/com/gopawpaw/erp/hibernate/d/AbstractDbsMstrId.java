package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDbsMstrId entity provides the base persistence definition of the
 * DbsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDbsMstrId implements java.io.Serializable {

	// Fields

	private Double dbsMajor;
	private String dbsMinor;

	// Constructors

	/** default constructor */
	public AbstractDbsMstrId() {
	}

	/** full constructor */
	public AbstractDbsMstrId(Double dbsMajor, String dbsMinor) {
		this.dbsMajor = dbsMajor;
		this.dbsMinor = dbsMinor;
	}

	// Property accessors

	public Double getDbsMajor() {
		return this.dbsMajor;
	}

	public void setDbsMajor(Double dbsMajor) {
		this.dbsMajor = dbsMajor;
	}

	public String getDbsMinor() {
		return this.dbsMinor;
	}

	public void setDbsMinor(String dbsMinor) {
		this.dbsMinor = dbsMinor;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractDbsMstrId))
			return false;
		AbstractDbsMstrId castOther = (AbstractDbsMstrId) other;

		return ((this.getDbsMajor() == castOther.getDbsMajor()) || (this
				.getDbsMajor() != null
				&& castOther.getDbsMajor() != null && this.getDbsMajor()
				.equals(castOther.getDbsMajor())))
				&& ((this.getDbsMinor() == castOther.getDbsMinor()) || (this
						.getDbsMinor() != null
						&& castOther.getDbsMinor() != null && this
						.getDbsMinor().equals(castOther.getDbsMinor())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDbsMajor() == null ? 0 : this.getDbsMajor().hashCode());
		result = 37 * result
				+ (getDbsMinor() == null ? 0 : this.getDbsMinor().hashCode());
		return result;
	}

}