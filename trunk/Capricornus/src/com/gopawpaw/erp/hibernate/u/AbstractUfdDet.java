package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUfdDet entity provides the base persistence definition of the UfdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUfdDet implements java.io.Serializable {

	// Fields

	private UfdDetId id;
	private String ufdExec;
	private String ufdNbr;
	private Integer ufdSelect;
	private String ufdUser1;
	private String ufdUser2;
	private String ufdNbrsel;
	private String ufdLabel;
	private String ufdQadc01;
	private Double oidUfdDet;

	// Constructors

	/** default constructor */
	public AbstractUfdDet() {
	}

	/** minimal constructor */
	public AbstractUfdDet(UfdDetId id, String ufdLabel, Double oidUfdDet) {
		this.id = id;
		this.ufdLabel = ufdLabel;
		this.oidUfdDet = oidUfdDet;
	}

	/** full constructor */
	public AbstractUfdDet(UfdDetId id, String ufdExec, String ufdNbr,
			Integer ufdSelect, String ufdUser1, String ufdUser2,
			String ufdNbrsel, String ufdLabel, String ufdQadc01,
			Double oidUfdDet) {
		this.id = id;
		this.ufdExec = ufdExec;
		this.ufdNbr = ufdNbr;
		this.ufdSelect = ufdSelect;
		this.ufdUser1 = ufdUser1;
		this.ufdUser2 = ufdUser2;
		this.ufdNbrsel = ufdNbrsel;
		this.ufdLabel = ufdLabel;
		this.ufdQadc01 = ufdQadc01;
		this.oidUfdDet = oidUfdDet;
	}

	// Property accessors

	public UfdDetId getId() {
		return this.id;
	}

	public void setId(UfdDetId id) {
		this.id = id;
	}

	public String getUfdExec() {
		return this.ufdExec;
	}

	public void setUfdExec(String ufdExec) {
		this.ufdExec = ufdExec;
	}

	public String getUfdNbr() {
		return this.ufdNbr;
	}

	public void setUfdNbr(String ufdNbr) {
		this.ufdNbr = ufdNbr;
	}

	public Integer getUfdSelect() {
		return this.ufdSelect;
	}

	public void setUfdSelect(Integer ufdSelect) {
		this.ufdSelect = ufdSelect;
	}

	public String getUfdUser1() {
		return this.ufdUser1;
	}

	public void setUfdUser1(String ufdUser1) {
		this.ufdUser1 = ufdUser1;
	}

	public String getUfdUser2() {
		return this.ufdUser2;
	}

	public void setUfdUser2(String ufdUser2) {
		this.ufdUser2 = ufdUser2;
	}

	public String getUfdNbrsel() {
		return this.ufdNbrsel;
	}

	public void setUfdNbrsel(String ufdNbrsel) {
		this.ufdNbrsel = ufdNbrsel;
	}

	public String getUfdLabel() {
		return this.ufdLabel;
	}

	public void setUfdLabel(String ufdLabel) {
		this.ufdLabel = ufdLabel;
	}

	public String getUfdQadc01() {
		return this.ufdQadc01;
	}

	public void setUfdQadc01(String ufdQadc01) {
		this.ufdQadc01 = ufdQadc01;
	}

	public Double getOidUfdDet() {
		return this.oidUfdDet;
	}

	public void setOidUfdDet(Double oidUfdDet) {
		this.oidUfdDet = oidUfdDet;
	}

}