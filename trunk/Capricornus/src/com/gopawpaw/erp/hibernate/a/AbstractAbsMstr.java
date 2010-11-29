package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbsMstr entity provides the base persistence definition of the
 * AbsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbsMstr implements java.io.Serializable {

	// Fields

	private AbsMstrId id;
	private String absParId;
	private String absShipto;
	private String absType;
	private String absStatus;
	private String absTimezone;
	private Date absShpDate;
	private Integer absShpTime;
	private Date absArrDate;
	private Integer absArrTime;
	private Date absCrtDate;
	private Integer absCrtTime;
	private Date absAprDate;
	private Integer absAprTime;
	private String absAprUserid;
	private Double absGwt;
	private Double absNwt;
	private Double absVol;
	private String absWtUm;
	private String absVolUm;
	private String absDimUm;
	private String absFrClass;
	private Double absEstFcst;
	private Double absActFcst;
	private String absFrCurr;
	private String absDocData;
	private String absDataset;
	private String absOrder;
	private String absLine;
	private String absInvNbr;
	private String absItem;
	private String absLotser;
	private String absRef;
	private Double absQty;
	private Double absShipQty;
	private Double absCumQty;
	private String absSite;
	private String absLoc;
	private String absCustRef;
	private Integer absCmtindx;
	private String absChr01;
	private String absChr02;
	private String absChr03;
	private String absChr04;
	private String absChr05;
	private String absChr06;
	private String absChr07;
	private String absChr08;
	private String absChr09;
	private String absChr10;
	private Double absDec01;
	private Double absDec02;
	private Double absDec03;
	private Double absDec04;
	private Double absDec05;
	private Double absDec06;
	private Double absDec07;
	private Double absDec08;
	private Double absDec09;
	private Double absDec10;
	private String absQad01;
	private String absQad02;
	private String absQad03;
	private String absQad04;
	private String absQad05;
	private String absQad06;
	private String absQad07;
	private String absQad08;
	private String absQad09;
	private String absQad10;
	private String absUser1;
	private String absUser2;
	private String absMasterId;
	private String absInvMov;
	private String absNrId;
	private String absFormat;
	private String absConsShip;
	private String absQadc01;
	private String absLang;
	private Boolean absCanceled;
	private Double absQadd01;
	private Integer absTrlCmtindx;
	private Date absEffDate;
	private Date absCancelDate;
	private String absPreshipNrId;
	private String absPreshipId;
	private String absFaLot;
	private Date absAsnCrtDate;
	private Integer absAsnCrtTime;
	private Integer absExportBatch;
	private Date absExportDate;
	private Integer absExportTime;
	private String absChargeType;
	private Double absPrice;
	private String absDesc;
	private String absMasterShipfrom;
	private Double oidAbsMstr;

	// Constructors

	/** default constructor */
	public AbstractAbsMstr() {
	}

	/** minimal constructor */
	public AbstractAbsMstr(AbsMstrId id, String absInvMov, String absNrId,
			String absFormat, String absConsShip, String absLang,
			Boolean absCanceled, Integer absTrlCmtindx, String absDesc,
			String absMasterShipfrom, Double oidAbsMstr) {
		this.id = id;
		this.absInvMov = absInvMov;
		this.absNrId = absNrId;
		this.absFormat = absFormat;
		this.absConsShip = absConsShip;
		this.absLang = absLang;
		this.absCanceled = absCanceled;
		this.absTrlCmtindx = absTrlCmtindx;
		this.absDesc = absDesc;
		this.absMasterShipfrom = absMasterShipfrom;
		this.oidAbsMstr = oidAbsMstr;
	}

	/** full constructor */
	public AbstractAbsMstr(AbsMstrId id, String absParId, String absShipto,
			String absType, String absStatus, String absTimezone,
			Date absShpDate, Integer absShpTime, Date absArrDate,
			Integer absArrTime, Date absCrtDate, Integer absCrtTime,
			Date absAprDate, Integer absAprTime, String absAprUserid,
			Double absGwt, Double absNwt, Double absVol, String absWtUm,
			String absVolUm, String absDimUm, String absFrClass,
			Double absEstFcst, Double absActFcst, String absFrCurr,
			String absDocData, String absDataset, String absOrder,
			String absLine, String absInvNbr, String absItem, String absLotser,
			String absRef, Double absQty, Double absShipQty, Double absCumQty,
			String absSite, String absLoc, String absCustRef,
			Integer absCmtindx, String absChr01, String absChr02,
			String absChr03, String absChr04, String absChr05, String absChr06,
			String absChr07, String absChr08, String absChr09, String absChr10,
			Double absDec01, Double absDec02, Double absDec03, Double absDec04,
			Double absDec05, Double absDec06, Double absDec07, Double absDec08,
			Double absDec09, Double absDec10, String absQad01, String absQad02,
			String absQad03, String absQad04, String absQad05, String absQad06,
			String absQad07, String absQad08, String absQad09, String absQad10,
			String absUser1, String absUser2, String absMasterId,
			String absInvMov, String absNrId, String absFormat,
			String absConsShip, String absQadc01, String absLang,
			Boolean absCanceled, Double absQadd01, Integer absTrlCmtindx,
			Date absEffDate, Date absCancelDate, String absPreshipNrId,
			String absPreshipId, String absFaLot, Date absAsnCrtDate,
			Integer absAsnCrtTime, Integer absExportBatch, Date absExportDate,
			Integer absExportTime, String absChargeType, Double absPrice,
			String absDesc, String absMasterShipfrom, Double oidAbsMstr) {
		this.id = id;
		this.absParId = absParId;
		this.absShipto = absShipto;
		this.absType = absType;
		this.absStatus = absStatus;
		this.absTimezone = absTimezone;
		this.absShpDate = absShpDate;
		this.absShpTime = absShpTime;
		this.absArrDate = absArrDate;
		this.absArrTime = absArrTime;
		this.absCrtDate = absCrtDate;
		this.absCrtTime = absCrtTime;
		this.absAprDate = absAprDate;
		this.absAprTime = absAprTime;
		this.absAprUserid = absAprUserid;
		this.absGwt = absGwt;
		this.absNwt = absNwt;
		this.absVol = absVol;
		this.absWtUm = absWtUm;
		this.absVolUm = absVolUm;
		this.absDimUm = absDimUm;
		this.absFrClass = absFrClass;
		this.absEstFcst = absEstFcst;
		this.absActFcst = absActFcst;
		this.absFrCurr = absFrCurr;
		this.absDocData = absDocData;
		this.absDataset = absDataset;
		this.absOrder = absOrder;
		this.absLine = absLine;
		this.absInvNbr = absInvNbr;
		this.absItem = absItem;
		this.absLotser = absLotser;
		this.absRef = absRef;
		this.absQty = absQty;
		this.absShipQty = absShipQty;
		this.absCumQty = absCumQty;
		this.absSite = absSite;
		this.absLoc = absLoc;
		this.absCustRef = absCustRef;
		this.absCmtindx = absCmtindx;
		this.absChr01 = absChr01;
		this.absChr02 = absChr02;
		this.absChr03 = absChr03;
		this.absChr04 = absChr04;
		this.absChr05 = absChr05;
		this.absChr06 = absChr06;
		this.absChr07 = absChr07;
		this.absChr08 = absChr08;
		this.absChr09 = absChr09;
		this.absChr10 = absChr10;
		this.absDec01 = absDec01;
		this.absDec02 = absDec02;
		this.absDec03 = absDec03;
		this.absDec04 = absDec04;
		this.absDec05 = absDec05;
		this.absDec06 = absDec06;
		this.absDec07 = absDec07;
		this.absDec08 = absDec08;
		this.absDec09 = absDec09;
		this.absDec10 = absDec10;
		this.absQad01 = absQad01;
		this.absQad02 = absQad02;
		this.absQad03 = absQad03;
		this.absQad04 = absQad04;
		this.absQad05 = absQad05;
		this.absQad06 = absQad06;
		this.absQad07 = absQad07;
		this.absQad08 = absQad08;
		this.absQad09 = absQad09;
		this.absQad10 = absQad10;
		this.absUser1 = absUser1;
		this.absUser2 = absUser2;
		this.absMasterId = absMasterId;
		this.absInvMov = absInvMov;
		this.absNrId = absNrId;
		this.absFormat = absFormat;
		this.absConsShip = absConsShip;
		this.absQadc01 = absQadc01;
		this.absLang = absLang;
		this.absCanceled = absCanceled;
		this.absQadd01 = absQadd01;
		this.absTrlCmtindx = absTrlCmtindx;
		this.absEffDate = absEffDate;
		this.absCancelDate = absCancelDate;
		this.absPreshipNrId = absPreshipNrId;
		this.absPreshipId = absPreshipId;
		this.absFaLot = absFaLot;
		this.absAsnCrtDate = absAsnCrtDate;
		this.absAsnCrtTime = absAsnCrtTime;
		this.absExportBatch = absExportBatch;
		this.absExportDate = absExportDate;
		this.absExportTime = absExportTime;
		this.absChargeType = absChargeType;
		this.absPrice = absPrice;
		this.absDesc = absDesc;
		this.absMasterShipfrom = absMasterShipfrom;
		this.oidAbsMstr = oidAbsMstr;
	}

	// Property accessors

	public AbsMstrId getId() {
		return this.id;
	}

	public void setId(AbsMstrId id) {
		this.id = id;
	}

	public String getAbsParId() {
		return this.absParId;
	}

	public void setAbsParId(String absParId) {
		this.absParId = absParId;
	}

	public String getAbsShipto() {
		return this.absShipto;
	}

	public void setAbsShipto(String absShipto) {
		this.absShipto = absShipto;
	}

	public String getAbsType() {
		return this.absType;
	}

	public void setAbsType(String absType) {
		this.absType = absType;
	}

	public String getAbsStatus() {
		return this.absStatus;
	}

	public void setAbsStatus(String absStatus) {
		this.absStatus = absStatus;
	}

	public String getAbsTimezone() {
		return this.absTimezone;
	}

	public void setAbsTimezone(String absTimezone) {
		this.absTimezone = absTimezone;
	}

	public Date getAbsShpDate() {
		return this.absShpDate;
	}

	public void setAbsShpDate(Date absShpDate) {
		this.absShpDate = absShpDate;
	}

	public Integer getAbsShpTime() {
		return this.absShpTime;
	}

	public void setAbsShpTime(Integer absShpTime) {
		this.absShpTime = absShpTime;
	}

	public Date getAbsArrDate() {
		return this.absArrDate;
	}

	public void setAbsArrDate(Date absArrDate) {
		this.absArrDate = absArrDate;
	}

	public Integer getAbsArrTime() {
		return this.absArrTime;
	}

	public void setAbsArrTime(Integer absArrTime) {
		this.absArrTime = absArrTime;
	}

	public Date getAbsCrtDate() {
		return this.absCrtDate;
	}

	public void setAbsCrtDate(Date absCrtDate) {
		this.absCrtDate = absCrtDate;
	}

	public Integer getAbsCrtTime() {
		return this.absCrtTime;
	}

	public void setAbsCrtTime(Integer absCrtTime) {
		this.absCrtTime = absCrtTime;
	}

	public Date getAbsAprDate() {
		return this.absAprDate;
	}

	public void setAbsAprDate(Date absAprDate) {
		this.absAprDate = absAprDate;
	}

	public Integer getAbsAprTime() {
		return this.absAprTime;
	}

	public void setAbsAprTime(Integer absAprTime) {
		this.absAprTime = absAprTime;
	}

	public String getAbsAprUserid() {
		return this.absAprUserid;
	}

	public void setAbsAprUserid(String absAprUserid) {
		this.absAprUserid = absAprUserid;
	}

	public Double getAbsGwt() {
		return this.absGwt;
	}

	public void setAbsGwt(Double absGwt) {
		this.absGwt = absGwt;
	}

	public Double getAbsNwt() {
		return this.absNwt;
	}

	public void setAbsNwt(Double absNwt) {
		this.absNwt = absNwt;
	}

	public Double getAbsVol() {
		return this.absVol;
	}

	public void setAbsVol(Double absVol) {
		this.absVol = absVol;
	}

	public String getAbsWtUm() {
		return this.absWtUm;
	}

	public void setAbsWtUm(String absWtUm) {
		this.absWtUm = absWtUm;
	}

	public String getAbsVolUm() {
		return this.absVolUm;
	}

	public void setAbsVolUm(String absVolUm) {
		this.absVolUm = absVolUm;
	}

	public String getAbsDimUm() {
		return this.absDimUm;
	}

	public void setAbsDimUm(String absDimUm) {
		this.absDimUm = absDimUm;
	}

	public String getAbsFrClass() {
		return this.absFrClass;
	}

	public void setAbsFrClass(String absFrClass) {
		this.absFrClass = absFrClass;
	}

	public Double getAbsEstFcst() {
		return this.absEstFcst;
	}

	public void setAbsEstFcst(Double absEstFcst) {
		this.absEstFcst = absEstFcst;
	}

	public Double getAbsActFcst() {
		return this.absActFcst;
	}

	public void setAbsActFcst(Double absActFcst) {
		this.absActFcst = absActFcst;
	}

	public String getAbsFrCurr() {
		return this.absFrCurr;
	}

	public void setAbsFrCurr(String absFrCurr) {
		this.absFrCurr = absFrCurr;
	}

	public String getAbsDocData() {
		return this.absDocData;
	}

	public void setAbsDocData(String absDocData) {
		this.absDocData = absDocData;
	}

	public String getAbsDataset() {
		return this.absDataset;
	}

	public void setAbsDataset(String absDataset) {
		this.absDataset = absDataset;
	}

	public String getAbsOrder() {
		return this.absOrder;
	}

	public void setAbsOrder(String absOrder) {
		this.absOrder = absOrder;
	}

	public String getAbsLine() {
		return this.absLine;
	}

	public void setAbsLine(String absLine) {
		this.absLine = absLine;
	}

	public String getAbsInvNbr() {
		return this.absInvNbr;
	}

	public void setAbsInvNbr(String absInvNbr) {
		this.absInvNbr = absInvNbr;
	}

	public String getAbsItem() {
		return this.absItem;
	}

	public void setAbsItem(String absItem) {
		this.absItem = absItem;
	}

	public String getAbsLotser() {
		return this.absLotser;
	}

	public void setAbsLotser(String absLotser) {
		this.absLotser = absLotser;
	}

	public String getAbsRef() {
		return this.absRef;
	}

	public void setAbsRef(String absRef) {
		this.absRef = absRef;
	}

	public Double getAbsQty() {
		return this.absQty;
	}

	public void setAbsQty(Double absQty) {
		this.absQty = absQty;
	}

	public Double getAbsShipQty() {
		return this.absShipQty;
	}

	public void setAbsShipQty(Double absShipQty) {
		this.absShipQty = absShipQty;
	}

	public Double getAbsCumQty() {
		return this.absCumQty;
	}

	public void setAbsCumQty(Double absCumQty) {
		this.absCumQty = absCumQty;
	}

	public String getAbsSite() {
		return this.absSite;
	}

	public void setAbsSite(String absSite) {
		this.absSite = absSite;
	}

	public String getAbsLoc() {
		return this.absLoc;
	}

	public void setAbsLoc(String absLoc) {
		this.absLoc = absLoc;
	}

	public String getAbsCustRef() {
		return this.absCustRef;
	}

	public void setAbsCustRef(String absCustRef) {
		this.absCustRef = absCustRef;
	}

	public Integer getAbsCmtindx() {
		return this.absCmtindx;
	}

	public void setAbsCmtindx(Integer absCmtindx) {
		this.absCmtindx = absCmtindx;
	}

	public String getAbsChr01() {
		return this.absChr01;
	}

	public void setAbsChr01(String absChr01) {
		this.absChr01 = absChr01;
	}

	public String getAbsChr02() {
		return this.absChr02;
	}

	public void setAbsChr02(String absChr02) {
		this.absChr02 = absChr02;
	}

	public String getAbsChr03() {
		return this.absChr03;
	}

	public void setAbsChr03(String absChr03) {
		this.absChr03 = absChr03;
	}

	public String getAbsChr04() {
		return this.absChr04;
	}

	public void setAbsChr04(String absChr04) {
		this.absChr04 = absChr04;
	}

	public String getAbsChr05() {
		return this.absChr05;
	}

	public void setAbsChr05(String absChr05) {
		this.absChr05 = absChr05;
	}

	public String getAbsChr06() {
		return this.absChr06;
	}

	public void setAbsChr06(String absChr06) {
		this.absChr06 = absChr06;
	}

	public String getAbsChr07() {
		return this.absChr07;
	}

	public void setAbsChr07(String absChr07) {
		this.absChr07 = absChr07;
	}

	public String getAbsChr08() {
		return this.absChr08;
	}

	public void setAbsChr08(String absChr08) {
		this.absChr08 = absChr08;
	}

	public String getAbsChr09() {
		return this.absChr09;
	}

	public void setAbsChr09(String absChr09) {
		this.absChr09 = absChr09;
	}

	public String getAbsChr10() {
		return this.absChr10;
	}

	public void setAbsChr10(String absChr10) {
		this.absChr10 = absChr10;
	}

	public Double getAbsDec01() {
		return this.absDec01;
	}

	public void setAbsDec01(Double absDec01) {
		this.absDec01 = absDec01;
	}

	public Double getAbsDec02() {
		return this.absDec02;
	}

	public void setAbsDec02(Double absDec02) {
		this.absDec02 = absDec02;
	}

	public Double getAbsDec03() {
		return this.absDec03;
	}

	public void setAbsDec03(Double absDec03) {
		this.absDec03 = absDec03;
	}

	public Double getAbsDec04() {
		return this.absDec04;
	}

	public void setAbsDec04(Double absDec04) {
		this.absDec04 = absDec04;
	}

	public Double getAbsDec05() {
		return this.absDec05;
	}

	public void setAbsDec05(Double absDec05) {
		this.absDec05 = absDec05;
	}

	public Double getAbsDec06() {
		return this.absDec06;
	}

	public void setAbsDec06(Double absDec06) {
		this.absDec06 = absDec06;
	}

	public Double getAbsDec07() {
		return this.absDec07;
	}

	public void setAbsDec07(Double absDec07) {
		this.absDec07 = absDec07;
	}

	public Double getAbsDec08() {
		return this.absDec08;
	}

	public void setAbsDec08(Double absDec08) {
		this.absDec08 = absDec08;
	}

	public Double getAbsDec09() {
		return this.absDec09;
	}

	public void setAbsDec09(Double absDec09) {
		this.absDec09 = absDec09;
	}

	public Double getAbsDec10() {
		return this.absDec10;
	}

	public void setAbsDec10(Double absDec10) {
		this.absDec10 = absDec10;
	}

	public String getAbsQad01() {
		return this.absQad01;
	}

	public void setAbsQad01(String absQad01) {
		this.absQad01 = absQad01;
	}

	public String getAbsQad02() {
		return this.absQad02;
	}

	public void setAbsQad02(String absQad02) {
		this.absQad02 = absQad02;
	}

	public String getAbsQad03() {
		return this.absQad03;
	}

	public void setAbsQad03(String absQad03) {
		this.absQad03 = absQad03;
	}

	public String getAbsQad04() {
		return this.absQad04;
	}

	public void setAbsQad04(String absQad04) {
		this.absQad04 = absQad04;
	}

	public String getAbsQad05() {
		return this.absQad05;
	}

	public void setAbsQad05(String absQad05) {
		this.absQad05 = absQad05;
	}

	public String getAbsQad06() {
		return this.absQad06;
	}

	public void setAbsQad06(String absQad06) {
		this.absQad06 = absQad06;
	}

	public String getAbsQad07() {
		return this.absQad07;
	}

	public void setAbsQad07(String absQad07) {
		this.absQad07 = absQad07;
	}

	public String getAbsQad08() {
		return this.absQad08;
	}

	public void setAbsQad08(String absQad08) {
		this.absQad08 = absQad08;
	}

	public String getAbsQad09() {
		return this.absQad09;
	}

	public void setAbsQad09(String absQad09) {
		this.absQad09 = absQad09;
	}

	public String getAbsQad10() {
		return this.absQad10;
	}

	public void setAbsQad10(String absQad10) {
		this.absQad10 = absQad10;
	}

	public String getAbsUser1() {
		return this.absUser1;
	}

	public void setAbsUser1(String absUser1) {
		this.absUser1 = absUser1;
	}

	public String getAbsUser2() {
		return this.absUser2;
	}

	public void setAbsUser2(String absUser2) {
		this.absUser2 = absUser2;
	}

	public String getAbsMasterId() {
		return this.absMasterId;
	}

	public void setAbsMasterId(String absMasterId) {
		this.absMasterId = absMasterId;
	}

	public String getAbsInvMov() {
		return this.absInvMov;
	}

	public void setAbsInvMov(String absInvMov) {
		this.absInvMov = absInvMov;
	}

	public String getAbsNrId() {
		return this.absNrId;
	}

	public void setAbsNrId(String absNrId) {
		this.absNrId = absNrId;
	}

	public String getAbsFormat() {
		return this.absFormat;
	}

	public void setAbsFormat(String absFormat) {
		this.absFormat = absFormat;
	}

	public String getAbsConsShip() {
		return this.absConsShip;
	}

	public void setAbsConsShip(String absConsShip) {
		this.absConsShip = absConsShip;
	}

	public String getAbsQadc01() {
		return this.absQadc01;
	}

	public void setAbsQadc01(String absQadc01) {
		this.absQadc01 = absQadc01;
	}

	public String getAbsLang() {
		return this.absLang;
	}

	public void setAbsLang(String absLang) {
		this.absLang = absLang;
	}

	public Boolean getAbsCanceled() {
		return this.absCanceled;
	}

	public void setAbsCanceled(Boolean absCanceled) {
		this.absCanceled = absCanceled;
	}

	public Double getAbsQadd01() {
		return this.absQadd01;
	}

	public void setAbsQadd01(Double absQadd01) {
		this.absQadd01 = absQadd01;
	}

	public Integer getAbsTrlCmtindx() {
		return this.absTrlCmtindx;
	}

	public void setAbsTrlCmtindx(Integer absTrlCmtindx) {
		this.absTrlCmtindx = absTrlCmtindx;
	}

	public Date getAbsEffDate() {
		return this.absEffDate;
	}

	public void setAbsEffDate(Date absEffDate) {
		this.absEffDate = absEffDate;
	}

	public Date getAbsCancelDate() {
		return this.absCancelDate;
	}

	public void setAbsCancelDate(Date absCancelDate) {
		this.absCancelDate = absCancelDate;
	}

	public String getAbsPreshipNrId() {
		return this.absPreshipNrId;
	}

	public void setAbsPreshipNrId(String absPreshipNrId) {
		this.absPreshipNrId = absPreshipNrId;
	}

	public String getAbsPreshipId() {
		return this.absPreshipId;
	}

	public void setAbsPreshipId(String absPreshipId) {
		this.absPreshipId = absPreshipId;
	}

	public String getAbsFaLot() {
		return this.absFaLot;
	}

	public void setAbsFaLot(String absFaLot) {
		this.absFaLot = absFaLot;
	}

	public Date getAbsAsnCrtDate() {
		return this.absAsnCrtDate;
	}

	public void setAbsAsnCrtDate(Date absAsnCrtDate) {
		this.absAsnCrtDate = absAsnCrtDate;
	}

	public Integer getAbsAsnCrtTime() {
		return this.absAsnCrtTime;
	}

	public void setAbsAsnCrtTime(Integer absAsnCrtTime) {
		this.absAsnCrtTime = absAsnCrtTime;
	}

	public Integer getAbsExportBatch() {
		return this.absExportBatch;
	}

	public void setAbsExportBatch(Integer absExportBatch) {
		this.absExportBatch = absExportBatch;
	}

	public Date getAbsExportDate() {
		return this.absExportDate;
	}

	public void setAbsExportDate(Date absExportDate) {
		this.absExportDate = absExportDate;
	}

	public Integer getAbsExportTime() {
		return this.absExportTime;
	}

	public void setAbsExportTime(Integer absExportTime) {
		this.absExportTime = absExportTime;
	}

	public String getAbsChargeType() {
		return this.absChargeType;
	}

	public void setAbsChargeType(String absChargeType) {
		this.absChargeType = absChargeType;
	}

	public Double getAbsPrice() {
		return this.absPrice;
	}

	public void setAbsPrice(Double absPrice) {
		this.absPrice = absPrice;
	}

	public String getAbsDesc() {
		return this.absDesc;
	}

	public void setAbsDesc(String absDesc) {
		this.absDesc = absDesc;
	}

	public String getAbsMasterShipfrom() {
		return this.absMasterShipfrom;
	}

	public void setAbsMasterShipfrom(String absMasterShipfrom) {
		this.absMasterShipfrom = absMasterShipfrom;
	}

	public Double getOidAbsMstr() {
		return this.oidAbsMstr;
	}

	public void setOidAbsMstr(Double oidAbsMstr) {
		this.oidAbsMstr = oidAbsMstr;
	}

}