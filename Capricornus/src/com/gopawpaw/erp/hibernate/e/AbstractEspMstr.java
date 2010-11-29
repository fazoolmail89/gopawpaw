package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEspMstr entity provides the base persistence definition of the
 * EspMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEspMstr implements java.io.Serializable {

	// Fields

	private EspMstrId id;
	private String espAccessCode;
	private String espAppVer;
	private String espDelErrDet;
	private String espDestProc;
	private String espDocLng;
	private String espEmailUserid;
	private String espEmailNotlvl;
	private String espDesc;
	private Boolean espExMapFlg;
	private Boolean espSendFlg;
	private Boolean espPublFlg;
	private String espMapperProc;
	private String espMapSpec;
	private Date espModDate;
	private String espModUserid;
	private String espMsgAckLvl;
	private String espMsgClntOrd;
	private String espMsgPriority;
	private String espMsgRouting;
	private String espMsgTtl;
	private Integer espPauseSev;
	private String espAckLvlReqd;
	private String espSrcComp;
	private String espSrcAppId;
	private String espSrcTask;
	private String espSrcAppVer;
	private String espSrcDocRev;
	private String espSrcDocStd;
	private String espSrcDocTyp;
	private String espSrcProc;
	private String espSrcUserid;
	private Boolean espUseExQueue;
	private String espAckDocRev;
	private String espAckDocStd;
	private String espAckDocTyp;
	private String espCodePg;
	private String espDateForm;
	private String espNumForm;
	private String espUser1;
	private String espUser2;
	private Double espDec01;
	private Double espDec02;
	private Integer espInt01;
	private Integer espInt02;
	private Boolean espLog01;
	private Boolean espLog02;
	private Date espDte01;
	private Date espDte02;
	private String espQadc01;
	private String espQadc02;
	private String espQadc03;
	private String espQadc04;
	private Double espQadd01;
	private Double espQadd02;
	private Integer espQadi01;
	private Integer espQadi02;
	private Boolean espQadl01;
	private Boolean espQadl02;
	private Date espQadt01;
	private Date espQadt02;
	private String espMsgSync;
	private String espMsgSecur;
	private String espMsgPersist;
	private String espQueuePub;
	private String espMapParm;
	private String espMapParmVal;
	private Boolean espEolDelim;
	private String espDtdName;
	private Integer espDelim;
	private String espDestMthd;
	private String espProcessTyp;
	private String espXml;
	private Double oidEspMstr;

	// Constructors

	/** default constructor */
	public AbstractEspMstr() {
	}

	/** minimal constructor */
	public AbstractEspMstr(EspMstrId id, Double oidEspMstr) {
		this.id = id;
		this.oidEspMstr = oidEspMstr;
	}

	/** full constructor */
	public AbstractEspMstr(EspMstrId id, String espAccessCode,
			String espAppVer, String espDelErrDet, String espDestProc,
			String espDocLng, String espEmailUserid, String espEmailNotlvl,
			String espDesc, Boolean espExMapFlg, Boolean espSendFlg,
			Boolean espPublFlg, String espMapperProc, String espMapSpec,
			Date espModDate, String espModUserid, String espMsgAckLvl,
			String espMsgClntOrd, String espMsgPriority, String espMsgRouting,
			String espMsgTtl, Integer espPauseSev, String espAckLvlReqd,
			String espSrcComp, String espSrcAppId, String espSrcTask,
			String espSrcAppVer, String espSrcDocRev, String espSrcDocStd,
			String espSrcDocTyp, String espSrcProc, String espSrcUserid,
			Boolean espUseExQueue, String espAckDocRev, String espAckDocStd,
			String espAckDocTyp, String espCodePg, String espDateForm,
			String espNumForm, String espUser1, String espUser2,
			Double espDec01, Double espDec02, Integer espInt01,
			Integer espInt02, Boolean espLog01, Boolean espLog02,
			Date espDte01, Date espDte02, String espQadc01, String espQadc02,
			String espQadc03, String espQadc04, Double espQadd01,
			Double espQadd02, Integer espQadi01, Integer espQadi02,
			Boolean espQadl01, Boolean espQadl02, Date espQadt01,
			Date espQadt02, String espMsgSync, String espMsgSecur,
			String espMsgPersist, String espQueuePub, String espMapParm,
			String espMapParmVal, Boolean espEolDelim, String espDtdName,
			Integer espDelim, String espDestMthd, String espProcessTyp,
			String espXml, Double oidEspMstr) {
		this.id = id;
		this.espAccessCode = espAccessCode;
		this.espAppVer = espAppVer;
		this.espDelErrDet = espDelErrDet;
		this.espDestProc = espDestProc;
		this.espDocLng = espDocLng;
		this.espEmailUserid = espEmailUserid;
		this.espEmailNotlvl = espEmailNotlvl;
		this.espDesc = espDesc;
		this.espExMapFlg = espExMapFlg;
		this.espSendFlg = espSendFlg;
		this.espPublFlg = espPublFlg;
		this.espMapperProc = espMapperProc;
		this.espMapSpec = espMapSpec;
		this.espModDate = espModDate;
		this.espModUserid = espModUserid;
		this.espMsgAckLvl = espMsgAckLvl;
		this.espMsgClntOrd = espMsgClntOrd;
		this.espMsgPriority = espMsgPriority;
		this.espMsgRouting = espMsgRouting;
		this.espMsgTtl = espMsgTtl;
		this.espPauseSev = espPauseSev;
		this.espAckLvlReqd = espAckLvlReqd;
		this.espSrcComp = espSrcComp;
		this.espSrcAppId = espSrcAppId;
		this.espSrcTask = espSrcTask;
		this.espSrcAppVer = espSrcAppVer;
		this.espSrcDocRev = espSrcDocRev;
		this.espSrcDocStd = espSrcDocStd;
		this.espSrcDocTyp = espSrcDocTyp;
		this.espSrcProc = espSrcProc;
		this.espSrcUserid = espSrcUserid;
		this.espUseExQueue = espUseExQueue;
		this.espAckDocRev = espAckDocRev;
		this.espAckDocStd = espAckDocStd;
		this.espAckDocTyp = espAckDocTyp;
		this.espCodePg = espCodePg;
		this.espDateForm = espDateForm;
		this.espNumForm = espNumForm;
		this.espUser1 = espUser1;
		this.espUser2 = espUser2;
		this.espDec01 = espDec01;
		this.espDec02 = espDec02;
		this.espInt01 = espInt01;
		this.espInt02 = espInt02;
		this.espLog01 = espLog01;
		this.espLog02 = espLog02;
		this.espDte01 = espDte01;
		this.espDte02 = espDte02;
		this.espQadc01 = espQadc01;
		this.espQadc02 = espQadc02;
		this.espQadc03 = espQadc03;
		this.espQadc04 = espQadc04;
		this.espQadd01 = espQadd01;
		this.espQadd02 = espQadd02;
		this.espQadi01 = espQadi01;
		this.espQadi02 = espQadi02;
		this.espQadl01 = espQadl01;
		this.espQadl02 = espQadl02;
		this.espQadt01 = espQadt01;
		this.espQadt02 = espQadt02;
		this.espMsgSync = espMsgSync;
		this.espMsgSecur = espMsgSecur;
		this.espMsgPersist = espMsgPersist;
		this.espQueuePub = espQueuePub;
		this.espMapParm = espMapParm;
		this.espMapParmVal = espMapParmVal;
		this.espEolDelim = espEolDelim;
		this.espDtdName = espDtdName;
		this.espDelim = espDelim;
		this.espDestMthd = espDestMthd;
		this.espProcessTyp = espProcessTyp;
		this.espXml = espXml;
		this.oidEspMstr = oidEspMstr;
	}

	// Property accessors

	public EspMstrId getId() {
		return this.id;
	}

	public void setId(EspMstrId id) {
		this.id = id;
	}

	public String getEspAccessCode() {
		return this.espAccessCode;
	}

	public void setEspAccessCode(String espAccessCode) {
		this.espAccessCode = espAccessCode;
	}

	public String getEspAppVer() {
		return this.espAppVer;
	}

	public void setEspAppVer(String espAppVer) {
		this.espAppVer = espAppVer;
	}

	public String getEspDelErrDet() {
		return this.espDelErrDet;
	}

	public void setEspDelErrDet(String espDelErrDet) {
		this.espDelErrDet = espDelErrDet;
	}

	public String getEspDestProc() {
		return this.espDestProc;
	}

	public void setEspDestProc(String espDestProc) {
		this.espDestProc = espDestProc;
	}

	public String getEspDocLng() {
		return this.espDocLng;
	}

	public void setEspDocLng(String espDocLng) {
		this.espDocLng = espDocLng;
	}

	public String getEspEmailUserid() {
		return this.espEmailUserid;
	}

	public void setEspEmailUserid(String espEmailUserid) {
		this.espEmailUserid = espEmailUserid;
	}

	public String getEspEmailNotlvl() {
		return this.espEmailNotlvl;
	}

	public void setEspEmailNotlvl(String espEmailNotlvl) {
		this.espEmailNotlvl = espEmailNotlvl;
	}

	public String getEspDesc() {
		return this.espDesc;
	}

	public void setEspDesc(String espDesc) {
		this.espDesc = espDesc;
	}

	public Boolean getEspExMapFlg() {
		return this.espExMapFlg;
	}

	public void setEspExMapFlg(Boolean espExMapFlg) {
		this.espExMapFlg = espExMapFlg;
	}

	public Boolean getEspSendFlg() {
		return this.espSendFlg;
	}

	public void setEspSendFlg(Boolean espSendFlg) {
		this.espSendFlg = espSendFlg;
	}

	public Boolean getEspPublFlg() {
		return this.espPublFlg;
	}

	public void setEspPublFlg(Boolean espPublFlg) {
		this.espPublFlg = espPublFlg;
	}

	public String getEspMapperProc() {
		return this.espMapperProc;
	}

	public void setEspMapperProc(String espMapperProc) {
		this.espMapperProc = espMapperProc;
	}

	public String getEspMapSpec() {
		return this.espMapSpec;
	}

	public void setEspMapSpec(String espMapSpec) {
		this.espMapSpec = espMapSpec;
	}

	public Date getEspModDate() {
		return this.espModDate;
	}

	public void setEspModDate(Date espModDate) {
		this.espModDate = espModDate;
	}

	public String getEspModUserid() {
		return this.espModUserid;
	}

	public void setEspModUserid(String espModUserid) {
		this.espModUserid = espModUserid;
	}

	public String getEspMsgAckLvl() {
		return this.espMsgAckLvl;
	}

	public void setEspMsgAckLvl(String espMsgAckLvl) {
		this.espMsgAckLvl = espMsgAckLvl;
	}

	public String getEspMsgClntOrd() {
		return this.espMsgClntOrd;
	}

	public void setEspMsgClntOrd(String espMsgClntOrd) {
		this.espMsgClntOrd = espMsgClntOrd;
	}

	public String getEspMsgPriority() {
		return this.espMsgPriority;
	}

	public void setEspMsgPriority(String espMsgPriority) {
		this.espMsgPriority = espMsgPriority;
	}

	public String getEspMsgRouting() {
		return this.espMsgRouting;
	}

	public void setEspMsgRouting(String espMsgRouting) {
		this.espMsgRouting = espMsgRouting;
	}

	public String getEspMsgTtl() {
		return this.espMsgTtl;
	}

	public void setEspMsgTtl(String espMsgTtl) {
		this.espMsgTtl = espMsgTtl;
	}

	public Integer getEspPauseSev() {
		return this.espPauseSev;
	}

	public void setEspPauseSev(Integer espPauseSev) {
		this.espPauseSev = espPauseSev;
	}

	public String getEspAckLvlReqd() {
		return this.espAckLvlReqd;
	}

	public void setEspAckLvlReqd(String espAckLvlReqd) {
		this.espAckLvlReqd = espAckLvlReqd;
	}

	public String getEspSrcComp() {
		return this.espSrcComp;
	}

	public void setEspSrcComp(String espSrcComp) {
		this.espSrcComp = espSrcComp;
	}

	public String getEspSrcAppId() {
		return this.espSrcAppId;
	}

	public void setEspSrcAppId(String espSrcAppId) {
		this.espSrcAppId = espSrcAppId;
	}

	public String getEspSrcTask() {
		return this.espSrcTask;
	}

	public void setEspSrcTask(String espSrcTask) {
		this.espSrcTask = espSrcTask;
	}

	public String getEspSrcAppVer() {
		return this.espSrcAppVer;
	}

	public void setEspSrcAppVer(String espSrcAppVer) {
		this.espSrcAppVer = espSrcAppVer;
	}

	public String getEspSrcDocRev() {
		return this.espSrcDocRev;
	}

	public void setEspSrcDocRev(String espSrcDocRev) {
		this.espSrcDocRev = espSrcDocRev;
	}

	public String getEspSrcDocStd() {
		return this.espSrcDocStd;
	}

	public void setEspSrcDocStd(String espSrcDocStd) {
		this.espSrcDocStd = espSrcDocStd;
	}

	public String getEspSrcDocTyp() {
		return this.espSrcDocTyp;
	}

	public void setEspSrcDocTyp(String espSrcDocTyp) {
		this.espSrcDocTyp = espSrcDocTyp;
	}

	public String getEspSrcProc() {
		return this.espSrcProc;
	}

	public void setEspSrcProc(String espSrcProc) {
		this.espSrcProc = espSrcProc;
	}

	public String getEspSrcUserid() {
		return this.espSrcUserid;
	}

	public void setEspSrcUserid(String espSrcUserid) {
		this.espSrcUserid = espSrcUserid;
	}

	public Boolean getEspUseExQueue() {
		return this.espUseExQueue;
	}

	public void setEspUseExQueue(Boolean espUseExQueue) {
		this.espUseExQueue = espUseExQueue;
	}

	public String getEspAckDocRev() {
		return this.espAckDocRev;
	}

	public void setEspAckDocRev(String espAckDocRev) {
		this.espAckDocRev = espAckDocRev;
	}

	public String getEspAckDocStd() {
		return this.espAckDocStd;
	}

	public void setEspAckDocStd(String espAckDocStd) {
		this.espAckDocStd = espAckDocStd;
	}

	public String getEspAckDocTyp() {
		return this.espAckDocTyp;
	}

	public void setEspAckDocTyp(String espAckDocTyp) {
		this.espAckDocTyp = espAckDocTyp;
	}

	public String getEspCodePg() {
		return this.espCodePg;
	}

	public void setEspCodePg(String espCodePg) {
		this.espCodePg = espCodePg;
	}

	public String getEspDateForm() {
		return this.espDateForm;
	}

	public void setEspDateForm(String espDateForm) {
		this.espDateForm = espDateForm;
	}

	public String getEspNumForm() {
		return this.espNumForm;
	}

	public void setEspNumForm(String espNumForm) {
		this.espNumForm = espNumForm;
	}

	public String getEspUser1() {
		return this.espUser1;
	}

	public void setEspUser1(String espUser1) {
		this.espUser1 = espUser1;
	}

	public String getEspUser2() {
		return this.espUser2;
	}

	public void setEspUser2(String espUser2) {
		this.espUser2 = espUser2;
	}

	public Double getEspDec01() {
		return this.espDec01;
	}

	public void setEspDec01(Double espDec01) {
		this.espDec01 = espDec01;
	}

	public Double getEspDec02() {
		return this.espDec02;
	}

	public void setEspDec02(Double espDec02) {
		this.espDec02 = espDec02;
	}

	public Integer getEspInt01() {
		return this.espInt01;
	}

	public void setEspInt01(Integer espInt01) {
		this.espInt01 = espInt01;
	}

	public Integer getEspInt02() {
		return this.espInt02;
	}

	public void setEspInt02(Integer espInt02) {
		this.espInt02 = espInt02;
	}

	public Boolean getEspLog01() {
		return this.espLog01;
	}

	public void setEspLog01(Boolean espLog01) {
		this.espLog01 = espLog01;
	}

	public Boolean getEspLog02() {
		return this.espLog02;
	}

	public void setEspLog02(Boolean espLog02) {
		this.espLog02 = espLog02;
	}

	public Date getEspDte01() {
		return this.espDte01;
	}

	public void setEspDte01(Date espDte01) {
		this.espDte01 = espDte01;
	}

	public Date getEspDte02() {
		return this.espDte02;
	}

	public void setEspDte02(Date espDte02) {
		this.espDte02 = espDte02;
	}

	public String getEspQadc01() {
		return this.espQadc01;
	}

	public void setEspQadc01(String espQadc01) {
		this.espQadc01 = espQadc01;
	}

	public String getEspQadc02() {
		return this.espQadc02;
	}

	public void setEspQadc02(String espQadc02) {
		this.espQadc02 = espQadc02;
	}

	public String getEspQadc03() {
		return this.espQadc03;
	}

	public void setEspQadc03(String espQadc03) {
		this.espQadc03 = espQadc03;
	}

	public String getEspQadc04() {
		return this.espQadc04;
	}

	public void setEspQadc04(String espQadc04) {
		this.espQadc04 = espQadc04;
	}

	public Double getEspQadd01() {
		return this.espQadd01;
	}

	public void setEspQadd01(Double espQadd01) {
		this.espQadd01 = espQadd01;
	}

	public Double getEspQadd02() {
		return this.espQadd02;
	}

	public void setEspQadd02(Double espQadd02) {
		this.espQadd02 = espQadd02;
	}

	public Integer getEspQadi01() {
		return this.espQadi01;
	}

	public void setEspQadi01(Integer espQadi01) {
		this.espQadi01 = espQadi01;
	}

	public Integer getEspQadi02() {
		return this.espQadi02;
	}

	public void setEspQadi02(Integer espQadi02) {
		this.espQadi02 = espQadi02;
	}

	public Boolean getEspQadl01() {
		return this.espQadl01;
	}

	public void setEspQadl01(Boolean espQadl01) {
		this.espQadl01 = espQadl01;
	}

	public Boolean getEspQadl02() {
		return this.espQadl02;
	}

	public void setEspQadl02(Boolean espQadl02) {
		this.espQadl02 = espQadl02;
	}

	public Date getEspQadt01() {
		return this.espQadt01;
	}

	public void setEspQadt01(Date espQadt01) {
		this.espQadt01 = espQadt01;
	}

	public Date getEspQadt02() {
		return this.espQadt02;
	}

	public void setEspQadt02(Date espQadt02) {
		this.espQadt02 = espQadt02;
	}

	public String getEspMsgSync() {
		return this.espMsgSync;
	}

	public void setEspMsgSync(String espMsgSync) {
		this.espMsgSync = espMsgSync;
	}

	public String getEspMsgSecur() {
		return this.espMsgSecur;
	}

	public void setEspMsgSecur(String espMsgSecur) {
		this.espMsgSecur = espMsgSecur;
	}

	public String getEspMsgPersist() {
		return this.espMsgPersist;
	}

	public void setEspMsgPersist(String espMsgPersist) {
		this.espMsgPersist = espMsgPersist;
	}

	public String getEspQueuePub() {
		return this.espQueuePub;
	}

	public void setEspQueuePub(String espQueuePub) {
		this.espQueuePub = espQueuePub;
	}

	public String getEspMapParm() {
		return this.espMapParm;
	}

	public void setEspMapParm(String espMapParm) {
		this.espMapParm = espMapParm;
	}

	public String getEspMapParmVal() {
		return this.espMapParmVal;
	}

	public void setEspMapParmVal(String espMapParmVal) {
		this.espMapParmVal = espMapParmVal;
	}

	public Boolean getEspEolDelim() {
		return this.espEolDelim;
	}

	public void setEspEolDelim(Boolean espEolDelim) {
		this.espEolDelim = espEolDelim;
	}

	public String getEspDtdName() {
		return this.espDtdName;
	}

	public void setEspDtdName(String espDtdName) {
		this.espDtdName = espDtdName;
	}

	public Integer getEspDelim() {
		return this.espDelim;
	}

	public void setEspDelim(Integer espDelim) {
		this.espDelim = espDelim;
	}

	public String getEspDestMthd() {
		return this.espDestMthd;
	}

	public void setEspDestMthd(String espDestMthd) {
		this.espDestMthd = espDestMthd;
	}

	public String getEspProcessTyp() {
		return this.espProcessTyp;
	}

	public void setEspProcessTyp(String espProcessTyp) {
		this.espProcessTyp = espProcessTyp;
	}

	public String getEspXml() {
		return this.espXml;
	}

	public void setEspXml(String espXml) {
		this.espXml = espXml;
	}

	public Double getOidEspMstr() {
		return this.oidEspMstr;
	}

	public void setOidEspMstr(Double oidEspMstr) {
		this.oidEspMstr = oidEspMstr;
	}

}