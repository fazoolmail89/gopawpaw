package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUsrMstr entity provides the base persistence definition of the
 * UsrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrMstr implements java.io.Serializable {

	// Fields

	private String usrUserid;
	private String usrLang;
	private String usrUser1;
	private String usrUser2;
	private String usrSite;
	private String usrQadc05;
	private String usrPasswd;
	private String usrName;
	private Date usrLastDate;
	private String usrQad01;
	private String usrQad02;
	private Boolean usrQadl03;
	private String usrQadc03;
	private String usrAddr;
	private Boolean usrRestrict;
	private String usrQadc02;
	private Integer usrQadi02;
	private String usrQadc01;
	private Boolean usrQadl01;
	private Boolean usrQadl02;
	private String usrQadc04;
	private Integer usrQadi01;
	private String usrMailAddress;
	private String usrType;
	private String usrTimezone;
	private String usrAccessType;
	private String usrAccessLoc;
	private String usrCtryCode;
	private String usrVariantCode;
	private Integer usrFailedAttempts;
	private Boolean usrForceChange;
	private Date usrLogonDate;
	private Boolean usrActive;
	private String usrActiveBy;
	private String usrActiveReason;
	private Date usrActiveDate;
	private String usrLogonTimezone;
	private String usrRemark;
	private Integer usrLogonTime;
	private Double oidUsrMstr;

	// Constructors

	/** default constructor */
	public AbstractUsrMstr() {
	}

	/** minimal constructor */
	public AbstractUsrMstr(Boolean usrQadl03, String usrQadc03, String usrAddr,
			Boolean usrRestrict, String usrType, String usrTimezone,
			String usrAccessType, String usrAccessLoc, String usrCtryCode,
			String usrVariantCode, Integer usrFailedAttempts,
			Boolean usrForceChange, Boolean usrActive, String usrActiveBy,
			String usrActiveReason, Date usrActiveDate,
			String usrLogonTimezone, Integer usrLogonTime, Double oidUsrMstr) {
		this.usrQadl03 = usrQadl03;
		this.usrQadc03 = usrQadc03;
		this.usrAddr = usrAddr;
		this.usrRestrict = usrRestrict;
		this.usrType = usrType;
		this.usrTimezone = usrTimezone;
		this.usrAccessType = usrAccessType;
		this.usrAccessLoc = usrAccessLoc;
		this.usrCtryCode = usrCtryCode;
		this.usrVariantCode = usrVariantCode;
		this.usrFailedAttempts = usrFailedAttempts;
		this.usrForceChange = usrForceChange;
		this.usrActive = usrActive;
		this.usrActiveBy = usrActiveBy;
		this.usrActiveReason = usrActiveReason;
		this.usrActiveDate = usrActiveDate;
		this.usrLogonTimezone = usrLogonTimezone;
		this.usrLogonTime = usrLogonTime;
		this.oidUsrMstr = oidUsrMstr;
	}

	/** full constructor */
	public AbstractUsrMstr(String usrLang, String usrUser1, String usrUser2,
			String usrSite, String usrQadc05, String usrPasswd, String usrName,
			Date usrLastDate, String usrQad01, String usrQad02,
			Boolean usrQadl03, String usrQadc03, String usrAddr,
			Boolean usrRestrict, String usrQadc02, Integer usrQadi02,
			String usrQadc01, Boolean usrQadl01, Boolean usrQadl02,
			String usrQadc04, Integer usrQadi01, String usrMailAddress,
			String usrType, String usrTimezone, String usrAccessType,
			String usrAccessLoc, String usrCtryCode, String usrVariantCode,
			Integer usrFailedAttempts, Boolean usrForceChange,
			Date usrLogonDate, Boolean usrActive, String usrActiveBy,
			String usrActiveReason, Date usrActiveDate,
			String usrLogonTimezone, String usrRemark, Integer usrLogonTime,
			Double oidUsrMstr) {
		this.usrLang = usrLang;
		this.usrUser1 = usrUser1;
		this.usrUser2 = usrUser2;
		this.usrSite = usrSite;
		this.usrQadc05 = usrQadc05;
		this.usrPasswd = usrPasswd;
		this.usrName = usrName;
		this.usrLastDate = usrLastDate;
		this.usrQad01 = usrQad01;
		this.usrQad02 = usrQad02;
		this.usrQadl03 = usrQadl03;
		this.usrQadc03 = usrQadc03;
		this.usrAddr = usrAddr;
		this.usrRestrict = usrRestrict;
		this.usrQadc02 = usrQadc02;
		this.usrQadi02 = usrQadi02;
		this.usrQadc01 = usrQadc01;
		this.usrQadl01 = usrQadl01;
		this.usrQadl02 = usrQadl02;
		this.usrQadc04 = usrQadc04;
		this.usrQadi01 = usrQadi01;
		this.usrMailAddress = usrMailAddress;
		this.usrType = usrType;
		this.usrTimezone = usrTimezone;
		this.usrAccessType = usrAccessType;
		this.usrAccessLoc = usrAccessLoc;
		this.usrCtryCode = usrCtryCode;
		this.usrVariantCode = usrVariantCode;
		this.usrFailedAttempts = usrFailedAttempts;
		this.usrForceChange = usrForceChange;
		this.usrLogonDate = usrLogonDate;
		this.usrActive = usrActive;
		this.usrActiveBy = usrActiveBy;
		this.usrActiveReason = usrActiveReason;
		this.usrActiveDate = usrActiveDate;
		this.usrLogonTimezone = usrLogonTimezone;
		this.usrRemark = usrRemark;
		this.usrLogonTime = usrLogonTime;
		this.oidUsrMstr = oidUsrMstr;
	}

	// Property accessors

	public String getUsrUserid() {
		return this.usrUserid;
	}

	public void setUsrUserid(String usrUserid) {
		this.usrUserid = usrUserid;
	}

	public String getUsrLang() {
		return this.usrLang;
	}

	public void setUsrLang(String usrLang) {
		this.usrLang = usrLang;
	}

	public String getUsrUser1() {
		return this.usrUser1;
	}

	public void setUsrUser1(String usrUser1) {
		this.usrUser1 = usrUser1;
	}

	public String getUsrUser2() {
		return this.usrUser2;
	}

	public void setUsrUser2(String usrUser2) {
		this.usrUser2 = usrUser2;
	}

	public String getUsrSite() {
		return this.usrSite;
	}

	public void setUsrSite(String usrSite) {
		this.usrSite = usrSite;
	}

	public String getUsrQadc05() {
		return this.usrQadc05;
	}

	public void setUsrQadc05(String usrQadc05) {
		this.usrQadc05 = usrQadc05;
	}

	public String getUsrPasswd() {
		return this.usrPasswd;
	}

	public void setUsrPasswd(String usrPasswd) {
		this.usrPasswd = usrPasswd;
	}

	public String getUsrName() {
		return this.usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public Date getUsrLastDate() {
		return this.usrLastDate;
	}

	public void setUsrLastDate(Date usrLastDate) {
		this.usrLastDate = usrLastDate;
	}

	public String getUsrQad01() {
		return this.usrQad01;
	}

	public void setUsrQad01(String usrQad01) {
		this.usrQad01 = usrQad01;
	}

	public String getUsrQad02() {
		return this.usrQad02;
	}

	public void setUsrQad02(String usrQad02) {
		this.usrQad02 = usrQad02;
	}

	public Boolean getUsrQadl03() {
		return this.usrQadl03;
	}

	public void setUsrQadl03(Boolean usrQadl03) {
		this.usrQadl03 = usrQadl03;
	}

	public String getUsrQadc03() {
		return this.usrQadc03;
	}

	public void setUsrQadc03(String usrQadc03) {
		this.usrQadc03 = usrQadc03;
	}

	public String getUsrAddr() {
		return this.usrAddr;
	}

	public void setUsrAddr(String usrAddr) {
		this.usrAddr = usrAddr;
	}

	public Boolean getUsrRestrict() {
		return this.usrRestrict;
	}

	public void setUsrRestrict(Boolean usrRestrict) {
		this.usrRestrict = usrRestrict;
	}

	public String getUsrQadc02() {
		return this.usrQadc02;
	}

	public void setUsrQadc02(String usrQadc02) {
		this.usrQadc02 = usrQadc02;
	}

	public Integer getUsrQadi02() {
		return this.usrQadi02;
	}

	public void setUsrQadi02(Integer usrQadi02) {
		this.usrQadi02 = usrQadi02;
	}

	public String getUsrQadc01() {
		return this.usrQadc01;
	}

	public void setUsrQadc01(String usrQadc01) {
		this.usrQadc01 = usrQadc01;
	}

	public Boolean getUsrQadl01() {
		return this.usrQadl01;
	}

	public void setUsrQadl01(Boolean usrQadl01) {
		this.usrQadl01 = usrQadl01;
	}

	public Boolean getUsrQadl02() {
		return this.usrQadl02;
	}

	public void setUsrQadl02(Boolean usrQadl02) {
		this.usrQadl02 = usrQadl02;
	}

	public String getUsrQadc04() {
		return this.usrQadc04;
	}

	public void setUsrQadc04(String usrQadc04) {
		this.usrQadc04 = usrQadc04;
	}

	public Integer getUsrQadi01() {
		return this.usrQadi01;
	}

	public void setUsrQadi01(Integer usrQadi01) {
		this.usrQadi01 = usrQadi01;
	}

	public String getUsrMailAddress() {
		return this.usrMailAddress;
	}

	public void setUsrMailAddress(String usrMailAddress) {
		this.usrMailAddress = usrMailAddress;
	}

	public String getUsrType() {
		return this.usrType;
	}

	public void setUsrType(String usrType) {
		this.usrType = usrType;
	}

	public String getUsrTimezone() {
		return this.usrTimezone;
	}

	public void setUsrTimezone(String usrTimezone) {
		this.usrTimezone = usrTimezone;
	}

	public String getUsrAccessType() {
		return this.usrAccessType;
	}

	public void setUsrAccessType(String usrAccessType) {
		this.usrAccessType = usrAccessType;
	}

	public String getUsrAccessLoc() {
		return this.usrAccessLoc;
	}

	public void setUsrAccessLoc(String usrAccessLoc) {
		this.usrAccessLoc = usrAccessLoc;
	}

	public String getUsrCtryCode() {
		return this.usrCtryCode;
	}

	public void setUsrCtryCode(String usrCtryCode) {
		this.usrCtryCode = usrCtryCode;
	}

	public String getUsrVariantCode() {
		return this.usrVariantCode;
	}

	public void setUsrVariantCode(String usrVariantCode) {
		this.usrVariantCode = usrVariantCode;
	}

	public Integer getUsrFailedAttempts() {
		return this.usrFailedAttempts;
	}

	public void setUsrFailedAttempts(Integer usrFailedAttempts) {
		this.usrFailedAttempts = usrFailedAttempts;
	}

	public Boolean getUsrForceChange() {
		return this.usrForceChange;
	}

	public void setUsrForceChange(Boolean usrForceChange) {
		this.usrForceChange = usrForceChange;
	}

	public Date getUsrLogonDate() {
		return this.usrLogonDate;
	}

	public void setUsrLogonDate(Date usrLogonDate) {
		this.usrLogonDate = usrLogonDate;
	}

	public Boolean getUsrActive() {
		return this.usrActive;
	}

	public void setUsrActive(Boolean usrActive) {
		this.usrActive = usrActive;
	}

	public String getUsrActiveBy() {
		return this.usrActiveBy;
	}

	public void setUsrActiveBy(String usrActiveBy) {
		this.usrActiveBy = usrActiveBy;
	}

	public String getUsrActiveReason() {
		return this.usrActiveReason;
	}

	public void setUsrActiveReason(String usrActiveReason) {
		this.usrActiveReason = usrActiveReason;
	}

	public Date getUsrActiveDate() {
		return this.usrActiveDate;
	}

	public void setUsrActiveDate(Date usrActiveDate) {
		this.usrActiveDate = usrActiveDate;
	}

	public String getUsrLogonTimezone() {
		return this.usrLogonTimezone;
	}

	public void setUsrLogonTimezone(String usrLogonTimezone) {
		this.usrLogonTimezone = usrLogonTimezone;
	}

	public String getUsrRemark() {
		return this.usrRemark;
	}

	public void setUsrRemark(String usrRemark) {
		this.usrRemark = usrRemark;
	}

	public Integer getUsrLogonTime() {
		return this.usrLogonTime;
	}

	public void setUsrLogonTime(Integer usrLogonTime) {
		this.usrLogonTime = usrLogonTime;
	}

	public Double getOidUsrMstr() {
		return this.oidUsrMstr;
	}

	public void setOidUsrMstr(Double oidUsrMstr) {
		this.oidUsrMstr = oidUsrMstr;
	}

}