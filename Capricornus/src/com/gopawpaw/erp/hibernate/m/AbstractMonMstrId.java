package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMonMstrId entity provides the base persistence definition of the
 * MonMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMonMstrId implements java.io.Serializable {

	// Fields

	private String monUserid;
	private String monSid;
	private String monProduct;

	// Constructors

	/** default constructor */
	public AbstractMonMstrId() {
	}

	/** full constructor */
	public AbstractMonMstrId(String monUserid, String monSid, String monProduct) {
		this.monUserid = monUserid;
		this.monSid = monSid;
		this.monProduct = monProduct;
	}

	// Property accessors

	public String getMonUserid() {
		return this.monUserid;
	}

	public void setMonUserid(String monUserid) {
		this.monUserid = monUserid;
	}

	public String getMonSid() {
		return this.monSid;
	}

	public void setMonSid(String monSid) {
		this.monSid = monSid;
	}

	public String getMonProduct() {
		return this.monProduct;
	}

	public void setMonProduct(String monProduct) {
		this.monProduct = monProduct;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMonMstrId))
			return false;
		AbstractMonMstrId castOther = (AbstractMonMstrId) other;

		return ((this.getMonUserid() == castOther.getMonUserid()) || (this
				.getMonUserid() != null
				&& castOther.getMonUserid() != null && this.getMonUserid()
				.equals(castOther.getMonUserid())))
				&& ((this.getMonSid() == castOther.getMonSid()) || (this
						.getMonSid() != null
						&& castOther.getMonSid() != null && this.getMonSid()
						.equals(castOther.getMonSid())))
				&& ((this.getMonProduct() == castOther.getMonProduct()) || (this
						.getMonProduct() != null
						&& castOther.getMonProduct() != null && this
						.getMonProduct().equals(castOther.getMonProduct())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMonUserid() == null ? 0 : this.getMonUserid().hashCode());
		result = 37 * result
				+ (getMonSid() == null ? 0 : this.getMonSid().hashCode());
		result = 37
				* result
				+ (getMonProduct() == null ? 0 : this.getMonProduct()
						.hashCode());
		return result;
	}

}