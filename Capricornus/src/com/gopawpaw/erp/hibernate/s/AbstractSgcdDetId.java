package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSgcdDetId entity provides the base persistence definition of the
 * SgcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSgcdDetId implements java.io.Serializable {

	// Fields

	private String sgcdDomain;
	private String sgcdGrp;
	private String sgcdInvMov;
	private Integer sgcdSeq;

	// Constructors

	/** default constructor */
	public AbstractSgcdDetId() {
	}

	/** full constructor */
	public AbstractSgcdDetId(String sgcdDomain, String sgcdGrp,
			String sgcdInvMov, Integer sgcdSeq) {
		this.sgcdDomain = sgcdDomain;
		this.sgcdGrp = sgcdGrp;
		this.sgcdInvMov = sgcdInvMov;
		this.sgcdSeq = sgcdSeq;
	}

	// Property accessors

	public String getSgcdDomain() {
		return this.sgcdDomain;
	}

	public void setSgcdDomain(String sgcdDomain) {
		this.sgcdDomain = sgcdDomain;
	}

	public String getSgcdGrp() {
		return this.sgcdGrp;
	}

	public void setSgcdGrp(String sgcdGrp) {
		this.sgcdGrp = sgcdGrp;
	}

	public String getSgcdInvMov() {
		return this.sgcdInvMov;
	}

	public void setSgcdInvMov(String sgcdInvMov) {
		this.sgcdInvMov = sgcdInvMov;
	}

	public Integer getSgcdSeq() {
		return this.sgcdSeq;
	}

	public void setSgcdSeq(Integer sgcdSeq) {
		this.sgcdSeq = sgcdSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSgcdDetId))
			return false;
		AbstractSgcdDetId castOther = (AbstractSgcdDetId) other;

		return ((this.getSgcdDomain() == castOther.getSgcdDomain()) || (this
				.getSgcdDomain() != null
				&& castOther.getSgcdDomain() != null && this.getSgcdDomain()
				.equals(castOther.getSgcdDomain())))
				&& ((this.getSgcdGrp() == castOther.getSgcdGrp()) || (this
						.getSgcdGrp() != null
						&& castOther.getSgcdGrp() != null && this.getSgcdGrp()
						.equals(castOther.getSgcdGrp())))
				&& ((this.getSgcdInvMov() == castOther.getSgcdInvMov()) || (this
						.getSgcdInvMov() != null
						&& castOther.getSgcdInvMov() != null && this
						.getSgcdInvMov().equals(castOther.getSgcdInvMov())))
				&& ((this.getSgcdSeq() == castOther.getSgcdSeq()) || (this
						.getSgcdSeq() != null
						&& castOther.getSgcdSeq() != null && this.getSgcdSeq()
						.equals(castOther.getSgcdSeq())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSgcdDomain() == null ? 0 : this.getSgcdDomain()
						.hashCode());
		result = 37 * result
				+ (getSgcdGrp() == null ? 0 : this.getSgcdGrp().hashCode());
		result = 37
				* result
				+ (getSgcdInvMov() == null ? 0 : this.getSgcdInvMov()
						.hashCode());
		result = 37 * result
				+ (getSgcdSeq() == null ? 0 : this.getSgcdSeq().hashCode());
		return result;
	}

}