package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIeMstr entity provides the base persistence definition of the IeMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIeMstr implements java.io.Serializable {

	// Fields

	private IeMstrId id;
	private Boolean ieInclMemo;
	private String ieModeTransp;
	private String ieNatTrans;
	private String iePortArrdisp;
	private String iePortTransh;
	private String ieStatProc;
	private String ieTermsDeliv;
	private String ieUserid;
	private Date ieModDate;
	private String ieRegion;
	private String ieCtryDesdisp;
	private String ieChr01;
	private String ieChr02;
	private String ieChr03;
	private String ieChr04;
	private String ieChr05;
	private Boolean ieLog01;
	private Boolean ieLog02;
	private String ieQadc01;
	private String ieQadc02;
	private String ieQadc03;
	private String ieQadc04;
	private String ieQadc05;
	private Boolean ieQadl01;
	private Boolean ieQadl02;
	private String ieUser1;
	private String ieUser2;
	private Boolean ieCorrection;
	private String ieOrigDoc;
	private Integer ieOrigYear;
	private Integer ieOrigMonth;
	private String ieAffiliation;
	private Double oidIeMstr;

	// Constructors

	/** default constructor */
	public AbstractIeMstr() {
	}

	/** minimal constructor */
	public AbstractIeMstr(IeMstrId id, Boolean ieCorrection, String ieOrigDoc,
			Integer ieOrigYear, Integer ieOrigMonth, String ieAffiliation,
			Double oidIeMstr) {
		this.id = id;
		this.ieCorrection = ieCorrection;
		this.ieOrigDoc = ieOrigDoc;
		this.ieOrigYear = ieOrigYear;
		this.ieOrigMonth = ieOrigMonth;
		this.ieAffiliation = ieAffiliation;
		this.oidIeMstr = oidIeMstr;
	}

	/** full constructor */
	public AbstractIeMstr(IeMstrId id, Boolean ieInclMemo, String ieModeTransp,
			String ieNatTrans, String iePortArrdisp, String iePortTransh,
			String ieStatProc, String ieTermsDeliv, String ieUserid,
			Date ieModDate, String ieRegion, String ieCtryDesdisp,
			String ieChr01, String ieChr02, String ieChr03, String ieChr04,
			String ieChr05, Boolean ieLog01, Boolean ieLog02, String ieQadc01,
			String ieQadc02, String ieQadc03, String ieQadc04, String ieQadc05,
			Boolean ieQadl01, Boolean ieQadl02, String ieUser1, String ieUser2,
			Boolean ieCorrection, String ieOrigDoc, Integer ieOrigYear,
			Integer ieOrigMonth, String ieAffiliation, Double oidIeMstr) {
		this.id = id;
		this.ieInclMemo = ieInclMemo;
		this.ieModeTransp = ieModeTransp;
		this.ieNatTrans = ieNatTrans;
		this.iePortArrdisp = iePortArrdisp;
		this.iePortTransh = iePortTransh;
		this.ieStatProc = ieStatProc;
		this.ieTermsDeliv = ieTermsDeliv;
		this.ieUserid = ieUserid;
		this.ieModDate = ieModDate;
		this.ieRegion = ieRegion;
		this.ieCtryDesdisp = ieCtryDesdisp;
		this.ieChr01 = ieChr01;
		this.ieChr02 = ieChr02;
		this.ieChr03 = ieChr03;
		this.ieChr04 = ieChr04;
		this.ieChr05 = ieChr05;
		this.ieLog01 = ieLog01;
		this.ieLog02 = ieLog02;
		this.ieQadc01 = ieQadc01;
		this.ieQadc02 = ieQadc02;
		this.ieQadc03 = ieQadc03;
		this.ieQadc04 = ieQadc04;
		this.ieQadc05 = ieQadc05;
		this.ieQadl01 = ieQadl01;
		this.ieQadl02 = ieQadl02;
		this.ieUser1 = ieUser1;
		this.ieUser2 = ieUser2;
		this.ieCorrection = ieCorrection;
		this.ieOrigDoc = ieOrigDoc;
		this.ieOrigYear = ieOrigYear;
		this.ieOrigMonth = ieOrigMonth;
		this.ieAffiliation = ieAffiliation;
		this.oidIeMstr = oidIeMstr;
	}

	// Property accessors

	public IeMstrId getId() {
		return this.id;
	}

	public void setId(IeMstrId id) {
		this.id = id;
	}

	public Boolean getIeInclMemo() {
		return this.ieInclMemo;
	}

	public void setIeInclMemo(Boolean ieInclMemo) {
		this.ieInclMemo = ieInclMemo;
	}

	public String getIeModeTransp() {
		return this.ieModeTransp;
	}

	public void setIeModeTransp(String ieModeTransp) {
		this.ieModeTransp = ieModeTransp;
	}

	public String getIeNatTrans() {
		return this.ieNatTrans;
	}

	public void setIeNatTrans(String ieNatTrans) {
		this.ieNatTrans = ieNatTrans;
	}

	public String getIePortArrdisp() {
		return this.iePortArrdisp;
	}

	public void setIePortArrdisp(String iePortArrdisp) {
		this.iePortArrdisp = iePortArrdisp;
	}

	public String getIePortTransh() {
		return this.iePortTransh;
	}

	public void setIePortTransh(String iePortTransh) {
		this.iePortTransh = iePortTransh;
	}

	public String getIeStatProc() {
		return this.ieStatProc;
	}

	public void setIeStatProc(String ieStatProc) {
		this.ieStatProc = ieStatProc;
	}

	public String getIeTermsDeliv() {
		return this.ieTermsDeliv;
	}

	public void setIeTermsDeliv(String ieTermsDeliv) {
		this.ieTermsDeliv = ieTermsDeliv;
	}

	public String getIeUserid() {
		return this.ieUserid;
	}

	public void setIeUserid(String ieUserid) {
		this.ieUserid = ieUserid;
	}

	public Date getIeModDate() {
		return this.ieModDate;
	}

	public void setIeModDate(Date ieModDate) {
		this.ieModDate = ieModDate;
	}

	public String getIeRegion() {
		return this.ieRegion;
	}

	public void setIeRegion(String ieRegion) {
		this.ieRegion = ieRegion;
	}

	public String getIeCtryDesdisp() {
		return this.ieCtryDesdisp;
	}

	public void setIeCtryDesdisp(String ieCtryDesdisp) {
		this.ieCtryDesdisp = ieCtryDesdisp;
	}

	public String getIeChr01() {
		return this.ieChr01;
	}

	public void setIeChr01(String ieChr01) {
		this.ieChr01 = ieChr01;
	}

	public String getIeChr02() {
		return this.ieChr02;
	}

	public void setIeChr02(String ieChr02) {
		this.ieChr02 = ieChr02;
	}

	public String getIeChr03() {
		return this.ieChr03;
	}

	public void setIeChr03(String ieChr03) {
		this.ieChr03 = ieChr03;
	}

	public String getIeChr04() {
		return this.ieChr04;
	}

	public void setIeChr04(String ieChr04) {
		this.ieChr04 = ieChr04;
	}

	public String getIeChr05() {
		return this.ieChr05;
	}

	public void setIeChr05(String ieChr05) {
		this.ieChr05 = ieChr05;
	}

	public Boolean getIeLog01() {
		return this.ieLog01;
	}

	public void setIeLog01(Boolean ieLog01) {
		this.ieLog01 = ieLog01;
	}

	public Boolean getIeLog02() {
		return this.ieLog02;
	}

	public void setIeLog02(Boolean ieLog02) {
		this.ieLog02 = ieLog02;
	}

	public String getIeQadc01() {
		return this.ieQadc01;
	}

	public void setIeQadc01(String ieQadc01) {
		this.ieQadc01 = ieQadc01;
	}

	public String getIeQadc02() {
		return this.ieQadc02;
	}

	public void setIeQadc02(String ieQadc02) {
		this.ieQadc02 = ieQadc02;
	}

	public String getIeQadc03() {
		return this.ieQadc03;
	}

	public void setIeQadc03(String ieQadc03) {
		this.ieQadc03 = ieQadc03;
	}

	public String getIeQadc04() {
		return this.ieQadc04;
	}

	public void setIeQadc04(String ieQadc04) {
		this.ieQadc04 = ieQadc04;
	}

	public String getIeQadc05() {
		return this.ieQadc05;
	}

	public void setIeQadc05(String ieQadc05) {
		this.ieQadc05 = ieQadc05;
	}

	public Boolean getIeQadl01() {
		return this.ieQadl01;
	}

	public void setIeQadl01(Boolean ieQadl01) {
		this.ieQadl01 = ieQadl01;
	}

	public Boolean getIeQadl02() {
		return this.ieQadl02;
	}

	public void setIeQadl02(Boolean ieQadl02) {
		this.ieQadl02 = ieQadl02;
	}

	public String getIeUser1() {
		return this.ieUser1;
	}

	public void setIeUser1(String ieUser1) {
		this.ieUser1 = ieUser1;
	}

	public String getIeUser2() {
		return this.ieUser2;
	}

	public void setIeUser2(String ieUser2) {
		this.ieUser2 = ieUser2;
	}

	public Boolean getIeCorrection() {
		return this.ieCorrection;
	}

	public void setIeCorrection(Boolean ieCorrection) {
		this.ieCorrection = ieCorrection;
	}

	public String getIeOrigDoc() {
		return this.ieOrigDoc;
	}

	public void setIeOrigDoc(String ieOrigDoc) {
		this.ieOrigDoc = ieOrigDoc;
	}

	public Integer getIeOrigYear() {
		return this.ieOrigYear;
	}

	public void setIeOrigYear(Integer ieOrigYear) {
		this.ieOrigYear = ieOrigYear;
	}

	public Integer getIeOrigMonth() {
		return this.ieOrigMonth;
	}

	public void setIeOrigMonth(Integer ieOrigMonth) {
		this.ieOrigMonth = ieOrigMonth;
	}

	public String getIeAffiliation() {
		return this.ieAffiliation;
	}

	public void setIeAffiliation(String ieAffiliation) {
		this.ieAffiliation = ieAffiliation;
	}

	public Double getOidIeMstr() {
		return this.oidIeMstr;
	}

	public void setOidIeMstr(Double oidIeMstr) {
		this.oidIeMstr = oidIeMstr;
	}

}