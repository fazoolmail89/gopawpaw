package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIlgHist entity provides the base persistence definition of the
 * IlgHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIlgHist implements java.io.Serializable {

	// Fields

	private IlgHistId id;
	private String ilgAccessCode;
	private String ilgSrcComp;
	private String ilgAppId;
	private String ilgSrcTask;
	private String ilgAppVer;
	private String ilgArchiveId;
	private Integer ilgCtrlTot1;
	private Double ilgCtrlTot2;
	private Double ilgCtrlTot3;
	private Date ilgDateAck;
	private Date ilgDateMap;
	private Date ilgDateProc;
	private Date ilgDateRcvd;
	private String ilgDestAppVer;
	private String ilgDestAppId;
	private String ilgDestDocRev;
	private String ilgDestDocStd;
	private String ilgDestDocTyp;
	private String ilgDestProc;
	private String ilgDocLng;
	private String ilgDocRev;
	private String ilgDocStd;
	private String ilgDocTyp;
	private String ilgEmailUserid;
	private String ilgEmailNotlvl;
	private String ilgMapLogFile;
	private String ilgErrStat;
	private String ilgExtDocKey;
	private String ilgMfgproSite;
	private String ilgMfgproKey;
	private Integer ilgGrpId;
	private String ilgMapSpec;
	private Date ilgModDate;
	private String ilgModUserid;
	private Integer ilgOrigDocId;
	private String ilgAckLvlReqd;
	private Boolean ilgAckSent;
	private String ilgPrcgStage;
	private Integer ilgSessId;
	private String ilgSrcProc;
	private String ilgSrcUserid;
	private String ilgTimeAck;
	private String ilgTimeMap;
	private String ilgTimeProc;
	private String ilgTimeRcvd;
	private String ilgTradptrId;
	private String ilgUnitWrkTyp;
	private Boolean ilgMapDocNow;
	private Boolean ilgUseImQueue;
	private String ilgCodePg;
	private String ilgDateForm;
	private String ilgNumForm;
	private String ilgUser1;
	private String ilgUser2;
	private Double ilgDec01;
	private Double ilgDec02;
	private Integer ilgInt01;
	private Integer ilgInt02;
	private Boolean ilgLog01;
	private Boolean ilgLog02;
	private Date ilgDte01;
	private Date ilgDte02;
	private String ilgQadc01;
	private String ilgQadc02;
	private String ilgQadc03;
	private String ilgQadc04;
	private Double ilgQadd01;
	private Double ilgQadd02;
	private Integer ilgQadi01;
	private Integer ilgQadi02;
	private Boolean ilgQadl01;
	private Boolean ilgQadl02;
	private Date ilgQadt01;
	private Date ilgQadt02;
	private Integer ilgGrpSeq;
	private Date ilgDateCreate;
	private String ilgTimeCreate;
	private String ilgTimezone;
	private String ilgMapperProc;
	private String ilgDestMthd;
	private String ilgProcessTyp;
	private Double oidIlgHist;

	// Constructors

	/** default constructor */
	public AbstractIlgHist() {
	}

	/** minimal constructor */
	public AbstractIlgHist(IlgHistId id, Double oidIlgHist) {
		this.id = id;
		this.oidIlgHist = oidIlgHist;
	}

	/** full constructor */
	public AbstractIlgHist(IlgHistId id, String ilgAccessCode,
			String ilgSrcComp, String ilgAppId, String ilgSrcTask,
			String ilgAppVer, String ilgArchiveId, Integer ilgCtrlTot1,
			Double ilgCtrlTot2, Double ilgCtrlTot3, Date ilgDateAck,
			Date ilgDateMap, Date ilgDateProc, Date ilgDateRcvd,
			String ilgDestAppVer, String ilgDestAppId, String ilgDestDocRev,
			String ilgDestDocStd, String ilgDestDocTyp, String ilgDestProc,
			String ilgDocLng, String ilgDocRev, String ilgDocStd,
			String ilgDocTyp, String ilgEmailUserid, String ilgEmailNotlvl,
			String ilgMapLogFile, String ilgErrStat, String ilgExtDocKey,
			String ilgMfgproSite, String ilgMfgproKey, Integer ilgGrpId,
			String ilgMapSpec, Date ilgModDate, String ilgModUserid,
			Integer ilgOrigDocId, String ilgAckLvlReqd, Boolean ilgAckSent,
			String ilgPrcgStage, Integer ilgSessId, String ilgSrcProc,
			String ilgSrcUserid, String ilgTimeAck, String ilgTimeMap,
			String ilgTimeProc, String ilgTimeRcvd, String ilgTradptrId,
			String ilgUnitWrkTyp, Boolean ilgMapDocNow, Boolean ilgUseImQueue,
			String ilgCodePg, String ilgDateForm, String ilgNumForm,
			String ilgUser1, String ilgUser2, Double ilgDec01, Double ilgDec02,
			Integer ilgInt01, Integer ilgInt02, Boolean ilgLog01,
			Boolean ilgLog02, Date ilgDte01, Date ilgDte02, String ilgQadc01,
			String ilgQadc02, String ilgQadc03, String ilgQadc04,
			Double ilgQadd01, Double ilgQadd02, Integer ilgQadi01,
			Integer ilgQadi02, Boolean ilgQadl01, Boolean ilgQadl02,
			Date ilgQadt01, Date ilgQadt02, Integer ilgGrpSeq,
			Date ilgDateCreate, String ilgTimeCreate, String ilgTimezone,
			String ilgMapperProc, String ilgDestMthd, String ilgProcessTyp,
			Double oidIlgHist) {
		this.id = id;
		this.ilgAccessCode = ilgAccessCode;
		this.ilgSrcComp = ilgSrcComp;
		this.ilgAppId = ilgAppId;
		this.ilgSrcTask = ilgSrcTask;
		this.ilgAppVer = ilgAppVer;
		this.ilgArchiveId = ilgArchiveId;
		this.ilgCtrlTot1 = ilgCtrlTot1;
		this.ilgCtrlTot2 = ilgCtrlTot2;
		this.ilgCtrlTot3 = ilgCtrlTot3;
		this.ilgDateAck = ilgDateAck;
		this.ilgDateMap = ilgDateMap;
		this.ilgDateProc = ilgDateProc;
		this.ilgDateRcvd = ilgDateRcvd;
		this.ilgDestAppVer = ilgDestAppVer;
		this.ilgDestAppId = ilgDestAppId;
		this.ilgDestDocRev = ilgDestDocRev;
		this.ilgDestDocStd = ilgDestDocStd;
		this.ilgDestDocTyp = ilgDestDocTyp;
		this.ilgDestProc = ilgDestProc;
		this.ilgDocLng = ilgDocLng;
		this.ilgDocRev = ilgDocRev;
		this.ilgDocStd = ilgDocStd;
		this.ilgDocTyp = ilgDocTyp;
		this.ilgEmailUserid = ilgEmailUserid;
		this.ilgEmailNotlvl = ilgEmailNotlvl;
		this.ilgMapLogFile = ilgMapLogFile;
		this.ilgErrStat = ilgErrStat;
		this.ilgExtDocKey = ilgExtDocKey;
		this.ilgMfgproSite = ilgMfgproSite;
		this.ilgMfgproKey = ilgMfgproKey;
		this.ilgGrpId = ilgGrpId;
		this.ilgMapSpec = ilgMapSpec;
		this.ilgModDate = ilgModDate;
		this.ilgModUserid = ilgModUserid;
		this.ilgOrigDocId = ilgOrigDocId;
		this.ilgAckLvlReqd = ilgAckLvlReqd;
		this.ilgAckSent = ilgAckSent;
		this.ilgPrcgStage = ilgPrcgStage;
		this.ilgSessId = ilgSessId;
		this.ilgSrcProc = ilgSrcProc;
		this.ilgSrcUserid = ilgSrcUserid;
		this.ilgTimeAck = ilgTimeAck;
		this.ilgTimeMap = ilgTimeMap;
		this.ilgTimeProc = ilgTimeProc;
		this.ilgTimeRcvd = ilgTimeRcvd;
		this.ilgTradptrId = ilgTradptrId;
		this.ilgUnitWrkTyp = ilgUnitWrkTyp;
		this.ilgMapDocNow = ilgMapDocNow;
		this.ilgUseImQueue = ilgUseImQueue;
		this.ilgCodePg = ilgCodePg;
		this.ilgDateForm = ilgDateForm;
		this.ilgNumForm = ilgNumForm;
		this.ilgUser1 = ilgUser1;
		this.ilgUser2 = ilgUser2;
		this.ilgDec01 = ilgDec01;
		this.ilgDec02 = ilgDec02;
		this.ilgInt01 = ilgInt01;
		this.ilgInt02 = ilgInt02;
		this.ilgLog01 = ilgLog01;
		this.ilgLog02 = ilgLog02;
		this.ilgDte01 = ilgDte01;
		this.ilgDte02 = ilgDte02;
		this.ilgQadc01 = ilgQadc01;
		this.ilgQadc02 = ilgQadc02;
		this.ilgQadc03 = ilgQadc03;
		this.ilgQadc04 = ilgQadc04;
		this.ilgQadd01 = ilgQadd01;
		this.ilgQadd02 = ilgQadd02;
		this.ilgQadi01 = ilgQadi01;
		this.ilgQadi02 = ilgQadi02;
		this.ilgQadl01 = ilgQadl01;
		this.ilgQadl02 = ilgQadl02;
		this.ilgQadt01 = ilgQadt01;
		this.ilgQadt02 = ilgQadt02;
		this.ilgGrpSeq = ilgGrpSeq;
		this.ilgDateCreate = ilgDateCreate;
		this.ilgTimeCreate = ilgTimeCreate;
		this.ilgTimezone = ilgTimezone;
		this.ilgMapperProc = ilgMapperProc;
		this.ilgDestMthd = ilgDestMthd;
		this.ilgProcessTyp = ilgProcessTyp;
		this.oidIlgHist = oidIlgHist;
	}

	// Property accessors

	public IlgHistId getId() {
		return this.id;
	}

	public void setId(IlgHistId id) {
		this.id = id;
	}

	public String getIlgAccessCode() {
		return this.ilgAccessCode;
	}

	public void setIlgAccessCode(String ilgAccessCode) {
		this.ilgAccessCode = ilgAccessCode;
	}

	public String getIlgSrcComp() {
		return this.ilgSrcComp;
	}

	public void setIlgSrcComp(String ilgSrcComp) {
		this.ilgSrcComp = ilgSrcComp;
	}

	public String getIlgAppId() {
		return this.ilgAppId;
	}

	public void setIlgAppId(String ilgAppId) {
		this.ilgAppId = ilgAppId;
	}

	public String getIlgSrcTask() {
		return this.ilgSrcTask;
	}

	public void setIlgSrcTask(String ilgSrcTask) {
		this.ilgSrcTask = ilgSrcTask;
	}

	public String getIlgAppVer() {
		return this.ilgAppVer;
	}

	public void setIlgAppVer(String ilgAppVer) {
		this.ilgAppVer = ilgAppVer;
	}

	public String getIlgArchiveId() {
		return this.ilgArchiveId;
	}

	public void setIlgArchiveId(String ilgArchiveId) {
		this.ilgArchiveId = ilgArchiveId;
	}

	public Integer getIlgCtrlTot1() {
		return this.ilgCtrlTot1;
	}

	public void setIlgCtrlTot1(Integer ilgCtrlTot1) {
		this.ilgCtrlTot1 = ilgCtrlTot1;
	}

	public Double getIlgCtrlTot2() {
		return this.ilgCtrlTot2;
	}

	public void setIlgCtrlTot2(Double ilgCtrlTot2) {
		this.ilgCtrlTot2 = ilgCtrlTot2;
	}

	public Double getIlgCtrlTot3() {
		return this.ilgCtrlTot3;
	}

	public void setIlgCtrlTot3(Double ilgCtrlTot3) {
		this.ilgCtrlTot3 = ilgCtrlTot3;
	}

	public Date getIlgDateAck() {
		return this.ilgDateAck;
	}

	public void setIlgDateAck(Date ilgDateAck) {
		this.ilgDateAck = ilgDateAck;
	}

	public Date getIlgDateMap() {
		return this.ilgDateMap;
	}

	public void setIlgDateMap(Date ilgDateMap) {
		this.ilgDateMap = ilgDateMap;
	}

	public Date getIlgDateProc() {
		return this.ilgDateProc;
	}

	public void setIlgDateProc(Date ilgDateProc) {
		this.ilgDateProc = ilgDateProc;
	}

	public Date getIlgDateRcvd() {
		return this.ilgDateRcvd;
	}

	public void setIlgDateRcvd(Date ilgDateRcvd) {
		this.ilgDateRcvd = ilgDateRcvd;
	}

	public String getIlgDestAppVer() {
		return this.ilgDestAppVer;
	}

	public void setIlgDestAppVer(String ilgDestAppVer) {
		this.ilgDestAppVer = ilgDestAppVer;
	}

	public String getIlgDestAppId() {
		return this.ilgDestAppId;
	}

	public void setIlgDestAppId(String ilgDestAppId) {
		this.ilgDestAppId = ilgDestAppId;
	}

	public String getIlgDestDocRev() {
		return this.ilgDestDocRev;
	}

	public void setIlgDestDocRev(String ilgDestDocRev) {
		this.ilgDestDocRev = ilgDestDocRev;
	}

	public String getIlgDestDocStd() {
		return this.ilgDestDocStd;
	}

	public void setIlgDestDocStd(String ilgDestDocStd) {
		this.ilgDestDocStd = ilgDestDocStd;
	}

	public String getIlgDestDocTyp() {
		return this.ilgDestDocTyp;
	}

	public void setIlgDestDocTyp(String ilgDestDocTyp) {
		this.ilgDestDocTyp = ilgDestDocTyp;
	}

	public String getIlgDestProc() {
		return this.ilgDestProc;
	}

	public void setIlgDestProc(String ilgDestProc) {
		this.ilgDestProc = ilgDestProc;
	}

	public String getIlgDocLng() {
		return this.ilgDocLng;
	}

	public void setIlgDocLng(String ilgDocLng) {
		this.ilgDocLng = ilgDocLng;
	}

	public String getIlgDocRev() {
		return this.ilgDocRev;
	}

	public void setIlgDocRev(String ilgDocRev) {
		this.ilgDocRev = ilgDocRev;
	}

	public String getIlgDocStd() {
		return this.ilgDocStd;
	}

	public void setIlgDocStd(String ilgDocStd) {
		this.ilgDocStd = ilgDocStd;
	}

	public String getIlgDocTyp() {
		return this.ilgDocTyp;
	}

	public void setIlgDocTyp(String ilgDocTyp) {
		this.ilgDocTyp = ilgDocTyp;
	}

	public String getIlgEmailUserid() {
		return this.ilgEmailUserid;
	}

	public void setIlgEmailUserid(String ilgEmailUserid) {
		this.ilgEmailUserid = ilgEmailUserid;
	}

	public String getIlgEmailNotlvl() {
		return this.ilgEmailNotlvl;
	}

	public void setIlgEmailNotlvl(String ilgEmailNotlvl) {
		this.ilgEmailNotlvl = ilgEmailNotlvl;
	}

	public String getIlgMapLogFile() {
		return this.ilgMapLogFile;
	}

	public void setIlgMapLogFile(String ilgMapLogFile) {
		this.ilgMapLogFile = ilgMapLogFile;
	}

	public String getIlgErrStat() {
		return this.ilgErrStat;
	}

	public void setIlgErrStat(String ilgErrStat) {
		this.ilgErrStat = ilgErrStat;
	}

	public String getIlgExtDocKey() {
		return this.ilgExtDocKey;
	}

	public void setIlgExtDocKey(String ilgExtDocKey) {
		this.ilgExtDocKey = ilgExtDocKey;
	}

	public String getIlgMfgproSite() {
		return this.ilgMfgproSite;
	}

	public void setIlgMfgproSite(String ilgMfgproSite) {
		this.ilgMfgproSite = ilgMfgproSite;
	}

	public String getIlgMfgproKey() {
		return this.ilgMfgproKey;
	}

	public void setIlgMfgproKey(String ilgMfgproKey) {
		this.ilgMfgproKey = ilgMfgproKey;
	}

	public Integer getIlgGrpId() {
		return this.ilgGrpId;
	}

	public void setIlgGrpId(Integer ilgGrpId) {
		this.ilgGrpId = ilgGrpId;
	}

	public String getIlgMapSpec() {
		return this.ilgMapSpec;
	}

	public void setIlgMapSpec(String ilgMapSpec) {
		this.ilgMapSpec = ilgMapSpec;
	}

	public Date getIlgModDate() {
		return this.ilgModDate;
	}

	public void setIlgModDate(Date ilgModDate) {
		this.ilgModDate = ilgModDate;
	}

	public String getIlgModUserid() {
		return this.ilgModUserid;
	}

	public void setIlgModUserid(String ilgModUserid) {
		this.ilgModUserid = ilgModUserid;
	}

	public Integer getIlgOrigDocId() {
		return this.ilgOrigDocId;
	}

	public void setIlgOrigDocId(Integer ilgOrigDocId) {
		this.ilgOrigDocId = ilgOrigDocId;
	}

	public String getIlgAckLvlReqd() {
		return this.ilgAckLvlReqd;
	}

	public void setIlgAckLvlReqd(String ilgAckLvlReqd) {
		this.ilgAckLvlReqd = ilgAckLvlReqd;
	}

	public Boolean getIlgAckSent() {
		return this.ilgAckSent;
	}

	public void setIlgAckSent(Boolean ilgAckSent) {
		this.ilgAckSent = ilgAckSent;
	}

	public String getIlgPrcgStage() {
		return this.ilgPrcgStage;
	}

	public void setIlgPrcgStage(String ilgPrcgStage) {
		this.ilgPrcgStage = ilgPrcgStage;
	}

	public Integer getIlgSessId() {
		return this.ilgSessId;
	}

	public void setIlgSessId(Integer ilgSessId) {
		this.ilgSessId = ilgSessId;
	}

	public String getIlgSrcProc() {
		return this.ilgSrcProc;
	}

	public void setIlgSrcProc(String ilgSrcProc) {
		this.ilgSrcProc = ilgSrcProc;
	}

	public String getIlgSrcUserid() {
		return this.ilgSrcUserid;
	}

	public void setIlgSrcUserid(String ilgSrcUserid) {
		this.ilgSrcUserid = ilgSrcUserid;
	}

	public String getIlgTimeAck() {
		return this.ilgTimeAck;
	}

	public void setIlgTimeAck(String ilgTimeAck) {
		this.ilgTimeAck = ilgTimeAck;
	}

	public String getIlgTimeMap() {
		return this.ilgTimeMap;
	}

	public void setIlgTimeMap(String ilgTimeMap) {
		this.ilgTimeMap = ilgTimeMap;
	}

	public String getIlgTimeProc() {
		return this.ilgTimeProc;
	}

	public void setIlgTimeProc(String ilgTimeProc) {
		this.ilgTimeProc = ilgTimeProc;
	}

	public String getIlgTimeRcvd() {
		return this.ilgTimeRcvd;
	}

	public void setIlgTimeRcvd(String ilgTimeRcvd) {
		this.ilgTimeRcvd = ilgTimeRcvd;
	}

	public String getIlgTradptrId() {
		return this.ilgTradptrId;
	}

	public void setIlgTradptrId(String ilgTradptrId) {
		this.ilgTradptrId = ilgTradptrId;
	}

	public String getIlgUnitWrkTyp() {
		return this.ilgUnitWrkTyp;
	}

	public void setIlgUnitWrkTyp(String ilgUnitWrkTyp) {
		this.ilgUnitWrkTyp = ilgUnitWrkTyp;
	}

	public Boolean getIlgMapDocNow() {
		return this.ilgMapDocNow;
	}

	public void setIlgMapDocNow(Boolean ilgMapDocNow) {
		this.ilgMapDocNow = ilgMapDocNow;
	}

	public Boolean getIlgUseImQueue() {
		return this.ilgUseImQueue;
	}

	public void setIlgUseImQueue(Boolean ilgUseImQueue) {
		this.ilgUseImQueue = ilgUseImQueue;
	}

	public String getIlgCodePg() {
		return this.ilgCodePg;
	}

	public void setIlgCodePg(String ilgCodePg) {
		this.ilgCodePg = ilgCodePg;
	}

	public String getIlgDateForm() {
		return this.ilgDateForm;
	}

	public void setIlgDateForm(String ilgDateForm) {
		this.ilgDateForm = ilgDateForm;
	}

	public String getIlgNumForm() {
		return this.ilgNumForm;
	}

	public void setIlgNumForm(String ilgNumForm) {
		this.ilgNumForm = ilgNumForm;
	}

	public String getIlgUser1() {
		return this.ilgUser1;
	}

	public void setIlgUser1(String ilgUser1) {
		this.ilgUser1 = ilgUser1;
	}

	public String getIlgUser2() {
		return this.ilgUser2;
	}

	public void setIlgUser2(String ilgUser2) {
		this.ilgUser2 = ilgUser2;
	}

	public Double getIlgDec01() {
		return this.ilgDec01;
	}

	public void setIlgDec01(Double ilgDec01) {
		this.ilgDec01 = ilgDec01;
	}

	public Double getIlgDec02() {
		return this.ilgDec02;
	}

	public void setIlgDec02(Double ilgDec02) {
		this.ilgDec02 = ilgDec02;
	}

	public Integer getIlgInt01() {
		return this.ilgInt01;
	}

	public void setIlgInt01(Integer ilgInt01) {
		this.ilgInt01 = ilgInt01;
	}

	public Integer getIlgInt02() {
		return this.ilgInt02;
	}

	public void setIlgInt02(Integer ilgInt02) {
		this.ilgInt02 = ilgInt02;
	}

	public Boolean getIlgLog01() {
		return this.ilgLog01;
	}

	public void setIlgLog01(Boolean ilgLog01) {
		this.ilgLog01 = ilgLog01;
	}

	public Boolean getIlgLog02() {
		return this.ilgLog02;
	}

	public void setIlgLog02(Boolean ilgLog02) {
		this.ilgLog02 = ilgLog02;
	}

	public Date getIlgDte01() {
		return this.ilgDte01;
	}

	public void setIlgDte01(Date ilgDte01) {
		this.ilgDte01 = ilgDte01;
	}

	public Date getIlgDte02() {
		return this.ilgDte02;
	}

	public void setIlgDte02(Date ilgDte02) {
		this.ilgDte02 = ilgDte02;
	}

	public String getIlgQadc01() {
		return this.ilgQadc01;
	}

	public void setIlgQadc01(String ilgQadc01) {
		this.ilgQadc01 = ilgQadc01;
	}

	public String getIlgQadc02() {
		return this.ilgQadc02;
	}

	public void setIlgQadc02(String ilgQadc02) {
		this.ilgQadc02 = ilgQadc02;
	}

	public String getIlgQadc03() {
		return this.ilgQadc03;
	}

	public void setIlgQadc03(String ilgQadc03) {
		this.ilgQadc03 = ilgQadc03;
	}

	public String getIlgQadc04() {
		return this.ilgQadc04;
	}

	public void setIlgQadc04(String ilgQadc04) {
		this.ilgQadc04 = ilgQadc04;
	}

	public Double getIlgQadd01() {
		return this.ilgQadd01;
	}

	public void setIlgQadd01(Double ilgQadd01) {
		this.ilgQadd01 = ilgQadd01;
	}

	public Double getIlgQadd02() {
		return this.ilgQadd02;
	}

	public void setIlgQadd02(Double ilgQadd02) {
		this.ilgQadd02 = ilgQadd02;
	}

	public Integer getIlgQadi01() {
		return this.ilgQadi01;
	}

	public void setIlgQadi01(Integer ilgQadi01) {
		this.ilgQadi01 = ilgQadi01;
	}

	public Integer getIlgQadi02() {
		return this.ilgQadi02;
	}

	public void setIlgQadi02(Integer ilgQadi02) {
		this.ilgQadi02 = ilgQadi02;
	}

	public Boolean getIlgQadl01() {
		return this.ilgQadl01;
	}

	public void setIlgQadl01(Boolean ilgQadl01) {
		this.ilgQadl01 = ilgQadl01;
	}

	public Boolean getIlgQadl02() {
		return this.ilgQadl02;
	}

	public void setIlgQadl02(Boolean ilgQadl02) {
		this.ilgQadl02 = ilgQadl02;
	}

	public Date getIlgQadt01() {
		return this.ilgQadt01;
	}

	public void setIlgQadt01(Date ilgQadt01) {
		this.ilgQadt01 = ilgQadt01;
	}

	public Date getIlgQadt02() {
		return this.ilgQadt02;
	}

	public void setIlgQadt02(Date ilgQadt02) {
		this.ilgQadt02 = ilgQadt02;
	}

	public Integer getIlgGrpSeq() {
		return this.ilgGrpSeq;
	}

	public void setIlgGrpSeq(Integer ilgGrpSeq) {
		this.ilgGrpSeq = ilgGrpSeq;
	}

	public Date getIlgDateCreate() {
		return this.ilgDateCreate;
	}

	public void setIlgDateCreate(Date ilgDateCreate) {
		this.ilgDateCreate = ilgDateCreate;
	}

	public String getIlgTimeCreate() {
		return this.ilgTimeCreate;
	}

	public void setIlgTimeCreate(String ilgTimeCreate) {
		this.ilgTimeCreate = ilgTimeCreate;
	}

	public String getIlgTimezone() {
		return this.ilgTimezone;
	}

	public void setIlgTimezone(String ilgTimezone) {
		this.ilgTimezone = ilgTimezone;
	}

	public String getIlgMapperProc() {
		return this.ilgMapperProc;
	}

	public void setIlgMapperProc(String ilgMapperProc) {
		this.ilgMapperProc = ilgMapperProc;
	}

	public String getIlgDestMthd() {
		return this.ilgDestMthd;
	}

	public void setIlgDestMthd(String ilgDestMthd) {
		this.ilgDestMthd = ilgDestMthd;
	}

	public String getIlgProcessTyp() {
		return this.ilgProcessTyp;
	}

	public void setIlgProcessTyp(String ilgProcessTyp) {
		this.ilgProcessTyp = ilgProcessTyp;
	}

	public Double getOidIlgHist() {
		return this.oidIlgHist;
	}

	public void setOidIlgHist(Double oidIlgHist) {
		this.oidIlgHist = oidIlgHist;
	}

}