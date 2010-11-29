package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSacCtrl entity provides the base persistence definition of the
 * SacCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSacCtrl implements java.io.Serializable {

	// Fields

	private String sacDomain;
	private Integer sacFreeMth;
	private Boolean sacAutoSa;
	private Integer sacFreeGt;
	private Integer sacSa;
	private Boolean sacLnFmt;
	private Boolean sacFreeBe;
	private String sacChr01;
	private Boolean sacPrint;
	private String sacChr02;
	private String sacCompany;
	private String sacFob;
	private Boolean sacHcmmts;
	private Boolean sacLcmmts;
	private String sacChr03;
	private String sacChr04;
	private String sacChr05;
	private String sacChr06;
	private String sacTrlTax;
	private String sacChr07;
	private String sacChr08;
	private String sacChr09;
	private Integer sacQad01;
	private String sacTrlNtax;
	private String sacUser1;
	private String sacUser2;
	private Integer sacIndex1;
	private String sacSaPre;
	private Boolean sacSaqoNbr;
	private Integer sacQo;
	private String sacQoPre;
	private Integer sacSoNbr;
	private String sacSoPre;
	private String sacChr10;
	private Double sacDec01;
	private Double sacDec02;
	private Double sacDec03;
	private Date sacDte01;
	private Date sacDte02;
	private Date sacDte03;
	private Date sacDte04;
	private Boolean sacLog01;
	private Boolean sacLog02;
	private Boolean sacLog03;
	private Boolean sacLog04;
	private Boolean sacLog05;
	private Boolean sacSoHist;
	private Boolean sacContractPr;
	private Boolean sacGenDef;
	private Boolean sacQadl04;
	private String sacSaSite;
	private Boolean sacDeferred;
	private Boolean sacCallsMrp;
	private Boolean sacCreatePm;
	private Boolean sacLimitsWnd;
	private Integer sacRenewalDays;
	private String sacRenewFmt;
	private Boolean sacRevalBill;
	private Boolean sacRevalWnd;
	private Boolean sacRvidxNxtbl;
	private Boolean sacSaMulti;
	private Boolean sacUserPricing;
	private Boolean sacPmDays;
	private String sacQadc01;
	private String sacQadc02;
	private String sacQadc03;
	private Integer sacQadi01;
	private Integer sacQadi02;
	private Boolean sacQadl01;
	private Boolean sacQadl02;
	private Boolean sacQadl03;
	private String sacModUserid;
	private Date sacModDate;
	private String sacLimitCopy;
	private Boolean sacLimHist;
	private String sacExRatetype;
	private Boolean sacPtIsb;
	private String sacRevenue;
	private Boolean sacBillEnduser;
	private Boolean sacBillSummary;
	private Boolean sacItemEnduser;
	private Boolean sacEuTotals;
	private Boolean sacEuAddChrg;
	private Boolean sacAddChrg;
	private Double oidSacCtrl;

	// Constructors

	/** default constructor */
	public AbstractSacCtrl() {
	}

	/** minimal constructor */
	public AbstractSacCtrl(String sacExRatetype, Boolean sacPtIsb,
			String sacRevenue, Boolean sacBillEnduser, Boolean sacBillSummary,
			Boolean sacItemEnduser, Boolean sacEuTotals, Boolean sacEuAddChrg,
			Boolean sacAddChrg, Double oidSacCtrl) {
		this.sacExRatetype = sacExRatetype;
		this.sacPtIsb = sacPtIsb;
		this.sacRevenue = sacRevenue;
		this.sacBillEnduser = sacBillEnduser;
		this.sacBillSummary = sacBillSummary;
		this.sacItemEnduser = sacItemEnduser;
		this.sacEuTotals = sacEuTotals;
		this.sacEuAddChrg = sacEuAddChrg;
		this.sacAddChrg = sacAddChrg;
		this.oidSacCtrl = oidSacCtrl;
	}

	/** full constructor */
	public AbstractSacCtrl(Integer sacFreeMth, Boolean sacAutoSa,
			Integer sacFreeGt, Integer sacSa, Boolean sacLnFmt,
			Boolean sacFreeBe, String sacChr01, Boolean sacPrint,
			String sacChr02, String sacCompany, String sacFob,
			Boolean sacHcmmts, Boolean sacLcmmts, String sacChr03,
			String sacChr04, String sacChr05, String sacChr06,
			String sacTrlTax, String sacChr07, String sacChr08,
			String sacChr09, Integer sacQad01, String sacTrlNtax,
			String sacUser1, String sacUser2, Integer sacIndex1,
			String sacSaPre, Boolean sacSaqoNbr, Integer sacQo,
			String sacQoPre, Integer sacSoNbr, String sacSoPre,
			String sacChr10, Double sacDec01, Double sacDec02, Double sacDec03,
			Date sacDte01, Date sacDte02, Date sacDte03, Date sacDte04,
			Boolean sacLog01, Boolean sacLog02, Boolean sacLog03,
			Boolean sacLog04, Boolean sacLog05, Boolean sacSoHist,
			Boolean sacContractPr, Boolean sacGenDef, Boolean sacQadl04,
			String sacSaSite, Boolean sacDeferred, Boolean sacCallsMrp,
			Boolean sacCreatePm, Boolean sacLimitsWnd, Integer sacRenewalDays,
			String sacRenewFmt, Boolean sacRevalBill, Boolean sacRevalWnd,
			Boolean sacRvidxNxtbl, Boolean sacSaMulti, Boolean sacUserPricing,
			Boolean sacPmDays, String sacQadc01, String sacQadc02,
			String sacQadc03, Integer sacQadi01, Integer sacQadi02,
			Boolean sacQadl01, Boolean sacQadl02, Boolean sacQadl03,
			String sacModUserid, Date sacModDate, String sacLimitCopy,
			Boolean sacLimHist, String sacExRatetype, Boolean sacPtIsb,
			String sacRevenue, Boolean sacBillEnduser, Boolean sacBillSummary,
			Boolean sacItemEnduser, Boolean sacEuTotals, Boolean sacEuAddChrg,
			Boolean sacAddChrg, Double oidSacCtrl) {
		this.sacFreeMth = sacFreeMth;
		this.sacAutoSa = sacAutoSa;
		this.sacFreeGt = sacFreeGt;
		this.sacSa = sacSa;
		this.sacLnFmt = sacLnFmt;
		this.sacFreeBe = sacFreeBe;
		this.sacChr01 = sacChr01;
		this.sacPrint = sacPrint;
		this.sacChr02 = sacChr02;
		this.sacCompany = sacCompany;
		this.sacFob = sacFob;
		this.sacHcmmts = sacHcmmts;
		this.sacLcmmts = sacLcmmts;
		this.sacChr03 = sacChr03;
		this.sacChr04 = sacChr04;
		this.sacChr05 = sacChr05;
		this.sacChr06 = sacChr06;
		this.sacTrlTax = sacTrlTax;
		this.sacChr07 = sacChr07;
		this.sacChr08 = sacChr08;
		this.sacChr09 = sacChr09;
		this.sacQad01 = sacQad01;
		this.sacTrlNtax = sacTrlNtax;
		this.sacUser1 = sacUser1;
		this.sacUser2 = sacUser2;
		this.sacIndex1 = sacIndex1;
		this.sacSaPre = sacSaPre;
		this.sacSaqoNbr = sacSaqoNbr;
		this.sacQo = sacQo;
		this.sacQoPre = sacQoPre;
		this.sacSoNbr = sacSoNbr;
		this.sacSoPre = sacSoPre;
		this.sacChr10 = sacChr10;
		this.sacDec01 = sacDec01;
		this.sacDec02 = sacDec02;
		this.sacDec03 = sacDec03;
		this.sacDte01 = sacDte01;
		this.sacDte02 = sacDte02;
		this.sacDte03 = sacDte03;
		this.sacDte04 = sacDte04;
		this.sacLog01 = sacLog01;
		this.sacLog02 = sacLog02;
		this.sacLog03 = sacLog03;
		this.sacLog04 = sacLog04;
		this.sacLog05 = sacLog05;
		this.sacSoHist = sacSoHist;
		this.sacContractPr = sacContractPr;
		this.sacGenDef = sacGenDef;
		this.sacQadl04 = sacQadl04;
		this.sacSaSite = sacSaSite;
		this.sacDeferred = sacDeferred;
		this.sacCallsMrp = sacCallsMrp;
		this.sacCreatePm = sacCreatePm;
		this.sacLimitsWnd = sacLimitsWnd;
		this.sacRenewalDays = sacRenewalDays;
		this.sacRenewFmt = sacRenewFmt;
		this.sacRevalBill = sacRevalBill;
		this.sacRevalWnd = sacRevalWnd;
		this.sacRvidxNxtbl = sacRvidxNxtbl;
		this.sacSaMulti = sacSaMulti;
		this.sacUserPricing = sacUserPricing;
		this.sacPmDays = sacPmDays;
		this.sacQadc01 = sacQadc01;
		this.sacQadc02 = sacQadc02;
		this.sacQadc03 = sacQadc03;
		this.sacQadi01 = sacQadi01;
		this.sacQadi02 = sacQadi02;
		this.sacQadl01 = sacQadl01;
		this.sacQadl02 = sacQadl02;
		this.sacQadl03 = sacQadl03;
		this.sacModUserid = sacModUserid;
		this.sacModDate = sacModDate;
		this.sacLimitCopy = sacLimitCopy;
		this.sacLimHist = sacLimHist;
		this.sacExRatetype = sacExRatetype;
		this.sacPtIsb = sacPtIsb;
		this.sacRevenue = sacRevenue;
		this.sacBillEnduser = sacBillEnduser;
		this.sacBillSummary = sacBillSummary;
		this.sacItemEnduser = sacItemEnduser;
		this.sacEuTotals = sacEuTotals;
		this.sacEuAddChrg = sacEuAddChrg;
		this.sacAddChrg = sacAddChrg;
		this.oidSacCtrl = oidSacCtrl;
	}

	// Property accessors

	public String getSacDomain() {
		return this.sacDomain;
	}

	public void setSacDomain(String sacDomain) {
		this.sacDomain = sacDomain;
	}

	public Integer getSacFreeMth() {
		return this.sacFreeMth;
	}

	public void setSacFreeMth(Integer sacFreeMth) {
		this.sacFreeMth = sacFreeMth;
	}

	public Boolean getSacAutoSa() {
		return this.sacAutoSa;
	}

	public void setSacAutoSa(Boolean sacAutoSa) {
		this.sacAutoSa = sacAutoSa;
	}

	public Integer getSacFreeGt() {
		return this.sacFreeGt;
	}

	public void setSacFreeGt(Integer sacFreeGt) {
		this.sacFreeGt = sacFreeGt;
	}

	public Integer getSacSa() {
		return this.sacSa;
	}

	public void setSacSa(Integer sacSa) {
		this.sacSa = sacSa;
	}

	public Boolean getSacLnFmt() {
		return this.sacLnFmt;
	}

	public void setSacLnFmt(Boolean sacLnFmt) {
		this.sacLnFmt = sacLnFmt;
	}

	public Boolean getSacFreeBe() {
		return this.sacFreeBe;
	}

	public void setSacFreeBe(Boolean sacFreeBe) {
		this.sacFreeBe = sacFreeBe;
	}

	public String getSacChr01() {
		return this.sacChr01;
	}

	public void setSacChr01(String sacChr01) {
		this.sacChr01 = sacChr01;
	}

	public Boolean getSacPrint() {
		return this.sacPrint;
	}

	public void setSacPrint(Boolean sacPrint) {
		this.sacPrint = sacPrint;
	}

	public String getSacChr02() {
		return this.sacChr02;
	}

	public void setSacChr02(String sacChr02) {
		this.sacChr02 = sacChr02;
	}

	public String getSacCompany() {
		return this.sacCompany;
	}

	public void setSacCompany(String sacCompany) {
		this.sacCompany = sacCompany;
	}

	public String getSacFob() {
		return this.sacFob;
	}

	public void setSacFob(String sacFob) {
		this.sacFob = sacFob;
	}

	public Boolean getSacHcmmts() {
		return this.sacHcmmts;
	}

	public void setSacHcmmts(Boolean sacHcmmts) {
		this.sacHcmmts = sacHcmmts;
	}

	public Boolean getSacLcmmts() {
		return this.sacLcmmts;
	}

	public void setSacLcmmts(Boolean sacLcmmts) {
		this.sacLcmmts = sacLcmmts;
	}

	public String getSacChr03() {
		return this.sacChr03;
	}

	public void setSacChr03(String sacChr03) {
		this.sacChr03 = sacChr03;
	}

	public String getSacChr04() {
		return this.sacChr04;
	}

	public void setSacChr04(String sacChr04) {
		this.sacChr04 = sacChr04;
	}

	public String getSacChr05() {
		return this.sacChr05;
	}

	public void setSacChr05(String sacChr05) {
		this.sacChr05 = sacChr05;
	}

	public String getSacChr06() {
		return this.sacChr06;
	}

	public void setSacChr06(String sacChr06) {
		this.sacChr06 = sacChr06;
	}

	public String getSacTrlTax() {
		return this.sacTrlTax;
	}

	public void setSacTrlTax(String sacTrlTax) {
		this.sacTrlTax = sacTrlTax;
	}

	public String getSacChr07() {
		return this.sacChr07;
	}

	public void setSacChr07(String sacChr07) {
		this.sacChr07 = sacChr07;
	}

	public String getSacChr08() {
		return this.sacChr08;
	}

	public void setSacChr08(String sacChr08) {
		this.sacChr08 = sacChr08;
	}

	public String getSacChr09() {
		return this.sacChr09;
	}

	public void setSacChr09(String sacChr09) {
		this.sacChr09 = sacChr09;
	}

	public Integer getSacQad01() {
		return this.sacQad01;
	}

	public void setSacQad01(Integer sacQad01) {
		this.sacQad01 = sacQad01;
	}

	public String getSacTrlNtax() {
		return this.sacTrlNtax;
	}

	public void setSacTrlNtax(String sacTrlNtax) {
		this.sacTrlNtax = sacTrlNtax;
	}

	public String getSacUser1() {
		return this.sacUser1;
	}

	public void setSacUser1(String sacUser1) {
		this.sacUser1 = sacUser1;
	}

	public String getSacUser2() {
		return this.sacUser2;
	}

	public void setSacUser2(String sacUser2) {
		this.sacUser2 = sacUser2;
	}

	public Integer getSacIndex1() {
		return this.sacIndex1;
	}

	public void setSacIndex1(Integer sacIndex1) {
		this.sacIndex1 = sacIndex1;
	}

	public String getSacSaPre() {
		return this.sacSaPre;
	}

	public void setSacSaPre(String sacSaPre) {
		this.sacSaPre = sacSaPre;
	}

	public Boolean getSacSaqoNbr() {
		return this.sacSaqoNbr;
	}

	public void setSacSaqoNbr(Boolean sacSaqoNbr) {
		this.sacSaqoNbr = sacSaqoNbr;
	}

	public Integer getSacQo() {
		return this.sacQo;
	}

	public void setSacQo(Integer sacQo) {
		this.sacQo = sacQo;
	}

	public String getSacQoPre() {
		return this.sacQoPre;
	}

	public void setSacQoPre(String sacQoPre) {
		this.sacQoPre = sacQoPre;
	}

	public Integer getSacSoNbr() {
		return this.sacSoNbr;
	}

	public void setSacSoNbr(Integer sacSoNbr) {
		this.sacSoNbr = sacSoNbr;
	}

	public String getSacSoPre() {
		return this.sacSoPre;
	}

	public void setSacSoPre(String sacSoPre) {
		this.sacSoPre = sacSoPre;
	}

	public String getSacChr10() {
		return this.sacChr10;
	}

	public void setSacChr10(String sacChr10) {
		this.sacChr10 = sacChr10;
	}

	public Double getSacDec01() {
		return this.sacDec01;
	}

	public void setSacDec01(Double sacDec01) {
		this.sacDec01 = sacDec01;
	}

	public Double getSacDec02() {
		return this.sacDec02;
	}

	public void setSacDec02(Double sacDec02) {
		this.sacDec02 = sacDec02;
	}

	public Double getSacDec03() {
		return this.sacDec03;
	}

	public void setSacDec03(Double sacDec03) {
		this.sacDec03 = sacDec03;
	}

	public Date getSacDte01() {
		return this.sacDte01;
	}

	public void setSacDte01(Date sacDte01) {
		this.sacDte01 = sacDte01;
	}

	public Date getSacDte02() {
		return this.sacDte02;
	}

	public void setSacDte02(Date sacDte02) {
		this.sacDte02 = sacDte02;
	}

	public Date getSacDte03() {
		return this.sacDte03;
	}

	public void setSacDte03(Date sacDte03) {
		this.sacDte03 = sacDte03;
	}

	public Date getSacDte04() {
		return this.sacDte04;
	}

	public void setSacDte04(Date sacDte04) {
		this.sacDte04 = sacDte04;
	}

	public Boolean getSacLog01() {
		return this.sacLog01;
	}

	public void setSacLog01(Boolean sacLog01) {
		this.sacLog01 = sacLog01;
	}

	public Boolean getSacLog02() {
		return this.sacLog02;
	}

	public void setSacLog02(Boolean sacLog02) {
		this.sacLog02 = sacLog02;
	}

	public Boolean getSacLog03() {
		return this.sacLog03;
	}

	public void setSacLog03(Boolean sacLog03) {
		this.sacLog03 = sacLog03;
	}

	public Boolean getSacLog04() {
		return this.sacLog04;
	}

	public void setSacLog04(Boolean sacLog04) {
		this.sacLog04 = sacLog04;
	}

	public Boolean getSacLog05() {
		return this.sacLog05;
	}

	public void setSacLog05(Boolean sacLog05) {
		this.sacLog05 = sacLog05;
	}

	public Boolean getSacSoHist() {
		return this.sacSoHist;
	}

	public void setSacSoHist(Boolean sacSoHist) {
		this.sacSoHist = sacSoHist;
	}

	public Boolean getSacContractPr() {
		return this.sacContractPr;
	}

	public void setSacContractPr(Boolean sacContractPr) {
		this.sacContractPr = sacContractPr;
	}

	public Boolean getSacGenDef() {
		return this.sacGenDef;
	}

	public void setSacGenDef(Boolean sacGenDef) {
		this.sacGenDef = sacGenDef;
	}

	public Boolean getSacQadl04() {
		return this.sacQadl04;
	}

	public void setSacQadl04(Boolean sacQadl04) {
		this.sacQadl04 = sacQadl04;
	}

	public String getSacSaSite() {
		return this.sacSaSite;
	}

	public void setSacSaSite(String sacSaSite) {
		this.sacSaSite = sacSaSite;
	}

	public Boolean getSacDeferred() {
		return this.sacDeferred;
	}

	public void setSacDeferred(Boolean sacDeferred) {
		this.sacDeferred = sacDeferred;
	}

	public Boolean getSacCallsMrp() {
		return this.sacCallsMrp;
	}

	public void setSacCallsMrp(Boolean sacCallsMrp) {
		this.sacCallsMrp = sacCallsMrp;
	}

	public Boolean getSacCreatePm() {
		return this.sacCreatePm;
	}

	public void setSacCreatePm(Boolean sacCreatePm) {
		this.sacCreatePm = sacCreatePm;
	}

	public Boolean getSacLimitsWnd() {
		return this.sacLimitsWnd;
	}

	public void setSacLimitsWnd(Boolean sacLimitsWnd) {
		this.sacLimitsWnd = sacLimitsWnd;
	}

	public Integer getSacRenewalDays() {
		return this.sacRenewalDays;
	}

	public void setSacRenewalDays(Integer sacRenewalDays) {
		this.sacRenewalDays = sacRenewalDays;
	}

	public String getSacRenewFmt() {
		return this.sacRenewFmt;
	}

	public void setSacRenewFmt(String sacRenewFmt) {
		this.sacRenewFmt = sacRenewFmt;
	}

	public Boolean getSacRevalBill() {
		return this.sacRevalBill;
	}

	public void setSacRevalBill(Boolean sacRevalBill) {
		this.sacRevalBill = sacRevalBill;
	}

	public Boolean getSacRevalWnd() {
		return this.sacRevalWnd;
	}

	public void setSacRevalWnd(Boolean sacRevalWnd) {
		this.sacRevalWnd = sacRevalWnd;
	}

	public Boolean getSacRvidxNxtbl() {
		return this.sacRvidxNxtbl;
	}

	public void setSacRvidxNxtbl(Boolean sacRvidxNxtbl) {
		this.sacRvidxNxtbl = sacRvidxNxtbl;
	}

	public Boolean getSacSaMulti() {
		return this.sacSaMulti;
	}

	public void setSacSaMulti(Boolean sacSaMulti) {
		this.sacSaMulti = sacSaMulti;
	}

	public Boolean getSacUserPricing() {
		return this.sacUserPricing;
	}

	public void setSacUserPricing(Boolean sacUserPricing) {
		this.sacUserPricing = sacUserPricing;
	}

	public Boolean getSacPmDays() {
		return this.sacPmDays;
	}

	public void setSacPmDays(Boolean sacPmDays) {
		this.sacPmDays = sacPmDays;
	}

	public String getSacQadc01() {
		return this.sacQadc01;
	}

	public void setSacQadc01(String sacQadc01) {
		this.sacQadc01 = sacQadc01;
	}

	public String getSacQadc02() {
		return this.sacQadc02;
	}

	public void setSacQadc02(String sacQadc02) {
		this.sacQadc02 = sacQadc02;
	}

	public String getSacQadc03() {
		return this.sacQadc03;
	}

	public void setSacQadc03(String sacQadc03) {
		this.sacQadc03 = sacQadc03;
	}

	public Integer getSacQadi01() {
		return this.sacQadi01;
	}

	public void setSacQadi01(Integer sacQadi01) {
		this.sacQadi01 = sacQadi01;
	}

	public Integer getSacQadi02() {
		return this.sacQadi02;
	}

	public void setSacQadi02(Integer sacQadi02) {
		this.sacQadi02 = sacQadi02;
	}

	public Boolean getSacQadl01() {
		return this.sacQadl01;
	}

	public void setSacQadl01(Boolean sacQadl01) {
		this.sacQadl01 = sacQadl01;
	}

	public Boolean getSacQadl02() {
		return this.sacQadl02;
	}

	public void setSacQadl02(Boolean sacQadl02) {
		this.sacQadl02 = sacQadl02;
	}

	public Boolean getSacQadl03() {
		return this.sacQadl03;
	}

	public void setSacQadl03(Boolean sacQadl03) {
		this.sacQadl03 = sacQadl03;
	}

	public String getSacModUserid() {
		return this.sacModUserid;
	}

	public void setSacModUserid(String sacModUserid) {
		this.sacModUserid = sacModUserid;
	}

	public Date getSacModDate() {
		return this.sacModDate;
	}

	public void setSacModDate(Date sacModDate) {
		this.sacModDate = sacModDate;
	}

	public String getSacLimitCopy() {
		return this.sacLimitCopy;
	}

	public void setSacLimitCopy(String sacLimitCopy) {
		this.sacLimitCopy = sacLimitCopy;
	}

	public Boolean getSacLimHist() {
		return this.sacLimHist;
	}

	public void setSacLimHist(Boolean sacLimHist) {
		this.sacLimHist = sacLimHist;
	}

	public String getSacExRatetype() {
		return this.sacExRatetype;
	}

	public void setSacExRatetype(String sacExRatetype) {
		this.sacExRatetype = sacExRatetype;
	}

	public Boolean getSacPtIsb() {
		return this.sacPtIsb;
	}

	public void setSacPtIsb(Boolean sacPtIsb) {
		this.sacPtIsb = sacPtIsb;
	}

	public String getSacRevenue() {
		return this.sacRevenue;
	}

	public void setSacRevenue(String sacRevenue) {
		this.sacRevenue = sacRevenue;
	}

	public Boolean getSacBillEnduser() {
		return this.sacBillEnduser;
	}

	public void setSacBillEnduser(Boolean sacBillEnduser) {
		this.sacBillEnduser = sacBillEnduser;
	}

	public Boolean getSacBillSummary() {
		return this.sacBillSummary;
	}

	public void setSacBillSummary(Boolean sacBillSummary) {
		this.sacBillSummary = sacBillSummary;
	}

	public Boolean getSacItemEnduser() {
		return this.sacItemEnduser;
	}

	public void setSacItemEnduser(Boolean sacItemEnduser) {
		this.sacItemEnduser = sacItemEnduser;
	}

	public Boolean getSacEuTotals() {
		return this.sacEuTotals;
	}

	public void setSacEuTotals(Boolean sacEuTotals) {
		this.sacEuTotals = sacEuTotals;
	}

	public Boolean getSacEuAddChrg() {
		return this.sacEuAddChrg;
	}

	public void setSacEuAddChrg(Boolean sacEuAddChrg) {
		this.sacEuAddChrg = sacEuAddChrg;
	}

	public Boolean getSacAddChrg() {
		return this.sacAddChrg;
	}

	public void setSacAddChrg(Boolean sacAddChrg) {
		this.sacAddChrg = sacAddChrg;
	}

	public Double getOidSacCtrl() {
		return this.oidSacCtrl;
	}

	public void setOidSacCtrl(Double oidSacCtrl) {
		this.oidSacCtrl = oidSacCtrl;
	}

}