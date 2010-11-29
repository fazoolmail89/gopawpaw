package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCrcCtrl entity provides the base persistence definition of the
 * CrcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCrcCtrl implements java.io.Serializable {

	// Fields

	private String crcDomain;
	private Integer crcQadi01;
	private Integer crcNbr;
	private String crcUser1;
	private String crcUser2;
	private String crcQadc01;
	private Double oidCrcCtrl;

	// Constructors

	/** default constructor */
	public AbstractCrcCtrl() {
	}

	/** minimal constructor */
	public AbstractCrcCtrl(Double oidCrcCtrl) {
		this.oidCrcCtrl = oidCrcCtrl;
	}

	/** full constructor */
	public AbstractCrcCtrl(Integer crcQadi01, Integer crcNbr, String crcUser1,
			String crcUser2, String crcQadc01, Double oidCrcCtrl) {
		this.crcQadi01 = crcQadi01;
		this.crcNbr = crcNbr;
		this.crcUser1 = crcUser1;
		this.crcUser2 = crcUser2;
		this.crcQadc01 = crcQadc01;
		this.oidCrcCtrl = oidCrcCtrl;
	}

	// Property accessors

	public String getCrcDomain() {
		return this.crcDomain;
	}

	public void setCrcDomain(String crcDomain) {
		this.crcDomain = crcDomain;
	}

	public Integer getCrcQadi01() {
		return this.crcQadi01;
	}

	public void setCrcQadi01(Integer crcQadi01) {
		this.crcQadi01 = crcQadi01;
	}

	public Integer getCrcNbr() {
		return this.crcNbr;
	}

	public void setCrcNbr(Integer crcNbr) {
		this.crcNbr = crcNbr;
	}

	public String getCrcUser1() {
		return this.crcUser1;
	}

	public void setCrcUser1(String crcUser1) {
		this.crcUser1 = crcUser1;
	}

	public String getCrcUser2() {
		return this.crcUser2;
	}

	public void setCrcUser2(String crcUser2) {
		this.crcUser2 = crcUser2;
	}

	public String getCrcQadc01() {
		return this.crcQadc01;
	}

	public void setCrcQadc01(String crcQadc01) {
		this.crcQadc01 = crcQadc01;
	}

	public Double getOidCrcCtrl() {
		return this.oidCrcCtrl;
	}

	public void setOidCrcCtrl(Double oidCrcCtrl) {
		this.oidCrcCtrl = oidCrcCtrl;
	}

}