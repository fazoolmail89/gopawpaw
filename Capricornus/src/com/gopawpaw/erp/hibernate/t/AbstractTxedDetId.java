package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxedDetId entity provides the base persistence definition of the
 * TxedDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxedDetId implements java.io.Serializable {

	// Fields

	private String txedDomain;
	private String txedTaxEnv;
	private String txedTaxType;

	// Constructors

	/** default constructor */
	public AbstractTxedDetId() {
	}

	/** full constructor */
	public AbstractTxedDetId(String txedDomain, String txedTaxEnv,
			String txedTaxType) {
		this.txedDomain = txedDomain;
		this.txedTaxEnv = txedTaxEnv;
		this.txedTaxType = txedTaxType;
	}

	// Property accessors

	public String getTxedDomain() {
		return this.txedDomain;
	}

	public void setTxedDomain(String txedDomain) {
		this.txedDomain = txedDomain;
	}

	public String getTxedTaxEnv() {
		return this.txedTaxEnv;
	}

	public void setTxedTaxEnv(String txedTaxEnv) {
		this.txedTaxEnv = txedTaxEnv;
	}

	public String getTxedTaxType() {
		return this.txedTaxType;
	}

	public void setTxedTaxType(String txedTaxType) {
		this.txedTaxType = txedTaxType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTxedDetId))
			return false;
		AbstractTxedDetId castOther = (AbstractTxedDetId) other;

		return ((this.getTxedDomain() == castOther.getTxedDomain()) || (this
				.getTxedDomain() != null
				&& castOther.getTxedDomain() != null && this.getTxedDomain()
				.equals(castOther.getTxedDomain())))
				&& ((this.getTxedTaxEnv() == castOther.getTxedTaxEnv()) || (this
						.getTxedTaxEnv() != null
						&& castOther.getTxedTaxEnv() != null && this
						.getTxedTaxEnv().equals(castOther.getTxedTaxEnv())))
				&& ((this.getTxedTaxType() == castOther.getTxedTaxType()) || (this
						.getTxedTaxType() != null
						&& castOther.getTxedTaxType() != null && this
						.getTxedTaxType().equals(castOther.getTxedTaxType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTxedDomain() == null ? 0 : this.getTxedDomain()
						.hashCode());
		result = 37
				* result
				+ (getTxedTaxEnv() == null ? 0 : this.getTxedTaxEnv()
						.hashCode());
		result = 37
				* result
				+ (getTxedTaxType() == null ? 0 : this.getTxedTaxType()
						.hashCode());
		return result;
	}

}