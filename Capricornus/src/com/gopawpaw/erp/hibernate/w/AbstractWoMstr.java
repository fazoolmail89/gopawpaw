package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWoMstr entity provides the base persistence definition of the WoMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWoMstr implements java.io.Serializable {

	// Fields

	private WoMstrId id;
	private String woSoJob;
	private Date woOrdDate;
	private Date woRelDate;
	private Date woDueDate;
	private Date woPerDate;
	private String woPart;
	private String woType;
	private Double woQtyOrd;
	private Double woQtyComp;
	private Double woQtyRjct;
	private String woStatus;
	private String woVend;
	private String woRmks;
	private Double woQtyChg;
	private Double woRjctChg;
	private Double woBoChg;
	private Double woYieldPct;
	private String woRev;
	private String woAcct;
	private String woCc;
	private String woQad01;
	private String woLotPrev;
	private String woSchdType;
	private Integer woCmtindx;
	private String woProject;
	private Integer woLeadTime;
	private Double woWipTot;
	private Double woLbrTot;
	private Double woMtlTot;
	private Double woBdnTot;
	private Double woSubTot;
	private String woUser1;
	private String woUser2;
	private Double woOvhTot;
	private String woLoc;
	private String woSerial;
	private String woRouting;
	private String woBomCode;
	private String woSite;
	private Double woQueueEff;
	private String woDraw;
	private Boolean woLbrUp;
	private Boolean woBdnUp;
	private Boolean woGlLbr;
	private Boolean woGlBdn;
	private String woChr01;
	private String woChr02;
	private String woChr03;
	private String woChr04;
	private String woChr05;
	private Date woDte01;
	private Date woDte02;
	private Double woDec01;
	private Double woDec02;
	private Boolean woLog01;
	private String woLine;
	private Boolean woVar;
	private Double woMtlVar;
	private Double woLbrVar;
	private Double woBdnVar;
	private Double woSubVar;
	private String woMvarAcct;
	private String woMvarCc;
	private String woMvrrAcct;
	private String woMvrrCc;
	private String woSvarAcct;
	private String woSvarCc;
	private String woSvrrAcct;
	private String woSvrrCc;
	private String woFlrAcct;
	private String woFlrCc;
	private Double woDec03;
	private Double woRjctTot;
	private Double woMthdVar;
	private Double woRvalTot;
	private Boolean woAcctClose;
	private Date woCloseDate;
	private Date woCloseEff;
	private String woFsmType;
	private String woXvarAcct;
	private String woXvarCc;
	private Double woMyldVar;
	private String woJointType;
	private Double woProdPct;
	private String woQtyType;
	private Double woDec04;
	private String woBaseId;
	private Double woUnitCost;
	private Double woMixVar;
	private Double woBdnTotx;
	private Double woLbrTotx;
	private Double woMtlTotx;
	private Double woSubTotx;
	private Double woOvhTotx;
	private String woBatch;
	private Double woAssay;
	private String woGrade;
	private Date woExpire;
	private String woRctstat;
	private String woLotNext;
	private Boolean woLotRcpt;
	private Boolean woRctstatActive;
	private String woCaIntType;
	private Date woDatePosted;
	private String woIssSite;
	private Integer woItmLine;
	private String woQadc01;
	private String woQadc02;
	private String woQadc03;
	private Date woQadt01;
	private Date woQadt02;
	private Double woQade01;
	private Double woQade02;
	private Double woQade03;
	private Integer woQadi01;
	private Integer woQadi02;
	private Boolean woQadl01;
	private Boolean woQadl02;
	private String woEngCode;
	private String woSub;
	private String woFlrSub;
	private String woMvarSub;
	private String woMvrrSub;
	private String woSvarSub;
	private String woSvrrSub;
	private String woXvarSub;
	private String woRef;
	private Date woRecordDate;
	private Date woStatCloseDate;
	private String woStatCloseUserid;
	private String woAppOwner;
	private Double oidWoMstr;

	// Constructors

	/** default constructor */
	public AbstractWoMstr() {
	}

	/** minimal constructor */
	public AbstractWoMstr(WoMstrId id, String woFsmType, Double woMyldVar,
			String woBatch, String woRef, String woStatCloseUserid,
			String woAppOwner, Double oidWoMstr) {
		this.id = id;
		this.woFsmType = woFsmType;
		this.woMyldVar = woMyldVar;
		this.woBatch = woBatch;
		this.woRef = woRef;
		this.woStatCloseUserid = woStatCloseUserid;
		this.woAppOwner = woAppOwner;
		this.oidWoMstr = oidWoMstr;
	}

	/** full constructor */
	public AbstractWoMstr(WoMstrId id, String woSoJob, Date woOrdDate,
			Date woRelDate, Date woDueDate, Date woPerDate, String woPart,
			String woType, Double woQtyOrd, Double woQtyComp, Double woQtyRjct,
			String woStatus, String woVend, String woRmks, Double woQtyChg,
			Double woRjctChg, Double woBoChg, Double woYieldPct, String woRev,
			String woAcct, String woCc, String woQad01, String woLotPrev,
			String woSchdType, Integer woCmtindx, String woProject,
			Integer woLeadTime, Double woWipTot, Double woLbrTot,
			Double woMtlTot, Double woBdnTot, Double woSubTot, String woUser1,
			String woUser2, Double woOvhTot, String woLoc, String woSerial,
			String woRouting, String woBomCode, String woSite,
			Double woQueueEff, String woDraw, Boolean woLbrUp, Boolean woBdnUp,
			Boolean woGlLbr, Boolean woGlBdn, String woChr01, String woChr02,
			String woChr03, String woChr04, String woChr05, Date woDte01,
			Date woDte02, Double woDec01, Double woDec02, Boolean woLog01,
			String woLine, Boolean woVar, Double woMtlVar, Double woLbrVar,
			Double woBdnVar, Double woSubVar, String woMvarAcct,
			String woMvarCc, String woMvrrAcct, String woMvrrCc,
			String woSvarAcct, String woSvarCc, String woSvrrAcct,
			String woSvrrCc, String woFlrAcct, String woFlrCc, Double woDec03,
			Double woRjctTot, Double woMthdVar, Double woRvalTot,
			Boolean woAcctClose, Date woCloseDate, Date woCloseEff,
			String woFsmType, String woXvarAcct, String woXvarCc,
			Double woMyldVar, String woJointType, Double woProdPct,
			String woQtyType, Double woDec04, String woBaseId,
			Double woUnitCost, Double woMixVar, Double woBdnTotx,
			Double woLbrTotx, Double woMtlTotx, Double woSubTotx,
			Double woOvhTotx, String woBatch, Double woAssay, String woGrade,
			Date woExpire, String woRctstat, String woLotNext,
			Boolean woLotRcpt, Boolean woRctstatActive, String woCaIntType,
			Date woDatePosted, String woIssSite, Integer woItmLine,
			String woQadc01, String woQadc02, String woQadc03, Date woQadt01,
			Date woQadt02, Double woQade01, Double woQade02, Double woQade03,
			Integer woQadi01, Integer woQadi02, Boolean woQadl01,
			Boolean woQadl02, String woEngCode, String woSub, String woFlrSub,
			String woMvarSub, String woMvrrSub, String woSvarSub,
			String woSvrrSub, String woXvarSub, String woRef,
			Date woRecordDate, Date woStatCloseDate, String woStatCloseUserid,
			String woAppOwner, Double oidWoMstr) {
		this.id = id;
		this.woSoJob = woSoJob;
		this.woOrdDate = woOrdDate;
		this.woRelDate = woRelDate;
		this.woDueDate = woDueDate;
		this.woPerDate = woPerDate;
		this.woPart = woPart;
		this.woType = woType;
		this.woQtyOrd = woQtyOrd;
		this.woQtyComp = woQtyComp;
		this.woQtyRjct = woQtyRjct;
		this.woStatus = woStatus;
		this.woVend = woVend;
		this.woRmks = woRmks;
		this.woQtyChg = woQtyChg;
		this.woRjctChg = woRjctChg;
		this.woBoChg = woBoChg;
		this.woYieldPct = woYieldPct;
		this.woRev = woRev;
		this.woAcct = woAcct;
		this.woCc = woCc;
		this.woQad01 = woQad01;
		this.woLotPrev = woLotPrev;
		this.woSchdType = woSchdType;
		this.woCmtindx = woCmtindx;
		this.woProject = woProject;
		this.woLeadTime = woLeadTime;
		this.woWipTot = woWipTot;
		this.woLbrTot = woLbrTot;
		this.woMtlTot = woMtlTot;
		this.woBdnTot = woBdnTot;
		this.woSubTot = woSubTot;
		this.woUser1 = woUser1;
		this.woUser2 = woUser2;
		this.woOvhTot = woOvhTot;
		this.woLoc = woLoc;
		this.woSerial = woSerial;
		this.woRouting = woRouting;
		this.woBomCode = woBomCode;
		this.woSite = woSite;
		this.woQueueEff = woQueueEff;
		this.woDraw = woDraw;
		this.woLbrUp = woLbrUp;
		this.woBdnUp = woBdnUp;
		this.woGlLbr = woGlLbr;
		this.woGlBdn = woGlBdn;
		this.woChr01 = woChr01;
		this.woChr02 = woChr02;
		this.woChr03 = woChr03;
		this.woChr04 = woChr04;
		this.woChr05 = woChr05;
		this.woDte01 = woDte01;
		this.woDte02 = woDte02;
		this.woDec01 = woDec01;
		this.woDec02 = woDec02;
		this.woLog01 = woLog01;
		this.woLine = woLine;
		this.woVar = woVar;
		this.woMtlVar = woMtlVar;
		this.woLbrVar = woLbrVar;
		this.woBdnVar = woBdnVar;
		this.woSubVar = woSubVar;
		this.woMvarAcct = woMvarAcct;
		this.woMvarCc = woMvarCc;
		this.woMvrrAcct = woMvrrAcct;
		this.woMvrrCc = woMvrrCc;
		this.woSvarAcct = woSvarAcct;
		this.woSvarCc = woSvarCc;
		this.woSvrrAcct = woSvrrAcct;
		this.woSvrrCc = woSvrrCc;
		this.woFlrAcct = woFlrAcct;
		this.woFlrCc = woFlrCc;
		this.woDec03 = woDec03;
		this.woRjctTot = woRjctTot;
		this.woMthdVar = woMthdVar;
		this.woRvalTot = woRvalTot;
		this.woAcctClose = woAcctClose;
		this.woCloseDate = woCloseDate;
		this.woCloseEff = woCloseEff;
		this.woFsmType = woFsmType;
		this.woXvarAcct = woXvarAcct;
		this.woXvarCc = woXvarCc;
		this.woMyldVar = woMyldVar;
		this.woJointType = woJointType;
		this.woProdPct = woProdPct;
		this.woQtyType = woQtyType;
		this.woDec04 = woDec04;
		this.woBaseId = woBaseId;
		this.woUnitCost = woUnitCost;
		this.woMixVar = woMixVar;
		this.woBdnTotx = woBdnTotx;
		this.woLbrTotx = woLbrTotx;
		this.woMtlTotx = woMtlTotx;
		this.woSubTotx = woSubTotx;
		this.woOvhTotx = woOvhTotx;
		this.woBatch = woBatch;
		this.woAssay = woAssay;
		this.woGrade = woGrade;
		this.woExpire = woExpire;
		this.woRctstat = woRctstat;
		this.woLotNext = woLotNext;
		this.woLotRcpt = woLotRcpt;
		this.woRctstatActive = woRctstatActive;
		this.woCaIntType = woCaIntType;
		this.woDatePosted = woDatePosted;
		this.woIssSite = woIssSite;
		this.woItmLine = woItmLine;
		this.woQadc01 = woQadc01;
		this.woQadc02 = woQadc02;
		this.woQadc03 = woQadc03;
		this.woQadt01 = woQadt01;
		this.woQadt02 = woQadt02;
		this.woQade01 = woQade01;
		this.woQade02 = woQade02;
		this.woQade03 = woQade03;
		this.woQadi01 = woQadi01;
		this.woQadi02 = woQadi02;
		this.woQadl01 = woQadl01;
		this.woQadl02 = woQadl02;
		this.woEngCode = woEngCode;
		this.woSub = woSub;
		this.woFlrSub = woFlrSub;
		this.woMvarSub = woMvarSub;
		this.woMvrrSub = woMvrrSub;
		this.woSvarSub = woSvarSub;
		this.woSvrrSub = woSvrrSub;
		this.woXvarSub = woXvarSub;
		this.woRef = woRef;
		this.woRecordDate = woRecordDate;
		this.woStatCloseDate = woStatCloseDate;
		this.woStatCloseUserid = woStatCloseUserid;
		this.woAppOwner = woAppOwner;
		this.oidWoMstr = oidWoMstr;
	}

	// Property accessors

	public WoMstrId getId() {
		return this.id;
	}

	public void setId(WoMstrId id) {
		this.id = id;
	}

	public String getWoSoJob() {
		return this.woSoJob;
	}

	public void setWoSoJob(String woSoJob) {
		this.woSoJob = woSoJob;
	}

	public Date getWoOrdDate() {
		return this.woOrdDate;
	}

	public void setWoOrdDate(Date woOrdDate) {
		this.woOrdDate = woOrdDate;
	}

	public Date getWoRelDate() {
		return this.woRelDate;
	}

	public void setWoRelDate(Date woRelDate) {
		this.woRelDate = woRelDate;
	}

	public Date getWoDueDate() {
		return this.woDueDate;
	}

	public void setWoDueDate(Date woDueDate) {
		this.woDueDate = woDueDate;
	}

	public Date getWoPerDate() {
		return this.woPerDate;
	}

	public void setWoPerDate(Date woPerDate) {
		this.woPerDate = woPerDate;
	}

	public String getWoPart() {
		return this.woPart;
	}

	public void setWoPart(String woPart) {
		this.woPart = woPart;
	}

	public String getWoType() {
		return this.woType;
	}

	public void setWoType(String woType) {
		this.woType = woType;
	}

	public Double getWoQtyOrd() {
		return this.woQtyOrd;
	}

	public void setWoQtyOrd(Double woQtyOrd) {
		this.woQtyOrd = woQtyOrd;
	}

	public Double getWoQtyComp() {
		return this.woQtyComp;
	}

	public void setWoQtyComp(Double woQtyComp) {
		this.woQtyComp = woQtyComp;
	}

	public Double getWoQtyRjct() {
		return this.woQtyRjct;
	}

	public void setWoQtyRjct(Double woQtyRjct) {
		this.woQtyRjct = woQtyRjct;
	}

	public String getWoStatus() {
		return this.woStatus;
	}

	public void setWoStatus(String woStatus) {
		this.woStatus = woStatus;
	}

	public String getWoVend() {
		return this.woVend;
	}

	public void setWoVend(String woVend) {
		this.woVend = woVend;
	}

	public String getWoRmks() {
		return this.woRmks;
	}

	public void setWoRmks(String woRmks) {
		this.woRmks = woRmks;
	}

	public Double getWoQtyChg() {
		return this.woQtyChg;
	}

	public void setWoQtyChg(Double woQtyChg) {
		this.woQtyChg = woQtyChg;
	}

	public Double getWoRjctChg() {
		return this.woRjctChg;
	}

	public void setWoRjctChg(Double woRjctChg) {
		this.woRjctChg = woRjctChg;
	}

	public Double getWoBoChg() {
		return this.woBoChg;
	}

	public void setWoBoChg(Double woBoChg) {
		this.woBoChg = woBoChg;
	}

	public Double getWoYieldPct() {
		return this.woYieldPct;
	}

	public void setWoYieldPct(Double woYieldPct) {
		this.woYieldPct = woYieldPct;
	}

	public String getWoRev() {
		return this.woRev;
	}

	public void setWoRev(String woRev) {
		this.woRev = woRev;
	}

	public String getWoAcct() {
		return this.woAcct;
	}

	public void setWoAcct(String woAcct) {
		this.woAcct = woAcct;
	}

	public String getWoCc() {
		return this.woCc;
	}

	public void setWoCc(String woCc) {
		this.woCc = woCc;
	}

	public String getWoQad01() {
		return this.woQad01;
	}

	public void setWoQad01(String woQad01) {
		this.woQad01 = woQad01;
	}

	public String getWoLotPrev() {
		return this.woLotPrev;
	}

	public void setWoLotPrev(String woLotPrev) {
		this.woLotPrev = woLotPrev;
	}

	public String getWoSchdType() {
		return this.woSchdType;
	}

	public void setWoSchdType(String woSchdType) {
		this.woSchdType = woSchdType;
	}

	public Integer getWoCmtindx() {
		return this.woCmtindx;
	}

	public void setWoCmtindx(Integer woCmtindx) {
		this.woCmtindx = woCmtindx;
	}

	public String getWoProject() {
		return this.woProject;
	}

	public void setWoProject(String woProject) {
		this.woProject = woProject;
	}

	public Integer getWoLeadTime() {
		return this.woLeadTime;
	}

	public void setWoLeadTime(Integer woLeadTime) {
		this.woLeadTime = woLeadTime;
	}

	public Double getWoWipTot() {
		return this.woWipTot;
	}

	public void setWoWipTot(Double woWipTot) {
		this.woWipTot = woWipTot;
	}

	public Double getWoLbrTot() {
		return this.woLbrTot;
	}

	public void setWoLbrTot(Double woLbrTot) {
		this.woLbrTot = woLbrTot;
	}

	public Double getWoMtlTot() {
		return this.woMtlTot;
	}

	public void setWoMtlTot(Double woMtlTot) {
		this.woMtlTot = woMtlTot;
	}

	public Double getWoBdnTot() {
		return this.woBdnTot;
	}

	public void setWoBdnTot(Double woBdnTot) {
		this.woBdnTot = woBdnTot;
	}

	public Double getWoSubTot() {
		return this.woSubTot;
	}

	public void setWoSubTot(Double woSubTot) {
		this.woSubTot = woSubTot;
	}

	public String getWoUser1() {
		return this.woUser1;
	}

	public void setWoUser1(String woUser1) {
		this.woUser1 = woUser1;
	}

	public String getWoUser2() {
		return this.woUser2;
	}

	public void setWoUser2(String woUser2) {
		this.woUser2 = woUser2;
	}

	public Double getWoOvhTot() {
		return this.woOvhTot;
	}

	public void setWoOvhTot(Double woOvhTot) {
		this.woOvhTot = woOvhTot;
	}

	public String getWoLoc() {
		return this.woLoc;
	}

	public void setWoLoc(String woLoc) {
		this.woLoc = woLoc;
	}

	public String getWoSerial() {
		return this.woSerial;
	}

	public void setWoSerial(String woSerial) {
		this.woSerial = woSerial;
	}

	public String getWoRouting() {
		return this.woRouting;
	}

	public void setWoRouting(String woRouting) {
		this.woRouting = woRouting;
	}

	public String getWoBomCode() {
		return this.woBomCode;
	}

	public void setWoBomCode(String woBomCode) {
		this.woBomCode = woBomCode;
	}

	public String getWoSite() {
		return this.woSite;
	}

	public void setWoSite(String woSite) {
		this.woSite = woSite;
	}

	public Double getWoQueueEff() {
		return this.woQueueEff;
	}

	public void setWoQueueEff(Double woQueueEff) {
		this.woQueueEff = woQueueEff;
	}

	public String getWoDraw() {
		return this.woDraw;
	}

	public void setWoDraw(String woDraw) {
		this.woDraw = woDraw;
	}

	public Boolean getWoLbrUp() {
		return this.woLbrUp;
	}

	public void setWoLbrUp(Boolean woLbrUp) {
		this.woLbrUp = woLbrUp;
	}

	public Boolean getWoBdnUp() {
		return this.woBdnUp;
	}

	public void setWoBdnUp(Boolean woBdnUp) {
		this.woBdnUp = woBdnUp;
	}

	public Boolean getWoGlLbr() {
		return this.woGlLbr;
	}

	public void setWoGlLbr(Boolean woGlLbr) {
		this.woGlLbr = woGlLbr;
	}

	public Boolean getWoGlBdn() {
		return this.woGlBdn;
	}

	public void setWoGlBdn(Boolean woGlBdn) {
		this.woGlBdn = woGlBdn;
	}

	public String getWoChr01() {
		return this.woChr01;
	}

	public void setWoChr01(String woChr01) {
		this.woChr01 = woChr01;
	}

	public String getWoChr02() {
		return this.woChr02;
	}

	public void setWoChr02(String woChr02) {
		this.woChr02 = woChr02;
	}

	public String getWoChr03() {
		return this.woChr03;
	}

	public void setWoChr03(String woChr03) {
		this.woChr03 = woChr03;
	}

	public String getWoChr04() {
		return this.woChr04;
	}

	public void setWoChr04(String woChr04) {
		this.woChr04 = woChr04;
	}

	public String getWoChr05() {
		return this.woChr05;
	}

	public void setWoChr05(String woChr05) {
		this.woChr05 = woChr05;
	}

	public Date getWoDte01() {
		return this.woDte01;
	}

	public void setWoDte01(Date woDte01) {
		this.woDte01 = woDte01;
	}

	public Date getWoDte02() {
		return this.woDte02;
	}

	public void setWoDte02(Date woDte02) {
		this.woDte02 = woDte02;
	}

	public Double getWoDec01() {
		return this.woDec01;
	}

	public void setWoDec01(Double woDec01) {
		this.woDec01 = woDec01;
	}

	public Double getWoDec02() {
		return this.woDec02;
	}

	public void setWoDec02(Double woDec02) {
		this.woDec02 = woDec02;
	}

	public Boolean getWoLog01() {
		return this.woLog01;
	}

	public void setWoLog01(Boolean woLog01) {
		this.woLog01 = woLog01;
	}

	public String getWoLine() {
		return this.woLine;
	}

	public void setWoLine(String woLine) {
		this.woLine = woLine;
	}

	public Boolean getWoVar() {
		return this.woVar;
	}

	public void setWoVar(Boolean woVar) {
		this.woVar = woVar;
	}

	public Double getWoMtlVar() {
		return this.woMtlVar;
	}

	public void setWoMtlVar(Double woMtlVar) {
		this.woMtlVar = woMtlVar;
	}

	public Double getWoLbrVar() {
		return this.woLbrVar;
	}

	public void setWoLbrVar(Double woLbrVar) {
		this.woLbrVar = woLbrVar;
	}

	public Double getWoBdnVar() {
		return this.woBdnVar;
	}

	public void setWoBdnVar(Double woBdnVar) {
		this.woBdnVar = woBdnVar;
	}

	public Double getWoSubVar() {
		return this.woSubVar;
	}

	public void setWoSubVar(Double woSubVar) {
		this.woSubVar = woSubVar;
	}

	public String getWoMvarAcct() {
		return this.woMvarAcct;
	}

	public void setWoMvarAcct(String woMvarAcct) {
		this.woMvarAcct = woMvarAcct;
	}

	public String getWoMvarCc() {
		return this.woMvarCc;
	}

	public void setWoMvarCc(String woMvarCc) {
		this.woMvarCc = woMvarCc;
	}

	public String getWoMvrrAcct() {
		return this.woMvrrAcct;
	}

	public void setWoMvrrAcct(String woMvrrAcct) {
		this.woMvrrAcct = woMvrrAcct;
	}

	public String getWoMvrrCc() {
		return this.woMvrrCc;
	}

	public void setWoMvrrCc(String woMvrrCc) {
		this.woMvrrCc = woMvrrCc;
	}

	public String getWoSvarAcct() {
		return this.woSvarAcct;
	}

	public void setWoSvarAcct(String woSvarAcct) {
		this.woSvarAcct = woSvarAcct;
	}

	public String getWoSvarCc() {
		return this.woSvarCc;
	}

	public void setWoSvarCc(String woSvarCc) {
		this.woSvarCc = woSvarCc;
	}

	public String getWoSvrrAcct() {
		return this.woSvrrAcct;
	}

	public void setWoSvrrAcct(String woSvrrAcct) {
		this.woSvrrAcct = woSvrrAcct;
	}

	public String getWoSvrrCc() {
		return this.woSvrrCc;
	}

	public void setWoSvrrCc(String woSvrrCc) {
		this.woSvrrCc = woSvrrCc;
	}

	public String getWoFlrAcct() {
		return this.woFlrAcct;
	}

	public void setWoFlrAcct(String woFlrAcct) {
		this.woFlrAcct = woFlrAcct;
	}

	public String getWoFlrCc() {
		return this.woFlrCc;
	}

	public void setWoFlrCc(String woFlrCc) {
		this.woFlrCc = woFlrCc;
	}

	public Double getWoDec03() {
		return this.woDec03;
	}

	public void setWoDec03(Double woDec03) {
		this.woDec03 = woDec03;
	}

	public Double getWoRjctTot() {
		return this.woRjctTot;
	}

	public void setWoRjctTot(Double woRjctTot) {
		this.woRjctTot = woRjctTot;
	}

	public Double getWoMthdVar() {
		return this.woMthdVar;
	}

	public void setWoMthdVar(Double woMthdVar) {
		this.woMthdVar = woMthdVar;
	}

	public Double getWoRvalTot() {
		return this.woRvalTot;
	}

	public void setWoRvalTot(Double woRvalTot) {
		this.woRvalTot = woRvalTot;
	}

	public Boolean getWoAcctClose() {
		return this.woAcctClose;
	}

	public void setWoAcctClose(Boolean woAcctClose) {
		this.woAcctClose = woAcctClose;
	}

	public Date getWoCloseDate() {
		return this.woCloseDate;
	}

	public void setWoCloseDate(Date woCloseDate) {
		this.woCloseDate = woCloseDate;
	}

	public Date getWoCloseEff() {
		return this.woCloseEff;
	}

	public void setWoCloseEff(Date woCloseEff) {
		this.woCloseEff = woCloseEff;
	}

	public String getWoFsmType() {
		return this.woFsmType;
	}

	public void setWoFsmType(String woFsmType) {
		this.woFsmType = woFsmType;
	}

	public String getWoXvarAcct() {
		return this.woXvarAcct;
	}

	public void setWoXvarAcct(String woXvarAcct) {
		this.woXvarAcct = woXvarAcct;
	}

	public String getWoXvarCc() {
		return this.woXvarCc;
	}

	public void setWoXvarCc(String woXvarCc) {
		this.woXvarCc = woXvarCc;
	}

	public Double getWoMyldVar() {
		return this.woMyldVar;
	}

	public void setWoMyldVar(Double woMyldVar) {
		this.woMyldVar = woMyldVar;
	}

	public String getWoJointType() {
		return this.woJointType;
	}

	public void setWoJointType(String woJointType) {
		this.woJointType = woJointType;
	}

	public Double getWoProdPct() {
		return this.woProdPct;
	}

	public void setWoProdPct(Double woProdPct) {
		this.woProdPct = woProdPct;
	}

	public String getWoQtyType() {
		return this.woQtyType;
	}

	public void setWoQtyType(String woQtyType) {
		this.woQtyType = woQtyType;
	}

	public Double getWoDec04() {
		return this.woDec04;
	}

	public void setWoDec04(Double woDec04) {
		this.woDec04 = woDec04;
	}

	public String getWoBaseId() {
		return this.woBaseId;
	}

	public void setWoBaseId(String woBaseId) {
		this.woBaseId = woBaseId;
	}

	public Double getWoUnitCost() {
		return this.woUnitCost;
	}

	public void setWoUnitCost(Double woUnitCost) {
		this.woUnitCost = woUnitCost;
	}

	public Double getWoMixVar() {
		return this.woMixVar;
	}

	public void setWoMixVar(Double woMixVar) {
		this.woMixVar = woMixVar;
	}

	public Double getWoBdnTotx() {
		return this.woBdnTotx;
	}

	public void setWoBdnTotx(Double woBdnTotx) {
		this.woBdnTotx = woBdnTotx;
	}

	public Double getWoLbrTotx() {
		return this.woLbrTotx;
	}

	public void setWoLbrTotx(Double woLbrTotx) {
		this.woLbrTotx = woLbrTotx;
	}

	public Double getWoMtlTotx() {
		return this.woMtlTotx;
	}

	public void setWoMtlTotx(Double woMtlTotx) {
		this.woMtlTotx = woMtlTotx;
	}

	public Double getWoSubTotx() {
		return this.woSubTotx;
	}

	public void setWoSubTotx(Double woSubTotx) {
		this.woSubTotx = woSubTotx;
	}

	public Double getWoOvhTotx() {
		return this.woOvhTotx;
	}

	public void setWoOvhTotx(Double woOvhTotx) {
		this.woOvhTotx = woOvhTotx;
	}

	public String getWoBatch() {
		return this.woBatch;
	}

	public void setWoBatch(String woBatch) {
		this.woBatch = woBatch;
	}

	public Double getWoAssay() {
		return this.woAssay;
	}

	public void setWoAssay(Double woAssay) {
		this.woAssay = woAssay;
	}

	public String getWoGrade() {
		return this.woGrade;
	}

	public void setWoGrade(String woGrade) {
		this.woGrade = woGrade;
	}

	public Date getWoExpire() {
		return this.woExpire;
	}

	public void setWoExpire(Date woExpire) {
		this.woExpire = woExpire;
	}

	public String getWoRctstat() {
		return this.woRctstat;
	}

	public void setWoRctstat(String woRctstat) {
		this.woRctstat = woRctstat;
	}

	public String getWoLotNext() {
		return this.woLotNext;
	}

	public void setWoLotNext(String woLotNext) {
		this.woLotNext = woLotNext;
	}

	public Boolean getWoLotRcpt() {
		return this.woLotRcpt;
	}

	public void setWoLotRcpt(Boolean woLotRcpt) {
		this.woLotRcpt = woLotRcpt;
	}

	public Boolean getWoRctstatActive() {
		return this.woRctstatActive;
	}

	public void setWoRctstatActive(Boolean woRctstatActive) {
		this.woRctstatActive = woRctstatActive;
	}

	public String getWoCaIntType() {
		return this.woCaIntType;
	}

	public void setWoCaIntType(String woCaIntType) {
		this.woCaIntType = woCaIntType;
	}

	public Date getWoDatePosted() {
		return this.woDatePosted;
	}

	public void setWoDatePosted(Date woDatePosted) {
		this.woDatePosted = woDatePosted;
	}

	public String getWoIssSite() {
		return this.woIssSite;
	}

	public void setWoIssSite(String woIssSite) {
		this.woIssSite = woIssSite;
	}

	public Integer getWoItmLine() {
		return this.woItmLine;
	}

	public void setWoItmLine(Integer woItmLine) {
		this.woItmLine = woItmLine;
	}

	public String getWoQadc01() {
		return this.woQadc01;
	}

	public void setWoQadc01(String woQadc01) {
		this.woQadc01 = woQadc01;
	}

	public String getWoQadc02() {
		return this.woQadc02;
	}

	public void setWoQadc02(String woQadc02) {
		this.woQadc02 = woQadc02;
	}

	public String getWoQadc03() {
		return this.woQadc03;
	}

	public void setWoQadc03(String woQadc03) {
		this.woQadc03 = woQadc03;
	}

	public Date getWoQadt01() {
		return this.woQadt01;
	}

	public void setWoQadt01(Date woQadt01) {
		this.woQadt01 = woQadt01;
	}

	public Date getWoQadt02() {
		return this.woQadt02;
	}

	public void setWoQadt02(Date woQadt02) {
		this.woQadt02 = woQadt02;
	}

	public Double getWoQade01() {
		return this.woQade01;
	}

	public void setWoQade01(Double woQade01) {
		this.woQade01 = woQade01;
	}

	public Double getWoQade02() {
		return this.woQade02;
	}

	public void setWoQade02(Double woQade02) {
		this.woQade02 = woQade02;
	}

	public Double getWoQade03() {
		return this.woQade03;
	}

	public void setWoQade03(Double woQade03) {
		this.woQade03 = woQade03;
	}

	public Integer getWoQadi01() {
		return this.woQadi01;
	}

	public void setWoQadi01(Integer woQadi01) {
		this.woQadi01 = woQadi01;
	}

	public Integer getWoQadi02() {
		return this.woQadi02;
	}

	public void setWoQadi02(Integer woQadi02) {
		this.woQadi02 = woQadi02;
	}

	public Boolean getWoQadl01() {
		return this.woQadl01;
	}

	public void setWoQadl01(Boolean woQadl01) {
		this.woQadl01 = woQadl01;
	}

	public Boolean getWoQadl02() {
		return this.woQadl02;
	}

	public void setWoQadl02(Boolean woQadl02) {
		this.woQadl02 = woQadl02;
	}

	public String getWoEngCode() {
		return this.woEngCode;
	}

	public void setWoEngCode(String woEngCode) {
		this.woEngCode = woEngCode;
	}

	public String getWoSub() {
		return this.woSub;
	}

	public void setWoSub(String woSub) {
		this.woSub = woSub;
	}

	public String getWoFlrSub() {
		return this.woFlrSub;
	}

	public void setWoFlrSub(String woFlrSub) {
		this.woFlrSub = woFlrSub;
	}

	public String getWoMvarSub() {
		return this.woMvarSub;
	}

	public void setWoMvarSub(String woMvarSub) {
		this.woMvarSub = woMvarSub;
	}

	public String getWoMvrrSub() {
		return this.woMvrrSub;
	}

	public void setWoMvrrSub(String woMvrrSub) {
		this.woMvrrSub = woMvrrSub;
	}

	public String getWoSvarSub() {
		return this.woSvarSub;
	}

	public void setWoSvarSub(String woSvarSub) {
		this.woSvarSub = woSvarSub;
	}

	public String getWoSvrrSub() {
		return this.woSvrrSub;
	}

	public void setWoSvrrSub(String woSvrrSub) {
		this.woSvrrSub = woSvrrSub;
	}

	public String getWoXvarSub() {
		return this.woXvarSub;
	}

	public void setWoXvarSub(String woXvarSub) {
		this.woXvarSub = woXvarSub;
	}

	public String getWoRef() {
		return this.woRef;
	}

	public void setWoRef(String woRef) {
		this.woRef = woRef;
	}

	public Date getWoRecordDate() {
		return this.woRecordDate;
	}

	public void setWoRecordDate(Date woRecordDate) {
		this.woRecordDate = woRecordDate;
	}

	public Date getWoStatCloseDate() {
		return this.woStatCloseDate;
	}

	public void setWoStatCloseDate(Date woStatCloseDate) {
		this.woStatCloseDate = woStatCloseDate;
	}

	public String getWoStatCloseUserid() {
		return this.woStatCloseUserid;
	}

	public void setWoStatCloseUserid(String woStatCloseUserid) {
		this.woStatCloseUserid = woStatCloseUserid;
	}

	public String getWoAppOwner() {
		return this.woAppOwner;
	}

	public void setWoAppOwner(String woAppOwner) {
		this.woAppOwner = woAppOwner;
	}

	public Double getOidWoMstr() {
		return this.oidWoMstr;
	}

	public void setOidWoMstr(Double oidWoMstr) {
		this.oidWoMstr = oidWoMstr;
	}

}