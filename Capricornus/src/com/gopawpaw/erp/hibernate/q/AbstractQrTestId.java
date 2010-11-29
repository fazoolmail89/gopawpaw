package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQrTestId entity provides the base persistence definition of the
 * QrTestId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQrTestId implements java.io.Serializable {

	// Fields

	private String qrDomain;
	private String qrNbr;
	private String qrLot;
	private Integer qrOp;

	// Constructors

	/** default constructor */
	public AbstractQrTestId() {
	}

	/** minimal constructor */
	public AbstractQrTestId(String qrDomain, String qrNbr, Integer qrOp) {
		this.qrDomain = qrDomain;
		this.qrNbr = qrNbr;
		this.qrOp = qrOp;
	}

	/** full constructor */
	public AbstractQrTestId(String qrDomain, String qrNbr, String qrLot,
			Integer qrOp) {
		this.qrDomain = qrDomain;
		this.qrNbr = qrNbr;
		this.qrLot = qrLot;
		this.qrOp = qrOp;
	}

	// Property accessors

	public String getQrDomain() {
		return this.qrDomain;
	}

	public void setQrDomain(String qrDomain) {
		this.qrDomain = qrDomain;
	}

	public String getQrNbr() {
		return this.qrNbr;
	}

	public void setQrNbr(String qrNbr) {
		this.qrNbr = qrNbr;
	}

	public String getQrLot() {
		return this.qrLot;
	}

	public void setQrLot(String qrLot) {
		this.qrLot = qrLot;
	}

	public Integer getQrOp() {
		return this.qrOp;
	}

	public void setQrOp(Integer qrOp) {
		this.qrOp = qrOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQrTestId))
			return false;
		AbstractQrTestId castOther = (AbstractQrTestId) other;

		return ((this.getQrDomain() == castOther.getQrDomain()) || (this
				.getQrDomain() != null
				&& castOther.getQrDomain() != null && this.getQrDomain()
				.equals(castOther.getQrDomain())))
				&& ((this.getQrNbr() == castOther.getQrNbr()) || (this
						.getQrNbr() != null
						&& castOther.getQrNbr() != null && this.getQrNbr()
						.equals(castOther.getQrNbr())))
				&& ((this.getQrLot() == castOther.getQrLot()) || (this
						.getQrLot() != null
						&& castOther.getQrLot() != null && this.getQrLot()
						.equals(castOther.getQrLot())))
				&& ((this.getQrOp() == castOther.getQrOp()) || (this.getQrOp() != null
						&& castOther.getQrOp() != null && this.getQrOp()
						.equals(castOther.getQrOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQrDomain() == null ? 0 : this.getQrDomain().hashCode());
		result = 37 * result
				+ (getQrNbr() == null ? 0 : this.getQrNbr().hashCode());
		result = 37 * result
				+ (getQrLot() == null ? 0 : this.getQrLot().hashCode());
		result = 37 * result
				+ (getQrOp() == null ? 0 : this.getQrOp().hashCode());
		return result;
	}

}