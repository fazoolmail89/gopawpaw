package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSbMstr entity provides the base persistence definition of the SbMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbMstr implements java.io.Serializable {

	// Fields

	private SbMstrId id;
	private String sbDesc;
	private String sbUser1;
	private String sbUser2;
	private String sbQadc01;
	private Double oidSbMstr;

	// Constructors

	/** default constructor */
	public AbstractSbMstr() {
	}

	/** minimal constructor */
	public AbstractSbMstr(SbMstrId id, Double oidSbMstr) {
		this.id = id;
		this.oidSbMstr = oidSbMstr;
	}

	/** full constructor */
	public AbstractSbMstr(SbMstrId id, String sbDesc, String sbUser1,
			String sbUser2, String sbQadc01, Double oidSbMstr) {
		this.id = id;
		this.sbDesc = sbDesc;
		this.sbUser1 = sbUser1;
		this.sbUser2 = sbUser2;
		this.sbQadc01 = sbQadc01;
		this.oidSbMstr = oidSbMstr;
	}

	// Property accessors

	public SbMstrId getId() {
		return this.id;
	}

	public void setId(SbMstrId id) {
		this.id = id;
	}

	public String getSbDesc() {
		return this.sbDesc;
	}

	public void setSbDesc(String sbDesc) {
		this.sbDesc = sbDesc;
	}

	public String getSbUser1() {
		return this.sbUser1;
	}

	public void setSbUser1(String sbUser1) {
		this.sbUser1 = sbUser1;
	}

	public String getSbUser2() {
		return this.sbUser2;
	}

	public void setSbUser2(String sbUser2) {
		this.sbUser2 = sbUser2;
	}

	public String getSbQadc01() {
		return this.sbQadc01;
	}

	public void setSbQadc01(String sbQadc01) {
		this.sbQadc01 = sbQadc01;
	}

	public Double getOidSbMstr() {
		return this.oidSbMstr;
	}

	public void setOidSbMstr(Double oidSbMstr) {
		this.oidSbMstr = oidSbMstr;
	}

}