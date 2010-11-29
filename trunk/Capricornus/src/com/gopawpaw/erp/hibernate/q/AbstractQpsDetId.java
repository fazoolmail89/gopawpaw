package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQpsDetId entity provides the base persistence definition of the
 * QpsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQpsDetId implements java.io.Serializable {

	// Fields

	private String qpsDomain;
	private String qpsRouting;
	private Integer qpsOp;
	private String qpsPart;

	// Constructors

	/** default constructor */
	public AbstractQpsDetId() {
	}

	/** minimal constructor */
	public AbstractQpsDetId(String qpsDomain) {
		this.qpsDomain = qpsDomain;
	}

	/** full constructor */
	public AbstractQpsDetId(String qpsDomain, String qpsRouting, Integer qpsOp,
			String qpsPart) {
		this.qpsDomain = qpsDomain;
		this.qpsRouting = qpsRouting;
		this.qpsOp = qpsOp;
		this.qpsPart = qpsPart;
	}

	// Property accessors

	public String getQpsDomain() {
		return this.qpsDomain;
	}

	public void setQpsDomain(String qpsDomain) {
		this.qpsDomain = qpsDomain;
	}

	public String getQpsRouting() {
		return this.qpsRouting;
	}

	public void setQpsRouting(String qpsRouting) {
		this.qpsRouting = qpsRouting;
	}

	public Integer getQpsOp() {
		return this.qpsOp;
	}

	public void setQpsOp(Integer qpsOp) {
		this.qpsOp = qpsOp;
	}

	public String getQpsPart() {
		return this.qpsPart;
	}

	public void setQpsPart(String qpsPart) {
		this.qpsPart = qpsPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQpsDetId))
			return false;
		AbstractQpsDetId castOther = (AbstractQpsDetId) other;

		return ((this.getQpsDomain() == castOther.getQpsDomain()) || (this
				.getQpsDomain() != null
				&& castOther.getQpsDomain() != null && this.getQpsDomain()
				.equals(castOther.getQpsDomain())))
				&& ((this.getQpsRouting() == castOther.getQpsRouting()) || (this
						.getQpsRouting() != null
						&& castOther.getQpsRouting() != null && this
						.getQpsRouting().equals(castOther.getQpsRouting())))
				&& ((this.getQpsOp() == castOther.getQpsOp()) || (this
						.getQpsOp() != null
						&& castOther.getQpsOp() != null && this.getQpsOp()
						.equals(castOther.getQpsOp())))
				&& ((this.getQpsPart() == castOther.getQpsPart()) || (this
						.getQpsPart() != null
						&& castOther.getQpsPart() != null && this.getQpsPart()
						.equals(castOther.getQpsPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQpsDomain() == null ? 0 : this.getQpsDomain().hashCode());
		result = 37
				* result
				+ (getQpsRouting() == null ? 0 : this.getQpsRouting()
						.hashCode());
		result = 37 * result
				+ (getQpsOp() == null ? 0 : this.getQpsOp().hashCode());
		result = 37 * result
				+ (getQpsPart() == null ? 0 : this.getQpsPart().hashCode());
		return result;
	}

}