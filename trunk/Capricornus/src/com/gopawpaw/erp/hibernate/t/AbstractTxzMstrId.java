package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxzMstrId entity provides the base persistence definition of the
 * TxzMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxzMstrId implements java.io.Serializable {

	// Fields

	private String txzDomain;
	private String txzTaxZone;

	// Constructors

	/** default constructor */
	public AbstractTxzMstrId() {
	}

	/** full constructor */
	public AbstractTxzMstrId(String txzDomain, String txzTaxZone) {
		this.txzDomain = txzDomain;
		this.txzTaxZone = txzTaxZone;
	}

	// Property accessors

	public String getTxzDomain() {
		return this.txzDomain;
	}

	public void setTxzDomain(String txzDomain) {
		this.txzDomain = txzDomain;
	}

	public String getTxzTaxZone() {
		return this.txzTaxZone;
	}

	public void setTxzTaxZone(String txzTaxZone) {
		this.txzTaxZone = txzTaxZone;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTxzMstrId))
			return false;
		AbstractTxzMstrId castOther = (AbstractTxzMstrId) other;

		return ((this.getTxzDomain() == castOther.getTxzDomain()) || (this
				.getTxzDomain() != null
				&& castOther.getTxzDomain() != null && this.getTxzDomain()
				.equals(castOther.getTxzDomain())))
				&& ((this.getTxzTaxZone() == castOther.getTxzTaxZone()) || (this
						.getTxzTaxZone() != null
						&& castOther.getTxzTaxZone() != null && this
						.getTxzTaxZone().equals(castOther.getTxzTaxZone())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTxzDomain() == null ? 0 : this.getTxzDomain().hashCode());
		result = 37
				* result
				+ (getTxzTaxZone() == null ? 0 : this.getTxzTaxZone()
						.hashCode());
		return result;
	}

}