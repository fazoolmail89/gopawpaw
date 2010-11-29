package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFp1PlanId entity provides the base persistence definition of the
 * Fp1PlanId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFp1PlanId implements java.io.Serializable {

	// Fields

	private String fp1Domain;
	private String fp1Site;
	private String fp1Part;
	private Integer fp1Year;

	// Constructors

	/** default constructor */
	public AbstractFp1PlanId() {
	}

	/** minimal constructor */
	public AbstractFp1PlanId(String fp1Domain) {
		this.fp1Domain = fp1Domain;
	}

	/** full constructor */
	public AbstractFp1PlanId(String fp1Domain, String fp1Site, String fp1Part,
			Integer fp1Year) {
		this.fp1Domain = fp1Domain;
		this.fp1Site = fp1Site;
		this.fp1Part = fp1Part;
		this.fp1Year = fp1Year;
	}

	// Property accessors

	public String getFp1Domain() {
		return this.fp1Domain;
	}

	public void setFp1Domain(String fp1Domain) {
		this.fp1Domain = fp1Domain;
	}

	public String getFp1Site() {
		return this.fp1Site;
	}

	public void setFp1Site(String fp1Site) {
		this.fp1Site = fp1Site;
	}

	public String getFp1Part() {
		return this.fp1Part;
	}

	public void setFp1Part(String fp1Part) {
		this.fp1Part = fp1Part;
	}

	public Integer getFp1Year() {
		return this.fp1Year;
	}

	public void setFp1Year(Integer fp1Year) {
		this.fp1Year = fp1Year;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFp1PlanId))
			return false;
		AbstractFp1PlanId castOther = (AbstractFp1PlanId) other;

		return ((this.getFp1Domain() == castOther.getFp1Domain()) || (this
				.getFp1Domain() != null
				&& castOther.getFp1Domain() != null && this.getFp1Domain()
				.equals(castOther.getFp1Domain())))
				&& ((this.getFp1Site() == castOther.getFp1Site()) || (this
						.getFp1Site() != null
						&& castOther.getFp1Site() != null && this.getFp1Site()
						.equals(castOther.getFp1Site())))
				&& ((this.getFp1Part() == castOther.getFp1Part()) || (this
						.getFp1Part() != null
						&& castOther.getFp1Part() != null && this.getFp1Part()
						.equals(castOther.getFp1Part())))
				&& ((this.getFp1Year() == castOther.getFp1Year()) || (this
						.getFp1Year() != null
						&& castOther.getFp1Year() != null && this.getFp1Year()
						.equals(castOther.getFp1Year())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFp1Domain() == null ? 0 : this.getFp1Domain().hashCode());
		result = 37 * result
				+ (getFp1Site() == null ? 0 : this.getFp1Site().hashCode());
		result = 37 * result
				+ (getFp1Part() == null ? 0 : this.getFp1Part().hashCode());
		result = 37 * result
				+ (getFp1Year() == null ? 0 : this.getFp1Year().hashCode());
		return result;
	}

}