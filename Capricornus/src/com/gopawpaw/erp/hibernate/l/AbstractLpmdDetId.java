package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLpmdDetId entity provides the base persistence definition of the
 * LpmdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLpmdDetId implements java.io.Serializable {

	// Fields

	private String lpmdProduct;
	private String lpmdExec;

	// Constructors

	/** default constructor */
	public AbstractLpmdDetId() {
	}

	/** full constructor */
	public AbstractLpmdDetId(String lpmdProduct, String lpmdExec) {
		this.lpmdProduct = lpmdProduct;
		this.lpmdExec = lpmdExec;
	}

	// Property accessors

	public String getLpmdProduct() {
		return this.lpmdProduct;
	}

	public void setLpmdProduct(String lpmdProduct) {
		this.lpmdProduct = lpmdProduct;
	}

	public String getLpmdExec() {
		return this.lpmdExec;
	}

	public void setLpmdExec(String lpmdExec) {
		this.lpmdExec = lpmdExec;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLpmdDetId))
			return false;
		AbstractLpmdDetId castOther = (AbstractLpmdDetId) other;

		return ((this.getLpmdProduct() == castOther.getLpmdProduct()) || (this
				.getLpmdProduct() != null
				&& castOther.getLpmdProduct() != null && this.getLpmdProduct()
				.equals(castOther.getLpmdProduct())))
				&& ((this.getLpmdExec() == castOther.getLpmdExec()) || (this
						.getLpmdExec() != null
						&& castOther.getLpmdExec() != null && this
						.getLpmdExec().equals(castOther.getLpmdExec())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLpmdProduct() == null ? 0 : this.getLpmdProduct()
						.hashCode());
		result = 37 * result
				+ (getLpmdExec() == null ? 0 : this.getLpmdExec().hashCode());
		return result;
	}

}