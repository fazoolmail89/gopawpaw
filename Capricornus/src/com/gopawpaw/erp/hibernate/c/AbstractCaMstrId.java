package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCaMstrId entity provides the base persistence definition of the
 * CaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCaMstrId implements java.io.Serializable {

	// Fields

	private String caDomain;
	private String caCategory;
	private String caNbr;

	// Constructors

	/** default constructor */
	public AbstractCaMstrId() {
	}

	/** minimal constructor */
	public AbstractCaMstrId(String caDomain) {
		this.caDomain = caDomain;
	}

	/** full constructor */
	public AbstractCaMstrId(String caDomain, String caCategory, String caNbr) {
		this.caDomain = caDomain;
		this.caCategory = caCategory;
		this.caNbr = caNbr;
	}

	// Property accessors

	public String getCaDomain() {
		return this.caDomain;
	}

	public void setCaDomain(String caDomain) {
		this.caDomain = caDomain;
	}

	public String getCaCategory() {
		return this.caCategory;
	}

	public void setCaCategory(String caCategory) {
		this.caCategory = caCategory;
	}

	public String getCaNbr() {
		return this.caNbr;
	}

	public void setCaNbr(String caNbr) {
		this.caNbr = caNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCaMstrId))
			return false;
		AbstractCaMstrId castOther = (AbstractCaMstrId) other;

		return ((this.getCaDomain() == castOther.getCaDomain()) || (this
				.getCaDomain() != null
				&& castOther.getCaDomain() != null && this.getCaDomain()
				.equals(castOther.getCaDomain())))
				&& ((this.getCaCategory() == castOther.getCaCategory()) || (this
						.getCaCategory() != null
						&& castOther.getCaCategory() != null && this
						.getCaCategory().equals(castOther.getCaCategory())))
				&& ((this.getCaNbr() == castOther.getCaNbr()) || (this
						.getCaNbr() != null
						&& castOther.getCaNbr() != null && this.getCaNbr()
						.equals(castOther.getCaNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCaDomain() == null ? 0 : this.getCaDomain().hashCode());
		result = 37
				* result
				+ (getCaCategory() == null ? 0 : this.getCaCategory()
						.hashCode());
		result = 37 * result
				+ (getCaNbr() == null ? 0 : this.getCaNbr().hashCode());
		return result;
	}

}