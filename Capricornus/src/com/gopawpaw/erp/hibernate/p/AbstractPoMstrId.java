package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPoMstrId entity provides the base persistence definition of the
 * PoMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoMstrId implements java.io.Serializable {

	// Fields

	private String poDomain;
	private String poNbr;

	// Constructors

	/** default constructor */
	public AbstractPoMstrId() {
	}

	/** full constructor */
	public AbstractPoMstrId(String poDomain, String poNbr) {
		this.poDomain = poDomain;
		this.poNbr = poNbr;
	}

	// Property accessors

	public String getPoDomain() {
		return this.poDomain;
	}

	public void setPoDomain(String poDomain) {
		this.poDomain = poDomain;
	}

	public String getPoNbr() {
		return this.poNbr;
	}

	public void setPoNbr(String poNbr) {
		this.poNbr = poNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPoMstrId))
			return false;
		AbstractPoMstrId castOther = (AbstractPoMstrId) other;

		return ((this.getPoDomain() == castOther.getPoDomain()) || (this
				.getPoDomain() != null
				&& castOther.getPoDomain() != null && this.getPoDomain()
				.equals(castOther.getPoDomain())))
				&& ((this.getPoNbr() == castOther.getPoNbr()) || (this
						.getPoNbr() != null
						&& castOther.getPoNbr() != null && this.getPoNbr()
						.equals(castOther.getPoNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPoDomain() == null ? 0 : this.getPoDomain().hashCode());
		result = 37 * result
				+ (getPoNbr() == null ? 0 : this.getPoNbr().hashCode());
		return result;
	}

}