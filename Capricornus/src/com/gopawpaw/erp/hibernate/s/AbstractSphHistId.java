package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSphHistId entity provides the base persistence definition of the
 * SphHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSphHistId implements java.io.Serializable {

	// Fields

	private String sphDomain;
	private Integer sphYear;
	private String sphSlspsn1;

	// Constructors

	/** default constructor */
	public AbstractSphHistId() {
	}

	/** minimal constructor */
	public AbstractSphHistId(String sphDomain) {
		this.sphDomain = sphDomain;
	}

	/** full constructor */
	public AbstractSphHistId(String sphDomain, Integer sphYear,
			String sphSlspsn1) {
		this.sphDomain = sphDomain;
		this.sphYear = sphYear;
		this.sphSlspsn1 = sphSlspsn1;
	}

	// Property accessors

	public String getSphDomain() {
		return this.sphDomain;
	}

	public void setSphDomain(String sphDomain) {
		this.sphDomain = sphDomain;
	}

	public Integer getSphYear() {
		return this.sphYear;
	}

	public void setSphYear(Integer sphYear) {
		this.sphYear = sphYear;
	}

	public String getSphSlspsn1() {
		return this.sphSlspsn1;
	}

	public void setSphSlspsn1(String sphSlspsn1) {
		this.sphSlspsn1 = sphSlspsn1;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSphHistId))
			return false;
		AbstractSphHistId castOther = (AbstractSphHistId) other;

		return ((this.getSphDomain() == castOther.getSphDomain()) || (this
				.getSphDomain() != null
				&& castOther.getSphDomain() != null && this.getSphDomain()
				.equals(castOther.getSphDomain())))
				&& ((this.getSphYear() == castOther.getSphYear()) || (this
						.getSphYear() != null
						&& castOther.getSphYear() != null && this.getSphYear()
						.equals(castOther.getSphYear())))
				&& ((this.getSphSlspsn1() == castOther.getSphSlspsn1()) || (this
						.getSphSlspsn1() != null
						&& castOther.getSphSlspsn1() != null && this
						.getSphSlspsn1().equals(castOther.getSphSlspsn1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSphDomain() == null ? 0 : this.getSphDomain().hashCode());
		result = 37 * result
				+ (getSphYear() == null ? 0 : this.getSphYear().hashCode());
		result = 37
				* result
				+ (getSphSlspsn1() == null ? 0 : this.getSphSlspsn1()
						.hashCode());
		return result;
	}

}