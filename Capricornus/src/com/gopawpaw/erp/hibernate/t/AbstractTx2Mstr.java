package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTx2Mstr entity provides the base persistence definition of the
 * Tx2Mstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTx2Mstr implements java.io.Serializable {

	// Fields

	private Tx2MstrId id;
	private Double tx2TaxPct;
	private String tx2Qadc01;
	private String tx2Qadc02;
	private Boolean tx2TrlTaxable;
	private String tx2User1;
	private String tx2User2;
	private Date tx2Effdate;
	private Double tx2Max;
	private String tx2Userid;
	private Date tx2ModDate;
	private String tx2TaxType;
	private String tx2Method;
	private String tx2PtTaxc;
	private String tx2TaxUsage;
	private String tx2Desc;
	private Double tx2Min;
	private String tx2Base;
	private Double tx2PctRecv;
	private String tx2Qad01;
	private String tx2Qad02;
	private Boolean tx2Qad03;
	private Boolean tx2ByLine;
	private Integer tx2Cmtindx;
	private String tx2Chr01;
	private String tx2Chr02;
	private Double tx2Dec01;
	private Double tx2Dec02;
	private String tx2Curr;
	private Double tx2Qad04;
	private Date tx2Qad05;
	private Boolean tx2Log01;
	private Date tx2Dte01;
	private Boolean tx2InvDisc;
	private Boolean tx2PmtDisc;
	private Boolean tx2UpdateTax;
	private Boolean tx2RcptTaxPoint;
	private String tx2ArAcct;
	private String tx2ArCc;
	private String tx2AraAcct;
	private String tx2AraCc;
	private Boolean tx2AraUse;
	private String tx2ApAcct;
	private String tx2ApCc;
	private String tx2AprAcct;
	private String tx2AprCc;
	private Boolean tx2AprUse;
	private Boolean tx2TaxIn;
	private Date tx2ExpDate;
	private Boolean tx2EcSalesList;
	private Boolean tx2EcProcessWork;
	private String tx2AprSub;
	private String tx2ApSub;
	private String tx2AraSub;
	private String tx2ArSub;
	private String tx2ApDiscAcct;
	private String tx2ApDiscCc;
	private String tx2ApDiscSub;
	private String tx2ArDiscAcct;
	private String tx2ArDiscCc;
	private String tx2ArDiscSub;
	private String tx2Group;
	private String tx2StxAcct;
	private String tx2StxCc;
	private String tx2StxSub;
	private String tx2Register;
	private Boolean tx2UsageTaxPoint;
	private Double oidTx2Mstr;

	// Constructors

	/** default constructor */
	public AbstractTx2Mstr() {
	}

	/** minimal constructor */
	public AbstractTx2Mstr(Tx2MstrId id, Double tx2TaxPct,
			Boolean tx2TrlTaxable, Date tx2Effdate, Double tx2Max,
			String tx2TaxType, String tx2Method, String tx2PtTaxc,
			String tx2TaxUsage, Double tx2Min, String tx2Base,
			Boolean tx2ByLine, Boolean tx2InvDisc, Boolean tx2PmtDisc,
			Boolean tx2UpdateTax, Boolean tx2RcptTaxPoint, String tx2ArAcct,
			String tx2ArCc, String tx2AraAcct, String tx2AraCc,
			Boolean tx2AraUse, String tx2ApAcct, String tx2ApCc,
			String tx2AprAcct, String tx2AprCc, Boolean tx2AprUse,
			Boolean tx2TaxIn, Boolean tx2EcSalesList, Boolean tx2EcProcessWork,
			String tx2ApDiscAcct, String tx2ApDiscCc, String tx2ApDiscSub,
			String tx2ArDiscAcct, String tx2ArDiscCc, String tx2ArDiscSub,
			String tx2Group, String tx2StxAcct, String tx2StxCc,
			String tx2StxSub, String tx2Register, Boolean tx2UsageTaxPoint,
			Double oidTx2Mstr) {
		this.id = id;
		this.tx2TaxPct = tx2TaxPct;
		this.tx2TrlTaxable = tx2TrlTaxable;
		this.tx2Effdate = tx2Effdate;
		this.tx2Max = tx2Max;
		this.tx2TaxType = tx2TaxType;
		this.tx2Method = tx2Method;
		this.tx2PtTaxc = tx2PtTaxc;
		this.tx2TaxUsage = tx2TaxUsage;
		this.tx2Min = tx2Min;
		this.tx2Base = tx2Base;
		this.tx2ByLine = tx2ByLine;
		this.tx2InvDisc = tx2InvDisc;
		this.tx2PmtDisc = tx2PmtDisc;
		this.tx2UpdateTax = tx2UpdateTax;
		this.tx2RcptTaxPoint = tx2RcptTaxPoint;
		this.tx2ArAcct = tx2ArAcct;
		this.tx2ArCc = tx2ArCc;
		this.tx2AraAcct = tx2AraAcct;
		this.tx2AraCc = tx2AraCc;
		this.tx2AraUse = tx2AraUse;
		this.tx2ApAcct = tx2ApAcct;
		this.tx2ApCc = tx2ApCc;
		this.tx2AprAcct = tx2AprAcct;
		this.tx2AprCc = tx2AprCc;
		this.tx2AprUse = tx2AprUse;
		this.tx2TaxIn = tx2TaxIn;
		this.tx2EcSalesList = tx2EcSalesList;
		this.tx2EcProcessWork = tx2EcProcessWork;
		this.tx2ApDiscAcct = tx2ApDiscAcct;
		this.tx2ApDiscCc = tx2ApDiscCc;
		this.tx2ApDiscSub = tx2ApDiscSub;
		this.tx2ArDiscAcct = tx2ArDiscAcct;
		this.tx2ArDiscCc = tx2ArDiscCc;
		this.tx2ArDiscSub = tx2ArDiscSub;
		this.tx2Group = tx2Group;
		this.tx2StxAcct = tx2StxAcct;
		this.tx2StxCc = tx2StxCc;
		this.tx2StxSub = tx2StxSub;
		this.tx2Register = tx2Register;
		this.tx2UsageTaxPoint = tx2UsageTaxPoint;
		this.oidTx2Mstr = oidTx2Mstr;
	}

	/** full constructor */
	public AbstractTx2Mstr(Tx2MstrId id, Double tx2TaxPct, String tx2Qadc01,
			String tx2Qadc02, Boolean tx2TrlTaxable, String tx2User1,
			String tx2User2, Date tx2Effdate, Double tx2Max, String tx2Userid,
			Date tx2ModDate, String tx2TaxType, String tx2Method,
			String tx2PtTaxc, String tx2TaxUsage, String tx2Desc,
			Double tx2Min, String tx2Base, Double tx2PctRecv, String tx2Qad01,
			String tx2Qad02, Boolean tx2Qad03, Boolean tx2ByLine,
			Integer tx2Cmtindx, String tx2Chr01, String tx2Chr02,
			Double tx2Dec01, Double tx2Dec02, String tx2Curr, Double tx2Qad04,
			Date tx2Qad05, Boolean tx2Log01, Date tx2Dte01, Boolean tx2InvDisc,
			Boolean tx2PmtDisc, Boolean tx2UpdateTax, Boolean tx2RcptTaxPoint,
			String tx2ArAcct, String tx2ArCc, String tx2AraAcct,
			String tx2AraCc, Boolean tx2AraUse, String tx2ApAcct,
			String tx2ApCc, String tx2AprAcct, String tx2AprCc,
			Boolean tx2AprUse, Boolean tx2TaxIn, Date tx2ExpDate,
			Boolean tx2EcSalesList, Boolean tx2EcProcessWork, String tx2AprSub,
			String tx2ApSub, String tx2AraSub, String tx2ArSub,
			String tx2ApDiscAcct, String tx2ApDiscCc, String tx2ApDiscSub,
			String tx2ArDiscAcct, String tx2ArDiscCc, String tx2ArDiscSub,
			String tx2Group, String tx2StxAcct, String tx2StxCc,
			String tx2StxSub, String tx2Register, Boolean tx2UsageTaxPoint,
			Double oidTx2Mstr) {
		this.id = id;
		this.tx2TaxPct = tx2TaxPct;
		this.tx2Qadc01 = tx2Qadc01;
		this.tx2Qadc02 = tx2Qadc02;
		this.tx2TrlTaxable = tx2TrlTaxable;
		this.tx2User1 = tx2User1;
		this.tx2User2 = tx2User2;
		this.tx2Effdate = tx2Effdate;
		this.tx2Max = tx2Max;
		this.tx2Userid = tx2Userid;
		this.tx2ModDate = tx2ModDate;
		this.tx2TaxType = tx2TaxType;
		this.tx2Method = tx2Method;
		this.tx2PtTaxc = tx2PtTaxc;
		this.tx2TaxUsage = tx2TaxUsage;
		this.tx2Desc = tx2Desc;
		this.tx2Min = tx2Min;
		this.tx2Base = tx2Base;
		this.tx2PctRecv = tx2PctRecv;
		this.tx2Qad01 = tx2Qad01;
		this.tx2Qad02 = tx2Qad02;
		this.tx2Qad03 = tx2Qad03;
		this.tx2ByLine = tx2ByLine;
		this.tx2Cmtindx = tx2Cmtindx;
		this.tx2Chr01 = tx2Chr01;
		this.tx2Chr02 = tx2Chr02;
		this.tx2Dec01 = tx2Dec01;
		this.tx2Dec02 = tx2Dec02;
		this.tx2Curr = tx2Curr;
		this.tx2Qad04 = tx2Qad04;
		this.tx2Qad05 = tx2Qad05;
		this.tx2Log01 = tx2Log01;
		this.tx2Dte01 = tx2Dte01;
		this.tx2InvDisc = tx2InvDisc;
		this.tx2PmtDisc = tx2PmtDisc;
		this.tx2UpdateTax = tx2UpdateTax;
		this.tx2RcptTaxPoint = tx2RcptTaxPoint;
		this.tx2ArAcct = tx2ArAcct;
		this.tx2ArCc = tx2ArCc;
		this.tx2AraAcct = tx2AraAcct;
		this.tx2AraCc = tx2AraCc;
		this.tx2AraUse = tx2AraUse;
		this.tx2ApAcct = tx2ApAcct;
		this.tx2ApCc = tx2ApCc;
		this.tx2AprAcct = tx2AprAcct;
		this.tx2AprCc = tx2AprCc;
		this.tx2AprUse = tx2AprUse;
		this.tx2TaxIn = tx2TaxIn;
		this.tx2ExpDate = tx2ExpDate;
		this.tx2EcSalesList = tx2EcSalesList;
		this.tx2EcProcessWork = tx2EcProcessWork;
		this.tx2AprSub = tx2AprSub;
		this.tx2ApSub = tx2ApSub;
		this.tx2AraSub = tx2AraSub;
		this.tx2ArSub = tx2ArSub;
		this.tx2ApDiscAcct = tx2ApDiscAcct;
		this.tx2ApDiscCc = tx2ApDiscCc;
		this.tx2ApDiscSub = tx2ApDiscSub;
		this.tx2ArDiscAcct = tx2ArDiscAcct;
		this.tx2ArDiscCc = tx2ArDiscCc;
		this.tx2ArDiscSub = tx2ArDiscSub;
		this.tx2Group = tx2Group;
		this.tx2StxAcct = tx2StxAcct;
		this.tx2StxCc = tx2StxCc;
		this.tx2StxSub = tx2StxSub;
		this.tx2Register = tx2Register;
		this.tx2UsageTaxPoint = tx2UsageTaxPoint;
		this.oidTx2Mstr = oidTx2Mstr;
	}

	// Property accessors

	public Tx2MstrId getId() {
		return this.id;
	}

	public void setId(Tx2MstrId id) {
		this.id = id;
	}

	public Double getTx2TaxPct() {
		return this.tx2TaxPct;
	}

	public void setTx2TaxPct(Double tx2TaxPct) {
		this.tx2TaxPct = tx2TaxPct;
	}

	public String getTx2Qadc01() {
		return this.tx2Qadc01;
	}

	public void setTx2Qadc01(String tx2Qadc01) {
		this.tx2Qadc01 = tx2Qadc01;
	}

	public String getTx2Qadc02() {
		return this.tx2Qadc02;
	}

	public void setTx2Qadc02(String tx2Qadc02) {
		this.tx2Qadc02 = tx2Qadc02;
	}

	public Boolean getTx2TrlTaxable() {
		return this.tx2TrlTaxable;
	}

	public void setTx2TrlTaxable(Boolean tx2TrlTaxable) {
		this.tx2TrlTaxable = tx2TrlTaxable;
	}

	public String getTx2User1() {
		return this.tx2User1;
	}

	public void setTx2User1(String tx2User1) {
		this.tx2User1 = tx2User1;
	}

	public String getTx2User2() {
		return this.tx2User2;
	}

	public void setTx2User2(String tx2User2) {
		this.tx2User2 = tx2User2;
	}

	public Date getTx2Effdate() {
		return this.tx2Effdate;
	}

	public void setTx2Effdate(Date tx2Effdate) {
		this.tx2Effdate = tx2Effdate;
	}

	public Double getTx2Max() {
		return this.tx2Max;
	}

	public void setTx2Max(Double tx2Max) {
		this.tx2Max = tx2Max;
	}

	public String getTx2Userid() {
		return this.tx2Userid;
	}

	public void setTx2Userid(String tx2Userid) {
		this.tx2Userid = tx2Userid;
	}

	public Date getTx2ModDate() {
		return this.tx2ModDate;
	}

	public void setTx2ModDate(Date tx2ModDate) {
		this.tx2ModDate = tx2ModDate;
	}

	public String getTx2TaxType() {
		return this.tx2TaxType;
	}

	public void setTx2TaxType(String tx2TaxType) {
		this.tx2TaxType = tx2TaxType;
	}

	public String getTx2Method() {
		return this.tx2Method;
	}

	public void setTx2Method(String tx2Method) {
		this.tx2Method = tx2Method;
	}

	public String getTx2PtTaxc() {
		return this.tx2PtTaxc;
	}

	public void setTx2PtTaxc(String tx2PtTaxc) {
		this.tx2PtTaxc = tx2PtTaxc;
	}

	public String getTx2TaxUsage() {
		return this.tx2TaxUsage;
	}

	public void setTx2TaxUsage(String tx2TaxUsage) {
		this.tx2TaxUsage = tx2TaxUsage;
	}

	public String getTx2Desc() {
		return this.tx2Desc;
	}

	public void setTx2Desc(String tx2Desc) {
		this.tx2Desc = tx2Desc;
	}

	public Double getTx2Min() {
		return this.tx2Min;
	}

	public void setTx2Min(Double tx2Min) {
		this.tx2Min = tx2Min;
	}

	public String getTx2Base() {
		return this.tx2Base;
	}

	public void setTx2Base(String tx2Base) {
		this.tx2Base = tx2Base;
	}

	public Double getTx2PctRecv() {
		return this.tx2PctRecv;
	}

	public void setTx2PctRecv(Double tx2PctRecv) {
		this.tx2PctRecv = tx2PctRecv;
	}

	public String getTx2Qad01() {
		return this.tx2Qad01;
	}

	public void setTx2Qad01(String tx2Qad01) {
		this.tx2Qad01 = tx2Qad01;
	}

	public String getTx2Qad02() {
		return this.tx2Qad02;
	}

	public void setTx2Qad02(String tx2Qad02) {
		this.tx2Qad02 = tx2Qad02;
	}

	public Boolean getTx2Qad03() {
		return this.tx2Qad03;
	}

	public void setTx2Qad03(Boolean tx2Qad03) {
		this.tx2Qad03 = tx2Qad03;
	}

	public Boolean getTx2ByLine() {
		return this.tx2ByLine;
	}

	public void setTx2ByLine(Boolean tx2ByLine) {
		this.tx2ByLine = tx2ByLine;
	}

	public Integer getTx2Cmtindx() {
		return this.tx2Cmtindx;
	}

	public void setTx2Cmtindx(Integer tx2Cmtindx) {
		this.tx2Cmtindx = tx2Cmtindx;
	}

	public String getTx2Chr01() {
		return this.tx2Chr01;
	}

	public void setTx2Chr01(String tx2Chr01) {
		this.tx2Chr01 = tx2Chr01;
	}

	public String getTx2Chr02() {
		return this.tx2Chr02;
	}

	public void setTx2Chr02(String tx2Chr02) {
		this.tx2Chr02 = tx2Chr02;
	}

	public Double getTx2Dec01() {
		return this.tx2Dec01;
	}

	public void setTx2Dec01(Double tx2Dec01) {
		this.tx2Dec01 = tx2Dec01;
	}

	public Double getTx2Dec02() {
		return this.tx2Dec02;
	}

	public void setTx2Dec02(Double tx2Dec02) {
		this.tx2Dec02 = tx2Dec02;
	}

	public String getTx2Curr() {
		return this.tx2Curr;
	}

	public void setTx2Curr(String tx2Curr) {
		this.tx2Curr = tx2Curr;
	}

	public Double getTx2Qad04() {
		return this.tx2Qad04;
	}

	public void setTx2Qad04(Double tx2Qad04) {
		this.tx2Qad04 = tx2Qad04;
	}

	public Date getTx2Qad05() {
		return this.tx2Qad05;
	}

	public void setTx2Qad05(Date tx2Qad05) {
		this.tx2Qad05 = tx2Qad05;
	}

	public Boolean getTx2Log01() {
		return this.tx2Log01;
	}

	public void setTx2Log01(Boolean tx2Log01) {
		this.tx2Log01 = tx2Log01;
	}

	public Date getTx2Dte01() {
		return this.tx2Dte01;
	}

	public void setTx2Dte01(Date tx2Dte01) {
		this.tx2Dte01 = tx2Dte01;
	}

	public Boolean getTx2InvDisc() {
		return this.tx2InvDisc;
	}

	public void setTx2InvDisc(Boolean tx2InvDisc) {
		this.tx2InvDisc = tx2InvDisc;
	}

	public Boolean getTx2PmtDisc() {
		return this.tx2PmtDisc;
	}

	public void setTx2PmtDisc(Boolean tx2PmtDisc) {
		this.tx2PmtDisc = tx2PmtDisc;
	}

	public Boolean getTx2UpdateTax() {
		return this.tx2UpdateTax;
	}

	public void setTx2UpdateTax(Boolean tx2UpdateTax) {
		this.tx2UpdateTax = tx2UpdateTax;
	}

	public Boolean getTx2RcptTaxPoint() {
		return this.tx2RcptTaxPoint;
	}

	public void setTx2RcptTaxPoint(Boolean tx2RcptTaxPoint) {
		this.tx2RcptTaxPoint = tx2RcptTaxPoint;
	}

	public String getTx2ArAcct() {
		return this.tx2ArAcct;
	}

	public void setTx2ArAcct(String tx2ArAcct) {
		this.tx2ArAcct = tx2ArAcct;
	}

	public String getTx2ArCc() {
		return this.tx2ArCc;
	}

	public void setTx2ArCc(String tx2ArCc) {
		this.tx2ArCc = tx2ArCc;
	}

	public String getTx2AraAcct() {
		return this.tx2AraAcct;
	}

	public void setTx2AraAcct(String tx2AraAcct) {
		this.tx2AraAcct = tx2AraAcct;
	}

	public String getTx2AraCc() {
		return this.tx2AraCc;
	}

	public void setTx2AraCc(String tx2AraCc) {
		this.tx2AraCc = tx2AraCc;
	}

	public Boolean getTx2AraUse() {
		return this.tx2AraUse;
	}

	public void setTx2AraUse(Boolean tx2AraUse) {
		this.tx2AraUse = tx2AraUse;
	}

	public String getTx2ApAcct() {
		return this.tx2ApAcct;
	}

	public void setTx2ApAcct(String tx2ApAcct) {
		this.tx2ApAcct = tx2ApAcct;
	}

	public String getTx2ApCc() {
		return this.tx2ApCc;
	}

	public void setTx2ApCc(String tx2ApCc) {
		this.tx2ApCc = tx2ApCc;
	}

	public String getTx2AprAcct() {
		return this.tx2AprAcct;
	}

	public void setTx2AprAcct(String tx2AprAcct) {
		this.tx2AprAcct = tx2AprAcct;
	}

	public String getTx2AprCc() {
		return this.tx2AprCc;
	}

	public void setTx2AprCc(String tx2AprCc) {
		this.tx2AprCc = tx2AprCc;
	}

	public Boolean getTx2AprUse() {
		return this.tx2AprUse;
	}

	public void setTx2AprUse(Boolean tx2AprUse) {
		this.tx2AprUse = tx2AprUse;
	}

	public Boolean getTx2TaxIn() {
		return this.tx2TaxIn;
	}

	public void setTx2TaxIn(Boolean tx2TaxIn) {
		this.tx2TaxIn = tx2TaxIn;
	}

	public Date getTx2ExpDate() {
		return this.tx2ExpDate;
	}

	public void setTx2ExpDate(Date tx2ExpDate) {
		this.tx2ExpDate = tx2ExpDate;
	}

	public Boolean getTx2EcSalesList() {
		return this.tx2EcSalesList;
	}

	public void setTx2EcSalesList(Boolean tx2EcSalesList) {
		this.tx2EcSalesList = tx2EcSalesList;
	}

	public Boolean getTx2EcProcessWork() {
		return this.tx2EcProcessWork;
	}

	public void setTx2EcProcessWork(Boolean tx2EcProcessWork) {
		this.tx2EcProcessWork = tx2EcProcessWork;
	}

	public String getTx2AprSub() {
		return this.tx2AprSub;
	}

	public void setTx2AprSub(String tx2AprSub) {
		this.tx2AprSub = tx2AprSub;
	}

	public String getTx2ApSub() {
		return this.tx2ApSub;
	}

	public void setTx2ApSub(String tx2ApSub) {
		this.tx2ApSub = tx2ApSub;
	}

	public String getTx2AraSub() {
		return this.tx2AraSub;
	}

	public void setTx2AraSub(String tx2AraSub) {
		this.tx2AraSub = tx2AraSub;
	}

	public String getTx2ArSub() {
		return this.tx2ArSub;
	}

	public void setTx2ArSub(String tx2ArSub) {
		this.tx2ArSub = tx2ArSub;
	}

	public String getTx2ApDiscAcct() {
		return this.tx2ApDiscAcct;
	}

	public void setTx2ApDiscAcct(String tx2ApDiscAcct) {
		this.tx2ApDiscAcct = tx2ApDiscAcct;
	}

	public String getTx2ApDiscCc() {
		return this.tx2ApDiscCc;
	}

	public void setTx2ApDiscCc(String tx2ApDiscCc) {
		this.tx2ApDiscCc = tx2ApDiscCc;
	}

	public String getTx2ApDiscSub() {
		return this.tx2ApDiscSub;
	}

	public void setTx2ApDiscSub(String tx2ApDiscSub) {
		this.tx2ApDiscSub = tx2ApDiscSub;
	}

	public String getTx2ArDiscAcct() {
		return this.tx2ArDiscAcct;
	}

	public void setTx2ArDiscAcct(String tx2ArDiscAcct) {
		this.tx2ArDiscAcct = tx2ArDiscAcct;
	}

	public String getTx2ArDiscCc() {
		return this.tx2ArDiscCc;
	}

	public void setTx2ArDiscCc(String tx2ArDiscCc) {
		this.tx2ArDiscCc = tx2ArDiscCc;
	}

	public String getTx2ArDiscSub() {
		return this.tx2ArDiscSub;
	}

	public void setTx2ArDiscSub(String tx2ArDiscSub) {
		this.tx2ArDiscSub = tx2ArDiscSub;
	}

	public String getTx2Group() {
		return this.tx2Group;
	}

	public void setTx2Group(String tx2Group) {
		this.tx2Group = tx2Group;
	}

	public String getTx2StxAcct() {
		return this.tx2StxAcct;
	}

	public void setTx2StxAcct(String tx2StxAcct) {
		this.tx2StxAcct = tx2StxAcct;
	}

	public String getTx2StxCc() {
		return this.tx2StxCc;
	}

	public void setTx2StxCc(String tx2StxCc) {
		this.tx2StxCc = tx2StxCc;
	}

	public String getTx2StxSub() {
		return this.tx2StxSub;
	}

	public void setTx2StxSub(String tx2StxSub) {
		this.tx2StxSub = tx2StxSub;
	}

	public String getTx2Register() {
		return this.tx2Register;
	}

	public void setTx2Register(String tx2Register) {
		this.tx2Register = tx2Register;
	}

	public Boolean getTx2UsageTaxPoint() {
		return this.tx2UsageTaxPoint;
	}

	public void setTx2UsageTaxPoint(Boolean tx2UsageTaxPoint) {
		this.tx2UsageTaxPoint = tx2UsageTaxPoint;
	}

	public Double getOidTx2Mstr() {
		return this.oidTx2Mstr;
	}

	public void setOidTx2Mstr(Double oidTx2Mstr) {
		this.oidTx2Mstr = oidTx2Mstr;
	}

}