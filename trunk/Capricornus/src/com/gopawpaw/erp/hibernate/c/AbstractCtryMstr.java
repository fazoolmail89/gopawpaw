package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCtryMstr entity provides the base persistence definition of the
 * CtryMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCtryMstr implements java.io.Serializable {

	// Fields

	private String ctryCtryCode;
	private String ctryCountry;
	private Boolean ctryEcFlag;
	private String ctryCode1;
	private String ctryQad01;
	private String ctryQad02;
	private String ctryUser1;
	private Boolean ctryQad04;
	private String ctryUser2;
	private String ctryQad03;
	private Boolean ctryQad05;
	private Boolean ctryLog01;
	private String ctryChr01;
	private String ctryGroup;
	private Boolean ctryNaftaFlag;
	private Integer ctryCmtindx;
	private String ctryType;
	private Boolean ctryDeaFlag;
	private Boolean ctryGattFlag;
	private String ctryVatRegPrefix;
	private String ctryIeCode;
	private Double oidCtryMstr;

	// Constructors

	/** default constructor */
	public AbstractCtryMstr() {
	}

	/** minimal constructor */
	public AbstractCtryMstr(String ctryCountry, Boolean ctryEcFlag,
			String ctryVatRegPrefix, String ctryIeCode, Double oidCtryMstr) {
		this.ctryCountry = ctryCountry;
		this.ctryEcFlag = ctryEcFlag;
		this.ctryVatRegPrefix = ctryVatRegPrefix;
		this.ctryIeCode = ctryIeCode;
		this.oidCtryMstr = oidCtryMstr;
	}

	/** full constructor */
	public AbstractCtryMstr(String ctryCountry, Boolean ctryEcFlag,
			String ctryCode1, String ctryQad01, String ctryQad02,
			String ctryUser1, Boolean ctryQad04, String ctryUser2,
			String ctryQad03, Boolean ctryQad05, Boolean ctryLog01,
			String ctryChr01, String ctryGroup, Boolean ctryNaftaFlag,
			Integer ctryCmtindx, String ctryType, Boolean ctryDeaFlag,
			Boolean ctryGattFlag, String ctryVatRegPrefix, String ctryIeCode,
			Double oidCtryMstr) {
		this.ctryCountry = ctryCountry;
		this.ctryEcFlag = ctryEcFlag;
		this.ctryCode1 = ctryCode1;
		this.ctryQad01 = ctryQad01;
		this.ctryQad02 = ctryQad02;
		this.ctryUser1 = ctryUser1;
		this.ctryQad04 = ctryQad04;
		this.ctryUser2 = ctryUser2;
		this.ctryQad03 = ctryQad03;
		this.ctryQad05 = ctryQad05;
		this.ctryLog01 = ctryLog01;
		this.ctryChr01 = ctryChr01;
		this.ctryGroup = ctryGroup;
		this.ctryNaftaFlag = ctryNaftaFlag;
		this.ctryCmtindx = ctryCmtindx;
		this.ctryType = ctryType;
		this.ctryDeaFlag = ctryDeaFlag;
		this.ctryGattFlag = ctryGattFlag;
		this.ctryVatRegPrefix = ctryVatRegPrefix;
		this.ctryIeCode = ctryIeCode;
		this.oidCtryMstr = oidCtryMstr;
	}

	// Property accessors

	public String getCtryCtryCode() {
		return this.ctryCtryCode;
	}

	public void setCtryCtryCode(String ctryCtryCode) {
		this.ctryCtryCode = ctryCtryCode;
	}

	public String getCtryCountry() {
		return this.ctryCountry;
	}

	public void setCtryCountry(String ctryCountry) {
		this.ctryCountry = ctryCountry;
	}

	public Boolean getCtryEcFlag() {
		return this.ctryEcFlag;
	}

	public void setCtryEcFlag(Boolean ctryEcFlag) {
		this.ctryEcFlag = ctryEcFlag;
	}

	public String getCtryCode1() {
		return this.ctryCode1;
	}

	public void setCtryCode1(String ctryCode1) {
		this.ctryCode1 = ctryCode1;
	}

	public String getCtryQad01() {
		return this.ctryQad01;
	}

	public void setCtryQad01(String ctryQad01) {
		this.ctryQad01 = ctryQad01;
	}

	public String getCtryQad02() {
		return this.ctryQad02;
	}

	public void setCtryQad02(String ctryQad02) {
		this.ctryQad02 = ctryQad02;
	}

	public String getCtryUser1() {
		return this.ctryUser1;
	}

	public void setCtryUser1(String ctryUser1) {
		this.ctryUser1 = ctryUser1;
	}

	public Boolean getCtryQad04() {
		return this.ctryQad04;
	}

	public void setCtryQad04(Boolean ctryQad04) {
		this.ctryQad04 = ctryQad04;
	}

	public String getCtryUser2() {
		return this.ctryUser2;
	}

	public void setCtryUser2(String ctryUser2) {
		this.ctryUser2 = ctryUser2;
	}

	public String getCtryQad03() {
		return this.ctryQad03;
	}

	public void setCtryQad03(String ctryQad03) {
		this.ctryQad03 = ctryQad03;
	}

	public Boolean getCtryQad05() {
		return this.ctryQad05;
	}

	public void setCtryQad05(Boolean ctryQad05) {
		this.ctryQad05 = ctryQad05;
	}

	public Boolean getCtryLog01() {
		return this.ctryLog01;
	}

	public void setCtryLog01(Boolean ctryLog01) {
		this.ctryLog01 = ctryLog01;
	}

	public String getCtryChr01() {
		return this.ctryChr01;
	}

	public void setCtryChr01(String ctryChr01) {
		this.ctryChr01 = ctryChr01;
	}

	public String getCtryGroup() {
		return this.ctryGroup;
	}

	public void setCtryGroup(String ctryGroup) {
		this.ctryGroup = ctryGroup;
	}

	public Boolean getCtryNaftaFlag() {
		return this.ctryNaftaFlag;
	}

	public void setCtryNaftaFlag(Boolean ctryNaftaFlag) {
		this.ctryNaftaFlag = ctryNaftaFlag;
	}

	public Integer getCtryCmtindx() {
		return this.ctryCmtindx;
	}

	public void setCtryCmtindx(Integer ctryCmtindx) {
		this.ctryCmtindx = ctryCmtindx;
	}

	public String getCtryType() {
		return this.ctryType;
	}

	public void setCtryType(String ctryType) {
		this.ctryType = ctryType;
	}

	public Boolean getCtryDeaFlag() {
		return this.ctryDeaFlag;
	}

	public void setCtryDeaFlag(Boolean ctryDeaFlag) {
		this.ctryDeaFlag = ctryDeaFlag;
	}

	public Boolean getCtryGattFlag() {
		return this.ctryGattFlag;
	}

	public void setCtryGattFlag(Boolean ctryGattFlag) {
		this.ctryGattFlag = ctryGattFlag;
	}

	public String getCtryVatRegPrefix() {
		return this.ctryVatRegPrefix;
	}

	public void setCtryVatRegPrefix(String ctryVatRegPrefix) {
		this.ctryVatRegPrefix = ctryVatRegPrefix;
	}

	public String getCtryIeCode() {
		return this.ctryIeCode;
	}

	public void setCtryIeCode(String ctryIeCode) {
		this.ctryIeCode = ctryIeCode;
	}

	public Double getOidCtryMstr() {
		return this.oidCtryMstr;
	}

	public void setOidCtryMstr(Double oidCtryMstr) {
		this.oidCtryMstr = oidCtryMstr;
	}

}