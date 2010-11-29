package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEgcCtrlId entity provides the base persistence definition of the
 * EgcCtrlId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgcCtrlId implements java.io.Serializable {

	// Fields

	private String egcDomain;
	private Integer egcIndex;

	// Constructors

	/** default constructor */
	public AbstractEgcCtrlId() {
	}

	/** minimal constructor */
	public AbstractEgcCtrlId(String egcDomain) {
		this.egcDomain = egcDomain;
	}

	/** full constructor */
	public AbstractEgcCtrlId(String egcDomain, Integer egcIndex) {
		this.egcDomain = egcDomain;
		this.egcIndex = egcIndex;
	}

	// Property accessors

	public String getEgcDomain() {
		return this.egcDomain;
	}

	public void setEgcDomain(String egcDomain) {
		this.egcDomain = egcDomain;
	}

	public Integer getEgcIndex() {
		return this.egcIndex;
	}

	public void setEgcIndex(Integer egcIndex) {
		this.egcIndex = egcIndex;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEgcCtrlId))
			return false;
		AbstractEgcCtrlId castOther = (AbstractEgcCtrlId) other;

		return ((this.getEgcDomain() == castOther.getEgcDomain()) || (this
				.getEgcDomain() != null
				&& castOther.getEgcDomain() != null && this.getEgcDomain()
				.equals(castOther.getEgcDomain())))
				&& ((this.getEgcIndex() == castOther.getEgcIndex()) || (this
						.getEgcIndex() != null
						&& castOther.getEgcIndex() != null && this
						.getEgcIndex().equals(castOther.getEgcIndex())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEgcDomain() == null ? 0 : this.getEgcDomain().hashCode());
		result = 37 * result
				+ (getEgcIndex() == null ? 0 : this.getEgcIndex().hashCode());
		return result;
	}

}