package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMphHist entity provides the base persistence definition of the
 * MphHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMphHist implements java.io.Serializable {

	// Fields

	private MphHistId id;
	private String mphProcedure;
	private Date mphDate;
	private Integer mphCmtindx;
	private String mphRsult;
	private Integer mphOpTrnbr;
	private String mphMch;
	private String mphWrNbr;
	private Boolean mphPass;
	private String mphUser1;
	private String mphUser2;
	private String mphChr01;
	private String mphChr02;
	private String mphChr03;
	private String mphChr04;
	private String mphChr05;
	private Double mphDec01;
	private Double mphDec02;
	private String mphTestmthd;
	private String mphAttribute;
	private Double oidMphHist;

	// Constructors

	/** default constructor */
	public AbstractMphHist() {
	}

	/** minimal constructor */
	public AbstractMphHist(MphHistId id, String mphProcedure, Date mphDate,
			Integer mphOpTrnbr, Double oidMphHist) {
		this.id = id;
		this.mphProcedure = mphProcedure;
		this.mphDate = mphDate;
		this.mphOpTrnbr = mphOpTrnbr;
		this.oidMphHist = oidMphHist;
	}

	/** full constructor */
	public AbstractMphHist(MphHistId id, String mphProcedure, Date mphDate,
			Integer mphCmtindx, String mphRsult, Integer mphOpTrnbr,
			String mphMch, String mphWrNbr, Boolean mphPass, String mphUser1,
			String mphUser2, String mphChr01, String mphChr02, String mphChr03,
			String mphChr04, String mphChr05, Double mphDec01, Double mphDec02,
			String mphTestmthd, String mphAttribute, Double oidMphHist) {
		this.id = id;
		this.mphProcedure = mphProcedure;
		this.mphDate = mphDate;
		this.mphCmtindx = mphCmtindx;
		this.mphRsult = mphRsult;
		this.mphOpTrnbr = mphOpTrnbr;
		this.mphMch = mphMch;
		this.mphWrNbr = mphWrNbr;
		this.mphPass = mphPass;
		this.mphUser1 = mphUser1;
		this.mphUser2 = mphUser2;
		this.mphChr01 = mphChr01;
		this.mphChr02 = mphChr02;
		this.mphChr03 = mphChr03;
		this.mphChr04 = mphChr04;
		this.mphChr05 = mphChr05;
		this.mphDec01 = mphDec01;
		this.mphDec02 = mphDec02;
		this.mphTestmthd = mphTestmthd;
		this.mphAttribute = mphAttribute;
		this.oidMphHist = oidMphHist;
	}

	// Property accessors

	public MphHistId getId() {
		return this.id;
	}

	public void setId(MphHistId id) {
		this.id = id;
	}

	public String getMphProcedure() {
		return this.mphProcedure;
	}

	public void setMphProcedure(String mphProcedure) {
		this.mphProcedure = mphProcedure;
	}

	public Date getMphDate() {
		return this.mphDate;
	}

	public void setMphDate(Date mphDate) {
		this.mphDate = mphDate;
	}

	public Integer getMphCmtindx() {
		return this.mphCmtindx;
	}

	public void setMphCmtindx(Integer mphCmtindx) {
		this.mphCmtindx = mphCmtindx;
	}

	public String getMphRsult() {
		return this.mphRsult;
	}

	public void setMphRsult(String mphRsult) {
		this.mphRsult = mphRsult;
	}

	public Integer getMphOpTrnbr() {
		return this.mphOpTrnbr;
	}

	public void setMphOpTrnbr(Integer mphOpTrnbr) {
		this.mphOpTrnbr = mphOpTrnbr;
	}

	public String getMphMch() {
		return this.mphMch;
	}

	public void setMphMch(String mphMch) {
		this.mphMch = mphMch;
	}

	public String getMphWrNbr() {
		return this.mphWrNbr;
	}

	public void setMphWrNbr(String mphWrNbr) {
		this.mphWrNbr = mphWrNbr;
	}

	public Boolean getMphPass() {
		return this.mphPass;
	}

	public void setMphPass(Boolean mphPass) {
		this.mphPass = mphPass;
	}

	public String getMphUser1() {
		return this.mphUser1;
	}

	public void setMphUser1(String mphUser1) {
		this.mphUser1 = mphUser1;
	}

	public String getMphUser2() {
		return this.mphUser2;
	}

	public void setMphUser2(String mphUser2) {
		this.mphUser2 = mphUser2;
	}

	public String getMphChr01() {
		return this.mphChr01;
	}

	public void setMphChr01(String mphChr01) {
		this.mphChr01 = mphChr01;
	}

	public String getMphChr02() {
		return this.mphChr02;
	}

	public void setMphChr02(String mphChr02) {
		this.mphChr02 = mphChr02;
	}

	public String getMphChr03() {
		return this.mphChr03;
	}

	public void setMphChr03(String mphChr03) {
		this.mphChr03 = mphChr03;
	}

	public String getMphChr04() {
		return this.mphChr04;
	}

	public void setMphChr04(String mphChr04) {
		this.mphChr04 = mphChr04;
	}

	public String getMphChr05() {
		return this.mphChr05;
	}

	public void setMphChr05(String mphChr05) {
		this.mphChr05 = mphChr05;
	}

	public Double getMphDec01() {
		return this.mphDec01;
	}

	public void setMphDec01(Double mphDec01) {
		this.mphDec01 = mphDec01;
	}

	public Double getMphDec02() {
		return this.mphDec02;
	}

	public void setMphDec02(Double mphDec02) {
		this.mphDec02 = mphDec02;
	}

	public String getMphTestmthd() {
		return this.mphTestmthd;
	}

	public void setMphTestmthd(String mphTestmthd) {
		this.mphTestmthd = mphTestmthd;
	}

	public String getMphAttribute() {
		return this.mphAttribute;
	}

	public void setMphAttribute(String mphAttribute) {
		this.mphAttribute = mphAttribute;
	}

	public Double getOidMphHist() {
		return this.oidMphHist;
	}

	public void setOidMphHist(Double oidMphHist) {
		this.oidMphHist = oidMphHist;
	}

}