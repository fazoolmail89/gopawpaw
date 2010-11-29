package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWldDet entity provides the base persistence definition of the WldDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWldDet implements java.io.Serializable {

	// Fields

	private WldDetId id;
	private Double wldQtyOh;
	private Date wldModDate;
	private String wldModUserid;
	private String wldQadc01;
	private String wldQadc02;
	private String wldQadc03;
	private String wldQadc04;
	private Double wldQadd01;
	private Double wldQadd02;
	private Integer wldQadi01;
	private Integer wldQadi02;
	private Boolean wldQadl01;
	private Boolean wldQadl02;
	private Date wldQadt01;
	private Date wldQadt02;
	private String wldChr01;
	private String wldChr02;
	private String wldChr03;
	private String wldChr04;
	private Double wldDec01;
	private Double wldDec02;
	private Integer wldInt01;
	private Integer wldInt02;
	private Boolean wldLog01;
	private Boolean wldLog02;
	private Date wldDte01;
	private Date wldDte02;
	private String wldUser1;
	private String wldUser2;
	private Double oidWldDet;

	// Constructors

	/** default constructor */
	public AbstractWldDet() {
	}

	/** minimal constructor */
	public AbstractWldDet(WldDetId id, Double wldQtyOh, Double oidWldDet) {
		this.id = id;
		this.wldQtyOh = wldQtyOh;
		this.oidWldDet = oidWldDet;
	}

	/** full constructor */
	public AbstractWldDet(WldDetId id, Double wldQtyOh, Date wldModDate,
			String wldModUserid, String wldQadc01, String wldQadc02,
			String wldQadc03, String wldQadc04, Double wldQadd01,
			Double wldQadd02, Integer wldQadi01, Integer wldQadi02,
			Boolean wldQadl01, Boolean wldQadl02, Date wldQadt01,
			Date wldQadt02, String wldChr01, String wldChr02, String wldChr03,
			String wldChr04, Double wldDec01, Double wldDec02,
			Integer wldInt01, Integer wldInt02, Boolean wldLog01,
			Boolean wldLog02, Date wldDte01, Date wldDte02, String wldUser1,
			String wldUser2, Double oidWldDet) {
		this.id = id;
		this.wldQtyOh = wldQtyOh;
		this.wldModDate = wldModDate;
		this.wldModUserid = wldModUserid;
		this.wldQadc01 = wldQadc01;
		this.wldQadc02 = wldQadc02;
		this.wldQadc03 = wldQadc03;
		this.wldQadc04 = wldQadc04;
		this.wldQadd01 = wldQadd01;
		this.wldQadd02 = wldQadd02;
		this.wldQadi01 = wldQadi01;
		this.wldQadi02 = wldQadi02;
		this.wldQadl01 = wldQadl01;
		this.wldQadl02 = wldQadl02;
		this.wldQadt01 = wldQadt01;
		this.wldQadt02 = wldQadt02;
		this.wldChr01 = wldChr01;
		this.wldChr02 = wldChr02;
		this.wldChr03 = wldChr03;
		this.wldChr04 = wldChr04;
		this.wldDec01 = wldDec01;
		this.wldDec02 = wldDec02;
		this.wldInt01 = wldInt01;
		this.wldInt02 = wldInt02;
		this.wldLog01 = wldLog01;
		this.wldLog02 = wldLog02;
		this.wldDte01 = wldDte01;
		this.wldDte02 = wldDte02;
		this.wldUser1 = wldUser1;
		this.wldUser2 = wldUser2;
		this.oidWldDet = oidWldDet;
	}

	// Property accessors

	public WldDetId getId() {
		return this.id;
	}

	public void setId(WldDetId id) {
		this.id = id;
	}

	public Double getWldQtyOh() {
		return this.wldQtyOh;
	}

	public void setWldQtyOh(Double wldQtyOh) {
		this.wldQtyOh = wldQtyOh;
	}

	public Date getWldModDate() {
		return this.wldModDate;
	}

	public void setWldModDate(Date wldModDate) {
		this.wldModDate = wldModDate;
	}

	public String getWldModUserid() {
		return this.wldModUserid;
	}

	public void setWldModUserid(String wldModUserid) {
		this.wldModUserid = wldModUserid;
	}

	public String getWldQadc01() {
		return this.wldQadc01;
	}

	public void setWldQadc01(String wldQadc01) {
		this.wldQadc01 = wldQadc01;
	}

	public String getWldQadc02() {
		return this.wldQadc02;
	}

	public void setWldQadc02(String wldQadc02) {
		this.wldQadc02 = wldQadc02;
	}

	public String getWldQadc03() {
		return this.wldQadc03;
	}

	public void setWldQadc03(String wldQadc03) {
		this.wldQadc03 = wldQadc03;
	}

	public String getWldQadc04() {
		return this.wldQadc04;
	}

	public void setWldQadc04(String wldQadc04) {
		this.wldQadc04 = wldQadc04;
	}

	public Double getWldQadd01() {
		return this.wldQadd01;
	}

	public void setWldQadd01(Double wldQadd01) {
		this.wldQadd01 = wldQadd01;
	}

	public Double getWldQadd02() {
		return this.wldQadd02;
	}

	public void setWldQadd02(Double wldQadd02) {
		this.wldQadd02 = wldQadd02;
	}

	public Integer getWldQadi01() {
		return this.wldQadi01;
	}

	public void setWldQadi01(Integer wldQadi01) {
		this.wldQadi01 = wldQadi01;
	}

	public Integer getWldQadi02() {
		return this.wldQadi02;
	}

	public void setWldQadi02(Integer wldQadi02) {
		this.wldQadi02 = wldQadi02;
	}

	public Boolean getWldQadl01() {
		return this.wldQadl01;
	}

	public void setWldQadl01(Boolean wldQadl01) {
		this.wldQadl01 = wldQadl01;
	}

	public Boolean getWldQadl02() {
		return this.wldQadl02;
	}

	public void setWldQadl02(Boolean wldQadl02) {
		this.wldQadl02 = wldQadl02;
	}

	public Date getWldQadt01() {
		return this.wldQadt01;
	}

	public void setWldQadt01(Date wldQadt01) {
		this.wldQadt01 = wldQadt01;
	}

	public Date getWldQadt02() {
		return this.wldQadt02;
	}

	public void setWldQadt02(Date wldQadt02) {
		this.wldQadt02 = wldQadt02;
	}

	public String getWldChr01() {
		return this.wldChr01;
	}

	public void setWldChr01(String wldChr01) {
		this.wldChr01 = wldChr01;
	}

	public String getWldChr02() {
		return this.wldChr02;
	}

	public void setWldChr02(String wldChr02) {
		this.wldChr02 = wldChr02;
	}

	public String getWldChr03() {
		return this.wldChr03;
	}

	public void setWldChr03(String wldChr03) {
		this.wldChr03 = wldChr03;
	}

	public String getWldChr04() {
		return this.wldChr04;
	}

	public void setWldChr04(String wldChr04) {
		this.wldChr04 = wldChr04;
	}

	public Double getWldDec01() {
		return this.wldDec01;
	}

	public void setWldDec01(Double wldDec01) {
		this.wldDec01 = wldDec01;
	}

	public Double getWldDec02() {
		return this.wldDec02;
	}

	public void setWldDec02(Double wldDec02) {
		this.wldDec02 = wldDec02;
	}

	public Integer getWldInt01() {
		return this.wldInt01;
	}

	public void setWldInt01(Integer wldInt01) {
		this.wldInt01 = wldInt01;
	}

	public Integer getWldInt02() {
		return this.wldInt02;
	}

	public void setWldInt02(Integer wldInt02) {
		this.wldInt02 = wldInt02;
	}

	public Boolean getWldLog01() {
		return this.wldLog01;
	}

	public void setWldLog01(Boolean wldLog01) {
		this.wldLog01 = wldLog01;
	}

	public Boolean getWldLog02() {
		return this.wldLog02;
	}

	public void setWldLog02(Boolean wldLog02) {
		this.wldLog02 = wldLog02;
	}

	public Date getWldDte01() {
		return this.wldDte01;
	}

	public void setWldDte01(Date wldDte01) {
		this.wldDte01 = wldDte01;
	}

	public Date getWldDte02() {
		return this.wldDte02;
	}

	public void setWldDte02(Date wldDte02) {
		this.wldDte02 = wldDte02;
	}

	public String getWldUser1() {
		return this.wldUser1;
	}

	public void setWldUser1(String wldUser1) {
		this.wldUser1 = wldUser1;
	}

	public String getWldUser2() {
		return this.wldUser2;
	}

	public void setWldUser2(String wldUser2) {
		this.wldUser2 = wldUser2;
	}

	public Double getOidWldDet() {
		return this.oidWldDet;
	}

	public void setOidWldDet(Double oidWldDet) {
		this.oidWldDet = oidWldDet;
	}

}