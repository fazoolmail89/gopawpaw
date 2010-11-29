package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUsrlDetId entity provides the base persistence definition of the
 * UsrlDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrlDetId implements java.io.Serializable {

	// Fields

	private String usrlUserid;
	private String usrlProduct;

	// Constructors

	/** default constructor */
	public AbstractUsrlDetId() {
	}

	/** full constructor */
	public AbstractUsrlDetId(String usrlUserid, String usrlProduct) {
		this.usrlUserid = usrlUserid;
		this.usrlProduct = usrlProduct;
	}

	// Property accessors

	public String getUsrlUserid() {
		return this.usrlUserid;
	}

	public void setUsrlUserid(String usrlUserid) {
		this.usrlUserid = usrlUserid;
	}

	public String getUsrlProduct() {
		return this.usrlProduct;
	}

	public void setUsrlProduct(String usrlProduct) {
		this.usrlProduct = usrlProduct;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUsrlDetId))
			return false;
		AbstractUsrlDetId castOther = (AbstractUsrlDetId) other;

		return ((this.getUsrlUserid() == castOther.getUsrlUserid()) || (this
				.getUsrlUserid() != null
				&& castOther.getUsrlUserid() != null && this.getUsrlUserid()
				.equals(castOther.getUsrlUserid())))
				&& ((this.getUsrlProduct() == castOther.getUsrlProduct()) || (this
						.getUsrlProduct() != null
						&& castOther.getUsrlProduct() != null && this
						.getUsrlProduct().equals(castOther.getUsrlProduct())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getUsrlUserid() == null ? 0 : this.getUsrlUserid()
						.hashCode());
		result = 37
				* result
				+ (getUsrlProduct() == null ? 0 : this.getUsrlProduct()
						.hashCode());
		return result;
	}

}