package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLgsMstr entity provides the base persistence definition of the
 * LgsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLgsMstr implements java.io.Serializable {

	// Fields

	private LgsMstrId id;
	private Boolean lgsAct;
	private Boolean lgsShipExp;
	private Boolean lgsPtCstExp;
	private Boolean lgsInvExp;
	private Boolean lgsLadExp;
	private Boolean lgsPickExp;
	private Boolean lgsPymtExp;
	private Boolean lgsArBalExp;
	private Boolean lgsSoImp;
	private Boolean lgsInvcExp;
	private Boolean lgsArImp;
	private Boolean lgsPtMnt;
	private Boolean lgsCmMnt;
	private Boolean lgsSoMnt;
	private Boolean lgsLadMnt;
	private Boolean lgsInvcImp;
	private Date lgsModDate;
	private String lgsModUserid;
	private String lgsUser1;
	private String lgsUser2;
	private Double lgsDec01;
	private Double lgsDec02;
	private Integer lgsInt01;
	private Integer lgsInt02;
	private Boolean lgsLog01;
	private Boolean lgsLog02;
	private Date lgsDte01;
	private Date lgsDte02;
	private String lgsQadc01;
	private String lgsQadc02;
	private String lgsQadc03;
	private String lgsQadc04;
	private Double lgsQadd01;
	private Double lgsQadd02;
	private Integer lgsQadi01;
	private Integer lgsQadi02;
	private Boolean lgsQadl01;
	private Boolean lgsQadl02;
	private Date lgsQadt01;
	private Date lgsQadt02;
	private String lgsTaxEnv;
	private String lgsTaxc;
	private Boolean lgsPriceImp;
	private Boolean lgsTaxImp;
	private Double oidLgsMstr;

	// Constructors

	/** default constructor */
	public AbstractLgsMstr() {
	}

	/** minimal constructor */
	public AbstractLgsMstr(LgsMstrId id, Double oidLgsMstr) {
		this.id = id;
		this.oidLgsMstr = oidLgsMstr;
	}

	/** full constructor */
	public AbstractLgsMstr(LgsMstrId id, Boolean lgsAct, Boolean lgsShipExp,
			Boolean lgsPtCstExp, Boolean lgsInvExp, Boolean lgsLadExp,
			Boolean lgsPickExp, Boolean lgsPymtExp, Boolean lgsArBalExp,
			Boolean lgsSoImp, Boolean lgsInvcExp, Boolean lgsArImp,
			Boolean lgsPtMnt, Boolean lgsCmMnt, Boolean lgsSoMnt,
			Boolean lgsLadMnt, Boolean lgsInvcImp, Date lgsModDate,
			String lgsModUserid, String lgsUser1, String lgsUser2,
			Double lgsDec01, Double lgsDec02, Integer lgsInt01,
			Integer lgsInt02, Boolean lgsLog01, Boolean lgsLog02,
			Date lgsDte01, Date lgsDte02, String lgsQadc01, String lgsQadc02,
			String lgsQadc03, String lgsQadc04, Double lgsQadd01,
			Double lgsQadd02, Integer lgsQadi01, Integer lgsQadi02,
			Boolean lgsQadl01, Boolean lgsQadl02, Date lgsQadt01,
			Date lgsQadt02, String lgsTaxEnv, String lgsTaxc,
			Boolean lgsPriceImp, Boolean lgsTaxImp, Double oidLgsMstr) {
		this.id = id;
		this.lgsAct = lgsAct;
		this.lgsShipExp = lgsShipExp;
		this.lgsPtCstExp = lgsPtCstExp;
		this.lgsInvExp = lgsInvExp;
		this.lgsLadExp = lgsLadExp;
		this.lgsPickExp = lgsPickExp;
		this.lgsPymtExp = lgsPymtExp;
		this.lgsArBalExp = lgsArBalExp;
		this.lgsSoImp = lgsSoImp;
		this.lgsInvcExp = lgsInvcExp;
		this.lgsArImp = lgsArImp;
		this.lgsPtMnt = lgsPtMnt;
		this.lgsCmMnt = lgsCmMnt;
		this.lgsSoMnt = lgsSoMnt;
		this.lgsLadMnt = lgsLadMnt;
		this.lgsInvcImp = lgsInvcImp;
		this.lgsModDate = lgsModDate;
		this.lgsModUserid = lgsModUserid;
		this.lgsUser1 = lgsUser1;
		this.lgsUser2 = lgsUser2;
		this.lgsDec01 = lgsDec01;
		this.lgsDec02 = lgsDec02;
		this.lgsInt01 = lgsInt01;
		this.lgsInt02 = lgsInt02;
		this.lgsLog01 = lgsLog01;
		this.lgsLog02 = lgsLog02;
		this.lgsDte01 = lgsDte01;
		this.lgsDte02 = lgsDte02;
		this.lgsQadc01 = lgsQadc01;
		this.lgsQadc02 = lgsQadc02;
		this.lgsQadc03 = lgsQadc03;
		this.lgsQadc04 = lgsQadc04;
		this.lgsQadd01 = lgsQadd01;
		this.lgsQadd02 = lgsQadd02;
		this.lgsQadi01 = lgsQadi01;
		this.lgsQadi02 = lgsQadi02;
		this.lgsQadl01 = lgsQadl01;
		this.lgsQadl02 = lgsQadl02;
		this.lgsQadt01 = lgsQadt01;
		this.lgsQadt02 = lgsQadt02;
		this.lgsTaxEnv = lgsTaxEnv;
		this.lgsTaxc = lgsTaxc;
		this.lgsPriceImp = lgsPriceImp;
		this.lgsTaxImp = lgsTaxImp;
		this.oidLgsMstr = oidLgsMstr;
	}

	// Property accessors

	public LgsMstrId getId() {
		return this.id;
	}

	public void setId(LgsMstrId id) {
		this.id = id;
	}

	public Boolean getLgsAct() {
		return this.lgsAct;
	}

	public void setLgsAct(Boolean lgsAct) {
		this.lgsAct = lgsAct;
	}

	public Boolean getLgsShipExp() {
		return this.lgsShipExp;
	}

	public void setLgsShipExp(Boolean lgsShipExp) {
		this.lgsShipExp = lgsShipExp;
	}

	public Boolean getLgsPtCstExp() {
		return this.lgsPtCstExp;
	}

	public void setLgsPtCstExp(Boolean lgsPtCstExp) {
		this.lgsPtCstExp = lgsPtCstExp;
	}

	public Boolean getLgsInvExp() {
		return this.lgsInvExp;
	}

	public void setLgsInvExp(Boolean lgsInvExp) {
		this.lgsInvExp = lgsInvExp;
	}

	public Boolean getLgsLadExp() {
		return this.lgsLadExp;
	}

	public void setLgsLadExp(Boolean lgsLadExp) {
		this.lgsLadExp = lgsLadExp;
	}

	public Boolean getLgsPickExp() {
		return this.lgsPickExp;
	}

	public void setLgsPickExp(Boolean lgsPickExp) {
		this.lgsPickExp = lgsPickExp;
	}

	public Boolean getLgsPymtExp() {
		return this.lgsPymtExp;
	}

	public void setLgsPymtExp(Boolean lgsPymtExp) {
		this.lgsPymtExp = lgsPymtExp;
	}

	public Boolean getLgsArBalExp() {
		return this.lgsArBalExp;
	}

	public void setLgsArBalExp(Boolean lgsArBalExp) {
		this.lgsArBalExp = lgsArBalExp;
	}

	public Boolean getLgsSoImp() {
		return this.lgsSoImp;
	}

	public void setLgsSoImp(Boolean lgsSoImp) {
		this.lgsSoImp = lgsSoImp;
	}

	public Boolean getLgsInvcExp() {
		return this.lgsInvcExp;
	}

	public void setLgsInvcExp(Boolean lgsInvcExp) {
		this.lgsInvcExp = lgsInvcExp;
	}

	public Boolean getLgsArImp() {
		return this.lgsArImp;
	}

	public void setLgsArImp(Boolean lgsArImp) {
		this.lgsArImp = lgsArImp;
	}

	public Boolean getLgsPtMnt() {
		return this.lgsPtMnt;
	}

	public void setLgsPtMnt(Boolean lgsPtMnt) {
		this.lgsPtMnt = lgsPtMnt;
	}

	public Boolean getLgsCmMnt() {
		return this.lgsCmMnt;
	}

	public void setLgsCmMnt(Boolean lgsCmMnt) {
		this.lgsCmMnt = lgsCmMnt;
	}

	public Boolean getLgsSoMnt() {
		return this.lgsSoMnt;
	}

	public void setLgsSoMnt(Boolean lgsSoMnt) {
		this.lgsSoMnt = lgsSoMnt;
	}

	public Boolean getLgsLadMnt() {
		return this.lgsLadMnt;
	}

	public void setLgsLadMnt(Boolean lgsLadMnt) {
		this.lgsLadMnt = lgsLadMnt;
	}

	public Boolean getLgsInvcImp() {
		return this.lgsInvcImp;
	}

	public void setLgsInvcImp(Boolean lgsInvcImp) {
		this.lgsInvcImp = lgsInvcImp;
	}

	public Date getLgsModDate() {
		return this.lgsModDate;
	}

	public void setLgsModDate(Date lgsModDate) {
		this.lgsModDate = lgsModDate;
	}

	public String getLgsModUserid() {
		return this.lgsModUserid;
	}

	public void setLgsModUserid(String lgsModUserid) {
		this.lgsModUserid = lgsModUserid;
	}

	public String getLgsUser1() {
		return this.lgsUser1;
	}

	public void setLgsUser1(String lgsUser1) {
		this.lgsUser1 = lgsUser1;
	}

	public String getLgsUser2() {
		return this.lgsUser2;
	}

	public void setLgsUser2(String lgsUser2) {
		this.lgsUser2 = lgsUser2;
	}

	public Double getLgsDec01() {
		return this.lgsDec01;
	}

	public void setLgsDec01(Double lgsDec01) {
		this.lgsDec01 = lgsDec01;
	}

	public Double getLgsDec02() {
		return this.lgsDec02;
	}

	public void setLgsDec02(Double lgsDec02) {
		this.lgsDec02 = lgsDec02;
	}

	public Integer getLgsInt01() {
		return this.lgsInt01;
	}

	public void setLgsInt01(Integer lgsInt01) {
		this.lgsInt01 = lgsInt01;
	}

	public Integer getLgsInt02() {
		return this.lgsInt02;
	}

	public void setLgsInt02(Integer lgsInt02) {
		this.lgsInt02 = lgsInt02;
	}

	public Boolean getLgsLog01() {
		return this.lgsLog01;
	}

	public void setLgsLog01(Boolean lgsLog01) {
		this.lgsLog01 = lgsLog01;
	}

	public Boolean getLgsLog02() {
		return this.lgsLog02;
	}

	public void setLgsLog02(Boolean lgsLog02) {
		this.lgsLog02 = lgsLog02;
	}

	public Date getLgsDte01() {
		return this.lgsDte01;
	}

	public void setLgsDte01(Date lgsDte01) {
		this.lgsDte01 = lgsDte01;
	}

	public Date getLgsDte02() {
		return this.lgsDte02;
	}

	public void setLgsDte02(Date lgsDte02) {
		this.lgsDte02 = lgsDte02;
	}

	public String getLgsQadc01() {
		return this.lgsQadc01;
	}

	public void setLgsQadc01(String lgsQadc01) {
		this.lgsQadc01 = lgsQadc01;
	}

	public String getLgsQadc02() {
		return this.lgsQadc02;
	}

	public void setLgsQadc02(String lgsQadc02) {
		this.lgsQadc02 = lgsQadc02;
	}

	public String getLgsQadc03() {
		return this.lgsQadc03;
	}

	public void setLgsQadc03(String lgsQadc03) {
		this.lgsQadc03 = lgsQadc03;
	}

	public String getLgsQadc04() {
		return this.lgsQadc04;
	}

	public void setLgsQadc04(String lgsQadc04) {
		this.lgsQadc04 = lgsQadc04;
	}

	public Double getLgsQadd01() {
		return this.lgsQadd01;
	}

	public void setLgsQadd01(Double lgsQadd01) {
		this.lgsQadd01 = lgsQadd01;
	}

	public Double getLgsQadd02() {
		return this.lgsQadd02;
	}

	public void setLgsQadd02(Double lgsQadd02) {
		this.lgsQadd02 = lgsQadd02;
	}

	public Integer getLgsQadi01() {
		return this.lgsQadi01;
	}

	public void setLgsQadi01(Integer lgsQadi01) {
		this.lgsQadi01 = lgsQadi01;
	}

	public Integer getLgsQadi02() {
		return this.lgsQadi02;
	}

	public void setLgsQadi02(Integer lgsQadi02) {
		this.lgsQadi02 = lgsQadi02;
	}

	public Boolean getLgsQadl01() {
		return this.lgsQadl01;
	}

	public void setLgsQadl01(Boolean lgsQadl01) {
		this.lgsQadl01 = lgsQadl01;
	}

	public Boolean getLgsQadl02() {
		return this.lgsQadl02;
	}

	public void setLgsQadl02(Boolean lgsQadl02) {
		this.lgsQadl02 = lgsQadl02;
	}

	public Date getLgsQadt01() {
		return this.lgsQadt01;
	}

	public void setLgsQadt01(Date lgsQadt01) {
		this.lgsQadt01 = lgsQadt01;
	}

	public Date getLgsQadt02() {
		return this.lgsQadt02;
	}

	public void setLgsQadt02(Date lgsQadt02) {
		this.lgsQadt02 = lgsQadt02;
	}

	public String getLgsTaxEnv() {
		return this.lgsTaxEnv;
	}

	public void setLgsTaxEnv(String lgsTaxEnv) {
		this.lgsTaxEnv = lgsTaxEnv;
	}

	public String getLgsTaxc() {
		return this.lgsTaxc;
	}

	public void setLgsTaxc(String lgsTaxc) {
		this.lgsTaxc = lgsTaxc;
	}

	public Boolean getLgsPriceImp() {
		return this.lgsPriceImp;
	}

	public void setLgsPriceImp(Boolean lgsPriceImp) {
		this.lgsPriceImp = lgsPriceImp;
	}

	public Boolean getLgsTaxImp() {
		return this.lgsTaxImp;
	}

	public void setLgsTaxImp(Boolean lgsTaxImp) {
		this.lgsTaxImp = lgsTaxImp;
	}

	public Double getOidLgsMstr() {
		return this.oidLgsMstr;
	}

	public void setOidLgsMstr(Double oidLgsMstr) {
		this.oidLgsMstr = oidLgsMstr;
	}

}