package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrigMtx entity provides the base persistence definition of the
 * GrigMtx entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrigMtx implements java.io.Serializable {

	// Fields

	private GrigMtxId id;
	private Double grigAmt;
	private String grigAmtTxt;
	private Boolean grigPrint;
	private String grigType;
	private String grigUser1;
	private String grigUser2;
	private String grigQadc01;
	private Double oidGrigMtx;

	// Constructors

	/** default constructor */
	public AbstractGrigMtx() {
	}

	/** minimal constructor */
	public AbstractGrigMtx(GrigMtxId id, Double oidGrigMtx) {
		this.id = id;
		this.oidGrigMtx = oidGrigMtx;
	}

	/** full constructor */
	public AbstractGrigMtx(GrigMtxId id, Double grigAmt, String grigAmtTxt,
			Boolean grigPrint, String grigType, String grigUser1,
			String grigUser2, String grigQadc01, Double oidGrigMtx) {
		this.id = id;
		this.grigAmt = grigAmt;
		this.grigAmtTxt = grigAmtTxt;
		this.grigPrint = grigPrint;
		this.grigType = grigType;
		this.grigUser1 = grigUser1;
		this.grigUser2 = grigUser2;
		this.grigQadc01 = grigQadc01;
		this.oidGrigMtx = oidGrigMtx;
	}

	// Property accessors

	public GrigMtxId getId() {
		return this.id;
	}

	public void setId(GrigMtxId id) {
		this.id = id;
	}

	public Double getGrigAmt() {
		return this.grigAmt;
	}

	public void setGrigAmt(Double grigAmt) {
		this.grigAmt = grigAmt;
	}

	public String getGrigAmtTxt() {
		return this.grigAmtTxt;
	}

	public void setGrigAmtTxt(String grigAmtTxt) {
		this.grigAmtTxt = grigAmtTxt;
	}

	public Boolean getGrigPrint() {
		return this.grigPrint;
	}

	public void setGrigPrint(Boolean grigPrint) {
		this.grigPrint = grigPrint;
	}

	public String getGrigType() {
		return this.grigType;
	}

	public void setGrigType(String grigType) {
		this.grigType = grigType;
	}

	public String getGrigUser1() {
		return this.grigUser1;
	}

	public void setGrigUser1(String grigUser1) {
		this.grigUser1 = grigUser1;
	}

	public String getGrigUser2() {
		return this.grigUser2;
	}

	public void setGrigUser2(String grigUser2) {
		this.grigUser2 = grigUser2;
	}

	public String getGrigQadc01() {
		return this.grigQadc01;
	}

	public void setGrigQadc01(String grigQadc01) {
		this.grigQadc01 = grigQadc01;
	}

	public Double getOidGrigMtx() {
		return this.oidGrigMtx;
	}

	public void setOidGrigMtx(Double oidGrigMtx) {
		this.oidGrigMtx = oidGrigMtx;
	}

}