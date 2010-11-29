package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EmpMstr entity. @author MyEclipse Persistence Tools
 */
public class EmpMstr extends AbstractEmpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmpMstr() {
	}

	/** minimal constructor */
	public EmpMstr(EmpMstrId id, String empCtry, Double oidEmpMstr) {
		super(id, empCtry, oidEmpMstr);
	}

	/** full constructor */
	public EmpMstr(EmpMstrId id, String empLname, String empFname,
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
		super(id, empLname, empFname, empLine1, empLine2, empCity, empState,
				empZip, empCountry, empPhone, empBsPhone, empExt, empSsn,
				empBirthday, empEmpDate, empTrmDate, empStatus, empFreq,
				empPayType, empPayRate, empMarital, empExempt, empWkLoc,
				empQad01, empQad02, empProject, empDept, empUnits, empSickHrs,
				empVacHrs, empTitle, empWcClass, empLastPay, empLastDt,
				empLine3, empUser1, empUser2, empUser3, empUser4, empUser5,
				empUser6, empBank, empAdBank, empAdAcc1, empAdAmt1, empAdPct1,
				empAdAcc2, empAdAmt2, empAdPct2, empChr01, empChr02, empChr03,
				empChr04, empChr05, empDte01, empDte02, empDte03, empDte04,
				empDte05, empDec01, empDec02, empLog01, empLog02, empAdBank2,
				empTransit1, empTransit2, empAdType1, empAdType2, empShift,
				empUserid, empModDate, empCtry, oidEmpMstr);
	}

}
