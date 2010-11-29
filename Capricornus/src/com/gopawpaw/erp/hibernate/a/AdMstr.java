package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AdMstr entity. @author MyEclipse Persistence Tools
 */
public class AdMstr extends AbstractAdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AdMstr() {
	}

	/** minimal constructor */
	public AdMstr(AdMstrId id, String adIntrDivision, Boolean adTaxReport,
			String adNameControl, Boolean adLastFile, Double oidAdMstr) {
		super(id, adIntrDivision, adTaxReport, adNameControl, adLastFile,
				oidAdMstr);
	}

	/** full constructor */
	public AdMstr(AdMstrId id, String adName, String adLine1, String adLine2,
			String adCity, String adState, String adZip, String adType,
			String adAttn, String adPhone, String adExt, String adRef,
			String adSort, String adCountry, String adAttn2, String adPhone2,
			String adExt2, String adFax, String adFax2, String adLine3,
			String adUser1, String adUser2, String adLang, String adPstId,
			Date adDate, String adCounty, Boolean adTemp, String adBkAcct1,
			String adBkAcct2, Integer adFormat, String adVatReg,
			String adCocReg, String adGstId, String adTaxType, String adTaxc,
			Boolean adTaxable, Boolean adTaxIn, String adConrep,
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
		super(id, adName, adLine1, adLine2, adCity, adState, adZip, adType,
				adAttn, adPhone, adExt, adRef, adSort, adCountry, adAttn2,
				adPhone2, adExt2, adFax, adFax2, adLine3, adUser1, adUser2,
				adLang, adPstId, adDate, adCounty, adTemp, adBkAcct1,
				adBkAcct2, adFormat, adVatReg, adCocReg, adGstId, adTaxType,
				adTaxc, adTaxable, adTaxIn, adConrep, adEdiTpid, adEdiCtrl,
				adTimezone, adUserid, adModDate, adEdiId, adBarlblPrt,
				adBarlblVal, adCalendar, adEdiStd, adEdiLevel, adQad01,
				adQad02, adQad03, adQad04, adQad05, adChr01, adChr02, adChr03,
				adChr04, adChr05, adTpLocCode, adCtry, adTaxZone, adTaxUsage,
				adMisc1Id, adMisc2Id, adMisc3Id, adWkOffset, adInvMthd,
				adSchMthd, adPoMthd, adAsnData, adIntrDivision, adTaxReport,
				adNameControl, adLastFile, oidAdMstr);
	}

}
