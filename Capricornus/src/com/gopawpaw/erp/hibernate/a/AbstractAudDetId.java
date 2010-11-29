package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAudDetId entity provides the base persistence definition of the
 * AudDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAudDetId implements java.io.Serializable {

	// Fields

	private String audDomain;
	private Integer audEntry;

	// Constructors

	/** default constructor */
	public AbstractAudDetId() {
	}

	/** minimal constructor */
	public AbstractAudDetId(String audDomain) {
		this.audDomain = audDomain;
	}

	/** full constructor */
	public AbstractAudDetId(String audDomain, Integer audEntry) {
		this.audDomain = audDomain;
		this.audEntry = audEntry;
	}

	// Property accessors

	public String getAudDomain() {
		return this.audDomain;
	}

	public void setAudDomain(String audDomain) {
		this.audDomain = audDomain;
	}

	public Integer getAudEntry() {
		return this.audEntry;
	}

	public void setAudEntry(Integer audEntry) {
		this.audEntry = audEntry;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAudDetId))
			return false;
		AbstractAudDetId castOther = (AbstractAudDetId) other;

		return ((this.getAudDomain() == castOther.getAudDomain()) || (this
				.getAudDomain() != null
				&& castOther.getAudDomain() != null && this.getAudDomain()
				.equals(castOther.getAudDomain())))
				&& ((this.getAudEntry() == castOther.getAudEntry()) || (this
						.getAudEntry() != null
						&& castOther.getAudEntry() != null && this
						.getAudEntry().equals(castOther.getAudEntry())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAudDomain() == null ? 0 : this.getAudDomain().hashCode());
		result = 37 * result
				+ (getAudEntry() == null ? 0 : this.getAudEntry().hashCode());
		return result;
	}

}