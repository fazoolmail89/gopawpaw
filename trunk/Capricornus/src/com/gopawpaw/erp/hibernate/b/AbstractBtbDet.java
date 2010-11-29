package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBtbDet entity provides the base persistence definition of the BtbDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBtbDet implements java.io.Serializable {

	// Fields

	private BtbDetId id;
	private String btbCmAddr;
	private String btbCmPart;
	private String btbCmDesc;
	private Double btbSoPrice;
	private String btbPrSo;
	private Integer btbPrSodLine;
	private String btbUser1;
	private String btbUser2;
	private String btbModUserid;
	private Date btbModDate;
	private String btbQadc01;
	private Double oidBtbDet;

	// Constructors

	/** default constructor */
	public AbstractBtbDet() {
	}

	/** full constructor */
	public AbstractBtbDet(BtbDetId id, String btbCmAddr, String btbCmPart,
			String btbCmDesc, Double btbSoPrice, String btbPrSo,
			Integer btbPrSodLine, String btbUser1, String btbUser2,
			String btbModUserid, Date btbModDate, String btbQadc01,
			Double oidBtbDet) {
		this.id = id;
		this.btbCmAddr = btbCmAddr;
		this.btbCmPart = btbCmPart;
		this.btbCmDesc = btbCmDesc;
		this.btbSoPrice = btbSoPrice;
		this.btbPrSo = btbPrSo;
		this.btbPrSodLine = btbPrSodLine;
		this.btbUser1 = btbUser1;
		this.btbUser2 = btbUser2;
		this.btbModUserid = btbModUserid;
		this.btbModDate = btbModDate;
		this.btbQadc01 = btbQadc01;
		this.oidBtbDet = oidBtbDet;
	}

	// Property accessors

	public BtbDetId getId() {
		return this.id;
	}

	public void setId(BtbDetId id) {
		this.id = id;
	}

	public String getBtbCmAddr() {
		return this.btbCmAddr;
	}

	public void setBtbCmAddr(String btbCmAddr) {
		this.btbCmAddr = btbCmAddr;
	}

	public String getBtbCmPart() {
		return this.btbCmPart;
	}

	public void setBtbCmPart(String btbCmPart) {
		this.btbCmPart = btbCmPart;
	}

	public String getBtbCmDesc() {
		return this.btbCmDesc;
	}

	public void setBtbCmDesc(String btbCmDesc) {
		this.btbCmDesc = btbCmDesc;
	}

	public Double getBtbSoPrice() {
		return this.btbSoPrice;
	}

	public void setBtbSoPrice(Double btbSoPrice) {
		this.btbSoPrice = btbSoPrice;
	}

	public String getBtbPrSo() {
		return this.btbPrSo;
	}

	public void setBtbPrSo(String btbPrSo) {
		this.btbPrSo = btbPrSo;
	}

	public Integer getBtbPrSodLine() {
		return this.btbPrSodLine;
	}

	public void setBtbPrSodLine(Integer btbPrSodLine) {
		this.btbPrSodLine = btbPrSodLine;
	}

	public String getBtbUser1() {
		return this.btbUser1;
	}

	public void setBtbUser1(String btbUser1) {
		this.btbUser1 = btbUser1;
	}

	public String getBtbUser2() {
		return this.btbUser2;
	}

	public void setBtbUser2(String btbUser2) {
		this.btbUser2 = btbUser2;
	}

	public String getBtbModUserid() {
		return this.btbModUserid;
	}

	public void setBtbModUserid(String btbModUserid) {
		this.btbModUserid = btbModUserid;
	}

	public Date getBtbModDate() {
		return this.btbModDate;
	}

	public void setBtbModDate(Date btbModDate) {
		this.btbModDate = btbModDate;
	}

	public String getBtbQadc01() {
		return this.btbQadc01;
	}

	public void setBtbQadc01(String btbQadc01) {
		this.btbQadc01 = btbQadc01;
	}

	public Double getOidBtbDet() {
		return this.oidBtbDet;
	}

	public void setOidBtbDet(Double oidBtbDet) {
		this.oidBtbDet = oidBtbDet;
	}

}