package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbiMstr entity provides the base persistence definition of the
 * KnbiMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbiMstr implements java.io.Serializable {

	// Fields

	private KnbiMstrId id;
	private Double knbiKeyid;
	private String knbiRouting;
	private String knbiBomCode;
	private Date knbiModDate;
	private String knbiModUserid;
	private String knbiUser1;
	private String knbiUser2;
	private String knbiQadc01;
	private String knbiQadc02;
	private Integer knbiCmtindx;
	private Double knbiMinEpeInterval;
	private String knbiRunOutMaterial;
	private Integer knbiRunOutOption;
	private Double knbiRunOutQtyPer;
	private String knbiRunOutQtyperUm;
	private Double knbiRunOutQuantity;
	private String knbiRunOutQtyUm;
	private Double knbiRunOutSetup;
	private Integer knbiAvgInvMethod;
	private Double knbiCostAlloc;
	private String knbiContType;
	private Double knbiUmConv;
	private Double oidKnbiMstr;

	// Constructors

	/** default constructor */
	public AbstractKnbiMstr() {
	}

	/** full constructor */
	public AbstractKnbiMstr(KnbiMstrId id, Double knbiKeyid,
			String knbiRouting, String knbiBomCode, Date knbiModDate,
			String knbiModUserid, String knbiUser1, String knbiUser2,
			String knbiQadc01, String knbiQadc02, Integer knbiCmtindx,
			Double knbiMinEpeInterval, String knbiRunOutMaterial,
			Integer knbiRunOutOption, Double knbiRunOutQtyPer,
			String knbiRunOutQtyperUm, Double knbiRunOutQuantity,
			String knbiRunOutQtyUm, Double knbiRunOutSetup,
			Integer knbiAvgInvMethod, Double knbiCostAlloc,
			String knbiContType, Double knbiUmConv, Double oidKnbiMstr) {
		this.id = id;
		this.knbiKeyid = knbiKeyid;
		this.knbiRouting = knbiRouting;
		this.knbiBomCode = knbiBomCode;
		this.knbiModDate = knbiModDate;
		this.knbiModUserid = knbiModUserid;
		this.knbiUser1 = knbiUser1;
		this.knbiUser2 = knbiUser2;
		this.knbiQadc01 = knbiQadc01;
		this.knbiQadc02 = knbiQadc02;
		this.knbiCmtindx = knbiCmtindx;
		this.knbiMinEpeInterval = knbiMinEpeInterval;
		this.knbiRunOutMaterial = knbiRunOutMaterial;
		this.knbiRunOutOption = knbiRunOutOption;
		this.knbiRunOutQtyPer = knbiRunOutQtyPer;
		this.knbiRunOutQtyperUm = knbiRunOutQtyperUm;
		this.knbiRunOutQuantity = knbiRunOutQuantity;
		this.knbiRunOutQtyUm = knbiRunOutQtyUm;
		this.knbiRunOutSetup = knbiRunOutSetup;
		this.knbiAvgInvMethod = knbiAvgInvMethod;
		this.knbiCostAlloc = knbiCostAlloc;
		this.knbiContType = knbiContType;
		this.knbiUmConv = knbiUmConv;
		this.oidKnbiMstr = oidKnbiMstr;
	}

	// Property accessors

	public KnbiMstrId getId() {
		return this.id;
	}

	public void setId(KnbiMstrId id) {
		this.id = id;
	}

	public Double getKnbiKeyid() {
		return this.knbiKeyid;
	}

	public void setKnbiKeyid(Double knbiKeyid) {
		this.knbiKeyid = knbiKeyid;
	}

	public String getKnbiRouting() {
		return this.knbiRouting;
	}

	public void setKnbiRouting(String knbiRouting) {
		this.knbiRouting = knbiRouting;
	}

	public String getKnbiBomCode() {
		return this.knbiBomCode;
	}

	public void setKnbiBomCode(String knbiBomCode) {
		this.knbiBomCode = knbiBomCode;
	}

	public Date getKnbiModDate() {
		return this.knbiModDate;
	}

	public void setKnbiModDate(Date knbiModDate) {
		this.knbiModDate = knbiModDate;
	}

	public String getKnbiModUserid() {
		return this.knbiModUserid;
	}

	public void setKnbiModUserid(String knbiModUserid) {
		this.knbiModUserid = knbiModUserid;
	}

	public String getKnbiUser1() {
		return this.knbiUser1;
	}

	public void setKnbiUser1(String knbiUser1) {
		this.knbiUser1 = knbiUser1;
	}

	public String getKnbiUser2() {
		return this.knbiUser2;
	}

	public void setKnbiUser2(String knbiUser2) {
		this.knbiUser2 = knbiUser2;
	}

	public String getKnbiQadc01() {
		return this.knbiQadc01;
	}

	public void setKnbiQadc01(String knbiQadc01) {
		this.knbiQadc01 = knbiQadc01;
	}

	public String getKnbiQadc02() {
		return this.knbiQadc02;
	}

	public void setKnbiQadc02(String knbiQadc02) {
		this.knbiQadc02 = knbiQadc02;
	}

	public Integer getKnbiCmtindx() {
		return this.knbiCmtindx;
	}

	public void setKnbiCmtindx(Integer knbiCmtindx) {
		this.knbiCmtindx = knbiCmtindx;
	}

	public Double getKnbiMinEpeInterval() {
		return this.knbiMinEpeInterval;
	}

	public void setKnbiMinEpeInterval(Double knbiMinEpeInterval) {
		this.knbiMinEpeInterval = knbiMinEpeInterval;
	}

	public String getKnbiRunOutMaterial() {
		return this.knbiRunOutMaterial;
	}

	public void setKnbiRunOutMaterial(String knbiRunOutMaterial) {
		this.knbiRunOutMaterial = knbiRunOutMaterial;
	}

	public Integer getKnbiRunOutOption() {
		return this.knbiRunOutOption;
	}

	public void setKnbiRunOutOption(Integer knbiRunOutOption) {
		this.knbiRunOutOption = knbiRunOutOption;
	}

	public Double getKnbiRunOutQtyPer() {
		return this.knbiRunOutQtyPer;
	}

	public void setKnbiRunOutQtyPer(Double knbiRunOutQtyPer) {
		this.knbiRunOutQtyPer = knbiRunOutQtyPer;
	}

	public String getKnbiRunOutQtyperUm() {
		return this.knbiRunOutQtyperUm;
	}

	public void setKnbiRunOutQtyperUm(String knbiRunOutQtyperUm) {
		this.knbiRunOutQtyperUm = knbiRunOutQtyperUm;
	}

	public Double getKnbiRunOutQuantity() {
		return this.knbiRunOutQuantity;
	}

	public void setKnbiRunOutQuantity(Double knbiRunOutQuantity) {
		this.knbiRunOutQuantity = knbiRunOutQuantity;
	}

	public String getKnbiRunOutQtyUm() {
		return this.knbiRunOutQtyUm;
	}

	public void setKnbiRunOutQtyUm(String knbiRunOutQtyUm) {
		this.knbiRunOutQtyUm = knbiRunOutQtyUm;
	}

	public Double getKnbiRunOutSetup() {
		return this.knbiRunOutSetup;
	}

	public void setKnbiRunOutSetup(Double knbiRunOutSetup) {
		this.knbiRunOutSetup = knbiRunOutSetup;
	}

	public Integer getKnbiAvgInvMethod() {
		return this.knbiAvgInvMethod;
	}

	public void setKnbiAvgInvMethod(Integer knbiAvgInvMethod) {
		this.knbiAvgInvMethod = knbiAvgInvMethod;
	}

	public Double getKnbiCostAlloc() {
		return this.knbiCostAlloc;
	}

	public void setKnbiCostAlloc(Double knbiCostAlloc) {
		this.knbiCostAlloc = knbiCostAlloc;
	}

	public String getKnbiContType() {
		return this.knbiContType;
	}

	public void setKnbiContType(String knbiContType) {
		this.knbiContType = knbiContType;
	}

	public Double getKnbiUmConv() {
		return this.knbiUmConv;
	}

	public void setKnbiUmConv(Double knbiUmConv) {
		this.knbiUmConv = knbiUmConv;
	}

	public Double getOidKnbiMstr() {
		return this.oidKnbiMstr;
	}

	public void setOidKnbiMstr(Double oidKnbiMstr) {
		this.oidKnbiMstr = oidKnbiMstr;
	}

}