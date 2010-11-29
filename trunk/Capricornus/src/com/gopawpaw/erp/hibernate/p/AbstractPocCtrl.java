package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractPocCtrl entity provides the base persistence definition of the
 * PocCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPocCtrl implements java.io.Serializable {

	// Fields

	private String pocDomain;
	private String pocBill;
	private String pocShip;
	private Integer pocPoNbr;
	private Boolean pocLnFmt;
	private String pocInspLoc;
	private BigDecimal pocRcvType;
	private BigDecimal pocRcvNbr;
	private String pocLnStat;
	private Double pocTolPct;
	private Double pocTolCst;
	private Boolean pocHcmmts;
	private Boolean pocLcmmts;
	private String pocFstId;
	private String pocPstId;
	private Boolean pocRcvAll;
	private Integer pocQad01;
	private String pocUser1;
	private String pocUser2;
	private Integer pocQadi03;
	private Integer pocReqNbr;
	private String pocPoPre;
	private String pocRcvPre;
	private String pocReqPre;
	private Boolean pocSortBy;
	private String pocQadc04;
	private String pocQadc05;
	private Boolean pocApvReq;
	private Boolean pocPoHist;
	private Boolean pocPlReq;
	private String pocCrtaccAcct;
	private String pocCrtaccCc;
	private String pocCrtappAcct;
	private String pocCrtappCc;
	private Integer pocNextBatch;
	private Boolean pocPcLine;
	private Boolean pocPtReq;
	private Boolean pocErsProc;
	private String pocErsOpt;
	private String pocQadc01;
	private String pocQadc02;
	private String pocQadc03;
	private Date pocQadt01;
	private Double pocQadd01;
	private Double pocQadd02;
	private Integer pocQadi01;
	private Integer pocQadi02;
	private Boolean pocQadl01;
	private Boolean pocQadl02;
	private Boolean pocQadl03;
	private Boolean pocQadl04;
	private Boolean pocQadl05;
	private Boolean pocQadl06;
	private Boolean pocAckReq;
	private String pocExRatetype;
	private String pocCrtaccSub;
	private String pocCrtappSub;
	private Boolean pocMultiDueDates;
	private Double oidPocCtrl;

	// Constructors

	/** default constructor */
	public AbstractPocCtrl() {
	}

	/** minimal constructor */
	public AbstractPocCtrl(Boolean pocAckReq, String pocExRatetype,
			Boolean pocMultiDueDates, Double oidPocCtrl) {
		this.pocAckReq = pocAckReq;
		this.pocExRatetype = pocExRatetype;
		this.pocMultiDueDates = pocMultiDueDates;
		this.oidPocCtrl = oidPocCtrl;
	}

	/** full constructor */
	public AbstractPocCtrl(String pocBill, String pocShip, Integer pocPoNbr,
			Boolean pocLnFmt, String pocInspLoc, BigDecimal pocRcvType,
			BigDecimal pocRcvNbr, String pocLnStat, Double pocTolPct,
			Double pocTolCst, Boolean pocHcmmts, Boolean pocLcmmts,
			String pocFstId, String pocPstId, Boolean pocRcvAll,
			Integer pocQad01, String pocUser1, String pocUser2,
			Integer pocQadi03, Integer pocReqNbr, String pocPoPre,
			String pocRcvPre, String pocReqPre, Boolean pocSortBy,
			String pocQadc04, String pocQadc05, Boolean pocApvReq,
			Boolean pocPoHist, Boolean pocPlReq, String pocCrtaccAcct,
			String pocCrtaccCc, String pocCrtappAcct, String pocCrtappCc,
			Integer pocNextBatch, Boolean pocPcLine, Boolean pocPtReq,
			Boolean pocErsProc, String pocErsOpt, String pocQadc01,
			String pocQadc02, String pocQadc03, Date pocQadt01,
			Double pocQadd01, Double pocQadd02, Integer pocQadi01,
			Integer pocQadi02, Boolean pocQadl01, Boolean pocQadl02,
			Boolean pocQadl03, Boolean pocQadl04, Boolean pocQadl05,
			Boolean pocQadl06, Boolean pocAckReq, String pocExRatetype,
			String pocCrtaccSub, String pocCrtappSub, Boolean pocMultiDueDates,
			Double oidPocCtrl) {
		this.pocBill = pocBill;
		this.pocShip = pocShip;
		this.pocPoNbr = pocPoNbr;
		this.pocLnFmt = pocLnFmt;
		this.pocInspLoc = pocInspLoc;
		this.pocRcvType = pocRcvType;
		this.pocRcvNbr = pocRcvNbr;
		this.pocLnStat = pocLnStat;
		this.pocTolPct = pocTolPct;
		this.pocTolCst = pocTolCst;
		this.pocHcmmts = pocHcmmts;
		this.pocLcmmts = pocLcmmts;
		this.pocFstId = pocFstId;
		this.pocPstId = pocPstId;
		this.pocRcvAll = pocRcvAll;
		this.pocQad01 = pocQad01;
		this.pocUser1 = pocUser1;
		this.pocUser2 = pocUser2;
		this.pocQadi03 = pocQadi03;
		this.pocReqNbr = pocReqNbr;
		this.pocPoPre = pocPoPre;
		this.pocRcvPre = pocRcvPre;
		this.pocReqPre = pocReqPre;
		this.pocSortBy = pocSortBy;
		this.pocQadc04 = pocQadc04;
		this.pocQadc05 = pocQadc05;
		this.pocApvReq = pocApvReq;
		this.pocPoHist = pocPoHist;
		this.pocPlReq = pocPlReq;
		this.pocCrtaccAcct = pocCrtaccAcct;
		this.pocCrtaccCc = pocCrtaccCc;
		this.pocCrtappAcct = pocCrtappAcct;
		this.pocCrtappCc = pocCrtappCc;
		this.pocNextBatch = pocNextBatch;
		this.pocPcLine = pocPcLine;
		this.pocPtReq = pocPtReq;
		this.pocErsProc = pocErsProc;
		this.pocErsOpt = pocErsOpt;
		this.pocQadc01 = pocQadc01;
		this.pocQadc02 = pocQadc02;
		this.pocQadc03 = pocQadc03;
		this.pocQadt01 = pocQadt01;
		this.pocQadd01 = pocQadd01;
		this.pocQadd02 = pocQadd02;
		this.pocQadi01 = pocQadi01;
		this.pocQadi02 = pocQadi02;
		this.pocQadl01 = pocQadl01;
		this.pocQadl02 = pocQadl02;
		this.pocQadl03 = pocQadl03;
		this.pocQadl04 = pocQadl04;
		this.pocQadl05 = pocQadl05;
		this.pocQadl06 = pocQadl06;
		this.pocAckReq = pocAckReq;
		this.pocExRatetype = pocExRatetype;
		this.pocCrtaccSub = pocCrtaccSub;
		this.pocCrtappSub = pocCrtappSub;
		this.pocMultiDueDates = pocMultiDueDates;
		this.oidPocCtrl = oidPocCtrl;
	}

	// Property accessors

	public String getPocDomain() {
		return this.pocDomain;
	}

	public void setPocDomain(String pocDomain) {
		this.pocDomain = pocDomain;
	}

	public String getPocBill() {
		return this.pocBill;
	}

	public void setPocBill(String pocBill) {
		this.pocBill = pocBill;
	}

	public String getPocShip() {
		return this.pocShip;
	}

	public void setPocShip(String pocShip) {
		this.pocShip = pocShip;
	}

	public Integer getPocPoNbr() {
		return this.pocPoNbr;
	}

	public void setPocPoNbr(Integer pocPoNbr) {
		this.pocPoNbr = pocPoNbr;
	}

	public Boolean getPocLnFmt() {
		return this.pocLnFmt;
	}

	public void setPocLnFmt(Boolean pocLnFmt) {
		this.pocLnFmt = pocLnFmt;
	}

	public String getPocInspLoc() {
		return this.pocInspLoc;
	}

	public void setPocInspLoc(String pocInspLoc) {
		this.pocInspLoc = pocInspLoc;
	}

	public BigDecimal getPocRcvType() {
		return this.pocRcvType;
	}

	public void setPocRcvType(BigDecimal pocRcvType) {
		this.pocRcvType = pocRcvType;
	}

	public BigDecimal getPocRcvNbr() {
		return this.pocRcvNbr;
	}

	public void setPocRcvNbr(BigDecimal pocRcvNbr) {
		this.pocRcvNbr = pocRcvNbr;
	}

	public String getPocLnStat() {
		return this.pocLnStat;
	}

	public void setPocLnStat(String pocLnStat) {
		this.pocLnStat = pocLnStat;
	}

	public Double getPocTolPct() {
		return this.pocTolPct;
	}

	public void setPocTolPct(Double pocTolPct) {
		this.pocTolPct = pocTolPct;
	}

	public Double getPocTolCst() {
		return this.pocTolCst;
	}

	public void setPocTolCst(Double pocTolCst) {
		this.pocTolCst = pocTolCst;
	}

	public Boolean getPocHcmmts() {
		return this.pocHcmmts;
	}

	public void setPocHcmmts(Boolean pocHcmmts) {
		this.pocHcmmts = pocHcmmts;
	}

	public Boolean getPocLcmmts() {
		return this.pocLcmmts;
	}

	public void setPocLcmmts(Boolean pocLcmmts) {
		this.pocLcmmts = pocLcmmts;
	}

	public String getPocFstId() {
		return this.pocFstId;
	}

	public void setPocFstId(String pocFstId) {
		this.pocFstId = pocFstId;
	}

	public String getPocPstId() {
		return this.pocPstId;
	}

	public void setPocPstId(String pocPstId) {
		this.pocPstId = pocPstId;
	}

	public Boolean getPocRcvAll() {
		return this.pocRcvAll;
	}

	public void setPocRcvAll(Boolean pocRcvAll) {
		this.pocRcvAll = pocRcvAll;
	}

	public Integer getPocQad01() {
		return this.pocQad01;
	}

	public void setPocQad01(Integer pocQad01) {
		this.pocQad01 = pocQad01;
	}

	public String getPocUser1() {
		return this.pocUser1;
	}

	public void setPocUser1(String pocUser1) {
		this.pocUser1 = pocUser1;
	}

	public String getPocUser2() {
		return this.pocUser2;
	}

	public void setPocUser2(String pocUser2) {
		this.pocUser2 = pocUser2;
	}

	public Integer getPocQadi03() {
		return this.pocQadi03;
	}

	public void setPocQadi03(Integer pocQadi03) {
		this.pocQadi03 = pocQadi03;
	}

	public Integer getPocReqNbr() {
		return this.pocReqNbr;
	}

	public void setPocReqNbr(Integer pocReqNbr) {
		this.pocReqNbr = pocReqNbr;
	}

	public String getPocPoPre() {
		return this.pocPoPre;
	}

	public void setPocPoPre(String pocPoPre) {
		this.pocPoPre = pocPoPre;
	}

	public String getPocRcvPre() {
		return this.pocRcvPre;
	}

	public void setPocRcvPre(String pocRcvPre) {
		this.pocRcvPre = pocRcvPre;
	}

	public String getPocReqPre() {
		return this.pocReqPre;
	}

	public void setPocReqPre(String pocReqPre) {
		this.pocReqPre = pocReqPre;
	}

	public Boolean getPocSortBy() {
		return this.pocSortBy;
	}

	public void setPocSortBy(Boolean pocSortBy) {
		this.pocSortBy = pocSortBy;
	}

	public String getPocQadc04() {
		return this.pocQadc04;
	}

	public void setPocQadc04(String pocQadc04) {
		this.pocQadc04 = pocQadc04;
	}

	public String getPocQadc05() {
		return this.pocQadc05;
	}

	public void setPocQadc05(String pocQadc05) {
		this.pocQadc05 = pocQadc05;
	}

	public Boolean getPocApvReq() {
		return this.pocApvReq;
	}

	public void setPocApvReq(Boolean pocApvReq) {
		this.pocApvReq = pocApvReq;
	}

	public Boolean getPocPoHist() {
		return this.pocPoHist;
	}

	public void setPocPoHist(Boolean pocPoHist) {
		this.pocPoHist = pocPoHist;
	}

	public Boolean getPocPlReq() {
		return this.pocPlReq;
	}

	public void setPocPlReq(Boolean pocPlReq) {
		this.pocPlReq = pocPlReq;
	}

	public String getPocCrtaccAcct() {
		return this.pocCrtaccAcct;
	}

	public void setPocCrtaccAcct(String pocCrtaccAcct) {
		this.pocCrtaccAcct = pocCrtaccAcct;
	}

	public String getPocCrtaccCc() {
		return this.pocCrtaccCc;
	}

	public void setPocCrtaccCc(String pocCrtaccCc) {
		this.pocCrtaccCc = pocCrtaccCc;
	}

	public String getPocCrtappAcct() {
		return this.pocCrtappAcct;
	}

	public void setPocCrtappAcct(String pocCrtappAcct) {
		this.pocCrtappAcct = pocCrtappAcct;
	}

	public String getPocCrtappCc() {
		return this.pocCrtappCc;
	}

	public void setPocCrtappCc(String pocCrtappCc) {
		this.pocCrtappCc = pocCrtappCc;
	}

	public Integer getPocNextBatch() {
		return this.pocNextBatch;
	}

	public void setPocNextBatch(Integer pocNextBatch) {
		this.pocNextBatch = pocNextBatch;
	}

	public Boolean getPocPcLine() {
		return this.pocPcLine;
	}

	public void setPocPcLine(Boolean pocPcLine) {
		this.pocPcLine = pocPcLine;
	}

	public Boolean getPocPtReq() {
		return this.pocPtReq;
	}

	public void setPocPtReq(Boolean pocPtReq) {
		this.pocPtReq = pocPtReq;
	}

	public Boolean getPocErsProc() {
		return this.pocErsProc;
	}

	public void setPocErsProc(Boolean pocErsProc) {
		this.pocErsProc = pocErsProc;
	}

	public String getPocErsOpt() {
		return this.pocErsOpt;
	}

	public void setPocErsOpt(String pocErsOpt) {
		this.pocErsOpt = pocErsOpt;
	}

	public String getPocQadc01() {
		return this.pocQadc01;
	}

	public void setPocQadc01(String pocQadc01) {
		this.pocQadc01 = pocQadc01;
	}

	public String getPocQadc02() {
		return this.pocQadc02;
	}

	public void setPocQadc02(String pocQadc02) {
		this.pocQadc02 = pocQadc02;
	}

	public String getPocQadc03() {
		return this.pocQadc03;
	}

	public void setPocQadc03(String pocQadc03) {
		this.pocQadc03 = pocQadc03;
	}

	public Date getPocQadt01() {
		return this.pocQadt01;
	}

	public void setPocQadt01(Date pocQadt01) {
		this.pocQadt01 = pocQadt01;
	}

	public Double getPocQadd01() {
		return this.pocQadd01;
	}

	public void setPocQadd01(Double pocQadd01) {
		this.pocQadd01 = pocQadd01;
	}

	public Double getPocQadd02() {
		return this.pocQadd02;
	}

	public void setPocQadd02(Double pocQadd02) {
		this.pocQadd02 = pocQadd02;
	}

	public Integer getPocQadi01() {
		return this.pocQadi01;
	}

	public void setPocQadi01(Integer pocQadi01) {
		this.pocQadi01 = pocQadi01;
	}

	public Integer getPocQadi02() {
		return this.pocQadi02;
	}

	public void setPocQadi02(Integer pocQadi02) {
		this.pocQadi02 = pocQadi02;
	}

	public Boolean getPocQadl01() {
		return this.pocQadl01;
	}

	public void setPocQadl01(Boolean pocQadl01) {
		this.pocQadl01 = pocQadl01;
	}

	public Boolean getPocQadl02() {
		return this.pocQadl02;
	}

	public void setPocQadl02(Boolean pocQadl02) {
		this.pocQadl02 = pocQadl02;
	}

	public Boolean getPocQadl03() {
		return this.pocQadl03;
	}

	public void setPocQadl03(Boolean pocQadl03) {
		this.pocQadl03 = pocQadl03;
	}

	public Boolean getPocQadl04() {
		return this.pocQadl04;
	}

	public void setPocQadl04(Boolean pocQadl04) {
		this.pocQadl04 = pocQadl04;
	}

	public Boolean getPocQadl05() {
		return this.pocQadl05;
	}

	public void setPocQadl05(Boolean pocQadl05) {
		this.pocQadl05 = pocQadl05;
	}

	public Boolean getPocQadl06() {
		return this.pocQadl06;
	}

	public void setPocQadl06(Boolean pocQadl06) {
		this.pocQadl06 = pocQadl06;
	}

	public Boolean getPocAckReq() {
		return this.pocAckReq;
	}

	public void setPocAckReq(Boolean pocAckReq) {
		this.pocAckReq = pocAckReq;
	}

	public String getPocExRatetype() {
		return this.pocExRatetype;
	}

	public void setPocExRatetype(String pocExRatetype) {
		this.pocExRatetype = pocExRatetype;
	}

	public String getPocCrtaccSub() {
		return this.pocCrtaccSub;
	}

	public void setPocCrtaccSub(String pocCrtaccSub) {
		this.pocCrtaccSub = pocCrtaccSub;
	}

	public String getPocCrtappSub() {
		return this.pocCrtappSub;
	}

	public void setPocCrtappSub(String pocCrtappSub) {
		this.pocCrtappSub = pocCrtappSub;
	}

	public Boolean getPocMultiDueDates() {
		return this.pocMultiDueDates;
	}

	public void setPocMultiDueDates(Boolean pocMultiDueDates) {
		this.pocMultiDueDates = pocMultiDueDates;
	}

	public Double getOidPocCtrl() {
		return this.oidPocCtrl;
	}

	public void setOidPocCtrl(Double oidPocCtrl) {
		this.oidPocCtrl = oidPocCtrl;
	}

}