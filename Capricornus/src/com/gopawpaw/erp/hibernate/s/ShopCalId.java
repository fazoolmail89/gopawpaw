package com.gopawpaw.erp.hibernate.s;

/**
 * ShopCalId entity. @author MyEclipse Persistence Tools
 */
public class ShopCalId extends AbstractShopCalId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopCalId() {
	}

	/** minimal constructor */
	public ShopCalId(String shopDomain) {
		super(shopDomain);
	}

	/** full constructor */
	public ShopCalId(String shopDomain, String shopSite, String shopWkctr,
			String shopMch) {
		super(shopDomain, shopSite, shopWkctr, shopMch);
	}

}
