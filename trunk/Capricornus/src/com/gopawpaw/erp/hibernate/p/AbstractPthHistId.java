package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPthHistId entity provides the base persistence definition of the
 * PthHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPthHistId implements java.io.Serializable {

	// Fields

	private String pthDomain;
	private Integer pthYear;
	private String pthPart;

	// Constructors

	/** default constructor */
	public AbstractPthHistId() {
	}

	/** minimal constructor */
	public AbstractPthHistId(String pthDomain, Integer pthYear) {
		this.pthDomain = pthDomain;
		this.pthYear = pthYear;
	}

	/** full constructor */
	public AbstractPthHistId(String pthDomain, Integer pthYear, String pthPart) {
		this.pthDomain = pthDomain;
		this.pthYear = pthYear;
		this.pthPart = pthPart;
	}

	// Property accessors

	public String getPthDomain() {
		return this.pthDomain;
	}

	public void setPthDomain(String pthDomain) {
		this.pthDomain = pthDomain;
	}

	public Integer getPthYear() {
		return this.pthYear;
	}

	public void setPthYear(Integer pthYear) {
		this.pthYear = pthYear;
	}

	public String getPthPart() {
		return this.pthPart;
	}

	public void setPthPart(String pthPart) {
		this.pthPart = pthPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPthHistId))
			return false;
		AbstractPthHistId castOther = (AbstractPthHistId) other;

		return ((this.getPthDomain() == castOther.getPthDomain()) || (this
				.getPthDomain() != null
				&& castOther.getPthDomain() != null && this.getPthDomain()
				.equals(castOther.getPthDomain())))
				&& ((this.getPthYear() == castOther.getPthYear()) || (this
						.getPthYear() != null
						&& castOther.getPthYear() != null && this.getPthYear()
						.equals(castOther.getPthYear())))
				&& ((this.getPthPart() == castOther.getPthPart()) || (this
						.getPthPart() != null
						&& castOther.getPthPart() != null && this.getPthPart()
						.equals(castOther.getPthPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPthDomain() == null ? 0 : this.getPthDomain().hashCode());
		result = 37 * result
				+ (getPthYear() == null ? 0 : this.getPthYear().hashCode());
		result = 37 * result
				+ (getPthPart() == null ? 0 : this.getPthPart().hashCode());
		return result;
	}

}