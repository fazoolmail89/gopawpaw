package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFp1Plan entity provides the base persistence definition of the
 * Fp1Plan entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFp1Plan implements java.io.Serializable {

	// Fields

	private Fp1PlanId id;
	private Double fp1BegInv;
	private String fp1BklgAct;
	private String fp1BklgFcst;
	private String fp1CostAct;
	private String fp1CostFcst;
	private Double fp1Target;
	private String fp1User1;
	private String fp1User2;
	private String fp1ModUserid;
	private Date fp1ModDate;
	private String fp1Chr01;
	private String fp1Chr02;
	private String fp1Chr03;
	private String fp1Chr04;
	private String fp1Chr05;
	private Double fp1Dec01;
	private Double fp1Dec02;
	private Boolean fp1Log01;
	private Boolean fp1Log02;
	private String fp1Qadc01;
	private Double oidFp1Plan;

	// Constructors

	/** default constructor */
	public AbstractFp1Plan() {
	}

	/** minimal constructor */
	public AbstractFp1Plan(Fp1PlanId id, Double oidFp1Plan) {
		this.id = id;
		this.oidFp1Plan = oidFp1Plan;
	}

	/** full constructor */
	public AbstractFp1Plan(Fp1PlanId id, Double fp1BegInv, String fp1BklgAct,
			String fp1BklgFcst, String fp1CostAct, String fp1CostFcst,
			Double fp1Target, String fp1User1, String fp1User2,
			String fp1ModUserid, Date fp1ModDate, String fp1Chr01,
			String fp1Chr02, String fp1Chr03, String fp1Chr04, String fp1Chr05,
			Double fp1Dec01, Double fp1Dec02, Boolean fp1Log01,
			Boolean fp1Log02, String fp1Qadc01, Double oidFp1Plan) {
		this.id = id;
		this.fp1BegInv = fp1BegInv;
		this.fp1BklgAct = fp1BklgAct;
		this.fp1BklgFcst = fp1BklgFcst;
		this.fp1CostAct = fp1CostAct;
		this.fp1CostFcst = fp1CostFcst;
		this.fp1Target = fp1Target;
		this.fp1User1 = fp1User1;
		this.fp1User2 = fp1User2;
		this.fp1ModUserid = fp1ModUserid;
		this.fp1ModDate = fp1ModDate;
		this.fp1Chr01 = fp1Chr01;
		this.fp1Chr02 = fp1Chr02;
		this.fp1Chr03 = fp1Chr03;
		this.fp1Chr04 = fp1Chr04;
		this.fp1Chr05 = fp1Chr05;
		this.fp1Dec01 = fp1Dec01;
		this.fp1Dec02 = fp1Dec02;
		this.fp1Log01 = fp1Log01;
		this.fp1Log02 = fp1Log02;
		this.fp1Qadc01 = fp1Qadc01;
		this.oidFp1Plan = oidFp1Plan;
	}

	// Property accessors

	public Fp1PlanId getId() {
		return this.id;
	}

	public void setId(Fp1PlanId id) {
		this.id = id;
	}

	public Double getFp1BegInv() {
		return this.fp1BegInv;
	}

	public void setFp1BegInv(Double fp1BegInv) {
		this.fp1BegInv = fp1BegInv;
	}

	public String getFp1BklgAct() {
		return this.fp1BklgAct;
	}

	public void setFp1BklgAct(String fp1BklgAct) {
		this.fp1BklgAct = fp1BklgAct;
	}

	public String getFp1BklgFcst() {
		return this.fp1BklgFcst;
	}

	public void setFp1BklgFcst(String fp1BklgFcst) {
		this.fp1BklgFcst = fp1BklgFcst;
	}

	public String getFp1CostAct() {
		return this.fp1CostAct;
	}

	public void setFp1CostAct(String fp1CostAct) {
		this.fp1CostAct = fp1CostAct;
	}

	public String getFp1CostFcst() {
		return this.fp1CostFcst;
	}

	public void setFp1CostFcst(String fp1CostFcst) {
		this.fp1CostFcst = fp1CostFcst;
	}

	public Double getFp1Target() {
		return this.fp1Target;
	}

	public void setFp1Target(Double fp1Target) {
		this.fp1Target = fp1Target;
	}

	public String getFp1User1() {
		return this.fp1User1;
	}

	public void setFp1User1(String fp1User1) {
		this.fp1User1 = fp1User1;
	}

	public String getFp1User2() {
		return this.fp1User2;
	}

	public void setFp1User2(String fp1User2) {
		this.fp1User2 = fp1User2;
	}

	public String getFp1ModUserid() {
		return this.fp1ModUserid;
	}

	public void setFp1ModUserid(String fp1ModUserid) {
		this.fp1ModUserid = fp1ModUserid;
	}

	public Date getFp1ModDate() {
		return this.fp1ModDate;
	}

	public void setFp1ModDate(Date fp1ModDate) {
		this.fp1ModDate = fp1ModDate;
	}

	public String getFp1Chr01() {
		return this.fp1Chr01;
	}

	public void setFp1Chr01(String fp1Chr01) {
		this.fp1Chr01 = fp1Chr01;
	}

	public String getFp1Chr02() {
		return this.fp1Chr02;
	}

	public void setFp1Chr02(String fp1Chr02) {
		this.fp1Chr02 = fp1Chr02;
	}

	public String getFp1Chr03() {
		return this.fp1Chr03;
	}

	public void setFp1Chr03(String fp1Chr03) {
		this.fp1Chr03 = fp1Chr03;
	}

	public String getFp1Chr04() {
		return this.fp1Chr04;
	}

	public void setFp1Chr04(String fp1Chr04) {
		this.fp1Chr04 = fp1Chr04;
	}

	public String getFp1Chr05() {
		return this.fp1Chr05;
	}

	public void setFp1Chr05(String fp1Chr05) {
		this.fp1Chr05 = fp1Chr05;
	}

	public Double getFp1Dec01() {
		return this.fp1Dec01;
	}

	public void setFp1Dec01(Double fp1Dec01) {
		this.fp1Dec01 = fp1Dec01;
	}

	public Double getFp1Dec02() {
		return this.fp1Dec02;
	}

	public void setFp1Dec02(Double fp1Dec02) {
		this.fp1Dec02 = fp1Dec02;
	}

	public Boolean getFp1Log01() {
		return this.fp1Log01;
	}

	public void setFp1Log01(Boolean fp1Log01) {
		this.fp1Log01 = fp1Log01;
	}

	public Boolean getFp1Log02() {
		return this.fp1Log02;
	}

	public void setFp1Log02(Boolean fp1Log02) {
		this.fp1Log02 = fp1Log02;
	}

	public String getFp1Qadc01() {
		return this.fp1Qadc01;
	}

	public void setFp1Qadc01(String fp1Qadc01) {
		this.fp1Qadc01 = fp1Qadc01;
	}

	public Double getOidFp1Plan() {
		return this.oidFp1Plan;
	}

	public void setOidFp1Plan(Double oidFp1Plan) {
		this.oidFp1Plan = oidFp1Plan;
	}

}