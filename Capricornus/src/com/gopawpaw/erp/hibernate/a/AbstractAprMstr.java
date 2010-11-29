package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAprMstr entity provides the base persistence definition of the
 * AprMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAprMstr implements java.io.Serializable {

	// Fields

	private AprMstrId id;
	private String aprAccessCode;
	private String aprSrcComp;
	private String aprDesc;
	private String aprName;
	private String aprSrcTask;
	private String aprAppVer;
	private String aprDelErrDet;
	private String aprDocLng;
	private String aprEmailUserid;
	private String aprEmailNotlvl;
	private String aprExDestProc;
	private Boolean aprExInitConn;
	private Boolean aprExMapFlg;
	private Boolean aprSendFlg;
	private Boolean aprPublFlg;
	private String aprImDestProc;
	private Boolean aprImInitConn;
	private Boolean aprCimProc;
	private Boolean aprImMapFlg;
	private Boolean aprProcFlag;
	private Boolean aprRcvFlg;
	private String aprMapperProc;
	private Date aprModDate;
	private String aprModUserid;
	private String aprMsgAckLvl;
	private String aprMsgClntOrd;
	private String aprMsgPriority;
	private String aprMsgRouting;
	private String aprMsgTtl;
	private Integer aprPauseSev;
	private String aprAckDocRev;
	private String aprAckDocStd;
	private String aprAckDocTyp;
	private String aprAckLvlReqd;
	private String aprSrcUserid;
	private String aprImIpAddr;
	private String aprExIpAddr;
	private Integer aprImPortNbr;
	private Integer aprExPortNbr;
	private String aprAdapterProc;
	private String aprAdapterEnv;
	private String aprCodePg;
	private String aprDateForm;
	private String aprNumForm;
	private String aprMapSpec;
	private String aprUser1;
	private String aprUser2;
	private Double aprDec01;
	private Double aprDec02;
	private Boolean aprLog01;
	private Integer aprInt01;
	private Boolean aprLog02;
	private Integer aprInt02;
	private Date aprDte01;
	private Date aprDte02;
	private String aprQadc01;
	private String aprQadc02;
	private String aprQadc03;
	private String aprQadc04;
	private Double aprQadd01;
	private Double aprQadd02;
	private Integer aprQadi01;
	private Integer aprQadi02;
	private Boolean aprQadl01;
	private Boolean aprQadl02;
	private Date aprQadt01;
	private Date aprQadt02;
	private String aprMsgSecur;
	private String aprMsgPersist;
	private String aprQueuePub;
	private String aprMapParm;
	private String aprMapParmVal;
	private Boolean aprEolDelim;
	private String aprMsgSync;
	private String aprImDocStd;
	private String aprAdaptCmd;
	private Boolean aprAdaptStart;
	private String aprImXml;
	private String aprExXml;
	private String aprDtdDirUrl;
	private Integer aprExDelim;
	private Integer aprImDelim;
	private String aprImArchDir;
	private String aprExArchDir;
	private String aprImDestMthd;
	private String aprImPrcTyp;
	private String aprExDestMthd;
	private String aprExPrcTyp;
	private Double oidAprMstr;

	// Constructors

	/** default constructor */
	public AbstractAprMstr() {
	}

	/** minimal constructor */
	public AbstractAprMstr(AprMstrId id, Double oidAprMstr) {
		this.id = id;
		this.oidAprMstr = oidAprMstr;
	}

	/** full constructor */
	public AbstractAprMstr(AprMstrId id, String aprAccessCode,
			String aprSrcComp, String aprDesc, String aprName,
			String aprSrcTask, String aprAppVer, String aprDelErrDet,
			String aprDocLng, String aprEmailUserid, String aprEmailNotlvl,
			String aprExDestProc, Boolean aprExInitConn, Boolean aprExMapFlg,
			Boolean aprSendFlg, Boolean aprPublFlg, String aprImDestProc,
			Boolean aprImInitConn, Boolean aprCimProc, Boolean aprImMapFlg,
			Boolean aprProcFlag, Boolean aprRcvFlg, String aprMapperProc,
			Date aprModDate, String aprModUserid, String aprMsgAckLvl,
			String aprMsgClntOrd, String aprMsgPriority, String aprMsgRouting,
			String aprMsgTtl, Integer aprPauseSev, String aprAckDocRev,
			String aprAckDocStd, String aprAckDocTyp, String aprAckLvlReqd,
			String aprSrcUserid, String aprImIpAddr, String aprExIpAddr,
			Integer aprImPortNbr, Integer aprExPortNbr, String aprAdapterProc,
			String aprAdapterEnv, String aprCodePg, String aprDateForm,
			String aprNumForm, String aprMapSpec, String aprUser1,
			String aprUser2, Double aprDec01, Double aprDec02,
			Boolean aprLog01, Integer aprInt01, Boolean aprLog02,
			Integer aprInt02, Date aprDte01, Date aprDte02, String aprQadc01,
			String aprQadc02, String aprQadc03, String aprQadc04,
			Double aprQadd01, Double aprQadd02, Integer aprQadi01,
			Integer aprQadi02, Boolean aprQadl01, Boolean aprQadl02,
			Date aprQadt01, Date aprQadt02, String aprMsgSecur,
			String aprMsgPersist, String aprQueuePub, String aprMapParm,
			String aprMapParmVal, Boolean aprEolDelim, String aprMsgSync,
			String aprImDocStd, String aprAdaptCmd, Boolean aprAdaptStart,
			String aprImXml, String aprExXml, String aprDtdDirUrl,
			Integer aprExDelim, Integer aprImDelim, String aprImArchDir,
			String aprExArchDir, String aprImDestMthd, String aprImPrcTyp,
			String aprExDestMthd, String aprExPrcTyp, Double oidAprMstr) {
		this.id = id;
		this.aprAccessCode = aprAccessCode;
		this.aprSrcComp = aprSrcComp;
		this.aprDesc = aprDesc;
		this.aprName = aprName;
		this.aprSrcTask = aprSrcTask;
		this.aprAppVer = aprAppVer;
		this.aprDelErrDet = aprDelErrDet;
		this.aprDocLng = aprDocLng;
		this.aprEmailUserid = aprEmailUserid;
		this.aprEmailNotlvl = aprEmailNotlvl;
		this.aprExDestProc = aprExDestProc;
		this.aprExInitConn = aprExInitConn;
		this.aprExMapFlg = aprExMapFlg;
		this.aprSendFlg = aprSendFlg;
		this.aprPublFlg = aprPublFlg;
		this.aprImDestProc = aprImDestProc;
		this.aprImInitConn = aprImInitConn;
		this.aprCimProc = aprCimProc;
		this.aprImMapFlg = aprImMapFlg;
		this.aprProcFlag = aprProcFlag;
		this.aprRcvFlg = aprRcvFlg;
		this.aprMapperProc = aprMapperProc;
		this.aprModDate = aprModDate;
		this.aprModUserid = aprModUserid;
		this.aprMsgAckLvl = aprMsgAckLvl;
		this.aprMsgClntOrd = aprMsgClntOrd;
		this.aprMsgPriority = aprMsgPriority;
		this.aprMsgRouting = aprMsgRouting;
		this.aprMsgTtl = aprMsgTtl;
		this.aprPauseSev = aprPauseSev;
		this.aprAckDocRev = aprAckDocRev;
		this.aprAckDocStd = aprAckDocStd;
		this.aprAckDocTyp = aprAckDocTyp;
		this.aprAckLvlReqd = aprAckLvlReqd;
		this.aprSrcUserid = aprSrcUserid;
		this.aprImIpAddr = aprImIpAddr;
		this.aprExIpAddr = aprExIpAddr;
		this.aprImPortNbr = aprImPortNbr;
		this.aprExPortNbr = aprExPortNbr;
		this.aprAdapterProc = aprAdapterProc;
		this.aprAdapterEnv = aprAdapterEnv;
		this.aprCodePg = aprCodePg;
		this.aprDateForm = aprDateForm;
		this.aprNumForm = aprNumForm;
		this.aprMapSpec = aprMapSpec;
		this.aprUser1 = aprUser1;
		this.aprUser2 = aprUser2;
		this.aprDec01 = aprDec01;
		this.aprDec02 = aprDec02;
		this.aprLog01 = aprLog01;
		this.aprInt01 = aprInt01;
		this.aprLog02 = aprLog02;
		this.aprInt02 = aprInt02;
		this.aprDte01 = aprDte01;
		this.aprDte02 = aprDte02;
		this.aprQadc01 = aprQadc01;
		this.aprQadc02 = aprQadc02;
		this.aprQadc03 = aprQadc03;
		this.aprQadc04 = aprQadc04;
		this.aprQadd01 = aprQadd01;
		this.aprQadd02 = aprQadd02;
		this.aprQadi01 = aprQadi01;
		this.aprQadi02 = aprQadi02;
		this.aprQadl01 = aprQadl01;
		this.aprQadl02 = aprQadl02;
		this.aprQadt01 = aprQadt01;
		this.aprQadt02 = aprQadt02;
		this.aprMsgSecur = aprMsgSecur;
		this.aprMsgPersist = aprMsgPersist;
		this.aprQueuePub = aprQueuePub;
		this.aprMapParm = aprMapParm;
		this.aprMapParmVal = aprMapParmVal;
		this.aprEolDelim = aprEolDelim;
		this.aprMsgSync = aprMsgSync;
		this.aprImDocStd = aprImDocStd;
		this.aprAdaptCmd = aprAdaptCmd;
		this.aprAdaptStart = aprAdaptStart;
		this.aprImXml = aprImXml;
		this.aprExXml = aprExXml;
		this.aprDtdDirUrl = aprDtdDirUrl;
		this.aprExDelim = aprExDelim;
		this.aprImDelim = aprImDelim;
		this.aprImArchDir = aprImArchDir;
		this.aprExArchDir = aprExArchDir;
		this.aprImDestMthd = aprImDestMthd;
		this.aprImPrcTyp = aprImPrcTyp;
		this.aprExDestMthd = aprExDestMthd;
		this.aprExPrcTyp = aprExPrcTyp;
		this.oidAprMstr = oidAprMstr;
	}

	// Property accessors

	public AprMstrId getId() {
		return this.id;
	}

	public void setId(AprMstrId id) {
		this.id = id;
	}

	public String getAprAccessCode() {
		return this.aprAccessCode;
	}

	public void setAprAccessCode(String aprAccessCode) {
		this.aprAccessCode = aprAccessCode;
	}

	public String getAprSrcComp() {
		return this.aprSrcComp;
	}

	public void setAprSrcComp(String aprSrcComp) {
		this.aprSrcComp = aprSrcComp;
	}

	public String getAprDesc() {
		return this.aprDesc;
	}

	public void setAprDesc(String aprDesc) {
		this.aprDesc = aprDesc;
	}

	public String getAprName() {
		return this.aprName;
	}

	public void setAprName(String aprName) {
		this.aprName = aprName;
	}

	public String getAprSrcTask() {
		return this.aprSrcTask;
	}

	public void setAprSrcTask(String aprSrcTask) {
		this.aprSrcTask = aprSrcTask;
	}

	public String getAprAppVer() {
		return this.aprAppVer;
	}

	public void setAprAppVer(String aprAppVer) {
		this.aprAppVer = aprAppVer;
	}

	public String getAprDelErrDet() {
		return this.aprDelErrDet;
	}

	public void setAprDelErrDet(String aprDelErrDet) {
		this.aprDelErrDet = aprDelErrDet;
	}

	public String getAprDocLng() {
		return this.aprDocLng;
	}

	public void setAprDocLng(String aprDocLng) {
		this.aprDocLng = aprDocLng;
	}

	public String getAprEmailUserid() {
		return this.aprEmailUserid;
	}

	public void setAprEmailUserid(String aprEmailUserid) {
		this.aprEmailUserid = aprEmailUserid;
	}

	public String getAprEmailNotlvl() {
		return this.aprEmailNotlvl;
	}

	public void setAprEmailNotlvl(String aprEmailNotlvl) {
		this.aprEmailNotlvl = aprEmailNotlvl;
	}

	public String getAprExDestProc() {
		return this.aprExDestProc;
	}

	public void setAprExDestProc(String aprExDestProc) {
		this.aprExDestProc = aprExDestProc;
	}

	public Boolean getAprExInitConn() {
		return this.aprExInitConn;
	}

	public void setAprExInitConn(Boolean aprExInitConn) {
		this.aprExInitConn = aprExInitConn;
	}

	public Boolean getAprExMapFlg() {
		return this.aprExMapFlg;
	}

	public void setAprExMapFlg(Boolean aprExMapFlg) {
		this.aprExMapFlg = aprExMapFlg;
	}

	public Boolean getAprSendFlg() {
		return this.aprSendFlg;
	}

	public void setAprSendFlg(Boolean aprSendFlg) {
		this.aprSendFlg = aprSendFlg;
	}

	public Boolean getAprPublFlg() {
		return this.aprPublFlg;
	}

	public void setAprPublFlg(Boolean aprPublFlg) {
		this.aprPublFlg = aprPublFlg;
	}

	public String getAprImDestProc() {
		return this.aprImDestProc;
	}

	public void setAprImDestProc(String aprImDestProc) {
		this.aprImDestProc = aprImDestProc;
	}

	public Boolean getAprImInitConn() {
		return this.aprImInitConn;
	}

	public void setAprImInitConn(Boolean aprImInitConn) {
		this.aprImInitConn = aprImInitConn;
	}

	public Boolean getAprCimProc() {
		return this.aprCimProc;
	}

	public void setAprCimProc(Boolean aprCimProc) {
		this.aprCimProc = aprCimProc;
	}

	public Boolean getAprImMapFlg() {
		return this.aprImMapFlg;
	}

	public void setAprImMapFlg(Boolean aprImMapFlg) {
		this.aprImMapFlg = aprImMapFlg;
	}

	public Boolean getAprProcFlag() {
		return this.aprProcFlag;
	}

	public void setAprProcFlag(Boolean aprProcFlag) {
		this.aprProcFlag = aprProcFlag;
	}

	public Boolean getAprRcvFlg() {
		return this.aprRcvFlg;
	}

	public void setAprRcvFlg(Boolean aprRcvFlg) {
		this.aprRcvFlg = aprRcvFlg;
	}

	public String getAprMapperProc() {
		return this.aprMapperProc;
	}

	public void setAprMapperProc(String aprMapperProc) {
		this.aprMapperProc = aprMapperProc;
	}

	public Date getAprModDate() {
		return this.aprModDate;
	}

	public void setAprModDate(Date aprModDate) {
		this.aprModDate = aprModDate;
	}

	public String getAprModUserid() {
		return this.aprModUserid;
	}

	public void setAprModUserid(String aprModUserid) {
		this.aprModUserid = aprModUserid;
	}

	public String getAprMsgAckLvl() {
		return this.aprMsgAckLvl;
	}

	public void setAprMsgAckLvl(String aprMsgAckLvl) {
		this.aprMsgAckLvl = aprMsgAckLvl;
	}

	public String getAprMsgClntOrd() {
		return this.aprMsgClntOrd;
	}

	public void setAprMsgClntOrd(String aprMsgClntOrd) {
		this.aprMsgClntOrd = aprMsgClntOrd;
	}

	public String getAprMsgPriority() {
		return this.aprMsgPriority;
	}

	public void setAprMsgPriority(String aprMsgPriority) {
		this.aprMsgPriority = aprMsgPriority;
	}

	public String getAprMsgRouting() {
		return this.aprMsgRouting;
	}

	public void setAprMsgRouting(String aprMsgRouting) {
		this.aprMsgRouting = aprMsgRouting;
	}

	public String getAprMsgTtl() {
		return this.aprMsgTtl;
	}

	public void setAprMsgTtl(String aprMsgTtl) {
		this.aprMsgTtl = aprMsgTtl;
	}

	public Integer getAprPauseSev() {
		return this.aprPauseSev;
	}

	public void setAprPauseSev(Integer aprPauseSev) {
		this.aprPauseSev = aprPauseSev;
	}

	public String getAprAckDocRev() {
		return this.aprAckDocRev;
	}

	public void setAprAckDocRev(String aprAckDocRev) {
		this.aprAckDocRev = aprAckDocRev;
	}

	public String getAprAckDocStd() {
		return this.aprAckDocStd;
	}

	public void setAprAckDocStd(String aprAckDocStd) {
		this.aprAckDocStd = aprAckDocStd;
	}

	public String getAprAckDocTyp() {
		return this.aprAckDocTyp;
	}

	public void setAprAckDocTyp(String aprAckDocTyp) {
		this.aprAckDocTyp = aprAckDocTyp;
	}

	public String getAprAckLvlReqd() {
		return this.aprAckLvlReqd;
	}

	public void setAprAckLvlReqd(String aprAckLvlReqd) {
		this.aprAckLvlReqd = aprAckLvlReqd;
	}

	public String getAprSrcUserid() {
		return this.aprSrcUserid;
	}

	public void setAprSrcUserid(String aprSrcUserid) {
		this.aprSrcUserid = aprSrcUserid;
	}

	public String getAprImIpAddr() {
		return this.aprImIpAddr;
	}

	public void setAprImIpAddr(String aprImIpAddr) {
		this.aprImIpAddr = aprImIpAddr;
	}

	public String getAprExIpAddr() {
		return this.aprExIpAddr;
	}

	public void setAprExIpAddr(String aprExIpAddr) {
		this.aprExIpAddr = aprExIpAddr;
	}

	public Integer getAprImPortNbr() {
		return this.aprImPortNbr;
	}

	public void setAprImPortNbr(Integer aprImPortNbr) {
		this.aprImPortNbr = aprImPortNbr;
	}

	public Integer getAprExPortNbr() {
		return this.aprExPortNbr;
	}

	public void setAprExPortNbr(Integer aprExPortNbr) {
		this.aprExPortNbr = aprExPortNbr;
	}

	public String getAprAdapterProc() {
		return this.aprAdapterProc;
	}

	public void setAprAdapterProc(String aprAdapterProc) {
		this.aprAdapterProc = aprAdapterProc;
	}

	public String getAprAdapterEnv() {
		return this.aprAdapterEnv;
	}

	public void setAprAdapterEnv(String aprAdapterEnv) {
		this.aprAdapterEnv = aprAdapterEnv;
	}

	public String getAprCodePg() {
		return this.aprCodePg;
	}

	public void setAprCodePg(String aprCodePg) {
		this.aprCodePg = aprCodePg;
	}

	public String getAprDateForm() {
		return this.aprDateForm;
	}

	public void setAprDateForm(String aprDateForm) {
		this.aprDateForm = aprDateForm;
	}

	public String getAprNumForm() {
		return this.aprNumForm;
	}

	public void setAprNumForm(String aprNumForm) {
		this.aprNumForm = aprNumForm;
	}

	public String getAprMapSpec() {
		return this.aprMapSpec;
	}

	public void setAprMapSpec(String aprMapSpec) {
		this.aprMapSpec = aprMapSpec;
	}

	public String getAprUser1() {
		return this.aprUser1;
	}

	public void setAprUser1(String aprUser1) {
		this.aprUser1 = aprUser1;
	}

	public String getAprUser2() {
		return this.aprUser2;
	}

	public void setAprUser2(String aprUser2) {
		this.aprUser2 = aprUser2;
	}

	public Double getAprDec01() {
		return this.aprDec01;
	}

	public void setAprDec01(Double aprDec01) {
		this.aprDec01 = aprDec01;
	}

	public Double getAprDec02() {
		return this.aprDec02;
	}

	public void setAprDec02(Double aprDec02) {
		this.aprDec02 = aprDec02;
	}

	public Boolean getAprLog01() {
		return this.aprLog01;
	}

	public void setAprLog01(Boolean aprLog01) {
		this.aprLog01 = aprLog01;
	}

	public Integer getAprInt01() {
		return this.aprInt01;
	}

	public void setAprInt01(Integer aprInt01) {
		this.aprInt01 = aprInt01;
	}

	public Boolean getAprLog02() {
		return this.aprLog02;
	}

	public void setAprLog02(Boolean aprLog02) {
		this.aprLog02 = aprLog02;
	}

	public Integer getAprInt02() {
		return this.aprInt02;
	}

	public void setAprInt02(Integer aprInt02) {
		this.aprInt02 = aprInt02;
	}

	public Date getAprDte01() {
		return this.aprDte01;
	}

	public void setAprDte01(Date aprDte01) {
		this.aprDte01 = aprDte01;
	}

	public Date getAprDte02() {
		return this.aprDte02;
	}

	public void setAprDte02(Date aprDte02) {
		this.aprDte02 = aprDte02;
	}

	public String getAprQadc01() {
		return this.aprQadc01;
	}

	public void setAprQadc01(String aprQadc01) {
		this.aprQadc01 = aprQadc01;
	}

	public String getAprQadc02() {
		return this.aprQadc02;
	}

	public void setAprQadc02(String aprQadc02) {
		this.aprQadc02 = aprQadc02;
	}

	public String getAprQadc03() {
		return this.aprQadc03;
	}

	public void setAprQadc03(String aprQadc03) {
		this.aprQadc03 = aprQadc03;
	}

	public String getAprQadc04() {
		return this.aprQadc04;
	}

	public void setAprQadc04(String aprQadc04) {
		this.aprQadc04 = aprQadc04;
	}

	public Double getAprQadd01() {
		return this.aprQadd01;
	}

	public void setAprQadd01(Double aprQadd01) {
		this.aprQadd01 = aprQadd01;
	}

	public Double getAprQadd02() {
		return this.aprQadd02;
	}

	public void setAprQadd02(Double aprQadd02) {
		this.aprQadd02 = aprQadd02;
	}

	public Integer getAprQadi01() {
		return this.aprQadi01;
	}

	public void setAprQadi01(Integer aprQadi01) {
		this.aprQadi01 = aprQadi01;
	}

	public Integer getAprQadi02() {
		return this.aprQadi02;
	}

	public void setAprQadi02(Integer aprQadi02) {
		this.aprQadi02 = aprQadi02;
	}

	public Boolean getAprQadl01() {
		return this.aprQadl01;
	}

	public void setAprQadl01(Boolean aprQadl01) {
		this.aprQadl01 = aprQadl01;
	}

	public Boolean getAprQadl02() {
		return this.aprQadl02;
	}

	public void setAprQadl02(Boolean aprQadl02) {
		this.aprQadl02 = aprQadl02;
	}

	public Date getAprQadt01() {
		return this.aprQadt01;
	}

	public void setAprQadt01(Date aprQadt01) {
		this.aprQadt01 = aprQadt01;
	}

	public Date getAprQadt02() {
		return this.aprQadt02;
	}

	public void setAprQadt02(Date aprQadt02) {
		this.aprQadt02 = aprQadt02;
	}

	public String getAprMsgSecur() {
		return this.aprMsgSecur;
	}

	public void setAprMsgSecur(String aprMsgSecur) {
		this.aprMsgSecur = aprMsgSecur;
	}

	public String getAprMsgPersist() {
		return this.aprMsgPersist;
	}

	public void setAprMsgPersist(String aprMsgPersist) {
		this.aprMsgPersist = aprMsgPersist;
	}

	public String getAprQueuePub() {
		return this.aprQueuePub;
	}

	public void setAprQueuePub(String aprQueuePub) {
		this.aprQueuePub = aprQueuePub;
	}

	public String getAprMapParm() {
		return this.aprMapParm;
	}

	public void setAprMapParm(String aprMapParm) {
		this.aprMapParm = aprMapParm;
	}

	public String getAprMapParmVal() {
		return this.aprMapParmVal;
	}

	public void setAprMapParmVal(String aprMapParmVal) {
		this.aprMapParmVal = aprMapParmVal;
	}

	public Boolean getAprEolDelim() {
		return this.aprEolDelim;
	}

	public void setAprEolDelim(Boolean aprEolDelim) {
		this.aprEolDelim = aprEolDelim;
	}

	public String getAprMsgSync() {
		return this.aprMsgSync;
	}

	public void setAprMsgSync(String aprMsgSync) {
		this.aprMsgSync = aprMsgSync;
	}

	public String getAprImDocStd() {
		return this.aprImDocStd;
	}

	public void setAprImDocStd(String aprImDocStd) {
		this.aprImDocStd = aprImDocStd;
	}

	public String getAprAdaptCmd() {
		return this.aprAdaptCmd;
	}

	public void setAprAdaptCmd(String aprAdaptCmd) {
		this.aprAdaptCmd = aprAdaptCmd;
	}

	public Boolean getAprAdaptStart() {
		return this.aprAdaptStart;
	}

	public void setAprAdaptStart(Boolean aprAdaptStart) {
		this.aprAdaptStart = aprAdaptStart;
	}

	public String getAprImXml() {
		return this.aprImXml;
	}

	public void setAprImXml(String aprImXml) {
		this.aprImXml = aprImXml;
	}

	public String getAprExXml() {
		return this.aprExXml;
	}

	public void setAprExXml(String aprExXml) {
		this.aprExXml = aprExXml;
	}

	public String getAprDtdDirUrl() {
		return this.aprDtdDirUrl;
	}

	public void setAprDtdDirUrl(String aprDtdDirUrl) {
		this.aprDtdDirUrl = aprDtdDirUrl;
	}

	public Integer getAprExDelim() {
		return this.aprExDelim;
	}

	public void setAprExDelim(Integer aprExDelim) {
		this.aprExDelim = aprExDelim;
	}

	public Integer getAprImDelim() {
		return this.aprImDelim;
	}

	public void setAprImDelim(Integer aprImDelim) {
		this.aprImDelim = aprImDelim;
	}

	public String getAprImArchDir() {
		return this.aprImArchDir;
	}

	public void setAprImArchDir(String aprImArchDir) {
		this.aprImArchDir = aprImArchDir;
	}

	public String getAprExArchDir() {
		return this.aprExArchDir;
	}

	public void setAprExArchDir(String aprExArchDir) {
		this.aprExArchDir = aprExArchDir;
	}

	public String getAprImDestMthd() {
		return this.aprImDestMthd;
	}

	public void setAprImDestMthd(String aprImDestMthd) {
		this.aprImDestMthd = aprImDestMthd;
	}

	public String getAprImPrcTyp() {
		return this.aprImPrcTyp;
	}

	public void setAprImPrcTyp(String aprImPrcTyp) {
		this.aprImPrcTyp = aprImPrcTyp;
	}

	public String getAprExDestMthd() {
		return this.aprExDestMthd;
	}

	public void setAprExDestMthd(String aprExDestMthd) {
		this.aprExDestMthd = aprExDestMthd;
	}

	public String getAprExPrcTyp() {
		return this.aprExPrcTyp;
	}

	public void setAprExPrcTyp(String aprExPrcTyp) {
		this.aprExPrcTyp = aprExPrcTyp;
	}

	public Double getOidAprMstr() {
		return this.oidAprMstr;
	}

	public void setOidAprMstr(Double oidAprMstr) {
		this.oidAprMstr = oidAprMstr;
	}

}