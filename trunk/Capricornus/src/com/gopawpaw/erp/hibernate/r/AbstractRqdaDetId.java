package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqdaDetId entity provides the base persistence definition of the
 * RqdaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqdaDetId implements java.io.Serializable {

	// Fields

	private String rqdaDomain;
	private String rqdaNbr;
	private String rqdaAprUserid;

	// Constructors

	/** default constructor */
	public AbstractRqdaDetId() {
	}

	/** minimal constructor */
	public AbstractRqdaDetId(String rqdaDomain) {
		this.rqdaDomain = rqdaDomain;
	}

	/** full constructor */
	public AbstractRqdaDetId(String rqdaDomain, String rqdaNbr,
			String rqdaAprUserid) {
		this.rqdaDomain = rqdaDomain;
		this.rqdaNbr = rqdaNbr;
		this.rqdaAprUserid = rqdaAprUserid;
	}

	// Property accessors

	public String getRqdaDomain() {
		return this.rqdaDomain;
	}

	public void setRqdaDomain(String rqdaDomain) {
		this.rqdaDomain = rqdaDomain;
	}

	public String getRqdaNbr() {
		return this.rqdaNbr;
	}

	public void setRqdaNbr(String rqdaNbr) {
		this.rqdaNbr = rqdaNbr;
	}

	public String getRqdaAprUserid() {
		return this.rqdaAprUserid;
	}

	public void setRqdaAprUserid(String rqdaAprUserid) {
		this.rqdaAprUserid = rqdaAprUserid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqdaDetId))
			return false;
		AbstractRqdaDetId castOther = (AbstractRqdaDetId) other;

		return ((this.getRqdaDomain() == castOther.getRqdaDomain()) || (this
				.getRqdaDomain() != null
				&& castOther.getRqdaDomain() != null && this.getRqdaDomain()
				.equals(castOther.getRqdaDomain())))
				&& ((this.getRqdaNbr() == castOther.getRqdaNbr()) || (this
						.getRqdaNbr() != null
						&& castOther.getRqdaNbr() != null && this.getRqdaNbr()
						.equals(castOther.getRqdaNbr())))
				&& ((this.getRqdaAprUserid() == castOther.getRqdaAprUserid()) || (this
						.getRqdaAprUserid() != null
						&& castOther.getRqdaAprUserid() != null && this
						.getRqdaAprUserid()
						.equals(castOther.getRqdaAprUserid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRqdaDomain() == null ? 0 : this.getRqdaDomain()
						.hashCode());
		result = 37 * result
				+ (getRqdaNbr() == null ? 0 : this.getRqdaNbr().hashCode());
		result = 37
				* result
				+ (getRqdaAprUserid() == null ? 0 : this.getRqdaAprUserid()
						.hashCode());
		return result;
	}

}