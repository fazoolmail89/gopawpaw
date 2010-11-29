package com.gopawpaw.erp.hibernate.p;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractPtpDet entity provides the base persistence definition of the PtpDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtpDet implements java.io.Serializable {

	// Fields

	private PtpDetId id;
	private Double ptpBatch;
	private String ptpBomCode;
	private Date ptpQad01;
	private String ptpBuyer;
	private Integer ptpCumLead;
	private BigDecimal ptpQad02;
	private Integer ptpInsLead;
	private Boolean ptpInsRqd;
	private Boolean ptpIssPol;
	private BigDecimal ptpMfgLead;
	private Boolean ptpMs;
	private BigDecimal ptpOrdMax;
	private BigDecimal ptpOrdMin;
	private BigDecimal ptpOrdMult;
	private Integer ptpOrdPer;
	private String ptpOrdPol;
	private Double ptpOrdQty;
	private Boolean ptpPhantom;
	private Boolean ptpPlanOrd;
	private String ptpPmCode;
	private Integer ptpPurLead;
	private String ptpRev;
	private BigDecimal ptpRop;
	private String ptpRouting;
	private Double ptpRun;
	private Double ptpRunLl;
	private Double ptpSetup;
	private Double ptpSetupLl;
	private BigDecimal ptpSftyStk;
	private BigDecimal ptpSftyTme;
	private Integer ptpTimefnce;
	private String ptpUser1;
	private String ptpUser2;
	private String ptpVend;
	private Double ptpYldPct;
	private Double ptpAssay;
	private String ptpGrade;
	private String ptpNetwork;
	private Integer ptpQad03;
	private Integer ptpQad04;
	private Date ptpAdded;
	private Integer ptpQad05;
	private String ptpDraw;
	private Boolean ptpEcoPend;
	private Integer ptpLlBom;
	private Boolean ptpRollup;
	private String ptpTrantype;
	private String ptpChr01;
	private String ptpChr02;
	private String ptpChr03;
	private String ptpChr04;
	private String ptpChr05;
	private String ptpChr06;
	private String ptpChr07;
	private String ptpChr08;
	private String ptpChr09;
	private String ptpChr10;
	private Double ptpDec01;
	private Double ptpDec02;
	private Date ptpDte01;
	private Date ptpDte02;
	private Boolean ptpLog01;
	private Boolean ptpLog02;
	private Integer ptpLlDrp;
	private String ptpPoSite;
	private String ptpUserid;
	private Date ptpModDate;
	private String ptpRollupId;
	private Double ptpMfgPct;
	private Double ptpPurPct;
	private Double ptpDrpPct;
	private String ptpPouCode;
	private Double ptpWksAvg;
	private Double ptpWksMax;
	private Double ptpWksMin;
	private Integer ptpPickLogic;
	private String ptpJointType;
	private String ptpBtbType;
	private String ptpCfgType;
	private Boolean ptpOpYield;
	private String ptpRunSeq1;
	private String ptpRunSeq2;
	private String ptpAtpEnforcement;
	private Boolean ptpAtpFamily;
	private Double oidPtpDet;

	// Constructors

	/** default constructor */
	public AbstractPtpDet() {
	}

	/** minimal constructor */
	public AbstractPtpDet(PtpDetId id, Date ptpAdded, String ptpDraw,
			Boolean ptpEcoPend, Integer ptpLlBom, Boolean ptpRollup,
			String ptpTrantype, Integer ptpLlDrp, String ptpJointType,
			String ptpBtbType, String ptpRunSeq1, String ptpRunSeq2,
			String ptpAtpEnforcement, Boolean ptpAtpFamily, Double oidPtpDet) {
		this.id = id;
		this.ptpAdded = ptpAdded;
		this.ptpDraw = ptpDraw;
		this.ptpEcoPend = ptpEcoPend;
		this.ptpLlBom = ptpLlBom;
		this.ptpRollup = ptpRollup;
		this.ptpTrantype = ptpTrantype;
		this.ptpLlDrp = ptpLlDrp;
		this.ptpJointType = ptpJointType;
		this.ptpBtbType = ptpBtbType;
		this.ptpRunSeq1 = ptpRunSeq1;
		this.ptpRunSeq2 = ptpRunSeq2;
		this.ptpAtpEnforcement = ptpAtpEnforcement;
		this.ptpAtpFamily = ptpAtpFamily;
		this.oidPtpDet = oidPtpDet;
	}

	/** full constructor */
	public AbstractPtpDet(PtpDetId id, Double ptpBatch, String ptpBomCode,
			Date ptpQad01, String ptpBuyer, Integer ptpCumLead,
			BigDecimal ptpQad02, Integer ptpInsLead, Boolean ptpInsRqd,
			Boolean ptpIssPol, BigDecimal ptpMfgLead, Boolean ptpMs,
			BigDecimal ptpOrdMax, BigDecimal ptpOrdMin, BigDecimal ptpOrdMult,
			Integer ptpOrdPer, String ptpOrdPol, Double ptpOrdQty,
			Boolean ptpPhantom, Boolean ptpPlanOrd, String ptpPmCode,
			Integer ptpPurLead, String ptpRev, BigDecimal ptpRop,
			String ptpRouting, Double ptpRun, Double ptpRunLl, Double ptpSetup,
			Double ptpSetupLl, BigDecimal ptpSftyStk, BigDecimal ptpSftyTme,
			Integer ptpTimefnce, String ptpUser1, String ptpUser2,
			String ptpVend, Double ptpYldPct, Double ptpAssay, String ptpGrade,
			String ptpNetwork, Integer ptpQad03, Integer ptpQad04,
			Date ptpAdded, Integer ptpQad05, String ptpDraw,
			Boolean ptpEcoPend, Integer ptpLlBom, Boolean ptpRollup,
			String ptpTrantype, String ptpChr01, String ptpChr02,
			String ptpChr03, String ptpChr04, String ptpChr05, String ptpChr06,
			String ptpChr07, String ptpChr08, String ptpChr09, String ptpChr10,
			Double ptpDec01, Double ptpDec02, Date ptpDte01, Date ptpDte02,
			Boolean ptpLog01, Boolean ptpLog02, Integer ptpLlDrp,
			String ptpPoSite, String ptpUserid, Date ptpModDate,
			String ptpRollupId, Double ptpMfgPct, Double ptpPurPct,
			Double ptpDrpPct, String ptpPouCode, Double ptpWksAvg,
			Double ptpWksMax, Double ptpWksMin, Integer ptpPickLogic,
			String ptpJointType, String ptpBtbType, String ptpCfgType,
			Boolean ptpOpYield, String ptpRunSeq1, String ptpRunSeq2,
			String ptpAtpEnforcement, Boolean ptpAtpFamily, Double oidPtpDet) {
		this.id = id;
		this.ptpBatch = ptpBatch;
		this.ptpBomCode = ptpBomCode;
		this.ptpQad01 = ptpQad01;
		this.ptpBuyer = ptpBuyer;
		this.ptpCumLead = ptpCumLead;
		this.ptpQad02 = ptpQad02;
		this.ptpInsLead = ptpInsLead;
		this.ptpInsRqd = ptpInsRqd;
		this.ptpIssPol = ptpIssPol;
		this.ptpMfgLead = ptpMfgLead;
		this.ptpMs = ptpMs;
		this.ptpOrdMax = ptpOrdMax;
		this.ptpOrdMin = ptpOrdMin;
		this.ptpOrdMult = ptpOrdMult;
		this.ptpOrdPer = ptpOrdPer;
		this.ptpOrdPol = ptpOrdPol;
		this.ptpOrdQty = ptpOrdQty;
		this.ptpPhantom = ptpPhantom;
		this.ptpPlanOrd = ptpPlanOrd;
		this.ptpPmCode = ptpPmCode;
		this.ptpPurLead = ptpPurLead;
		this.ptpRev = ptpRev;
		this.ptpRop = ptpRop;
		this.ptpRouting = ptpRouting;
		this.ptpRun = ptpRun;
		this.ptpRunLl = ptpRunLl;
		this.ptpSetup = ptpSetup;
		this.ptpSetupLl = ptpSetupLl;
		this.ptpSftyStk = ptpSftyStk;
		this.ptpSftyTme = ptpSftyTme;
		this.ptpTimefnce = ptpTimefnce;
		this.ptpUser1 = ptpUser1;
		this.ptpUser2 = ptpUser2;
		this.ptpVend = ptpVend;
		this.ptpYldPct = ptpYldPct;
		this.ptpAssay = ptpAssay;
		this.ptpGrade = ptpGrade;
		this.ptpNetwork = ptpNetwork;
		this.ptpQad03 = ptpQad03;
		this.ptpQad04 = ptpQad04;
		this.ptpAdded = ptpAdded;
		this.ptpQad05 = ptpQad05;
		this.ptpDraw = ptpDraw;
		this.ptpEcoPend = ptpEcoPend;
		this.ptpLlBom = ptpLlBom;
		this.ptpRollup = ptpRollup;
		this.ptpTrantype = ptpTrantype;
		this.ptpChr01 = ptpChr01;
		this.ptpChr02 = ptpChr02;
		this.ptpChr03 = ptpChr03;
		this.ptpChr04 = ptpChr04;
		this.ptpChr05 = ptpChr05;
		this.ptpChr06 = ptpChr06;
		this.ptpChr07 = ptpChr07;
		this.ptpChr08 = ptpChr08;
		this.ptpChr09 = ptpChr09;
		this.ptpChr10 = ptpChr10;
		this.ptpDec01 = ptpDec01;
		this.ptpDec02 = ptpDec02;
		this.ptpDte01 = ptpDte01;
		this.ptpDte02 = ptpDte02;
		this.ptpLog01 = ptpLog01;
		this.ptpLog02 = ptpLog02;
		this.ptpLlDrp = ptpLlDrp;
		this.ptpPoSite = ptpPoSite;
		this.ptpUserid = ptpUserid;
		this.ptpModDate = ptpModDate;
		this.ptpRollupId = ptpRollupId;
		this.ptpMfgPct = ptpMfgPct;
		this.ptpPurPct = ptpPurPct;
		this.ptpDrpPct = ptpDrpPct;
		this.ptpPouCode = ptpPouCode;
		this.ptpWksAvg = ptpWksAvg;
		this.ptpWksMax = ptpWksMax;
		this.ptpWksMin = ptpWksMin;
		this.ptpPickLogic = ptpPickLogic;
		this.ptpJointType = ptpJointType;
		this.ptpBtbType = ptpBtbType;
		this.ptpCfgType = ptpCfgType;
		this.ptpOpYield = ptpOpYield;
		this.ptpRunSeq1 = ptpRunSeq1;
		this.ptpRunSeq2 = ptpRunSeq2;
		this.ptpAtpEnforcement = ptpAtpEnforcement;
		this.ptpAtpFamily = ptpAtpFamily;
		this.oidPtpDet = oidPtpDet;
	}

	// Property accessors

	public PtpDetId getId() {
		return this.id;
	}

	public void setId(PtpDetId id) {
		this.id = id;
	}

	public Double getPtpBatch() {
		return this.ptpBatch;
	}

	public void setPtpBatch(Double ptpBatch) {
		this.ptpBatch = ptpBatch;
	}

	public String getPtpBomCode() {
		return this.ptpBomCode;
	}

	public void setPtpBomCode(String ptpBomCode) {
		this.ptpBomCode = ptpBomCode;
	}

	public Date getPtpQad01() {
		return this.ptpQad01;
	}

	public void setPtpQad01(Date ptpQad01) {
		this.ptpQad01 = ptpQad01;
	}

	public String getPtpBuyer() {
		return this.ptpBuyer;
	}

	public void setPtpBuyer(String ptpBuyer) {
		this.ptpBuyer = ptpBuyer;
	}

	public Integer getPtpCumLead() {
		return this.ptpCumLead;
	}

	public void setPtpCumLead(Integer ptpCumLead) {
		this.ptpCumLead = ptpCumLead;
	}

	public BigDecimal getPtpQad02() {
		return this.ptpQad02;
	}

	public void setPtpQad02(BigDecimal ptpQad02) {
		this.ptpQad02 = ptpQad02;
	}

	public Integer getPtpInsLead() {
		return this.ptpInsLead;
	}

	public void setPtpInsLead(Integer ptpInsLead) {
		this.ptpInsLead = ptpInsLead;
	}

	public Boolean getPtpInsRqd() {
		return this.ptpInsRqd;
	}

	public void setPtpInsRqd(Boolean ptpInsRqd) {
		this.ptpInsRqd = ptpInsRqd;
	}

	public Boolean getPtpIssPol() {
		return this.ptpIssPol;
	}

	public void setPtpIssPol(Boolean ptpIssPol) {
		this.ptpIssPol = ptpIssPol;
	}

	public BigDecimal getPtpMfgLead() {
		return this.ptpMfgLead;
	}

	public void setPtpMfgLead(BigDecimal ptpMfgLead) {
		this.ptpMfgLead = ptpMfgLead;
	}

	public Boolean getPtpMs() {
		return this.ptpMs;
	}

	public void setPtpMs(Boolean ptpMs) {
		this.ptpMs = ptpMs;
	}

	public BigDecimal getPtpOrdMax() {
		return this.ptpOrdMax;
	}

	public void setPtpOrdMax(BigDecimal ptpOrdMax) {
		this.ptpOrdMax = ptpOrdMax;
	}

	public BigDecimal getPtpOrdMin() {
		return this.ptpOrdMin;
	}

	public void setPtpOrdMin(BigDecimal ptpOrdMin) {
		this.ptpOrdMin = ptpOrdMin;
	}

	public BigDecimal getPtpOrdMult() {
		return this.ptpOrdMult;
	}

	public void setPtpOrdMult(BigDecimal ptpOrdMult) {
		this.ptpOrdMult = ptpOrdMult;
	}

	public Integer getPtpOrdPer() {
		return this.ptpOrdPer;
	}

	public void setPtpOrdPer(Integer ptpOrdPer) {
		this.ptpOrdPer = ptpOrdPer;
	}

	public String getPtpOrdPol() {
		return this.ptpOrdPol;
	}

	public void setPtpOrdPol(String ptpOrdPol) {
		this.ptpOrdPol = ptpOrdPol;
	}

	public Double getPtpOrdQty() {
		return this.ptpOrdQty;
	}

	public void setPtpOrdQty(Double ptpOrdQty) {
		this.ptpOrdQty = ptpOrdQty;
	}

	public Boolean getPtpPhantom() {
		return this.ptpPhantom;
	}

	public void setPtpPhantom(Boolean ptpPhantom) {
		this.ptpPhantom = ptpPhantom;
	}

	public Boolean getPtpPlanOrd() {
		return this.ptpPlanOrd;
	}

	public void setPtpPlanOrd(Boolean ptpPlanOrd) {
		this.ptpPlanOrd = ptpPlanOrd;
	}

	public String getPtpPmCode() {
		return this.ptpPmCode;
	}

	public void setPtpPmCode(String ptpPmCode) {
		this.ptpPmCode = ptpPmCode;
	}

	public Integer getPtpPurLead() {
		return this.ptpPurLead;
	}

	public void setPtpPurLead(Integer ptpPurLead) {
		this.ptpPurLead = ptpPurLead;
	}

	public String getPtpRev() {
		return this.ptpRev;
	}

	public void setPtpRev(String ptpRev) {
		this.ptpRev = ptpRev;
	}

	public BigDecimal getPtpRop() {
		return this.ptpRop;
	}

	public void setPtpRop(BigDecimal ptpRop) {
		this.ptpRop = ptpRop;
	}

	public String getPtpRouting() {
		return this.ptpRouting;
	}

	public void setPtpRouting(String ptpRouting) {
		this.ptpRouting = ptpRouting;
	}

	public Double getPtpRun() {
		return this.ptpRun;
	}

	public void setPtpRun(Double ptpRun) {
		this.ptpRun = ptpRun;
	}

	public Double getPtpRunLl() {
		return this.ptpRunLl;
	}

	public void setPtpRunLl(Double ptpRunLl) {
		this.ptpRunLl = ptpRunLl;
	}

	public Double getPtpSetup() {
		return this.ptpSetup;
	}

	public void setPtpSetup(Double ptpSetup) {
		this.ptpSetup = ptpSetup;
	}

	public Double getPtpSetupLl() {
		return this.ptpSetupLl;
	}

	public void setPtpSetupLl(Double ptpSetupLl) {
		this.ptpSetupLl = ptpSetupLl;
	}

	public BigDecimal getPtpSftyStk() {
		return this.ptpSftyStk;
	}

	public void setPtpSftyStk(BigDecimal ptpSftyStk) {
		this.ptpSftyStk = ptpSftyStk;
	}

	public BigDecimal getPtpSftyTme() {
		return this.ptpSftyTme;
	}

	public void setPtpSftyTme(BigDecimal ptpSftyTme) {
		this.ptpSftyTme = ptpSftyTme;
	}

	public Integer getPtpTimefnce() {
		return this.ptpTimefnce;
	}

	public void setPtpTimefnce(Integer ptpTimefnce) {
		this.ptpTimefnce = ptpTimefnce;
	}

	public String getPtpUser1() {
		return this.ptpUser1;
	}

	public void setPtpUser1(String ptpUser1) {
		this.ptpUser1 = ptpUser1;
	}

	public String getPtpUser2() {
		return this.ptpUser2;
	}

	public void setPtpUser2(String ptpUser2) {
		this.ptpUser2 = ptpUser2;
	}

	public String getPtpVend() {
		return this.ptpVend;
	}

	public void setPtpVend(String ptpVend) {
		this.ptpVend = ptpVend;
	}

	public Double getPtpYldPct() {
		return this.ptpYldPct;
	}

	public void setPtpYldPct(Double ptpYldPct) {
		this.ptpYldPct = ptpYldPct;
	}

	public Double getPtpAssay() {
		return this.ptpAssay;
	}

	public void setPtpAssay(Double ptpAssay) {
		this.ptpAssay = ptpAssay;
	}

	public String getPtpGrade() {
		return this.ptpGrade;
	}

	public void setPtpGrade(String ptpGrade) {
		this.ptpGrade = ptpGrade;
	}

	public String getPtpNetwork() {
		return this.ptpNetwork;
	}

	public void setPtpNetwork(String ptpNetwork) {
		this.ptpNetwork = ptpNetwork;
	}

	public Integer getPtpQad03() {
		return this.ptpQad03;
	}

	public void setPtpQad03(Integer ptpQad03) {
		this.ptpQad03 = ptpQad03;
	}

	public Integer getPtpQad04() {
		return this.ptpQad04;
	}

	public void setPtpQad04(Integer ptpQad04) {
		this.ptpQad04 = ptpQad04;
	}

	public Date getPtpAdded() {
		return this.ptpAdded;
	}

	public void setPtpAdded(Date ptpAdded) {
		this.ptpAdded = ptpAdded;
	}

	public Integer getPtpQad05() {
		return this.ptpQad05;
	}

	public void setPtpQad05(Integer ptpQad05) {
		this.ptpQad05 = ptpQad05;
	}

	public String getPtpDraw() {
		return this.ptpDraw;
	}

	public void setPtpDraw(String ptpDraw) {
		this.ptpDraw = ptpDraw;
	}

	public Boolean getPtpEcoPend() {
		return this.ptpEcoPend;
	}

	public void setPtpEcoPend(Boolean ptpEcoPend) {
		this.ptpEcoPend = ptpEcoPend;
	}

	public Integer getPtpLlBom() {
		return this.ptpLlBom;
	}

	public void setPtpLlBom(Integer ptpLlBom) {
		this.ptpLlBom = ptpLlBom;
	}

	public Boolean getPtpRollup() {
		return this.ptpRollup;
	}

	public void setPtpRollup(Boolean ptpRollup) {
		this.ptpRollup = ptpRollup;
	}

	public String getPtpTrantype() {
		return this.ptpTrantype;
	}

	public void setPtpTrantype(String ptpTrantype) {
		this.ptpTrantype = ptpTrantype;
	}

	public String getPtpChr01() {
		return this.ptpChr01;
	}

	public void setPtpChr01(String ptpChr01) {
		this.ptpChr01 = ptpChr01;
	}

	public String getPtpChr02() {
		return this.ptpChr02;
	}

	public void setPtpChr02(String ptpChr02) {
		this.ptpChr02 = ptpChr02;
	}

	public String getPtpChr03() {
		return this.ptpChr03;
	}

	public void setPtpChr03(String ptpChr03) {
		this.ptpChr03 = ptpChr03;
	}

	public String getPtpChr04() {
		return this.ptpChr04;
	}

	public void setPtpChr04(String ptpChr04) {
		this.ptpChr04 = ptpChr04;
	}

	public String getPtpChr05() {
		return this.ptpChr05;
	}

	public void setPtpChr05(String ptpChr05) {
		this.ptpChr05 = ptpChr05;
	}

	public String getPtpChr06() {
		return this.ptpChr06;
	}

	public void setPtpChr06(String ptpChr06) {
		this.ptpChr06 = ptpChr06;
	}

	public String getPtpChr07() {
		return this.ptpChr07;
	}

	public void setPtpChr07(String ptpChr07) {
		this.ptpChr07 = ptpChr07;
	}

	public String getPtpChr08() {
		return this.ptpChr08;
	}

	public void setPtpChr08(String ptpChr08) {
		this.ptpChr08 = ptpChr08;
	}

	public String getPtpChr09() {
		return this.ptpChr09;
	}

	public void setPtpChr09(String ptpChr09) {
		this.ptpChr09 = ptpChr09;
	}

	public String getPtpChr10() {
		return this.ptpChr10;
	}

	public void setPtpChr10(String ptpChr10) {
		this.ptpChr10 = ptpChr10;
	}

	public Double getPtpDec01() {
		return this.ptpDec01;
	}

	public void setPtpDec01(Double ptpDec01) {
		this.ptpDec01 = ptpDec01;
	}

	public Double getPtpDec02() {
		return this.ptpDec02;
	}

	public void setPtpDec02(Double ptpDec02) {
		this.ptpDec02 = ptpDec02;
	}

	public Date getPtpDte01() {
		return this.ptpDte01;
	}

	public void setPtpDte01(Date ptpDte01) {
		this.ptpDte01 = ptpDte01;
	}

	public Date getPtpDte02() {
		return this.ptpDte02;
	}

	public void setPtpDte02(Date ptpDte02) {
		this.ptpDte02 = ptpDte02;
	}

	public Boolean getPtpLog01() {
		return this.ptpLog01;
	}

	public void setPtpLog01(Boolean ptpLog01) {
		this.ptpLog01 = ptpLog01;
	}

	public Boolean getPtpLog02() {
		return this.ptpLog02;
	}

	public void setPtpLog02(Boolean ptpLog02) {
		this.ptpLog02 = ptpLog02;
	}

	public Integer getPtpLlDrp() {
		return this.ptpLlDrp;
	}

	public void setPtpLlDrp(Integer ptpLlDrp) {
		this.ptpLlDrp = ptpLlDrp;
	}

	public String getPtpPoSite() {
		return this.ptpPoSite;
	}

	public void setPtpPoSite(String ptpPoSite) {
		this.ptpPoSite = ptpPoSite;
	}

	public String getPtpUserid() {
		return this.ptpUserid;
	}

	public void setPtpUserid(String ptpUserid) {
		this.ptpUserid = ptpUserid;
	}

	public Date getPtpModDate() {
		return this.ptpModDate;
	}

	public void setPtpModDate(Date ptpModDate) {
		this.ptpModDate = ptpModDate;
	}

	public String getPtpRollupId() {
		return this.ptpRollupId;
	}

	public void setPtpRollupId(String ptpRollupId) {
		this.ptpRollupId = ptpRollupId;
	}

	public Double getPtpMfgPct() {
		return this.ptpMfgPct;
	}

	public void setPtpMfgPct(Double ptpMfgPct) {
		this.ptpMfgPct = ptpMfgPct;
	}

	public Double getPtpPurPct() {
		return this.ptpPurPct;
	}

	public void setPtpPurPct(Double ptpPurPct) {
		this.ptpPurPct = ptpPurPct;
	}

	public Double getPtpDrpPct() {
		return this.ptpDrpPct;
	}

	public void setPtpDrpPct(Double ptpDrpPct) {
		this.ptpDrpPct = ptpDrpPct;
	}

	public String getPtpPouCode() {
		return this.ptpPouCode;
	}

	public void setPtpPouCode(String ptpPouCode) {
		this.ptpPouCode = ptpPouCode;
	}

	public Double getPtpWksAvg() {
		return this.ptpWksAvg;
	}

	public void setPtpWksAvg(Double ptpWksAvg) {
		this.ptpWksAvg = ptpWksAvg;
	}

	public Double getPtpWksMax() {
		return this.ptpWksMax;
	}

	public void setPtpWksMax(Double ptpWksMax) {
		this.ptpWksMax = ptpWksMax;
	}

	public Double getPtpWksMin() {
		return this.ptpWksMin;
	}

	public void setPtpWksMin(Double ptpWksMin) {
		this.ptpWksMin = ptpWksMin;
	}

	public Integer getPtpPickLogic() {
		return this.ptpPickLogic;
	}

	public void setPtpPickLogic(Integer ptpPickLogic) {
		this.ptpPickLogic = ptpPickLogic;
	}

	public String getPtpJointType() {
		return this.ptpJointType;
	}

	public void setPtpJointType(String ptpJointType) {
		this.ptpJointType = ptpJointType;
	}

	public String getPtpBtbType() {
		return this.ptpBtbType;
	}

	public void setPtpBtbType(String ptpBtbType) {
		this.ptpBtbType = ptpBtbType;
	}

	public String getPtpCfgType() {
		return this.ptpCfgType;
	}

	public void setPtpCfgType(String ptpCfgType) {
		this.ptpCfgType = ptpCfgType;
	}

	public Boolean getPtpOpYield() {
		return this.ptpOpYield;
	}

	public void setPtpOpYield(Boolean ptpOpYield) {
		this.ptpOpYield = ptpOpYield;
	}

	public String getPtpRunSeq1() {
		return this.ptpRunSeq1;
	}

	public void setPtpRunSeq1(String ptpRunSeq1) {
		this.ptpRunSeq1 = ptpRunSeq1;
	}

	public String getPtpRunSeq2() {
		return this.ptpRunSeq2;
	}

	public void setPtpRunSeq2(String ptpRunSeq2) {
		this.ptpRunSeq2 = ptpRunSeq2;
	}

	public String getPtpAtpEnforcement() {
		return this.ptpAtpEnforcement;
	}

	public void setPtpAtpEnforcement(String ptpAtpEnforcement) {
		this.ptpAtpEnforcement = ptpAtpEnforcement;
	}

	public Boolean getPtpAtpFamily() {
		return this.ptpAtpFamily;
	}

	public void setPtpAtpFamily(Boolean ptpAtpFamily) {
		this.ptpAtpFamily = ptpAtpFamily;
	}

	public Double getOidPtpDet() {
		return this.oidPtpDet;
	}

	public void setOidPtpDet(Double oidPtpDet) {
		this.oidPtpDet = oidPtpDet;
	}

}