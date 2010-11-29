package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCuMstr entity provides the base persistence definition of the CuMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCuMstr implements java.io.Serializable {

	// Fields

	private String cuCurr;
	private String cuDesc;
	private String cuRndMthd;
	private Boolean cuActive;
	private String cuQadc02;
	private String cuQadc04;
	private String cuQadc05;
	private String cuQadc07;
	private String cuQadc08;
	private String cuQadc10;
	private String cuQadc11;
	private String cuQadc13;
	private String cuQadc14;
	private String cuQadc16;
	private String cuModUserid;
	private Date cuModDate;
	private String cuUser1;
	private String cuUser2;
	private Date cuQadt01;
	private Date cuQadt02;
	private Double cuQadd01;
	private String cuQadc01;
	private Boolean cuQadl01;
	private String cuQadc15;
	private String cuQadc09;
	private String cuQadc12;
	private String cuQadc03;
	private String cuQadc06;
	private String cuIsoCurr;
	private Double oidCuMstr;

	// Constructors

	/** default constructor */
	public AbstractCuMstr() {
	}

	/** minimal constructor */
	public AbstractCuMstr(String cuDesc, String cuRndMthd, Boolean cuActive,
			String cuQadc02, String cuQadc04, String cuQadc05, String cuQadc07,
			String cuQadc08, String cuQadc10, String cuQadc11, String cuQadc13,
			String cuQadc14, String cuQadc16, String cuModUserid,
			Date cuModDate, String cuUser1, String cuUser2, Double cuQadd01,
			String cuQadc01, Boolean cuQadl01, String cuIsoCurr,
			Double oidCuMstr) {
		this.cuDesc = cuDesc;
		this.cuRndMthd = cuRndMthd;
		this.cuActive = cuActive;
		this.cuQadc02 = cuQadc02;
		this.cuQadc04 = cuQadc04;
		this.cuQadc05 = cuQadc05;
		this.cuQadc07 = cuQadc07;
		this.cuQadc08 = cuQadc08;
		this.cuQadc10 = cuQadc10;
		this.cuQadc11 = cuQadc11;
		this.cuQadc13 = cuQadc13;
		this.cuQadc14 = cuQadc14;
		this.cuQadc16 = cuQadc16;
		this.cuModUserid = cuModUserid;
		this.cuModDate = cuModDate;
		this.cuUser1 = cuUser1;
		this.cuUser2 = cuUser2;
		this.cuQadd01 = cuQadd01;
		this.cuQadc01 = cuQadc01;
		this.cuQadl01 = cuQadl01;
		this.cuIsoCurr = cuIsoCurr;
		this.oidCuMstr = oidCuMstr;
	}

	/** full constructor */
	public AbstractCuMstr(String cuDesc, String cuRndMthd, Boolean cuActive,
			String cuQadc02, String cuQadc04, String cuQadc05, String cuQadc07,
			String cuQadc08, String cuQadc10, String cuQadc11, String cuQadc13,
			String cuQadc14, String cuQadc16, String cuModUserid,
			Date cuModDate, String cuUser1, String cuUser2, Date cuQadt01,
			Date cuQadt02, Double cuQadd01, String cuQadc01, Boolean cuQadl01,
			String cuQadc15, String cuQadc09, String cuQadc12, String cuQadc03,
			String cuQadc06, String cuIsoCurr, Double oidCuMstr) {
		this.cuDesc = cuDesc;
		this.cuRndMthd = cuRndMthd;
		this.cuActive = cuActive;
		this.cuQadc02 = cuQadc02;
		this.cuQadc04 = cuQadc04;
		this.cuQadc05 = cuQadc05;
		this.cuQadc07 = cuQadc07;
		this.cuQadc08 = cuQadc08;
		this.cuQadc10 = cuQadc10;
		this.cuQadc11 = cuQadc11;
		this.cuQadc13 = cuQadc13;
		this.cuQadc14 = cuQadc14;
		this.cuQadc16 = cuQadc16;
		this.cuModUserid = cuModUserid;
		this.cuModDate = cuModDate;
		this.cuUser1 = cuUser1;
		this.cuUser2 = cuUser2;
		this.cuQadt01 = cuQadt01;
		this.cuQadt02 = cuQadt02;
		this.cuQadd01 = cuQadd01;
		this.cuQadc01 = cuQadc01;
		this.cuQadl01 = cuQadl01;
		this.cuQadc15 = cuQadc15;
		this.cuQadc09 = cuQadc09;
		this.cuQadc12 = cuQadc12;
		this.cuQadc03 = cuQadc03;
		this.cuQadc06 = cuQadc06;
		this.cuIsoCurr = cuIsoCurr;
		this.oidCuMstr = oidCuMstr;
	}

	// Property accessors

	public String getCuCurr() {
		return this.cuCurr;
	}

	public void setCuCurr(String cuCurr) {
		this.cuCurr = cuCurr;
	}

	public String getCuDesc() {
		return this.cuDesc;
	}

	public void setCuDesc(String cuDesc) {
		this.cuDesc = cuDesc;
	}

	public String getCuRndMthd() {
		return this.cuRndMthd;
	}

	public void setCuRndMthd(String cuRndMthd) {
		this.cuRndMthd = cuRndMthd;
	}

	public Boolean getCuActive() {
		return this.cuActive;
	}

	public void setCuActive(Boolean cuActive) {
		this.cuActive = cuActive;
	}

	public String getCuQadc02() {
		return this.cuQadc02;
	}

	public void setCuQadc02(String cuQadc02) {
		this.cuQadc02 = cuQadc02;
	}

	public String getCuQadc04() {
		return this.cuQadc04;
	}

	public void setCuQadc04(String cuQadc04) {
		this.cuQadc04 = cuQadc04;
	}

	public String getCuQadc05() {
		return this.cuQadc05;
	}

	public void setCuQadc05(String cuQadc05) {
		this.cuQadc05 = cuQadc05;
	}

	public String getCuQadc07() {
		return this.cuQadc07;
	}

	public void setCuQadc07(String cuQadc07) {
		this.cuQadc07 = cuQadc07;
	}

	public String getCuQadc08() {
		return this.cuQadc08;
	}

	public void setCuQadc08(String cuQadc08) {
		this.cuQadc08 = cuQadc08;
	}

	public String getCuQadc10() {
		return this.cuQadc10;
	}

	public void setCuQadc10(String cuQadc10) {
		this.cuQadc10 = cuQadc10;
	}

	public String getCuQadc11() {
		return this.cuQadc11;
	}

	public void setCuQadc11(String cuQadc11) {
		this.cuQadc11 = cuQadc11;
	}

	public String getCuQadc13() {
		return this.cuQadc13;
	}

	public void setCuQadc13(String cuQadc13) {
		this.cuQadc13 = cuQadc13;
	}

	public String getCuQadc14() {
		return this.cuQadc14;
	}

	public void setCuQadc14(String cuQadc14) {
		this.cuQadc14 = cuQadc14;
	}

	public String getCuQadc16() {
		return this.cuQadc16;
	}

	public void setCuQadc16(String cuQadc16) {
		this.cuQadc16 = cuQadc16;
	}

	public String getCuModUserid() {
		return this.cuModUserid;
	}

	public void setCuModUserid(String cuModUserid) {
		this.cuModUserid = cuModUserid;
	}

	public Date getCuModDate() {
		return this.cuModDate;
	}

	public void setCuModDate(Date cuModDate) {
		this.cuModDate = cuModDate;
	}

	public String getCuUser1() {
		return this.cuUser1;
	}

	public void setCuUser1(String cuUser1) {
		this.cuUser1 = cuUser1;
	}

	public String getCuUser2() {
		return this.cuUser2;
	}

	public void setCuUser2(String cuUser2) {
		this.cuUser2 = cuUser2;
	}

	public Date getCuQadt01() {
		return this.cuQadt01;
	}

	public void setCuQadt01(Date cuQadt01) {
		this.cuQadt01 = cuQadt01;
	}

	public Date getCuQadt02() {
		return this.cuQadt02;
	}

	public void setCuQadt02(Date cuQadt02) {
		this.cuQadt02 = cuQadt02;
	}

	public Double getCuQadd01() {
		return this.cuQadd01;
	}

	public void setCuQadd01(Double cuQadd01) {
		this.cuQadd01 = cuQadd01;
	}

	public String getCuQadc01() {
		return this.cuQadc01;
	}

	public void setCuQadc01(String cuQadc01) {
		this.cuQadc01 = cuQadc01;
	}

	public Boolean getCuQadl01() {
		return this.cuQadl01;
	}

	public void setCuQadl01(Boolean cuQadl01) {
		this.cuQadl01 = cuQadl01;
	}

	public String getCuQadc15() {
		return this.cuQadc15;
	}

	public void setCuQadc15(String cuQadc15) {
		this.cuQadc15 = cuQadc15;
	}

	public String getCuQadc09() {
		return this.cuQadc09;
	}

	public void setCuQadc09(String cuQadc09) {
		this.cuQadc09 = cuQadc09;
	}

	public String getCuQadc12() {
		return this.cuQadc12;
	}

	public void setCuQadc12(String cuQadc12) {
		this.cuQadc12 = cuQadc12;
	}

	public String getCuQadc03() {
		return this.cuQadc03;
	}

	public void setCuQadc03(String cuQadc03) {
		this.cuQadc03 = cuQadc03;
	}

	public String getCuQadc06() {
		return this.cuQadc06;
	}

	public void setCuQadc06(String cuQadc06) {
		this.cuQadc06 = cuQadc06;
	}

	public String getCuIsoCurr() {
		return this.cuIsoCurr;
	}

	public void setCuIsoCurr(String cuIsoCurr) {
		this.cuIsoCurr = cuIsoCurr;
	}

	public Double getOidCuMstr() {
		return this.oidCuMstr;
	}

	public void setOidCuMstr(Double oidCuMstr) {
		this.oidCuMstr = oidCuMstr;
	}

}