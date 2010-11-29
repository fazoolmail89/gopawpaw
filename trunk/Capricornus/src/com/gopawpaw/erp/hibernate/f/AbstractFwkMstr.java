package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFwkMstr entity provides the base persistence definition of the
 * FwkMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFwkMstr implements java.io.Serializable {

	// Fields

	private FwkMstrId id;
	private String fwkDesc;
	private String fwkEgsType;
	private String fwkFcgCode;
	private Boolean fwkFixedLabor;
	private Boolean fwkFixedPrice;
	private Boolean fwkRepairCtr;
	private String fwkChr01;
	private String fwkChr02;
	private String fwkChr03;
	private String fwkChr04;
	private Double fwkDec01;
	private Double fwkDec02;
	private Double fwkDec03;
	private Date fwkDte01;
	private Date fwkDte02;
	private Date fwkDte03;
	private Boolean fwkLog01;
	private Boolean fwkLog02;
	private Boolean fwkLog03;
	private String fwkQadc01;
	private String fwkQadc02;
	private String fwkQadc03;
	private String fwkQadc04;
	private Date fwkQadd01;
	private Date fwkQadd02;
	private Date fwkQadd03;
	private Double fwkQadde01;
	private Double fwkQadde02;
	private Double fwkQadde03;
	private Boolean fwkQadl01;
	private Boolean fwkQadl02;
	private Boolean fwkQadl03;
	private String fwkUser1;
	private String fwkUser2;
	private String fwkModUserid;
	private String fwkModDate;
	private Double oidFwkMstr;

	// Constructors

	/** default constructor */
	public AbstractFwkMstr() {
	}

	/** minimal constructor */
	public AbstractFwkMstr(FwkMstrId id, Double oidFwkMstr) {
		this.id = id;
		this.oidFwkMstr = oidFwkMstr;
	}

	/** full constructor */
	public AbstractFwkMstr(FwkMstrId id, String fwkDesc, String fwkEgsType,
			String fwkFcgCode, Boolean fwkFixedLabor, Boolean fwkFixedPrice,
			Boolean fwkRepairCtr, String fwkChr01, String fwkChr02,
			String fwkChr03, String fwkChr04, Double fwkDec01, Double fwkDec02,
			Double fwkDec03, Date fwkDte01, Date fwkDte02, Date fwkDte03,
			Boolean fwkLog01, Boolean fwkLog02, Boolean fwkLog03,
			String fwkQadc01, String fwkQadc02, String fwkQadc03,
			String fwkQadc04, Date fwkQadd01, Date fwkQadd02, Date fwkQadd03,
			Double fwkQadde01, Double fwkQadde02, Double fwkQadde03,
			Boolean fwkQadl01, Boolean fwkQadl02, Boolean fwkQadl03,
			String fwkUser1, String fwkUser2, String fwkModUserid,
			String fwkModDate, Double oidFwkMstr) {
		this.id = id;
		this.fwkDesc = fwkDesc;
		this.fwkEgsType = fwkEgsType;
		this.fwkFcgCode = fwkFcgCode;
		this.fwkFixedLabor = fwkFixedLabor;
		this.fwkFixedPrice = fwkFixedPrice;
		this.fwkRepairCtr = fwkRepairCtr;
		this.fwkChr01 = fwkChr01;
		this.fwkChr02 = fwkChr02;
		this.fwkChr03 = fwkChr03;
		this.fwkChr04 = fwkChr04;
		this.fwkDec01 = fwkDec01;
		this.fwkDec02 = fwkDec02;
		this.fwkDec03 = fwkDec03;
		this.fwkDte01 = fwkDte01;
		this.fwkDte02 = fwkDte02;
		this.fwkDte03 = fwkDte03;
		this.fwkLog01 = fwkLog01;
		this.fwkLog02 = fwkLog02;
		this.fwkLog03 = fwkLog03;
		this.fwkQadc01 = fwkQadc01;
		this.fwkQadc02 = fwkQadc02;
		this.fwkQadc03 = fwkQadc03;
		this.fwkQadc04 = fwkQadc04;
		this.fwkQadd01 = fwkQadd01;
		this.fwkQadd02 = fwkQadd02;
		this.fwkQadd03 = fwkQadd03;
		this.fwkQadde01 = fwkQadde01;
		this.fwkQadde02 = fwkQadde02;
		this.fwkQadde03 = fwkQadde03;
		this.fwkQadl01 = fwkQadl01;
		this.fwkQadl02 = fwkQadl02;
		this.fwkQadl03 = fwkQadl03;
		this.fwkUser1 = fwkUser1;
		this.fwkUser2 = fwkUser2;
		this.fwkModUserid = fwkModUserid;
		this.fwkModDate = fwkModDate;
		this.oidFwkMstr = oidFwkMstr;
	}

	// Property accessors

	public FwkMstrId getId() {
		return this.id;
	}

	public void setId(FwkMstrId id) {
		this.id = id;
	}

	public String getFwkDesc() {
		return this.fwkDesc;
	}

	public void setFwkDesc(String fwkDesc) {
		this.fwkDesc = fwkDesc;
	}

	public String getFwkEgsType() {
		return this.fwkEgsType;
	}

	public void setFwkEgsType(String fwkEgsType) {
		this.fwkEgsType = fwkEgsType;
	}

	public String getFwkFcgCode() {
		return this.fwkFcgCode;
	}

	public void setFwkFcgCode(String fwkFcgCode) {
		this.fwkFcgCode = fwkFcgCode;
	}

	public Boolean getFwkFixedLabor() {
		return this.fwkFixedLabor;
	}

	public void setFwkFixedLabor(Boolean fwkFixedLabor) {
		this.fwkFixedLabor = fwkFixedLabor;
	}

	public Boolean getFwkFixedPrice() {
		return this.fwkFixedPrice;
	}

	public void setFwkFixedPrice(Boolean fwkFixedPrice) {
		this.fwkFixedPrice = fwkFixedPrice;
	}

	public Boolean getFwkRepairCtr() {
		return this.fwkRepairCtr;
	}

	public void setFwkRepairCtr(Boolean fwkRepairCtr) {
		this.fwkRepairCtr = fwkRepairCtr;
	}

	public String getFwkChr01() {
		return this.fwkChr01;
	}

	public void setFwkChr01(String fwkChr01) {
		this.fwkChr01 = fwkChr01;
	}

	public String getFwkChr02() {
		return this.fwkChr02;
	}

	public void setFwkChr02(String fwkChr02) {
		this.fwkChr02 = fwkChr02;
	}

	public String getFwkChr03() {
		return this.fwkChr03;
	}

	public void setFwkChr03(String fwkChr03) {
		this.fwkChr03 = fwkChr03;
	}

	public String getFwkChr04() {
		return this.fwkChr04;
	}

	public void setFwkChr04(String fwkChr04) {
		this.fwkChr04 = fwkChr04;
	}

	public Double getFwkDec01() {
		return this.fwkDec01;
	}

	public void setFwkDec01(Double fwkDec01) {
		this.fwkDec01 = fwkDec01;
	}

	public Double getFwkDec02() {
		return this.fwkDec02;
	}

	public void setFwkDec02(Double fwkDec02) {
		this.fwkDec02 = fwkDec02;
	}

	public Double getFwkDec03() {
		return this.fwkDec03;
	}

	public void setFwkDec03(Double fwkDec03) {
		this.fwkDec03 = fwkDec03;
	}

	public Date getFwkDte01() {
		return this.fwkDte01;
	}

	public void setFwkDte01(Date fwkDte01) {
		this.fwkDte01 = fwkDte01;
	}

	public Date getFwkDte02() {
		return this.fwkDte02;
	}

	public void setFwkDte02(Date fwkDte02) {
		this.fwkDte02 = fwkDte02;
	}

	public Date getFwkDte03() {
		return this.fwkDte03;
	}

	public void setFwkDte03(Date fwkDte03) {
		this.fwkDte03 = fwkDte03;
	}

	public Boolean getFwkLog01() {
		return this.fwkLog01;
	}

	public void setFwkLog01(Boolean fwkLog01) {
		this.fwkLog01 = fwkLog01;
	}

	public Boolean getFwkLog02() {
		return this.fwkLog02;
	}

	public void setFwkLog02(Boolean fwkLog02) {
		this.fwkLog02 = fwkLog02;
	}

	public Boolean getFwkLog03() {
		return this.fwkLog03;
	}

	public void setFwkLog03(Boolean fwkLog03) {
		this.fwkLog03 = fwkLog03;
	}

	public String getFwkQadc01() {
		return this.fwkQadc01;
	}

	public void setFwkQadc01(String fwkQadc01) {
		this.fwkQadc01 = fwkQadc01;
	}

	public String getFwkQadc02() {
		return this.fwkQadc02;
	}

	public void setFwkQadc02(String fwkQadc02) {
		this.fwkQadc02 = fwkQadc02;
	}

	public String getFwkQadc03() {
		return this.fwkQadc03;
	}

	public void setFwkQadc03(String fwkQadc03) {
		this.fwkQadc03 = fwkQadc03;
	}

	public String getFwkQadc04() {
		return this.fwkQadc04;
	}

	public void setFwkQadc04(String fwkQadc04) {
		this.fwkQadc04 = fwkQadc04;
	}

	public Date getFwkQadd01() {
		return this.fwkQadd01;
	}

	public void setFwkQadd01(Date fwkQadd01) {
		this.fwkQadd01 = fwkQadd01;
	}

	public Date getFwkQadd02() {
		return this.fwkQadd02;
	}

	public void setFwkQadd02(Date fwkQadd02) {
		this.fwkQadd02 = fwkQadd02;
	}

	public Date getFwkQadd03() {
		return this.fwkQadd03;
	}

	public void setFwkQadd03(Date fwkQadd03) {
		this.fwkQadd03 = fwkQadd03;
	}

	public Double getFwkQadde01() {
		return this.fwkQadde01;
	}

	public void setFwkQadde01(Double fwkQadde01) {
		this.fwkQadde01 = fwkQadde01;
	}

	public Double getFwkQadde02() {
		return this.fwkQadde02;
	}

	public void setFwkQadde02(Double fwkQadde02) {
		this.fwkQadde02 = fwkQadde02;
	}

	public Double getFwkQadde03() {
		return this.fwkQadde03;
	}

	public void setFwkQadde03(Double fwkQadde03) {
		this.fwkQadde03 = fwkQadde03;
	}

	public Boolean getFwkQadl01() {
		return this.fwkQadl01;
	}

	public void setFwkQadl01(Boolean fwkQadl01) {
		this.fwkQadl01 = fwkQadl01;
	}

	public Boolean getFwkQadl02() {
		return this.fwkQadl02;
	}

	public void setFwkQadl02(Boolean fwkQadl02) {
		this.fwkQadl02 = fwkQadl02;
	}

	public Boolean getFwkQadl03() {
		return this.fwkQadl03;
	}

	public void setFwkQadl03(Boolean fwkQadl03) {
		this.fwkQadl03 = fwkQadl03;
	}

	public String getFwkUser1() {
		return this.fwkUser1;
	}

	public void setFwkUser1(String fwkUser1) {
		this.fwkUser1 = fwkUser1;
	}

	public String getFwkUser2() {
		return this.fwkUser2;
	}

	public void setFwkUser2(String fwkUser2) {
		this.fwkUser2 = fwkUser2;
	}

	public String getFwkModUserid() {
		return this.fwkModUserid;
	}

	public void setFwkModUserid(String fwkModUserid) {
		this.fwkModUserid = fwkModUserid;
	}

	public String getFwkModDate() {
		return this.fwkModDate;
	}

	public void setFwkModDate(String fwkModDate) {
		this.fwkModDate = fwkModDate;
	}

	public Double getOidFwkMstr() {
		return this.oidFwkMstr;
	}

	public void setOidFwkMstr(Double oidFwkMstr) {
		this.oidFwkMstr = oidFwkMstr;
	}

}