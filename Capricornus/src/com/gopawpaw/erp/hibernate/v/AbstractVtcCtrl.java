package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVtcCtrl entity provides the base persistence definition of the
 * VtcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVtcCtrl implements java.io.Serializable {

	// Fields

	private Integer vtcIndex1;
	private String vtcVtClass;
	private Boolean vtcDisc;
	private String vtcUser1;
	private String vtcUser2;
	private String vtcRound;
	private Boolean vtcPmtDisc;
	private Boolean vtcValReg;
	private String vtcQadc01;
	private Double oidVtcCtrl;

	// Constructors

	/** default constructor */
	public AbstractVtcCtrl() {
	}

	/** minimal constructor */
	public AbstractVtcCtrl(Double oidVtcCtrl) {
		this.oidVtcCtrl = oidVtcCtrl;
	}

	/** full constructor */
	public AbstractVtcCtrl(String vtcVtClass, Boolean vtcDisc, String vtcUser1,
			String vtcUser2, String vtcRound, Boolean vtcPmtDisc,
			Boolean vtcValReg, String vtcQadc01, Double oidVtcCtrl) {
		this.vtcVtClass = vtcVtClass;
		this.vtcDisc = vtcDisc;
		this.vtcUser1 = vtcUser1;
		this.vtcUser2 = vtcUser2;
		this.vtcRound = vtcRound;
		this.vtcPmtDisc = vtcPmtDisc;
		this.vtcValReg = vtcValReg;
		this.vtcQadc01 = vtcQadc01;
		this.oidVtcCtrl = oidVtcCtrl;
	}

	// Property accessors

	public Integer getVtcIndex1() {
		return this.vtcIndex1;
	}

	public void setVtcIndex1(Integer vtcIndex1) {
		this.vtcIndex1 = vtcIndex1;
	}

	public String getVtcVtClass() {
		return this.vtcVtClass;
	}

	public void setVtcVtClass(String vtcVtClass) {
		this.vtcVtClass = vtcVtClass;
	}

	public Boolean getVtcDisc() {
		return this.vtcDisc;
	}

	public void setVtcDisc(Boolean vtcDisc) {
		this.vtcDisc = vtcDisc;
	}

	public String getVtcUser1() {
		return this.vtcUser1;
	}

	public void setVtcUser1(String vtcUser1) {
		this.vtcUser1 = vtcUser1;
	}

	public String getVtcUser2() {
		return this.vtcUser2;
	}

	public void setVtcUser2(String vtcUser2) {
		this.vtcUser2 = vtcUser2;
	}

	public String getVtcRound() {
		return this.vtcRound;
	}

	public void setVtcRound(String vtcRound) {
		this.vtcRound = vtcRound;
	}

	public Boolean getVtcPmtDisc() {
		return this.vtcPmtDisc;
	}

	public void setVtcPmtDisc(Boolean vtcPmtDisc) {
		this.vtcPmtDisc = vtcPmtDisc;
	}

	public Boolean getVtcValReg() {
		return this.vtcValReg;
	}

	public void setVtcValReg(Boolean vtcValReg) {
		this.vtcValReg = vtcValReg;
	}

	public String getVtcQadc01() {
		return this.vtcQadc01;
	}

	public void setVtcQadc01(String vtcQadc01) {
		this.vtcQadc01 = vtcQadc01;
	}

	public Double getOidVtcCtrl() {
		return this.oidVtcCtrl;
	}

	public void setOidVtcCtrl(Double oidVtcCtrl) {
		this.oidVtcCtrl = oidVtcCtrl;
	}

}