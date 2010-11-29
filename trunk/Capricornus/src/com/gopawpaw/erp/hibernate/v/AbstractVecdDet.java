package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVecdDet entity provides the base persistence definition of the
 * VecdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVecdDet implements java.io.Serializable {

	// Fields

	private VecdDetId id;
	private Double vecdValueTo;
	private Double vecdPercent;
	private String vecdModUserid;
	private Date vecdModDate;
	private String vecdUser1;
	private String vecdUser2;
	private String vecdUser3;
	private String vecdUser4;
	private String vecdQadc01;
	private String vecdQadc02;
	private String vecdQadc03;
	private String vecdQadc04;
	private Double vecdQadd01;
	private Double vecdQadd02;
	private Boolean vecdQadl01;
	private Boolean vecdQadl02;
	private Date vecdQadt01;
	private Date vecdQadt02;
	private Integer vecdQadi01;
	private Integer vecdQadi02;
	private Double oidVecdDet;

	// Constructors

	/** default constructor */
	public AbstractVecdDet() {
	}

	/** minimal constructor */
	public AbstractVecdDet(VecdDetId id, Double oidVecdDet) {
		this.id = id;
		this.oidVecdDet = oidVecdDet;
	}

	/** full constructor */
	public AbstractVecdDet(VecdDetId id, Double vecdValueTo,
			Double vecdPercent, String vecdModUserid, Date vecdModDate,
			String vecdUser1, String vecdUser2, String vecdUser3,
			String vecdUser4, String vecdQadc01, String vecdQadc02,
			String vecdQadc03, String vecdQadc04, Double vecdQadd01,
			Double vecdQadd02, Boolean vecdQadl01, Boolean vecdQadl02,
			Date vecdQadt01, Date vecdQadt02, Integer vecdQadi01,
			Integer vecdQadi02, Double oidVecdDet) {
		this.id = id;
		this.vecdValueTo = vecdValueTo;
		this.vecdPercent = vecdPercent;
		this.vecdModUserid = vecdModUserid;
		this.vecdModDate = vecdModDate;
		this.vecdUser1 = vecdUser1;
		this.vecdUser2 = vecdUser2;
		this.vecdUser3 = vecdUser3;
		this.vecdUser4 = vecdUser4;
		this.vecdQadc01 = vecdQadc01;
		this.vecdQadc02 = vecdQadc02;
		this.vecdQadc03 = vecdQadc03;
		this.vecdQadc04 = vecdQadc04;
		this.vecdQadd01 = vecdQadd01;
		this.vecdQadd02 = vecdQadd02;
		this.vecdQadl01 = vecdQadl01;
		this.vecdQadl02 = vecdQadl02;
		this.vecdQadt01 = vecdQadt01;
		this.vecdQadt02 = vecdQadt02;
		this.vecdQadi01 = vecdQadi01;
		this.vecdQadi02 = vecdQadi02;
		this.oidVecdDet = oidVecdDet;
	}

	// Property accessors

	public VecdDetId getId() {
		return this.id;
	}

	public void setId(VecdDetId id) {
		this.id = id;
	}

	public Double getVecdValueTo() {
		return this.vecdValueTo;
	}

	public void setVecdValueTo(Double vecdValueTo) {
		this.vecdValueTo = vecdValueTo;
	}

	public Double getVecdPercent() {
		return this.vecdPercent;
	}

	public void setVecdPercent(Double vecdPercent) {
		this.vecdPercent = vecdPercent;
	}

	public String getVecdModUserid() {
		return this.vecdModUserid;
	}

	public void setVecdModUserid(String vecdModUserid) {
		this.vecdModUserid = vecdModUserid;
	}

	public Date getVecdModDate() {
		return this.vecdModDate;
	}

	public void setVecdModDate(Date vecdModDate) {
		this.vecdModDate = vecdModDate;
	}

	public String getVecdUser1() {
		return this.vecdUser1;
	}

	public void setVecdUser1(String vecdUser1) {
		this.vecdUser1 = vecdUser1;
	}

	public String getVecdUser2() {
		return this.vecdUser2;
	}

	public void setVecdUser2(String vecdUser2) {
		this.vecdUser2 = vecdUser2;
	}

	public String getVecdUser3() {
		return this.vecdUser3;
	}

	public void setVecdUser3(String vecdUser3) {
		this.vecdUser3 = vecdUser3;
	}

	public String getVecdUser4() {
		return this.vecdUser4;
	}

	public void setVecdUser4(String vecdUser4) {
		this.vecdUser4 = vecdUser4;
	}

	public String getVecdQadc01() {
		return this.vecdQadc01;
	}

	public void setVecdQadc01(String vecdQadc01) {
		this.vecdQadc01 = vecdQadc01;
	}

	public String getVecdQadc02() {
		return this.vecdQadc02;
	}

	public void setVecdQadc02(String vecdQadc02) {
		this.vecdQadc02 = vecdQadc02;
	}

	public String getVecdQadc03() {
		return this.vecdQadc03;
	}

	public void setVecdQadc03(String vecdQadc03) {
		this.vecdQadc03 = vecdQadc03;
	}

	public String getVecdQadc04() {
		return this.vecdQadc04;
	}

	public void setVecdQadc04(String vecdQadc04) {
		this.vecdQadc04 = vecdQadc04;
	}

	public Double getVecdQadd01() {
		return this.vecdQadd01;
	}

	public void setVecdQadd01(Double vecdQadd01) {
		this.vecdQadd01 = vecdQadd01;
	}

	public Double getVecdQadd02() {
		return this.vecdQadd02;
	}

	public void setVecdQadd02(Double vecdQadd02) {
		this.vecdQadd02 = vecdQadd02;
	}

	public Boolean getVecdQadl01() {
		return this.vecdQadl01;
	}

	public void setVecdQadl01(Boolean vecdQadl01) {
		this.vecdQadl01 = vecdQadl01;
	}

	public Boolean getVecdQadl02() {
		return this.vecdQadl02;
	}

	public void setVecdQadl02(Boolean vecdQadl02) {
		this.vecdQadl02 = vecdQadl02;
	}

	public Date getVecdQadt01() {
		return this.vecdQadt01;
	}

	public void setVecdQadt01(Date vecdQadt01) {
		this.vecdQadt01 = vecdQadt01;
	}

	public Date getVecdQadt02() {
		return this.vecdQadt02;
	}

	public void setVecdQadt02(Date vecdQadt02) {
		this.vecdQadt02 = vecdQadt02;
	}

	public Integer getVecdQadi01() {
		return this.vecdQadi01;
	}

	public void setVecdQadi01(Integer vecdQadi01) {
		this.vecdQadi01 = vecdQadi01;
	}

	public Integer getVecdQadi02() {
		return this.vecdQadi02;
	}

	public void setVecdQadi02(Integer vecdQadi02) {
		this.vecdQadi02 = vecdQadi02;
	}

	public Double getOidVecdDet() {
		return this.oidVecdDet;
	}

	public void setOidVecdDet(Double oidVecdDet) {
		this.oidVecdDet = oidVecdDet;
	}

}