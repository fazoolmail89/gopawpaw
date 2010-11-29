package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEmpMstr entity provides the base persistence definition of the
 * EmpMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmpMstr implements java.io.Serializable {

	// Fields

	private EmpMstrId id;
	private String empLname;
	private String empFname;
	private String empLine1;
	private String empLine2;
	private String empCity;
	private String empState;
	private String empZip;
	private String empCountry;
	private String empPhone;
	private String empBsPhone;
	private String empExt;
	private String empSsn;
	private Date empBirthday;
	private Date empEmpDate;
	private Date empTrmDate;
	private String empStatus;
	private String empFreq;
	private String empPayType;
	private Double empPayRate;
	private String empMarital;
	private Integer empExempt;
	private String empWkLoc;
	private String empQad01;
	private String empQad02;
	private String empProject;
	private String empDept;
	private Double empUnits;
	private Double empSickHrs;
	private Double empVacHrs;
	private String empTitle;
	private String empWcClass;
	private Double empLastPay;
	private Date empLastDt;
	private String empLine3;
	private String empUser1;
	private String empUser2;
	private String empUser3;
	private Double empUser4;
	private Double empUser5;
	private Date empUser6;
	private String empBank;
	private String empAdBank;
	private String empAdAcc1;
	private Double empAdAmt1;
	private Double empAdPct1;
	private String empAdAcc2;
	private Double empAdAmt2;
	private Double empAdPct2;
	private String empChr01;
	private String empChr02;
	private String empChr03;
	private String empChr04;
	private String empChr05;
	private Date empDte01;
	private Date empDte02;
	private Date empDte03;
	private Date empDte04;
	private Date empDte05;
	private Double empDec01;
	private Double empDec02;
	private Boolean empLog01;
	private Boolean empLog02;
	private String empAdBank2;
	private String empTransit1;
	private String empTransit2;
	private String empAdType1;
	private String empAdType2;
	private String empShift;
	private String empUserid;
	private Date empModDate;
	private String empCtry;
	private Double oidEmpMstr;

	// Constructors

	/** default constructor */
	public AbstractEmpMstr() {
	}

	/** minimal constructor */
	public AbstractEmpMstr(EmpMstrId id, String empCtry, Double oidEmpMstr) {
		this.id = id;
		this.empCtry = empCtry;
		this.oidEmpMstr = oidEmpMstr;
	}

	/** full constructor */
	public AbstractEmpMstr(EmpMstrId id, String empLname, String empFname,
			String empLine1, String empLine2, String empCity, String empState,
			String empZip, String empCountry, String empPhone,
			String empBsPhone, String empExt, String empSsn, Date empBirthday,
			Date empEmpDate, Date empTrmDate, String empStatus, String empFreq,
			String empPayType, Double empPayRate, String empMarital,
			Integer empExempt, String empWkLoc, String empQad01,
			String empQad02, String empProject, String empDept,
			Double empUnits, Double empSickHrs, Double empVacHrs,
			String empTitle, String empWcClass, Double empLastPay,
			Date empLastDt, String empLine3, String empUser1, String empUser2,
			String empUser3, Double empUser4, Double empUser5, Date empUser6,
			String empBank, String empAdBank, String empAdAcc1,
			Double empAdAmt1, Double empAdPct1, String empAdAcc2,
			Double empAdAmt2, Double empAdPct2, String empChr01,
			String empChr02, String empChr03, String empChr04, String empChr05,
			Date empDte01, Date empDte02, Date empDte03, Date empDte04,
			Date empDte05, Double empDec01, Double empDec02, Boolean empLog01,
			Boolean empLog02, String empAdBank2, String empTransit1,
			String empTransit2, String empAdType1, String empAdType2,
			String empShift, String empUserid, Date empModDate, String empCtry,
			Double oidEmpMstr) {
		this.id = id;
		this.empLname = empLname;
		this.empFname = empFname;
		this.empLine1 = empLine1;
		this.empLine2 = empLine2;
		this.empCity = empCity;
		this.empState = empState;
		this.empZip = empZip;
		this.empCountry = empCountry;
		this.empPhone = empPhone;
		this.empBsPhone = empBsPhone;
		this.empExt = empExt;
		this.empSsn = empSsn;
		this.empBirthday = empBirthday;
		this.empEmpDate = empEmpDate;
		this.empTrmDate = empTrmDate;
		this.empStatus = empStatus;
		this.empFreq = empFreq;
		this.empPayType = empPayType;
		this.empPayRate = empPayRate;
		this.empMarital = empMarital;
		this.empExempt = empExempt;
		this.empWkLoc = empWkLoc;
		this.empQad01 = empQad01;
		this.empQad02 = empQad02;
		this.empProject = empProject;
		this.empDept = empDept;
		this.empUnits = empUnits;
		this.empSickHrs = empSickHrs;
		this.empVacHrs = empVacHrs;
		this.empTitle = empTitle;
		this.empWcClass = empWcClass;
		this.empLastPay = empLastPay;
		this.empLastDt = empLastDt;
		this.empLine3 = empLine3;
		this.empUser1 = empUser1;
		this.empUser2 = empUser2;
		this.empUser3 = empUser3;
		this.empUser4 = empUser4;
		this.empUser5 = empUser5;
		this.empUser6 = empUser6;
		this.empBank = empBank;
		this.empAdBank = empAdBank;
		this.empAdAcc1 = empAdAcc1;
		this.empAdAmt1 = empAdAmt1;
		this.empAdPct1 = empAdPct1;
		this.empAdAcc2 = empAdAcc2;
		this.empAdAmt2 = empAdAmt2;
		this.empAdPct2 = empAdPct2;
		this.empChr01 = empChr01;
		this.empChr02 = empChr02;
		this.empChr03 = empChr03;
		this.empChr04 = empChr04;
		this.empChr05 = empChr05;
		this.empDte01 = empDte01;
		this.empDte02 = empDte02;
		this.empDte03 = empDte03;
		this.empDte04 = empDte04;
		this.empDte05 = empDte05;
		this.empDec01 = empDec01;
		this.empDec02 = empDec02;
		this.empLog01 = empLog01;
		this.empLog02 = empLog02;
		this.empAdBank2 = empAdBank2;
		this.empTransit1 = empTransit1;
		this.empTransit2 = empTransit2;
		this.empAdType1 = empAdType1;
		this.empAdType2 = empAdType2;
		this.empShift = empShift;
		this.empUserid = empUserid;
		this.empModDate = empModDate;
		this.empCtry = empCtry;
		this.oidEmpMstr = oidEmpMstr;
	}

	// Property accessors

	public EmpMstrId getId() {
		return this.id;
	}

	public void setId(EmpMstrId id) {
		this.id = id;
	}

	public String getEmpLname() {
		return this.empLname;
	}

	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}

	public String getEmpFname() {
		return this.empFname;
	}

	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}

	public String getEmpLine1() {
		return this.empLine1;
	}

	public void setEmpLine1(String empLine1) {
		this.empLine1 = empLine1;
	}

	public String getEmpLine2() {
		return this.empLine2;
	}

	public void setEmpLine2(String empLine2) {
		this.empLine2 = empLine2;
	}

	public String getEmpCity() {
		return this.empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpState() {
		return this.empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public String getEmpZip() {
		return this.empZip;
	}

	public void setEmpZip(String empZip) {
		this.empZip = empZip;
	}

	public String getEmpCountry() {
		return this.empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}

	public String getEmpPhone() {
		return this.empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpBsPhone() {
		return this.empBsPhone;
	}

	public void setEmpBsPhone(String empBsPhone) {
		this.empBsPhone = empBsPhone;
	}

	public String getEmpExt() {
		return this.empExt;
	}

	public void setEmpExt(String empExt) {
		this.empExt = empExt;
	}

	public String getEmpSsn() {
		return this.empSsn;
	}

	public void setEmpSsn(String empSsn) {
		this.empSsn = empSsn;
	}

	public Date getEmpBirthday() {
		return this.empBirthday;
	}

	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}

	public Date getEmpEmpDate() {
		return this.empEmpDate;
	}

	public void setEmpEmpDate(Date empEmpDate) {
		this.empEmpDate = empEmpDate;
	}

	public Date getEmpTrmDate() {
		return this.empTrmDate;
	}

	public void setEmpTrmDate(Date empTrmDate) {
		this.empTrmDate = empTrmDate;
	}

	public String getEmpStatus() {
		return this.empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmpFreq() {
		return this.empFreq;
	}

	public void setEmpFreq(String empFreq) {
		this.empFreq = empFreq;
	}

	public String getEmpPayType() {
		return this.empPayType;
	}

	public void setEmpPayType(String empPayType) {
		this.empPayType = empPayType;
	}

	public Double getEmpPayRate() {
		return this.empPayRate;
	}

	public void setEmpPayRate(Double empPayRate) {
		this.empPayRate = empPayRate;
	}

	public String getEmpMarital() {
		return this.empMarital;
	}

	public void setEmpMarital(String empMarital) {
		this.empMarital = empMarital;
	}

	public Integer getEmpExempt() {
		return this.empExempt;
	}

	public void setEmpExempt(Integer empExempt) {
		this.empExempt = empExempt;
	}

	public String getEmpWkLoc() {
		return this.empWkLoc;
	}

	public void setEmpWkLoc(String empWkLoc) {
		this.empWkLoc = empWkLoc;
	}

	public String getEmpQad01() {
		return this.empQad01;
	}

	public void setEmpQad01(String empQad01) {
		this.empQad01 = empQad01;
	}

	public String getEmpQad02() {
		return this.empQad02;
	}

	public void setEmpQad02(String empQad02) {
		this.empQad02 = empQad02;
	}

	public String getEmpProject() {
		return this.empProject;
	}

	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}

	public String getEmpDept() {
		return this.empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Double getEmpUnits() {
		return this.empUnits;
	}

	public void setEmpUnits(Double empUnits) {
		this.empUnits = empUnits;
	}

	public Double getEmpSickHrs() {
		return this.empSickHrs;
	}

	public void setEmpSickHrs(Double empSickHrs) {
		this.empSickHrs = empSickHrs;
	}

	public Double getEmpVacHrs() {
		return this.empVacHrs;
	}

	public void setEmpVacHrs(Double empVacHrs) {
		this.empVacHrs = empVacHrs;
	}

	public String getEmpTitle() {
		return this.empTitle;
	}

	public void setEmpTitle(String empTitle) {
		this.empTitle = empTitle;
	}

	public String getEmpWcClass() {
		return this.empWcClass;
	}

	public void setEmpWcClass(String empWcClass) {
		this.empWcClass = empWcClass;
	}

	public Double getEmpLastPay() {
		return this.empLastPay;
	}

	public void setEmpLastPay(Double empLastPay) {
		this.empLastPay = empLastPay;
	}

	public Date getEmpLastDt() {
		return this.empLastDt;
	}

	public void setEmpLastDt(Date empLastDt) {
		this.empLastDt = empLastDt;
	}

	public String getEmpLine3() {
		return this.empLine3;
	}

	public void setEmpLine3(String empLine3) {
		this.empLine3 = empLine3;
	}

	public String getEmpUser1() {
		return this.empUser1;
	}

	public void setEmpUser1(String empUser1) {
		this.empUser1 = empUser1;
	}

	public String getEmpUser2() {
		return this.empUser2;
	}

	public void setEmpUser2(String empUser2) {
		this.empUser2 = empUser2;
	}

	public String getEmpUser3() {
		return this.empUser3;
	}

	public void setEmpUser3(String empUser3) {
		this.empUser3 = empUser3;
	}

	public Double getEmpUser4() {
		return this.empUser4;
	}

	public void setEmpUser4(Double empUser4) {
		this.empUser4 = empUser4;
	}

	public Double getEmpUser5() {
		return this.empUser5;
	}

	public void setEmpUser5(Double empUser5) {
		this.empUser5 = empUser5;
	}

	public Date getEmpUser6() {
		return this.empUser6;
	}

	public void setEmpUser6(Date empUser6) {
		this.empUser6 = empUser6;
	}

	public String getEmpBank() {
		return this.empBank;
	}

	public void setEmpBank(String empBank) {
		this.empBank = empBank;
	}

	public String getEmpAdBank() {
		return this.empAdBank;
	}

	public void setEmpAdBank(String empAdBank) {
		this.empAdBank = empAdBank;
	}

	public String getEmpAdAcc1() {
		return this.empAdAcc1;
	}

	public void setEmpAdAcc1(String empAdAcc1) {
		this.empAdAcc1 = empAdAcc1;
	}

	public Double getEmpAdAmt1() {
		return this.empAdAmt1;
	}

	public void setEmpAdAmt1(Double empAdAmt1) {
		this.empAdAmt1 = empAdAmt1;
	}

	public Double getEmpAdPct1() {
		return this.empAdPct1;
	}

	public void setEmpAdPct1(Double empAdPct1) {
		this.empAdPct1 = empAdPct1;
	}

	public String getEmpAdAcc2() {
		return this.empAdAcc2;
	}

	public void setEmpAdAcc2(String empAdAcc2) {
		this.empAdAcc2 = empAdAcc2;
	}

	public Double getEmpAdAmt2() {
		return this.empAdAmt2;
	}

	public void setEmpAdAmt2(Double empAdAmt2) {
		this.empAdAmt2 = empAdAmt2;
	}

	public Double getEmpAdPct2() {
		return this.empAdPct2;
	}

	public void setEmpAdPct2(Double empAdPct2) {
		this.empAdPct2 = empAdPct2;
	}

	public String getEmpChr01() {
		return this.empChr01;
	}

	public void setEmpChr01(String empChr01) {
		this.empChr01 = empChr01;
	}

	public String getEmpChr02() {
		return this.empChr02;
	}

	public void setEmpChr02(String empChr02) {
		this.empChr02 = empChr02;
	}

	public String getEmpChr03() {
		return this.empChr03;
	}

	public void setEmpChr03(String empChr03) {
		this.empChr03 = empChr03;
	}

	public String getEmpChr04() {
		return this.empChr04;
	}

	public void setEmpChr04(String empChr04) {
		this.empChr04 = empChr04;
	}

	public String getEmpChr05() {
		return this.empChr05;
	}

	public void setEmpChr05(String empChr05) {
		this.empChr05 = empChr05;
	}

	public Date getEmpDte01() {
		return this.empDte01;
	}

	public void setEmpDte01(Date empDte01) {
		this.empDte01 = empDte01;
	}

	public Date getEmpDte02() {
		return this.empDte02;
	}

	public void setEmpDte02(Date empDte02) {
		this.empDte02 = empDte02;
	}

	public Date getEmpDte03() {
		return this.empDte03;
	}

	public void setEmpDte03(Date empDte03) {
		this.empDte03 = empDte03;
	}

	public Date getEmpDte04() {
		return this.empDte04;
	}

	public void setEmpDte04(Date empDte04) {
		this.empDte04 = empDte04;
	}

	public Date getEmpDte05() {
		return this.empDte05;
	}

	public void setEmpDte05(Date empDte05) {
		this.empDte05 = empDte05;
	}

	public Double getEmpDec01() {
		return this.empDec01;
	}

	public void setEmpDec01(Double empDec01) {
		this.empDec01 = empDec01;
	}

	public Double getEmpDec02() {
		return this.empDec02;
	}

	public void setEmpDec02(Double empDec02) {
		this.empDec02 = empDec02;
	}

	public Boolean getEmpLog01() {
		return this.empLog01;
	}

	public void setEmpLog01(Boolean empLog01) {
		this.empLog01 = empLog01;
	}

	public Boolean getEmpLog02() {
		return this.empLog02;
	}

	public void setEmpLog02(Boolean empLog02) {
		this.empLog02 = empLog02;
	}

	public String getEmpAdBank2() {
		return this.empAdBank2;
	}

	public void setEmpAdBank2(String empAdBank2) {
		this.empAdBank2 = empAdBank2;
	}

	public String getEmpTransit1() {
		return this.empTransit1;
	}

	public void setEmpTransit1(String empTransit1) {
		this.empTransit1 = empTransit1;
	}

	public String getEmpTransit2() {
		return this.empTransit2;
	}

	public void setEmpTransit2(String empTransit2) {
		this.empTransit2 = empTransit2;
	}

	public String getEmpAdType1() {
		return this.empAdType1;
	}

	public void setEmpAdType1(String empAdType1) {
		this.empAdType1 = empAdType1;
	}

	public String getEmpAdType2() {
		return this.empAdType2;
	}

	public void setEmpAdType2(String empAdType2) {
		this.empAdType2 = empAdType2;
	}

	public String getEmpShift() {
		return this.empShift;
	}

	public void setEmpShift(String empShift) {
		this.empShift = empShift;
	}

	public String getEmpUserid() {
		return this.empUserid;
	}

	public void setEmpUserid(String empUserid) {
		this.empUserid = empUserid;
	}

	public Date getEmpModDate() {
		return this.empModDate;
	}

	public void setEmpModDate(Date empModDate) {
		this.empModDate = empModDate;
	}

	public String getEmpCtry() {
		return this.empCtry;
	}

	public void setEmpCtry(String empCtry) {
		this.empCtry = empCtry;
	}

	public Double getOidEmpMstr() {
		return this.oidEmpMstr;
	}

	public void setOidEmpMstr(Double oidEmpMstr) {
		this.oidEmpMstr = oidEmpMstr;
	}

}