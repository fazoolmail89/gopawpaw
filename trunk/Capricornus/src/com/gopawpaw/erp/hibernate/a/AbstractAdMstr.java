package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAdMstr entity provides the base persistence definition of the AdMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAdMstr implements java.io.Serializable {

	// Fields

	private AdMstrId id;
	private String adName;
	private String adLine1;
	private String adLine2;
	private String adCity;
	private String adState;
	private String adZip;
	private String adType;
	private String adAttn;
	private String adPhone;
	private String adExt;
	private String adRef;
	private String adSort;
	private String adCountry;
	private String adAttn2;
	private String adPhone2;
	private String adExt2;
	private String adFax;
	private String adFax2;
	private String adLine3;
	private String adUser1;
	private String adUser2;
	private String adLang;
	private String adPstId;
	private Date adDate;
	private String adCounty;
	private Boolean adTemp;
	private String adBkAcct1;
	private String adBkAcct2;
	private Integer adFormat;
	private String adVatReg;
	private String adCocReg;
	private String adGstId;
	private String adTaxType;
	private String adTaxc;
	private Boolean adTaxable;
	private Boolean adTaxIn;
	private String adConrep;
	private String adEdiTpid;
	private String adEdiCtrl;
	private String adTimezone;
	private String adUserid;
	private Date adModDate;
	private String adEdiId;
	private String adBarlblPrt;
	private String adBarlblVal;
	private String adCalendar;
	private String adEdiStd;
	private String adEdiLevel;
	private String adQad01;
	private String adQad02;
	private String adQad03;
	private String adQad04;
	private String adQad05;
	private String adChr01;
	private String adChr02;
	private String adChr03;
	private String adChr04;
	private String adChr05;
	private String adTpLocCode;
	private String adCtry;
	private String adTaxZone;
	private String adTaxUsage;
	private String adMisc1Id;
	private String adMisc2Id;
	private String adMisc3Id;
	private Integer adWkOffset;
	private String adInvMthd;
	private String adSchMthd;
	private String adPoMthd;
	private String adAsnData;
	private String adIntrDivision;
	private Boolean adTaxReport;
	private String adNameControl;
	private Boolean adLastFile;
	private Double oidAdMstr;

	// Constructors

	/** default constructor */
	public AbstractAdMstr() {
	}

	/** minimal constructor */
	public AbstractAdMstr(AdMstrId id, String adIntrDivision,
			Boolean adTaxReport, String adNameControl, Boolean adLastFile,
			Double oidAdMstr) {
		this.id = id;
		this.adIntrDivision = adIntrDivision;
		this.adTaxReport = adTaxReport;
		this.adNameControl = adNameControl;
		this.adLastFile = adLastFile;
		this.oidAdMstr = oidAdMstr;
	}

	/** full constructor */
	public AbstractAdMstr(AdMstrId id, String adName, String adLine1,
			String adLine2, String adCity, String adState, String adZip,
			String adType, String adAttn, String adPhone, String adExt,
			String adRef, String adSort, String adCountry, String adAttn2,
			String adPhone2, String adExt2, String adFax, String adFax2,
			String adLine3, String adUser1, String adUser2, String adLang,
			String adPstId, Date adDate, String adCounty, Boolean adTemp,
			String adBkAcct1, String adBkAcct2, Integer adFormat,
			String adVatReg, String adCocReg, String adGstId, String adTaxType,
			String adTaxc, Boolean adTaxable, Boolean adTaxIn, String adConrep,
			String adEdiTpid, String adEdiCtrl, String adTimezone,
			String adUserid, Date adModDate, String adEdiId,
			String adBarlblPrt, String adBarlblVal, String adCalendar,
			String adEdiStd, String adEdiLevel, String adQad01, String adQad02,
			String adQad03, String adQad04, String adQad05, String adChr01,
			String adChr02, String adChr03, String adChr04, String adChr05,
			String adTpLocCode, String adCtry, String adTaxZone,
			String adTaxUsage, String adMisc1Id, String adMisc2Id,
			String adMisc3Id, Integer adWkOffset, String adInvMthd,
			String adSchMthd, String adPoMthd, String adAsnData,
			String adIntrDivision, Boolean adTaxReport, String adNameControl,
			Boolean adLastFile, Double oidAdMstr) {
		this.id = id;
		this.adName = adName;
		this.adLine1 = adLine1;
		this.adLine2 = adLine2;
		this.adCity = adCity;
		this.adState = adState;
		this.adZip = adZip;
		this.adType = adType;
		this.adAttn = adAttn;
		this.adPhone = adPhone;
		this.adExt = adExt;
		this.adRef = adRef;
		this.adSort = adSort;
		this.adCountry = adCountry;
		this.adAttn2 = adAttn2;
		this.adPhone2 = adPhone2;
		this.adExt2 = adExt2;
		this.adFax = adFax;
		this.adFax2 = adFax2;
		this.adLine3 = adLine3;
		this.adUser1 = adUser1;
		this.adUser2 = adUser2;
		this.adLang = adLang;
		this.adPstId = adPstId;
		this.adDate = adDate;
		this.adCounty = adCounty;
		this.adTemp = adTemp;
		this.adBkAcct1 = adBkAcct1;
		this.adBkAcct2 = adBkAcct2;
		this.adFormat = adFormat;
		this.adVatReg = adVatReg;
		this.adCocReg = adCocReg;
		this.adGstId = adGstId;
		this.adTaxType = adTaxType;
		this.adTaxc = adTaxc;
		this.adTaxable = adTaxable;
		this.adTaxIn = adTaxIn;
		this.adConrep = adConrep;
		this.adEdiTpid = adEdiTpid;
		this.adEdiCtrl = adEdiCtrl;
		this.adTimezone = adTimezone;
		this.adUserid = adUserid;
		this.adModDate = adModDate;
		this.adEdiId = adEdiId;
		this.adBarlblPrt = adBarlblPrt;
		this.adBarlblVal = adBarlblVal;
		this.adCalendar = adCalendar;
		this.adEdiStd = adEdiStd;
		this.adEdiLevel = adEdiLevel;
		this.adQad01 = adQad01;
		this.adQad02 = adQad02;
		this.adQad03 = adQad03;
		this.adQad04 = adQad04;
		this.adQad05 = adQad05;
		this.adChr01 = adChr01;
		this.adChr02 = adChr02;
		this.adChr03 = adChr03;
		this.adChr04 = adChr04;
		this.adChr05 = adChr05;
		this.adTpLocCode = adTpLocCode;
		this.adCtry = adCtry;
		this.adTaxZone = adTaxZone;
		this.adTaxUsage = adTaxUsage;
		this.adMisc1Id = adMisc1Id;
		this.adMisc2Id = adMisc2Id;
		this.adMisc3Id = adMisc3Id;
		this.adWkOffset = adWkOffset;
		this.adInvMthd = adInvMthd;
		this.adSchMthd = adSchMthd;
		this.adPoMthd = adPoMthd;
		this.adAsnData = adAsnData;
		this.adIntrDivision = adIntrDivision;
		this.adTaxReport = adTaxReport;
		this.adNameControl = adNameControl;
		this.adLastFile = adLastFile;
		this.oidAdMstr = oidAdMstr;
	}

	// Property accessors

	public AdMstrId getId() {
		return this.id;
	}

	public void setId(AdMstrId id) {
		this.id = id;
	}

	public String getAdName() {
		return this.adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAdLine1() {
		return this.adLine1;
	}

	public void setAdLine1(String adLine1) {
		this.adLine1 = adLine1;
	}

	public String getAdLine2() {
		return this.adLine2;
	}

	public void setAdLine2(String adLine2) {
		this.adLine2 = adLine2;
	}

	public String getAdCity() {
		return this.adCity;
	}

	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}

	public String getAdState() {
		return this.adState;
	}

	public void setAdState(String adState) {
		this.adState = adState;
	}

	public String getAdZip() {
		return this.adZip;
	}

	public void setAdZip(String adZip) {
		this.adZip = adZip;
	}

	public String getAdType() {
		return this.adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	public String getAdAttn() {
		return this.adAttn;
	}

	public void setAdAttn(String adAttn) {
		this.adAttn = adAttn;
	}

	public String getAdPhone() {
		return this.adPhone;
	}

	public void setAdPhone(String adPhone) {
		this.adPhone = adPhone;
	}

	public String getAdExt() {
		return this.adExt;
	}

	public void setAdExt(String adExt) {
		this.adExt = adExt;
	}

	public String getAdRef() {
		return this.adRef;
	}

	public void setAdRef(String adRef) {
		this.adRef = adRef;
	}

	public String getAdSort() {
		return this.adSort;
	}

	public void setAdSort(String adSort) {
		this.adSort = adSort;
	}

	public String getAdCountry() {
		return this.adCountry;
	}

	public void setAdCountry(String adCountry) {
		this.adCountry = adCountry;
	}

	public String getAdAttn2() {
		return this.adAttn2;
	}

	public void setAdAttn2(String adAttn2) {
		this.adAttn2 = adAttn2;
	}

	public String getAdPhone2() {
		return this.adPhone2;
	}

	public void setAdPhone2(String adPhone2) {
		this.adPhone2 = adPhone2;
	}

	public String getAdExt2() {
		return this.adExt2;
	}

	public void setAdExt2(String adExt2) {
		this.adExt2 = adExt2;
	}

	public String getAdFax() {
		return this.adFax;
	}

	public void setAdFax(String adFax) {
		this.adFax = adFax;
	}

	public String getAdFax2() {
		return this.adFax2;
	}

	public void setAdFax2(String adFax2) {
		this.adFax2 = adFax2;
	}

	public String getAdLine3() {
		return this.adLine3;
	}

	public void setAdLine3(String adLine3) {
		this.adLine3 = adLine3;
	}

	public String getAdUser1() {
		return this.adUser1;
	}

	public void setAdUser1(String adUser1) {
		this.adUser1 = adUser1;
	}

	public String getAdUser2() {
		return this.adUser2;
	}

	public void setAdUser2(String adUser2) {
		this.adUser2 = adUser2;
	}

	public String getAdLang() {
		return this.adLang;
	}

	public void setAdLang(String adLang) {
		this.adLang = adLang;
	}

	public String getAdPstId() {
		return this.adPstId;
	}

	public void setAdPstId(String adPstId) {
		this.adPstId = adPstId;
	}

	public Date getAdDate() {
		return this.adDate;
	}

	public void setAdDate(Date adDate) {
		this.adDate = adDate;
	}

	public String getAdCounty() {
		return this.adCounty;
	}

	public void setAdCounty(String adCounty) {
		this.adCounty = adCounty;
	}

	public Boolean getAdTemp() {
		return this.adTemp;
	}

	public void setAdTemp(Boolean adTemp) {
		this.adTemp = adTemp;
	}

	public String getAdBkAcct1() {
		return this.adBkAcct1;
	}

	public void setAdBkAcct1(String adBkAcct1) {
		this.adBkAcct1 = adBkAcct1;
	}

	public String getAdBkAcct2() {
		return this.adBkAcct2;
	}

	public void setAdBkAcct2(String adBkAcct2) {
		this.adBkAcct2 = adBkAcct2;
	}

	public Integer getAdFormat() {
		return this.adFormat;
	}

	public void setAdFormat(Integer adFormat) {
		this.adFormat = adFormat;
	}

	public String getAdVatReg() {
		return this.adVatReg;
	}

	public void setAdVatReg(String adVatReg) {
		this.adVatReg = adVatReg;
	}

	public String getAdCocReg() {
		return this.adCocReg;
	}

	public void setAdCocReg(String adCocReg) {
		this.adCocReg = adCocReg;
	}

	public String getAdGstId() {
		return this.adGstId;
	}

	public void setAdGstId(String adGstId) {
		this.adGstId = adGstId;
	}

	public String getAdTaxType() {
		return this.adTaxType;
	}

	public void setAdTaxType(String adTaxType) {
		this.adTaxType = adTaxType;
	}

	public String getAdTaxc() {
		return this.adTaxc;
	}

	public void setAdTaxc(String adTaxc) {
		this.adTaxc = adTaxc;
	}

	public Boolean getAdTaxable() {
		return this.adTaxable;
	}

	public void setAdTaxable(Boolean adTaxable) {
		this.adTaxable = adTaxable;
	}

	public Boolean getAdTaxIn() {
		return this.adTaxIn;
	}

	public void setAdTaxIn(Boolean adTaxIn) {
		this.adTaxIn = adTaxIn;
	}

	public String getAdConrep() {
		return this.adConrep;
	}

	public void setAdConrep(String adConrep) {
		this.adConrep = adConrep;
	}

	public String getAdEdiTpid() {
		return this.adEdiTpid;
	}

	public void setAdEdiTpid(String adEdiTpid) {
		this.adEdiTpid = adEdiTpid;
	}

	public String getAdEdiCtrl() {
		return this.adEdiCtrl;
	}

	public void setAdEdiCtrl(String adEdiCtrl) {
		this.adEdiCtrl = adEdiCtrl;
	}

	public String getAdTimezone() {
		return this.adTimezone;
	}

	public void setAdTimezone(String adTimezone) {
		this.adTimezone = adTimezone;
	}

	public String getAdUserid() {
		return this.adUserid;
	}

	public void setAdUserid(String adUserid) {
		this.adUserid = adUserid;
	}

	public Date getAdModDate() {
		return this.adModDate;
	}

	public void setAdModDate(Date adModDate) {
		this.adModDate = adModDate;
	}

	public String getAdEdiId() {
		return this.adEdiId;
	}

	public void setAdEdiId(String adEdiId) {
		this.adEdiId = adEdiId;
	}

	public String getAdBarlblPrt() {
		return this.adBarlblPrt;
	}

	public void setAdBarlblPrt(String adBarlblPrt) {
		this.adBarlblPrt = adBarlblPrt;
	}

	public String getAdBarlblVal() {
		return this.adBarlblVal;
	}

	public void setAdBarlblVal(String adBarlblVal) {
		this.adBarlblVal = adBarlblVal;
	}

	public String getAdCalendar() {
		return this.adCalendar;
	}

	public void setAdCalendar(String adCalendar) {
		this.adCalendar = adCalendar;
	}

	public String getAdEdiStd() {
		return this.adEdiStd;
	}

	public void setAdEdiStd(String adEdiStd) {
		this.adEdiStd = adEdiStd;
	}

	public String getAdEdiLevel() {
		return this.adEdiLevel;
	}

	public void setAdEdiLevel(String adEdiLevel) {
		this.adEdiLevel = adEdiLevel;
	}

	public String getAdQad01() {
		return this.adQad01;
	}

	public void setAdQad01(String adQad01) {
		this.adQad01 = adQad01;
	}

	public String getAdQad02() {
		return this.adQad02;
	}

	public void setAdQad02(String adQad02) {
		this.adQad02 = adQad02;
	}

	public String getAdQad03() {
		return this.adQad03;
	}

	public void setAdQad03(String adQad03) {
		this.adQad03 = adQad03;
	}

	public String getAdQad04() {
		return this.adQad04;
	}

	public void setAdQad04(String adQad04) {
		this.adQad04 = adQad04;
	}

	public String getAdQad05() {
		return this.adQad05;
	}

	public void setAdQad05(String adQad05) {
		this.adQad05 = adQad05;
	}

	public String getAdChr01() {
		return this.adChr01;
	}

	public void setAdChr01(String adChr01) {
		this.adChr01 = adChr01;
	}

	public String getAdChr02() {
		return this.adChr02;
	}

	public void setAdChr02(String adChr02) {
		this.adChr02 = adChr02;
	}

	public String getAdChr03() {
		return this.adChr03;
	}

	public void setAdChr03(String adChr03) {
		this.adChr03 = adChr03;
	}

	public String getAdChr04() {
		return this.adChr04;
	}

	public void setAdChr04(String adChr04) {
		this.adChr04 = adChr04;
	}

	public String getAdChr05() {
		return this.adChr05;
	}

	public void setAdChr05(String adChr05) {
		this.adChr05 = adChr05;
	}

	public String getAdTpLocCode() {
		return this.adTpLocCode;
	}

	public void setAdTpLocCode(String adTpLocCode) {
		this.adTpLocCode = adTpLocCode;
	}

	public String getAdCtry() {
		return this.adCtry;
	}

	public void setAdCtry(String adCtry) {
		this.adCtry = adCtry;
	}

	public String getAdTaxZone() {
		return this.adTaxZone;
	}

	public void setAdTaxZone(String adTaxZone) {
		this.adTaxZone = adTaxZone;
	}

	public String getAdTaxUsage() {
		return this.adTaxUsage;
	}

	public void setAdTaxUsage(String adTaxUsage) {
		this.adTaxUsage = adTaxUsage;
	}

	public String getAdMisc1Id() {
		return this.adMisc1Id;
	}

	public void setAdMisc1Id(String adMisc1Id) {
		this.adMisc1Id = adMisc1Id;
	}

	public String getAdMisc2Id() {
		return this.adMisc2Id;
	}

	public void setAdMisc2Id(String adMisc2Id) {
		this.adMisc2Id = adMisc2Id;
	}

	public String getAdMisc3Id() {
		return this.adMisc3Id;
	}

	public void setAdMisc3Id(String adMisc3Id) {
		this.adMisc3Id = adMisc3Id;
	}

	public Integer getAdWkOffset() {
		return this.adWkOffset;
	}

	public void setAdWkOffset(Integer adWkOffset) {
		this.adWkOffset = adWkOffset;
	}

	public String getAdInvMthd() {
		return this.adInvMthd;
	}

	public void setAdInvMthd(String adInvMthd) {
		this.adInvMthd = adInvMthd;
	}

	public String getAdSchMthd() {
		return this.adSchMthd;
	}

	public void setAdSchMthd(String adSchMthd) {
		this.adSchMthd = adSchMthd;
	}

	public String getAdPoMthd() {
		return this.adPoMthd;
	}

	public void setAdPoMthd(String adPoMthd) {
		this.adPoMthd = adPoMthd;
	}

	public String getAdAsnData() {
		return this.adAsnData;
	}

	public void setAdAsnData(String adAsnData) {
		this.adAsnData = adAsnData;
	}

	public String getAdIntrDivision() {
		return this.adIntrDivision;
	}

	public void setAdIntrDivision(String adIntrDivision) {
		this.adIntrDivision = adIntrDivision;
	}

	public Boolean getAdTaxReport() {
		return this.adTaxReport;
	}

	public void setAdTaxReport(Boolean adTaxReport) {
		this.adTaxReport = adTaxReport;
	}

	public String getAdNameControl() {
		return this.adNameControl;
	}

	public void setAdNameControl(String adNameControl) {
		this.adNameControl = adNameControl;
	}

	public Boolean getAdLastFile() {
		return this.adLastFile;
	}

	public void setAdLastFile(Boolean adLastFile) {
		this.adLastFile = adLastFile;
	}

	public Double getOidAdMstr() {
		return this.oidAdMstr;
	}

	public void setOidAdMstr(Double oidAdMstr) {
		this.oidAdMstr = oidAdMstr;
	}

}