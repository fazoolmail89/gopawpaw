package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqcMstr entity provides the base persistence definition of the
 * RqcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqcMstr implements java.io.Serializable {

	// Fields

	private RqcMstrId id;
	private String rqcDesc;
	private String rqcChr01;
	private String rqcChr02;
	private String rqcChr03;
	private String rqcChr04;
	private String rqcQadc01;
	private String rqcQadc02;
	private String rqcQadc03;
	private String rqcQadc04;
	private Double oidRqcMstr;

	// Constructors

	/** default constructor */
	public AbstractRqcMstr() {
	}

	/** minimal constructor */
	public AbstractRqcMstr(RqcMstrId id, Double oidRqcMstr) {
		this.id = id;
		this.oidRqcMstr = oidRqcMstr;
	}

	/** full constructor */
	public AbstractRqcMstr(RqcMstrId id, String rqcDesc, String rqcChr01,
			String rqcChr02, String rqcChr03, String rqcChr04,
			String rqcQadc01, String rqcQadc02, String rqcQadc03,
			String rqcQadc04, Double oidRqcMstr) {
		this.id = id;
		this.rqcDesc = rqcDesc;
		this.rqcChr01 = rqcChr01;
		this.rqcChr02 = rqcChr02;
		this.rqcChr03 = rqcChr03;
		this.rqcChr04 = rqcChr04;
		this.rqcQadc01 = rqcQadc01;
		this.rqcQadc02 = rqcQadc02;
		this.rqcQadc03 = rqcQadc03;
		this.rqcQadc04 = rqcQadc04;
		this.oidRqcMstr = oidRqcMstr;
	}

	// Property accessors

	public RqcMstrId getId() {
		return this.id;
	}

	public void setId(RqcMstrId id) {
		this.id = id;
	}

	public String getRqcDesc() {
		return this.rqcDesc;
	}

	public void setRqcDesc(String rqcDesc) {
		this.rqcDesc = rqcDesc;
	}

	public String getRqcChr01() {
		return this.rqcChr01;
	}

	public void setRqcChr01(String rqcChr01) {
		this.rqcChr01 = rqcChr01;
	}

	public String getRqcChr02() {
		return this.rqcChr02;
	}

	public void setRqcChr02(String rqcChr02) {
		this.rqcChr02 = rqcChr02;
	}

	public String getRqcChr03() {
		return this.rqcChr03;
	}

	public void setRqcChr03(String rqcChr03) {
		this.rqcChr03 = rqcChr03;
	}

	public String getRqcChr04() {
		return this.rqcChr04;
	}

	public void setRqcChr04(String rqcChr04) {
		this.rqcChr04 = rqcChr04;
	}

	public String getRqcQadc01() {
		return this.rqcQadc01;
	}

	public void setRqcQadc01(String rqcQadc01) {
		this.rqcQadc01 = rqcQadc01;
	}

	public String getRqcQadc02() {
		return this.rqcQadc02;
	}

	public void setRqcQadc02(String rqcQadc02) {
		this.rqcQadc02 = rqcQadc02;
	}

	public String getRqcQadc03() {
		return this.rqcQadc03;
	}

	public void setRqcQadc03(String rqcQadc03) {
		this.rqcQadc03 = rqcQadc03;
	}

	public String getRqcQadc04() {
		return this.rqcQadc04;
	}

	public void setRqcQadc04(String rqcQadc04) {
		this.rqcQadc04 = rqcQadc04;
	}

	public Double getOidRqcMstr() {
		return this.oidRqcMstr;
	}

	public void setOidRqcMstr(Double oidRqcMstr) {
		this.oidRqcMstr = oidRqcMstr;
	}

}