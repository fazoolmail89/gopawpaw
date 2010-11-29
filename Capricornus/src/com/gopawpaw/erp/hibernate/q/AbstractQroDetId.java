package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQroDetId entity provides the base persistence definition of the
 * QroDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQroDetId implements java.io.Serializable {

	// Fields

	private String qroDomain;
	private String qroRouting;
	private Integer qroOp;

	// Constructors

	/** default constructor */
	public AbstractQroDetId() {
	}

	/** full constructor */
	public AbstractQroDetId(String qroDomain, String qroRouting, Integer qroOp) {
		this.qroDomain = qroDomain;
		this.qroRouting = qroRouting;
		this.qroOp = qroOp;
	}

	// Property accessors

	public String getQroDomain() {
		return this.qroDomain;
	}

	public void setQroDomain(String qroDomain) {
		this.qroDomain = qroDomain;
	}

	public String getQroRouting() {
		return this.qroRouting;
	}

	public void setQroRouting(String qroRouting) {
		this.qroRouting = qroRouting;
	}

	public Integer getQroOp() {
		return this.qroOp;
	}

	public void setQroOp(Integer qroOp) {
		this.qroOp = qroOp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractQroDetId))
			return false;
		AbstractQroDetId castOther = (AbstractQroDetId) other;

		return ((this.getQroDomain() == castOther.getQroDomain()) || (this
				.getQroDomain() != null
				&& castOther.getQroDomain() != null && this.getQroDomain()
				.equals(castOther.getQroDomain())))
				&& ((this.getQroRouting() == castOther.getQroRouting()) || (this
						.getQroRouting() != null
						&& castOther.getQroRouting() != null && this
						.getQroRouting().equals(castOther.getQroRouting())))
				&& ((this.getQroOp() == castOther.getQroOp()) || (this
						.getQroOp() != null
						&& castOther.getQroOp() != null && this.getQroOp()
						.equals(castOther.getQroOp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getQroDomain() == null ? 0 : this.getQroDomain().hashCode());
		result = 37
				* result
				+ (getQroRouting() == null ? 0 : this.getQroRouting()
						.hashCode());
		result = 37 * result
				+ (getQroOp() == null ? 0 : this.getQroOp().hashCode());
		return result;
	}

}