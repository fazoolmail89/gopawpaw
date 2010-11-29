package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDrpCtrl entity provides the base persistence definition of the
 * DrpCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDrpCtrl implements java.io.Serializable {

	// Fields

	private String drpDomain;
	private Boolean drpAutoReq;
	private Integer drpQadi01;
	private Integer drpReqNbr;
	private String drpReqPre;
	private Boolean drpRcmmts;
	private String drpUser1;
	private String drpUser2;
	private Boolean drpAutoNbr;
	private Integer drpNbr;
	private String drpNbrPre;
	private Boolean drpDcmmts;
	private Boolean drpMrp;
	private String drpQadc01;
	private Double oidDrpCtrl;

	// Constructors

	/** default constructor */
	public AbstractDrpCtrl() {
	}

	/** minimal constructor */
	public AbstractDrpCtrl(Double oidDrpCtrl) {
		this.oidDrpCtrl = oidDrpCtrl;
	}

	/** full constructor */
	public AbstractDrpCtrl(Boolean drpAutoReq, Integer drpQadi01,
			Integer drpReqNbr, String drpReqPre, Boolean drpRcmmts,
			String drpUser1, String drpUser2, Boolean drpAutoNbr,
			Integer drpNbr, String drpNbrPre, Boolean drpDcmmts,
			Boolean drpMrp, String drpQadc01, Double oidDrpCtrl) {
		this.drpAutoReq = drpAutoReq;
		this.drpQadi01 = drpQadi01;
		this.drpReqNbr = drpReqNbr;
		this.drpReqPre = drpReqPre;
		this.drpRcmmts = drpRcmmts;
		this.drpUser1 = drpUser1;
		this.drpUser2 = drpUser2;
		this.drpAutoNbr = drpAutoNbr;
		this.drpNbr = drpNbr;
		this.drpNbrPre = drpNbrPre;
		this.drpDcmmts = drpDcmmts;
		this.drpMrp = drpMrp;
		this.drpQadc01 = drpQadc01;
		this.oidDrpCtrl = oidDrpCtrl;
	}

	// Property accessors

	public String getDrpDomain() {
		return this.drpDomain;
	}

	public void setDrpDomain(String drpDomain) {
		this.drpDomain = drpDomain;
	}

	public Boolean getDrpAutoReq() {
		return this.drpAutoReq;
	}

	public void setDrpAutoReq(Boolean drpAutoReq) {
		this.drpAutoReq = drpAutoReq;
	}

	public Integer getDrpQadi01() {
		return this.drpQadi01;
	}

	public void setDrpQadi01(Integer drpQadi01) {
		this.drpQadi01 = drpQadi01;
	}

	public Integer getDrpReqNbr() {
		return this.drpReqNbr;
	}

	public void setDrpReqNbr(Integer drpReqNbr) {
		this.drpReqNbr = drpReqNbr;
	}

	public String getDrpReqPre() {
		return this.drpReqPre;
	}

	public void setDrpReqPre(String drpReqPre) {
		this.drpReqPre = drpReqPre;
	}

	public Boolean getDrpRcmmts() {
		return this.drpRcmmts;
	}

	public void setDrpRcmmts(Boolean drpRcmmts) {
		this.drpRcmmts = drpRcmmts;
	}

	public String getDrpUser1() {
		return this.drpUser1;
	}

	public void setDrpUser1(String drpUser1) {
		this.drpUser1 = drpUser1;
	}

	public String getDrpUser2() {
		return this.drpUser2;
	}

	public void setDrpUser2(String drpUser2) {
		this.drpUser2 = drpUser2;
	}

	public Boolean getDrpAutoNbr() {
		return this.drpAutoNbr;
	}

	public void setDrpAutoNbr(Boolean drpAutoNbr) {
		this.drpAutoNbr = drpAutoNbr;
	}

	public Integer getDrpNbr() {
		return this.drpNbr;
	}

	public void setDrpNbr(Integer drpNbr) {
		this.drpNbr = drpNbr;
	}

	public String getDrpNbrPre() {
		return this.drpNbrPre;
	}

	public void setDrpNbrPre(String drpNbrPre) {
		this.drpNbrPre = drpNbrPre;
	}

	public Boolean getDrpDcmmts() {
		return this.drpDcmmts;
	}

	public void setDrpDcmmts(Boolean drpDcmmts) {
		this.drpDcmmts = drpDcmmts;
	}

	public Boolean getDrpMrp() {
		return this.drpMrp;
	}

	public void setDrpMrp(Boolean drpMrp) {
		this.drpMrp = drpMrp;
	}

	public String getDrpQadc01() {
		return this.drpQadc01;
	}

	public void setDrpQadc01(String drpQadc01) {
		this.drpQadc01 = drpQadc01;
	}

	public Double getOidDrpCtrl() {
		return this.oidDrpCtrl;
	}

	public void setOidDrpCtrl(Double oidDrpCtrl) {
		this.oidDrpCtrl = oidDrpCtrl;
	}

}