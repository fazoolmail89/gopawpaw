package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFpcMstr entity provides the base persistence definition of the
 * FpcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpcMstr implements java.io.Serializable {

	// Fields

	private FpcMstrId id;
	private String fpcAmt;
	private String fpcAmtType;
	private Date fpcExpire;
	private String fpcMaxPrice;
	private Double fpcMinPrice;
	private String fpcMinQty;
	private Date fpcModDate;
	private String fpcSvCode;
	private Boolean fpcTaxIn;
	private String fpcUserid;
	private String fpcChr01;
	private String fpcChr02;
	private String fpcChr03;
	private String fpcChr04;
	private Double fpcDec01;
	private Double fpcDec02;
	private Double fpcDec03;
	private Date fpcDte01;
	private Date fpcDte02;
	private Date fpcDte03;
	private Boolean fpcLog01;
	private Boolean fpcLog02;
	private Boolean fpcLog03;
	private String fpcQadc01;
	private String fpcQadc02;
	private String fpcQadc03;
	private String fpcQadc04;
	private Date fpcQadd01;
	private Date fpcQadd02;
	private Date fpcQadd03;
	private Double fpcQadde01;
	private Double fpcQadde02;
	private Double fpcQadde03;
	private Boolean fpcQadl01;
	private Boolean fpcQadl02;
	private Boolean fpcQadl03;
	private String fpcUser1;
	private String fpcUser2;
	private Double oidFpcMstr;

	// Constructors

	/** default constructor */
	public AbstractFpcMstr() {
	}

	/** minimal constructor */
	public AbstractFpcMstr(FpcMstrId id, Double oidFpcMstr) {
		this.id = id;
		this.oidFpcMstr = oidFpcMstr;
	}

	/** full constructor */
	public AbstractFpcMstr(FpcMstrId id, String fpcAmt, String fpcAmtType,
			Date fpcExpire, String fpcMaxPrice, Double fpcMinPrice,
			String fpcMinQty, Date fpcModDate, String fpcSvCode,
			Boolean fpcTaxIn, String fpcUserid, String fpcChr01,
			String fpcChr02, String fpcChr03, String fpcChr04, Double fpcDec01,
			Double fpcDec02, Double fpcDec03, Date fpcDte01, Date fpcDte02,
			Date fpcDte03, Boolean fpcLog01, Boolean fpcLog02,
			Boolean fpcLog03, String fpcQadc01, String fpcQadc02,
			String fpcQadc03, String fpcQadc04, Date fpcQadd01, Date fpcQadd02,
			Date fpcQadd03, Double fpcQadde01, Double fpcQadde02,
			Double fpcQadde03, Boolean fpcQadl01, Boolean fpcQadl02,
			Boolean fpcQadl03, String fpcUser1, String fpcUser2,
			Double oidFpcMstr) {
		this.id = id;
		this.fpcAmt = fpcAmt;
		this.fpcAmtType = fpcAmtType;
		this.fpcExpire = fpcExpire;
		this.fpcMaxPrice = fpcMaxPrice;
		this.fpcMinPrice = fpcMinPrice;
		this.fpcMinQty = fpcMinQty;
		this.fpcModDate = fpcModDate;
		this.fpcSvCode = fpcSvCode;
		this.fpcTaxIn = fpcTaxIn;
		this.fpcUserid = fpcUserid;
		this.fpcChr01 = fpcChr01;
		this.fpcChr02 = fpcChr02;
		this.fpcChr03 = fpcChr03;
		this.fpcChr04 = fpcChr04;
		this.fpcDec01 = fpcDec01;
		this.fpcDec02 = fpcDec02;
		this.fpcDec03 = fpcDec03;
		this.fpcDte01 = fpcDte01;
		this.fpcDte02 = fpcDte02;
		this.fpcDte03 = fpcDte03;
		this.fpcLog01 = fpcLog01;
		this.fpcLog02 = fpcLog02;
		this.fpcLog03 = fpcLog03;
		this.fpcQadc01 = fpcQadc01;
		this.fpcQadc02 = fpcQadc02;
		this.fpcQadc03 = fpcQadc03;
		this.fpcQadc04 = fpcQadc04;
		this.fpcQadd01 = fpcQadd01;
		this.fpcQadd02 = fpcQadd02;
		this.fpcQadd03 = fpcQadd03;
		this.fpcQadde01 = fpcQadde01;
		this.fpcQadde02 = fpcQadde02;
		this.fpcQadde03 = fpcQadde03;
		this.fpcQadl01 = fpcQadl01;
		this.fpcQadl02 = fpcQadl02;
		this.fpcQadl03 = fpcQadl03;
		this.fpcUser1 = fpcUser1;
		this.fpcUser2 = fpcUser2;
		this.oidFpcMstr = oidFpcMstr;
	}

	// Property accessors

	public FpcMstrId getId() {
		return this.id;
	}

	public void setId(FpcMstrId id) {
		this.id = id;
	}

	public String getFpcAmt() {
		return this.fpcAmt;
	}

	public void setFpcAmt(String fpcAmt) {
		this.fpcAmt = fpcAmt;
	}

	public String getFpcAmtType() {
		return this.fpcAmtType;
	}

	public void setFpcAmtType(String fpcAmtType) {
		this.fpcAmtType = fpcAmtType;
	}

	public Date getFpcExpire() {
		return this.fpcExpire;
	}

	public void setFpcExpire(Date fpcExpire) {
		this.fpcExpire = fpcExpire;
	}

	public String getFpcMaxPrice() {
		return this.fpcMaxPrice;
	}

	public void setFpcMaxPrice(String fpcMaxPrice) {
		this.fpcMaxPrice = fpcMaxPrice;
	}

	public Double getFpcMinPrice() {
		return this.fpcMinPrice;
	}

	public void setFpcMinPrice(Double fpcMinPrice) {
		this.fpcMinPrice = fpcMinPrice;
	}

	public String getFpcMinQty() {
		return this.fpcMinQty;
	}

	public void setFpcMinQty(String fpcMinQty) {
		this.fpcMinQty = fpcMinQty;
	}

	public Date getFpcModDate() {
		return this.fpcModDate;
	}

	public void setFpcModDate(Date fpcModDate) {
		this.fpcModDate = fpcModDate;
	}

	public String getFpcSvCode() {
		return this.fpcSvCode;
	}

	public void setFpcSvCode(String fpcSvCode) {
		this.fpcSvCode = fpcSvCode;
	}

	public Boolean getFpcTaxIn() {
		return this.fpcTaxIn;
	}

	public void setFpcTaxIn(Boolean fpcTaxIn) {
		this.fpcTaxIn = fpcTaxIn;
	}

	public String getFpcUserid() {
		return this.fpcUserid;
	}

	public void setFpcUserid(String fpcUserid) {
		this.fpcUserid = fpcUserid;
	}

	public String getFpcChr01() {
		return this.fpcChr01;
	}

	public void setFpcChr01(String fpcChr01) {
		this.fpcChr01 = fpcChr01;
	}

	public String getFpcChr02() {
		return this.fpcChr02;
	}

	public void setFpcChr02(String fpcChr02) {
		this.fpcChr02 = fpcChr02;
	}

	public String getFpcChr03() {
		return this.fpcChr03;
	}

	public void setFpcChr03(String fpcChr03) {
		this.fpcChr03 = fpcChr03;
	}

	public String getFpcChr04() {
		return this.fpcChr04;
	}

	public void setFpcChr04(String fpcChr04) {
		this.fpcChr04 = fpcChr04;
	}

	public Double getFpcDec01() {
		return this.fpcDec01;
	}

	public void setFpcDec01(Double fpcDec01) {
		this.fpcDec01 = fpcDec01;
	}

	public Double getFpcDec02() {
		return this.fpcDec02;
	}

	public void setFpcDec02(Double fpcDec02) {
		this.fpcDec02 = fpcDec02;
	}

	public Double getFpcDec03() {
		return this.fpcDec03;
	}

	public void setFpcDec03(Double fpcDec03) {
		this.fpcDec03 = fpcDec03;
	}

	public Date getFpcDte01() {
		return this.fpcDte01;
	}

	public void setFpcDte01(Date fpcDte01) {
		this.fpcDte01 = fpcDte01;
	}

	public Date getFpcDte02() {
		return this.fpcDte02;
	}

	public void setFpcDte02(Date fpcDte02) {
		this.fpcDte02 = fpcDte02;
	}

	public Date getFpcDte03() {
		return this.fpcDte03;
	}

	public void setFpcDte03(Date fpcDte03) {
		this.fpcDte03 = fpcDte03;
	}

	public Boolean getFpcLog01() {
		return this.fpcLog01;
	}

	public void setFpcLog01(Boolean fpcLog01) {
		this.fpcLog01 = fpcLog01;
	}

	public Boolean getFpcLog02() {
		return this.fpcLog02;
	}

	public void setFpcLog02(Boolean fpcLog02) {
		this.fpcLog02 = fpcLog02;
	}

	public Boolean getFpcLog03() {
		return this.fpcLog03;
	}

	public void setFpcLog03(Boolean fpcLog03) {
		this.fpcLog03 = fpcLog03;
	}

	public String getFpcQadc01() {
		return this.fpcQadc01;
	}

	public void setFpcQadc01(String fpcQadc01) {
		this.fpcQadc01 = fpcQadc01;
	}

	public String getFpcQadc02() {
		return this.fpcQadc02;
	}

	public void setFpcQadc02(String fpcQadc02) {
		this.fpcQadc02 = fpcQadc02;
	}

	public String getFpcQadc03() {
		return this.fpcQadc03;
	}

	public void setFpcQadc03(String fpcQadc03) {
		this.fpcQadc03 = fpcQadc03;
	}

	public String getFpcQadc04() {
		return this.fpcQadc04;
	}

	public void setFpcQadc04(String fpcQadc04) {
		this.fpcQadc04 = fpcQadc04;
	}

	public Date getFpcQadd01() {
		return this.fpcQadd01;
	}

	public void setFpcQadd01(Date fpcQadd01) {
		this.fpcQadd01 = fpcQadd01;
	}

	public Date getFpcQadd02() {
		return this.fpcQadd02;
	}

	public void setFpcQadd02(Date fpcQadd02) {
		this.fpcQadd02 = fpcQadd02;
	}

	public Date getFpcQadd03() {
		return this.fpcQadd03;
	}

	public void setFpcQadd03(Date fpcQadd03) {
		this.fpcQadd03 = fpcQadd03;
	}

	public Double getFpcQadde01() {
		return this.fpcQadde01;
	}

	public void setFpcQadde01(Double fpcQadde01) {
		this.fpcQadde01 = fpcQadde01;
	}

	public Double getFpcQadde02() {
		return this.fpcQadde02;
	}

	public void setFpcQadde02(Double fpcQadde02) {
		this.fpcQadde02 = fpcQadde02;
	}

	public Double getFpcQadde03() {
		return this.fpcQadde03;
	}

	public void setFpcQadde03(Double fpcQadde03) {
		this.fpcQadde03 = fpcQadde03;
	}

	public Boolean getFpcQadl01() {
		return this.fpcQadl01;
	}

	public void setFpcQadl01(Boolean fpcQadl01) {
		this.fpcQadl01 = fpcQadl01;
	}

	public Boolean getFpcQadl02() {
		return this.fpcQadl02;
	}

	public void setFpcQadl02(Boolean fpcQadl02) {
		this.fpcQadl02 = fpcQadl02;
	}

	public Boolean getFpcQadl03() {
		return this.fpcQadl03;
	}

	public void setFpcQadl03(Boolean fpcQadl03) {
		this.fpcQadl03 = fpcQadl03;
	}

	public String getFpcUser1() {
		return this.fpcUser1;
	}

	public void setFpcUser1(String fpcUser1) {
		this.fpcUser1 = fpcUser1;
	}

	public String getFpcUser2() {
		return this.fpcUser2;
	}

	public void setFpcUser2(String fpcUser2) {
		this.fpcUser2 = fpcUser2;
	}

	public Double getOidFpcMstr() {
		return this.oidFpcMstr;
	}

	public void setOidFpcMstr(Double oidFpcMstr) {
		this.oidFpcMstr = oidFpcMstr;
	}

}