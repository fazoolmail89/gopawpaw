package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPaldDet entity provides the base persistence definition of the
 * PaldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPaldDet implements java.io.Serializable {

	// Fields

	private PaldDetId id;
	private String paldDesc;
	private Double paldHeight;
	private Integer paldNbrLay;
	private String paldUm;
	private Integer paldUnitLay;
	private String paldUser1;
	private String paldUser2;
	private Double paldWeight;
	private String paldChr01;
	private String paldChr02;
	private String paldChr03;
	private String paldChr04;
	private String paldChr05;
	private Double paldDec01;
	private Double paldDec02;
	private String paldHghtUm;
	private String paldWghtUm;
	private Double oidPaldDet;

	// Constructors

	/** default constructor */
	public AbstractPaldDet() {
	}

	/** minimal constructor */
	public AbstractPaldDet(PaldDetId id, Double oidPaldDet) {
		this.id = id;
		this.oidPaldDet = oidPaldDet;
	}

	/** full constructor */
	public AbstractPaldDet(PaldDetId id, String paldDesc, Double paldHeight,
			Integer paldNbrLay, String paldUm, Integer paldUnitLay,
			String paldUser1, String paldUser2, Double paldWeight,
			String paldChr01, String paldChr02, String paldChr03,
			String paldChr04, String paldChr05, Double paldDec01,
			Double paldDec02, String paldHghtUm, String paldWghtUm,
			Double oidPaldDet) {
		this.id = id;
		this.paldDesc = paldDesc;
		this.paldHeight = paldHeight;
		this.paldNbrLay = paldNbrLay;
		this.paldUm = paldUm;
		this.paldUnitLay = paldUnitLay;
		this.paldUser1 = paldUser1;
		this.paldUser2 = paldUser2;
		this.paldWeight = paldWeight;
		this.paldChr01 = paldChr01;
		this.paldChr02 = paldChr02;
		this.paldChr03 = paldChr03;
		this.paldChr04 = paldChr04;
		this.paldChr05 = paldChr05;
		this.paldDec01 = paldDec01;
		this.paldDec02 = paldDec02;
		this.paldHghtUm = paldHghtUm;
		this.paldWghtUm = paldWghtUm;
		this.oidPaldDet = oidPaldDet;
	}

	// Property accessors

	public PaldDetId getId() {
		return this.id;
	}

	public void setId(PaldDetId id) {
		this.id = id;
	}

	public String getPaldDesc() {
		return this.paldDesc;
	}

	public void setPaldDesc(String paldDesc) {
		this.paldDesc = paldDesc;
	}

	public Double getPaldHeight() {
		return this.paldHeight;
	}

	public void setPaldHeight(Double paldHeight) {
		this.paldHeight = paldHeight;
	}

	public Integer getPaldNbrLay() {
		return this.paldNbrLay;
	}

	public void setPaldNbrLay(Integer paldNbrLay) {
		this.paldNbrLay = paldNbrLay;
	}

	public String getPaldUm() {
		return this.paldUm;
	}

	public void setPaldUm(String paldUm) {
		this.paldUm = paldUm;
	}

	public Integer getPaldUnitLay() {
		return this.paldUnitLay;
	}

	public void setPaldUnitLay(Integer paldUnitLay) {
		this.paldUnitLay = paldUnitLay;
	}

	public String getPaldUser1() {
		return this.paldUser1;
	}

	public void setPaldUser1(String paldUser1) {
		this.paldUser1 = paldUser1;
	}

	public String getPaldUser2() {
		return this.paldUser2;
	}

	public void setPaldUser2(String paldUser2) {
		this.paldUser2 = paldUser2;
	}

	public Double getPaldWeight() {
		return this.paldWeight;
	}

	public void setPaldWeight(Double paldWeight) {
		this.paldWeight = paldWeight;
	}

	public String getPaldChr01() {
		return this.paldChr01;
	}

	public void setPaldChr01(String paldChr01) {
		this.paldChr01 = paldChr01;
	}

	public String getPaldChr02() {
		return this.paldChr02;
	}

	public void setPaldChr02(String paldChr02) {
		this.paldChr02 = paldChr02;
	}

	public String getPaldChr03() {
		return this.paldChr03;
	}

	public void setPaldChr03(String paldChr03) {
		this.paldChr03 = paldChr03;
	}

	public String getPaldChr04() {
		return this.paldChr04;
	}

	public void setPaldChr04(String paldChr04) {
		this.paldChr04 = paldChr04;
	}

	public String getPaldChr05() {
		return this.paldChr05;
	}

	public void setPaldChr05(String paldChr05) {
		this.paldChr05 = paldChr05;
	}

	public Double getPaldDec01() {
		return this.paldDec01;
	}

	public void setPaldDec01(Double paldDec01) {
		this.paldDec01 = paldDec01;
	}

	public Double getPaldDec02() {
		return this.paldDec02;
	}

	public void setPaldDec02(Double paldDec02) {
		this.paldDec02 = paldDec02;
	}

	public String getPaldHghtUm() {
		return this.paldHghtUm;
	}

	public void setPaldHghtUm(String paldHghtUm) {
		this.paldHghtUm = paldHghtUm;
	}

	public String getPaldWghtUm() {
		return this.paldWghtUm;
	}

	public void setPaldWghtUm(String paldWghtUm) {
		this.paldWghtUm = paldWghtUm;
	}

	public Double getOidPaldDet() {
		return this.oidPaldDet;
	}

	public void setOidPaldDet(Double oidPaldDet) {
		this.oidPaldDet = oidPaldDet;
	}

}