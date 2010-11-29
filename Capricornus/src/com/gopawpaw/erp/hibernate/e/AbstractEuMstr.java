package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEuMstr entity provides the base persistence definition of the EuMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEuMstr implements java.io.Serializable {

	// Fields

	private EuMstrId id;
	private String euRsb;
	private String euPhone;
	private String euModem;
	private String euLogin;
	private String euCmNbr;
	private String euSort;
	private String euChannel;
	private String euOffice;
	private String euMsg;
	private String euStatus;
	private Date euMsgEnd;
	private String euEngCode;
	private String euSvcArea;
	private Integer euPri;
	private String euLang;
	private String euChr01;
	private String euChr02;
	private String euChr03;
	private String euChr04;
	private String euChr05;
	private String euStTime;
	private String euEdTime;
	private String euChr06;
	private String euChr07;
	private String euChr08;
	private String euChr09;
	private String euChr10;
	private Double euDec01;
	private Double euDec02;
	private Double euDec03;
	private Date euDte01;
	private Date euDte02;
	private Date euDte03;
	private Date euDte04;
	private Boolean euLog01;
	private Boolean euLog02;
	private Boolean euLog03;
	private Boolean euLog04;
	private Boolean euLog05;
	private Integer euCmtindx;
	private String euType;
	private String euApplication;
	private String euSicCode;
	private Date euReview;
	private String euNode;
	private String euNodeType;
	private String euName;
	private Boolean euAutorenew;
	private Double euDiscPct;
	private String euUser1;
	private String euUser2;
	private Boolean euCreateIsb;
	private String euEngGroup;
	private String euEngSec;
	private String euEsNbr;
	private Double euPoAccum;
	private Double euPoLimit;
	private String euPoNbr;
	private Boolean euRebuildIsb;
	private Integer euRenewDays;
	private Boolean euReseller;
	private Integer euTimeZone;
	private Integer euTrvDist;
	private String euTrvTime;
	private String euTrvUm;
	private String euUpdates;
	private Double euUnBilled;
	private String euZip;
	private Boolean euSepInvoice;
	private Integer euReceiptDays;
	private Integer euShipDays;
	private Boolean euPoReqd;
	private String euQadc01;
	private String euQadc02;
	private String euQadc03;
	private Integer euQadi01;
	private Integer euQadi02;
	private Date euQadt01;
	private Date euQadt02;
	private Double euQadd01;
	private Boolean euQadl01;
	private Boolean euQadl02;
	private Boolean euQadl03;
	private String euModUserid;
	private Date euModDate;
	private Double oidEuMstr;

	// Constructors

	/** default constructor */
	public AbstractEuMstr() {
	}

	/** minimal constructor */
	public AbstractEuMstr(EuMstrId id, Double oidEuMstr) {
		this.id = id;
		this.oidEuMstr = oidEuMstr;
	}

	/** full constructor */
	public AbstractEuMstr(EuMstrId id, String euRsb, String euPhone,
			String euModem, String euLogin, String euCmNbr, String euSort,
			String euChannel, String euOffice, String euMsg, String euStatus,
			Date euMsgEnd, String euEngCode, String euSvcArea, Integer euPri,
			String euLang, String euChr01, String euChr02, String euChr03,
			String euChr04, String euChr05, String euStTime, String euEdTime,
			String euChr06, String euChr07, String euChr08, String euChr09,
			String euChr10, Double euDec01, Double euDec02, Double euDec03,
			Date euDte01, Date euDte02, Date euDte03, Date euDte04,
			Boolean euLog01, Boolean euLog02, Boolean euLog03, Boolean euLog04,
			Boolean euLog05, Integer euCmtindx, String euType,
			String euApplication, String euSicCode, Date euReview,
			String euNode, String euNodeType, String euName,
			Boolean euAutorenew, Double euDiscPct, String euUser1,
			String euUser2, Boolean euCreateIsb, String euEngGroup,
			String euEngSec, String euEsNbr, Double euPoAccum,
			Double euPoLimit, String euPoNbr, Boolean euRebuildIsb,
			Integer euRenewDays, Boolean euReseller, Integer euTimeZone,
			Integer euTrvDist, String euTrvTime, String euTrvUm,
			String euUpdates, Double euUnBilled, String euZip,
			Boolean euSepInvoice, Integer euReceiptDays, Integer euShipDays,
			Boolean euPoReqd, String euQadc01, String euQadc02,
			String euQadc03, Integer euQadi01, Integer euQadi02, Date euQadt01,
			Date euQadt02, Double euQadd01, Boolean euQadl01, Boolean euQadl02,
			Boolean euQadl03, String euModUserid, Date euModDate,
			Double oidEuMstr) {
		this.id = id;
		this.euRsb = euRsb;
		this.euPhone = euPhone;
		this.euModem = euModem;
		this.euLogin = euLogin;
		this.euCmNbr = euCmNbr;
		this.euSort = euSort;
		this.euChannel = euChannel;
		this.euOffice = euOffice;
		this.euMsg = euMsg;
		this.euStatus = euStatus;
		this.euMsgEnd = euMsgEnd;
		this.euEngCode = euEngCode;
		this.euSvcArea = euSvcArea;
		this.euPri = euPri;
		this.euLang = euLang;
		this.euChr01 = euChr01;
		this.euChr02 = euChr02;
		this.euChr03 = euChr03;
		this.euChr04 = euChr04;
		this.euChr05 = euChr05;
		this.euStTime = euStTime;
		this.euEdTime = euEdTime;
		this.euChr06 = euChr06;
		this.euChr07 = euChr07;
		this.euChr08 = euChr08;
		this.euChr09 = euChr09;
		this.euChr10 = euChr10;
		this.euDec01 = euDec01;
		this.euDec02 = euDec02;
		this.euDec03 = euDec03;
		this.euDte01 = euDte01;
		this.euDte02 = euDte02;
		this.euDte03 = euDte03;
		this.euDte04 = euDte04;
		this.euLog01 = euLog01;
		this.euLog02 = euLog02;
		this.euLog03 = euLog03;
		this.euLog04 = euLog04;
		this.euLog05 = euLog05;
		this.euCmtindx = euCmtindx;
		this.euType = euType;
		this.euApplication = euApplication;
		this.euSicCode = euSicCode;
		this.euReview = euReview;
		this.euNode = euNode;
		this.euNodeType = euNodeType;
		this.euName = euName;
		this.euAutorenew = euAutorenew;
		this.euDiscPct = euDiscPct;
		this.euUser1 = euUser1;
		this.euUser2 = euUser2;
		this.euCreateIsb = euCreateIsb;
		this.euEngGroup = euEngGroup;
		this.euEngSec = euEngSec;
		this.euEsNbr = euEsNbr;
		this.euPoAccum = euPoAccum;
		this.euPoLimit = euPoLimit;
		this.euPoNbr = euPoNbr;
		this.euRebuildIsb = euRebuildIsb;
		this.euRenewDays = euRenewDays;
		this.euReseller = euReseller;
		this.euTimeZone = euTimeZone;
		this.euTrvDist = euTrvDist;
		this.euTrvTime = euTrvTime;
		this.euTrvUm = euTrvUm;
		this.euUpdates = euUpdates;
		this.euUnBilled = euUnBilled;
		this.euZip = euZip;
		this.euSepInvoice = euSepInvoice;
		this.euReceiptDays = euReceiptDays;
		this.euShipDays = euShipDays;
		this.euPoReqd = euPoReqd;
		this.euQadc01 = euQadc01;
		this.euQadc02 = euQadc02;
		this.euQadc03 = euQadc03;
		this.euQadi01 = euQadi01;
		this.euQadi02 = euQadi02;
		this.euQadt01 = euQadt01;
		this.euQadt02 = euQadt02;
		this.euQadd01 = euQadd01;
		this.euQadl01 = euQadl01;
		this.euQadl02 = euQadl02;
		this.euQadl03 = euQadl03;
		this.euModUserid = euModUserid;
		this.euModDate = euModDate;
		this.oidEuMstr = oidEuMstr;
	}

	// Property accessors

	public EuMstrId getId() {
		return this.id;
	}

	public void setId(EuMstrId id) {
		this.id = id;
	}

	public String getEuRsb() {
		return this.euRsb;
	}

	public void setEuRsb(String euRsb) {
		this.euRsb = euRsb;
	}

	public String getEuPhone() {
		return this.euPhone;
	}

	public void setEuPhone(String euPhone) {
		this.euPhone = euPhone;
	}

	public String getEuModem() {
		return this.euModem;
	}

	public void setEuModem(String euModem) {
		this.euModem = euModem;
	}

	public String getEuLogin() {
		return this.euLogin;
	}

	public void setEuLogin(String euLogin) {
		this.euLogin = euLogin;
	}

	public String getEuCmNbr() {
		return this.euCmNbr;
	}

	public void setEuCmNbr(String euCmNbr) {
		this.euCmNbr = euCmNbr;
	}

	public String getEuSort() {
		return this.euSort;
	}

	public void setEuSort(String euSort) {
		this.euSort = euSort;
	}

	public String getEuChannel() {
		return this.euChannel;
	}

	public void setEuChannel(String euChannel) {
		this.euChannel = euChannel;
	}

	public String getEuOffice() {
		return this.euOffice;
	}

	public void setEuOffice(String euOffice) {
		this.euOffice = euOffice;
	}

	public String getEuMsg() {
		return this.euMsg;
	}

	public void setEuMsg(String euMsg) {
		this.euMsg = euMsg;
	}

	public String getEuStatus() {
		return this.euStatus;
	}

	public void setEuStatus(String euStatus) {
		this.euStatus = euStatus;
	}

	public Date getEuMsgEnd() {
		return this.euMsgEnd;
	}

	public void setEuMsgEnd(Date euMsgEnd) {
		this.euMsgEnd = euMsgEnd;
	}

	public String getEuEngCode() {
		return this.euEngCode;
	}

	public void setEuEngCode(String euEngCode) {
		this.euEngCode = euEngCode;
	}

	public String getEuSvcArea() {
		return this.euSvcArea;
	}

	public void setEuSvcArea(String euSvcArea) {
		this.euSvcArea = euSvcArea;
	}

	public Integer getEuPri() {
		return this.euPri;
	}

	public void setEuPri(Integer euPri) {
		this.euPri = euPri;
	}

	public String getEuLang() {
		return this.euLang;
	}

	public void setEuLang(String euLang) {
		this.euLang = euLang;
	}

	public String getEuChr01() {
		return this.euChr01;
	}

	public void setEuChr01(String euChr01) {
		this.euChr01 = euChr01;
	}

	public String getEuChr02() {
		return this.euChr02;
	}

	public void setEuChr02(String euChr02) {
		this.euChr02 = euChr02;
	}

	public String getEuChr03() {
		return this.euChr03;
	}

	public void setEuChr03(String euChr03) {
		this.euChr03 = euChr03;
	}

	public String getEuChr04() {
		return this.euChr04;
	}

	public void setEuChr04(String euChr04) {
		this.euChr04 = euChr04;
	}

	public String getEuChr05() {
		return this.euChr05;
	}

	public void setEuChr05(String euChr05) {
		this.euChr05 = euChr05;
	}

	public String getEuStTime() {
		return this.euStTime;
	}

	public void setEuStTime(String euStTime) {
		this.euStTime = euStTime;
	}

	public String getEuEdTime() {
		return this.euEdTime;
	}

	public void setEuEdTime(String euEdTime) {
		this.euEdTime = euEdTime;
	}

	public String getEuChr06() {
		return this.euChr06;
	}

	public void setEuChr06(String euChr06) {
		this.euChr06 = euChr06;
	}

	public String getEuChr07() {
		return this.euChr07;
	}

	public void setEuChr07(String euChr07) {
		this.euChr07 = euChr07;
	}

	public String getEuChr08() {
		return this.euChr08;
	}

	public void setEuChr08(String euChr08) {
		this.euChr08 = euChr08;
	}

	public String getEuChr09() {
		return this.euChr09;
	}

	public void setEuChr09(String euChr09) {
		this.euChr09 = euChr09;
	}

	public String getEuChr10() {
		return this.euChr10;
	}

	public void setEuChr10(String euChr10) {
		this.euChr10 = euChr10;
	}

	public Double getEuDec01() {
		return this.euDec01;
	}

	public void setEuDec01(Double euDec01) {
		this.euDec01 = euDec01;
	}

	public Double getEuDec02() {
		return this.euDec02;
	}

	public void setEuDec02(Double euDec02) {
		this.euDec02 = euDec02;
	}

	public Double getEuDec03() {
		return this.euDec03;
	}

	public void setEuDec03(Double euDec03) {
		this.euDec03 = euDec03;
	}

	public Date getEuDte01() {
		return this.euDte01;
	}

	public void setEuDte01(Date euDte01) {
		this.euDte01 = euDte01;
	}

	public Date getEuDte02() {
		return this.euDte02;
	}

	public void setEuDte02(Date euDte02) {
		this.euDte02 = euDte02;
	}

	public Date getEuDte03() {
		return this.euDte03;
	}

	public void setEuDte03(Date euDte03) {
		this.euDte03 = euDte03;
	}

	public Date getEuDte04() {
		return this.euDte04;
	}

	public void setEuDte04(Date euDte04) {
		this.euDte04 = euDte04;
	}

	public Boolean getEuLog01() {
		return this.euLog01;
	}

	public void setEuLog01(Boolean euLog01) {
		this.euLog01 = euLog01;
	}

	public Boolean getEuLog02() {
		return this.euLog02;
	}

	public void setEuLog02(Boolean euLog02) {
		this.euLog02 = euLog02;
	}

	public Boolean getEuLog03() {
		return this.euLog03;
	}

	public void setEuLog03(Boolean euLog03) {
		this.euLog03 = euLog03;
	}

	public Boolean getEuLog04() {
		return this.euLog04;
	}

	public void setEuLog04(Boolean euLog04) {
		this.euLog04 = euLog04;
	}

	public Boolean getEuLog05() {
		return this.euLog05;
	}

	public void setEuLog05(Boolean euLog05) {
		this.euLog05 = euLog05;
	}

	public Integer getEuCmtindx() {
		return this.euCmtindx;
	}

	public void setEuCmtindx(Integer euCmtindx) {
		this.euCmtindx = euCmtindx;
	}

	public String getEuType() {
		return this.euType;
	}

	public void setEuType(String euType) {
		this.euType = euType;
	}

	public String getEuApplication() {
		return this.euApplication;
	}

	public void setEuApplication(String euApplication) {
		this.euApplication = euApplication;
	}

	public String getEuSicCode() {
		return this.euSicCode;
	}

	public void setEuSicCode(String euSicCode) {
		this.euSicCode = euSicCode;
	}

	public Date getEuReview() {
		return this.euReview;
	}

	public void setEuReview(Date euReview) {
		this.euReview = euReview;
	}

	public String getEuNode() {
		return this.euNode;
	}

	public void setEuNode(String euNode) {
		this.euNode = euNode;
	}

	public String getEuNodeType() {
		return this.euNodeType;
	}

	public void setEuNodeType(String euNodeType) {
		this.euNodeType = euNodeType;
	}

	public String getEuName() {
		return this.euName;
	}

	public void setEuName(String euName) {
		this.euName = euName;
	}

	public Boolean getEuAutorenew() {
		return this.euAutorenew;
	}

	public void setEuAutorenew(Boolean euAutorenew) {
		this.euAutorenew = euAutorenew;
	}

	public Double getEuDiscPct() {
		return this.euDiscPct;
	}

	public void setEuDiscPct(Double euDiscPct) {
		this.euDiscPct = euDiscPct;
	}

	public String getEuUser1() {
		return this.euUser1;
	}

	public void setEuUser1(String euUser1) {
		this.euUser1 = euUser1;
	}

	public String getEuUser2() {
		return this.euUser2;
	}

	public void setEuUser2(String euUser2) {
		this.euUser2 = euUser2;
	}

	public Boolean getEuCreateIsb() {
		return this.euCreateIsb;
	}

	public void setEuCreateIsb(Boolean euCreateIsb) {
		this.euCreateIsb = euCreateIsb;
	}

	public String getEuEngGroup() {
		return this.euEngGroup;
	}

	public void setEuEngGroup(String euEngGroup) {
		this.euEngGroup = euEngGroup;
	}

	public String getEuEngSec() {
		return this.euEngSec;
	}

	public void setEuEngSec(String euEngSec) {
		this.euEngSec = euEngSec;
	}

	public String getEuEsNbr() {
		return this.euEsNbr;
	}

	public void setEuEsNbr(String euEsNbr) {
		this.euEsNbr = euEsNbr;
	}

	public Double getEuPoAccum() {
		return this.euPoAccum;
	}

	public void setEuPoAccum(Double euPoAccum) {
		this.euPoAccum = euPoAccum;
	}

	public Double getEuPoLimit() {
		return this.euPoLimit;
	}

	public void setEuPoLimit(Double euPoLimit) {
		this.euPoLimit = euPoLimit;
	}

	public String getEuPoNbr() {
		return this.euPoNbr;
	}

	public void setEuPoNbr(String euPoNbr) {
		this.euPoNbr = euPoNbr;
	}

	public Boolean getEuRebuildIsb() {
		return this.euRebuildIsb;
	}

	public void setEuRebuildIsb(Boolean euRebuildIsb) {
		this.euRebuildIsb = euRebuildIsb;
	}

	public Integer getEuRenewDays() {
		return this.euRenewDays;
	}

	public void setEuRenewDays(Integer euRenewDays) {
		this.euRenewDays = euRenewDays;
	}

	public Boolean getEuReseller() {
		return this.euReseller;
	}

	public void setEuReseller(Boolean euReseller) {
		this.euReseller = euReseller;
	}

	public Integer getEuTimeZone() {
		return this.euTimeZone;
	}

	public void setEuTimeZone(Integer euTimeZone) {
		this.euTimeZone = euTimeZone;
	}

	public Integer getEuTrvDist() {
		return this.euTrvDist;
	}

	public void setEuTrvDist(Integer euTrvDist) {
		this.euTrvDist = euTrvDist;
	}

	public String getEuTrvTime() {
		return this.euTrvTime;
	}

	public void setEuTrvTime(String euTrvTime) {
		this.euTrvTime = euTrvTime;
	}

	public String getEuTrvUm() {
		return this.euTrvUm;
	}

	public void setEuTrvUm(String euTrvUm) {
		this.euTrvUm = euTrvUm;
	}

	public String getEuUpdates() {
		return this.euUpdates;
	}

	public void setEuUpdates(String euUpdates) {
		this.euUpdates = euUpdates;
	}

	public Double getEuUnBilled() {
		return this.euUnBilled;
	}

	public void setEuUnBilled(Double euUnBilled) {
		this.euUnBilled = euUnBilled;
	}

	public String getEuZip() {
		return this.euZip;
	}

	public void setEuZip(String euZip) {
		this.euZip = euZip;
	}

	public Boolean getEuSepInvoice() {
		return this.euSepInvoice;
	}

	public void setEuSepInvoice(Boolean euSepInvoice) {
		this.euSepInvoice = euSepInvoice;
	}

	public Integer getEuReceiptDays() {
		return this.euReceiptDays;
	}

	public void setEuReceiptDays(Integer euReceiptDays) {
		this.euReceiptDays = euReceiptDays;
	}

	public Integer getEuShipDays() {
		return this.euShipDays;
	}

	public void setEuShipDays(Integer euShipDays) {
		this.euShipDays = euShipDays;
	}

	public Boolean getEuPoReqd() {
		return this.euPoReqd;
	}

	public void setEuPoReqd(Boolean euPoReqd) {
		this.euPoReqd = euPoReqd;
	}

	public String getEuQadc01() {
		return this.euQadc01;
	}

	public void setEuQadc01(String euQadc01) {
		this.euQadc01 = euQadc01;
	}

	public String getEuQadc02() {
		return this.euQadc02;
	}

	public void setEuQadc02(String euQadc02) {
		this.euQadc02 = euQadc02;
	}

	public String getEuQadc03() {
		return this.euQadc03;
	}

	public void setEuQadc03(String euQadc03) {
		this.euQadc03 = euQadc03;
	}

	public Integer getEuQadi01() {
		return this.euQadi01;
	}

	public void setEuQadi01(Integer euQadi01) {
		this.euQadi01 = euQadi01;
	}

	public Integer getEuQadi02() {
		return this.euQadi02;
	}

	public void setEuQadi02(Integer euQadi02) {
		this.euQadi02 = euQadi02;
	}

	public Date getEuQadt01() {
		return this.euQadt01;
	}

	public void setEuQadt01(Date euQadt01) {
		this.euQadt01 = euQadt01;
	}

	public Date getEuQadt02() {
		return this.euQadt02;
	}

	public void setEuQadt02(Date euQadt02) {
		this.euQadt02 = euQadt02;
	}

	public Double getEuQadd01() {
		return this.euQadd01;
	}

	public void setEuQadd01(Double euQadd01) {
		this.euQadd01 = euQadd01;
	}

	public Boolean getEuQadl01() {
		return this.euQadl01;
	}

	public void setEuQadl01(Boolean euQadl01) {
		this.euQadl01 = euQadl01;
	}

	public Boolean getEuQadl02() {
		return this.euQadl02;
	}

	public void setEuQadl02(Boolean euQadl02) {
		this.euQadl02 = euQadl02;
	}

	public Boolean getEuQadl03() {
		return this.euQadl03;
	}

	public void setEuQadl03(Boolean euQadl03) {
		this.euQadl03 = euQadl03;
	}

	public String getEuModUserid() {
		return this.euModUserid;
	}

	public void setEuModUserid(String euModUserid) {
		this.euModUserid = euModUserid;
	}

	public Date getEuModDate() {
		return this.euModDate;
	}

	public void setEuModDate(Date euModDate) {
		this.euModDate = euModDate;
	}

	public Double getOidEuMstr() {
		return this.oidEuMstr;
	}

	public void setOidEuMstr(Double oidEuMstr) {
		this.oidEuMstr = oidEuMstr;
	}

}