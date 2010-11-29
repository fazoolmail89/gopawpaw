package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVepMstr entity provides the base persistence definition of the
 * VepMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVepMstr implements java.io.Serializable {

	// Fields

	private VepMstrId id;
	private String vepOrderSource;
	private String vepNbr;
	private String vepReqNbr;
	private Integer vepLine;
	private String vepReceiver;
	private String vepAbsId;
	private String vepPart;
	private String vepUm;
	private String vepCommCode;
	private String vepAcct;
	private String vepCc;
	private String vepBuyer;
	private Date vepPerDate;
	private String vepLotser;
	private String vepType;
	private String vepRcpType;
	private String vepFsmType;
	private Double vepPurCost;
	private Double vepDiscPct;
	private Date vepRcpDate;
	private Integer vepRcpTime;
	private Double vepQtyOrd;
	private Double vepOpenQty;
	private Double vepRcvdQty;
	private String vepLoc;
	private String vepRef;
	private Date vepAsnArrDate;
	private Integer vepAsnArrTime;
	private Date vepAsnShipDate;
	private Integer vepAsnShipTime;
	private Double vepAsnShipQty;
	private Date vepAsnCreateDate;
	private Integer vepAsnCreateTime;
	private Boolean vepTempMissedFlag;
	private Boolean vepPodSched;
	private String vepDb;
	private String vepSubType;
	private String vepModUserid;
	private Date vepModDate;
	private String vepUser1;
	private String vepUser2;
	private String vepUser3;
	private String vepUser4;
	private String vepQadc01;
	private String vepQadc02;
	private String vepQadc03;
	private String vepQadc04;
	private Double vepQadd01;
	private Double vepQadd02;
	private Boolean vepQadl01;
	private Boolean vepQadl02;
	private Date vepQadt01;
	private Date vepQadt02;
	private Integer vepQadi01;
	private Integer vepQadi02;
	private String vepSub;
	private Double oidVepMstr;

	// Constructors

	/** default constructor */
	public AbstractVepMstr() {
	}

	/** minimal constructor */
	public AbstractVepMstr(VepMstrId id, Double oidVepMstr) {
		this.id = id;
		this.oidVepMstr = oidVepMstr;
	}

	/** full constructor */
	public AbstractVepMstr(VepMstrId id, String vepOrderSource, String vepNbr,
			String vepReqNbr, Integer vepLine, String vepReceiver,
			String vepAbsId, String vepPart, String vepUm, String vepCommCode,
			String vepAcct, String vepCc, String vepBuyer, Date vepPerDate,
			String vepLotser, String vepType, String vepRcpType,
			String vepFsmType, Double vepPurCost, Double vepDiscPct,
			Date vepRcpDate, Integer vepRcpTime, Double vepQtyOrd,
			Double vepOpenQty, Double vepRcvdQty, String vepLoc, String vepRef,
			Date vepAsnArrDate, Integer vepAsnArrTime, Date vepAsnShipDate,
			Integer vepAsnShipTime, Double vepAsnShipQty,
			Date vepAsnCreateDate, Integer vepAsnCreateTime,
			Boolean vepTempMissedFlag, Boolean vepPodSched, String vepDb,
			String vepSubType, String vepModUserid, Date vepModDate,
			String vepUser1, String vepUser2, String vepUser3, String vepUser4,
			String vepQadc01, String vepQadc02, String vepQadc03,
			String vepQadc04, Double vepQadd01, Double vepQadd02,
			Boolean vepQadl01, Boolean vepQadl02, Date vepQadt01,
			Date vepQadt02, Integer vepQadi01, Integer vepQadi02,
			String vepSub, Double oidVepMstr) {
		this.id = id;
		this.vepOrderSource = vepOrderSource;
		this.vepNbr = vepNbr;
		this.vepReqNbr = vepReqNbr;
		this.vepLine = vepLine;
		this.vepReceiver = vepReceiver;
		this.vepAbsId = vepAbsId;
		this.vepPart = vepPart;
		this.vepUm = vepUm;
		this.vepCommCode = vepCommCode;
		this.vepAcct = vepAcct;
		this.vepCc = vepCc;
		this.vepBuyer = vepBuyer;
		this.vepPerDate = vepPerDate;
		this.vepLotser = vepLotser;
		this.vepType = vepType;
		this.vepRcpType = vepRcpType;
		this.vepFsmType = vepFsmType;
		this.vepPurCost = vepPurCost;
		this.vepDiscPct = vepDiscPct;
		this.vepRcpDate = vepRcpDate;
		this.vepRcpTime = vepRcpTime;
		this.vepQtyOrd = vepQtyOrd;
		this.vepOpenQty = vepOpenQty;
		this.vepRcvdQty = vepRcvdQty;
		this.vepLoc = vepLoc;
		this.vepRef = vepRef;
		this.vepAsnArrDate = vepAsnArrDate;
		this.vepAsnArrTime = vepAsnArrTime;
		this.vepAsnShipDate = vepAsnShipDate;
		this.vepAsnShipTime = vepAsnShipTime;
		this.vepAsnShipQty = vepAsnShipQty;
		this.vepAsnCreateDate = vepAsnCreateDate;
		this.vepAsnCreateTime = vepAsnCreateTime;
		this.vepTempMissedFlag = vepTempMissedFlag;
		this.vepPodSched = vepPodSched;
		this.vepDb = vepDb;
		this.vepSubType = vepSubType;
		this.vepModUserid = vepModUserid;
		this.vepModDate = vepModDate;
		this.vepUser1 = vepUser1;
		this.vepUser2 = vepUser2;
		this.vepUser3 = vepUser3;
		this.vepUser4 = vepUser4;
		this.vepQadc01 = vepQadc01;
		this.vepQadc02 = vepQadc02;
		this.vepQadc03 = vepQadc03;
		this.vepQadc04 = vepQadc04;
		this.vepQadd01 = vepQadd01;
		this.vepQadd02 = vepQadd02;
		this.vepQadl01 = vepQadl01;
		this.vepQadl02 = vepQadl02;
		this.vepQadt01 = vepQadt01;
		this.vepQadt02 = vepQadt02;
		this.vepQadi01 = vepQadi01;
		this.vepQadi02 = vepQadi02;
		this.vepSub = vepSub;
		this.oidVepMstr = oidVepMstr;
	}

	// Property accessors

	public VepMstrId getId() {
		return this.id;
	}

	public void setId(VepMstrId id) {
		this.id = id;
	}

	public String getVepOrderSource() {
		return this.vepOrderSource;
	}

	public void setVepOrderSource(String vepOrderSource) {
		this.vepOrderSource = vepOrderSource;
	}

	public String getVepNbr() {
		return this.vepNbr;
	}

	public void setVepNbr(String vepNbr) {
		this.vepNbr = vepNbr;
	}

	public String getVepReqNbr() {
		return this.vepReqNbr;
	}

	public void setVepReqNbr(String vepReqNbr) {
		this.vepReqNbr = vepReqNbr;
	}

	public Integer getVepLine() {
		return this.vepLine;
	}

	public void setVepLine(Integer vepLine) {
		this.vepLine = vepLine;
	}

	public String getVepReceiver() {
		return this.vepReceiver;
	}

	public void setVepReceiver(String vepReceiver) {
		this.vepReceiver = vepReceiver;
	}

	public String getVepAbsId() {
		return this.vepAbsId;
	}

	public void setVepAbsId(String vepAbsId) {
		this.vepAbsId = vepAbsId;
	}

	public String getVepPart() {
		return this.vepPart;
	}

	public void setVepPart(String vepPart) {
		this.vepPart = vepPart;
	}

	public String getVepUm() {
		return this.vepUm;
	}

	public void setVepUm(String vepUm) {
		this.vepUm = vepUm;
	}

	public String getVepCommCode() {
		return this.vepCommCode;
	}

	public void setVepCommCode(String vepCommCode) {
		this.vepCommCode = vepCommCode;
	}

	public String getVepAcct() {
		return this.vepAcct;
	}

	public void setVepAcct(String vepAcct) {
		this.vepAcct = vepAcct;
	}

	public String getVepCc() {
		return this.vepCc;
	}

	public void setVepCc(String vepCc) {
		this.vepCc = vepCc;
	}

	public String getVepBuyer() {
		return this.vepBuyer;
	}

	public void setVepBuyer(String vepBuyer) {
		this.vepBuyer = vepBuyer;
	}

	public Date getVepPerDate() {
		return this.vepPerDate;
	}

	public void setVepPerDate(Date vepPerDate) {
		this.vepPerDate = vepPerDate;
	}

	public String getVepLotser() {
		return this.vepLotser;
	}

	public void setVepLotser(String vepLotser) {
		this.vepLotser = vepLotser;
	}

	public String getVepType() {
		return this.vepType;
	}

	public void setVepType(String vepType) {
		this.vepType = vepType;
	}

	public String getVepRcpType() {
		return this.vepRcpType;
	}

	public void setVepRcpType(String vepRcpType) {
		this.vepRcpType = vepRcpType;
	}

	public String getVepFsmType() {
		return this.vepFsmType;
	}

	public void setVepFsmType(String vepFsmType) {
		this.vepFsmType = vepFsmType;
	}

	public Double getVepPurCost() {
		return this.vepPurCost;
	}

	public void setVepPurCost(Double vepPurCost) {
		this.vepPurCost = vepPurCost;
	}

	public Double getVepDiscPct() {
		return this.vepDiscPct;
	}

	public void setVepDiscPct(Double vepDiscPct) {
		this.vepDiscPct = vepDiscPct;
	}

	public Date getVepRcpDate() {
		return this.vepRcpDate;
	}

	public void setVepRcpDate(Date vepRcpDate) {
		this.vepRcpDate = vepRcpDate;
	}

	public Integer getVepRcpTime() {
		return this.vepRcpTime;
	}

	public void setVepRcpTime(Integer vepRcpTime) {
		this.vepRcpTime = vepRcpTime;
	}

	public Double getVepQtyOrd() {
		return this.vepQtyOrd;
	}

	public void setVepQtyOrd(Double vepQtyOrd) {
		this.vepQtyOrd = vepQtyOrd;
	}

	public Double getVepOpenQty() {
		return this.vepOpenQty;
	}

	public void setVepOpenQty(Double vepOpenQty) {
		this.vepOpenQty = vepOpenQty;
	}

	public Double getVepRcvdQty() {
		return this.vepRcvdQty;
	}

	public void setVepRcvdQty(Double vepRcvdQty) {
		this.vepRcvdQty = vepRcvdQty;
	}

	public String getVepLoc() {
		return this.vepLoc;
	}

	public void setVepLoc(String vepLoc) {
		this.vepLoc = vepLoc;
	}

	public String getVepRef() {
		return this.vepRef;
	}

	public void setVepRef(String vepRef) {
		this.vepRef = vepRef;
	}

	public Date getVepAsnArrDate() {
		return this.vepAsnArrDate;
	}

	public void setVepAsnArrDate(Date vepAsnArrDate) {
		this.vepAsnArrDate = vepAsnArrDate;
	}

	public Integer getVepAsnArrTime() {
		return this.vepAsnArrTime;
	}

	public void setVepAsnArrTime(Integer vepAsnArrTime) {
		this.vepAsnArrTime = vepAsnArrTime;
	}

	public Date getVepAsnShipDate() {
		return this.vepAsnShipDate;
	}

	public void setVepAsnShipDate(Date vepAsnShipDate) {
		this.vepAsnShipDate = vepAsnShipDate;
	}

	public Integer getVepAsnShipTime() {
		return this.vepAsnShipTime;
	}

	public void setVepAsnShipTime(Integer vepAsnShipTime) {
		this.vepAsnShipTime = vepAsnShipTime;
	}

	public Double getVepAsnShipQty() {
		return this.vepAsnShipQty;
	}

	public void setVepAsnShipQty(Double vepAsnShipQty) {
		this.vepAsnShipQty = vepAsnShipQty;
	}

	public Date getVepAsnCreateDate() {
		return this.vepAsnCreateDate;
	}

	public void setVepAsnCreateDate(Date vepAsnCreateDate) {
		this.vepAsnCreateDate = vepAsnCreateDate;
	}

	public Integer getVepAsnCreateTime() {
		return this.vepAsnCreateTime;
	}

	public void setVepAsnCreateTime(Integer vepAsnCreateTime) {
		this.vepAsnCreateTime = vepAsnCreateTime;
	}

	public Boolean getVepTempMissedFlag() {
		return this.vepTempMissedFlag;
	}

	public void setVepTempMissedFlag(Boolean vepTempMissedFlag) {
		this.vepTempMissedFlag = vepTempMissedFlag;
	}

	public Boolean getVepPodSched() {
		return this.vepPodSched;
	}

	public void setVepPodSched(Boolean vepPodSched) {
		this.vepPodSched = vepPodSched;
	}

	public String getVepDb() {
		return this.vepDb;
	}

	public void setVepDb(String vepDb) {
		this.vepDb = vepDb;
	}

	public String getVepSubType() {
		return this.vepSubType;
	}

	public void setVepSubType(String vepSubType) {
		this.vepSubType = vepSubType;
	}

	public String getVepModUserid() {
		return this.vepModUserid;
	}

	public void setVepModUserid(String vepModUserid) {
		this.vepModUserid = vepModUserid;
	}

	public Date getVepModDate() {
		return this.vepModDate;
	}

	public void setVepModDate(Date vepModDate) {
		this.vepModDate = vepModDate;
	}

	public String getVepUser1() {
		return this.vepUser1;
	}

	public void setVepUser1(String vepUser1) {
		this.vepUser1 = vepUser1;
	}

	public String getVepUser2() {
		return this.vepUser2;
	}

	public void setVepUser2(String vepUser2) {
		this.vepUser2 = vepUser2;
	}

	public String getVepUser3() {
		return this.vepUser3;
	}

	public void setVepUser3(String vepUser3) {
		this.vepUser3 = vepUser3;
	}

	public String getVepUser4() {
		return this.vepUser4;
	}

	public void setVepUser4(String vepUser4) {
		this.vepUser4 = vepUser4;
	}

	public String getVepQadc01() {
		return this.vepQadc01;
	}

	public void setVepQadc01(String vepQadc01) {
		this.vepQadc01 = vepQadc01;
	}

	public String getVepQadc02() {
		return this.vepQadc02;
	}

	public void setVepQadc02(String vepQadc02) {
		this.vepQadc02 = vepQadc02;
	}

	public String getVepQadc03() {
		return this.vepQadc03;
	}

	public void setVepQadc03(String vepQadc03) {
		this.vepQadc03 = vepQadc03;
	}

	public String getVepQadc04() {
		return this.vepQadc04;
	}

	public void setVepQadc04(String vepQadc04) {
		this.vepQadc04 = vepQadc04;
	}

	public Double getVepQadd01() {
		return this.vepQadd01;
	}

	public void setVepQadd01(Double vepQadd01) {
		this.vepQadd01 = vepQadd01;
	}

	public Double getVepQadd02() {
		return this.vepQadd02;
	}

	public void setVepQadd02(Double vepQadd02) {
		this.vepQadd02 = vepQadd02;
	}

	public Boolean getVepQadl01() {
		return this.vepQadl01;
	}

	public void setVepQadl01(Boolean vepQadl01) {
		this.vepQadl01 = vepQadl01;
	}

	public Boolean getVepQadl02() {
		return this.vepQadl02;
	}

	public void setVepQadl02(Boolean vepQadl02) {
		this.vepQadl02 = vepQadl02;
	}

	public Date getVepQadt01() {
		return this.vepQadt01;
	}

	public void setVepQadt01(Date vepQadt01) {
		this.vepQadt01 = vepQadt01;
	}

	public Date getVepQadt02() {
		return this.vepQadt02;
	}

	public void setVepQadt02(Date vepQadt02) {
		this.vepQadt02 = vepQadt02;
	}

	public Integer getVepQadi01() {
		return this.vepQadi01;
	}

	public void setVepQadi01(Integer vepQadi01) {
		this.vepQadi01 = vepQadi01;
	}

	public Integer getVepQadi02() {
		return this.vepQadi02;
	}

	public void setVepQadi02(Integer vepQadi02) {
		this.vepQadi02 = vepQadi02;
	}

	public String getVepSub() {
		return this.vepSub;
	}

	public void setVepSub(String vepSub) {
		this.vepSub = vepSub;
	}

	public Double getOidVepMstr() {
		return this.oidVepMstr;
	}

	public void setOidVepMstr(Double oidVepMstr) {
		this.oidVepMstr = oidVepMstr;
	}

}