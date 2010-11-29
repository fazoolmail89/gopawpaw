package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCpcMstr entity provides the base persistence definition of the
 * CpcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCpcMstr implements java.io.Serializable {

	// Fields

	private CpcMstrId id;
	private String cpcDesc;
	private String cpcChr01;
	private String cpcChr02;
	private String cpcChr03;
	private String cpcChr04;
	private Double cpcDec01;
	private Boolean cpcLog01;
	private Date cpcModDate;
	private String cpcUserid;
	private String cpcUser1;
	private String cpcUser2;
	private Double oidCpcMstr;

	// Constructors

	/** default constructor */
	public AbstractCpcMstr() {
	}

	/** minimal constructor */
	public AbstractCpcMstr(CpcMstrId id, Double oidCpcMstr) {
		this.id = id;
		this.oidCpcMstr = oidCpcMstr;
	}

	/** full constructor */
	public AbstractCpcMstr(CpcMstrId id, String cpcDesc, String cpcChr01,
			String cpcChr02, String cpcChr03, String cpcChr04, Double cpcDec01,
			Boolean cpcLog01, Date cpcModDate, String cpcUserid,
			String cpcUser1, String cpcUser2, Double oidCpcMstr) {
		this.id = id;
		this.cpcDesc = cpcDesc;
		this.cpcChr01 = cpcChr01;
		this.cpcChr02 = cpcChr02;
		this.cpcChr03 = cpcChr03;
		this.cpcChr04 = cpcChr04;
		this.cpcDec01 = cpcDec01;
		this.cpcLog01 = cpcLog01;
		this.cpcModDate = cpcModDate;
		this.cpcUserid = cpcUserid;
		this.cpcUser1 = cpcUser1;
		this.cpcUser2 = cpcUser2;
		this.oidCpcMstr = oidCpcMstr;
	}

	// Property accessors

	public CpcMstrId getId() {
		return this.id;
	}

	public void setId(CpcMstrId id) {
		this.id = id;
	}

	public String getCpcDesc() {
		return this.cpcDesc;
	}

	public void setCpcDesc(String cpcDesc) {
		this.cpcDesc = cpcDesc;
	}

	public String getCpcChr01() {
		return this.cpcChr01;
	}

	public void setCpcChr01(String cpcChr01) {
		this.cpcChr01 = cpcChr01;
	}

	public String getCpcChr02() {
		return this.cpcChr02;
	}

	public void setCpcChr02(String cpcChr02) {
		this.cpcChr02 = cpcChr02;
	}

	public String getCpcChr03() {
		return this.cpcChr03;
	}

	public void setCpcChr03(String cpcChr03) {
		this.cpcChr03 = cpcChr03;
	}

	public String getCpcChr04() {
		return this.cpcChr04;
	}

	public void setCpcChr04(String cpcChr04) {
		this.cpcChr04 = cpcChr04;
	}

	public Double getCpcDec01() {
		return this.cpcDec01;
	}

	public void setCpcDec01(Double cpcDec01) {
		this.cpcDec01 = cpcDec01;
	}

	public Boolean getCpcLog01() {
		return this.cpcLog01;
	}

	public void setCpcLog01(Boolean cpcLog01) {
		this.cpcLog01 = cpcLog01;
	}

	public Date getCpcModDate() {
		return this.cpcModDate;
	}

	public void setCpcModDate(Date cpcModDate) {
		this.cpcModDate = cpcModDate;
	}

	public String getCpcUserid() {
		return this.cpcUserid;
	}

	public void setCpcUserid(String cpcUserid) {
		this.cpcUserid = cpcUserid;
	}

	public String getCpcUser1() {
		return this.cpcUser1;
	}

	public void setCpcUser1(String cpcUser1) {
		this.cpcUser1 = cpcUser1;
	}

	public String getCpcUser2() {
		return this.cpcUser2;
	}

	public void setCpcUser2(String cpcUser2) {
		this.cpcUser2 = cpcUser2;
	}

	public Double getOidCpcMstr() {
		return this.oidCpcMstr;
	}

	public void setOidCpcMstr(Double oidCpcMstr) {
		this.oidCpcMstr = oidCpcMstr;
	}

}