package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqcdDet entity provides the base persistence definition of the
 * RqcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqcdDet implements java.io.Serializable {

	// Fields

	private RqcdDetId id;
	private String rqcdAcctTo;
	private String rqcdChr01;
	private String rqcdChr02;
	private String rqcdChr03;
	private String rqcdChr04;
	private String rqcdQadc01;
	private String rqcdQadc02;
	private String rqcdQadc03;
	private String rqcdQadc04;
	private String rqcdSubTo;
	private Double oidRqcdDet;

	// Constructors

	/** default constructor */
	public AbstractRqcdDet() {
	}

	/** minimal constructor */
	public AbstractRqcdDet(RqcdDetId id, Double oidRqcdDet) {
		this.id = id;
		this.oidRqcdDet = oidRqcdDet;
	}

	/** full constructor */
	public AbstractRqcdDet(RqcdDetId id, String rqcdAcctTo, String rqcdChr01,
			String rqcdChr02, String rqcdChr03, String rqcdChr04,
			String rqcdQadc01, String rqcdQadc02, String rqcdQadc03,
			String rqcdQadc04, String rqcdSubTo, Double oidRqcdDet) {
		this.id = id;
		this.rqcdAcctTo = rqcdAcctTo;
		this.rqcdChr01 = rqcdChr01;
		this.rqcdChr02 = rqcdChr02;
		this.rqcdChr03 = rqcdChr03;
		this.rqcdChr04 = rqcdChr04;
		this.rqcdQadc01 = rqcdQadc01;
		this.rqcdQadc02 = rqcdQadc02;
		this.rqcdQadc03 = rqcdQadc03;
		this.rqcdQadc04 = rqcdQadc04;
		this.rqcdSubTo = rqcdSubTo;
		this.oidRqcdDet = oidRqcdDet;
	}

	// Property accessors

	public RqcdDetId getId() {
		return this.id;
	}

	public void setId(RqcdDetId id) {
		this.id = id;
	}

	public String getRqcdAcctTo() {
		return this.rqcdAcctTo;
	}

	public void setRqcdAcctTo(String rqcdAcctTo) {
		this.rqcdAcctTo = rqcdAcctTo;
	}

	public String getRqcdChr01() {
		return this.rqcdChr01;
	}

	public void setRqcdChr01(String rqcdChr01) {
		this.rqcdChr01 = rqcdChr01;
	}

	public String getRqcdChr02() {
		return this.rqcdChr02;
	}

	public void setRqcdChr02(String rqcdChr02) {
		this.rqcdChr02 = rqcdChr02;
	}

	public String getRqcdChr03() {
		return this.rqcdChr03;
	}

	public void setRqcdChr03(String rqcdChr03) {
		this.rqcdChr03 = rqcdChr03;
	}

	public String getRqcdChr04() {
		return this.rqcdChr04;
	}

	public void setRqcdChr04(String rqcdChr04) {
		this.rqcdChr04 = rqcdChr04;
	}

	public String getRqcdQadc01() {
		return this.rqcdQadc01;
	}

	public void setRqcdQadc01(String rqcdQadc01) {
		this.rqcdQadc01 = rqcdQadc01;
	}

	public String getRqcdQadc02() {
		return this.rqcdQadc02;
	}

	public void setRqcdQadc02(String rqcdQadc02) {
		this.rqcdQadc02 = rqcdQadc02;
	}

	public String getRqcdQadc03() {
		return this.rqcdQadc03;
	}

	public void setRqcdQadc03(String rqcdQadc03) {
		this.rqcdQadc03 = rqcdQadc03;
	}

	public String getRqcdQadc04() {
		return this.rqcdQadc04;
	}

	public void setRqcdQadc04(String rqcdQadc04) {
		this.rqcdQadc04 = rqcdQadc04;
	}

	public String getRqcdSubTo() {
		return this.rqcdSubTo;
	}

	public void setRqcdSubTo(String rqcdSubTo) {
		this.rqcdSubTo = rqcdSubTo;
	}

	public Double getOidRqcdDet() {
		return this.oidRqcdDet;
	}

	public void setOidRqcdDet(Double oidRqcdDet) {
		this.oidRqcdDet = oidRqcdDet;
	}

}