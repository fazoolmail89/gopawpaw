package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtqaDet entity provides the base persistence definition of the
 * PtqaDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtqaDet implements java.io.Serializable {

	// Fields

	private PtqaDetId id;
	private Double ptqaQty;
	private String ptqaUm;
	private Double ptqaInterval;
	private Double ptqaConfPct;
	private Integer ptqaCmtindx;
	private String ptqaUser1;
	private String ptqaUser2;
	private String ptqaChr01;
	private String ptqaChr02;
	private String ptqaChr03;
	private String ptqaChr04;
	private String ptqaChr05;
	private Double ptqaDec01;
	private Double ptqaDec02;
	private Boolean ptqaLog01;
	private Boolean ptqaLog02;
	private Double oidPtqaDet;

	// Constructors

	/** default constructor */
	public AbstractPtqaDet() {
	}

	/** minimal constructor */
	public AbstractPtqaDet(PtqaDetId id, Double oidPtqaDet) {
		this.id = id;
		this.oidPtqaDet = oidPtqaDet;
	}

	/** full constructor */
	public AbstractPtqaDet(PtqaDetId id, Double ptqaQty, String ptqaUm,
			Double ptqaInterval, Double ptqaConfPct, Integer ptqaCmtindx,
			String ptqaUser1, String ptqaUser2, String ptqaChr01,
			String ptqaChr02, String ptqaChr03, String ptqaChr04,
			String ptqaChr05, Double ptqaDec01, Double ptqaDec02,
			Boolean ptqaLog01, Boolean ptqaLog02, Double oidPtqaDet) {
		this.id = id;
		this.ptqaQty = ptqaQty;
		this.ptqaUm = ptqaUm;
		this.ptqaInterval = ptqaInterval;
		this.ptqaConfPct = ptqaConfPct;
		this.ptqaCmtindx = ptqaCmtindx;
		this.ptqaUser1 = ptqaUser1;
		this.ptqaUser2 = ptqaUser2;
		this.ptqaChr01 = ptqaChr01;
		this.ptqaChr02 = ptqaChr02;
		this.ptqaChr03 = ptqaChr03;
		this.ptqaChr04 = ptqaChr04;
		this.ptqaChr05 = ptqaChr05;
		this.ptqaDec01 = ptqaDec01;
		this.ptqaDec02 = ptqaDec02;
		this.ptqaLog01 = ptqaLog01;
		this.ptqaLog02 = ptqaLog02;
		this.oidPtqaDet = oidPtqaDet;
	}

	// Property accessors

	public PtqaDetId getId() {
		return this.id;
	}

	public void setId(PtqaDetId id) {
		this.id = id;
	}

	public Double getPtqaQty() {
		return this.ptqaQty;
	}

	public void setPtqaQty(Double ptqaQty) {
		this.ptqaQty = ptqaQty;
	}

	public String getPtqaUm() {
		return this.ptqaUm;
	}

	public void setPtqaUm(String ptqaUm) {
		this.ptqaUm = ptqaUm;
	}

	public Double getPtqaInterval() {
		return this.ptqaInterval;
	}

	public void setPtqaInterval(Double ptqaInterval) {
		this.ptqaInterval = ptqaInterval;
	}

	public Double getPtqaConfPct() {
		return this.ptqaConfPct;
	}

	public void setPtqaConfPct(Double ptqaConfPct) {
		this.ptqaConfPct = ptqaConfPct;
	}

	public Integer getPtqaCmtindx() {
		return this.ptqaCmtindx;
	}

	public void setPtqaCmtindx(Integer ptqaCmtindx) {
		this.ptqaCmtindx = ptqaCmtindx;
	}

	public String getPtqaUser1() {
		return this.ptqaUser1;
	}

	public void setPtqaUser1(String ptqaUser1) {
		this.ptqaUser1 = ptqaUser1;
	}

	public String getPtqaUser2() {
		return this.ptqaUser2;
	}

	public void setPtqaUser2(String ptqaUser2) {
		this.ptqaUser2 = ptqaUser2;
	}

	public String getPtqaChr01() {
		return this.ptqaChr01;
	}

	public void setPtqaChr01(String ptqaChr01) {
		this.ptqaChr01 = ptqaChr01;
	}

	public String getPtqaChr02() {
		return this.ptqaChr02;
	}

	public void setPtqaChr02(String ptqaChr02) {
		this.ptqaChr02 = ptqaChr02;
	}

	public String getPtqaChr03() {
		return this.ptqaChr03;
	}

	public void setPtqaChr03(String ptqaChr03) {
		this.ptqaChr03 = ptqaChr03;
	}

	public String getPtqaChr04() {
		return this.ptqaChr04;
	}

	public void setPtqaChr04(String ptqaChr04) {
		this.ptqaChr04 = ptqaChr04;
	}

	public String getPtqaChr05() {
		return this.ptqaChr05;
	}

	public void setPtqaChr05(String ptqaChr05) {
		this.ptqaChr05 = ptqaChr05;
	}

	public Double getPtqaDec01() {
		return this.ptqaDec01;
	}

	public void setPtqaDec01(Double ptqaDec01) {
		this.ptqaDec01 = ptqaDec01;
	}

	public Double getPtqaDec02() {
		return this.ptqaDec02;
	}

	public void setPtqaDec02(Double ptqaDec02) {
		this.ptqaDec02 = ptqaDec02;
	}

	public Boolean getPtqaLog01() {
		return this.ptqaLog01;
	}

	public void setPtqaLog01(Boolean ptqaLog01) {
		this.ptqaLog01 = ptqaLog01;
	}

	public Boolean getPtqaLog02() {
		return this.ptqaLog02;
	}

	public void setPtqaLog02(Boolean ptqaLog02) {
		this.ptqaLog02 = ptqaLog02;
	}

	public Double getOidPtqaDet() {
		return this.oidPtqaDet;
	}

	public void setOidPtqaDet(Double oidPtqaDet) {
		this.oidPtqaDet = oidPtqaDet;
	}

}