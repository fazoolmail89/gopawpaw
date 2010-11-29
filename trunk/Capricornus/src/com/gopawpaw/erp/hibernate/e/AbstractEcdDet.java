package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcdDet entity provides the base persistence definition of the EcdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcdDet implements java.io.Serializable {

	// Fields

	private EcdDetId id;
	private String ecdOldRev;
	private String ecdNewRev;
	private Date ecdStart;
	private Date ecdEnd;
	private String ecdUser1;
	private String ecdUser2;
	private Integer ecdCmtindx;
	private String ecdInvDspn;
	private String ecdProdline;
	private String ecdGroup;
	private String ecdStatus;
	private String ecdDraw;
	private String ecdPartType;
	private String ecdDsgnGrp;
	private String ecdDrwgLoc;
	private String ecdDrwgSize;
	private String ecdProcess;
	private Boolean ecdQad01;
	private Date ecdQad02;
	private String ecdQad03;
	private String ecdQad04;
	private String ecdQad05;
	private Date ecdModDate;
	private String ecdUserid;
	private Double oidEcdDet;
	private String ecdBreakCat;

	// Constructors

	/** default constructor */
	public AbstractEcdDet() {
	}

	/** minimal constructor */
	public AbstractEcdDet(EcdDetId id, Double oidEcdDet, String ecdBreakCat) {
		this.id = id;
		this.oidEcdDet = oidEcdDet;
		this.ecdBreakCat = ecdBreakCat;
	}

	/** full constructor */
	public AbstractEcdDet(EcdDetId id, String ecdOldRev, String ecdNewRev,
			Date ecdStart, Date ecdEnd, String ecdUser1, String ecdUser2,
			Integer ecdCmtindx, String ecdInvDspn, String ecdProdline,
			String ecdGroup, String ecdStatus, String ecdDraw,
			String ecdPartType, String ecdDsgnGrp, String ecdDrwgLoc,
			String ecdDrwgSize, String ecdProcess, Boolean ecdQad01,
			Date ecdQad02, String ecdQad03, String ecdQad04, String ecdQad05,
			Date ecdModDate, String ecdUserid, Double oidEcdDet,
			String ecdBreakCat) {
		this.id = id;
		this.ecdOldRev = ecdOldRev;
		this.ecdNewRev = ecdNewRev;
		this.ecdStart = ecdStart;
		this.ecdEnd = ecdEnd;
		this.ecdUser1 = ecdUser1;
		this.ecdUser2 = ecdUser2;
		this.ecdCmtindx = ecdCmtindx;
		this.ecdInvDspn = ecdInvDspn;
		this.ecdProdline = ecdProdline;
		this.ecdGroup = ecdGroup;
		this.ecdStatus = ecdStatus;
		this.ecdDraw = ecdDraw;
		this.ecdPartType = ecdPartType;
		this.ecdDsgnGrp = ecdDsgnGrp;
		this.ecdDrwgLoc = ecdDrwgLoc;
		this.ecdDrwgSize = ecdDrwgSize;
		this.ecdProcess = ecdProcess;
		this.ecdQad01 = ecdQad01;
		this.ecdQad02 = ecdQad02;
		this.ecdQad03 = ecdQad03;
		this.ecdQad04 = ecdQad04;
		this.ecdQad05 = ecdQad05;
		this.ecdModDate = ecdModDate;
		this.ecdUserid = ecdUserid;
		this.oidEcdDet = oidEcdDet;
		this.ecdBreakCat = ecdBreakCat;
	}

	// Property accessors

	public EcdDetId getId() {
		return this.id;
	}

	public void setId(EcdDetId id) {
		this.id = id;
	}

	public String getEcdOldRev() {
		return this.ecdOldRev;
	}

	public void setEcdOldRev(String ecdOldRev) {
		this.ecdOldRev = ecdOldRev;
	}

	public String getEcdNewRev() {
		return this.ecdNewRev;
	}

	public void setEcdNewRev(String ecdNewRev) {
		this.ecdNewRev = ecdNewRev;
	}

	public Date getEcdStart() {
		return this.ecdStart;
	}

	public void setEcdStart(Date ecdStart) {
		this.ecdStart = ecdStart;
	}

	public Date getEcdEnd() {
		return this.ecdEnd;
	}

	public void setEcdEnd(Date ecdEnd) {
		this.ecdEnd = ecdEnd;
	}

	public String getEcdUser1() {
		return this.ecdUser1;
	}

	public void setEcdUser1(String ecdUser1) {
		this.ecdUser1 = ecdUser1;
	}

	public String getEcdUser2() {
		return this.ecdUser2;
	}

	public void setEcdUser2(String ecdUser2) {
		this.ecdUser2 = ecdUser2;
	}

	public Integer getEcdCmtindx() {
		return this.ecdCmtindx;
	}

	public void setEcdCmtindx(Integer ecdCmtindx) {
		this.ecdCmtindx = ecdCmtindx;
	}

	public String getEcdInvDspn() {
		return this.ecdInvDspn;
	}

	public void setEcdInvDspn(String ecdInvDspn) {
		this.ecdInvDspn = ecdInvDspn;
	}

	public String getEcdProdline() {
		return this.ecdProdline;
	}

	public void setEcdProdline(String ecdProdline) {
		this.ecdProdline = ecdProdline;
	}

	public String getEcdGroup() {
		return this.ecdGroup;
	}

	public void setEcdGroup(String ecdGroup) {
		this.ecdGroup = ecdGroup;
	}

	public String getEcdStatus() {
		return this.ecdStatus;
	}

	public void setEcdStatus(String ecdStatus) {
		this.ecdStatus = ecdStatus;
	}

	public String getEcdDraw() {
		return this.ecdDraw;
	}

	public void setEcdDraw(String ecdDraw) {
		this.ecdDraw = ecdDraw;
	}

	public String getEcdPartType() {
		return this.ecdPartType;
	}

	public void setEcdPartType(String ecdPartType) {
		this.ecdPartType = ecdPartType;
	}

	public String getEcdDsgnGrp() {
		return this.ecdDsgnGrp;
	}

	public void setEcdDsgnGrp(String ecdDsgnGrp) {
		this.ecdDsgnGrp = ecdDsgnGrp;
	}

	public String getEcdDrwgLoc() {
		return this.ecdDrwgLoc;
	}

	public void setEcdDrwgLoc(String ecdDrwgLoc) {
		this.ecdDrwgLoc = ecdDrwgLoc;
	}

	public String getEcdDrwgSize() {
		return this.ecdDrwgSize;
	}

	public void setEcdDrwgSize(String ecdDrwgSize) {
		this.ecdDrwgSize = ecdDrwgSize;
	}

	public String getEcdProcess() {
		return this.ecdProcess;
	}

	public void setEcdProcess(String ecdProcess) {
		this.ecdProcess = ecdProcess;
	}

	public Boolean getEcdQad01() {
		return this.ecdQad01;
	}

	public void setEcdQad01(Boolean ecdQad01) {
		this.ecdQad01 = ecdQad01;
	}

	public Date getEcdQad02() {
		return this.ecdQad02;
	}

	public void setEcdQad02(Date ecdQad02) {
		this.ecdQad02 = ecdQad02;
	}

	public String getEcdQad03() {
		return this.ecdQad03;
	}

	public void setEcdQad03(String ecdQad03) {
		this.ecdQad03 = ecdQad03;
	}

	public String getEcdQad04() {
		return this.ecdQad04;
	}

	public void setEcdQad04(String ecdQad04) {
		this.ecdQad04 = ecdQad04;
	}

	public String getEcdQad05() {
		return this.ecdQad05;
	}

	public void setEcdQad05(String ecdQad05) {
		this.ecdQad05 = ecdQad05;
	}

	public Date getEcdModDate() {
		return this.ecdModDate;
	}

	public void setEcdModDate(Date ecdModDate) {
		this.ecdModDate = ecdModDate;
	}

	public String getEcdUserid() {
		return this.ecdUserid;
	}

	public void setEcdUserid(String ecdUserid) {
		this.ecdUserid = ecdUserid;
	}

	public Double getOidEcdDet() {
		return this.oidEcdDet;
	}

	public void setOidEcdDet(Double oidEcdDet) {
		this.oidEcdDet = oidEcdDet;
	}

	public String getEcdBreakCat() {
		return this.ecdBreakCat;
	}

	public void setEcdBreakCat(String ecdBreakCat) {
		this.ecdBreakCat = ecdBreakCat;
	}

}