package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVoMstr entity provides the base persistence definition of the VoMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVoMstr implements java.io.Serializable {

	// Fields

	private VoMstrId id;
	private String voCrTerms;
	private String voInvoice;
	private Double voApplied;
	private Date voDiscDate;
	private Date voDueDate;
	private Boolean voHold;
	private Date voPaidDate;
	private Double voAmtChg;
	private Double voDiscChg;
	private String voPo;
	private String voReceiver;
	private Double voNdiscAmt;
	private Double voHoldAmt;
	private Integer voCmtindx;
	private String voCurr;
	private Double voExRate;
	private String voUser1;
	private Boolean voSeparate;
	private String voShip;
	private String voChr01;
	private String voChr02;
	private String voChr03;
	private String voChr04;
	private String voChr05;
	private Date voDte01;
	private Date voDte02;
	private Double voDec01;
	private Double voDec02;
	private Boolean voLog01;
	private String voTaxPct;
	private String voType;
	private Boolean voConfirmed;
	private String voConfBy;
	private Boolean voPoRcvd;
	private Double voPrepay;
	private Date voTaxDate;
	private Boolean voModok;
	private String voUser2;
	private String voTaxEnv;
	private Boolean voRecur;
	private String voRcycle;
	private Integer voRnbrCyc;
	private Date voRstart;
	private Date voRexpire;
	private Date voRelDate;
	private String voRvNbr;
	private Double voLcAmt;
	private String voQad01;
	private String voQad02;
	private Boolean voQad03;
	private Boolean voIsErs;
	private Boolean voTaxable;
	private String voTaxc;
	private String voTaxUsage;
	private Double voExRate2;
	private String voExRatetype;
	private Double voBaseApplied;
	private Double voBaseAmtChg;
	private Double voBaseDiscChg;
	private Double voBaseNdisc;
	private Double voBaseHoldAmt;
	private Integer voExruSeq;
	private Boolean voWaitingExp;
	private Double voResaleAmt;
	private Double oidVoMstr;

	// Constructors

	/** default constructor */
	public AbstractVoMstr() {
	}

	/** minimal constructor */
	public AbstractVoMstr(VoMstrId id, Double voExRate2, String voExRatetype,
			Double voBaseApplied, Double voBaseAmtChg, Double voBaseDiscChg,
			Double voBaseNdisc, Double voBaseHoldAmt, Integer voExruSeq,
			Boolean voWaitingExp, Double voResaleAmt, Double oidVoMstr) {
		this.id = id;
		this.voExRate2 = voExRate2;
		this.voExRatetype = voExRatetype;
		this.voBaseApplied = voBaseApplied;
		this.voBaseAmtChg = voBaseAmtChg;
		this.voBaseDiscChg = voBaseDiscChg;
		this.voBaseNdisc = voBaseNdisc;
		this.voBaseHoldAmt = voBaseHoldAmt;
		this.voExruSeq = voExruSeq;
		this.voWaitingExp = voWaitingExp;
		this.voResaleAmt = voResaleAmt;
		this.oidVoMstr = oidVoMstr;
	}

	/** full constructor */
	public AbstractVoMstr(VoMstrId id, String voCrTerms, String voInvoice,
			Double voApplied, Date voDiscDate, Date voDueDate, Boolean voHold,
			Date voPaidDate, Double voAmtChg, Double voDiscChg, String voPo,
			String voReceiver, Double voNdiscAmt, Double voHoldAmt,
			Integer voCmtindx, String voCurr, Double voExRate, String voUser1,
			Boolean voSeparate, String voShip, String voChr01, String voChr02,
			String voChr03, String voChr04, String voChr05, Date voDte01,
			Date voDte02, Double voDec01, Double voDec02, Boolean voLog01,
			String voTaxPct, String voType, Boolean voConfirmed,
			String voConfBy, Boolean voPoRcvd, Double voPrepay, Date voTaxDate,
			Boolean voModok, String voUser2, String voTaxEnv, Boolean voRecur,
			String voRcycle, Integer voRnbrCyc, Date voRstart, Date voRexpire,
			Date voRelDate, String voRvNbr, Double voLcAmt, String voQad01,
			String voQad02, Boolean voQad03, Boolean voIsErs,
			Boolean voTaxable, String voTaxc, String voTaxUsage,
			Double voExRate2, String voExRatetype, Double voBaseApplied,
			Double voBaseAmtChg, Double voBaseDiscChg, Double voBaseNdisc,
			Double voBaseHoldAmt, Integer voExruSeq, Boolean voWaitingExp,
			Double voResaleAmt, Double oidVoMstr) {
		this.id = id;
		this.voCrTerms = voCrTerms;
		this.voInvoice = voInvoice;
		this.voApplied = voApplied;
		this.voDiscDate = voDiscDate;
		this.voDueDate = voDueDate;
		this.voHold = voHold;
		this.voPaidDate = voPaidDate;
		this.voAmtChg = voAmtChg;
		this.voDiscChg = voDiscChg;
		this.voPo = voPo;
		this.voReceiver = voReceiver;
		this.voNdiscAmt = voNdiscAmt;
		this.voHoldAmt = voHoldAmt;
		this.voCmtindx = voCmtindx;
		this.voCurr = voCurr;
		this.voExRate = voExRate;
		this.voUser1 = voUser1;
		this.voSeparate = voSeparate;
		this.voShip = voShip;
		this.voChr01 = voChr01;
		this.voChr02 = voChr02;
		this.voChr03 = voChr03;
		this.voChr04 = voChr04;
		this.voChr05 = voChr05;
		this.voDte01 = voDte01;
		this.voDte02 = voDte02;
		this.voDec01 = voDec01;
		this.voDec02 = voDec02;
		this.voLog01 = voLog01;
		this.voTaxPct = voTaxPct;
		this.voType = voType;
		this.voConfirmed = voConfirmed;
		this.voConfBy = voConfBy;
		this.voPoRcvd = voPoRcvd;
		this.voPrepay = voPrepay;
		this.voTaxDate = voTaxDate;
		this.voModok = voModok;
		this.voUser2 = voUser2;
		this.voTaxEnv = voTaxEnv;
		this.voRecur = voRecur;
		this.voRcycle = voRcycle;
		this.voRnbrCyc = voRnbrCyc;
		this.voRstart = voRstart;
		this.voRexpire = voRexpire;
		this.voRelDate = voRelDate;
		this.voRvNbr = voRvNbr;
		this.voLcAmt = voLcAmt;
		this.voQad01 = voQad01;
		this.voQad02 = voQad02;
		this.voQad03 = voQad03;
		this.voIsErs = voIsErs;
		this.voTaxable = voTaxable;
		this.voTaxc = voTaxc;
		this.voTaxUsage = voTaxUsage;
		this.voExRate2 = voExRate2;
		this.voExRatetype = voExRatetype;
		this.voBaseApplied = voBaseApplied;
		this.voBaseAmtChg = voBaseAmtChg;
		this.voBaseDiscChg = voBaseDiscChg;
		this.voBaseNdisc = voBaseNdisc;
		this.voBaseHoldAmt = voBaseHoldAmt;
		this.voExruSeq = voExruSeq;
		this.voWaitingExp = voWaitingExp;
		this.voResaleAmt = voResaleAmt;
		this.oidVoMstr = oidVoMstr;
	}

	// Property accessors

	public VoMstrId getId() {
		return this.id;
	}

	public void setId(VoMstrId id) {
		this.id = id;
	}

	public String getVoCrTerms() {
		return this.voCrTerms;
	}

	public void setVoCrTerms(String voCrTerms) {
		this.voCrTerms = voCrTerms;
	}

	public String getVoInvoice() {
		return this.voInvoice;
	}

	public void setVoInvoice(String voInvoice) {
		this.voInvoice = voInvoice;
	}

	public Double getVoApplied() {
		return this.voApplied;
	}

	public void setVoApplied(Double voApplied) {
		this.voApplied = voApplied;
	}

	public Date getVoDiscDate() {
		return this.voDiscDate;
	}

	public void setVoDiscDate(Date voDiscDate) {
		this.voDiscDate = voDiscDate;
	}

	public Date getVoDueDate() {
		return this.voDueDate;
	}

	public void setVoDueDate(Date voDueDate) {
		this.voDueDate = voDueDate;
	}

	public Boolean getVoHold() {
		return this.voHold;
	}

	public void setVoHold(Boolean voHold) {
		this.voHold = voHold;
	}

	public Date getVoPaidDate() {
		return this.voPaidDate;
	}

	public void setVoPaidDate(Date voPaidDate) {
		this.voPaidDate = voPaidDate;
	}

	public Double getVoAmtChg() {
		return this.voAmtChg;
	}

	public void setVoAmtChg(Double voAmtChg) {
		this.voAmtChg = voAmtChg;
	}

	public Double getVoDiscChg() {
		return this.voDiscChg;
	}

	public void setVoDiscChg(Double voDiscChg) {
		this.voDiscChg = voDiscChg;
	}

	public String getVoPo() {
		return this.voPo;
	}

	public void setVoPo(String voPo) {
		this.voPo = voPo;
	}

	public String getVoReceiver() {
		return this.voReceiver;
	}

	public void setVoReceiver(String voReceiver) {
		this.voReceiver = voReceiver;
	}

	public Double getVoNdiscAmt() {
		return this.voNdiscAmt;
	}

	public void setVoNdiscAmt(Double voNdiscAmt) {
		this.voNdiscAmt = voNdiscAmt;
	}

	public Double getVoHoldAmt() {
		return this.voHoldAmt;
	}

	public void setVoHoldAmt(Double voHoldAmt) {
		this.voHoldAmt = voHoldAmt;
	}

	public Integer getVoCmtindx() {
		return this.voCmtindx;
	}

	public void setVoCmtindx(Integer voCmtindx) {
		this.voCmtindx = voCmtindx;
	}

	public String getVoCurr() {
		return this.voCurr;
	}

	public void setVoCurr(String voCurr) {
		this.voCurr = voCurr;
	}

	public Double getVoExRate() {
		return this.voExRate;
	}

	public void setVoExRate(Double voExRate) {
		this.voExRate = voExRate;
	}

	public String getVoUser1() {
		return this.voUser1;
	}

	public void setVoUser1(String voUser1) {
		this.voUser1 = voUser1;
	}

	public Boolean getVoSeparate() {
		return this.voSeparate;
	}

	public void setVoSeparate(Boolean voSeparate) {
		this.voSeparate = voSeparate;
	}

	public String getVoShip() {
		return this.voShip;
	}

	public void setVoShip(String voShip) {
		this.voShip = voShip;
	}

	public String getVoChr01() {
		return this.voChr01;
	}

	public void setVoChr01(String voChr01) {
		this.voChr01 = voChr01;
	}

	public String getVoChr02() {
		return this.voChr02;
	}

	public void setVoChr02(String voChr02) {
		this.voChr02 = voChr02;
	}

	public String getVoChr03() {
		return this.voChr03;
	}

	public void setVoChr03(String voChr03) {
		this.voChr03 = voChr03;
	}

	public String getVoChr04() {
		return this.voChr04;
	}

	public void setVoChr04(String voChr04) {
		this.voChr04 = voChr04;
	}

	public String getVoChr05() {
		return this.voChr05;
	}

	public void setVoChr05(String voChr05) {
		this.voChr05 = voChr05;
	}

	public Date getVoDte01() {
		return this.voDte01;
	}

	public void setVoDte01(Date voDte01) {
		this.voDte01 = voDte01;
	}

	public Date getVoDte02() {
		return this.voDte02;
	}

	public void setVoDte02(Date voDte02) {
		this.voDte02 = voDte02;
	}

	public Double getVoDec01() {
		return this.voDec01;
	}

	public void setVoDec01(Double voDec01) {
		this.voDec01 = voDec01;
	}

	public Double getVoDec02() {
		return this.voDec02;
	}

	public void setVoDec02(Double voDec02) {
		this.voDec02 = voDec02;
	}

	public Boolean getVoLog01() {
		return this.voLog01;
	}

	public void setVoLog01(Boolean voLog01) {
		this.voLog01 = voLog01;
	}

	public String getVoTaxPct() {
		return this.voTaxPct;
	}

	public void setVoTaxPct(String voTaxPct) {
		this.voTaxPct = voTaxPct;
	}

	public String getVoType() {
		return this.voType;
	}

	public void setVoType(String voType) {
		this.voType = voType;
	}

	public Boolean getVoConfirmed() {
		return this.voConfirmed;
	}

	public void setVoConfirmed(Boolean voConfirmed) {
		this.voConfirmed = voConfirmed;
	}

	public String getVoConfBy() {
		return this.voConfBy;
	}

	public void setVoConfBy(String voConfBy) {
		this.voConfBy = voConfBy;
	}

	public Boolean getVoPoRcvd() {
		return this.voPoRcvd;
	}

	public void setVoPoRcvd(Boolean voPoRcvd) {
		this.voPoRcvd = voPoRcvd;
	}

	public Double getVoPrepay() {
		return this.voPrepay;
	}

	public void setVoPrepay(Double voPrepay) {
		this.voPrepay = voPrepay;
	}

	public Date getVoTaxDate() {
		return this.voTaxDate;
	}

	public void setVoTaxDate(Date voTaxDate) {
		this.voTaxDate = voTaxDate;
	}

	public Boolean getVoModok() {
		return this.voModok;
	}

	public void setVoModok(Boolean voModok) {
		this.voModok = voModok;
	}

	public String getVoUser2() {
		return this.voUser2;
	}

	public void setVoUser2(String voUser2) {
		this.voUser2 = voUser2;
	}

	public String getVoTaxEnv() {
		return this.voTaxEnv;
	}

	public void setVoTaxEnv(String voTaxEnv) {
		this.voTaxEnv = voTaxEnv;
	}

	public Boolean getVoRecur() {
		return this.voRecur;
	}

	public void setVoRecur(Boolean voRecur) {
		this.voRecur = voRecur;
	}

	public String getVoRcycle() {
		return this.voRcycle;
	}

	public void setVoRcycle(String voRcycle) {
		this.voRcycle = voRcycle;
	}

	public Integer getVoRnbrCyc() {
		return this.voRnbrCyc;
	}

	public void setVoRnbrCyc(Integer voRnbrCyc) {
		this.voRnbrCyc = voRnbrCyc;
	}

	public Date getVoRstart() {
		return this.voRstart;
	}

	public void setVoRstart(Date voRstart) {
		this.voRstart = voRstart;
	}

	public Date getVoRexpire() {
		return this.voRexpire;
	}

	public void setVoRexpire(Date voRexpire) {
		this.voRexpire = voRexpire;
	}

	public Date getVoRelDate() {
		return this.voRelDate;
	}

	public void setVoRelDate(Date voRelDate) {
		this.voRelDate = voRelDate;
	}

	public String getVoRvNbr() {
		return this.voRvNbr;
	}

	public void setVoRvNbr(String voRvNbr) {
		this.voRvNbr = voRvNbr;
	}

	public Double getVoLcAmt() {
		return this.voLcAmt;
	}

	public void setVoLcAmt(Double voLcAmt) {
		this.voLcAmt = voLcAmt;
	}

	public String getVoQad01() {
		return this.voQad01;
	}

	public void setVoQad01(String voQad01) {
		this.voQad01 = voQad01;
	}

	public String getVoQad02() {
		return this.voQad02;
	}

	public void setVoQad02(String voQad02) {
		this.voQad02 = voQad02;
	}

	public Boolean getVoQad03() {
		return this.voQad03;
	}

	public void setVoQad03(Boolean voQad03) {
		this.voQad03 = voQad03;
	}

	public Boolean getVoIsErs() {
		return this.voIsErs;
	}

	public void setVoIsErs(Boolean voIsErs) {
		this.voIsErs = voIsErs;
	}

	public Boolean getVoTaxable() {
		return this.voTaxable;
	}

	public void setVoTaxable(Boolean voTaxable) {
		this.voTaxable = voTaxable;
	}

	public String getVoTaxc() {
		return this.voTaxc;
	}

	public void setVoTaxc(String voTaxc) {
		this.voTaxc = voTaxc;
	}

	public String getVoTaxUsage() {
		return this.voTaxUsage;
	}

	public void setVoTaxUsage(String voTaxUsage) {
		this.voTaxUsage = voTaxUsage;
	}

	public Double getVoExRate2() {
		return this.voExRate2;
	}

	public void setVoExRate2(Double voExRate2) {
		this.voExRate2 = voExRate2;
	}

	public String getVoExRatetype() {
		return this.voExRatetype;
	}

	public void setVoExRatetype(String voExRatetype) {
		this.voExRatetype = voExRatetype;
	}

	public Double getVoBaseApplied() {
		return this.voBaseApplied;
	}

	public void setVoBaseApplied(Double voBaseApplied) {
		this.voBaseApplied = voBaseApplied;
	}

	public Double getVoBaseAmtChg() {
		return this.voBaseAmtChg;
	}

	public void setVoBaseAmtChg(Double voBaseAmtChg) {
		this.voBaseAmtChg = voBaseAmtChg;
	}

	public Double getVoBaseDiscChg() {
		return this.voBaseDiscChg;
	}

	public void setVoBaseDiscChg(Double voBaseDiscChg) {
		this.voBaseDiscChg = voBaseDiscChg;
	}

	public Double getVoBaseNdisc() {
		return this.voBaseNdisc;
	}

	public void setVoBaseNdisc(Double voBaseNdisc) {
		this.voBaseNdisc = voBaseNdisc;
	}

	public Double getVoBaseHoldAmt() {
		return this.voBaseHoldAmt;
	}

	public void setVoBaseHoldAmt(Double voBaseHoldAmt) {
		this.voBaseHoldAmt = voBaseHoldAmt;
	}

	public Integer getVoExruSeq() {
		return this.voExruSeq;
	}

	public void setVoExruSeq(Integer voExruSeq) {
		this.voExruSeq = voExruSeq;
	}

	public Boolean getVoWaitingExp() {
		return this.voWaitingExp;
	}

	public void setVoWaitingExp(Boolean voWaitingExp) {
		this.voWaitingExp = voWaitingExp;
	}

	public Double getVoResaleAmt() {
		return this.voResaleAmt;
	}

	public void setVoResaleAmt(Double voResaleAmt) {
		this.voResaleAmt = voResaleAmt;
	}

	public Double getOidVoMstr() {
		return this.oidVoMstr;
	}

	public void setOidVoMstr(Double oidVoMstr) {
		this.oidVoMstr = oidVoMstr;
	}

}