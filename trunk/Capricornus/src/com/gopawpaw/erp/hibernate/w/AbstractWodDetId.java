package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWodDetId entity provides the base persistence definition of the
 * WodDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWodDetId implements java.io.Serializable {

	// Fields

	private String wodDomain;
	private String wodLot;
	private String wodPart;
	private Integer wodOp;

	// Constructors

	/** default constructor */
	public AbstractWodDetId() {
	}

	/** minimal constructor */
	public AbstractWodDetId(String wodDomain) {
		this.wodDomain = wodDomain;
	}

	/** full constructor */
	public AbstractWodDetId(String wodDomain, String wodLot, String wodPart,
			Integer wodOp) {
		this.wodDomain = wodDomain;
		this.wodLot = wodLot;
		this.wodPart = wodPart;
		this.wodOp = wodOp;
	}

	// Property accessors

	public String getWodDomain() {
		return this.wodDomain;
	}

	public void setWodDomain(String wodDomain) {
		this.wodDomain = wodDomain;
	}

	public String getWodLot() {
		return this.wodLot;
	}

	public void setWodLot(String wodLot) {
		this.wodLot = wodLot;
	}

	public String getWodPart() {
		return this.wodPart;
	}

	public void setWodPart(String wodPart) {
		this.wodPart = wodPart;
	}

	public Integer getWodOp() {
		return this.wodOp;
	}

	public void setWodOp(Integer wodOp) {
		this.wodOp = wodOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWodDetId))
			return false;
		AbstractWodDetId castOther = (AbstractWodDetId) other;

		return ((this.getWodDomain() == castOther.getWodDomain()) || (this
				.getWodDomain() != null
				&& castOther.getWodDomain() != null && this.getWodDomain()
				.equals(castOther.getWodDomain())))
				&& ((this.getWodLot() == castOther.getWodLot()) || (this
						.getWodLot() != null
						&& castOther.getWodLot() != null && this.getWodLot()
						.equals(castOther.getWodLot())))
				&& ((this.getWodPart() == castOther.getWodPart()) || (this
						.getWodPart() != null
						&& castOther.getWodPart() != null && this.getWodPart()
						.equals(castOther.getWodPart())))
				&& ((this.getWodOp() == castOther.getWodOp()) || (this
						.getWodOp() != null
						&& castOther.getWodOp() != null && this.getWodOp()
						.equals(castOther.getWodOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWodDomain() == null ? 0 : this.getWodDomain().hashCode());
		result = 37 * result
				+ (getWodLot() == null ? 0 : this.getWodLot().hashCode());
		result = 37 * result
				+ (getWodPart() == null ? 0 : this.getWodPart().hashCode());
		result = 37 * result
				+ (getWodOp() == null ? 0 : this.getWodOp().hashCode());
		return result;
	}

}