package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractElgHist entity provides the base persistence definition of the
 * ElgHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractElgHist implements java.io.Serializable {

	// Fields

	private ElgHistId id;
	private String elgAccessCode;
	private String elgAppId;
	private String elgAppVer;
	private String elgArchiveId;
	private Integer elgCtrlTot1;
	private Double elgCtrlTot2;
	private Double elgCtrlTot3;
	private Date elgDateAck;
	private Date elgDateMap;
	private Date elgDatePubl;
	private Date elgDateSent;
	private String elgDestProc;
	private String elgDocLng;
	private String elgDocRev;
	private String elgDocStd;
	private String elgDocTyp;
	private String elgEmailUserid;
	private String elgEmailNotlvl;
	private String elgErrStat;
	private String elgExtDocKey;
	private String elgMfgproSite;
	private String elgMfgproKey;
	private String elgMapLogFile;
	private String elgMapSpec;
	private Date elgModDate;
	private String elgModUserid;
	private Integer elgOrigDocId;
	private Boolean elgAckRcvd;
	private String elgAckLvlReqd;
	private String elgAckStat;
	private String elgPrcgStage;
	private Integer elgSessId;
	private String elgSrcComp;
	private String elgSrcTask;
	private String elgSrcAppId;
	private String elgSrcAppVer;
	private String elgSrcDocRev;
	private String elgSrcDocStd;
	private String elgSrcDocTyp;
	private String elgSrcProc;
	private String elgSrcUserid;
	private String elgTimeAck;
	private String elgTimeMap;
	private String elgTimeSent;
	private String elgTimePubl;
	private String elgTradptrId;
	private Boolean elgUseExQueue;
	private Boolean elgMapDocNow;
	private String elgUnitWrkTyp;
	private Integer elgGrpId;
	private String elgCodePg;
	private String elgDateForm;
	private String elgNumForm;
	private String elgUser1;
	private String elgUser2;
	private Double elgDec01;
	private Double elgDec02;
	private Integer elgInt01;
	private Integer elgInt02;
	private Boolean elgLog01;
	private Boolean elgLog02;
	private Date elgDte01;
	private Date elgDte02;
	private String elgQadc01;
	private String elgQadc02;
	private String elgQadc03;
	private String elgQadc04;
	private Double elgQadd01;
	private Double elgQadd02;
	private Integer elgQadi01;
	private Integer elgQadi02;
	private Boolean elgQadl01;
	private Boolean elgQadl02;
	private Date elgQadt01;
	private Date elgQadt02;
	private Integer elgGrpSeq;
	private Boolean elgResend;
	private String elgMapperProc;
	private String elgDestMthd;
	private String elgProcessTyp;
	private Double oidElgHist;

	// Constructors

	/** default constructor */
	public AbstractElgHist() {
	}

	/** minimal constructor */
	public AbstractElgHist(ElgHistId id, Double oidElgHist) {
		this.id = id;
		this.oidElgHist = oidElgHist;
	}

	/** full constructor */
	public AbstractElgHist(ElgHistId id, String elgAccessCode, String elgAppId,
			String elgAppVer, String elgArchiveId, Integer elgCtrlTot1,
			Double elgCtrlTot2, Double elgCtrlTot3, Date elgDateAck,
			Date elgDateMap, Date elgDatePubl, Date elgDateSent,
			String elgDestProc, String elgDocLng, String elgDocRev,
			String elgDocStd, String elgDocTyp, String elgEmailUserid,
			String elgEmailNotlvl, String elgErrStat, String elgExtDocKey,
			String elgMfgproSite, String elgMfgproKey, String elgMapLogFile,
			String elgMapSpec, Date elgModDate, String elgModUserid,
			Integer elgOrigDocId, Boolean elgAckRcvd, String elgAckLvlReqd,
			String elgAckStat, String elgPrcgStage, Integer elgSessId,
			String elgSrcComp, String elgSrcTask, String elgSrcAppId,
			String elgSrcAppVer, String elgSrcDocRev, String elgSrcDocStd,
			String elgSrcDocTyp, String elgSrcProc, String elgSrcUserid,
			String elgTimeAck, String elgTimeMap, String elgTimeSent,
			String elgTimePubl, String elgTradptrId, Boolean elgUseExQueue,
			Boolean elgMapDocNow, String elgUnitWrkTyp, Integer elgGrpId,
			String elgCodePg, String elgDateForm, String elgNumForm,
			String elgUser1, String elgUser2, Double elgDec01, Double elgDec02,
			Integer elgInt01, Integer elgInt02, Boolean elgLog01,
			Boolean elgLog02, Date elgDte01, Date elgDte02, String elgQadc01,
			String elgQadc02, String elgQadc03, String elgQadc04,
			Double elgQadd01, Double elgQadd02, Integer elgQadi01,
			Integer elgQadi02, Boolean elgQadl01, Boolean elgQadl02,
			Date elgQadt01, Date elgQadt02, Integer elgGrpSeq,
			Boolean elgResend, String elgMapperProc, String elgDestMthd,
			String elgProcessTyp, Double oidElgHist) {
		this.id = id;
		this.elgAccessCode = elgAccessCode;
		this.elgAppId = elgAppId;
		this.elgAppVer = elgAppVer;
		this.elgArchiveId = elgArchiveId;
		this.elgCtrlTot1 = elgCtrlTot1;
		this.elgCtrlTot2 = elgCtrlTot2;
		this.elgCtrlTot3 = elgCtrlTot3;
		this.elgDateAck = elgDateAck;
		this.elgDateMap = elgDateMap;
		this.elgDatePubl = elgDatePubl;
		this.elgDateSent = elgDateSent;
		this.elgDestProc = elgDestProc;
		this.elgDocLng = elgDocLng;
		this.elgDocRev = elgDocRev;
		this.elgDocStd = elgDocStd;
		this.elgDocTyp = elgDocTyp;
		this.elgEmailUserid = elgEmailUserid;
		this.elgEmailNotlvl = elgEmailNotlvl;
		this.elgErrStat = elgErrStat;
		this.elgExtDocKey = elgExtDocKey;
		this.elgMfgproSite = elgMfgproSite;
		this.elgMfgproKey = elgMfgproKey;
		this.elgMapLogFile = elgMapLogFile;
		this.elgMapSpec = elgMapSpec;
		this.elgModDate = elgModDate;
		this.elgModUserid = elgModUserid;
		this.elgOrigDocId = elgOrigDocId;
		this.elgAckRcvd = elgAckRcvd;
		this.elgAckLvlReqd = elgAckLvlReqd;
		this.elgAckStat = elgAckStat;
		this.elgPrcgStage = elgPrcgStage;
		this.elgSessId = elgSessId;
		this.elgSrcComp = elgSrcComp;
		this.elgSrcTask = elgSrcTask;
		this.elgSrcAppId = elgSrcAppId;
		this.elgSrcAppVer = elgSrcAppVer;
		this.elgSrcDocRev = elgSrcDocRev;
		this.elgSrcDocStd = elgSrcDocStd;
		this.elgSrcDocTyp = elgSrcDocTyp;
		this.elgSrcProc = elgSrcProc;
		this.elgSrcUserid = elgSrcUserid;
		this.elgTimeAck = elgTimeAck;
		this.elgTimeMap = elgTimeMap;
		this.elgTimeSent = elgTimeSent;
		this.elgTimePubl = elgTimePubl;
		this.elgTradptrId = elgTradptrId;
		this.elgUseExQueue = elgUseExQueue;
		this.elgMapDocNow = elgMapDocNow;
		this.elgUnitWrkTyp = elgUnitWrkTyp;
		this.elgGrpId = elgGrpId;
		this.elgCodePg = elgCodePg;
		this.elgDateForm = elgDateForm;
		this.elgNumForm = elgNumForm;
		this.elgUser1 = elgUser1;
		this.elgUser2 = elgUser2;
		this.elgDec01 = elgDec01;
		this.elgDec02 = elgDec02;
		this.elgInt01 = elgInt01;
		this.elgInt02 = elgInt02;
		this.elgLog01 = elgLog01;
		this.elgLog02 = elgLog02;
		this.elgDte01 = elgDte01;
		this.elgDte02 = elgDte02;
		this.elgQadc01 = elgQadc01;
		this.elgQadc02 = elgQadc02;
		this.elgQadc03 = elgQadc03;
		this.elgQadc04 = elgQadc04;
		this.elgQadd01 = elgQadd01;
		this.elgQadd02 = elgQadd02;
		this.elgQadi01 = elgQadi01;
		this.elgQadi02 = elgQadi02;
		this.elgQadl01 = elgQadl01;
		this.elgQadl02 = elgQadl02;
		this.elgQadt01 = elgQadt01;
		this.elgQadt02 = elgQadt02;
		this.elgGrpSeq = elgGrpSeq;
		this.elgResend = elgResend;
		this.elgMapperProc = elgMapperProc;
		this.elgDestMthd = elgDestMthd;
		this.elgProcessTyp = elgProcessTyp;
		this.oidElgHist = oidElgHist;
	}

	// Property accessors

	public ElgHistId getId() {
		return this.id;
	}

	public void setId(ElgHistId id) {
		this.id = id;
	}

	public String getElgAccessCode() {
		return this.elgAccessCode;
	}

	public void setElgAccessCode(String elgAccessCode) {
		this.elgAccessCode = elgAccessCode;
	}

	public String getElgAppId() {
		return this.elgAppId;
	}

	public void setElgAppId(String elgAppId) {
		this.elgAppId = elgAppId;
	}

	public String getElgAppVer() {
		return this.elgAppVer;
	}

	public void setElgAppVer(String elgAppVer) {
		this.elgAppVer = elgAppVer;
	}

	public String getElgArchiveId() {
		return this.elgArchiveId;
	}

	public void setElgArchiveId(String elgArchiveId) {
		this.elgArchiveId = elgArchiveId;
	}

	public Integer getElgCtrlTot1() {
		return this.elgCtrlTot1;
	}

	public void setElgCtrlTot1(Integer elgCtrlTot1) {
		this.elgCtrlTot1 = elgCtrlTot1;
	}

	public Double getElgCtrlTot2() {
		return this.elgCtrlTot2;
	}

	public void setElgCtrlTot2(Double elgCtrlTot2) {
		this.elgCtrlTot2 = elgCtrlTot2;
	}

	public Double getElgCtrlTot3() {
		return this.elgCtrlTot3;
	}

	public void setElgCtrlTot3(Double elgCtrlTot3) {
		this.elgCtrlTot3 = elgCtrlTot3;
	}

	public Date getElgDateAck() {
		return this.elgDateAck;
	}

	public void setElgDateAck(Date elgDateAck) {
		this.elgDateAck = elgDateAck;
	}

	public Date getElgDateMap() {
		return this.elgDateMap;
	}

	public void setElgDateMap(Date elgDateMap) {
		this.elgDateMap = elgDateMap;
	}

	public Date getElgDatePubl() {
		return this.elgDatePubl;
	}

	public void setElgDatePubl(Date elgDatePubl) {
		this.elgDatePubl = elgDatePubl;
	}

	public Date getElgDateSent() {
		return this.elgDateSent;
	}

	public void setElgDateSent(Date elgDateSent) {
		this.elgDateSent = elgDateSent;
	}

	public String getElgDestProc() {
		return this.elgDestProc;
	}

	public void setElgDestProc(String elgDestProc) {
		this.elgDestProc = elgDestProc;
	}

	public String getElgDocLng() {
		return this.elgDocLng;
	}

	public void setElgDocLng(String elgDocLng) {
		this.elgDocLng = elgDocLng;
	}

	public String getElgDocRev() {
		return this.elgDocRev;
	}

	public void setElgDocRev(String elgDocRev) {
		this.elgDocRev = elgDocRev;
	}

	public String getElgDocStd() {
		return this.elgDocStd;
	}

	public void setElgDocStd(String elgDocStd) {
		this.elgDocStd = elgDocStd;
	}

	public String getElgDocTyp() {
		return this.elgDocTyp;
	}

	public void setElgDocTyp(String elgDocTyp) {
		this.elgDocTyp = elgDocTyp;
	}

	public String getElgEmailUserid() {
		return this.elgEmailUserid;
	}

	public void setElgEmailUserid(String elgEmailUserid) {
		this.elgEmailUserid = elgEmailUserid;
	}

	public String getElgEmailNotlvl() {
		return this.elgEmailNotlvl;
	}

	public void setElgEmailNotlvl(String elgEmailNotlvl) {
		this.elgEmailNotlvl = elgEmailNotlvl;
	}

	public String getElgErrStat() {
		return this.elgErrStat;
	}

	public void setElgErrStat(String elgErrStat) {
		this.elgErrStat = elgErrStat;
	}

	public String getElgExtDocKey() {
		return this.elgExtDocKey;
	}

	public void setElgExtDocKey(String elgExtDocKey) {
		this.elgExtDocKey = elgExtDocKey;
	}

	public String getElgMfgproSite() {
		return this.elgMfgproSite;
	}

	public void setElgMfgproSite(String elgMfgproSite) {
		this.elgMfgproSite = elgMfgproSite;
	}

	public String getElgMfgproKey() {
		return this.elgMfgproKey;
	}

	public void setElgMfgproKey(String elgMfgproKey) {
		this.elgMfgproKey = elgMfgproKey;
	}

	public String getElgMapLogFile() {
		return this.elgMapLogFile;
	}

	public void setElgMapLogFile(String elgMapLogFile) {
		this.elgMapLogFile = elgMapLogFile;
	}

	public String getElgMapSpec() {
		return this.elgMapSpec;
	}

	public void setElgMapSpec(String elgMapSpec) {
		this.elgMapSpec = elgMapSpec;
	}

	public Date getElgModDate() {
		return this.elgModDate;
	}

	public void setElgModDate(Date elgModDate) {
		this.elgModDate = elgModDate;
	}

	public String getElgModUserid() {
		return this.elgModUserid;
	}

	public void setElgModUserid(String elgModUserid) {
		this.elgModUserid = elgModUserid;
	}

	public Integer getElgOrigDocId() {
		return this.elgOrigDocId;
	}

	public void setElgOrigDocId(Integer elgOrigDocId) {
		this.elgOrigDocId = elgOrigDocId;
	}

	public Boolean getElgAckRcvd() {
		return this.elgAckRcvd;
	}

	public void setElgAckRcvd(Boolean elgAckRcvd) {
		this.elgAckRcvd = elgAckRcvd;
	}

	public String getElgAckLvlReqd() {
		return this.elgAckLvlReqd;
	}

	public void setElgAckLvlReqd(String elgAckLvlReqd) {
		this.elgAckLvlReqd = elgAckLvlReqd;
	}

	public String getElgAckStat() {
		return this.elgAckStat;
	}

	public void setElgAckStat(String elgAckStat) {
		this.elgAckStat = elgAckStat;
	}

	public String getElgPrcgStage() {
		return this.elgPrcgStage;
	}

	public void setElgPrcgStage(String elgPrcgStage) {
		this.elgPrcgStage = elgPrcgStage;
	}

	public Integer getElgSessId() {
		return this.elgSessId;
	}

	public void setElgSessId(Integer elgSessId) {
		this.elgSessId = elgSessId;
	}

	public String getElgSrcComp() {
		return this.elgSrcComp;
	}

	public void setElgSrcComp(String elgSrcComp) {
		this.elgSrcComp = elgSrcComp;
	}

	public String getElgSrcTask() {
		return this.elgSrcTask;
	}

	public void setElgSrcTask(String elgSrcTask) {
		this.elgSrcTask = elgSrcTask;
	}

	public String getElgSrcAppId() {
		return this.elgSrcAppId;
	}

	public void setElgSrcAppId(String elgSrcAppId) {
		this.elgSrcAppId = elgSrcAppId;
	}

	public String getElgSrcAppVer() {
		return this.elgSrcAppVer;
	}

	public void setElgSrcAppVer(String elgSrcAppVer) {
		this.elgSrcAppVer = elgSrcAppVer;
	}

	public String getElgSrcDocRev() {
		return this.elgSrcDocRev;
	}

	public void setElgSrcDocRev(String elgSrcDocRev) {
		this.elgSrcDocRev = elgSrcDocRev;
	}

	public String getElgSrcDocStd() {
		return this.elgSrcDocStd;
	}

	public void setElgSrcDocStd(String elgSrcDocStd) {
		this.elgSrcDocStd = elgSrcDocStd;
	}

	public String getElgSrcDocTyp() {
		return this.elgSrcDocTyp;
	}

	public void setElgSrcDocTyp(String elgSrcDocTyp) {
		this.elgSrcDocTyp = elgSrcDocTyp;
	}

	public String getElgSrcProc() {
		return this.elgSrcProc;
	}

	public void setElgSrcProc(String elgSrcProc) {
		this.elgSrcProc = elgSrcProc;
	}

	public String getElgSrcUserid() {
		return this.elgSrcUserid;
	}

	public void setElgSrcUserid(String elgSrcUserid) {
		this.elgSrcUserid = elgSrcUserid;
	}

	public String getElgTimeAck() {
		return this.elgTimeAck;
	}

	public void setElgTimeAck(String elgTimeAck) {
		this.elgTimeAck = elgTimeAck;
	}

	public String getElgTimeMap() {
		return this.elgTimeMap;
	}

	public void setElgTimeMap(String elgTimeMap) {
		this.elgTimeMap = elgTimeMap;
	}

	public String getElgTimeSent() {
		return this.elgTimeSent;
	}

	public void setElgTimeSent(String elgTimeSent) {
		this.elgTimeSent = elgTimeSent;
	}

	public String getElgTimePubl() {
		return this.elgTimePubl;
	}

	public void setElgTimePubl(String elgTimePubl) {
		this.elgTimePubl = elgTimePubl;
	}

	public String getElgTradptrId() {
		return this.elgTradptrId;
	}

	public void setElgTradptrId(String elgTradptrId) {
		this.elgTradptrId = elgTradptrId;
	}

	public Boolean getElgUseExQueue() {
		return this.elgUseExQueue;
	}

	public void setElgUseExQueue(Boolean elgUseExQueue) {
		this.elgUseExQueue = elgUseExQueue;
	}

	public Boolean getElgMapDocNow() {
		return this.elgMapDocNow;
	}

	public void setElgMapDocNow(Boolean elgMapDocNow) {
		this.elgMapDocNow = elgMapDocNow;
	}

	public String getElgUnitWrkTyp() {
		return this.elgUnitWrkTyp;
	}

	public void setElgUnitWrkTyp(String elgUnitWrkTyp) {
		this.elgUnitWrkTyp = elgUnitWrkTyp;
	}

	public Integer getElgGrpId() {
		return this.elgGrpId;
	}

	public void setElgGrpId(Integer elgGrpId) {
		this.elgGrpId = elgGrpId;
	}

	public String getElgCodePg() {
		return this.elgCodePg;
	}

	public void setElgCodePg(String elgCodePg) {
		this.elgCodePg = elgCodePg;
	}

	public String getElgDateForm() {
		return this.elgDateForm;
	}

	public void setElgDateForm(String elgDateForm) {
		this.elgDateForm = elgDateForm;
	}

	public String getElgNumForm() {
		return this.elgNumForm;
	}

	public void setElgNumForm(String elgNumForm) {
		this.elgNumForm = elgNumForm;
	}

	public String getElgUser1() {
		return this.elgUser1;
	}

	public void setElgUser1(String elgUser1) {
		this.elgUser1 = elgUser1;
	}

	public String getElgUser2() {
		return this.elgUser2;
	}

	public void setElgUser2(String elgUser2) {
		this.elgUser2 = elgUser2;
	}

	public Double getElgDec01() {
		return this.elgDec01;
	}

	public void setElgDec01(Double elgDec01) {
		this.elgDec01 = elgDec01;
	}

	public Double getElgDec02() {
		return this.elgDec02;
	}

	public void setElgDec02(Double elgDec02) {
		this.elgDec02 = elgDec02;
	}

	public Integer getElgInt01() {
		return this.elgInt01;
	}

	public void setElgInt01(Integer elgInt01) {
		this.elgInt01 = elgInt01;
	}

	public Integer getElgInt02() {
		return this.elgInt02;
	}

	public void setElgInt02(Integer elgInt02) {
		this.elgInt02 = elgInt02;
	}

	public Boolean getElgLog01() {
		return this.elgLog01;
	}

	public void setElgLog01(Boolean elgLog01) {
		this.elgLog01 = elgLog01;
	}

	public Boolean getElgLog02() {
		return this.elgLog02;
	}

	public void setElgLog02(Boolean elgLog02) {
		this.elgLog02 = elgLog02;
	}

	public Date getElgDte01() {
		return this.elgDte01;
	}

	public void setElgDte01(Date elgDte01) {
		this.elgDte01 = elgDte01;
	}

	public Date getElgDte02() {
		return this.elgDte02;
	}

	public void setElgDte02(Date elgDte02) {
		this.elgDte02 = elgDte02;
	}

	public String getElgQadc01() {
		return this.elgQadc01;
	}

	public void setElgQadc01(String elgQadc01) {
		this.elgQadc01 = elgQadc01;
	}

	public String getElgQadc02() {
		return this.elgQadc02;
	}

	public void setElgQadc02(String elgQadc02) {
		this.elgQadc02 = elgQadc02;
	}

	public String getElgQadc03() {
		return this.elgQadc03;
	}

	public void setElgQadc03(String elgQadc03) {
		this.elgQadc03 = elgQadc03;
	}

	public String getElgQadc04() {
		return this.elgQadc04;
	}

	public void setElgQadc04(String elgQadc04) {
		this.elgQadc04 = elgQadc04;
	}

	public Double getElgQadd01() {
		return this.elgQadd01;
	}

	public void setElgQadd01(Double elgQadd01) {
		this.elgQadd01 = elgQadd01;
	}

	public Double getElgQadd02() {
		return this.elgQadd02;
	}

	public void setElgQadd02(Double elgQadd02) {
		this.elgQadd02 = elgQadd02;
	}

	public Integer getElgQadi01() {
		return this.elgQadi01;
	}

	public void setElgQadi01(Integer elgQadi01) {
		this.elgQadi01 = elgQadi01;
	}

	public Integer getElgQadi02() {
		return this.elgQadi02;
	}

	public void setElgQadi02(Integer elgQadi02) {
		this.elgQadi02 = elgQadi02;
	}

	public Boolean getElgQadl01() {
		return this.elgQadl01;
	}

	public void setElgQadl01(Boolean elgQadl01) {
		this.elgQadl01 = elgQadl01;
	}

	public Boolean getElgQadl02() {
		return this.elgQadl02;
	}

	public void setElgQadl02(Boolean elgQadl02) {
		this.elgQadl02 = elgQadl02;
	}

	public Date getElgQadt01() {
		return this.elgQadt01;
	}

	public void setElgQadt01(Date elgQadt01) {
		this.elgQadt01 = elgQadt01;
	}

	public Date getElgQadt02() {
		return this.elgQadt02;
	}

	public void setElgQadt02(Date elgQadt02) {
		this.elgQadt02 = elgQadt02;
	}

	public Integer getElgGrpSeq() {
		return this.elgGrpSeq;
	}

	public void setElgGrpSeq(Integer elgGrpSeq) {
		this.elgGrpSeq = elgGrpSeq;
	}

	public Boolean getElgResend() {
		return this.elgResend;
	}

	public void setElgResend(Boolean elgResend) {
		this.elgResend = elgResend;
	}

	public String getElgMapperProc() {
		return this.elgMapperProc;
	}

	public void setElgMapperProc(String elgMapperProc) {
		this.elgMapperProc = elgMapperProc;
	}

	public String getElgDestMthd() {
		return this.elgDestMthd;
	}

	public void setElgDestMthd(String elgDestMthd) {
		this.elgDestMthd = elgDestMthd;
	}

	public String getElgProcessTyp() {
		return this.elgProcessTyp;
	}

	public void setElgProcessTyp(String elgProcessTyp) {
		this.elgProcessTyp = elgProcessTyp;
	}

	public Double getOidElgHist() {
		return this.oidElgHist;
	}

	public void setOidElgHist(Double oidElgHist) {
		this.oidElgHist = oidElgHist;
	}

}