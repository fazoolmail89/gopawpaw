package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDefrDet entity provides the base persistence definition of the
 * DefrDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDefrDet implements java.io.Serializable {

	// Fields

	private DefrDetId id;
	private String defrCurr;
	private String defrCust;
	private Date defrEffDate;
	private String defrEntity;
	private String defrEuNbr;
	private Double defrExRate;
	private Double defrExRate2;
	private String defrExRatetype;
	private Integer defrExruSeq;
	private String defrFor;
	private Double defrAccrAmt;
	private Double defrInvAmt;
	private Double defrPerPeriodAmt;
	private Double defrPeriodCurrAmt;
	private Double defrPeriodRemain;
	private Double defrRevAmt;
	private Double defrRecAmt;
	private String defrProject;
	private String defrSlsAcct;
	private String defrSlsSub;
	private String defrSlsCc;
	private String defrAcct;
	private String defrSub;
	private String defrCc;
	private String defrUser1;
	private String defrUser2;
	private Double defrUserd01;
	private Integer defrUseri01;
	private Boolean defrUserl01;
	private Date defrUsert01;
	private String defrQadc01;
	private Double defrQadd01;
	private Integer defrQadi01;
	private Boolean defrQadl01;
	private Date defrQadt01;
	private String defrModUserid;
	private Date defrModDate;
	private String defrQadc02;
	private String defrBillTo;
	private Double oidDefrDet;

	// Constructors

	/** default constructor */
	public AbstractDefrDet() {
	}

	/** minimal constructor */
	public AbstractDefrDet(DefrDetId id, String defrCurr, String defrCust,
			String defrEntity, String defrEuNbr, Double defrExRate,
			Double defrExRate2, String defrExRatetype, Integer defrExruSeq,
			String defrFor, Double defrAccrAmt, Double defrInvAmt,
			Double defrPerPeriodAmt, Double defrPeriodCurrAmt,
			Double defrPeriodRemain, Double defrRevAmt, Double defrRecAmt,
			String defrProject, String defrSlsAcct, String defrSlsSub,
			String defrSlsCc, String defrAcct, String defrSub, String defrCc,
			String defrUser1, String defrUser2, Double defrUserd01,
			Integer defrUseri01, Boolean defrUserl01, String defrQadc01,
			Double defrQadd01, Integer defrQadi01, Boolean defrQadl01,
			String defrModUserid, Date defrModDate, String defrQadc02,
			String defrBillTo, Double oidDefrDet) {
		this.id = id;
		this.defrCurr = defrCurr;
		this.defrCust = defrCust;
		this.defrEntity = defrEntity;
		this.defrEuNbr = defrEuNbr;
		this.defrExRate = defrExRate;
		this.defrExRate2 = defrExRate2;
		this.defrExRatetype = defrExRatetype;
		this.defrExruSeq = defrExruSeq;
		this.defrFor = defrFor;
		this.defrAccrAmt = defrAccrAmt;
		this.defrInvAmt = defrInvAmt;
		this.defrPerPeriodAmt = defrPerPeriodAmt;
		this.defrPeriodCurrAmt = defrPeriodCurrAmt;
		this.defrPeriodRemain = defrPeriodRemain;
		this.defrRevAmt = defrRevAmt;
		this.defrRecAmt = defrRecAmt;
		this.defrProject = defrProject;
		this.defrSlsAcct = defrSlsAcct;
		this.defrSlsSub = defrSlsSub;
		this.defrSlsCc = defrSlsCc;
		this.defrAcct = defrAcct;
		this.defrSub = defrSub;
		this.defrCc = defrCc;
		this.defrUser1 = defrUser1;
		this.defrUser2 = defrUser2;
		this.defrUserd01 = defrUserd01;
		this.defrUseri01 = defrUseri01;
		this.defrUserl01 = defrUserl01;
		this.defrQadc01 = defrQadc01;
		this.defrQadd01 = defrQadd01;
		this.defrQadi01 = defrQadi01;
		this.defrQadl01 = defrQadl01;
		this.defrModUserid = defrModUserid;
		this.defrModDate = defrModDate;
		this.defrQadc02 = defrQadc02;
		this.defrBillTo = defrBillTo;
		this.oidDefrDet = oidDefrDet;
	}

	/** full constructor */
	public AbstractDefrDet(DefrDetId id, String defrCurr, String defrCust,
			Date defrEffDate, String defrEntity, String defrEuNbr,
			Double defrExRate, Double defrExRate2, String defrExRatetype,
			Integer defrExruSeq, String defrFor, Double defrAccrAmt,
			Double defrInvAmt, Double defrPerPeriodAmt,
			Double defrPeriodCurrAmt, Double defrPeriodRemain,
			Double defrRevAmt, Double defrRecAmt, String defrProject,
			String defrSlsAcct, String defrSlsSub, String defrSlsCc,
			String defrAcct, String defrSub, String defrCc, String defrUser1,
			String defrUser2, Double defrUserd01, Integer defrUseri01,
			Boolean defrUserl01, Date defrUsert01, String defrQadc01,
			Double defrQadd01, Integer defrQadi01, Boolean defrQadl01,
			Date defrQadt01, String defrModUserid, Date defrModDate,
			String defrQadc02, String defrBillTo, Double oidDefrDet) {
		this.id = id;
		this.defrCurr = defrCurr;
		this.defrCust = defrCust;
		this.defrEffDate = defrEffDate;
		this.defrEntity = defrEntity;
		this.defrEuNbr = defrEuNbr;
		this.defrExRate = defrExRate;
		this.defrExRate2 = defrExRate2;
		this.defrExRatetype = defrExRatetype;
		this.defrExruSeq = defrExruSeq;
		this.defrFor = defrFor;
		this.defrAccrAmt = defrAccrAmt;
		this.defrInvAmt = defrInvAmt;
		this.defrPerPeriodAmt = defrPerPeriodAmt;
		this.defrPeriodCurrAmt = defrPeriodCurrAmt;
		this.defrPeriodRemain = defrPeriodRemain;
		this.defrRevAmt = defrRevAmt;
		this.defrRecAmt = defrRecAmt;
		this.defrProject = defrProject;
		this.defrSlsAcct = defrSlsAcct;
		this.defrSlsSub = defrSlsSub;
		this.defrSlsCc = defrSlsCc;
		this.defrAcct = defrAcct;
		this.defrSub = defrSub;
		this.defrCc = defrCc;
		this.defrUser1 = defrUser1;
		this.defrUser2 = defrUser2;
		this.defrUserd01 = defrUserd01;
		this.defrUseri01 = defrUseri01;
		this.defrUserl01 = defrUserl01;
		this.defrUsert01 = defrUsert01;
		this.defrQadc01 = defrQadc01;
		this.defrQadd01 = defrQadd01;
		this.defrQadi01 = defrQadi01;
		this.defrQadl01 = defrQadl01;
		this.defrQadt01 = defrQadt01;
		this.defrModUserid = defrModUserid;
		this.defrModDate = defrModDate;
		this.defrQadc02 = defrQadc02;
		this.defrBillTo = defrBillTo;
		this.oidDefrDet = oidDefrDet;
	}

	// Property accessors

	public DefrDetId getId() {
		return this.id;
	}

	public void setId(DefrDetId id) {
		this.id = id;
	}

	public String getDefrCurr() {
		return this.defrCurr;
	}

	public void setDefrCurr(String defrCurr) {
		this.defrCurr = defrCurr;
	}

	public String getDefrCust() {
		return this.defrCust;
	}

	public void setDefrCust(String defrCust) {
		this.defrCust = defrCust;
	}

	public Date getDefrEffDate() {
		return this.defrEffDate;
	}

	public void setDefrEffDate(Date defrEffDate) {
		this.defrEffDate = defrEffDate;
	}

	public String getDefrEntity() {
		return this.defrEntity;
	}

	public void setDefrEntity(String defrEntity) {
		this.defrEntity = defrEntity;
	}

	public String getDefrEuNbr() {
		return this.defrEuNbr;
	}

	public void setDefrEuNbr(String defrEuNbr) {
		this.defrEuNbr = defrEuNbr;
	}

	public Double getDefrExRate() {
		return this.defrExRate;
	}

	public void setDefrExRate(Double defrExRate) {
		this.defrExRate = defrExRate;
	}

	public Double getDefrExRate2() {
		return this.defrExRate2;
	}

	public void setDefrExRate2(Double defrExRate2) {
		this.defrExRate2 = defrExRate2;
	}

	public String getDefrExRatetype() {
		return this.defrExRatetype;
	}

	public void setDefrExRatetype(String defrExRatetype) {
		this.defrExRatetype = defrExRatetype;
	}

	public Integer getDefrExruSeq() {
		return this.defrExruSeq;
	}

	public void setDefrExruSeq(Integer defrExruSeq) {
		this.defrExruSeq = defrExruSeq;
	}

	public String getDefrFor() {
		return this.defrFor;
	}

	public void setDefrFor(String defrFor) {
		this.defrFor = defrFor;
	}

	public Double getDefrAccrAmt() {
		return this.defrAccrAmt;
	}

	public void setDefrAccrAmt(Double defrAccrAmt) {
		this.defrAccrAmt = defrAccrAmt;
	}

	public Double getDefrInvAmt() {
		return this.defrInvAmt;
	}

	public void setDefrInvAmt(Double defrInvAmt) {
		this.defrInvAmt = defrInvAmt;
	}

	public Double getDefrPerPeriodAmt() {
		return this.defrPerPeriodAmt;
	}

	public void setDefrPerPeriodAmt(Double defrPerPeriodAmt) {
		this.defrPerPeriodAmt = defrPerPeriodAmt;
	}

	public Double getDefrPeriodCurrAmt() {
		return this.defrPeriodCurrAmt;
	}

	public void setDefrPeriodCurrAmt(Double defrPeriodCurrAmt) {
		this.defrPeriodCurrAmt = defrPeriodCurrAmt;
	}

	public Double getDefrPeriodRemain() {
		return this.defrPeriodRemain;
	}

	public void setDefrPeriodRemain(Double defrPeriodRemain) {
		this.defrPeriodRemain = defrPeriodRemain;
	}

	public Double getDefrRevAmt() {
		return this.defrRevAmt;
	}

	public void setDefrRevAmt(Double defrRevAmt) {
		this.defrRevAmt = defrRevAmt;
	}

	public Double getDefrRecAmt() {
		return this.defrRecAmt;
	}

	public void setDefrRecAmt(Double defrRecAmt) {
		this.defrRecAmt = defrRecAmt;
	}

	public String getDefrProject() {
		return this.defrProject;
	}

	public void setDefrProject(String defrProject) {
		this.defrProject = defrProject;
	}

	public String getDefrSlsAcct() {
		return this.defrSlsAcct;
	}

	public void setDefrSlsAcct(String defrSlsAcct) {
		this.defrSlsAcct = defrSlsAcct;
	}

	public String getDefrSlsSub() {
		return this.defrSlsSub;
	}

	public void setDefrSlsSub(String defrSlsSub) {
		this.defrSlsSub = defrSlsSub;
	}

	public String getDefrSlsCc() {
		return this.defrSlsCc;
	}

	public void setDefrSlsCc(String defrSlsCc) {
		this.defrSlsCc = defrSlsCc;
	}

	public String getDefrAcct() {
		return this.defrAcct;
	}

	public void setDefrAcct(String defrAcct) {
		this.defrAcct = defrAcct;
	}

	public String getDefrSub() {
		return this.defrSub;
	}

	public void setDefrSub(String defrSub) {
		this.defrSub = defrSub;
	}

	public String getDefrCc() {
		return this.defrCc;
	}

	public void setDefrCc(String defrCc) {
		this.defrCc = defrCc;
	}

	public String getDefrUser1() {
		return this.defrUser1;
	}

	public void setDefrUser1(String defrUser1) {
		this.defrUser1 = defrUser1;
	}

	public String getDefrUser2() {
		return this.defrUser2;
	}

	public void setDefrUser2(String defrUser2) {
		this.defrUser2 = defrUser2;
	}

	public Double getDefrUserd01() {
		return this.defrUserd01;
	}

	public void setDefrUserd01(Double defrUserd01) {
		this.defrUserd01 = defrUserd01;
	}

	public Integer getDefrUseri01() {
		return this.defrUseri01;
	}

	public void setDefrUseri01(Integer defrUseri01) {
		this.defrUseri01 = defrUseri01;
	}

	public Boolean getDefrUserl01() {
		return this.defrUserl01;
	}

	public void setDefrUserl01(Boolean defrUserl01) {
		this.defrUserl01 = defrUserl01;
	}

	public Date getDefrUsert01() {
		return this.defrUsert01;
	}

	public void setDefrUsert01(Date defrUsert01) {
		this.defrUsert01 = defrUsert01;
	}

	public String getDefrQadc01() {
		return this.defrQadc01;
	}

	public void setDefrQadc01(String defrQadc01) {
		this.defrQadc01 = defrQadc01;
	}

	public Double getDefrQadd01() {
		return this.defrQadd01;
	}

	public void setDefrQadd01(Double defrQadd01) {
		this.defrQadd01 = defrQadd01;
	}

	public Integer getDefrQadi01() {
		return this.defrQadi01;
	}

	public void setDefrQadi01(Integer defrQadi01) {
		this.defrQadi01 = defrQadi01;
	}

	public Boolean getDefrQadl01() {
		return this.defrQadl01;
	}

	public void setDefrQadl01(Boolean defrQadl01) {
		this.defrQadl01 = defrQadl01;
	}

	public Date getDefrQadt01() {
		return this.defrQadt01;
	}

	public void setDefrQadt01(Date defrQadt01) {
		this.defrQadt01 = defrQadt01;
	}

	public String getDefrModUserid() {
		return this.defrModUserid;
	}

	public void setDefrModUserid(String defrModUserid) {
		this.defrModUserid = defrModUserid;
	}

	public Date getDefrModDate() {
		return this.defrModDate;
	}

	public void setDefrModDate(Date defrModDate) {
		this.defrModDate = defrModDate;
	}

	public String getDefrQadc02() {
		return this.defrQadc02;
	}

	public void setDefrQadc02(String defrQadc02) {
		this.defrQadc02 = defrQadc02;
	}

	public String getDefrBillTo() {
		return this.defrBillTo;
	}

	public void setDefrBillTo(String defrBillTo) {
		this.defrBillTo = defrBillTo;
	}

	public Double getOidDefrDet() {
		return this.oidDefrDet;
	}

	public void setOidDefrDet(Double oidDefrDet) {
		this.oidDefrDet = oidDefrDet;
	}

}