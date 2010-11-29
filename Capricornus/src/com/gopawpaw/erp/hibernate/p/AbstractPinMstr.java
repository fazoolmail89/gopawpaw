package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPinMstr entity provides the base persistence definition of the
 * PinMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPinMstr implements java.io.Serializable {

	// Fields

	private String pinProduct;
	private String pinDesc;
	private Integer pinHwm;
	private String pinControl1;
	private String pinControl2;
	private String pinControl3;
	private String pinControl4;
	private String pinControl5;
	private Date pinInstDate;
	private String pinUser1;
	private String pinUser2;
	private String pinQadc01;
	private Integer pinQadi01;
	private Double pinQadd01;
	private Boolean pinQadl01;
	private Date pinQadt01;
	private String pinControl6;
	private Integer pinInstTime;
	private String pinModUserid;
	private Date pinModDate;
	private Integer pinAudDays;
	private Date pinAudDdate;
	private Date pinAudDate;
	private String pinAudUser;
	private String pinAudPswd;
	private Integer pinAudNbr;
	private Double oidPinMstr;

	// Constructors

	/** default constructor */
	public AbstractPinMstr() {
	}

	/** minimal constructor */
	public AbstractPinMstr(String pinControl6, Integer pinInstTime,
			String pinModUserid, Integer pinAudDays, String pinAudUser,
			String pinAudPswd, Integer pinAudNbr, Double oidPinMstr) {
		this.pinControl6 = pinControl6;
		this.pinInstTime = pinInstTime;
		this.pinModUserid = pinModUserid;
		this.pinAudDays = pinAudDays;
		this.pinAudUser = pinAudUser;
		this.pinAudPswd = pinAudPswd;
		this.pinAudNbr = pinAudNbr;
		this.oidPinMstr = oidPinMstr;
	}

	/** full constructor */
	public AbstractPinMstr(String pinDesc, Integer pinHwm, String pinControl1,
			String pinControl2, String pinControl3, String pinControl4,
			String pinControl5, Date pinInstDate, String pinUser1,
			String pinUser2, String pinQadc01, Integer pinQadi01,
			Double pinQadd01, Boolean pinQadl01, Date pinQadt01,
			String pinControl6, Integer pinInstTime, String pinModUserid,
			Date pinModDate, Integer pinAudDays, Date pinAudDdate,
			Date pinAudDate, String pinAudUser, String pinAudPswd,
			Integer pinAudNbr, Double oidPinMstr) {
		this.pinDesc = pinDesc;
		this.pinHwm = pinHwm;
		this.pinControl1 = pinControl1;
		this.pinControl2 = pinControl2;
		this.pinControl3 = pinControl3;
		this.pinControl4 = pinControl4;
		this.pinControl5 = pinControl5;
		this.pinInstDate = pinInstDate;
		this.pinUser1 = pinUser1;
		this.pinUser2 = pinUser2;
		this.pinQadc01 = pinQadc01;
		this.pinQadi01 = pinQadi01;
		this.pinQadd01 = pinQadd01;
		this.pinQadl01 = pinQadl01;
		this.pinQadt01 = pinQadt01;
		this.pinControl6 = pinControl6;
		this.pinInstTime = pinInstTime;
		this.pinModUserid = pinModUserid;
		this.pinModDate = pinModDate;
		this.pinAudDays = pinAudDays;
		this.pinAudDdate = pinAudDdate;
		this.pinAudDate = pinAudDate;
		this.pinAudUser = pinAudUser;
		this.pinAudPswd = pinAudPswd;
		this.pinAudNbr = pinAudNbr;
		this.oidPinMstr = oidPinMstr;
	}

	// Property accessors

	public String getPinProduct() {
		return this.pinProduct;
	}

	public void setPinProduct(String pinProduct) {
		this.pinProduct = pinProduct;
	}

	public String getPinDesc() {
		return this.pinDesc;
	}

	public void setPinDesc(String pinDesc) {
		this.pinDesc = pinDesc;
	}

	public Integer getPinHwm() {
		return this.pinHwm;
	}

	public void setPinHwm(Integer pinHwm) {
		this.pinHwm = pinHwm;
	}

	public String getPinControl1() {
		return this.pinControl1;
	}

	public void setPinControl1(String pinControl1) {
		this.pinControl1 = pinControl1;
	}

	public String getPinControl2() {
		return this.pinControl2;
	}

	public void setPinControl2(String pinControl2) {
		this.pinControl2 = pinControl2;
	}

	public String getPinControl3() {
		return this.pinControl3;
	}

	public void setPinControl3(String pinControl3) {
		this.pinControl3 = pinControl3;
	}

	public String getPinControl4() {
		return this.pinControl4;
	}

	public void setPinControl4(String pinControl4) {
		this.pinControl4 = pinControl4;
	}

	public String getPinControl5() {
		return this.pinControl5;
	}

	public void setPinControl5(String pinControl5) {
		this.pinControl5 = pinControl5;
	}

	public Date getPinInstDate() {
		return this.pinInstDate;
	}

	public void setPinInstDate(Date pinInstDate) {
		this.pinInstDate = pinInstDate;
	}

	public String getPinUser1() {
		return this.pinUser1;
	}

	public void setPinUser1(String pinUser1) {
		this.pinUser1 = pinUser1;
	}

	public String getPinUser2() {
		return this.pinUser2;
	}

	public void setPinUser2(String pinUser2) {
		this.pinUser2 = pinUser2;
	}

	public String getPinQadc01() {
		return this.pinQadc01;
	}

	public void setPinQadc01(String pinQadc01) {
		this.pinQadc01 = pinQadc01;
	}

	public Integer getPinQadi01() {
		return this.pinQadi01;
	}

	public void setPinQadi01(Integer pinQadi01) {
		this.pinQadi01 = pinQadi01;
	}

	public Double getPinQadd01() {
		return this.pinQadd01;
	}

	public void setPinQadd01(Double pinQadd01) {
		this.pinQadd01 = pinQadd01;
	}

	public Boolean getPinQadl01() {
		return this.pinQadl01;
	}

	public void setPinQadl01(Boolean pinQadl01) {
		this.pinQadl01 = pinQadl01;
	}

	public Date getPinQadt01() {
		return this.pinQadt01;
	}

	public void setPinQadt01(Date pinQadt01) {
		this.pinQadt01 = pinQadt01;
	}

	public String getPinControl6() {
		return this.pinControl6;
	}

	public void setPinControl6(String pinControl6) {
		this.pinControl6 = pinControl6;
	}

	public Integer getPinInstTime() {
		return this.pinInstTime;
	}

	public void setPinInstTime(Integer pinInstTime) {
		this.pinInstTime = pinInstTime;
	}

	public String getPinModUserid() {
		return this.pinModUserid;
	}

	public void setPinModUserid(String pinModUserid) {
		this.pinModUserid = pinModUserid;
	}

	public Date getPinModDate() {
		return this.pinModDate;
	}

	public void setPinModDate(Date pinModDate) {
		this.pinModDate = pinModDate;
	}

	public Integer getPinAudDays() {
		return this.pinAudDays;
	}

	public void setPinAudDays(Integer pinAudDays) {
		this.pinAudDays = pinAudDays;
	}

	public Date getPinAudDdate() {
		return this.pinAudDdate;
	}

	public void setPinAudDdate(Date pinAudDdate) {
		this.pinAudDdate = pinAudDdate;
	}

	public Date getPinAudDate() {
		return this.pinAudDate;
	}

	public void setPinAudDate(Date pinAudDate) {
		this.pinAudDate = pinAudDate;
	}

	public String getPinAudUser() {
		return this.pinAudUser;
	}

	public void setPinAudUser(String pinAudUser) {
		this.pinAudUser = pinAudUser;
	}

	public String getPinAudPswd() {
		return this.pinAudPswd;
	}

	public void setPinAudPswd(String pinAudPswd) {
		this.pinAudPswd = pinAudPswd;
	}

	public Integer getPinAudNbr() {
		return this.pinAudNbr;
	}

	public void setPinAudNbr(Integer pinAudNbr) {
		this.pinAudNbr = pinAudNbr;
	}

	public Double getOidPinMstr() {
		return this.oidPinMstr;
	}

	public void setOidPinMstr(Double oidPinMstr) {
		this.oidPinMstr = oidPinMstr;
	}

}