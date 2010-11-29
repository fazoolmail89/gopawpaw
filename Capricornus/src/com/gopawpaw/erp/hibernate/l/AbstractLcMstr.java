package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLcMstr entity provides the base persistence definition of the LcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLcMstr implements java.io.Serializable {

	// Fields

	private LcMstrId id;
	private String lcDesc;
	private String lcElement;
	private Boolean lcTaxable;
	private String lcTaxc;
	private String lcApportionMethod;
	private Boolean lcCloseAccruals;
	private String lcSupplier;
	private String lcModUserid;
	private Date lcModDate;
	private String lcUser1;
	private String lcUser2;
	private String lcQadc01;
	private String lcQadc02;
	private Double oidLcMstr;

	// Constructors

	/** default constructor */
	public AbstractLcMstr() {
	}

	/** full constructor */
	public AbstractLcMstr(LcMstrId id, String lcDesc, String lcElement,
			Boolean lcTaxable, String lcTaxc, String lcApportionMethod,
			Boolean lcCloseAccruals, String lcSupplier, String lcModUserid,
			Date lcModDate, String lcUser1, String lcUser2, String lcQadc01,
			String lcQadc02, Double oidLcMstr) {
		this.id = id;
		this.lcDesc = lcDesc;
		this.lcElement = lcElement;
		this.lcTaxable = lcTaxable;
		this.lcTaxc = lcTaxc;
		this.lcApportionMethod = lcApportionMethod;
		this.lcCloseAccruals = lcCloseAccruals;
		this.lcSupplier = lcSupplier;
		this.lcModUserid = lcModUserid;
		this.lcModDate = lcModDate;
		this.lcUser1 = lcUser1;
		this.lcUser2 = lcUser2;
		this.lcQadc01 = lcQadc01;
		this.lcQadc02 = lcQadc02;
		this.oidLcMstr = oidLcMstr;
	}

	// Property accessors

	public LcMstrId getId() {
		return this.id;
	}

	public void setId(LcMstrId id) {
		this.id = id;
	}

	public String getLcDesc() {
		return this.lcDesc;
	}

	public void setLcDesc(String lcDesc) {
		this.lcDesc = lcDesc;
	}

	public String getLcElement() {
		return this.lcElement;
	}

	public void setLcElement(String lcElement) {
		this.lcElement = lcElement;
	}

	public Boolean getLcTaxable() {
		return this.lcTaxable;
	}

	public void setLcTaxable(Boolean lcTaxable) {
		this.lcTaxable = lcTaxable;
	}

	public String getLcTaxc() {
		return this.lcTaxc;
	}

	public void setLcTaxc(String lcTaxc) {
		this.lcTaxc = lcTaxc;
	}

	public String getLcApportionMethod() {
		return this.lcApportionMethod;
	}

	public void setLcApportionMethod(String lcApportionMethod) {
		this.lcApportionMethod = lcApportionMethod;
	}

	public Boolean getLcCloseAccruals() {
		return this.lcCloseAccruals;
	}

	public void setLcCloseAccruals(Boolean lcCloseAccruals) {
		this.lcCloseAccruals = lcCloseAccruals;
	}

	public String getLcSupplier() {
		return this.lcSupplier;
	}

	public void setLcSupplier(String lcSupplier) {
		this.lcSupplier = lcSupplier;
	}

	public String getLcModUserid() {
		return this.lcModUserid;
	}

	public void setLcModUserid(String lcModUserid) {
		this.lcModUserid = lcModUserid;
	}

	public Date getLcModDate() {
		return this.lcModDate;
	}

	public void setLcModDate(Date lcModDate) {
		this.lcModDate = lcModDate;
	}

	public String getLcUser1() {
		return this.lcUser1;
	}

	public void setLcUser1(String lcUser1) {
		this.lcUser1 = lcUser1;
	}

	public String getLcUser2() {
		return this.lcUser2;
	}

	public void setLcUser2(String lcUser2) {
		this.lcUser2 = lcUser2;
	}

	public String getLcQadc01() {
		return this.lcQadc01;
	}

	public void setLcQadc01(String lcQadc01) {
		this.lcQadc01 = lcQadc01;
	}

	public String getLcQadc02() {
		return this.lcQadc02;
	}

	public void setLcQadc02(String lcQadc02) {
		this.lcQadc02 = lcQadc02;
	}

	public Double getOidLcMstr() {
		return this.oidLcMstr;
	}

	public void setOidLcMstr(Double oidLcMstr) {
		this.oidLcMstr = oidLcMstr;
	}

}