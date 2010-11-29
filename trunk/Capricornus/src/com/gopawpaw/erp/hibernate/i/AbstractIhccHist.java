package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIhccHist entity provides the base persistence definition of the
 * IhccHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIhccHist implements java.io.Serializable {

	// Fields

	private IhccHistId id;
	private String ihccNbr;
	private String ihccCcNbrTail;
	private Date ihccCcExpireDate;
	private String ihccCardType;
	private Date ihccAuthDate;
	private String ihccAuthNbr;
	private Double ihccAuthAmt;
	private Date ihccAuthExpireDate;
	private String ihccBillingName;
	private String ihccBillingAddr1;
	private String ihccBillingAddr2;
	private String ihccBillingAddr3;
	private String ihccBillingCity;
	private String ihccBillingZip;
	private String ihccBillingState;
	private String ihccBillingCountry;
	private String ihccBillingCtry;
	private String ihccModUserid;
	private Date ihccModDate;
	private String ihccUser1;
	private String ihccUser2;
	private String ihccQadc01;
	private Integer ihccQadi01;
	private Double ihccQadd01;
	private Boolean ihccQadl01;
	private Date ihccQadt01;
	private Double oidIhccHist;

	// Constructors

	/** default constructor */
	public AbstractIhccHist() {
	}

	/** minimal constructor */
	public AbstractIhccHist(IhccHistId id, String ihccNbr,
			String ihccCcNbrTail, Date ihccCcExpireDate, String ihccCardType,
			Date ihccAuthDate, String ihccAuthNbr, Double ihccAuthAmt,
			Date ihccAuthExpireDate, String ihccBillingName,
			String ihccBillingAddr1, String ihccBillingAddr2,
			String ihccBillingAddr3, String ihccBillingCity,
			String ihccBillingZip, String ihccBillingState,
			String ihccBillingCountry, String ihccModUserid, Date ihccModDate,
			Double oidIhccHist) {
		this.id = id;
		this.ihccNbr = ihccNbr;
		this.ihccCcNbrTail = ihccCcNbrTail;
		this.ihccCcExpireDate = ihccCcExpireDate;
		this.ihccCardType = ihccCardType;
		this.ihccAuthDate = ihccAuthDate;
		this.ihccAuthNbr = ihccAuthNbr;
		this.ihccAuthAmt = ihccAuthAmt;
		this.ihccAuthExpireDate = ihccAuthExpireDate;
		this.ihccBillingName = ihccBillingName;
		this.ihccBillingAddr1 = ihccBillingAddr1;
		this.ihccBillingAddr2 = ihccBillingAddr2;
		this.ihccBillingAddr3 = ihccBillingAddr3;
		this.ihccBillingCity = ihccBillingCity;
		this.ihccBillingZip = ihccBillingZip;
		this.ihccBillingState = ihccBillingState;
		this.ihccBillingCountry = ihccBillingCountry;
		this.ihccModUserid = ihccModUserid;
		this.ihccModDate = ihccModDate;
		this.oidIhccHist = oidIhccHist;
	}

	/** full constructor */
	public AbstractIhccHist(IhccHistId id, String ihccNbr,
			String ihccCcNbrTail, Date ihccCcExpireDate, String ihccCardType,
			Date ihccAuthDate, String ihccAuthNbr, Double ihccAuthAmt,
			Date ihccAuthExpireDate, String ihccBillingName,
			String ihccBillingAddr1, String ihccBillingAddr2,
			String ihccBillingAddr3, String ihccBillingCity,
			String ihccBillingZip, String ihccBillingState,
			String ihccBillingCountry, String ihccBillingCtry,
			String ihccModUserid, Date ihccModDate, String ihccUser1,
			String ihccUser2, String ihccQadc01, Integer ihccQadi01,
			Double ihccQadd01, Boolean ihccQadl01, Date ihccQadt01,
			Double oidIhccHist) {
		this.id = id;
		this.ihccNbr = ihccNbr;
		this.ihccCcNbrTail = ihccCcNbrTail;
		this.ihccCcExpireDate = ihccCcExpireDate;
		this.ihccCardType = ihccCardType;
		this.ihccAuthDate = ihccAuthDate;
		this.ihccAuthNbr = ihccAuthNbr;
		this.ihccAuthAmt = ihccAuthAmt;
		this.ihccAuthExpireDate = ihccAuthExpireDate;
		this.ihccBillingName = ihccBillingName;
		this.ihccBillingAddr1 = ihccBillingAddr1;
		this.ihccBillingAddr2 = ihccBillingAddr2;
		this.ihccBillingAddr3 = ihccBillingAddr3;
		this.ihccBillingCity = ihccBillingCity;
		this.ihccBillingZip = ihccBillingZip;
		this.ihccBillingState = ihccBillingState;
		this.ihccBillingCountry = ihccBillingCountry;
		this.ihccBillingCtry = ihccBillingCtry;
		this.ihccModUserid = ihccModUserid;
		this.ihccModDate = ihccModDate;
		this.ihccUser1 = ihccUser1;
		this.ihccUser2 = ihccUser2;
		this.ihccQadc01 = ihccQadc01;
		this.ihccQadi01 = ihccQadi01;
		this.ihccQadd01 = ihccQadd01;
		this.ihccQadl01 = ihccQadl01;
		this.ihccQadt01 = ihccQadt01;
		this.oidIhccHist = oidIhccHist;
	}

	// Property accessors

	public IhccHistId getId() {
		return this.id;
	}

	public void setId(IhccHistId id) {
		this.id = id;
	}

	public String getIhccNbr() {
		return this.ihccNbr;
	}

	public void setIhccNbr(String ihccNbr) {
		this.ihccNbr = ihccNbr;
	}

	public String getIhccCcNbrTail() {
		return this.ihccCcNbrTail;
	}

	public void setIhccCcNbrTail(String ihccCcNbrTail) {
		this.ihccCcNbrTail = ihccCcNbrTail;
	}

	public Date getIhccCcExpireDate() {
		return this.ihccCcExpireDate;
	}

	public void setIhccCcExpireDate(Date ihccCcExpireDate) {
		this.ihccCcExpireDate = ihccCcExpireDate;
	}

	public String getIhccCardType() {
		return this.ihccCardType;
	}

	public void setIhccCardType(String ihccCardType) {
		this.ihccCardType = ihccCardType;
	}

	public Date getIhccAuthDate() {
		return this.ihccAuthDate;
	}

	public void setIhccAuthDate(Date ihccAuthDate) {
		this.ihccAuthDate = ihccAuthDate;
	}

	public String getIhccAuthNbr() {
		return this.ihccAuthNbr;
	}

	public void setIhccAuthNbr(String ihccAuthNbr) {
		this.ihccAuthNbr = ihccAuthNbr;
	}

	public Double getIhccAuthAmt() {
		return this.ihccAuthAmt;
	}

	public void setIhccAuthAmt(Double ihccAuthAmt) {
		this.ihccAuthAmt = ihccAuthAmt;
	}

	public Date getIhccAuthExpireDate() {
		return this.ihccAuthExpireDate;
	}

	public void setIhccAuthExpireDate(Date ihccAuthExpireDate) {
		this.ihccAuthExpireDate = ihccAuthExpireDate;
	}

	public String getIhccBillingName() {
		return this.ihccBillingName;
	}

	public void setIhccBillingName(String ihccBillingName) {
		this.ihccBillingName = ihccBillingName;
	}

	public String getIhccBillingAddr1() {
		return this.ihccBillingAddr1;
	}

	public void setIhccBillingAddr1(String ihccBillingAddr1) {
		this.ihccBillingAddr1 = ihccBillingAddr1;
	}

	public String getIhccBillingAddr2() {
		return this.ihccBillingAddr2;
	}

	public void setIhccBillingAddr2(String ihccBillingAddr2) {
		this.ihccBillingAddr2 = ihccBillingAddr2;
	}

	public String getIhccBillingAddr3() {
		return this.ihccBillingAddr3;
	}

	public void setIhccBillingAddr3(String ihccBillingAddr3) {
		this.ihccBillingAddr3 = ihccBillingAddr3;
	}

	public String getIhccBillingCity() {
		return this.ihccBillingCity;
	}

	public void setIhccBillingCity(String ihccBillingCity) {
		this.ihccBillingCity = ihccBillingCity;
	}

	public String getIhccBillingZip() {
		return this.ihccBillingZip;
	}

	public void setIhccBillingZip(String ihccBillingZip) {
		this.ihccBillingZip = ihccBillingZip;
	}

	public String getIhccBillingState() {
		return this.ihccBillingState;
	}

	public void setIhccBillingState(String ihccBillingState) {
		this.ihccBillingState = ihccBillingState;
	}

	public String getIhccBillingCountry() {
		return this.ihccBillingCountry;
	}

	public void setIhccBillingCountry(String ihccBillingCountry) {
		this.ihccBillingCountry = ihccBillingCountry;
	}

	public String getIhccBillingCtry() {
		return this.ihccBillingCtry;
	}

	public void setIhccBillingCtry(String ihccBillingCtry) {
		this.ihccBillingCtry = ihccBillingCtry;
	}

	public String getIhccModUserid() {
		return this.ihccModUserid;
	}

	public void setIhccModUserid(String ihccModUserid) {
		this.ihccModUserid = ihccModUserid;
	}

	public Date getIhccModDate() {
		return this.ihccModDate;
	}

	public void setIhccModDate(Date ihccModDate) {
		this.ihccModDate = ihccModDate;
	}

	public String getIhccUser1() {
		return this.ihccUser1;
	}

	public void setIhccUser1(String ihccUser1) {
		this.ihccUser1 = ihccUser1;
	}

	public String getIhccUser2() {
		return this.ihccUser2;
	}

	public void setIhccUser2(String ihccUser2) {
		this.ihccUser2 = ihccUser2;
	}

	public String getIhccQadc01() {
		return this.ihccQadc01;
	}

	public void setIhccQadc01(String ihccQadc01) {
		this.ihccQadc01 = ihccQadc01;
	}

	public Integer getIhccQadi01() {
		return this.ihccQadi01;
	}

	public void setIhccQadi01(Integer ihccQadi01) {
		this.ihccQadi01 = ihccQadi01;
	}

	public Double getIhccQadd01() {
		return this.ihccQadd01;
	}

	public void setIhccQadd01(Double ihccQadd01) {
		this.ihccQadd01 = ihccQadd01;
	}

	public Boolean getIhccQadl01() {
		return this.ihccQadl01;
	}

	public void setIhccQadl01(Boolean ihccQadl01) {
		this.ihccQadl01 = ihccQadl01;
	}

	public Date getIhccQadt01() {
		return this.ihccQadt01;
	}

	public void setIhccQadt01(Date ihccQadt01) {
		this.ihccQadt01 = ihccQadt01;
	}

	public Double getOidIhccHist() {
		return this.oidIhccHist;
	}

	public void setOidIhccHist(Double oidIhccHist) {
		this.oidIhccHist = oidIhccHist;
	}

}