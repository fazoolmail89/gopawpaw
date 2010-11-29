package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSalMstr entity provides the base persistence definition of the
 * SalMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSalMstr implements java.io.Serializable {

	// Fields

	private SalMstrId id;
	private String salCode;
	private Double salLimitAmt;
	private Double salTotal;
	private String salUser1;
	private String salUser2;
	private Double salBudget;
	private Date salEnd;
	private String salFcgCode;
	private Boolean salQadl04;
	private String salOvFcgCode;
	private Double salPctCovered;
	private Boolean salPerCall;
	private String salChr01;
	private String salChr02;
	private String salChr03;
	private String salChr04;
	private Double salDec01;
	private Double salDec02;
	private Double salDec03;
	private Date salDte01;
	private Date salDte02;
	private Date salDte03;
	private Boolean salLog01;
	private Boolean salLog02;
	private Boolean salLog03;
	private String salQadc01;
	private String salQadc02;
	private String salQadc03;
	private String salQadc04;
	private Date salQadd01;
	private Date salQadd02;
	private Date salQadd03;
	private Double salQadde01;
	private Double salQadde02;
	private Double salQadde03;
	private Boolean salQadl01;
	private Boolean salQadl02;
	private Boolean salQadl03;
	private Double salUnpostedAmt;
	private Double salListprLimit;
	private Integer salCallsAllow;
	private Integer salCallsTotal;
	private String salModUserid;
	private Date salModDate;
	private Integer salSequence;
	private Integer salDays;
	private Date salFirstActivity;
	private Date salLastActivity;
	private Double salBgPrice;
	private Double oidSalMstr;

	// Constructors

	/** default constructor */
	public AbstractSalMstr() {
	}

	/** minimal constructor */
	public AbstractSalMstr(SalMstrId id, Double salBgPrice, Double oidSalMstr) {
		this.id = id;
		this.salBgPrice = salBgPrice;
		this.oidSalMstr = oidSalMstr;
	}

	/** full constructor */
	public AbstractSalMstr(SalMstrId id, String salCode, Double salLimitAmt,
			Double salTotal, String salUser1, String salUser2,
			Double salBudget, Date salEnd, String salFcgCode,
			Boolean salQadl04, String salOvFcgCode, Double salPctCovered,
			Boolean salPerCall, String salChr01, String salChr02,
			String salChr03, String salChr04, Double salDec01, Double salDec02,
			Double salDec03, Date salDte01, Date salDte02, Date salDte03,
			Boolean salLog01, Boolean salLog02, Boolean salLog03,
			String salQadc01, String salQadc02, String salQadc03,
			String salQadc04, Date salQadd01, Date salQadd02, Date salQadd03,
			Double salQadde01, Double salQadde02, Double salQadde03,
			Boolean salQadl01, Boolean salQadl02, Boolean salQadl03,
			Double salUnpostedAmt, Double salListprLimit,
			Integer salCallsAllow, Integer salCallsTotal, String salModUserid,
			Date salModDate, Integer salSequence, Integer salDays,
			Date salFirstActivity, Date salLastActivity, Double salBgPrice,
			Double oidSalMstr) {
		this.id = id;
		this.salCode = salCode;
		this.salLimitAmt = salLimitAmt;
		this.salTotal = salTotal;
		this.salUser1 = salUser1;
		this.salUser2 = salUser2;
		this.salBudget = salBudget;
		this.salEnd = salEnd;
		this.salFcgCode = salFcgCode;
		this.salQadl04 = salQadl04;
		this.salOvFcgCode = salOvFcgCode;
		this.salPctCovered = salPctCovered;
		this.salPerCall = salPerCall;
		this.salChr01 = salChr01;
		this.salChr02 = salChr02;
		this.salChr03 = salChr03;
		this.salChr04 = salChr04;
		this.salDec01 = salDec01;
		this.salDec02 = salDec02;
		this.salDec03 = salDec03;
		this.salDte01 = salDte01;
		this.salDte02 = salDte02;
		this.salDte03 = salDte03;
		this.salLog01 = salLog01;
		this.salLog02 = salLog02;
		this.salLog03 = salLog03;
		this.salQadc01 = salQadc01;
		this.salQadc02 = salQadc02;
		this.salQadc03 = salQadc03;
		this.salQadc04 = salQadc04;
		this.salQadd01 = salQadd01;
		this.salQadd02 = salQadd02;
		this.salQadd03 = salQadd03;
		this.salQadde01 = salQadde01;
		this.salQadde02 = salQadde02;
		this.salQadde03 = salQadde03;
		this.salQadl01 = salQadl01;
		this.salQadl02 = salQadl02;
		this.salQadl03 = salQadl03;
		this.salUnpostedAmt = salUnpostedAmt;
		this.salListprLimit = salListprLimit;
		this.salCallsAllow = salCallsAllow;
		this.salCallsTotal = salCallsTotal;
		this.salModUserid = salModUserid;
		this.salModDate = salModDate;
		this.salSequence = salSequence;
		this.salDays = salDays;
		this.salFirstActivity = salFirstActivity;
		this.salLastActivity = salLastActivity;
		this.salBgPrice = salBgPrice;
		this.oidSalMstr = oidSalMstr;
	}

	// Property accessors

	public SalMstrId getId() {
		return this.id;
	}

	public void setId(SalMstrId id) {
		this.id = id;
	}

	public String getSalCode() {
		return this.salCode;
	}

	public void setSalCode(String salCode) {
		this.salCode = salCode;
	}

	public Double getSalLimitAmt() {
		return this.salLimitAmt;
	}

	public void setSalLimitAmt(Double salLimitAmt) {
		this.salLimitAmt = salLimitAmt;
	}

	public Double getSalTotal() {
		return this.salTotal;
	}

	public void setSalTotal(Double salTotal) {
		this.salTotal = salTotal;
	}

	public String getSalUser1() {
		return this.salUser1;
	}

	public void setSalUser1(String salUser1) {
		this.salUser1 = salUser1;
	}

	public String getSalUser2() {
		return this.salUser2;
	}

	public void setSalUser2(String salUser2) {
		this.salUser2 = salUser2;
	}

	public Double getSalBudget() {
		return this.salBudget;
	}

	public void setSalBudget(Double salBudget) {
		this.salBudget = salBudget;
	}

	public Date getSalEnd() {
		return this.salEnd;
	}

	public void setSalEnd(Date salEnd) {
		this.salEnd = salEnd;
	}

	public String getSalFcgCode() {
		return this.salFcgCode;
	}

	public void setSalFcgCode(String salFcgCode) {
		this.salFcgCode = salFcgCode;
	}

	public Boolean getSalQadl04() {
		return this.salQadl04;
	}

	public void setSalQadl04(Boolean salQadl04) {
		this.salQadl04 = salQadl04;
	}

	public String getSalOvFcgCode() {
		return this.salOvFcgCode;
	}

	public void setSalOvFcgCode(String salOvFcgCode) {
		this.salOvFcgCode = salOvFcgCode;
	}

	public Double getSalPctCovered() {
		return this.salPctCovered;
	}

	public void setSalPctCovered(Double salPctCovered) {
		this.salPctCovered = salPctCovered;
	}

	public Boolean getSalPerCall() {
		return this.salPerCall;
	}

	public void setSalPerCall(Boolean salPerCall) {
		this.salPerCall = salPerCall;
	}

	public String getSalChr01() {
		return this.salChr01;
	}

	public void setSalChr01(String salChr01) {
		this.salChr01 = salChr01;
	}

	public String getSalChr02() {
		return this.salChr02;
	}

	public void setSalChr02(String salChr02) {
		this.salChr02 = salChr02;
	}

	public String getSalChr03() {
		return this.salChr03;
	}

	public void setSalChr03(String salChr03) {
		this.salChr03 = salChr03;
	}

	public String getSalChr04() {
		return this.salChr04;
	}

	public void setSalChr04(String salChr04) {
		this.salChr04 = salChr04;
	}

	public Double getSalDec01() {
		return this.salDec01;
	}

	public void setSalDec01(Double salDec01) {
		this.salDec01 = salDec01;
	}

	public Double getSalDec02() {
		return this.salDec02;
	}

	public void setSalDec02(Double salDec02) {
		this.salDec02 = salDec02;
	}

	public Double getSalDec03() {
		return this.salDec03;
	}

	public void setSalDec03(Double salDec03) {
		this.salDec03 = salDec03;
	}

	public Date getSalDte01() {
		return this.salDte01;
	}

	public void setSalDte01(Date salDte01) {
		this.salDte01 = salDte01;
	}

	public Date getSalDte02() {
		return this.salDte02;
	}

	public void setSalDte02(Date salDte02) {
		this.salDte02 = salDte02;
	}

	public Date getSalDte03() {
		return this.salDte03;
	}

	public void setSalDte03(Date salDte03) {
		this.salDte03 = salDte03;
	}

	public Boolean getSalLog01() {
		return this.salLog01;
	}

	public void setSalLog01(Boolean salLog01) {
		this.salLog01 = salLog01;
	}

	public Boolean getSalLog02() {
		return this.salLog02;
	}

	public void setSalLog02(Boolean salLog02) {
		this.salLog02 = salLog02;
	}

	public Boolean getSalLog03() {
		return this.salLog03;
	}

	public void setSalLog03(Boolean salLog03) {
		this.salLog03 = salLog03;
	}

	public String getSalQadc01() {
		return this.salQadc01;
	}

	public void setSalQadc01(String salQadc01) {
		this.salQadc01 = salQadc01;
	}

	public String getSalQadc02() {
		return this.salQadc02;
	}

	public void setSalQadc02(String salQadc02) {
		this.salQadc02 = salQadc02;
	}

	public String getSalQadc03() {
		return this.salQadc03;
	}

	public void setSalQadc03(String salQadc03) {
		this.salQadc03 = salQadc03;
	}

	public String getSalQadc04() {
		return this.salQadc04;
	}

	public void setSalQadc04(String salQadc04) {
		this.salQadc04 = salQadc04;
	}

	public Date getSalQadd01() {
		return this.salQadd01;
	}

	public void setSalQadd01(Date salQadd01) {
		this.salQadd01 = salQadd01;
	}

	public Date getSalQadd02() {
		return this.salQadd02;
	}

	public void setSalQadd02(Date salQadd02) {
		this.salQadd02 = salQadd02;
	}

	public Date getSalQadd03() {
		return this.salQadd03;
	}

	public void setSalQadd03(Date salQadd03) {
		this.salQadd03 = salQadd03;
	}

	public Double getSalQadde01() {
		return this.salQadde01;
	}

	public void setSalQadde01(Double salQadde01) {
		this.salQadde01 = salQadde01;
	}

	public Double getSalQadde02() {
		return this.salQadde02;
	}

	public void setSalQadde02(Double salQadde02) {
		this.salQadde02 = salQadde02;
	}

	public Double getSalQadde03() {
		return this.salQadde03;
	}

	public void setSalQadde03(Double salQadde03) {
		this.salQadde03 = salQadde03;
	}

	public Boolean getSalQadl01() {
		return this.salQadl01;
	}

	public void setSalQadl01(Boolean salQadl01) {
		this.salQadl01 = salQadl01;
	}

	public Boolean getSalQadl02() {
		return this.salQadl02;
	}

	public void setSalQadl02(Boolean salQadl02) {
		this.salQadl02 = salQadl02;
	}

	public Boolean getSalQadl03() {
		return this.salQadl03;
	}

	public void setSalQadl03(Boolean salQadl03) {
		this.salQadl03 = salQadl03;
	}

	public Double getSalUnpostedAmt() {
		return this.salUnpostedAmt;
	}

	public void setSalUnpostedAmt(Double salUnpostedAmt) {
		this.salUnpostedAmt = salUnpostedAmt;
	}

	public Double getSalListprLimit() {
		return this.salListprLimit;
	}

	public void setSalListprLimit(Double salListprLimit) {
		this.salListprLimit = salListprLimit;
	}

	public Integer getSalCallsAllow() {
		return this.salCallsAllow;
	}

	public void setSalCallsAllow(Integer salCallsAllow) {
		this.salCallsAllow = salCallsAllow;
	}

	public Integer getSalCallsTotal() {
		return this.salCallsTotal;
	}

	public void setSalCallsTotal(Integer salCallsTotal) {
		this.salCallsTotal = salCallsTotal;
	}

	public String getSalModUserid() {
		return this.salModUserid;
	}

	public void setSalModUserid(String salModUserid) {
		this.salModUserid = salModUserid;
	}

	public Date getSalModDate() {
		return this.salModDate;
	}

	public void setSalModDate(Date salModDate) {
		this.salModDate = salModDate;
	}

	public Integer getSalSequence() {
		return this.salSequence;
	}

	public void setSalSequence(Integer salSequence) {
		this.salSequence = salSequence;
	}

	public Integer getSalDays() {
		return this.salDays;
	}

	public void setSalDays(Integer salDays) {
		this.salDays = salDays;
	}

	public Date getSalFirstActivity() {
		return this.salFirstActivity;
	}

	public void setSalFirstActivity(Date salFirstActivity) {
		this.salFirstActivity = salFirstActivity;
	}

	public Date getSalLastActivity() {
		return this.salLastActivity;
	}

	public void setSalLastActivity(Date salLastActivity) {
		this.salLastActivity = salLastActivity;
	}

	public Double getSalBgPrice() {
		return this.salBgPrice;
	}

	public void setSalBgPrice(Double salBgPrice) {
		this.salBgPrice = salBgPrice;
	}

	public Double getOidSalMstr() {
		return this.oidSalMstr;
	}

	public void setOidSalMstr(Double oidSalMstr) {
		this.oidSalMstr = oidSalMstr;
	}

}