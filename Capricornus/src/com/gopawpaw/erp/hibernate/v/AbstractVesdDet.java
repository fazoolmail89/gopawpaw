package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVesdDet entity provides the base persistence definition of the
 * VesdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVesdDet implements java.io.Serializable {

	// Fields

	private VesdDetId id;
	private String vesdEvent;
	private String vesdWeightCode;
	private Double vesdEventQty;
	private Date vesdTranDate;
	private String vesdModUserid;
	private Date vesdModDate;
	private String vesdUser1;
	private String vesdUser2;
	private String vesdUser3;
	private String vesdUser4;
	private String vesdQadc01;
	private String vesdQadc02;
	private String vesdQadc03;
	private String vesdQadc04;
	private Double vesdQadd01;
	private Double vesdQadd02;
	private Boolean vesdQadl01;
	private Boolean vesdQadl02;
	private Date vesdQadt01;
	private Date vesdQadt02;
	private Integer vesdQadi01;
	private Integer vesdQadi02;
	private Double oidVesdDet;

	// Constructors

	/** default constructor */
	public AbstractVesdDet() {
	}

	/** minimal constructor */
	public AbstractVesdDet(VesdDetId id, Double oidVesdDet) {
		this.id = id;
		this.oidVesdDet = oidVesdDet;
	}

	/** full constructor */
	public AbstractVesdDet(VesdDetId id, String vesdEvent,
			String vesdWeightCode, Double vesdEventQty, Date vesdTranDate,
			String vesdModUserid, Date vesdModDate, String vesdUser1,
			String vesdUser2, String vesdUser3, String vesdUser4,
			String vesdQadc01, String vesdQadc02, String vesdQadc03,
			String vesdQadc04, Double vesdQadd01, Double vesdQadd02,
			Boolean vesdQadl01, Boolean vesdQadl02, Date vesdQadt01,
			Date vesdQadt02, Integer vesdQadi01, Integer vesdQadi02,
			Double oidVesdDet) {
		this.id = id;
		this.vesdEvent = vesdEvent;
		this.vesdWeightCode = vesdWeightCode;
		this.vesdEventQty = vesdEventQty;
		this.vesdTranDate = vesdTranDate;
		this.vesdModUserid = vesdModUserid;
		this.vesdModDate = vesdModDate;
		this.vesdUser1 = vesdUser1;
		this.vesdUser2 = vesdUser2;
		this.vesdUser3 = vesdUser3;
		this.vesdUser4 = vesdUser4;
		this.vesdQadc01 = vesdQadc01;
		this.vesdQadc02 = vesdQadc02;
		this.vesdQadc03 = vesdQadc03;
		this.vesdQadc04 = vesdQadc04;
		this.vesdQadd01 = vesdQadd01;
		this.vesdQadd02 = vesdQadd02;
		this.vesdQadl01 = vesdQadl01;
		this.vesdQadl02 = vesdQadl02;
		this.vesdQadt01 = vesdQadt01;
		this.vesdQadt02 = vesdQadt02;
		this.vesdQadi01 = vesdQadi01;
		this.vesdQadi02 = vesdQadi02;
		this.oidVesdDet = oidVesdDet;
	}

	// Property accessors

	public VesdDetId getId() {
		return this.id;
	}

	public void setId(VesdDetId id) {
		this.id = id;
	}

	public String getVesdEvent() {
		return this.vesdEvent;
	}

	public void setVesdEvent(String vesdEvent) {
		this.vesdEvent = vesdEvent;
	}

	public String getVesdWeightCode() {
		return this.vesdWeightCode;
	}

	public void setVesdWeightCode(String vesdWeightCode) {
		this.vesdWeightCode = vesdWeightCode;
	}

	public Double getVesdEventQty() {
		return this.vesdEventQty;
	}

	public void setVesdEventQty(Double vesdEventQty) {
		this.vesdEventQty = vesdEventQty;
	}

	public Date getVesdTranDate() {
		return this.vesdTranDate;
	}

	public void setVesdTranDate(Date vesdTranDate) {
		this.vesdTranDate = vesdTranDate;
	}

	public String getVesdModUserid() {
		return this.vesdModUserid;
	}

	public void setVesdModUserid(String vesdModUserid) {
		this.vesdModUserid = vesdModUserid;
	}

	public Date getVesdModDate() {
		return this.vesdModDate;
	}

	public void setVesdModDate(Date vesdModDate) {
		this.vesdModDate = vesdModDate;
	}

	public String getVesdUser1() {
		return this.vesdUser1;
	}

	public void setVesdUser1(String vesdUser1) {
		this.vesdUser1 = vesdUser1;
	}

	public String getVesdUser2() {
		return this.vesdUser2;
	}

	public void setVesdUser2(String vesdUser2) {
		this.vesdUser2 = vesdUser2;
	}

	public String getVesdUser3() {
		return this.vesdUser3;
	}

	public void setVesdUser3(String vesdUser3) {
		this.vesdUser3 = vesdUser3;
	}

	public String getVesdUser4() {
		return this.vesdUser4;
	}

	public void setVesdUser4(String vesdUser4) {
		this.vesdUser4 = vesdUser4;
	}

	public String getVesdQadc01() {
		return this.vesdQadc01;
	}

	public void setVesdQadc01(String vesdQadc01) {
		this.vesdQadc01 = vesdQadc01;
	}

	public String getVesdQadc02() {
		return this.vesdQadc02;
	}

	public void setVesdQadc02(String vesdQadc02) {
		this.vesdQadc02 = vesdQadc02;
	}

	public String getVesdQadc03() {
		return this.vesdQadc03;
	}

	public void setVesdQadc03(String vesdQadc03) {
		this.vesdQadc03 = vesdQadc03;
	}

	public String getVesdQadc04() {
		return this.vesdQadc04;
	}

	public void setVesdQadc04(String vesdQadc04) {
		this.vesdQadc04 = vesdQadc04;
	}

	public Double getVesdQadd01() {
		return this.vesdQadd01;
	}

	public void setVesdQadd01(Double vesdQadd01) {
		this.vesdQadd01 = vesdQadd01;
	}

	public Double getVesdQadd02() {
		return this.vesdQadd02;
	}

	public void setVesdQadd02(Double vesdQadd02) {
		this.vesdQadd02 = vesdQadd02;
	}

	public Boolean getVesdQadl01() {
		return this.vesdQadl01;
	}

	public void setVesdQadl01(Boolean vesdQadl01) {
		this.vesdQadl01 = vesdQadl01;
	}

	public Boolean getVesdQadl02() {
		return this.vesdQadl02;
	}

	public void setVesdQadl02(Boolean vesdQadl02) {
		this.vesdQadl02 = vesdQadl02;
	}

	public Date getVesdQadt01() {
		return this.vesdQadt01;
	}

	public void setVesdQadt01(Date vesdQadt01) {
		this.vesdQadt01 = vesdQadt01;
	}

	public Date getVesdQadt02() {
		return this.vesdQadt02;
	}

	public void setVesdQadt02(Date vesdQadt02) {
		this.vesdQadt02 = vesdQadt02;
	}

	public Integer getVesdQadi01() {
		return this.vesdQadi01;
	}

	public void setVesdQadi01(Integer vesdQadi01) {
		this.vesdQadi01 = vesdQadi01;
	}

	public Integer getVesdQadi02() {
		return this.vesdQadi02;
	}

	public void setVesdQadi02(Integer vesdQadi02) {
		this.vesdQadi02 = vesdQadi02;
	}

	public Double getOidVesdDet() {
		return this.oidVesdDet;
	}

	public void setOidVesdDet(Double oidVesdDet) {
		this.oidVesdDet = oidVesdDet;
	}

}