package com.gopawpaw.erp.hibernate.d;

/**
 * AbstractDyMstr entity provides the base persistence definition of the DyMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDyMstr implements java.io.Serializable {

	// Fields

	private DyMstrId id;
	private String dyDesc;
	private String dyType;
	private Integer dyNextPgdet;
	private Integer dyNextPgcen;
	private String dyLastEntdet;
	private String dyLastEntcen;
	private String dyUser1;
	private String dyUser2;
	private String dyQadc01;
	private Double oidDyMstr;

	// Constructors

	/** default constructor */
	public AbstractDyMstr() {
	}

	/** minimal constructor */
	public AbstractDyMstr(DyMstrId id, String dyDesc, String dyType,
			Integer dyNextPgdet, Integer dyNextPgcen, String dyLastEntdet,
			String dyLastEntcen, Double oidDyMstr) {
		this.id = id;
		this.dyDesc = dyDesc;
		this.dyType = dyType;
		this.dyNextPgdet = dyNextPgdet;
		this.dyNextPgcen = dyNextPgcen;
		this.dyLastEntdet = dyLastEntdet;
		this.dyLastEntcen = dyLastEntcen;
		this.oidDyMstr = oidDyMstr;
	}

	/** full constructor */
	public AbstractDyMstr(DyMstrId id, String dyDesc, String dyType,
			Integer dyNextPgdet, Integer dyNextPgcen, String dyLastEntdet,
			String dyLastEntcen, String dyUser1, String dyUser2,
			String dyQadc01, Double oidDyMstr) {
		this.id = id;
		this.dyDesc = dyDesc;
		this.dyType = dyType;
		this.dyNextPgdet = dyNextPgdet;
		this.dyNextPgcen = dyNextPgcen;
		this.dyLastEntdet = dyLastEntdet;
		this.dyLastEntcen = dyLastEntcen;
		this.dyUser1 = dyUser1;
		this.dyUser2 = dyUser2;
		this.dyQadc01 = dyQadc01;
		this.oidDyMstr = oidDyMstr;
	}

	// Property accessors

	public DyMstrId getId() {
		return this.id;
	}

	public void setId(DyMstrId id) {
		this.id = id;
	}

	public String getDyDesc() {
		return this.dyDesc;
	}

	public void setDyDesc(String dyDesc) {
		this.dyDesc = dyDesc;
	}

	public String getDyType() {
		return this.dyType;
	}

	public void setDyType(String dyType) {
		this.dyType = dyType;
	}

	public Integer getDyNextPgdet() {
		return this.dyNextPgdet;
	}

	public void setDyNextPgdet(Integer dyNextPgdet) {
		this.dyNextPgdet = dyNextPgdet;
	}

	public Integer getDyNextPgcen() {
		return this.dyNextPgcen;
	}

	public void setDyNextPgcen(Integer dyNextPgcen) {
		this.dyNextPgcen = dyNextPgcen;
	}

	public String getDyLastEntdet() {
		return this.dyLastEntdet;
	}

	public void setDyLastEntdet(String dyLastEntdet) {
		this.dyLastEntdet = dyLastEntdet;
	}

	public String getDyLastEntcen() {
		return this.dyLastEntcen;
	}

	public void setDyLastEntcen(String dyLastEntcen) {
		this.dyLastEntcen = dyLastEntcen;
	}

	public String getDyUser1() {
		return this.dyUser1;
	}

	public void setDyUser1(String dyUser1) {
		this.dyUser1 = dyUser1;
	}

	public String getDyUser2() {
		return this.dyUser2;
	}

	public void setDyUser2(String dyUser2) {
		this.dyUser2 = dyUser2;
	}

	public String getDyQadc01() {
		return this.dyQadc01;
	}

	public void setDyQadc01(String dyQadc01) {
		this.dyQadc01 = dyQadc01;
	}

	public Double getOidDyMstr() {
		return this.oidDyMstr;
	}

	public void setOidDyMstr(Double oidDyMstr) {
		this.oidDyMstr = oidDyMstr;
	}

}