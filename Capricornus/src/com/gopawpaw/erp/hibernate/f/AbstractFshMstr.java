package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFshMstr entity provides the base persistence definition of the
 * FshMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFshMstr implements java.io.Serializable {

	// Fields

	private FshMstrId id;
	private String fshDesc;
	private Boolean fshCovered;
	private String fshUser1;
	private String fshUser2;
	private String fshQadc01;
	private Double oidFshMstr;

	// Constructors

	/** default constructor */
	public AbstractFshMstr() {
	}

	/** minimal constructor */
	public AbstractFshMstr(FshMstrId id, Double oidFshMstr) {
		this.id = id;
		this.oidFshMstr = oidFshMstr;
	}

	/** full constructor */
	public AbstractFshMstr(FshMstrId id, String fshDesc, Boolean fshCovered,
			String fshUser1, String fshUser2, String fshQadc01,
			Double oidFshMstr) {
		this.id = id;
		this.fshDesc = fshDesc;
		this.fshCovered = fshCovered;
		this.fshUser1 = fshUser1;
		this.fshUser2 = fshUser2;
		this.fshQadc01 = fshQadc01;
		this.oidFshMstr = oidFshMstr;
	}

	// Property accessors

	public FshMstrId getId() {
		return this.id;
	}

	public void setId(FshMstrId id) {
		this.id = id;
	}

	public String getFshDesc() {
		return this.fshDesc;
	}

	public void setFshDesc(String fshDesc) {
		this.fshDesc = fshDesc;
	}

	public Boolean getFshCovered() {
		return this.fshCovered;
	}

	public void setFshCovered(Boolean fshCovered) {
		this.fshCovered = fshCovered;
	}

	public String getFshUser1() {
		return this.fshUser1;
	}

	public void setFshUser1(String fshUser1) {
		this.fshUser1 = fshUser1;
	}

	public String getFshUser2() {
		return this.fshUser2;
	}

	public void setFshUser2(String fshUser2) {
		this.fshUser2 = fshUser2;
	}

	public String getFshQadc01() {
		return this.fshQadc01;
	}

	public void setFshQadc01(String fshQadc01) {
		this.fshQadc01 = fshQadc01;
	}

	public Double getOidFshMstr() {
		return this.oidFshMstr;
	}

	public void setOidFshMstr(Double oidFshMstr) {
		this.oidFshMstr = oidFshMstr;
	}

}