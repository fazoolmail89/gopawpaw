package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIbhHist entity provides the base persistence definition of the
 * IbhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIbhHist implements java.io.Serializable {

	// Fields

	private IbhHistId id;
	private Date ibhIssDate;
	private Double ibhQtyReq;
	private Double ibhQtyAll;
	private Double ibhQtyPick;
	private Double ibhQtyIss;
	private Double ibhTotStd;
	private Double ibhQtyChg;
	private Double ibhBoChg;
	private Double ibhPrice;
	private String ibhLoc;
	private String ibhSerial;
	private Integer ibhCmtindx;
	private String ibhUser1;
	private String ibhUser2;
	private String ibhSite;
	private String ibhParent;
	private String ibhQadc01;
	private String ibhCfgType;
	private Double oidIbhHist;

	// Constructors

	/** default constructor */
	public AbstractIbhHist() {
	}

	/** minimal constructor */
	public AbstractIbhHist(IbhHistId id, String ibhParent, Double oidIbhHist) {
		this.id = id;
		this.ibhParent = ibhParent;
		this.oidIbhHist = oidIbhHist;
	}

	/** full constructor */
	public AbstractIbhHist(IbhHistId id, Date ibhIssDate, Double ibhQtyReq,
			Double ibhQtyAll, Double ibhQtyPick, Double ibhQtyIss,
			Double ibhTotStd, Double ibhQtyChg, Double ibhBoChg,
			Double ibhPrice, String ibhLoc, String ibhSerial,
			Integer ibhCmtindx, String ibhUser1, String ibhUser2,
			String ibhSite, String ibhParent, String ibhQadc01,
			String ibhCfgType, Double oidIbhHist) {
		this.id = id;
		this.ibhIssDate = ibhIssDate;
		this.ibhQtyReq = ibhQtyReq;
		this.ibhQtyAll = ibhQtyAll;
		this.ibhQtyPick = ibhQtyPick;
		this.ibhQtyIss = ibhQtyIss;
		this.ibhTotStd = ibhTotStd;
		this.ibhQtyChg = ibhQtyChg;
		this.ibhBoChg = ibhBoChg;
		this.ibhPrice = ibhPrice;
		this.ibhLoc = ibhLoc;
		this.ibhSerial = ibhSerial;
		this.ibhCmtindx = ibhCmtindx;
		this.ibhUser1 = ibhUser1;
		this.ibhUser2 = ibhUser2;
		this.ibhSite = ibhSite;
		this.ibhParent = ibhParent;
		this.ibhQadc01 = ibhQadc01;
		this.ibhCfgType = ibhCfgType;
		this.oidIbhHist = oidIbhHist;
	}

	// Property accessors

	public IbhHistId getId() {
		return this.id;
	}

	public void setId(IbhHistId id) {
		this.id = id;
	}

	public Date getIbhIssDate() {
		return this.ibhIssDate;
	}

	public void setIbhIssDate(Date ibhIssDate) {
		this.ibhIssDate = ibhIssDate;
	}

	public Double getIbhQtyReq() {
		return this.ibhQtyReq;
	}

	public void setIbhQtyReq(Double ibhQtyReq) {
		this.ibhQtyReq = ibhQtyReq;
	}

	public Double getIbhQtyAll() {
		return this.ibhQtyAll;
	}

	public void setIbhQtyAll(Double ibhQtyAll) {
		this.ibhQtyAll = ibhQtyAll;
	}

	public Double getIbhQtyPick() {
		return this.ibhQtyPick;
	}

	public void setIbhQtyPick(Double ibhQtyPick) {
		this.ibhQtyPick = ibhQtyPick;
	}

	public Double getIbhQtyIss() {
		return this.ibhQtyIss;
	}

	public void setIbhQtyIss(Double ibhQtyIss) {
		this.ibhQtyIss = ibhQtyIss;
	}

	public Double getIbhTotStd() {
		return this.ibhTotStd;
	}

	public void setIbhTotStd(Double ibhTotStd) {
		this.ibhTotStd = ibhTotStd;
	}

	public Double getIbhQtyChg() {
		return this.ibhQtyChg;
	}

	public void setIbhQtyChg(Double ibhQtyChg) {
		this.ibhQtyChg = ibhQtyChg;
	}

	public Double getIbhBoChg() {
		return this.ibhBoChg;
	}

	public void setIbhBoChg(Double ibhBoChg) {
		this.ibhBoChg = ibhBoChg;
	}

	public Double getIbhPrice() {
		return this.ibhPrice;
	}

	public void setIbhPrice(Double ibhPrice) {
		this.ibhPrice = ibhPrice;
	}

	public String getIbhLoc() {
		return this.ibhLoc;
	}

	public void setIbhLoc(String ibhLoc) {
		this.ibhLoc = ibhLoc;
	}

	public String getIbhSerial() {
		return this.ibhSerial;
	}

	public void setIbhSerial(String ibhSerial) {
		this.ibhSerial = ibhSerial;
	}

	public Integer getIbhCmtindx() {
		return this.ibhCmtindx;
	}

	public void setIbhCmtindx(Integer ibhCmtindx) {
		this.ibhCmtindx = ibhCmtindx;
	}

	public String getIbhUser1() {
		return this.ibhUser1;
	}

	public void setIbhUser1(String ibhUser1) {
		this.ibhUser1 = ibhUser1;
	}

	public String getIbhUser2() {
		return this.ibhUser2;
	}

	public void setIbhUser2(String ibhUser2) {
		this.ibhUser2 = ibhUser2;
	}

	public String getIbhSite() {
		return this.ibhSite;
	}

	public void setIbhSite(String ibhSite) {
		this.ibhSite = ibhSite;
	}

	public String getIbhParent() {
		return this.ibhParent;
	}

	public void setIbhParent(String ibhParent) {
		this.ibhParent = ibhParent;
	}

	public String getIbhQadc01() {
		return this.ibhQadc01;
	}

	public void setIbhQadc01(String ibhQadc01) {
		this.ibhQadc01 = ibhQadc01;
	}

	public String getIbhCfgType() {
		return this.ibhCfgType;
	}

	public void setIbhCfgType(String ibhCfgType) {
		this.ibhCfgType = ibhCfgType;
	}

	public Double getOidIbhHist() {
		return this.oidIbhHist;
	}

	public void setOidIbhHist(Double oidIbhHist) {
		this.oidIbhHist = oidIbhHist;
	}

}