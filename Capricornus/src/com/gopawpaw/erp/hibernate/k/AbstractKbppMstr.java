package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKbppMstr entity provides the base persistence definition of the
 * KbppMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbppMstr implements java.io.Serializable {

	// Fields

	private KbppMstrId id;
	private String kbppDesc;
	private Double kbppHours;
	private String kbppModUserid;
	private Date kbppModDate;
	private String kbppUser1;
	private String kbppUser2;
	private String kbppQadc01;
	private Integer kbppCalendarDays;
	private Integer kbppWorkDays;
	private Double oidKbppMstr;

	// Constructors

	/** default constructor */
	public AbstractKbppMstr() {
	}

	/** full constructor */
	public AbstractKbppMstr(KbppMstrId id, String kbppDesc, Double kbppHours,
			String kbppModUserid, Date kbppModDate, String kbppUser1,
			String kbppUser2, String kbppQadc01, Integer kbppCalendarDays,
			Integer kbppWorkDays, Double oidKbppMstr) {
		this.id = id;
		this.kbppDesc = kbppDesc;
		this.kbppHours = kbppHours;
		this.kbppModUserid = kbppModUserid;
		this.kbppModDate = kbppModDate;
		this.kbppUser1 = kbppUser1;
		this.kbppUser2 = kbppUser2;
		this.kbppQadc01 = kbppQadc01;
		this.kbppCalendarDays = kbppCalendarDays;
		this.kbppWorkDays = kbppWorkDays;
		this.oidKbppMstr = oidKbppMstr;
	}

	// Property accessors

	public KbppMstrId getId() {
		return this.id;
	}

	public void setId(KbppMstrId id) {
		this.id = id;
	}

	public String getKbppDesc() {
		return this.kbppDesc;
	}

	public void setKbppDesc(String kbppDesc) {
		this.kbppDesc = kbppDesc;
	}

	public Double getKbppHours() {
		return this.kbppHours;
	}

	public void setKbppHours(Double kbppHours) {
		this.kbppHours = kbppHours;
	}

	public String getKbppModUserid() {
		return this.kbppModUserid;
	}

	public void setKbppModUserid(String kbppModUserid) {
		this.kbppModUserid = kbppModUserid;
	}

	public Date getKbppModDate() {
		return this.kbppModDate;
	}

	public void setKbppModDate(Date kbppModDate) {
		this.kbppModDate = kbppModDate;
	}

	public String getKbppUser1() {
		return this.kbppUser1;
	}

	public void setKbppUser1(String kbppUser1) {
		this.kbppUser1 = kbppUser1;
	}

	public String getKbppUser2() {
		return this.kbppUser2;
	}

	public void setKbppUser2(String kbppUser2) {
		this.kbppUser2 = kbppUser2;
	}

	public String getKbppQadc01() {
		return this.kbppQadc01;
	}

	public void setKbppQadc01(String kbppQadc01) {
		this.kbppQadc01 = kbppQadc01;
	}

	public Integer getKbppCalendarDays() {
		return this.kbppCalendarDays;
	}

	public void setKbppCalendarDays(Integer kbppCalendarDays) {
		this.kbppCalendarDays = kbppCalendarDays;
	}

	public Integer getKbppWorkDays() {
		return this.kbppWorkDays;
	}

	public void setKbppWorkDays(Integer kbppWorkDays) {
		this.kbppWorkDays = kbppWorkDays;
	}

	public Double getOidKbppMstr() {
		return this.oidKbppMstr;
	}

	public void setOidKbppMstr(Double oidKbppMstr) {
		this.oidKbppMstr = oidKbppMstr;
	}

}