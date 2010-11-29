package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQodDet entity provides the base persistence definition of the QodDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQodDet implements java.io.Serializable {

	// Fields

	private QodDetId id;
	private Date qodDueDate;
	private Date qodPerDate;
	private Date qodReqDate;
	private String qodPart;
	private String qodLoc;
	private String qodType;
	private Double qodPrice;
	private Double qodStdCost;
	private String qodAcct;
	private Boolean qodAbnormal;
	private Boolean qodTaxable;
	private String qodSerial;
	private String qodDesc;
	private String qodUm;
	private String qodCc;
	private String qodQad01;
	private String qodLot;
	private Double qodUmConv;
	private String qodFaNbr;
	private Double qodDiscPct;
	private String qodProject;
	private Integer qodCmtindx;
	private String qodCustpart;
	private Integer qodQad02;
	private String qodStatus;
	private String qodXslspsn;
	private String qodCommPct;
	private String qodDscAcct;
	private String qodDscCc;
	private Double qodListPr;
	private String qodUser1;
	private String qodUser2;
	private Double qodQtyQuot;
	private Double qodQtyRel;
	private Double qodRelChg;
	private String qodRsnLost;
	private Boolean qodPst;
	private Double qodFstRate;
	private Double qodFstTax;
	private Double qodPstTax;
	private Boolean qodTaxIn;
	private Boolean qodQad03;
	private String qodTaxc;
	private Boolean qodFstList;
	private String qodSite;
	private Boolean qodQobStd;
	private Date qodQobRev;
	private String qodProdline;
	private String qodChr01;
	private String qodChr02;
	private String qodChr03;
	private String qodChr04;
	private String qodChr05;
	private String qodChr06;
	private String qodChr07;
	private String qodChr08;
	private String qodChr09;
	private String qodChr10;
	private Date qodDte01;
	private Date qodDte02;
	private Double qodDec01;
	private Double qodDec02;
	private Boolean qodLog01;
	private Double qodTaxMax;
	private Double qodFrRate;
	private String qodSlspsn;
	private Double qodFrChg;
	private String qodFrClass;
	private Double qodFrWt;
	private String qodFrWtUm;
	private Boolean qodFixPr;
	private String qodTaxUsage;
	private String qodTaxEnv;
	private String qodFrList;
	private Double qodCrtInt;
	private Date qodPricingDt;
	private Boolean qodBonus;
	private String qodCfgType;
	private String qodDiv;
	private Integer qodPlPriority;
	private String qodPrig1;
	private String qodPrig2;
	private String qodSub;
	private String qodDscSub;
	private String qodDscProject;
	private Boolean qodManualFrList;
	private Double oidQodDet;

	// Constructors

	/** default constructor */
	public AbstractQodDet() {
	}

	/** minimal constructor */
	public AbstractQodDet(QodDetId id, Boolean qodBonus,
			Boolean qodManualFrList, Double oidQodDet) {
		this.id = id;
		this.qodBonus = qodBonus;
		this.qodManualFrList = qodManualFrList;
		this.oidQodDet = oidQodDet;
	}

	/** full constructor */
	public AbstractQodDet(QodDetId id, Date qodDueDate, Date qodPerDate,
			Date qodReqDate, String qodPart, String qodLoc, String qodType,
			Double qodPrice, Double qodStdCost, String qodAcct,
			Boolean qodAbnormal, Boolean qodTaxable, String qodSerial,
			String qodDesc, String qodUm, String qodCc, String qodQad01,
			String qodLot, Double qodUmConv, String qodFaNbr,
			Double qodDiscPct, String qodProject, Integer qodCmtindx,
			String qodCustpart, Integer qodQad02, String qodStatus,
			String qodXslspsn, String qodCommPct, String qodDscAcct,
			String qodDscCc, Double qodListPr, String qodUser1,
			String qodUser2, Double qodQtyQuot, Double qodQtyRel,
			Double qodRelChg, String qodRsnLost, Boolean qodPst,
			Double qodFstRate, Double qodFstTax, Double qodPstTax,
			Boolean qodTaxIn, Boolean qodQad03, String qodTaxc,
			Boolean qodFstList, String qodSite, Boolean qodQobStd,
			Date qodQobRev, String qodProdline, String qodChr01,
			String qodChr02, String qodChr03, String qodChr04, String qodChr05,
			String qodChr06, String qodChr07, String qodChr08, String qodChr09,
			String qodChr10, Date qodDte01, Date qodDte02, Double qodDec01,
			Double qodDec02, Boolean qodLog01, Double qodTaxMax,
			Double qodFrRate, String qodSlspsn, Double qodFrChg,
			String qodFrClass, Double qodFrWt, String qodFrWtUm,
			Boolean qodFixPr, String qodTaxUsage, String qodTaxEnv,
			String qodFrList, Double qodCrtInt, Date qodPricingDt,
			Boolean qodBonus, String qodCfgType, String qodDiv,
			Integer qodPlPriority, String qodPrig1, String qodPrig2,
			String qodSub, String qodDscSub, String qodDscProject,
			Boolean qodManualFrList, Double oidQodDet) {
		this.id = id;
		this.qodDueDate = qodDueDate;
		this.qodPerDate = qodPerDate;
		this.qodReqDate = qodReqDate;
		this.qodPart = qodPart;
		this.qodLoc = qodLoc;
		this.qodType = qodType;
		this.qodPrice = qodPrice;
		this.qodStdCost = qodStdCost;
		this.qodAcct = qodAcct;
		this.qodAbnormal = qodAbnormal;
		this.qodTaxable = qodTaxable;
		this.qodSerial = qodSerial;
		this.qodDesc = qodDesc;
		this.qodUm = qodUm;
		this.qodCc = qodCc;
		this.qodQad01 = qodQad01;
		this.qodLot = qodLot;
		this.qodUmConv = qodUmConv;
		this.qodFaNbr = qodFaNbr;
		this.qodDiscPct = qodDiscPct;
		this.qodProject = qodProject;
		this.qodCmtindx = qodCmtindx;
		this.qodCustpart = qodCustpart;
		this.qodQad02 = qodQad02;
		this.qodStatus = qodStatus;
		this.qodXslspsn = qodXslspsn;
		this.qodCommPct = qodCommPct;
		this.qodDscAcct = qodDscAcct;
		this.qodDscCc = qodDscCc;
		this.qodListPr = qodListPr;
		this.qodUser1 = qodUser1;
		this.qodUser2 = qodUser2;
		this.qodQtyQuot = qodQtyQuot;
		this.qodQtyRel = qodQtyRel;
		this.qodRelChg = qodRelChg;
		this.qodRsnLost = qodRsnLost;
		this.qodPst = qodPst;
		this.qodFstRate = qodFstRate;
		this.qodFstTax = qodFstTax;
		this.qodPstTax = qodPstTax;
		this.qodTaxIn = qodTaxIn;
		this.qodQad03 = qodQad03;
		this.qodTaxc = qodTaxc;
		this.qodFstList = qodFstList;
		this.qodSite = qodSite;
		this.qodQobStd = qodQobStd;
		this.qodQobRev = qodQobRev;
		this.qodProdline = qodProdline;
		this.qodChr01 = qodChr01;
		this.qodChr02 = qodChr02;
		this.qodChr03 = qodChr03;
		this.qodChr04 = qodChr04;
		this.qodChr05 = qodChr05;
		this.qodChr06 = qodChr06;
		this.qodChr07 = qodChr07;
		this.qodChr08 = qodChr08;
		this.qodChr09 = qodChr09;
		this.qodChr10 = qodChr10;
		this.qodDte01 = qodDte01;
		this.qodDte02 = qodDte02;
		this.qodDec01 = qodDec01;
		this.qodDec02 = qodDec02;
		this.qodLog01 = qodLog01;
		this.qodTaxMax = qodTaxMax;
		this.qodFrRate = qodFrRate;
		this.qodSlspsn = qodSlspsn;
		this.qodFrChg = qodFrChg;
		this.qodFrClass = qodFrClass;
		this.qodFrWt = qodFrWt;
		this.qodFrWtUm = qodFrWtUm;
		this.qodFixPr = qodFixPr;
		this.qodTaxUsage = qodTaxUsage;
		this.qodTaxEnv = qodTaxEnv;
		this.qodFrList = qodFrList;
		this.qodCrtInt = qodCrtInt;
		this.qodPricingDt = qodPricingDt;
		this.qodBonus = qodBonus;
		this.qodCfgType = qodCfgType;
		this.qodDiv = qodDiv;
		this.qodPlPriority = qodPlPriority;
		this.qodPrig1 = qodPrig1;
		this.qodPrig2 = qodPrig2;
		this.qodSub = qodSub;
		this.qodDscSub = qodDscSub;
		this.qodDscProject = qodDscProject;
		this.qodManualFrList = qodManualFrList;
		this.oidQodDet = oidQodDet;
	}

	// Property accessors

	public QodDetId getId() {
		return this.id;
	}

	public void setId(QodDetId id) {
		this.id = id;
	}

	public Date getQodDueDate() {
		return this.qodDueDate;
	}

	public void setQodDueDate(Date qodDueDate) {
		this.qodDueDate = qodDueDate;
	}

	public Date getQodPerDate() {
		return this.qodPerDate;
	}

	public void setQodPerDate(Date qodPerDate) {
		this.qodPerDate = qodPerDate;
	}

	public Date getQodReqDate() {
		return this.qodReqDate;
	}

	public void setQodReqDate(Date qodReqDate) {
		this.qodReqDate = qodReqDate;
	}

	public String getQodPart() {
		return this.qodPart;
	}

	public void setQodPart(String qodPart) {
		this.qodPart = qodPart;
	}

	public String getQodLoc() {
		return this.qodLoc;
	}

	public void setQodLoc(String qodLoc) {
		this.qodLoc = qodLoc;
	}

	public String getQodType() {
		return this.qodType;
	}

	public void setQodType(String qodType) {
		this.qodType = qodType;
	}

	public Double getQodPrice() {
		return this.qodPrice;
	}

	public void setQodPrice(Double qodPrice) {
		this.qodPrice = qodPrice;
	}

	public Double getQodStdCost() {
		return this.qodStdCost;
	}

	public void setQodStdCost(Double qodStdCost) {
		this.qodStdCost = qodStdCost;
	}

	public String getQodAcct() {
		return this.qodAcct;
	}

	public void setQodAcct(String qodAcct) {
		this.qodAcct = qodAcct;
	}

	public Boolean getQodAbnormal() {
		return this.qodAbnormal;
	}

	public void setQodAbnormal(Boolean qodAbnormal) {
		this.qodAbnormal = qodAbnormal;
	}

	public Boolean getQodTaxable() {
		return this.qodTaxable;
	}

	public void setQodTaxable(Boolean qodTaxable) {
		this.qodTaxable = qodTaxable;
	}

	public String getQodSerial() {
		return this.qodSerial;
	}

	public void setQodSerial(String qodSerial) {
		this.qodSerial = qodSerial;
	}

	public String getQodDesc() {
		return this.qodDesc;
	}

	public void setQodDesc(String qodDesc) {
		this.qodDesc = qodDesc;
	}

	public String getQodUm() {
		return this.qodUm;
	}

	public void setQodUm(String qodUm) {
		this.qodUm = qodUm;
	}

	public String getQodCc() {
		return this.qodCc;
	}

	public void setQodCc(String qodCc) {
		this.qodCc = qodCc;
	}

	public String getQodQad01() {
		return this.qodQad01;
	}

	public void setQodQad01(String qodQad01) {
		this.qodQad01 = qodQad01;
	}

	public String getQodLot() {
		return this.qodLot;
	}

	public void setQodLot(String qodLot) {
		this.qodLot = qodLot;
	}

	public Double getQodUmConv() {
		return this.qodUmConv;
	}

	public void setQodUmConv(Double qodUmConv) {
		this.qodUmConv = qodUmConv;
	}

	public String getQodFaNbr() {
		return this.qodFaNbr;
	}

	public void setQodFaNbr(String qodFaNbr) {
		this.qodFaNbr = qodFaNbr;
	}

	public Double getQodDiscPct() {
		return this.qodDiscPct;
	}

	public void setQodDiscPct(Double qodDiscPct) {
		this.qodDiscPct = qodDiscPct;
	}

	public String getQodProject() {
		return this.qodProject;
	}

	public void setQodProject(String qodProject) {
		this.qodProject = qodProject;
	}

	public Integer getQodCmtindx() {
		return this.qodCmtindx;
	}

	public void setQodCmtindx(Integer qodCmtindx) {
		this.qodCmtindx = qodCmtindx;
	}

	public String getQodCustpart() {
		return this.qodCustpart;
	}

	public void setQodCustpart(String qodCustpart) {
		this.qodCustpart = qodCustpart;
	}

	public Integer getQodQad02() {
		return this.qodQad02;
	}

	public void setQodQad02(Integer qodQad02) {
		this.qodQad02 = qodQad02;
	}

	public String getQodStatus() {
		return this.qodStatus;
	}

	public void setQodStatus(String qodStatus) {
		this.qodStatus = qodStatus;
	}

	public String getQodXslspsn() {
		return this.qodXslspsn;
	}

	public void setQodXslspsn(String qodXslspsn) {
		this.qodXslspsn = qodXslspsn;
	}

	public String getQodCommPct() {
		return this.qodCommPct;
	}

	public void setQodCommPct(String qodCommPct) {
		this.qodCommPct = qodCommPct;
	}

	public String getQodDscAcct() {
		return this.qodDscAcct;
	}

	public void setQodDscAcct(String qodDscAcct) {
		this.qodDscAcct = qodDscAcct;
	}

	public String getQodDscCc() {
		return this.qodDscCc;
	}

	public void setQodDscCc(String qodDscCc) {
		this.qodDscCc = qodDscCc;
	}

	public Double getQodListPr() {
		return this.qodListPr;
	}

	public void setQodListPr(Double qodListPr) {
		this.qodListPr = qodListPr;
	}

	public String getQodUser1() {
		return this.qodUser1;
	}

	public void setQodUser1(String qodUser1) {
		this.qodUser1 = qodUser1;
	}

	public String getQodUser2() {
		return this.qodUser2;
	}

	public void setQodUser2(String qodUser2) {
		this.qodUser2 = qodUser2;
	}

	public Double getQodQtyQuot() {
		return this.qodQtyQuot;
	}

	public void setQodQtyQuot(Double qodQtyQuot) {
		this.qodQtyQuot = qodQtyQuot;
	}

	public Double getQodQtyRel() {
		return this.qodQtyRel;
	}

	public void setQodQtyRel(Double qodQtyRel) {
		this.qodQtyRel = qodQtyRel;
	}

	public Double getQodRelChg() {
		return this.qodRelChg;
	}

	public void setQodRelChg(Double qodRelChg) {
		this.qodRelChg = qodRelChg;
	}

	public String getQodRsnLost() {
		return this.qodRsnLost;
	}

	public void setQodRsnLost(String qodRsnLost) {
		this.qodRsnLost = qodRsnLost;
	}

	public Boolean getQodPst() {
		return this.qodPst;
	}

	public void setQodPst(Boolean qodPst) {
		this.qodPst = qodPst;
	}

	public Double getQodFstRate() {
		return this.qodFstRate;
	}

	public void setQodFstRate(Double qodFstRate) {
		this.qodFstRate = qodFstRate;
	}

	public Double getQodFstTax() {
		return this.qodFstTax;
	}

	public void setQodFstTax(Double qodFstTax) {
		this.qodFstTax = qodFstTax;
	}

	public Double getQodPstTax() {
		return this.qodPstTax;
	}

	public void setQodPstTax(Double qodPstTax) {
		this.qodPstTax = qodPstTax;
	}

	public Boolean getQodTaxIn() {
		return this.qodTaxIn;
	}

	public void setQodTaxIn(Boolean qodTaxIn) {
		this.qodTaxIn = qodTaxIn;
	}

	public Boolean getQodQad03() {
		return this.qodQad03;
	}

	public void setQodQad03(Boolean qodQad03) {
		this.qodQad03 = qodQad03;
	}

	public String getQodTaxc() {
		return this.qodTaxc;
	}

	public void setQodTaxc(String qodTaxc) {
		this.qodTaxc = qodTaxc;
	}

	public Boolean getQodFstList() {
		return this.qodFstList;
	}

	public void setQodFstList(Boolean qodFstList) {
		this.qodFstList = qodFstList;
	}

	public String getQodSite() {
		return this.qodSite;
	}

	public void setQodSite(String qodSite) {
		this.qodSite = qodSite;
	}

	public Boolean getQodQobStd() {
		return this.qodQobStd;
	}

	public void setQodQobStd(Boolean qodQobStd) {
		this.qodQobStd = qodQobStd;
	}

	public Date getQodQobRev() {
		return this.qodQobRev;
	}

	public void setQodQobRev(Date qodQobRev) {
		this.qodQobRev = qodQobRev;
	}

	public String getQodProdline() {
		return this.qodProdline;
	}

	public void setQodProdline(String qodProdline) {
		this.qodProdline = qodProdline;
	}

	public String getQodChr01() {
		return this.qodChr01;
	}

	public void setQodChr01(String qodChr01) {
		this.qodChr01 = qodChr01;
	}

	public String getQodChr02() {
		return this.qodChr02;
	}

	public void setQodChr02(String qodChr02) {
		this.qodChr02 = qodChr02;
	}

	public String getQodChr03() {
		return this.qodChr03;
	}

	public void setQodChr03(String qodChr03) {
		this.qodChr03 = qodChr03;
	}

	public String getQodChr04() {
		return this.qodChr04;
	}

	public void setQodChr04(String qodChr04) {
		this.qodChr04 = qodChr04;
	}

	public String getQodChr05() {
		return this.qodChr05;
	}

	public void setQodChr05(String qodChr05) {
		this.qodChr05 = qodChr05;
	}

	public String getQodChr06() {
		return this.qodChr06;
	}

	public void setQodChr06(String qodChr06) {
		this.qodChr06 = qodChr06;
	}

	public String getQodChr07() {
		return this.qodChr07;
	}

	public void setQodChr07(String qodChr07) {
		this.qodChr07 = qodChr07;
	}

	public String getQodChr08() {
		return this.qodChr08;
	}

	public void setQodChr08(String qodChr08) {
		this.qodChr08 = qodChr08;
	}

	public String getQodChr09() {
		return this.qodChr09;
	}

	public void setQodChr09(String qodChr09) {
		this.qodChr09 = qodChr09;
	}

	public String getQodChr10() {
		return this.qodChr10;
	}

	public void setQodChr10(String qodChr10) {
		this.qodChr10 = qodChr10;
	}

	public Date getQodDte01() {
		return this.qodDte01;
	}

	public void setQodDte01(Date qodDte01) {
		this.qodDte01 = qodDte01;
	}

	public Date getQodDte02() {
		return this.qodDte02;
	}

	public void setQodDte02(Date qodDte02) {
		this.qodDte02 = qodDte02;
	}

	public Double getQodDec01() {
		return this.qodDec01;
	}

	public void setQodDec01(Double qodDec01) {
		this.qodDec01 = qodDec01;
	}

	public Double getQodDec02() {
		return this.qodDec02;
	}

	public void setQodDec02(Double qodDec02) {
		this.qodDec02 = qodDec02;
	}

	public Boolean getQodLog01() {
		return this.qodLog01;
	}

	public void setQodLog01(Boolean qodLog01) {
		this.qodLog01 = qodLog01;
	}

	public Double getQodTaxMax() {
		return this.qodTaxMax;
	}

	public void setQodTaxMax(Double qodTaxMax) {
		this.qodTaxMax = qodTaxMax;
	}

	public Double getQodFrRate() {
		return this.qodFrRate;
	}

	public void setQodFrRate(Double qodFrRate) {
		this.qodFrRate = qodFrRate;
	}

	public String getQodSlspsn() {
		return this.qodSlspsn;
	}

	public void setQodSlspsn(String qodSlspsn) {
		this.qodSlspsn = qodSlspsn;
	}

	public Double getQodFrChg() {
		return this.qodFrChg;
	}

	public void setQodFrChg(Double qodFrChg) {
		this.qodFrChg = qodFrChg;
	}

	public String getQodFrClass() {
		return this.qodFrClass;
	}

	public void setQodFrClass(String qodFrClass) {
		this.qodFrClass = qodFrClass;
	}

	public Double getQodFrWt() {
		return this.qodFrWt;
	}

	public void setQodFrWt(Double qodFrWt) {
		this.qodFrWt = qodFrWt;
	}

	public String getQodFrWtUm() {
		return this.qodFrWtUm;
	}

	public void setQodFrWtUm(String qodFrWtUm) {
		this.qodFrWtUm = qodFrWtUm;
	}

	public Boolean getQodFixPr() {
		return this.qodFixPr;
	}

	public void setQodFixPr(Boolean qodFixPr) {
		this.qodFixPr = qodFixPr;
	}

	public String getQodTaxUsage() {
		return this.qodTaxUsage;
	}

	public void setQodTaxUsage(String qodTaxUsage) {
		this.qodTaxUsage = qodTaxUsage;
	}

	public String getQodTaxEnv() {
		return this.qodTaxEnv;
	}

	public void setQodTaxEnv(String qodTaxEnv) {
		this.qodTaxEnv = qodTaxEnv;
	}

	public String getQodFrList() {
		return this.qodFrList;
	}

	public void setQodFrList(String qodFrList) {
		this.qodFrList = qodFrList;
	}

	public Double getQodCrtInt() {
		return this.qodCrtInt;
	}

	public void setQodCrtInt(Double qodCrtInt) {
		this.qodCrtInt = qodCrtInt;
	}

	public Date getQodPricingDt() {
		return this.qodPricingDt;
	}

	public void setQodPricingDt(Date qodPricingDt) {
		this.qodPricingDt = qodPricingDt;
	}

	public Boolean getQodBonus() {
		return this.qodBonus;
	}

	public void setQodBonus(Boolean qodBonus) {
		this.qodBonus = qodBonus;
	}

	public String getQodCfgType() {
		return this.qodCfgType;
	}

	public void setQodCfgType(String qodCfgType) {
		this.qodCfgType = qodCfgType;
	}

	public String getQodDiv() {
		return this.qodDiv;
	}

	public void setQodDiv(String qodDiv) {
		this.qodDiv = qodDiv;
	}

	public Integer getQodPlPriority() {
		return this.qodPlPriority;
	}

	public void setQodPlPriority(Integer qodPlPriority) {
		this.qodPlPriority = qodPlPriority;
	}

	public String getQodPrig1() {
		return this.qodPrig1;
	}

	public void setQodPrig1(String qodPrig1) {
		this.qodPrig1 = qodPrig1;
	}

	public String getQodPrig2() {
		return this.qodPrig2;
	}

	public void setQodPrig2(String qodPrig2) {
		this.qodPrig2 = qodPrig2;
	}

	public String getQodSub() {
		return this.qodSub;
	}

	public void setQodSub(String qodSub) {
		this.qodSub = qodSub;
	}

	public String getQodDscSub() {
		return this.qodDscSub;
	}

	public void setQodDscSub(String qodDscSub) {
		this.qodDscSub = qodDscSub;
	}

	public String getQodDscProject() {
		return this.qodDscProject;
	}

	public void setQodDscProject(String qodDscProject) {
		this.qodDscProject = qodDscProject;
	}

	public Boolean getQodManualFrList() {
		return this.qodManualFrList;
	}

	public void setQodManualFrList(Boolean qodManualFrList) {
		this.qodManualFrList = qodManualFrList;
	}

	public Double getOidQodDet() {
		return this.oidQodDet;
	}

	public void setOidQodDet(Double oidQodDet) {
		this.oidQodDet = oidQodDet;
	}

}