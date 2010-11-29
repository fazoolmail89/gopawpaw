package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSopDet entity provides the base persistence definition of the SopDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSopDet implements java.io.Serializable {

	// Fields

	private SopDetId id;
	private Double sopCost;
	private String sopUser1;
	private String sopUser2;
	private String sopWkctr;
	private Double sopSetup;
	private Double sopRun;
	private Double sopYieldPct;
	private Double sopSubCost;
	private Date sopStart;
	private Date sopEnd;
	private Double sopInvValue;
	private Boolean sopMilestone;
	private Double sopBatch;
	private Double sopSetupMen;
	private Double sopMenMch;
	private Integer sopMchOp;
	private Double sopStdBatch;
	private String sopElmLbr;
	private String sopElmBdn;
	private String sopElmSub;
	private String sopQadc01;
	private Double oidSopDet;

	// Constructors

	/** default constructor */
	public AbstractSopDet() {
	}

	/** minimal constructor */
	public AbstractSopDet(SopDetId id, Double oidSopDet) {
		this.id = id;
		this.oidSopDet = oidSopDet;
	}

	/** full constructor */
	public AbstractSopDet(SopDetId id, Double sopCost, String sopUser1,
			String sopUser2, String sopWkctr, Double sopSetup, Double sopRun,
			Double sopYieldPct, Double sopSubCost, Date sopStart, Date sopEnd,
			Double sopInvValue, Boolean sopMilestone, Double sopBatch,
			Double sopSetupMen, Double sopMenMch, Integer sopMchOp,
			Double sopStdBatch, String sopElmLbr, String sopElmBdn,
			String sopElmSub, String sopQadc01, Double oidSopDet) {
		this.id = id;
		this.sopCost = sopCost;
		this.sopUser1 = sopUser1;
		this.sopUser2 = sopUser2;
		this.sopWkctr = sopWkctr;
		this.sopSetup = sopSetup;
		this.sopRun = sopRun;
		this.sopYieldPct = sopYieldPct;
		this.sopSubCost = sopSubCost;
		this.sopStart = sopStart;
		this.sopEnd = sopEnd;
		this.sopInvValue = sopInvValue;
		this.sopMilestone = sopMilestone;
		this.sopBatch = sopBatch;
		this.sopSetupMen = sopSetupMen;
		this.sopMenMch = sopMenMch;
		this.sopMchOp = sopMchOp;
		this.sopStdBatch = sopStdBatch;
		this.sopElmLbr = sopElmLbr;
		this.sopElmBdn = sopElmBdn;
		this.sopElmSub = sopElmSub;
		this.sopQadc01 = sopQadc01;
		this.oidSopDet = oidSopDet;
	}

	// Property accessors

	public SopDetId getId() {
		return this.id;
	}

	public void setId(SopDetId id) {
		this.id = id;
	}

	public Double getSopCost() {
		return this.sopCost;
	}

	public void setSopCost(Double sopCost) {
		this.sopCost = sopCost;
	}

	public String getSopUser1() {
		return this.sopUser1;
	}

	public void setSopUser1(String sopUser1) {
		this.sopUser1 = sopUser1;
	}

	public String getSopUser2() {
		return this.sopUser2;
	}

	public void setSopUser2(String sopUser2) {
		this.sopUser2 = sopUser2;
	}

	public String getSopWkctr() {
		return this.sopWkctr;
	}

	public void setSopWkctr(String sopWkctr) {
		this.sopWkctr = sopWkctr;
	}

	public Double getSopSetup() {
		return this.sopSetup;
	}

	public void setSopSetup(Double sopSetup) {
		this.sopSetup = sopSetup;
	}

	public Double getSopRun() {
		return this.sopRun;
	}

	public void setSopRun(Double sopRun) {
		this.sopRun = sopRun;
	}

	public Double getSopYieldPct() {
		return this.sopYieldPct;
	}

	public void setSopYieldPct(Double sopYieldPct) {
		this.sopYieldPct = sopYieldPct;
	}

	public Double getSopSubCost() {
		return this.sopSubCost;
	}

	public void setSopSubCost(Double sopSubCost) {
		this.sopSubCost = sopSubCost;
	}

	public Date getSopStart() {
		return this.sopStart;
	}

	public void setSopStart(Date sopStart) {
		this.sopStart = sopStart;
	}

	public Date getSopEnd() {
		return this.sopEnd;
	}

	public void setSopEnd(Date sopEnd) {
		this.sopEnd = sopEnd;
	}

	public Double getSopInvValue() {
		return this.sopInvValue;
	}

	public void setSopInvValue(Double sopInvValue) {
		this.sopInvValue = sopInvValue;
	}

	public Boolean getSopMilestone() {
		return this.sopMilestone;
	}

	public void setSopMilestone(Boolean sopMilestone) {
		this.sopMilestone = sopMilestone;
	}

	public Double getSopBatch() {
		return this.sopBatch;
	}

	public void setSopBatch(Double sopBatch) {
		this.sopBatch = sopBatch;
	}

	public Double getSopSetupMen() {
		return this.sopSetupMen;
	}

	public void setSopSetupMen(Double sopSetupMen) {
		this.sopSetupMen = sopSetupMen;
	}

	public Double getSopMenMch() {
		return this.sopMenMch;
	}

	public void setSopMenMch(Double sopMenMch) {
		this.sopMenMch = sopMenMch;
	}

	public Integer getSopMchOp() {
		return this.sopMchOp;
	}

	public void setSopMchOp(Integer sopMchOp) {
		this.sopMchOp = sopMchOp;
	}

	public Double getSopStdBatch() {
		return this.sopStdBatch;
	}

	public void setSopStdBatch(Double sopStdBatch) {
		this.sopStdBatch = sopStdBatch;
	}

	public String getSopElmLbr() {
		return this.sopElmLbr;
	}

	public void setSopElmLbr(String sopElmLbr) {
		this.sopElmLbr = sopElmLbr;
	}

	public String getSopElmBdn() {
		return this.sopElmBdn;
	}

	public void setSopElmBdn(String sopElmBdn) {
		this.sopElmBdn = sopElmBdn;
	}

	public String getSopElmSub() {
		return this.sopElmSub;
	}

	public void setSopElmSub(String sopElmSub) {
		this.sopElmSub = sopElmSub;
	}

	public String getSopQadc01() {
		return this.sopQadc01;
	}

	public void setSopQadc01(String sopQadc01) {
		this.sopQadc01 = sopQadc01;
	}

	public Double getOidSopDet() {
		return this.oidSopDet;
	}

	public void setOidSopDet(Double oidSopDet) {
		this.oidSopDet = oidSopDet;
	}

}