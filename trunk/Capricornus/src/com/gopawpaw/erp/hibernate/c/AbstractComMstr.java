package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractComMstr entity provides the base persistence definition of the
 * ComMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractComMstr implements java.io.Serializable {

	// Fields

	private ComMstrId id;
	private String comDesc;
	private Boolean comSuppl;
	private String comUom;
	private String comQad01;
	private String comQad02;
	private String comUser1;
	private String comUser2;
	private Boolean comQad03;
	private Boolean comLog01;
	private Double oidComMstr;

	// Constructors

	/** default constructor */
	public AbstractComMstr() {
	}

	/** minimal constructor */
	public AbstractComMstr(ComMstrId id, Boolean comSuppl, Double oidComMstr) {
		this.id = id;
		this.comSuppl = comSuppl;
		this.oidComMstr = oidComMstr;
	}

	/** full constructor */
	public AbstractComMstr(ComMstrId id, String comDesc, Boolean comSuppl,
			String comUom, String comQad01, String comQad02, String comUser1,
			String comUser2, Boolean comQad03, Boolean comLog01,
			Double oidComMstr) {
		this.id = id;
		this.comDesc = comDesc;
		this.comSuppl = comSuppl;
		this.comUom = comUom;
		this.comQad01 = comQad01;
		this.comQad02 = comQad02;
		this.comUser1 = comUser1;
		this.comUser2 = comUser2;
		this.comQad03 = comQad03;
		this.comLog01 = comLog01;
		this.oidComMstr = oidComMstr;
	}

	// Property accessors

	public ComMstrId getId() {
		return this.id;
	}

	public void setId(ComMstrId id) {
		this.id = id;
	}

	public String getComDesc() {
		return this.comDesc;
	}

	public void setComDesc(String comDesc) {
		this.comDesc = comDesc;
	}

	public Boolean getComSuppl() {
		return this.comSuppl;
	}

	public void setComSuppl(Boolean comSuppl) {
		this.comSuppl = comSuppl;
	}

	public String getComUom() {
		return this.comUom;
	}

	public void setComUom(String comUom) {
		this.comUom = comUom;
	}

	public String getComQad01() {
		return this.comQad01;
	}

	public void setComQad01(String comQad01) {
		this.comQad01 = comQad01;
	}

	public String getComQad02() {
		return this.comQad02;
	}

	public void setComQad02(String comQad02) {
		this.comQad02 = comQad02;
	}

	public String getComUser1() {
		return this.comUser1;
	}

	public void setComUser1(String comUser1) {
		this.comUser1 = comUser1;
	}

	public String getComUser2() {
		return this.comUser2;
	}

	public void setComUser2(String comUser2) {
		this.comUser2 = comUser2;
	}

	public Boolean getComQad03() {
		return this.comQad03;
	}

	public void setComQad03(Boolean comQad03) {
		this.comQad03 = comQad03;
	}

	public Boolean getComLog01() {
		return this.comLog01;
	}

	public void setComLog01(Boolean comLog01) {
		this.comLog01 = comLog01;
	}

	public Double getOidComMstr() {
		return this.oidComMstr;
	}

	public void setOidComMstr(Double oidComMstr) {
		this.oidComMstr = oidComMstr;
	}

}