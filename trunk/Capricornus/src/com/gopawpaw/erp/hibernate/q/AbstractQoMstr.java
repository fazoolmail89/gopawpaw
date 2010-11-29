package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQoMstr entity provides the base persistence definition of the QoMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQoMstr implements java.io.Serializable {

	// Fields

	private QoMstrId id;
	private String qoCust;
	private String qoShip;
	private Date qoOrdDate;
	private Date qoReqDate;
	private Date qoDueDate;
	private String qoRmks;
	private String qoCrTerms;
	private String qoFob;
	private String qoPo;
	private String qoShipvia;
	private Boolean qoPartial;
	private Boolean qoPrintQo;
	private String qoPrList;
	private String qoXslspsn;
	private String qoSource;
	private String qoXcommPct;
	private String qoCrCard;
	private Boolean qoPrintPl;
	private String qoCrInit;
	private String qoStat;
	private Double qoQad01;
	private Double qoQad02;
	private Double qoQad03;
	private Double qoDiscPct;
	private String qoTaxPct;
	private Double qoPrepaid;
	private String qoArAcct;
	private String qoArCc;
	private Date qoShipDate;
	private Boolean qoTaxable;
	private Integer qoCmtindx;
	private Integer qoQad04;
	private String qoUser1;
	private String qoUser2;
	private String qoSoNbr;
	private Date qoConfirm;
	private Date qoExpDate;
	private Date qoRelDate;
	private Boolean qoRelease;
	private Boolean qoRecur;
	private String qoCycle;
	private Integer qoRelCnt;
	private Date qoFlwDate;
	private String qoCurr;
	private Double qoExRate;
	private String qoLang;
	private String qoQad05;
	private Boolean qoPst;
	private String qoFstId;
	private String qoPstId;
	private Double qoTrl1Amt;
	private String qoTrl1Cd;
	private Double qoTrl2Amt;
	private String qoTrl2Cd;
	private Double qoTrl3Amt;
	private String qoTrl3Cd;
	private Double qoWeight;
	private String qoWeightUm;
	private Double qoSize;
	private String qoSizeUm;
	private Integer qoCartons;
	private String qoBol;
	private String qoSite;
	private String qoTaxc;
	private String qoChr01;
	private String qoChr02;
	private String qoChr03;
	private String qoChr04;
	private String qoChr05;
	private String qoChr06;
	private String qoChr07;
	private String qoChr08;
	private String qoChr09;
	private String qoChr10;
	private Date qoDte01;
	private Date qoDte02;
	private Double qoDec01;
	private Double qoDec02;
	private Boolean qoLog01;
	private String qoProject;
	private Integer qoRev;
	private Double qoPstPct;
	private String qoFrList;
	private String qoFrTerms;
	private String qoCommPct;
	private String qoSlspsn;
	private Boolean qoFixRate;
	private Double qoEntEx;
	private String qoBill;
	private Boolean qoPrintBl;
	private String qoUserid;
	private Date qoTaxDate;
	private String qoChannel;
	private String qoInvMthd;
	private String qoBank;
	private Double qoFrMinWt;
	private String qoPrList2;
	private String qoTaxEnv;
	private String qoTaxUsage;
	private Date qoPricedDt;
	private Date qoPricingDt;
	private Double qoExRate2;
	private String qoExRatetype;
	private String qoDiv;
	private Integer qoExruSeq;
	private String qoArSub;
	private String qoAppOwner;
	private Boolean qoManualFrTerms;
	private Double oidQoMstr;

	// Constructors

	/** default constructor */
	public AbstractQoMstr() {
	}

	/** minimal constructor */
	public AbstractQoMstr(QoMstrId id, Double qoExRate2, String qoExRatetype,
			Integer qoExruSeq, String qoAppOwner, Boolean qoManualFrTerms,
			Double oidQoMstr) {
		this.id = id;
		this.qoExRate2 = qoExRate2;
		this.qoExRatetype = qoExRatetype;
		this.qoExruSeq = qoExruSeq;
		this.qoAppOwner = qoAppOwner;
		this.qoManualFrTerms = qoManualFrTerms;
		this.oidQoMstr = oidQoMstr;
	}

	/** full constructor */
	public AbstractQoMstr(QoMstrId id, String qoCust, String qoShip,
			Date qoOrdDate, Date qoReqDate, Date qoDueDate, String qoRmks,
			String qoCrTerms, String qoFob, String qoPo, String qoShipvia,
			Boolean qoPartial, Boolean qoPrintQo, String qoPrList,
			String qoXslspsn, String qoSource, String qoXcommPct,
			String qoCrCard, Boolean qoPrintPl, String qoCrInit, String qoStat,
			Double qoQad01, Double qoQad02, Double qoQad03, Double qoDiscPct,
			String qoTaxPct, Double qoPrepaid, String qoArAcct, String qoArCc,
			Date qoShipDate, Boolean qoTaxable, Integer qoCmtindx,
			Integer qoQad04, String qoUser1, String qoUser2, String qoSoNbr,
			Date qoConfirm, Date qoExpDate, Date qoRelDate, Boolean qoRelease,
			Boolean qoRecur, String qoCycle, Integer qoRelCnt, Date qoFlwDate,
			String qoCurr, Double qoExRate, String qoLang, String qoQad05,
			Boolean qoPst, String qoFstId, String qoPstId, Double qoTrl1Amt,
			String qoTrl1Cd, Double qoTrl2Amt, String qoTrl2Cd,
			Double qoTrl3Amt, String qoTrl3Cd, Double qoWeight,
			String qoWeightUm, Double qoSize, String qoSizeUm,
			Integer qoCartons, String qoBol, String qoSite, String qoTaxc,
			String qoChr01, String qoChr02, String qoChr03, String qoChr04,
			String qoChr05, String qoChr06, String qoChr07, String qoChr08,
			String qoChr09, String qoChr10, Date qoDte01, Date qoDte02,
			Double qoDec01, Double qoDec02, Boolean qoLog01, String qoProject,
			Integer qoRev, Double qoPstPct, String qoFrList, String qoFrTerms,
			String qoCommPct, String qoSlspsn, Boolean qoFixRate,
			Double qoEntEx, String qoBill, Boolean qoPrintBl, String qoUserid,
			Date qoTaxDate, String qoChannel, String qoInvMthd, String qoBank,
			Double qoFrMinWt, String qoPrList2, String qoTaxEnv,
			String qoTaxUsage, Date qoPricedDt, Date qoPricingDt,
			Double qoExRate2, String qoExRatetype, String qoDiv,
			Integer qoExruSeq, String qoArSub, String qoAppOwner,
			Boolean qoManualFrTerms, Double oidQoMstr) {
		this.id = id;
		this.qoCust = qoCust;
		this.qoShip = qoShip;
		this.qoOrdDate = qoOrdDate;
		this.qoReqDate = qoReqDate;
		this.qoDueDate = qoDueDate;
		this.qoRmks = qoRmks;
		this.qoCrTerms = qoCrTerms;
		this.qoFob = qoFob;
		this.qoPo = qoPo;
		this.qoShipvia = qoShipvia;
		this.qoPartial = qoPartial;
		this.qoPrintQo = qoPrintQo;
		this.qoPrList = qoPrList;
		this.qoXslspsn = qoXslspsn;
		this.qoSource = qoSource;
		this.qoXcommPct = qoXcommPct;
		this.qoCrCard = qoCrCard;
		this.qoPrintPl = qoPrintPl;
		this.qoCrInit = qoCrInit;
		this.qoStat = qoStat;
		this.qoQad01 = qoQad01;
		this.qoQad02 = qoQad02;
		this.qoQad03 = qoQad03;
		this.qoDiscPct = qoDiscPct;
		this.qoTaxPct = qoTaxPct;
		this.qoPrepaid = qoPrepaid;
		this.qoArAcct = qoArAcct;
		this.qoArCc = qoArCc;
		this.qoShipDate = qoShipDate;
		this.qoTaxable = qoTaxable;
		this.qoCmtindx = qoCmtindx;
		this.qoQad04 = qoQad04;
		this.qoUser1 = qoUser1;
		this.qoUser2 = qoUser2;
		this.qoSoNbr = qoSoNbr;
		this.qoConfirm = qoConfirm;
		this.qoExpDate = qoExpDate;
		this.qoRelDate = qoRelDate;
		this.qoRelease = qoRelease;
		this.qoRecur = qoRecur;
		this.qoCycle = qoCycle;
		this.qoRelCnt = qoRelCnt;
		this.qoFlwDate = qoFlwDate;
		this.qoCurr = qoCurr;
		this.qoExRate = qoExRate;
		this.qoLang = qoLang;
		this.qoQad05 = qoQad05;
		this.qoPst = qoPst;
		this.qoFstId = qoFstId;
		this.qoPstId = qoPstId;
		this.qoTrl1Amt = qoTrl1Amt;
		this.qoTrl1Cd = qoTrl1Cd;
		this.qoTrl2Amt = qoTrl2Amt;
		this.qoTrl2Cd = qoTrl2Cd;
		this.qoTrl3Amt = qoTrl3Amt;
		this.qoTrl3Cd = qoTrl3Cd;
		this.qoWeight = qoWeight;
		this.qoWeightUm = qoWeightUm;
		this.qoSize = qoSize;
		this.qoSizeUm = qoSizeUm;
		this.qoCartons = qoCartons;
		this.qoBol = qoBol;
		this.qoSite = qoSite;
		this.qoTaxc = qoTaxc;
		this.qoChr01 = qoChr01;
		this.qoChr02 = qoChr02;
		this.qoChr03 = qoChr03;
		this.qoChr04 = qoChr04;
		this.qoChr05 = qoChr05;
		this.qoChr06 = qoChr06;
		this.qoChr07 = qoChr07;
		this.qoChr08 = qoChr08;
		this.qoChr09 = qoChr09;
		this.qoChr10 = qoChr10;
		this.qoDte01 = qoDte01;
		this.qoDte02 = qoDte02;
		this.qoDec01 = qoDec01;
		this.qoDec02 = qoDec02;
		this.qoLog01 = qoLog01;
		this.qoProject = qoProject;
		this.qoRev = qoRev;
		this.qoPstPct = qoPstPct;
		this.qoFrList = qoFrList;
		this.qoFrTerms = qoFrTerms;
		this.qoCommPct = qoCommPct;
		this.qoSlspsn = qoSlspsn;
		this.qoFixRate = qoFixRate;
		this.qoEntEx = qoEntEx;
		this.qoBill = qoBill;
		this.qoPrintBl = qoPrintBl;
		this.qoUserid = qoUserid;
		this.qoTaxDate = qoTaxDate;
		this.qoChannel = qoChannel;
		this.qoInvMthd = qoInvMthd;
		this.qoBank = qoBank;
		this.qoFrMinWt = qoFrMinWt;
		this.qoPrList2 = qoPrList2;
		this.qoTaxEnv = qoTaxEnv;
		this.qoTaxUsage = qoTaxUsage;
		this.qoPricedDt = qoPricedDt;
		this.qoPricingDt = qoPricingDt;
		this.qoExRate2 = qoExRate2;
		this.qoExRatetype = qoExRatetype;
		this.qoDiv = qoDiv;
		this.qoExruSeq = qoExruSeq;
		this.qoArSub = qoArSub;
		this.qoAppOwner = qoAppOwner;
		this.qoManualFrTerms = qoManualFrTerms;
		this.oidQoMstr = oidQoMstr;
	}

	// Property accessors

	public QoMstrId getId() {
		return this.id;
	}

	public void setId(QoMstrId id) {
		this.id = id;
	}

	public String getQoCust() {
		return this.qoCust;
	}

	public void setQoCust(String qoCust) {
		this.qoCust = qoCust;
	}

	public String getQoShip() {
		return this.qoShip;
	}

	public void setQoShip(String qoShip) {
		this.qoShip = qoShip;
	}

	public Date getQoOrdDate() {
		return this.qoOrdDate;
	}

	public void setQoOrdDate(Date qoOrdDate) {
		this.qoOrdDate = qoOrdDate;
	}

	public Date getQoReqDate() {
		return this.qoReqDate;
	}

	public void setQoReqDate(Date qoReqDate) {
		this.qoReqDate = qoReqDate;
	}

	public Date getQoDueDate() {
		return this.qoDueDate;
	}

	public void setQoDueDate(Date qoDueDate) {
		this.qoDueDate = qoDueDate;
	}

	public String getQoRmks() {
		return this.qoRmks;
	}

	public void setQoRmks(String qoRmks) {
		this.qoRmks = qoRmks;
	}

	public String getQoCrTerms() {
		return this.qoCrTerms;
	}

	public void setQoCrTerms(String qoCrTerms) {
		this.qoCrTerms = qoCrTerms;
	}

	public String getQoFob() {
		return this.qoFob;
	}

	public void setQoFob(String qoFob) {
		this.qoFob = qoFob;
	}

	public String getQoPo() {
		return this.qoPo;
	}

	public void setQoPo(String qoPo) {
		this.qoPo = qoPo;
	}

	public String getQoShipvia() {
		return this.qoShipvia;
	}

	public void setQoShipvia(String qoShipvia) {
		this.qoShipvia = qoShipvia;
	}

	public Boolean getQoPartial() {
		return this.qoPartial;
	}

	public void setQoPartial(Boolean qoPartial) {
		this.qoPartial = qoPartial;
	}

	public Boolean getQoPrintQo() {
		return this.qoPrintQo;
	}

	public void setQoPrintQo(Boolean qoPrintQo) {
		this.qoPrintQo = qoPrintQo;
	}

	public String getQoPrList() {
		return this.qoPrList;
	}

	public void setQoPrList(String qoPrList) {
		this.qoPrList = qoPrList;
	}

	public String getQoXslspsn() {
		return this.qoXslspsn;
	}

	public void setQoXslspsn(String qoXslspsn) {
		this.qoXslspsn = qoXslspsn;
	}

	public String getQoSource() {
		return this.qoSource;
	}

	public void setQoSource(String qoSource) {
		this.qoSource = qoSource;
	}

	public String getQoXcommPct() {
		return this.qoXcommPct;
	}

	public void setQoXcommPct(String qoXcommPct) {
		this.qoXcommPct = qoXcommPct;
	}

	public String getQoCrCard() {
		return this.qoCrCard;
	}

	public void setQoCrCard(String qoCrCard) {
		this.qoCrCard = qoCrCard;
	}

	public Boolean getQoPrintPl() {
		return this.qoPrintPl;
	}

	public void setQoPrintPl(Boolean qoPrintPl) {
		this.qoPrintPl = qoPrintPl;
	}

	public String getQoCrInit() {
		return this.qoCrInit;
	}

	public void setQoCrInit(String qoCrInit) {
		this.qoCrInit = qoCrInit;
	}

	public String getQoStat() {
		return this.qoStat;
	}

	public void setQoStat(String qoStat) {
		this.qoStat = qoStat;
	}

	public Double getQoQad01() {
		return this.qoQad01;
	}

	public void setQoQad01(Double qoQad01) {
		this.qoQad01 = qoQad01;
	}

	public Double getQoQad02() {
		return this.qoQad02;
	}

	public void setQoQad02(Double qoQad02) {
		this.qoQad02 = qoQad02;
	}

	public Double getQoQad03() {
		return this.qoQad03;
	}

	public void setQoQad03(Double qoQad03) {
		this.qoQad03 = qoQad03;
	}

	public Double getQoDiscPct() {
		return this.qoDiscPct;
	}

	public void setQoDiscPct(Double qoDiscPct) {
		this.qoDiscPct = qoDiscPct;
	}

	public String getQoTaxPct() {
		return this.qoTaxPct;
	}

	public void setQoTaxPct(String qoTaxPct) {
		this.qoTaxPct = qoTaxPct;
	}

	public Double getQoPrepaid() {
		return this.qoPrepaid;
	}

	public void setQoPrepaid(Double qoPrepaid) {
		this.qoPrepaid = qoPrepaid;
	}

	public String getQoArAcct() {
		return this.qoArAcct;
	}

	public void setQoArAcct(String qoArAcct) {
		this.qoArAcct = qoArAcct;
	}

	public String getQoArCc() {
		return this.qoArCc;
	}

	public void setQoArCc(String qoArCc) {
		this.qoArCc = qoArCc;
	}

	public Date getQoShipDate() {
		return this.qoShipDate;
	}

	public void setQoShipDate(Date qoShipDate) {
		this.qoShipDate = qoShipDate;
	}

	public Boolean getQoTaxable() {
		return this.qoTaxable;
	}

	public void setQoTaxable(Boolean qoTaxable) {
		this.qoTaxable = qoTaxable;
	}

	public Integer getQoCmtindx() {
		return this.qoCmtindx;
	}

	public void setQoCmtindx(Integer qoCmtindx) {
		this.qoCmtindx = qoCmtindx;
	}

	public Integer getQoQad04() {
		return this.qoQad04;
	}

	public void setQoQad04(Integer qoQad04) {
		this.qoQad04 = qoQad04;
	}

	public String getQoUser1() {
		return this.qoUser1;
	}

	public void setQoUser1(String qoUser1) {
		this.qoUser1 = qoUser1;
	}

	public String getQoUser2() {
		return this.qoUser2;
	}

	public void setQoUser2(String qoUser2) {
		this.qoUser2 = qoUser2;
	}

	public String getQoSoNbr() {
		return this.qoSoNbr;
	}

	public void setQoSoNbr(String qoSoNbr) {
		this.qoSoNbr = qoSoNbr;
	}

	public Date getQoConfirm() {
		return this.qoConfirm;
	}

	public void setQoConfirm(Date qoConfirm) {
		this.qoConfirm = qoConfirm;
	}

	public Date getQoExpDate() {
		return this.qoExpDate;
	}

	public void setQoExpDate(Date qoExpDate) {
		this.qoExpDate = qoExpDate;
	}

	public Date getQoRelDate() {
		return this.qoRelDate;
	}

	public void setQoRelDate(Date qoRelDate) {
		this.qoRelDate = qoRelDate;
	}

	public Boolean getQoRelease() {
		return this.qoRelease;
	}

	public void setQoRelease(Boolean qoRelease) {
		this.qoRelease = qoRelease;
	}

	public Boolean getQoRecur() {
		return this.qoRecur;
	}

	public void setQoRecur(Boolean qoRecur) {
		this.qoRecur = qoRecur;
	}

	public String getQoCycle() {
		return this.qoCycle;
	}

	public void setQoCycle(String qoCycle) {
		this.qoCycle = qoCycle;
	}

	public Integer getQoRelCnt() {
		return this.qoRelCnt;
	}

	public void setQoRelCnt(Integer qoRelCnt) {
		this.qoRelCnt = qoRelCnt;
	}

	public Date getQoFlwDate() {
		return this.qoFlwDate;
	}

	public void setQoFlwDate(Date qoFlwDate) {
		this.qoFlwDate = qoFlwDate;
	}

	public String getQoCurr() {
		return this.qoCurr;
	}

	public void setQoCurr(String qoCurr) {
		this.qoCurr = qoCurr;
	}

	public Double getQoExRate() {
		return this.qoExRate;
	}

	public void setQoExRate(Double qoExRate) {
		this.qoExRate = qoExRate;
	}

	public String getQoLang() {
		return this.qoLang;
	}

	public void setQoLang(String qoLang) {
		this.qoLang = qoLang;
	}

	public String getQoQad05() {
		return this.qoQad05;
	}

	public void setQoQad05(String qoQad05) {
		this.qoQad05 = qoQad05;
	}

	public Boolean getQoPst() {
		return this.qoPst;
	}

	public void setQoPst(Boolean qoPst) {
		this.qoPst = qoPst;
	}

	public String getQoFstId() {
		return this.qoFstId;
	}

	public void setQoFstId(String qoFstId) {
		this.qoFstId = qoFstId;
	}

	public String getQoPstId() {
		return this.qoPstId;
	}

	public void setQoPstId(String qoPstId) {
		this.qoPstId = qoPstId;
	}

	public Double getQoTrl1Amt() {
		return this.qoTrl1Amt;
	}

	public void setQoTrl1Amt(Double qoTrl1Amt) {
		this.qoTrl1Amt = qoTrl1Amt;
	}

	public String getQoTrl1Cd() {
		return this.qoTrl1Cd;
	}

	public void setQoTrl1Cd(String qoTrl1Cd) {
		this.qoTrl1Cd = qoTrl1Cd;
	}

	public Double getQoTrl2Amt() {
		return this.qoTrl2Amt;
	}

	public void setQoTrl2Amt(Double qoTrl2Amt) {
		this.qoTrl2Amt = qoTrl2Amt;
	}

	public String getQoTrl2Cd() {
		return this.qoTrl2Cd;
	}

	public void setQoTrl2Cd(String qoTrl2Cd) {
		this.qoTrl2Cd = qoTrl2Cd;
	}

	public Double getQoTrl3Amt() {
		return this.qoTrl3Amt;
	}

	public void setQoTrl3Amt(Double qoTrl3Amt) {
		this.qoTrl3Amt = qoTrl3Amt;
	}

	public String getQoTrl3Cd() {
		return this.qoTrl3Cd;
	}

	public void setQoTrl3Cd(String qoTrl3Cd) {
		this.qoTrl3Cd = qoTrl3Cd;
	}

	public Double getQoWeight() {
		return this.qoWeight;
	}

	public void setQoWeight(Double qoWeight) {
		this.qoWeight = qoWeight;
	}

	public String getQoWeightUm() {
		return this.qoWeightUm;
	}

	public void setQoWeightUm(String qoWeightUm) {
		this.qoWeightUm = qoWeightUm;
	}

	public Double getQoSize() {
		return this.qoSize;
	}

	public void setQoSize(Double qoSize) {
		this.qoSize = qoSize;
	}

	public String getQoSizeUm() {
		return this.qoSizeUm;
	}

	public void setQoSizeUm(String qoSizeUm) {
		this.qoSizeUm = qoSizeUm;
	}

	public Integer getQoCartons() {
		return this.qoCartons;
	}

	public void setQoCartons(Integer qoCartons) {
		this.qoCartons = qoCartons;
	}

	public String getQoBol() {
		return this.qoBol;
	}

	public void setQoBol(String qoBol) {
		this.qoBol = qoBol;
	}

	public String getQoSite() {
		return this.qoSite;
	}

	public void setQoSite(String qoSite) {
		this.qoSite = qoSite;
	}

	public String getQoTaxc() {
		return this.qoTaxc;
	}

	public void setQoTaxc(String qoTaxc) {
		this.qoTaxc = qoTaxc;
	}

	public String getQoChr01() {
		return this.qoChr01;
	}

	public void setQoChr01(String qoChr01) {
		this.qoChr01 = qoChr01;
	}

	public String getQoChr02() {
		return this.qoChr02;
	}

	public void setQoChr02(String qoChr02) {
		this.qoChr02 = qoChr02;
	}

	public String getQoChr03() {
		return this.qoChr03;
	}

	public void setQoChr03(String qoChr03) {
		this.qoChr03 = qoChr03;
	}

	public String getQoChr04() {
		return this.qoChr04;
	}

	public void setQoChr04(String qoChr04) {
		this.qoChr04 = qoChr04;
	}

	public String getQoChr05() {
		return this.qoChr05;
	}

	public void setQoChr05(String qoChr05) {
		this.qoChr05 = qoChr05;
	}

	public String getQoChr06() {
		return this.qoChr06;
	}

	public void setQoChr06(String qoChr06) {
		this.qoChr06 = qoChr06;
	}

	public String getQoChr07() {
		return this.qoChr07;
	}

	public void setQoChr07(String qoChr07) {
		this.qoChr07 = qoChr07;
	}

	public String getQoChr08() {
		return this.qoChr08;
	}

	public void setQoChr08(String qoChr08) {
		this.qoChr08 = qoChr08;
	}

	public String getQoChr09() {
		return this.qoChr09;
	}

	public void setQoChr09(String qoChr09) {
		this.qoChr09 = qoChr09;
	}

	public String getQoChr10() {
		return this.qoChr10;
	}

	public void setQoChr10(String qoChr10) {
		this.qoChr10 = qoChr10;
	}

	public Date getQoDte01() {
		return this.qoDte01;
	}

	public void setQoDte01(Date qoDte01) {
		this.qoDte01 = qoDte01;
	}

	public Date getQoDte02() {
		return this.qoDte02;
	}

	public void setQoDte02(Date qoDte02) {
		this.qoDte02 = qoDte02;
	}

	public Double getQoDec01() {
		return this.qoDec01;
	}

	public void setQoDec01(Double qoDec01) {
		this.qoDec01 = qoDec01;
	}

	public Double getQoDec02() {
		return this.qoDec02;
	}

	public void setQoDec02(Double qoDec02) {
		this.qoDec02 = qoDec02;
	}

	public Boolean getQoLog01() {
		return this.qoLog01;
	}

	public void setQoLog01(Boolean qoLog01) {
		this.qoLog01 = qoLog01;
	}

	public String getQoProject() {
		return this.qoProject;
	}

	public void setQoProject(String qoProject) {
		this.qoProject = qoProject;
	}

	public Integer getQoRev() {
		return this.qoRev;
	}

	public void setQoRev(Integer qoRev) {
		this.qoRev = qoRev;
	}

	public Double getQoPstPct() {
		return this.qoPstPct;
	}

	public void setQoPstPct(Double qoPstPct) {
		this.qoPstPct = qoPstPct;
	}

	public String getQoFrList() {
		return this.qoFrList;
	}

	public void setQoFrList(String qoFrList) {
		this.qoFrList = qoFrList;
	}

	public String getQoFrTerms() {
		return this.qoFrTerms;
	}

	public void setQoFrTerms(String qoFrTerms) {
		this.qoFrTerms = qoFrTerms;
	}

	public String getQoCommPct() {
		return this.qoCommPct;
	}

	public void setQoCommPct(String qoCommPct) {
		this.qoCommPct = qoCommPct;
	}

	public String getQoSlspsn() {
		return this.qoSlspsn;
	}

	public void setQoSlspsn(String qoSlspsn) {
		this.qoSlspsn = qoSlspsn;
	}

	public Boolean getQoFixRate() {
		return this.qoFixRate;
	}

	public void setQoFixRate(Boolean qoFixRate) {
		this.qoFixRate = qoFixRate;
	}

	public Double getQoEntEx() {
		return this.qoEntEx;
	}

	public void setQoEntEx(Double qoEntEx) {
		this.qoEntEx = qoEntEx;
	}

	public String getQoBill() {
		return this.qoBill;
	}

	public void setQoBill(String qoBill) {
		this.qoBill = qoBill;
	}

	public Boolean getQoPrintBl() {
		return this.qoPrintBl;
	}

	public void setQoPrintBl(Boolean qoPrintBl) {
		this.qoPrintBl = qoPrintBl;
	}

	public String getQoUserid() {
		return this.qoUserid;
	}

	public void setQoUserid(String qoUserid) {
		this.qoUserid = qoUserid;
	}

	public Date getQoTaxDate() {
		return this.qoTaxDate;
	}

	public void setQoTaxDate(Date qoTaxDate) {
		this.qoTaxDate = qoTaxDate;
	}

	public String getQoChannel() {
		return this.qoChannel;
	}

	public void setQoChannel(String qoChannel) {
		this.qoChannel = qoChannel;
	}

	public String getQoInvMthd() {
		return this.qoInvMthd;
	}

	public void setQoInvMthd(String qoInvMthd) {
		this.qoInvMthd = qoInvMthd;
	}

	public String getQoBank() {
		return this.qoBank;
	}

	public void setQoBank(String qoBank) {
		this.qoBank = qoBank;
	}

	public Double getQoFrMinWt() {
		return this.qoFrMinWt;
	}

	public void setQoFrMinWt(Double qoFrMinWt) {
		this.qoFrMinWt = qoFrMinWt;
	}

	public String getQoPrList2() {
		return this.qoPrList2;
	}

	public void setQoPrList2(String qoPrList2) {
		this.qoPrList2 = qoPrList2;
	}

	public String getQoTaxEnv() {
		return this.qoTaxEnv;
	}

	public void setQoTaxEnv(String qoTaxEnv) {
		this.qoTaxEnv = qoTaxEnv;
	}

	public String getQoTaxUsage() {
		return this.qoTaxUsage;
	}

	public void setQoTaxUsage(String qoTaxUsage) {
		this.qoTaxUsage = qoTaxUsage;
	}

	public Date getQoPricedDt() {
		return this.qoPricedDt;
	}

	public void setQoPricedDt(Date qoPricedDt) {
		this.qoPricedDt = qoPricedDt;
	}

	public Date getQoPricingDt() {
		return this.qoPricingDt;
	}

	public void setQoPricingDt(Date qoPricingDt) {
		this.qoPricingDt = qoPricingDt;
	}

	public Double getQoExRate2() {
		return this.qoExRate2;
	}

	public void setQoExRate2(Double qoExRate2) {
		this.qoExRate2 = qoExRate2;
	}

	public String getQoExRatetype() {
		return this.qoExRatetype;
	}

	public void setQoExRatetype(String qoExRatetype) {
		this.qoExRatetype = qoExRatetype;
	}

	public String getQoDiv() {
		return this.qoDiv;
	}

	public void setQoDiv(String qoDiv) {
		this.qoDiv = qoDiv;
	}

	public Integer getQoExruSeq() {
		return this.qoExruSeq;
	}

	public void setQoExruSeq(Integer qoExruSeq) {
		this.qoExruSeq = qoExruSeq;
	}

	public String getQoArSub() {
		return this.qoArSub;
	}

	public void setQoArSub(String qoArSub) {
		this.qoArSub = qoArSub;
	}

	public String getQoAppOwner() {
		return this.qoAppOwner;
	}

	public void setQoAppOwner(String qoAppOwner) {
		this.qoAppOwner = qoAppOwner;
	}

	public Boolean getQoManualFrTerms() {
		return this.qoManualFrTerms;
	}

	public void setQoManualFrTerms(Boolean qoManualFrTerms) {
		this.qoManualFrTerms = qoManualFrTerms;
	}

	public Double getOidQoMstr() {
		return this.oidQoMstr;
	}

	public void setOidQoMstr(Double oidQoMstr) {
		this.oidQoMstr = oidQoMstr;
	}

}