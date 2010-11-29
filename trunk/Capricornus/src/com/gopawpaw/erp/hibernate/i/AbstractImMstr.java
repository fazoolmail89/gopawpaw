package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractImMstr entity provides the base persistence definition of the ImMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImMstr implements java.io.Serializable {

	// Fields

	private ImMstrId id;
	private String imDesc;
	private String imTrType;
	private String imUser1;
	private String imUser2;
	private String imQadc01;
	private String imUnplannedAcct;
	private String imUnplannedSub;
	private String imUnplannedCc;
	private Double oidImMstr;

	// Constructors

	/** default constructor */
	public AbstractImMstr() {
	}

	/** minimal constructor */
	public AbstractImMstr(ImMstrId id, String imDesc, String imTrType,
			String imUnplannedAcct, String imUnplannedSub,
			String imUnplannedCc, Double oidImMstr) {
		this.id = id;
		this.imDesc = imDesc;
		this.imTrType = imTrType;
		this.imUnplannedAcct = imUnplannedAcct;
		this.imUnplannedSub = imUnplannedSub;
		this.imUnplannedCc = imUnplannedCc;
		this.oidImMstr = oidImMstr;
	}

	/** full constructor */
	public AbstractImMstr(ImMstrId id, String imDesc, String imTrType,
			String imUser1, String imUser2, String imQadc01,
			String imUnplannedAcct, String imUnplannedSub,
			String imUnplannedCc, Double oidImMstr) {
		this.id = id;
		this.imDesc = imDesc;
		this.imTrType = imTrType;
		this.imUser1 = imUser1;
		this.imUser2 = imUser2;
		this.imQadc01 = imQadc01;
		this.imUnplannedAcct = imUnplannedAcct;
		this.imUnplannedSub = imUnplannedSub;
		this.imUnplannedCc = imUnplannedCc;
		this.oidImMstr = oidImMstr;
	}

	// Property accessors

	public ImMstrId getId() {
		return this.id;
	}

	public void setId(ImMstrId id) {
		this.id = id;
	}

	public String getImDesc() {
		return this.imDesc;
	}

	public void setImDesc(String imDesc) {
		this.imDesc = imDesc;
	}

	public String getImTrType() {
		return this.imTrType;
	}

	public void setImTrType(String imTrType) {
		this.imTrType = imTrType;
	}

	public String getImUser1() {
		return this.imUser1;
	}

	public void setImUser1(String imUser1) {
		this.imUser1 = imUser1;
	}

	public String getImUser2() {
		return this.imUser2;
	}

	public void setImUser2(String imUser2) {
		this.imUser2 = imUser2;
	}

	public String getImQadc01() {
		return this.imQadc01;
	}

	public void setImQadc01(String imQadc01) {
		this.imQadc01 = imQadc01;
	}

	public String getImUnplannedAcct() {
		return this.imUnplannedAcct;
	}

	public void setImUnplannedAcct(String imUnplannedAcct) {
		this.imUnplannedAcct = imUnplannedAcct;
	}

	public String getImUnplannedSub() {
		return this.imUnplannedSub;
	}

	public void setImUnplannedSub(String imUnplannedSub) {
		this.imUnplannedSub = imUnplannedSub;
	}

	public String getImUnplannedCc() {
		return this.imUnplannedCc;
	}

	public void setImUnplannedCc(String imUnplannedCc) {
		this.imUnplannedCc = imUnplannedCc;
	}

	public Double getOidImMstr() {
		return this.oidImMstr;
	}

	public void setOidImMstr(Double oidImMstr) {
		this.oidImMstr = oidImMstr;
	}

}