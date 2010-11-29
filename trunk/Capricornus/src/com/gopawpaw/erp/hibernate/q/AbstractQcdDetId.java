package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQcdDetId entity provides the base persistence definition of the
 * QcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQcdDetId implements java.io.Serializable {

	// Fields

	private String qcdDomain;
	private String qcdLot;
	private String qcdPart;
	private Integer qcdOp;

	// Constructors

	/** default constructor */
	public AbstractQcdDetId() {
	}

	/** minimal constructor */
	public AbstractQcdDetId(String qcdDomain) {
		this.qcdDomain = qcdDomain;
	}

	/** full constructor */
	public AbstractQcdDetId(String qcdDomain, String qcdLot, String qcdPart,
			Integer qcdOp) {
		this.qcdDomain = qcdDomain;
		this.qcdLot = qcdLot;
		this.qcdPart = qcdPart;
		this.qcdOp = qcdOp;
	}

	// Property accessors

	public String getQcdDomain() {
		return this.qcdDomain;
	}

	public void setQcdDomain(String qcdDomain) {
		this.qcdDomain = qcdDomain;
	}

	public String getQcdLot() {
		return this.qcdLot;
	}

	public void setQcdLot(String qcdLot) {
		this.qcdLot = qcdLot;
	}

	public String getQcdPart() {
		return this.qcdPart;
	}

	public void setQcdPart(String qcdPart) {
		this.qcdPart = qcdPart;
	}

	public Integer getQcdOp() {
		return this.qcdOp;
	}

	public void setQcdOp(Integer qcdOp) {
		this.qcdOp = qcdOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQcdDetId))
			return false;
		AbstractQcdDetId castOther = (AbstractQcdDetId) other;

		return ((this.getQcdDomain() == castOther.getQcdDomain()) || (this
				.getQcdDomain() != null
				&& castOther.getQcdDomain() != null && this.getQcdDomain()
				.equals(castOther.getQcdDomain())))
				&& ((this.getQcdLot() == castOther.getQcdLot()) || (this
						.getQcdLot() != null
						&& castOther.getQcdLot() != null && this.getQcdLot()
						.equals(castOther.getQcdLot())))
				&& ((this.getQcdPart() == castOther.getQcdPart()) || (this
						.getQcdPart() != null
						&& castOther.getQcdPart() != null && this.getQcdPart()
						.equals(castOther.getQcdPart())))
				&& ((this.getQcdOp() == castOther.getQcdOp()) || (this
						.getQcdOp() != null
						&& castOther.getQcdOp() != null && this.getQcdOp()
						.equals(castOther.getQcdOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQcdDomain() == null ? 0 : this.getQcdDomain().hashCode());
		result = 37 * result
				+ (getQcdLot() == null ? 0 : this.getQcdLot().hashCode());
		result = 37 * result
				+ (getQcdPart() == null ? 0 : this.getQcdPart().hashCode());
		result = 37 * result
				+ (getQcdOp() == null ? 0 : this.getQcdOp().hashCode());
		return result;
	}

}