package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPsMstr entity provides the base persistence definition of the PsMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPsMstr implements java.io.Serializable {

	// Fields

	private PsMstrId id;
	private Double psQtyPer;
	private Double psScrpPct;
	private String psPsCode;
	private Integer psLtOff;
	private Date psEnd;
	private String psRmks;
	private Integer psOp;
	private Integer psItemNo;
	private Boolean psMandatory;
	private Boolean psExclusive;
	private String psProcess;
	private String psQtyType;
	private String psUser1;
	private String psUser2;
	private Double psFcstPct;
	private Boolean psDefault;
	private String psGroup;
	private Boolean psCritical;
	private Double psQtyPerB;
	private Double psAssay;
	private String psCommCode;
	private String psCompUm;
	private Double psUmConv;
	private String psUserid;
	private Date psModDate;
	private Boolean psQad01;
	private Boolean psNonBal;
	private Double psBatchPct;
	private Integer psCmtindx;
	private String psStartEcn;
	private String psEndEcn;
	private String psJointType;
	private Double psCopQty;
	private Double psCstPct;
	private Double psProdPct;
	private Double psQtyCons;
	private Double psQtyExch;
	private Double psQtyDiag;
	private String psChr01;
	private String psChr02;
	private Date psDte01;
	private Date psDte02;
	private Double psDec01;
	private Double psDec02;
	private Boolean psLog01;
	private Boolean psLog02;
	private String psQadc01;
	private String psQadc02;
	private Date psQadt01;
	private Date psQadt02;
	private Date psQadt03;
	private Double psQadd01;
	private Double psQadd02;
	private Boolean psQadl01;
	private Boolean psQadl02;
	private Double oidPsMstr;

	// Constructors

	/** default constructor */
	public AbstractPsMstr() {
	}

	/** minimal constructor */
	public AbstractPsMstr(PsMstrId id, Double psQtyPer, Double psAssay,
			String psCommCode, String psCompUm, Double psUmConv,
			String psJointType, Double psCopQty, Double psCstPct,
			Double oidPsMstr) {
		this.id = id;
		this.psQtyPer = psQtyPer;
		this.psAssay = psAssay;
		this.psCommCode = psCommCode;
		this.psCompUm = psCompUm;
		this.psUmConv = psUmConv;
		this.psJointType = psJointType;
		this.psCopQty = psCopQty;
		this.psCstPct = psCstPct;
		this.oidPsMstr = oidPsMstr;
	}

	/** full constructor */
	public AbstractPsMstr(PsMstrId id, Double psQtyPer, Double psScrpPct,
			String psPsCode, Integer psLtOff, Date psEnd, String psRmks,
			Integer psOp, Integer psItemNo, Boolean psMandatory,
			Boolean psExclusive, String psProcess, String psQtyType,
			String psUser1, String psUser2, Double psFcstPct,
			Boolean psDefault, String psGroup, Boolean psCritical,
			Double psQtyPerB, Double psAssay, String psCommCode,
			String psCompUm, Double psUmConv, String psUserid, Date psModDate,
			Boolean psQad01, Boolean psNonBal, Double psBatchPct,
			Integer psCmtindx, String psStartEcn, String psEndEcn,
			String psJointType, Double psCopQty, Double psCstPct,
			Double psProdPct, Double psQtyCons, Double psQtyExch,
			Double psQtyDiag, String psChr01, String psChr02, Date psDte01,
			Date psDte02, Double psDec01, Double psDec02, Boolean psLog01,
			Boolean psLog02, String psQadc01, String psQadc02, Date psQadt01,
			Date psQadt02, Date psQadt03, Double psQadd01, Double psQadd02,
			Boolean psQadl01, Boolean psQadl02, Double oidPsMstr) {
		this.id = id;
		this.psQtyPer = psQtyPer;
		this.psScrpPct = psScrpPct;
		this.psPsCode = psPsCode;
		this.psLtOff = psLtOff;
		this.psEnd = psEnd;
		this.psRmks = psRmks;
		this.psOp = psOp;
		this.psItemNo = psItemNo;
		this.psMandatory = psMandatory;
		this.psExclusive = psExclusive;
		this.psProcess = psProcess;
		this.psQtyType = psQtyType;
		this.psUser1 = psUser1;
		this.psUser2 = psUser2;
		this.psFcstPct = psFcstPct;
		this.psDefault = psDefault;
		this.psGroup = psGroup;
		this.psCritical = psCritical;
		this.psQtyPerB = psQtyPerB;
		this.psAssay = psAssay;
		this.psCommCode = psCommCode;
		this.psCompUm = psCompUm;
		this.psUmConv = psUmConv;
		this.psUserid = psUserid;
		this.psModDate = psModDate;
		this.psQad01 = psQad01;
		this.psNonBal = psNonBal;
		this.psBatchPct = psBatchPct;
		this.psCmtindx = psCmtindx;
		this.psStartEcn = psStartEcn;
		this.psEndEcn = psEndEcn;
		this.psJointType = psJointType;
		this.psCopQty = psCopQty;
		this.psCstPct = psCstPct;
		this.psProdPct = psProdPct;
		this.psQtyCons = psQtyCons;
		this.psQtyExch = psQtyExch;
		this.psQtyDiag = psQtyDiag;
		this.psChr01 = psChr01;
		this.psChr02 = psChr02;
		this.psDte01 = psDte01;
		this.psDte02 = psDte02;
		this.psDec01 = psDec01;
		this.psDec02 = psDec02;
		this.psLog01 = psLog01;
		this.psLog02 = psLog02;
		this.psQadc01 = psQadc01;
		this.psQadc02 = psQadc02;
		this.psQadt01 = psQadt01;
		this.psQadt02 = psQadt02;
		this.psQadt03 = psQadt03;
		this.psQadd01 = psQadd01;
		this.psQadd02 = psQadd02;
		this.psQadl01 = psQadl01;
		this.psQadl02 = psQadl02;
		this.oidPsMstr = oidPsMstr;
	}

	// Property accessors

	public PsMstrId getId() {
		return this.id;
	}

	public void setId(PsMstrId id) {
		this.id = id;
	}

	public Double getPsQtyPer() {
		return this.psQtyPer;
	}

	public void setPsQtyPer(Double psQtyPer) {
		this.psQtyPer = psQtyPer;
	}

	public Double getPsScrpPct() {
		return this.psScrpPct;
	}

	public void setPsScrpPct(Double psScrpPct) {
		this.psScrpPct = psScrpPct;
	}

	public String getPsPsCode() {
		return this.psPsCode;
	}

	public void setPsPsCode(String psPsCode) {
		this.psPsCode = psPsCode;
	}

	public Integer getPsLtOff() {
		return this.psLtOff;
	}

	public void setPsLtOff(Integer psLtOff) {
		this.psLtOff = psLtOff;
	}

	public Date getPsEnd() {
		return this.psEnd;
	}

	public void setPsEnd(Date psEnd) {
		this.psEnd = psEnd;
	}

	public String getPsRmks() {
		return this.psRmks;
	}

	public void setPsRmks(String psRmks) {
		this.psRmks = psRmks;
	}

	public Integer getPsOp() {
		return this.psOp;
	}

	public void setPsOp(Integer psOp) {
		this.psOp = psOp;
	}

	public Integer getPsItemNo() {
		return this.psItemNo;
	}

	public void setPsItemNo(Integer psItemNo) {
		this.psItemNo = psItemNo;
	}

	public Boolean getPsMandatory() {
		return this.psMandatory;
	}

	public void setPsMandatory(Boolean psMandatory) {
		this.psMandatory = psMandatory;
	}

	public Boolean getPsExclusive() {
		return this.psExclusive;
	}

	public void setPsExclusive(Boolean psExclusive) {
		this.psExclusive = psExclusive;
	}

	public String getPsProcess() {
		return this.psProcess;
	}

	public void setPsProcess(String psProcess) {
		this.psProcess = psProcess;
	}

	public String getPsQtyType() {
		return this.psQtyType;
	}

	public void setPsQtyType(String psQtyType) {
		this.psQtyType = psQtyType;
	}

	public String getPsUser1() {
		return this.psUser1;
	}

	public void setPsUser1(String psUser1) {
		this.psUser1 = psUser1;
	}

	public String getPsUser2() {
		return this.psUser2;
	}

	public void setPsUser2(String psUser2) {
		this.psUser2 = psUser2;
	}

	public Double getPsFcstPct() {
		return this.psFcstPct;
	}

	public void setPsFcstPct(Double psFcstPct) {
		this.psFcstPct = psFcstPct;
	}

	public Boolean getPsDefault() {
		return this.psDefault;
	}

	public void setPsDefault(Boolean psDefault) {
		this.psDefault = psDefault;
	}

	public String getPsGroup() {
		return this.psGroup;
	}

	public void setPsGroup(String psGroup) {
		this.psGroup = psGroup;
	}

	public Boolean getPsCritical() {
		return this.psCritical;
	}

	public void setPsCritical(Boolean psCritical) {
		this.psCritical = psCritical;
	}

	public Double getPsQtyPerB() {
		return this.psQtyPerB;
	}

	public void setPsQtyPerB(Double psQtyPerB) {
		this.psQtyPerB = psQtyPerB;
	}

	public Double getPsAssay() {
		return this.psAssay;
	}

	public void setPsAssay(Double psAssay) {
		this.psAssay = psAssay;
	}

	public String getPsCommCode() {
		return this.psCommCode;
	}

	public void setPsCommCode(String psCommCode) {
		this.psCommCode = psCommCode;
	}

	public String getPsCompUm() {
		return this.psCompUm;
	}

	public void setPsCompUm(String psCompUm) {
		this.psCompUm = psCompUm;
	}

	public Double getPsUmConv() {
		return this.psUmConv;
	}

	public void setPsUmConv(Double psUmConv) {
		this.psUmConv = psUmConv;
	}

	public String getPsUserid() {
		return this.psUserid;
	}

	public void setPsUserid(String psUserid) {
		this.psUserid = psUserid;
	}

	public Date getPsModDate() {
		return this.psModDate;
	}

	public void setPsModDate(Date psModDate) {
		this.psModDate = psModDate;
	}

	public Boolean getPsQad01() {
		return this.psQad01;
	}

	public void setPsQad01(Boolean psQad01) {
		this.psQad01 = psQad01;
	}

	public Boolean getPsNonBal() {
		return this.psNonBal;
	}

	public void setPsNonBal(Boolean psNonBal) {
		this.psNonBal = psNonBal;
	}

	public Double getPsBatchPct() {
		return this.psBatchPct;
	}

	public void setPsBatchPct(Double psBatchPct) {
		this.psBatchPct = psBatchPct;
	}

	public Integer getPsCmtindx() {
		return this.psCmtindx;
	}

	public void setPsCmtindx(Integer psCmtindx) {
		this.psCmtindx = psCmtindx;
	}

	public String getPsStartEcn() {
		return this.psStartEcn;
	}

	public void setPsStartEcn(String psStartEcn) {
		this.psStartEcn = psStartEcn;
	}

	public String getPsEndEcn() {
		return this.psEndEcn;
	}

	public void setPsEndEcn(String psEndEcn) {
		this.psEndEcn = psEndEcn;
	}

	public String getPsJointType() {
		return this.psJointType;
	}

	public void setPsJointType(String psJointType) {
		this.psJointType = psJointType;
	}

	public Double getPsCopQty() {
		return this.psCopQty;
	}

	public void setPsCopQty(Double psCopQty) {
		this.psCopQty = psCopQty;
	}

	public Double getPsCstPct() {
		return this.psCstPct;
	}

	public void setPsCstPct(Double psCstPct) {
		this.psCstPct = psCstPct;
	}

	public Double getPsProdPct() {
		return this.psProdPct;
	}

	public void setPsProdPct(Double psProdPct) {
		this.psProdPct = psProdPct;
	}

	public Double getPsQtyCons() {
		return this.psQtyCons;
	}

	public void setPsQtyCons(Double psQtyCons) {
		this.psQtyCons = psQtyCons;
	}

	public Double getPsQtyExch() {
		return this.psQtyExch;
	}

	public void setPsQtyExch(Double psQtyExch) {
		this.psQtyExch = psQtyExch;
	}

	public Double getPsQtyDiag() {
		return this.psQtyDiag;
	}

	public void setPsQtyDiag(Double psQtyDiag) {
		this.psQtyDiag = psQtyDiag;
	}

	public String getPsChr01() {
		return this.psChr01;
	}

	public void setPsChr01(String psChr01) {
		this.psChr01 = psChr01;
	}

	public String getPsChr02() {
		return this.psChr02;
	}

	public void setPsChr02(String psChr02) {
		this.psChr02 = psChr02;
	}

	public Date getPsDte01() {
		return this.psDte01;
	}

	public void setPsDte01(Date psDte01) {
		this.psDte01 = psDte01;
	}

	public Date getPsDte02() {
		return this.psDte02;
	}

	public void setPsDte02(Date psDte02) {
		this.psDte02 = psDte02;
	}

	public Double getPsDec01() {
		return this.psDec01;
	}

	public void setPsDec01(Double psDec01) {
		this.psDec01 = psDec01;
	}

	public Double getPsDec02() {
		return this.psDec02;
	}

	public void setPsDec02(Double psDec02) {
		this.psDec02 = psDec02;
	}

	public Boolean getPsLog01() {
		return this.psLog01;
	}

	public void setPsLog01(Boolean psLog01) {
		this.psLog01 = psLog01;
	}

	public Boolean getPsLog02() {
		return this.psLog02;
	}

	public void setPsLog02(Boolean psLog02) {
		this.psLog02 = psLog02;
	}

	public String getPsQadc01() {
		return this.psQadc01;
	}

	public void setPsQadc01(String psQadc01) {
		this.psQadc01 = psQadc01;
	}

	public String getPsQadc02() {
		return this.psQadc02;
	}

	public void setPsQadc02(String psQadc02) {
		this.psQadc02 = psQadc02;
	}

	public Date getPsQadt01() {
		return this.psQadt01;
	}

	public void setPsQadt01(Date psQadt01) {
		this.psQadt01 = psQadt01;
	}

	public Date getPsQadt02() {
		return this.psQadt02;
	}

	public void setPsQadt02(Date psQadt02) {
		this.psQadt02 = psQadt02;
	}

	public Date getPsQadt03() {
		return this.psQadt03;
	}

	public void setPsQadt03(Date psQadt03) {
		this.psQadt03 = psQadt03;
	}

	public Double getPsQadd01() {
		return this.psQadd01;
	}

	public void setPsQadd01(Double psQadd01) {
		this.psQadd01 = psQadd01;
	}

	public Double getPsQadd02() {
		return this.psQadd02;
	}

	public void setPsQadd02(Double psQadd02) {
		this.psQadd02 = psQadd02;
	}

	public Boolean getPsQadl01() {
		return this.psQadl01;
	}

	public void setPsQadl01(Boolean psQadl01) {
		this.psQadl01 = psQadl01;
	}

	public Boolean getPsQadl02() {
		return this.psQadl02;
	}

	public void setPsQadl02(Boolean psQadl02) {
		this.psQadl02 = psQadl02;
	}

	public Double getOidPsMstr() {
		return this.oidPsMstr;
	}

	public void setOidPsMstr(Double oidPsMstr) {
		this.oidPsMstr = oidPsMstr;
	}

}