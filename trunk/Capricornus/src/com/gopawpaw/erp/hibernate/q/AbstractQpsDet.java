package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQpsDet entity provides the base persistence definition of the QpsDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQpsDet implements java.io.Serializable {

	// Fields

	private QpsDetId id;
	private String qpsUser1;
	private Double qpsQty;
	private String qpsUser2;
	private String qpsChr01;
	private String qpsChr03;
	private String qpsChr04;
	private String qpsChr05;
	private Double qpsDec01;
	private Double qpsDec02;
	private Double qpsDec03;
	private Boolean qpsLog01;
	private Double oidQpsDet;

	// Constructors

	/** default constructor */
	public AbstractQpsDet() {
	}

	/** minimal constructor */
	public AbstractQpsDet(QpsDetId id, Double qpsQty, Double oidQpsDet) {
		this.id = id;
		this.qpsQty = qpsQty;
		this.oidQpsDet = oidQpsDet;
	}

	/** full constructor */
	public AbstractQpsDet(QpsDetId id, String qpsUser1, Double qpsQty,
			String qpsUser2, String qpsChr01, String qpsChr03, String qpsChr04,
			String qpsChr05, Double qpsDec01, Double qpsDec02, Double qpsDec03,
			Boolean qpsLog01, Double oidQpsDet) {
		this.id = id;
		this.qpsUser1 = qpsUser1;
		this.qpsQty = qpsQty;
		this.qpsUser2 = qpsUser2;
		this.qpsChr01 = qpsChr01;
		this.qpsChr03 = qpsChr03;
		this.qpsChr04 = qpsChr04;
		this.qpsChr05 = qpsChr05;
		this.qpsDec01 = qpsDec01;
		this.qpsDec02 = qpsDec02;
		this.qpsDec03 = qpsDec03;
		this.qpsLog01 = qpsLog01;
		this.oidQpsDet = oidQpsDet;
	}

	// Property accessors

	public QpsDetId getId() {
		return this.id;
	}

	public void setId(QpsDetId id) {
		this.id = id;
	}

	public String getQpsUser1() {
		return this.qpsUser1;
	}

	public void setQpsUser1(String qpsUser1) {
		this.qpsUser1 = qpsUser1;
	}

	public Double getQpsQty() {
		return this.qpsQty;
	}

	public void setQpsQty(Double qpsQty) {
		this.qpsQty = qpsQty;
	}

	public String getQpsUser2() {
		return this.qpsUser2;
	}

	public void setQpsUser2(String qpsUser2) {
		this.qpsUser2 = qpsUser2;
	}

	public String getQpsChr01() {
		return this.qpsChr01;
	}

	public void setQpsChr01(String qpsChr01) {
		this.qpsChr01 = qpsChr01;
	}

	public String getQpsChr03() {
		return this.qpsChr03;
	}

	public void setQpsChr03(String qpsChr03) {
		this.qpsChr03 = qpsChr03;
	}

	public String getQpsChr04() {
		return this.qpsChr04;
	}

	public void setQpsChr04(String qpsChr04) {
		this.qpsChr04 = qpsChr04;
	}

	public String getQpsChr05() {
		return this.qpsChr05;
	}

	public void setQpsChr05(String qpsChr05) {
		this.qpsChr05 = qpsChr05;
	}

	public Double getQpsDec01() {
		return this.qpsDec01;
	}

	public void setQpsDec01(Double qpsDec01) {
		this.qpsDec01 = qpsDec01;
	}

	public Double getQpsDec02() {
		return this.qpsDec02;
	}

	public void setQpsDec02(Double qpsDec02) {
		this.qpsDec02 = qpsDec02;
	}

	public Double getQpsDec03() {
		return this.qpsDec03;
	}

	public void setQpsDec03(Double qpsDec03) {
		this.qpsDec03 = qpsDec03;
	}

	public Boolean getQpsLog01() {
		return this.qpsLog01;
	}

	public void setQpsLog01(Boolean qpsLog01) {
		this.qpsLog01 = qpsLog01;
	}

	public Double getOidQpsDet() {
		return this.oidQpsDet;
	}

	public void setOidQpsDet(Double oidQpsDet) {
		this.oidQpsDet = oidQpsDet;
	}

}