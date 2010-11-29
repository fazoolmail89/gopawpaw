package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSrcCtrl entity provides the base persistence definition of the
 * SrcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSrcCtrl implements java.io.Serializable {

	// Fields

	private String srcDomain;
	private Integer srcNbr;
	private String srcUser1;
	private String srcUser2;
	private Integer srcQadi01;
	private String srcQadc01;
	private Double oidSrcCtrl;

	// Constructors

	/** default constructor */
	public AbstractSrcCtrl() {
	}

	/** minimal constructor */
	public AbstractSrcCtrl(Double oidSrcCtrl) {
		this.oidSrcCtrl = oidSrcCtrl;
	}

	/** full constructor */
	public AbstractSrcCtrl(Integer srcNbr, String srcUser1, String srcUser2,
			Integer srcQadi01, String srcQadc01, Double oidSrcCtrl) {
		this.srcNbr = srcNbr;
		this.srcUser1 = srcUser1;
		this.srcUser2 = srcUser2;
		this.srcQadi01 = srcQadi01;
		this.srcQadc01 = srcQadc01;
		this.oidSrcCtrl = oidSrcCtrl;
	}

	// Property accessors

	public String getSrcDomain() {
		return this.srcDomain;
	}

	public void setSrcDomain(String srcDomain) {
		this.srcDomain = srcDomain;
	}

	public Integer getSrcNbr() {
		return this.srcNbr;
	}

	public void setSrcNbr(Integer srcNbr) {
		this.srcNbr = srcNbr;
	}

	public String getSrcUser1() {
		return this.srcUser1;
	}

	public void setSrcUser1(String srcUser1) {
		this.srcUser1 = srcUser1;
	}

	public String getSrcUser2() {
		return this.srcUser2;
	}

	public void setSrcUser2(String srcUser2) {
		this.srcUser2 = srcUser2;
	}

	public Integer getSrcQadi01() {
		return this.srcQadi01;
	}

	public void setSrcQadi01(Integer srcQadi01) {
		this.srcQadi01 = srcQadi01;
	}

	public String getSrcQadc01() {
		return this.srcQadc01;
	}

	public void setSrcQadc01(String srcQadc01) {
		this.srcQadc01 = srcQadc01;
	}

	public Double getOidSrcCtrl() {
		return this.oidSrcCtrl;
	}

	public void setOidSrcCtrl(Double oidSrcCtrl) {
		this.oidSrcCtrl = oidSrcCtrl;
	}

}