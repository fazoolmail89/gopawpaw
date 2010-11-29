package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRmaMstrId entity provides the base persistence definition of the
 * RmaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRmaMstrId implements java.io.Serializable {

	// Fields

	private String rmaDomain;
	private String rmaNbr;
	private String rmaPrefix;

	// Constructors

	/** default constructor */
	public AbstractRmaMstrId() {
	}

	/** minimal constructor */
	public AbstractRmaMstrId(String rmaDomain, String rmaNbr) {
		this.rmaDomain = rmaDomain;
		this.rmaNbr = rmaNbr;
	}

	/** full constructor */
	public AbstractRmaMstrId(String rmaDomain, String rmaNbr, String rmaPrefix) {
		this.rmaDomain = rmaDomain;
		this.rmaNbr = rmaNbr;
		this.rmaPrefix = rmaPrefix;
	}

	// Property accessors

	public String getRmaDomain() {
		return this.rmaDomain;
	}

	public void setRmaDomain(String rmaDomain) {
		this.rmaDomain = rmaDomain;
	}

	public String getRmaNbr() {
		return this.rmaNbr;
	}

	public void setRmaNbr(String rmaNbr) {
		this.rmaNbr = rmaNbr;
	}

	public String getRmaPrefix() {
		return this.rmaPrefix;
	}

	public void setRmaPrefix(String rmaPrefix) {
		this.rmaPrefix = rmaPrefix;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRmaMstrId))
			return false;
		AbstractRmaMstrId castOther = (AbstractRmaMstrId) other;

		return ((this.getRmaDomain() == castOther.getRmaDomain()) || (this
				.getRmaDomain() != null
				&& castOther.getRmaDomain() != null && this.getRmaDomain()
				.equals(castOther.getRmaDomain())))
				&& ((this.getRmaNbr() == castOther.getRmaNbr()) || (this
						.getRmaNbr() != null
						&& castOther.getRmaNbr() != null && this.getRmaNbr()
						.equals(castOther.getRmaNbr())))
				&& ((this.getRmaPrefix() == castOther.getRmaPrefix()) || (this
						.getRmaPrefix() != null
						&& castOther.getRmaPrefix() != null && this
						.getRmaPrefix().equals(castOther.getRmaPrefix())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRmaDomain() == null ? 0 : this.getRmaDomain().hashCode());
		result = 37 * result
				+ (getRmaNbr() == null ? 0 : this.getRmaNbr().hashCode());
		result = 37 * result
				+ (getRmaPrefix() == null ? 0 : this.getRmaPrefix().hashCode());
		return result;
	}

}