package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTx2MstrId entity provides the base persistence definition of the
 * Tx2MstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTx2MstrId implements java.io.Serializable {

	// Fields

	private String tx2Domain;
	private String tx2TaxCode;

	// Constructors

	/** default constructor */
	public AbstractTx2MstrId() {
	}

	/** full constructor */
	public AbstractTx2MstrId(String tx2Domain, String tx2TaxCode) {
		this.tx2Domain = tx2Domain;
		this.tx2TaxCode = tx2TaxCode;
	}

	// Property accessors

	public String getTx2Domain() {
		return this.tx2Domain;
	}

	public void setTx2Domain(String tx2Domain) {
		this.tx2Domain = tx2Domain;
	}

	public String getTx2TaxCode() {
		return this.tx2TaxCode;
	}

	public void setTx2TaxCode(String tx2TaxCode) {
		this.tx2TaxCode = tx2TaxCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTx2MstrId))
			return false;
		AbstractTx2MstrId castOther = (AbstractTx2MstrId) other;

		return ((this.getTx2Domain() == castOther.getTx2Domain()) || (this
				.getTx2Domain() != null
				&& castOther.getTx2Domain() != null && this.getTx2Domain()
				.equals(castOther.getTx2Domain())))
				&& ((this.getTx2TaxCode() == castOther.getTx2TaxCode()) || (this
						.getTx2TaxCode() != null
						&& castOther.getTx2TaxCode() != null && this
						.getTx2TaxCode().equals(castOther.getTx2TaxCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTx2Domain() == null ? 0 : this.getTx2Domain().hashCode());
		result = 37
				* result
				+ (getTx2TaxCode() == null ? 0 : this.getTx2TaxCode()
						.hashCode());
		return result;
	}

}