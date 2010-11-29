package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWoMstrId entity provides the base persistence definition of the
 * WoMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWoMstrId implements java.io.Serializable {

	// Fields

	private String woDomain;
	private String woNbr;
	private String woLot;

	// Constructors

	/** default constructor */
	public AbstractWoMstrId() {
	}

	/** minimal constructor */
	public AbstractWoMstrId(String woDomain, String woNbr) {
		this.woDomain = woDomain;
		this.woNbr = woNbr;
	}

	/** full constructor */
	public AbstractWoMstrId(String woDomain, String woNbr, String woLot) {
		this.woDomain = woDomain;
		this.woNbr = woNbr;
		this.woLot = woLot;
	}

	// Property accessors

	public String getWoDomain() {
		return this.woDomain;
	}

	public void setWoDomain(String woDomain) {
		this.woDomain = woDomain;
	}

	public String getWoNbr() {
		return this.woNbr;
	}

	public void setWoNbr(String woNbr) {
		this.woNbr = woNbr;
	}

	public String getWoLot() {
		return this.woLot;
	}

	public void setWoLot(String woLot) {
		this.woLot = woLot;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractWoMstrId))
			return false;
		AbstractWoMstrId castOther = (AbstractWoMstrId) other;

		return ((this.getWoDomain() == castOther.getWoDomain()) || (this
				.getWoDomain() != null
				&& castOther.getWoDomain() != null && this.getWoDomain()
				.equals(castOther.getWoDomain())))
				&& ((this.getWoNbr() == castOther.getWoNbr()) || (this
						.getWoNbr() != null
						&& castOther.getWoNbr() != null && this.getWoNbr()
						.equals(castOther.getWoNbr())))
				&& ((this.getWoLot() == castOther.getWoLot()) || (this
						.getWoLot() != null
						&& castOther.getWoLot() != null && this.getWoLot()
						.equals(castOther.getWoLot())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWoDomain() == null ? 0 : this.getWoDomain().hashCode());
		result = 37 * result
				+ (getWoNbr() == null ? 0 : this.getWoNbr().hashCode());
		result = 37 * result
				+ (getWoLot() == null ? 0 : this.getWoLot().hashCode());
		return result;
	}

}