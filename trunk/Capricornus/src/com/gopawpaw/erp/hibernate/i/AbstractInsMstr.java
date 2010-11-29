package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractInsMstr entity provides the base persistence definition of the
 * InsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInsMstr implements java.io.Serializable {

	// Fields

	private InsMstrId id;
	private String insArAcct;
	private String insArSub;
	private String insArCc;
	private String insBillTo;
	private Integer insCmtindx;
	private String insCrTerms;
	private String insCurr;
	private Boolean insFixed;
	private Boolean insHold;
	private String insHoldRmks;
	private Double insInvAmt;
	private Date insSchedDate;
	private String insInvNbr;
	private Double insInvPct;
	private String insInvType;
	private Date insOrdDate;
	private Date insOrigDate;
	private Boolean insPrepayment;
	private Date insRelDate;
	private Boolean insReleased;
	private String insRmks;
	private String insSoNbr;
	private String insUserid;
	private Date insModDate;
	private String insModUserid;
	private String insUser1;
	private String insUser2;
	private String insQadc01;
	private Double insQadd01;
	private Integer insQadi01;
	private Boolean insQadl01;
	private Date insQadt01;
	private Double oidInsMstr;

	// Constructors

	/** default constructor */
	public AbstractInsMstr() {
	}

	/** minimal constructor */
	public AbstractInsMstr(InsMstrId id, String insArAcct, String insArSub,
			String insArCc, String insBillTo, Integer insCmtindx,
			String insCrTerms, String insCurr, Boolean insFixed,
			Boolean insHold, String insHoldRmks, Double insInvAmt,
			String insInvNbr, Double insInvPct, String insInvType,
			Boolean insPrepayment, Boolean insReleased, String insRmks,
			String insSoNbr, String insUserid, Date insModDate,
			String insModUserid, Double oidInsMstr) {
		this.id = id;
		this.insArAcct = insArAcct;
		this.insArSub = insArSub;
		this.insArCc = insArCc;
		this.insBillTo = insBillTo;
		this.insCmtindx = insCmtindx;
		this.insCrTerms = insCrTerms;
		this.insCurr = insCurr;
		this.insFixed = insFixed;
		this.insHold = insHold;
		this.insHoldRmks = insHoldRmks;
		this.insInvAmt = insInvAmt;
		this.insInvNbr = insInvNbr;
		this.insInvPct = insInvPct;
		this.insInvType = insInvType;
		this.insPrepayment = insPrepayment;
		this.insReleased = insReleased;
		this.insRmks = insRmks;
		this.insSoNbr = insSoNbr;
		this.insUserid = insUserid;
		this.insModDate = insModDate;
		this.insModUserid = insModUserid;
		this.oidInsMstr = oidInsMstr;
	}

	/** full constructor */
	public AbstractInsMstr(InsMstrId id, String insArAcct, String insArSub,
			String insArCc, String insBillTo, Integer insCmtindx,
			String insCrTerms, String insCurr, Boolean insFixed,
			Boolean insHold, String insHoldRmks, Double insInvAmt,
			Date insSchedDate, String insInvNbr, Double insInvPct,
			String insInvType, Date insOrdDate, Date insOrigDate,
			Boolean insPrepayment, Date insRelDate, Boolean insReleased,
			String insRmks, String insSoNbr, String insUserid, Date insModDate,
			String insModUserid, String insUser1, String insUser2,
			String insQadc01, Double insQadd01, Integer insQadi01,
			Boolean insQadl01, Date insQadt01, Double oidInsMstr) {
		this.id = id;
		this.insArAcct = insArAcct;
		this.insArSub = insArSub;
		this.insArCc = insArCc;
		this.insBillTo = insBillTo;
		this.insCmtindx = insCmtindx;
		this.insCrTerms = insCrTerms;
		this.insCurr = insCurr;
		this.insFixed = insFixed;
		this.insHold = insHold;
		this.insHoldRmks = insHoldRmks;
		this.insInvAmt = insInvAmt;
		this.insSchedDate = insSchedDate;
		this.insInvNbr = insInvNbr;
		this.insInvPct = insInvPct;
		this.insInvType = insInvType;
		this.insOrdDate = insOrdDate;
		this.insOrigDate = insOrigDate;
		this.insPrepayment = insPrepayment;
		this.insRelDate = insRelDate;
		this.insReleased = insReleased;
		this.insRmks = insRmks;
		this.insSoNbr = insSoNbr;
		this.insUserid = insUserid;
		this.insModDate = insModDate;
		this.insModUserid = insModUserid;
		this.insUser1 = insUser1;
		this.insUser2 = insUser2;
		this.insQadc01 = insQadc01;
		this.insQadd01 = insQadd01;
		this.insQadi01 = insQadi01;
		this.insQadl01 = insQadl01;
		this.insQadt01 = insQadt01;
		this.oidInsMstr = oidInsMstr;
	}

	// Property accessors

	public InsMstrId getId() {
		return this.id;
	}

	public void setId(InsMstrId id) {
		this.id = id;
	}

	public String getInsArAcct() {
		return this.insArAcct;
	}

	public void setInsArAcct(String insArAcct) {
		this.insArAcct = insArAcct;
	}

	public String getInsArSub() {
		return this.insArSub;
	}

	public void setInsArSub(String insArSub) {
		this.insArSub = insArSub;
	}

	public String getInsArCc() {
		return this.insArCc;
	}

	public void setInsArCc(String insArCc) {
		this.insArCc = insArCc;
	}

	public String getInsBillTo() {
		return this.insBillTo;
	}

	public void setInsBillTo(String insBillTo) {
		this.insBillTo = insBillTo;
	}

	public Integer getInsCmtindx() {
		return this.insCmtindx;
	}

	public void setInsCmtindx(Integer insCmtindx) {
		this.insCmtindx = insCmtindx;
	}

	public String getInsCrTerms() {
		return this.insCrTerms;
	}

	public void setInsCrTerms(String insCrTerms) {
		this.insCrTerms = insCrTerms;
	}

	public String getInsCurr() {
		return this.insCurr;
	}

	public void setInsCurr(String insCurr) {
		this.insCurr = insCurr;
	}

	public Boolean getInsFixed() {
		return this.insFixed;
	}

	public void setInsFixed(Boolean insFixed) {
		this.insFixed = insFixed;
	}

	public Boolean getInsHold() {
		return this.insHold;
	}

	public void setInsHold(Boolean insHold) {
		this.insHold = insHold;
	}

	public String getInsHoldRmks() {
		return this.insHoldRmks;
	}

	public void setInsHoldRmks(String insHoldRmks) {
		this.insHoldRmks = insHoldRmks;
	}

	public Double getInsInvAmt() {
		return this.insInvAmt;
	}

	public void setInsInvAmt(Double insInvAmt) {
		this.insInvAmt = insInvAmt;
	}

	public Date getInsSchedDate() {
		return this.insSchedDate;
	}

	public void setInsSchedDate(Date insSchedDate) {
		this.insSchedDate = insSchedDate;
	}

	public String getInsInvNbr() {
		return this.insInvNbr;
	}

	public void setInsInvNbr(String insInvNbr) {
		this.insInvNbr = insInvNbr;
	}

	public Double getInsInvPct() {
		return this.insInvPct;
	}

	public void setInsInvPct(Double insInvPct) {
		this.insInvPct = insInvPct;
	}

	public String getInsInvType() {
		return this.insInvType;
	}

	public void setInsInvType(String insInvType) {
		this.insInvType = insInvType;
	}

	public Date getInsOrdDate() {
		return this.insOrdDate;
	}

	public void setInsOrdDate(Date insOrdDate) {
		this.insOrdDate = insOrdDate;
	}

	public Date getInsOrigDate() {
		return this.insOrigDate;
	}

	public void setInsOrigDate(Date insOrigDate) {
		this.insOrigDate = insOrigDate;
	}

	public Boolean getInsPrepayment() {
		return this.insPrepayment;
	}

	public void setInsPrepayment(Boolean insPrepayment) {
		this.insPrepayment = insPrepayment;
	}

	public Date getInsRelDate() {
		return this.insRelDate;
	}

	public void setInsRelDate(Date insRelDate) {
		this.insRelDate = insRelDate;
	}

	public Boolean getInsReleased() {
		return this.insReleased;
	}

	public void setInsReleased(Boolean insReleased) {
		this.insReleased = insReleased;
	}

	public String getInsRmks() {
		return this.insRmks;
	}

	public void setInsRmks(String insRmks) {
		this.insRmks = insRmks;
	}

	public String getInsSoNbr() {
		return this.insSoNbr;
	}

	public void setInsSoNbr(String insSoNbr) {
		this.insSoNbr = insSoNbr;
	}

	public String getInsUserid() {
		return this.insUserid;
	}

	public void setInsUserid(String insUserid) {
		this.insUserid = insUserid;
	}

	public Date getInsModDate() {
		return this.insModDate;
	}

	public void setInsModDate(Date insModDate) {
		this.insModDate = insModDate;
	}

	public String getInsModUserid() {
		return this.insModUserid;
	}

	public void setInsModUserid(String insModUserid) {
		this.insModUserid = insModUserid;
	}

	public String getInsUser1() {
		return this.insUser1;
	}

	public void setInsUser1(String insUser1) {
		this.insUser1 = insUser1;
	}

	public String getInsUser2() {
		return this.insUser2;
	}

	public void setInsUser2(String insUser2) {
		this.insUser2 = insUser2;
	}

	public String getInsQadc01() {
		return this.insQadc01;
	}

	public void setInsQadc01(String insQadc01) {
		this.insQadc01 = insQadc01;
	}

	public Double getInsQadd01() {
		return this.insQadd01;
	}

	public void setInsQadd01(Double insQadd01) {
		this.insQadd01 = insQadd01;
	}

	public Integer getInsQadi01() {
		return this.insQadi01;
	}

	public void setInsQadi01(Integer insQadi01) {
		this.insQadi01 = insQadi01;
	}

	public Boolean getInsQadl01() {
		return this.insQadl01;
	}

	public void setInsQadl01(Boolean insQadl01) {
		this.insQadl01 = insQadl01;
	}

	public Date getInsQadt01() {
		return this.insQadt01;
	}

	public void setInsQadt01(Date insQadt01) {
		this.insQadt01 = insQadt01;
	}

	public Double getOidInsMstr() {
		return this.oidInsMstr;
	}

	public void setOidInsMstr(Double oidInsMstr) {
		this.oidInsMstr = oidInsMstr;
	}

}