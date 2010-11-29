package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDjrcDet entity provides the base persistence definition of the
 * DjrcDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDjrcDet implements java.io.Serializable {

	// Fields

	private DjrcDetId id;
	private String djrcModUserid;
	private Date djrcModDate;
	private Boolean djrcTotal;
	private String djrcUser1;
	private String djrcUser2;
	private Double djrcUserd01;
	private Integer djrcUseri01;
	private Boolean djrcUserl01;
	private Date djrcUsert01;
	private String djrcQadc01;
	private String djrcQadc02;
	private Double djrcQadd01;
	private Integer djrcQadi01;
	private Boolean djrcQadl01;
	private Date djrcQadt01;
	private Double oidDjrcDet;

	// Constructors

	/** default constructor */
	public AbstractDjrcDet() {
	}

	/** minimal constructor */
	public AbstractDjrcDet(DjrcDetId id, String djrcModUserid,
			Date djrcModDate, Boolean djrcTotal, String djrcUser1,
			String djrcUser2, Double djrcUserd01, Integer djrcUseri01,
			Boolean djrcUserl01, String djrcQadc01, String djrcQadc02,
			Double djrcQadd01, Integer djrcQadi01, Boolean djrcQadl01,
			Double oidDjrcDet) {
		this.id = id;
		this.djrcModUserid = djrcModUserid;
		this.djrcModDate = djrcModDate;
		this.djrcTotal = djrcTotal;
		this.djrcUser1 = djrcUser1;
		this.djrcUser2 = djrcUser2;
		this.djrcUserd01 = djrcUserd01;
		this.djrcUseri01 = djrcUseri01;
		this.djrcUserl01 = djrcUserl01;
		this.djrcQadc01 = djrcQadc01;
		this.djrcQadc02 = djrcQadc02;
		this.djrcQadd01 = djrcQadd01;
		this.djrcQadi01 = djrcQadi01;
		this.djrcQadl01 = djrcQadl01;
		this.oidDjrcDet = oidDjrcDet;
	}

	/** full constructor */
	public AbstractDjrcDet(DjrcDetId id, String djrcModUserid,
			Date djrcModDate, Boolean djrcTotal, String djrcUser1,
			String djrcUser2, Double djrcUserd01, Integer djrcUseri01,
			Boolean djrcUserl01, Date djrcUsert01, String djrcQadc01,
			String djrcQadc02, Double djrcQadd01, Integer djrcQadi01,
			Boolean djrcQadl01, Date djrcQadt01, Double oidDjrcDet) {
		this.id = id;
		this.djrcModUserid = djrcModUserid;
		this.djrcModDate = djrcModDate;
		this.djrcTotal = djrcTotal;
		this.djrcUser1 = djrcUser1;
		this.djrcUser2 = djrcUser2;
		this.djrcUserd01 = djrcUserd01;
		this.djrcUseri01 = djrcUseri01;
		this.djrcUserl01 = djrcUserl01;
		this.djrcUsert01 = djrcUsert01;
		this.djrcQadc01 = djrcQadc01;
		this.djrcQadc02 = djrcQadc02;
		this.djrcQadd01 = djrcQadd01;
		this.djrcQadi01 = djrcQadi01;
		this.djrcQadl01 = djrcQadl01;
		this.djrcQadt01 = djrcQadt01;
		this.oidDjrcDet = oidDjrcDet;
	}

	// Property accessors

	public DjrcDetId getId() {
		return this.id;
	}

	public void setId(DjrcDetId id) {
		this.id = id;
	}

	public String getDjrcModUserid() {
		return this.djrcModUserid;
	}

	public void setDjrcModUserid(String djrcModUserid) {
		this.djrcModUserid = djrcModUserid;
	}

	public Date getDjrcModDate() {
		return this.djrcModDate;
	}

	public void setDjrcModDate(Date djrcModDate) {
		this.djrcModDate = djrcModDate;
	}

	public Boolean getDjrcTotal() {
		return this.djrcTotal;
	}

	public void setDjrcTotal(Boolean djrcTotal) {
		this.djrcTotal = djrcTotal;
	}

	public String getDjrcUser1() {
		return this.djrcUser1;
	}

	public void setDjrcUser1(String djrcUser1) {
		this.djrcUser1 = djrcUser1;
	}

	public String getDjrcUser2() {
		return this.djrcUser2;
	}

	public void setDjrcUser2(String djrcUser2) {
		this.djrcUser2 = djrcUser2;
	}

	public Double getDjrcUserd01() {
		return this.djrcUserd01;
	}

	public void setDjrcUserd01(Double djrcUserd01) {
		this.djrcUserd01 = djrcUserd01;
	}

	public Integer getDjrcUseri01() {
		return this.djrcUseri01;
	}

	public void setDjrcUseri01(Integer djrcUseri01) {
		this.djrcUseri01 = djrcUseri01;
	}

	public Boolean getDjrcUserl01() {
		return this.djrcUserl01;
	}

	public void setDjrcUserl01(Boolean djrcUserl01) {
		this.djrcUserl01 = djrcUserl01;
	}

	public Date getDjrcUsert01() {
		return this.djrcUsert01;
	}

	public void setDjrcUsert01(Date djrcUsert01) {
		this.djrcUsert01 = djrcUsert01;
	}

	public String getDjrcQadc01() {
		return this.djrcQadc01;
	}

	public void setDjrcQadc01(String djrcQadc01) {
		this.djrcQadc01 = djrcQadc01;
	}

	public String getDjrcQadc02() {
		return this.djrcQadc02;
	}

	public void setDjrcQadc02(String djrcQadc02) {
		this.djrcQadc02 = djrcQadc02;
	}

	public Double getDjrcQadd01() {
		return this.djrcQadd01;
	}

	public void setDjrcQadd01(Double djrcQadd01) {
		this.djrcQadd01 = djrcQadd01;
	}

	public Integer getDjrcQadi01() {
		return this.djrcQadi01;
	}

	public void setDjrcQadi01(Integer djrcQadi01) {
		this.djrcQadi01 = djrcQadi01;
	}

	public Boolean getDjrcQadl01() {
		return this.djrcQadl01;
	}

	public void setDjrcQadl01(Boolean djrcQadl01) {
		this.djrcQadl01 = djrcQadl01;
	}

	public Date getDjrcQadt01() {
		return this.djrcQadt01;
	}

	public void setDjrcQadt01(Date djrcQadt01) {
		this.djrcQadt01 = djrcQadt01;
	}

	public Double getOidDjrcDet() {
		return this.oidDjrcDet;
	}

	public void setOidDjrcDet(Double oidDjrcDet) {
		this.oidDjrcDet = oidDjrcDet;
	}

}