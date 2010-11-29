package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCtdDetId entity provides the base persistence definition of the
 * CtdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCtdDetId implements java.io.Serializable {

	// Fields

	private String ctdDomain;
	private String ctdCode;
	private Integer ctdSeq;

	// Constructors

	/** default constructor */
	public AbstractCtdDetId() {
	}

	/** minimal constructor */
	public AbstractCtdDetId(String ctdDomain, Integer ctdSeq) {
		this.ctdDomain = ctdDomain;
		this.ctdSeq = ctdSeq;
	}

	/** full constructor */
	public AbstractCtdDetId(String ctdDomain, String ctdCode, Integer ctdSeq) {
		this.ctdDomain = ctdDomain;
		this.ctdCode = ctdCode;
		this.ctdSeq = ctdSeq;
	}

	// Property accessors

	public String getCtdDomain() {
		return this.ctdDomain;
	}

	public void setCtdDomain(String ctdDomain) {
		this.ctdDomain = ctdDomain;
	}

	public String getCtdCode() {
		return this.ctdCode;
	}

	public void setCtdCode(String ctdCode) {
		this.ctdCode = ctdCode;
	}

	public Integer getCtdSeq() {
		return this.ctdSeq;
	}

	public void setCtdSeq(Integer ctdSeq) {
		this.ctdSeq = ctdSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCtdDetId))
			return false;
		AbstractCtdDetId castOther = (AbstractCtdDetId) other;

		return ((this.getCtdDomain() == castOther.getCtdDomain()) || (this
				.getCtdDomain() != null
				&& castOther.getCtdDomain() != null && this.getCtdDomain()
				.equals(castOther.getCtdDomain())))
				&& ((this.getCtdCode() == castOther.getCtdCode()) || (this
						.getCtdCode() != null
						&& castOther.getCtdCode() != null && this.getCtdCode()
						.equals(castOther.getCtdCode())))
				&& ((this.getCtdSeq() == castOther.getCtdSeq()) || (this
						.getCtdSeq() != null
						&& castOther.getCtdSeq() != null && this.getCtdSeq()
						.equals(castOther.getCtdSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCtdDomain() == null ? 0 : this.getCtdDomain().hashCode());
		result = 37 * result
				+ (getCtdCode() == null ? 0 : this.getCtdCode().hashCode());
		result = 37 * result
				+ (getCtdSeq() == null ? 0 : this.getCtdSeq().hashCode());
		return result;
	}

}