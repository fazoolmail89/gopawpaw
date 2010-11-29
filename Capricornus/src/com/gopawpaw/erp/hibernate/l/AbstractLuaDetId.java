package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLuaDetId entity provides the base persistence definition of the
 * LuaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLuaDetId implements java.io.Serializable {

	// Fields

	private String luaProduct;
	private Date luaInDate;
	private Integer luaInTime;
	private String luaSid;

	// Constructors

	/** default constructor */
	public AbstractLuaDetId() {
	}

	/** full constructor */
	public AbstractLuaDetId(String luaProduct, Date luaInDate,
			Integer luaInTime, String luaSid) {
		this.luaProduct = luaProduct;
		this.luaInDate = luaInDate;
		this.luaInTime = luaInTime;
		this.luaSid = luaSid;
	}

	// Property accessors

	public String getLuaProduct() {
		return this.luaProduct;
	}

	public void setLuaProduct(String luaProduct) {
		this.luaProduct = luaProduct;
	}

	public Date getLuaInDate() {
		return this.luaInDate;
	}

	public void setLuaInDate(Date luaInDate) {
		this.luaInDate = luaInDate;
	}

	public Integer getLuaInTime() {
		return this.luaInTime;
	}

	public void setLuaInTime(Integer luaInTime) {
		this.luaInTime = luaInTime;
	}

	public String getLuaSid() {
		return this.luaSid;
	}

	public void setLuaSid(String luaSid) {
		this.luaSid = luaSid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLuaDetId))
			return false;
		AbstractLuaDetId castOther = (AbstractLuaDetId) other;

		return ((this.getLuaProduct() == castOther.getLuaProduct()) || (this
				.getLuaProduct() != null
				&& castOther.getLuaProduct() != null && this.getLuaProduct()
				.equals(castOther.getLuaProduct())))
				&& ((this.getLuaInDate() == castOther.getLuaInDate()) || (this
						.getLuaInDate() != null
						&& castOther.getLuaInDate() != null && this
						.getLuaInDate().equals(castOther.getLuaInDate())))
				&& ((this.getLuaInTime() == castOther.getLuaInTime()) || (this
						.getLuaInTime() != null
						&& castOther.getLuaInTime() != null && this
						.getLuaInTime().equals(castOther.getLuaInTime())))
				&& ((this.getLuaSid() == castOther.getLuaSid()) || (this
						.getLuaSid() != null
						&& castOther.getLuaSid() != null && this.getLuaSid()
						.equals(castOther.getLuaSid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLuaProduct() == null ? 0 : this.getLuaProduct()
						.hashCode());
		result = 37 * result
				+ (getLuaInDate() == null ? 0 : this.getLuaInDate().hashCode());
		result = 37 * result
				+ (getLuaInTime() == null ? 0 : this.getLuaInTime().hashCode());
		result = 37 * result
				+ (getLuaSid() == null ? 0 : this.getLuaSid().hashCode());
		return result;
	}

}