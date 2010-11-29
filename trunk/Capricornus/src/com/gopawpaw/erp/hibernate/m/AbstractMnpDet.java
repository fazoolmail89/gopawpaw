package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMnpDet entity provides the base persistence definition of the MnpDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMnpDet implements java.io.Serializable {

	// Fields

	private MnpDetId id;
	private String mnpExec;
	private String mnpMenu;
	private Integer mnpSelect;
	private String mnpRepeatGroup;
	private String mnpUser1;
	private String mnpUser2;
	private String mnpQadc01;
	private Double oidMnpDet;

	// Constructors

	/** default constructor */
	public AbstractMnpDet() {
	}

	/** minimal constructor */
	public AbstractMnpDet(MnpDetId id, Double oidMnpDet) {
		this.id = id;
		this.oidMnpDet = oidMnpDet;
	}

	/** full constructor */
	public AbstractMnpDet(MnpDetId id, String mnpExec, String mnpMenu,
			Integer mnpSelect, String mnpRepeatGroup, String mnpUser1,
			String mnpUser2, String mnpQadc01, Double oidMnpDet) {
		this.id = id;
		this.mnpExec = mnpExec;
		this.mnpMenu = mnpMenu;
		this.mnpSelect = mnpSelect;
		this.mnpRepeatGroup = mnpRepeatGroup;
		this.mnpUser1 = mnpUser1;
		this.mnpUser2 = mnpUser2;
		this.mnpQadc01 = mnpQadc01;
		this.oidMnpDet = oidMnpDet;
	}

	// Property accessors

	public MnpDetId getId() {
		return this.id;
	}

	public void setId(MnpDetId id) {
		this.id = id;
	}

	public String getMnpExec() {
		return this.mnpExec;
	}

	public void setMnpExec(String mnpExec) {
		this.mnpExec = mnpExec;
	}

	public String getMnpMenu() {
		return this.mnpMenu;
	}

	public void setMnpMenu(String mnpMenu) {
		this.mnpMenu = mnpMenu;
	}

	public Integer getMnpSelect() {
		return this.mnpSelect;
	}

	public void setMnpSelect(Integer mnpSelect) {
		this.mnpSelect = mnpSelect;
	}

	public String getMnpRepeatGroup() {
		return this.mnpRepeatGroup;
	}

	public void setMnpRepeatGroup(String mnpRepeatGroup) {
		this.mnpRepeatGroup = mnpRepeatGroup;
	}

	public String getMnpUser1() {
		return this.mnpUser1;
	}

	public void setMnpUser1(String mnpUser1) {
		this.mnpUser1 = mnpUser1;
	}

	public String getMnpUser2() {
		return this.mnpUser2;
	}

	public void setMnpUser2(String mnpUser2) {
		this.mnpUser2 = mnpUser2;
	}

	public String getMnpQadc01() {
		return this.mnpQadc01;
	}

	public void setMnpQadc01(String mnpQadc01) {
		this.mnpQadc01 = mnpQadc01;
	}

	public Double getOidMnpDet() {
		return this.oidMnpDet;
	}

	public void setOidMnpDet(Double oidMnpDet) {
		this.oidMnpDet = oidMnpDet;
	}

}