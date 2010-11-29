package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFp2PlanId entity provides the base persistence definition of the
 * Fp2PlanId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFp2PlanId implements java.io.Serializable {

	// Fields

	private String fp2Domain;
	private String fp2Site;
	private String fp2Part;
	private Integer fp2Year;

	// Constructors

	/** default constructor */
	public AbstractFp2PlanId() {
	}

	/** minimal constructor */
	public AbstractFp2PlanId(String fp2Domain) {
		this.fp2Domain = fp2Domain;
	}

	/** full constructor */
	public AbstractFp2PlanId(String fp2Domain, String fp2Site, String fp2Part,
			Integer fp2Year) {
		this.fp2Domain = fp2Domain;
		this.fp2Site = fp2Site;
		this.fp2Part = fp2Part;
		this.fp2Year = fp2Year;
	}

	// Property accessors

	public String getFp2Domain() {
		return this.fp2Domain;
	}

	public void setFp2Domain(String fp2Domain) {
		this.fp2Domain = fp2Domain;
	}

	public String getFp2Site() {
		return this.fp2Site;
	}

	public void setFp2Site(String fp2Site) {
		this.fp2Site = fp2Site;
	}

	public String getFp2Part() {
		return this.fp2Part;
	}

	public void setFp2Part(String fp2Part) {
		this.fp2Part = fp2Part;
	}

	public Integer getFp2Year() {
		return this.fp2Year;
	}

	public void setFp2Year(Integer fp2Year) {
		this.fp2Year = fp2Year;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFp2PlanId))
			return false;
		AbstractFp2PlanId castOther = (AbstractFp2PlanId) other;

		return ((this.getFp2Domain() == castOther.getFp2Domain()) || (this
				.getFp2Domain() != null
				&& castOther.getFp2Domain() != null && this.getFp2Domain()
				.equals(castOther.getFp2Domain())))
				&& ((this.getFp2Site() == castOther.getFp2Site()) || (this
						.getFp2Site() != null
						&& castOther.getFp2Site() != null && this.getFp2Site()
						.equals(castOther.getFp2Site())))
				&& ((this.getFp2Part() == castOther.getFp2Part()) || (this
						.getFp2Part() != null
						&& castOther.getFp2Part() != null && this.getFp2Part()
						.equals(castOther.getFp2Part())))
				&& ((this.getFp2Year() == castOther.getFp2Year()) || (this
						.getFp2Year() != null
						&& castOther.getFp2Year() != null && this.getFp2Year()
						.equals(castOther.getFp2Year())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFp2Domain() == null ? 0 : this.getFp2Domain().hashCode());
		result = 37 * result
				+ (getFp2Site() == null ? 0 : this.getFp2Site().hashCode());
		result = 37 * result
				+ (getFp2Part() == null ? 0 : this.getFp2Part().hashCode());
		result = 37 * result
				+ (getFp2Year() == null ? 0 : this.getFp2Year().hashCode());
		return result;
	}

}