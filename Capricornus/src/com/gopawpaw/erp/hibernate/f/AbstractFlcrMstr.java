package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlcrMstr entity provides the base persistence definition of the
 * FlcrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlcrMstr implements java.io.Serializable {

	// Fields

	private FlcrMstrId id;
	private Double flcrRate;
	private String flcrModUserid;
	private Date flcrModDate;
	private String flcrUser1;
	private String flcrUser2;
	private String flcrQadc01;
	private String flcrQadc02;
	private String flcrUserc03;
	private Double flcrUserd01;
	private Integer flcrUseri01;
	private Boolean flcrUserl01;
	private Date flcrUsert01;
	private String flcrQadc03;
	private Double flcrQadd01;
	private Integer flcrQadi01;
	private Boolean flcrQadl01;
	private Date flcrQadt01;
	private Double oidFlcrMstr;

	// Constructors

	/** default constructor */
	public AbstractFlcrMstr() {
	}

	/** minimal constructor */
	public AbstractFlcrMstr(FlcrMstrId id, Double flcrRate,
			String flcrModUserid, Date flcrModDate, String flcrUser1,
			String flcrUser2, String flcrQadc01, String flcrQadc02,
			String flcrUserc03, Double flcrUserd01, Integer flcrUseri01,
			Boolean flcrUserl01, String flcrQadc03, Double flcrQadd01,
			Integer flcrQadi01, Boolean flcrQadl01, Double oidFlcrMstr) {
		this.id = id;
		this.flcrRate = flcrRate;
		this.flcrModUserid = flcrModUserid;
		this.flcrModDate = flcrModDate;
		this.flcrUser1 = flcrUser1;
		this.flcrUser2 = flcrUser2;
		this.flcrQadc01 = flcrQadc01;
		this.flcrQadc02 = flcrQadc02;
		this.flcrUserc03 = flcrUserc03;
		this.flcrUserd01 = flcrUserd01;
		this.flcrUseri01 = flcrUseri01;
		this.flcrUserl01 = flcrUserl01;
		this.flcrQadc03 = flcrQadc03;
		this.flcrQadd01 = flcrQadd01;
		this.flcrQadi01 = flcrQadi01;
		this.flcrQadl01 = flcrQadl01;
		this.oidFlcrMstr = oidFlcrMstr;
	}

	/** full constructor */
	public AbstractFlcrMstr(FlcrMstrId id, Double flcrRate,
			String flcrModUserid, Date flcrModDate, String flcrUser1,
			String flcrUser2, String flcrQadc01, String flcrQadc02,
			String flcrUserc03, Double flcrUserd01, Integer flcrUseri01,
			Boolean flcrUserl01, Date flcrUsert01, String flcrQadc03,
			Double flcrQadd01, Integer flcrQadi01, Boolean flcrQadl01,
			Date flcrQadt01, Double oidFlcrMstr) {
		this.id = id;
		this.flcrRate = flcrRate;
		this.flcrModUserid = flcrModUserid;
		this.flcrModDate = flcrModDate;
		this.flcrUser1 = flcrUser1;
		this.flcrUser2 = flcrUser2;
		this.flcrQadc01 = flcrQadc01;
		this.flcrQadc02 = flcrQadc02;
		this.flcrUserc03 = flcrUserc03;
		this.flcrUserd01 = flcrUserd01;
		this.flcrUseri01 = flcrUseri01;
		this.flcrUserl01 = flcrUserl01;
		this.flcrUsert01 = flcrUsert01;
		this.flcrQadc03 = flcrQadc03;
		this.flcrQadd01 = flcrQadd01;
		this.flcrQadi01 = flcrQadi01;
		this.flcrQadl01 = flcrQadl01;
		this.flcrQadt01 = flcrQadt01;
		this.oidFlcrMstr = oidFlcrMstr;
	}

	// Property accessors

	public FlcrMstrId getId() {
		return this.id;
	}

	public void setId(FlcrMstrId id) {
		this.id = id;
	}

	public Double getFlcrRate() {
		return this.flcrRate;
	}

	public void setFlcrRate(Double flcrRate) {
		this.flcrRate = flcrRate;
	}

	public String getFlcrModUserid() {
		return this.flcrModUserid;
	}

	public void setFlcrModUserid(String flcrModUserid) {
		this.flcrModUserid = flcrModUserid;
	}

	public Date getFlcrModDate() {
		return this.flcrModDate;
	}

	public void setFlcrModDate(Date flcrModDate) {
		this.flcrModDate = flcrModDate;
	}

	public String getFlcrUser1() {
		return this.flcrUser1;
	}

	public void setFlcrUser1(String flcrUser1) {
		this.flcrUser1 = flcrUser1;
	}

	public String getFlcrUser2() {
		return this.flcrUser2;
	}

	public void setFlcrUser2(String flcrUser2) {
		this.flcrUser2 = flcrUser2;
	}

	public String getFlcrQadc01() {
		return this.flcrQadc01;
	}

	public void setFlcrQadc01(String flcrQadc01) {
		this.flcrQadc01 = flcrQadc01;
	}

	public String getFlcrQadc02() {
		return this.flcrQadc02;
	}

	public void setFlcrQadc02(String flcrQadc02) {
		this.flcrQadc02 = flcrQadc02;
	}

	public String getFlcrUserc03() {
		return this.flcrUserc03;
	}

	public void setFlcrUserc03(String flcrUserc03) {
		this.flcrUserc03 = flcrUserc03;
	}

	public Double getFlcrUserd01() {
		return this.flcrUserd01;
	}

	public void setFlcrUserd01(Double flcrUserd01) {
		this.flcrUserd01 = flcrUserd01;
	}

	public Integer getFlcrUseri01() {
		return this.flcrUseri01;
	}

	public void setFlcrUseri01(Integer flcrUseri01) {
		this.flcrUseri01 = flcrUseri01;
	}

	public Boolean getFlcrUserl01() {
		return this.flcrUserl01;
	}

	public void setFlcrUserl01(Boolean flcrUserl01) {
		this.flcrUserl01 = flcrUserl01;
	}

	public Date getFlcrUsert01() {
		return this.flcrUsert01;
	}

	public void setFlcrUsert01(Date flcrUsert01) {
		this.flcrUsert01 = flcrUsert01;
	}

	public String getFlcrQadc03() {
		return this.flcrQadc03;
	}

	public void setFlcrQadc03(String flcrQadc03) {
		this.flcrQadc03 = flcrQadc03;
	}

	public Double getFlcrQadd01() {
		return this.flcrQadd01;
	}

	public void setFlcrQadd01(Double flcrQadd01) {
		this.flcrQadd01 = flcrQadd01;
	}

	public Integer getFlcrQadi01() {
		return this.flcrQadi01;
	}

	public void setFlcrQadi01(Integer flcrQadi01) {
		this.flcrQadi01 = flcrQadi01;
	}

	public Boolean getFlcrQadl01() {
		return this.flcrQadl01;
	}

	public void setFlcrQadl01(Boolean flcrQadl01) {
		this.flcrQadl01 = flcrQadl01;
	}

	public Date getFlcrQadt01() {
		return this.flcrQadt01;
	}

	public void setFlcrQadt01(Date flcrQadt01) {
		this.flcrQadt01 = flcrQadt01;
	}

	public Double getOidFlcrMstr() {
		return this.oidFlcrMstr;
	}

	public void setOidFlcrMstr(Double oidFlcrMstr) {
		this.oidFlcrMstr = oidFlcrMstr;
	}

}