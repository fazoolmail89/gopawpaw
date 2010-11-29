package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWhlMstr entity provides the base persistence definition of the
 * WhlMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWhlMstr implements java.io.Serializable {

	// Fields

	private WhlMstrId id;
	private String whlSrcDestId;
	private Date whlDate;
	private Boolean whlAct;
	private Boolean whlUmExp;
	private Boolean whlPoExp;
	private Boolean whlSoExp;
	private Boolean whlWoExp;
	private Boolean whlDoExp;
	private Boolean whlDoReqExp;
	private Boolean whlCustExp;
	private Boolean whlSupExp;
	private Boolean whlCustItemNbrExp;
	private Boolean whlRpsExp;
	private Boolean whlSupItemNbrExp;
	private Boolean whlDoReqCmtExp;
	private Boolean whlDoCmtExp;
	private Boolean whlPoCmtExp;
	private Boolean whlWoCmtExp;
	private Boolean whlSoCmtExp;
	private String whlUser1;
	private String whlUser2;
	private String whlQadc01;
	private String whlQadc02;
	private Double whlQadd03;
	private Date whlQadt04;
	private Boolean whlQadl05;
	private String whlChr01;
	private Double whlDec01;
	private Date whlDte01;
	private Boolean whlLog01;
	private Boolean whlPtExp;
	private Boolean whlWoRcptExp;
	private Double oidWhlMstr;

	// Constructors

	/** default constructor */
	public AbstractWhlMstr() {
	}

	/** minimal constructor */
	public AbstractWhlMstr(WhlMstrId id, Date whlDate, Boolean whlDoExp,
			Boolean whlPtExp, Double oidWhlMstr) {
		this.id = id;
		this.whlDate = whlDate;
		this.whlDoExp = whlDoExp;
		this.whlPtExp = whlPtExp;
		this.oidWhlMstr = oidWhlMstr;
	}

	/** full constructor */
	public AbstractWhlMstr(WhlMstrId id, String whlSrcDestId, Date whlDate,
			Boolean whlAct, Boolean whlUmExp, Boolean whlPoExp,
			Boolean whlSoExp, Boolean whlWoExp, Boolean whlDoExp,
			Boolean whlDoReqExp, Boolean whlCustExp, Boolean whlSupExp,
			Boolean whlCustItemNbrExp, Boolean whlRpsExp,
			Boolean whlSupItemNbrExp, Boolean whlDoReqCmtExp,
			Boolean whlDoCmtExp, Boolean whlPoCmtExp, Boolean whlWoCmtExp,
			Boolean whlSoCmtExp, String whlUser1, String whlUser2,
			String whlQadc01, String whlQadc02, Double whlQadd03,
			Date whlQadt04, Boolean whlQadl05, String whlChr01,
			Double whlDec01, Date whlDte01, Boolean whlLog01, Boolean whlPtExp,
			Boolean whlWoRcptExp, Double oidWhlMstr) {
		this.id = id;
		this.whlSrcDestId = whlSrcDestId;
		this.whlDate = whlDate;
		this.whlAct = whlAct;
		this.whlUmExp = whlUmExp;
		this.whlPoExp = whlPoExp;
		this.whlSoExp = whlSoExp;
		this.whlWoExp = whlWoExp;
		this.whlDoExp = whlDoExp;
		this.whlDoReqExp = whlDoReqExp;
		this.whlCustExp = whlCustExp;
		this.whlSupExp = whlSupExp;
		this.whlCustItemNbrExp = whlCustItemNbrExp;
		this.whlRpsExp = whlRpsExp;
		this.whlSupItemNbrExp = whlSupItemNbrExp;
		this.whlDoReqCmtExp = whlDoReqCmtExp;
		this.whlDoCmtExp = whlDoCmtExp;
		this.whlPoCmtExp = whlPoCmtExp;
		this.whlWoCmtExp = whlWoCmtExp;
		this.whlSoCmtExp = whlSoCmtExp;
		this.whlUser1 = whlUser1;
		this.whlUser2 = whlUser2;
		this.whlQadc01 = whlQadc01;
		this.whlQadc02 = whlQadc02;
		this.whlQadd03 = whlQadd03;
		this.whlQadt04 = whlQadt04;
		this.whlQadl05 = whlQadl05;
		this.whlChr01 = whlChr01;
		this.whlDec01 = whlDec01;
		this.whlDte01 = whlDte01;
		this.whlLog01 = whlLog01;
		this.whlPtExp = whlPtExp;
		this.whlWoRcptExp = whlWoRcptExp;
		this.oidWhlMstr = oidWhlMstr;
	}

	// Property accessors

	public WhlMstrId getId() {
		return this.id;
	}

	public void setId(WhlMstrId id) {
		this.id = id;
	}

	public String getWhlSrcDestId() {
		return this.whlSrcDestId;
	}

	public void setWhlSrcDestId(String whlSrcDestId) {
		this.whlSrcDestId = whlSrcDestId;
	}

	public Date getWhlDate() {
		return this.whlDate;
	}

	public void setWhlDate(Date whlDate) {
		this.whlDate = whlDate;
	}

	public Boolean getWhlAct() {
		return this.whlAct;
	}

	public void setWhlAct(Boolean whlAct) {
		this.whlAct = whlAct;
	}

	public Boolean getWhlUmExp() {
		return this.whlUmExp;
	}

	public void setWhlUmExp(Boolean whlUmExp) {
		this.whlUmExp = whlUmExp;
	}

	public Boolean getWhlPoExp() {
		return this.whlPoExp;
	}

	public void setWhlPoExp(Boolean whlPoExp) {
		this.whlPoExp = whlPoExp;
	}

	public Boolean getWhlSoExp() {
		return this.whlSoExp;
	}

	public void setWhlSoExp(Boolean whlSoExp) {
		this.whlSoExp = whlSoExp;
	}

	public Boolean getWhlWoExp() {
		return this.whlWoExp;
	}

	public void setWhlWoExp(Boolean whlWoExp) {
		this.whlWoExp = whlWoExp;
	}

	public Boolean getWhlDoExp() {
		return this.whlDoExp;
	}

	public void setWhlDoExp(Boolean whlDoExp) {
		this.whlDoExp = whlDoExp;
	}

	public Boolean getWhlDoReqExp() {
		return this.whlDoReqExp;
	}

	public void setWhlDoReqExp(Boolean whlDoReqExp) {
		this.whlDoReqExp = whlDoReqExp;
	}

	public Boolean getWhlCustExp() {
		return this.whlCustExp;
	}

	public void setWhlCustExp(Boolean whlCustExp) {
		this.whlCustExp = whlCustExp;
	}

	public Boolean getWhlSupExp() {
		return this.whlSupExp;
	}

	public void setWhlSupExp(Boolean whlSupExp) {
		this.whlSupExp = whlSupExp;
	}

	public Boolean getWhlCustItemNbrExp() {
		return this.whlCustItemNbrExp;
	}

	public void setWhlCustItemNbrExp(Boolean whlCustItemNbrExp) {
		this.whlCustItemNbrExp = whlCustItemNbrExp;
	}

	public Boolean getWhlRpsExp() {
		return this.whlRpsExp;
	}

	public void setWhlRpsExp(Boolean whlRpsExp) {
		this.whlRpsExp = whlRpsExp;
	}

	public Boolean getWhlSupItemNbrExp() {
		return this.whlSupItemNbrExp;
	}

	public void setWhlSupItemNbrExp(Boolean whlSupItemNbrExp) {
		this.whlSupItemNbrExp = whlSupItemNbrExp;
	}

	public Boolean getWhlDoReqCmtExp() {
		return this.whlDoReqCmtExp;
	}

	public void setWhlDoReqCmtExp(Boolean whlDoReqCmtExp) {
		this.whlDoReqCmtExp = whlDoReqCmtExp;
	}

	public Boolean getWhlDoCmtExp() {
		return this.whlDoCmtExp;
	}

	public void setWhlDoCmtExp(Boolean whlDoCmtExp) {
		this.whlDoCmtExp = whlDoCmtExp;
	}

	public Boolean getWhlPoCmtExp() {
		return this.whlPoCmtExp;
	}

	public void setWhlPoCmtExp(Boolean whlPoCmtExp) {
		this.whlPoCmtExp = whlPoCmtExp;
	}

	public Boolean getWhlWoCmtExp() {
		return this.whlWoCmtExp;
	}

	public void setWhlWoCmtExp(Boolean whlWoCmtExp) {
		this.whlWoCmtExp = whlWoCmtExp;
	}

	public Boolean getWhlSoCmtExp() {
		return this.whlSoCmtExp;
	}

	public void setWhlSoCmtExp(Boolean whlSoCmtExp) {
		this.whlSoCmtExp = whlSoCmtExp;
	}

	public String getWhlUser1() {
		return this.whlUser1;
	}

	public void setWhlUser1(String whlUser1) {
		this.whlUser1 = whlUser1;
	}

	public String getWhlUser2() {
		return this.whlUser2;
	}

	public void setWhlUser2(String whlUser2) {
		this.whlUser2 = whlUser2;
	}

	public String getWhlQadc01() {
		return this.whlQadc01;
	}

	public void setWhlQadc01(String whlQadc01) {
		this.whlQadc01 = whlQadc01;
	}

	public String getWhlQadc02() {
		return this.whlQadc02;
	}

	public void setWhlQadc02(String whlQadc02) {
		this.whlQadc02 = whlQadc02;
	}

	public Double getWhlQadd03() {
		return this.whlQadd03;
	}

	public void setWhlQadd03(Double whlQadd03) {
		this.whlQadd03 = whlQadd03;
	}

	public Date getWhlQadt04() {
		return this.whlQadt04;
	}

	public void setWhlQadt04(Date whlQadt04) {
		this.whlQadt04 = whlQadt04;
	}

	public Boolean getWhlQadl05() {
		return this.whlQadl05;
	}

	public void setWhlQadl05(Boolean whlQadl05) {
		this.whlQadl05 = whlQadl05;
	}

	public String getWhlChr01() {
		return this.whlChr01;
	}

	public void setWhlChr01(String whlChr01) {
		this.whlChr01 = whlChr01;
	}

	public Double getWhlDec01() {
		return this.whlDec01;
	}

	public void setWhlDec01(Double whlDec01) {
		this.whlDec01 = whlDec01;
	}

	public Date getWhlDte01() {
		return this.whlDte01;
	}

	public void setWhlDte01(Date whlDte01) {
		this.whlDte01 = whlDte01;
	}

	public Boolean getWhlLog01() {
		return this.whlLog01;
	}

	public void setWhlLog01(Boolean whlLog01) {
		this.whlLog01 = whlLog01;
	}

	public Boolean getWhlPtExp() {
		return this.whlPtExp;
	}

	public void setWhlPtExp(Boolean whlPtExp) {
		this.whlPtExp = whlPtExp;
	}

	public Boolean getWhlWoRcptExp() {
		return this.whlWoRcptExp;
	}

	public void setWhlWoRcptExp(Boolean whlWoRcptExp) {
		this.whlWoRcptExp = whlWoRcptExp;
	}

	public Double getOidWhlMstr() {
		return this.oidWhlMstr;
	}

	public void setOidWhlMstr(Double oidWhlMstr) {
		this.oidWhlMstr = oidWhlMstr;
	}

}