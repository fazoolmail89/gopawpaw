package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIfsMstr entity provides the base persistence definition of the
 * IfsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIfsMstr implements java.io.Serializable {

	// Fields

	private IfsMstrId id;
	private Integer ifsGrpId;
	private Integer ifsDocErrCnt;
	private Integer ifsDocTotCnt;
	private Integer ifsQadi03;
	private Integer ifsQadi04;
	private Integer ifsLstDocProc;
	private Date ifsModDate;
	private String ifsUserid;
	private String ifsSessHndl;
	private String ifsSessStat;
	private String ifsSessTyp;
	private Date ifsStartDate;
	private String ifsStartTime;
	private String ifsStartUserid;
	private String ifsUnitWrkTyp;
	private String ifsUser1;
	private String ifsUser2;
	private Double ifsDec01;
	private Double ifsDec02;
	private Integer ifsInt01;
	private Integer ifsInt02;
	private Boolean ifsLog01;
	private Boolean ifsLog02;
	private Date ifsDte01;
	private Date ifsDte02;
	private String ifsQadc01;
	private String ifsQadc02;
	private String ifsQadc03;
	private String ifsQadc04;
	private Double ifsQadd01;
	private Double ifsQadd02;
	private Integer ifsQadi01;
	private Integer ifsQadi02;
	private Boolean ifsQadl01;
	private Boolean ifsQadl02;
	private Date ifsQadt01;
	private Date ifsQadt02;
	private String ifsFilename;
	private Double oidIfsMstr;

	// Constructors

	/** default constructor */
	public AbstractIfsMstr() {
	}

	/** minimal constructor */
	public AbstractIfsMstr(IfsMstrId id, Double oidIfsMstr) {
		this.id = id;
		this.oidIfsMstr = oidIfsMstr;
	}

	/** full constructor */
	public AbstractIfsMstr(IfsMstrId id, Integer ifsGrpId,
			Integer ifsDocErrCnt, Integer ifsDocTotCnt, Integer ifsQadi03,
			Integer ifsQadi04, Integer ifsLstDocProc, Date ifsModDate,
			String ifsUserid, String ifsSessHndl, String ifsSessStat,
			String ifsSessTyp, Date ifsStartDate, String ifsStartTime,
			String ifsStartUserid, String ifsUnitWrkTyp, String ifsUser1,
			String ifsUser2, Double ifsDec01, Double ifsDec02,
			Integer ifsInt01, Integer ifsInt02, Boolean ifsLog01,
			Boolean ifsLog02, Date ifsDte01, Date ifsDte02, String ifsQadc01,
			String ifsQadc02, String ifsQadc03, String ifsQadc04,
			Double ifsQadd01, Double ifsQadd02, Integer ifsQadi01,
			Integer ifsQadi02, Boolean ifsQadl01, Boolean ifsQadl02,
			Date ifsQadt01, Date ifsQadt02, String ifsFilename,
			Double oidIfsMstr) {
		this.id = id;
		this.ifsGrpId = ifsGrpId;
		this.ifsDocErrCnt = ifsDocErrCnt;
		this.ifsDocTotCnt = ifsDocTotCnt;
		this.ifsQadi03 = ifsQadi03;
		this.ifsQadi04 = ifsQadi04;
		this.ifsLstDocProc = ifsLstDocProc;
		this.ifsModDate = ifsModDate;
		this.ifsUserid = ifsUserid;
		this.ifsSessHndl = ifsSessHndl;
		this.ifsSessStat = ifsSessStat;
		this.ifsSessTyp = ifsSessTyp;
		this.ifsStartDate = ifsStartDate;
		this.ifsStartTime = ifsStartTime;
		this.ifsStartUserid = ifsStartUserid;
		this.ifsUnitWrkTyp = ifsUnitWrkTyp;
		this.ifsUser1 = ifsUser1;
		this.ifsUser2 = ifsUser2;
		this.ifsDec01 = ifsDec01;
		this.ifsDec02 = ifsDec02;
		this.ifsInt01 = ifsInt01;
		this.ifsInt02 = ifsInt02;
		this.ifsLog01 = ifsLog01;
		this.ifsLog02 = ifsLog02;
		this.ifsDte01 = ifsDte01;
		this.ifsDte02 = ifsDte02;
		this.ifsQadc01 = ifsQadc01;
		this.ifsQadc02 = ifsQadc02;
		this.ifsQadc03 = ifsQadc03;
		this.ifsQadc04 = ifsQadc04;
		this.ifsQadd01 = ifsQadd01;
		this.ifsQadd02 = ifsQadd02;
		this.ifsQadi01 = ifsQadi01;
		this.ifsQadi02 = ifsQadi02;
		this.ifsQadl01 = ifsQadl01;
		this.ifsQadl02 = ifsQadl02;
		this.ifsQadt01 = ifsQadt01;
		this.ifsQadt02 = ifsQadt02;
		this.ifsFilename = ifsFilename;
		this.oidIfsMstr = oidIfsMstr;
	}

	// Property accessors

	public IfsMstrId getId() {
		return this.id;
	}

	public void setId(IfsMstrId id) {
		this.id = id;
	}

	public Integer getIfsGrpId() {
		return this.ifsGrpId;
	}

	public void setIfsGrpId(Integer ifsGrpId) {
		this.ifsGrpId = ifsGrpId;
	}

	public Integer getIfsDocErrCnt() {
		return this.ifsDocErrCnt;
	}

	public void setIfsDocErrCnt(Integer ifsDocErrCnt) {
		this.ifsDocErrCnt = ifsDocErrCnt;
	}

	public Integer getIfsDocTotCnt() {
		return this.ifsDocTotCnt;
	}

	public void setIfsDocTotCnt(Integer ifsDocTotCnt) {
		this.ifsDocTotCnt = ifsDocTotCnt;
	}

	public Integer getIfsQadi03() {
		return this.ifsQadi03;
	}

	public void setIfsQadi03(Integer ifsQadi03) {
		this.ifsQadi03 = ifsQadi03;
	}

	public Integer getIfsQadi04() {
		return this.ifsQadi04;
	}

	public void setIfsQadi04(Integer ifsQadi04) {
		this.ifsQadi04 = ifsQadi04;
	}

	public Integer getIfsLstDocProc() {
		return this.ifsLstDocProc;
	}

	public void setIfsLstDocProc(Integer ifsLstDocProc) {
		this.ifsLstDocProc = ifsLstDocProc;
	}

	public Date getIfsModDate() {
		return this.ifsModDate;
	}

	public void setIfsModDate(Date ifsModDate) {
		this.ifsModDate = ifsModDate;
	}

	public String getIfsUserid() {
		return this.ifsUserid;
	}

	public void setIfsUserid(String ifsUserid) {
		this.ifsUserid = ifsUserid;
	}

	public String getIfsSessHndl() {
		return this.ifsSessHndl;
	}

	public void setIfsSessHndl(String ifsSessHndl) {
		this.ifsSessHndl = ifsSessHndl;
	}

	public String getIfsSessStat() {
		return this.ifsSessStat;
	}

	public void setIfsSessStat(String ifsSessStat) {
		this.ifsSessStat = ifsSessStat;
	}

	public String getIfsSessTyp() {
		return this.ifsSessTyp;
	}

	public void setIfsSessTyp(String ifsSessTyp) {
		this.ifsSessTyp = ifsSessTyp;
	}

	public Date getIfsStartDate() {
		return this.ifsStartDate;
	}

	public void setIfsStartDate(Date ifsStartDate) {
		this.ifsStartDate = ifsStartDate;
	}

	public String getIfsStartTime() {
		return this.ifsStartTime;
	}

	public void setIfsStartTime(String ifsStartTime) {
		this.ifsStartTime = ifsStartTime;
	}

	public String getIfsStartUserid() {
		return this.ifsStartUserid;
	}

	public void setIfsStartUserid(String ifsStartUserid) {
		this.ifsStartUserid = ifsStartUserid;
	}

	public String getIfsUnitWrkTyp() {
		return this.ifsUnitWrkTyp;
	}

	public void setIfsUnitWrkTyp(String ifsUnitWrkTyp) {
		this.ifsUnitWrkTyp = ifsUnitWrkTyp;
	}

	public String getIfsUser1() {
		return this.ifsUser1;
	}

	public void setIfsUser1(String ifsUser1) {
		this.ifsUser1 = ifsUser1;
	}

	public String getIfsUser2() {
		return this.ifsUser2;
	}

	public void setIfsUser2(String ifsUser2) {
		this.ifsUser2 = ifsUser2;
	}

	public Double getIfsDec01() {
		return this.ifsDec01;
	}

	public void setIfsDec01(Double ifsDec01) {
		this.ifsDec01 = ifsDec01;
	}

	public Double getIfsDec02() {
		return this.ifsDec02;
	}

	public void setIfsDec02(Double ifsDec02) {
		this.ifsDec02 = ifsDec02;
	}

	public Integer getIfsInt01() {
		return this.ifsInt01;
	}

	public void setIfsInt01(Integer ifsInt01) {
		this.ifsInt01 = ifsInt01;
	}

	public Integer getIfsInt02() {
		return this.ifsInt02;
	}

	public void setIfsInt02(Integer ifsInt02) {
		this.ifsInt02 = ifsInt02;
	}

	public Boolean getIfsLog01() {
		return this.ifsLog01;
	}

	public void setIfsLog01(Boolean ifsLog01) {
		this.ifsLog01 = ifsLog01;
	}

	public Boolean getIfsLog02() {
		return this.ifsLog02;
	}

	public void setIfsLog02(Boolean ifsLog02) {
		this.ifsLog02 = ifsLog02;
	}

	public Date getIfsDte01() {
		return this.ifsDte01;
	}

	public void setIfsDte01(Date ifsDte01) {
		this.ifsDte01 = ifsDte01;
	}

	public Date getIfsDte02() {
		return this.ifsDte02;
	}

	public void setIfsDte02(Date ifsDte02) {
		this.ifsDte02 = ifsDte02;
	}

	public String getIfsQadc01() {
		return this.ifsQadc01;
	}

	public void setIfsQadc01(String ifsQadc01) {
		this.ifsQadc01 = ifsQadc01;
	}

	public String getIfsQadc02() {
		return this.ifsQadc02;
	}

	public void setIfsQadc02(String ifsQadc02) {
		this.ifsQadc02 = ifsQadc02;
	}

	public String getIfsQadc03() {
		return this.ifsQadc03;
	}

	public void setIfsQadc03(String ifsQadc03) {
		this.ifsQadc03 = ifsQadc03;
	}

	public String getIfsQadc04() {
		return this.ifsQadc04;
	}

	public void setIfsQadc04(String ifsQadc04) {
		this.ifsQadc04 = ifsQadc04;
	}

	public Double getIfsQadd01() {
		return this.ifsQadd01;
	}

	public void setIfsQadd01(Double ifsQadd01) {
		this.ifsQadd01 = ifsQadd01;
	}

	public Double getIfsQadd02() {
		return this.ifsQadd02;
	}

	public void setIfsQadd02(Double ifsQadd02) {
		this.ifsQadd02 = ifsQadd02;
	}

	public Integer getIfsQadi01() {
		return this.ifsQadi01;
	}

	public void setIfsQadi01(Integer ifsQadi01) {
		this.ifsQadi01 = ifsQadi01;
	}

	public Integer getIfsQadi02() {
		return this.ifsQadi02;
	}

	public void setIfsQadi02(Integer ifsQadi02) {
		this.ifsQadi02 = ifsQadi02;
	}

	public Boolean getIfsQadl01() {
		return this.ifsQadl01;
	}

	public void setIfsQadl01(Boolean ifsQadl01) {
		this.ifsQadl01 = ifsQadl01;
	}

	public Boolean getIfsQadl02() {
		return this.ifsQadl02;
	}

	public void setIfsQadl02(Boolean ifsQadl02) {
		this.ifsQadl02 = ifsQadl02;
	}

	public Date getIfsQadt01() {
		return this.ifsQadt01;
	}

	public void setIfsQadt01(Date ifsQadt01) {
		this.ifsQadt01 = ifsQadt01;
	}

	public Date getIfsQadt02() {
		return this.ifsQadt02;
	}

	public void setIfsQadt02(Date ifsQadt02) {
		this.ifsQadt02 = ifsQadt02;
	}

	public String getIfsFilename() {
		return this.ifsFilename;
	}

	public void setIfsFilename(String ifsFilename) {
		this.ifsFilename = ifsFilename;
	}

	public Double getOidIfsMstr() {
		return this.oidIfsMstr;
	}

	public void setOidIfsMstr(Double oidIfsMstr) {
		this.oidIfsMstr = oidIfsMstr;
	}

}