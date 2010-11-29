package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIndDet entity provides the base persistence definition of the IndDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIndDet implements java.io.Serializable {

	// Fields

	private IndDetId id;
	private Double indQtyReq;
	private Double indQtyAll;
	private Double indQtyPick;
	private Double indQtyIss;
	private Double indQtyChg;
	private Double indBoChg;
	private String indLoc;
	private String indSerial;
	private Date indReqDate;
	private String indRequest;
	private String indRemarks;
	private String indProject;
	private String indType;
	private String indUm;
	private Double indUmConv;
	private Date indModDate;
	private String indUserid;
	private Integer indCmtindx;
	private String indUser1;
	private String indUser2;
	private String indChr01;
	private String indChr02;
	private String indChr03;
	private String indChr04;
	private String indChr05;
	private Date indDte01;
	private Date indDte02;
	private Double indDec01;
	private Double indDec02;
	private Boolean indLog01;
	private Double oidIndDet;

	// Constructors

	/** default constructor */
	public AbstractIndDet() {
	}

	/** minimal constructor */
	public AbstractIndDet(IndDetId id, Double oidIndDet) {
		this.id = id;
		this.oidIndDet = oidIndDet;
	}

	/** full constructor */
	public AbstractIndDet(IndDetId id, Double indQtyReq, Double indQtyAll,
			Double indQtyPick, Double indQtyIss, Double indQtyChg,
			Double indBoChg, String indLoc, String indSerial, Date indReqDate,
			String indRequest, String indRemarks, String indProject,
			String indType, String indUm, Double indUmConv, Date indModDate,
			String indUserid, Integer indCmtindx, String indUser1,
			String indUser2, String indChr01, String indChr02, String indChr03,
			String indChr04, String indChr05, Date indDte01, Date indDte02,
			Double indDec01, Double indDec02, Boolean indLog01, Double oidIndDet) {
		this.id = id;
		this.indQtyReq = indQtyReq;
		this.indQtyAll = indQtyAll;
		this.indQtyPick = indQtyPick;
		this.indQtyIss = indQtyIss;
		this.indQtyChg = indQtyChg;
		this.indBoChg = indBoChg;
		this.indLoc = indLoc;
		this.indSerial = indSerial;
		this.indReqDate = indReqDate;
		this.indRequest = indRequest;
		this.indRemarks = indRemarks;
		this.indProject = indProject;
		this.indType = indType;
		this.indUm = indUm;
		this.indUmConv = indUmConv;
		this.indModDate = indModDate;
		this.indUserid = indUserid;
		this.indCmtindx = indCmtindx;
		this.indUser1 = indUser1;
		this.indUser2 = indUser2;
		this.indChr01 = indChr01;
		this.indChr02 = indChr02;
		this.indChr03 = indChr03;
		this.indChr04 = indChr04;
		this.indChr05 = indChr05;
		this.indDte01 = indDte01;
		this.indDte02 = indDte02;
		this.indDec01 = indDec01;
		this.indDec02 = indDec02;
		this.indLog01 = indLog01;
		this.oidIndDet = oidIndDet;
	}

	// Property accessors

	public IndDetId getId() {
		return this.id;
	}

	public void setId(IndDetId id) {
		this.id = id;
	}

	public Double getIndQtyReq() {
		return this.indQtyReq;
	}

	public void setIndQtyReq(Double indQtyReq) {
		this.indQtyReq = indQtyReq;
	}

	public Double getIndQtyAll() {
		return this.indQtyAll;
	}

	public void setIndQtyAll(Double indQtyAll) {
		this.indQtyAll = indQtyAll;
	}

	public Double getIndQtyPick() {
		return this.indQtyPick;
	}

	public void setIndQtyPick(Double indQtyPick) {
		this.indQtyPick = indQtyPick;
	}

	public Double getIndQtyIss() {
		return this.indQtyIss;
	}

	public void setIndQtyIss(Double indQtyIss) {
		this.indQtyIss = indQtyIss;
	}

	public Double getIndQtyChg() {
		return this.indQtyChg;
	}

	public void setIndQtyChg(Double indQtyChg) {
		this.indQtyChg = indQtyChg;
	}

	public Double getIndBoChg() {
		return this.indBoChg;
	}

	public void setIndBoChg(Double indBoChg) {
		this.indBoChg = indBoChg;
	}

	public String getIndLoc() {
		return this.indLoc;
	}

	public void setIndLoc(String indLoc) {
		this.indLoc = indLoc;
	}

	public String getIndSerial() {
		return this.indSerial;
	}

	public void setIndSerial(String indSerial) {
		this.indSerial = indSerial;
	}

	public Date getIndReqDate() {
		return this.indReqDate;
	}

	public void setIndReqDate(Date indReqDate) {
		this.indReqDate = indReqDate;
	}

	public String getIndRequest() {
		return this.indRequest;
	}

	public void setIndRequest(String indRequest) {
		this.indRequest = indRequest;
	}

	public String getIndRemarks() {
		return this.indRemarks;
	}

	public void setIndRemarks(String indRemarks) {
		this.indRemarks = indRemarks;
	}

	public String getIndProject() {
		return this.indProject;
	}

	public void setIndProject(String indProject) {
		this.indProject = indProject;
	}

	public String getIndType() {
		return this.indType;
	}

	public void setIndType(String indType) {
		this.indType = indType;
	}

	public String getIndUm() {
		return this.indUm;
	}

	public void setIndUm(String indUm) {
		this.indUm = indUm;
	}

	public Double getIndUmConv() {
		return this.indUmConv;
	}

	public void setIndUmConv(Double indUmConv) {
		this.indUmConv = indUmConv;
	}

	public Date getIndModDate() {
		return this.indModDate;
	}

	public void setIndModDate(Date indModDate) {
		this.indModDate = indModDate;
	}

	public String getIndUserid() {
		return this.indUserid;
	}

	public void setIndUserid(String indUserid) {
		this.indUserid = indUserid;
	}

	public Integer getIndCmtindx() {
		return this.indCmtindx;
	}

	public void setIndCmtindx(Integer indCmtindx) {
		this.indCmtindx = indCmtindx;
	}

	public String getIndUser1() {
		return this.indUser1;
	}

	public void setIndUser1(String indUser1) {
		this.indUser1 = indUser1;
	}

	public String getIndUser2() {
		return this.indUser2;
	}

	public void setIndUser2(String indUser2) {
		this.indUser2 = indUser2;
	}

	public String getIndChr01() {
		return this.indChr01;
	}

	public void setIndChr01(String indChr01) {
		this.indChr01 = indChr01;
	}

	public String getIndChr02() {
		return this.indChr02;
	}

	public void setIndChr02(String indChr02) {
		this.indChr02 = indChr02;
	}

	public String getIndChr03() {
		return this.indChr03;
	}

	public void setIndChr03(String indChr03) {
		this.indChr03 = indChr03;
	}

	public String getIndChr04() {
		return this.indChr04;
	}

	public void setIndChr04(String indChr04) {
		this.indChr04 = indChr04;
	}

	public String getIndChr05() {
		return this.indChr05;
	}

	public void setIndChr05(String indChr05) {
		this.indChr05 = indChr05;
	}

	public Date getIndDte01() {
		return this.indDte01;
	}

	public void setIndDte01(Date indDte01) {
		this.indDte01 = indDte01;
	}

	public Date getIndDte02() {
		return this.indDte02;
	}

	public void setIndDte02(Date indDte02) {
		this.indDte02 = indDte02;
	}

	public Double getIndDec01() {
		return this.indDec01;
	}

	public void setIndDec01(Double indDec01) {
		this.indDec01 = indDec01;
	}

	public Double getIndDec02() {
		return this.indDec02;
	}

	public void setIndDec02(Double indDec02) {
		this.indDec02 = indDec02;
	}

	public Boolean getIndLog01() {
		return this.indLog01;
	}

	public void setIndLog01(Boolean indLog01) {
		this.indLog01 = indLog01;
	}

	public Double getOidIndDet() {
		return this.oidIndDet;
	}

	public void setOidIndDet(Double oidIndDet) {
		this.oidIndDet = oidIndDet;
	}

}