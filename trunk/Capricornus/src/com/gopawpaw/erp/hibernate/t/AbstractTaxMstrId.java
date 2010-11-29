package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTaxMstrId entity provides the base persistence definition of the
 * TaxMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTaxMstrId implements java.io.Serializable {

	// Fields

	private String taxState;
	private String taxCounty;
	private String taxCity;
	private Date taxEffdate;

	// Constructors

	/** default constructor */
	public AbstractTaxMstrId() {
	}

	/** full constructor */
	public AbstractTaxMstrId(String taxState, String taxCounty, String taxCity,
			Date taxEffdate) {
		this.taxState = taxState;
		this.taxCounty = taxCounty;
		this.taxCity = taxCity;
		this.taxEffdate = taxEffdate;
	}

	// Property accessors

	public String getTaxState() {
		return this.taxState;
	}

	public void setTaxState(String taxState) {
		this.taxState = taxState;
	}

	public String getTaxCounty() {
		return this.taxCounty;
	}

	public void setTaxCounty(String taxCounty) {
		this.taxCounty = taxCounty;
	}

	public String getTaxCity() {
		return this.taxCity;
	}

	public void setTaxCity(String taxCity) {
		this.taxCity = taxCity;
	}

	public Date getTaxEffdate() {
		return this.taxEffdate;
	}

	public void setTaxEffdate(Date taxEffdate) {
		this.taxEffdate = taxEffdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTaxMstrId))
			return false;
		AbstractTaxMstrId castOther = (AbstractTaxMstrId) other;

		return ((this.getTaxState() == castOther.getTaxState()) || (this
				.getTaxState() != null
				&& castOther.getTaxState() != null && this.getTaxState()
				.equals(castOther.getTaxState())))
				&& ((this.getTaxCounty() == castOther.getTaxCounty()) || (this
						.getTaxCounty() != null
						&& castOther.getTaxCounty() != null && this
						.getTaxCounty().equals(castOther.getTaxCounty())))
				&& ((this.getTaxCity() == castOther.getTaxCity()) || (this
						.getTaxCity() != null
						&& castOther.getTaxCity() != null && this.getTaxCity()
						.equals(castOther.getTaxCity())))
				&& ((this.getTaxEffdate() == castOther.getTaxEffdate()) || (this
						.getTaxEffdate() != null
						&& castOther.getTaxEffdate() != null && this
						.getTaxEffdate().equals(castOther.getTaxEffdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTaxState() == null ? 0 : this.getTaxState().hashCode());
		result = 37 * result
				+ (getTaxCounty() == null ? 0 : this.getTaxCounty().hashCode());
		result = 37 * result
				+ (getTaxCity() == null ? 0 : this.getTaxCity().hashCode());
		result = 37
				* result
				+ (getTaxEffdate() == null ? 0 : this.getTaxEffdate()
						.hashCode());
		return result;
	}

}