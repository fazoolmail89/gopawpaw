package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCmtDetId entity provides the base persistence definition of the
 * CmtDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmtDetId implements java.io.Serializable {

	// Fields

	private String cmtDomain;
	private Integer cmtIndx;
	private Integer cmtSeq;

	// Constructors

	/** default constructor */
	public AbstractCmtDetId() {
	}

	/** minimal constructor */
	public AbstractCmtDetId(String cmtDomain) {
		this.cmtDomain = cmtDomain;
	}

	/** full constructor */
	public AbstractCmtDetId(String cmtDomain, Integer cmtIndx, Integer cmtSeq) {
		this.cmtDomain = cmtDomain;
		this.cmtIndx = cmtIndx;
		this.cmtSeq = cmtSeq;
	}

	// Property accessors

	public String getCmtDomain() {
		return this.cmtDomain;
	}

	public void setCmtDomain(String cmtDomain) {
		this.cmtDomain = cmtDomain;
	}

	public Integer getCmtIndx() {
		return this.cmtIndx;
	}

	public void setCmtIndx(Integer cmtIndx) {
		this.cmtIndx = cmtIndx;
	}

	public Integer getCmtSeq() {
		return this.cmtSeq;
	}

	public void setCmtSeq(Integer cmtSeq) {
		this.cmtSeq = cmtSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCmtDetId))
			return false;
		AbstractCmtDetId castOther = (AbstractCmtDetId) other;

		return ((this.getCmtDomain() == castOther.getCmtDomain()) || (this
				.getCmtDomain() != null
				&& castOther.getCmtDomain() != null && this.getCmtDomain()
				.equals(castOther.getCmtDomain())))
				&& ((this.getCmtIndx() == castOther.getCmtIndx()) || (this
						.getCmtIndx() != null
						&& castOther.getCmtIndx() != null && this.getCmtIndx()
						.equals(castOther.getCmtIndx())))
				&& ((this.getCmtSeq() == castOther.getCmtSeq()) || (this
						.getCmtSeq() != null
						&& castOther.getCmtSeq() != null && this.getCmtSeq()
						.equals(castOther.getCmtSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCmtDomain() == null ? 0 : this.getCmtDomain().hashCode());
		result = 37 * result
				+ (getCmtIndx() == null ? 0 : this.getCmtIndx().hashCode());
		result = 37 * result
				+ (getCmtSeq() == null ? 0 : this.getCmtSeq().hashCode());
		return result;
	}

}