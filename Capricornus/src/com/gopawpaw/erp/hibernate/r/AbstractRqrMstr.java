package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqrMstr entity provides the base persistence definition of the
 * RqrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqrMstr implements java.io.Serializable {

	// Fields

	private RqrMstrId id;
	private String rqrChr01;
	private String rqrChr02;
	private String rqrChr03;
	private String rqrChr04;
	private String rqrQadc01;
	private String rqrQadc02;
	private String rqrQadc03;
	private String rqrQadc04;
	private Double oidRqrMstr;

	// Constructors

	/** default constructor */
	public AbstractRqrMstr() {
	}

	/** minimal constructor */
	public AbstractRqrMstr(RqrMstrId id, Double oidRqrMstr) {
		this.id = id;
		this.oidRqrMstr = oidRqrMstr;
	}

	/** full constructor */
	public AbstractRqrMstr(RqrMstrId id, String rqrChr01, String rqrChr02,
			String rqrChr03, String rqrChr04, String rqrQadc01,
			String rqrQadc02, String rqrQadc03, String rqrQadc04,
			Double oidRqrMstr) {
		this.id = id;
		this.rqrChr01 = rqrChr01;
		this.rqrChr02 = rqrChr02;
		this.rqrChr03 = rqrChr03;
		this.rqrChr04 = rqrChr04;
		this.rqrQadc01 = rqrQadc01;
		this.rqrQadc02 = rqrQadc02;
		this.rqrQadc03 = rqrQadc03;
		this.rqrQadc04 = rqrQadc04;
		this.oidRqrMstr = oidRqrMstr;
	}

	// Property accessors

	public RqrMstrId getId() {
		return this.id;
	}

	public void setId(RqrMstrId id) {
		this.id = id;
	}

	public String getRqrChr01() {
		return this.rqrChr01;
	}

	public void setRqrChr01(String rqrChr01) {
		this.rqrChr01 = rqrChr01;
	}

	public String getRqrChr02() {
		return this.rqrChr02;
	}

	public void setRqrChr02(String rqrChr02) {
		this.rqrChr02 = rqrChr02;
	}

	public String getRqrChr03() {
		return this.rqrChr03;
	}

	public void setRqrChr03(String rqrChr03) {
		this.rqrChr03 = rqrChr03;
	}

	public String getRqrChr04() {
		return this.rqrChr04;
	}

	public void setRqrChr04(String rqrChr04) {
		this.rqrChr04 = rqrChr04;
	}

	public String getRqrQadc01() {
		return this.rqrQadc01;
	}

	public void setRqrQadc01(String rqrQadc01) {
		this.rqrQadc01 = rqrQadc01;
	}

	public String getRqrQadc02() {
		return this.rqrQadc02;
	}

	public void setRqrQadc02(String rqrQadc02) {
		this.rqrQadc02 = rqrQadc02;
	}

	public String getRqrQadc03() {
		return this.rqrQadc03;
	}

	public void setRqrQadc03(String rqrQadc03) {
		this.rqrQadc03 = rqrQadc03;
	}

	public String getRqrQadc04() {
		return this.rqrQadc04;
	}

	public void setRqrQadc04(String rqrQadc04) {
		this.rqrQadc04 = rqrQadc04;
	}

	public Double getOidRqrMstr() {
		return this.oidRqrMstr;
	}

	public void setOidRqrMstr(Double oidRqrMstr) {
		this.oidRqrMstr = oidRqrMstr;
	}

}