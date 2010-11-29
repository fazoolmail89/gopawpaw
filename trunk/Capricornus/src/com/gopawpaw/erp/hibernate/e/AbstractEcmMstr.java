package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcmMstr entity provides the base persistence definition of the
 * EcmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcmMstr implements java.io.Serializable {

	// Fields

	private EcmMstrId id;
	private Date ecmDate;
	private String ecmInit;
	private String ecmCmmt;
	private Double ecmQad01;
	private String ecmQad02;
	private String ecmUser1;
	private String ecmUser2;
	private Integer ecmCmtindx;
	private String ecmUserid;
	private Date ecmModDate;
	private Date ecmEffDate;
	private Date ecmManDate;
	private Date ecmSubDate;
	private Date ecmEndDate;
	private Date ecmRelDate;
	private String ecmTitle;
	private String ecmApproval;
	private String ecmDistr;
	private Boolean ecmReplan;
	private String ecmType;
	private String ecmStatus;
	private String ecmNbrFr;
	private String ecmNbrTo;
	private Double ecmExpCost;
	private String ecmName;
	private String ecmAssign;
	private Date ecmOpenDate;
	private Date ecmCloseDate;
	private String ecmEcrDspn;
	private Boolean ecmQad03;
	private Date ecmQad04;
	private Double ecmQad05;
	private String ecmQad06;
	private String ecmQad07;
	private String ecmSecureText;
	private String ecmSecureItem;
	private String ecmSecureStct;
	private String ecmSecureRouting;
	private String ecmSecureAdmn;
	private Boolean ecmSeqrevOff;
	private Date ecmApprDate;
	private Date ecmSelectedEff;
	private Boolean ecmBatched;
	private Boolean ecmReprocess;
	private String ecmDocType;
	private Double oidEcmMstr;

	// Constructors

	/** default constructor */
	public AbstractEcmMstr() {
	}

	/** minimal constructor */
	public AbstractEcmMstr(EcmMstrId id, Double oidEcmMstr) {
		this.id = id;
		this.oidEcmMstr = oidEcmMstr;
	}

	/** full constructor */
	public AbstractEcmMstr(EcmMstrId id, Date ecmDate, String ecmInit,
			String ecmCmmt, Double ecmQad01, String ecmQad02, String ecmUser1,
			String ecmUser2, Integer ecmCmtindx, String ecmUserid,
			Date ecmModDate, Date ecmEffDate, Date ecmManDate, Date ecmSubDate,
			Date ecmEndDate, Date ecmRelDate, String ecmTitle,
			String ecmApproval, String ecmDistr, Boolean ecmReplan,
			String ecmType, String ecmStatus, String ecmNbrFr, String ecmNbrTo,
			Double ecmExpCost, String ecmName, String ecmAssign,
			Date ecmOpenDate, Date ecmCloseDate, String ecmEcrDspn,
			Boolean ecmQad03, Date ecmQad04, Double ecmQad05, String ecmQad06,
			String ecmQad07, String ecmSecureText, String ecmSecureItem,
			String ecmSecureStct, String ecmSecureRouting,
			String ecmSecureAdmn, Boolean ecmSeqrevOff, Date ecmApprDate,
			Date ecmSelectedEff, Boolean ecmBatched, Boolean ecmReprocess,
			String ecmDocType, Double oidEcmMstr) {
		this.id = id;
		this.ecmDate = ecmDate;
		this.ecmInit = ecmInit;
		this.ecmCmmt = ecmCmmt;
		this.ecmQad01 = ecmQad01;
		this.ecmQad02 = ecmQad02;
		this.ecmUser1 = ecmUser1;
		this.ecmUser2 = ecmUser2;
		this.ecmCmtindx = ecmCmtindx;
		this.ecmUserid = ecmUserid;
		this.ecmModDate = ecmModDate;
		this.ecmEffDate = ecmEffDate;
		this.ecmManDate = ecmManDate;
		this.ecmSubDate = ecmSubDate;
		this.ecmEndDate = ecmEndDate;
		this.ecmRelDate = ecmRelDate;
		this.ecmTitle = ecmTitle;
		this.ecmApproval = ecmApproval;
		this.ecmDistr = ecmDistr;
		this.ecmReplan = ecmReplan;
		this.ecmType = ecmType;
		this.ecmStatus = ecmStatus;
		this.ecmNbrFr = ecmNbrFr;
		this.ecmNbrTo = ecmNbrTo;
		this.ecmExpCost = ecmExpCost;
		this.ecmName = ecmName;
		this.ecmAssign = ecmAssign;
		this.ecmOpenDate = ecmOpenDate;
		this.ecmCloseDate = ecmCloseDate;
		this.ecmEcrDspn = ecmEcrDspn;
		this.ecmQad03 = ecmQad03;
		this.ecmQad04 = ecmQad04;
		this.ecmQad05 = ecmQad05;
		this.ecmQad06 = ecmQad06;
		this.ecmQad07 = ecmQad07;
		this.ecmSecureText = ecmSecureText;
		this.ecmSecureItem = ecmSecureItem;
		this.ecmSecureStct = ecmSecureStct;
		this.ecmSecureRouting = ecmSecureRouting;
		this.ecmSecureAdmn = ecmSecureAdmn;
		this.ecmSeqrevOff = ecmSeqrevOff;
		this.ecmApprDate = ecmApprDate;
		this.ecmSelectedEff = ecmSelectedEff;
		this.ecmBatched = ecmBatched;
		this.ecmReprocess = ecmReprocess;
		this.ecmDocType = ecmDocType;
		this.oidEcmMstr = oidEcmMstr;
	}

	// Property accessors

	public EcmMstrId getId() {
		return this.id;
	}

	public void setId(EcmMstrId id) {
		this.id = id;
	}

	public Date getEcmDate() {
		return this.ecmDate;
	}

	public void setEcmDate(Date ecmDate) {
		this.ecmDate = ecmDate;
	}

	public String getEcmInit() {
		return this.ecmInit;
	}

	public void setEcmInit(String ecmInit) {
		this.ecmInit = ecmInit;
	}

	public String getEcmCmmt() {
		return this.ecmCmmt;
	}

	public void setEcmCmmt(String ecmCmmt) {
		this.ecmCmmt = ecmCmmt;
	}

	public Double getEcmQad01() {
		return this.ecmQad01;
	}

	public void setEcmQad01(Double ecmQad01) {
		this.ecmQad01 = ecmQad01;
	}

	public String getEcmQad02() {
		return this.ecmQad02;
	}

	public void setEcmQad02(String ecmQad02) {
		this.ecmQad02 = ecmQad02;
	}

	public String getEcmUser1() {
		return this.ecmUser1;
	}

	public void setEcmUser1(String ecmUser1) {
		this.ecmUser1 = ecmUser1;
	}

	public String getEcmUser2() {
		return this.ecmUser2;
	}

	public void setEcmUser2(String ecmUser2) {
		this.ecmUser2 = ecmUser2;
	}

	public Integer getEcmCmtindx() {
		return this.ecmCmtindx;
	}

	public void setEcmCmtindx(Integer ecmCmtindx) {
		this.ecmCmtindx = ecmCmtindx;
	}

	public String getEcmUserid() {
		return this.ecmUserid;
	}

	public void setEcmUserid(String ecmUserid) {
		this.ecmUserid = ecmUserid;
	}

	public Date getEcmModDate() {
		return this.ecmModDate;
	}

	public void setEcmModDate(Date ecmModDate) {
		this.ecmModDate = ecmModDate;
	}

	public Date getEcmEffDate() {
		return this.ecmEffDate;
	}

	public void setEcmEffDate(Date ecmEffDate) {
		this.ecmEffDate = ecmEffDate;
	}

	public Date getEcmManDate() {
		return this.ecmManDate;
	}

	public void setEcmManDate(Date ecmManDate) {
		this.ecmManDate = ecmManDate;
	}

	public Date getEcmSubDate() {
		return this.ecmSubDate;
	}

	public void setEcmSubDate(Date ecmSubDate) {
		this.ecmSubDate = ecmSubDate;
	}

	public Date getEcmEndDate() {
		return this.ecmEndDate;
	}

	public void setEcmEndDate(Date ecmEndDate) {
		this.ecmEndDate = ecmEndDate;
	}

	public Date getEcmRelDate() {
		return this.ecmRelDate;
	}

	public void setEcmRelDate(Date ecmRelDate) {
		this.ecmRelDate = ecmRelDate;
	}

	public String getEcmTitle() {
		return this.ecmTitle;
	}

	public void setEcmTitle(String ecmTitle) {
		this.ecmTitle = ecmTitle;
	}

	public String getEcmApproval() {
		return this.ecmApproval;
	}

	public void setEcmApproval(String ecmApproval) {
		this.ecmApproval = ecmApproval;
	}

	public String getEcmDistr() {
		return this.ecmDistr;
	}

	public void setEcmDistr(String ecmDistr) {
		this.ecmDistr = ecmDistr;
	}

	public Boolean getEcmReplan() {
		return this.ecmReplan;
	}

	public void setEcmReplan(Boolean ecmReplan) {
		this.ecmReplan = ecmReplan;
	}

	public String getEcmType() {
		return this.ecmType;
	}

	public void setEcmType(String ecmType) {
		this.ecmType = ecmType;
	}

	public String getEcmStatus() {
		return this.ecmStatus;
	}

	public void setEcmStatus(String ecmStatus) {
		this.ecmStatus = ecmStatus;
	}

	public String getEcmNbrFr() {
		return this.ecmNbrFr;
	}

	public void setEcmNbrFr(String ecmNbrFr) {
		this.ecmNbrFr = ecmNbrFr;
	}

	public String getEcmNbrTo() {
		return this.ecmNbrTo;
	}

	public void setEcmNbrTo(String ecmNbrTo) {
		this.ecmNbrTo = ecmNbrTo;
	}

	public Double getEcmExpCost() {
		return this.ecmExpCost;
	}

	public void setEcmExpCost(Double ecmExpCost) {
		this.ecmExpCost = ecmExpCost;
	}

	public String getEcmName() {
		return this.ecmName;
	}

	public void setEcmName(String ecmName) {
		this.ecmName = ecmName;
	}

	public String getEcmAssign() {
		return this.ecmAssign;
	}

	public void setEcmAssign(String ecmAssign) {
		this.ecmAssign = ecmAssign;
	}

	public Date getEcmOpenDate() {
		return this.ecmOpenDate;
	}

	public void setEcmOpenDate(Date ecmOpenDate) {
		this.ecmOpenDate = ecmOpenDate;
	}

	public Date getEcmCloseDate() {
		return this.ecmCloseDate;
	}

	public void setEcmCloseDate(Date ecmCloseDate) {
		this.ecmCloseDate = ecmCloseDate;
	}

	public String getEcmEcrDspn() {
		return this.ecmEcrDspn;
	}

	public void setEcmEcrDspn(String ecmEcrDspn) {
		this.ecmEcrDspn = ecmEcrDspn;
	}

	public Boolean getEcmQad03() {
		return this.ecmQad03;
	}

	public void setEcmQad03(Boolean ecmQad03) {
		this.ecmQad03 = ecmQad03;
	}

	public Date getEcmQad04() {
		return this.ecmQad04;
	}

	public void setEcmQad04(Date ecmQad04) {
		this.ecmQad04 = ecmQad04;
	}

	public Double getEcmQad05() {
		return this.ecmQad05;
	}

	public void setEcmQad05(Double ecmQad05) {
		this.ecmQad05 = ecmQad05;
	}

	public String getEcmQad06() {
		return this.ecmQad06;
	}

	public void setEcmQad06(String ecmQad06) {
		this.ecmQad06 = ecmQad06;
	}

	public String getEcmQad07() {
		return this.ecmQad07;
	}

	public void setEcmQad07(String ecmQad07) {
		this.ecmQad07 = ecmQad07;
	}

	public String getEcmSecureText() {
		return this.ecmSecureText;
	}

	public void setEcmSecureText(String ecmSecureText) {
		this.ecmSecureText = ecmSecureText;
	}

	public String getEcmSecureItem() {
		return this.ecmSecureItem;
	}

	public void setEcmSecureItem(String ecmSecureItem) {
		this.ecmSecureItem = ecmSecureItem;
	}

	public String getEcmSecureStct() {
		return this.ecmSecureStct;
	}

	public void setEcmSecureStct(String ecmSecureStct) {
		this.ecmSecureStct = ecmSecureStct;
	}

	public String getEcmSecureRouting() {
		return this.ecmSecureRouting;
	}

	public void setEcmSecureRouting(String ecmSecureRouting) {
		this.ecmSecureRouting = ecmSecureRouting;
	}

	public String getEcmSecureAdmn() {
		return this.ecmSecureAdmn;
	}

	public void setEcmSecureAdmn(String ecmSecureAdmn) {
		this.ecmSecureAdmn = ecmSecureAdmn;
	}

	public Boolean getEcmSeqrevOff() {
		return this.ecmSeqrevOff;
	}

	public void setEcmSeqrevOff(Boolean ecmSeqrevOff) {
		this.ecmSeqrevOff = ecmSeqrevOff;
	}

	public Date getEcmApprDate() {
		return this.ecmApprDate;
	}

	public void setEcmApprDate(Date ecmApprDate) {
		this.ecmApprDate = ecmApprDate;
	}

	public Date getEcmSelectedEff() {
		return this.ecmSelectedEff;
	}

	public void setEcmSelectedEff(Date ecmSelectedEff) {
		this.ecmSelectedEff = ecmSelectedEff;
	}

	public Boolean getEcmBatched() {
		return this.ecmBatched;
	}

	public void setEcmBatched(Boolean ecmBatched) {
		this.ecmBatched = ecmBatched;
	}

	public Boolean getEcmReprocess() {
		return this.ecmReprocess;
	}

	public void setEcmReprocess(Boolean ecmReprocess) {
		this.ecmReprocess = ecmReprocess;
	}

	public String getEcmDocType() {
		return this.ecmDocType;
	}

	public void setEcmDocType(String ecmDocType) {
		this.ecmDocType = ecmDocType;
	}

	public Double getOidEcmMstr() {
		return this.oidEcmMstr;
	}

	public void setOidEcmMstr(Double oidEcmMstr) {
		this.oidEcmMstr = oidEcmMstr;
	}

}