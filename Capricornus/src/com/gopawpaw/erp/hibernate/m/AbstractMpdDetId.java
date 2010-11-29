package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMpdDetId entity provides the base persistence definition of the
 * MpdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMpdDetId implements java.io.Serializable {

	// Fields

	private String mpdDomain;
	private String mpdNbr;
	private String mpdType;

	// Constructors

	/** default constructor */
	public AbstractMpdDetId() {
	}

	/** minimal constructor */
	public AbstractMpdDetId(String mpdDomain) {
		this.mpdDomain = mpdDomain;
	}

	/** full constructor */
	public AbstractMpdDetId(String mpdDomain, String mpdNbr, String mpdType) {
		this.mpdDomain = mpdDomain;
		this.mpdNbr = mpdNbr;
		this.mpdType = mpdType;
	}

	// Property accessors

	public String getMpdDomain() {
		return this.mpdDomain;
	}

	public void setMpdDomain(String mpdDomain) {
		this.mpdDomain = mpdDomain;
	}

	public String getMpdNbr() {
		return this.mpdNbr;
	}

	public void setMpdNbr(String mpdNbr) {
		this.mpdNbr = mpdNbr;
	}

	public String getMpdType() {
		return this.mpdType;
	}

	public void setMpdType(String mpdType) {
		this.mpdType = mpdType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMpdDetId))
			return false;
		AbstractMpdDetId castOther = (AbstractMpdDetId) other;

		return ((this.getMpdDomain() == castOther.getMpdDomain()) || (this
				.getMpdDomain() != null
				&& castOther.getMpdDomain() != null && this.getMpdDomain()
				.equals(castOther.getMpdDomain())))
				&& ((this.getMpdNbr() == castOther.getMpdNbr()) || (this
						.getMpdNbr() != null
						&& castOther.getMpdNbr() != null && this.getMpdNbr()
						.equals(castOther.getMpdNbr())))
				&& ((this.getMpdType() == castOther.getMpdType()) || (this
						.getMpdType() != null
						&& castOther.getMpdType() != null && this.getMpdType()
						.equals(castOther.getMpdType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMpdDomain() == null ? 0 : this.getMpdDomain().hashCode());
		result = 37 * result
				+ (getMpdNbr() == null ? 0 : this.getMpdNbr().hashCode());
		result = 37 * result
				+ (getMpdType() == null ? 0 : this.getMpdType().hashCode());
		return result;
	}

}