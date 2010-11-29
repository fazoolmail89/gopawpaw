package com.gopawpaw.erp.hibernate.t;

/**
 * AbstractTrglDet entity provides the base persistence definition of the
 * TrglDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTrglDet implements java.io.Serializable {

	// Fields

	private TrglDetId id;
	private String trglCrAcct;
	private String trglCrCc;
	private String trglDrAcct;
	private String trglDrCc;
	private Double trglGlAmt;
	private String trglType;
	private String trglCrProj;
	private String trglDrProj;
	private Integer trglCrLine;
	private Integer trglDrLine;
	private String trglUser1;
	private String trglUser2;
	private String trglQadc01;
	private String trglDyCode;
	private String trglDyNum;
	private String trglCrSub;
	private String trglDrSub;
	private Double oidTrglDet;

	// Constructors

	/** default constructor */
	public AbstractTrglDet() {
	}

	/** minimal constructor */
	public AbstractTrglDet(TrglDetId id, String trglDyCode, String trglDyNum,
			Double oidTrglDet) {
		this.id = id;
		this.trglDyCode = trglDyCode;
		this.trglDyNum = trglDyNum;
		this.oidTrglDet = oidTrglDet;
	}

	/** full constructor */
	public AbstractTrglDet(TrglDetId id, String trglCrAcct, String trglCrCc,
			String trglDrAcct, String trglDrCc, Double trglGlAmt,
			String trglType, String trglCrProj, String trglDrProj,
			Integer trglCrLine, Integer trglDrLine, String trglUser1,
			String trglUser2, String trglQadc01, String trglDyCode,
			String trglDyNum, String trglCrSub, String trglDrSub,
			Double oidTrglDet) {
		this.id = id;
		this.trglCrAcct = trglCrAcct;
		this.trglCrCc = trglCrCc;
		this.trglDrAcct = trglDrAcct;
		this.trglDrCc = trglDrCc;
		this.trglGlAmt = trglGlAmt;
		this.trglType = trglType;
		this.trglCrProj = trglCrProj;
		this.trglDrProj = trglDrProj;
		this.trglCrLine = trglCrLine;
		this.trglDrLine = trglDrLine;
		this.trglUser1 = trglUser1;
		this.trglUser2 = trglUser2;
		this.trglQadc01 = trglQadc01;
		this.trglDyCode = trglDyCode;
		this.trglDyNum = trglDyNum;
		this.trglCrSub = trglCrSub;
		this.trglDrSub = trglDrSub;
		this.oidTrglDet = oidTrglDet;
	}

	// Property accessors

	public TrglDetId getId() {
		return this.id;
	}

	public void setId(TrglDetId id) {
		this.id = id;
	}

	public String getTrglCrAcct() {
		return this.trglCrAcct;
	}

	public void setTrglCrAcct(String trglCrAcct) {
		this.trglCrAcct = trglCrAcct;
	}

	public String getTrglCrCc() {
		return this.trglCrCc;
	}

	public void setTrglCrCc(String trglCrCc) {
		this.trglCrCc = trglCrCc;
	}

	public String getTrglDrAcct() {
		return this.trglDrAcct;
	}

	public void setTrglDrAcct(String trglDrAcct) {
		this.trglDrAcct = trglDrAcct;
	}

	public String getTrglDrCc() {
		return this.trglDrCc;
	}

	public void setTrglDrCc(String trglDrCc) {
		this.trglDrCc = trglDrCc;
	}

	public Double getTrglGlAmt() {
		return this.trglGlAmt;
	}

	public void setTrglGlAmt(Double trglGlAmt) {
		this.trglGlAmt = trglGlAmt;
	}

	public String getTrglType() {
		return this.trglType;
	}

	public void setTrglType(String trglType) {
		this.trglType = trglType;
	}

	public String getTrglCrProj() {
		return this.trglCrProj;
	}

	public void setTrglCrProj(String trglCrProj) {
		this.trglCrProj = trglCrProj;
	}

	public String getTrglDrProj() {
		return this.trglDrProj;
	}

	public void setTrglDrProj(String trglDrProj) {
		this.trglDrProj = trglDrProj;
	}

	public Integer getTrglCrLine() {
		return this.trglCrLine;
	}

	public void setTrglCrLine(Integer trglCrLine) {
		this.trglCrLine = trglCrLine;
	}

	public Integer getTrglDrLine() {
		return this.trglDrLine;
	}

	public void setTrglDrLine(Integer trglDrLine) {
		this.trglDrLine = trglDrLine;
	}

	public String getTrglUser1() {
		return this.trglUser1;
	}

	public void setTrglUser1(String trglUser1) {
		this.trglUser1 = trglUser1;
	}

	public String getTrglUser2() {
		return this.trglUser2;
	}

	public void setTrglUser2(String trglUser2) {
		this.trglUser2 = trglUser2;
	}

	public String getTrglQadc01() {
		return this.trglQadc01;
	}

	public void setTrglQadc01(String trglQadc01) {
		this.trglQadc01 = trglQadc01;
	}

	public String getTrglDyCode() {
		return this.trglDyCode;
	}

	public void setTrglDyCode(String trglDyCode) {
		this.trglDyCode = trglDyCode;
	}

	public String getTrglDyNum() {
		return this.trglDyNum;
	}

	public void setTrglDyNum(String trglDyNum) {
		this.trglDyNum = trglDyNum;
	}

	public String getTrglCrSub() {
		return this.trglCrSub;
	}

	public void setTrglCrSub(String trglCrSub) {
		this.trglCrSub = trglCrSub;
	}

	public String getTrglDrSub() {
		return this.trglDrSub;
	}

	public void setTrglDrSub(String trglDrSub) {
		this.trglDrSub = trglDrSub;
	}

	public Double getOidTrglDet() {
		return this.oidTrglDet;
	}

	public void setOidTrglDet(Double oidTrglDet) {
		this.oidTrglDet = oidTrglDet;
	}

}