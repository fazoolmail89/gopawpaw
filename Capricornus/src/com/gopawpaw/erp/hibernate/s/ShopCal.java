package com.gopawpaw.erp.hibernate.s;

/**
 * ShopCal entity. @author MyEclipse Persistence Tools
 */
public class ShopCal extends AbstractShopCal implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShopCal() {
	}

	/** minimal constructor */
	public ShopCal(ShopCalId id, String shopWdays, Double oidShopCal) {
		super(id, shopWdays, oidShopCal);
	}

	/** full constructor */
	public ShopCal(ShopCalId id, String shopWdays, String shopHours,
			String shopUser1, String shopUser2, String shopShifts,
			String shopQadc01, Double oidShopCal) {
		super(id, shopWdays, shopHours, shopUser1, shopUser2, shopShifts,
				shopQadc01, oidShopCal);
	}

}
