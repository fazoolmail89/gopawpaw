package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCfMstrId entity provides the base persistence definition of the
 * CfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCfMstrId implements java.io.Serializable {

	// Fields

	private String cfDomain;
	private String cfNbr;

	// Constructors

	/** default constructor */
	public AbstractCfMstrId() {
	}

	/** full constructor */
	public AbstractCfMstrId(String cfDomain, String cfNbr) {
		this.cfDomain = cfDomain;
		this.cfNbr = cfNbr;
	}

	// Property accessors

	public String getCfDomain() {
		return this.cfDomain;
	}

	public void setCfDomain(String cfDomain) {
		this.cfDomain = cfDomain;
	}

	public String getCfNbr() {
		return this.cfNbr;
	}

	public void setCfNbr(String cfNbr) {
		this.cfNbr = cfNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCfMstrId))
			return false;
		AbstractCfMstrId castOther = (AbstractCfMstrId) other;

		return ((this.getCfDomain() == castOther.getCfDomain()) || (this
				.getCfDomain() != null
				&& castOther.getCfDomain() != null && this.getCfDomain()
				.equals(castOther.getCfDomain())))
				&& ((this.getCfNbr() == castOther.getCfNbr()) || (this
						.getCfNbr() != null
						&& castOther.getCfNbr() != null && this.getCfNbr()
						.equals(castOther.getCfNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCfDomain() == null ? 0 : this.getCfDomain().hashCode());
		result = 37 * result
				+ (getCfNbr() == null ? 0 : this.getCfNbr().hashCode());
		return result;
	}

}