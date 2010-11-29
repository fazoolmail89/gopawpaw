package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLngMstr entity provides the base persistence definition of the
 * LngMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLngMstr implements java.io.Serializable {

	// Fields

	private String lngLang;
	private String lngDir;
	private Integer lngNbr;
	private String lngDesc;
	private String lngUser1;
	private String lngUser2;
	private String lngQad01;
	private String lngQad02;
	private Double oidLngMstr;

	// Constructors

	/** default constructor */
	public AbstractLngMstr() {
	}

	/** minimal constructor */
	public AbstractLngMstr(Double oidLngMstr) {
		this.oidLngMstr = oidLngMstr;
	}

	/** full constructor */
	public AbstractLngMstr(String lngDir, Integer lngNbr, String lngDesc,
			String lngUser1, String lngUser2, String lngQad01, String lngQad02,
			Double oidLngMstr) {
		this.lngDir = lngDir;
		this.lngNbr = lngNbr;
		this.lngDesc = lngDesc;
		this.lngUser1 = lngUser1;
		this.lngUser2 = lngUser2;
		this.lngQad01 = lngQad01;
		this.lngQad02 = lngQad02;
		this.oidLngMstr = oidLngMstr;
	}

	// Property accessors

	public String getLngLang() {
		return this.lngLang;
	}

	public void setLngLang(String lngLang) {
		this.lngLang = lngLang;
	}

	public String getLngDir() {
		return this.lngDir;
	}

	public void setLngDir(String lngDir) {
		this.lngDir = lngDir;
	}

	public Integer getLngNbr() {
		return this.lngNbr;
	}

	public void setLngNbr(Integer lngNbr) {
		this.lngNbr = lngNbr;
	}

	public String getLngDesc() {
		return this.lngDesc;
	}

	public void setLngDesc(String lngDesc) {
		this.lngDesc = lngDesc;
	}

	public String getLngUser1() {
		return this.lngUser1;
	}

	public void setLngUser1(String lngUser1) {
		this.lngUser1 = lngUser1;
	}

	public String getLngUser2() {
		return this.lngUser2;
	}

	public void setLngUser2(String lngUser2) {
		this.lngUser2 = lngUser2;
	}

	public String getLngQad01() {
		return this.lngQad01;
	}

	public void setLngQad01(String lngQad01) {
		this.lngQad01 = lngQad01;
	}

	public String getLngQad02() {
		return this.lngQad02;
	}

	public void setLngQad02(String lngQad02) {
		this.lngQad02 = lngQad02;
	}

	public Double getOidLngMstr() {
		return this.oidLngMstr;
	}

	public void setOidLngMstr(Double oidLngMstr) {
		this.oidLngMstr = oidLngMstr;
	}

}