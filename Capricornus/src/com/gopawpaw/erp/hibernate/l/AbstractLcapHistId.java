package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLcapHistId entity provides the base persistence definition of the
 * LcapHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLcapHistId implements java.io.Serializable {

	// Fields

	private String lcapDb;
	private String lcapTable;
	private String lcapQualifier;
	private String lcapPeriod;

	// Constructors

	/** default constructor */
	public AbstractLcapHistId() {
	}

	/** full constructor */
	public AbstractLcapHistId(String lcapDb, String lcapTable,
			String lcapQualifier, String lcapPeriod) {
		this.lcapDb = lcapDb;
		this.lcapTable = lcapTable;
		this.lcapQualifier = lcapQualifier;
		this.lcapPeriod = lcapPeriod;
	}

	// Property accessors

	public String getLcapDb() {
		return this.lcapDb;
	}

	public void setLcapDb(String lcapDb) {
		this.lcapDb = lcapDb;
	}

	public String getLcapTable() {
		return this.lcapTable;
	}

	public void setLcapTable(String lcapTable) {
		this.lcapTable = lcapTable;
	}

	public String getLcapQualifier() {
		return this.lcapQualifier;
	}

	public void setLcapQualifier(String lcapQualifier) {
		this.lcapQualifier = lcapQualifier;
	}

	public String getLcapPeriod() {
		return this.lcapPeriod;
	}

	public void setLcapPeriod(String lcapPeriod) {
		this.lcapPeriod = lcapPeriod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLcapHistId))
			return false;
		AbstractLcapHistId castOther = (AbstractLcapHistId) other;

		return ((this.getLcapDb() == castOther.getLcapDb()) || (this
				.getLcapDb() != null
				&& castOther.getLcapDb() != null && this.getLcapDb().equals(
				castOther.getLcapDb())))
				&& ((this.getLcapTable() == castOther.getLcapTable()) || (this
						.getLcapTable() != null
						&& castOther.getLcapTable() != null && this
						.getLcapTable().equals(castOther.getLcapTable())))
				&& ((this.getLcapQualifier() == castOther.getLcapQualifier()) || (this
						.getLcapQualifier() != null
						&& castOther.getLcapQualifier() != null && this
						.getLcapQualifier()
						.equals(castOther.getLcapQualifier())))
				&& ((this.getLcapPeriod() == castOther.getLcapPeriod()) || (this
						.getLcapPeriod() != null
						&& castOther.getLcapPeriod() != null && this
						.getLcapPeriod().equals(castOther.getLcapPeriod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLcapDb() == null ? 0 : this.getLcapDb().hashCode());
		result = 37 * result
				+ (getLcapTable() == null ? 0 : this.getLcapTable().hashCode());
		result = 37
				* result
				+ (getLcapQualifier() == null ? 0 : this.getLcapQualifier()
						.hashCode());
		result = 37
				* result
				+ (getLcapPeriod() == null ? 0 : this.getLcapPeriod()
						.hashCode());
		return result;
	}

}