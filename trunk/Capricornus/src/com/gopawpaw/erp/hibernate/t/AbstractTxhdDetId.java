package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTxhdDetId entity provides the base persistence definition of the
 * TxhdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxhdDetId implements java.io.Serializable {

	// Fields

	private String txhdDomain;
	private Integer txhdTrNbr;

	// Constructors

	/** default constructor */
	public AbstractTxhdDetId() {
	}

	/** full constructor */
	public AbstractTxhdDetId(String txhdDomain, Integer txhdTrNbr) {
		this.txhdDomain = txhdDomain;
		this.txhdTrNbr = txhdTrNbr;
	}

	// Property accessors

	public String getTxhdDomain() {
		return this.txhdDomain;
	}

	public void setTxhdDomain(String txhdDomain) {
		this.txhdDomain = txhdDomain;
	}

	public Integer getTxhdTrNbr() {
		return this.txhdTrNbr;
	}

	public void setTxhdTrNbr(Integer txhdTrNbr) {
		this.txhdTrNbr = txhdTrNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractTxhdDetId))
			return false;
		AbstractTxhdDetId castOther = (AbstractTxhdDetId) other;

		return ((this.getTxhdDomain() == castOther.getTxhdDomain()) || (this
				.getTxhdDomain() != null
				&& castOther.getTxhdDomain() != null && this.getTxhdDomain()
				.equals(castOther.getTxhdDomain())))
				&& ((this.getTxhdTrNbr() == castOther.getTxhdTrNbr()) || (this
						.getTxhdTrNbr() != null
						&& castOther.getTxhdTrNbr() != null && this
						.getTxhdTrNbr().equals(castOther.getTxhdTrNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTxhdDomain() == null ? 0 : this.getTxhdDomain()
						.hashCode());
		result = 37 * result
				+ (getTxhdTrNbr() == null ? 0 : this.getTxhdTrNbr().hashCode());
		return result;
	}

}