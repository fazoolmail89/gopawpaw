package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLuaDet entity provides the base persistence definition of the LuaDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLuaDet implements java.io.Serializable {

	// Fields

	private LuaDetId id;
	private String luaUserid;
	private String luaProgUser;
	private Integer luaNamed;
	private Integer luaConcur;
	private Date luaOutDate;
	private Integer luaOutTime;
	private String luaQadc01;
	private String luaQadc02;
	private Double luaQadd01;
	private Date luaQadt01;
	private Double oidLuaDet;

	// Constructors

	/** default constructor */
	public AbstractLuaDet() {
	}

	/** minimal constructor */
	public AbstractLuaDet(LuaDetId id, String luaUserid, String luaProgUser,
			Integer luaNamed, Integer luaConcur, Integer luaOutTime,
			String luaQadc01, String luaQadc02, Double luaQadd01,
			Double oidLuaDet) {
		this.id = id;
		this.luaUserid = luaUserid;
		this.luaProgUser = luaProgUser;
		this.luaNamed = luaNamed;
		this.luaConcur = luaConcur;
		this.luaOutTime = luaOutTime;
		this.luaQadc01 = luaQadc01;
		this.luaQadc02 = luaQadc02;
		this.luaQadd01 = luaQadd01;
		this.oidLuaDet = oidLuaDet;
	}

	/** full constructor */
	public AbstractLuaDet(LuaDetId id, String luaUserid, String luaProgUser,
			Integer luaNamed, Integer luaConcur, Date luaOutDate,
			Integer luaOutTime, String luaQadc01, String luaQadc02,
			Double luaQadd01, Date luaQadt01, Double oidLuaDet) {
		this.id = id;
		this.luaUserid = luaUserid;
		this.luaProgUser = luaProgUser;
		this.luaNamed = luaNamed;
		this.luaConcur = luaConcur;
		this.luaOutDate = luaOutDate;
		this.luaOutTime = luaOutTime;
		this.luaQadc01 = luaQadc01;
		this.luaQadc02 = luaQadc02;
		this.luaQadd01 = luaQadd01;
		this.luaQadt01 = luaQadt01;
		this.oidLuaDet = oidLuaDet;
	}

	// Property accessors

	public LuaDetId getId() {
		return this.id;
	}

	public void setId(LuaDetId id) {
		this.id = id;
	}

	public String getLuaUserid() {
		return this.luaUserid;
	}

	public void setLuaUserid(String luaUserid) {
		this.luaUserid = luaUserid;
	}

	public String getLuaProgUser() {
		return this.luaProgUser;
	}

	public void setLuaProgUser(String luaProgUser) {
		this.luaProgUser = luaProgUser;
	}

	public Integer getLuaNamed() {
		return this.luaNamed;
	}

	public void setLuaNamed(Integer luaNamed) {
		this.luaNamed = luaNamed;
	}

	public Integer getLuaConcur() {
		return this.luaConcur;
	}

	public void setLuaConcur(Integer luaConcur) {
		this.luaConcur = luaConcur;
	}

	public Date getLuaOutDate() {
		return this.luaOutDate;
	}

	public void setLuaOutDate(Date luaOutDate) {
		this.luaOutDate = luaOutDate;
	}

	public Integer getLuaOutTime() {
		return this.luaOutTime;
	}

	public void setLuaOutTime(Integer luaOutTime) {
		this.luaOutTime = luaOutTime;
	}

	public String getLuaQadc01() {
		return this.luaQadc01;
	}

	public void setLuaQadc01(String luaQadc01) {
		this.luaQadc01 = luaQadc01;
	}

	public String getLuaQadc02() {
		return this.luaQadc02;
	}

	public void setLuaQadc02(String luaQadc02) {
		this.luaQadc02 = luaQadc02;
	}

	public Double getLuaQadd01() {
		return this.luaQadd01;
	}

	public void setLuaQadd01(Double luaQadd01) {
		this.luaQadd01 = luaQadd01;
	}

	public Date getLuaQadt01() {
		return this.luaQadt01;
	}

	public void setLuaQadt01(Date luaQadt01) {
		this.luaQadt01 = luaQadt01;
	}

	public Double getOidLuaDet() {
		return this.oidLuaDet;
	}

	public void setOidLuaDet(Double oidLuaDet) {
		this.oidLuaDet = oidLuaDet;
	}

}