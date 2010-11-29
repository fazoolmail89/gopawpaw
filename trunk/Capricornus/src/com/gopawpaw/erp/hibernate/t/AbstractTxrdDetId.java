package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxrdDetId entity provides the base persistence definition of the
 * TxrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxrdDetId implements java.io.Serializable {

	// Fields

	private String txrdDomain;
	private String txrdRegister;
	private String txrdSite;
	private String txrdTranType;
	private String txrdRef;

	// Constructors

	/** default constructor */
	public AbstractTxrdDetId() {
	}

	/** full constructor */
	public AbstractTxrdDetId(String txrdDomain, String txrdRegister,
			String txrdSite, String txrdTranType, String txrdRef) {
		this.txrdDomain = txrdDomain;
		this.txrdRegister = txrdRegister;
		this.txrdSite = txrdSite;
		this.txrdTranType = txrdTranType;
		this.txrdRef = txrdRef;
	}

	// Property accessors

	public String getTxrdDomain() {
		return this.txrdDomain;
	}

	public void setTxrdDomain(String txrdDomain) {
		this.txrdDomain = txrdDomain;
	}

	public String getTxrdRegister() {
		return this.txrdRegister;
	}

	public void setTxrdRegister(String txrdRegister) {
		this.txrdRegister = txrdRegister;
	}

	public String getTxrdSite() {
		return this.txrdSite;
	}

	public void setTxrdSite(String txrdSite) {
		this.txrdSite = txrdSite;
	}

	public String getTxrdTranType() {
		return this.txrdTranType;
	}

	public void setTxrdTranType(String txrdTranType) {
		this.txrdTranType = txrdTranType;
	}

	public String getTxrdRef() {
		return this.txrdRef;
	}

	public void setTxrdRef(String txrdRef) {
		this.txrdRef = txrdRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTxrdDetId))
			return false;
		AbstractTxrdDetId castOther = (AbstractTxrdDetId) other;

		return ((this.getTxrdDomain() == castOther.getTxrdDomain()) || (this
				.getTxrdDomain() != null
				&& castOther.getTxrdDomain() != null && this.getTxrdDomain()
				.equals(castOther.getTxrdDomain())))
				&& ((this.getTxrdRegister() == castOther.getTxrdRegister()) || (this
						.getTxrdRegister() != null
						&& castOther.getTxrdRegister() != null && this
						.getTxrdRegister().equals(castOther.getTxrdRegister())))
				&& ((this.getTxrdSite() == castOther.getTxrdSite()) || (this
						.getTxrdSite() != null
						&& castOther.getTxrdSite() != null && this
						.getTxrdSite().equals(castOther.getTxrdSite())))
				&& ((this.getTxrdTranType() == castOther.getTxrdTranType()) || (this
						.getTxrdTranType() != null
						&& castOther.getTxrdTranType() != null && this
						.getTxrdTranType().equals(castOther.getTxrdTranType())))
				&& ((this.getTxrdRef() == castOther.getTxrdRef()) || (this
						.getTxrdRef() != null
						&& castOther.getTxrdRef() != null && this.getTxrdRef()
						.equals(castOther.getTxrdRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTxrdDomain() == null ? 0 : this.getTxrdDomain()
						.hashCode());
		result = 37
				* result
				+ (getTxrdRegister() == null ? 0 : this.getTxrdRegister()
						.hashCode());
		result = 37 * result
				+ (getTxrdSite() == null ? 0 : this.getTxrdSite().hashCode());
		result = 37
				* result
				+ (getTxrdTranType() == null ? 0 : this.getTxrdTranType()
						.hashCode());
		result = 37 * result
				+ (getTxrdRef() == null ? 0 : this.getTxrdRef().hashCode());
		return result;
	}

}