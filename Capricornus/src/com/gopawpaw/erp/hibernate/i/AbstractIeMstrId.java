package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIeMstrId entity provides the base persistence definition of the
 * IeMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIeMstrId implements java.io.Serializable {

	// Fields

	private String ieDomain;
	private String ieType;
	private String ieNbr;

	// Constructors

	/** default constructor */
	public AbstractIeMstrId() {
	}

	/** minimal constructor */
	public AbstractIeMstrId(String ieDomain) {
		this.ieDomain = ieDomain;
	}

	/** full constructor */
	public AbstractIeMstrId(String ieDomain, String ieType, String ieNbr) {
		this.ieDomain = ieDomain;
		this.ieType = ieType;
		this.ieNbr = ieNbr;
	}

	// Property accessors

	public String getIeDomain() {
		return this.ieDomain;
	}

	public void setIeDomain(String ieDomain) {
		this.ieDomain = ieDomain;
	}

	public String getIeType() {
		return this.ieType;
	}

	public void setIeType(String ieType) {
		this.ieType = ieType;
	}

	public String getIeNbr() {
		return this.ieNbr;
	}

	public void setIeNbr(String ieNbr) {
		this.ieNbr = ieNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIeMstrId))
			return false;
		AbstractIeMstrId castOther = (AbstractIeMstrId) other;

		return ((this.getIeDomain() == castOther.getIeDomain()) || (this
				.getIeDomain() != null
				&& castOther.getIeDomain() != null && this.getIeDomain()
				.equals(castOther.getIeDomain())))
				&& ((this.getIeType() == castOther.getIeType()) || (this
						.getIeType() != null
						&& castOther.getIeType() != null && this.getIeType()
						.equals(castOther.getIeType())))
				&& ((this.getIeNbr() == castOther.getIeNbr()) || (this
						.getIeNbr() != null
						&& castOther.getIeNbr() != null && this.getIeNbr()
						.equals(castOther.getIeNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIeDomain() == null ? 0 : this.getIeDomain().hashCode());
		result = 37 * result
				+ (getIeType() == null ? 0 : this.getIeType().hashCode());
		result = 37 * result
				+ (getIeNbr() == null ? 0 : this.getIeNbr().hashCode());
		return result;
	}

}