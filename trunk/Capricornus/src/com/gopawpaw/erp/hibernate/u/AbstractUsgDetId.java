package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUsgDetId entity provides the base persistence definition of the
 * UsgDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsgDetId implements java.io.Serializable {

	// Fields

	private String usgProduct;
	private String usgExec;

	// Constructors

	/** default constructor */
	public AbstractUsgDetId() {
	}

	/** full constructor */
	public AbstractUsgDetId(String usgProduct, String usgExec) {
		this.usgProduct = usgProduct;
		this.usgExec = usgExec;
	}

	// Property accessors

	public String getUsgProduct() {
		return this.usgProduct;
	}

	public void setUsgProduct(String usgProduct) {
		this.usgProduct = usgProduct;
	}

	public String getUsgExec() {
		return this.usgExec;
	}

	public void setUsgExec(String usgExec) {
		this.usgExec = usgExec;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUsgDetId))
			return false;
		AbstractUsgDetId castOther = (AbstractUsgDetId) other;

		return ((this.getUsgProduct() == castOther.getUsgProduct()) || (this
				.getUsgProduct() != null
				&& castOther.getUsgProduct() != null && this.getUsgProduct()
				.equals(castOther.getUsgProduct())))
				&& ((this.getUsgExec() == castOther.getUsgExec()) || (this
						.getUsgExec() != null
						&& castOther.getUsgExec() != null && this.getUsgExec()
						.equals(castOther.getUsgExec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getUsgProduct() == null ? 0 : this.getUsgProduct()
						.hashCode());
		result = 37 * result
				+ (getUsgExec() == null ? 0 : this.getUsgExec().hashCode());
		return result;
	}

}