package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrtxDetId entity provides the base persistence definition of the
 * GrtxDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrtxDetId implements java.io.Serializable {

	// Fields

	private String grtxDomain;
	private Integer grtxIndx;
	private Integer grtxSeq;

	// Constructors

	/** default constructor */
	public AbstractGrtxDetId() {
	}

	/** minimal constructor */
	public AbstractGrtxDetId(String grtxDomain) {
		this.grtxDomain = grtxDomain;
	}

	/** full constructor */
	public AbstractGrtxDetId(String grtxDomain, Integer grtxIndx,
			Integer grtxSeq) {
		this.grtxDomain = grtxDomain;
		this.grtxIndx = grtxIndx;
		this.grtxSeq = grtxSeq;
	}

	// Property accessors

	public String getGrtxDomain() {
		return this.grtxDomain;
	}

	public void setGrtxDomain(String grtxDomain) {
		this.grtxDomain = grtxDomain;
	}

	public Integer getGrtxIndx() {
		return this.grtxIndx;
	}

	public void setGrtxIndx(Integer grtxIndx) {
		this.grtxIndx = grtxIndx;
	}

	public Integer getGrtxSeq() {
		return this.grtxSeq;
	}

	public void setGrtxSeq(Integer grtxSeq) {
		this.grtxSeq = grtxSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractGrtxDetId))
			return false;
		AbstractGrtxDetId castOther = (AbstractGrtxDetId) other;

		return ((this.getGrtxDomain() == castOther.getGrtxDomain()) || (this
				.getGrtxDomain() != null
				&& castOther.getGrtxDomain() != null && this.getGrtxDomain()
				.equals(castOther.getGrtxDomain())))
				&& ((this.getGrtxIndx() == castOther.getGrtxIndx()) || (this
						.getGrtxIndx() != null
						&& castOther.getGrtxIndx() != null && this
						.getGrtxIndx().equals(castOther.getGrtxIndx())))
				&& ((this.getGrtxSeq() == castOther.getGrtxSeq()) || (this
						.getGrtxSeq() != null
						&& castOther.getGrtxSeq() != null && this.getGrtxSeq()
						.equals(castOther.getGrtxSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getGrtxDomain() == null ? 0 : this.getGrtxDomain()
						.hashCode());
		result = 37 * result
				+ (getGrtxIndx() == null ? 0 : this.getGrtxIndx().hashCode());
		result = 37 * result
				+ (getGrtxSeq() == null ? 0 : this.getGrtxSeq().hashCode());
		return result;
	}

}