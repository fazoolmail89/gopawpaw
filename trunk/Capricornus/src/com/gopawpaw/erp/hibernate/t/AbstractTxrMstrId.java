package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxrMstrId entity provides the base persistence definition of the
 * TxrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxrMstrId implements java.io.Serializable {

	// Fields

	private String txrDomain;
	private String txrRegister;
	private String txrSite;

	// Constructors

	/** default constructor */
	public AbstractTxrMstrId() {
	}

	/** full constructor */
	public AbstractTxrMstrId(String txrDomain, String txrRegister,
			String txrSite) {
		this.txrDomain = txrDomain;
		this.txrRegister = txrRegister;
		this.txrSite = txrSite;
	}

	// Property accessors

	public String getTxrDomain() {
		return this.txrDomain;
	}

	public void setTxrDomain(String txrDomain) {
		this.txrDomain = txrDomain;
	}

	public String getTxrRegister() {
		return this.txrRegister;
	}

	public void setTxrRegister(String txrRegister) {
		this.txrRegister = txrRegister;
	}

	public String getTxrSite() {
		return this.txrSite;
	}

	public void setTxrSite(String txrSite) {
		this.txrSite = txrSite;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTxrMstrId))
			return false;
		AbstractTxrMstrId castOther = (AbstractTxrMstrId) other;

		return ((this.getTxrDomain() == castOther.getTxrDomain()) || (this
				.getTxrDomain() != null
				&& castOther.getTxrDomain() != null && this.getTxrDomain()
				.equals(castOther.getTxrDomain())))
				&& ((this.getTxrRegister() == castOther.getTxrRegister()) || (this
						.getTxrRegister() != null
						&& castOther.getTxrRegister() != null && this
						.getTxrRegister().equals(castOther.getTxrRegister())))
				&& ((this.getTxrSite() == castOther.getTxrSite()) || (this
						.getTxrSite() != null
						&& castOther.getTxrSite() != null && this.getTxrSite()
						.equals(castOther.getTxrSite())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTxrDomain() == null ? 0 : this.getTxrDomain().hashCode());
		result = 37
				* result
				+ (getTxrRegister() == null ? 0 : this.getTxrRegister()
						.hashCode());
		result = 37 * result
				+ (getTxrSite() == null ? 0 : this.getTxrSite().hashCode());
		return result;
	}

}