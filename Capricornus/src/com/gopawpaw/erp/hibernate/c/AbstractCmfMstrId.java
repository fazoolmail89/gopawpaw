package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCmfMstrId entity provides the base persistence definition of the
 * CmfMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmfMstrId implements java.io.Serializable {

	// Fields

	private String cmfDomain;
	private Integer cmfTransNbr;

	// Constructors

	/** default constructor */
	public AbstractCmfMstrId() {
	}

	/** full constructor */
	public AbstractCmfMstrId(String cmfDomain, Integer cmfTransNbr) {
		this.cmfDomain = cmfDomain;
		this.cmfTransNbr = cmfTransNbr;
	}

	// Property accessors

	public String getCmfDomain() {
		return this.cmfDomain;
	}

	public void setCmfDomain(String cmfDomain) {
		this.cmfDomain = cmfDomain;
	}

	public Integer getCmfTransNbr() {
		return this.cmfTransNbr;
	}

	public void setCmfTransNbr(Integer cmfTransNbr) {
		this.cmfTransNbr = cmfTransNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCmfMstrId))
			return false;
		AbstractCmfMstrId castOther = (AbstractCmfMstrId) other;

		return ((this.getCmfDomain() == castOther.getCmfDomain()) || (this
				.getCmfDomain() != null
				&& castOther.getCmfDomain() != null && this.getCmfDomain()
				.equals(castOther.getCmfDomain())))
				&& ((this.getCmfTransNbr() == castOther.getCmfTransNbr()) || (this
						.getCmfTransNbr() != null
						&& castOther.getCmfTransNbr() != null && this
						.getCmfTransNbr().equals(castOther.getCmfTransNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCmfDomain() == null ? 0 : this.getCmfDomain().hashCode());
		result = 37
				* result
				+ (getCmfTransNbr() == null ? 0 : this.getCmfTransNbr()
						.hashCode());
		return result;
	}

}