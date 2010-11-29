package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCmhHist entity provides the base persistence definition of the
 * CmhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmhHist implements java.io.Serializable {

	// Fields

	private CmhHistId id;
	private Double cmhTotSale;
	private Double cmhTotCost;
	private String cmhUser1;
	private String cmhUser2;
	private String cmhType;
	private String cmhChr01;
	private String cmhChr02;
	private String cmhChr03;
	private String cmhChr04;
	private String cmhChr05;
	private String cmhChr06;
	private String cmhChr07;
	private String cmhChr08;
	private String cmhChr09;
	private String cmhChr10;
	private Date cmhDte01;
	private Date cmhDte02;
	private Double cmhDec01;
	private Double cmhDec02;
	private Boolean cmhLog01;
	private Boolean cmhLog02;
	private Double oidCmhHist;

	// Constructors

	/** default constructor */
	public AbstractCmhHist() {
	}

	/** minimal constructor */
	public AbstractCmhHist(CmhHistId id, Double oidCmhHist) {
		this.id = id;
		this.oidCmhHist = oidCmhHist;
	}

	/** full constructor */
	public AbstractCmhHist(CmhHistId id, Double cmhTotSale, Double cmhTotCost,
			String cmhUser1, String cmhUser2, String cmhType, String cmhChr01,
			String cmhChr02, String cmhChr03, String cmhChr04, String cmhChr05,
			String cmhChr06, String cmhChr07, String cmhChr08, String cmhChr09,
			String cmhChr10, Date cmhDte01, Date cmhDte02, Double cmhDec01,
			Double cmhDec02, Boolean cmhLog01, Boolean cmhLog02,
			Double oidCmhHist) {
		this.id = id;
		this.cmhTotSale = cmhTotSale;
		this.cmhTotCost = cmhTotCost;
		this.cmhUser1 = cmhUser1;
		this.cmhUser2 = cmhUser2;
		this.cmhType = cmhType;
		this.cmhChr01 = cmhChr01;
		this.cmhChr02 = cmhChr02;
		this.cmhChr03 = cmhChr03;
		this.cmhChr04 = cmhChr04;
		this.cmhChr05 = cmhChr05;
		this.cmhChr06 = cmhChr06;
		this.cmhChr07 = cmhChr07;
		this.cmhChr08 = cmhChr08;
		this.cmhChr09 = cmhChr09;
		this.cmhChr10 = cmhChr10;
		this.cmhDte01 = cmhDte01;
		this.cmhDte02 = cmhDte02;
		this.cmhDec01 = cmhDec01;
		this.cmhDec02 = cmhDec02;
		this.cmhLog01 = cmhLog01;
		this.cmhLog02 = cmhLog02;
		this.oidCmhHist = oidCmhHist;
	}

	// Property accessors

	public CmhHistId getId() {
		return this.id;
	}

	public void setId(CmhHistId id) {
		this.id = id;
	}

	public Double getCmhTotSale() {
		return this.cmhTotSale;
	}

	public void setCmhTotSale(Double cmhTotSale) {
		this.cmhTotSale = cmhTotSale;
	}

	public Double getCmhTotCost() {
		return this.cmhTotCost;
	}

	public void setCmhTotCost(Double cmhTotCost) {
		this.cmhTotCost = cmhTotCost;
	}

	public String getCmhUser1() {
		return this.cmhUser1;
	}

	public void setCmhUser1(String cmhUser1) {
		this.cmhUser1 = cmhUser1;
	}

	public String getCmhUser2() {
		return this.cmhUser2;
	}

	public void setCmhUser2(String cmhUser2) {
		this.cmhUser2 = cmhUser2;
	}

	public String getCmhType() {
		return this.cmhType;
	}

	public void setCmhType(String cmhType) {
		this.cmhType = cmhType;
	}

	public String getCmhChr01() {
		return this.cmhChr01;
	}

	public void setCmhChr01(String cmhChr01) {
		this.cmhChr01 = cmhChr01;
	}

	public String getCmhChr02() {
		return this.cmhChr02;
	}

	public void setCmhChr02(String cmhChr02) {
		this.cmhChr02 = cmhChr02;
	}

	public String getCmhChr03() {
		return this.cmhChr03;
	}

	public void setCmhChr03(String cmhChr03) {
		this.cmhChr03 = cmhChr03;
	}

	public String getCmhChr04() {
		return this.cmhChr04;
	}

	public void setCmhChr04(String cmhChr04) {
		this.cmhChr04 = cmhChr04;
	}

	public String getCmhChr05() {
		return this.cmhChr05;
	}

	public void setCmhChr05(String cmhChr05) {
		this.cmhChr05 = cmhChr05;
	}

	public String getCmhChr06() {
		return this.cmhChr06;
	}

	public void setCmhChr06(String cmhChr06) {
		this.cmhChr06 = cmhChr06;
	}

	public String getCmhChr07() {
		return this.cmhChr07;
	}

	public void setCmhChr07(String cmhChr07) {
		this.cmhChr07 = cmhChr07;
	}

	public String getCmhChr08() {
		return this.cmhChr08;
	}

	public void setCmhChr08(String cmhChr08) {
		this.cmhChr08 = cmhChr08;
	}

	public String getCmhChr09() {
		return this.cmhChr09;
	}

	public void setCmhChr09(String cmhChr09) {
		this.cmhChr09 = cmhChr09;
	}

	public String getCmhChr10() {
		return this.cmhChr10;
	}

	public void setCmhChr10(String cmhChr10) {
		this.cmhChr10 = cmhChr10;
	}

	public Date getCmhDte01() {
		return this.cmhDte01;
	}

	public void setCmhDte01(Date cmhDte01) {
		this.cmhDte01 = cmhDte01;
	}

	public Date getCmhDte02() {
		return this.cmhDte02;
	}

	public void setCmhDte02(Date cmhDte02) {
		this.cmhDte02 = cmhDte02;
	}

	public Double getCmhDec01() {
		return this.cmhDec01;
	}

	public void setCmhDec01(Double cmhDec01) {
		this.cmhDec01 = cmhDec01;
	}

	public Double getCmhDec02() {
		return this.cmhDec02;
	}

	public void setCmhDec02(Double cmhDec02) {
		this.cmhDec02 = cmhDec02;
	}

	public Boolean getCmhLog01() {
		return this.cmhLog01;
	}

	public void setCmhLog01(Boolean cmhLog01) {
		this.cmhLog01 = cmhLog01;
	}

	public Boolean getCmhLog02() {
		return this.cmhLog02;
	}

	public void setCmhLog02(Boolean cmhLog02) {
		this.cmhLog02 = cmhLog02;
	}

	public Double getOidCmhHist() {
		return this.oidCmhHist;
	}

	public void setOidCmhHist(Double oidCmhHist) {
		this.oidCmhHist = oidCmhHist;
	}

}