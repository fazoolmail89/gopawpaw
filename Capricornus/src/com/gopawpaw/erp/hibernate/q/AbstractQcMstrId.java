package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQcMstrId entity provides the base persistence definition of the
 * QcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQcMstrId implements java.io.Serializable {

	// Fields

	private String qcDomain;
	private String qcNbr;
	private String qcLot;

	// Constructors

	/** default constructor */
	public AbstractQcMstrId() {
	}

	/** minimal constructor */
	public AbstractQcMstrId(String qcDomain, String qcNbr) {
		this.qcDomain = qcDomain;
		this.qcNbr = qcNbr;
	}

	/** full constructor */
	public AbstractQcMstrId(String qcDomain, String qcNbr, String qcLot) {
		this.qcDomain = qcDomain;
		this.qcNbr = qcNbr;
		this.qcLot = qcLot;
	}

	// Property accessors

	public String getQcDomain() {
		return this.qcDomain;
	}

	public void setQcDomain(String qcDomain) {
		this.qcDomain = qcDomain;
	}

	public String getQcNbr() {
		return this.qcNbr;
	}

	public void setQcNbr(String qcNbr) {
		this.qcNbr = qcNbr;
	}

	public String getQcLot() {
		return this.qcLot;
	}

	public void setQcLot(String qcLot) {
		this.qcLot = qcLot;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQcMstrId))
			return false;
		AbstractQcMstrId castOther = (AbstractQcMstrId) other;

		return ((this.getQcDomain() == castOther.getQcDomain()) || (this
				.getQcDomain() != null
				&& castOther.getQcDomain() != null && this.getQcDomain()
				.equals(castOther.getQcDomain())))
				&& ((this.getQcNbr() == castOther.getQcNbr()) || (this
						.getQcNbr() != null
						&& castOther.getQcNbr() != null && this.getQcNbr()
						.equals(castOther.getQcNbr())))
				&& ((this.getQcLot() == castOther.getQcLot()) || (this
						.getQcLot() != null
						&& castOther.getQcLot() != null && this.getQcLot()
						.equals(castOther.getQcLot())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQcDomain() == null ? 0 : this.getQcDomain().hashCode());
		result = 37 * result
				+ (getQcNbr() == null ? 0 : this.getQcNbr().hashCode());
		result = 37 * result
				+ (getQcLot() == null ? 0 : this.getQcLot().hashCode());
		return result;
	}

}