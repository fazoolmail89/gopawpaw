package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShopCal entity provides the base persistence definition of the
 * ShopCal entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShopCal implements java.io.Serializable {

	// Fields

	private ShopCalId id;
	private String shopWdays;
	private String shopHours;
	private String shopUser1;
	private String shopUser2;
	private String shopShifts;
	private String shopQadc01;
	private Double oidShopCal;

	// Constructors

	/** default constructor */
	public AbstractShopCal() {
	}

	/** minimal constructor */
	public AbstractShopCal(ShopCalId id, String shopWdays, Double oidShopCal) {
		this.id = id;
		this.shopWdays = shopWdays;
		this.oidShopCal = oidShopCal;
	}

	/** full constructor */
	public AbstractShopCal(ShopCalId id, String shopWdays, String shopHours,
			String shopUser1, String shopUser2, String shopShifts,
			String shopQadc01, Double oidShopCal) {
		this.id = id;
		this.shopWdays = shopWdays;
		this.shopHours = shopHours;
		this.shopUser1 = shopUser1;
		this.shopUser2 = shopUser2;
		this.shopShifts = shopShifts;
		this.shopQadc01 = shopQadc01;
		this.oidShopCal = oidShopCal;
	}

	// Property accessors

	public ShopCalId getId() {
		return this.id;
	}

	public void setId(ShopCalId id) {
		this.id = id;
	}

	public String getShopWdays() {
		return this.shopWdays;
	}

	public void setShopWdays(String shopWdays) {
		this.shopWdays = shopWdays;
	}

	public String getShopHours() {
		return this.shopHours;
	}

	public void setShopHours(String shopHours) {
		this.shopHours = shopHours;
	}

	public String getShopUser1() {
		return this.shopUser1;
	}

	public void setShopUser1(String shopUser1) {
		this.shopUser1 = shopUser1;
	}

	public String getShopUser2() {
		return this.shopUser2;
	}

	public void setShopUser2(String shopUser2) {
		this.shopUser2 = shopUser2;
	}

	public String getShopShifts() {
		return this.shopShifts;
	}

	public void setShopShifts(String shopShifts) {
		this.shopShifts = shopShifts;
	}

	public String getShopQadc01() {
		return this.shopQadc01;
	}

	public void setShopQadc01(String shopQadc01) {
		this.shopQadc01 = shopQadc01;
	}

	public Double getOidShopCal() {
		return this.oidShopCal;
	}

	public void setOidShopCal(Double oidShopCal) {
		this.oidShopCal = oidShopCal;
	}

}