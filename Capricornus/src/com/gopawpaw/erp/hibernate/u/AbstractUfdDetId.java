package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUfdDetId entity provides the base persistence definition of the
 * UfdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUfdDetId implements java.io.Serializable {

	// Fields

	private String ufdUserid;
	private Integer ufdFkey;
	private Integer ufdSeq;

	// Constructors

	/** default constructor */
	public AbstractUfdDetId() {
	}

	/** full constructor */
	public AbstractUfdDetId(String ufdUserid, Integer ufdFkey, Integer ufdSeq) {
		this.ufdUserid = ufdUserid;
		this.ufdFkey = ufdFkey;
		this.ufdSeq = ufdSeq;
	}

	// Property accessors

	public String getUfdUserid() {
		return this.ufdUserid;
	}

	public void setUfdUserid(String ufdUserid) {
		this.ufdUserid = ufdUserid;
	}

	public Integer getUfdFkey() {
		return this.ufdFkey;
	}

	public void setUfdFkey(Integer ufdFkey) {
		this.ufdFkey = ufdFkey;
	}

	public Integer getUfdSeq() {
		return this.ufdSeq;
	}

	public void setUfdSeq(Integer ufdSeq) {
		this.ufdSeq = ufdSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUfdDetId))
			return false;
		AbstractUfdDetId castOther = (AbstractUfdDetId) other;

		return ((this.getUfdUserid() == castOther.getUfdUserid()) || (this
				.getUfdUserid() != null
				&& castOther.getUfdUserid() != null && this.getUfdUserid()
				.equals(castOther.getUfdUserid())))
				&& ((this.getUfdFkey() == castOther.getUfdFkey()) || (this
						.getUfdFkey() != null
						&& castOther.getUfdFkey() != null && this.getUfdFkey()
						.equals(castOther.getUfdFkey())))
				&& ((this.getUfdSeq() == castOther.getUfdSeq()) || (this
						.getUfdSeq() != null
						&& castOther.getUfdSeq() != null && this.getUfdSeq()
						.equals(castOther.getUfdSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUfdUserid() == null ? 0 : this.getUfdUserid().hashCode());
		result = 37 * result
				+ (getUfdFkey() == null ? 0 : this.getUfdFkey().hashCode());
		result = 37 * result
				+ (getUfdSeq() == null ? 0 : this.getUfdSeq().hashCode());
		return result;
	}

}