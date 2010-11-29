package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractExcMstr entity provides the base persistence definition of the
 * ExcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractExcMstr implements java.io.Serializable {

	// Fields

	private ExcMstrId id;
	private String excXcc;
	private String excXacType;
	private Boolean excXallCc;
	private String excUser1;
	private String excUser2;
	private String excQadc01;
	private Double oidExcMstr;

	// Constructors

	/** default constructor */
	public AbstractExcMstr() {
	}

	/** minimal constructor */
	public AbstractExcMstr(ExcMstrId id, Double oidExcMstr) {
		this.id = id;
		this.oidExcMstr = oidExcMstr;
	}

	/** full constructor */
	public AbstractExcMstr(ExcMstrId id, String excXcc, String excXacType,
			Boolean excXallCc, String excUser1, String excUser2,
			String excQadc01, Double oidExcMstr) {
		this.id = id;
		this.excXcc = excXcc;
		this.excXacType = excXacType;
		this.excXallCc = excXallCc;
		this.excUser1 = excUser1;
		this.excUser2 = excUser2;
		this.excQadc01 = excQadc01;
		this.oidExcMstr = oidExcMstr;
	}

	// Property accessors

	public ExcMstrId getId() {
		return this.id;
	}

	public void setId(ExcMstrId id) {
		this.id = id;
	}

	public String getExcXcc() {
		return this.excXcc;
	}

	public void setExcXcc(String excXcc) {
		this.excXcc = excXcc;
	}

	public String getExcXacType() {
		return this.excXacType;
	}

	public void setExcXacType(String excXacType) {
		this.excXacType = excXacType;
	}

	public Boolean getExcXallCc() {
		return this.excXallCc;
	}

	public void setExcXallCc(Boolean excXallCc) {
		this.excXallCc = excXallCc;
	}

	public String getExcUser1() {
		return this.excUser1;
	}

	public void setExcUser1(String excUser1) {
		this.excUser1 = excUser1;
	}

	public String getExcUser2() {
		return this.excUser2;
	}

	public void setExcUser2(String excUser2) {
		this.excUser2 = excUser2;
	}

	public String getExcQadc01() {
		return this.excQadc01;
	}

	public void setExcQadc01(String excQadc01) {
		this.excQadc01 = excQadc01;
	}

	public Double getOidExcMstr() {
		return this.oidExcMstr;
	}

	public void setOidExcMstr(Double oidExcMstr) {
		this.oidExcMstr = oidExcMstr;
	}

}