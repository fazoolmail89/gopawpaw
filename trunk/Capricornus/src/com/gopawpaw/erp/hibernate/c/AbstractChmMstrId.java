package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractChmMstrId entity provides the base persistence definition of the
 * ChmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractChmMstrId implements java.io.Serializable {

	// Fields

	private String chmDomain;
	private String chmCategory;
	private String chmNbr;
	private Date chmOpnDate;

	// Constructors

	/** default constructor */
	public AbstractChmMstrId() {
	}

	/** minimal constructor */
	public AbstractChmMstrId(String chmDomain) {
		this.chmDomain = chmDomain;
	}

	/** full constructor */
	public AbstractChmMstrId(String chmDomain, String chmCategory,
			String chmNbr, Date chmOpnDate) {
		this.chmDomain = chmDomain;
		this.chmCategory = chmCategory;
		this.chmNbr = chmNbr;
		this.chmOpnDate = chmOpnDate;
	}

	// Property accessors

	public String getChmDomain() {
		return this.chmDomain;
	}

	public void setChmDomain(String chmDomain) {
		this.chmDomain = chmDomain;
	}

	public String getChmCategory() {
		return this.chmCategory;
	}

	public void setChmCategory(String chmCategory) {
		this.chmCategory = chmCategory;
	}

	public String getChmNbr() {
		return this.chmNbr;
	}

	public void setChmNbr(String chmNbr) {
		this.chmNbr = chmNbr;
	}

	public Date getChmOpnDate() {
		return this.chmOpnDate;
	}

	public void setChmOpnDate(Date chmOpnDate) {
		this.chmOpnDate = chmOpnDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractChmMstrId))
			return false;
		AbstractChmMstrId castOther = (AbstractChmMstrId) other;

		return ((this.getChmDomain() == castOther.getChmDomain()) || (this
				.getChmDomain() != null
				&& castOther.getChmDomain() != null && this.getChmDomain()
				.equals(castOther.getChmDomain())))
				&& ((this.getChmCategory() == castOther.getChmCategory()) || (this
						.getChmCategory() != null
						&& castOther.getChmCategory() != null && this
						.getChmCategory().equals(castOther.getChmCategory())))
				&& ((this.getChmNbr() == castOther.getChmNbr()) || (this
						.getChmNbr() != null
						&& castOther.getChmNbr() != null && this.getChmNbr()
						.equals(castOther.getChmNbr())))
				&& ((this.getChmOpnDate() == castOther.getChmOpnDate()) || (this
						.getChmOpnDate() != null
						&& castOther.getChmOpnDate() != null && this
						.getChmOpnDate().equals(castOther.getChmOpnDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getChmDomain() == null ? 0 : this.getChmDomain().hashCode());
		result = 37
				* result
				+ (getChmCategory() == null ? 0 : this.getChmCategory()
						.hashCode());
		result = 37 * result
				+ (getChmNbr() == null ? 0 : this.getChmNbr().hashCode());
		result = 37
				* result
				+ (getChmOpnDate() == null ? 0 : this.getChmOpnDate()
						.hashCode());
		return result;
	}

}