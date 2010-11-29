package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQqcCtrl entity provides the base persistence definition of the
 * QqcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQqcCtrl implements java.io.Serializable {

	// Fields

	private String qqcDomain;
	private Boolean qqcEmailFlg;
	private String qqcEmailUserid;
	private String qqcEmailNotlvl;
	private Boolean qqcExMapFlg;
	private Boolean qqcSendFlg;
	private Boolean qqcPublFlg;
	private String qqcMfgproSite;
	private Boolean qqcImMapFlg;
	private Boolean qqcProcFlg;
	private Boolean qqcRcvFlg;
	private Integer qqcQadi03;
	private Date qqcModDate;
	private String qqcModUserid;
	private String qqcMsgAckLvl;
	private String qqcMsgClntOrd;
	private String qqcMsgPriority;
	private String qqcMsgRouting;
	private String qqcMsgTtl;
	private String qqcPauseSev;
	private String qqcAckLvlReqd;
	private String qqcStartProc;
	private String qqcShutProc;
	private String qqcSysId;
	private String qqcSysVer;
	private String qqcTimezone;
	private Boolean qqcAct;
	private String qqcCodePg;
	private String qqcDateForm;
	private String qqcNumForm;
	private String qqcUser1;
	private String qqcUser2;
	private Double qqcDec01;
	private Double qqcDec02;
	private Integer qqcInt01;
	private Integer qqcInt02;
	private Boolean qqcLog01;
	private Boolean qqcLog02;
	private Date qqcDte01;
	private Date qqcDte02;
	private String qqcQadc01;
	private String qqcQadc02;
	private String qqcQadc03;
	private String qqcQadc04;
	private Double qqcQadd01;
	private Double qqcQadd02;
	private Integer qqcQadi01;
	private Integer qqcQadi02;
	private Boolean qqcQadl01;
	private Boolean qqcQadl02;
	private Date qqcQadt01;
	private Date qqcQadt02;
	private String qqcMsgSync;
	private String qqcMsgSecur;
	private String qqcMsgPersist;
	private String qqcQueuePub;
	private String qqcMomCmd;
	private Boolean qqcMomStart;
	private String qqcImArchDir;
	private String qqcExArchDir;
	private Double oidQqcCtrl;

	// Constructors

	/** default constructor */
	public AbstractQqcCtrl() {
	}

	/** minimal constructor */
	public AbstractQqcCtrl(Double oidQqcCtrl) {
		this.oidQqcCtrl = oidQqcCtrl;
	}

	/** full constructor */
	public AbstractQqcCtrl(Boolean qqcEmailFlg, String qqcEmailUserid,
			String qqcEmailNotlvl, Boolean qqcExMapFlg, Boolean qqcSendFlg,
			Boolean qqcPublFlg, String qqcMfgproSite, Boolean qqcImMapFlg,
			Boolean qqcProcFlg, Boolean qqcRcvFlg, Integer qqcQadi03,
			Date qqcModDate, String qqcModUserid, String qqcMsgAckLvl,
			String qqcMsgClntOrd, String qqcMsgPriority, String qqcMsgRouting,
			String qqcMsgTtl, String qqcPauseSev, String qqcAckLvlReqd,
			String qqcStartProc, String qqcShutProc, String qqcSysId,
			String qqcSysVer, String qqcTimezone, Boolean qqcAct,
			String qqcCodePg, String qqcDateForm, String qqcNumForm,
			String qqcUser1, String qqcUser2, Double qqcDec01, Double qqcDec02,
			Integer qqcInt01, Integer qqcInt02, Boolean qqcLog01,
			Boolean qqcLog02, Date qqcDte01, Date qqcDte02, String qqcQadc01,
			String qqcQadc02, String qqcQadc03, String qqcQadc04,
			Double qqcQadd01, Double qqcQadd02, Integer qqcQadi01,
			Integer qqcQadi02, Boolean qqcQadl01, Boolean qqcQadl02,
			Date qqcQadt01, Date qqcQadt02, String qqcMsgSync,
			String qqcMsgSecur, String qqcMsgPersist, String qqcQueuePub,
			String qqcMomCmd, Boolean qqcMomStart, String qqcImArchDir,
			String qqcExArchDir, Double oidQqcCtrl) {
		this.qqcEmailFlg = qqcEmailFlg;
		this.qqcEmailUserid = qqcEmailUserid;
		this.qqcEmailNotlvl = qqcEmailNotlvl;
		this.qqcExMapFlg = qqcExMapFlg;
		this.qqcSendFlg = qqcSendFlg;
		this.qqcPublFlg = qqcPublFlg;
		this.qqcMfgproSite = qqcMfgproSite;
		this.qqcImMapFlg = qqcImMapFlg;
		this.qqcProcFlg = qqcProcFlg;
		this.qqcRcvFlg = qqcRcvFlg;
		this.qqcQadi03 = qqcQadi03;
		this.qqcModDate = qqcModDate;
		this.qqcModUserid = qqcModUserid;
		this.qqcMsgAckLvl = qqcMsgAckLvl;
		this.qqcMsgClntOrd = qqcMsgClntOrd;
		this.qqcMsgPriority = qqcMsgPriority;
		this.qqcMsgRouting = qqcMsgRouting;
		this.qqcMsgTtl = qqcMsgTtl;
		this.qqcPauseSev = qqcPauseSev;
		this.qqcAckLvlReqd = qqcAckLvlReqd;
		this.qqcStartProc = qqcStartProc;
		this.qqcShutProc = qqcShutProc;
		this.qqcSysId = qqcSysId;
		this.qqcSysVer = qqcSysVer;
		this.qqcTimezone = qqcTimezone;
		this.qqcAct = qqcAct;
		this.qqcCodePg = qqcCodePg;
		this.qqcDateForm = qqcDateForm;
		this.qqcNumForm = qqcNumForm;
		this.qqcUser1 = qqcUser1;
		this.qqcUser2 = qqcUser2;
		this.qqcDec01 = qqcDec01;
		this.qqcDec02 = qqcDec02;
		this.qqcInt01 = qqcInt01;
		this.qqcInt02 = qqcInt02;
		this.qqcLog01 = qqcLog01;
		this.qqcLog02 = qqcLog02;
		this.qqcDte01 = qqcDte01;
		this.qqcDte02 = qqcDte02;
		this.qqcQadc01 = qqcQadc01;
		this.qqcQadc02 = qqcQadc02;
		this.qqcQadc03 = qqcQadc03;
		this.qqcQadc04 = qqcQadc04;
		this.qqcQadd01 = qqcQadd01;
		this.qqcQadd02 = qqcQadd02;
		this.qqcQadi01 = qqcQadi01;
		this.qqcQadi02 = qqcQadi02;
		this.qqcQadl01 = qqcQadl01;
		this.qqcQadl02 = qqcQadl02;
		this.qqcQadt01 = qqcQadt01;
		this.qqcQadt02 = qqcQadt02;
		this.qqcMsgSync = qqcMsgSync;
		this.qqcMsgSecur = qqcMsgSecur;
		this.qqcMsgPersist = qqcMsgPersist;
		this.qqcQueuePub = qqcQueuePub;
		this.qqcMomCmd = qqcMomCmd;
		this.qqcMomStart = qqcMomStart;
		this.qqcImArchDir = qqcImArchDir;
		this.qqcExArchDir = qqcExArchDir;
		this.oidQqcCtrl = oidQqcCtrl;
	}

	// Property accessors

	public String getQqcDomain() {
		return this.qqcDomain;
	}

	public void setQqcDomain(String qqcDomain) {
		this.qqcDomain = qqcDomain;
	}

	public Boolean getQqcEmailFlg() {
		return this.qqcEmailFlg;
	}

	public void setQqcEmailFlg(Boolean qqcEmailFlg) {
		this.qqcEmailFlg = qqcEmailFlg;
	}

	public String getQqcEmailUserid() {
		return this.qqcEmailUserid;
	}

	public void setQqcEmailUserid(String qqcEmailUserid) {
		this.qqcEmailUserid = qqcEmailUserid;
	}

	public String getQqcEmailNotlvl() {
		return this.qqcEmailNotlvl;
	}

	public void setQqcEmailNotlvl(String qqcEmailNotlvl) {
		this.qqcEmailNotlvl = qqcEmailNotlvl;
	}

	public Boolean getQqcExMapFlg() {
		return this.qqcExMapFlg;
	}

	public void setQqcExMapFlg(Boolean qqcExMapFlg) {
		this.qqcExMapFlg = qqcExMapFlg;
	}

	public Boolean getQqcSendFlg() {
		return this.qqcSendFlg;
	}

	public void setQqcSendFlg(Boolean qqcSendFlg) {
		this.qqcSendFlg = qqcSendFlg;
	}

	public Boolean getQqcPublFlg() {
		return this.qqcPublFlg;
	}

	public void setQqcPublFlg(Boolean qqcPublFlg) {
		this.qqcPublFlg = qqcPublFlg;
	}

	public String getQqcMfgproSite() {
		return this.qqcMfgproSite;
	}

	public void setQqcMfgproSite(String qqcMfgproSite) {
		this.qqcMfgproSite = qqcMfgproSite;
	}

	public Boolean getQqcImMapFlg() {
		return this.qqcImMapFlg;
	}

	public void setQqcImMapFlg(Boolean qqcImMapFlg) {
		this.qqcImMapFlg = qqcImMapFlg;
	}

	public Boolean getQqcProcFlg() {
		return this.qqcProcFlg;
	}

	public void setQqcProcFlg(Boolean qqcProcFlg) {
		this.qqcProcFlg = qqcProcFlg;
	}

	public Boolean getQqcRcvFlg() {
		return this.qqcRcvFlg;
	}

	public void setQqcRcvFlg(Boolean qqcRcvFlg) {
		this.qqcRcvFlg = qqcRcvFlg;
	}

	public Integer getQqcQadi03() {
		return this.qqcQadi03;
	}

	public void setQqcQadi03(Integer qqcQadi03) {
		this.qqcQadi03 = qqcQadi03;
	}

	public Date getQqcModDate() {
		return this.qqcModDate;
	}

	public void setQqcModDate(Date qqcModDate) {
		this.qqcModDate = qqcModDate;
	}

	public String getQqcModUserid() {
		return this.qqcModUserid;
	}

	public void setQqcModUserid(String qqcModUserid) {
		this.qqcModUserid = qqcModUserid;
	}

	public String getQqcMsgAckLvl() {
		return this.qqcMsgAckLvl;
	}

	public void setQqcMsgAckLvl(String qqcMsgAckLvl) {
		this.qqcMsgAckLvl = qqcMsgAckLvl;
	}

	public String getQqcMsgClntOrd() {
		return this.qqcMsgClntOrd;
	}

	public void setQqcMsgClntOrd(String qqcMsgClntOrd) {
		this.qqcMsgClntOrd = qqcMsgClntOrd;
	}

	public String getQqcMsgPriority() {
		return this.qqcMsgPriority;
	}

	public void setQqcMsgPriority(String qqcMsgPriority) {
		this.qqcMsgPriority = qqcMsgPriority;
	}

	public String getQqcMsgRouting() {
		return this.qqcMsgRouting;
	}

	public void setQqcMsgRouting(String qqcMsgRouting) {
		this.qqcMsgRouting = qqcMsgRouting;
	}

	public String getQqcMsgTtl() {
		return this.qqcMsgTtl;
	}

	public void setQqcMsgTtl(String qqcMsgTtl) {
		this.qqcMsgTtl = qqcMsgTtl;
	}

	public String getQqcPauseSev() {
		return this.qqcPauseSev;
	}

	public void setQqcPauseSev(String qqcPauseSev) {
		this.qqcPauseSev = qqcPauseSev;
	}

	public String getQqcAckLvlReqd() {
		return this.qqcAckLvlReqd;
	}

	public void setQqcAckLvlReqd(String qqcAckLvlReqd) {
		this.qqcAckLvlReqd = qqcAckLvlReqd;
	}

	public String getQqcStartProc() {
		return this.qqcStartProc;
	}

	public void setQqcStartProc(String qqcStartProc) {
		this.qqcStartProc = qqcStartProc;
	}

	public String getQqcShutProc() {
		return this.qqcShutProc;
	}

	public void setQqcShutProc(String qqcShutProc) {
		this.qqcShutProc = qqcShutProc;
	}

	public String getQqcSysId() {
		return this.qqcSysId;
	}

	public void setQqcSysId(String qqcSysId) {
		this.qqcSysId = qqcSysId;
	}

	public String getQqcSysVer() {
		return this.qqcSysVer;
	}

	public void setQqcSysVer(String qqcSysVer) {
		this.qqcSysVer = qqcSysVer;
	}

	public String getQqcTimezone() {
		return this.qqcTimezone;
	}

	public void setQqcTimezone(String qqcTimezone) {
		this.qqcTimezone = qqcTimezone;
	}

	public Boolean getQqcAct() {
		return this.qqcAct;
	}

	public void setQqcAct(Boolean qqcAct) {
		this.qqcAct = qqcAct;
	}

	public String getQqcCodePg() {
		return this.qqcCodePg;
	}

	public void setQqcCodePg(String qqcCodePg) {
		this.qqcCodePg = qqcCodePg;
	}

	public String getQqcDateForm() {
		return this.qqcDateForm;
	}

	public void setQqcDateForm(String qqcDateForm) {
		this.qqcDateForm = qqcDateForm;
	}

	public String getQqcNumForm() {
		return this.qqcNumForm;
	}

	public void setQqcNumForm(String qqcNumForm) {
		this.qqcNumForm = qqcNumForm;
	}

	public String getQqcUser1() {
		return this.qqcUser1;
	}

	public void setQqcUser1(String qqcUser1) {
		this.qqcUser1 = qqcUser1;
	}

	public String getQqcUser2() {
		return this.qqcUser2;
	}

	public void setQqcUser2(String qqcUser2) {
		this.qqcUser2 = qqcUser2;
	}

	public Double getQqcDec01() {
		return this.qqcDec01;
	}

	public void setQqcDec01(Double qqcDec01) {
		this.qqcDec01 = qqcDec01;
	}

	public Double getQqcDec02() {
		return this.qqcDec02;
	}

	public void setQqcDec02(Double qqcDec02) {
		this.qqcDec02 = qqcDec02;
	}

	public Integer getQqcInt01() {
		return this.qqcInt01;
	}

	public void setQqcInt01(Integer qqcInt01) {
		this.qqcInt01 = qqcInt01;
	}

	public Integer getQqcInt02() {
		return this.qqcInt02;
	}

	public void setQqcInt02(Integer qqcInt02) {
		this.qqcInt02 = qqcInt02;
	}

	public Boolean getQqcLog01() {
		return this.qqcLog01;
	}

	public void setQqcLog01(Boolean qqcLog01) {
		this.qqcLog01 = qqcLog01;
	}

	public Boolean getQqcLog02() {
		return this.qqcLog02;
	}

	public void setQqcLog02(Boolean qqcLog02) {
		this.qqcLog02 = qqcLog02;
	}

	public Date getQqcDte01() {
		return this.qqcDte01;
	}

	public void setQqcDte01(Date qqcDte01) {
		this.qqcDte01 = qqcDte01;
	}

	public Date getQqcDte02() {
		return this.qqcDte02;
	}

	public void setQqcDte02(Date qqcDte02) {
		this.qqcDte02 = qqcDte02;
	}

	public String getQqcQadc01() {
		return this.qqcQadc01;
	}

	public void setQqcQadc01(String qqcQadc01) {
		this.qqcQadc01 = qqcQadc01;
	}

	public String getQqcQadc02() {
		return this.qqcQadc02;
	}

	public void setQqcQadc02(String qqcQadc02) {
		this.qqcQadc02 = qqcQadc02;
	}

	public String getQqcQadc03() {
		return this.qqcQadc03;
	}

	public void setQqcQadc03(String qqcQadc03) {
		this.qqcQadc03 = qqcQadc03;
	}

	public String getQqcQadc04() {
		return this.qqcQadc04;
	}

	public void setQqcQadc04(String qqcQadc04) {
		this.qqcQadc04 = qqcQadc04;
	}

	public Double getQqcQadd01() {
		return this.qqcQadd01;
	}

	public void setQqcQadd01(Double qqcQadd01) {
		this.qqcQadd01 = qqcQadd01;
	}

	public Double getQqcQadd02() {
		return this.qqcQadd02;
	}

	public void setQqcQadd02(Double qqcQadd02) {
		this.qqcQadd02 = qqcQadd02;
	}

	public Integer getQqcQadi01() {
		return this.qqcQadi01;
	}

	public void setQqcQadi01(Integer qqcQadi01) {
		this.qqcQadi01 = qqcQadi01;
	}

	public Integer getQqcQadi02() {
		return this.qqcQadi02;
	}

	public void setQqcQadi02(Integer qqcQadi02) {
		this.qqcQadi02 = qqcQadi02;
	}

	public Boolean getQqcQadl01() {
		return this.qqcQadl01;
	}

	public void setQqcQadl01(Boolean qqcQadl01) {
		this.qqcQadl01 = qqcQadl01;
	}

	public Boolean getQqcQadl02() {
		return this.qqcQadl02;
	}

	public void setQqcQadl02(Boolean qqcQadl02) {
		this.qqcQadl02 = qqcQadl02;
	}

	public Date getQqcQadt01() {
		return this.qqcQadt01;
	}

	public void setQqcQadt01(Date qqcQadt01) {
		this.qqcQadt01 = qqcQadt01;
	}

	public Date getQqcQadt02() {
		return this.qqcQadt02;
	}

	public void setQqcQadt02(Date qqcQadt02) {
		this.qqcQadt02 = qqcQadt02;
	}

	public String getQqcMsgSync() {
		return this.qqcMsgSync;
	}

	public void setQqcMsgSync(String qqcMsgSync) {
		this.qqcMsgSync = qqcMsgSync;
	}

	public String getQqcMsgSecur() {
		return this.qqcMsgSecur;
	}

	public void setQqcMsgSecur(String qqcMsgSecur) {
		this.qqcMsgSecur = qqcMsgSecur;
	}

	public String getQqcMsgPersist() {
		return this.qqcMsgPersist;
	}

	public void setQqcMsgPersist(String qqcMsgPersist) {
		this.qqcMsgPersist = qqcMsgPersist;
	}

	public String getQqcQueuePub() {
		return this.qqcQueuePub;
	}

	public void setQqcQueuePub(String qqcQueuePub) {
		this.qqcQueuePub = qqcQueuePub;
	}

	public String getQqcMomCmd() {
		return this.qqcMomCmd;
	}

	public void setQqcMomCmd(String qqcMomCmd) {
		this.qqcMomCmd = qqcMomCmd;
	}

	public Boolean getQqcMomStart() {
		return this.qqcMomStart;
	}

	public void setQqcMomStart(Boolean qqcMomStart) {
		this.qqcMomStart = qqcMomStart;
	}

	public String getQqcImArchDir() {
		return this.qqcImArchDir;
	}

	public void setQqcImArchDir(String qqcImArchDir) {
		this.qqcImArchDir = qqcImArchDir;
	}

	public String getQqcExArchDir() {
		return this.qqcExArchDir;
	}

	public void setQqcExArchDir(String qqcExArchDir) {
		this.qqcExArchDir = qqcExArchDir;
	}

	public Double getOidQqcCtrl() {
		return this.oidQqcCtrl;
	}

	public void setOidQqcCtrl(Double oidQqcCtrl) {
		this.oidQqcCtrl = oidQqcCtrl;
	}

}