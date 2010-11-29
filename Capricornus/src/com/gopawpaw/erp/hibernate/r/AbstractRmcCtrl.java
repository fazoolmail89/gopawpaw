package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRmcCtrl entity provides the base persistence definition of the
 * RmcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRmcCtrl implements java.io.Serializable {

	// Fields

	private RmcCtrlId id;
	private Boolean rmcEditIsb;
	private Boolean rmcHcmmts;
	private Boolean rmcLcmmts;
	private Boolean rmcConsume;
	private Integer rmcQadi03;
	private String rmcUser1;
	private String rmcUser2;
	private Integer rmcQadi04;
	private String rmcRoute;
	private String rmcDfltRma;
	private String rmcQadc05;
	private String rmcQadc06;
	private String rmcSiteIs;
	private String rmcLocIs;
	private String rmcSiteOs;
	private String rmcLocOs;
	private Boolean rmcDetAll;
	private Integer rmcAllDays;
	private String rmcPoPre;
	private Integer rmcPoNbr;
	private String rmcSiteOv;
	private String rmcSiteIv;
	private String rmcLocOv;
	private String rmcLocIv;
	private String rmcSoPre;
	private Integer rmcSoNbr;
	private String rmcChr01;
	private String rmcChr02;
	private String rmcChr03;
	private String rmcChr04;
	private String rmcChr05;
	private String rmcChr06;
	private String rmcChr07;
	private String rmcChr08;
	private String rmcChr09;
	private String rmcChr10;
	private Double rmcDec01;
	private Double rmcDec02;
	private Double rmcDec03;
	private Date rmcDte01;
	private Date rmcDte02;
	private Date rmcDte03;
	private Date rmcDte04;
	private Boolean rmcLog01;
	private Boolean rmcLog02;
	private Boolean rmcLog03;
	private Boolean rmcLog04;
	private Boolean rmcLog05;
	private Boolean rmcHist;
	private String rmcQadc04;
	private Boolean rmcPrtRtn;
	private String rmcRtvTrn;
	private Boolean rmcPl;
	private String rmcRtnTaxc;
	private Boolean rmcHistory;
	private Boolean rmcIssues;
	private Boolean rmcPrintTrail;
	private Boolean rmcRmaAccounts;
	private String rmcSiteLb;
	private Boolean rmcDispTrail;
	private Integer rmcTurnDays;
	private String rmcRepairCd;
	private String rmcQadc01;
	private String rmcQadc02;
	private String rmcQadc03;
	private Boolean rmcQadl01;
	private Boolean rmcQadl02;
	private Boolean rmcQadl03;
	private Integer rmcQadi01;
	private Integer rmcQadi02;
	private Double rmcQadd01;
	private Double rmcQadd02;
	private String rmcModUserid;
	private Date rmcModDate;
	private Boolean rmcSwsa;
	private String rmcSoRatetype;
	private String rmcPoRatetype;
	private Double oidRmcCtrl;

	// Constructors

	/** default constructor */
	public AbstractRmcCtrl() {
	}

	/** minimal constructor */
	public AbstractRmcCtrl(RmcCtrlId id, String rmcSoRatetype,
			String rmcPoRatetype, Double oidRmcCtrl) {
		this.id = id;
		this.rmcSoRatetype = rmcSoRatetype;
		this.rmcPoRatetype = rmcPoRatetype;
		this.oidRmcCtrl = oidRmcCtrl;
	}

	/** full constructor */
	public AbstractRmcCtrl(RmcCtrlId id, Boolean rmcEditIsb, Boolean rmcHcmmts,
			Boolean rmcLcmmts, Boolean rmcConsume, Integer rmcQadi03,
			String rmcUser1, String rmcUser2, Integer rmcQadi04,
			String rmcRoute, String rmcDfltRma, String rmcQadc05,
			String rmcQadc06, String rmcSiteIs, String rmcLocIs,
			String rmcSiteOs, String rmcLocOs, Boolean rmcDetAll,
			Integer rmcAllDays, String rmcPoPre, Integer rmcPoNbr,
			String rmcSiteOv, String rmcSiteIv, String rmcLocOv,
			String rmcLocIv, String rmcSoPre, Integer rmcSoNbr,
			String rmcChr01, String rmcChr02, String rmcChr03, String rmcChr04,
			String rmcChr05, String rmcChr06, String rmcChr07, String rmcChr08,
			String rmcChr09, String rmcChr10, Double rmcDec01, Double rmcDec02,
			Double rmcDec03, Date rmcDte01, Date rmcDte02, Date rmcDte03,
			Date rmcDte04, Boolean rmcLog01, Boolean rmcLog02,
			Boolean rmcLog03, Boolean rmcLog04, Boolean rmcLog05,
			Boolean rmcHist, String rmcQadc04, Boolean rmcPrtRtn,
			String rmcRtvTrn, Boolean rmcPl, String rmcRtnTaxc,
			Boolean rmcHistory, Boolean rmcIssues, Boolean rmcPrintTrail,
			Boolean rmcRmaAccounts, String rmcSiteLb, Boolean rmcDispTrail,
			Integer rmcTurnDays, String rmcRepairCd, String rmcQadc01,
			String rmcQadc02, String rmcQadc03, Boolean rmcQadl01,
			Boolean rmcQadl02, Boolean rmcQadl03, Integer rmcQadi01,
			Integer rmcQadi02, Double rmcQadd01, Double rmcQadd02,
			String rmcModUserid, Date rmcModDate, Boolean rmcSwsa,
			String rmcSoRatetype, String rmcPoRatetype, Double oidRmcCtrl) {
		this.id = id;
		this.rmcEditIsb = rmcEditIsb;
		this.rmcHcmmts = rmcHcmmts;
		this.rmcLcmmts = rmcLcmmts;
		this.rmcConsume = rmcConsume;
		this.rmcQadi03 = rmcQadi03;
		this.rmcUser1 = rmcUser1;
		this.rmcUser2 = rmcUser2;
		this.rmcQadi04 = rmcQadi04;
		this.rmcRoute = rmcRoute;
		this.rmcDfltRma = rmcDfltRma;
		this.rmcQadc05 = rmcQadc05;
		this.rmcQadc06 = rmcQadc06;
		this.rmcSiteIs = rmcSiteIs;
		this.rmcLocIs = rmcLocIs;
		this.rmcSiteOs = rmcSiteOs;
		this.rmcLocOs = rmcLocOs;
		this.rmcDetAll = rmcDetAll;
		this.rmcAllDays = rmcAllDays;
		this.rmcPoPre = rmcPoPre;
		this.rmcPoNbr = rmcPoNbr;
		this.rmcSiteOv = rmcSiteOv;
		this.rmcSiteIv = rmcSiteIv;
		this.rmcLocOv = rmcLocOv;
		this.rmcLocIv = rmcLocIv;
		this.rmcSoPre = rmcSoPre;
		this.rmcSoNbr = rmcSoNbr;
		this.rmcChr01 = rmcChr01;
		this.rmcChr02 = rmcChr02;
		this.rmcChr03 = rmcChr03;
		this.rmcChr04 = rmcChr04;
		this.rmcChr05 = rmcChr05;
		this.rmcChr06 = rmcChr06;
		this.rmcChr07 = rmcChr07;
		this.rmcChr08 = rmcChr08;
		this.rmcChr09 = rmcChr09;
		this.rmcChr10 = rmcChr10;
		this.rmcDec01 = rmcDec01;
		this.rmcDec02 = rmcDec02;
		this.rmcDec03 = rmcDec03;
		this.rmcDte01 = rmcDte01;
		this.rmcDte02 = rmcDte02;
		this.rmcDte03 = rmcDte03;
		this.rmcDte04 = rmcDte04;
		this.rmcLog01 = rmcLog01;
		this.rmcLog02 = rmcLog02;
		this.rmcLog03 = rmcLog03;
		this.rmcLog04 = rmcLog04;
		this.rmcLog05 = rmcLog05;
		this.rmcHist = rmcHist;
		this.rmcQadc04 = rmcQadc04;
		this.rmcPrtRtn = rmcPrtRtn;
		this.rmcRtvTrn = rmcRtvTrn;
		this.rmcPl = rmcPl;
		this.rmcRtnTaxc = rmcRtnTaxc;
		this.rmcHistory = rmcHistory;
		this.rmcIssues = rmcIssues;
		this.rmcPrintTrail = rmcPrintTrail;
		this.rmcRmaAccounts = rmcRmaAccounts;
		this.rmcSiteLb = rmcSiteLb;
		this.rmcDispTrail = rmcDispTrail;
		this.rmcTurnDays = rmcTurnDays;
		this.rmcRepairCd = rmcRepairCd;
		this.rmcQadc01 = rmcQadc01;
		this.rmcQadc02 = rmcQadc02;
		this.rmcQadc03 = rmcQadc03;
		this.rmcQadl01 = rmcQadl01;
		this.rmcQadl02 = rmcQadl02;
		this.rmcQadl03 = rmcQadl03;
		this.rmcQadi01 = rmcQadi01;
		this.rmcQadi02 = rmcQadi02;
		this.rmcQadd01 = rmcQadd01;
		this.rmcQadd02 = rmcQadd02;
		this.rmcModUserid = rmcModUserid;
		this.rmcModDate = rmcModDate;
		this.rmcSwsa = rmcSwsa;
		this.rmcSoRatetype = rmcSoRatetype;
		this.rmcPoRatetype = rmcPoRatetype;
		this.oidRmcCtrl = oidRmcCtrl;
	}

	// Property accessors

	public RmcCtrlId getId() {
		return this.id;
	}

	public void setId(RmcCtrlId id) {
		this.id = id;
	}

	public Boolean getRmcEditIsb() {
		return this.rmcEditIsb;
	}

	public void setRmcEditIsb(Boolean rmcEditIsb) {
		this.rmcEditIsb = rmcEditIsb;
	}

	public Boolean getRmcHcmmts() {
		return this.rmcHcmmts;
	}

	public void setRmcHcmmts(Boolean rmcHcmmts) {
		this.rmcHcmmts = rmcHcmmts;
	}

	public Boolean getRmcLcmmts() {
		return this.rmcLcmmts;
	}

	public void setRmcLcmmts(Boolean rmcLcmmts) {
		this.rmcLcmmts = rmcLcmmts;
	}

	public Boolean getRmcConsume() {
		return this.rmcConsume;
	}

	public void setRmcConsume(Boolean rmcConsume) {
		this.rmcConsume = rmcConsume;
	}

	public Integer getRmcQadi03() {
		return this.rmcQadi03;
	}

	public void setRmcQadi03(Integer rmcQadi03) {
		this.rmcQadi03 = rmcQadi03;
	}

	public String getRmcUser1() {
		return this.rmcUser1;
	}

	public void setRmcUser1(String rmcUser1) {
		this.rmcUser1 = rmcUser1;
	}

	public String getRmcUser2() {
		return this.rmcUser2;
	}

	public void setRmcUser2(String rmcUser2) {
		this.rmcUser2 = rmcUser2;
	}

	public Integer getRmcQadi04() {
		return this.rmcQadi04;
	}

	public void setRmcQadi04(Integer rmcQadi04) {
		this.rmcQadi04 = rmcQadi04;
	}

	public String getRmcRoute() {
		return this.rmcRoute;
	}

	public void setRmcRoute(String rmcRoute) {
		this.rmcRoute = rmcRoute;
	}

	public String getRmcDfltRma() {
		return this.rmcDfltRma;
	}

	public void setRmcDfltRma(String rmcDfltRma) {
		this.rmcDfltRma = rmcDfltRma;
	}

	public String getRmcQadc05() {
		return this.rmcQadc05;
	}

	public void setRmcQadc05(String rmcQadc05) {
		this.rmcQadc05 = rmcQadc05;
	}

	public String getRmcQadc06() {
		return this.rmcQadc06;
	}

	public void setRmcQadc06(String rmcQadc06) {
		this.rmcQadc06 = rmcQadc06;
	}

	public String getRmcSiteIs() {
		return this.rmcSiteIs;
	}

	public void setRmcSiteIs(String rmcSiteIs) {
		this.rmcSiteIs = rmcSiteIs;
	}

	public String getRmcLocIs() {
		return this.rmcLocIs;
	}

	public void setRmcLocIs(String rmcLocIs) {
		this.rmcLocIs = rmcLocIs;
	}

	public String getRmcSiteOs() {
		return this.rmcSiteOs;
	}

	public void setRmcSiteOs(String rmcSiteOs) {
		this.rmcSiteOs = rmcSiteOs;
	}

	public String getRmcLocOs() {
		return this.rmcLocOs;
	}

	public void setRmcLocOs(String rmcLocOs) {
		this.rmcLocOs = rmcLocOs;
	}

	public Boolean getRmcDetAll() {
		return this.rmcDetAll;
	}

	public void setRmcDetAll(Boolean rmcDetAll) {
		this.rmcDetAll = rmcDetAll;
	}

	public Integer getRmcAllDays() {
		return this.rmcAllDays;
	}

	public void setRmcAllDays(Integer rmcAllDays) {
		this.rmcAllDays = rmcAllDays;
	}

	public String getRmcPoPre() {
		return this.rmcPoPre;
	}

	public void setRmcPoPre(String rmcPoPre) {
		this.rmcPoPre = rmcPoPre;
	}

	public Integer getRmcPoNbr() {
		return this.rmcPoNbr;
	}

	public void setRmcPoNbr(Integer rmcPoNbr) {
		this.rmcPoNbr = rmcPoNbr;
	}

	public String getRmcSiteOv() {
		return this.rmcSiteOv;
	}

	public void setRmcSiteOv(String rmcSiteOv) {
		this.rmcSiteOv = rmcSiteOv;
	}

	public String getRmcSiteIv() {
		return this.rmcSiteIv;
	}

	public void setRmcSiteIv(String rmcSiteIv) {
		this.rmcSiteIv = rmcSiteIv;
	}

	public String getRmcLocOv() {
		return this.rmcLocOv;
	}

	public void setRmcLocOv(String rmcLocOv) {
		this.rmcLocOv = rmcLocOv;
	}

	public String getRmcLocIv() {
		return this.rmcLocIv;
	}

	public void setRmcLocIv(String rmcLocIv) {
		this.rmcLocIv = rmcLocIv;
	}

	public String getRmcSoPre() {
		return this.rmcSoPre;
	}

	public void setRmcSoPre(String rmcSoPre) {
		this.rmcSoPre = rmcSoPre;
	}

	public Integer getRmcSoNbr() {
		return this.rmcSoNbr;
	}

	public void setRmcSoNbr(Integer rmcSoNbr) {
		this.rmcSoNbr = rmcSoNbr;
	}

	public String getRmcChr01() {
		return this.rmcChr01;
	}

	public void setRmcChr01(String rmcChr01) {
		this.rmcChr01 = rmcChr01;
	}

	public String getRmcChr02() {
		return this.rmcChr02;
	}

	public void setRmcChr02(String rmcChr02) {
		this.rmcChr02 = rmcChr02;
	}

	public String getRmcChr03() {
		return this.rmcChr03;
	}

	public void setRmcChr03(String rmcChr03) {
		this.rmcChr03 = rmcChr03;
	}

	public String getRmcChr04() {
		return this.rmcChr04;
	}

	public void setRmcChr04(String rmcChr04) {
		this.rmcChr04 = rmcChr04;
	}

	public String getRmcChr05() {
		return this.rmcChr05;
	}

	public void setRmcChr05(String rmcChr05) {
		this.rmcChr05 = rmcChr05;
	}

	public String getRmcChr06() {
		return this.rmcChr06;
	}

	public void setRmcChr06(String rmcChr06) {
		this.rmcChr06 = rmcChr06;
	}

	public String getRmcChr07() {
		return this.rmcChr07;
	}

	public void setRmcChr07(String rmcChr07) {
		this.rmcChr07 = rmcChr07;
	}

	public String getRmcChr08() {
		return this.rmcChr08;
	}

	public void setRmcChr08(String rmcChr08) {
		this.rmcChr08 = rmcChr08;
	}

	public String getRmcChr09() {
		return this.rmcChr09;
	}

	public void setRmcChr09(String rmcChr09) {
		this.rmcChr09 = rmcChr09;
	}

	public String getRmcChr10() {
		return this.rmcChr10;
	}

	public void setRmcChr10(String rmcChr10) {
		this.rmcChr10 = rmcChr10;
	}

	public Double getRmcDec01() {
		return this.rmcDec01;
	}

	public void setRmcDec01(Double rmcDec01) {
		this.rmcDec01 = rmcDec01;
	}

	public Double getRmcDec02() {
		return this.rmcDec02;
	}

	public void setRmcDec02(Double rmcDec02) {
		this.rmcDec02 = rmcDec02;
	}

	public Double getRmcDec03() {
		return this.rmcDec03;
	}

	public void setRmcDec03(Double rmcDec03) {
		this.rmcDec03 = rmcDec03;
	}

	public Date getRmcDte01() {
		return this.rmcDte01;
	}

	public void setRmcDte01(Date rmcDte01) {
		this.rmcDte01 = rmcDte01;
	}

	public Date getRmcDte02() {
		return this.rmcDte02;
	}

	public void setRmcDte02(Date rmcDte02) {
		this.rmcDte02 = rmcDte02;
	}

	public Date getRmcDte03() {
		return this.rmcDte03;
	}

	public void setRmcDte03(Date rmcDte03) {
		this.rmcDte03 = rmcDte03;
	}

	public Date getRmcDte04() {
		return this.rmcDte04;
	}

	public void setRmcDte04(Date rmcDte04) {
		this.rmcDte04 = rmcDte04;
	}

	public Boolean getRmcLog01() {
		return this.rmcLog01;
	}

	public void setRmcLog01(Boolean rmcLog01) {
		this.rmcLog01 = rmcLog01;
	}

	public Boolean getRmcLog02() {
		return this.rmcLog02;
	}

	public void setRmcLog02(Boolean rmcLog02) {
		this.rmcLog02 = rmcLog02;
	}

	public Boolean getRmcLog03() {
		return this.rmcLog03;
	}

	public void setRmcLog03(Boolean rmcLog03) {
		this.rmcLog03 = rmcLog03;
	}

	public Boolean getRmcLog04() {
		return this.rmcLog04;
	}

	public void setRmcLog04(Boolean rmcLog04) {
		this.rmcLog04 = rmcLog04;
	}

	public Boolean getRmcLog05() {
		return this.rmcLog05;
	}

	public void setRmcLog05(Boolean rmcLog05) {
		this.rmcLog05 = rmcLog05;
	}

	public Boolean getRmcHist() {
		return this.rmcHist;
	}

	public void setRmcHist(Boolean rmcHist) {
		this.rmcHist = rmcHist;
	}

	public String getRmcQadc04() {
		return this.rmcQadc04;
	}

	public void setRmcQadc04(String rmcQadc04) {
		this.rmcQadc04 = rmcQadc04;
	}

	public Boolean getRmcPrtRtn() {
		return this.rmcPrtRtn;
	}

	public void setRmcPrtRtn(Boolean rmcPrtRtn) {
		this.rmcPrtRtn = rmcPrtRtn;
	}

	public String getRmcRtvTrn() {
		return this.rmcRtvTrn;
	}

	public void setRmcRtvTrn(String rmcRtvTrn) {
		this.rmcRtvTrn = rmcRtvTrn;
	}

	public Boolean getRmcPl() {
		return this.rmcPl;
	}

	public void setRmcPl(Boolean rmcPl) {
		this.rmcPl = rmcPl;
	}

	public String getRmcRtnTaxc() {
		return this.rmcRtnTaxc;
	}

	public void setRmcRtnTaxc(String rmcRtnTaxc) {
		this.rmcRtnTaxc = rmcRtnTaxc;
	}

	public Boolean getRmcHistory() {
		return this.rmcHistory;
	}

	public void setRmcHistory(Boolean rmcHistory) {
		this.rmcHistory = rmcHistory;
	}

	public Boolean getRmcIssues() {
		return this.rmcIssues;
	}

	public void setRmcIssues(Boolean rmcIssues) {
		this.rmcIssues = rmcIssues;
	}

	public Boolean getRmcPrintTrail() {
		return this.rmcPrintTrail;
	}

	public void setRmcPrintTrail(Boolean rmcPrintTrail) {
		this.rmcPrintTrail = rmcPrintTrail;
	}

	public Boolean getRmcRmaAccounts() {
		return this.rmcRmaAccounts;
	}

	public void setRmcRmaAccounts(Boolean rmcRmaAccounts) {
		this.rmcRmaAccounts = rmcRmaAccounts;
	}

	public String getRmcSiteLb() {
		return this.rmcSiteLb;
	}

	public void setRmcSiteLb(String rmcSiteLb) {
		this.rmcSiteLb = rmcSiteLb;
	}

	public Boolean getRmcDispTrail() {
		return this.rmcDispTrail;
	}

	public void setRmcDispTrail(Boolean rmcDispTrail) {
		this.rmcDispTrail = rmcDispTrail;
	}

	public Integer getRmcTurnDays() {
		return this.rmcTurnDays;
	}

	public void setRmcTurnDays(Integer rmcTurnDays) {
		this.rmcTurnDays = rmcTurnDays;
	}

	public String getRmcRepairCd() {
		return this.rmcRepairCd;
	}

	public void setRmcRepairCd(String rmcRepairCd) {
		this.rmcRepairCd = rmcRepairCd;
	}

	public String getRmcQadc01() {
		return this.rmcQadc01;
	}

	public void setRmcQadc01(String rmcQadc01) {
		this.rmcQadc01 = rmcQadc01;
	}

	public String getRmcQadc02() {
		return this.rmcQadc02;
	}

	public void setRmcQadc02(String rmcQadc02) {
		this.rmcQadc02 = rmcQadc02;
	}

	public String getRmcQadc03() {
		return this.rmcQadc03;
	}

	public void setRmcQadc03(String rmcQadc03) {
		this.rmcQadc03 = rmcQadc03;
	}

	public Boolean getRmcQadl01() {
		return this.rmcQadl01;
	}

	public void setRmcQadl01(Boolean rmcQadl01) {
		this.rmcQadl01 = rmcQadl01;
	}

	public Boolean getRmcQadl02() {
		return this.rmcQadl02;
	}

	public void setRmcQadl02(Boolean rmcQadl02) {
		this.rmcQadl02 = rmcQadl02;
	}

	public Boolean getRmcQadl03() {
		return this.rmcQadl03;
	}

	public void setRmcQadl03(Boolean rmcQadl03) {
		this.rmcQadl03 = rmcQadl03;
	}

	public Integer getRmcQadi01() {
		return this.rmcQadi01;
	}

	public void setRmcQadi01(Integer rmcQadi01) {
		this.rmcQadi01 = rmcQadi01;
	}

	public Integer getRmcQadi02() {
		return this.rmcQadi02;
	}

	public void setRmcQadi02(Integer rmcQadi02) {
		this.rmcQadi02 = rmcQadi02;
	}

	public Double getRmcQadd01() {
		return this.rmcQadd01;
	}

	public void setRmcQadd01(Double rmcQadd01) {
		this.rmcQadd01 = rmcQadd01;
	}

	public Double getRmcQadd02() {
		return this.rmcQadd02;
	}

	public void setRmcQadd02(Double rmcQadd02) {
		this.rmcQadd02 = rmcQadd02;
	}

	public String getRmcModUserid() {
		return this.rmcModUserid;
	}

	public void setRmcModUserid(String rmcModUserid) {
		this.rmcModUserid = rmcModUserid;
	}

	public Date getRmcModDate() {
		return this.rmcModDate;
	}

	public void setRmcModDate(Date rmcModDate) {
		this.rmcModDate = rmcModDate;
	}

	public Boolean getRmcSwsa() {
		return this.rmcSwsa;
	}

	public void setRmcSwsa(Boolean rmcSwsa) {
		this.rmcSwsa = rmcSwsa;
	}

	public String getRmcSoRatetype() {
		return this.rmcSoRatetype;
	}

	public void setRmcSoRatetype(String rmcSoRatetype) {
		this.rmcSoRatetype = rmcSoRatetype;
	}

	public String getRmcPoRatetype() {
		return this.rmcPoRatetype;
	}

	public void setRmcPoRatetype(String rmcPoRatetype) {
		this.rmcPoRatetype = rmcPoRatetype;
	}

	public Double getOidRmcCtrl() {
		return this.oidRmcCtrl;
	}

	public void setOidRmcCtrl(Double oidRmcCtrl) {
		this.oidRmcCtrl = oidRmcCtrl;
	}

}