package com.gopawpaw.frame.struct.m;

/**
 * AbstractMndDetId entity provides the base persistence definition of the
 * MndDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMndDetId implements java.io.Serializable {

	// Fields

	private String mndNbr;
	private Integer mndSelect;

	// Constructors

	/** default constructor */
	public AbstractMndDetId() {
	}

	/** full constructor */
	public AbstractMndDetId(String mndNbr, Integer mndSelect) {
		this.mndNbr = mndNbr;
		this.mndSelect = mndSelect;
	}

	// Property accessors

	public String getMndNbr() {
		return this.mndNbr;
	}

	public void setMndNbr(String mndNbr) {
		this.mndNbr = mndNbr;
	}

	public Integer getMndSelect() {
		return this.mndSelect;
	}

	public void setMndSelect(Integer mndSelect) {
		this.mndSelect = mndSelect;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMndDetId))
			return false;
		AbstractMndDetId castOther = (AbstractMndDetId) other;

		return ((this.getMndNbr() == castOther.getMndNbr()) || (this
				.getMndNbr() != null
				&& castOther.getMndNbr() != null && this.getMndNbr().equals(
				castOther.getMndNbr())))
				&& ((this.getMndSelect() == castOther.getMndSelect()) || (this
						.getMndSelect() != null
						&& castOther.getMndSelect() != null && this
						.getMndSelect().equals(castOther.getMndSelect())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMndNbr() == null ? 0 : this.getMndNbr().hashCode());
		result = 37 * result
				+ (getMndSelect() == null ? 0 : this.getMndSelect().hashCode());
		return result;
	}

}