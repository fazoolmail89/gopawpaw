package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFpdCost entity provides the base persistence definition of the
 * FpdCost entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpdCost implements java.io.Serializable {

	// Fields

	private FpdCostId id;
	private Double fpdPrice;
	private Double fpdRate1;
	private Double fpdCost1;
	private String fpdUser1;
	private String fpdUser2;
	private String fpdChr01;
	private String fpdChr02;
	private String fpdChr03;
	private String fpdChr04;
	private String fpdChr05;
	private Double fpdDec01;
	private Double fpdDec02;
	private Double fpdDec03;
	private Double fpdDec04;
	private Double fpdDec05;
	private Double fpdRate2;
	private Double fpdCost2;
	private Double fpdRate3;
	private Double fpdCost3;
	private Double fpdRate4;
	private Double fpdCost4;
	private Double fpdRate5;
	private Double fpdCost5;
	private Double oidFpdCost;

	// Constructors

	/** default constructor */
	public AbstractFpdCost() {
	}

	/** minimal constructor */
	public AbstractFpdCost(FpdCostId id, Double oidFpdCost) {
		this.id = id;
		this.oidFpdCost = oidFpdCost;
	}

	/** full constructor */
	public AbstractFpdCost(FpdCostId id, Double fpdPrice, Double fpdRate1,
			Double fpdCost1, String fpdUser1, String fpdUser2, String fpdChr01,
			String fpdChr02, String fpdChr03, String fpdChr04, String fpdChr05,
			Double fpdDec01, Double fpdDec02, Double fpdDec03, Double fpdDec04,
			Double fpdDec05, Double fpdRate2, Double fpdCost2, Double fpdRate3,
			Double fpdCost3, Double fpdRate4, Double fpdCost4, Double fpdRate5,
			Double fpdCost5, Double oidFpdCost) {
		this.id = id;
		this.fpdPrice = fpdPrice;
		this.fpdRate1 = fpdRate1;
		this.fpdCost1 = fpdCost1;
		this.fpdUser1 = fpdUser1;
		this.fpdUser2 = fpdUser2;
		this.fpdChr01 = fpdChr01;
		this.fpdChr02 = fpdChr02;
		this.fpdChr03 = fpdChr03;
		this.fpdChr04 = fpdChr04;
		this.fpdChr05 = fpdChr05;
		this.fpdDec01 = fpdDec01;
		this.fpdDec02 = fpdDec02;
		this.fpdDec03 = fpdDec03;
		this.fpdDec04 = fpdDec04;
		this.fpdDec05 = fpdDec05;
		this.fpdRate2 = fpdRate2;
		this.fpdCost2 = fpdCost2;
		this.fpdRate3 = fpdRate3;
		this.fpdCost3 = fpdCost3;
		this.fpdRate4 = fpdRate4;
		this.fpdCost4 = fpdCost4;
		this.fpdRate5 = fpdRate5;
		this.fpdCost5 = fpdCost5;
		this.oidFpdCost = oidFpdCost;
	}

	// Property accessors

	public FpdCostId getId() {
		return this.id;
	}

	public void setId(FpdCostId id) {
		this.id = id;
	}

	public Double getFpdPrice() {
		return this.fpdPrice;
	}

	public void setFpdPrice(Double fpdPrice) {
		this.fpdPrice = fpdPrice;
	}

	public Double getFpdRate1() {
		return this.fpdRate1;
	}

	public void setFpdRate1(Double fpdRate1) {
		this.fpdRate1 = fpdRate1;
	}

	public Double getFpdCost1() {
		return this.fpdCost1;
	}

	public void setFpdCost1(Double fpdCost1) {
		this.fpdCost1 = fpdCost1;
	}

	public String getFpdUser1() {
		return this.fpdUser1;
	}

	public void setFpdUser1(String fpdUser1) {
		this.fpdUser1 = fpdUser1;
	}

	public String getFpdUser2() {
		return this.fpdUser2;
	}

	public void setFpdUser2(String fpdUser2) {
		this.fpdUser2 = fpdUser2;
	}

	public String getFpdChr01() {
		return this.fpdChr01;
	}

	public void setFpdChr01(String fpdChr01) {
		this.fpdChr01 = fpdChr01;
	}

	public String getFpdChr02() {
		return this.fpdChr02;
	}

	public void setFpdChr02(String fpdChr02) {
		this.fpdChr02 = fpdChr02;
	}

	public String getFpdChr03() {
		return this.fpdChr03;
	}

	public void setFpdChr03(String fpdChr03) {
		this.fpdChr03 = fpdChr03;
	}

	public String getFpdChr04() {
		return this.fpdChr04;
	}

	public void setFpdChr04(String fpdChr04) {
		this.fpdChr04 = fpdChr04;
	}

	public String getFpdChr05() {
		return this.fpdChr05;
	}

	public void setFpdChr05(String fpdChr05) {
		this.fpdChr05 = fpdChr05;
	}

	public Double getFpdDec01() {
		return this.fpdDec01;
	}

	public void setFpdDec01(Double fpdDec01) {
		this.fpdDec01 = fpdDec01;
	}

	public Double getFpdDec02() {
		return this.fpdDec02;
	}

	public void setFpdDec02(Double fpdDec02) {
		this.fpdDec02 = fpdDec02;
	}

	public Double getFpdDec03() {
		return this.fpdDec03;
	}

	public void setFpdDec03(Double fpdDec03) {
		this.fpdDec03 = fpdDec03;
	}

	public Double getFpdDec04() {
		return this.fpdDec04;
	}

	public void setFpdDec04(Double fpdDec04) {
		this.fpdDec04 = fpdDec04;
	}

	public Double getFpdDec05() {
		return this.fpdDec05;
	}

	public void setFpdDec05(Double fpdDec05) {
		this.fpdDec05 = fpdDec05;
	}

	public Double getFpdRate2() {
		return this.fpdRate2;
	}

	public void setFpdRate2(Double fpdRate2) {
		this.fpdRate2 = fpdRate2;
	}

	public Double getFpdCost2() {
		return this.fpdCost2;
	}

	public void setFpdCost2(Double fpdCost2) {
		this.fpdCost2 = fpdCost2;
	}

	public Double getFpdRate3() {
		return this.fpdRate3;
	}

	public void setFpdRate3(Double fpdRate3) {
		this.fpdRate3 = fpdRate3;
	}

	public Double getFpdCost3() {
		return this.fpdCost3;
	}

	public void setFpdCost3(Double fpdCost3) {
		this.fpdCost3 = fpdCost3;
	}

	public Double getFpdRate4() {
		return this.fpdRate4;
	}

	public void setFpdRate4(Double fpdRate4) {
		this.fpdRate4 = fpdRate4;
	}

	public Double getFpdCost4() {
		return this.fpdCost4;
	}

	public void setFpdCost4(Double fpdCost4) {
		this.fpdCost4 = fpdCost4;
	}

	public Double getFpdRate5() {
		return this.fpdRate5;
	}

	public void setFpdRate5(Double fpdRate5) {
		this.fpdRate5 = fpdRate5;
	}

	public Double getFpdCost5() {
		return this.fpdCost5;
	}

	public void setFpdCost5(Double fpdCost5) {
		this.fpdCost5 = fpdCost5;
	}

	public Double getOidFpdCost() {
		return this.oidFpdCost;
	}

	public void setOidFpdCost(Double oidFpdCost) {
		this.oidFpdCost = oidFpdCost;
	}

}