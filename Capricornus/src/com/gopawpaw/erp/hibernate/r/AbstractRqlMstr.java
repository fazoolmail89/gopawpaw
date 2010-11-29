package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqlMstr entity provides the base persistence definition of the
 * RqlMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqlMstr implements java.io.Serializable {

	// Fields

	private RqlMstrId id;
	private Double rqlAmt;
	private String rqlDesc;
	private String rqlChr01;
	private String rqlChr02;
	private String rqlChr03;
	private Double rqlDec01;
	private String rqlChr04;
	private String rqlQadc01;
	private String rqlQadc02;
	private String rqlQadc03;
	private String rqlQadc04;
	private Double oidRqlMstr;

	// Constructors

	/** default constructor */
	public AbstractRqlMstr() {
	}

	/** minimal constructor */
	public AbstractRqlMstr(RqlMstrId id, Double oidRqlMstr) {
		this.id = id;
		this.oidRqlMstr = oidRqlMstr;
	}

	/** full constructor */
	public AbstractRqlMstr(RqlMstrId id, Double rqlAmt, String rqlDesc,
			String rqlChr01, String rqlChr02, String rqlChr03, Double rqlDec01,
			String rqlChr04, String rqlQadc01, String rqlQadc02,
			String rqlQadc03, String rqlQadc04, Double oidRqlMstr) {
		this.id = id;
		this.rqlAmt = rqlAmt;
		this.rqlDesc = rqlDesc;
		this.rqlChr01 = rqlChr01;
		this.rqlChr02 = rqlChr02;
		this.rqlChr03 = rqlChr03;
		this.rqlDec01 = rqlDec01;
		this.rqlChr04 = rqlChr04;
		this.rqlQadc01 = rqlQadc01;
		this.rqlQadc02 = rqlQadc02;
		this.rqlQadc03 = rqlQadc03;
		this.rqlQadc04 = rqlQadc04;
		this.oidRqlMstr = oidRqlMstr;
	}

	// Property accessors

	public RqlMstrId getId() {
		return this.id;
	}

	public void setId(RqlMstrId id) {
		this.id = id;
	}

	public Double getRqlAmt() {
		return this.rqlAmt;
	}

	public void setRqlAmt(Double rqlAmt) {
		this.rqlAmt = rqlAmt;
	}

	public String getRqlDesc() {
		return this.rqlDesc;
	}

	public void setRqlDesc(String rqlDesc) {
		this.rqlDesc = rqlDesc;
	}

	public String getRqlChr01() {
		return this.rqlChr01;
	}

	public void setRqlChr01(String rqlChr01) {
		this.rqlChr01 = rqlChr01;
	}

	public String getRqlChr02() {
		return this.rqlChr02;
	}

	public void setRqlChr02(String rqlChr02) {
		this.rqlChr02 = rqlChr02;
	}

	public String getRqlChr03() {
		return this.rqlChr03;
	}

	public void setRqlChr03(String rqlChr03) {
		this.rqlChr03 = rqlChr03;
	}

	public Double getRqlDec01() {
		return this.rqlDec01;
	}

	public void setRqlDec01(Double rqlDec01) {
		this.rqlDec01 = rqlDec01;
	}

	public String getRqlChr04() {
		return this.rqlChr04;
	}

	public void setRqlChr04(String rqlChr04) {
		this.rqlChr04 = rqlChr04;
	}

	public String getRqlQadc01() {
		return this.rqlQadc01;
	}

	public void setRqlQadc01(String rqlQadc01) {
		this.rqlQadc01 = rqlQadc01;
	}

	public String getRqlQadc02() {
		return this.rqlQadc02;
	}

	public void setRqlQadc02(String rqlQadc02) {
		this.rqlQadc02 = rqlQadc02;
	}

	public String getRqlQadc03() {
		return this.rqlQadc03;
	}

	public void setRqlQadc03(String rqlQadc03) {
		this.rqlQadc03 = rqlQadc03;
	}

	public String getRqlQadc04() {
		return this.rqlQadc04;
	}

	public void setRqlQadc04(String rqlQadc04) {
		this.rqlQadc04 = rqlQadc04;
	}

	public Double getOidRqlMstr() {
		return this.oidRqlMstr;
	}

	public void setOidRqlMstr(Double oidRqlMstr) {
		this.oidRqlMstr = oidRqlMstr;
	}

}