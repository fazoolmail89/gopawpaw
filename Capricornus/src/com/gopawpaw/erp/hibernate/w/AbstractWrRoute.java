package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWrRoute entity provides the base persistence definition of the
 * WrRoute entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWrRoute implements java.io.Serializable {

	// Fields

	private WrRouteId id;
	private String wrDesc;
	private String wrWkctr;
	private Double wrMchOp;
	private Double wrSetup;
	private Double wrRun;
	private Double wrMove;
	private Double wrActSetup;
	private Double wrActRun;
	private Double wrQtyOrd;
	private Double wrQtyWip;
	private Double wrQtyComp;
	private Double wrQtyRjct;
	private Double wrQtyRwrk;
	private String wrStatus;
	private String wrTool;
	private String wrVend;
	private String wrPoNbr;
	private Date wrStart;
	private Date wrDue;
	private Double wrSubAct;
	private Double wrYieldPct;
	private String wrPart;
	private Double wrBdnStd;
	private Double wrBdnAct;
	private Double wrLbrStd;
	private Double wrLbrAct;
	private Double wrSubStd;
	private Integer wrCmtindx;
	private String wrMch;
	private Boolean wrMilestone;
	private String wrUser1;
	private String wrUser2;
	private String wrStdOp;
	private Double wrSetupMen;
	private Double wrMenMch;
	private Integer wrTranQty;
	private Double wrLbrOvhd;
	private Double wrQueue;
	private Double wrWait;
	private Integer wrSubLead;
	private Double wrQtyMove;
	private String wrChr01;
	private String wrChr02;
	private String wrChr03;
	private String wrChr04;
	private String wrChr05;
	private Date wrDte01;
	private Date wrDte02;
	private Double wrDec01;
	private Double wrDec02;
	private Boolean wrLog01;
	private Double wrMtlTotx;
	private Double wrLbrTotx;
	private Double wrBdnTotx;
	private Double wrSubTotx;
	private Double wrOvhTotx;
	private Double wrLvusePost;
	private Double wrBvusePost;
	private Double wrSvusePost;
	private Double wrSubComp;
	private Double wrLvrtePost;
	private Double wrBvrtePost;
	private Double wrSvrtePost;
	private Double wrLvrteAccr;
	private Double wrLvuseAccr;
	private Double wrBvrteAccr;
	private Double wrBvuseAccr;
	private Double wrSvrteAccr;
	private Double wrSvuseAccr;
	private Double wrLvrteRval;
	private Double wrLvuseRval;
	private Double wrBvrteRval;
	private Double wrBvuseRval;
	private Double wrSvrteRval;
	private Double wrSvuseRval;
	private Double wrSubCost;
	private Double wrSetupRte;
	private Double wrLbrRate;
	private Double wrBdnPct;
	private Double wrBdnRate;
	private Double wrMchBdn;
	private Double wrSlvusePost;
	private Double wrSbvusePost;
	private Double wrQtyInque;
	private Double wrQtyOutque;
	private Double wrQtyRejque;
	private Double wrQtyInqueb;
	private Double wrQtyOutqueb;
	private Double wrQtyRejqueb;
	private Double wrQtyCumrjct;
	private Double wrQtyCumoscrap;
	private Double wrQtyCumrscrap;
	private Double wrQtyCumoadj;
	private Double wrQtyCumradj;
	private Double wrQtyCummove;
	private Double wrQtyCumproc;
	private Double wrQtyCumrwrk;
	private Integer wrPoLine;
	private String wrWipmtlPart;
	private Double wrMtlAct;
	private Boolean wrMvNxtOp;
	private Double wrLbrLlAct;
	private Double wrBdnLlAct;
	private Double wrSubLlAct;
	private Double wrMtlLlAct;
	private Double wrOvhAct;
	private Double wrOvhLlAct;
	private Double wrLbrLlTotx;
	private Double wrBdnLlTotx;
	private Double wrSubLlTotx;
	private Double wrMtlLlTotx;
	private Double wrOvhLlTotx;
	private Boolean wrAutoLbr;
	private String wrCaIntType;
	private Double wrCoveredAmt;
	private String wrCurr;
	private String wrEndTime;
	private String wrEngCode;
	private String wrFcgCode;
	private Integer wrFcgIndex;
	private Integer wrFisColumn;
	private String wrFisSort;
	private String wrFscCode;
	private String wrFsmType;
	private Double wrListPr;
	private Double wrPrice;
	private String wrProdLine;
	private Double wrFlbrStd;
	private Double wrPostedRun;
	private String wrStTime;
	private Double wrActPosted;
	private Boolean wrExpense;
	private Double wrFlbrCstd;
	private Double wrCoveredPost;
	private String wrProject;
	private String wrUm;
	private Double wrQadd05;
	private Double wrFbdnStd;
	private String wrSvCode;
	private Integer wrItmLine;
	private String wrQadc01;
	private String wrQadc02;
	private String wrQadc03;
	private String wrQadc04;
	private Double wrQade01;
	private Double wrQade02;
	private Double wrQade03;
	private Double wrQade04;
	private Integer wrQadi01;
	private Integer wrQadi02;
	private Boolean wrQadl01;
	private Boolean wrQadl02;
	private Double wrUnprocessedAmt;
	private Double oidWrRoute;

	// Constructors

	/** default constructor */
	public AbstractWrRoute() {
	}

	/** minimal constructor */
	public AbstractWrRoute(WrRouteId id, Double oidWrRoute) {
		this.id = id;
		this.oidWrRoute = oidWrRoute;
	}

	/** full constructor */
	public AbstractWrRoute(WrRouteId id, String wrDesc, String wrWkctr,
			Double wrMchOp, Double wrSetup, Double wrRun, Double wrMove,
			Double wrActSetup, Double wrActRun, Double wrQtyOrd,
			Double wrQtyWip, Double wrQtyComp, Double wrQtyRjct,
			Double wrQtyRwrk, String wrStatus, String wrTool, String wrVend,
			String wrPoNbr, Date wrStart, Date wrDue, Double wrSubAct,
			Double wrYieldPct, String wrPart, Double wrBdnStd, Double wrBdnAct,
			Double wrLbrStd, Double wrLbrAct, Double wrSubStd,
			Integer wrCmtindx, String wrMch, Boolean wrMilestone,
			String wrUser1, String wrUser2, String wrStdOp, Double wrSetupMen,
			Double wrMenMch, Integer wrTranQty, Double wrLbrOvhd,
			Double wrQueue, Double wrWait, Integer wrSubLead, Double wrQtyMove,
			String wrChr01, String wrChr02, String wrChr03, String wrChr04,
			String wrChr05, Date wrDte01, Date wrDte02, Double wrDec01,
			Double wrDec02, Boolean wrLog01, Double wrMtlTotx,
			Double wrLbrTotx, Double wrBdnTotx, Double wrSubTotx,
			Double wrOvhTotx, Double wrLvusePost, Double wrBvusePost,
			Double wrSvusePost, Double wrSubComp, Double wrLvrtePost,
			Double wrBvrtePost, Double wrSvrtePost, Double wrLvrteAccr,
			Double wrLvuseAccr, Double wrBvrteAccr, Double wrBvuseAccr,
			Double wrSvrteAccr, Double wrSvuseAccr, Double wrLvrteRval,
			Double wrLvuseRval, Double wrBvrteRval, Double wrBvuseRval,
			Double wrSvrteRval, Double wrSvuseRval, Double wrSubCost,
			Double wrSetupRte, Double wrLbrRate, Double wrBdnPct,
			Double wrBdnRate, Double wrMchBdn, Double wrSlvusePost,
			Double wrSbvusePost, Double wrQtyInque, Double wrQtyOutque,
			Double wrQtyRejque, Double wrQtyInqueb, Double wrQtyOutqueb,
			Double wrQtyRejqueb, Double wrQtyCumrjct, Double wrQtyCumoscrap,
			Double wrQtyCumrscrap, Double wrQtyCumoadj, Double wrQtyCumradj,
			Double wrQtyCummove, Double wrQtyCumproc, Double wrQtyCumrwrk,
			Integer wrPoLine, String wrWipmtlPart, Double wrMtlAct,
			Boolean wrMvNxtOp, Double wrLbrLlAct, Double wrBdnLlAct,
			Double wrSubLlAct, Double wrMtlLlAct, Double wrOvhAct,
			Double wrOvhLlAct, Double wrLbrLlTotx, Double wrBdnLlTotx,
			Double wrSubLlTotx, Double wrMtlLlTotx, Double wrOvhLlTotx,
			Boolean wrAutoLbr, String wrCaIntType, Double wrCoveredAmt,
			String wrCurr, String wrEndTime, String wrEngCode,
			String wrFcgCode, Integer wrFcgIndex, Integer wrFisColumn,
			String wrFisSort, String wrFscCode, String wrFsmType,
			Double wrListPr, Double wrPrice, String wrProdLine,
			Double wrFlbrStd, Double wrPostedRun, String wrStTime,
			Double wrActPosted, Boolean wrExpense, Double wrFlbrCstd,
			Double wrCoveredPost, String wrProject, String wrUm,
			Double wrQadd05, Double wrFbdnStd, String wrSvCode,
			Integer wrItmLine, String wrQadc01, String wrQadc02,
			String wrQadc03, String wrQadc04, Double wrQade01, Double wrQade02,
			Double wrQade03, Double wrQade04, Integer wrQadi01,
			Integer wrQadi02, Boolean wrQadl01, Boolean wrQadl02,
			Double wrUnprocessedAmt, Double oidWrRoute) {
		this.id = id;
		this.wrDesc = wrDesc;
		this.wrWkctr = wrWkctr;
		this.wrMchOp = wrMchOp;
		this.wrSetup = wrSetup;
		this.wrRun = wrRun;
		this.wrMove = wrMove;
		this.wrActSetup = wrActSetup;
		this.wrActRun = wrActRun;
		this.wrQtyOrd = wrQtyOrd;
		this.wrQtyWip = wrQtyWip;
		this.wrQtyComp = wrQtyComp;
		this.wrQtyRjct = wrQtyRjct;
		this.wrQtyRwrk = wrQtyRwrk;
		this.wrStatus = wrStatus;
		this.wrTool = wrTool;
		this.wrVend = wrVend;
		this.wrPoNbr = wrPoNbr;
		this.wrStart = wrStart;
		this.wrDue = wrDue;
		this.wrSubAct = wrSubAct;
		this.wrYieldPct = wrYieldPct;
		this.wrPart = wrPart;
		this.wrBdnStd = wrBdnStd;
		this.wrBdnAct = wrBdnAct;
		this.wrLbrStd = wrLbrStd;
		this.wrLbrAct = wrLbrAct;
		this.wrSubStd = wrSubStd;
		this.wrCmtindx = wrCmtindx;
		this.wrMch = wrMch;
		this.wrMilestone = wrMilestone;
		this.wrUser1 = wrUser1;
		this.wrUser2 = wrUser2;
		this.wrStdOp = wrStdOp;
		this.wrSetupMen = wrSetupMen;
		this.wrMenMch = wrMenMch;
		this.wrTranQty = wrTranQty;
		this.wrLbrOvhd = wrLbrOvhd;
		this.wrQueue = wrQueue;
		this.wrWait = wrWait;
		this.wrSubLead = wrSubLead;
		this.wrQtyMove = wrQtyMove;
		this.wrChr01 = wrChr01;
		this.wrChr02 = wrChr02;
		this.wrChr03 = wrChr03;
		this.wrChr04 = wrChr04;
		this.wrChr05 = wrChr05;
		this.wrDte01 = wrDte01;
		this.wrDte02 = wrDte02;
		this.wrDec01 = wrDec01;
		this.wrDec02 = wrDec02;
		this.wrLog01 = wrLog01;
		this.wrMtlTotx = wrMtlTotx;
		this.wrLbrTotx = wrLbrTotx;
		this.wrBdnTotx = wrBdnTotx;
		this.wrSubTotx = wrSubTotx;
		this.wrOvhTotx = wrOvhTotx;
		this.wrLvusePost = wrLvusePost;
		this.wrBvusePost = wrBvusePost;
		this.wrSvusePost = wrSvusePost;
		this.wrSubComp = wrSubComp;
		this.wrLvrtePost = wrLvrtePost;
		this.wrBvrtePost = wrBvrtePost;
		this.wrSvrtePost = wrSvrtePost;
		this.wrLvrteAccr = wrLvrteAccr;
		this.wrLvuseAccr = wrLvuseAccr;
		this.wrBvrteAccr = wrBvrteAccr;
		this.wrBvuseAccr = wrBvuseAccr;
		this.wrSvrteAccr = wrSvrteAccr;
		this.wrSvuseAccr = wrSvuseAccr;
		this.wrLvrteRval = wrLvrteRval;
		this.wrLvuseRval = wrLvuseRval;
		this.wrBvrteRval = wrBvrteRval;
		this.wrBvuseRval = wrBvuseRval;
		this.wrSvrteRval = wrSvrteRval;
		this.wrSvuseRval = wrSvuseRval;
		this.wrSubCost = wrSubCost;
		this.wrSetupRte = wrSetupRte;
		this.wrLbrRate = wrLbrRate;
		this.wrBdnPct = wrBdnPct;
		this.wrBdnRate = wrBdnRate;
		this.wrMchBdn = wrMchBdn;
		this.wrSlvusePost = wrSlvusePost;
		this.wrSbvusePost = wrSbvusePost;
		this.wrQtyInque = wrQtyInque;
		this.wrQtyOutque = wrQtyOutque;
		this.wrQtyRejque = wrQtyRejque;
		this.wrQtyInqueb = wrQtyInqueb;
		this.wrQtyOutqueb = wrQtyOutqueb;
		this.wrQtyRejqueb = wrQtyRejqueb;
		this.wrQtyCumrjct = wrQtyCumrjct;
		this.wrQtyCumoscrap = wrQtyCumoscrap;
		this.wrQtyCumrscrap = wrQtyCumrscrap;
		this.wrQtyCumoadj = wrQtyCumoadj;
		this.wrQtyCumradj = wrQtyCumradj;
		this.wrQtyCummove = wrQtyCummove;
		this.wrQtyCumproc = wrQtyCumproc;
		this.wrQtyCumrwrk = wrQtyCumrwrk;
		this.wrPoLine = wrPoLine;
		this.wrWipmtlPart = wrWipmtlPart;
		this.wrMtlAct = wrMtlAct;
		this.wrMvNxtOp = wrMvNxtOp;
		this.wrLbrLlAct = wrLbrLlAct;
		this.wrBdnLlAct = wrBdnLlAct;
		this.wrSubLlAct = wrSubLlAct;
		this.wrMtlLlAct = wrMtlLlAct;
		this.wrOvhAct = wrOvhAct;
		this.wrOvhLlAct = wrOvhLlAct;
		this.wrLbrLlTotx = wrLbrLlTotx;
		this.wrBdnLlTotx = wrBdnLlTotx;
		this.wrSubLlTotx = wrSubLlTotx;
		this.wrMtlLlTotx = wrMtlLlTotx;
		this.wrOvhLlTotx = wrOvhLlTotx;
		this.wrAutoLbr = wrAutoLbr;
		this.wrCaIntType = wrCaIntType;
		this.wrCoveredAmt = wrCoveredAmt;
		this.wrCurr = wrCurr;
		this.wrEndTime = wrEndTime;
		this.wrEngCode = wrEngCode;
		this.wrFcgCode = wrFcgCode;
		this.wrFcgIndex = wrFcgIndex;
		this.wrFisColumn = wrFisColumn;
		this.wrFisSort = wrFisSort;
		this.wrFscCode = wrFscCode;
		this.wrFsmType = wrFsmType;
		this.wrListPr = wrListPr;
		this.wrPrice = wrPrice;
		this.wrProdLine = wrProdLine;
		this.wrFlbrStd = wrFlbrStd;
		this.wrPostedRun = wrPostedRun;
		this.wrStTime = wrStTime;
		this.wrActPosted = wrActPosted;
		this.wrExpense = wrExpense;
		this.wrFlbrCstd = wrFlbrCstd;
		this.wrCoveredPost = wrCoveredPost;
		this.wrProject = wrProject;
		this.wrUm = wrUm;
		this.wrQadd05 = wrQadd05;
		this.wrFbdnStd = wrFbdnStd;
		this.wrSvCode = wrSvCode;
		this.wrItmLine = wrItmLine;
		this.wrQadc01 = wrQadc01;
		this.wrQadc02 = wrQadc02;
		this.wrQadc03 = wrQadc03;
		this.wrQadc04 = wrQadc04;
		this.wrQade01 = wrQade01;
		this.wrQade02 = wrQade02;
		this.wrQade03 = wrQade03;
		this.wrQade04 = wrQade04;
		this.wrQadi01 = wrQadi01;
		this.wrQadi02 = wrQadi02;
		this.wrQadl01 = wrQadl01;
		this.wrQadl02 = wrQadl02;
		this.wrUnprocessedAmt = wrUnprocessedAmt;
		this.oidWrRoute = oidWrRoute;
	}

	// Property accessors

	public WrRouteId getId() {
		return this.id;
	}

	public void setId(WrRouteId id) {
		this.id = id;
	}

	public String getWrDesc() {
		return this.wrDesc;
	}

	public void setWrDesc(String wrDesc) {
		this.wrDesc = wrDesc;
	}

	public String getWrWkctr() {
		return this.wrWkctr;
	}

	public void setWrWkctr(String wrWkctr) {
		this.wrWkctr = wrWkctr;
	}

	public Double getWrMchOp() {
		return this.wrMchOp;
	}

	public void setWrMchOp(Double wrMchOp) {
		this.wrMchOp = wrMchOp;
	}

	public Double getWrSetup() {
		return this.wrSetup;
	}

	public void setWrSetup(Double wrSetup) {
		this.wrSetup = wrSetup;
	}

	public Double getWrRun() {
		return this.wrRun;
	}

	public void setWrRun(Double wrRun) {
		this.wrRun = wrRun;
	}

	public Double getWrMove() {
		return this.wrMove;
	}

	public void setWrMove(Double wrMove) {
		this.wrMove = wrMove;
	}

	public Double getWrActSetup() {
		return this.wrActSetup;
	}

	public void setWrActSetup(Double wrActSetup) {
		this.wrActSetup = wrActSetup;
	}

	public Double getWrActRun() {
		return this.wrActRun;
	}

	public void setWrActRun(Double wrActRun) {
		this.wrActRun = wrActRun;
	}

	public Double getWrQtyOrd() {
		return this.wrQtyOrd;
	}

	public void setWrQtyOrd(Double wrQtyOrd) {
		this.wrQtyOrd = wrQtyOrd;
	}

	public Double getWrQtyWip() {
		return this.wrQtyWip;
	}

	public void setWrQtyWip(Double wrQtyWip) {
		this.wrQtyWip = wrQtyWip;
	}

	public Double getWrQtyComp() {
		return this.wrQtyComp;
	}

	public void setWrQtyComp(Double wrQtyComp) {
		this.wrQtyComp = wrQtyComp;
	}

	public Double getWrQtyRjct() {
		return this.wrQtyRjct;
	}

	public void setWrQtyRjct(Double wrQtyRjct) {
		this.wrQtyRjct = wrQtyRjct;
	}

	public Double getWrQtyRwrk() {
		return this.wrQtyRwrk;
	}

	public void setWrQtyRwrk(Double wrQtyRwrk) {
		this.wrQtyRwrk = wrQtyRwrk;
	}

	public String getWrStatus() {
		return this.wrStatus;
	}

	public void setWrStatus(String wrStatus) {
		this.wrStatus = wrStatus;
	}

	public String getWrTool() {
		return this.wrTool;
	}

	public void setWrTool(String wrTool) {
		this.wrTool = wrTool;
	}

	public String getWrVend() {
		return this.wrVend;
	}

	public void setWrVend(String wrVend) {
		this.wrVend = wrVend;
	}

	public String getWrPoNbr() {
		return this.wrPoNbr;
	}

	public void setWrPoNbr(String wrPoNbr) {
		this.wrPoNbr = wrPoNbr;
	}

	public Date getWrStart() {
		return this.wrStart;
	}

	public void setWrStart(Date wrStart) {
		this.wrStart = wrStart;
	}

	public Date getWrDue() {
		return this.wrDue;
	}

	public void setWrDue(Date wrDue) {
		this.wrDue = wrDue;
	}

	public Double getWrSubAct() {
		return this.wrSubAct;
	}

	public void setWrSubAct(Double wrSubAct) {
		this.wrSubAct = wrSubAct;
	}

	public Double getWrYieldPct() {
		return this.wrYieldPct;
	}

	public void setWrYieldPct(Double wrYieldPct) {
		this.wrYieldPct = wrYieldPct;
	}

	public String getWrPart() {
		return this.wrPart;
	}

	public void setWrPart(String wrPart) {
		this.wrPart = wrPart;
	}

	public Double getWrBdnStd() {
		return this.wrBdnStd;
	}

	public void setWrBdnStd(Double wrBdnStd) {
		this.wrBdnStd = wrBdnStd;
	}

	public Double getWrBdnAct() {
		return this.wrBdnAct;
	}

	public void setWrBdnAct(Double wrBdnAct) {
		this.wrBdnAct = wrBdnAct;
	}

	public Double getWrLbrStd() {
		return this.wrLbrStd;
	}

	public void setWrLbrStd(Double wrLbrStd) {
		this.wrLbrStd = wrLbrStd;
	}

	public Double getWrLbrAct() {
		return this.wrLbrAct;
	}

	public void setWrLbrAct(Double wrLbrAct) {
		this.wrLbrAct = wrLbrAct;
	}

	public Double getWrSubStd() {
		return this.wrSubStd;
	}

	public void setWrSubStd(Double wrSubStd) {
		this.wrSubStd = wrSubStd;
	}

	public Integer getWrCmtindx() {
		return this.wrCmtindx;
	}

	public void setWrCmtindx(Integer wrCmtindx) {
		this.wrCmtindx = wrCmtindx;
	}

	public String getWrMch() {
		return this.wrMch;
	}

	public void setWrMch(String wrMch) {
		this.wrMch = wrMch;
	}

	public Boolean getWrMilestone() {
		return this.wrMilestone;
	}

	public void setWrMilestone(Boolean wrMilestone) {
		this.wrMilestone = wrMilestone;
	}

	public String getWrUser1() {
		return this.wrUser1;
	}

	public void setWrUser1(String wrUser1) {
		this.wrUser1 = wrUser1;
	}

	public String getWrUser2() {
		return this.wrUser2;
	}

	public void setWrUser2(String wrUser2) {
		this.wrUser2 = wrUser2;
	}

	public String getWrStdOp() {
		return this.wrStdOp;
	}

	public void setWrStdOp(String wrStdOp) {
		this.wrStdOp = wrStdOp;
	}

	public Double getWrSetupMen() {
		return this.wrSetupMen;
	}

	public void setWrSetupMen(Double wrSetupMen) {
		this.wrSetupMen = wrSetupMen;
	}

	public Double getWrMenMch() {
		return this.wrMenMch;
	}

	public void setWrMenMch(Double wrMenMch) {
		this.wrMenMch = wrMenMch;
	}

	public Integer getWrTranQty() {
		return this.wrTranQty;
	}

	public void setWrTranQty(Integer wrTranQty) {
		this.wrTranQty = wrTranQty;
	}

	public Double getWrLbrOvhd() {
		return this.wrLbrOvhd;
	}

	public void setWrLbrOvhd(Double wrLbrOvhd) {
		this.wrLbrOvhd = wrLbrOvhd;
	}

	public Double getWrQueue() {
		return this.wrQueue;
	}

	public void setWrQueue(Double wrQueue) {
		this.wrQueue = wrQueue;
	}

	public Double getWrWait() {
		return this.wrWait;
	}

	public void setWrWait(Double wrWait) {
		this.wrWait = wrWait;
	}

	public Integer getWrSubLead() {
		return this.wrSubLead;
	}

	public void setWrSubLead(Integer wrSubLead) {
		this.wrSubLead = wrSubLead;
	}

	public Double getWrQtyMove() {
		return this.wrQtyMove;
	}

	public void setWrQtyMove(Double wrQtyMove) {
		this.wrQtyMove = wrQtyMove;
	}

	public String getWrChr01() {
		return this.wrChr01;
	}

	public void setWrChr01(String wrChr01) {
		this.wrChr01 = wrChr01;
	}

	public String getWrChr02() {
		return this.wrChr02;
	}

	public void setWrChr02(String wrChr02) {
		this.wrChr02 = wrChr02;
	}

	public String getWrChr03() {
		return this.wrChr03;
	}

	public void setWrChr03(String wrChr03) {
		this.wrChr03 = wrChr03;
	}

	public String getWrChr04() {
		return this.wrChr04;
	}

	public void setWrChr04(String wrChr04) {
		this.wrChr04 = wrChr04;
	}

	public String getWrChr05() {
		return this.wrChr05;
	}

	public void setWrChr05(String wrChr05) {
		this.wrChr05 = wrChr05;
	}

	public Date getWrDte01() {
		return this.wrDte01;
	}

	public void setWrDte01(Date wrDte01) {
		this.wrDte01 = wrDte01;
	}

	public Date getWrDte02() {
		return this.wrDte02;
	}

	public void setWrDte02(Date wrDte02) {
		this.wrDte02 = wrDte02;
	}

	public Double getWrDec01() {
		return this.wrDec01;
	}

	public void setWrDec01(Double wrDec01) {
		this.wrDec01 = wrDec01;
	}

	public Double getWrDec02() {
		return this.wrDec02;
	}

	public void setWrDec02(Double wrDec02) {
		this.wrDec02 = wrDec02;
	}

	public Boolean getWrLog01() {
		return this.wrLog01;
	}

	public void setWrLog01(Boolean wrLog01) {
		this.wrLog01 = wrLog01;
	}

	public Double getWrMtlTotx() {
		return this.wrMtlTotx;
	}

	public void setWrMtlTotx(Double wrMtlTotx) {
		this.wrMtlTotx = wrMtlTotx;
	}

	public Double getWrLbrTotx() {
		return this.wrLbrTotx;
	}

	public void setWrLbrTotx(Double wrLbrTotx) {
		this.wrLbrTotx = wrLbrTotx;
	}

	public Double getWrBdnTotx() {
		return this.wrBdnTotx;
	}

	public void setWrBdnTotx(Double wrBdnTotx) {
		this.wrBdnTotx = wrBdnTotx;
	}

	public Double getWrSubTotx() {
		return this.wrSubTotx;
	}

	public void setWrSubTotx(Double wrSubTotx) {
		this.wrSubTotx = wrSubTotx;
	}

	public Double getWrOvhTotx() {
		return this.wrOvhTotx;
	}

	public void setWrOvhTotx(Double wrOvhTotx) {
		this.wrOvhTotx = wrOvhTotx;
	}

	public Double getWrLvusePost() {
		return this.wrLvusePost;
	}

	public void setWrLvusePost(Double wrLvusePost) {
		this.wrLvusePost = wrLvusePost;
	}

	public Double getWrBvusePost() {
		return this.wrBvusePost;
	}

	public void setWrBvusePost(Double wrBvusePost) {
		this.wrBvusePost = wrBvusePost;
	}

	public Double getWrSvusePost() {
		return this.wrSvusePost;
	}

	public void setWrSvusePost(Double wrSvusePost) {
		this.wrSvusePost = wrSvusePost;
	}

	public Double getWrSubComp() {
		return this.wrSubComp;
	}

	public void setWrSubComp(Double wrSubComp) {
		this.wrSubComp = wrSubComp;
	}

	public Double getWrLvrtePost() {
		return this.wrLvrtePost;
	}

	public void setWrLvrtePost(Double wrLvrtePost) {
		this.wrLvrtePost = wrLvrtePost;
	}

	public Double getWrBvrtePost() {
		return this.wrBvrtePost;
	}

	public void setWrBvrtePost(Double wrBvrtePost) {
		this.wrBvrtePost = wrBvrtePost;
	}

	public Double getWrSvrtePost() {
		return this.wrSvrtePost;
	}

	public void setWrSvrtePost(Double wrSvrtePost) {
		this.wrSvrtePost = wrSvrtePost;
	}

	public Double getWrLvrteAccr() {
		return this.wrLvrteAccr;
	}

	public void setWrLvrteAccr(Double wrLvrteAccr) {
		this.wrLvrteAccr = wrLvrteAccr;
	}

	public Double getWrLvuseAccr() {
		return this.wrLvuseAccr;
	}

	public void setWrLvuseAccr(Double wrLvuseAccr) {
		this.wrLvuseAccr = wrLvuseAccr;
	}

	public Double getWrBvrteAccr() {
		return this.wrBvrteAccr;
	}

	public void setWrBvrteAccr(Double wrBvrteAccr) {
		this.wrBvrteAccr = wrBvrteAccr;
	}

	public Double getWrBvuseAccr() {
		return this.wrBvuseAccr;
	}

	public void setWrBvuseAccr(Double wrBvuseAccr) {
		this.wrBvuseAccr = wrBvuseAccr;
	}

	public Double getWrSvrteAccr() {
		return this.wrSvrteAccr;
	}

	public void setWrSvrteAccr(Double wrSvrteAccr) {
		this.wrSvrteAccr = wrSvrteAccr;
	}

	public Double getWrSvuseAccr() {
		return this.wrSvuseAccr;
	}

	public void setWrSvuseAccr(Double wrSvuseAccr) {
		this.wrSvuseAccr = wrSvuseAccr;
	}

	public Double getWrLvrteRval() {
		return this.wrLvrteRval;
	}

	public void setWrLvrteRval(Double wrLvrteRval) {
		this.wrLvrteRval = wrLvrteRval;
	}

	public Double getWrLvuseRval() {
		return this.wrLvuseRval;
	}

	public void setWrLvuseRval(Double wrLvuseRval) {
		this.wrLvuseRval = wrLvuseRval;
	}

	public Double getWrBvrteRval() {
		return this.wrBvrteRval;
	}

	public void setWrBvrteRval(Double wrBvrteRval) {
		this.wrBvrteRval = wrBvrteRval;
	}

	public Double getWrBvuseRval() {
		return this.wrBvuseRval;
	}

	public void setWrBvuseRval(Double wrBvuseRval) {
		this.wrBvuseRval = wrBvuseRval;
	}

	public Double getWrSvrteRval() {
		return this.wrSvrteRval;
	}

	public void setWrSvrteRval(Double wrSvrteRval) {
		this.wrSvrteRval = wrSvrteRval;
	}

	public Double getWrSvuseRval() {
		return this.wrSvuseRval;
	}

	public void setWrSvuseRval(Double wrSvuseRval) {
		this.wrSvuseRval = wrSvuseRval;
	}

	public Double getWrSubCost() {
		return this.wrSubCost;
	}

	public void setWrSubCost(Double wrSubCost) {
		this.wrSubCost = wrSubCost;
	}

	public Double getWrSetupRte() {
		return this.wrSetupRte;
	}

	public void setWrSetupRte(Double wrSetupRte) {
		this.wrSetupRte = wrSetupRte;
	}

	public Double getWrLbrRate() {
		return this.wrLbrRate;
	}

	public void setWrLbrRate(Double wrLbrRate) {
		this.wrLbrRate = wrLbrRate;
	}

	public Double getWrBdnPct() {
		return this.wrBdnPct;
	}

	public void setWrBdnPct(Double wrBdnPct) {
		this.wrBdnPct = wrBdnPct;
	}

	public Double getWrBdnRate() {
		return this.wrBdnRate;
	}

	public void setWrBdnRate(Double wrBdnRate) {
		this.wrBdnRate = wrBdnRate;
	}

	public Double getWrMchBdn() {
		return this.wrMchBdn;
	}

	public void setWrMchBdn(Double wrMchBdn) {
		this.wrMchBdn = wrMchBdn;
	}

	public Double getWrSlvusePost() {
		return this.wrSlvusePost;
	}

	public void setWrSlvusePost(Double wrSlvusePost) {
		this.wrSlvusePost = wrSlvusePost;
	}

	public Double getWrSbvusePost() {
		return this.wrSbvusePost;
	}

	public void setWrSbvusePost(Double wrSbvusePost) {
		this.wrSbvusePost = wrSbvusePost;
	}

	public Double getWrQtyInque() {
		return this.wrQtyInque;
	}

	public void setWrQtyInque(Double wrQtyInque) {
		this.wrQtyInque = wrQtyInque;
	}

	public Double getWrQtyOutque() {
		return this.wrQtyOutque;
	}

	public void setWrQtyOutque(Double wrQtyOutque) {
		this.wrQtyOutque = wrQtyOutque;
	}

	public Double getWrQtyRejque() {
		return this.wrQtyRejque;
	}

	public void setWrQtyRejque(Double wrQtyRejque) {
		this.wrQtyRejque = wrQtyRejque;
	}

	public Double getWrQtyInqueb() {
		return this.wrQtyInqueb;
	}

	public void setWrQtyInqueb(Double wrQtyInqueb) {
		this.wrQtyInqueb = wrQtyInqueb;
	}

	public Double getWrQtyOutqueb() {
		return this.wrQtyOutqueb;
	}

	public void setWrQtyOutqueb(Double wrQtyOutqueb) {
		this.wrQtyOutqueb = wrQtyOutqueb;
	}

	public Double getWrQtyRejqueb() {
		return this.wrQtyRejqueb;
	}

	public void setWrQtyRejqueb(Double wrQtyRejqueb) {
		this.wrQtyRejqueb = wrQtyRejqueb;
	}

	public Double getWrQtyCumrjct() {
		return this.wrQtyCumrjct;
	}

	public void setWrQtyCumrjct(Double wrQtyCumrjct) {
		this.wrQtyCumrjct = wrQtyCumrjct;
	}

	public Double getWrQtyCumoscrap() {
		return this.wrQtyCumoscrap;
	}

	public void setWrQtyCumoscrap(Double wrQtyCumoscrap) {
		this.wrQtyCumoscrap = wrQtyCumoscrap;
	}

	public Double getWrQtyCumrscrap() {
		return this.wrQtyCumrscrap;
	}

	public void setWrQtyCumrscrap(Double wrQtyCumrscrap) {
		this.wrQtyCumrscrap = wrQtyCumrscrap;
	}

	public Double getWrQtyCumoadj() {
		return this.wrQtyCumoadj;
	}

	public void setWrQtyCumoadj(Double wrQtyCumoadj) {
		this.wrQtyCumoadj = wrQtyCumoadj;
	}

	public Double getWrQtyCumradj() {
		return this.wrQtyCumradj;
	}

	public void setWrQtyCumradj(Double wrQtyCumradj) {
		this.wrQtyCumradj = wrQtyCumradj;
	}

	public Double getWrQtyCummove() {
		return this.wrQtyCummove;
	}

	public void setWrQtyCummove(Double wrQtyCummove) {
		this.wrQtyCummove = wrQtyCummove;
	}

	public Double getWrQtyCumproc() {
		return this.wrQtyCumproc;
	}

	public void setWrQtyCumproc(Double wrQtyCumproc) {
		this.wrQtyCumproc = wrQtyCumproc;
	}

	public Double getWrQtyCumrwrk() {
		return this.wrQtyCumrwrk;
	}

	public void setWrQtyCumrwrk(Double wrQtyCumrwrk) {
		this.wrQtyCumrwrk = wrQtyCumrwrk;
	}

	public Integer getWrPoLine() {
		return this.wrPoLine;
	}

	public void setWrPoLine(Integer wrPoLine) {
		this.wrPoLine = wrPoLine;
	}

	public String getWrWipmtlPart() {
		return this.wrWipmtlPart;
	}

	public void setWrWipmtlPart(String wrWipmtlPart) {
		this.wrWipmtlPart = wrWipmtlPart;
	}

	public Double getWrMtlAct() {
		return this.wrMtlAct;
	}

	public void setWrMtlAct(Double wrMtlAct) {
		this.wrMtlAct = wrMtlAct;
	}

	public Boolean getWrMvNxtOp() {
		return this.wrMvNxtOp;
	}

	public void setWrMvNxtOp(Boolean wrMvNxtOp) {
		this.wrMvNxtOp = wrMvNxtOp;
	}

	public Double getWrLbrLlAct() {
		return this.wrLbrLlAct;
	}

	public void setWrLbrLlAct(Double wrLbrLlAct) {
		this.wrLbrLlAct = wrLbrLlAct;
	}

	public Double getWrBdnLlAct() {
		return this.wrBdnLlAct;
	}

	public void setWrBdnLlAct(Double wrBdnLlAct) {
		this.wrBdnLlAct = wrBdnLlAct;
	}

	public Double getWrSubLlAct() {
		return this.wrSubLlAct;
	}

	public void setWrSubLlAct(Double wrSubLlAct) {
		this.wrSubLlAct = wrSubLlAct;
	}

	public Double getWrMtlLlAct() {
		return this.wrMtlLlAct;
	}

	public void setWrMtlLlAct(Double wrMtlLlAct) {
		this.wrMtlLlAct = wrMtlLlAct;
	}

	public Double getWrOvhAct() {
		return this.wrOvhAct;
	}

	public void setWrOvhAct(Double wrOvhAct) {
		this.wrOvhAct = wrOvhAct;
	}

	public Double getWrOvhLlAct() {
		return this.wrOvhLlAct;
	}

	public void setWrOvhLlAct(Double wrOvhLlAct) {
		this.wrOvhLlAct = wrOvhLlAct;
	}

	public Double getWrLbrLlTotx() {
		return this.wrLbrLlTotx;
	}

	public void setWrLbrLlTotx(Double wrLbrLlTotx) {
		this.wrLbrLlTotx = wrLbrLlTotx;
	}

	public Double getWrBdnLlTotx() {
		return this.wrBdnLlTotx;
	}

	public void setWrBdnLlTotx(Double wrBdnLlTotx) {
		this.wrBdnLlTotx = wrBdnLlTotx;
	}

	public Double getWrSubLlTotx() {
		return this.wrSubLlTotx;
	}

	public void setWrSubLlTotx(Double wrSubLlTotx) {
		this.wrSubLlTotx = wrSubLlTotx;
	}

	public Double getWrMtlLlTotx() {
		return this.wrMtlLlTotx;
	}

	public void setWrMtlLlTotx(Double wrMtlLlTotx) {
		this.wrMtlLlTotx = wrMtlLlTotx;
	}

	public Double getWrOvhLlTotx() {
		return this.wrOvhLlTotx;
	}

	public void setWrOvhLlTotx(Double wrOvhLlTotx) {
		this.wrOvhLlTotx = wrOvhLlTotx;
	}

	public Boolean getWrAutoLbr() {
		return this.wrAutoLbr;
	}

	public void setWrAutoLbr(Boolean wrAutoLbr) {
		this.wrAutoLbr = wrAutoLbr;
	}

	public String getWrCaIntType() {
		return this.wrCaIntType;
	}

	public void setWrCaIntType(String wrCaIntType) {
		this.wrCaIntType = wrCaIntType;
	}

	public Double getWrCoveredAmt() {
		return this.wrCoveredAmt;
	}

	public void setWrCoveredAmt(Double wrCoveredAmt) {
		this.wrCoveredAmt = wrCoveredAmt;
	}

	public String getWrCurr() {
		return this.wrCurr;
	}

	public void setWrCurr(String wrCurr) {
		this.wrCurr = wrCurr;
	}

	public String getWrEndTime() {
		return this.wrEndTime;
	}

	public void setWrEndTime(String wrEndTime) {
		this.wrEndTime = wrEndTime;
	}

	public String getWrEngCode() {
		return this.wrEngCode;
	}

	public void setWrEngCode(String wrEngCode) {
		this.wrEngCode = wrEngCode;
	}

	public String getWrFcgCode() {
		return this.wrFcgCode;
	}

	public void setWrFcgCode(String wrFcgCode) {
		this.wrFcgCode = wrFcgCode;
	}

	public Integer getWrFcgIndex() {
		return this.wrFcgIndex;
	}

	public void setWrFcgIndex(Integer wrFcgIndex) {
		this.wrFcgIndex = wrFcgIndex;
	}

	public Integer getWrFisColumn() {
		return this.wrFisColumn;
	}

	public void setWrFisColumn(Integer wrFisColumn) {
		this.wrFisColumn = wrFisColumn;
	}

	public String getWrFisSort() {
		return this.wrFisSort;
	}

	public void setWrFisSort(String wrFisSort) {
		this.wrFisSort = wrFisSort;
	}

	public String getWrFscCode() {
		return this.wrFscCode;
	}

	public void setWrFscCode(String wrFscCode) {
		this.wrFscCode = wrFscCode;
	}

	public String getWrFsmType() {
		return this.wrFsmType;
	}

	public void setWrFsmType(String wrFsmType) {
		this.wrFsmType = wrFsmType;
	}

	public Double getWrListPr() {
		return this.wrListPr;
	}

	public void setWrListPr(Double wrListPr) {
		this.wrListPr = wrListPr;
	}

	public Double getWrPrice() {
		return this.wrPrice;
	}

	public void setWrPrice(Double wrPrice) {
		this.wrPrice = wrPrice;
	}

	public String getWrProdLine() {
		return this.wrProdLine;
	}

	public void setWrProdLine(String wrProdLine) {
		this.wrProdLine = wrProdLine;
	}

	public Double getWrFlbrStd() {
		return this.wrFlbrStd;
	}

	public void setWrFlbrStd(Double wrFlbrStd) {
		this.wrFlbrStd = wrFlbrStd;
	}

	public Double getWrPostedRun() {
		return this.wrPostedRun;
	}

	public void setWrPostedRun(Double wrPostedRun) {
		this.wrPostedRun = wrPostedRun;
	}

	public String getWrStTime() {
		return this.wrStTime;
	}

	public void setWrStTime(String wrStTime) {
		this.wrStTime = wrStTime;
	}

	public Double getWrActPosted() {
		return this.wrActPosted;
	}

	public void setWrActPosted(Double wrActPosted) {
		this.wrActPosted = wrActPosted;
	}

	public Boolean getWrExpense() {
		return this.wrExpense;
	}

	public void setWrExpense(Boolean wrExpense) {
		this.wrExpense = wrExpense;
	}

	public Double getWrFlbrCstd() {
		return this.wrFlbrCstd;
	}

	public void setWrFlbrCstd(Double wrFlbrCstd) {
		this.wrFlbrCstd = wrFlbrCstd;
	}

	public Double getWrCoveredPost() {
		return this.wrCoveredPost;
	}

	public void setWrCoveredPost(Double wrCoveredPost) {
		this.wrCoveredPost = wrCoveredPost;
	}

	public String getWrProject() {
		return this.wrProject;
	}

	public void setWrProject(String wrProject) {
		this.wrProject = wrProject;
	}

	public String getWrUm() {
		return this.wrUm;
	}

	public void setWrUm(String wrUm) {
		this.wrUm = wrUm;
	}

	public Double getWrQadd05() {
		return this.wrQadd05;
	}

	public void setWrQadd05(Double wrQadd05) {
		this.wrQadd05 = wrQadd05;
	}

	public Double getWrFbdnStd() {
		return this.wrFbdnStd;
	}

	public void setWrFbdnStd(Double wrFbdnStd) {
		this.wrFbdnStd = wrFbdnStd;
	}

	public String getWrSvCode() {
		return this.wrSvCode;
	}

	public void setWrSvCode(String wrSvCode) {
		this.wrSvCode = wrSvCode;
	}

	public Integer getWrItmLine() {
		return this.wrItmLine;
	}

	public void setWrItmLine(Integer wrItmLine) {
		this.wrItmLine = wrItmLine;
	}

	public String getWrQadc01() {
		return this.wrQadc01;
	}

	public void setWrQadc01(String wrQadc01) {
		this.wrQadc01 = wrQadc01;
	}

	public String getWrQadc02() {
		return this.wrQadc02;
	}

	public void setWrQadc02(String wrQadc02) {
		this.wrQadc02 = wrQadc02;
	}

	public String getWrQadc03() {
		return this.wrQadc03;
	}

	public void setWrQadc03(String wrQadc03) {
		this.wrQadc03 = wrQadc03;
	}

	public String getWrQadc04() {
		return this.wrQadc04;
	}

	public void setWrQadc04(String wrQadc04) {
		this.wrQadc04 = wrQadc04;
	}

	public Double getWrQade01() {
		return this.wrQade01;
	}

	public void setWrQade01(Double wrQade01) {
		this.wrQade01 = wrQade01;
	}

	public Double getWrQade02() {
		return this.wrQade02;
	}

	public void setWrQade02(Double wrQade02) {
		this.wrQade02 = wrQade02;
	}

	public Double getWrQade03() {
		return this.wrQade03;
	}

	public void setWrQade03(Double wrQade03) {
		this.wrQade03 = wrQade03;
	}

	public Double getWrQade04() {
		return this.wrQade04;
	}

	public void setWrQade04(Double wrQade04) {
		this.wrQade04 = wrQade04;
	}

	public Integer getWrQadi01() {
		return this.wrQadi01;
	}

	public void setWrQadi01(Integer wrQadi01) {
		this.wrQadi01 = wrQadi01;
	}

	public Integer getWrQadi02() {
		return this.wrQadi02;
	}

	public void setWrQadi02(Integer wrQadi02) {
		this.wrQadi02 = wrQadi02;
	}

	public Boolean getWrQadl01() {
		return this.wrQadl01;
	}

	public void setWrQadl01(Boolean wrQadl01) {
		this.wrQadl01 = wrQadl01;
	}

	public Boolean getWrQadl02() {
		return this.wrQadl02;
	}

	public void setWrQadl02(Boolean wrQadl02) {
		this.wrQadl02 = wrQadl02;
	}

	public Double getWrUnprocessedAmt() {
		return this.wrUnprocessedAmt;
	}

	public void setWrUnprocessedAmt(Double wrUnprocessedAmt) {
		this.wrUnprocessedAmt = wrUnprocessedAmt;
	}

	public Double getOidWrRoute() {
		return this.oidWrRoute;
	}

	public void setOidWrRoute(Double oidWrRoute) {
		this.oidWrRoute = oidWrRoute;
	}

}