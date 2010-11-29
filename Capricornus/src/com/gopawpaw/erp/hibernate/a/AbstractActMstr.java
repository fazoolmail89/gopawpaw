package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractActMstr entity provides the base persistence definition of the
 * ActMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractActMstr implements java.io.Serializable {

	// Fields

	private ActMstrId id;
	private String actUser1;
	private String actUser2;
	private String actQadc01;
	private String actChargeType;
	private Integer actOrdMult;
	private Double oidActMstr;

	// Constructors

	/** default constructor */
	public AbstractActMstr() {
	}

	/** minimal constructor */
	public AbstractActMstr(ActMstrId id, Double oidActMstr) {
		this.id = id;
		this.oidActMstr = oidActMstr;
	}

	/** full constructor */
	public AbstractActMstr(ActMstrId id, String actUser1, String actUser2,
			String actQadc01, String actChargeType, Integer actOrdMult,
			Double oidActMstr) {
		this.id = id;
		this.actUser1 = actUser1;
		this.actUser2 = actUser2;
		this.actQadc01 = actQadc01;
		this.actChargeType = actChargeType;
		this.actOrdMult = actOrdMult;
		this.oidActMstr = oidActMstr;
	}

	// Property accessors

	public ActMstrId getId() {
		return this.id;
	}

	public void setId(ActMstrId id) {
		this.id = id;
	}

	public String getActUser1() {
		return this.actUser1;
	}

	public void setActUser1(String actUser1) {
		this.actUser1 = actUser1;
	}

	public String getActUser2() {
		return this.actUser2;
	}

	public void setActUser2(String actUser2) {
		this.actUser2 = actUser2;
	}

	public String getActQadc01() {
		return this.actQadc01;
	}

	public void setActQadc01(String actQadc01) {
		this.actQadc01 = actQadc01;
	}

	public String getActChargeType() {
		return this.actChargeType;
	}

	public void setActChargeType(String actChargeType) {
		this.actChargeType = actChargeType;
	}

	public Integer getActOrdMult() {
		return this.actOrdMult;
	}

	public void setActOrdMult(Integer actOrdMult) {
		this.actOrdMult = actOrdMult;
	}

	public Double getOidActMstr() {
		return this.oidActMstr;
	}

	public void setOidActMstr(Double oidActMstr) {
		this.oidActMstr = oidActMstr;
	}

}