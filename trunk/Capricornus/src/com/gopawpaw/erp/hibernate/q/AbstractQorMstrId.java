package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQorMstrId entity provides the base persistence definition of the
 * QorMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQorMstrId implements java.io.Serializable {

	// Fields

	private String qorDomain;
	private String qorNbr;
	private Integer qorSeq;

	// Constructors

	/** default constructor */
	public AbstractQorMstrId() {
	}

	/** minimal constructor */
	public AbstractQorMstrId(String qorDomain) {
		this.qorDomain = qorDomain;
	}

	/** full constructor */
	public AbstractQorMstrId(String qorDomain, String qorNbr, Integer qorSeq) {
		this.qorDomain = qorDomain;
		this.qorNbr = qorNbr;
		this.qorSeq = qorSeq;
	}

	// Property accessors

	public String getQorDomain() {
		return this.qorDomain;
	}

	public void setQorDomain(String qorDomain) {
		this.qorDomain = qorDomain;
	}

	public String getQorNbr() {
		return this.qorNbr;
	}

	public void setQorNbr(String qorNbr) {
		this.qorNbr = qorNbr;
	}

	public Integer getQorSeq() {
		return this.qorSeq;
	}

	public void setQorSeq(Integer qorSeq) {
		this.qorSeq = qorSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQorMstrId))
			return false;
		AbstractQorMstrId castOther = (AbstractQorMstrId) other;

		return ((this.getQorDomain() == castOther.getQorDomain()) || (this
				.getQorDomain() != null
				&& castOther.getQorDomain() != null && this.getQorDomain()
				.equals(castOther.getQorDomain())))
				&& ((this.getQorNbr() == castOther.getQorNbr()) || (this
						.getQorNbr() != null
						&& castOther.getQorNbr() != null && this.getQorNbr()
						.equals(castOther.getQorNbr())))
				&& ((this.getQorSeq() == castOther.getQorSeq()) || (this
						.getQorSeq() != null
						&& castOther.getQorSeq() != null && this.getQorSeq()
						.equals(castOther.getQorSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQorDomain() == null ? 0 : this.getQorDomain().hashCode());
		result = 37 * result
				+ (getQorNbr() == null ? 0 : this.getQorNbr().hashCode());
		result = 37 * result
				+ (getQorSeq() == null ? 0 : this.getQorSeq().hashCode());
		return result;
	}

}