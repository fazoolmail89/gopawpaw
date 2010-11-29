package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSapDet entity provides the base persistence definition of the SapDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSapDet implements java.io.Serializable {

	// Fields

	private SapDetId id;
	private Date sapActDate;
	private String sapCaNbr;
	private String sapDesc;
	private String sapBomType;
	private String sapUser1;
	private String sapUser2;
	private Boolean sapConfirmed;
	private String sapGroup;
	private Boolean sapMrp;
	private String sapAssign;
	private String sapModUserid;
	private Date sapModDate;
	private String sapQadc01;
	private String sapQadc02;
	private Date sapQadd01;
	private Date sapQadd02;
	private Boolean sapQadl01;
	private Boolean sapQadl02;
	private Integer sapQadi01;
	private Integer sapQadi02;
	private Double oidSapDet;

	// Constructors

	/** default constructor */
	public AbstractSapDet() {
	}

	/** minimal constructor */
	public AbstractSapDet(SapDetId id, Double oidSapDet) {
		this.id = id;
		this.oidSapDet = oidSapDet;
	}

	/** full constructor */
	public AbstractSapDet(SapDetId id, Date sapActDate, String sapCaNbr,
			String sapDesc, String sapBomType, String sapUser1,
			String sapUser2, Boolean sapConfirmed, String sapGroup,
			Boolean sapMrp, String sapAssign, String sapModUserid,
			Date sapModDate, String sapQadc01, String sapQadc02,
			Date sapQadd01, Date sapQadd02, Boolean sapQadl01,
			Boolean sapQadl02, Integer sapQadi01, Integer sapQadi02,
			Double oidSapDet) {
		this.id = id;
		this.sapActDate = sapActDate;
		this.sapCaNbr = sapCaNbr;
		this.sapDesc = sapDesc;
		this.sapBomType = sapBomType;
		this.sapUser1 = sapUser1;
		this.sapUser2 = sapUser2;
		this.sapConfirmed = sapConfirmed;
		this.sapGroup = sapGroup;
		this.sapMrp = sapMrp;
		this.sapAssign = sapAssign;
		this.sapModUserid = sapModUserid;
		this.sapModDate = sapModDate;
		this.sapQadc01 = sapQadc01;
		this.sapQadc02 = sapQadc02;
		this.sapQadd01 = sapQadd01;
		this.sapQadd02 = sapQadd02;
		this.sapQadl01 = sapQadl01;
		this.sapQadl02 = sapQadl02;
		this.sapQadi01 = sapQadi01;
		this.sapQadi02 = sapQadi02;
		this.oidSapDet = oidSapDet;
	}

	// Property accessors

	public SapDetId getId() {
		return this.id;
	}

	public void setId(SapDetId id) {
		this.id = id;
	}

	public Date getSapActDate() {
		return this.sapActDate;
	}

	public void setSapActDate(Date sapActDate) {
		this.sapActDate = sapActDate;
	}

	public String getSapCaNbr() {
		return this.sapCaNbr;
	}

	public void setSapCaNbr(String sapCaNbr) {
		this.sapCaNbr = sapCaNbr;
	}

	public String getSapDesc() {
		return this.sapDesc;
	}

	public void setSapDesc(String sapDesc) {
		this.sapDesc = sapDesc;
	}

	public String getSapBomType() {
		return this.sapBomType;
	}

	public void setSapBomType(String sapBomType) {
		this.sapBomType = sapBomType;
	}

	public String getSapUser1() {
		return this.sapUser1;
	}

	public void setSapUser1(String sapUser1) {
		this.sapUser1 = sapUser1;
	}

	public String getSapUser2() {
		return this.sapUser2;
	}

	public void setSapUser2(String sapUser2) {
		this.sapUser2 = sapUser2;
	}

	public Boolean getSapConfirmed() {
		return this.sapConfirmed;
	}

	public void setSapConfirmed(Boolean sapConfirmed) {
		this.sapConfirmed = sapConfirmed;
	}

	public String getSapGroup() {
		return this.sapGroup;
	}

	public void setSapGroup(String sapGroup) {
		this.sapGroup = sapGroup;
	}

	public Boolean getSapMrp() {
		return this.sapMrp;
	}

	public void setSapMrp(Boolean sapMrp) {
		this.sapMrp = sapMrp;
	}

	public String getSapAssign() {
		return this.sapAssign;
	}

	public void setSapAssign(String sapAssign) {
		this.sapAssign = sapAssign;
	}

	public String getSapModUserid() {
		return this.sapModUserid;
	}

	public void setSapModUserid(String sapModUserid) {
		this.sapModUserid = sapModUserid;
	}

	public Date getSapModDate() {
		return this.sapModDate;
	}

	public void setSapModDate(Date sapModDate) {
		this.sapModDate = sapModDate;
	}

	public String getSapQadc01() {
		return this.sapQadc01;
	}

	public void setSapQadc01(String sapQadc01) {
		this.sapQadc01 = sapQadc01;
	}

	public String getSapQadc02() {
		return this.sapQadc02;
	}

	public void setSapQadc02(String sapQadc02) {
		this.sapQadc02 = sapQadc02;
	}

	public Date getSapQadd01() {
		return this.sapQadd01;
	}

	public void setSapQadd01(Date sapQadd01) {
		this.sapQadd01 = sapQadd01;
	}

	public Date getSapQadd02() {
		return this.sapQadd02;
	}

	public void setSapQadd02(Date sapQadd02) {
		this.sapQadd02 = sapQadd02;
	}

	public Boolean getSapQadl01() {
		return this.sapQadl01;
	}

	public void setSapQadl01(Boolean sapQadl01) {
		this.sapQadl01 = sapQadl01;
	}

	public Boolean getSapQadl02() {
		return this.sapQadl02;
	}

	public void setSapQadl02(Boolean sapQadl02) {
		this.sapQadl02 = sapQadl02;
	}

	public Integer getSapQadi01() {
		return this.sapQadi01;
	}

	public void setSapQadi01(Integer sapQadi01) {
		this.sapQadi01 = sapQadi01;
	}

	public Integer getSapQadi02() {
		return this.sapQadi02;
	}

	public void setSapQadi02(Integer sapQadi02) {
		this.sapQadi02 = sapQadi02;
	}

	public Double getOidSapDet() {
		return this.oidSapDet;
	}

	public void setOidSapDet(Double oidSapDet) {
		this.oidSapDet = oidSapDet;
	}

}