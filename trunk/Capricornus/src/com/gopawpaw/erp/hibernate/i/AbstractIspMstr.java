package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIspMstr entity provides the base persistence definition of the
 * IspMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIspMstr implements java.io.Serializable {

	// Fields

	private IspMstrId id;
	private String ispAccessCode;
	private String ispSrcComp;
	private String ispSrcTask;
	private String ispAppVer;
	private String ispDelErrDet;
	private String ispDestAppId;
	private String ispDestAppVer;
	private String ispDestDocRev;
	private String ispDestDocStd;
	private String ispDestDocTyp;
	private String ispDestProc;
	private Boolean ispCimProc;
	private String ispDocLng;
	private String ispEmailUserid;
	private String ispEmailNotlvl;
	private Boolean ispImMapFlg;
	private Boolean ispProcFlg;
	private Boolean ispRcvFlg;
	private String ispDesc;
	private String ispMapperProc;
	private String ispMapSpec;
	private Date ispModDate;
	private String ispModUserid;
	private Integer ispPauseSev;
	private String ispAckDocRev;
	private String ispAckDocStd;
	private String ispAckDocTyp;
	private String ispAckLvlReqd;
	private String ispSrcProc;
	private String ispSrcUserid;
	private Boolean ispUseImQueue;
	private String ispCodePg;
	private String ispDateForm;
	private String ispNumForm;
	private String ispUser1;
	private String ispUser2;
	private Double ispDec01;
	private Double ispDec02;
	private Integer ispInt01;
	private Integer ispInt02;
	private Boolean ispLog01;
	private Boolean ispLog02;
	private Date ispDte01;
	private Date ispDte02;
	private String ispQadc01;
	private String ispQadc02;
	private String ispQadc03;
	private String ispQadc04;
	private Double ispQadd01;
	private Double ispQadd02;
	private Integer ispQadi01;
	private Integer ispQadi02;
	private Boolean ispQadl01;
	private Boolean ispQadl02;
	private Date ispQadt01;
	private Date ispQadt02;
	private String ispMapParm;
	private String ispMapParmVal;
	private Integer ispDelim;
	private String ispDestMthd;
	private String ispProcessTyp;
	private String ispXml;
	private Double oidIspMstr;

	// Constructors

	/** default constructor */
	public AbstractIspMstr() {
	}

	/** minimal constructor */
	public AbstractIspMstr(IspMstrId id, Double oidIspMstr) {
		this.id = id;
		this.oidIspMstr = oidIspMstr;
	}

	/** full constructor */
	public AbstractIspMstr(IspMstrId id, String ispAccessCode,
			String ispSrcComp, String ispSrcTask, String ispAppVer,
			String ispDelErrDet, String ispDestAppId, String ispDestAppVer,
			String ispDestDocRev, String ispDestDocStd, String ispDestDocTyp,
			String ispDestProc, Boolean ispCimProc, String ispDocLng,
			String ispEmailUserid, String ispEmailNotlvl, Boolean ispImMapFlg,
			Boolean ispProcFlg, Boolean ispRcvFlg, String ispDesc,
			String ispMapperProc, String ispMapSpec, Date ispModDate,
			String ispModUserid, Integer ispPauseSev, String ispAckDocRev,
			String ispAckDocStd, String ispAckDocTyp, String ispAckLvlReqd,
			String ispSrcProc, String ispSrcUserid, Boolean ispUseImQueue,
			String ispCodePg, String ispDateForm, String ispNumForm,
			String ispUser1, String ispUser2, Double ispDec01, Double ispDec02,
			Integer ispInt01, Integer ispInt02, Boolean ispLog01,
			Boolean ispLog02, Date ispDte01, Date ispDte02, String ispQadc01,
			String ispQadc02, String ispQadc03, String ispQadc04,
			Double ispQadd01, Double ispQadd02, Integer ispQadi01,
			Integer ispQadi02, Boolean ispQadl01, Boolean ispQadl02,
			Date ispQadt01, Date ispQadt02, String ispMapParm,
			String ispMapParmVal, Integer ispDelim, String ispDestMthd,
			String ispProcessTyp, String ispXml, Double oidIspMstr) {
		this.id = id;
		this.ispAccessCode = ispAccessCode;
		this.ispSrcComp = ispSrcComp;
		this.ispSrcTask = ispSrcTask;
		this.ispAppVer = ispAppVer;
		this.ispDelErrDet = ispDelErrDet;
		this.ispDestAppId = ispDestAppId;
		this.ispDestAppVer = ispDestAppVer;
		this.ispDestDocRev = ispDestDocRev;
		this.ispDestDocStd = ispDestDocStd;
		this.ispDestDocTyp = ispDestDocTyp;
		this.ispDestProc = ispDestProc;
		this.ispCimProc = ispCimProc;
		this.ispDocLng = ispDocLng;
		this.ispEmailUserid = ispEmailUserid;
		this.ispEmailNotlvl = ispEmailNotlvl;
		this.ispImMapFlg = ispImMapFlg;
		this.ispProcFlg = ispProcFlg;
		this.ispRcvFlg = ispRcvFlg;
		this.ispDesc = ispDesc;
		this.ispMapperProc = ispMapperProc;
		this.ispMapSpec = ispMapSpec;
		this.ispModDate = ispModDate;
		this.ispModUserid = ispModUserid;
		this.ispPauseSev = ispPauseSev;
		this.ispAckDocRev = ispAckDocRev;
		this.ispAckDocStd = ispAckDocStd;
		this.ispAckDocTyp = ispAckDocTyp;
		this.ispAckLvlReqd = ispAckLvlReqd;
		this.ispSrcProc = ispSrcProc;
		this.ispSrcUserid = ispSrcUserid;
		this.ispUseImQueue = ispUseImQueue;
		this.ispCodePg = ispCodePg;
		this.ispDateForm = ispDateForm;
		this.ispNumForm = ispNumForm;
		this.ispUser1 = ispUser1;
		this.ispUser2 = ispUser2;
		this.ispDec01 = ispDec01;
		this.ispDec02 = ispDec02;
		this.ispInt01 = ispInt01;
		this.ispInt02 = ispInt02;
		this.ispLog01 = ispLog01;
		this.ispLog02 = ispLog02;
		this.ispDte01 = ispDte01;
		this.ispDte02 = ispDte02;
		this.ispQadc01 = ispQadc01;
		this.ispQadc02 = ispQadc02;
		this.ispQadc03 = ispQadc03;
		this.ispQadc04 = ispQadc04;
		this.ispQadd01 = ispQadd01;
		this.ispQadd02 = ispQadd02;
		this.ispQadi01 = ispQadi01;
		this.ispQadi02 = ispQadi02;
		this.ispQadl01 = ispQadl01;
		this.ispQadl02 = ispQadl02;
		this.ispQadt01 = ispQadt01;
		this.ispQadt02 = ispQadt02;
		this.ispMapParm = ispMapParm;
		this.ispMapParmVal = ispMapParmVal;
		this.ispDelim = ispDelim;
		this.ispDestMthd = ispDestMthd;
		this.ispProcessTyp = ispProcessTyp;
		this.ispXml = ispXml;
		this.oidIspMstr = oidIspMstr;
	}

	// Property accessors

	public IspMstrId getId() {
		return this.id;
	}

	public void setId(IspMstrId id) {
		this.id = id;
	}

	public String getIspAccessCode() {
		return this.ispAccessCode;
	}

	public void setIspAccessCode(String ispAccessCode) {
		this.ispAccessCode = ispAccessCode;
	}

	public String getIspSrcComp() {
		return this.ispSrcComp;
	}

	public void setIspSrcComp(String ispSrcComp) {
		this.ispSrcComp = ispSrcComp;
	}

	public String getIspSrcTask() {
		return this.ispSrcTask;
	}

	public void setIspSrcTask(String ispSrcTask) {
		this.ispSrcTask = ispSrcTask;
	}

	public String getIspAppVer() {
		return this.ispAppVer;
	}

	public void setIspAppVer(String ispAppVer) {
		this.ispAppVer = ispAppVer;
	}

	public String getIspDelErrDet() {
		return this.ispDelErrDet;
	}

	public void setIspDelErrDet(String ispDelErrDet) {
		this.ispDelErrDet = ispDelErrDet;
	}

	public String getIspDestAppId() {
		return this.ispDestAppId;
	}

	public void setIspDestAppId(String ispDestAppId) {
		this.ispDestAppId = ispDestAppId;
	}

	public String getIspDestAppVer() {
		return this.ispDestAppVer;
	}

	public void setIspDestAppVer(String ispDestAppVer) {
		this.ispDestAppVer = ispDestAppVer;
	}

	public String getIspDestDocRev() {
		return this.ispDestDocRev;
	}

	public void setIspDestDocRev(String ispDestDocRev) {
		this.ispDestDocRev = ispDestDocRev;
	}

	public String getIspDestDocStd() {
		return this.ispDestDocStd;
	}

	public void setIspDestDocStd(String ispDestDocStd) {
		this.ispDestDocStd = ispDestDocStd;
	}

	public String getIspDestDocTyp() {
		return this.ispDestDocTyp;
	}

	public void setIspDestDocTyp(String ispDestDocTyp) {
		this.ispDestDocTyp = ispDestDocTyp;
	}

	public String getIspDestProc() {
		return this.ispDestProc;
	}

	public void setIspDestProc(String ispDestProc) {
		this.ispDestProc = ispDestProc;
	}

	public Boolean getIspCimProc() {
		return this.ispCimProc;
	}

	public void setIspCimProc(Boolean ispCimProc) {
		this.ispCimProc = ispCimProc;
	}

	public String getIspDocLng() {
		return this.ispDocLng;
	}

	public void setIspDocLng(String ispDocLng) {
		this.ispDocLng = ispDocLng;
	}

	public String getIspEmailUserid() {
		return this.ispEmailUserid;
	}

	public void setIspEmailUserid(String ispEmailUserid) {
		this.ispEmailUserid = ispEmailUserid;
	}

	public String getIspEmailNotlvl() {
		return this.ispEmailNotlvl;
	}

	public void setIspEmailNotlvl(String ispEmailNotlvl) {
		this.ispEmailNotlvl = ispEmailNotlvl;
	}

	public Boolean getIspImMapFlg() {
		return this.ispImMapFlg;
	}

	public void setIspImMapFlg(Boolean ispImMapFlg) {
		this.ispImMapFlg = ispImMapFlg;
	}

	public Boolean getIspProcFlg() {
		return this.ispProcFlg;
	}

	public void setIspProcFlg(Boolean ispProcFlg) {
		this.ispProcFlg = ispProcFlg;
	}

	public Boolean getIspRcvFlg() {
		return this.ispRcvFlg;
	}

	public void setIspRcvFlg(Boolean ispRcvFlg) {
		this.ispRcvFlg = ispRcvFlg;
	}

	public String getIspDesc() {
		return this.ispDesc;
	}

	public void setIspDesc(String ispDesc) {
		this.ispDesc = ispDesc;
	}

	public String getIspMapperProc() {
		return this.ispMapperProc;
	}

	public void setIspMapperProc(String ispMapperProc) {
		this.ispMapperProc = ispMapperProc;
	}

	public String getIspMapSpec() {
		return this.ispMapSpec;
	}

	public void setIspMapSpec(String ispMapSpec) {
		this.ispMapSpec = ispMapSpec;
	}

	public Date getIspModDate() {
		return this.ispModDate;
	}

	public void setIspModDate(Date ispModDate) {
		this.ispModDate = ispModDate;
	}

	public String getIspModUserid() {
		return this.ispModUserid;
	}

	public void setIspModUserid(String ispModUserid) {
		this.ispModUserid = ispModUserid;
	}

	public Integer getIspPauseSev() {
		return this.ispPauseSev;
	}

	public void setIspPauseSev(Integer ispPauseSev) {
		this.ispPauseSev = ispPauseSev;
	}

	public String getIspAckDocRev() {
		return this.ispAckDocRev;
	}

	public void setIspAckDocRev(String ispAckDocRev) {
		this.ispAckDocRev = ispAckDocRev;
	}

	public String getIspAckDocStd() {
		return this.ispAckDocStd;
	}

	public void setIspAckDocStd(String ispAckDocStd) {
		this.ispAckDocStd = ispAckDocStd;
	}

	public String getIspAckDocTyp() {
		return this.ispAckDocTyp;
	}

	public void setIspAckDocTyp(String ispAckDocTyp) {
		this.ispAckDocTyp = ispAckDocTyp;
	}

	public String getIspAckLvlReqd() {
		return this.ispAckLvlReqd;
	}

	public void setIspAckLvlReqd(String ispAckLvlReqd) {
		this.ispAckLvlReqd = ispAckLvlReqd;
	}

	public String getIspSrcProc() {
		return this.ispSrcProc;
	}

	public void setIspSrcProc(String ispSrcProc) {
		this.ispSrcProc = ispSrcProc;
	}

	public String getIspSrcUserid() {
		return this.ispSrcUserid;
	}

	public void setIspSrcUserid(String ispSrcUserid) {
		this.ispSrcUserid = ispSrcUserid;
	}

	public Boolean getIspUseImQueue() {
		return this.ispUseImQueue;
	}

	public void setIspUseImQueue(Boolean ispUseImQueue) {
		this.ispUseImQueue = ispUseImQueue;
	}

	public String getIspCodePg() {
		return this.ispCodePg;
	}

	public void setIspCodePg(String ispCodePg) {
		this.ispCodePg = ispCodePg;
	}

	public String getIspDateForm() {
		return this.ispDateForm;
	}

	public void setIspDateForm(String ispDateForm) {
		this.ispDateForm = ispDateForm;
	}

	public String getIspNumForm() {
		return this.ispNumForm;
	}

	public void setIspNumForm(String ispNumForm) {
		this.ispNumForm = ispNumForm;
	}

	public String getIspUser1() {
		return this.ispUser1;
	}

	public void setIspUser1(String ispUser1) {
		this.ispUser1 = ispUser1;
	}

	public String getIspUser2() {
		return this.ispUser2;
	}

	public void setIspUser2(String ispUser2) {
		this.ispUser2 = ispUser2;
	}

	public Double getIspDec01() {
		return this.ispDec01;
	}

	public void setIspDec01(Double ispDec01) {
		this.ispDec01 = ispDec01;
	}

	public Double getIspDec02() {
		return this.ispDec02;
	}

	public void setIspDec02(Double ispDec02) {
		this.ispDec02 = ispDec02;
	}

	public Integer getIspInt01() {
		return this.ispInt01;
	}

	public void setIspInt01(Integer ispInt01) {
		this.ispInt01 = ispInt01;
	}

	public Integer getIspInt02() {
		return this.ispInt02;
	}

	public void setIspInt02(Integer ispInt02) {
		this.ispInt02 = ispInt02;
	}

	public Boolean getIspLog01() {
		return this.ispLog01;
	}

	public void setIspLog01(Boolean ispLog01) {
		this.ispLog01 = ispLog01;
	}

	public Boolean getIspLog02() {
		return this.ispLog02;
	}

	public void setIspLog02(Boolean ispLog02) {
		this.ispLog02 = ispLog02;
	}

	public Date getIspDte01() {
		return this.ispDte01;
	}

	public void setIspDte01(Date ispDte01) {
		this.ispDte01 = ispDte01;
	}

	public Date getIspDte02() {
		return this.ispDte02;
	}

	public void setIspDte02(Date ispDte02) {
		this.ispDte02 = ispDte02;
	}

	public String getIspQadc01() {
		return this.ispQadc01;
	}

	public void setIspQadc01(String ispQadc01) {
		this.ispQadc01 = ispQadc01;
	}

	public String getIspQadc02() {
		return this.ispQadc02;
	}

	public void setIspQadc02(String ispQadc02) {
		this.ispQadc02 = ispQadc02;
	}

	public String getIspQadc03() {
		return this.ispQadc03;
	}

	public void setIspQadc03(String ispQadc03) {
		this.ispQadc03 = ispQadc03;
	}

	public String getIspQadc04() {
		return this.ispQadc04;
	}

	public void setIspQadc04(String ispQadc04) {
		this.ispQadc04 = ispQadc04;
	}

	public Double getIspQadd01() {
		return this.ispQadd01;
	}

	public void setIspQadd01(Double ispQadd01) {
		this.ispQadd01 = ispQadd01;
	}

	public Double getIspQadd02() {
		return this.ispQadd02;
	}

	public void setIspQadd02(Double ispQadd02) {
		this.ispQadd02 = ispQadd02;
	}

	public Integer getIspQadi01() {
		return this.ispQadi01;
	}

	public void setIspQadi01(Integer ispQadi01) {
		this.ispQadi01 = ispQadi01;
	}

	public Integer getIspQadi02() {
		return this.ispQadi02;
	}

	public void setIspQadi02(Integer ispQadi02) {
		this.ispQadi02 = ispQadi02;
	}

	public Boolean getIspQadl01() {
		return this.ispQadl01;
	}

	public void setIspQadl01(Boolean ispQadl01) {
		this.ispQadl01 = ispQadl01;
	}

	public Boolean getIspQadl02() {
		return this.ispQadl02;
	}

	public void setIspQadl02(Boolean ispQadl02) {
		this.ispQadl02 = ispQadl02;
	}

	public Date getIspQadt01() {
		return this.ispQadt01;
	}

	public void setIspQadt01(Date ispQadt01) {
		this.ispQadt01 = ispQadt01;
	}

	public Date getIspQadt02() {
		return this.ispQadt02;
	}

	public void setIspQadt02(Date ispQadt02) {
		this.ispQadt02 = ispQadt02;
	}

	public String getIspMapParm() {
		return this.ispMapParm;
	}

	public void setIspMapParm(String ispMapParm) {
		this.ispMapParm = ispMapParm;
	}

	public String getIspMapParmVal() {
		return this.ispMapParmVal;
	}

	public void setIspMapParmVal(String ispMapParmVal) {
		this.ispMapParmVal = ispMapParmVal;
	}

	public Integer getIspDelim() {
		return this.ispDelim;
	}

	public void setIspDelim(Integer ispDelim) {
		this.ispDelim = ispDelim;
	}

	public String getIspDestMthd() {
		return this.ispDestMthd;
	}

	public void setIspDestMthd(String ispDestMthd) {
		this.ispDestMthd = ispDestMthd;
	}

	public String getIspProcessTyp() {
		return this.ispProcessTyp;
	}

	public void setIspProcessTyp(String ispProcessTyp) {
		this.ispProcessTyp = ispProcessTyp;
	}

	public String getIspXml() {
		return this.ispXml;
	}

	public void setIspXml(String ispXml) {
		this.ispXml = ispXml;
	}

	public Double getOidIspMstr() {
		return this.oidIspMstr;
	}

	public void setOidIspMstr(Double oidIspMstr) {
		this.oidIspMstr = oidIspMstr;
	}

}