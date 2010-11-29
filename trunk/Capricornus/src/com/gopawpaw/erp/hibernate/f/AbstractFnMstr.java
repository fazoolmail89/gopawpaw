package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFnMstr entity provides the base persistence definition of the FnMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFnMstr implements java.io.Serializable {

	// Fields

	private FnMstrId id;
	private Boolean fnAccountEng;
	private String fnCaDesc;
	private String fnCaIntType;
	private Integer fnCaPri;
	private String fnCaProblem;
	private String fnCaQue;
	private String fnCaSeverity;
	private String fnCaStatus;
	private String fnCaType;
	private Integer fnCmtindx;
	private Boolean fnCombine;
	private Date fnCombDate;
	private Boolean fnComplete;
	private Date fnCompDate;
	private Boolean fnCopyEcoCmt;
	private String fnDesc;
	private Date fnEffDate;
	private Date fnEntDate;
	private String fnEsNbr;
	private String fnFromEuNbr;
	private String fnFromPart;
	private String fnFromSerial;
	private Date fnFrShipDate;
	private Boolean fnGenerated;
	private Date fnModDate;
	private String fnToEuNbr;
	private String fnToPart;
	private String fnToSerial;
	private Date fnToShipDate;
	private String fnModUserid;
	private String fnEntUserid;
	private String fnDocument;
	private String fnModel;
	private String fnUser1;
	private String fnUser2;
	private String fnChr01;
	private String fnChr02;
	private String fnChr03;
	private String fnChr04;
	private Double fnDec01;
	private Double fnDec02;
	private Double fnDec03;
	private Date fnDte01;
	private Date fnDte02;
	private Date fnDte03;
	private Boolean fnLog01;
	private Boolean fnLog02;
	private Boolean fnLog03;
	private String fnQadc01;
	private String fnQadc02;
	private String fnQadc03;
	private String fnQadc04;
	private Date fnQadt01;
	private Date fnQadt02;
	private Date fnQadt03;
	private Double fnQade01;
	private Double fnQade02;
	private Double fnQade03;
	private Boolean fnQadl01;
	private Boolean fnTopLevel;
	private Boolean fnQadl03;
	private Date fnCaOpnDate;
	private Boolean fnCopyCmmts;
	private Boolean fnQadl04;
	private Double oidFnMstr;

	// Constructors

	/** default constructor */
	public AbstractFnMstr() {
	}

	/** minimal constructor */
	public AbstractFnMstr(FnMstrId id, Boolean fnTopLevel, Double oidFnMstr) {
		this.id = id;
		this.fnTopLevel = fnTopLevel;
		this.oidFnMstr = oidFnMstr;
	}

	/** full constructor */
	public AbstractFnMstr(FnMstrId id, Boolean fnAccountEng, String fnCaDesc,
			String fnCaIntType, Integer fnCaPri, String fnCaProblem,
			String fnCaQue, String fnCaSeverity, String fnCaStatus,
			String fnCaType, Integer fnCmtindx, Boolean fnCombine,
			Date fnCombDate, Boolean fnComplete, Date fnCompDate,
			Boolean fnCopyEcoCmt, String fnDesc, Date fnEffDate,
			Date fnEntDate, String fnEsNbr, String fnFromEuNbr,
			String fnFromPart, String fnFromSerial, Date fnFrShipDate,
			Boolean fnGenerated, Date fnModDate, String fnToEuNbr,
			String fnToPart, String fnToSerial, Date fnToShipDate,
			String fnModUserid, String fnEntUserid, String fnDocument,
			String fnModel, String fnUser1, String fnUser2, String fnChr01,
			String fnChr02, String fnChr03, String fnChr04, Double fnDec01,
			Double fnDec02, Double fnDec03, Date fnDte01, Date fnDte02,
			Date fnDte03, Boolean fnLog01, Boolean fnLog02, Boolean fnLog03,
			String fnQadc01, String fnQadc02, String fnQadc03, String fnQadc04,
			Date fnQadt01, Date fnQadt02, Date fnQadt03, Double fnQade01,
			Double fnQade02, Double fnQade03, Boolean fnQadl01,
			Boolean fnTopLevel, Boolean fnQadl03, Date fnCaOpnDate,
			Boolean fnCopyCmmts, Boolean fnQadl04, Double oidFnMstr) {
		this.id = id;
		this.fnAccountEng = fnAccountEng;
		this.fnCaDesc = fnCaDesc;
		this.fnCaIntType = fnCaIntType;
		this.fnCaPri = fnCaPri;
		this.fnCaProblem = fnCaProblem;
		this.fnCaQue = fnCaQue;
		this.fnCaSeverity = fnCaSeverity;
		this.fnCaStatus = fnCaStatus;
		this.fnCaType = fnCaType;
		this.fnCmtindx = fnCmtindx;
		this.fnCombine = fnCombine;
		this.fnCombDate = fnCombDate;
		this.fnComplete = fnComplete;
		this.fnCompDate = fnCompDate;
		this.fnCopyEcoCmt = fnCopyEcoCmt;
		this.fnDesc = fnDesc;
		this.fnEffDate = fnEffDate;
		this.fnEntDate = fnEntDate;
		this.fnEsNbr = fnEsNbr;
		this.fnFromEuNbr = fnFromEuNbr;
		this.fnFromPart = fnFromPart;
		this.fnFromSerial = fnFromSerial;
		this.fnFrShipDate = fnFrShipDate;
		this.fnGenerated = fnGenerated;
		this.fnModDate = fnModDate;
		this.fnToEuNbr = fnToEuNbr;
		this.fnToPart = fnToPart;
		this.fnToSerial = fnToSerial;
		this.fnToShipDate = fnToShipDate;
		this.fnModUserid = fnModUserid;
		this.fnEntUserid = fnEntUserid;
		this.fnDocument = fnDocument;
		this.fnModel = fnModel;
		this.fnUser1 = fnUser1;
		this.fnUser2 = fnUser2;
		this.fnChr01 = fnChr01;
		this.fnChr02 = fnChr02;
		this.fnChr03 = fnChr03;
		this.fnChr04 = fnChr04;
		this.fnDec01 = fnDec01;
		this.fnDec02 = fnDec02;
		this.fnDec03 = fnDec03;
		this.fnDte01 = fnDte01;
		this.fnDte02 = fnDte02;
		this.fnDte03 = fnDte03;
		this.fnLog01 = fnLog01;
		this.fnLog02 = fnLog02;
		this.fnLog03 = fnLog03;
		this.fnQadc01 = fnQadc01;
		this.fnQadc02 = fnQadc02;
		this.fnQadc03 = fnQadc03;
		this.fnQadc04 = fnQadc04;
		this.fnQadt01 = fnQadt01;
		this.fnQadt02 = fnQadt02;
		this.fnQadt03 = fnQadt03;
		this.fnQade01 = fnQade01;
		this.fnQade02 = fnQade02;
		this.fnQade03 = fnQade03;
		this.fnQadl01 = fnQadl01;
		this.fnTopLevel = fnTopLevel;
		this.fnQadl03 = fnQadl03;
		this.fnCaOpnDate = fnCaOpnDate;
		this.fnCopyCmmts = fnCopyCmmts;
		this.fnQadl04 = fnQadl04;
		this.oidFnMstr = oidFnMstr;
	}

	// Property accessors

	public FnMstrId getId() {
		return this.id;
	}

	public void setId(FnMstrId id) {
		this.id = id;
	}

	public Boolean getFnAccountEng() {
		return this.fnAccountEng;
	}

	public void setFnAccountEng(Boolean fnAccountEng) {
		this.fnAccountEng = fnAccountEng;
	}

	public String getFnCaDesc() {
		return this.fnCaDesc;
	}

	public void setFnCaDesc(String fnCaDesc) {
		this.fnCaDesc = fnCaDesc;
	}

	public String getFnCaIntType() {
		return this.fnCaIntType;
	}

	public void setFnCaIntType(String fnCaIntType) {
		this.fnCaIntType = fnCaIntType;
	}

	public Integer getFnCaPri() {
		return this.fnCaPri;
	}

	public void setFnCaPri(Integer fnCaPri) {
		this.fnCaPri = fnCaPri;
	}

	public String getFnCaProblem() {
		return this.fnCaProblem;
	}

	public void setFnCaProblem(String fnCaProblem) {
		this.fnCaProblem = fnCaProblem;
	}

	public String getFnCaQue() {
		return this.fnCaQue;
	}

	public void setFnCaQue(String fnCaQue) {
		this.fnCaQue = fnCaQue;
	}

	public String getFnCaSeverity() {
		return this.fnCaSeverity;
	}

	public void setFnCaSeverity(String fnCaSeverity) {
		this.fnCaSeverity = fnCaSeverity;
	}

	public String getFnCaStatus() {
		return this.fnCaStatus;
	}

	public void setFnCaStatus(String fnCaStatus) {
		this.fnCaStatus = fnCaStatus;
	}

	public String getFnCaType() {
		return this.fnCaType;
	}

	public void setFnCaType(String fnCaType) {
		this.fnCaType = fnCaType;
	}

	public Integer getFnCmtindx() {
		return this.fnCmtindx;
	}

	public void setFnCmtindx(Integer fnCmtindx) {
		this.fnCmtindx = fnCmtindx;
	}

	public Boolean getFnCombine() {
		return this.fnCombine;
	}

	public void setFnCombine(Boolean fnCombine) {
		this.fnCombine = fnCombine;
	}

	public Date getFnCombDate() {
		return this.fnCombDate;
	}

	public void setFnCombDate(Date fnCombDate) {
		this.fnCombDate = fnCombDate;
	}

	public Boolean getFnComplete() {
		return this.fnComplete;
	}

	public void setFnComplete(Boolean fnComplete) {
		this.fnComplete = fnComplete;
	}

	public Date getFnCompDate() {
		return this.fnCompDate;
	}

	public void setFnCompDate(Date fnCompDate) {
		this.fnCompDate = fnCompDate;
	}

	public Boolean getFnCopyEcoCmt() {
		return this.fnCopyEcoCmt;
	}

	public void setFnCopyEcoCmt(Boolean fnCopyEcoCmt) {
		this.fnCopyEcoCmt = fnCopyEcoCmt;
	}

	public String getFnDesc() {
		return this.fnDesc;
	}

	public void setFnDesc(String fnDesc) {
		this.fnDesc = fnDesc;
	}

	public Date getFnEffDate() {
		return this.fnEffDate;
	}

	public void setFnEffDate(Date fnEffDate) {
		this.fnEffDate = fnEffDate;
	}

	public Date getFnEntDate() {
		return this.fnEntDate;
	}

	public void setFnEntDate(Date fnEntDate) {
		this.fnEntDate = fnEntDate;
	}

	public String getFnEsNbr() {
		return this.fnEsNbr;
	}

	public void setFnEsNbr(String fnEsNbr) {
		this.fnEsNbr = fnEsNbr;
	}

	public String getFnFromEuNbr() {
		return this.fnFromEuNbr;
	}

	public void setFnFromEuNbr(String fnFromEuNbr) {
		this.fnFromEuNbr = fnFromEuNbr;
	}

	public String getFnFromPart() {
		return this.fnFromPart;
	}

	public void setFnFromPart(String fnFromPart) {
		this.fnFromPart = fnFromPart;
	}

	public String getFnFromSerial() {
		return this.fnFromSerial;
	}

	public void setFnFromSerial(String fnFromSerial) {
		this.fnFromSerial = fnFromSerial;
	}

	public Date getFnFrShipDate() {
		return this.fnFrShipDate;
	}

	public void setFnFrShipDate(Date fnFrShipDate) {
		this.fnFrShipDate = fnFrShipDate;
	}

	public Boolean getFnGenerated() {
		return this.fnGenerated;
	}

	public void setFnGenerated(Boolean fnGenerated) {
		this.fnGenerated = fnGenerated;
	}

	public Date getFnModDate() {
		return this.fnModDate;
	}

	public void setFnModDate(Date fnModDate) {
		this.fnModDate = fnModDate;
	}

	public String getFnToEuNbr() {
		return this.fnToEuNbr;
	}

	public void setFnToEuNbr(String fnToEuNbr) {
		this.fnToEuNbr = fnToEuNbr;
	}

	public String getFnToPart() {
		return this.fnToPart;
	}

	public void setFnToPart(String fnToPart) {
		this.fnToPart = fnToPart;
	}

	public String getFnToSerial() {
		return this.fnToSerial;
	}

	public void setFnToSerial(String fnToSerial) {
		this.fnToSerial = fnToSerial;
	}

	public Date getFnToShipDate() {
		return this.fnToShipDate;
	}

	public void setFnToShipDate(Date fnToShipDate) {
		this.fnToShipDate = fnToShipDate;
	}

	public String getFnModUserid() {
		return this.fnModUserid;
	}

	public void setFnModUserid(String fnModUserid) {
		this.fnModUserid = fnModUserid;
	}

	public String getFnEntUserid() {
		return this.fnEntUserid;
	}

	public void setFnEntUserid(String fnEntUserid) {
		this.fnEntUserid = fnEntUserid;
	}

	public String getFnDocument() {
		return this.fnDocument;
	}

	public void setFnDocument(String fnDocument) {
		this.fnDocument = fnDocument;
	}

	public String getFnModel() {
		return this.fnModel;
	}

	public void setFnModel(String fnModel) {
		this.fnModel = fnModel;
	}

	public String getFnUser1() {
		return this.fnUser1;
	}

	public void setFnUser1(String fnUser1) {
		this.fnUser1 = fnUser1;
	}

	public String getFnUser2() {
		return this.fnUser2;
	}

	public void setFnUser2(String fnUser2) {
		this.fnUser2 = fnUser2;
	}

	public String getFnChr01() {
		return this.fnChr01;
	}

	public void setFnChr01(String fnChr01) {
		this.fnChr01 = fnChr01;
	}

	public String getFnChr02() {
		return this.fnChr02;
	}

	public void setFnChr02(String fnChr02) {
		this.fnChr02 = fnChr02;
	}

	public String getFnChr03() {
		return this.fnChr03;
	}

	public void setFnChr03(String fnChr03) {
		this.fnChr03 = fnChr03;
	}

	public String getFnChr04() {
		return this.fnChr04;
	}

	public void setFnChr04(String fnChr04) {
		this.fnChr04 = fnChr04;
	}

	public Double getFnDec01() {
		return this.fnDec01;
	}

	public void setFnDec01(Double fnDec01) {
		this.fnDec01 = fnDec01;
	}

	public Double getFnDec02() {
		return this.fnDec02;
	}

	public void setFnDec02(Double fnDec02) {
		this.fnDec02 = fnDec02;
	}

	public Double getFnDec03() {
		return this.fnDec03;
	}

	public void setFnDec03(Double fnDec03) {
		this.fnDec03 = fnDec03;
	}

	public Date getFnDte01() {
		return this.fnDte01;
	}

	public void setFnDte01(Date fnDte01) {
		this.fnDte01 = fnDte01;
	}

	public Date getFnDte02() {
		return this.fnDte02;
	}

	public void setFnDte02(Date fnDte02) {
		this.fnDte02 = fnDte02;
	}

	public Date getFnDte03() {
		return this.fnDte03;
	}

	public void setFnDte03(Date fnDte03) {
		this.fnDte03 = fnDte03;
	}

	public Boolean getFnLog01() {
		return this.fnLog01;
	}

	public void setFnLog01(Boolean fnLog01) {
		this.fnLog01 = fnLog01;
	}

	public Boolean getFnLog02() {
		return this.fnLog02;
	}

	public void setFnLog02(Boolean fnLog02) {
		this.fnLog02 = fnLog02;
	}

	public Boolean getFnLog03() {
		return this.fnLog03;
	}

	public void setFnLog03(Boolean fnLog03) {
		this.fnLog03 = fnLog03;
	}

	public String getFnQadc01() {
		return this.fnQadc01;
	}

	public void setFnQadc01(String fnQadc01) {
		this.fnQadc01 = fnQadc01;
	}

	public String getFnQadc02() {
		return this.fnQadc02;
	}

	public void setFnQadc02(String fnQadc02) {
		this.fnQadc02 = fnQadc02;
	}

	public String getFnQadc03() {
		return this.fnQadc03;
	}

	public void setFnQadc03(String fnQadc03) {
		this.fnQadc03 = fnQadc03;
	}

	public String getFnQadc04() {
		return this.fnQadc04;
	}

	public void setFnQadc04(String fnQadc04) {
		this.fnQadc04 = fnQadc04;
	}

	public Date getFnQadt01() {
		return this.fnQadt01;
	}

	public void setFnQadt01(Date fnQadt01) {
		this.fnQadt01 = fnQadt01;
	}

	public Date getFnQadt02() {
		return this.fnQadt02;
	}

	public void setFnQadt02(Date fnQadt02) {
		this.fnQadt02 = fnQadt02;
	}

	public Date getFnQadt03() {
		return this.fnQadt03;
	}

	public void setFnQadt03(Date fnQadt03) {
		this.fnQadt03 = fnQadt03;
	}

	public Double getFnQade01() {
		return this.fnQade01;
	}

	public void setFnQade01(Double fnQade01) {
		this.fnQade01 = fnQade01;
	}

	public Double getFnQade02() {
		return this.fnQade02;
	}

	public void setFnQade02(Double fnQade02) {
		this.fnQade02 = fnQade02;
	}

	public Double getFnQade03() {
		return this.fnQade03;
	}

	public void setFnQade03(Double fnQade03) {
		this.fnQade03 = fnQade03;
	}

	public Boolean getFnQadl01() {
		return this.fnQadl01;
	}

	public void setFnQadl01(Boolean fnQadl01) {
		this.fnQadl01 = fnQadl01;
	}

	public Boolean getFnTopLevel() {
		return this.fnTopLevel;
	}

	public void setFnTopLevel(Boolean fnTopLevel) {
		this.fnTopLevel = fnTopLevel;
	}

	public Boolean getFnQadl03() {
		return this.fnQadl03;
	}

	public void setFnQadl03(Boolean fnQadl03) {
		this.fnQadl03 = fnQadl03;
	}

	public Date getFnCaOpnDate() {
		return this.fnCaOpnDate;
	}

	public void setFnCaOpnDate(Date fnCaOpnDate) {
		this.fnCaOpnDate = fnCaOpnDate;
	}

	public Boolean getFnCopyCmmts() {
		return this.fnCopyCmmts;
	}

	public void setFnCopyCmmts(Boolean fnCopyCmmts) {
		this.fnCopyCmmts = fnCopyCmmts;
	}

	public Boolean getFnQadl04() {
		return this.fnQadl04;
	}

	public void setFnQadl04(Boolean fnQadl04) {
		this.fnQadl04 = fnQadl04;
	}

	public Double getOidFnMstr() {
		return this.oidFnMstr;
	}

	public void setOidFnMstr(Double oidFnMstr) {
		this.oidFnMstr = oidFnMstr;
	}

}