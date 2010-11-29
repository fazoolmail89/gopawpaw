package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCahHist entity provides the base persistence definition of the
 * CahHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCahHist implements java.io.Serializable {

	// Fields

	private CahHistId id;
	private Date cahNxtDate;
	private String cahQue;
	private String cahAssign;
	private String cahEnterBy;
	private String cahStatus;
	private String cahType;
	private String cahPart;
	private String cahSerial;
	private String cahNxtAct;
	private String cahName;
	private String cahPhone;
	private String cahProblem;
	private Integer cahPri;
	private String cahDesc;
	private Date cahEvtDate;
	private Integer cahCmtindx;
	private String cahSvCode;
	private String cahChr01;
	private String cahChr02;
	private String cahChr03;
	private String cahChr04;
	private String cahChr05;
	private Double cahDec01;
	private String cahChr06;
	private String cahChr07;
	private String cahChr08;
	private String cahChr09;
	private String cahChr10;
	private Date cahDte01;
	private Date cahDte02;
	private Date cahDte03;
	private Date cahDte04;
	private Date cahDte05;
	private Double cahDec02;
	private Double cahDec03;
	private Boolean cahLog01;
	private Boolean cahLog02;
	private Boolean cahLog03;
	private Boolean cahLog04;
	private Boolean cahLog05;
	private String cahArea;
	private Integer cahTrvDist;
	private String cahTrvUm;
	private String cahFromQue;
	private Date cahSntDate;
	private Integer cahSntTime;
	private String cahCode;
	private String cahEvtTime;
	private String cahNxtTime;
	private Double cahTimeLog;
	private Boolean cahBilled;
	private String cahResolve;
	private String cahSeverity;
	private String cahUser1;
	private String cahUser2;
	private String cahCategory;
	private Boolean cahCmmtMod;
	private Date cahDateStmp;
	private String cahEngArea;
	private String cahEngGroup;
	private String cahEscalate;
	private String cahEsNbr;
	private Integer cahEsSeq;
	private String cahEuNbr;
	private String cahIntType;
	private Integer cahRef;
	private String cahTimeStmp;
	private String cahChr11;
	private String cahContract;
	private Date cahEuDate;
	private String cahEuTime;
	private String cahQadc01;
	private String cahQadc02;
	private String cahQadc03;
	private Double cahQadd01;
	private Double cahQadd02;
	private Double cahQadd03;
	private Integer cahQadi01;
	private Integer cahQadi02;
	private Integer cahQadi03;
	private Boolean cahQadl01;
	private Boolean cahQadl02;
	private Boolean cahQadl03;
	private Date cahQadt01;
	private Date cahQadt02;
	private Date cahQadt03;
	private Double oidCahHist;

	// Constructors

	/** default constructor */
	public AbstractCahHist() {
	}

	/** minimal constructor */
	public AbstractCahHist(CahHistId id, Double oidCahHist) {
		this.id = id;
		this.oidCahHist = oidCahHist;
	}

	/** full constructor */
	public AbstractCahHist(CahHistId id, Date cahNxtDate, String cahQue,
			String cahAssign, String cahEnterBy, String cahStatus,
			String cahType, String cahPart, String cahSerial, String cahNxtAct,
			String cahName, String cahPhone, String cahProblem, Integer cahPri,
			String cahDesc, Date cahEvtDate, Integer cahCmtindx,
			String cahSvCode, String cahChr01, String cahChr02,
			String cahChr03, String cahChr04, String cahChr05, Double cahDec01,
			String cahChr06, String cahChr07, String cahChr08, String cahChr09,
			String cahChr10, Date cahDte01, Date cahDte02, Date cahDte03,
			Date cahDte04, Date cahDte05, Double cahDec02, Double cahDec03,
			Boolean cahLog01, Boolean cahLog02, Boolean cahLog03,
			Boolean cahLog04, Boolean cahLog05, String cahArea,
			Integer cahTrvDist, String cahTrvUm, String cahFromQue,
			Date cahSntDate, Integer cahSntTime, String cahCode,
			String cahEvtTime, String cahNxtTime, Double cahTimeLog,
			Boolean cahBilled, String cahResolve, String cahSeverity,
			String cahUser1, String cahUser2, String cahCategory,
			Boolean cahCmmtMod, Date cahDateStmp, String cahEngArea,
			String cahEngGroup, String cahEscalate, String cahEsNbr,
			Integer cahEsSeq, String cahEuNbr, String cahIntType,
			Integer cahRef, String cahTimeStmp, String cahChr11,
			String cahContract, Date cahEuDate, String cahEuTime,
			String cahQadc01, String cahQadc02, String cahQadc03,
			Double cahQadd01, Double cahQadd02, Double cahQadd03,
			Integer cahQadi01, Integer cahQadi02, Integer cahQadi03,
			Boolean cahQadl01, Boolean cahQadl02, Boolean cahQadl03,
			Date cahQadt01, Date cahQadt02, Date cahQadt03, Double oidCahHist) {
		this.id = id;
		this.cahNxtDate = cahNxtDate;
		this.cahQue = cahQue;
		this.cahAssign = cahAssign;
		this.cahEnterBy = cahEnterBy;
		this.cahStatus = cahStatus;
		this.cahType = cahType;
		this.cahPart = cahPart;
		this.cahSerial = cahSerial;
		this.cahNxtAct = cahNxtAct;
		this.cahName = cahName;
		this.cahPhone = cahPhone;
		this.cahProblem = cahProblem;
		this.cahPri = cahPri;
		this.cahDesc = cahDesc;
		this.cahEvtDate = cahEvtDate;
		this.cahCmtindx = cahCmtindx;
		this.cahSvCode = cahSvCode;
		this.cahChr01 = cahChr01;
		this.cahChr02 = cahChr02;
		this.cahChr03 = cahChr03;
		this.cahChr04 = cahChr04;
		this.cahChr05 = cahChr05;
		this.cahDec01 = cahDec01;
		this.cahChr06 = cahChr06;
		this.cahChr07 = cahChr07;
		this.cahChr08 = cahChr08;
		this.cahChr09 = cahChr09;
		this.cahChr10 = cahChr10;
		this.cahDte01 = cahDte01;
		this.cahDte02 = cahDte02;
		this.cahDte03 = cahDte03;
		this.cahDte04 = cahDte04;
		this.cahDte05 = cahDte05;
		this.cahDec02 = cahDec02;
		this.cahDec03 = cahDec03;
		this.cahLog01 = cahLog01;
		this.cahLog02 = cahLog02;
		this.cahLog03 = cahLog03;
		this.cahLog04 = cahLog04;
		this.cahLog05 = cahLog05;
		this.cahArea = cahArea;
		this.cahTrvDist = cahTrvDist;
		this.cahTrvUm = cahTrvUm;
		this.cahFromQue = cahFromQue;
		this.cahSntDate = cahSntDate;
		this.cahSntTime = cahSntTime;
		this.cahCode = cahCode;
		this.cahEvtTime = cahEvtTime;
		this.cahNxtTime = cahNxtTime;
		this.cahTimeLog = cahTimeLog;
		this.cahBilled = cahBilled;
		this.cahResolve = cahResolve;
		this.cahSeverity = cahSeverity;
		this.cahUser1 = cahUser1;
		this.cahUser2 = cahUser2;
		this.cahCategory = cahCategory;
		this.cahCmmtMod = cahCmmtMod;
		this.cahDateStmp = cahDateStmp;
		this.cahEngArea = cahEngArea;
		this.cahEngGroup = cahEngGroup;
		this.cahEscalate = cahEscalate;
		this.cahEsNbr = cahEsNbr;
		this.cahEsSeq = cahEsSeq;
		this.cahEuNbr = cahEuNbr;
		this.cahIntType = cahIntType;
		this.cahRef = cahRef;
		this.cahTimeStmp = cahTimeStmp;
		this.cahChr11 = cahChr11;
		this.cahContract = cahContract;
		this.cahEuDate = cahEuDate;
		this.cahEuTime = cahEuTime;
		this.cahQadc01 = cahQadc01;
		this.cahQadc02 = cahQadc02;
		this.cahQadc03 = cahQadc03;
		this.cahQadd01 = cahQadd01;
		this.cahQadd02 = cahQadd02;
		this.cahQadd03 = cahQadd03;
		this.cahQadi01 = cahQadi01;
		this.cahQadi02 = cahQadi02;
		this.cahQadi03 = cahQadi03;
		this.cahQadl01 = cahQadl01;
		this.cahQadl02 = cahQadl02;
		this.cahQadl03 = cahQadl03;
		this.cahQadt01 = cahQadt01;
		this.cahQadt02 = cahQadt02;
		this.cahQadt03 = cahQadt03;
		this.oidCahHist = oidCahHist;
	}

	// Property accessors

	public CahHistId getId() {
		return this.id;
	}

	public void setId(CahHistId id) {
		this.id = id;
	}

	public Date getCahNxtDate() {
		return this.cahNxtDate;
	}

	public void setCahNxtDate(Date cahNxtDate) {
		this.cahNxtDate = cahNxtDate;
	}

	public String getCahQue() {
		return this.cahQue;
	}

	public void setCahQue(String cahQue) {
		this.cahQue = cahQue;
	}

	public String getCahAssign() {
		return this.cahAssign;
	}

	public void setCahAssign(String cahAssign) {
		this.cahAssign = cahAssign;
	}

	public String getCahEnterBy() {
		return this.cahEnterBy;
	}

	public void setCahEnterBy(String cahEnterBy) {
		this.cahEnterBy = cahEnterBy;
	}

	public String getCahStatus() {
		return this.cahStatus;
	}

	public void setCahStatus(String cahStatus) {
		this.cahStatus = cahStatus;
	}

	public String getCahType() {
		return this.cahType;
	}

	public void setCahType(String cahType) {
		this.cahType = cahType;
	}

	public String getCahPart() {
		return this.cahPart;
	}

	public void setCahPart(String cahPart) {
		this.cahPart = cahPart;
	}

	public String getCahSerial() {
		return this.cahSerial;
	}

	public void setCahSerial(String cahSerial) {
		this.cahSerial = cahSerial;
	}

	public String getCahNxtAct() {
		return this.cahNxtAct;
	}

	public void setCahNxtAct(String cahNxtAct) {
		this.cahNxtAct = cahNxtAct;
	}

	public String getCahName() {
		return this.cahName;
	}

	public void setCahName(String cahName) {
		this.cahName = cahName;
	}

	public String getCahPhone() {
		return this.cahPhone;
	}

	public void setCahPhone(String cahPhone) {
		this.cahPhone = cahPhone;
	}

	public String getCahProblem() {
		return this.cahProblem;
	}

	public void setCahProblem(String cahProblem) {
		this.cahProblem = cahProblem;
	}

	public Integer getCahPri() {
		return this.cahPri;
	}

	public void setCahPri(Integer cahPri) {
		this.cahPri = cahPri;
	}

	public String getCahDesc() {
		return this.cahDesc;
	}

	public void setCahDesc(String cahDesc) {
		this.cahDesc = cahDesc;
	}

	public Date getCahEvtDate() {
		return this.cahEvtDate;
	}

	public void setCahEvtDate(Date cahEvtDate) {
		this.cahEvtDate = cahEvtDate;
	}

	public Integer getCahCmtindx() {
		return this.cahCmtindx;
	}

	public void setCahCmtindx(Integer cahCmtindx) {
		this.cahCmtindx = cahCmtindx;
	}

	public String getCahSvCode() {
		return this.cahSvCode;
	}

	public void setCahSvCode(String cahSvCode) {
		this.cahSvCode = cahSvCode;
	}

	public String getCahChr01() {
		return this.cahChr01;
	}

	public void setCahChr01(String cahChr01) {
		this.cahChr01 = cahChr01;
	}

	public String getCahChr02() {
		return this.cahChr02;
	}

	public void setCahChr02(String cahChr02) {
		this.cahChr02 = cahChr02;
	}

	public String getCahChr03() {
		return this.cahChr03;
	}

	public void setCahChr03(String cahChr03) {
		this.cahChr03 = cahChr03;
	}

	public String getCahChr04() {
		return this.cahChr04;
	}

	public void setCahChr04(String cahChr04) {
		this.cahChr04 = cahChr04;
	}

	public String getCahChr05() {
		return this.cahChr05;
	}

	public void setCahChr05(String cahChr05) {
		this.cahChr05 = cahChr05;
	}

	public Double getCahDec01() {
		return this.cahDec01;
	}

	public void setCahDec01(Double cahDec01) {
		this.cahDec01 = cahDec01;
	}

	public String getCahChr06() {
		return this.cahChr06;
	}

	public void setCahChr06(String cahChr06) {
		this.cahChr06 = cahChr06;
	}

	public String getCahChr07() {
		return this.cahChr07;
	}

	public void setCahChr07(String cahChr07) {
		this.cahChr07 = cahChr07;
	}

	public String getCahChr08() {
		return this.cahChr08;
	}

	public void setCahChr08(String cahChr08) {
		this.cahChr08 = cahChr08;
	}

	public String getCahChr09() {
		return this.cahChr09;
	}

	public void setCahChr09(String cahChr09) {
		this.cahChr09 = cahChr09;
	}

	public String getCahChr10() {
		return this.cahChr10;
	}

	public void setCahChr10(String cahChr10) {
		this.cahChr10 = cahChr10;
	}

	public Date getCahDte01() {
		return this.cahDte01;
	}

	public void setCahDte01(Date cahDte01) {
		this.cahDte01 = cahDte01;
	}

	public Date getCahDte02() {
		return this.cahDte02;
	}

	public void setCahDte02(Date cahDte02) {
		this.cahDte02 = cahDte02;
	}

	public Date getCahDte03() {
		return this.cahDte03;
	}

	public void setCahDte03(Date cahDte03) {
		this.cahDte03 = cahDte03;
	}

	public Date getCahDte04() {
		return this.cahDte04;
	}

	public void setCahDte04(Date cahDte04) {
		this.cahDte04 = cahDte04;
	}

	public Date getCahDte05() {
		return this.cahDte05;
	}

	public void setCahDte05(Date cahDte05) {
		this.cahDte05 = cahDte05;
	}

	public Double getCahDec02() {
		return this.cahDec02;
	}

	public void setCahDec02(Double cahDec02) {
		this.cahDec02 = cahDec02;
	}

	public Double getCahDec03() {
		return this.cahDec03;
	}

	public void setCahDec03(Double cahDec03) {
		this.cahDec03 = cahDec03;
	}

	public Boolean getCahLog01() {
		return this.cahLog01;
	}

	public void setCahLog01(Boolean cahLog01) {
		this.cahLog01 = cahLog01;
	}

	public Boolean getCahLog02() {
		return this.cahLog02;
	}

	public void setCahLog02(Boolean cahLog02) {
		this.cahLog02 = cahLog02;
	}

	public Boolean getCahLog03() {
		return this.cahLog03;
	}

	public void setCahLog03(Boolean cahLog03) {
		this.cahLog03 = cahLog03;
	}

	public Boolean getCahLog04() {
		return this.cahLog04;
	}

	public void setCahLog04(Boolean cahLog04) {
		this.cahLog04 = cahLog04;
	}

	public Boolean getCahLog05() {
		return this.cahLog05;
	}

	public void setCahLog05(Boolean cahLog05) {
		this.cahLog05 = cahLog05;
	}

	public String getCahArea() {
		return this.cahArea;
	}

	public void setCahArea(String cahArea) {
		this.cahArea = cahArea;
	}

	public Integer getCahTrvDist() {
		return this.cahTrvDist;
	}

	public void setCahTrvDist(Integer cahTrvDist) {
		this.cahTrvDist = cahTrvDist;
	}

	public String getCahTrvUm() {
		return this.cahTrvUm;
	}

	public void setCahTrvUm(String cahTrvUm) {
		this.cahTrvUm = cahTrvUm;
	}

	public String getCahFromQue() {
		return this.cahFromQue;
	}

	public void setCahFromQue(String cahFromQue) {
		this.cahFromQue = cahFromQue;
	}

	public Date getCahSntDate() {
		return this.cahSntDate;
	}

	public void setCahSntDate(Date cahSntDate) {
		this.cahSntDate = cahSntDate;
	}

	public Integer getCahSntTime() {
		return this.cahSntTime;
	}

	public void setCahSntTime(Integer cahSntTime) {
		this.cahSntTime = cahSntTime;
	}

	public String getCahCode() {
		return this.cahCode;
	}

	public void setCahCode(String cahCode) {
		this.cahCode = cahCode;
	}

	public String getCahEvtTime() {
		return this.cahEvtTime;
	}

	public void setCahEvtTime(String cahEvtTime) {
		this.cahEvtTime = cahEvtTime;
	}

	public String getCahNxtTime() {
		return this.cahNxtTime;
	}

	public void setCahNxtTime(String cahNxtTime) {
		this.cahNxtTime = cahNxtTime;
	}

	public Double getCahTimeLog() {
		return this.cahTimeLog;
	}

	public void setCahTimeLog(Double cahTimeLog) {
		this.cahTimeLog = cahTimeLog;
	}

	public Boolean getCahBilled() {
		return this.cahBilled;
	}

	public void setCahBilled(Boolean cahBilled) {
		this.cahBilled = cahBilled;
	}

	public String getCahResolve() {
		return this.cahResolve;
	}

	public void setCahResolve(String cahResolve) {
		this.cahResolve = cahResolve;
	}

	public String getCahSeverity() {
		return this.cahSeverity;
	}

	public void setCahSeverity(String cahSeverity) {
		this.cahSeverity = cahSeverity;
	}

	public String getCahUser1() {
		return this.cahUser1;
	}

	public void setCahUser1(String cahUser1) {
		this.cahUser1 = cahUser1;
	}

	public String getCahUser2() {
		return this.cahUser2;
	}

	public void setCahUser2(String cahUser2) {
		this.cahUser2 = cahUser2;
	}

	public String getCahCategory() {
		return this.cahCategory;
	}

	public void setCahCategory(String cahCategory) {
		this.cahCategory = cahCategory;
	}

	public Boolean getCahCmmtMod() {
		return this.cahCmmtMod;
	}

	public void setCahCmmtMod(Boolean cahCmmtMod) {
		this.cahCmmtMod = cahCmmtMod;
	}

	public Date getCahDateStmp() {
		return this.cahDateStmp;
	}

	public void setCahDateStmp(Date cahDateStmp) {
		this.cahDateStmp = cahDateStmp;
	}

	public String getCahEngArea() {
		return this.cahEngArea;
	}

	public void setCahEngArea(String cahEngArea) {
		this.cahEngArea = cahEngArea;
	}

	public String getCahEngGroup() {
		return this.cahEngGroup;
	}

	public void setCahEngGroup(String cahEngGroup) {
		this.cahEngGroup = cahEngGroup;
	}

	public String getCahEscalate() {
		return this.cahEscalate;
	}

	public void setCahEscalate(String cahEscalate) {
		this.cahEscalate = cahEscalate;
	}

	public String getCahEsNbr() {
		return this.cahEsNbr;
	}

	public void setCahEsNbr(String cahEsNbr) {
		this.cahEsNbr = cahEsNbr;
	}

	public Integer getCahEsSeq() {
		return this.cahEsSeq;
	}

	public void setCahEsSeq(Integer cahEsSeq) {
		this.cahEsSeq = cahEsSeq;
	}

	public String getCahEuNbr() {
		return this.cahEuNbr;
	}

	public void setCahEuNbr(String cahEuNbr) {
		this.cahEuNbr = cahEuNbr;
	}

	public String getCahIntType() {
		return this.cahIntType;
	}

	public void setCahIntType(String cahIntType) {
		this.cahIntType = cahIntType;
	}

	public Integer getCahRef() {
		return this.cahRef;
	}

	public void setCahRef(Integer cahRef) {
		this.cahRef = cahRef;
	}

	public String getCahTimeStmp() {
		return this.cahTimeStmp;
	}

	public void setCahTimeStmp(String cahTimeStmp) {
		this.cahTimeStmp = cahTimeStmp;
	}

	public String getCahChr11() {
		return this.cahChr11;
	}

	public void setCahChr11(String cahChr11) {
		this.cahChr11 = cahChr11;
	}

	public String getCahContract() {
		return this.cahContract;
	}

	public void setCahContract(String cahContract) {
		this.cahContract = cahContract;
	}

	public Date getCahEuDate() {
		return this.cahEuDate;
	}

	public void setCahEuDate(Date cahEuDate) {
		this.cahEuDate = cahEuDate;
	}

	public String getCahEuTime() {
		return this.cahEuTime;
	}

	public void setCahEuTime(String cahEuTime) {
		this.cahEuTime = cahEuTime;
	}

	public String getCahQadc01() {
		return this.cahQadc01;
	}

	public void setCahQadc01(String cahQadc01) {
		this.cahQadc01 = cahQadc01;
	}

	public String getCahQadc02() {
		return this.cahQadc02;
	}

	public void setCahQadc02(String cahQadc02) {
		this.cahQadc02 = cahQadc02;
	}

	public String getCahQadc03() {
		return this.cahQadc03;
	}

	public void setCahQadc03(String cahQadc03) {
		this.cahQadc03 = cahQadc03;
	}

	public Double getCahQadd01() {
		return this.cahQadd01;
	}

	public void setCahQadd01(Double cahQadd01) {
		this.cahQadd01 = cahQadd01;
	}

	public Double getCahQadd02() {
		return this.cahQadd02;
	}

	public void setCahQadd02(Double cahQadd02) {
		this.cahQadd02 = cahQadd02;
	}

	public Double getCahQadd03() {
		return this.cahQadd03;
	}

	public void setCahQadd03(Double cahQadd03) {
		this.cahQadd03 = cahQadd03;
	}

	public Integer getCahQadi01() {
		return this.cahQadi01;
	}

	public void setCahQadi01(Integer cahQadi01) {
		this.cahQadi01 = cahQadi01;
	}

	public Integer getCahQadi02() {
		return this.cahQadi02;
	}

	public void setCahQadi02(Integer cahQadi02) {
		this.cahQadi02 = cahQadi02;
	}

	public Integer getCahQadi03() {
		return this.cahQadi03;
	}

	public void setCahQadi03(Integer cahQadi03) {
		this.cahQadi03 = cahQadi03;
	}

	public Boolean getCahQadl01() {
		return this.cahQadl01;
	}

	public void setCahQadl01(Boolean cahQadl01) {
		this.cahQadl01 = cahQadl01;
	}

	public Boolean getCahQadl02() {
		return this.cahQadl02;
	}

	public void setCahQadl02(Boolean cahQadl02) {
		this.cahQadl02 = cahQadl02;
	}

	public Boolean getCahQadl03() {
		return this.cahQadl03;
	}

	public void setCahQadl03(Boolean cahQadl03) {
		this.cahQadl03 = cahQadl03;
	}

	public Date getCahQadt01() {
		return this.cahQadt01;
	}

	public void setCahQadt01(Date cahQadt01) {
		this.cahQadt01 = cahQadt01;
	}

	public Date getCahQadt02() {
		return this.cahQadt02;
	}

	public void setCahQadt02(Date cahQadt02) {
		this.cahQadt02 = cahQadt02;
	}

	public Date getCahQadt03() {
		return this.cahQadt03;
	}

	public void setCahQadt03(Date cahQadt03) {
		this.cahQadt03 = cahQadt03;
	}

	public Double getOidCahHist() {
		return this.oidCahHist;
	}

	public void setOidCahHist(Double oidCahHist) {
		this.oidCahHist = oidCahHist;
	}

}