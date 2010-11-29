package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlffMstr entity provides the base persistence definition of the
 * FlffMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlffMstr implements java.io.Serializable {

	// Fields

	private FlffMstrId id;
	private Double flffPct;
	private Date flffModDate;
	private String flffUser1;
	private String flffUser2;
	private String flffUserc03;
	private Double flffUserd01;
	private Integer flffUseri01;
	private String flffModUserid;
	private Boolean flffUserl01;
	private Date flffUsert01;
	private String flffQadc01;
	private String flffQadc02;
	private String flffQadc03;
	private Double flffQadd01;
	private Integer flffQadi01;
	private Boolean flffQadl01;
	private Date flffQadt01;
	private Double oidFlffMstr;

	// Constructors

	/** default constructor */
	public AbstractFlffMstr() {
	}

	/** minimal constructor */
	public AbstractFlffMstr(FlffMstrId id, Double flffPct, Date flffModDate,
			String flffUser1, String flffUser2, String flffUserc03,
			Double flffUserd01, Integer flffUseri01, String flffModUserid,
			Boolean flffUserl01, String flffQadc01, String flffQadc02,
			String flffQadc03, Double flffQadd01, Integer flffQadi01,
			Boolean flffQadl01, Double oidFlffMstr) {
		this.id = id;
		this.flffPct = flffPct;
		this.flffModDate = flffModDate;
		this.flffUser1 = flffUser1;
		this.flffUser2 = flffUser2;
		this.flffUserc03 = flffUserc03;
		this.flffUserd01 = flffUserd01;
		this.flffUseri01 = flffUseri01;
		this.flffModUserid = flffModUserid;
		this.flffUserl01 = flffUserl01;
		this.flffQadc01 = flffQadc01;
		this.flffQadc02 = flffQadc02;
		this.flffQadc03 = flffQadc03;
		this.flffQadd01 = flffQadd01;
		this.flffQadi01 = flffQadi01;
		this.flffQadl01 = flffQadl01;
		this.oidFlffMstr = oidFlffMstr;
	}

	/** full constructor */
	public AbstractFlffMstr(FlffMstrId id, Double flffPct, Date flffModDate,
			String flffUser1, String flffUser2, String flffUserc03,
			Double flffUserd01, Integer flffUseri01, String flffModUserid,
			Boolean flffUserl01, Date flffUsert01, String flffQadc01,
			String flffQadc02, String flffQadc03, Double flffQadd01,
			Integer flffQadi01, Boolean flffQadl01, Date flffQadt01,
			Double oidFlffMstr) {
		this.id = id;
		this.flffPct = flffPct;
		this.flffModDate = flffModDate;
		this.flffUser1 = flffUser1;
		this.flffUser2 = flffUser2;
		this.flffUserc03 = flffUserc03;
		this.flffUserd01 = flffUserd01;
		this.flffUseri01 = flffUseri01;
		this.flffModUserid = flffModUserid;
		this.flffUserl01 = flffUserl01;
		this.flffUsert01 = flffUsert01;
		this.flffQadc01 = flffQadc01;
		this.flffQadc02 = flffQadc02;
		this.flffQadc03 = flffQadc03;
		this.flffQadd01 = flffQadd01;
		this.flffQadi01 = flffQadi01;
		this.flffQadl01 = flffQadl01;
		this.flffQadt01 = flffQadt01;
		this.oidFlffMstr = oidFlffMstr;
	}

	// Property accessors

	public FlffMstrId getId() {
		return this.id;
	}

	public void setId(FlffMstrId id) {
		this.id = id;
	}

	public Double getFlffPct() {
		return this.flffPct;
	}

	public void setFlffPct(Double flffPct) {
		this.flffPct = flffPct;
	}

	public Date getFlffModDate() {
		return this.flffModDate;
	}

	public void setFlffModDate(Date flffModDate) {
		this.flffModDate = flffModDate;
	}

	public String getFlffUser1() {
		return this.flffUser1;
	}

	public void setFlffUser1(String flffUser1) {
		this.flffUser1 = flffUser1;
	}

	public String getFlffUser2() {
		return this.flffUser2;
	}

	public void setFlffUser2(String flffUser2) {
		this.flffUser2 = flffUser2;
	}

	public String getFlffUserc03() {
		return this.flffUserc03;
	}

	public void setFlffUserc03(String flffUserc03) {
		this.flffUserc03 = flffUserc03;
	}

	public Double getFlffUserd01() {
		return this.flffUserd01;
	}

	public void setFlffUserd01(Double flffUserd01) {
		this.flffUserd01 = flffUserd01;
	}

	public Integer getFlffUseri01() {
		return this.flffUseri01;
	}

	public void setFlffUseri01(Integer flffUseri01) {
		this.flffUseri01 = flffUseri01;
	}

	public String getFlffModUserid() {
		return this.flffModUserid;
	}

	public void setFlffModUserid(String flffModUserid) {
		this.flffModUserid = flffModUserid;
	}

	public Boolean getFlffUserl01() {
		return this.flffUserl01;
	}

	public void setFlffUserl01(Boolean flffUserl01) {
		this.flffUserl01 = flffUserl01;
	}

	public Date getFlffUsert01() {
		return this.flffUsert01;
	}

	public void setFlffUsert01(Date flffUsert01) {
		this.flffUsert01 = flffUsert01;
	}

	public String getFlffQadc01() {
		return this.flffQadc01;
	}

	public void setFlffQadc01(String flffQadc01) {
		this.flffQadc01 = flffQadc01;
	}

	public String getFlffQadc02() {
		return this.flffQadc02;
	}

	public void setFlffQadc02(String flffQadc02) {
		this.flffQadc02 = flffQadc02;
	}

	public String getFlffQadc03() {
		return this.flffQadc03;
	}

	public void setFlffQadc03(String flffQadc03) {
		this.flffQadc03 = flffQadc03;
	}

	public Double getFlffQadd01() {
		return this.flffQadd01;
	}

	public void setFlffQadd01(Double flffQadd01) {
		this.flffQadd01 = flffQadd01;
	}

	public Integer getFlffQadi01() {
		return this.flffQadi01;
	}

	public void setFlffQadi01(Integer flffQadi01) {
		this.flffQadi01 = flffQadi01;
	}

	public Boolean getFlffQadl01() {
		return this.flffQadl01;
	}

	public void setFlffQadl01(Boolean flffQadl01) {
		this.flffQadl01 = flffQadl01;
	}

	public Date getFlffQadt01() {
		return this.flffQadt01;
	}

	public void setFlffQadt01(Date flffQadt01) {
		this.flffQadt01 = flffQadt01;
	}

	public Double getOidFlffMstr() {
		return this.oidFlffMstr;
	}

	public void setOidFlffMstr(Double oidFlffMstr) {
		this.oidFlffMstr = oidFlffMstr;
	}

}