package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPalMstrId entity provides the base persistence definition of the
 * PalMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPalMstrId implements java.io.Serializable {

	// Fields

	private String palDomain;
	private String palPallet;

	// Constructors

	/** default constructor */
	public AbstractPalMstrId() {
	}

	/** minimal constructor */
	public AbstractPalMstrId(String palDomain) {
		this.palDomain = palDomain;
	}

	/** full constructor */
	public AbstractPalMstrId(String palDomain, String palPallet) {
		this.palDomain = palDomain;
		this.palPallet = palPallet;
	}

	// Property accessors

	public String getPalDomain() {
		return this.palDomain;
	}

	public void setPalDomain(String palDomain) {
		this.palDomain = palDomain;
	}

	public String getPalPallet() {
		return this.palPallet;
	}

	public void setPalPallet(String palPallet) {
		this.palPallet = palPallet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPalMstrId))
			return false;
		AbstractPalMstrId castOther = (AbstractPalMstrId) other;

		return ((this.getPalDomain() == castOther.getPalDomain()) || (this
				.getPalDomain() != null
				&& castOther.getPalDomain() != null && this.getPalDomain()
				.equals(castOther.getPalDomain())))
				&& ((this.getPalPallet() == castOther.getPalPallet()) || (this
						.getPalPallet() != null
						&& castOther.getPalPallet() != null && this
						.getPalPallet().equals(castOther.getPalPallet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPalDomain() == null ? 0 : this.getPalDomain().hashCode());
		result = 37 * result
				+ (getPalPallet() == null ? 0 : this.getPalPallet().hashCode());
		return result;
	}

}