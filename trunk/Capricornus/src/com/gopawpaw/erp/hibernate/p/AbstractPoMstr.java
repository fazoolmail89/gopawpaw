package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPoMstr entity provides the base persistence definition of the PoMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPoMstr implements java.io.Serializable {

	// Fields

	private PoMstrId id;
	private String poVend;
	private String poShip;
	private Date poOrdDate;
	private String poRmks;
	private String poCrTerms;
	private String poBuyer;
	private String poShipvia;
	private String poFob;
	private String poBill;
	private Boolean poQad04;
	private Boolean poPartial;
	private Double poRev;
	private String poStat;
	private String poApAcct;
	private String poApCc;
	private Double poFrt;
	private Double poServChg;
	private Double poSpecChg;
	private String poTaxPct;
	private Double poDiscPct;
	private Double poPrepaid;
	private String poContact;
	private Boolean poConfirm;
	private Integer poCmtindx;
	private Boolean poPrint;
	private Date poClsDate;
	private Boolean poTaxable;
	private String poUser1;
	private String poUser2;
	private String poCurr;
	private Double poExRate;
	private String poLang;
	private String poFstId;
	private String poPstId;
	private Boolean poPst;
	private String poDutyType;
	private Double poQad05;
	private String poQad07;
	private String poQad08;
	private String poSite;
	private String poBlanket;
	private Date poQad01;
	private Integer poQad02;
	private String poQad03;
	private String poContract;
	private String poDelTo;
	private Date poDueDate;
	private Date poEffStrt;
	private Date poEffTo;
	private Double poEstValue;
	private Boolean poQad06;
	private String poProject;
	private Integer poRelNbr;
	private String poReqId;
	private String poType;
	private String poUserId;
	private Double poQad09;
	private Boolean poRelease;
	private Boolean poRecurr;
	private String poCycl;
	private String poChr01;
	private String poChr02;
	private String poChr03;
	private String poChr04;
	private String poChr05;
	private String poChr06;
	private String poChr07;
	private String poChr08;
	private String poChr09;
	private String poChr10;
	private Date poDte01;
	private Date poDte02;
	private Double poDec01;
	private Double poDec02;
	private Boolean poLog01;
	private String poInvMthd;
	private Boolean poFixRate;
	private Double poEntEx;
	private Date poTaxDate;
	private String poFsmType;
	private String poBank;
	private String poPrList;
	private String poTaxEnv;
	private Boolean poSched;
	private String poPrList2;
	private String poTaxUsage;
	private Boolean poFixPr;
	private String poTaxc;
	private String poSchMthd;
	private Date poPricedDt;
	private Date poPricingDt;
	private String poErsOpt;
	private Integer poPrLstTp;
	private String poQadc01;
	private String poQadc02;
	private Double poQadd01;
	private Double poQadd02;
	private Integer poQadi01;
	private Integer poQadi02;
	private String poSoNbr;
	private Boolean poIsBtb;
	private Boolean poSoHold;
	private String poXmit;
	private Double poExRate2;
	private String poExRatetype;
	private Integer poExruSeq;
	private String poApSub;
	private Double poCrtInt;
	private Boolean poConsignment;
	private Integer poMaxAgingDays;
	private String poAppOwner;
	private String poTotTermsCode;
	private Double poTransltDays;
	private Double oidPoMstr;

	// Constructors

	/** default constructor */
	public AbstractPoMstr() {
	}

	/** minimal constructor */
	public AbstractPoMstr(PoMstrId id, String poSoNbr, Boolean poIsBtb,
			Boolean poSoHold, String poXmit, Double poExRate2,
			String poExRatetype, Integer poExruSeq, Boolean poConsignment,
			Integer poMaxAgingDays, String poAppOwner, String poTotTermsCode,
			Double poTransltDays, Double oidPoMstr) {
		this.id = id;
		this.poSoNbr = poSoNbr;
		this.poIsBtb = poIsBtb;
		this.poSoHold = poSoHold;
		this.poXmit = poXmit;
		this.poExRate2 = poExRate2;
		this.poExRatetype = poExRatetype;
		this.poExruSeq = poExruSeq;
		this.poConsignment = poConsignment;
		this.poMaxAgingDays = poMaxAgingDays;
		this.poAppOwner = poAppOwner;
		this.poTotTermsCode = poTotTermsCode;
		this.poTransltDays = poTransltDays;
		this.oidPoMstr = oidPoMstr;
	}

	/** full constructor */
	public AbstractPoMstr(PoMstrId id, String poVend, String poShip,
			Date poOrdDate, String poRmks, String poCrTerms, String poBuyer,
			String poShipvia, String poFob, String poBill, Boolean poQad04,
			Boolean poPartial, Double poRev, String poStat, String poApAcct,
			String poApCc, Double poFrt, Double poServChg, Double poSpecChg,
			String poTaxPct, Double poDiscPct, Double poPrepaid,
			String poContact, Boolean poConfirm, Integer poCmtindx,
			Boolean poPrint, Date poClsDate, Boolean poTaxable, String poUser1,
			String poUser2, String poCurr, Double poExRate, String poLang,
			String poFstId, String poPstId, Boolean poPst, String poDutyType,
			Double poQad05, String poQad07, String poQad08, String poSite,
			String poBlanket, Date poQad01, Integer poQad02, String poQad03,
			String poContract, String poDelTo, Date poDueDate, Date poEffStrt,
			Date poEffTo, Double poEstValue, Boolean poQad06, String poProject,
			Integer poRelNbr, String poReqId, String poType, String poUserId,
			Double poQad09, Boolean poRelease, Boolean poRecurr, String poCycl,
			String poChr01, String poChr02, String poChr03, String poChr04,
			String poChr05, String poChr06, String poChr07, String poChr08,
			String poChr09, String poChr10, Date poDte01, Date poDte02,
			Double poDec01, Double poDec02, Boolean poLog01, String poInvMthd,
			Boolean poFixRate, Double poEntEx, Date poTaxDate,
			String poFsmType, String poBank, String poPrList, String poTaxEnv,
			Boolean poSched, String poPrList2, String poTaxUsage,
			Boolean poFixPr, String poTaxc, String poSchMthd, Date poPricedDt,
			Date poPricingDt, String poErsOpt, Integer poPrLstTp,
			String poQadc01, String poQadc02, Double poQadd01, Double poQadd02,
			Integer poQadi01, Integer poQadi02, String poSoNbr,
			Boolean poIsBtb, Boolean poSoHold, String poXmit, Double poExRate2,
			String poExRatetype, Integer poExruSeq, String poApSub,
			Double poCrtInt, Boolean poConsignment, Integer poMaxAgingDays,
			String poAppOwner, String poTotTermsCode, Double poTransltDays,
			Double oidPoMstr) {
		this.id = id;
		this.poVend = poVend;
		this.poShip = poShip;
		this.poOrdDate = poOrdDate;
		this.poRmks = poRmks;
		this.poCrTerms = poCrTerms;
		this.poBuyer = poBuyer;
		this.poShipvia = poShipvia;
		this.poFob = poFob;
		this.poBill = poBill;
		this.poQad04 = poQad04;
		this.poPartial = poPartial;
		this.poRev = poRev;
		this.poStat = poStat;
		this.poApAcct = poApAcct;
		this.poApCc = poApCc;
		this.poFrt = poFrt;
		this.poServChg = poServChg;
		this.poSpecChg = poSpecChg;
		this.poTaxPct = poTaxPct;
		this.poDiscPct = poDiscPct;
		this.poPrepaid = poPrepaid;
		this.poContact = poContact;
		this.poConfirm = poConfirm;
		this.poCmtindx = poCmtindx;
		this.poPrint = poPrint;
		this.poClsDate = poClsDate;
		this.poTaxable = poTaxable;
		this.poUser1 = poUser1;
		this.poUser2 = poUser2;
		this.poCurr = poCurr;
		this.poExRate = poExRate;
		this.poLang = poLang;
		this.poFstId = poFstId;
		this.poPstId = poPstId;
		this.poPst = poPst;
		this.poDutyType = poDutyType;
		this.poQad05 = poQad05;
		this.poQad07 = poQad07;
		this.poQad08 = poQad08;
		this.poSite = poSite;
		this.poBlanket = poBlanket;
		this.poQad01 = poQad01;
		this.poQad02 = poQad02;
		this.poQad03 = poQad03;
		this.poContract = poContract;
		this.poDelTo = poDelTo;
		this.poDueDate = poDueDate;
		this.poEffStrt = poEffStrt;
		this.poEffTo = poEffTo;
		this.poEstValue = poEstValue;
		this.poQad06 = poQad06;
		this.poProject = poProject;
		this.poRelNbr = poRelNbr;
		this.poReqId = poReqId;
		this.poType = poType;
		this.poUserId = poUserId;
		this.poQad09 = poQad09;
		this.poRelease = poRelease;
		this.poRecurr = poRecurr;
		this.poCycl = poCycl;
		this.poChr01 = poChr01;
		this.poChr02 = poChr02;
		this.poChr03 = poChr03;
		this.poChr04 = poChr04;
		this.poChr05 = poChr05;
		this.poChr06 = poChr06;
		this.poChr07 = poChr07;
		this.poChr08 = poChr08;
		this.poChr09 = poChr09;
		this.poChr10 = poChr10;
		this.poDte01 = poDte01;
		this.poDte02 = poDte02;
		this.poDec01 = poDec01;
		this.poDec02 = poDec02;
		this.poLog01 = poLog01;
		this.poInvMthd = poInvMthd;
		this.poFixRate = poFixRate;
		this.poEntEx = poEntEx;
		this.poTaxDate = poTaxDate;
		this.poFsmType = poFsmType;
		this.poBank = poBank;
		this.poPrList = poPrList;
		this.poTaxEnv = poTaxEnv;
		this.poSched = poSched;
		this.poPrList2 = poPrList2;
		this.poTaxUsage = poTaxUsage;
		this.poFixPr = poFixPr;
		this.poTaxc = poTaxc;
		this.poSchMthd = poSchMthd;
		this.poPricedDt = poPricedDt;
		this.poPricingDt = poPricingDt;
		this.poErsOpt = poErsOpt;
		this.poPrLstTp = poPrLstTp;
		this.poQadc01 = poQadc01;
		this.poQadc02 = poQadc02;
		this.poQadd01 = poQadd01;
		this.poQadd02 = poQadd02;
		this.poQadi01 = poQadi01;
		this.poQadi02 = poQadi02;
		this.poSoNbr = poSoNbr;
		this.poIsBtb = poIsBtb;
		this.poSoHold = poSoHold;
		this.poXmit = poXmit;
		this.poExRate2 = poExRate2;
		this.poExRatetype = poExRatetype;
		this.poExruSeq = poExruSeq;
		this.poApSub = poApSub;
		this.poCrtInt = poCrtInt;
		this.poConsignment = poConsignment;
		this.poMaxAgingDays = poMaxAgingDays;
		this.poAppOwner = poAppOwner;
		this.poTotTermsCode = poTotTermsCode;
		this.poTransltDays = poTransltDays;
		this.oidPoMstr = oidPoMstr;
	}

	// Property accessors

	public PoMstrId getId() {
		return this.id;
	}

	public void setId(PoMstrId id) {
		this.id = id;
	}

	public String getPoVend() {
		return this.poVend;
	}

	public void setPoVend(String poVend) {
		this.poVend = poVend;
	}

	public String getPoShip() {
		return this.poShip;
	}

	public void setPoShip(String poShip) {
		this.poShip = poShip;
	}

	public Date getPoOrdDate() {
		return this.poOrdDate;
	}

	public void setPoOrdDate(Date poOrdDate) {
		this.poOrdDate = poOrdDate;
	}

	public String getPoRmks() {
		return this.poRmks;
	}

	public void setPoRmks(String poRmks) {
		this.poRmks = poRmks;
	}

	public String getPoCrTerms() {
		return this.poCrTerms;
	}

	public void setPoCrTerms(String poCrTerms) {
		this.poCrTerms = poCrTerms;
	}

	public String getPoBuyer() {
		return this.poBuyer;
	}

	public void setPoBuyer(String poBuyer) {
		this.poBuyer = poBuyer;
	}

	public String getPoShipvia() {
		return this.poShipvia;
	}

	public void setPoShipvia(String poShipvia) {
		this.poShipvia = poShipvia;
	}

	public String getPoFob() {
		return this.poFob;
	}

	public void setPoFob(String poFob) {
		this.poFob = poFob;
	}

	public String getPoBill() {
		return this.poBill;
	}

	public void setPoBill(String poBill) {
		this.poBill = poBill;
	}

	public Boolean getPoQad04() {
		return this.poQad04;
	}

	public void setPoQad04(Boolean poQad04) {
		this.poQad04 = poQad04;
	}

	public Boolean getPoPartial() {
		return this.poPartial;
	}

	public void setPoPartial(Boolean poPartial) {
		this.poPartial = poPartial;
	}

	public Double getPoRev() {
		return this.poRev;
	}

	public void setPoRev(Double poRev) {
		this.poRev = poRev;
	}

	public String getPoStat() {
		return this.poStat;
	}

	public void setPoStat(String poStat) {
		this.poStat = poStat;
	}

	public String getPoApAcct() {
		return this.poApAcct;
	}

	public void setPoApAcct(String poApAcct) {
		this.poApAcct = poApAcct;
	}

	public String getPoApCc() {
		return this.poApCc;
	}

	public void setPoApCc(String poApCc) {
		this.poApCc = poApCc;
	}

	public Double getPoFrt() {
		return this.poFrt;
	}

	public void setPoFrt(Double poFrt) {
		this.poFrt = poFrt;
	}

	public Double getPoServChg() {
		return this.poServChg;
	}

	public void setPoServChg(Double poServChg) {
		this.poServChg = poServChg;
	}

	public Double getPoSpecChg() {
		return this.poSpecChg;
	}

	public void setPoSpecChg(Double poSpecChg) {
		this.poSpecChg = poSpecChg;
	}

	public String getPoTaxPct() {
		return this.poTaxPct;
	}

	public void setPoTaxPct(String poTaxPct) {
		this.poTaxPct = poTaxPct;
	}

	public Double getPoDiscPct() {
		return this.poDiscPct;
	}

	public void setPoDiscPct(Double poDiscPct) {
		this.poDiscPct = poDiscPct;
	}

	public Double getPoPrepaid() {
		return this.poPrepaid;
	}

	public void setPoPrepaid(Double poPrepaid) {
		this.poPrepaid = poPrepaid;
	}

	public String getPoContact() {
		return this.poContact;
	}

	public void setPoContact(String poContact) {
		this.poContact = poContact;
	}

	public Boolean getPoConfirm() {
		return this.poConfirm;
	}

	public void setPoConfirm(Boolean poConfirm) {
		this.poConfirm = poConfirm;
	}

	public Integer getPoCmtindx() {
		return this.poCmtindx;
	}

	public void setPoCmtindx(Integer poCmtindx) {
		this.poCmtindx = poCmtindx;
	}

	public Boolean getPoPrint() {
		return this.poPrint;
	}

	public void setPoPrint(Boolean poPrint) {
		this.poPrint = poPrint;
	}

	public Date getPoClsDate() {
		return this.poClsDate;
	}

	public void setPoClsDate(Date poClsDate) {
		this.poClsDate = poClsDate;
	}

	public Boolean getPoTaxable() {
		return this.poTaxable;
	}

	public void setPoTaxable(Boolean poTaxable) {
		this.poTaxable = poTaxable;
	}

	public String getPoUser1() {
		return this.poUser1;
	}

	public void setPoUser1(String poUser1) {
		this.poUser1 = poUser1;
	}

	public String getPoUser2() {
		return this.poUser2;
	}

	public void setPoUser2(String poUser2) {
		this.poUser2 = poUser2;
	}

	public String getPoCurr() {
		return this.poCurr;
	}

	public void setPoCurr(String poCurr) {
		this.poCurr = poCurr;
	}

	public Double getPoExRate() {
		return this.poExRate;
	}

	public void setPoExRate(Double poExRate) {
		this.poExRate = poExRate;
	}

	public String getPoLang() {
		return this.poLang;
	}

	public void setPoLang(String poLang) {
		this.poLang = poLang;
	}

	public String getPoFstId() {
		return this.poFstId;
	}

	public void setPoFstId(String poFstId) {
		this.poFstId = poFstId;
	}

	public String getPoPstId() {
		return this.poPstId;
	}

	public void setPoPstId(String poPstId) {
		this.poPstId = poPstId;
	}

	public Boolean getPoPst() {
		return this.poPst;
	}

	public void setPoPst(Boolean poPst) {
		this.poPst = poPst;
	}

	public String getPoDutyType() {
		return this.poDutyType;
	}

	public void setPoDutyType(String poDutyType) {
		this.poDutyType = poDutyType;
	}

	public Double getPoQad05() {
		return this.poQad05;
	}

	public void setPoQad05(Double poQad05) {
		this.poQad05 = poQad05;
	}

	public String getPoQad07() {
		return this.poQad07;
	}

	public void setPoQad07(String poQad07) {
		this.poQad07 = poQad07;
	}

	public String getPoQad08() {
		return this.poQad08;
	}

	public void setPoQad08(String poQad08) {
		this.poQad08 = poQad08;
	}

	public String getPoSite() {
		return this.poSite;
	}

	public void setPoSite(String poSite) {
		this.poSite = poSite;
	}

	public String getPoBlanket() {
		return this.poBlanket;
	}

	public void setPoBlanket(String poBlanket) {
		this.poBlanket = poBlanket;
	}

	public Date getPoQad01() {
		return this.poQad01;
	}

	public void setPoQad01(Date poQad01) {
		this.poQad01 = poQad01;
	}

	public Integer getPoQad02() {
		return this.poQad02;
	}

	public void setPoQad02(Integer poQad02) {
		this.poQad02 = poQad02;
	}

	public String getPoQad03() {
		return this.poQad03;
	}

	public void setPoQad03(String poQad03) {
		this.poQad03 = poQad03;
	}

	public String getPoContract() {
		return this.poContract;
	}

	public void setPoContract(String poContract) {
		this.poContract = poContract;
	}

	public String getPoDelTo() {
		return this.poDelTo;
	}

	public void setPoDelTo(String poDelTo) {
		this.poDelTo = poDelTo;
	}

	public Date getPoDueDate() {
		return this.poDueDate;
	}

	public void setPoDueDate(Date poDueDate) {
		this.poDueDate = poDueDate;
	}

	public Date getPoEffStrt() {
		return this.poEffStrt;
	}

	public void setPoEffStrt(Date poEffStrt) {
		this.poEffStrt = poEffStrt;
	}

	public Date getPoEffTo() {
		return this.poEffTo;
	}

	public void setPoEffTo(Date poEffTo) {
		this.poEffTo = poEffTo;
	}

	public Double getPoEstValue() {
		return this.poEstValue;
	}

	public void setPoEstValue(Double poEstValue) {
		this.poEstValue = poEstValue;
	}

	public Boolean getPoQad06() {
		return this.poQad06;
	}

	public void setPoQad06(Boolean poQad06) {
		this.poQad06 = poQad06;
	}

	public String getPoProject() {
		return this.poProject;
	}

	public void setPoProject(String poProject) {
		this.poProject = poProject;
	}

	public Integer getPoRelNbr() {
		return this.poRelNbr;
	}

	public void setPoRelNbr(Integer poRelNbr) {
		this.poRelNbr = poRelNbr;
	}

	public String getPoReqId() {
		return this.poReqId;
	}

	public void setPoReqId(String poReqId) {
		this.poReqId = poReqId;
	}

	public String getPoType() {
		return this.poType;
	}

	public void setPoType(String poType) {
		this.poType = poType;
	}

	public String getPoUserId() {
		return this.poUserId;
	}

	public void setPoUserId(String poUserId) {
		this.poUserId = poUserId;
	}

	public Double getPoQad09() {
		return this.poQad09;
	}

	public void setPoQad09(Double poQad09) {
		this.poQad09 = poQad09;
	}

	public Boolean getPoRelease() {
		return this.poRelease;
	}

	public void setPoRelease(Boolean poRelease) {
		this.poRelease = poRelease;
	}

	public Boolean getPoRecurr() {
		return this.poRecurr;
	}

	public void setPoRecurr(Boolean poRecurr) {
		this.poRecurr = poRecurr;
	}

	public String getPoCycl() {
		return this.poCycl;
	}

	public void setPoCycl(String poCycl) {
		this.poCycl = poCycl;
	}

	public String getPoChr01() {
		return this.poChr01;
	}

	public void setPoChr01(String poChr01) {
		this.poChr01 = poChr01;
	}

	public String getPoChr02() {
		return this.poChr02;
	}

	public void setPoChr02(String poChr02) {
		this.poChr02 = poChr02;
	}

	public String getPoChr03() {
		return this.poChr03;
	}

	public void setPoChr03(String poChr03) {
		this.poChr03 = poChr03;
	}

	public String getPoChr04() {
		return this.poChr04;
	}

	public void setPoChr04(String poChr04) {
		this.poChr04 = poChr04;
	}

	public String getPoChr05() {
		return this.poChr05;
	}

	public void setPoChr05(String poChr05) {
		this.poChr05 = poChr05;
	}

	public String getPoChr06() {
		return this.poChr06;
	}

	public void setPoChr06(String poChr06) {
		this.poChr06 = poChr06;
	}

	public String getPoChr07() {
		return this.poChr07;
	}

	public void setPoChr07(String poChr07) {
		this.poChr07 = poChr07;
	}

	public String getPoChr08() {
		return this.poChr08;
	}

	public void setPoChr08(String poChr08) {
		this.poChr08 = poChr08;
	}

	public String getPoChr09() {
		return this.poChr09;
	}

	public void setPoChr09(String poChr09) {
		this.poChr09 = poChr09;
	}

	public String getPoChr10() {
		return this.poChr10;
	}

	public void setPoChr10(String poChr10) {
		this.poChr10 = poChr10;
	}

	public Date getPoDte01() {
		return this.poDte01;
	}

	public void setPoDte01(Date poDte01) {
		this.poDte01 = poDte01;
	}

	public Date getPoDte02() {
		return this.poDte02;
	}

	public void setPoDte02(Date poDte02) {
		this.poDte02 = poDte02;
	}

	public Double getPoDec01() {
		return this.poDec01;
	}

	public void setPoDec01(Double poDec01) {
		this.poDec01 = poDec01;
	}

	public Double getPoDec02() {
		return this.poDec02;
	}

	public void setPoDec02(Double poDec02) {
		this.poDec02 = poDec02;
	}

	public Boolean getPoLog01() {
		return this.poLog01;
	}

	public void setPoLog01(Boolean poLog01) {
		this.poLog01 = poLog01;
	}

	public String getPoInvMthd() {
		return this.poInvMthd;
	}

	public void setPoInvMthd(String poInvMthd) {
		this.poInvMthd = poInvMthd;
	}

	public Boolean getPoFixRate() {
		return this.poFixRate;
	}

	public void setPoFixRate(Boolean poFixRate) {
		this.poFixRate = poFixRate;
	}

	public Double getPoEntEx() {
		return this.poEntEx;
	}

	public void setPoEntEx(Double poEntEx) {
		this.poEntEx = poEntEx;
	}

	public Date getPoTaxDate() {
		return this.poTaxDate;
	}

	public void setPoTaxDate(Date poTaxDate) {
		this.poTaxDate = poTaxDate;
	}

	public String getPoFsmType() {
		return this.poFsmType;
	}

	public void setPoFsmType(String poFsmType) {
		this.poFsmType = poFsmType;
	}

	public String getPoBank() {
		return this.poBank;
	}

	public void setPoBank(String poBank) {
		this.poBank = poBank;
	}

	public String getPoPrList() {
		return this.poPrList;
	}

	public void setPoPrList(String poPrList) {
		this.poPrList = poPrList;
	}

	public String getPoTaxEnv() {
		return this.poTaxEnv;
	}

	public void setPoTaxEnv(String poTaxEnv) {
		this.poTaxEnv = poTaxEnv;
	}

	public Boolean getPoSched() {
		return this.poSched;
	}

	public void setPoSched(Boolean poSched) {
		this.poSched = poSched;
	}

	public String getPoPrList2() {
		return this.poPrList2;
	}

	public void setPoPrList2(String poPrList2) {
		this.poPrList2 = poPrList2;
	}

	public String getPoTaxUsage() {
		return this.poTaxUsage;
	}

	public void setPoTaxUsage(String poTaxUsage) {
		this.poTaxUsage = poTaxUsage;
	}

	public Boolean getPoFixPr() {
		return this.poFixPr;
	}

	public void setPoFixPr(Boolean poFixPr) {
		this.poFixPr = poFixPr;
	}

	public String getPoTaxc() {
		return this.poTaxc;
	}

	public void setPoTaxc(String poTaxc) {
		this.poTaxc = poTaxc;
	}

	public String getPoSchMthd() {
		return this.poSchMthd;
	}

	public void setPoSchMthd(String poSchMthd) {
		this.poSchMthd = poSchMthd;
	}

	public Date getPoPricedDt() {
		return this.poPricedDt;
	}

	public void setPoPricedDt(Date poPricedDt) {
		this.poPricedDt = poPricedDt;
	}

	public Date getPoPricingDt() {
		return this.poPricingDt;
	}

	public void setPoPricingDt(Date poPricingDt) {
		this.poPricingDt = poPricingDt;
	}

	public String getPoErsOpt() {
		return this.poErsOpt;
	}

	public void setPoErsOpt(String poErsOpt) {
		this.poErsOpt = poErsOpt;
	}

	public Integer getPoPrLstTp() {
		return this.poPrLstTp;
	}

	public void setPoPrLstTp(Integer poPrLstTp) {
		this.poPrLstTp = poPrLstTp;
	}

	public String getPoQadc01() {
		return this.poQadc01;
	}

	public void setPoQadc01(String poQadc01) {
		this.poQadc01 = poQadc01;
	}

	public String getPoQadc02() {
		return this.poQadc02;
	}

	public void setPoQadc02(String poQadc02) {
		this.poQadc02 = poQadc02;
	}

	public Double getPoQadd01() {
		return this.poQadd01;
	}

	public void setPoQadd01(Double poQadd01) {
		this.poQadd01 = poQadd01;
	}

	public Double getPoQadd02() {
		return this.poQadd02;
	}

	public void setPoQadd02(Double poQadd02) {
		this.poQadd02 = poQadd02;
	}

	public Integer getPoQadi01() {
		return this.poQadi01;
	}

	public void setPoQadi01(Integer poQadi01) {
		this.poQadi01 = poQadi01;
	}

	public Integer getPoQadi02() {
		return this.poQadi02;
	}

	public void setPoQadi02(Integer poQadi02) {
		this.poQadi02 = poQadi02;
	}

	public String getPoSoNbr() {
		return this.poSoNbr;
	}

	public void setPoSoNbr(String poSoNbr) {
		this.poSoNbr = poSoNbr;
	}

	public Boolean getPoIsBtb() {
		return this.poIsBtb;
	}

	public void setPoIsBtb(Boolean poIsBtb) {
		this.poIsBtb = poIsBtb;
	}

	public Boolean getPoSoHold() {
		return this.poSoHold;
	}

	public void setPoSoHold(Boolean poSoHold) {
		this.poSoHold = poSoHold;
	}

	public String getPoXmit() {
		return this.poXmit;
	}

	public void setPoXmit(String poXmit) {
		this.poXmit = poXmit;
	}

	public Double getPoExRate2() {
		return this.poExRate2;
	}

	public void setPoExRate2(Double poExRate2) {
		this.poExRate2 = poExRate2;
	}

	public String getPoExRatetype() {
		return this.poExRatetype;
	}

	public void setPoExRatetype(String poExRatetype) {
		this.poExRatetype = poExRatetype;
	}

	public Integer getPoExruSeq() {
		return this.poExruSeq;
	}

	public void setPoExruSeq(Integer poExruSeq) {
		this.poExruSeq = poExruSeq;
	}

	public String getPoApSub() {
		return this.poApSub;
	}

	public void setPoApSub(String poApSub) {
		this.poApSub = poApSub;
	}

	public Double getPoCrtInt() {
		return this.poCrtInt;
	}

	public void setPoCrtInt(Double poCrtInt) {
		this.poCrtInt = poCrtInt;
	}

	public Boolean getPoConsignment() {
		return this.poConsignment;
	}

	public void setPoConsignment(Boolean poConsignment) {
		this.poConsignment = poConsignment;
	}

	public Integer getPoMaxAgingDays() {
		return this.poMaxAgingDays;
	}

	public void setPoMaxAgingDays(Integer poMaxAgingDays) {
		this.poMaxAgingDays = poMaxAgingDays;
	}

	public String getPoAppOwner() {
		return this.poAppOwner;
	}

	public void setPoAppOwner(String poAppOwner) {
		this.poAppOwner = poAppOwner;
	}

	public String getPoTotTermsCode() {
		return this.poTotTermsCode;
	}

	public void setPoTotTermsCode(String poTotTermsCode) {
		this.poTotTermsCode = poTotTermsCode;
	}

	public Double getPoTransltDays() {
		return this.poTransltDays;
	}

	public void setPoTransltDays(Double poTransltDays) {
		this.poTransltDays = poTransltDays;
	}

	public Double getOidPoMstr() {
		return this.oidPoMstr;
	}

	public void setOidPoMstr(Double oidPoMstr) {
		this.oidPoMstr = oidPoMstr;
	}

}