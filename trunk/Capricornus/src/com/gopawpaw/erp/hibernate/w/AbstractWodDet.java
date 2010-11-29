package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * AbstractWodDet entity provides the base persistence definition of the WodDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWodDet implements java.io.Serializable {

	// Fields

	private WodDetId id;
	private String wodNbr;
	private Date wodIssDate;
	private Double wodQtyReq;
	private Double wodQtyAll;
	private Double wodQtyPick;
	private Double wodQtyIss;
	private Double wodTotStd;
	private String wodDeliver;
	private Double wodQtyChg;
	private Double wodBoChg;
	private String wodLoc;
	private String wodSerial;
	private Integer wodCmtindx;
	private String wodUser1;
	private String wodUser2;
	private Boolean wodCritical;
	private String wodSite;
	private String wodChr01;
	private String wodChr02;
	private String wodChr03;
	private String wodChr04;
	private String wodChr05;
	private Date wodDte01;
	private Date wodDte02;
	private Double wodDec01;
	private Double wodDec02;
	private Boolean wodLog01;
	private Double wodBomQty;
	private Double wodMtlTotx;
	private Double wodMvusePost;
	private Double wodBomAmt;
	private Double wodMvrtePost;
	private Double wodMvrteRval;
	private Double wodMvuseRval;
	private Double wodMvrteAccr;
	private Double wodMvuseAccr;
	private String wodCaIntType;
	private Double wodCoveredAmt;
	private String wodEngCode;
	private String wodFcgCode;
	private Integer wodFcgIndex;
	private Integer wodFisColumn;
	private String wodFisSort;
	private String wodFscCode;
	private String wodFsmType;
	private Double wodListPr;
	private Double wodPrice;
	private String wodProdLine;
	private Double wodQtyPosted;
	private Double wodQtyRet;
	private String wodStatus;
	private Double wodLinePrice;
	private Double wodCoveredPost;
	private String wodProject;
	private Double wodRetIss;
	private Double wodExgPrice;
	private String wodSvCode;
	private String wodRetSite;
	private String wodRetLoc;
	private Double wodStdCost;
	private Integer wodItmLine;
	private Integer wodSodLine;
	private String wodSodNbr;
	private Boolean wodSeoLoad;
	private String wodFromLoc;
	private String wodFromSite;
	private String wodRef;
	private String wodRetSerial;
	private String wodQadc01;
	private String wodQadc02;
	private String wodQadc03;
	private Date wodQadt01;
	private Date wodQadt02;
	private Double wodQade01;
	private Double wodQade02;
	private Boolean wodQadl01;
	private Boolean wodQadl02;
	private Integer wodIsbRef;
	private String wodRetRef;
	private Double wodYieldPct;
	private Double oidWodDet;

	// Constructors

	/** default constructor */
	public AbstractWodDet() {
	}

	/** minimal constructor */
	public AbstractWodDet(WodDetId id, String wodSodNbr, Double oidWodDet) {
		this.id = id;
		this.wodSodNbr = wodSodNbr;
		this.oidWodDet = oidWodDet;
	}

	/** full constructor */
	public AbstractWodDet(WodDetId id, String wodNbr, Date wodIssDate,
			Double wodQtyReq, Double wodQtyAll, Double wodQtyPick,
			Double wodQtyIss, Double wodTotStd, String wodDeliver,
			Double wodQtyChg, Double wodBoChg, String wodLoc, String wodSerial,
			Integer wodCmtindx, String wodUser1, String wodUser2,
			Boolean wodCritical, String wodSite, String wodChr01,
			String wodChr02, String wodChr03, String wodChr04, String wodChr05,
			Date wodDte01, Date wodDte02, Double wodDec01, Double wodDec02,
			Boolean wodLog01, Double wodBomQty, Double wodMtlTotx,
			Double wodMvusePost, Double wodBomAmt, Double wodMvrtePost,
			Double wodMvrteRval, Double wodMvuseRval, Double wodMvrteAccr,
			Double wodMvuseAccr, String wodCaIntType, Double wodCoveredAmt,
			String wodEngCode, String wodFcgCode, Integer wodFcgIndex,
			Integer wodFisColumn, String wodFisSort, String wodFscCode,
			String wodFsmType, Double wodListPr, Double wodPrice,
			String wodProdLine, Double wodQtyPosted, Double wodQtyRet,
			String wodStatus, Double wodLinePrice, Double wodCoveredPost,
			String wodProject, Double wodRetIss, Double wodExgPrice,
			String wodSvCode, String wodRetSite, String wodRetLoc,
			Double wodStdCost, Integer wodItmLine, Integer wodSodLine,
			String wodSodNbr, Boolean wodSeoLoad, String wodFromLoc,
			String wodFromSite, String wodRef, String wodRetSerial,
			String wodQadc01, String wodQadc02, String wodQadc03,
			Date wodQadt01, Date wodQadt02, Double wodQade01, Double wodQade02,
			Boolean wodQadl01, Boolean wodQadl02, Integer wodIsbRef,
			String wodRetRef, Double wodYieldPct, Double oidWodDet) {
		this.id = id;
		this.wodNbr = wodNbr;
		this.wodIssDate = wodIssDate;
		this.wodQtyReq = wodQtyReq;
		this.wodQtyAll = wodQtyAll;
		this.wodQtyPick = wodQtyPick;
		this.wodQtyIss = wodQtyIss;
		this.wodTotStd = wodTotStd;
		this.wodDeliver = wodDeliver;
		this.wodQtyChg = wodQtyChg;
		this.wodBoChg = wodBoChg;
		this.wodLoc = wodLoc;
		this.wodSerial = wodSerial;
		this.wodCmtindx = wodCmtindx;
		this.wodUser1 = wodUser1;
		this.wodUser2 = wodUser2;
		this.wodCritical = wodCritical;
		this.wodSite = wodSite;
		this.wodChr01 = wodChr01;
		this.wodChr02 = wodChr02;
		this.wodChr03 = wodChr03;
		this.wodChr04 = wodChr04;
		this.wodChr05 = wodChr05;
		this.wodDte01 = wodDte01;
		this.wodDte02 = wodDte02;
		this.wodDec01 = wodDec01;
		this.wodDec02 = wodDec02;
		this.wodLog01 = wodLog01;
		this.wodBomQty = wodBomQty;
		this.wodMtlTotx = wodMtlTotx;
		this.wodMvusePost = wodMvusePost;
		this.wodBomAmt = wodBomAmt;
		this.wodMvrtePost = wodMvrtePost;
		this.wodMvrteRval = wodMvrteRval;
		this.wodMvuseRval = wodMvuseRval;
		this.wodMvrteAccr = wodMvrteAccr;
		this.wodMvuseAccr = wodMvuseAccr;
		this.wodCaIntType = wodCaIntType;
		this.wodCoveredAmt = wodCoveredAmt;
		this.wodEngCode = wodEngCode;
		this.wodFcgCode = wodFcgCode;
		this.wodFcgIndex = wodFcgIndex;
		this.wodFisColumn = wodFisColumn;
		this.wodFisSort = wodFisSort;
		this.wodFscCode = wodFscCode;
		this.wodFsmType = wodFsmType;
		this.wodListPr = wodListPr;
		this.wodPrice = wodPrice;
		this.wodProdLine = wodProdLine;
		this.wodQtyPosted = wodQtyPosted;
		this.wodQtyRet = wodQtyRet;
		this.wodStatus = wodStatus;
		this.wodLinePrice = wodLinePrice;
		this.wodCoveredPost = wodCoveredPost;
		this.wodProject = wodProject;
		this.wodRetIss = wodRetIss;
		this.wodExgPrice = wodExgPrice;
		this.wodSvCode = wodSvCode;
		this.wodRetSite = wodRetSite;
		this.wodRetLoc = wodRetLoc;
		this.wodStdCost = wodStdCost;
		this.wodItmLine = wodItmLine;
		this.wodSodLine = wodSodLine;
		this.wodSodNbr = wodSodNbr;
		this.wodSeoLoad = wodSeoLoad;
		this.wodFromLoc = wodFromLoc;
		this.wodFromSite = wodFromSite;
		this.wodRef = wodRef;
		this.wodRetSerial = wodRetSerial;
		this.wodQadc01 = wodQadc01;
		this.wodQadc02 = wodQadc02;
		this.wodQadc03 = wodQadc03;
		this.wodQadt01 = wodQadt01;
		this.wodQadt02 = wodQadt02;
		this.wodQade01 = wodQade01;
		this.wodQade02 = wodQade02;
		this.wodQadl01 = wodQadl01;
		this.wodQadl02 = wodQadl02;
		this.wodIsbRef = wodIsbRef;
		this.wodRetRef = wodRetRef;
		this.wodYieldPct = wodYieldPct;
		this.oidWodDet = oidWodDet;
	}

	// Property accessors

	public WodDetId getId() {
		return this.id;
	}

	public void setId(WodDetId id) {
		this.id = id;
	}

	public String getWodNbr() {
		return this.wodNbr;
	}

	public void setWodNbr(String wodNbr) {
		this.wodNbr = wodNbr;
	}

	public Date getWodIssDate() {
		return this.wodIssDate;
	}

	public void setWodIssDate(Date wodIssDate) {
		this.wodIssDate = wodIssDate;
	}

	public Double getWodQtyReq() {
		return this.wodQtyReq;
	}

	public void setWodQtyReq(Double wodQtyReq) {
		this.wodQtyReq = wodQtyReq;
	}

	public Double getWodQtyAll() {
		return this.wodQtyAll;
	}

	public void setWodQtyAll(Double wodQtyAll) {
		this.wodQtyAll = wodQtyAll;
	}

	public Double getWodQtyPick() {
		return this.wodQtyPick;
	}

	public void setWodQtyPick(Double wodQtyPick) {
		this.wodQtyPick = wodQtyPick;
	}

	public Double getWodQtyIss() {
		return this.wodQtyIss;
	}

	public void setWodQtyIss(Double wodQtyIss) {
		this.wodQtyIss = wodQtyIss;
	}

	public Double getWodTotStd() {
		return this.wodTotStd;
	}

	public void setWodTotStd(Double wodTotStd) {
		this.wodTotStd = wodTotStd;
	}

	public String getWodDeliver() {
		return this.wodDeliver;
	}

	public void setWodDeliver(String wodDeliver) {
		this.wodDeliver = wodDeliver;
	}

	public Double getWodQtyChg() {
		return this.wodQtyChg;
	}

	public void setWodQtyChg(Double wodQtyChg) {
		this.wodQtyChg = wodQtyChg;
	}

	public Double getWodBoChg() {
		return this.wodBoChg;
	}

	public void setWodBoChg(Double wodBoChg) {
		this.wodBoChg = wodBoChg;
	}

	public String getWodLoc() {
		return this.wodLoc;
	}

	public void setWodLoc(String wodLoc) {
		this.wodLoc = wodLoc;
	}

	public String getWodSerial() {
		return this.wodSerial;
	}

	public void setWodSerial(String wodSerial) {
		this.wodSerial = wodSerial;
	}

	public Integer getWodCmtindx() {
		return this.wodCmtindx;
	}

	public void setWodCmtindx(Integer wodCmtindx) {
		this.wodCmtindx = wodCmtindx;
	}

	public String getWodUser1() {
		return this.wodUser1;
	}

	public void setWodUser1(String wodUser1) {
		this.wodUser1 = wodUser1;
	}

	public String getWodUser2() {
		return this.wodUser2;
	}

	public void setWodUser2(String wodUser2) {
		this.wodUser2 = wodUser2;
	}

	public Boolean getWodCritical() {
		return this.wodCritical;
	}

	public void setWodCritical(Boolean wodCritical) {
		this.wodCritical = wodCritical;
	}

	public String getWodSite() {
		return this.wodSite;
	}

	public void setWodSite(String wodSite) {
		this.wodSite = wodSite;
	}

	public String getWodChr01() {
		return this.wodChr01;
	}

	public void setWodChr01(String wodChr01) {
		this.wodChr01 = wodChr01;
	}

	public String getWodChr02() {
		return this.wodChr02;
	}

	public void setWodChr02(String wodChr02) {
		this.wodChr02 = wodChr02;
	}

	public String getWodChr03() {
		return this.wodChr03;
	}

	public void setWodChr03(String wodChr03) {
		this.wodChr03 = wodChr03;
	}

	public String getWodChr04() {
		return this.wodChr04;
	}

	public void setWodChr04(String wodChr04) {
		this.wodChr04 = wodChr04;
	}

	public String getWodChr05() {
		return this.wodChr05;
	}

	public void setWodChr05(String wodChr05) {
		this.wodChr05 = wodChr05;
	}

	public Date getWodDte01() {
		return this.wodDte01;
	}

	public void setWodDte01(Date wodDte01) {
		this.wodDte01 = wodDte01;
	}

	public Date getWodDte02() {
		return this.wodDte02;
	}

	public void setWodDte02(Date wodDte02) {
		this.wodDte02 = wodDte02;
	}

	public Double getWodDec01() {
		return this.wodDec01;
	}

	public void setWodDec01(Double wodDec01) {
		this.wodDec01 = wodDec01;
	}

	public Double getWodDec02() {
		return this.wodDec02;
	}

	public void setWodDec02(Double wodDec02) {
		this.wodDec02 = wodDec02;
	}

	public Boolean getWodLog01() {
		return this.wodLog01;
	}

	public void setWodLog01(Boolean wodLog01) {
		this.wodLog01 = wodLog01;
	}

	public Double getWodBomQty() {
		return this.wodBomQty;
	}

	public void setWodBomQty(Double wodBomQty) {
		this.wodBomQty = wodBomQty;
	}

	public Double getWodMtlTotx() {
		return this.wodMtlTotx;
	}

	public void setWodMtlTotx(Double wodMtlTotx) {
		this.wodMtlTotx = wodMtlTotx;
	}

	public Double getWodMvusePost() {
		return this.wodMvusePost;
	}

	public void setWodMvusePost(Double wodMvusePost) {
		this.wodMvusePost = wodMvusePost;
	}

	public Double getWodBomAmt() {
		return this.wodBomAmt;
	}

	public void setWodBomAmt(Double wodBomAmt) {
		this.wodBomAmt = wodBomAmt;
	}

	public Double getWodMvrtePost() {
		return this.wodMvrtePost;
	}

	public void setWodMvrtePost(Double wodMvrtePost) {
		this.wodMvrtePost = wodMvrtePost;
	}

	public Double getWodMvrteRval() {
		return this.wodMvrteRval;
	}

	public void setWodMvrteRval(Double wodMvrteRval) {
		this.wodMvrteRval = wodMvrteRval;
	}

	public Double getWodMvuseRval() {
		return this.wodMvuseRval;
	}

	public void setWodMvuseRval(Double wodMvuseRval) {
		this.wodMvuseRval = wodMvuseRval;
	}

	public Double getWodMvrteAccr() {
		return this.wodMvrteAccr;
	}

	public void setWodMvrteAccr(Double wodMvrteAccr) {
		this.wodMvrteAccr = wodMvrteAccr;
	}

	public Double getWodMvuseAccr() {
		return this.wodMvuseAccr;
	}

	public void setWodMvuseAccr(Double wodMvuseAccr) {
		this.wodMvuseAccr = wodMvuseAccr;
	}

	public String getWodCaIntType() {
		return this.wodCaIntType;
	}

	public void setWodCaIntType(String wodCaIntType) {
		this.wodCaIntType = wodCaIntType;
	}

	public Double getWodCoveredAmt() {
		return this.wodCoveredAmt;
	}

	public void setWodCoveredAmt(Double wodCoveredAmt) {
		this.wodCoveredAmt = wodCoveredAmt;
	}

	public String getWodEngCode() {
		return this.wodEngCode;
	}

	public void setWodEngCode(String wodEngCode) {
		this.wodEngCode = wodEngCode;
	}

	public String getWodFcgCode() {
		return this.wodFcgCode;
	}

	public void setWodFcgCode(String wodFcgCode) {
		this.wodFcgCode = wodFcgCode;
	}

	public Integer getWodFcgIndex() {
		return this.wodFcgIndex;
	}

	public void setWodFcgIndex(Integer wodFcgIndex) {
		this.wodFcgIndex = wodFcgIndex;
	}

	public Integer getWodFisColumn() {
		return this.wodFisColumn;
	}

	public void setWodFisColumn(Integer wodFisColumn) {
		this.wodFisColumn = wodFisColumn;
	}

	public String getWodFisSort() {
		return this.wodFisSort;
	}

	public void setWodFisSort(String wodFisSort) {
		this.wodFisSort = wodFisSort;
	}

	public String getWodFscCode() {
		return this.wodFscCode;
	}

	public void setWodFscCode(String wodFscCode) {
		this.wodFscCode = wodFscCode;
	}

	public String getWodFsmType() {
		return this.wodFsmType;
	}

	public void setWodFsmType(String wodFsmType) {
		this.wodFsmType = wodFsmType;
	}

	public Double getWodListPr() {
		return this.wodListPr;
	}

	public void setWodListPr(Double wodListPr) {
		this.wodListPr = wodListPr;
	}

	public Double getWodPrice() {
		return this.wodPrice;
	}

	public void setWodPrice(Double wodPrice) {
		this.wodPrice = wodPrice;
	}

	public String getWodProdLine() {
		return this.wodProdLine;
	}

	public void setWodProdLine(String wodProdLine) {
		this.wodProdLine = wodProdLine;
	}

	public Double getWodQtyPosted() {
		return this.wodQtyPosted;
	}

	public void setWodQtyPosted(Double wodQtyPosted) {
		this.wodQtyPosted = wodQtyPosted;
	}

	public Double getWodQtyRet() {
		return this.wodQtyRet;
	}

	public void setWodQtyRet(Double wodQtyRet) {
		this.wodQtyRet = wodQtyRet;
	}

	public String getWodStatus() {
		return this.wodStatus;
	}

	public void setWodStatus(String wodStatus) {
		this.wodStatus = wodStatus;
	}

	public Double getWodLinePrice() {
		return this.wodLinePrice;
	}

	public void setWodLinePrice(Double wodLinePrice) {
		this.wodLinePrice = wodLinePrice;
	}

	public Double getWodCoveredPost() {
		return this.wodCoveredPost;
	}

	public void setWodCoveredPost(Double wodCoveredPost) {
		this.wodCoveredPost = wodCoveredPost;
	}

	public String getWodProject() {
		return this.wodProject;
	}

	public void setWodProject(String wodProject) {
		this.wodProject = wodProject;
	}

	public Double getWodRetIss() {
		return this.wodRetIss;
	}

	public void setWodRetIss(Double wodRetIss) {
		this.wodRetIss = wodRetIss;
	}

	public Double getWodExgPrice() {
		return this.wodExgPrice;
	}

	public void setWodExgPrice(Double wodExgPrice) {
		this.wodExgPrice = wodExgPrice;
	}

	public String getWodSvCode() {
		return this.wodSvCode;
	}

	public void setWodSvCode(String wodSvCode) {
		this.wodSvCode = wodSvCode;
	}

	public String getWodRetSite() {
		return this.wodRetSite;
	}

	public void setWodRetSite(String wodRetSite) {
		this.wodRetSite = wodRetSite;
	}

	public String getWodRetLoc() {
		return this.wodRetLoc;
	}

	public void setWodRetLoc(String wodRetLoc) {
		this.wodRetLoc = wodRetLoc;
	}

	public Double getWodStdCost() {
		return this.wodStdCost;
	}

	public void setWodStdCost(Double wodStdCost) {
		this.wodStdCost = wodStdCost;
	}

	public Integer getWodItmLine() {
		return this.wodItmLine;
	}

	public void setWodItmLine(Integer wodItmLine) {
		this.wodItmLine = wodItmLine;
	}

	public Integer getWodSodLine() {
		return this.wodSodLine;
	}

	public void setWodSodLine(Integer wodSodLine) {
		this.wodSodLine = wodSodLine;
	}

	public String getWodSodNbr() {
		return this.wodSodNbr;
	}

	public void setWodSodNbr(String wodSodNbr) {
		this.wodSodNbr = wodSodNbr;
	}

	public Boolean getWodSeoLoad() {
		return this.wodSeoLoad;
	}

	public void setWodSeoLoad(Boolean wodSeoLoad) {
		this.wodSeoLoad = wodSeoLoad;
	}

	public String getWodFromLoc() {
		return this.wodFromLoc;
	}

	public void setWodFromLoc(String wodFromLoc) {
		this.wodFromLoc = wodFromLoc;
	}

	public String getWodFromSite() {
		return this.wodFromSite;
	}

	public void setWodFromSite(String wodFromSite) {
		this.wodFromSite = wodFromSite;
	}

	public String getWodRef() {
		return this.wodRef;
	}

	public void setWodRef(String wodRef) {
		this.wodRef = wodRef;
	}

	public String getWodRetSerial() {
		return this.wodRetSerial;
	}

	public void setWodRetSerial(String wodRetSerial) {
		this.wodRetSerial = wodRetSerial;
	}

	public String getWodQadc01() {
		return this.wodQadc01;
	}

	public void setWodQadc01(String wodQadc01) {
		this.wodQadc01 = wodQadc01;
	}

	public String getWodQadc02() {
		return this.wodQadc02;
	}

	public void setWodQadc02(String wodQadc02) {
		this.wodQadc02 = wodQadc02;
	}

	public String getWodQadc03() {
		return this.wodQadc03;
	}

	public void setWodQadc03(String wodQadc03) {
		this.wodQadc03 = wodQadc03;
	}

	public Date getWodQadt01() {
		return this.wodQadt01;
	}

	public void setWodQadt01(Date wodQadt01) {
		this.wodQadt01 = wodQadt01;
	}

	public Date getWodQadt02() {
		return this.wodQadt02;
	}

	public void setWodQadt02(Date wodQadt02) {
		this.wodQadt02 = wodQadt02;
	}

	public Double getWodQade01() {
		return this.wodQade01;
	}

	public void setWodQade01(Double wodQade01) {
		this.wodQade01 = wodQade01;
	}

	public Double getWodQade02() {
		return this.wodQade02;
	}

	public void setWodQade02(Double wodQade02) {
		this.wodQade02 = wodQade02;
	}

	public Boolean getWodQadl01() {
		return this.wodQadl01;
	}

	public void setWodQadl01(Boolean wodQadl01) {
		this.wodQadl01 = wodQadl01;
	}

	public Boolean getWodQadl02() {
		return this.wodQadl02;
	}

	public void setWodQadl02(Boolean wodQadl02) {
		this.wodQadl02 = wodQadl02;
	}

	public Integer getWodIsbRef() {
		return this.wodIsbRef;
	}

	public void setWodIsbRef(Integer wodIsbRef) {
		this.wodIsbRef = wodIsbRef;
	}

	public String getWodRetRef() {
		return this.wodRetRef;
	}

	public void setWodRetRef(String wodRetRef) {
		this.wodRetRef = wodRetRef;
	}

	public Double getWodYieldPct() {
		return this.wodYieldPct;
	}

	public void setWodYieldPct(Double wodYieldPct) {
		this.wodYieldPct = wodYieldPct;
	}

	public Double getOidWodDet() {
		return this.oidWodDet;
	}

	public void setOidWodDet(Double oidWodDet) {
		this.oidWodDet = oidWodDet;
	}

}