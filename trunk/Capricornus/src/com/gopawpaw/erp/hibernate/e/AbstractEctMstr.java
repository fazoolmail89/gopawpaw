package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEctMstr entity provides the base persistence definition of the
 * EctMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEctMstr implements java.io.Serializable {

	// Fields

	private EctMstrId id;
	private String ectDesc;
	private String ectApproval;
	private String ectDistr;
	private String ectPrefix;
	private Integer ectDcWarn;
	private String ectUser1;
	private String ectUser2;
	private Boolean ectQad01;
	private Date ectQad02;
	private String ectQad03;
	private String ectQad04;
	private String ectQad05;
	private Date ectModDate;
	private String ectUserid;
	private String ectDocType;
	private String ectSecureText;
	private String ectSecureItem;
	private String ectSecureStct;
	private String ectSecureRouting;
	private String ectSecureAdmn;
	private Boolean ectSeqrevOff;
	private Double oidEctMstr;

	// Constructors

	/** default constructor */
	public AbstractEctMstr() {
	}

	/** minimal constructor */
	public AbstractEctMstr(EctMstrId id, Double oidEctMstr) {
		this.id = id;
		this.oidEctMstr = oidEctMstr;
	}

	/** full constructor */
	public AbstractEctMstr(EctMstrId id, String ectDesc, String ectApproval,
			String ectDistr, String ectPrefix, Integer ectDcWarn,
			String ectUser1, String ectUser2, Boolean ectQad01, Date ectQad02,
			String ectQad03, String ectQad04, String ectQad05, Date ectModDate,
			String ectUserid, String ectDocType, String ectSecureText,
			String ectSecureItem, String ectSecureStct,
			String ectSecureRouting, String ectSecureAdmn,
			Boolean ectSeqrevOff, Double oidEctMstr) {
		this.id = id;
		this.ectDesc = ectDesc;
		this.ectApproval = ectApproval;
		this.ectDistr = ectDistr;
		this.ectPrefix = ectPrefix;
		this.ectDcWarn = ectDcWarn;
		this.ectUser1 = ectUser1;
		this.ectUser2 = ectUser2;
		this.ectQad01 = ectQad01;
		this.ectQad02 = ectQad02;
		this.ectQad03 = ectQad03;
		this.ectQad04 = ectQad04;
		this.ectQad05 = ectQad05;
		this.ectModDate = ectModDate;
		this.ectUserid = ectUserid;
		this.ectDocType = ectDocType;
		this.ectSecureText = ectSecureText;
		this.ectSecureItem = ectSecureItem;
		this.ectSecureStct = ectSecureStct;
		this.ectSecureRouting = ectSecureRouting;
		this.ectSecureAdmn = ectSecureAdmn;
		this.ectSeqrevOff = ectSeqrevOff;
		this.oidEctMstr = oidEctMstr;
	}

	// Property accessors

	public EctMstrId getId() {
		return this.id;
	}

	public void setId(EctMstrId id) {
		this.id = id;
	}

	public String getEctDesc() {
		return this.ectDesc;
	}

	public void setEctDesc(String ectDesc) {
		this.ectDesc = ectDesc;
	}

	public String getEctApproval() {
		return this.ectApproval;
	}

	public void setEctApproval(String ectApproval) {
		this.ectApproval = ectApproval;
	}

	public String getEctDistr() {
		return this.ectDistr;
	}

	public void setEctDistr(String ectDistr) {
		this.ectDistr = ectDistr;
	}

	public String getEctPrefix() {
		return this.ectPrefix;
	}

	public void setEctPrefix(String ectPrefix) {
		this.ectPrefix = ectPrefix;
	}

	public Integer getEctDcWarn() {
		return this.ectDcWarn;
	}

	public void setEctDcWarn(Integer ectDcWarn) {
		this.ectDcWarn = ectDcWarn;
	}

	public String getEctUser1() {
		return this.ectUser1;
	}

	public void setEctUser1(String ectUser1) {
		this.ectUser1 = ectUser1;
	}

	public String getEctUser2() {
		return this.ectUser2;
	}

	public void setEctUser2(String ectUser2) {
		this.ectUser2 = ectUser2;
	}

	public Boolean getEctQad01() {
		return this.ectQad01;
	}

	public void setEctQad01(Boolean ectQad01) {
		this.ectQad01 = ectQad01;
	}

	public Date getEctQad02() {
		return this.ectQad02;
	}

	public void setEctQad02(Date ectQad02) {
		this.ectQad02 = ectQad02;
	}

	public String getEctQad03() {
		return this.ectQad03;
	}

	public void setEctQad03(String ectQad03) {
		this.ectQad03 = ectQad03;
	}

	public String getEctQad04() {
		return this.ectQad04;
	}

	public void setEctQad04(String ectQad04) {
		this.ectQad04 = ectQad04;
	}

	public String getEctQad05() {
		return this.ectQad05;
	}

	public void setEctQad05(String ectQad05) {
		this.ectQad05 = ectQad05;
	}

	public Date getEctModDate() {
		return this.ectModDate;
	}

	public void setEctModDate(Date ectModDate) {
		this.ectModDate = ectModDate;
	}

	public String getEctUserid() {
		return this.ectUserid;
	}

	public void setEctUserid(String ectUserid) {
		this.ectUserid = ectUserid;
	}

	public String getEctDocType() {
		return this.ectDocType;
	}

	public void setEctDocType(String ectDocType) {
		this.ectDocType = ectDocType;
	}

	public String getEctSecureText() {
		return this.ectSecureText;
	}

	public void setEctSecureText(String ectSecureText) {
		this.ectSecureText = ectSecureText;
	}

	public String getEctSecureItem() {
		return this.ectSecureItem;
	}

	public void setEctSecureItem(String ectSecureItem) {
		this.ectSecureItem = ectSecureItem;
	}

	public String getEctSecureStct() {
		return this.ectSecureStct;
	}

	public void setEctSecureStct(String ectSecureStct) {
		this.ectSecureStct = ectSecureStct;
	}

	public String getEctSecureRouting() {
		return this.ectSecureRouting;
	}

	public void setEctSecureRouting(String ectSecureRouting) {
		this.ectSecureRouting = ectSecureRouting;
	}

	public String getEctSecureAdmn() {
		return this.ectSecureAdmn;
	}

	public void setEctSecureAdmn(String ectSecureAdmn) {
		this.ectSecureAdmn = ectSecureAdmn;
	}

	public Boolean getEctSeqrevOff() {
		return this.ectSeqrevOff;
	}

	public void setEctSeqrevOff(Boolean ectSeqrevOff) {
		this.ectSeqrevOff = ectSeqrevOff;
	}

	public Double getOidEctMstr() {
		return this.oidEctMstr;
	}

	public void setOidEctMstr(Double oidEctMstr) {
		this.oidEctMstr = oidEctMstr;
	}

}