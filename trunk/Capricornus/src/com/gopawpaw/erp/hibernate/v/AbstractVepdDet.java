package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVepdDet entity provides the base persistence definition of the
 * VepdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVepdDet implements java.io.Serializable {

	// Fields

	private VepdDetId id;
	private String vepdCategory;
	private Date vepdVepTranDate;
	private Integer vepdVepTranId;
	private Integer vepdSeqNbr;
	private String vepdEvent;
	private String vepdWeightCode;
	private Integer vepdCmtindx;
	private Double vepdEventQty;
	private String vepdReasonCode;
	private String vepdDocNbr;
	private Boolean vepdTempMissedFlag;
	private String vepdModUserid;
	private Date vepdModDate;
	private String vepdUser1;
	private String vepdUser2;
	private String vepdUser3;
	private String vepdUser4;
	private String vepdQadc01;
	private String vepdQadc02;
	private String vepdQadc03;
	private String vepdQadc04;
	private Double vepdQadd01;
	private Double vepdQadd02;
	private Boolean vepdQadl01;
	private Boolean vepdQadl02;
	private Date vepdQadt01;
	private Date vepdQadt02;
	private Integer vepdQadi01;
	private Integer vepdQadi02;
	private Double oidVepdDet;

	// Constructors

	/** default constructor */
	public AbstractVepdDet() {
	}

	/** minimal constructor */
	public AbstractVepdDet(VepdDetId id, Double oidVepdDet) {
		this.id = id;
		this.oidVepdDet = oidVepdDet;
	}

	/** full constructor */
	public AbstractVepdDet(VepdDetId id, String vepdCategory,
			Date vepdVepTranDate, Integer vepdVepTranId, Integer vepdSeqNbr,
			String vepdEvent, String vepdWeightCode, Integer vepdCmtindx,
			Double vepdEventQty, String vepdReasonCode, String vepdDocNbr,
			Boolean vepdTempMissedFlag, String vepdModUserid, Date vepdModDate,
			String vepdUser1, String vepdUser2, String vepdUser3,
			String vepdUser4, String vepdQadc01, String vepdQadc02,
			String vepdQadc03, String vepdQadc04, Double vepdQadd01,
			Double vepdQadd02, Boolean vepdQadl01, Boolean vepdQadl02,
			Date vepdQadt01, Date vepdQadt02, Integer vepdQadi01,
			Integer vepdQadi02, Double oidVepdDet) {
		this.id = id;
		this.vepdCategory = vepdCategory;
		this.vepdVepTranDate = vepdVepTranDate;
		this.vepdVepTranId = vepdVepTranId;
		this.vepdSeqNbr = vepdSeqNbr;
		this.vepdEvent = vepdEvent;
		this.vepdWeightCode = vepdWeightCode;
		this.vepdCmtindx = vepdCmtindx;
		this.vepdEventQty = vepdEventQty;
		this.vepdReasonCode = vepdReasonCode;
		this.vepdDocNbr = vepdDocNbr;
		this.vepdTempMissedFlag = vepdTempMissedFlag;
		this.vepdModUserid = vepdModUserid;
		this.vepdModDate = vepdModDate;
		this.vepdUser1 = vepdUser1;
		this.vepdUser2 = vepdUser2;
		this.vepdUser3 = vepdUser3;
		this.vepdUser4 = vepdUser4;
		this.vepdQadc01 = vepdQadc01;
		this.vepdQadc02 = vepdQadc02;
		this.vepdQadc03 = vepdQadc03;
		this.vepdQadc04 = vepdQadc04;
		this.vepdQadd01 = vepdQadd01;
		this.vepdQadd02 = vepdQadd02;
		this.vepdQadl01 = vepdQadl01;
		this.vepdQadl02 = vepdQadl02;
		this.vepdQadt01 = vepdQadt01;
		this.vepdQadt02 = vepdQadt02;
		this.vepdQadi01 = vepdQadi01;
		this.vepdQadi02 = vepdQadi02;
		this.oidVepdDet = oidVepdDet;
	}

	// Property accessors

	public VepdDetId getId() {
		return this.id;
	}

	public void setId(VepdDetId id) {
		this.id = id;
	}

	public String getVepdCategory() {
		return this.vepdCategory;
	}

	public void setVepdCategory(String vepdCategory) {
		this.vepdCategory = vepdCategory;
	}

	public Date getVepdVepTranDate() {
		return this.vepdVepTranDate;
	}

	public void setVepdVepTranDate(Date vepdVepTranDate) {
		this.vepdVepTranDate = vepdVepTranDate;
	}

	public Integer getVepdVepTranId() {
		return this.vepdVepTranId;
	}

	public void setVepdVepTranId(Integer vepdVepTranId) {
		this.vepdVepTranId = vepdVepTranId;
	}

	public Integer getVepdSeqNbr() {
		return this.vepdSeqNbr;
	}

	public void setVepdSeqNbr(Integer vepdSeqNbr) {
		this.vepdSeqNbr = vepdSeqNbr;
	}

	public String getVepdEvent() {
		return this.vepdEvent;
	}

	public void setVepdEvent(String vepdEvent) {
		this.vepdEvent = vepdEvent;
	}

	public String getVepdWeightCode() {
		return this.vepdWeightCode;
	}

	public void setVepdWeightCode(String vepdWeightCode) {
		this.vepdWeightCode = vepdWeightCode;
	}

	public Integer getVepdCmtindx() {
		return this.vepdCmtindx;
	}

	public void setVepdCmtindx(Integer vepdCmtindx) {
		this.vepdCmtindx = vepdCmtindx;
	}

	public Double getVepdEventQty() {
		return this.vepdEventQty;
	}

	public void setVepdEventQty(Double vepdEventQty) {
		this.vepdEventQty = vepdEventQty;
	}

	public String getVepdReasonCode() {
		return this.vepdReasonCode;
	}

	public void setVepdReasonCode(String vepdReasonCode) {
		this.vepdReasonCode = vepdReasonCode;
	}

	public String getVepdDocNbr() {
		return this.vepdDocNbr;
	}

	public void setVepdDocNbr(String vepdDocNbr) {
		this.vepdDocNbr = vepdDocNbr;
	}

	public Boolean getVepdTempMissedFlag() {
		return this.vepdTempMissedFlag;
	}

	public void setVepdTempMissedFlag(Boolean vepdTempMissedFlag) {
		this.vepdTempMissedFlag = vepdTempMissedFlag;
	}

	public String getVepdModUserid() {
		return this.vepdModUserid;
	}

	public void setVepdModUserid(String vepdModUserid) {
		this.vepdModUserid = vepdModUserid;
	}

	public Date getVepdModDate() {
		return this.vepdModDate;
	}

	public void setVepdModDate(Date vepdModDate) {
		this.vepdModDate = vepdModDate;
	}

	public String getVepdUser1() {
		return this.vepdUser1;
	}

	public void setVepdUser1(String vepdUser1) {
		this.vepdUser1 = vepdUser1;
	}

	public String getVepdUser2() {
		return this.vepdUser2;
	}

	public void setVepdUser2(String vepdUser2) {
		this.vepdUser2 = vepdUser2;
	}

	public String getVepdUser3() {
		return this.vepdUser3;
	}

	public void setVepdUser3(String vepdUser3) {
		this.vepdUser3 = vepdUser3;
	}

	public String getVepdUser4() {
		return this.vepdUser4;
	}

	public void setVepdUser4(String vepdUser4) {
		this.vepdUser4 = vepdUser4;
	}

	public String getVepdQadc01() {
		return this.vepdQadc01;
	}

	public void setVepdQadc01(String vepdQadc01) {
		this.vepdQadc01 = vepdQadc01;
	}

	public String getVepdQadc02() {
		return this.vepdQadc02;
	}

	public void setVepdQadc02(String vepdQadc02) {
		this.vepdQadc02 = vepdQadc02;
	}

	public String getVepdQadc03() {
		return this.vepdQadc03;
	}

	public void setVepdQadc03(String vepdQadc03) {
		this.vepdQadc03 = vepdQadc03;
	}

	public String getVepdQadc04() {
		return this.vepdQadc04;
	}

	public void setVepdQadc04(String vepdQadc04) {
		this.vepdQadc04 = vepdQadc04;
	}

	public Double getVepdQadd01() {
		return this.vepdQadd01;
	}

	public void setVepdQadd01(Double vepdQadd01) {
		this.vepdQadd01 = vepdQadd01;
	}

	public Double getVepdQadd02() {
		return this.vepdQadd02;
	}

	public void setVepdQadd02(Double vepdQadd02) {
		this.vepdQadd02 = vepdQadd02;
	}

	public Boolean getVepdQadl01() {
		return this.vepdQadl01;
	}

	public void setVepdQadl01(Boolean vepdQadl01) {
		this.vepdQadl01 = vepdQadl01;
	}

	public Boolean getVepdQadl02() {
		return this.vepdQadl02;
	}

	public void setVepdQadl02(Boolean vepdQadl02) {
		this.vepdQadl02 = vepdQadl02;
	}

	public Date getVepdQadt01() {
		return this.vepdQadt01;
	}

	public void setVepdQadt01(Date vepdQadt01) {
		this.vepdQadt01 = vepdQadt01;
	}

	public Date getVepdQadt02() {
		return this.vepdQadt02;
	}

	public void setVepdQadt02(Date vepdQadt02) {
		this.vepdQadt02 = vepdQadt02;
	}

	public Integer getVepdQadi01() {
		return this.vepdQadi01;
	}

	public void setVepdQadi01(Integer vepdQadi01) {
		this.vepdQadi01 = vepdQadi01;
	}

	public Integer getVepdQadi02() {
		return this.vepdQadi02;
	}

	public void setVepdQadi02(Integer vepdQadi02) {
		this.vepdQadi02 = vepdQadi02;
	}

	public Double getOidVepdDet() {
		return this.oidVepdDet;
	}

	public void setOidVepdDet(Double oidVepdDet) {
		this.oidVepdDet = oidVepdDet;
	}

}