package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxeMstrId entity provides the base persistence definition of the
 * TxeMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxeMstrId implements java.io.Serializable {

	// Fields

	private String txeDomain;
	private String txeTaxEnv;

	// Constructors

	/** default constructor */
	public AbstractTxeMstrId() {
	}

	/** full constructor */
	public AbstractTxeMstrId(String txeDomain, String txeTaxEnv) {
		this.txeDomain = txeDomain;
		this.txeTaxEnv = txeTaxEnv;
	}

	// Property accessors

	public String getTxeDomain() {
		return this.txeDomain;
	}

	public void setTxeDomain(String txeDomain) {
		this.txeDomain = txeDomain;
	}

	public String getTxeTaxEnv() {
		return this.txeTaxEnv;
	}

	public void setTxeTaxEnv(String txeTaxEnv) {
		this.txeTaxEnv = txeTaxEnv;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTxeMstrId))
			return false;
		AbstractTxeMstrId castOther = (AbstractTxeMstrId) other;

		return ((this.getTxeDomain() == castOther.getTxeDomain()) || (this
				.getTxeDomain() != null
				&& castOther.getTxeDomain() != null && this.getTxeDomain()
				.equals(castOther.getTxeDomain())))
				&& ((this.getTxeTaxEnv() == castOther.getTxeTaxEnv()) || (this
						.getTxeTaxEnv() != null
						&& castOther.getTxeTaxEnv() != null && this
						.getTxeTaxEnv().equals(castOther.getTxeTaxEnv())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTxeDomain() == null ? 0 : this.getTxeDomain().hashCode());
		result = 37 * result
				+ (getTxeTaxEnv() == null ? 0 : this.getTxeTaxEnv().hashCode());
		return result;
	}

}