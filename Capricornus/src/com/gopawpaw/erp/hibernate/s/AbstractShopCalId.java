package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShopCalId entity provides the base persistence definition of the
 * ShopCalId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopCalId implements java.io.Serializable {

	// Fields

	private String shopDomain;
	private String shopSite;
	private String shopWkctr;
	private String shopMch;

	// Constructors

	/** default constructor */
	public AbstractShopCalId() {
	}

	/** minimal constructor */
	public AbstractShopCalId(String shopDomain) {
		this.shopDomain = shopDomain;
	}

	/** full constructor */
	public AbstractShopCalId(String shopDomain, String shopSite,
			String shopWkctr, String shopMch) {
		this.shopDomain = shopDomain;
		this.shopSite = shopSite;
		this.shopWkctr = shopWkctr;
		this.shopMch = shopMch;
	}

	// Property accessors

	public String getShopDomain() {
		return this.shopDomain;
	}

	public void setShopDomain(String shopDomain) {
		this.shopDomain = shopDomain;
	}

	public String getShopSite() {
		return this.shopSite;
	}

	public void setShopSite(String shopSite) {
		this.shopSite = shopSite;
	}

	public String getShopWkctr() {
		return this.shopWkctr;
	}

	public void setShopWkctr(String shopWkctr) {
		this.shopWkctr = shopWkctr;
	}

	public String getShopMch() {
		return this.shopMch;
	}

	public void setShopMch(String shopMch) {
		this.shopMch = shopMch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractShopCalId))
			return false;
		AbstractShopCalId castOther = (AbstractShopCalId) other;

		return ((this.getShopDomain() == castOther.getShopDomain()) || (this
				.getShopDomain() != null
				&& castOther.getShopDomain() != null && this.getShopDomain()
				.equals(castOther.getShopDomain())))
				&& ((this.getShopSite() == castOther.getShopSite()) || (this
						.getShopSite() != null
						&& castOther.getShopSite() != null && this
						.getShopSite().equals(castOther.getShopSite())))
				&& ((this.getShopWkctr() == castOther.getShopWkctr()) || (this
						.getShopWkctr() != null
						&& castOther.getShopWkctr() != null && this
						.getShopWkctr().equals(castOther.getShopWkctr())))
				&& ((this.getShopMch() == castOther.getShopMch()) || (this
						.getShopMch() != null
						&& castOther.getShopMch() != null && this.getShopMch()
						.equals(castOther.getShopMch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getShopDomain() == null ? 0 : this.getShopDomain()
						.hashCode());
		result = 37 * result
				+ (getShopSite() == null ? 0 : this.getShopSite().hashCode());
		result = 37 * result
				+ (getShopWkctr() == null ? 0 : this.getShopWkctr().hashCode());
		result = 37 * result
				+ (getShopMch() == null ? 0 : this.getShopMch().hashCode());
		return result;
	}

}