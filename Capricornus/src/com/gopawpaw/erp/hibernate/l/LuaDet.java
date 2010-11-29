package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LuaDet entity. @author MyEclipse Persistence Tools
 */
public class LuaDet extends AbstractLuaDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LuaDet() {
	}

	/** minimal constructor */
	public LuaDet(LuaDetId id, String luaUserid, String luaProgUser,
			Integer luaNamed, Integer luaConcur, Integer luaOutTime,
			String luaQadc01, String luaQadc02, Double luaQadd01,
			Double oidLuaDet) {
		super(id, luaUserid, luaProgUser, luaNamed, luaConcur, luaOutTime,
				luaQadc01, luaQadc02, luaQadd01, oidLuaDet);
	}

	/** full constructor */
	public LuaDet(LuaDetId id, String luaUserid, String luaProgUser,
			Integer luaNamed, Integer luaConcur, Date luaOutDate,
			Integer luaOutTime, String luaQadc01, String luaQadc02,
			Double luaQadd01, Date luaQadt01, Double oidLuaDet) {
		super(id, luaUserid, luaProgUser, luaNamed, luaConcur, luaOutDate,
				luaOutTime, luaQadc01, luaQadc02, luaQadd01, luaQadt01,
				oidLuaDet);
	}

}
