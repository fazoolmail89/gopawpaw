package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCoCtrl entity provides the base persistence definition of the CoCtrl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCoCtrl implements java.io.Serializable {

	// Fields

	private String coDomain;
	private String coQad01;
	private String coPl;
	private String coRet;
	private String coVarAcct;
	private Boolean coEntyBal;
	private String coTrnsAcct;
	private String coFxAcct;
	private String coUser1;
	private String coUser2;
	private Integer coQadi01;
	private Boolean coAllowMod;
	private Integer coPageNum;
	private Boolean coContPage;
	private Boolean coUseSub;
	private Boolean coUseCc;
	private Boolean coDailySeq;
	private String coExRatetype;
	private Boolean coAudglt;
	private Boolean coQadl01;
	private String coYecAcct;
	private String coYecSub;
	private String coYecCc;
	private String coYecDesc;
	private String coBfbAcct;
	private String coBfbSub;
	private String coBfbCc;
	private String coBfbDesc;
	private Boolean coCloseBs;
	private Boolean coSupReop;
	private Double oidCoCtrl;

	// Constructors

	/** default constructor */
	public AbstractCoCtrl() {
	}

	/** minimal constructor */
	public AbstractCoCtrl(String coExRatetype, String coYecAcct,
			String coYecSub, String coYecCc, String coYecDesc,
			String coBfbAcct, String coBfbSub, String coBfbCc,
			String coBfbDesc, Boolean coCloseBs, Boolean coSupReop,
			Double oidCoCtrl) {
		this.coExRatetype = coExRatetype;
		this.coYecAcct = coYecAcct;
		this.coYecSub = coYecSub;
		this.coYecCc = coYecCc;
		this.coYecDesc = coYecDesc;
		this.coBfbAcct = coBfbAcct;
		this.coBfbSub = coBfbSub;
		this.coBfbCc = coBfbCc;
		this.coBfbDesc = coBfbDesc;
		this.coCloseBs = coCloseBs;
		this.coSupReop = coSupReop;
		this.oidCoCtrl = oidCoCtrl;
	}

	/** full constructor */
	public AbstractCoCtrl(String coQad01, String coPl, String coRet,
			String coVarAcct, Boolean coEntyBal, String coTrnsAcct,
			String coFxAcct, String coUser1, String coUser2, Integer coQadi01,
			Boolean coAllowMod, Integer coPageNum, Boolean coContPage,
			Boolean coUseSub, Boolean coUseCc, Boolean coDailySeq,
			String coExRatetype, Boolean coAudglt, Boolean coQadl01,
			String coYecAcct, String coYecSub, String coYecCc,
			String coYecDesc, String coBfbAcct, String coBfbSub,
			String coBfbCc, String coBfbDesc, Boolean coCloseBs,
			Boolean coSupReop, Double oidCoCtrl) {
		this.coQad01 = coQad01;
		this.coPl = coPl;
		this.coRet = coRet;
		this.coVarAcct = coVarAcct;
		this.coEntyBal = coEntyBal;
		this.coTrnsAcct = coTrnsAcct;
		this.coFxAcct = coFxAcct;
		this.coUser1 = coUser1;
		this.coUser2 = coUser2;
		this.coQadi01 = coQadi01;
		this.coAllowMod = coAllowMod;
		this.coPageNum = coPageNum;
		this.coContPage = coContPage;
		this.coUseSub = coUseSub;
		this.coUseCc = coUseCc;
		this.coDailySeq = coDailySeq;
		this.coExRatetype = coExRatetype;
		this.coAudglt = coAudglt;
		this.coQadl01 = coQadl01;
		this.coYecAcct = coYecAcct;
		this.coYecSub = coYecSub;
		this.coYecCc = coYecCc;
		this.coYecDesc = coYecDesc;
		this.coBfbAcct = coBfbAcct;
		this.coBfbSub = coBfbSub;
		this.coBfbCc = coBfbCc;
		this.coBfbDesc = coBfbDesc;
		this.coCloseBs = coCloseBs;
		this.coSupReop = coSupReop;
		this.oidCoCtrl = oidCoCtrl;
	}

	// Property accessors

	public String getCoDomain() {
		return this.coDomain;
	}

	public void setCoDomain(String coDomain) {
		this.coDomain = coDomain;
	}

	public String getCoQad01() {
		return this.coQad01;
	}

	public void setCoQad01(String coQad01) {
		this.coQad01 = coQad01;
	}

	public String getCoPl() {
		return this.coPl;
	}

	public void setCoPl(String coPl) {
		this.coPl = coPl;
	}

	public String getCoRet() {
		return this.coRet;
	}

	public void setCoRet(String coRet) {
		this.coRet = coRet;
	}

	public String getCoVarAcct() {
		return this.coVarAcct;
	}

	public void setCoVarAcct(String coVarAcct) {
		this.coVarAcct = coVarAcct;
	}

	public Boolean getCoEntyBal() {
		return this.coEntyBal;
	}

	public void setCoEntyBal(Boolean coEntyBal) {
		this.coEntyBal = coEntyBal;
	}

	public String getCoTrnsAcct() {
		return this.coTrnsAcct;
	}

	public void setCoTrnsAcct(String coTrnsAcct) {
		this.coTrnsAcct = coTrnsAcct;
	}

	public String getCoFxAcct() {
		return this.coFxAcct;
	}

	public void setCoFxAcct(String coFxAcct) {
		this.coFxAcct = coFxAcct;
	}

	public String getCoUser1() {
		return this.coUser1;
	}

	public void setCoUser1(String coUser1) {
		this.coUser1 = coUser1;
	}

	public String getCoUser2() {
		return this.coUser2;
	}

	public void setCoUser2(String coUser2) {
		this.coUser2 = coUser2;
	}

	public Integer getCoQadi01() {
		return this.coQadi01;
	}

	public void setCoQadi01(Integer coQadi01) {
		this.coQadi01 = coQadi01;
	}

	public Boolean getCoAllowMod() {
		return this.coAllowMod;
	}

	public void setCoAllowMod(Boolean coAllowMod) {
		this.coAllowMod = coAllowMod;
	}

	public Integer getCoPageNum() {
		return this.coPageNum;
	}

	public void setCoPageNum(Integer coPageNum) {
		this.coPageNum = coPageNum;
	}

	public Boolean getCoContPage() {
		return this.coContPage;
	}

	public void setCoContPage(Boolean coContPage) {
		this.coContPage = coContPage;
	}

	public Boolean getCoUseSub() {
		return this.coUseSub;
	}

	public void setCoUseSub(Boolean coUseSub) {
		this.coUseSub = coUseSub;
	}

	public Boolean getCoUseCc() {
		return this.coUseCc;
	}

	public void setCoUseCc(Boolean coUseCc) {
		this.coUseCc = coUseCc;
	}

	public Boolean getCoDailySeq() {
		return this.coDailySeq;
	}

	public void setCoDailySeq(Boolean coDailySeq) {
		this.coDailySeq = coDailySeq;
	}

	public String getCoExRatetype() {
		return this.coExRatetype;
	}

	public void setCoExRatetype(String coExRatetype) {
		this.coExRatetype = coExRatetype;
	}

	public Boolean getCoAudglt() {
		return this.coAudglt;
	}

	public void setCoAudglt(Boolean coAudglt) {
		this.coAudglt = coAudglt;
	}

	public Boolean getCoQadl01() {
		return this.coQadl01;
	}

	public void setCoQadl01(Boolean coQadl01) {
		this.coQadl01 = coQadl01;
	}

	public String getCoYecAcct() {
		return this.coYecAcct;
	}

	public void setCoYecAcct(String coYecAcct) {
		this.coYecAcct = coYecAcct;
	}

	public String getCoYecSub() {
		return this.coYecSub;
	}

	public void setCoYecSub(String coYecSub) {
		this.coYecSub = coYecSub;
	}

	public String getCoYecCc() {
		return this.coYecCc;
	}

	public void setCoYecCc(String coYecCc) {
		this.coYecCc = coYecCc;
	}

	public String getCoYecDesc() {
		return this.coYecDesc;
	}

	public void setCoYecDesc(String coYecDesc) {
		this.coYecDesc = coYecDesc;
	}

	public String getCoBfbAcct() {
		return this.coBfbAcct;
	}

	public void setCoBfbAcct(String coBfbAcct) {
		this.coBfbAcct = coBfbAcct;
	}

	public String getCoBfbSub() {
		return this.coBfbSub;
	}

	public void setCoBfbSub(String coBfbSub) {
		this.coBfbSub = coBfbSub;
	}

	public String getCoBfbCc() {
		return this.coBfbCc;
	}

	public void setCoBfbCc(String coBfbCc) {
		this.coBfbCc = coBfbCc;
	}

	public String getCoBfbDesc() {
		return this.coBfbDesc;
	}

	public void setCoBfbDesc(String coBfbDesc) {
		this.coBfbDesc = coBfbDesc;
	}

	public Boolean getCoCloseBs() {
		return this.coCloseBs;
	}

	public void setCoCloseBs(Boolean coCloseBs) {
		this.coCloseBs = coCloseBs;
	}

	public Boolean getCoSupReop() {
		return this.coSupReop;
	}

	public void setCoSupReop(Boolean coSupReop) {
		this.coSupReop = coSupReop;
	}

	public Double getOidCoCtrl() {
		return this.oidCoCtrl;
	}

	public void setOidCoCtrl(Double oidCoCtrl) {
		this.oidCoCtrl = oidCoCtrl;
	}

}