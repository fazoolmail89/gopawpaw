package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIecCtrl entity provides the base persistence definition of the
 * IecCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIecCtrl implements java.io.Serializable {

	// Fields

	private String iecDomain;
	private String iecAuthority;
	private String iecAgent;
	private String iecAgentId;
	private String iecComCode;
	private String iecDeclarant;
	private String iecDeclarantId;
	private String iecFlowArr;
	private String iecFlowDisp;
	private Boolean iecInclMemo;
	private String iecIntComCode;
	private String iecModeTransp;
	private String iecNatTrans;
	private Double iecNetWtMin;
	private String iecNetWtUm;
	private String iecPortArrdisp;
	private String iecPortTransh;
	private String iecRefLogic;
	private String iecStatProc;
	private String iecTermsDeliv;
	private Boolean iecUseInstat;
	private Integer iecQadi02;
	private String iecUserid;
	private Date iecModDate;
	private Integer iecQadi01;
	private String iecRegion;
	private Integer iecDeclarationId;
	private String iecChr01;
	private String iecChr02;
	private String iecChr03;
	private String iecChr04;
	private Double iecDec01;
	private Boolean iecLog01;
	private Boolean iecLog02;
	private String iecQadc01;
	private String iecQadc02;
	private String iecQadc03;
	private String iecQadc04;
	private Double iecQadd01;
	private Boolean iecQadl01;
	private Boolean iecQadl02;
	private Boolean iecImpexp;
	private String iecUser1;
	private String iecUser2;
	private String iecActInTypeList;
	private String iecActExTypeList;
	private String iecCorrFlowArr;
	private String iecCorrFlowDisp;
	private Boolean iecUseExtrastat;
	private Boolean iecContainer;
	private Integer iecPreference;
	private Double oidIecCtrl;

	// Constructors

	/** default constructor */
	public AbstractIecCtrl() {
	}

	/** minimal constructor */
	public AbstractIecCtrl(String iecActInTypeList, String iecActExTypeList,
			String iecCorrFlowArr, String iecCorrFlowDisp,
			Boolean iecUseExtrastat, Boolean iecContainer,
			Integer iecPreference, Double oidIecCtrl) {
		this.iecActInTypeList = iecActInTypeList;
		this.iecActExTypeList = iecActExTypeList;
		this.iecCorrFlowArr = iecCorrFlowArr;
		this.iecCorrFlowDisp = iecCorrFlowDisp;
		this.iecUseExtrastat = iecUseExtrastat;
		this.iecContainer = iecContainer;
		this.iecPreference = iecPreference;
		this.oidIecCtrl = oidIecCtrl;
	}

	/** full constructor */
	public AbstractIecCtrl(String iecAuthority, String iecAgent,
			String iecAgentId, String iecComCode, String iecDeclarant,
			String iecDeclarantId, String iecFlowArr, String iecFlowDisp,
			Boolean iecInclMemo, String iecIntComCode, String iecModeTransp,
			String iecNatTrans, Double iecNetWtMin, String iecNetWtUm,
			String iecPortArrdisp, String iecPortTransh, String iecRefLogic,
			String iecStatProc, String iecTermsDeliv, Boolean iecUseInstat,
			Integer iecQadi02, String iecUserid, Date iecModDate,
			Integer iecQadi01, String iecRegion, Integer iecDeclarationId,
			String iecChr01, String iecChr02, String iecChr03, String iecChr04,
			Double iecDec01, Boolean iecLog01, Boolean iecLog02,
			String iecQadc01, String iecQadc02, String iecQadc03,
			String iecQadc04, Double iecQadd01, Boolean iecQadl01,
			Boolean iecQadl02, Boolean iecImpexp, String iecUser1,
			String iecUser2, String iecActInTypeList, String iecActExTypeList,
			String iecCorrFlowArr, String iecCorrFlowDisp,
			Boolean iecUseExtrastat, Boolean iecContainer,
			Integer iecPreference, Double oidIecCtrl) {
		this.iecAuthority = iecAuthority;
		this.iecAgent = iecAgent;
		this.iecAgentId = iecAgentId;
		this.iecComCode = iecComCode;
		this.iecDeclarant = iecDeclarant;
		this.iecDeclarantId = iecDeclarantId;
		this.iecFlowArr = iecFlowArr;
		this.iecFlowDisp = iecFlowDisp;
		this.iecInclMemo = iecInclMemo;
		this.iecIntComCode = iecIntComCode;
		this.iecModeTransp = iecModeTransp;
		this.iecNatTrans = iecNatTrans;
		this.iecNetWtMin = iecNetWtMin;
		this.iecNetWtUm = iecNetWtUm;
		this.iecPortArrdisp = iecPortArrdisp;
		this.iecPortTransh = iecPortTransh;
		this.iecRefLogic = iecRefLogic;
		this.iecStatProc = iecStatProc;
		this.iecTermsDeliv = iecTermsDeliv;
		this.iecUseInstat = iecUseInstat;
		this.iecQadi02 = iecQadi02;
		this.iecUserid = iecUserid;
		this.iecModDate = iecModDate;
		this.iecQadi01 = iecQadi01;
		this.iecRegion = iecRegion;
		this.iecDeclarationId = iecDeclarationId;
		this.iecChr01 = iecChr01;
		this.iecChr02 = iecChr02;
		this.iecChr03 = iecChr03;
		this.iecChr04 = iecChr04;
		this.iecDec01 = iecDec01;
		this.iecLog01 = iecLog01;
		this.iecLog02 = iecLog02;
		this.iecQadc01 = iecQadc01;
		this.iecQadc02 = iecQadc02;
		this.iecQadc03 = iecQadc03;
		this.iecQadc04 = iecQadc04;
		this.iecQadd01 = iecQadd01;
		this.iecQadl01 = iecQadl01;
		this.iecQadl02 = iecQadl02;
		this.iecImpexp = iecImpexp;
		this.iecUser1 = iecUser1;
		this.iecUser2 = iecUser2;
		this.iecActInTypeList = iecActInTypeList;
		this.iecActExTypeList = iecActExTypeList;
		this.iecCorrFlowArr = iecCorrFlowArr;
		this.iecCorrFlowDisp = iecCorrFlowDisp;
		this.iecUseExtrastat = iecUseExtrastat;
		this.iecContainer = iecContainer;
		this.iecPreference = iecPreference;
		this.oidIecCtrl = oidIecCtrl;
	}

	// Property accessors

	public String getIecDomain() {
		return this.iecDomain;
	}

	public void setIecDomain(String iecDomain) {
		this.iecDomain = iecDomain;
	}

	public String getIecAuthority() {
		return this.iecAuthority;
	}

	public void setIecAuthority(String iecAuthority) {
		this.iecAuthority = iecAuthority;
	}

	public String getIecAgent() {
		return this.iecAgent;
	}

	public void setIecAgent(String iecAgent) {
		this.iecAgent = iecAgent;
	}

	public String getIecAgentId() {
		return this.iecAgentId;
	}

	public void setIecAgentId(String iecAgentId) {
		this.iecAgentId = iecAgentId;
	}

	public String getIecComCode() {
		return this.iecComCode;
	}

	public void setIecComCode(String iecComCode) {
		this.iecComCode = iecComCode;
	}

	public String getIecDeclarant() {
		return this.iecDeclarant;
	}

	public void setIecDeclarant(String iecDeclarant) {
		this.iecDeclarant = iecDeclarant;
	}

	public String getIecDeclarantId() {
		return this.iecDeclarantId;
	}

	public void setIecDeclarantId(String iecDeclarantId) {
		this.iecDeclarantId = iecDeclarantId;
	}

	public String getIecFlowArr() {
		return this.iecFlowArr;
	}

	public void setIecFlowArr(String iecFlowArr) {
		this.iecFlowArr = iecFlowArr;
	}

	public String getIecFlowDisp() {
		return this.iecFlowDisp;
	}

	public void setIecFlowDisp(String iecFlowDisp) {
		this.iecFlowDisp = iecFlowDisp;
	}

	public Boolean getIecInclMemo() {
		return this.iecInclMemo;
	}

	public void setIecInclMemo(Boolean iecInclMemo) {
		this.iecInclMemo = iecInclMemo;
	}

	public String getIecIntComCode() {
		return this.iecIntComCode;
	}

	public void setIecIntComCode(String iecIntComCode) {
		this.iecIntComCode = iecIntComCode;
	}

	public String getIecModeTransp() {
		return this.iecModeTransp;
	}

	public void setIecModeTransp(String iecModeTransp) {
		this.iecModeTransp = iecModeTransp;
	}

	public String getIecNatTrans() {
		return this.iecNatTrans;
	}

	public void setIecNatTrans(String iecNatTrans) {
		this.iecNatTrans = iecNatTrans;
	}

	public Double getIecNetWtMin() {
		return this.iecNetWtMin;
	}

	public void setIecNetWtMin(Double iecNetWtMin) {
		this.iecNetWtMin = iecNetWtMin;
	}

	public String getIecNetWtUm() {
		return this.iecNetWtUm;
	}

	public void setIecNetWtUm(String iecNetWtUm) {
		this.iecNetWtUm = iecNetWtUm;
	}

	public String getIecPortArrdisp() {
		return this.iecPortArrdisp;
	}

	public void setIecPortArrdisp(String iecPortArrdisp) {
		this.iecPortArrdisp = iecPortArrdisp;
	}

	public String getIecPortTransh() {
		return this.iecPortTransh;
	}

	public void setIecPortTransh(String iecPortTransh) {
		this.iecPortTransh = iecPortTransh;
	}

	public String getIecRefLogic() {
		return this.iecRefLogic;
	}

	public void setIecRefLogic(String iecRefLogic) {
		this.iecRefLogic = iecRefLogic;
	}

	public String getIecStatProc() {
		return this.iecStatProc;
	}

	public void setIecStatProc(String iecStatProc) {
		this.iecStatProc = iecStatProc;
	}

	public String getIecTermsDeliv() {
		return this.iecTermsDeliv;
	}

	public void setIecTermsDeliv(String iecTermsDeliv) {
		this.iecTermsDeliv = iecTermsDeliv;
	}

	public Boolean getIecUseInstat() {
		return this.iecUseInstat;
	}

	public void setIecUseInstat(Boolean iecUseInstat) {
		this.iecUseInstat = iecUseInstat;
	}

	public Integer getIecQadi02() {
		return this.iecQadi02;
	}

	public void setIecQadi02(Integer iecQadi02) {
		this.iecQadi02 = iecQadi02;
	}

	public String getIecUserid() {
		return this.iecUserid;
	}

	public void setIecUserid(String iecUserid) {
		this.iecUserid = iecUserid;
	}

	public Date getIecModDate() {
		return this.iecModDate;
	}

	public void setIecModDate(Date iecModDate) {
		this.iecModDate = iecModDate;
	}

	public Integer getIecQadi01() {
		return this.iecQadi01;
	}

	public void setIecQadi01(Integer iecQadi01) {
		this.iecQadi01 = iecQadi01;
	}

	public String getIecRegion() {
		return this.iecRegion;
	}

	public void setIecRegion(String iecRegion) {
		this.iecRegion = iecRegion;
	}

	public Integer getIecDeclarationId() {
		return this.iecDeclarationId;
	}

	public void setIecDeclarationId(Integer iecDeclarationId) {
		this.iecDeclarationId = iecDeclarationId;
	}

	public String getIecChr01() {
		return this.iecChr01;
	}

	public void setIecChr01(String iecChr01) {
		this.iecChr01 = iecChr01;
	}

	public String getIecChr02() {
		return this.iecChr02;
	}

	public void setIecChr02(String iecChr02) {
		this.iecChr02 = iecChr02;
	}

	public String getIecChr03() {
		return this.iecChr03;
	}

	public void setIecChr03(String iecChr03) {
		this.iecChr03 = iecChr03;
	}

	public String getIecChr04() {
		return this.iecChr04;
	}

	public void setIecChr04(String iecChr04) {
		this.iecChr04 = iecChr04;
	}

	public Double getIecDec01() {
		return this.iecDec01;
	}

	public void setIecDec01(Double iecDec01) {
		this.iecDec01 = iecDec01;
	}

	public Boolean getIecLog01() {
		return this.iecLog01;
	}

	public void setIecLog01(Boolean iecLog01) {
		this.iecLog01 = iecLog01;
	}

	public Boolean getIecLog02() {
		return this.iecLog02;
	}

	public void setIecLog02(Boolean iecLog02) {
		this.iecLog02 = iecLog02;
	}

	public String getIecQadc01() {
		return this.iecQadc01;
	}

	public void setIecQadc01(String iecQadc01) {
		this.iecQadc01 = iecQadc01;
	}

	public String getIecQadc02() {
		return this.iecQadc02;
	}

	public void setIecQadc02(String iecQadc02) {
		this.iecQadc02 = iecQadc02;
	}

	public String getIecQadc03() {
		return this.iecQadc03;
	}

	public void setIecQadc03(String iecQadc03) {
		this.iecQadc03 = iecQadc03;
	}

	public String getIecQadc04() {
		return this.iecQadc04;
	}

	public void setIecQadc04(String iecQadc04) {
		this.iecQadc04 = iecQadc04;
	}

	public Double getIecQadd01() {
		return this.iecQadd01;
	}

	public void setIecQadd01(Double iecQadd01) {
		this.iecQadd01 = iecQadd01;
	}

	public Boolean getIecQadl01() {
		return this.iecQadl01;
	}

	public void setIecQadl01(Boolean iecQadl01) {
		this.iecQadl01 = iecQadl01;
	}

	public Boolean getIecQadl02() {
		return this.iecQadl02;
	}

	public void setIecQadl02(Boolean iecQadl02) {
		this.iecQadl02 = iecQadl02;
	}

	public Boolean getIecImpexp() {
		return this.iecImpexp;
	}

	public void setIecImpexp(Boolean iecImpexp) {
		this.iecImpexp = iecImpexp;
	}

	public String getIecUser1() {
		return this.iecUser1;
	}

	public void setIecUser1(String iecUser1) {
		this.iecUser1 = iecUser1;
	}

	public String getIecUser2() {
		return this.iecUser2;
	}

	public void setIecUser2(String iecUser2) {
		this.iecUser2 = iecUser2;
	}

	public String getIecActInTypeList() {
		return this.iecActInTypeList;
	}

	public void setIecActInTypeList(String iecActInTypeList) {
		this.iecActInTypeList = iecActInTypeList;
	}

	public String getIecActExTypeList() {
		return this.iecActExTypeList;
	}

	public void setIecActExTypeList(String iecActExTypeList) {
		this.iecActExTypeList = iecActExTypeList;
	}

	public String getIecCorrFlowArr() {
		return this.iecCorrFlowArr;
	}

	public void setIecCorrFlowArr(String iecCorrFlowArr) {
		this.iecCorrFlowArr = iecCorrFlowArr;
	}

	public String getIecCorrFlowDisp() {
		return this.iecCorrFlowDisp;
	}

	public void setIecCorrFlowDisp(String iecCorrFlowDisp) {
		this.iecCorrFlowDisp = iecCorrFlowDisp;
	}

	public Boolean getIecUseExtrastat() {
		return this.iecUseExtrastat;
	}

	public void setIecUseExtrastat(Boolean iecUseExtrastat) {
		this.iecUseExtrastat = iecUseExtrastat;
	}

	public Boolean getIecContainer() {
		return this.iecContainer;
	}

	public void setIecContainer(Boolean iecContainer) {
		this.iecContainer = iecContainer;
	}

	public Integer getIecPreference() {
		return this.iecPreference;
	}

	public void setIecPreference(Integer iecPreference) {
		this.iecPreference = iecPreference;
	}

	public Double getOidIecCtrl() {
		return this.oidIecCtrl;
	}

	public void setOidIecCtrl(Double oidIecCtrl) {
		this.oidIecCtrl = oidIecCtrl;
	}

}