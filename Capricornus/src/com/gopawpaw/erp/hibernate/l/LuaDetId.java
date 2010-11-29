package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LuaDetId entity. @author MyEclipse Persistence Tools
 */
public class LuaDetId extends AbstractLuaDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LuaDetId() {
	}

	/** full constructor */
	public LuaDetId(String luaProduct, Date luaInDate, Integer luaInTime,
			String luaSid) {
		super(luaProduct, luaInDate, luaInTime, luaSid);
	}

}
