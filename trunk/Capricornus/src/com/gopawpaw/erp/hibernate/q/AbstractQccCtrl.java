package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQccCtrl entity provides the base persistence definition of the
 * QccCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQccCtrl implements java.io.Serializable {

	// Fields

	private String qccDomain;
	private String qccSite;
	private String qccInspect;
	private Integer qccQadi01;
	private Boolean qccWcmmts;
	private String qccUser1;
	private String qccUser2;
	private Boolean qccRcmmts;
	private Integer qccNbr;
	private Integer qccLot;
	private Boolean qccAutoNbr;
	private String qccQadc01;
	private Double oidQccCtrl;

	// Constructors

	/** default constructor */
	public AbstractQccCtrl() {
	}

	/** minimal constructor */
	public AbstractQccCtrl(Double oidQccCtrl) {
		this.oidQccCtrl = oidQccCtrl;
	}

	/** full constructor */
	public AbstractQccCtrl(String qccSite, String qccInspect,
			Integer qccQadi01, Boolean qccWcmmts, String qccUser1,
			String qccUser2, Boolean qccRcmmts, Integer qccNbr, Integer qccLot,
			Boolean qccAutoNbr, String qccQadc01, Double oidQccCtrl) {
		this.qccSite = qccSite;
		this.qccInspect = qccInspect;
		this.qccQadi01 = qccQadi01;
		this.qccWcmmts = qccWcmmts;
		this.qccUser1 = qccUser1;
		this.qccUser2 = qccUser2;
		this.qccRcmmts = qccRcmmts;
		this.qccNbr = qccNbr;
		this.qccLot = qccLot;
		this.qccAutoNbr = qccAutoNbr;
		this.qccQadc01 = qccQadc01;
		this.oidQccCtrl = oidQccCtrl;
	}

	// Property accessors

	public String getQccDomain() {
		return this.qccDomain;
	}

	public void setQccDomain(String qccDomain) {
		this.qccDomain = qccDomain;
	}

	public String getQccSite() {
		return this.qccSite;
	}

	public void setQccSite(String qccSite) {
		this.qccSite = qccSite;
	}

	public String getQccInspect() {
		return this.qccInspect;
	}

	public void setQccInspect(String qccInspect) {
		this.qccInspect = qccInspect;
	}

	public Integer getQccQadi01() {
		return this.qccQadi01;
	}

	public void setQccQadi01(Integer qccQadi01) {
		this.qccQadi01 = qccQadi01;
	}

	public Boolean getQccWcmmts() {
		return this.qccWcmmts;
	}

	public void setQccWcmmts(Boolean qccWcmmts) {
		this.qccWcmmts = qccWcmmts;
	}

	public String getQccUser1() {
		return this.qccUser1;
	}

	public void setQccUser1(String qccUser1) {
		this.qccUser1 = qccUser1;
	}

	public String getQccUser2() {
		return this.qccUser2;
	}

	public void setQccUser2(String qccUser2) {
		this.qccUser2 = qccUser2;
	}

	public Boolean getQccRcmmts() {
		return this.qccRcmmts;
	}

	public void setQccRcmmts(Boolean qccRcmmts) {
		this.qccRcmmts = qccRcmmts;
	}

	public Integer getQccNbr() {
		return this.qccNbr;
	}

	public void setQccNbr(Integer qccNbr) {
		this.qccNbr = qccNbr;
	}

	public Integer getQccLot() {
		return this.qccLot;
	}

	public void setQccLot(Integer qccLot) {
		this.qccLot = qccLot;
	}

	public Boolean getQccAutoNbr() {
		return this.qccAutoNbr;
	}

	public void setQccAutoNbr(Boolean qccAutoNbr) {
		this.qccAutoNbr = qccAutoNbr;
	}

	public String getQccQadc01() {
		return this.qccQadc01;
	}

	public void setQccQadc01(String qccQadc01) {
		this.qccQadc01 = qccQadc01;
	}

	public Double getOidQccCtrl() {
		return this.oidQccCtrl;
	}

	public void setOidQccCtrl(Double oidQccCtrl) {
		this.oidQccCtrl = oidQccCtrl;
	}

}