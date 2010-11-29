package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTaxdDetId entity provides the base persistence definition of the
 * TaxdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTaxdDetId implements java.io.Serializable {

	// Fields

	private String taxdState;
	private String taxdCounty;
	private String taxdCity;
	private Date taxdEffdate;

	// Constructors

	/** default constructor */
	public AbstractTaxdDetId() {
	}

	/** full constructor */
	public AbstractTaxdDetId(String taxdState, String taxdCounty,
			String taxdCity, Date taxdEffdate) {
		this.taxdState = taxdState;
		this.taxdCounty = taxdCounty;
		this.taxdCity = taxdCity;
		this.taxdEffdate = taxdEffdate;
	}

	// Property accessors

	public String getTaxdState() {
		return this.taxdState;
	}

	public void setTaxdState(String taxdState) {
		this.taxdState = taxdState;
	}

	public String getTaxdCounty() {
		return this.taxdCounty;
	}

	public void setTaxdCounty(String taxdCounty) {
		this.taxdCounty = taxdCounty;
	}

	public String getTaxdCity() {
		return this.taxdCity;
	}

	public void setTaxdCity(String taxdCity) {
		this.taxdCity = taxdCity;
	}

	public Date getTaxdEffdate() {
		return this.taxdEffdate;
	}

	public void setTaxdEffdate(Date taxdEffdate) {
		this.taxdEffdate = taxdEffdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTaxdDetId))
			return false;
		AbstractTaxdDetId castOther = (AbstractTaxdDetId) other;

		return ((this.getTaxdState() == castOther.getTaxdState()) || (this
				.getTaxdState() != null
				&& castOther.getTaxdState() != null && this.getTaxdState()
				.equals(castOther.getTaxdState())))
				&& ((this.getTaxdCounty() == castOther.getTaxdCounty()) || (this
						.getTaxdCounty() != null
						&& castOther.getTaxdCounty() != null && this
						.getTaxdCounty().equals(castOther.getTaxdCounty())))
				&& ((this.getTaxdCity() == castOther.getTaxdCity()) || (this
						.getTaxdCity() != null
						&& castOther.getTaxdCity() != null && this
						.getTaxdCity().equals(castOther.getTaxdCity())))
				&& ((this.getTaxdEffdate() == castOther.getTaxdEffdate()) || (this
						.getTaxdEffdate() != null
						&& castOther.getTaxdEffdate() != null && this
						.getTaxdEffdate().equals(castOther.getTaxdEffdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTaxdState() == null ? 0 : this.getTaxdState().hashCode());
		result = 37
				* result
				+ (getTaxdCounty() == null ? 0 : this.getTaxdCounty()
						.hashCode());
		result = 37 * result
				+ (getTaxdCity() == null ? 0 : this.getTaxdCity().hashCode());
		result = 37
				* result
				+ (getTaxdEffdate() == null ? 0 : this.getTaxdEffdate()
						.hashCode());
		return result;
	}

}