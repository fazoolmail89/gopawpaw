package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSoMstrId entity provides the base persistence definition of the
 * SoMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSoMstrId implements java.io.Serializable {

	// Fields

	private String soDomain;
	private String soNbr;

	// Constructors

	/** default constructor */
	public AbstractSoMstrId() {
	}

	/** full constructor */
	public AbstractSoMstrId(String soDomain, String soNbr) {
		this.soDomain = soDomain;
		this.soNbr = soNbr;
	}

	// Property accessors

	public String getSoDomain() {
		return this.soDomain;
	}

	public void setSoDomain(String soDomain) {
		this.soDomain = soDomain;
	}

	public String getSoNbr() {
		return this.soNbr;
	}

	public void setSoNbr(String soNbr) {
		this.soNbr = soNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSoMstrId))
			return false;
		AbstractSoMstrId castOther = (AbstractSoMstrId) other;

		return ((this.getSoDomain() == castOther.getSoDomain()) || (this
				.getSoDomain() != null
				&& castOther.getSoDomain() != null && this.getSoDomain()
				.equals(castOther.getSoDomain())))
				&& ((this.getSoNbr() == castOther.getSoNbr()) || (this
						.getSoNbr() != null
						&& castOther.getSoNbr() != null && this.getSoNbr()
						.equals(castOther.getSoNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSoDomain() == null ? 0 : this.getSoDomain().hashCode());
		result = 37 * result
				+ (getSoNbr() == null ? 0 : this.getSoNbr().hashCode());
		return result;
	}

}