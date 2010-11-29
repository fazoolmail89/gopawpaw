package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSiMstr entity provides the base persistence definition of the SiMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSiMstr implements java.io.Serializable {

	// Fields

	private SiMstrId id;
	private String siDesc;
	private String siEntity;
	private String siStatus;
	private Boolean siAutoLoc;
	private String siUser1;
	private String siUser2;
	private String siChr01;
	private String siChr02;
	private String siChr03;
	private String siChr04;
	private String siChr05;
	private Date siDte01;
	private Date siDte02;
	private Double siDec01;
	private Double siDec02;
	private Boolean siLog01;
	private String siGlSet;
	private String siDb;
	private String siXferAcct;
	private String siCurSet;
	private String siXferCc;
	private String siGitAcct;
	private String siGitCc;
	private String siCanrun;
	private Boolean siExtVd;
	private String siBtbVend;
	private String siGitSub;
	private String siXferSub;
	private String siDecl;
	private Boolean siXferOwnership;
	private String siGitLocation;
	private Boolean siType;
	private Double oidSiMstr;

	// Constructors

	/** default constructor */
	public AbstractSiMstr() {
	}

	/** minimal constructor */
	public AbstractSiMstr(SiMstrId id, String siDb, String siGitAcct,
			String siGitCc, Boolean siExtVd, String siBtbVend, String siDecl,
			Boolean siXferOwnership, String siGitLocation, Boolean siType,
			Double oidSiMstr) {
		this.id = id;
		this.siDb = siDb;
		this.siGitAcct = siGitAcct;
		this.siGitCc = siGitCc;
		this.siExtVd = siExtVd;
		this.siBtbVend = siBtbVend;
		this.siDecl = siDecl;
		this.siXferOwnership = siXferOwnership;
		this.siGitLocation = siGitLocation;
		this.siType = siType;
		this.oidSiMstr = oidSiMstr;
	}

	/** full constructor */
	public AbstractSiMstr(SiMstrId id, String siDesc, String siEntity,
			String siStatus, Boolean siAutoLoc, String siUser1, String siUser2,
			String siChr01, String siChr02, String siChr03, String siChr04,
			String siChr05, Date siDte01, Date siDte02, Double siDec01,
			Double siDec02, Boolean siLog01, String siGlSet, String siDb,
			String siXferAcct, String siCurSet, String siXferCc,
			String siGitAcct, String siGitCc, String siCanrun, Boolean siExtVd,
			String siBtbVend, String siGitSub, String siXferSub, String siDecl,
			Boolean siXferOwnership, String siGitLocation, Boolean siType,
			Double oidSiMstr) {
		this.id = id;
		this.siDesc = siDesc;
		this.siEntity = siEntity;
		this.siStatus = siStatus;
		this.siAutoLoc = siAutoLoc;
		this.siUser1 = siUser1;
		this.siUser2 = siUser2;
		this.siChr01 = siChr01;
		this.siChr02 = siChr02;
		this.siChr03 = siChr03;
		this.siChr04 = siChr04;
		this.siChr05 = siChr05;
		this.siDte01 = siDte01;
		this.siDte02 = siDte02;
		this.siDec01 = siDec01;
		this.siDec02 = siDec02;
		this.siLog01 = siLog01;
		this.siGlSet = siGlSet;
		this.siDb = siDb;
		this.siXferAcct = siXferAcct;
		this.siCurSet = siCurSet;
		this.siXferCc = siXferCc;
		this.siGitAcct = siGitAcct;
		this.siGitCc = siGitCc;
		this.siCanrun = siCanrun;
		this.siExtVd = siExtVd;
		this.siBtbVend = siBtbVend;
		this.siGitSub = siGitSub;
		this.siXferSub = siXferSub;
		this.siDecl = siDecl;
		this.siXferOwnership = siXferOwnership;
		this.siGitLocation = siGitLocation;
		this.siType = siType;
		this.oidSiMstr = oidSiMstr;
	}

	// Property accessors

	public SiMstrId getId() {
		return this.id;
	}

	public void setId(SiMstrId id) {
		this.id = id;
	}

	public String getSiDesc() {
		return this.siDesc;
	}

	public void setSiDesc(String siDesc) {
		this.siDesc = siDesc;
	}

	public String getSiEntity() {
		return this.siEntity;
	}

	public void setSiEntity(String siEntity) {
		this.siEntity = siEntity;
	}

	public String getSiStatus() {
		return this.siStatus;
	}

	public void setSiStatus(String siStatus) {
		this.siStatus = siStatus;
	}

	public Boolean getSiAutoLoc() {
		return this.siAutoLoc;
	}

	public void setSiAutoLoc(Boolean siAutoLoc) {
		this.siAutoLoc = siAutoLoc;
	}

	public String getSiUser1() {
		return this.siUser1;
	}

	public void setSiUser1(String siUser1) {
		this.siUser1 = siUser1;
	}

	public String getSiUser2() {
		return this.siUser2;
	}

	public void setSiUser2(String siUser2) {
		this.siUser2 = siUser2;
	}

	public String getSiChr01() {
		return this.siChr01;
	}

	public void setSiChr01(String siChr01) {
		this.siChr01 = siChr01;
	}

	public String getSiChr02() {
		return this.siChr02;
	}

	public void setSiChr02(String siChr02) {
		this.siChr02 = siChr02;
	}

	public String getSiChr03() {
		return this.siChr03;
	}

	public void setSiChr03(String siChr03) {
		this.siChr03 = siChr03;
	}

	public String getSiChr04() {
		return this.siChr04;
	}

	public void setSiChr04(String siChr04) {
		this.siChr04 = siChr04;
	}

	public String getSiChr05() {
		return this.siChr05;
	}

	public void setSiChr05(String siChr05) {
		this.siChr05 = siChr05;
	}

	public Date getSiDte01() {
		return this.siDte01;
	}

	public void setSiDte01(Date siDte01) {
		this.siDte01 = siDte01;
	}

	public Date getSiDte02() {
		return this.siDte02;
	}

	public void setSiDte02(Date siDte02) {
		this.siDte02 = siDte02;
	}

	public Double getSiDec01() {
		return this.siDec01;
	}

	public void setSiDec01(Double siDec01) {
		this.siDec01 = siDec01;
	}

	public Double getSiDec02() {
		return this.siDec02;
	}

	public void setSiDec02(Double siDec02) {
		this.siDec02 = siDec02;
	}

	public Boolean getSiLog01() {
		return this.siLog01;
	}

	public void setSiLog01(Boolean siLog01) {
		this.siLog01 = siLog01;
	}

	public String getSiGlSet() {
		return this.siGlSet;
	}

	public void setSiGlSet(String siGlSet) {
		this.siGlSet = siGlSet;
	}

	public String getSiDb() {
		return this.siDb;
	}

	public void setSiDb(String siDb) {
		this.siDb = siDb;
	}

	public String getSiXferAcct() {
		return this.siXferAcct;
	}

	public void setSiXferAcct(String siXferAcct) {
		this.siXferAcct = siXferAcct;
	}

	public String getSiCurSet() {
		return this.siCurSet;
	}

	public void setSiCurSet(String siCurSet) {
		this.siCurSet = siCurSet;
	}

	public String getSiXferCc() {
		return this.siXferCc;
	}

	public void setSiXferCc(String siXferCc) {
		this.siXferCc = siXferCc;
	}

	public String getSiGitAcct() {
		return this.siGitAcct;
	}

	public void setSiGitAcct(String siGitAcct) {
		this.siGitAcct = siGitAcct;
	}

	public String getSiGitCc() {
		return this.siGitCc;
	}

	public void setSiGitCc(String siGitCc) {
		this.siGitCc = siGitCc;
	}

	public String getSiCanrun() {
		return this.siCanrun;
	}

	public void setSiCanrun(String siCanrun) {
		this.siCanrun = siCanrun;
	}

	public Boolean getSiExtVd() {
		return this.siExtVd;
	}

	public void setSiExtVd(Boolean siExtVd) {
		this.siExtVd = siExtVd;
	}

	public String getSiBtbVend() {
		return this.siBtbVend;
	}

	public void setSiBtbVend(String siBtbVend) {
		this.siBtbVend = siBtbVend;
	}

	public String getSiGitSub() {
		return this.siGitSub;
	}

	public void setSiGitSub(String siGitSub) {
		this.siGitSub = siGitSub;
	}

	public String getSiXferSub() {
		return this.siXferSub;
	}

	public void setSiXferSub(String siXferSub) {
		this.siXferSub = siXferSub;
	}

	public String getSiDecl() {
		return this.siDecl;
	}

	public void setSiDecl(String siDecl) {
		this.siDecl = siDecl;
	}

	public Boolean getSiXferOwnership() {
		return this.siXferOwnership;
	}

	public void setSiXferOwnership(Boolean siXferOwnership) {
		this.siXferOwnership = siXferOwnership;
	}

	public String getSiGitLocation() {
		return this.siGitLocation;
	}

	public void setSiGitLocation(String siGitLocation) {
		this.siGitLocation = siGitLocation;
	}

	public Boolean getSiType() {
		return this.siType;
	}

	public void setSiType(Boolean siType) {
		this.siType = siType;
	}

	public Double getOidSiMstr() {
		return this.oidSiMstr;
	}

	public void setOidSiMstr(Double oidSiMstr) {
		this.oidSiMstr = oidSiMstr;
	}

}