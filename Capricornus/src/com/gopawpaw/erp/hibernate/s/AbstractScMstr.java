package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractScMstr entity provides the base persistence definition of the ScMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractScMstr implements java.io.Serializable {

	// Fields

	private ScMstrId id;
	private String scDesc;
	private String scCategory;
	private String scUser1;
	private String scUser2;
	private String scQadc01;
	private Double oidScMstr;

	// Constructors

	/** default constructor */
	public AbstractScMstr() {
	}

	/** minimal constructor */
	public AbstractScMstr(ScMstrId id, Double oidScMstr) {
		this.id = id;
		this.oidScMstr = oidScMstr;
	}

	/** full constructor */
	public AbstractScMstr(ScMstrId id, String scDesc, String scCategory,
			String scUser1, String scUser2, String scQadc01, Double oidScMstr) {
		this.id = id;
		this.scDesc = scDesc;
		this.scCategory = scCategory;
		this.scUser1 = scUser1;
		this.scUser2 = scUser2;
		this.scQadc01 = scQadc01;
		this.oidScMstr = oidScMstr;
	}

	// Property accessors

	public ScMstrId getId() {
		return this.id;
	}

	public void setId(ScMstrId id) {
		this.id = id;
	}

	public String getScDesc() {
		return this.scDesc;
	}

	public void setScDesc(String scDesc) {
		this.scDesc = scDesc;
	}

	public String getScCategory() {
		return this.scCategory;
	}

	public void setScCategory(String scCategory) {
		this.scCategory = scCategory;
	}

	public String getScUser1() {
		return this.scUser1;
	}

	public void setScUser1(String scUser1) {
		this.scUser1 = scUser1;
	}

	public String getScUser2() {
		return this.scUser2;
	}

	public void setScUser2(String scUser2) {
		this.scUser2 = scUser2;
	}

	public String getScQadc01() {
		return this.scQadc01;
	}

	public void setScQadc01(String scQadc01) {
		this.scQadc01 = scQadc01;
	}

	public Double getOidScMstr() {
		return this.oidScMstr;
	}

	public void setOidScMstr(Double oidScMstr) {
		this.oidScMstr = oidScMstr;
	}

}