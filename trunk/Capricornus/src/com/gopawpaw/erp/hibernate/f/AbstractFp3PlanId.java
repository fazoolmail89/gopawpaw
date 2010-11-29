package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFp3PlanId entity provides the base persistence definition of the
 * Fp3PlanId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFp3PlanId implements java.io.Serializable {

	// Fields

	private String fp3Domain;
	private String fp3Site;
	private String fp3Part;
	private Integer fp3Year;

	// Constructors

	/** default constructor */
	public AbstractFp3PlanId() {
	}

	/** minimal constructor */
	public AbstractFp3PlanId(String fp3Domain) {
		this.fp3Domain = fp3Domain;
	}

	/** full constructor */
	public AbstractFp3PlanId(String fp3Domain, String fp3Site, String fp3Part,
			Integer fp3Year) {
		this.fp3Domain = fp3Domain;
		this.fp3Site = fp3Site;
		this.fp3Part = fp3Part;
		this.fp3Year = fp3Year;
	}

	// Property accessors

	public String getFp3Domain() {
		return this.fp3Domain;
	}

	public void setFp3Domain(String fp3Domain) {
		this.fp3Domain = fp3Domain;
	}

	public String getFp3Site() {
		return this.fp3Site;
	}

	public void setFp3Site(String fp3Site) {
		this.fp3Site = fp3Site;
	}

	public String getFp3Part() {
		return this.fp3Part;
	}

	public void setFp3Part(String fp3Part) {
		this.fp3Part = fp3Part;
	}

	public Integer getFp3Year() {
		return this.fp3Year;
	}

	public void setFp3Year(Integer fp3Year) {
		this.fp3Year = fp3Year;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFp3PlanId))
			return false;
		AbstractFp3PlanId castOther = (AbstractFp3PlanId) other;

		return ((this.getFp3Domain() == castOther.getFp3Domain()) || (this
				.getFp3Domain() != null
				&& castOther.getFp3Domain() != null && this.getFp3Domain()
				.equals(castOther.getFp3Domain())))
				&& ((this.getFp3Site() == castOther.getFp3Site()) || (this
						.getFp3Site() != null
						&& castOther.getFp3Site() != null && this.getFp3Site()
						.equals(castOther.getFp3Site())))
				&& ((this.getFp3Part() == castOther.getFp3Part()) || (this
						.getFp3Part() != null
						&& castOther.getFp3Part() != null && this.getFp3Part()
						.equals(castOther.getFp3Part())))
				&& ((this.getFp3Year() == castOther.getFp3Year()) || (this
						.getFp3Year() != null
						&& castOther.getFp3Year() != null && this.getFp3Year()
						.equals(castOther.getFp3Year())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFp3Domain() == null ? 0 : this.getFp3Domain().hashCode());
		result = 37 * result
				+ (getFp3Site() == null ? 0 : this.getFp3Site().hashCode());
		result = 37 * result
				+ (getFp3Part() == null ? 0 : this.getFp3Part().hashCode());
		result = 37 * result
				+ (getFp3Year() == null ? 0 : this.getFp3Year().hashCode());
		return result;
	}

}