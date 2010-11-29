package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFp2Plan entity provides the base persistence definition of the
 * Fp2Plan entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFp2Plan implements java.io.Serializable {

	// Fields

	private Fp2PlanId id;
	private Double fp2BegInv;
	private String fp2InvAct;
	private String fp2InvFcst;
	private String fp2OrdAct;
	private String fp2OrdFcst;
	private Double fp2Target;
	private String fp2User1;
	private String fp2User2;
	private String fp2ModUserid;
	private Date fp2ModDate;
	private String fp2Chr01;
	private String fp2Chr02;
	private String fp2Chr03;
	private String fp2Chr04;
	private String fp2Chr05;
	private Double fp2Dec01;
	private Double fp2Dec02;
	private Boolean fp2Log01;
	private Boolean fp2Log02;
	private String fp2Qadc01;
	private Double oidFp2Plan;

	// Constructors

	/** default constructor */
	public AbstractFp2Plan() {
	}

	/** minimal constructor */
	public AbstractFp2Plan(Fp2PlanId id, Double oidFp2Plan) {
		this.id = id;
		this.oidFp2Plan = oidFp2Plan;
	}

	/** full constructor */
	public AbstractFp2Plan(Fp2PlanId id, Double fp2BegInv, String fp2InvAct,
			String fp2InvFcst, String fp2OrdAct, String fp2OrdFcst,
			Double fp2Target, String fp2User1, String fp2User2,
			String fp2ModUserid, Date fp2ModDate, String fp2Chr01,
			String fp2Chr02, String fp2Chr03, String fp2Chr04, String fp2Chr05,
			Double fp2Dec01, Double fp2Dec02, Boolean fp2Log01,
			Boolean fp2Log02, String fp2Qadc01, Double oidFp2Plan) {
		this.id = id;
		this.fp2BegInv = fp2BegInv;
		this.fp2InvAct = fp2InvAct;
		this.fp2InvFcst = fp2InvFcst;
		this.fp2OrdAct = fp2OrdAct;
		this.fp2OrdFcst = fp2OrdFcst;
		this.fp2Target = fp2Target;
		this.fp2User1 = fp2User1;
		this.fp2User2 = fp2User2;
		this.fp2ModUserid = fp2ModUserid;
		this.fp2ModDate = fp2ModDate;
		this.fp2Chr01 = fp2Chr01;
		this.fp2Chr02 = fp2Chr02;
		this.fp2Chr03 = fp2Chr03;
		this.fp2Chr04 = fp2Chr04;
		this.fp2Chr05 = fp2Chr05;
		this.fp2Dec01 = fp2Dec01;
		this.fp2Dec02 = fp2Dec02;
		this.fp2Log01 = fp2Log01;
		this.fp2Log02 = fp2Log02;
		this.fp2Qadc01 = fp2Qadc01;
		this.oidFp2Plan = oidFp2Plan;
	}

	// Property accessors

	public Fp2PlanId getId() {
		return this.id;
	}

	public void setId(Fp2PlanId id) {
		this.id = id;
	}

	public Double getFp2BegInv() {
		return this.fp2BegInv;
	}

	public void setFp2BegInv(Double fp2BegInv) {
		this.fp2BegInv = fp2BegInv;
	}

	public String getFp2InvAct() {
		return this.fp2InvAct;
	}

	public void setFp2InvAct(String fp2InvAct) {
		this.fp2InvAct = fp2InvAct;
	}

	public String getFp2InvFcst() {
		return this.fp2InvFcst;
	}

	public void setFp2InvFcst(String fp2InvFcst) {
		this.fp2InvFcst = fp2InvFcst;
	}

	public String getFp2OrdAct() {
		return this.fp2OrdAct;
	}

	public void setFp2OrdAct(String fp2OrdAct) {
		this.fp2OrdAct = fp2OrdAct;
	}

	public String getFp2OrdFcst() {
		return this.fp2OrdFcst;
	}

	public void setFp2OrdFcst(String fp2OrdFcst) {
		this.fp2OrdFcst = fp2OrdFcst;
	}

	public Double getFp2Target() {
		return this.fp2Target;
	}

	public void setFp2Target(Double fp2Target) {
		this.fp2Target = fp2Target;
	}

	public String getFp2User1() {
		return this.fp2User1;
	}

	public void setFp2User1(String fp2User1) {
		this.fp2User1 = fp2User1;
	}

	public String getFp2User2() {
		return this.fp2User2;
	}

	public void setFp2User2(String fp2User2) {
		this.fp2User2 = fp2User2;
	}

	public String getFp2ModUserid() {
		return this.fp2ModUserid;
	}

	public void setFp2ModUserid(String fp2ModUserid) {
		this.fp2ModUserid = fp2ModUserid;
	}

	public Date getFp2ModDate() {
		return this.fp2ModDate;
	}

	public void setFp2ModDate(Date fp2ModDate) {
		this.fp2ModDate = fp2ModDate;
	}

	public String getFp2Chr01() {
		return this.fp2Chr01;
	}

	public void setFp2Chr01(String fp2Chr01) {
		this.fp2Chr01 = fp2Chr01;
	}

	public String getFp2Chr02() {
		return this.fp2Chr02;
	}

	public void setFp2Chr02(String fp2Chr02) {
		this.fp2Chr02 = fp2Chr02;
	}

	public String getFp2Chr03() {
		return this.fp2Chr03;
	}

	public void setFp2Chr03(String fp2Chr03) {
		this.fp2Chr03 = fp2Chr03;
	}

	public String getFp2Chr04() {
		return this.fp2Chr04;
	}

	public void setFp2Chr04(String fp2Chr04) {
		this.fp2Chr04 = fp2Chr04;
	}

	public String getFp2Chr05() {
		return this.fp2Chr05;
	}

	public void setFp2Chr05(String fp2Chr05) {
		this.fp2Chr05 = fp2Chr05;
	}

	public Double getFp2Dec01() {
		return this.fp2Dec01;
	}

	public void setFp2Dec01(Double fp2Dec01) {
		this.fp2Dec01 = fp2Dec01;
	}

	public Double getFp2Dec02() {
		return this.fp2Dec02;
	}

	public void setFp2Dec02(Double fp2Dec02) {
		this.fp2Dec02 = fp2Dec02;
	}

	public Boolean getFp2Log01() {
		return this.fp2Log01;
	}

	public void setFp2Log01(Boolean fp2Log01) {
		this.fp2Log01 = fp2Log01;
	}

	public Boolean getFp2Log02() {
		return this.fp2Log02;
	}

	public void setFp2Log02(Boolean fp2Log02) {
		this.fp2Log02 = fp2Log02;
	}

	public String getFp2Qadc01() {
		return this.fp2Qadc01;
	}

	public void setFp2Qadc01(String fp2Qadc01) {
		this.fp2Qadc01 = fp2Qadc01;
	}

	public Double getOidFp2Plan() {
		return this.oidFp2Plan;
	}

	public void setOidFp2Plan(Double oidFp2Plan) {
		this.oidFp2Plan = oidFp2Plan;
	}

}