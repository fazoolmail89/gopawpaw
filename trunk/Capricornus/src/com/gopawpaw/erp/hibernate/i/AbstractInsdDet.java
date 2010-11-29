package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractInsdDet entity provides the base persistence definition of the
 * InsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInsdDet implements java.io.Serializable {

	// Fields

	private InsdDetId id;
	private Date insdSchedDate;
	private Double insdQtyInv;
	private Double insdPrice;
	private Double insdListPr;
	private Date insdModDate;
	private String insdModUserid;
	private String insdUser1;
	private String insdUser2;
	private String insdQadc01;
	private Double insdQadd01;
	private Integer insdQadi01;
	private Boolean insdQadl01;
	private Date insdQadt01;
	private Double oidInsdDet;

	// Constructors

	/** default constructor */
	public AbstractInsdDet() {
	}

	/** minimal constructor */
	public AbstractInsdDet(InsdDetId id, Double insdQtyInv, Double insdPrice,
			Double insdListPr, Date insdModDate, String insdModUserid,
			Double oidInsdDet) {
		this.id = id;
		this.insdQtyInv = insdQtyInv;
		this.insdPrice = insdPrice;
		this.insdListPr = insdListPr;
		this.insdModDate = insdModDate;
		this.insdModUserid = insdModUserid;
		this.oidInsdDet = oidInsdDet;
	}

	/** full constructor */
	public AbstractInsdDet(InsdDetId id, Date insdSchedDate, Double insdQtyInv,
			Double insdPrice, Double insdListPr, Date insdModDate,
			String insdModUserid, String insdUser1, String insdUser2,
			String insdQadc01, Double insdQadd01, Integer insdQadi01,
			Boolean insdQadl01, Date insdQadt01, Double oidInsdDet) {
		this.id = id;
		this.insdSchedDate = insdSchedDate;
		this.insdQtyInv = insdQtyInv;
		this.insdPrice = insdPrice;
		this.insdListPr = insdListPr;
		this.insdModDate = insdModDate;
		this.insdModUserid = insdModUserid;
		this.insdUser1 = insdUser1;
		this.insdUser2 = insdUser2;
		this.insdQadc01 = insdQadc01;
		this.insdQadd01 = insdQadd01;
		this.insdQadi01 = insdQadi01;
		this.insdQadl01 = insdQadl01;
		this.insdQadt01 = insdQadt01;
		this.oidInsdDet = oidInsdDet;
	}

	// Property accessors

	public InsdDetId getId() {
		return this.id;
	}

	public void setId(InsdDetId id) {
		this.id = id;
	}

	public Date getInsdSchedDate() {
		return this.insdSchedDate;
	}

	public void setInsdSchedDate(Date insdSchedDate) {
		this.insdSchedDate = insdSchedDate;
	}

	public Double getInsdQtyInv() {
		return this.insdQtyInv;
	}

	public void setInsdQtyInv(Double insdQtyInv) {
		this.insdQtyInv = insdQtyInv;
	}

	public Double getInsdPrice() {
		return this.insdPrice;
	}

	public void setInsdPrice(Double insdPrice) {
		this.insdPrice = insdPrice;
	}

	public Double getInsdListPr() {
		return this.insdListPr;
	}

	public void setInsdListPr(Double insdListPr) {
		this.insdListPr = insdListPr;
	}

	public Date getInsdModDate() {
		return this.insdModDate;
	}

	public void setInsdModDate(Date insdModDate) {
		this.insdModDate = insdModDate;
	}

	public String getInsdModUserid() {
		return this.insdModUserid;
	}

	public void setInsdModUserid(String insdModUserid) {
		this.insdModUserid = insdModUserid;
	}

	public String getInsdUser1() {
		return this.insdUser1;
	}

	public void setInsdUser1(String insdUser1) {
		this.insdUser1 = insdUser1;
	}

	public String getInsdUser2() {
		return this.insdUser2;
	}

	public void setInsdUser2(String insdUser2) {
		this.insdUser2 = insdUser2;
	}

	public String getInsdQadc01() {
		return this.insdQadc01;
	}

	public void setInsdQadc01(String insdQadc01) {
		this.insdQadc01 = insdQadc01;
	}

	public Double getInsdQadd01() {
		return this.insdQadd01;
	}

	public void setInsdQadd01(Double insdQadd01) {
		this.insdQadd01 = insdQadd01;
	}

	public Integer getInsdQadi01() {
		return this.insdQadi01;
	}

	public void setInsdQadi01(Integer insdQadi01) {
		this.insdQadi01 = insdQadi01;
	}

	public Boolean getInsdQadl01() {
		return this.insdQadl01;
	}

	public void setInsdQadl01(Boolean insdQadl01) {
		this.insdQadl01 = insdQadl01;
	}

	public Date getInsdQadt01() {
		return this.insdQadt01;
	}

	public void setInsdQadt01(Date insdQadt01) {
		this.insdQadt01 = insdQadt01;
	}

	public Double getOidInsdDet() {
		return this.oidInsdDet;
	}

	public void setOidInsdDet(Double oidInsdDet) {
		this.oidInsdDet = oidInsdDet;
	}

}