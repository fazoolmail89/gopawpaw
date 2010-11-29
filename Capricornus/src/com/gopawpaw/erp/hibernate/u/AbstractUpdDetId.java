package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUpdDetId entity provides the base persistence definition of the
 * UpdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUpdDetId implements java.io.Serializable {

	// Fields

	private String updUserid;
	private String updNbr;
	private Integer updSelect;

	// Constructors

	/** default constructor */
	public AbstractUpdDetId() {
	}

	/** full constructor */
	public AbstractUpdDetId(String updUserid, String updNbr, Integer updSelect) {
		this.updUserid = updUserid;
		this.updNbr = updNbr;
		this.updSelect = updSelect;
	}

	// Property accessors

	public String getUpdUserid() {
		return this.updUserid;
	}

	public void setUpdUserid(String updUserid) {
		this.updUserid = updUserid;
	}

	public String getUpdNbr() {
		return this.updNbr;
	}

	public void setUpdNbr(String updNbr) {
		this.updNbr = updNbr;
	}

	public Integer getUpdSelect() {
		return this.updSelect;
	}

	public void setUpdSelect(Integer updSelect) {
		this.updSelect = updSelect;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUpdDetId))
			return false;
		AbstractUpdDetId castOther = (AbstractUpdDetId) other;

		return ((this.getUpdUserid() == castOther.getUpdUserid()) || (this
				.getUpdUserid() != null
				&& castOther.getUpdUserid() != null && this.getUpdUserid()
				.equals(castOther.getUpdUserid())))
				&& ((this.getUpdNbr() == castOther.getUpdNbr()) || (this
						.getUpdNbr() != null
						&& castOther.getUpdNbr() != null && this.getUpdNbr()
						.equals(castOther.getUpdNbr())))
				&& ((this.getUpdSelect() == castOther.getUpdSelect()) || (this
						.getUpdSelect() != null
						&& castOther.getUpdSelect() != null && this
						.getUpdSelect().equals(castOther.getUpdSelect())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUpdUserid() == null ? 0 : this.getUpdUserid().hashCode());
		result = 37 * result
				+ (getUpdNbr() == null ? 0 : this.getUpdNbr().hashCode());
		result = 37 * result
				+ (getUpdSelect() == null ? 0 : this.getUpdSelect().hashCode());
		return result;
	}

}