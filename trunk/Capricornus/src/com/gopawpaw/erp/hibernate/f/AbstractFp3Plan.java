package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFp3Plan entity provides the base persistence definition of the
 * Fp3Plan entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFp3Plan implements java.io.Serializable {

	// Fields

	private Fp3PlanId id;
	private Double fp3BegInv;
	private String fp3ProdAct;
	private String fp3ProdFcst;
	private String fp3ShipAct;
	private String fp3ShipFcst;
	private Double fp3Target;
	private String fp3ApprvList;
	private String fp3WoList;
	private String fp3User1;
	private String fp3User2;
	private String fp3ModUserid;
	private Date fp3ModDate;
	private String fp3Chr01;
	private String fp3Chr02;
	private String fp3Chr03;
	private String fp3Chr04;
	private String fp3Chr05;
	private Double fp3Dec01;
	private Double fp3Dec02;
	private Boolean fp3Log01;
	private Boolean fp3Log02;
	private String fp3Qadc01;
	private Double oidFp3Plan;

	// Constructors

	/** default constructor */
	public AbstractFp3Plan() {
	}

	/** minimal constructor */
	public AbstractFp3Plan(Fp3PlanId id, Double oidFp3Plan) {
		this.id = id;
		this.oidFp3Plan = oidFp3Plan;
	}

	/** full constructor */
	public AbstractFp3Plan(Fp3PlanId id, Double fp3BegInv, String fp3ProdAct,
			String fp3ProdFcst, String fp3ShipAct, String fp3ShipFcst,
			Double fp3Target, String fp3ApprvList, String fp3WoList,
			String fp3User1, String fp3User2, String fp3ModUserid,
			Date fp3ModDate, String fp3Chr01, String fp3Chr02, String fp3Chr03,
			String fp3Chr04, String fp3Chr05, Double fp3Dec01, Double fp3Dec02,
			Boolean fp3Log01, Boolean fp3Log02, String fp3Qadc01,
			Double oidFp3Plan) {
		this.id = id;
		this.fp3BegInv = fp3BegInv;
		this.fp3ProdAct = fp3ProdAct;
		this.fp3ProdFcst = fp3ProdFcst;
		this.fp3ShipAct = fp3ShipAct;
		this.fp3ShipFcst = fp3ShipFcst;
		this.fp3Target = fp3Target;
		this.fp3ApprvList = fp3ApprvList;
		this.fp3WoList = fp3WoList;
		this.fp3User1 = fp3User1;
		this.fp3User2 = fp3User2;
		this.fp3ModUserid = fp3ModUserid;
		this.fp3ModDate = fp3ModDate;
		this.fp3Chr01 = fp3Chr01;
		this.fp3Chr02 = fp3Chr02;
		this.fp3Chr03 = fp3Chr03;
		this.fp3Chr04 = fp3Chr04;
		this.fp3Chr05 = fp3Chr05;
		this.fp3Dec01 = fp3Dec01;
		this.fp3Dec02 = fp3Dec02;
		this.fp3Log01 = fp3Log01;
		this.fp3Log02 = fp3Log02;
		this.fp3Qadc01 = fp3Qadc01;
		this.oidFp3Plan = oidFp3Plan;
	}

	// Property accessors

	public Fp3PlanId getId() {
		return this.id;
	}

	public void setId(Fp3PlanId id) {
		this.id = id;
	}

	public Double getFp3BegInv() {
		return this.fp3BegInv;
	}

	public void setFp3BegInv(Double fp3BegInv) {
		this.fp3BegInv = fp3BegInv;
	}

	public String getFp3ProdAct() {
		return this.fp3ProdAct;
	}

	public void setFp3ProdAct(String fp3ProdAct) {
		this.fp3ProdAct = fp3ProdAct;
	}

	public String getFp3ProdFcst() {
		return this.fp3ProdFcst;
	}

	public void setFp3ProdFcst(String fp3ProdFcst) {
		this.fp3ProdFcst = fp3ProdFcst;
	}

	public String getFp3ShipAct() {
		return this.fp3ShipAct;
	}

	public void setFp3ShipAct(String fp3ShipAct) {
		this.fp3ShipAct = fp3ShipAct;
	}

	public String getFp3ShipFcst() {
		return this.fp3ShipFcst;
	}

	public void setFp3ShipFcst(String fp3ShipFcst) {
		this.fp3ShipFcst = fp3ShipFcst;
	}

	public Double getFp3Target() {
		return this.fp3Target;
	}

	public void setFp3Target(Double fp3Target) {
		this.fp3Target = fp3Target;
	}

	public String getFp3ApprvList() {
		return this.fp3ApprvList;
	}

	public void setFp3ApprvList(String fp3ApprvList) {
		this.fp3ApprvList = fp3ApprvList;
	}

	public String getFp3WoList() {
		return this.fp3WoList;
	}

	public void setFp3WoList(String fp3WoList) {
		this.fp3WoList = fp3WoList;
	}

	public String getFp3User1() {
		return this.fp3User1;
	}

	public void setFp3User1(String fp3User1) {
		this.fp3User1 = fp3User1;
	}

	public String getFp3User2() {
		return this.fp3User2;
	}

	public void setFp3User2(String fp3User2) {
		this.fp3User2 = fp3User2;
	}

	public String getFp3ModUserid() {
		return this.fp3ModUserid;
	}

	public void setFp3ModUserid(String fp3ModUserid) {
		this.fp3ModUserid = fp3ModUserid;
	}

	public Date getFp3ModDate() {
		return this.fp3ModDate;
	}

	public void setFp3ModDate(Date fp3ModDate) {
		this.fp3ModDate = fp3ModDate;
	}

	public String getFp3Chr01() {
		return this.fp3Chr01;
	}

	public void setFp3Chr01(String fp3Chr01) {
		this.fp3Chr01 = fp3Chr01;
	}

	public String getFp3Chr02() {
		return this.fp3Chr02;
	}

	public void setFp3Chr02(String fp3Chr02) {
		this.fp3Chr02 = fp3Chr02;
	}

	public String getFp3Chr03() {
		return this.fp3Chr03;
	}

	public void setFp3Chr03(String fp3Chr03) {
		this.fp3Chr03 = fp3Chr03;
	}

	public String getFp3Chr04() {
		return this.fp3Chr04;
	}

	public void setFp3Chr04(String fp3Chr04) {
		this.fp3Chr04 = fp3Chr04;
	}

	public String getFp3Chr05() {
		return this.fp3Chr05;
	}

	public void setFp3Chr05(String fp3Chr05) {
		this.fp3Chr05 = fp3Chr05;
	}

	public Double getFp3Dec01() {
		return this.fp3Dec01;
	}

	public void setFp3Dec01(Double fp3Dec01) {
		this.fp3Dec01 = fp3Dec01;
	}

	public Double getFp3Dec02() {
		return this.fp3Dec02;
	}

	public void setFp3Dec02(Double fp3Dec02) {
		this.fp3Dec02 = fp3Dec02;
	}

	public Boolean getFp3Log01() {
		return this.fp3Log01;
	}

	public void setFp3Log01(Boolean fp3Log01) {
		this.fp3Log01 = fp3Log01;
	}

	public Boolean getFp3Log02() {
		return this.fp3Log02;
	}

	public void setFp3Log02(Boolean fp3Log02) {
		this.fp3Log02 = fp3Log02;
	}

	public String getFp3Qadc01() {
		return this.fp3Qadc01;
	}

	public void setFp3Qadc01(String fp3Qadc01) {
		this.fp3Qadc01 = fp3Qadc01;
	}

	public Double getOidFp3Plan() {
		return this.oidFp3Plan;
	}

	public void setOidFp3Plan(Double oidFp3Plan) {
		this.oidFp3Plan = oidFp3Plan;
	}

}