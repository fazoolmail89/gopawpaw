package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbssDet entity provides the base persistence definition of the
 * AbssDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbssDet implements java.io.Serializable {

	// Fields

	private AbssDetId id;
	private Double abssQty;
	private String abssShipId;
	private Boolean abssConfirmed;
	private String abssStatus;
	private String abssOrder;
	private Integer abssLine;
	private String abssInvoice;
	private String abssModUserid;
	private Date abssModDate;
	private String abssModPgm;
	private String abssUser1;
	private String abssUser2;
	private String abssQadc01;
	private String abssQadc02;
	private Double abssQadd01;
	private Double abssQadd02;
	private Integer abssQadi01;
	private Integer abssQadi02;
	private Boolean abssQadl01;
	private Boolean abssQadl02;
	private Date abssQadt01;
	private Date abssQadt02;
	private Double oidAbssDet;

	// Constructors

	/** default constructor */
	public AbstractAbssDet() {
	}

	/** minimal constructor */
	public AbstractAbssDet(AbssDetId id, Double oidAbssDet) {
		this.id = id;
		this.oidAbssDet = oidAbssDet;
	}

	/** full constructor */
	public AbstractAbssDet(AbssDetId id, Double abssQty, String abssShipId,
			Boolean abssConfirmed, String abssStatus, String abssOrder,
			Integer abssLine, String abssInvoice, String abssModUserid,
			Date abssModDate, String abssModPgm, String abssUser1,
			String abssUser2, String abssQadc01, String abssQadc02,
			Double abssQadd01, Double abssQadd02, Integer abssQadi01,
			Integer abssQadi02, Boolean abssQadl01, Boolean abssQadl02,
			Date abssQadt01, Date abssQadt02, Double oidAbssDet) {
		this.id = id;
		this.abssQty = abssQty;
		this.abssShipId = abssShipId;
		this.abssConfirmed = abssConfirmed;
		this.abssStatus = abssStatus;
		this.abssOrder = abssOrder;
		this.abssLine = abssLine;
		this.abssInvoice = abssInvoice;
		this.abssModUserid = abssModUserid;
		this.abssModDate = abssModDate;
		this.abssModPgm = abssModPgm;
		this.abssUser1 = abssUser1;
		this.abssUser2 = abssUser2;
		this.abssQadc01 = abssQadc01;
		this.abssQadc02 = abssQadc02;
		this.abssQadd01 = abssQadd01;
		this.abssQadd02 = abssQadd02;
		this.abssQadi01 = abssQadi01;
		this.abssQadi02 = abssQadi02;
		this.abssQadl01 = abssQadl01;
		this.abssQadl02 = abssQadl02;
		this.abssQadt01 = abssQadt01;
		this.abssQadt02 = abssQadt02;
		this.oidAbssDet = oidAbssDet;
	}

	// Property accessors

	public AbssDetId getId() {
		return this.id;
	}

	public void setId(AbssDetId id) {
		this.id = id;
	}

	public Double getAbssQty() {
		return this.abssQty;
	}

	public void setAbssQty(Double abssQty) {
		this.abssQty = abssQty;
	}

	public String getAbssShipId() {
		return this.abssShipId;
	}

	public void setAbssShipId(String abssShipId) {
		this.abssShipId = abssShipId;
	}

	public Boolean getAbssConfirmed() {
		return this.abssConfirmed;
	}

	public void setAbssConfirmed(Boolean abssConfirmed) {
		this.abssConfirmed = abssConfirmed;
	}

	public String getAbssStatus() {
		return this.abssStatus;
	}

	public void setAbssStatus(String abssStatus) {
		this.abssStatus = abssStatus;
	}

	public String getAbssOrder() {
		return this.abssOrder;
	}

	public void setAbssOrder(String abssOrder) {
		this.abssOrder = abssOrder;
	}

	public Integer getAbssLine() {
		return this.abssLine;
	}

	public void setAbssLine(Integer abssLine) {
		this.abssLine = abssLine;
	}

	public String getAbssInvoice() {
		return this.abssInvoice;
	}

	public void setAbssInvoice(String abssInvoice) {
		this.abssInvoice = abssInvoice;
	}

	public String getAbssModUserid() {
		return this.abssModUserid;
	}

	public void setAbssModUserid(String abssModUserid) {
		this.abssModUserid = abssModUserid;
	}

	public Date getAbssModDate() {
		return this.abssModDate;
	}

	public void setAbssModDate(Date abssModDate) {
		this.abssModDate = abssModDate;
	}

	public String getAbssModPgm() {
		return this.abssModPgm;
	}

	public void setAbssModPgm(String abssModPgm) {
		this.abssModPgm = abssModPgm;
	}

	public String getAbssUser1() {
		return this.abssUser1;
	}

	public void setAbssUser1(String abssUser1) {
		this.abssUser1 = abssUser1;
	}

	public String getAbssUser2() {
		return this.abssUser2;
	}

	public void setAbssUser2(String abssUser2) {
		this.abssUser2 = abssUser2;
	}

	public String getAbssQadc01() {
		return this.abssQadc01;
	}

	public void setAbssQadc01(String abssQadc01) {
		this.abssQadc01 = abssQadc01;
	}

	public String getAbssQadc02() {
		return this.abssQadc02;
	}

	public void setAbssQadc02(String abssQadc02) {
		this.abssQadc02 = abssQadc02;
	}

	public Double getAbssQadd01() {
		return this.abssQadd01;
	}

	public void setAbssQadd01(Double abssQadd01) {
		this.abssQadd01 = abssQadd01;
	}

	public Double getAbssQadd02() {
		return this.abssQadd02;
	}

	public void setAbssQadd02(Double abssQadd02) {
		this.abssQadd02 = abssQadd02;
	}

	public Integer getAbssQadi01() {
		return this.abssQadi01;
	}

	public void setAbssQadi01(Integer abssQadi01) {
		this.abssQadi01 = abssQadi01;
	}

	public Integer getAbssQadi02() {
		return this.abssQadi02;
	}

	public void setAbssQadi02(Integer abssQadi02) {
		this.abssQadi02 = abssQadi02;
	}

	public Boolean getAbssQadl01() {
		return this.abssQadl01;
	}

	public void setAbssQadl01(Boolean abssQadl01) {
		this.abssQadl01 = abssQadl01;
	}

	public Boolean getAbssQadl02() {
		return this.abssQadl02;
	}

	public void setAbssQadl02(Boolean abssQadl02) {
		this.abssQadl02 = abssQadl02;
	}

	public Date getAbssQadt01() {
		return this.abssQadt01;
	}

	public void setAbssQadt01(Date abssQadt01) {
		this.abssQadt01 = abssQadt01;
	}

	public Date getAbssQadt02() {
		return this.abssQadt02;
	}

	public void setAbssQadt02(Date abssQadt02) {
		this.abssQadt02 = abssQadt02;
	}

	public Double getOidAbssDet() {
		return this.oidAbssDet;
	}

	public void setOidAbssDet(Double oidAbssDet) {
		this.oidAbssDet = oidAbssDet;
	}

}