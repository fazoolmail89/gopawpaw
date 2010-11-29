package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxbdDetId entity provides the base persistence definition of the
 * TxbdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxbdDetId implements java.io.Serializable {

	// Fields

	private String txbdDomain;
	private String txbdBase;
	private String txbdTaxType;

	// Constructors

	/** default constructor */
	public AbstractTxbdDetId() {
	}

	/** full constructor */
	public AbstractTxbdDetId(String txbdDomain, String txbdBase,
			String txbdTaxType) {
		this.txbdDomain = txbdDomain;
		this.txbdBase = txbdBase;
		this.txbdTaxType = txbdTaxType;
	}

	// Property accessors

	public String getTxbdDomain() {
		return this.txbdDomain;
	}

	public void setTxbdDomain(String txbdDomain) {
		this.txbdDomain = txbdDomain;
	}

	public String getTxbdBase() {
		return this.txbdBase;
	}

	public void setTxbdBase(String txbdBase) {
		this.txbdBase = txbdBase;
	}

	public String getTxbdTaxType() {
		return this.txbdTaxType;
	}

	public void setTxbdTaxType(String txbdTaxType) {
		this.txbdTaxType = txbdTaxType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTxbdDetId))
			return false;
		AbstractTxbdDetId castOther = (AbstractTxbdDetId) other;

		return ((this.getTxbdDomain() == castOther.getTxbdDomain()) || (this
				.getTxbdDomain() != null
				&& castOther.getTxbdDomain() != null && this.getTxbdDomain()
				.equals(castOther.getTxbdDomain())))
				&& ((this.getTxbdBase() == castOther.getTxbdBase()) || (this
						.getTxbdBase() != null
						&& castOther.getTxbdBase() != null && this
						.getTxbdBase().equals(castOther.getTxbdBase())))
				&& ((this.getTxbdTaxType() == castOther.getTxbdTaxType()) || (this
						.getTxbdTaxType() != null
						&& castOther.getTxbdTaxType() != null && this
						.getTxbdTaxType().equals(castOther.getTxbdTaxType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTxbdDomain() == null ? 0 : this.getTxbdDomain()
						.hashCode());
		result = 37 * result
				+ (getTxbdBase() == null ? 0 : this.getTxbdBase().hashCode());
		result = 37
				* result
				+ (getTxbdTaxType() == null ? 0 : this.getTxbdTaxType()
						.hashCode());
		return result;
	}

}