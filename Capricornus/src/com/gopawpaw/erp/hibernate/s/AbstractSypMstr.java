package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSypMstr entity provides the base persistence definition of the
 * SypMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSypMstr implements java.io.Serializable {

	// Fields

	private String sypProflId;
	private String sypProflDesc;
	private String sypDbname;
	private String sypTblname;
	private String sypPublProc;
	private Boolean sypExpDump;
	private Boolean sypExpAdd;
	private Boolean sypAddAsChg;
	private Boolean sypExpDel;
	private Boolean sypDelAsChg;
	private Boolean sypExpChg;
	private String sypFltCrit;
	private String sypModUserid;
	private Date sypModDate;
	private String sypUser1;
	private String sypUser2;
	private String sypChr01;
	private String sypChr02;
	private Double sypDec01;
	private Double sypDec02;
	private Integer sypInt01;
	private Integer sypInt02;
	private Boolean sypLog01;
	private Boolean sypLog02;
	private Date sypDte01;
	private Date sypDte02;
	private String sypQadc01;
	private String sypQadc02;
	private String sypQadc03;
	private String sypQadc04;
	private Double sypQadd01;
	private Double sypQadd02;
	private Integer sypQadi01;
	private Integer sypQadi02;
	private Boolean sypQadl01;
	private Boolean sypQadl02;
	private Date sypQadt01;
	private Date sypQadt02;
	private Boolean sypExpRowidOnly;
	private Double oidSypMstr;

	// Constructors

	/** default constructor */
	public AbstractSypMstr() {
	}

	/** minimal constructor */
	public AbstractSypMstr(Double oidSypMstr) {
		this.oidSypMstr = oidSypMstr;
	}

	/** full constructor */
	public AbstractSypMstr(String sypProflDesc, String sypDbname,
			String sypTblname, String sypPublProc, Boolean sypExpDump,
			Boolean sypExpAdd, Boolean sypAddAsChg, Boolean sypExpDel,
			Boolean sypDelAsChg, Boolean sypExpChg, String sypFltCrit,
			String sypModUserid, Date sypModDate, String sypUser1,
			String sypUser2, String sypChr01, String sypChr02, Double sypDec01,
			Double sypDec02, Integer sypInt01, Integer sypInt02,
			Boolean sypLog01, Boolean sypLog02, Date sypDte01, Date sypDte02,
			String sypQadc01, String sypQadc02, String sypQadc03,
			String sypQadc04, Double sypQadd01, Double sypQadd02,
			Integer sypQadi01, Integer sypQadi02, Boolean sypQadl01,
			Boolean sypQadl02, Date sypQadt01, Date sypQadt02,
			Boolean sypExpRowidOnly, Double oidSypMstr) {
		this.sypProflDesc = sypProflDesc;
		this.sypDbname = sypDbname;
		this.sypTblname = sypTblname;
		this.sypPublProc = sypPublProc;
		this.sypExpDump = sypExpDump;
		this.sypExpAdd = sypExpAdd;
		this.sypAddAsChg = sypAddAsChg;
		this.sypExpDel = sypExpDel;
		this.sypDelAsChg = sypDelAsChg;
		this.sypExpChg = sypExpChg;
		this.sypFltCrit = sypFltCrit;
		this.sypModUserid = sypModUserid;
		this.sypModDate = sypModDate;
		this.sypUser1 = sypUser1;
		this.sypUser2 = sypUser2;
		this.sypChr01 = sypChr01;
		this.sypChr02 = sypChr02;
		this.sypDec01 = sypDec01;
		this.sypDec02 = sypDec02;
		this.sypInt01 = sypInt01;
		this.sypInt02 = sypInt02;
		this.sypLog01 = sypLog01;
		this.sypLog02 = sypLog02;
		this.sypDte01 = sypDte01;
		this.sypDte02 = sypDte02;
		this.sypQadc01 = sypQadc01;
		this.sypQadc02 = sypQadc02;
		this.sypQadc03 = sypQadc03;
		this.sypQadc04 = sypQadc04;
		this.sypQadd01 = sypQadd01;
		this.sypQadd02 = sypQadd02;
		this.sypQadi01 = sypQadi01;
		this.sypQadi02 = sypQadi02;
		this.sypQadl01 = sypQadl01;
		this.sypQadl02 = sypQadl02;
		this.sypQadt01 = sypQadt01;
		this.sypQadt02 = sypQadt02;
		this.sypExpRowidOnly = sypExpRowidOnly;
		this.oidSypMstr = oidSypMstr;
	}

	// Property accessors

	public String getSypProflId() {
		return this.sypProflId;
	}

	public void setSypProflId(String sypProflId) {
		this.sypProflId = sypProflId;
	}

	public String getSypProflDesc() {
		return this.sypProflDesc;
	}

	public void setSypProflDesc(String sypProflDesc) {
		this.sypProflDesc = sypProflDesc;
	}

	public String getSypDbname() {
		return this.sypDbname;
	}

	public void setSypDbname(String sypDbname) {
		this.sypDbname = sypDbname;
	}

	public String getSypTblname() {
		return this.sypTblname;
	}

	public void setSypTblname(String sypTblname) {
		this.sypTblname = sypTblname;
	}

	public String getSypPublProc() {
		return this.sypPublProc;
	}

	public void setSypPublProc(String sypPublProc) {
		this.sypPublProc = sypPublProc;
	}

	public Boolean getSypExpDump() {
		return this.sypExpDump;
	}

	public void setSypExpDump(Boolean sypExpDump) {
		this.sypExpDump = sypExpDump;
	}

	public Boolean getSypExpAdd() {
		return this.sypExpAdd;
	}

	public void setSypExpAdd(Boolean sypExpAdd) {
		this.sypExpAdd = sypExpAdd;
	}

	public Boolean getSypAddAsChg() {
		return this.sypAddAsChg;
	}

	public void setSypAddAsChg(Boolean sypAddAsChg) {
		this.sypAddAsChg = sypAddAsChg;
	}

	public Boolean getSypExpDel() {
		return this.sypExpDel;
	}

	public void setSypExpDel(Boolean sypExpDel) {
		this.sypExpDel = sypExpDel;
	}

	public Boolean getSypDelAsChg() {
		return this.sypDelAsChg;
	}

	public void setSypDelAsChg(Boolean sypDelAsChg) {
		this.sypDelAsChg = sypDelAsChg;
	}

	public Boolean getSypExpChg() {
		return this.sypExpChg;
	}

	public void setSypExpChg(Boolean sypExpChg) {
		this.sypExpChg = sypExpChg;
	}

	public String getSypFltCrit() {
		return this.sypFltCrit;
	}

	public void setSypFltCrit(String sypFltCrit) {
		this.sypFltCrit = sypFltCrit;
	}

	public String getSypModUserid() {
		return this.sypModUserid;
	}

	public void setSypModUserid(String sypModUserid) {
		this.sypModUserid = sypModUserid;
	}

	public Date getSypModDate() {
		return this.sypModDate;
	}

	public void setSypModDate(Date sypModDate) {
		this.sypModDate = sypModDate;
	}

	public String getSypUser1() {
		return this.sypUser1;
	}

	public void setSypUser1(String sypUser1) {
		this.sypUser1 = sypUser1;
	}

	public String getSypUser2() {
		return this.sypUser2;
	}

	public void setSypUser2(String sypUser2) {
		this.sypUser2 = sypUser2;
	}

	public String getSypChr01() {
		return this.sypChr01;
	}

	public void setSypChr01(String sypChr01) {
		this.sypChr01 = sypChr01;
	}

	public String getSypChr02() {
		return this.sypChr02;
	}

	public void setSypChr02(String sypChr02) {
		this.sypChr02 = sypChr02;
	}

	public Double getSypDec01() {
		return this.sypDec01;
	}

	public void setSypDec01(Double sypDec01) {
		this.sypDec01 = sypDec01;
	}

	public Double getSypDec02() {
		return this.sypDec02;
	}

	public void setSypDec02(Double sypDec02) {
		this.sypDec02 = sypDec02;
	}

	public Integer getSypInt01() {
		return this.sypInt01;
	}

	public void setSypInt01(Integer sypInt01) {
		this.sypInt01 = sypInt01;
	}

	public Integer getSypInt02() {
		return this.sypInt02;
	}

	public void setSypInt02(Integer sypInt02) {
		this.sypInt02 = sypInt02;
	}

	public Boolean getSypLog01() {
		return this.sypLog01;
	}

	public void setSypLog01(Boolean sypLog01) {
		this.sypLog01 = sypLog01;
	}

	public Boolean getSypLog02() {
		return this.sypLog02;
	}

	public void setSypLog02(Boolean sypLog02) {
		this.sypLog02 = sypLog02;
	}

	public Date getSypDte01() {
		return this.sypDte01;
	}

	public void setSypDte01(Date sypDte01) {
		this.sypDte01 = sypDte01;
	}

	public Date getSypDte02() {
		return this.sypDte02;
	}

	public void setSypDte02(Date sypDte02) {
		this.sypDte02 = sypDte02;
	}

	public String getSypQadc01() {
		return this.sypQadc01;
	}

	public void setSypQadc01(String sypQadc01) {
		this.sypQadc01 = sypQadc01;
	}

	public String getSypQadc02() {
		return this.sypQadc02;
	}

	public void setSypQadc02(String sypQadc02) {
		this.sypQadc02 = sypQadc02;
	}

	public String getSypQadc03() {
		return this.sypQadc03;
	}

	public void setSypQadc03(String sypQadc03) {
		this.sypQadc03 = sypQadc03;
	}

	public String getSypQadc04() {
		return this.sypQadc04;
	}

	public void setSypQadc04(String sypQadc04) {
		this.sypQadc04 = sypQadc04;
	}

	public Double getSypQadd01() {
		return this.sypQadd01;
	}

	public void setSypQadd01(Double sypQadd01) {
		this.sypQadd01 = sypQadd01;
	}

	public Double getSypQadd02() {
		return this.sypQadd02;
	}

	public void setSypQadd02(Double sypQadd02) {
		this.sypQadd02 = sypQadd02;
	}

	public Integer getSypQadi01() {
		return this.sypQadi01;
	}

	public void setSypQadi01(Integer sypQadi01) {
		this.sypQadi01 = sypQadi01;
	}

	public Integer getSypQadi02() {
		return this.sypQadi02;
	}

	public void setSypQadi02(Integer sypQadi02) {
		this.sypQadi02 = sypQadi02;
	}

	public Boolean getSypQadl01() {
		return this.sypQadl01;
	}

	public void setSypQadl01(Boolean sypQadl01) {
		this.sypQadl01 = sypQadl01;
	}

	public Boolean getSypQadl02() {
		return this.sypQadl02;
	}

	public void setSypQadl02(Boolean sypQadl02) {
		this.sypQadl02 = sypQadl02;
	}

	public Date getSypQadt01() {
		return this.sypQadt01;
	}

	public void setSypQadt01(Date sypQadt01) {
		this.sypQadt01 = sypQadt01;
	}

	public Date getSypQadt02() {
		return this.sypQadt02;
	}

	public void setSypQadt02(Date sypQadt02) {
		this.sypQadt02 = sypQadt02;
	}

	public Boolean getSypExpRowidOnly() {
		return this.sypExpRowidOnly;
	}

	public void setSypExpRowidOnly(Boolean sypExpRowidOnly) {
		this.sypExpRowidOnly = sypExpRowidOnly;
	}

	public Double getOidSypMstr() {
		return this.oidSypMstr;
	}

	public void setOidSypMstr(Double oidSypMstr) {
		this.oidSypMstr = oidSypMstr;
	}

}