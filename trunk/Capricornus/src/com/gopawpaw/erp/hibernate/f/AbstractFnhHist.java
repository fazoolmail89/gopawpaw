package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFnhHist entity provides the base persistence definition of the
 * FnhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFnhHist implements java.io.Serializable {

	// Fields

	private FnhHistId id;
	private Boolean fnhAccountEng;
	private String fnhCaDesc;
	private String fnhCaIntType;
	private Integer fnhCaPri;
	private String fnhCaProblem;
	private String fnhCaQue;
	private String fnhCaSeverity;
	private String fnhCaStatus;
	private String fnhCaType;
	private Integer fnhCmtindx;
	private Boolean fnhCombine;
	private Boolean fnhComplete;
	private Date fnhCompDate;
	private Boolean fnhCopyEcoCmt;
	private String fnhDesc;
	private Date fnhEntDate;
	private String fnhEscNbr;
	private String fnhFromEuNbr;
	private String fnhFromPart;
	private String fnhFromSerial;
	private Date fnhFrShipDate;
	private Boolean fnhGenerated;
	private Date fnhModDate;
	private String fnhToEuNbr;
	private String fnhToPart;
	private String fnhToSerial;
	private Date fnhToShipDate;
	private String fnhChr01;
	private String fnhChr02;
	private String fnhChr03;
	private String fnhChr04;
	private Double fnhDec01;
	private Double fnhDec02;
	private Double fnhDec03;
	private Date fnhDte01;
	private Date fnhDte02;
	private Date fnhDte03;
	private Boolean fnhLog01;
	private Boolean fnhLog02;
	private Boolean fnhLog03;
	private String fnhQadc01;
	private String fnhQadc02;
	private String fnhQadc03;
	private String fnhQadc04;
	private Date fnhQadt01;
	private Date fnhQadt02;
	private Date fnhQadt03;
	private Double fnhQade01;
	private Double fnhQade02;
	private Double fnhQade03;
	private Boolean fnhQadl01;
	private Boolean fnhTopLevel;
	private Boolean fnhQadl03;
	private String fnhFromCaNbr;
	private String fnhToCaNbr;
	private String fnhModel;
	private String fnhDocument;
	private String fnhUser1;
	private String fnhUser2;
	private String fnhModUserid;
	private String fnhEntUserid;
	private Date fnhCaOpnDate;
	private Boolean fnhCopyCmmts;
	private Boolean fnhQadl04;
	private Double oidFnhHist;

	// Constructors

	/** default constructor */
	public AbstractFnhHist() {
	}

	/** minimal constructor */
	public AbstractFnhHist(FnhHistId id, Boolean fnhTopLevel, Double oidFnhHist) {
		this.id = id;
		this.fnhTopLevel = fnhTopLevel;
		this.oidFnhHist = oidFnhHist;
	}

	/** full constructor */
	public AbstractFnhHist(FnhHistId id, Boolean fnhAccountEng,
			String fnhCaDesc, String fnhCaIntType, Integer fnhCaPri,
			String fnhCaProblem, String fnhCaQue, String fnhCaSeverity,
			String fnhCaStatus, String fnhCaType, Integer fnhCmtindx,
			Boolean fnhCombine, Boolean fnhComplete, Date fnhCompDate,
			Boolean fnhCopyEcoCmt, String fnhDesc, Date fnhEntDate,
			String fnhEscNbr, String fnhFromEuNbr, String fnhFromPart,
			String fnhFromSerial, Date fnhFrShipDate, Boolean fnhGenerated,
			Date fnhModDate, String fnhToEuNbr, String fnhToPart,
			String fnhToSerial, Date fnhToShipDate, String fnhChr01,
			String fnhChr02, String fnhChr03, String fnhChr04, Double fnhDec01,
			Double fnhDec02, Double fnhDec03, Date fnhDte01, Date fnhDte02,
			Date fnhDte03, Boolean fnhLog01, Boolean fnhLog02,
			Boolean fnhLog03, String fnhQadc01, String fnhQadc02,
			String fnhQadc03, String fnhQadc04, Date fnhQadt01, Date fnhQadt02,
			Date fnhQadt03, Double fnhQade01, Double fnhQade02,
			Double fnhQade03, Boolean fnhQadl01, Boolean fnhTopLevel,
			Boolean fnhQadl03, String fnhFromCaNbr, String fnhToCaNbr,
			String fnhModel, String fnhDocument, String fnhUser1,
			String fnhUser2, String fnhModUserid, String fnhEntUserid,
			Date fnhCaOpnDate, Boolean fnhCopyCmmts, Boolean fnhQadl04,
			Double oidFnhHist) {
		this.id = id;
		this.fnhAccountEng = fnhAccountEng;
		this.fnhCaDesc = fnhCaDesc;
		this.fnhCaIntType = fnhCaIntType;
		this.fnhCaPri = fnhCaPri;
		this.fnhCaProblem = fnhCaProblem;
		this.fnhCaQue = fnhCaQue;
		this.fnhCaSeverity = fnhCaSeverity;
		this.fnhCaStatus = fnhCaStatus;
		this.fnhCaType = fnhCaType;
		this.fnhCmtindx = fnhCmtindx;
		this.fnhCombine = fnhCombine;
		this.fnhComplete = fnhComplete;
		this.fnhCompDate = fnhCompDate;
		this.fnhCopyEcoCmt = fnhCopyEcoCmt;
		this.fnhDesc = fnhDesc;
		this.fnhEntDate = fnhEntDate;
		this.fnhEscNbr = fnhEscNbr;
		this.fnhFromEuNbr = fnhFromEuNbr;
		this.fnhFromPart = fnhFromPart;
		this.fnhFromSerial = fnhFromSerial;
		this.fnhFrShipDate = fnhFrShipDate;
		this.fnhGenerated = fnhGenerated;
		this.fnhModDate = fnhModDate;
		this.fnhToEuNbr = fnhToEuNbr;
		this.fnhToPart = fnhToPart;
		this.fnhToSerial = fnhToSerial;
		this.fnhToShipDate = fnhToShipDate;
		this.fnhChr01 = fnhChr01;
		this.fnhChr02 = fnhChr02;
		this.fnhChr03 = fnhChr03;
		this.fnhChr04 = fnhChr04;
		this.fnhDec01 = fnhDec01;
		this.fnhDec02 = fnhDec02;
		this.fnhDec03 = fnhDec03;
		this.fnhDte01 = fnhDte01;
		this.fnhDte02 = fnhDte02;
		this.fnhDte03 = fnhDte03;
		this.fnhLog01 = fnhLog01;
		this.fnhLog02 = fnhLog02;
		this.fnhLog03 = fnhLog03;
		this.fnhQadc01 = fnhQadc01;
		this.fnhQadc02 = fnhQadc02;
		this.fnhQadc03 = fnhQadc03;
		this.fnhQadc04 = fnhQadc04;
		this.fnhQadt01 = fnhQadt01;
		this.fnhQadt02 = fnhQadt02;
		this.fnhQadt03 = fnhQadt03;
		this.fnhQade01 = fnhQade01;
		this.fnhQade02 = fnhQade02;
		this.fnhQade03 = fnhQade03;
		this.fnhQadl01 = fnhQadl01;
		this.fnhTopLevel = fnhTopLevel;
		this.fnhQadl03 = fnhQadl03;
		this.fnhFromCaNbr = fnhFromCaNbr;
		this.fnhToCaNbr = fnhToCaNbr;
		this.fnhModel = fnhModel;
		this.fnhDocument = fnhDocument;
		this.fnhUser1 = fnhUser1;
		this.fnhUser2 = fnhUser2;
		this.fnhModUserid = fnhModUserid;
		this.fnhEntUserid = fnhEntUserid;
		this.fnhCaOpnDate = fnhCaOpnDate;
		this.fnhCopyCmmts = fnhCopyCmmts;
		this.fnhQadl04 = fnhQadl04;
		this.oidFnhHist = oidFnhHist;
	}

	// Property accessors

	public FnhHistId getId() {
		return this.id;
	}

	public void setId(FnhHistId id) {
		this.id = id;
	}

	public Boolean getFnhAccountEng() {
		return this.fnhAccountEng;
	}

	public void setFnhAccountEng(Boolean fnhAccountEng) {
		this.fnhAccountEng = fnhAccountEng;
	}

	public String getFnhCaDesc() {
		return this.fnhCaDesc;
	}

	public void setFnhCaDesc(String fnhCaDesc) {
		this.fnhCaDesc = fnhCaDesc;
	}

	public String getFnhCaIntType() {
		return this.fnhCaIntType;
	}

	public void setFnhCaIntType(String fnhCaIntType) {
		this.fnhCaIntType = fnhCaIntType;
	}

	public Integer getFnhCaPri() {
		return this.fnhCaPri;
	}

	public void setFnhCaPri(Integer fnhCaPri) {
		this.fnhCaPri = fnhCaPri;
	}

	public String getFnhCaProblem() {
		return this.fnhCaProblem;
	}

	public void setFnhCaProblem(String fnhCaProblem) {
		this.fnhCaProblem = fnhCaProblem;
	}

	public String getFnhCaQue() {
		return this.fnhCaQue;
	}

	public void setFnhCaQue(String fnhCaQue) {
		this.fnhCaQue = fnhCaQue;
	}

	public String getFnhCaSeverity() {
		return this.fnhCaSeverity;
	}

	public void setFnhCaSeverity(String fnhCaSeverity) {
		this.fnhCaSeverity = fnhCaSeverity;
	}

	public String getFnhCaStatus() {
		return this.fnhCaStatus;
	}

	public void setFnhCaStatus(String fnhCaStatus) {
		this.fnhCaStatus = fnhCaStatus;
	}

	public String getFnhCaType() {
		return this.fnhCaType;
	}

	public void setFnhCaType(String fnhCaType) {
		this.fnhCaType = fnhCaType;
	}

	public Integer getFnhCmtindx() {
		return this.fnhCmtindx;
	}

	public void setFnhCmtindx(Integer fnhCmtindx) {
		this.fnhCmtindx = fnhCmtindx;
	}

	public Boolean getFnhCombine() {
		return this.fnhCombine;
	}

	public void setFnhCombine(Boolean fnhCombine) {
		this.fnhCombine = fnhCombine;
	}

	public Boolean getFnhComplete() {
		return this.fnhComplete;
	}

	public void setFnhComplete(Boolean fnhComplete) {
		this.fnhComplete = fnhComplete;
	}

	public Date getFnhCompDate() {
		return this.fnhCompDate;
	}

	public void setFnhCompDate(Date fnhCompDate) {
		this.fnhCompDate = fnhCompDate;
	}

	public Boolean getFnhCopyEcoCmt() {
		return this.fnhCopyEcoCmt;
	}

	public void setFnhCopyEcoCmt(Boolean fnhCopyEcoCmt) {
		this.fnhCopyEcoCmt = fnhCopyEcoCmt;
	}

	public String getFnhDesc() {
		return this.fnhDesc;
	}

	public void setFnhDesc(String fnhDesc) {
		this.fnhDesc = fnhDesc;
	}

	public Date getFnhEntDate() {
		return this.fnhEntDate;
	}

	public void setFnhEntDate(Date fnhEntDate) {
		this.fnhEntDate = fnhEntDate;
	}

	public String getFnhEscNbr() {
		return this.fnhEscNbr;
	}

	public void setFnhEscNbr(String fnhEscNbr) {
		this.fnhEscNbr = fnhEscNbr;
	}

	public String getFnhFromEuNbr() {
		return this.fnhFromEuNbr;
	}

	public void setFnhFromEuNbr(String fnhFromEuNbr) {
		this.fnhFromEuNbr = fnhFromEuNbr;
	}

	public String getFnhFromPart() {
		return this.fnhFromPart;
	}

	public void setFnhFromPart(String fnhFromPart) {
		this.fnhFromPart = fnhFromPart;
	}

	public String getFnhFromSerial() {
		return this.fnhFromSerial;
	}

	public void setFnhFromSerial(String fnhFromSerial) {
		this.fnhFromSerial = fnhFromSerial;
	}

	public Date getFnhFrShipDate() {
		return this.fnhFrShipDate;
	}

	public void setFnhFrShipDate(Date fnhFrShipDate) {
		this.fnhFrShipDate = fnhFrShipDate;
	}

	public Boolean getFnhGenerated() {
		return this.fnhGenerated;
	}

	public void setFnhGenerated(Boolean fnhGenerated) {
		this.fnhGenerated = fnhGenerated;
	}

	public Date getFnhModDate() {
		return this.fnhModDate;
	}

	public void setFnhModDate(Date fnhModDate) {
		this.fnhModDate = fnhModDate;
	}

	public String getFnhToEuNbr() {
		return this.fnhToEuNbr;
	}

	public void setFnhToEuNbr(String fnhToEuNbr) {
		this.fnhToEuNbr = fnhToEuNbr;
	}

	public String getFnhToPart() {
		return this.fnhToPart;
	}

	public void setFnhToPart(String fnhToPart) {
		this.fnhToPart = fnhToPart;
	}

	public String getFnhToSerial() {
		return this.fnhToSerial;
	}

	public void setFnhToSerial(String fnhToSerial) {
		this.fnhToSerial = fnhToSerial;
	}

	public Date getFnhToShipDate() {
		return this.fnhToShipDate;
	}

	public void setFnhToShipDate(Date fnhToShipDate) {
		this.fnhToShipDate = fnhToShipDate;
	}

	public String getFnhChr01() {
		return this.fnhChr01;
	}

	public void setFnhChr01(String fnhChr01) {
		this.fnhChr01 = fnhChr01;
	}

	public String getFnhChr02() {
		return this.fnhChr02;
	}

	public void setFnhChr02(String fnhChr02) {
		this.fnhChr02 = fnhChr02;
	}

	public String getFnhChr03() {
		return this.fnhChr03;
	}

	public void setFnhChr03(String fnhChr03) {
		this.fnhChr03 = fnhChr03;
	}

	public String getFnhChr04() {
		return this.fnhChr04;
	}

	public void setFnhChr04(String fnhChr04) {
		this.fnhChr04 = fnhChr04;
	}

	public Double getFnhDec01() {
		return this.fnhDec01;
	}

	public void setFnhDec01(Double fnhDec01) {
		this.fnhDec01 = fnhDec01;
	}

	public Double getFnhDec02() {
		return this.fnhDec02;
	}

	public void setFnhDec02(Double fnhDec02) {
		this.fnhDec02 = fnhDec02;
	}

	public Double getFnhDec03() {
		return this.fnhDec03;
	}

	public void setFnhDec03(Double fnhDec03) {
		this.fnhDec03 = fnhDec03;
	}

	public Date getFnhDte01() {
		return this.fnhDte01;
	}

	public void setFnhDte01(Date fnhDte01) {
		this.fnhDte01 = fnhDte01;
	}

	public Date getFnhDte02() {
		return this.fnhDte02;
	}

	public void setFnhDte02(Date fnhDte02) {
		this.fnhDte02 = fnhDte02;
	}

	public Date getFnhDte03() {
		return this.fnhDte03;
	}

	public void setFnhDte03(Date fnhDte03) {
		this.fnhDte03 = fnhDte03;
	}

	public Boolean getFnhLog01() {
		return this.fnhLog01;
	}

	public void setFnhLog01(Boolean fnhLog01) {
		this.fnhLog01 = fnhLog01;
	}

	public Boolean getFnhLog02() {
		return this.fnhLog02;
	}

	public void setFnhLog02(Boolean fnhLog02) {
		this.fnhLog02 = fnhLog02;
	}

	public Boolean getFnhLog03() {
		return this.fnhLog03;
	}

	public void setFnhLog03(Boolean fnhLog03) {
		this.fnhLog03 = fnhLog03;
	}

	public String getFnhQadc01() {
		return this.fnhQadc01;
	}

	public void setFnhQadc01(String fnhQadc01) {
		this.fnhQadc01 = fnhQadc01;
	}

	public String getFnhQadc02() {
		return this.fnhQadc02;
	}

	public void setFnhQadc02(String fnhQadc02) {
		this.fnhQadc02 = fnhQadc02;
	}

	public String getFnhQadc03() {
		return this.fnhQadc03;
	}

	public void setFnhQadc03(String fnhQadc03) {
		this.fnhQadc03 = fnhQadc03;
	}

	public String getFnhQadc04() {
		return this.fnhQadc04;
	}

	public void setFnhQadc04(String fnhQadc04) {
		this.fnhQadc04 = fnhQadc04;
	}

	public Date getFnhQadt01() {
		return this.fnhQadt01;
	}

	public void setFnhQadt01(Date fnhQadt01) {
		this.fnhQadt01 = fnhQadt01;
	}

	public Date getFnhQadt02() {
		return this.fnhQadt02;
	}

	public void setFnhQadt02(Date fnhQadt02) {
		this.fnhQadt02 = fnhQadt02;
	}

	public Date getFnhQadt03() {
		return this.fnhQadt03;
	}

	public void setFnhQadt03(Date fnhQadt03) {
		this.fnhQadt03 = fnhQadt03;
	}

	public Double getFnhQade01() {
		return this.fnhQade01;
	}

	public void setFnhQade01(Double fnhQade01) {
		this.fnhQade01 = fnhQade01;
	}

	public Double getFnhQade02() {
		return this.fnhQade02;
	}

	public void setFnhQade02(Double fnhQade02) {
		this.fnhQade02 = fnhQade02;
	}

	public Double getFnhQade03() {
		return this.fnhQade03;
	}

	public void setFnhQade03(Double fnhQade03) {
		this.fnhQade03 = fnhQade03;
	}

	public Boolean getFnhQadl01() {
		return this.fnhQadl01;
	}

	public void setFnhQadl01(Boolean fnhQadl01) {
		this.fnhQadl01 = fnhQadl01;
	}

	public Boolean getFnhTopLevel() {
		return this.fnhTopLevel;
	}

	public void setFnhTopLevel(Boolean fnhTopLevel) {
		this.fnhTopLevel = fnhTopLevel;
	}

	public Boolean getFnhQadl03() {
		return this.fnhQadl03;
	}

	public void setFnhQadl03(Boolean fnhQadl03) {
		this.fnhQadl03 = fnhQadl03;
	}

	public String getFnhFromCaNbr() {
		return this.fnhFromCaNbr;
	}

	public void setFnhFromCaNbr(String fnhFromCaNbr) {
		this.fnhFromCaNbr = fnhFromCaNbr;
	}

	public String getFnhToCaNbr() {
		return this.fnhToCaNbr;
	}

	public void setFnhToCaNbr(String fnhToCaNbr) {
		this.fnhToCaNbr = fnhToCaNbr;
	}

	public String getFnhModel() {
		return this.fnhModel;
	}

	public void setFnhModel(String fnhModel) {
		this.fnhModel = fnhModel;
	}

	public String getFnhDocument() {
		return this.fnhDocument;
	}

	public void setFnhDocument(String fnhDocument) {
		this.fnhDocument = fnhDocument;
	}

	public String getFnhUser1() {
		return this.fnhUser1;
	}

	public void setFnhUser1(String fnhUser1) {
		this.fnhUser1 = fnhUser1;
	}

	public String getFnhUser2() {
		return this.fnhUser2;
	}

	public void setFnhUser2(String fnhUser2) {
		this.fnhUser2 = fnhUser2;
	}

	public String getFnhModUserid() {
		return this.fnhModUserid;
	}

	public void setFnhModUserid(String fnhModUserid) {
		this.fnhModUserid = fnhModUserid;
	}

	public String getFnhEntUserid() {
		return this.fnhEntUserid;
	}

	public void setFnhEntUserid(String fnhEntUserid) {
		this.fnhEntUserid = fnhEntUserid;
	}

	public Date getFnhCaOpnDate() {
		return this.fnhCaOpnDate;
	}

	public void setFnhCaOpnDate(Date fnhCaOpnDate) {
		this.fnhCaOpnDate = fnhCaOpnDate;
	}

	public Boolean getFnhCopyCmmts() {
		return this.fnhCopyCmmts;
	}

	public void setFnhCopyCmmts(Boolean fnhCopyCmmts) {
		this.fnhCopyCmmts = fnhCopyCmmts;
	}

	public Boolean getFnhQadl04() {
		return this.fnhQadl04;
	}

	public void setFnhQadl04(Boolean fnhQadl04) {
		this.fnhQadl04 = fnhQadl04;
	}

	public Double getOidFnhHist() {
		return this.oidFnhHist;
	}

	public void setOidFnhHist(Double oidFnhHist) {
		this.oidFnhHist = oidFnhHist;
	}

}