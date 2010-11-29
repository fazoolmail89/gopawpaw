package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMfsdDet entity provides the base persistence definition of the
 * MfsdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMfsdDet implements java.io.Serializable {

	// Fields

	private String mfsdUserid;
	private String mfsdEngCode;
	private String mfsdEngId;
	private String mfsdSite;
	private String mfsdLoc;
	private String mfsdSvcGroup1;
	private String mfsdSvcGroup2;
	private Boolean mfsdSyncAuth;
	private Boolean mfsdCallHeader;
	private String mfsdSaPre;
	private Boolean mfsdNonexistingUser;
	private Boolean mfsdNonexistingItems;
	private Boolean mfsdPrntsyscmnt;
	private Boolean mfsdClientDocIds;
	private String mfsdCaMoPre;
	private String mfsdModUserid;
	private Date mfsdModDate;
	private String mfsdUser1;
	private String mfsdUser2;
	private String mfsdQadc01;
	private String mfsdQadc02;
	private String mfsdUserc03;
	private String mfsdUserc04;
	private String mfsdUserc05;
	private Double mfsdUserd01;
	private Double mfsdUserd02;
	private Boolean mfsdUserl01;
	private Boolean mfsdUserl02;
	private Date mfsdUsert01;
	private Date mfsdUsert02;
	private String mfsdDomain;
	private Double oidMfsdDet;

	// Constructors

	/** default constructor */
	public AbstractMfsdDet() {
	}

	/** minimal constructor */
	public AbstractMfsdDet(String mfsdEngCode, String mfsdEngId,
			String mfsdSite, String mfsdLoc, String mfsdSvcGroup1,
			String mfsdSvcGroup2, Boolean mfsdSyncAuth, Boolean mfsdCallHeader,
			String mfsdSaPre, Boolean mfsdNonexistingUser,
			Boolean mfsdNonexistingItems, Boolean mfsdPrntsyscmnt,
			Boolean mfsdClientDocIds, String mfsdCaMoPre, String mfsdModUserid,
			Date mfsdModDate, String mfsdUser1, String mfsdUser2,
			String mfsdQadc01, String mfsdQadc02, String mfsdUserc03,
			String mfsdUserc04, String mfsdUserc05, Double mfsdUserd01,
			Double mfsdUserd02, Boolean mfsdUserl01, Boolean mfsdUserl02,
			String mfsdDomain, Double oidMfsdDet) {
		this.mfsdEngCode = mfsdEngCode;
		this.mfsdEngId = mfsdEngId;
		this.mfsdSite = mfsdSite;
		this.mfsdLoc = mfsdLoc;
		this.mfsdSvcGroup1 = mfsdSvcGroup1;
		this.mfsdSvcGroup2 = mfsdSvcGroup2;
		this.mfsdSyncAuth = mfsdSyncAuth;
		this.mfsdCallHeader = mfsdCallHeader;
		this.mfsdSaPre = mfsdSaPre;
		this.mfsdNonexistingUser = mfsdNonexistingUser;
		this.mfsdNonexistingItems = mfsdNonexistingItems;
		this.mfsdPrntsyscmnt = mfsdPrntsyscmnt;
		this.mfsdClientDocIds = mfsdClientDocIds;
		this.mfsdCaMoPre = mfsdCaMoPre;
		this.mfsdModUserid = mfsdModUserid;
		this.mfsdModDate = mfsdModDate;
		this.mfsdUser1 = mfsdUser1;
		this.mfsdUser2 = mfsdUser2;
		this.mfsdQadc01 = mfsdQadc01;
		this.mfsdQadc02 = mfsdQadc02;
		this.mfsdUserc03 = mfsdUserc03;
		this.mfsdUserc04 = mfsdUserc04;
		this.mfsdUserc05 = mfsdUserc05;
		this.mfsdUserd01 = mfsdUserd01;
		this.mfsdUserd02 = mfsdUserd02;
		this.mfsdUserl01 = mfsdUserl01;
		this.mfsdUserl02 = mfsdUserl02;
		this.mfsdDomain = mfsdDomain;
		this.oidMfsdDet = oidMfsdDet;
	}

	/** full constructor */
	public AbstractMfsdDet(String mfsdEngCode, String mfsdEngId,
			String mfsdSite, String mfsdLoc, String mfsdSvcGroup1,
			String mfsdSvcGroup2, Boolean mfsdSyncAuth, Boolean mfsdCallHeader,
			String mfsdSaPre, Boolean mfsdNonexistingUser,
			Boolean mfsdNonexistingItems, Boolean mfsdPrntsyscmnt,
			Boolean mfsdClientDocIds, String mfsdCaMoPre, String mfsdModUserid,
			Date mfsdModDate, String mfsdUser1, String mfsdUser2,
			String mfsdQadc01, String mfsdQadc02, String mfsdUserc03,
			String mfsdUserc04, String mfsdUserc05, Double mfsdUserd01,
			Double mfsdUserd02, Boolean mfsdUserl01, Boolean mfsdUserl02,
			Date mfsdUsert01, Date mfsdUsert02, String mfsdDomain,
			Double oidMfsdDet) {
		this.mfsdEngCode = mfsdEngCode;
		this.mfsdEngId = mfsdEngId;
		this.mfsdSite = mfsdSite;
		this.mfsdLoc = mfsdLoc;
		this.mfsdSvcGroup1 = mfsdSvcGroup1;
		this.mfsdSvcGroup2 = mfsdSvcGroup2;
		this.mfsdSyncAuth = mfsdSyncAuth;
		this.mfsdCallHeader = mfsdCallHeader;
		this.mfsdSaPre = mfsdSaPre;
		this.mfsdNonexistingUser = mfsdNonexistingUser;
		this.mfsdNonexistingItems = mfsdNonexistingItems;
		this.mfsdPrntsyscmnt = mfsdPrntsyscmnt;
		this.mfsdClientDocIds = mfsdClientDocIds;
		this.mfsdCaMoPre = mfsdCaMoPre;
		this.mfsdModUserid = mfsdModUserid;
		this.mfsdModDate = mfsdModDate;
		this.mfsdUser1 = mfsdUser1;
		this.mfsdUser2 = mfsdUser2;
		this.mfsdQadc01 = mfsdQadc01;
		this.mfsdQadc02 = mfsdQadc02;
		this.mfsdUserc03 = mfsdUserc03;
		this.mfsdUserc04 = mfsdUserc04;
		this.mfsdUserc05 = mfsdUserc05;
		this.mfsdUserd01 = mfsdUserd01;
		this.mfsdUserd02 = mfsdUserd02;
		this.mfsdUserl01 = mfsdUserl01;
		this.mfsdUserl02 = mfsdUserl02;
		this.mfsdUsert01 = mfsdUsert01;
		this.mfsdUsert02 = mfsdUsert02;
		this.mfsdDomain = mfsdDomain;
		this.oidMfsdDet = oidMfsdDet;
	}

	// Property accessors

	public String getMfsdUserid() {
		return this.mfsdUserid;
	}

	public void setMfsdUserid(String mfsdUserid) {
		this.mfsdUserid = mfsdUserid;
	}

	public String getMfsdEngCode() {
		return this.mfsdEngCode;
	}

	public void setMfsdEngCode(String mfsdEngCode) {
		this.mfsdEngCode = mfsdEngCode;
	}

	public String getMfsdEngId() {
		return this.mfsdEngId;
	}

	public void setMfsdEngId(String mfsdEngId) {
		this.mfsdEngId = mfsdEngId;
	}

	public String getMfsdSite() {
		return this.mfsdSite;
	}

	public void setMfsdSite(String mfsdSite) {
		this.mfsdSite = mfsdSite;
	}

	public String getMfsdLoc() {
		return this.mfsdLoc;
	}

	public void setMfsdLoc(String mfsdLoc) {
		this.mfsdLoc = mfsdLoc;
	}

	public String getMfsdSvcGroup1() {
		return this.mfsdSvcGroup1;
	}

	public void setMfsdSvcGroup1(String mfsdSvcGroup1) {
		this.mfsdSvcGroup1 = mfsdSvcGroup1;
	}

	public String getMfsdSvcGroup2() {
		return this.mfsdSvcGroup2;
	}

	public void setMfsdSvcGroup2(String mfsdSvcGroup2) {
		this.mfsdSvcGroup2 = mfsdSvcGroup2;
	}

	public Boolean getMfsdSyncAuth() {
		return this.mfsdSyncAuth;
	}

	public void setMfsdSyncAuth(Boolean mfsdSyncAuth) {
		this.mfsdSyncAuth = mfsdSyncAuth;
	}

	public Boolean getMfsdCallHeader() {
		return this.mfsdCallHeader;
	}

	public void setMfsdCallHeader(Boolean mfsdCallHeader) {
		this.mfsdCallHeader = mfsdCallHeader;
	}

	public String getMfsdSaPre() {
		return this.mfsdSaPre;
	}

	public void setMfsdSaPre(String mfsdSaPre) {
		this.mfsdSaPre = mfsdSaPre;
	}

	public Boolean getMfsdNonexistingUser() {
		return this.mfsdNonexistingUser;
	}

	public void setMfsdNonexistingUser(Boolean mfsdNonexistingUser) {
		this.mfsdNonexistingUser = mfsdNonexistingUser;
	}

	public Boolean getMfsdNonexistingItems() {
		return this.mfsdNonexistingItems;
	}

	public void setMfsdNonexistingItems(Boolean mfsdNonexistingItems) {
		this.mfsdNonexistingItems = mfsdNonexistingItems;
	}

	public Boolean getMfsdPrntsyscmnt() {
		return this.mfsdPrntsyscmnt;
	}

	public void setMfsdPrntsyscmnt(Boolean mfsdPrntsyscmnt) {
		this.mfsdPrntsyscmnt = mfsdPrntsyscmnt;
	}

	public Boolean getMfsdClientDocIds() {
		return this.mfsdClientDocIds;
	}

	public void setMfsdClientDocIds(Boolean mfsdClientDocIds) {
		this.mfsdClientDocIds = mfsdClientDocIds;
	}

	public String getMfsdCaMoPre() {
		return this.mfsdCaMoPre;
	}

	public void setMfsdCaMoPre(String mfsdCaMoPre) {
		this.mfsdCaMoPre = mfsdCaMoPre;
	}

	public String getMfsdModUserid() {
		return this.mfsdModUserid;
	}

	public void setMfsdModUserid(String mfsdModUserid) {
		this.mfsdModUserid = mfsdModUserid;
	}

	public Date getMfsdModDate() {
		return this.mfsdModDate;
	}

	public void setMfsdModDate(Date mfsdModDate) {
		this.mfsdModDate = mfsdModDate;
	}

	public String getMfsdUser1() {
		return this.mfsdUser1;
	}

	public void setMfsdUser1(String mfsdUser1) {
		this.mfsdUser1 = mfsdUser1;
	}

	public String getMfsdUser2() {
		return this.mfsdUser2;
	}

	public void setMfsdUser2(String mfsdUser2) {
		this.mfsdUser2 = mfsdUser2;
	}

	public String getMfsdQadc01() {
		return this.mfsdQadc01;
	}

	public void setMfsdQadc01(String mfsdQadc01) {
		this.mfsdQadc01 = mfsdQadc01;
	}

	public String getMfsdQadc02() {
		return this.mfsdQadc02;
	}

	public void setMfsdQadc02(String mfsdQadc02) {
		this.mfsdQadc02 = mfsdQadc02;
	}

	public String getMfsdUserc03() {
		return this.mfsdUserc03;
	}

	public void setMfsdUserc03(String mfsdUserc03) {
		this.mfsdUserc03 = mfsdUserc03;
	}

	public String getMfsdUserc04() {
		return this.mfsdUserc04;
	}

	public void setMfsdUserc04(String mfsdUserc04) {
		this.mfsdUserc04 = mfsdUserc04;
	}

	public String getMfsdUserc05() {
		return this.mfsdUserc05;
	}

	public void setMfsdUserc05(String mfsdUserc05) {
		this.mfsdUserc05 = mfsdUserc05;
	}

	public Double getMfsdUserd01() {
		return this.mfsdUserd01;
	}

	public void setMfsdUserd01(Double mfsdUserd01) {
		this.mfsdUserd01 = mfsdUserd01;
	}

	public Double getMfsdUserd02() {
		return this.mfsdUserd02;
	}

	public void setMfsdUserd02(Double mfsdUserd02) {
		this.mfsdUserd02 = mfsdUserd02;
	}

	public Boolean getMfsdUserl01() {
		return this.mfsdUserl01;
	}

	public void setMfsdUserl01(Boolean mfsdUserl01) {
		this.mfsdUserl01 = mfsdUserl01;
	}

	public Boolean getMfsdUserl02() {
		return this.mfsdUserl02;
	}

	public void setMfsdUserl02(Boolean mfsdUserl02) {
		this.mfsdUserl02 = mfsdUserl02;
	}

	public Date getMfsdUsert01() {
		return this.mfsdUsert01;
	}

	public void setMfsdUsert01(Date mfsdUsert01) {
		this.mfsdUsert01 = mfsdUsert01;
	}

	public Date getMfsdUsert02() {
		return this.mfsdUsert02;
	}

	public void setMfsdUsert02(Date mfsdUsert02) {
		this.mfsdUsert02 = mfsdUsert02;
	}

	public String getMfsdDomain() {
		return this.mfsdDomain;
	}

	public void setMfsdDomain(String mfsdDomain) {
		this.mfsdDomain = mfsdDomain;
	}

	public Double getOidMfsdDet() {
		return this.oidMfsdDet;
	}

	public void setOidMfsdDet(Double oidMfsdDet) {
		this.oidMfsdDet = oidMfsdDet;
	}

}