package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAscMstr entity provides the base persistence definition of the
 * AscMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAscMstr implements java.io.Serializable {

	// Fields

	private AscMstrId id;
	private String ascDesc;
	private String ascUser1;
	private String ascUser2;
	private Integer ascFpos;
	private String ascQadc01;
	private Double oidAscMstr;

	// Constructors

	/** default constructor */
	public AbstractAscMstr() {
	}

	/** minimal constructor */
	public AbstractAscMstr(AscMstrId id, Double oidAscMstr) {
		this.id = id;
		this.oidAscMstr = oidAscMstr;
	}

	/** full constructor */
	public AbstractAscMstr(AscMstrId id, String ascDesc, String ascUser1,
			String ascUser2, Integer ascFpos, String ascQadc01,
			Double oidAscMstr) {
		this.id = id;
		this.ascDesc = ascDesc;
		this.ascUser1 = ascUser1;
		this.ascUser2 = ascUser2;
		this.ascFpos = ascFpos;
		this.ascQadc01 = ascQadc01;
		this.oidAscMstr = oidAscMstr;
	}

	// Property accessors

	public AscMstrId getId() {
		return this.id;
	}

	public void setId(AscMstrId id) {
		this.id = id;
	}

	public String getAscDesc() {
		return this.ascDesc;
	}

	public void setAscDesc(String ascDesc) {
		this.ascDesc = ascDesc;
	}

	public String getAscUser1() {
		return this.ascUser1;
	}

	public void setAscUser1(String ascUser1) {
		this.ascUser1 = ascUser1;
	}

	public String getAscUser2() {
		return this.ascUser2;
	}

	public void setAscUser2(String ascUser2) {
		this.ascUser2 = ascUser2;
	}

	public Integer getAscFpos() {
		return this.ascFpos;
	}

	public void setAscFpos(Integer ascFpos) {
		this.ascFpos = ascFpos;
	}

	public String getAscQadc01() {
		return this.ascQadc01;
	}

	public void setAscQadc01(String ascQadc01) {
		this.ascQadc01 = ascQadc01;
	}

	public Double getOidAscMstr() {
		return this.oidAscMstr;
	}

	public void setOidAscMstr(Double oidAscMstr) {
		this.oidAscMstr = oidAscMstr;
	}

}