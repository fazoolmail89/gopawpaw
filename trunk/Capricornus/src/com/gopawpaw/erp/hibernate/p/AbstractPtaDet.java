package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPtaDet entity provides the base persistence definition of the PtaDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtaDet implements java.io.Serializable {

	// Fields

	private PtaDetId id;
	private String ptaAssocUm;
	private Double ptaAssocQty;
	private Double ptaNetPrice;
	private String ptaPriType;
	private Double ptaMinOrd;
	private Double ptaQtyMult;
	private Double ptaMaxQty;
	private Date ptaExpire;
	private String ptaUser1;
	private String ptaUser2;
	private String ptaQadc01;
	private String ptaQadc02;
	private Double ptaQadd01;
	private Double ptaQadd02;
	private Boolean ptaQadl01;
	private Date ptaDte01;
	private Date ptaDte02;
	private Double ptaDec01;
	private Double ptaDec02;
	private Boolean ptaLog01;
	private String ptaChr01;
	private String ptaChr02;
	private String ptaChr03;
	private String ptaChr04;
	private String ptaChr05;
	private String ptaChr06;
	private String ptaChr07;
	private String ptaChr08;
	private String ptaChr09;
	private String ptaChr10;
	private Integer ptaCmtindx;
	private Boolean ptaExtrec;
	private Double oidPtaDet;

	// Constructors

	/** default constructor */
	public AbstractPtaDet() {
	}

	/** minimal constructor */
	public AbstractPtaDet(PtaDetId id, Double oidPtaDet) {
		this.id = id;
		this.oidPtaDet = oidPtaDet;
	}

	/** full constructor */
	public AbstractPtaDet(PtaDetId id, String ptaAssocUm, Double ptaAssocQty,
			Double ptaNetPrice, String ptaPriType, Double ptaMinOrd,
			Double ptaQtyMult, Double ptaMaxQty, Date ptaExpire,
			String ptaUser1, String ptaUser2, String ptaQadc01,
			String ptaQadc02, Double ptaQadd01, Double ptaQadd02,
			Boolean ptaQadl01, Date ptaDte01, Date ptaDte02, Double ptaDec01,
			Double ptaDec02, Boolean ptaLog01, String ptaChr01,
			String ptaChr02, String ptaChr03, String ptaChr04, String ptaChr05,
			String ptaChr06, String ptaChr07, String ptaChr08, String ptaChr09,
			String ptaChr10, Integer ptaCmtindx, Boolean ptaExtrec,
			Double oidPtaDet) {
		this.id = id;
		this.ptaAssocUm = ptaAssocUm;
		this.ptaAssocQty = ptaAssocQty;
		this.ptaNetPrice = ptaNetPrice;
		this.ptaPriType = ptaPriType;
		this.ptaMinOrd = ptaMinOrd;
		this.ptaQtyMult = ptaQtyMult;
		this.ptaMaxQty = ptaMaxQty;
		this.ptaExpire = ptaExpire;
		this.ptaUser1 = ptaUser1;
		this.ptaUser2 = ptaUser2;
		this.ptaQadc01 = ptaQadc01;
		this.ptaQadc02 = ptaQadc02;
		this.ptaQadd01 = ptaQadd01;
		this.ptaQadd02 = ptaQadd02;
		this.ptaQadl01 = ptaQadl01;
		this.ptaDte01 = ptaDte01;
		this.ptaDte02 = ptaDte02;
		this.ptaDec01 = ptaDec01;
		this.ptaDec02 = ptaDec02;
		this.ptaLog01 = ptaLog01;
		this.ptaChr01 = ptaChr01;
		this.ptaChr02 = ptaChr02;
		this.ptaChr03 = ptaChr03;
		this.ptaChr04 = ptaChr04;
		this.ptaChr05 = ptaChr05;
		this.ptaChr06 = ptaChr06;
		this.ptaChr07 = ptaChr07;
		this.ptaChr08 = ptaChr08;
		this.ptaChr09 = ptaChr09;
		this.ptaChr10 = ptaChr10;
		this.ptaCmtindx = ptaCmtindx;
		this.ptaExtrec = ptaExtrec;
		this.oidPtaDet = oidPtaDet;
	}

	// Property accessors

	public PtaDetId getId() {
		return this.id;
	}

	public void setId(PtaDetId id) {
		this.id = id;
	}

	public String getPtaAssocUm() {
		return this.ptaAssocUm;
	}

	public void setPtaAssocUm(String ptaAssocUm) {
		this.ptaAssocUm = ptaAssocUm;
	}

	public Double getPtaAssocQty() {
		return this.ptaAssocQty;
	}

	public void setPtaAssocQty(Double ptaAssocQty) {
		this.ptaAssocQty = ptaAssocQty;
	}

	public Double getPtaNetPrice() {
		return this.ptaNetPrice;
	}

	public void setPtaNetPrice(Double ptaNetPrice) {
		this.ptaNetPrice = ptaNetPrice;
	}

	public String getPtaPriType() {
		return this.ptaPriType;
	}

	public void setPtaPriType(String ptaPriType) {
		this.ptaPriType = ptaPriType;
	}

	public Double getPtaMinOrd() {
		return this.ptaMinOrd;
	}

	public void setPtaMinOrd(Double ptaMinOrd) {
		this.ptaMinOrd = ptaMinOrd;
	}

	public Double getPtaQtyMult() {
		return this.ptaQtyMult;
	}

	public void setPtaQtyMult(Double ptaQtyMult) {
		this.ptaQtyMult = ptaQtyMult;
	}

	public Double getPtaMaxQty() {
		return this.ptaMaxQty;
	}

	public void setPtaMaxQty(Double ptaMaxQty) {
		this.ptaMaxQty = ptaMaxQty;
	}

	public Date getPtaExpire() {
		return this.ptaExpire;
	}

	public void setPtaExpire(Date ptaExpire) {
		this.ptaExpire = ptaExpire;
	}

	public String getPtaUser1() {
		return this.ptaUser1;
	}

	public void setPtaUser1(String ptaUser1) {
		this.ptaUser1 = ptaUser1;
	}

	public String getPtaUser2() {
		return this.ptaUser2;
	}

	public void setPtaUser2(String ptaUser2) {
		this.ptaUser2 = ptaUser2;
	}

	public String getPtaQadc01() {
		return this.ptaQadc01;
	}

	public void setPtaQadc01(String ptaQadc01) {
		this.ptaQadc01 = ptaQadc01;
	}

	public String getPtaQadc02() {
		return this.ptaQadc02;
	}

	public void setPtaQadc02(String ptaQadc02) {
		this.ptaQadc02 = ptaQadc02;
	}

	public Double getPtaQadd01() {
		return this.ptaQadd01;
	}

	public void setPtaQadd01(Double ptaQadd01) {
		this.ptaQadd01 = ptaQadd01;
	}

	public Double getPtaQadd02() {
		return this.ptaQadd02;
	}

	public void setPtaQadd02(Double ptaQadd02) {
		this.ptaQadd02 = ptaQadd02;
	}

	public Boolean getPtaQadl01() {
		return this.ptaQadl01;
	}

	public void setPtaQadl01(Boolean ptaQadl01) {
		this.ptaQadl01 = ptaQadl01;
	}

	public Date getPtaDte01() {
		return this.ptaDte01;
	}

	public void setPtaDte01(Date ptaDte01) {
		this.ptaDte01 = ptaDte01;
	}

	public Date getPtaDte02() {
		return this.ptaDte02;
	}

	public void setPtaDte02(Date ptaDte02) {
		this.ptaDte02 = ptaDte02;
	}

	public Double getPtaDec01() {
		return this.ptaDec01;
	}

	public void setPtaDec01(Double ptaDec01) {
		this.ptaDec01 = ptaDec01;
	}

	public Double getPtaDec02() {
		return this.ptaDec02;
	}

	public void setPtaDec02(Double ptaDec02) {
		this.ptaDec02 = ptaDec02;
	}

	public Boolean getPtaLog01() {
		return this.ptaLog01;
	}

	public void setPtaLog01(Boolean ptaLog01) {
		this.ptaLog01 = ptaLog01;
	}

	public String getPtaChr01() {
		return this.ptaChr01;
	}

	public void setPtaChr01(String ptaChr01) {
		this.ptaChr01 = ptaChr01;
	}

	public String getPtaChr02() {
		return this.ptaChr02;
	}

	public void setPtaChr02(String ptaChr02) {
		this.ptaChr02 = ptaChr02;
	}

	public String getPtaChr03() {
		return this.ptaChr03;
	}

	public void setPtaChr03(String ptaChr03) {
		this.ptaChr03 = ptaChr03;
	}

	public String getPtaChr04() {
		return this.ptaChr04;
	}

	public void setPtaChr04(String ptaChr04) {
		this.ptaChr04 = ptaChr04;
	}

	public String getPtaChr05() {
		return this.ptaChr05;
	}

	public void setPtaChr05(String ptaChr05) {
		this.ptaChr05 = ptaChr05;
	}

	public String getPtaChr06() {
		return this.ptaChr06;
	}

	public void setPtaChr06(String ptaChr06) {
		this.ptaChr06 = ptaChr06;
	}

	public String getPtaChr07() {
		return this.ptaChr07;
	}

	public void setPtaChr07(String ptaChr07) {
		this.ptaChr07 = ptaChr07;
	}

	public String getPtaChr08() {
		return this.ptaChr08;
	}

	public void setPtaChr08(String ptaChr08) {
		this.ptaChr08 = ptaChr08;
	}

	public String getPtaChr09() {
		return this.ptaChr09;
	}

	public void setPtaChr09(String ptaChr09) {
		this.ptaChr09 = ptaChr09;
	}

	public String getPtaChr10() {
		return this.ptaChr10;
	}

	public void setPtaChr10(String ptaChr10) {
		this.ptaChr10 = ptaChr10;
	}

	public Integer getPtaCmtindx() {
		return this.ptaCmtindx;
	}

	public void setPtaCmtindx(Integer ptaCmtindx) {
		this.ptaCmtindx = ptaCmtindx;
	}

	public Boolean getPtaExtrec() {
		return this.ptaExtrec;
	}

	public void setPtaExtrec(Boolean ptaExtrec) {
		this.ptaExtrec = ptaExtrec;
	}

	public Double getOidPtaDet() {
		return this.oidPtaDet;
	}

	public void setOidPtaDet(Double oidPtaDet) {
		this.oidPtaDet = oidPtaDet;
	}

}